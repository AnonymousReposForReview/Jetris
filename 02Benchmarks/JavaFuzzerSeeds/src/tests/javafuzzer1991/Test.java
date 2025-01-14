package tests.javafuzzer1991;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 07:00:19 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-42329L;
    public static double dFld=2.118694;
    public static volatile boolean bFld=false;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 54);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f, int i5, int i6) {

        int i7=-235, i8=-237, i9=21737, i10=4, i11=0, i12=13;
        byte by=103;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, -4L);

        i5 >>= -118;
        i7 = 1;
        do {
            i5 = (int)Test.instanceCount;
            Test.iArrFld[i7] <<= (int)-1L;
            i5 = (int)-2L;
            for (i8 = 1; i8 < 5; i8++) {
                f -= i6;
                Test.instanceCount += Test.instanceCount;
                i10 = 1;
                do {
                    Test.iArrFld[i7 - 1] = i6;
                    lArr = lArr;
                    i9 = i10;
                } while (++i10 < 2);
                for (i11 = 1; i11 < 2; ++i11) {
                    i5 *= -1;
                    i12 += (((i11 * f) + i7) - by);
                }
            }
        } while (++i7 < 339);
        vMeth1_check_sum += Float.floatToIntBits(f) + i5 + i6 + i7 + i8 + i9 + i10 + i11 + i12 + by +
            FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i4) {

        float f1=0.735F;
        int i13=184, i14=-15281, i15=-46838, i16=-6, i17=65;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -2.58733);

        Test.iArrFld[(i4 >>> 1) % N] <<= (Test.iArrFld[(i4 >>> 1) % N]++);
        if (false) {
            vMeth1(f1, i4, i4);
            Test.instanceCount >>= 49722;
            i13 = 1;
            while (++i13 < 268) {
                dArr[i13] -= Test.instanceCount;
                i4 = i13;
            }
            for (i14 = 2; i14 < 398; i14++) {
                if (true) break;
                i4 = i15;
                Test.iArrFld[i14 - 1] -= i15;
                for (i16 = 1; i16 < 4; ++i16) {
                    Test.bFld = Test.bFld;
                    Test.instanceCount = (long)1.337F;
                    Test.instanceCount += i16;
                }
            }
        }
        vMeth_check_sum += i4 + Float.floatToIntBits(f1) + i13 + i14 + i15 + i16 + i17 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public long lMeth(long l) {

        int i1=43699, i2=24360, i3=-6735, i18=-9, i19=11, i20=-9;
        byte by1=27;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, false);

        Test.dFld = i1;
        for (i2 = 5; i2 < 206; ++i2) {
            i1 += Math.max(i3++, 10966);
            if (Test.bFld = bArr[i2 + 1]) break;
            vMeth(-13);
            l >>= i2;
        }
        Test.iArrFld[(218 >>> 1) % N] = 9;
        l += Test.instanceCount;
        for (i18 = 6; i18 < 133; ++i18) {
            i1 <<= 50805;
            i20 = 1;
            while (++i20 < 12) {
                by1 *= (byte)i19;
                Test.instanceCount += (((i20 * i1) + i20) - Test.instanceCount);
                i19 = (int)Test.instanceCount;
                by1 = (byte)i18;
            }
        }
        long meth_res = l + i1 + i2 + i3 + i18 + i19 + i20 + by1 + FuzzerUtils.checkSum(bArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=50805;

        i -= (int)(Test.dFld % (lMeth(Test.instanceCount) | 1));
        Test.instanceCount *= Test.instanceCount;



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
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
