package tests.javafuzzer1402;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 19:46:54 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=3285573878L;
    public static short sFld=-23707;
    public double dFld=8.51673;
    public static volatile int iFld=-252;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -24966);
    }

    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i4, int i5, double d1) {

        int i6=0, i7=-10, i9=930, i10=-55606, i11=56971, i12=183, i13=897, iArr1[]=new int[N];
        float f1=-62.545F;
        boolean b=true;

        FuzzerUtils.init(iArr1, 3);

        if (false) {
            for (i6 = 10; i6 < 356; ++i6) {
                Test.instanceCount /= (Test.sFld | 1);
                switch (((i6 % 1) * 5) + 39) {
                case 41:
                    for (i9 = i6; 5 > i9; i9++) {
                        i11 = 1;
                        while (--i11 > 0) {
                            i4 = i7;
                            i7 = i5;
                        }
                        f1 = i10;
                        i4 = i10;
                        for (i12 = 1; i12 < 1; i12++) {
                            i10 &= -13;
                            b = b;
                            i7 += (i12 * i12);
                            i13 = -209;
                        }
                    }
                    break;
                }
            }
            vMeth1_check_sum += i4 + i5 + Double.doubleToLongBits(d1) + i6 + i7 + i9 + i10 + i11 +
                Float.floatToIntBits(f1) + i12 + i13 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr1);
            return;
        } else if (b) {
            b = b;
        }
        vMeth1_check_sum += i4 + i5 + Double.doubleToLongBits(d1) + i6 + i7 + i9 + i10 + i11 + Float.floatToIntBits(f1)
            + i12 + i13 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr1);
    }

    public static double dMeth() {

        int i2=-52429, i3=20937, i14=-191, i15=144, i17=-216;
        double d=-127.57903;
        float f2=2.525F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -3L);

        i2 = (int)((i2 + 4017186387610148574L) - Test.instanceCount);
        i3 = 1;
        while (++i3 < 341) {
            i2 *= (int)(d--);
        }
        vMeth1(i2, 7, d);
        Test.iArrFld[(i3 >>> 1) % N] = (int)d;
        Test.instanceCount -= i2;
        for (i14 = 2; i14 < 194; ++i14) {
            Test.iArrFld[i14 + 1] = i3;
            i17 = 1;
            while (++i17 < 8) {
                d *= i15;
                Test.instanceCount *= i2;
                i15 += i17;
                f2 -= Test.instanceCount;
                i15 *= (int)f2;
                Test.iArrFld[i14] -= Test.sFld;
            }
        }
        long meth_res = i2 + i3 + Double.doubleToLongBits(d) + i14 + i15 + i17 + Float.floatToIntBits(f2) +
            FuzzerUtils.checkSum(lArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth() {

        float f=22.324F, f3=26.778F;
        int i=-13357, i1=53328, i18=8, i19=7, i20=-24, i21=-8, iArr[][]=new int[N][N];
        byte by=17;

        FuzzerUtils.init(iArr, -244);

        for (f = 14; f < 269; ++f) {
            i -= iArr[(int)(f)][(int)(f + 1)];
            i1 = 1;
            while (++i1 < 6) {
                iArr[i1][(int)(f - 1)] = (-iArr[(int)(f + 1)][i1 + 1]);
                i = (int)(((i1 * -1309) - (f + 27)) - f);
                i = (int)(--Test.instanceCount);
                by -= (byte)(((0L << (i--)) + dMeth()) - Test.instanceCount);
                i = i1;
            }
            i18 = 1;
            do {
                try {
                    i = (i18 % i18);
                    i = (i18 % i1);
                    i = (iArr[i18][(int)(f + 1)] % i19);
                } catch (ArithmeticException a_e) {}
                for (i20 = 1; i20 < 1; i20++) {
                    f3 += i20;
                    i19 += by;
                    f3 += i18;
                    i = i21;
                }
            } while (++i18 < 6);
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i + i1 + by + i18 + i19 + i20 + i21 + Float.floatToIntBits(f3) +
            FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        boolean b1=false, bArr[]=new boolean[N];
        float f4=-2.278F, fArr[]=new float[N];
        int i22=-125, i23=14, i24=15964, i25=24, i26=-40837, i27=1, i28=7;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 3428865106L);
        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(fArr, -98.969F);

        vMeth();
        dFld -= Test.instanceCount;
        b1 = true;
        Test.iFld *= (int)Test.instanceCount;
        Test.iFld += Test.iFld;
        f4 *= Test.iFld;
        i22 = 1;
        while (++i22 < 275) {
            f4 *= Test.iFld;
            Test.iFld *= i22;
            for (i23 = 2; i23 < 91; i23++) {
                f4 += i23;
                i24 += (((i23 * Test.instanceCount) + Test.instanceCount) - f4);
                if (b1) {
                    for (i25 = 1; i25 < 2; ++i25) {
                        i24 = i23;
                        Test.instanceCount = (long)dFld;
                        lArr1[i25] >>= Test.instanceCount;
                        if (b1) {
                            i24 += (i25 ^ i22);
                            Test.iFld = i24;
                            i24 = (int)Test.instanceCount;
                            bArr[i25 - 1] = false;
                        } else if (b1) {
                            Test.instanceCount -= Test.instanceCount;
                            Test.instanceCount += (((i25 * Test.iFld) + i23) - Test.instanceCount);
                        }
                        Test.iFld = (int)Test.instanceCount;
                    }
                } else if (b1) {
                    for (i27 = 1; i27 < 2; ++i27) {
                        Test.iArrFld[i23 - 1] = -50867;
                        f4 += i27;
                        fArr[i22] = Test.instanceCount;
                        dFld *= 121;
                    }
                } else if (b1) {
                    f4 = Test.iFld;
                } else {
                    Test.instanceCount += -23;
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
//DEBUG  dMeth ->  dMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 dMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}