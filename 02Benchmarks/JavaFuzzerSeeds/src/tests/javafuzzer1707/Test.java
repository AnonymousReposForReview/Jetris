package tests.javafuzzer1707;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 02:12:52 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=1360842379766407048L;
    public static short sFld=-31695;
    public static int iFld=-12;
    public static double dFld=0.67505;
    public static double dArrFld[]=new double[N];
    public static byte byArrFld[]=new byte[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 2.113061);
        FuzzerUtils.init(Test.byArrFld, (byte)118);
        FuzzerUtils.init(Test.iArrFld, 36657);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i8) {

        int i9=49473, i10=10, i11=-44756, i12=-97, iArr2[][]=new int[N][N];
        boolean b1=true;
        float f=33.615F;
        byte by=-124;
        double d2=0.99973;

        FuzzerUtils.init(iArr2, -24892);

        Test.dArrFld[(i8 >>> 1) % N] *= i8;
        i9 = 1;
        do {
            i10 = 1;
            do {
                for (i11 = 1; i11 > 1; i11 -= 2) {
                    b1 = b1;
                    f = i10;
                    try {
                        iArr2[i9 - 1][i9 - 1] = (-115 / i10);
                        i8 = (i10 / i10);
                        i8 = (iArr2[i9 - 1][i10 - 1] / i8);
                    } catch (ArithmeticException a_e) {}
                    i8 += (((i11 * i10) + i11) - Test.sFld);
                    by -= (byte)i11;
                    Test.instanceCount += (i11 * i9);
                    Test.byArrFld[i9] -= (byte)Test.instanceCount;
                    Test.iFld *= (int)f;
                }
                b1 = false;
                i12 ^= (int)Test.instanceCount;
                d2 += d2;
            } while (++i10 < 5);
        } while (++i9 < 342);
        vMeth1_check_sum += i8 + i9 + i10 + i11 + i12 + (b1 ? 1 : 0) + Float.floatToIntBits(f) + by +
            Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(iArr2);
    }

    public static int iMeth(boolean b, double d, double d1) {

        int i13=52708, i14=-21591, i15=6, i16=-10, i17=-216, i18=-97;
        float f1=-1.116F;

        vMeth1(Test.iFld);
        for (i13 = 8; i13 < 339; i13++) {
            Test.iArrFld[i13 + 1] <<= i13;
            for (i15 = 5; i15 > 1; i15--) {
                Test.instanceCount = -24;
                for (i17 = i13; i17 < 2; ++i17) {
                    switch ((i17 % 3) + 112) {
                    case 112:
                    case 113:
                        i14 += i13;
                        break;
                    case 114:
                        f1 += (-107 + (i17 * i17));
                        i14 = Test.iFld;
                        i14 += (int)Test.instanceCount;
                        break;
                    }
                    i16 += (((i17 * i15) + i16) - Test.sFld);
                    Test.instanceCount += i13;
                    i14 >>= i16;
                    if (i16 != 0) {
                    }
                }
            }
        }
        long meth_res = (b ? 1 : 0) + Double.doubleToLongBits(d) + Double.doubleToLongBits(d1) + i13 + i14 + i15 + i16
            + i17 + i18 + Float.floatToIntBits(f1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i) {

        int i1=6, i2=4964, i4=-51, i5=7, i6=-5, i7=94, iArr[]=new int[N], iArr1[]=new int[N];
        boolean b2=true;
        double d3=-36.34793;
        float f2=90.215F, f3=-1.863F, fArr[]=new float[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -212);
        FuzzerUtils.init(iArr1, 9);
        FuzzerUtils.init(lArr, 2976931554L);
        FuzzerUtils.init(fArr, 21.957F);

        for (i1 = 4; i1 < 274; i1++) {
            for (i4 = 1; i4 < 6; i4++) {
                for (i6 = 1; 2 > i6; i6 += 3) {
                    Test.sFld += (short)(iArr[i4 + 1]--);
                    try {
                        i7 = (-109 % iArr[i6 - 1]);
                        i7 = (i7 % -147);
                        iArr1[i1 + 1] = (64296 / i);
                    } catch (ArithmeticException a_e) {}
                    lArr[i4] *= (Math.min(++i, --i2) + i);
                    Test.instanceCount += (((i6 * i) + i7) - i7);
                    switch (((i6 % 9) * 5) + 124) {
                    case 168:
                        i2 = iMeth(b2, d3, d3);
                        i7 += i7;
                        if (b2) {
                            i |= i2;
                            f2 = i;
                            Test.iFld = i5;
                        } else if (b2) {
                            lArr[(i7 >>> 1) % N] = -9132999382166657656L;
                        } else {
                            fArr[i6] += 9;
                        }
                        break;
                    case 158:
                        iArr1[i1] = Test.iFld;
                        break;
                    case 167:
                        Test.iFld -= i2;
                        break;
                    case 135:
                        f2 = i2;
                        break;
                    case 144:
                        Test.instanceCount -= Test.iFld;
                        break;
                    case 147:
                        i += (85 + (i6 * i6));
                        break;
                    case 162:
                        try {
                            i5 = (i1 % 9917);
                            i7 = (62503 / i1);
                            i2 = (i1 / i6);
                        } catch (ArithmeticException a_e) {}
                    case 137:
                        f2 += (214 + (i6 * i6));
                        break;
                    case 125:
                        iArr1[i1] += (int)f3;
                    default:
                        i7 += i6;
                    }
                }
            }
        }
        vMeth_check_sum += i + i1 + i2 + i4 + i5 + i6 + i7 + (b2 ? 1 : 0) + Double.doubleToLongBits(d3) +
            Float.floatToIntBits(f2) + Float.floatToIntBits(f3) + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        double d4=1.24625;
        int i19=-4885, i21=-228, i22=-53766, i23=28121, i24=27;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -57423L);

        vMeth(Test.iFld);
        for (d4 = 7; d4 < 121; d4 += 2) {
            Test.iArrFld[(int)(d4 + 1)] >>= Test.iFld;
            i19 &= i19;
            Test.iFld = Test.iFld;
            for (int i20 : Test.iArrFld) {
                float f4=37.827F;
                Test.sFld += (short)d4;
                i19 *= i20;
                i20 += (int)((long)d4 ^ Test.instanceCount);
                i19 += (int)(d4 + i20);
                f4 = i20;
                lArr1[(int)(d4)] -= Test.sFld;
                switch ((int)((d4 % 2) + 102)) {
                case 102:
                    f4 += Test.iFld;
                case 103:
                    Test.instanceCount = i20;
                    for (i21 = 1; i21 < 2; i21++) {
                        i19 += i19;
                        i22 *= (int)f4;
                        i19 = (int)Test.instanceCount;
                        i19 = i22;
                        Test.instanceCount += (i21 | i20);
                        Test.iArrFld[i21] >>= Test.iFld;
                        i22 += i21;
                        Test.iFld += 13;
                    }
                    Test.dFld = f4;
                    Test.instanceCount *= i22;
                    break;
                }
                for (i23 = 1; i23 < 2; i23++) {
                    byte by1=123;
                    Test.dArrFld[(int)(d4 - 1)] = -6669635889132725515L;
                    by1 += (byte)Test.instanceCount;
                    i19 += (33 + (i23 * i23));
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
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
