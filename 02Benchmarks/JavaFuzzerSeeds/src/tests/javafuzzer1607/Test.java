package tests.javafuzzer1607;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 23:56:14 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3912192622L;
    public static int iFld=-15053;
    public static short sFld=-15365;
    public static int iFld1=122;
    public volatile double dFld=55.85103;
    public float fFld=-1.504F;
    public static int iArrFld[]=new int[N];
    public static int iArrFld1[]=new int[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -6);
        FuzzerUtils.init(Test.iArrFld1, 3972);
        FuzzerUtils.init(Test.dArrFld, -1.23401);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i7) {

        int i8=9, i9=-105, i10=59, i11=-78, i12=9, i13=17816, i14=14;
        float f=-1.941F;
        boolean b2=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 1L);

        lArr[(Test.iFld >>> 1) % N] = Test.iFld;
        i7 <<= (int)7L;
        Test.iArrFld[(73 >>> 1) % N] -= (int)Test.instanceCount;
        Test.iFld <<= i7;
        for (i8 = 9; i8 < 324; ++i8) {
            Test.iFld1 -= i7;
            for (i10 = 1; 5 > i10; i10++) {
                switch ((i10 % 3) + 6) {
                case 6:
                    for (i12 = 1; i12 < 2; i12++) {
                        Test.instanceCount = Test.iFld1;
                        if (i11 != 0) {
                            vMeth1_check_sum += i7 + i8 + i9 + i10 + i11 + i12 + i13 + Float.floatToIntBits(f) + (b2 ?
                                1 : 0) + i14 + FuzzerUtils.checkSum(lArr);
                            return;
                        }
                        try {
                            Test.iArrFld[i12 + 1] = (44922 / i8);
                            i7 = (Test.iArrFld[i12] % i13);
                            i7 = (i12 % -1963188221);
                        } catch (ArithmeticException a_e) {}
                        if (b2) {
                        } else if (b2) {
                            Test.iArrFld = Test.iArrFld;
                            Test.sFld += (short)f;
                            vMeth1_check_sum += i7 + i8 + i9 + i10 + i11 + i12 + i13 + Float.floatToIntBits(f) + (b2 ?
                                1 : 0) + i14 + FuzzerUtils.checkSum(lArr);
                            return;
                        } else if (b2) {
                            Test.iFld *= 8;
                        } else {
                            Test.instanceCount >>= i12;
                        }
                    }
                    break;
                case 7:
                    i7 += (i10 * i10);
                    break;
                case 8:
                    i9 += (i10 ^ Test.instanceCount);
                    break;
                default:
                    i14 &= i9;
                }
            }
        }
        vMeth1_check_sum += i7 + i8 + i9 + i10 + i11 + i12 + i13 + Float.floatToIntBits(f) + (b2 ? 1 : 0) + i14 +
            FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth(boolean b1) {

        int i1=10, i2=-208, i3=9, i4=45922, i5=10, i6=-38205;

        for (i1 = 3; 220 > i1; ++i1) {
            for (i3 = 1; i3 < 7; i3++) {
                for (i5 = 1; 2 > i5; ++i5) {
                    try {
                        i6 = (Test.iArrFld[i5] / i4);
                        Test.iArrFld[i1 - 1] = (52471 / i6);
                        i6 = (i3 / Test.iArrFld[i5]);
                    } catch (ArithmeticException a_e) {}
                }
            }
            Test.sFld += (short)(-7084895543164544112L + (i1 * i1));
            i6 += (int)(Test.iFld += (int)(-(i3 - -1.80542)));
            Test.instanceCount >>= i3;
            i6 += (i1 | Test.instanceCount);
            i4 *= 63659;
            vMeth1(i3);
        }
        long meth_res = (b1 ? 1 : 0) + i1 + i2 + i3 + i4 + i5 + i6;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i) {

        boolean b3=false;
        int i15=0, i16=12300, i17=75, i18=-13, i19=51403;
        float f1=0.962F;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -24204L);

        i *= iMeth(b3);
        for (i15 = 10; i15 < 304; ++i15) {
            lArr1 = lArr1;
            i = (int)Test.instanceCount;
            i17 = 1;
            while (++i17 < 6) {
                try {
                    Test.iFld = (Test.iFld / -37608);
                    Test.iArrFld[i17] = (i15 / Test.iFld);
                    Test.iFld = (Test.iArrFld1[i17] / i);
                } catch (ArithmeticException a_e) {}
                i -= i16;
                Test.iArrFld[i15] -= i16;
                Test.instanceCount += i17;
                f1 += (((i17 * Test.iFld1) + Test.instanceCount) - Test.instanceCount);
            }
            Test.iArrFld[i15] >>= i18;
            i19 = 1;
            while (++i19 < 6) {
                Test.instanceCount >>= i19;
                i <<= 54;
                Test.dArrFld[i19 - 1] += i15;
            }
        }
        vMeth_check_sum += i + (b3 ? 1 : 0) + i15 + i16 + i17 + Float.floatToIntBits(f1) + i18 + i19 +
            FuzzerUtils.checkSum(lArr1);
    }

    public void mainTest(String[] strArr3) {

        byte by=4;
        long l=6845008555100406885L;
        int i20=-8, i21=-7, i22=69, i23=-12, i24=-17160, i25=-193, i26=11976, i27=-11, i28=-154, i29=206, i30=5;

        Test.iArrFld[(Test.iFld >>> 1) % N] *= (int)(((++by) - (++Test.iFld)) + ((Test.iFld - l) + (Test.iFld--)));
        l = (++Test.iFld);
        vMeth(Test.iFld1);
        for (i20 = 10; i20 < 223; ++i20) {
            dFld /= 118;
            for (i22 = 1; i22 < 118; i22++) {
                fFld = i22;
                fFld += Test.iFld;
                Test.iArrFld[i22 - 1] >>= Test.iFld1;
                for (i24 = 2; i24 > 1; --i24) {
                    Test.instanceCount = i24;
                }
                Test.sFld = (short)i25;
                i26 = 1;
                do {
                    Test.instanceCount *= -13;
                    l += i20;
                    i25 += (((i26 * Test.sFld) + i26) - i22);
                } while (++i26 < 2);
                Test.iArrFld[i20] = (int)Test.instanceCount;
            }
            for (i27 = 6; i27 < 118; i27++) {
                Test.iFld = i20;
                for (i29 = 1; i29 < 2; ++i29) {
                    l -= Test.instanceCount;
                    if (false) break;
                    i30 = Test.sFld;
                }
                Test.dArrFld[i27 + 1] = Test.instanceCount;
                i21 += (i27 * i27);
                fFld -= Test.iFld;
                i25 = (int)Test.instanceCount;
                fFld = fFld;
                i28 >>= 0;
                i23 += (i27 * i27);
            }
        }


    }
    public static void main(String[] strArr2) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr2);
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
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}