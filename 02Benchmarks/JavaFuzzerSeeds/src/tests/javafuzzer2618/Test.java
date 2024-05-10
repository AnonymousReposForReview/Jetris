package tests.javafuzzer2618;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 17:31:45 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2816500594L;
    public int iFld=2;
    public int iFld1=135;
    public static float fFld=47.585F;
    public static volatile boolean bFld=true;
    public volatile int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -14L);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vSmallMeth(float f, short s) {

        int i=-52890;
        long lArr[]=new long[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(lArr, 35274L);
        FuzzerUtils.init(sArr, (short)-26128);

        lArr[(i >>> 1) % N] = (Math.min(i - 131, i = i) - (sArr[(i >>> 1) % N]++));
        i = Math.abs((int)(-(Test.instanceCount + 27533L)));
        vSmallMeth_check_sum += Float.floatToIntBits(f) + s + i + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(sArr);
    }

    public static void vMeth(double d1, int i8, int i9) {

        short s1=28945;
        byte by1=103;

        vSmallMeth(Test.fFld, s1);
        i8 = i8;
        by1 = (byte)6;
        i8 *= (int)Test.instanceCount;
        i9 += i8;
        vMeth_check_sum += Double.doubleToLongBits(d1) + i8 + i9 + s1 + by1;
    }

    public static int iMeth(double d, int i7, long l) {


        vMeth(d, i7, i7);
        i7 += i7;
        long meth_res = Double.doubleToLongBits(d) + i7 + l;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i1=8, i2=-9, i3=56341, i4=-3, i5=-3, i6=217, i10=-183, i11=53, i12=-105, i13=30, i14=-29902;
        byte by=116, byArr[]=new byte[N];
        double d2=-2.68773;
        short s2=4447;

        FuzzerUtils.init(byArr, (byte)85);

        for (int smallinvoc=0; smallinvoc<723; smallinvoc++) vSmallMeth((36.748F - Test.instanceCount) * iFld,
            (short)((Math.min(iFld, iFld1) - (1876684540419902765L - (--iFld1))) + (iArrFld[(iFld >>> 1) % N] +
            (Test.lArrFld[(iFld1 >>> 1) % N]--))));
        for (i1 = 10; i1 < 235; ++i1) {
            for (i3 = 112; 4 < i3; i3--) {
                Test.instanceCount += (((i3 * Test.instanceCount) + by) - Test.instanceCount);
                for (i5 = 1; i5 < 2; i5++) {
                    i6 /= (int)((54L * iMeth(d2, 57946, Test.instanceCount)) | 1);
                    iFld1 -= 184;
                    iArrFld[i1 + 1] += i3;
                    i2 <<= iFld;
                }
                Test.lArrFld[i1] -= i5;
                Test.fFld -= 7;
                iFld = i1;
            }
            byArr[i1 - 1] = (byte)i6;
            for (i10 = 3; 112 > i10; i10 += 3) {
                for (i12 = 1; 4 > i12; ++i12) {
                    Test.instanceCount >>= i5;
                    iArrFld[i12 - 1] -= i12;
                }
                i6 |= by;
                d2 -= iFld1;
                if (Test.bFld) continue;
                i14 = 1;
                while (++i14 < 4) {
                    int i15=209;
                    iArrFld[i1 - 1] *= iFld1;
                    i15 += (((i14 * Test.instanceCount) + s2) - i14);
                    iArrFld[i14] = 4091;
                    Test.fFld += (float)d2;
                }
                Test.instanceCount = i6;
                switch ((i10 % 1) + 22) {
                case 22:
                    if (Test.bFld) continue;
                    by -= (byte)iFld1;
                    iFld -= i5;
                default:
                    iFld1 = i4;
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test vMeth iMeth
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}