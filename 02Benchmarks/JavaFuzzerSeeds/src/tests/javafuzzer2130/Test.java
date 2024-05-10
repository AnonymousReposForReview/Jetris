package tests.javafuzzer2130;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 09:15:18 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=175L;
    public static int iFld=8;
    public static double dFld=-5.130877;
    public static byte byFld=-100;
    public static float fArrFld[][]=new float[N][N];

    static {
        FuzzerUtils.init(Test.fArrFld, -20.314F);
    }

    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(long l1, long l2, int i8) {


        Test.iFld = -49109;
        long meth_res = l1 + l2 + i8;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i4=140, i5=137, i6=-94, i7=13, i9=-4, i10=198, i11=-18452, iArr1[]=new int[N];
        float f1=0.986F;

        FuzzerUtils.init(iArr1, -161);

        for (i4 = 334; i4 > 4; i4 -= 3) {
            for (i6 = 1; i6 < 14; ++i6) {
                Test.iFld -= iArr1[i4];
                i5 -= (int)(Test.dFld *= (iMeth(-3777L, -2509777280L, 32179) - i6));
                i9 = 2;
                while (--i9 > 0) {
                    try {
                        i5 = (Test.iFld / -24);
                        iArr1[i4] = (i7 / -6564);
                        i5 = (27388 / i6);
                    } catch (ArithmeticException a_e) {}
                    f1 %= -180;
                    Test.byFld ^= (byte)i5;
                }
                switch ((i6 % 1) + 26) {
                case 26:
                    for (i10 = 1; i10 < 2; ++i10) {
                        boolean b=true;
                        Test.instanceCount >>= i9;
                        if (b) break;
                        Test.fArrFld[i10][i4 + 1] *= i10;
                        iArr1[i10] += i11;
                        Test.fArrFld[i6][i4] += i4;
                    }
                default:
                    Test.instanceCount += (((i6 * Test.instanceCount) + i6) - i11);
                }
            }
        }
        vMeth_check_sum += i4 + i5 + i6 + i7 + i9 + Float.floatToIntBits(f1) + i10 + i11 + FuzzerUtils.checkSum(iArr1);
    }

    public static double dMeth(int i1, long l, int i2) {

        int i3=-10523, iArr[]=new int[N];

        FuzzerUtils.init(iArr, -177);

        i1 -= (int)(-l);
        i3 = 1;
        do {
            Test.iFld >>= (Test.iFld - ((iArr[i3 + 1]++) & (--Test.iFld)));
        } while (++i3 < 149);
        vMeth();
        Test.dFld += i2;
        iArr[(239 >>> 1) % N] = Test.iFld;
        long meth_res = i1 + l + i2 + i3 + FuzzerUtils.checkSum(iArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-6;
        float f=121.892F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 58215L);

        lArr[(9 >>> 1) % N] >>= (long)(((i * f) / ((long)(dMeth(-33012, Test.instanceCount, Test.iFld)) | 1)) - 1.249F);
        i *= 48741;
        Test.fArrFld[(i >>> 1) % N][(Test.iFld >>> 1) % N] = i;


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
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  vMeth ->  vMeth dMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
