package tests.javafuzzer29;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 21:25:44 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3L;
    public static short sFld=32066;
    public double dFld=0.90251;
    public static volatile float fFld=-43.926F;
    public static int iArrFld[]=new int[N];
    public static volatile long lArrFld[][]=new long[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 50601);
        FuzzerUtils.init(Test.lArrFld, 651371559L);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth() {

        int i5=-1;

        i5 = (--i5);
        long meth_res = i5;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth1() {

        int i8=69, i9=-24, i10=14247, i11=0, i12=-29878, i13=0;
        double d=-2.59360;
        float f1=86.4F;

        for (i8 = 16; i8 < 345; i8 += 3) {
            for (i10 = 1; i10 < 14; ++i10) {
                Test.instanceCount = i11;
                try {
                    i9 = (-167 / Test.iArrFld[i8 - 1]);
                    i9 = (i10 % Test.iArrFld[i8 - 1]);
                    i9 = (-10712 % i8);
                } catch (ArithmeticException a_e) {}
                i9 += (int)Test.instanceCount;
            }
            i9 <<= i9;
            i11 -= (int)168L;
            Test.instanceCount = i9;
            i11 -= i9;
            d = 14;
            do {
                i11 *= i9;
                for (i12 = 1; i12 < 1; i12++) {
                    i9 = (int)f1;
                    Test.lArrFld[(int)(d)][i12 + 1] >>>= Test.sFld;
                    try {
                        i11 = (i8 / -46964);
                        Test.iArrFld[i12 - 1] = (Test.iArrFld[(int)(d + 1)] / -35591);
                        Test.iArrFld[i8 - 1] = (i10 / 11815);
                    } catch (ArithmeticException a_e) {}
                }
            } while (--d > 0);
        }
        long meth_res = i8 + i9 + i10 + i11 + Double.doubleToLongBits(d) + i12 + i13 + Float.floatToIntBits(f1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1() {

        int i6=-1, i7=-27, i14=-3, i15=-57580, i16=-19701, i17=-190;
        float f=90.546F;
        double d1=-5.56480;
        byte by=13;

        for (i6 = 7; i6 < 391; ++i6) {
            Test.instanceCount += (i6 ^ Test.instanceCount);
            f = (f + iMeth1());
            i7 = i6;
            Test.instanceCount = 233L;
            i7 += (i6 + i6);
            d1 = 1;
            while (++d1 < 4) {
                Test.iArrFld[i6] ^= i7;
                for (i14 = i6; i14 < 1; ++i14) {
                    i15 += (i14 + i7);
                    if (true) break;
                }
                i7 += Test.sFld;
                for (i16 = 1; i16 < 1; ++i16) {
                    Test.instanceCount += (111 + (i16 * i16));
                    Test.instanceCount >>= by;
                }
            }
        }
        vMeth1_check_sum += i6 + i7 + Float.floatToIntBits(f) + Double.doubleToLongBits(d1) + i14 + i15 + i16 + i17 +
            by;
    }

    public static void vMeth(int i4) {

        float f2=1.829F;
        int i18=-61065, i19=39359, i20=-232, i21=-36, i22=-192, i23=-9, i24=3;

        Test.iArrFld[(i4 >>> 1) % N] <<= iMeth();
        vMeth1();
        for (f2 = 9; 340 > f2; ++f2) {
            Test.iArrFld = Test.iArrFld;
            i19 += (int)(f2 * Test.instanceCount);
            i18 -= i4;
            for (i20 = 1; i20 < 5; ++i20) {
                Test.instanceCount = 7726;
                if (i18 != 0) {
                    vMeth_check_sum += i4 + Float.floatToIntBits(f2) + i18 + i19 + i20 + i21 + i22 + i23 + i24;
                    return;
                }
                i21 -= i4;
                i19 = i20;
                Test.sFld += (short)(((i20 * i22) + i21) - i4);
                for (i23 = 2; i23 > f2; i23--) {
                    if (true) break;
                    i24 = (int)3459L;
                }
            }
        }
        vMeth_check_sum += i4 + Float.floatToIntBits(f2) + i18 + i19 + i20 + i21 + i22 + i23 + i24;
    }

    public void mainTest(String[] strArr1) {

        int i=4, i1=-54956, i2=-208, i3=195, i25=-133, i26=8, i27=-207;
        byte by1=-87;
        boolean b=false, bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, true);

        for (i = 8; i < 180; i++) {
            switch (((i % 2) * 5) + 81) {
            case 90:
                for (i2 = 4; i2 < 146; ++i2) {
                    vMeth(i3);
                    for (i25 = 2; i25 > i2; --i25) {
                        switch ((i2 % 9) + 98) {
                        case 98:
                            i26 += (i25 * i25);
                            switch ((((19754 >>> 1) % 9) * 5) + 75) {
                            case 96:
                                Test.instanceCount += (((i25 * Test.sFld) + i3) - Test.instanceCount);
                                by1 += (byte)i25;
                            case 97:
                                Test.iArrFld[i + 1] |= (int)Test.instanceCount;
                                i26 += (i25 * i26);
                                bArr[i25] = b;
                                break;
                            case 78:
                                i3 <<= Test.sFld;
                                break;
                            case 109:
                                Test.sFld = (short)-53;
                                i3 -= i25;
                            case 95:
                                dFld += i25;
                                Test.instanceCount += i25;
                                Test.sFld = (short)Test.fFld;
                                i26 = (int)5223828920747936381L;
                            case 119:
                                Test.instanceCount >>= Test.instanceCount;
                                i26 = i;
                                break;
                            case 86:
                            case 101:
                                Test.lArrFld[i + 1][i2 - 1] = Test.instanceCount;
                                i1 += (i25 | i1);
                                break;
                            case 107:
                                Test.sFld = (short)Test.instanceCount;
                            }
                            break;
                        case 99:
                            dFld += Test.instanceCount;
                            i1 |= i3;
                            break;
                        case 100:
                            i1 -= i1;
                            Test.fFld += (((i25 * i1) + Test.fFld) - Test.fFld);
                            Test.instanceCount += i25;
                            break;
                        case 101:
                            Test.instanceCount += i25;
                            break;
                        case 102:
                            dFld *= Test.fFld;
                            break;
                        case 103:
                            i1 = i25;
                            break;
                        case 104:
                            Test.iArrFld[i25 - 1] *= i27;
                            break;
                        case 105:
                            i26 = i1;
                        case 106:
                            i27 = i3;
                            break;
                        }
                    }
                }
            case 86:
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
