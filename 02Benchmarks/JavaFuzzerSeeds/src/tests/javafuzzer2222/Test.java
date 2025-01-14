package tests.javafuzzer2222;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 10:23:11 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=185L;
    public static byte byFld=-121;
    public float fFld=-57.150F;
    public static int iFld=224;
    public long lArrFld[]=new long[N];
    public static byte byArrFld[][]=new byte[N][N];
    public static volatile long lArrFld1[][]=new long[N][N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)108);
        FuzzerUtils.init(Test.lArrFld1, -49L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(long l, float f, float f1) {

        int i3=6, i4=-6, i5=-30, i6=62, iArr[]=new int[N];
        boolean b=false;
        short s=12873;
        float fArr[]=new float[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(fArr, 0.751F);
        FuzzerUtils.init(iArr, -183);
        FuzzerUtils.init(lArr, 6L);

        switch (((Test.iFld >>> 1) % 9) + 117) {
        case 117:
            fArr[(113 >>> 1) % N] -= Test.instanceCount;
        case 118:
            if (true) {
                i3 = 1;
                while (++i3 < 171) {
                    Test.iFld = Test.iFld;
                    i4 = 1;
                    while (++i4 < 9) {
                        if (b) break;
                        i5 = 1;
                        do {
                            Test.iFld *= (int)l;
                            iArr[i3] -= Test.iFld;
                            if (true) {
                                Test.instanceCount = (long)54.42049;
                                l -= i6;
                            }
                            Test.instanceCount = -3L;
                        } while (++i5 < 1);
                        s += (short)(((i4 * i5) + i3) - s);
                    }
                }
            }
        case 119:
            iArr[(i3 >>> 1) % N] += Test.byFld;
        case 120:
            Test.iFld *= (int)Test.instanceCount;
            break;
        case 121:
            lArr[(i5 >>> 1) % N] *= 59832;
        case 122:
            f1 = s;
        case 123:
            Test.instanceCount *= i5;
        case 124:
        case 125:
            i6 >>= i6;
        }
        long meth_res = l + Float.floatToIntBits(f) + Float.floatToIntBits(f1) + i3 + i4 + (b ? 1 : 0) + i5 + i6 + s +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(lArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth1(int i2) {

        double d=-43.62653;
        float f2=2.431F;

        d *= ((Test.instanceCount++) + (fMeth(Test.instanceCount, f2, f2) - i2));
        Test.byArrFld[(Test.iFld >>> 1) % N][(Test.iFld >>> 1) % N] = (byte)-6259;
        vMeth1_check_sum += i2 + Double.doubleToLongBits(d) + Float.floatToIntBits(f2);
    }

    public static void vMeth(int i) {

        int i1=-75, i8=40335, i9=-127, i10=1, i11=-50053;
        boolean b1=false;
        float f3=-102.92F;
        double d1=0.51807, dArr[]=new double[N];

        FuzzerUtils.init(dArr, -8.34969);

        i1 = 1;
        do {
            vMeth1(i1);
            if (i1 != 0) {
                vMeth_check_sum += i + i1 + i8 + i9 + (b1 ? 1 : 0) + Float.floatToIntBits(f3) + i10 + i11 +
                    Double.doubleToLongBits(d1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                return;
            }
            dArr[i1] += 53914L;
            Test.iFld <<= -2;
            for (i8 = 1; i8 < 5; ++i8) {
                if (Test.iFld != 0) {
                    vMeth_check_sum += i + i1 + i8 + i9 + (b1 ? 1 : 0) + Float.floatToIntBits(f3) + i10 + i11 +
                        Double.doubleToLongBits(d1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                    return;
                }
                Test.iFld += i8;
                b1 = b1;
            }
            if (false) break;
        } while (++i1 < 321);
        i += (int)f3;
        Test.instanceCount -= (long)2.818F;
        for (i10 = 11; i10 < 307; ++i10) {
            if (i10 != 0) {
                vMeth_check_sum += i + i1 + i8 + i9 + (b1 ? 1 : 0) + Float.floatToIntBits(f3) + i10 + i11 +
                    Double.doubleToLongBits(d1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                return;
            }
            Test.lArrFld1[i10 - 1][i10] *= (long)d1;
        }
        vMeth_check_sum += i + i1 + i8 + i9 + (b1 ? 1 : 0) + Float.floatToIntBits(f3) + i10 + i11 +
            Double.doubleToLongBits(d1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {


        Test.byFld = (byte)Double.longBitsToDouble((long)((lArrFld[(-12 >>> 1) % N]--) * (fFld - Test.iFld)));
        vMeth(Test.iFld);



    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  fMeth ->  fMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
