package tests.javafuzzer1780;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 03:20:09 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-19744L;
    public static boolean bFld=false;
    public static short sFld=-209;
    public static int iFld=8;
    public volatile double dFld=0.74351;
    public static volatile int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 57);
        FuzzerUtils.init(Test.dArrFld, 2.83553);
        FuzzerUtils.init(Test.lArrFld, -8319172998155742194L);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l) {

        int i7=57774, i8=5, i9=-45007, i10=-250, i11=-9, i12=0, i13=-13, i14=40, i15=-5;
        float f1=2.701F;
        byte by=-9;
        double dArr[]=new double[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(dArr, 1.18054);
        FuzzerUtils.init(lArr, -988647522L);

        i7 = 135;
        Test.instanceCount = (long)f1;
        for (i8 = 1; i8 < 137; i8++) {
            for (i10 = 12; i10 > 1; --i10) {
                for (i12 = 1; 2 > i12; ++i12) {
                    Test.iArrFld[i8 - 1] >>= i8;
                }
                for (i14 = 1; i14 < 2; ++i14) {
                    i15 += i14;
                    if (Test.bFld) {
                        dArr[i10] -= i12;
                        try {
                            i13 = (Test.iArrFld[i8 - 1] / Test.iArrFld[i14 + 1]);
                            i15 = (i10 / -40272);
                            i7 = (Test.iArrFld[i14] / -32738);
                        } catch (ArithmeticException a_e) {}
                        i9 %= (int)(i15 | 1);
                    } else if (Test.bFld) {
                        lArr[i8] = Test.instanceCount;
                        i15 *= by;
                        Test.iArrFld[i14 + 1] -= i15;
                        vMeth1_check_sum += l + i7 + Float.floatToIntBits(f1) + i8 + i9 + i10 + i11 + i12 + i13 + i14 +
                            i15 + by + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(lArr);
                        return;
                    } else {
                        Test.iArrFld[i8 + 1] += (int)l;
                    }
                }
            }
        }
        vMeth1_check_sum += l + i7 + Float.floatToIntBits(f1) + i8 + i9 + i10 + i11 + i12 + i13 + i14 + i15 + by +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i1) {

        int i2=10, i3=60723, i4=-45, i5=-13, i6=-96, i16=-238;
        long l1=3L, lArr1[]=new long[N];
        float f2=-125.444F;

        FuzzerUtils.init(lArr1, 95824866973523794L);

        for (i2 = 4; i2 < 317; i2 += 3) {
            i4 = 1;
            while (++i4 < 15) {
                for (i5 = 1; i5 < 1; i5++) {
                    vMeth1(-28138L);
                }
                Test.iArrFld[i2] = Test.sFld;
                l1 = 1;
                do {
                    i6 >>= (int)l1;
                    Test.instanceCount *= i6;
                    lArr1[i4] = i2;
                } while (++l1 < 1);
                i6 *= -206;
                i16 = 1;
                while (++i16 < 1) {
                    i1 += i16;
                    i1 += i16;
                    i6 += (int)f2;
                    i3 |= i6;
                }
            }
        }
        vMeth_check_sum += i1 + i2 + i3 + i4 + i5 + i6 + l1 + i16 + Float.floatToIntBits(f2) +
            FuzzerUtils.checkSum(lArr1);
    }

    public static long lMeth(float f) {

        int i17=11, i18=52, i19=-8, i20=175;
        long l2=-2963198673L;

        vMeth(Test.iFld);
        for (i17 = 2; i17 < 223; ++i17) {
            Test.iFld -= (int)Test.instanceCount;
            i19 = 1;
            do {
                Test.iFld <<= 10809;
                f -= -30945L;
            } while (++i19 < 7);
            f += Test.instanceCount;
            i18 = (int)Test.instanceCount;
            if (i18 != 0) {
            }
            for (l2 = i17; l2 < 7; ++l2) {
                i18 /= 9;
                f += (-22380 + (l2 * l2));
                if (Test.bFld) {
                    if (Test.bFld) continue;
                    Test.dArrFld[(int)(l2)] -= 2L;
                } else if (Test.bFld) {
                    Test.lArrFld[(int)(l2 - 1)] <<= i18;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f) + i17 + i18 + i19 + l2 + i20;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=8454, i21=55, i22=-9, i23=0, i24=-2, i25=-23925, i26=44009, i27=69, i28=8, i29=-5, i30=-12;
        float f3=97.263F, f4=11.535F;
        byte by1=-73;

        i = (int)(lMeth(f3) * Test.instanceCount);
        for (i21 = 8; i21 < 145; ++i21) {
            f3 = f3;
            Test.instanceCount += -236L;
            Test.iArrFld[i21] -= i22;
            Test.iFld += 68;
            i >>= (int)Test.instanceCount;
            switch (((Test.iFld >>> 1) % 1) + 23) {
            case 23:
                dFld += dFld;
                Test.lArrFld[i21 + 1] = Test.instanceCount;
                Test.iFld += (i21 * i21);
                for (i23 = 1; 183 > i23; i23++) {
                    i ^= (int)Test.instanceCount;
                    i -= -105;
                    Test.instanceCount = (long)f3;
                    f3 += i24;
                    i = -14614;
                    i22 += by1;
                    Test.instanceCount &= i;
                }
                break;
            default:
                Test.instanceCount /= (i24 | 1);
                Test.iFld += i24;
            }
            Test.instanceCount = i23;
            for (i25 = 3; i25 < 183; i25++) {
                f4 = i23;
            }
        }
        Test.sFld = (short)1;
        for (i27 = 5; i27 < 386; i27++) {
            Test.iFld += i26;
            for (i29 = 1; i29 < 66; i29++) {
                int i31=-10;
                Test.lArrFld[i27] <<= i31;
                Test.iArrFld = Test.iArrFld;
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}