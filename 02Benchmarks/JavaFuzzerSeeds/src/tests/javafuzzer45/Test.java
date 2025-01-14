package tests.javafuzzer45;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 21:32:24 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3458930349685938850L;
    public short sFld=-1152;
    public static volatile float fFld=0.488F;
    public static boolean bFld=false;
    public double dFld=1.26816;
    public byte byFld=-72;
    public static volatile int iFld=10;
    public int iFld1=-4;
    public static int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];
    public volatile long lArrFld[]=new long[N];
    public volatile int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 34827);
        FuzzerUtils.init(Test.dArrFld, 2.81061);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i11, long l) {

        int i12=50523, i13=-14, i14=6, i15=-11;
        double d1=-79.40279;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 25.914F);

        if (Test.bFld) {
            i11 <<= i11;
        }
        i11 = 13;
        if (false) {
            Test.fFld += i11;
            for (i12 = 13; i12 < 208; i12++) {
                Test.fFld = i12;
                for (i14 = 1; i14 < 8; i14++) {
                    i13 += (int)Test.instanceCount;
                    fArr[i12 - 1] += i14;
                    if (i11 != 0) {
                        vMeth1_check_sum += i11 + l + i12 + i13 + i14 + i15 + Double.doubleToLongBits(d1) +
                            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                        return;
                    }
                    d1 += -1;
                    Test.dArrFld[i12 + 1] *= Test.fFld;
                    i11 *= (int)d1;
                    i15 -= (int)d1;
                }
            }
        } else {
            l += i11;
        }
        vMeth1_check_sum += i11 + l + i12 + i13 + i14 + i15 + Double.doubleToLongBits(d1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void vMeth(int i7) {

        int i8=-30992, i9=43991, i10=5222, i16=-109, i17=-230;

        for (i8 = 17; i8 < 274; i8++) {
            i10 = 6;
            while ((i10 -= 2) > 0) {
                vMeth1(i9, -207L);
                for (i16 = 1; i16 < 2; i16++) {
                    i9 += i16;
                    i17 += (int)dFld;
                    i7 >>= i9;
                    i9 = i9;
                }
                byFld += (byte)i10;
                if (false) {
                    Test.instanceCount += (i10 - i17);
                    dFld += 230;
                } else if (Test.bFld) {
                    i9 = i16;
                    i9 -= i17;
                    Test.instanceCount += (((i10 * i16) + Test.instanceCount) - Test.iFld);
                } else {
                    lArrFld[i10 - 1] = i10;
                }
            }
        }
        vMeth_check_sum += i7 + i8 + i9 + i10 + i16 + i17;
    }

    public int iMeth(int i4, int i5, int i6) {

        int i18=108, i19=-212, i20=192;
        float f=-11.953F, fArr1[][]=new float[N][N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-105);
        FuzzerUtils.init(fArr1, 2.785F);

        if (Test.bFld) {
            vMeth(Test.iFld);
            byFld = (byte)10;
            for (i18 = 6; 319 > i18; ++i18) {
                i19 += 12;
                Test.fFld *= Test.instanceCount;
                i20 = 1;
                while (++i20 < 5) {
                    Test.iFld += (i20 * i20);
                    try {
                        i6 = (i18 / i19);
                        i6 = (i20 / -201);
                        i6 = (i19 % i18);
                    } catch (ArithmeticException a_e) {}
                    switch ((i20 % 10) + 105) {
                    case 105:
                        byArr[i20] += (byte)Test.instanceCount;
                        i4 >>= 12;
                    case 106:
                        Test.instanceCount -= sFld;
                        break;
                    case 107:
                        Test.iFld -= Test.iFld;
                        Test.fFld += (((i20 * f) + i5) - i6);
                    case 108:
                        i5 += (i20 | Test.instanceCount);
                        break;
                    case 109:
                        Test.iArrFld[i20] = (int)f;
                        break;
                    case 110:
                        Test.instanceCount -= i18;
                        break;
                    case 111:
                        fArr1[i20][i20 - 1] -= f;
                        break;
                    case 112:
                        i6 = byFld;
                        break;
                    case 113:
                        Test.iFld += (i20 | i4);
                        break;
                    case 114:
                        dFld -= i6;
                    default:
                        i5 += (int)(106L + (i20 * i20));
                    }
                }
            }
        } else if (true) {
            lArrFld = lArrFld;
        } else if (false) {
            i4 += i6;
        } else {
            i5 -= (int)Test.instanceCount;
        }
        long meth_res = i4 + i5 + i6 + i18 + i19 + i20 + Float.floatToIntBits(f) + FuzzerUtils.checkSum(byArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-150, i1=-10108, i2=123, i3=-10, i21=-49608, i22=43844, i23=30455;
        double d=52.49826;
        byte by=-119;

        for (i = 13; i < 243; ++i) {
            i2 = 109;
            while (--i2 > 0) {
                d = (((Test.instanceCount + d) + (Test.instanceCount - i)) + ((sFld--) - Test.iArrFld[i]));
                switch ((i2 % 3) + 25) {
                case 25:
                    i1 -= (int)(((Test.fFld = -62237) + (d--)) + ((--Test.instanceCount) * (i1--)));
                    i1 = (int)((Math.max(Test.instanceCount, Test.instanceCount) + (i1 + by)) * ((4 - sFld) + i));
                    break;
                case 26:
                    i3 = 1;
                    do {
                        if (Test.bFld = ((--i1) != Test.iArrFld[i3 - 1])) break;
                        i1 = iMeth(i2, i1, i);
                    } while (++i3 < 1);
                case 27:
                    i21 = 1;
                    do {
                        Test.instanceCount += (((i21 * by) + i21) - i21);
                        if (Test.bFld) break;
                    } while (++i21 < 1);
                    i1 <<= Test.iFld;
                    break;
                default:
                    sFld ^= (short)i;
                    i1 += (((i2 * Test.instanceCount) + i3) - Test.instanceCount);
                    for (i22 = 1; i22 < 1; i22++) {
                        Test.iArrFld = Test.iArrFld;
                        switch ((((i21 >>> 1) % 10) * 5) + 93) {
                        case 101:
                            Test.iArrFld[i22 - 1] = i;
                            Test.iArrFld[i2 + 1] = i21;
                        case 106:
                            byFld += (byte)i22;
                            break;
                        case 135:
                            i1 += (i22 * i22);
                            break;
                        case 98:
                            Test.iFld |= i;
                            Test.fFld += (-3 + (i22 * i22));
                            d *= Test.instanceCount;
                            i1 >>>= i21;
                            break;
                        case 127:
                            switch ((i22 % 8) + 47) {
                            case 47:
                                Test.iFld ^= 43611;
                                Test.iArrFld[i + 1] *= -49;
                                try {
                                    i1 = (i22 / -441248494);
                                    i1 = (i22 / -82);
                                    Test.iFld = (i22 % 44264);
                                } catch (ArithmeticException a_e) {}
                                break;
                            case 48:
                            case 49:
                                i23 += (((i22 * Test.instanceCount) + i1) - Test.fFld);
                            case 50:
                                i1 += (((i22 * i2) + Test.instanceCount) - i3);
                            case 51:
                                try {
                                    i1 = (106517193 / i22);
                                    iArrFld1[i - 1] = (231 / i);
                                    Test.iArrFld[i] = (105 % i23);
                                } catch (ArithmeticException a_e) {}
                            case 52:
                                i23 += (((i22 * i1) + Test.fFld) - Test.instanceCount);
                                break;
                            case 53:
                                Test.fFld += (i22 * i22);
                                break;
                            case 54:
                            default:
                                Test.iFld += i22;
                            }
                        case 130:
                            Test.iFld += (int)78.125714;
                            break;
                        case 138:
                            iArrFld1[i + 1] -= i1;
                            break;
                        case 111:
                            try {
                                Test.iFld = (iArrFld1[i] % i23);
                                iFld1 = (i22 / iArrFld1[i22]);
                                i23 = (i21 / i21);
                            } catch (ArithmeticException a_e) {}
                        case 133:
                        case 121:
                            i1 = i21;
                        default:
                            dFld += i;
                        }
                    }
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
