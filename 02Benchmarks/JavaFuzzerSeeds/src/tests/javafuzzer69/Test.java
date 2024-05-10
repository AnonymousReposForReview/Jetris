package tests.javafuzzer69;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 21:44:11 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-31462L;
    public static double dFld=15.8917;
    public static int iFld=-32421;
    public static volatile float fFld=-38.873F;
    public static float fFld1=-23.997F;
    public static boolean bFld=false;
    public static int iFld1=-103;
    public static int iArrFld[]=new int[N];
    public static boolean bArrFld[]=new boolean[N];
    public volatile float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 1);
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i6=65495, i7=17618, i8=-35049, i9=64, i10=-53517;
        boolean b=true;
        float f=0.18F;
        byte by=121;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)24268);

        i6 = 1;
        while (++i6 < 136) {
            for (i7 = 12; i7 > i6; --i7) {
                b = b;
                i8 >>= (int)-14L;
                if (b) continue;
                Test.instanceCount = 44673;
                f = (float)-18.92849;
                Test.iArrFld[(-35879 >>> 1) % N] = i7;
            }
            if (b) {
                i8 -= i8;
                for (i9 = i6; 12 > i9; i9++) {
                    i8 /= (int)(i9 | 1);
                }
                f -= by;
                Test.iArrFld[i6] >>>= -229;
                vMeth2_check_sum += i6 + i7 + i8 + (b ? 1 : 0) + Float.floatToIntBits(f) + i9 + i10 + by +
                    FuzzerUtils.checkSum(sArr);
                return;
            } else if (b) {
                Test.iArrFld[i6] += i9;
            } else {
                f = Test.instanceCount;
            }
        }
        vMeth2_check_sum += i6 + i7 + i8 + (b ? 1 : 0) + Float.floatToIntBits(f) + i9 + i10 + by +
            FuzzerUtils.checkSum(sArr);
    }

    public static void vMeth1(long l, double d, int i5) {

        int i11=128, i12=-2, i13=35947, i14=59;
        float f1=-5.499F;
        boolean b1=false;
        short s2=23990;

        vMeth2();
        for (i11 = 6; i11 < 251; ++i11) {
            i13 = 1;
            while (++i13 < 7) {
                f1 = i11;
                if (b1) break;
                Test.iFld = (int)l;
                i14 = 1;
                while (++i14 < 1) {
                    Test.dFld -= Test.instanceCount;
                    f1 *= 0L;
                    Test.instanceCount = l;
                    if (b1) {
                        Test.iFld = (int)Test.dFld;
                    } else if (true) {
                        s2 += (short)i13;
                        Test.instanceCount += i14;
                        vMeth1_check_sum += l + Double.doubleToLongBits(d) + i5 + i11 + i12 + i13 +
                            Float.floatToIntBits(f1) + (b1 ? 1 : 0) + i14 + s2;
                        return;
                    } else {
                        i5 += (int)(242L + (i14 * i14));
                    }
                }
            }
        }
        vMeth1_check_sum += l + Double.doubleToLongBits(d) + i5 + i11 + i12 + i13 + Float.floatToIntBits(f1) + (b1 ? 1
            : 0) + i14 + s2;
    }

    public void vMeth(int i3, int i4) {

        double d1=-1.55879, dArr[]=new double[N];
        boolean b2=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 8L);
        FuzzerUtils.init(dArr, -1.93657);

        vMeth1(Test.instanceCount, Test.dFld, i3);
        Test.instanceCount = Test.instanceCount;
        Test.instanceCount -= i4;
        d1 = 1;
        do {
            lArr[(int)(d1)] = Test.instanceCount;
            Test.iFld += Test.iFld;
            Test.fFld += (18203 + (d1 * d1));
            switch ((int)((d1 % 3) + 120)) {
            case 120:
                i4 += (int)90.509F;
                if (b2) {
                    i4 += (int)(d1 + i4);
                    Test.iFld += (int)d1;
                    dArr[(int)(d1)] = i3;
                    i3 += (int)(((d1 * Test.fFld1) + Test.fFld) - i4);
                } else if (false) {
                    Test.bArrFld[(int)(d1 + 1)] = b2;
                } else if (b2) {
                    Test.dFld = Test.fFld;
                }
                break;
            case 121:
                lArr[(int)(d1 - 1)] <<= i3;
                break;
            case 122:
                Test.instanceCount += Test.iFld;
                break;
            }
        } while (++d1 < 377);
        vMeth_check_sum += i3 + i4 + Double.doubleToLongBits(d1) + (b2 ? 1 : 0) + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i=92, i1=-8695, i2=44041, i15=38059, i16=36478, i17=-224, i18=9;
        short s=21430;
        long l1=7L, lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 151L);

        switch (((i >>> 1) % 2) + 67) {
        case 67:
            Test.iArrFld[(i >>> 1) % N] <<= (--Test.iArrFld[(i >>> 1) % N]);
            i *= (int)((long)((i * i) * (Test.dFld + Test.instanceCount)) << (++s));
            for (i1 = 18; i1 < 380; i1++) {
                vMeth(i2, Test.iFld);
                Test.iFld *= (int)Test.fFld;
                for (l1 = 3; l1 < 70; l1++) {
                    Test.fFld1 -= i1;
                    for (i16 = 1; i16 < 2; i16++) {
                        switch (((i1 % 1) * 5) + 98) {
                        case 99:
                            i17 += (int)(1.815F + (i16 * i16));
                            i17 *= (int)Test.dFld;
                            Test.instanceCount += (i16 * Test.instanceCount);
                            break;
                        default:
                            i15 += (i16 - Test.instanceCount);
                            i2 += i16;
                            i17 += i16;
                        }
                        Test.instanceCount *= i16;
                        if (false) {
                            lArr1[i1 + 1] /= (i1 | 1);
                            Test.iArrFld[i1] -= s;
                            if (Test.bFld) break;
                        } else {
                            Test.instanceCount += (((i16 * Test.iFld1) + Test.iFld1) - i);
                            Test.bFld = false;
                        }
                        switch (((i1 % 9) * 5) + 101) {
                        case 144:
                            i17 += i1;
                            i17 *= Test.iFld;
                            break;
                        case 109:
                            i15 *= i15;
                            Test.dFld -= i1;
                            fArrFld[i1 - 1] = -64605;
                            Test.fFld1 -= i1;
                            break;
                        case 130:
                            Test.fFld += (i16 + i);
                            break;
                        case 140:
                        case 123:
                            i2 <<= -193;
                            break;
                        case 118:
                            i18 = (int)Test.fFld;
                            break;
                        case 117:
                            Test.instanceCount = Test.instanceCount;
                            break;
                        case 122:
                            try {
                                i15 = (-65372 % Test.iFld1);
                                i17 = (Test.iArrFld[i1 + 1] % i16);
                                i = (i18 % Test.iArrFld[i1]);
                            } catch (ArithmeticException a_e) {}
                            break;
                        case 141:
                        default:
                            i18 *= (int)l1;
                        }
                    }
                }
            }
            break;
        case 68:
            i = (int)l1;
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
