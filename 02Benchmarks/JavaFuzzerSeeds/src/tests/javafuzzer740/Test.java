package tests.javafuzzer740;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 08:58:33 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2831049600L;
    public static volatile float fFld=-1.852F;
    public static boolean bFld=true;
    public static volatile byte byFld=121;
    public static int iFld=-14;
    public static int iArrFld[][]=new int[N][N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -21);
        FuzzerUtils.init(Test.dArrFld, 0.75674);
    }

    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i2, int i3, int i4) {

        int i5=-14, i6=-204, i7=12, i8=12022, i9=-1, i10=-44895, iArr[]=new int[N];
        short s1=-4359;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 2196621386706934508L);
        FuzzerUtils.init(iArr, -44040);

        Test.bFld = Test.bFld;
        i3 -= 221;
        for (i5 = 1; i5 < 156; ++i5) {
            for (i7 = 1; i7 < 10; i7++) {
                i2 += (((i7 * i6) + i4) - i3);
                i3 >>>= i3;
                iArr[i5] -= i6;
                i9 = 1;
                do {
                    i8 = (int)-2.865F;
                } while (++i9 < 2);
                i10 = 1;
                do {
                    iArr[i5 - 1] = i2;
                    switch (((i10 % 7) * 5) + 109) {
                    case 137:
                        Test.byFld = (byte)i6;
                        i2 ^= i5;
                        if (Test.bFld) break;
                    case 142:
                        i2 *= i10;
                    case 143:
                        s1 += s1;
                        break;
                    case 132:
                        Test.fFld += 0;
                    case 119:
                        i8 >>= i3;
                        break;
                    case 111:
                        i4 = i3;
                        break;
                    case 118:
                        i4 += (i10 + s1);
                    }
                } while (++i10 < 2);
            }
        }
        vMeth1_check_sum += i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9 + i10 + s1 + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(float f, int i1) {

        double d3=2.80270;
        int i11=-12571, i12=3229, i13=-12463, i14=-39;
        float f1=-34.189F, fArr[]=new float[N];
        short s2=16714;

        FuzzerUtils.init(fArr, -82.998F);

        vMeth1(i1, i1, -3);
        for (d3 = 15; d3 < 387; d3 += 2) {
            i1 = i1;
            i12 = 1;
            while (++i12 < 9) {
                if (Test.bFld) break;
                Test.iArrFld[i12 + 1][(int)(d3)] = i12;
                if (Test.bFld) continue;
                fArr[i12 - 1] += i11;
                for (i13 = 1; i13 < 1; i13++) {
                    try {
                        Test.iArrFld[i13 + 1][i13 + 1] = (-23045 % i13);
                        i14 = (i12 / -100);
                        i11 = (i11 / i1);
                    } catch (ArithmeticException a_e) {}
                    f1 -= i11;
                    Test.iArrFld[i12 - 1][i13 - 1] = i13;
                    Test.byFld -= (byte)i13;
                    Test.instanceCount = s2;
                    Test.dArrFld = Test.dArrFld;
                }
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i1 + Double.doubleToLongBits(d3) + i11 + i12 + i13 + i14 +
            Float.floatToIntBits(f1) + s2 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static float fMeth(long l1, double d1, double d2) {

        short s=17155;
        int i15=-235, i16=9, i17=7, i18=136, i19=-37328, i20=3;
        boolean b=true;

        s = (short)-1.130553;
        vMeth(0.614F, Test.iFld);
        Test.iFld = (int)Test.instanceCount;
        for (i15 = 17; i15 < 311; i15++) {
            l1 >>>= i16;
            if (b) break;
            for (i17 = 1; 6 > i17; ++i17) {
                for (i19 = 2; i19 > 1; i19--) {
                    i16 += i19;
                    Test.fFld -= i18;
                    switch (((Test.iFld >>> 1) % 2) + 103) {
                    case 103:
                        i16 ^= i20;
                        i16 -= i15;
                        break;
                    case 104:
                        i16 *= (int)Test.instanceCount;
                        i20 += (i19 * i17);
                        break;
                    default:
                        i16 += (i19 + i16);
                    }
                }
            }
        }
        long meth_res = l1 + Double.doubleToLongBits(d1) + Double.doubleToLongBits(d2) + s + i15 + i16 + (b ? 1 : 0) +
            i17 + i18 + i19 + i20;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        long l=-1979332836L, lArr1[][]=new long[N][N];
        int i=-43, i21=-58369, i22=13, i23=-13, i24=208, i25=41, i26=14, i27=-33579, i28=38675, i29=89, i30=5;
        double d=-76.45644;
        short s3=30480;

        FuzzerUtils.init(lArr1, 288329331L);

        for (l = 4; l < 275; ++l) {
            Test.instanceCount += (long)d;
            switch (((((int)(i + Test.fFld)) >>> 1) % 4) + 19) {
            case 19:
                Test.instanceCount *= (long)fMeth(l, 2.118461, d);
                switch ((int)((l % 6) + 90)) {
                case 90:
                    lArr1[(int)(l)] = lArr1[(int)(l)];
                    if (Test.bFld) break;
                    d -= i;
                case 91:
                    if (Test.bFld) {
                        for (i21 = 4; i21 < 93; ++i21) {
                            Test.iFld -= i;
                        }
                    } else if (Test.bFld) {
                        Test.instanceCount = Test.iFld;
                        for (i23 = 93; i23 > 2; --i23) {
                            for (i25 = 1; i25 < 2; i25 += 3) {
                                switch (((-48240 >>> 1) % 2) + 3) {
                                case 3:
                                    i22 *= i21;
                                    break;
                                case 4:
                                    Test.instanceCount = i21;
                                    s3 = (short)i;
                                    break;
                                }
                                i24 += (int)Test.fFld;
                                i24 += (i25 * s3);
                                Test.fFld = i23;
                                Test.iArrFld[i25 + 1][i25 + 1] -= i23;
                                i24 >>= i21;
                                Test.instanceCount += i21;
                            }
                            for (i27 = 1; i27 < 2; i27 += 3) {
                                i26 += (((i27 * i21) + Test.instanceCount) - Test.byFld);
                            }
                            Test.iArrFld[i23][(int)(l)] += (int)l;
                            for (i29 = 1; i29 < 2; i29++) {
                                Test.byFld += (byte)(i29 * i29);
                                s3 -= (short)319910778L;
                            }
                        }
                    } else if (Test.bFld) {
                        lArr1[(int)(l)][(int)(l)] -= Test.instanceCount;
                    }
                    break;
                case 92:
                    Test.instanceCount *= Test.instanceCount;
                    break;
                case 93:
                    i28 += -27382;
                    break;
                case 94:
                    s3 += (short)(l * l);
                case 95:
                default:
                    i24 = i;
                }
                break;
            case 20:
                Test.bFld = true;
                break;
            case 21:
                i26 -= -36537;
                break;
            case 22:
                i26 += (int)l;
                break;
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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
