package tests.javafuzzer266;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 01:06:45 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3680584404016762857L;
    public static short sFld=3212;
    public static int iFld=-18;
    public static double dArrFld[]=new double[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.dArrFld, -2.122688);
        FuzzerUtils.init(Test.iArrFld, 111);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth() {

        int i1=-29929, i2=39732, i3=9, i4=225, i5=22;
        byte by=-110;
        float f=14.813F;
        short s=-30022;
        boolean b=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 12L);

        if (b) {
            if (b) {
                i1 ^= i1;
            } else if (b) {
                Test.dArrFld[(i1 >>> 1) % N] *= by;
                for (long l : lArr) {
                    for (i2 = 1; i2 < 4; i2++) {
                        for (i4 = 2; i4 > 1; i4 -= 3) {
                            double d=74.87237;
                            Test.instanceCount *= l;
                            f -= Test.instanceCount;
                            l = s;
                            switch (((58478 >>> 1) % 8) + 85) {
                            case 85:
                                if (b) {
                                    f += i5;
                                    i3 += (((i4 * f) + s) - Test.instanceCount);
                                    d = 83;
                                } else if (b) {
                                    if (i1 != 0) {
                                    }
                                } else {
                                    i1 = i1;
                                }
                            case 86:
                                l = (long)d;
                                break;
                            case 87:
                                l *= (long)2.19775;
                            case 88:
                                Test.instanceCount -= i5;
                            case 89:
                            case 90:
                                Test.iArrFld[i4] = i3;
                                break;
                            case 91:
                            case 92:
                                Test.instanceCount += by;
                                break;
                            default:
                                Test.instanceCount <<= Test.instanceCount;
                            }
                        }
                    }
                }
            } else {
                i1 = i5;
            }
        } else {
            i1 = i5;
        }
        long meth_res = i1 + by + i2 + i3 + i4 + i5 + Float.floatToIntBits(f) + s + (b ? 1 : 0) +
            FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1(int i) {

        int i6=-179, i7=51745, i8=56728, i9=-97, i10=-10218, i11=-215;
        float f1=2.297F, fArr[][]=new float[N][N];
        double d1=2.54859;
        boolean b1=false;

        FuzzerUtils.init(fArr, -49.415F);

        i -= (int)lMeth();
        for (i6 = 13; 300 > i6; ++i6) {
            i7 *= i7;
            Test.iArrFld[i6 + 1] -= i7;
            i += (i6 * i);
            Test.iArrFld[(i7 >>> 1) % N] = i7;
            f1 *= (float)d1;
            for (i8 = 6; i8 > 1; i8 -= 3) {
                for (i10 = i6; i10 < 6; ++i10) {
                    i7 += i;
                    fArr[i6 + 1][i8] = (float)d1;
                    fArr[i6] = fArr[i10];
                    i |= i10;
                    if (b1) break;
                    f1 = Test.instanceCount;
                }
            }
        }
        vMeth1_check_sum += i + i6 + i7 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d1) + i8 + i9 + i10 + i11
            + (b1 ? 1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth() {

        int i12=34135, i13=-8, i14=-27441, i15=214, i16=-210, i17=-53, i18=-4, i19=-45080, i20=136;
        boolean b2=true;

        vMeth1(i12);
        for (i13 = 10; i13 < 220; ++i13) {
            i14 *= i12;
            i12 -= (int)-25.100F;
        }
        try {
            for (i15 = 9; i15 < 175; ++i15) {
                i14 += (int)(-82L + (i15 * i15));
                if (b2) break;
                Test.iArrFld[i15] >>= (int)2580434007016530158L;
                if (b2) continue;
                for (i17 = 1; i17 < 10; i17++) {
                    for (i19 = 1; i19 < 2; ++i19) {
                        i12 >>>= (int)Test.instanceCount;
                        i20 -= i20;
                        Test.instanceCount -= Test.sFld;
                    }
                }
            }
        }
        catch (UserDefinedExceptionTest exc1) {
            i16 *= i15;
        }
        vMeth_check_sum += i12 + i13 + i14 + i15 + i16 + (b2 ? 1 : 0) + i17 + i18 + i19 + i20;
    }

    public void mainTest(String[] strArr1) {

        float f2=-12.16F, f3=-2.868F;
        int i21=163, i22=11, i23=27730, i24=-1036, i25=15491;
        double d2=-2.59805, d3=-2.79277;
        boolean b3=true;
        byte by1=21;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -2509722903463557133L);

        vMeth();
        lArr1[(Test.iFld >>> 1) % N] >>= Test.iFld;
        for (f2 = 14; f2 < 369; ++f2) {
            i22 = 1;
            while (++i22 < 71) {
                if (b3) {
                    for (d2 = 1; 1 > d2; d2++) {
                        Test.iArrFld[i22 - 1] = i21;
                        b3 = b3;
                        f3 -= Test.iFld;
                        Test.iFld += (int)(d2 * d2);
                        d3 -= i21;
                        i23 += (int)d2;
                    }
                } else {
                    Test.instanceCount += Test.instanceCount;
                }
                Test.iFld = by1;
                Test.iFld += i21;
                by1 += (byte)i22;
                Test.iFld = i21;
                Test.iArrFld[i22 + 1] = Test.iFld;
                by1 += (byte)f3;
                b3 = b3;
                Test.sFld += (short)(i22 + i21);
            }
            f3 -= Test.iFld;
            switch ((int)((f2 % 2) + 88)) {
            case 88:
            case 89:
                for (i24 = 71; i24 > f2; i24 -= 2) {
                    Test.iArrFld[(int)(f2)] |= i24;
                    i21 -= i23;
                    Test.iFld |= Test.iFld;
                    i25 = -1;
                }
                Test.iFld -= (int)135L;
                break;
            }
            i23 = by1;
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
class UserDefinedExceptionTest extends RuntimeException {
    public int field;
}

//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
