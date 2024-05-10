package tests.javafuzzer1252;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 17:26:01 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-18706L;
    public static volatile int iFld=12;
    public static boolean bFld=false;
    public static int iFld1=51186;
    public static double dFld=-2.8833;
    public static byte byFld=88;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 104);
    }

    public static long bMeth_check_sum = 0;
    public static long bMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(double d) {

        int i5=-29318, i6=9, i7=198, i9=22977, i10=35373, i11=-13;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -4L);

        Test.iFld += 31554;
        for (long l1 : lArr) {
            Test.iFld -= 17676;
            Test.iArrFld[(-10 >>> 1) % N] -= (int)l1;
            Test.iArrFld[(Test.iFld >>> 1) % N] -= (int)d;
            d = Test.iFld;
            Test.bFld = Test.bFld;
            for (i5 = 1; i5 < 4; i5++) {
                int i8=-9;
                Test.bFld = Test.bFld;
                Test.instanceCount >>= i7;
                i6 = i5;
                i7 += (i5 - i8);
                for (i9 = 1; i9 < 2; i9 += 2) {
                    i11 += (int)d;
                    i6 += (i9 * Test.iFld1);
                }
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i5 + i6 + i7 + i9 + i10 + i11 + FuzzerUtils.checkSum(lArr);
    }

    public static boolean bMeth1(int i4) {

        int i12=-169, i13=0, i14=-5, i15=60167;
        long l2=-17269L, lArr1[]=new long[N];
        double d1=-76.36855;
        float f2=-122.359F;

        FuzzerUtils.init(lArr1, -5L);

        vMeth(Test.dFld);
        i4 += (int)Test.instanceCount;
        i4 = Test.iFld1;
        for (i12 = 11; i12 < 311; ++i12) {
            Test.iFld1 += Test.byFld;
            l2 = 1;
            do {
                Test.dFld = d1;
                f2 = Test.iFld;
                Test.instanceCount >>= l2;
                for (i14 = 1; i14 < 1; i14++) {
                    i15 = 0;
                    i13 *= i4;
                }
                i4 += (int)l2;
                Test.iArrFld[i12 + 1] >>= Test.iFld1;
                lArr1[(int)(l2 - 1)] = -110;
            } while (++l2 < 6);
        }
        long meth_res = i4 + i12 + i13 + l2 + Double.doubleToLongBits(d1) + Float.floatToIntBits(f2) + i14 + i15 +
            FuzzerUtils.checkSum(lArr1);
        bMeth1_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static boolean bMeth(long l) {

        int i=-1, i1=-226, i2=-46977, i3=-136;
        float f1=-38.224F, fArr[][]=new float[N][N];

        FuzzerUtils.init(fArr, 0.55F);

        Test.iFld = Test.iArrFld[(Test.iFld >>> 1) % N];
        Test.iArrFld[(Test.iFld >>> 1) % N] = (Test.iFld - (-Integer.reverseBytes(Test.iFld)));
        i = 1;
        do {
            for (i1 = 1; i1 < 17; i1++) {
                float f=0.63F;
                l += (i1 * f);
                for (f1 = 1; 2 > f1; f1 += 2) {
                    int i16=-145;
                    if (bMeth1(i16)) break;
                    i3 += (-2089 + (f1 * f1));
                    Test.dFld -= 2.348F;
                    Test.instanceCount = i2;
                    Test.iFld1 = (int)Test.dFld;
                    Test.byFld *= (byte)Test.dFld;
                    Test.iFld1 = i3;
                    fArr[i - 1][i] = 27742;
                    i2 = (int)Test.dFld;
                }
            }
        } while ((i += 3) < 279);
        long meth_res = l + i + i1 + i2 + Float.floatToIntBits(f1) + i3 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void mainTest(String[] strArr1) {

        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, true);

        bArr[(Test.iFld >>> 1) % N] = bMeth(Test.instanceCount);



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
//DEBUG  bMeth ->  bMeth mainTest
//DEBUG  bMeth1 ->  bMeth1 bMeth mainTest
//DEBUG  vMeth ->  vMeth bMeth1 bMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}