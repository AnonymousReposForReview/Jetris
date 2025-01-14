package tests.javafuzzer1891;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 05:27:27 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3866601785L;
    public static float fFld=1.689F;
    public static int iFld=-25834;
    public static short sFld=-28391;
    public byte byFld=97;
    public static int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -8);
        FuzzerUtils.init(Test.dArrFld, -1.65630);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static double dMeth(long l, int i6, long l1) {

        int i7=-240, i8=11, i9=-11, i10=81;
        boolean b=true;
        short s1=-15671;

        i6 *= (int)Test.instanceCount;
        for (i7 = 10; i7 < 211; ++i7) {
            Test.fFld += i7;
            i8 -= i8;
            i8 = i6;
            i8 = i7;
            b = b;
            for (i9 = 1; i9 < 8; ++i9) {
                s1 = (short)i10;
                if (b) {
                    i8 += (i9 - i8);
                }
            }
            i6 += i7;
            b = false;
            Test.iFld += (i7 - i7);
            s1 += (short)Test.fFld;
        }
        long meth_res = l + i6 + l1 + i7 + i8 + (b ? 1 : 0) + i9 + i10 + s1;
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth1(int i1) {

        int i2=52122, i3=-23223, i4=-192, i5=-32208;
        double d=53.48528;
        boolean b1=true;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-19803);

        i1 += (int)(-7L - i1);
        i2 = 1;
        do {
            for (i3 = 1; i3 < 7; ++i3) {
                Test.instanceCount += Math.max(-(Test.iArrFld[i3 - 1]++), Test.instanceCount--);
                i4 = (i1++);
                i5 = 1;
                do {
                    d = i4;
                    if (((dMeth(Test.instanceCount, i1, Test.instanceCount) - i5) < Test.iFld) != b1) {
                        try {
                            Test.iArrFld[i2 + 1] = (i3 % i3);
                            i1 = (i4 % Test.iArrFld[i3 + 1]);
                            Test.iArrFld[i2] = (i3 % Test.iArrFld[i3 + 1]);
                        } catch (ArithmeticException a_e) {}
                    } else {
                        d = i3;
                    }
                    Test.instanceCount += (i5 * Test.instanceCount);
                    Test.iFld += i5;
                    i4 >>= Test.iFld;
                    i1 >>= (int)Test.instanceCount;
                    sArr[i2 - 1] -= (short)17266L;
                } while (++i5 < 2);
            }
        } while (++i2 < 231);
        vMeth1_check_sum += i1 + i2 + i3 + i4 + i5 + Double.doubleToLongBits(d) + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(sArr);
    }

    public void vMeth(float f, int i, short s) {


        vMeth1(Test.iFld);
        Test.iArrFld[(Test.iFld >>> 1) % N] -= (int)f;
        vMeth_check_sum += Float.floatToIntBits(f) + i + s;
    }

    public void mainTest(String[] strArr1) {

        int i11=-1, i12=8, i13=-170, i14=14, i15=63457, i16=10, i17=-31762, i18=-34, i19=14;
        boolean b2=true;

        vMeth(-47.4F, Test.iFld, Test.sFld);
        for (i11 = 200; i11 > 9; i11--) {
            for (i13 = 4; 131 > i13; ++i13) {
                byFld += (byte)(((i13 * i14) + i12) - i12);
                Test.fFld += Test.instanceCount;
                Test.iArrFld[i13 + 1] *= (int)Test.instanceCount;
                for (i15 = i13; i15 < 2; i15++) {
                    i12 = i12;
                    Test.iArrFld[i11] += i14;
                    Test.iFld <<= i16;
                    Test.instanceCount >>= Test.iFld;
                }
                i12 = i14;
                Test.instanceCount -= i14;
                if (b2) {
                    Test.fFld += Test.fFld;
                } else {
                    i16 += (((i13 * byFld) + Test.sFld) - Test.fFld);
                    for (i17 = 2; 1 < i17; --i17) {
                        try {
                            Test.iFld = (i17 / Test.iFld);
                            i18 = (-1989659238 % i12);
                            i14 = (39145 % Test.iArrFld[i11]);
                        } catch (ArithmeticException a_e) {}
                        Test.iArrFld[i17 + 1] = Test.sFld;
                        Test.sFld >>= (short)Test.instanceCount;
                        i12 = i16;
                    }
                    Test.instanceCount += (((i13 * Test.instanceCount) + byFld) - i11);
                    i19 = 1;
                    do {
                        Test.instanceCount += i16;
                        Test.iArrFld[i19] = i14;
                        Test.instanceCount = Test.instanceCount;
                        i16 = i17;
                        Test.dArrFld = Test.dArrFld;
                        Test.iArrFld[i13 + 1] -= 0;
                        Test.instanceCount = i15;
                    } while (++i19 < 2);
                }
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  dMeth ->  dMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
