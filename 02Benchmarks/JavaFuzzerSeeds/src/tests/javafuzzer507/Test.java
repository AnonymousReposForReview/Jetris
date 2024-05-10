package tests.javafuzzer507;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 04:47:48 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-9L;
    public static int iFld=21143;
    public volatile byte byFld=22;
    public static float fFld=-21.173F;
    public static int iArrFld[][]=new int[N][N];
    public volatile long lArrFld[][]=new long[N][N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 0);
        FuzzerUtils.init(Test.fArrFld, -106.872F);
    }

    public static long lMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i2) {

        int i3=0, i4=-143, i5=-89, i6=-156, iArr[]=new int[N];
        short s=-17164;
        float f=1.145F;

        FuzzerUtils.init(iArr, 128);

        for (i3 = 9; i3 < 212; i3++) {
            try {
                i4 = (i2 / 60574);
                i4 = (235 / Test.iFld);
                i2 = (-75 / i4);
            } catch (ArithmeticException a_e) {}
            for (i5 = 8; i5 > 1; --i5) {
                int i7=1;
                Test.iFld = (int)-1.26052;
                Test.iFld >>= i7;
                s ^= (short)i6;
                i7 <<= i5;
                f *= i2;
                iArr[i5 - 1] = Test.iFld;
                Test.instanceCount = i7;
                f += i5;
            }
            i6 = (int)f;
            Test.instanceCount += i3;
            i6 >>= i4;
            i4 = s;
        }
        vMeth_check_sum += i2 + i3 + i4 + i5 + i6 + s + Float.floatToIntBits(f) + FuzzerUtils.checkSum(iArr);
    }

    public static float fMeth(long l1, int i, int i1) {

        int i8=48471, i9=61, i10=5, i11=-23159, i12=-8, i13=7, i14=-233, i15=-11505;
        byte by=118;
        float f1=-72.85F;

        vMeth(Test.iFld);
        for (i8 = 2; 168 > i8; ++i8) {
            for (i10 = i8; i10 < 10; i10++) {
                try {
                    Test.iArrFld[i8 - 1][i10] = (-23320 / Test.iArrFld[i8][i8]);
                    Test.iFld = (Test.iFld % -45);
                    i = (i % 7090);
                } catch (ArithmeticException a_e) {}
                for (i12 = 1; i12 < 1; i12++) {
                    Test.iArrFld[i10 + 1][(i8 >>> 1) % N] *= Test.iFld;
                }
                for (i14 = 1; i14 < 1; ++i14) {
                    Test.iFld += (i14 * i14);
                    i1 += i14;
                    i9 |= i;
                    try {
                        Test.iArrFld[(i8 >>> 1) % N][i10 + 1] = (i % 212);
                        i13 = (55043 / i8);
                        i1 = (-90 / Test.iArrFld[i14 - 1][i10 - 1]);
                    } catch (ArithmeticException a_e) {}
                    by = (byte)Test.iFld;
                    l1 = i13;
                    Test.iFld ^= i15;
                    f1 -= i15;
                }
            }
        }
        long meth_res = l1 + i + i1 + i8 + i9 + i10 + i11 + i12 + i13 + i14 + i15 + by + Float.floatToIntBits(f1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static long lMeth(long l) {

        int i16=-9, i17=39, i18=72, i19=116, i20=186;
        float f2=1.762F, f3=0.103F, fArr[]=new float[N];

        FuzzerUtils.init(fArr, 73.232F);

        Test.iFld *= (int)fMeth(-3775948113L, Test.iFld, Test.iFld);
        Test.iFld &= Test.iFld;
        Test.iFld *= (int)l;
        for (i16 = 165; i16 > 7; i16--) {
            f2 = i16;
        }
        for (f3 = 3; 350 > f3; ++f3) {
            boolean b=true;
            if (Test.iFld != 0) {
            }
            switch ((int)((f3 % 3) + 23)) {
            case 23:
            case 24:
                for (i19 = 1; i19 < 5; ++i19) {
                    Test.iFld = (int)Test.instanceCount;
                    Test.iArrFld[(int)(f3 + 1)][i19] &= 76;
                    fArr[(Test.iFld >>> 1) % N] *= Test.iFld;
                    i17 -= (int)l;
                    Test.instanceCount += (-54277 + (i19 * i19));
                    i20 += i18;
                }
                break;
            case 25:
                l = i17;
                break;
            default:
                if (b) break;
            }
        }
        long meth_res = l + i16 + i17 + Float.floatToIntBits(f2) + Float.floatToIntBits(f3) + i18 + i19 + i20 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d=1.50246;
        int i21=-7, i22=-85, i23=-128, i24=44048, i25=10097, i26=-10777;
        boolean b1=false;

        d += lMeth(Test.instanceCount);
        for (i21 = 20; 393 > i21; i21 += 3) {
            if (b1) {
                Test.instanceCount += i21;
                for (i23 = i21; i23 < 202; ++i23) {
                    lArrFld[i23 - 1] = lArrFld[i23 - 1];
                    Test.iFld *= -9;
                    Test.iFld >>= -167;
                    Test.iArrFld[i23 - 1][i23] >>= i21;
                    i22 /= (int)(i24 | 1);
                    i25 = 1;
                    do {
                        switch (((i23 % 4) * 5) + 92) {
                        case 107:
                            try {
                                Test.iFld = (i25 % i24);
                                i24 = (i23 / i25);
                                Test.iArrFld[i23 - 1][i21] = (i21 / Test.iArrFld[i21 - 1][i25 + 1]);
                            } catch (ArithmeticException a_e) {}
                            break;
                        case 96:
                            Test.fArrFld[i23] -= i21;
                            lArrFld[i21 - 1][i21] = Test.instanceCount;
                            break;
                        case 103:
                            Test.iArrFld[(-7 >>> 1) % N][i25] = i24;
                            i24 += i25;
                            Test.instanceCount += (((i25 * Test.instanceCount) + i25) - Test.instanceCount);
                            break;
                        case 112:
                            if (false) continue;
                            byFld >>= (byte)i22;
                            Test.iFld += Test.iFld;
                            break;
                        default:
                            i24 += (((i25 * i25) + i22) - i23);
                            Test.fFld *= 176;
                            Test.instanceCount = byFld;
                        }
                        i22 = (int)Test.instanceCount;
                        Test.instanceCount >>>= i24;
                        i26 ^= i21;
                        Test.instanceCount += (((i25 * i23) + Test.fFld) - i23);
                        Test.instanceCount *= i24;
                        Test.instanceCount += i23;
                    } while (++i25 < 1);
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  fMeth ->  fMeth lMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
