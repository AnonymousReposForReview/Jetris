package tests.javafuzzer2221;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 10:23:09 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2188153364L;
    public static double dFld=-1.113246;
    public static float fFld=56.895F;
    public byte byFld=70;
    public static int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 10);
        FuzzerUtils.init(Test.dArrFld, 13.73621);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i3=-9, i4=-52845, i5=8, i6=59219, i7=35301, i8=11;
        boolean b=false;
        short s=645;
        float fArr[]=new float[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(fArr, 0.173F);
        FuzzerUtils.init(lArr, -5232065872218079580L);

        switch ((((i3 >>> 1) % 5) * 5) + 1) {
        case 25:
            i4 = 1;
            do {
                i3 += i4;
                switch (((i4 % 7) * 5) + 7) {
                case 28:
                    Test.instanceCount >>= i4;
                    break;
                case 14:
                    Test.fFld = i4;
                    break;
                case 11:
                    i3 = i4;
                    break;
                case 42:
                    i3 += (i4 * Test.instanceCount);
                    if (b) break;
                    for (i5 = 1; i5 < 5; i5++) {
                        i6 >>= i3;
                        for (i7 = 1; i7 < 2; ++i7) {
                            i3 -= (int)Test.instanceCount;
                            i8 += (i7 | i4);
                            Test.iArrFld[i4 + 1] += (int)Test.instanceCount;
                        }
                    }
                case 40:
                    Test.dFld -= Test.dFld;
                    break;
                case 41:
                case 32:
                    i3 = i3;
                    break;
                default:
                    Test.instanceCount = i6;
                }
            } while (++i4 < 321);
            break;
        case 15:
            Test.iArrFld[(i8 >>> 1) % N] -= s;
        case 3:
            fArr[(i7 >>> 1) % N] *= (float)Test.dFld;
            break;
        case 11:
            lArr[(i4 >>> 1) % N] += (long)Test.fFld;
        case 21:
            Test.fFld += (float)Test.dFld;
        default:
            Test.dFld -= i3;
        }
        vMeth1_check_sum += i3 + i4 + (b ? 1 : 0) + i5 + i6 + i7 + i8 + s +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr);
    }

    public static long lMeth() {

        int i9=56058, i10=-46485, i11=-65376, i13=167, i14=6, i15=-34644;
        boolean b1=true;
        float f1=-12.430F;

        vMeth1();
        Test.iArrFld[(i9 >>> 1) % N] = i9;
        Test.instanceCount >>= i9;
        for (i10 = 17; i10 < 308; ++i10) {
            Test.dArrFld[i10 + 1] -= -2.145F;
            if (b1) continue;
            for (f1 = 1; f1 < 6; ++f1) {
                if (i13 != 0) {
                }
                for (i14 = 1; 2 > i14; i14++) {
                    i11 <<= (int)-11350L;
                    i11 += (((i14 * i9) + i13) - Test.instanceCount);
                    i11 <<= i13;
                    b1 = b1;
                    Test.instanceCount += 4551339245960769464L;
                    Test.instanceCount += (long)Test.fFld;
                }
            }
        }
        long meth_res = i9 + i10 + i11 + (b1 ? 1 : 0) + Float.floatToIntBits(f1) + i13 + i14 + i15;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i, byte by, long l) {

        float f=2.118F, f2=-1.683F;
        int i1=-22074, i2=24451, i16=-17648, i17=-77, i18=245;
        byte byArr[][]=new byte[N][N];

        FuzzerUtils.init(byArr, (byte)64);

        i >>= (int)((Long.reverseBytes(53003L) + (-74.943F / ((-12 + i) | 1))) - Math.min((int)(f + Test.dFld), i - i));
        for (i1 = 10; 344 > i1; i1++) {
            i += 2;
            i += (((i1 * f) + f) - i2);
            switch ((i1 % 1) + 5) {
            case 5:
                i2 -= (int)((lMeth() + i1) - Test.fFld);
                i = i1;
                break;
            default:
                i2 = 55369;
                l ^= i1;
                for (f2 = 1; f2 < 5; f2++) {
                    for (i17 = 1; i17 < 2; i17 += 2) {
                        i18 *= -183;
                        i = i;
                        i2 >>= i1;
                        byArr[(int)(f2 - 1)][i1] = (byte)i17;
                    }
                }
            }
        }
        vMeth_check_sum += i + by + l + Float.floatToIntBits(f) + i1 + i2 + Float.floatToIntBits(f2) + i16 + i17 + i18
            + FuzzerUtils.checkSum(byArr);
    }

    public void mainTest(String[] strArr1) {

        int i19=2148, i20=16783, i21=7, i22=22850, i23=3, i24=-58519, i25=-25590, i26=169, i27=-25122, i28=-34187,
            i29=-51363, i30=-1;
        float f3=2.1022F, fArr1[]=new float[N];
        short s1=24610;
        boolean b2=false;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 2919713162005300620L);
        FuzzerUtils.init(fArr1, -13.76F);

        vMeth(i19, byFld, Test.instanceCount);
        Test.dFld += i19;
        for (f3 = 6; f3 < 144; f3++) {
            i19 += (int)f3;
            byFld -= (byte)-79;
        }
        Test.instanceCount += i19;
        for (i21 = 10; i21 < 282; ++i21) {
            Test.instanceCount -= i22;
            Test.dFld += i19;
            for (i23 = i21; i23 < 92; ++i23) {
                i22 = -4;
                lArr1[i23] = i20;
                i20 >>= (int)Test.instanceCount;
            }
        }
        if (b2) {
            Test.instanceCount = 53349;
            for (i25 = 9; i25 < 144; i25++) {
                Test.iArrFld[i25 - 1] -= i24;
                Test.fFld -= s1;
                for (i27 = 186; 3 < i27; --i27) {
                    Test.instanceCount -= byFld;
                    for (i29 = 1; i29 < 2; i29++) {
                        i28 += i30;
                        Test.dFld = Test.fFld;
                        Test.fFld += (((i29 * Test.instanceCount) + Test.fFld) - i30);
                        i30 += i29;
                        switch (((i22 >>> 1) % 2) + 29) {
                        case 29:
                            i22 += (i29 ^ i27);
                        case 30:
                            Test.iArrFld[i29] = i26;
                            break;
                        default:
                            fArr1[i29 + 1] += (float)29.21993;
                            Test.instanceCount = i24;
                        }
                    }
                }
            }
        } else if (b2) {
            i28 = i25;
        } else {
            Test.fFld += Test.instanceCount;
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}