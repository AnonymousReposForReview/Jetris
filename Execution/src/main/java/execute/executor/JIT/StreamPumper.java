package execute.executor.JIT;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

public final class StreamPumper implements Runnable {

    private static final int BUF_SIZE = 256;

    /**
     * Pump will be called by the StreamPumper to process the incoming data
     */
    abstract public static class Pump {
        abstract void register(StreamPumper d);
    }

    /**
     * OutputStream -> Pump adapter
     */
    final public static class StreamPump extends Pump {
        private final OutputStream out;
        public StreamPump(OutputStream out) {
            this.out = out;
        }

        @Override
        void register(StreamPumper sp) {
            sp.addOutputStream(out);
        }
    }

    /**
     * Used to process the incoming data line-by-line
     */
    abstract public static class LinePump extends Pump {
        @Override
        final void register(StreamPumper sp) {
            sp.addLineProcessor(this);
        }

        abstract protected void processLine(String line);
    }

    private final InputStream in;
    private final Set<OutputStream> outStreams = new HashSet<>();
    private final Set<LinePump> linePumps = new HashSet<>();

    private final AtomicBoolean processing = new AtomicBoolean(false);
    private final FutureTask<Void> processingTask = new FutureTask<>(this, null);

    public StreamPumper(InputStream in) {
        this.in = in;
    }

    /**
     * Create a StreamPumper that reads from in and writes to out.
     *
     * @param in The stream to read from.
     * @param out The stream to write to.
     */
    public StreamPumper(InputStream in, OutputStream out) {
        this(in);
        this.addOutputStream(out);
    }

    /**
     * Implements Thread.run(). Continuously read from {@code in} and write to
     * {@code out} until {@code in} has reached end of stream. Abort on
     * interruption. Abort on IOExceptions.
     */
    @Override
    public void run() {
        try (BufferedInputStream is = new BufferedInputStream(in)) {
            ByteArrayOutputStream lineBos = new ByteArrayOutputStream();
            byte[] buf = new byte[BUF_SIZE];
            int len = 0;
            int linelen = 0;

            while ((len = is.read(buf)) > 0 && !Thread.interrupted()) {
                for(OutputStream out : outStreams) {
                    out.write(buf, 0, len);
                }
                if (!linePumps.isEmpty()) {
                    int i = 0;
                    int lastcrlf = -1;
                    while (i < len) {
                        if (buf[i] == '\n' || buf[i] == '\r') {
                            int bufLinelen = i - lastcrlf - 1;
                            if (bufLinelen > 0) {
                                lineBos.write(buf, lastcrlf + 1, bufLinelen);
                            }
                            linelen += bufLinelen;

                            if (linelen > 0) {
                                lineBos.flush();
                                final String line = lineBos.toString();
                                linePumps.stream().forEach((lp) -> {
                                    lp.processLine(line);
                                });
                                lineBos.reset();
                                linelen = 0;
                            }
                            lastcrlf = i;
                        }

                        i++;
                    }
                    if (lastcrlf == -1) {
                        lineBos.write(buf, 0, len);
                        linelen += len;
                    } else if (lastcrlf < len - 1) {
                        lineBos.write(buf, lastcrlf + 1, len - lastcrlf - 1);
                        linelen += len - lastcrlf - 1;
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            Thread.currentThread().stop();
            Thread.currentThread().interrupt();
        } finally {
            for(OutputStream out : outStreams) {
                try {
                    out.flush();
                } catch (IOException e) {}
            }
            try {
                in.close();
            } catch (IOException e) {}
        }
    }

    final void addOutputStream(OutputStream out) {
        outStreams.add(out);
    }

    final void addLineProcessor(LinePump lp) {
        linePumps.add(lp);
    }

    final public StreamPumper addPump(Pump ... pump) {
        if (processing.get()) {
            throw new IllegalStateException("Can not modify pumper while " +
                    "processing is in progress");
        }
        for(Pump p : pump) {
            p.register(this);
        }
        return this;
    }

    final public Future<Void> process() {
        if (!processing.compareAndSet(false, true)) {
            throw new IllegalStateException("Can not re-run the processing");
        }
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                processingTask.run();
            }
        });
        t.setDaemon(true);
        t.start();

        return processingTask;
    }
}

