package tests.javafuzzer1436;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 20:34:32 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=0L;
    public int iFld=-7;
    public double dFld=2.105609;
    public static int iFld1=134;
    public static float fFld=-85.378F;
    public static int iFld2=-11;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[][]=new long[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 119);
        FuzzerUtils.init(Test.lArrFld, 1224116791L);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i1, int i2, short s) {

        int i3=8, i4=6, i5=-2920, i6=7, i7=-40301, i8=0, iArr[]=new int[N];
        float f=-1.902F;
        long l1=604770190L;

        FuzzerUtils.init(iArr, -39980);

        for (i3 = 19; i3 < 308; i3++) {
            Test.instanceCount += (((i3 * Test.instanceCount) + Test.instanceCount) - i1);
            i5 = 1;
            while (++i5 < 6) {
                i4 -= i2;
                f = i2;
                i4 += 39096;
                for (i6 = 1; i6 < 1; i6++) {
                    iArr[i5 - 1] += (int)2.555F;
                    if (i5 != 0) {
                        vMeth_check_sum += i1 + i2 + s + i3 + i4 + i5 + Float.floatToIntBits(f) + i6 + i7 + l1 + i8 +
                            FuzzerUtils.checkSum(iArr);
                        return;
                    }
                    i2 = Test.iFld1;
                    i2 ^= i6;
                    i1 *= i4;
                }
                for (l1 = 1; 1 > l1; l1++) {
                    i8 = i6;
                    i2 -= i3;
                }
            }
        }
        vMeth_check_sum += i1 + i2 + s + i3 + i4 + i5 + Float.floatToIntBits(f) + i6 + i7 + l1 + i8 +
            FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth1(int i, long l) {

        short s1=1730;
        int i9=14, i10=48290, i11=-54907, i12=-29040, i13=-141, i14=11;
        double d=0.123422;
        boolean b=true;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 2.223F);

        vMeth(Test.iFld1, 136, s1);
        Test.iFld1 = (int)Test.instanceCount;
        Test.instanceCount += s1;
        for (i9 = 9; 361 > i9; ++i9) {
            Test.iArrFld[i9 + 1] = i9;
            if (b) {
                for (i11 = 1; 5 > i11; ++i11) {
                    for (i13 = 1; 2 > i13; ++i13) {
                        i12 += i10;
                        i10 = i9;
                        d += 2972984460L;
                        i12 = i14;
                        fArr[i9 + 1] = Test.fFld;
                        i += (int)l;
                    }
                    i10 = i11;
                }
            } else {
                i10 = Test.iFld1;
            }
        }
        long meth_res = i + l + s1 + i9 + i10 + i11 + i12 + i13 + i14 + Double.doubleToLongBits(d) + (b ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        int i15=2, i16=8, i17=-46, i18=52583, i19=3707, i20=77, i21=211;
        double d1=-2.120654;
        boolean b1=true;

        Test.iFld1 += (int)(iMeth1(Test.iFld1, Test.instanceCount) + Test.fFld);
        for (i15 = 17; i15 < 286; ++i15) {
            i16 += (((i15 * i15) + i16) - i16);
            Test.instanceCount = Test.iFld2;
        }
        for (i17 = 18; i17 < 292; ++i17) {
            i16 += -156;
        }
        Test.instanceCount += (long)d1;
        i16 -= (int)Test.fFld;
        Test.iFld1 -= (int)Test.instanceCount;
        for (i19 = 1; i19 < 236; ++i19) {
            Test.fFld = -250;
            i21 = (int)78.176F;
            i18 += Test.iFld1;
            Test.instanceCount *= (long)d1;
        }
        b1 = b1;
        long meth_res = i15 + i16 + i17 + i18 + Double.doubleToLongBits(d1) + i19 + i20 + i21 + (b1 ? 1 : 0);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i22=-26226, i23=0, i24=-1, i25=162, i26=144, i27=46707, i28=141, i29=8, i30=-1, i31=-11, i32=-4, i33=110,
            i34=100, iArr1[][]=new int[N][N];
        double d2=6.117371;
        short s2=26237;
        boolean b2=true;
        byte by=109, byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-99);
        FuzzerUtils.init(iArr1, 0);

        iFld >>= (int)((--dFld) - iMeth());
        for (i22 = 9; i22 < 237; ++i22) {
            for (i24 = 110; i24 > 2; i24--) {
                iFld = i25;
            }
        }
        for (d2 = 8; d2 < 156; d2++) {
            if (b2) {
                for (i27 = 8; 169 > i27; i27++) {
                    for (i29 = 1; i29 < 2; ++i29) {
                        byArr[i29] *= (byte)i29;
                        Test.lArrFld[i27][i29 - 1] *= -141;
                        Test.iFld1 += i22;
                        i30 = i26;
                        s2 += (short)Test.instanceCount;
                        i25 = Test.iFld1;
                        i26 += (i29 * i29);
                        iArr1 = iArr1;
                    }
                }
                for (i31 = 4; i31 < 169; i31 += 2) {
                    Test.iFld2 += (20904 + (i31 * i31));
                    Test.iFld1 *= i29;
                    for (i33 = 3; 1 < i33; i33--) {
                        Test.instanceCount += (i33 - Test.instanceCount);
                        iArr1[i33 - 1][(int)(d2)] >>= (int)Test.instanceCount;
                        i25 += (i33 + i23);
                        if (b2) {
                            dFld = Test.instanceCount;
                            Test.fFld *= (float)d2;
                        } else {
                            i32 -= i34;
                            Test.iArrFld[(int)(d2)] += by;
                        }
                        Test.iFld2 *= i25;
                        i32 += (((i33 * i29) + i23) - iFld);
                    }
                }
            } else if (true) {
                s2 += (short)Test.fFld;
            } else if (true) {
                iArr1[(int)(d2)][(int)(d2 - 1)] += (int)-68.100014;
            } else {
                i32 += (int)((long)d2 | s2);
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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
