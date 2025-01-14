package tests.javafuzzer1723;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 02:32:41 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3L;
    public static double dFld=-2.1290;
    public static short sFld=-24978;
    public static boolean bFld=true;
    public byte byFld=-34;
    public static int iArrFld[]=new int[N];
    public static byte byArrFld[]=new byte[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -76);
        FuzzerUtils.init(Test.byArrFld, (byte)89);
        FuzzerUtils.init(Test.dArrFld, 0.33323);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;

    public static long lMeth1(double d1, long l1, int i5) {

        int i6=-33794, i7=1, i8=136, i9=197, i10=19915, i11=11027;
        float f2=-2.536F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 3061826828307192664L);

        for (i6 = 6; i6 < 285; ++i6) {
            Test.iArrFld[i6] = 13;
            i7 -= (int)l1;
            i7 = i6;
            i7 = i6;
            Test.instanceCount *= l1;
        }
        Test.instanceCount += 48118L;
        for (i8 = 4; i8 < 260; ++i8) {
            i7 += (((i8 * f2) + f2) - i9);
            Test.bFld = Test.bFld;
        }
        for (i10 = 16; i10 < 312; ++i10) {
            lArr = lArr;
            i5 += (((i10 * i9) + i9) - i9);
            i5 += i10;
            Test.iArrFld[i10] >>= (int)-55L;
        }
        long meth_res = Double.doubleToLongBits(d1) + l1 + i5 + i6 + i7 + i8 + i9 + Float.floatToIntBits(f2) + i10 +
            i11 + FuzzerUtils.checkSum(lArr);
        lMeth1_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i3, double d, long l) {

        int i4=-37589, i12=68, i13=-17172;
        float f1=-60.488F;
        byte by=61;

        i4 = 306;
        while ((i4 -= 3) > 0) {
            Test.iArrFld[i4] += (int)f1;
            i3 >>= (int)(--l);
            if (i3 != 0) {
                vMeth_check_sum += i3 + Double.doubleToLongBits(d) + l + i4 + Float.floatToIntBits(f1) + by + i12 + i13;
                return;
            }
            if (!((++Test.sFld) != ((i3--) - lMeth1(d, l, i3)))) {
                Test.iArrFld[i4] -= (int)1065624625689236019L;
                Test.iArrFld[i4] -= (int)(((-3 - (i3 * f1)) * l) + 40063);
            } else if (Test.bFld) {
                i3 |= by;
                l <<= ((++Test.iArrFld[i4]) - ((++i3) - (34094 + (-(i4 + i3)))));
                l = (++Test.byArrFld[i4]);
                vMeth_check_sum += i3 + Double.doubleToLongBits(d) + l + i4 + Float.floatToIntBits(f1) + by + i12 + i13;
                return;
            } else {
                l *= Test.sFld;
                i3 += (((i4 * i4) + Test.instanceCount) - i3);
                for (i12 = 1; 15 > i12; i12++) {
                    if (Test.bFld) continue;
                    i13 = (int)l;
                }
            }
        }
        vMeth_check_sum += i3 + Double.doubleToLongBits(d) + l + i4 + Float.floatToIntBits(f1) + by + i12 + i13;
    }

    public static long lMeth() {

        int i1=138, i2=4, i14=-21, i15=166;
        long l2=-2579244473482921200L, lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 5024824472346628322L);

        for (i1 = 19; i1 < 390; i1++) {
            vMeth(132, Test.dFld, Test.instanceCount);
            l2 = 1;
            do {
                for (i14 = (int)(l2); 1 > i14; i14++) {
                    i2 *= (int)Test.dFld;
                    i15 *= i2;
                    i2 = i14;
                    if (i1 != 0) {
                    }
                    Test.instanceCount *= (long)Test.dFld;
                    i15 -= Test.sFld;
                    lArr1[i14] = l2;
                }
            } while (++l2 < 5);
            if (Test.bFld) {
                Test.dArrFld[i1 - 1] += i15;
            }
        }
        i15 -= i1;
        Test.bFld = true;
        long meth_res = i1 + i2 + l2 + i14 + i15 + FuzzerUtils.checkSum(lArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f=19.140F;
        int i=-35, i16=-42091, i17=-8, i18=-64992, i19=11, i20=-52457, i21=-2, i22=137;
        long lArr2[]=new long[N];

        FuzzerUtils.init(lArr2, -44L);

        if (Test.bFld) {
            f -= (i / ((i--) | 1));
        } else if (Test.bFld) {
            Test.instanceCount <<= (Test.instanceCount = (long)((Test.instanceCount + Test.dFld) - (-14L - lMeth())));
            f = (float)Test.dFld;
            if (Test.bFld) {
                for (i16 = 3; i16 < 181; i16++) {
                    i ^= i17;
                }
                f += i;
                for (i18 = 16; i18 < 341; ++i18) {
                    Test.instanceCount -= -53;
                    lArr2[i18 - 1] = i16;
                    i >>>= i17;
                    switch ((i18 % 8) + 40) {
                    case 40:
                        Test.dFld += i19;
                        Test.iArrFld = Test.iArrFld;
                    case 41:
                        i20 = 77;
                        do {
                            if (Test.bFld) {
                                i17 = (int)f;
                                if (Test.bFld) {
                                    for (i21 = 1; i21 < 1; ++i21) {
                                        i22 = (int)Test.instanceCount;
                                        Test.bFld = Test.bFld;
                                        i17 = i22;
                                    }
                                    Test.dFld -= -2123848819L;
                                    i17 *= i18;
                                } else if (Test.bFld) {
                                    Test.iArrFld[i18 - 1] *= i18;
                                } else if (Test.bFld) {
                                    i17 = i21;
                                    if (Test.bFld) break;
                                } else {
                                    i = i21;
                                    i += (i20 ^ i17);
                                }
                            }
                        } while (--i20 > 0);
                        break;
                    case 42:
                        Test.instanceCount -= 26L;
                    case 43:
                        Test.instanceCount += 10;
                        break;
                    case 44:
                        i19 += i18;
                        break;
                    case 45:
                        Test.iArrFld[i18 + 1] = (int)-2851722670204648890L;
                        break;
                    case 46:
                        i22 = (int)Test.dFld;
                    case 47:
                        Test.instanceCount += i18;
                        break;
                    }
                }
            } else {
                byFld = (byte)i18;
            }
        } else {
            i22 <<= (int)Test.instanceCount;
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
//DEBUG  lMeth1 ->  lMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
