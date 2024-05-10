package tests.javafuzzer2720;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 19:18:21 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2817338181L;
    public static boolean bFld=true;
    public static float fFld=16.854F;
    public static int iFld=185;
    public static short sFld=1576;
    public double dArrFld[][]=new double[N][N];
    public static volatile int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -5);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i9) {

        byte by=-23;
        int i10=-52775, i12=131, i13=126, i14=-9, i15=102;
        short s=-17438;
        float f1=1.76F;

        i9 -= 10;
        Test.instanceCount &= by;
        try {
            i9 += i10;
        }
        catch (UserDefinedExceptionTest exc2) {
            i10 = i10;
            i9 = i9;
            for (int i11 : Test.iArrFld) {
                for (i12 = 1; i12 < 4; ++i12) {
                    for (i14 = 2; 1 < i14; i14 -= 3) {
                        Test.iArrFld[i14 - 1] += i15;
                        Test.bFld = Test.bFld;
                        Test.instanceCount = i10;
                        i11 += s;
                        f1 -= Test.instanceCount;
                        Test.instanceCount -= i12;
                    }
                }
            }
        }
        catch (ArithmeticException exc3) {
            Test.iArrFld[(i14 >>> 1) % N] = i9;
        }
        vMeth1_check_sum += i9 + by + i10 + i12 + i13 + i14 + i15 + s + Float.floatToIntBits(f1);
    }

    public static void vMeth() {

        double d=79.106836;
        int i7=4, i8=41, i16=-14, i17=59499;
        long lArr1[][]=new long[N][N];

        FuzzerUtils.init(lArr1, -7170232598406685044L);

        if (Test.bFld) {
            for (d = 8; 174 > d; d++) {
                i8 = 10;
                do {
                    i7 = (int)(5059 - (Test.instanceCount--));
                    vMeth1(i7);
                    for (i16 = 1; i16 < 3; ++i16) {
                        i17 += i16;
                        Test.iArrFld[i16 - 1] = 5;
                        lArr1[(int)(d)][(int)(d - 1)] -= 6L;
                        if (Test.bFld) {
                            i7 += (((i16 * Test.instanceCount) + i8) - i8);
                            Test.fFld += i16;
                            i17 += (int)(0.22F + (i16 * i16));
                            i7 -= 7;
                        } else {
                            Test.fFld -= i7;
                        }
                    }
                } while ((i8 -= 3) > 0);
            }
        } else if (false) {
            i17 += i7;
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i7 + i8 + i16 + i17 + FuzzerUtils.checkSum(lArr1);
    }

    public int iMeth() {

        int i3=-10, i4=14, i5=6, i6=79, i18=3, i19=14185, i20=4, i21=-124;
        boolean b=true;
        float f=32.823F;
        double d1=-1.19278;
        short s1=-21395;

        i3 = 1;
        do {
            i4 += (int)(dArrFld[i3 - 1][i3 + 1]--);
        } while (++i3 < 301);
        for (i5 = 2; 356 > i5; i5++) {
            if (b) continue;
            i6 += (((i5 * i5) + Test.instanceCount) - f);
            vMeth();
        }
        i18 = 1;
        do {
            i6 <<= i5;
            i19 = 1;
            do {
                for (i20 = 1; i20 < 1; i20++) {
                    switch ((((Test.iFld >>> 1) % 2) * 5) + 16) {
                    case 25:
                        try {
                            Test.iArrFld[i18 + 1] = (230 / Test.iArrFld[i19]);
                            Test.iFld = (103 / i3);
                            i4 = (-549152462 / Test.iFld);
                        } catch (ArithmeticException a_e) {}
                        Test.bFld = Test.bFld;
                        break;
                    case 17:
                        Test.instanceCount += (((i20 * Test.fFld) + Test.instanceCount) - Test.instanceCount);
                        d1 = s1;
                    }
                }
            } while (++i19 < 13);
        } while (++i18 < 124);
        long meth_res = i3 + i4 + i5 + i6 + (b ? 1 : 0) + Float.floatToIntBits(f) + i18 + i19 + i20 + i21 +
            Double.doubleToLongBits(d1) + s1;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=66, i1=-76, i2=-8, i22=0, i23=-13, i24=-45781, i25=41735, i26=10, i27=-13, i28=11;
        byte by1=81;
        double d2=1.124354;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, -4L);

        Test.instanceCount *= (i * Test.instanceCount);
        for (i1 = 4; 177 > i1; ++i1) {
            i = (int)(--lArr[i1 + 1][i1 + 1]);
            if (iMeth() != by1) break;
            i += (i1 - Test.instanceCount);
            Test.fFld *= Test.instanceCount;
            Test.iFld -= i1;
        }
        Test.iArrFld[(42 >>> 1) % N] <<= (int)Test.instanceCount;
        for (i22 = 2; i22 < 273; i22++) {
            Test.instanceCount <<= Test.iFld;
        }
        Test.iFld = Test.sFld;
        for (i24 = 7; i24 < 213; ++i24) {
            for (i26 = 7; i26 < 122; ++i26) {
                d2 -= 153;
                i23 = i23;
                i28 = 2;
                while (--i28 > 0) {
                    if (Test.bFld) {
                        if (Test.bFld) break;
                    }
                    i2 = 21282;
                    Test.sFld = Test.sFld;
                    i25 = i;
                    Test.instanceCount += (((i28 * Test.instanceCount) + i28) - by1);
                    i23 += i23;
                    i = i1;
                    Test.instanceCount >>= i;
                    Test.iFld ^= (int)Test.instanceCount;
                    i23 -= (int)Test.instanceCount;
                }
                Test.fFld *= 46;
                i27 += i26;
            }
            i25 = (int)d2;
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
class UserDefinedExceptionTest extends RuntimeException {
    public int field;
}

//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}