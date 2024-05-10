package tests.javafuzzer1579;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 23:13:27 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1L;
    public static short sFld=-5924;
    public static int iFld=3;
    public static byte byFld=-33;
    public static int iFld1=-4;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -214);
    }

    public static long lMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i, byte by) {

        int i1=-38733, i2=-8, i3=-187, i4=53438, i5=32, i6=-77, i7=-206;
        double d2=-34.96806;
        float f=0.844F;
        boolean b=true;

        for (i1 = 14; i1 < 384; ++i1) {
            for (d2 = 5; d2 > 1; d2 -= 2) {
                if (b) {
                    for (i4 = 1; i4 < 3; ++i4) {
                        i3 *= i;
                        Test.instanceCount += i4;
                        i2 += (((i4 * i5) + Test.iFld) - f);
                        i2 -= i2;
                        if (b) continue;
                        i2 += (int)(-2212909729L + (i4 * i4));
                    }
                    for (i6 = 3; i6 > 1; i6 -= 2) {
                        Test.instanceCount /= (Test.instanceCount | 1);
                        Test.iArrFld[i1 + 1] = i6;
                        if (false) break;
                        i5 >>= i2;
                    }
                }
            }
        }
        vMeth_check_sum += i + by + i1 + i2 + Double.doubleToLongBits(d2) + i3 + i4 + i5 + Float.floatToIntBits(f) + (b
            ? 1 : 0) + i6 + i7;
    }

    public static double dMeth() {

        double d1=-76.41220;
        boolean b1=false;
        float fArr1[]=new float[N];

        FuzzerUtils.init(fArr1, 14.397F);

        Test.iFld *= (int)(d1++);
        vMeth(6260, Test.byFld);
        for (float f1 : fArr1) {
            Test.sFld += (short)184;
            b1 = b1;
        }
        long meth_res = Double.doubleToLongBits(d1) + (b1 ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static long lMeth() {

        double d=-67.99605;
        int i8=-117, i9=13, i10=32444, i11=-35913, i12=-86, i13=-185, i14=-60043, i15=11;
        boolean b2=false;
        float f2=-5.176F, fArr[]=new float[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(fArr, 1.810F);
        FuzzerUtils.init(lArr, 14509L);

        d += ((--fArr[(Test.iFld >>> 1) % N]) % ((long)(dMeth()) | 1));
        try {
            for (i8 = 273; i8 > 3; i8--) {
                Test.iArrFld[i8 - 1] = (int)Test.instanceCount;
                Test.iFld = i9;
                for (i10 = 6; i10 > 1; --i10) {
                    Test.iFld += (i10 - i10);
                    Test.instanceCount += (((i10 * Test.byFld) + i9) - i9);
                    Test.iFld |= -219;
                    try {
                        Test.iFld = (Test.iArrFld[i8] % Test.iArrFld[i8 - 1]);
                        Test.iFld1 = (i12 / -22);
                        i9 = (Test.iFld1 % -36);
                    } catch (ArithmeticException a_e) {}
                    for (i13 = 1; 2 > i13; ++i13) {
                        if (b2) continue;
                        try {
                            Test.iArrFld[(Test.iFld >>> 1) % N] = (157 / Test.iFld1);
                            i15 = (i13 % -250);
                            Test.iArrFld[i10 + 1] = (Test.iArrFld[i10 + 1] % i15);
                        } catch (ArithmeticException a_e) {}
                        Test.iFld1 = (int)Test.instanceCount;
                        Test.iFld = (int)f2;
                    }
                }
            }
        }
        catch (NullPointerException exc1) {
            lArr = lArr;
        }
        finally {
            b2 = b2;
        }
        long meth_res = Double.doubleToLongBits(d) + i8 + i9 + i10 + i11 + i12 + i13 + i14 + (b2 ? 1 : 0) + i15 +
            Float.floatToIntBits(f2) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {


        Test.sFld ^= (short)Math.min(Test.instanceCount + (Test.instanceCount + Test.instanceCount), -21L + lMeth());


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
//DEBUG  dMeth ->  dMeth lMeth mainTest
//DEBUG  vMeth ->  vMeth dMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
