package tests.javafuzzer234;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 00:35:30 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-8867715850345734684L;
    public volatile int iFld=44086;
    public static double dFld=63.60471;
    public static byte byFld=120;
    public static boolean bFld=false;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 11);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static int iMeth() {

        double d=-26.114280;
        int i2=-3;

        d += i2;
        long meth_res = Double.doubleToLongBits(d) + i2;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1() {

        int i6=-11;

        Test.dFld -= i6;
        vMeth1_check_sum += i6;
    }

    public static double dMeth(int i4, int i5) {

        int i7=247, i9=-137, i10=148;
        long l1=87L, lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -8713458601244486417L);

        vMeth1();
        i7 = 1;
        while (++i7 < 395) {
            float f1=0.745F;
            f1 += i7;
            lArr1[i7] -= Test.instanceCount;
            i4 <<= i5;
        }
        Test.instanceCount += Test.instanceCount;
        l1 = 395;
        do {
            Test.iArrFld[(i7 >>> 1) % N] >>= i7;
            Test.instanceCount = i4;
            Test.instanceCount += l1;
            Test.iArrFld[(int)(l1)] = i7;
            Test.byFld -= (byte)Test.dFld;
            for (i9 = 1; i9 < 8; i9 += 2) {
                i4 %= (int)(i4 | 1);
                i4 = (int)l1;
            }
        } while ((l1 -= 2) > 0);
        long meth_res = i4 + i5 + i7 + l1 + i9 + i10 + FuzzerUtils.checkSum(lArr1);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void vMeth(int i, int i1, long l) {

        float f=-36.776F;
        int i3=234, i11=14511, i12=-3, i13=176, iArr[][]=new int[N][N];
        boolean b=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -191);
        FuzzerUtils.init(lArr, -223L);

        if (b) {
            i = (int)((l--) * iArr[(i1 >>> 1) % N][(i1 >>> 1) % N]);
            lArr[(iFld >>> 1) % N] >>= iArr[(iFld >>> 1) % N][(iFld >>> 1) % N];
            iMeth();
            iFld = (int)((iFld * (i1 + i1)) + ((i + f) - (5 + (--Test.instanceCount))));
        } else if (true) {
            iArr[(i1 >>> 1) % N][(i >>> 1) % N] >>>= (-i1);
        } else if (b) {
            f = (30.413F - i1);
            i3 = 358;
            while (--i3 > 0) {
                iFld = (int)(dMeth(13, i1) - i11);
                i11 = i11;
                for (i12 = 1; i12 < 5; i12++) {
                    Test.instanceCount -= l;
                    i = i1;
                    i11 += (int)-3175L;
                    f -= 215L;
                }
            }
        } else {
            i1 = -51685;
            vMeth_check_sum += i + i1 + l + Float.floatToIntBits(f) + i3 + i11 + i12 + i13 + (b ? 1 : 0) +
                FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
            return;
        }
        vMeth_check_sum += i + i1 + l + Float.floatToIntBits(f) + i3 + i11 + i12 + i13 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i14=13, i15=25207, i16=-43, i17=12, i18=-12, iArr1[][]=new int[N][N];

        FuzzerUtils.init(iArr1, 6897);

        iFld = (int)((iFld++) - ((Test.instanceCount + iFld) + -8498992480202206271L));
        vMeth(iFld, iFld, Test.instanceCount);
        for (i14 = 2; i14 < 201; i14++) {
            iFld = (int)3392817856L;
            switch ((((iFld >>> 1) % 2) * 5) + 70) {
            case 78:
                iFld -= iFld;
                i16 = 1;
                while (++i16 < 126) {
                    iFld = i15;
                    iFld += (i16 * i16);
                    Test.instanceCount += (((i16 * i15) + i14) - i15);
                    Test.instanceCount -= (long)-53.389F;
                    i15 = i15;
                    i15 -= -5881;
                    iFld += (int)(1.734F + (i16 * i16));
                }
                iArr1 = iArr1;
                iFld >>= iFld;
            case 72:
                Test.instanceCount = i15;
                iArr1[i14 + 1][i14] = iFld;
                i17 = 1;
                while ((i17 += 3) < 126) {
                    Test.bFld = Test.bFld;
                    iFld = i14;
                    i18 = 1;
                    do {
                        i15 += i18;
                        iFld -= i15;
                        if (Test.bFld) continue;
                        Test.instanceCount *= i14;
                        Test.dFld = i15;
                        i15 <<= (int)Test.instanceCount;
                        iFld >>= i17;
                    } while (++i18 < 3);
                    iFld = i18;
                }
            }
        }


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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  dMeth ->  dMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 dMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
