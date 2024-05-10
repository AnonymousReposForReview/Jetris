package tests.javafuzzer3349;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 06:31:25 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-6L;
    public static volatile long lFld=-170L;
    public static byte byFld=41;
    public short sFld=-9363;
    public static float fFld=50.261F;
    public static long lFld1=-2822564277091968519L;
    public static volatile int iFld=-197;
    public int iArrFld[]=new int[N];
    public static int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld1, 2);
    }

    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {


        Test.fFld = -7;
        Test.lFld -= Test.instanceCount;
        long meth_res = 0;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i5=-228, i6=-6, i7=-33194, i8=-26634, i9=-171, i10=17053, i11=196;
        double d2=-92.53765;
        float fArr[][]=new float[N][N];

        FuzzerUtils.init(fArr, 2.665F);

        Test.iArrFld1[(i5 >>> 1) % N] -= (int)Test.lFld;
        i5 *= (int)(i5 + (i5 += (int)(-(-(i5 = (int)7065176502747309443L)))));
        iMeth();
        Test.instanceCount += Test.lFld1;
        fArr[(i5 >>> 1) % N][(i5 >>> 1) % N] += i5;
        for (i6 = 15; 328 > i6; ++i6) {
            for (i8 = 5; 1 < i8; i8 -= 2) {
                for (i10 = 1; i10 < 3; i10++) {
                    Test.lFld += (((i10 * Test.fFld) + i9) - Test.lFld1);
                    Test.instanceCount = -108;
                    d2 += Test.instanceCount;
                }
                i11 = i9;
                i9 = i7;
                i9 *= i7;
                i5 = (int)Test.fFld;
            }
        }
        vMeth_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + i11 + Double.doubleToLongBits(d2) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static float fMeth(long l, int i2, int i3) {

        int i4=-13, i12=0, i13=-59365, i14=-33844, iArr[]=new int[N];
        boolean b=true;
        double d1=1.114234;
        short s=14510;

        FuzzerUtils.init(iArr, 14);

        i4 = 1;
        while (++i4 < 297) {
            switch (((iArr[i4 + 1] >>> 1) % 8) + 39) {
            case 39:
                i2 += iArr[i4 - 1];
                b = (Math.abs(Test.byFld + Test.byFld) != (-d1));
                vMeth();
                for (i12 = i4; i12 < 6; ++i12) {
                    i14 = 1;
                    do {
                        iArr[i4 - 1] = i3;
                        Test.lFld >>= i12;
                        Test.lFld1 >>>= i13;
                        i3 -= i3;
                        i2 *= i4;
                        i13 += (((i14 * Test.fFld) + Test.lFld) - i4);
                        i13 = (int)d1;
                        Test.iFld >>>= i12;
                    } while (++i14 < 1);
                }
                break;
            case 40:
                s += (short)(i4 * Test.iFld);
                break;
            case 41:
                Test.iFld = Test.iFld;
                break;
            case 42:
                i13 += (i4 - i2);
                break;
            case 43:
                Test.iFld += (((i4 * Test.iFld) + i12) - Test.fFld);
            case 44:
                Test.iFld = i4;
            case 45:
            case 46:
                d1 *= d1;
                break;
            }
        }
        long meth_res = l + i2 + i3 + i4 + (b ? 1 : 0) + Double.doubleToLongBits(d1) + i12 + i13 + i14 + s +
            FuzzerUtils.checkSum(iArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-13161, i1=-3189, i15=9938, i16=-4, i17=-34944, i18=3, i19=-9, i20=52337, i21=112, i22=29537, i23=54943;
        double d=-2.72279, dArr[]=new double[N];
        float f=88.224F, f1=92.807F;
        boolean b1=true;
        long lArr[]=new long[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(lArr, -26293L);
        FuzzerUtils.init(dArr, -1.93563);
        FuzzerUtils.init(byArr, (byte)102);

        for (i = 1; i < 175; ++i) {
            d *= ((--i1) & (i1 = (int)(d - d)));
            Test.lFld = (long)(((Test.lFld + f) * (f + Test.byFld)) * (i1 = (i1 + i1)));
            lArr[i - 1] = (Test.lFld -= iArrFld[i]);
            iArrFld[i - 1] *= (((iArrFld[i]++) + Short.reverseBytes(sFld)) - i1);
            fMeth(Test.lFld1, i, Test.iFld);
            i1 += (i | i1);
            i1 += i;
            sFld = (short)i;
        }
        i1 = i1;
        for (i15 = 10; i15 < 207; i15++) {
            Test.iFld += i15;
            if (b1) {
                b1 = b1;
            } else {
                i1 *= (int)Test.lFld;
                for (i17 = 127; i17 > 6; i17--) {
                    i18 -= i18;
                }
            }
            for (i19 = 1; i19 < 127; i19++) {
                i1 = i1;
                dArr[i19 - 1] += -8;
                Test.lFld -= Test.lFld;
            }
            i20 -= i20;
            for (i21 = 127; i21 > 7; i21--) {
                for (f1 = 1; 2 > f1; ++f1) {
                    iArrFld = Test.iArrFld1;
                }
                switch ((((i20 >>> 1) % 2) * 5) + 50) {
                case 51:
                    iArrFld[i15] *= (int)Test.instanceCount;
                case 58:
                }
                byArr[i15 - 1] = (byte)-55472;
                sFld = Test.byFld;
                sFld = (short)-4;
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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
