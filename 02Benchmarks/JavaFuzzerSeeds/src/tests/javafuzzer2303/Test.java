package tests.javafuzzer2303;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 11:52:37 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-6238827308644446880L;
    public static volatile boolean bFld=false;
    public static byte byFld=-53;
    public static float fFld=-2.267F;
    public static int iFld=187;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[][]=new long[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 168);
        FuzzerUtils.init(Test.lArrFld, -52861L);
    }

    public static long iMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(long l, int i12) {

        int i13=-52, i14=-7, i15=-2, i16=-10;
        long l1=-1658L, l2=-536401500L, l3=-53L;
        double d=-1.87808;
        byte by=-2;

        l *= i12;
        for (i13 = 8; i13 < 139; i13++) {
            for (i15 = 12; i15 > 1; --i15) {
                i14 += (46425 + (i15 * i15));
                i12 >>= (int)Test.instanceCount;
                i12 ^= i14;
                i14 *= i12;
                switch (((i13 % 10) * 5) + 39) {
                case 47:
                    i12 <<= i14;
                    l1 = 2;
                    while ((l1 -= 3) > 0) {
                        i12 = i14;
                        switch ((((i14 >>> 1) % 2) * 5) + 66) {
                        case 76:
                            Test.bFld = Test.bFld;
                            i12 = (int)l1;
                            Test.iArrFld[(int)(l1 - 1)] >>>= (int)l1;
                        case 75:
                            d *= l;
                        }
                    }
                    break;
                case 75:
                    i14 = 31071;
                    break;
                case 45:
                    i16 += i15;
                    break;
                case 81:
                    Test.iArrFld[i15 - 1] = by;
                    break;
                case 51:
                    i16 = (int)l;
                    break;
                case 68:
                    i16 -= i14;
                    break;
                case 85:
                    i12 += (int)-4L;
                case 56:
                    Test.instanceCount <<= i14;
                case 57:
                    i12 %= (int)(l2 | 1);
                case 76:
                    l += (-10 + (i15 * i15));
                    break;
                default:
                    i12 += (int)l3;
                }
            }
        }
        long meth_res = l + i12 + i13 + i14 + i15 + i16 + l1 + Double.doubleToLongBits(d) + by + l2 + l3;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static boolean bMeth(int i8, int i9) {

        int i10=46163, i11=-6, i17=-16530;
        byte by1=94;
        double d1=2.48444;
        float f1=41.857F, fArr[]=new float[N];

        FuzzerUtils.init(fArr, 26.280F);

        for (i10 = 21; i10 < 398; ++i10) {
            Test.instanceCount += (-51422L + (i10 * i10));
            i9 += i11;
            i8 -= (int)(Test.instanceCount--);
            i11 += (((i10 * i11) + i8) - i11);
        }
        fArr[(i11 >>> 1) % N] *= ((-fMeth(Test.instanceCount, -1468)) * i9);
        by1 = (byte)Test.instanceCount;
        Test.instanceCount += by1;
        i17 = 149;
        do {
            i9 ^= (int)Test.instanceCount;
        } while (--i17 > 0);
        d1 += i9;
        i9 *= i8;
        i8 = (int)f1;
        Test.lArrFld[(i9 >>> 1) % N][(i10 >>> 1) % N] %= 13;
        d1 *= 11;
        long meth_res = i8 + i9 + i10 + i11 + by1 + i17 + Double.doubleToLongBits(d1) + Float.floatToIntBits(f1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static int iMeth(float f, int i1) {

        int i2=40527, i3=231, i4=217, i5=12, i6=-44737, i7=-3095, iArr[]=new int[N];
        short s=-24729;

        FuzzerUtils.init(iArr, -45976);

        for (i2 = 8; i2 < 175; ++i2) {
            for (i4 = 1; i4 < 9; i4++) {
                Test.instanceCount |= ((Short.reverseBytes(s) - (i1 = (int)2095027589L)) + ((Test.instanceCount + i3) +
                    i3));
                i1 = (++i5);
                for (i6 = 1; 2 > i6; i6++) {
                    s += (short)i6;
                    i1 = (--i7);
                    Test.bFld = ((iArr[i4 + 1] != i5) || ((Test.bFld == Test.bFld) && bMeth(28655, i5)));
                    i3 = i5;
                    iArr[i4 + 1] -= -15803;
                    i3 = i3;
                }
                i5 >>>= i4;
                if (Test.bFld) break;
                Test.byFld *= (byte)Test.instanceCount;
                i5 += (int)Test.instanceCount;
            }
        }
        long meth_res = Float.floatToIntBits(f) + i1 + i2 + i3 + i4 + i5 + s + i6 + i7 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-56481, i18=52604, i19=77, i20=1, i21=-237, i22=0, i23=1;
        short s1=-14216;
        double d2=0.23310;

        i -= (int)((Test.instanceCount++) + (iMeth(Test.fFld, i) * i));
        Test.bFld = false;
        for (i18 = 10; 185 > i18; i18++) {
            for (i20 = 3; i20 < 143; i20++) {
                s1 = (short)i21;
                i21 += (int)(-61L + (i20 * i20));
                i19 += (((i20 * i18) + Test.iFld) - i21);
                for (d2 = 1; d2 < 2; ++d2) {
                    switch (((i18 % 5) * 5) + 121) {
                    case 135:
                        Test.iFld -= (int)-6L;
                        break;
                    case 124:
                        i19 = (int)-1283551415L;
                        i22 = i22;
                        i22 = (int)Test.instanceCount;
                    case 140:
                        Test.iArrFld[i20 + 1] = Test.iFld;
                        i22 += (int)(((d2 * i22) + Test.instanceCount) - i20);
                    case 130:
                    case 129:
                        i22 += i21;
                        Test.iArrFld[i18 - 1] = i18;
                        break;
                    default:
                        Test.fFld += (65264L + (d2 * d2));
                        Test.iFld -= (int)Test.instanceCount;
                        switch ((i20 % 1) + 64) {
                        case 64:
                        default:
                            i19 = Test.iFld;
                            i21 += i18;
                            Test.instanceCount += (long)d2;
                            i21 = -5;
                        }
                        Test.iFld = i18;
                    }
                    Test.iFld |= i23;
                    Test.fFld += (float)d2;
                    Test.fFld *= 39104;
                    Test.instanceCount += (long)((long)d2 | i20);
                    Test.iFld -= (int)Test.instanceCount;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  bMeth ->  bMeth iMeth mainTest
//DEBUG  fMeth ->  fMeth bMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}