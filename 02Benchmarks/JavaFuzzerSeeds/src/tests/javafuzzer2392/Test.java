package tests.javafuzzer2392;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 14:05:35 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=46588L;
    public static double dFld=98.97922;
    public static float fFld=-99.673F;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -10);
        FuzzerUtils.init(Test.lArrFld, 71L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l3, int i3, int i4) {

        int i5=1, i6=-9, i7=-13, i8=7;
        boolean b1=false;
        short s1=5826;

        for (i5 = 21; 357 > i5; i5++) {
            if (b1) break;
            for (i7 = 1; i7 < 5; ++i7) {
                Test.dFld = Test.fFld;
                Test.dFld = Test.instanceCount;
                if (b1) break;
                if (i5 != 0) {
                    vMeth1_check_sum += l3 + i3 + i4 + i5 + i6 + (b1 ? 1 : 0) + i7 + i8 + s1;
                    return;
                }
            }
            Test.instanceCount -= Test.instanceCount;
            l3 += (i5 + i7);
            switch (((i5 % 4) * 5) + 51) {
            case 57:
                Test.iArrFld[i5] = i7;
                if (i4 != 0) {
                    vMeth1_check_sum += l3 + i3 + i4 + i5 + i6 + (b1 ? 1 : 0) + i7 + i8 + s1;
                    return;
                }
                break;
            case 54:
                i3 <<= i4;
                i8 -= (int)-2941917818L;
                i3 = i8;
                break;
            case 58:
                if (i5 != 0) {
                    vMeth1_check_sum += l3 + i3 + i4 + i5 + i6 + (b1 ? 1 : 0) + i7 + i8 + s1;
                    return;
                }
                break;
            case 61:
                i8 >>= i5;
                break;
            default:
                i3 = s1;
            }
        }
        vMeth1_check_sum += l3 + i3 + i4 + i5 + i6 + (b1 ? 1 : 0) + i7 + i8 + s1;
    }

    public static void vMeth(long l1, int i, float f1) {

        long l2=-4374L;
        short s=6427;
        int i1=-35408, i2=-15, i9=-43372, i10=14;
        boolean b2=false;

        l2 = 1;
        do {
            f1 *= ((long)(i += (int)(Test.dFld + Test.instanceCount)) & (Test.iArrFld[(int)(l2 - 1)]--));
            s = (short)-6;
            i -= (int)(Test.lArrFld[(int)(l2)] + (--Test.instanceCount));
            for (i1 = 6; i1 > 1; i1--) {
                i2 = i;
                vMeth1(-120L, i, i1);
                b2 = false;
                i9 = 1;
                while (++i9 < 2) {
                    l1 += i1;
                    Test.instanceCount += i9;
                    i10 <<= i2;
                    f1 += (i9 + i);
                    i10 -= (int)l2;
                }
                if (b2) break;
            }
        } while (++l2 < 280);
        vMeth_check_sum += l1 + i + Float.floatToIntBits(f1) + l2 + s + i1 + i2 + (b2 ? 1 : 0) + i9 + i10;
    }

    public static int iMeth(float f, long l, boolean b) {

        int i11=4, i12=-12, i13=-36403, i14=7, i15=-10;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 1.69551);

        vMeth(Test.instanceCount, i11, Test.fFld);
        dArr = dArr;
        Test.fFld += Test.instanceCount;
        i12 = 210;
        while (--i12 > 0) {
            i13 = 1;
            while (++i13 < 8) {
                i11 = i13;
                Test.instanceCount = i11;
                for (i14 = i12; i14 < 1; i14++) {
                    Test.instanceCount *= (long)Test.fFld;
                    i11 += i11;
                    i11 = i15;
                    f = (float)Test.dFld;
                    l = i13;
                    i15 = i15;
                    i11 = 94;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f) + l + (b ? 1 : 0) + i11 + i12 + i13 + i14 + i15 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i16=-20243, i17=-10;
        double d=-2.128125;

        Test.instanceCount += iMeth(Test.fFld, Test.instanceCount, true);
        Test.iArrFld[(i16 >>> 1) % N] += 21;
        Test.iArrFld[(i16 >>> 1) % N] += 4;
        i16 *= (int)Test.dFld;
        i16 = -244;
        i17 = 1;
        while (++i17 < 317) {
            Test.instanceCount = (long)d;
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
