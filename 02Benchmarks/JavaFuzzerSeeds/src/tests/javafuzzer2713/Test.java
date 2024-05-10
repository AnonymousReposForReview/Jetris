package tests.javafuzzer2713;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 19:07:59 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1900279500355426140L;
    public int iFld=0;
    public int iFld1=3;
    public static volatile float fFld=-122.1001F;
    public static double dFld=1.112932;
    public static double dArrFld[]=new double[N];
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 47.7143);
        FuzzerUtils.init(Test.iArrFld, 14);
        FuzzerUtils.init(Test.lArrFld, -7L);
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i6=-197, i7=11, i8=-61021, i9=21, i10=98, i11=45689, i12=-5, i13=21, i14=62812, i15=-63;
        double d=35.102369;
        short s=-6924;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 0.128F);

        for (i6 = 9; i6 < 228; i6++) {
            Test.instanceCount = Test.instanceCount;
            Test.instanceCount -= i7;
            fArr[i6] += (float)d;
        }
        for (i8 = 130; i8 > 5; i8 -= 2) {
            d = i8;
            i7 += (((i8 * i7) + s) - i9);
            i7 += (((i8 * Test.instanceCount) + i8) - Test.fFld);
            for (i10 = 1; 25 > i10; i10++) {
                for (i12 = 1; i12 < 2; i12++) {
                    i7 = (int)60.15484;
                    try {
                        i9 = (i7 / i10);
                        i9 = (168 / Test.iArrFld[i8 + 1]);
                        i7 = (i13 % -41317);
                    } catch (ArithmeticException a_e) {}
                }
                for (i14 = i10; i14 < 2; i14++) {
                    Test.instanceCount += (i14 + Test.instanceCount);
                    i15 = s;
                }
            }
        }
        long meth_res = i6 + i7 + Double.doubleToLongBits(d) + i8 + i9 + s + i10 + i11 + i12 + i13 + i14 + i15 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i, int i1, int i2) {

        int i3=-180, i4=49, i16=-14, i17=21, i18=9;
        long l=634785544L, l1=8L;
        short s1=-1089, sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)9221);

        for (i3 = 1; i3 < 144; ++i3) {
            Test.lArrFld[i3] *= ((Math.min(5L, Test.instanceCount) - (i4 + i1)) - (iMeth() >> -49729));
            sArr[i3 + 1] += (short)i1;
            Test.fFld += 17464;
            for (i16 = 1; 11 > i16; ++i16) {
                i17 &= i2;
                for (l = 1; l < 2; l++) {
                    Test.dFld *= Test.dFld;
                    Test.iArrFld[i16 - 1] *= i4;
                    s1 = (short)-70;
                    Test.bArrFld[i3] = false;
                    i = (int)l1;
                    try {
                        i18 = (i / i);
                        i1 = (-382317645 / i1);
                        i18 = (80987593 / i4);
                    } catch (ArithmeticException a_e) {}
                    i17 >>= i18;
                    i17 *= (int)Test.instanceCount;
                }
            }
        }
        vMeth1_check_sum += i + i1 + i2 + i3 + i4 + i16 + i17 + l + i18 + s1 + l1 + FuzzerUtils.checkSum(sArr);
    }

    public void vMeth() {

        int i19=-1168, i20=41990, i21=-225, i22=6, i23=3;

        iFld = (int)(++Test.dArrFld[(iFld >>> 1) % N]);
        iFld = (iFld + iFld1);
        iFld = (iFld1++);
        vMeth1(140, 28548, iFld);
        for (i19 = 5; i19 < 184; i19++) {
            i21 = 1;
            do {
                try {
                    Test.iArrFld[i19] = (iFld1 / -14927);
                    i20 = (i21 / i19);
                    iFld = (131 / i21);
                } catch (ArithmeticException a_e) {}
            } while (++i21 < 9);
            i20 -= (int)109.86F;
            iFld1 = (int)Test.instanceCount;
            for (i22 = 1; i22 < 9; i22++) {
                i20 = i19;
                Test.iArrFld[(i21 >>> 1) % N] >>= i20;
                Test.instanceCount += (i22 - iFld);
                Test.iArrFld[i19 - 1] = 37;
                i23 = -13837;
            }
        }
        vMeth_check_sum += i19 + i20 + i21 + i22 + i23;
    }

    public void mainTest(String[] strArr1) {

        boolean b=true;
        short s2=19270;
        int i24=225, i25=-4, i26=6, i27=54700, i28=-5, i29=-60097, i30=14;
        double d1=-2.56076;

        vMeth();
        Test.iArrFld[(iFld >>> 1) % N] *= iFld1;
        Test.iArrFld[(iFld1 >>> 1) % N] += (int)Test.instanceCount;
        b = true;
        Test.instanceCount = iFld1;
        s2 += (short)-33229173L;
        for (i24 = 4; 205 > i24; ++i24) {
            i26 = 1;
            while (++i26 < 125) {
                iFld1 += (i26 + i24);
                Test.instanceCount *= Test.instanceCount;
                try {
                    iFld1 = (-70 % i25);
                    i25 = (1000201265 / iFld1);
                    i25 = (Test.iArrFld[i26 - 1] % 155);
                } catch (ArithmeticException a_e) {}
                iFld1 -= i25;
                if (b) continue;
                for (i27 = 1; 1 > i27; i27++) {
                    Test.instanceCount += i27;
                }
                s2 += (short)(((i26 * Test.instanceCount) + iFld) - Test.instanceCount);
            }
            i28 = i27;
            d1 = 1;
            do {
                iFld -= i27;
                for (i29 = 1; i29 > 1; --i29) {
                    iFld1 >>>= i30;
                    i28 += (i29 ^ iFld1);
                    i25 += (((i29 * i25) + Test.instanceCount) - i29);
                }
            } while (++d1 < 125);
        }
        i28 += 159;


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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
