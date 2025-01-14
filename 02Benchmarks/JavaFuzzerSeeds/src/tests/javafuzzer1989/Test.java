package tests.javafuzzer1989;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 07:00:16 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1810960762783054051L;
    public static int iFld=-15761;
    public static float fFld=2.220F;
    public static boolean bFld=false;
    public double dFld=-1.80389;
    public volatile byte byFld=-118;
    public static boolean bArrFld[][]=new boolean[N][N];
    public static double dArrFld[]=new double[N];
    public int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.bArrFld, true);
        FuzzerUtils.init(Test.dArrFld, 1.128379);
        FuzzerUtils.init(Test.lArrFld, 5580485930359259133L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {


        Test.iFld = (int)Test.instanceCount;
        Test.iFld -= Test.iFld;
        Test.iFld = (int)Test.instanceCount;
        vMeth1_check_sum += 0;
    }

    public static void vMeth(int i3, float f) {

        boolean b=false;
        int i4=-6, i5=-141, i6=0, i7=13483, i8=5, i9=11, i10=-13, i11=8;
        double d=-11.122365;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 6252828502741269843L);

        b = Test.bArrFld[(-137 >>> 1) % N][(i4 >>> 1) % N];
        Test.instanceCount -= (i3--);
        vMeth1();
        for (i5 = 145; i5 > 4; --i5) {
            byte by1=-102;
            switch (((i5 % 8) * 5) + 85) {
            case 113:
                switch (((i5 % 1) * 5) + 90) {
                case 92:
                }
                Test.iFld = by1;
                for (i7 = 11; 1 < i7; i7--) {
                    lArr[i5 + 1] >>= Test.iFld;
                }
            case 104:
                d -= 0.26495;
                i3 += (i5 + i7);
                break;
            case 108:
                for (i9 = i5; i9 < 11; ++i9) {
                    Test.iFld ^= 23664;
                    i6 = (int)Test.instanceCount;
                    d += i3;
                }
            case 91:
                Test.dArrFld = Test.dArrFld;
                break;
            case 105:
                i6 = -53778;
                break;
            case 98:
                i8 >>= 11;
                break;
            case 123:
                i11 = i9;
            case 99:
                d *= -10235;
                break;
            default:
                i8 *= Test.iFld;
            }
        }
        vMeth_check_sum += i3 + Float.floatToIntBits(f) + (b ? 1 : 0) + i4 + i5 + i6 + i7 + i8 +
            Double.doubleToLongBits(d) + i9 + i10 + i11 + FuzzerUtils.checkSum(lArr);
    }

    public int iMeth(int i1, byte by, int i2) {

        int i12=4, i13=-100, i14=88, i15=-113, i16=12, i17=10, i18=-53049;
        short s=24288;

        vMeth(i2, Test.fFld);
        for (i12 = 8; i12 < 135; i12++) {
            i14 = 1;
            while (++i14 < 12) {
                for (i15 = 1; i15 < 1; i15++) {
                    Test.instanceCount >>>= i1;
                    i2 = i15;
                    Test.instanceCount = i13;
                    i2 = i1;
                    i2 = 3;
                    s >>= (short)Test.instanceCount;
                }
                if (Test.bFld) continue;
                for (i17 = 1; 1 > i17; i17++) {
                    Test.instanceCount <<= i2;
                    i2 -= (int)dFld;
                    i16 = i15;
                }
            }
        }
        long meth_res = i1 + by + i2 + i12 + i13 + i14 + i15 + i16 + s + i17 + i18;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-5, i19=8, i20=-219, i22=149, i23=1, i24=-3117;
        float f1=0.261F;
        long l=71L;

        i -= (Math.max((int)(-14 * (Test.instanceCount + i)), i++) + Math.max(iMeth(20661, byFld, Test.iFld), i));
        Test.instanceCount = Test.iFld;
        Test.iFld = (int)Test.instanceCount;
        i *= (int)Test.fFld;
        for (i19 = 6; 140 > i19; i19++) {
            i20 -= 14;
            try {
                Test.iFld = (-44758 % Test.iFld);
                i = (iArrFld[i19] % -1363237291);
                i = (-47300 % i20);
            } catch (ArithmeticException a_e) {}
            i = i20;
            switch (((i19 % 2) * 5) + 66) {
            case 68:
                for (f1 = 2; f1 < 187; ++f1) {
                    for (i23 = i19; 2 > i23; i23++) {
                        if (Test.bFld) break;
                        i24 += (int)l;
                        switch ((int)((f1 % 8) + 100)) {
                        case 100:
                            dFld *= Test.iFld;
                            switch ((((87 >>> 1) % 2) * 5) + 113) {
                            case 123:
                                iArrFld[i23] -= Test.iFld;
                                try {
                                    iArrFld[(int)(f1 - 1)] = (i19 % i20);
                                    i = (i22 % i22);
                                    iArrFld[(int)(f1 - 1)] = (57384 / i19);
                                } catch (ArithmeticException a_e) {}
                                Test.fFld = i20;
                                Test.instanceCount <<= i20;
                                break;
                            case 122:
                                byFld += (byte)(i23 | i24);
                                break;
                            }
                            break;
                        case 101:
                            dFld = Test.iFld;
                            dFld *= l;
                            Test.lArrFld = Test.lArrFld;
                            break;
                        case 102:
                            if (Test.bFld) continue;
                            switch (((i19 % 1) * 5) + 37) {
                            case 42:
                            default:
                                switch (((89 >>> 1) % 2) + 17) {
                                case 17:
                                    i20 = (int)dFld;
                                    iArrFld[(int)(f1 - 1)] += (int)f1;
                                    Test.iFld += i19;
                                case 18:
                                    Test.iFld *= i19;
                                    break;
                                }
                            }
                        case 103:
                            Test.instanceCount += (i23 * i23);
                            break;
                        case 104:
                            i = i24;
                            break;
                        case 105:
                            i24 <<= (int)9213106028050928531L;
                            break;
                        case 106:
                            i += i23;
                            break;
                        case 107:
                            i22 = (int)l;
                            break;
                        default:
                            i20 += (int)(-2.861F + (i23 * i23));
                        }
                    }
                }
            case 71:
                i20 -= 39;
                break;
            default:
                l += (i19 + i20);
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
