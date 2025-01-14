package tests.javafuzzer54;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 21:37:42 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2681357322L;
    public static double dFld=2.58455;
    public static long lArrFld[]=new long[N];
    public static double dArrFld[]=new double[N];
    public static int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.lArrFld, -586295003L);
        FuzzerUtils.init(Test.dArrFld, -2.21969);
        FuzzerUtils.init(Test.iArrFld, 100);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i4) {

        int i5=-5, i6=-33472, i7=-40745, i8=-14, i9=4, i10=12, i11=-168, iArr[][]=new int[N][N];
        float f1=57.573F, f2=-2.724F, fArr[]=new float[N];
        byte by=-80;
        boolean b=true;

        FuzzerUtils.init(fArr, 107.814F);
        FuzzerUtils.init(iArr, -13);

        fArr[(i4 >>> 1) % N] = i4;
        Test.lArrFld[(i4 >>> 1) % N] *= i4;
        i5 = 1;
        while (++i5 < 380) {
            f1 = 1;
            do {
                for (i6 = 1; i6 < 1; i6++) {
                    i7 = (int)Test.dFld;
                }
                by <<= (byte)Test.instanceCount;
                b = false;
                for (i8 = 1; 1 > i8; i8++) {
                    i9 *= (int)Test.instanceCount;
                    iArr[i8][i5 - 1] += (int)Test.instanceCount;
                    i4 <<= i7;
                }
                for (i10 = i5; 1 > i10; ++i10) {
                    f2 += i10;
                    i11 += i10;
                }
            } while (++f1 < 4);
        }
        vMeth1_check_sum += i4 + i5 + Float.floatToIntBits(f1) + i6 + i7 + by + (b ? 1 : 0) + i8 + i9 + i10 + i11 +
            Float.floatToIntBits(f2) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(int i1, long l, long l1) {

        int i2=8, i3=13, i12=8, i13=39745, i14=0, i15=-7929, i16=46197, iArr1[]=new int[N];
        float f=-1.207F, fArr1[]=new float[N];
        boolean b1=false;

        FuzzerUtils.init(fArr1, 38.277F);
        FuzzerUtils.init(iArr1, 8);

        for (i2 = 7; i2 < 177; i2++) {
            f = 1;
            while (++f < 9) {
                vMeth1(i12);
                Test.lArrFld[i2] = i2;
            }
            Test.lArrFld[i2 - 1] = (long)Test.dFld;
            for (i13 = 9; 1 < i13; --i13) {
                if (b1) {
                    switch (((i13 % 1) * 5) + 125) {
                    case 129:
                        for (i15 = 1; i15 < 2; ++i15) {
                            if (i3 != 0) {
                            }
                            i16 <<= i14;
                            i16 >>= (int)l;
                            fArr1[i2 - 1] = f;
                            l1 |= l1;
                            i1 -= i2;
                        }
                        break;
                    }
                } else if (b1) {
                } else if (b1) {
                    Test.lArrFld[i2] += i16;
                } else {
                    iArr1[i13] += 126;
                }
            }
        }
        long meth_res = i1 + l + l1 + i2 + i3 + Float.floatToIntBits(f) + i12 + i13 + i14 + i15 + i16 + (b1 ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i, double d) {

        int i17=-9848, i18=-9, i19=-13, i20=32456, i21=-29969;
        float f3=-14.543F;
        boolean b2=false, bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, true);

        i += (int)(((0.207F + (i + i)) - i) * iMeth(-14, Test.instanceCount, Test.instanceCount));
        for (i17 = 18; i17 < 321; i17++) {
            if (b2) {
                if (b2) {
                    i19 = 1;
                    do {
                        i18 *= i19;
                        i -= 150;
                        switch (((i19 % 6) * 5) + 118) {
                        case 139:
                            i *= (int)f3;
                            Test.instanceCount <<= Test.instanceCount;
                            Test.dArrFld[i17 + 1] += i18;
                            break;
                        case 146:
                            try {
                                Test.iArrFld[i19 + 1][i17] = (102 / Test.iArrFld[i17][i19]);
                                i18 = (1814629001 % i);
                                i = (i18 % Test.iArrFld[i19 + 1][i17]);
                            } catch (ArithmeticException a_e) {}
                            for (i20 = 1; i20 < 1; ++i20) {
                                bArr[i20] = false;
                                Test.iArrFld[i19 - 1][i17] = (int)Test.instanceCount;
                            }
                            break;
                        case 120:
                            i += i19;
                        case 119:
                            i18 = i21;
                            break;
                        case 130:
                            try {
                                i18 = (i17 / -1903);
                                i21 = (Test.iArrFld[i19 - 1][i17 - 1] % 220);
                                Test.iArrFld[i17][i17 - 1] = (i19 / i18);
                            } catch (ArithmeticException a_e) {}
                            break;
                        case 134:
                            Test.instanceCount = i20;
                            break;
                        default:
                            Test.iArrFld[i17 + 1][(i >>> 1) % N] %= (int)(Test.instanceCount | 1);
                        }
                    } while (++i19 < 5);
                }
                vMeth_check_sum += i + Double.doubleToLongBits(d) + i17 + i18 + i19 + Float.floatToIntBits(f3) + i20 +
                    i21 + (b2 ? 1 : 0) + FuzzerUtils.checkSum(bArr);
                return;
            } else if (b2) {
                Test.dArrFld[i17 - 1] = Test.instanceCount;
            } else if (b2) {
                Test.iArrFld[i17][i17] -= i21;
            } else {
                i += (i17 - Test.instanceCount);
            }
        }
        vMeth_check_sum += i + Double.doubleToLongBits(d) + i17 + i18 + i19 + Float.floatToIntBits(f3) + i20 + i21 +
            (b2 ? 1 : 0) + FuzzerUtils.checkSum(bArr);
    }

    public void mainTest(String[] strArr1) {

        int i22=-197;
        short s=-22947;

        vMeth(8, Test.dFld);
        Test.iArrFld[(i22 >>> 1) % N][(i22 >>> 1) % N] = 64610;
        i22 -= -11199;
        i22 <<= s;


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
