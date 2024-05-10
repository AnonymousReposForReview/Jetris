package tests.javafuzzer2307;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 12:02:42 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=46403L;
    public static int iFld=2;
    public static short sFld=-6985;
    public static double dFld=-20.67321;
    public static boolean bArrFld[]=new boolean[N];
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.bArrFld, false);
        FuzzerUtils.init(Test.lArrFld, 0L);
        FuzzerUtils.init(Test.iArrFld, 118);
    }

    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long lMeth1_check_sum = 0;

    public static long lMeth(int i1, int i2) {


        Test.bArrFld = (Test.bArrFld = Test.bArrFld);
        long meth_res = i1 + i2;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static long lMeth1(long l2, float f2) {

        int i10=-120, i11=-10204, i12=12, i13=173;
        short s1=30337;

        Test.iFld += Test.iFld;
        for (i10 = 5; 385 > i10; ++i10) {
            Test.iFld -= Test.iFld;
            Test.iFld = (int)6278490969987476687L;
            for (i12 = i10; i12 < 4; i12++) {
                l2 <<= Test.iFld;
                s1 -= (short)27340;
                Test.instanceCount <<= i12;
                Test.instanceCount += (44L + (i12 * i12));
            }
        }
        long meth_res = l2 + Float.floatToIntBits(f2) + i10 + i11 + i12 + i13 + s1;
        lMeth1_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth1(int i7, int i8, int i9) {

        long l1=-52105L;
        float f3=-2.674F;
        int i14=-9, i15=2889, i16=11106, i17=5110;

        for (long l : Test.lArrFld) {
            l1 += lMeth1(Test.instanceCount, f3);
            for (i14 = 1; i14 < 4; ++i14) {
                Test.lArrFld[i14 + 1] -= i15;
                for (i16 = 2; i16 > i14; --i16) {
                    l1 = Test.sFld;
                    i17 = i16;
                    Test.iArrFld[i14 - 1] >>= i7;
                    i9 *= (int)f3;
                    Test.iFld &= i14;
                    if (Test.iFld != 0) {
                    }
                }
                try {
                    i9 = (Test.iArrFld[i14 - 1] % i14);
                    i9 = (i15 % i14);
                    Test.iFld = (481769385 / i7);
                } catch (ArithmeticException a_e) {}
                i8 = (int)Test.instanceCount;
                i8 = (int)78.5409;
                Test.dFld = i9;
            }
        }
        long meth_res = i7 + i8 + i9 + l1 + Float.floatToIntBits(f3) + i14 + i15 + i16 + i17;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        float f=-81.958F, f1=-126.901F, fArr[]=new float[N];
        double d=2.130345, d1=40.123391;
        int i=-5, i5=38418, i6=-52096, iArr[]=new int[N];
        short s=31223;

        FuzzerUtils.init(fArr, -29.459F);
        FuzzerUtils.init(iArr, -62);

        fArr[(Test.iFld >>> 1) % N] = (Test.iFld--);
        iArr[(Test.iFld >>> 1) % N] = (int)(((Test.iFld++) + fArr[(Test.iFld >>> 1) % N]) - ((f * Test.iFld) + (d +
            Test.iFld)));
        for (d1 = 240; 1 < d1; d1 -= 3) {
            switch ((int)(((d1 % 2) * 5) + 86)) {
            case 90:
                Test.iFld += (int)(((d1 * Test.iFld) + Test.instanceCount) - f);
                Test.iFld -= Test.iFld;
                break;
            case 93:
            }
            Test.instanceCount += (long)(d1 * d1);
            lMeth(Test.iFld, (int)(((f1 * f1) * (i * i)) + ((Test.iFld + Test.iFld) - (Test.instanceCount -
                Test.iFld))));
            if (Integer.reverseBytes(Math.abs(Test.iFld--)) <= (((i++) - (21788 / ((4665 - (-21723 % ((Test.iFld--) |
                1))) | 1))) * ((s + s) - (i >>> Test.instanceCount)))) break;
            iArr[(int)(d1 + 1)] ^= i;
        }
        i *= (int)(Test.instanceCount - i);
        for (int i4 : iArr) {
            for (i5 = 1; i5 < 4; i5++) {
                f1 = (iMeth1(i4, i6, i5) + Test.instanceCount);
                fArr[i5] *= Test.instanceCount;
            }
        }
        long meth_res = Float.floatToIntBits(f) + Double.doubleToLongBits(d) + Double.doubleToLongBits(d1) + i +
            Float.floatToIntBits(f1) + s + i5 + i6 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {


        Test.iFld *= iMeth();
        Test.iFld >>>= Test.sFld;



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
//DEBUG  lMeth ->  lMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  lMeth1 ->  lMeth1 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}