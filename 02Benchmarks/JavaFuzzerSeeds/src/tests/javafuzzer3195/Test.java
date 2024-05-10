package tests.javafuzzer3195;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 03:42:53 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-56272L;
    public static float fFld=1.741F;
    public static short sFld=-6034;
    public static byte byFld=42;
    public boolean bFld=true;
    public static double dArrFld[]=new double[N];
    public static volatile long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.dArrFld, -112.123370);
        FuzzerUtils.init(Test.lArrFld, 108L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l, int i5) {

        long l1=-44709L;
        int i6=-119, i7=-26123, i8=0, i9=-13;
        double d=-95.71871;

        l = -3;
        for (l1 = 6; l1 < 326; l1++) {
            for (i7 = 1; i7 < 5; i7++) {
                i5 -= i6;
                i6 += (i7 * i7);
                Test.instanceCount = i6;
                Test.sFld = (short)i8;
            }
            i6 *= (int)l;
            Test.dArrFld = Test.dArrFld;
            i6 += (int)(l1 * l1);
        }
        for (d = 1; d < 308; ++d) {
            l = l;
            i9 = i7;
            l += Test.byFld;
            i5 += (int)Test.fFld;
        }
        vMeth1_check_sum += l + i5 + l1 + i6 + i7 + i8 + Double.doubleToLongBits(d) + i9;
    }

    public static void vMeth(int i3, int i4, short s) {

        int i10=2, i11=-51, i12=85, iArr[]=new int[N];
        double d1=58.16258, d2=2.28951, d3=-1.35634;
        float f=-98.241F;
        boolean b=false;

        FuzzerUtils.init(iArr, -4);

        vMeth1(Test.instanceCount, i3);
        for (i10 = 161; i10 > 8; --i10) {
            for (d1 = 1; d1 < 10; ++d1) {
                Test.instanceCount &= 0;
                Test.lArrFld[(int)(d1 - 1)] = Test.instanceCount;
            }
            switch (((i10 % 2) * 5) + 60) {
            case 63:
                d2 = -4;
                f = 10;
                do {
                    d3 = f;
                    Test.lArrFld[(int)(f)] = i11;
                    i4 -= i4;
                    Test.fFld += ((long)f ^ (long)i11);
                    Test.instanceCount = i12;
                    b = b;
                    iArr[(int)(f + 1)] *= 54614;
                } while ((f -= 3) > 0);
                break;
            case 68:
                Test.fFld += Test.instanceCount;
            default:
            }
        }
        vMeth_check_sum += i3 + i4 + s + i10 + i11 + Double.doubleToLongBits(d1) + i12 + Double.doubleToLongBits(d2) +
            Float.floatToIntBits(f) + Double.doubleToLongBits(d3) + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(int i1, int i2) {

        int i13=-12, i14=-13, i15=252, i16=3, i17=15647, i18=2, i19=188, i20=-74, iArr1[]=new int[N];
        boolean b1=false, bArr[]=new boolean[N];
        double d4=107.120607;

        FuzzerUtils.init(iArr1, 2);
        FuzzerUtils.init(bArr, true);

        switch (((((int)(Test.instanceCount - Test.fFld)) >>> 1) % 4) + 55) {
        case 55:
            vMeth(19305, i1, (short)(31653));
            for (i13 = 6; i13 < 128; ++i13) {
                i15 = 1;
                do {
                    i16 *= Test.byFld;
                } while (++i15 < 13);
                for (i17 = 13; i17 > 1; i17 -= 2) {
                    i1 += (((i17 * i1) + Test.byFld) - i18);
                    switch ((i13 % 1) + 72) {
                    case 72:
                        i18 += i16;
                        if (b1) continue;
                        for (i19 = 1; 3 > i19; ++i19) {
                            i1 <<= Test.byFld;
                            i18 *= i15;
                            i18 -= (int)Test.fFld;
                            Test.instanceCount >>= i17;
                        }
                        break;
                    default:
                        iArr1[i13] *= i16;
                    }
                }
            }
        case 56:
            Test.instanceCount <<= i1;
            break;
        case 57:
            bArr = FuzzerUtils.boolean1array(N, (boolean)true);
            break;
        case 58:
            i2 = i19;
            break;
        default:
            d4 += i1;
        }
        long meth_res = i1 + i2 + i13 + i14 + i15 + i16 + i17 + i18 + (b1 ? 1 : 0) + i19 + i20 +
            Double.doubleToLongBits(d4) + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(bArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=13, i21=28562, i22=-53845, i23=242, i24=40285, i25=-83, i26=84, i27=-12, iArr2[]=new int[N];
        float f1=-13.399F;
        double d5=1.87694;

        FuzzerUtils.init(iArr2, -149);

        i *= (int)Test.instanceCount;
        switch (((iMeth(i, i) >>> 1) % 2) + 103) {
        case 103:
            for (i21 = 7; i21 < 346; ++i21) {
                Test.byFld &= (byte)Test.sFld;
                for (i23 = 3; i23 < 74; i23++) {
                    for (i25 = 1; i25 < 2; ++i25) {
                        bFld = bFld;
                        i22 = (int)Test.instanceCount;
                        Test.fFld = i24;
                        Test.instanceCount /= (i22 | 1);
                        i26 >>= i22;
                        Test.instanceCount += Test.instanceCount;
                    }
                    i22 += (int)-2.173F;
                    Test.dArrFld[i21 - 1] += Test.instanceCount;
                    for (f1 = 1; f1 < 2; f1++) {
                        Test.instanceCount += (long)(f1 * Test.instanceCount);
                        i24 = i23;
                        switch ((int)((f1 % 4) + 62)) {
                        case 62:
                            Test.fFld += f1;
                            break;
                        case 63:
                            i27 = i;
                            i27 -= (int)Test.instanceCount;
                            switch ((((i26 >>> 1) % 2) * 5) + 14) {
                            case 24:
                                bFld = bFld;
                                i += (int)1.446F;
                            case 21:
                                switch (((i23 >>> 1) % 4) + 46) {
                                case 46:
                                    switch (((10256 >>> 1) % 10) + 33) {
                                    case 33:
                                        Test.fFld -= (float)d5;
                                        i -= (int)96.107056;
                                        Test.byFld ^= (byte)i26;
                                    case 34:
                                    case 35:
                                        if (bFld) continue;
                                        break;
                                    case 36:
                                        if (bFld) break;
                                    case 37:
                                        Test.instanceCount = Test.sFld;
                                        break;
                                    case 38:
                                        Test.fFld = 8.872F;
                                        break;
                                    case 39:
                                        Test.fFld = i21;
                                        break;
                                    case 40:
                                    case 41:
                                        Test.instanceCount >>= i25;
                                    case 42:
                                        iArr2[i23] += Test.sFld;
                                        break;
                                    }
                                    break;
                                case 47:
                                    i22 += (int)Test.fFld;
                                case 48:
                                    i27 *= i26;
                                    break;
                                case 49:
                                default:
                                    i26 &= i;
                                }
                                break;
                            default:
                                d5 = -75.118F;
                            }
                        case 64:
                            i24 = i25;
                        case 65:
                            Test.fFld += (f1 - Test.instanceCount);
                            break;
                        }
                    }
                }
            }
            break;
        case 104:
            Test.lArrFld[(20342 >>> 1) % N] = (long)-2.495F;
            break;
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}