package tests.javafuzzer1444;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 20:49:10 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=6L;
    public static volatile int iFld=-25;
    public static boolean bFld=false;
    public static volatile double dFld=2.23696;
    public static short sFld=-15293;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -61234);
        FuzzerUtils.init(Test.lArrFld, -18L);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static double dMeth(boolean b) {

        short s=25504;
        byte by=25;
        float f=116.38F;

        Test.iFld += s;
        by *= (byte)f;
        long meth_res = (b ? 1 : 0) + s + by + Float.floatToIntBits(f);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static int iMeth(long l) {

        int i=23467, i1=-4756, i2=-44, i3=-40, i4=12, i5=-11274, i6=128;

        i = 1;
        do {
            Test.iFld = (int)dMeth(Test.bFld);
            for (i1 = 1; i1 < 11; i1++) {
                for (i3 = 1; i3 < 2; ++i3) {
                    i2 += i2;
                    i4 = i4;
                    i2 = i1;
                }
                for (i5 = 1; i5 < 2; ++i5) {
                    i2 += (int)Test.dFld;
                    i2 += i6;
                    Test.iArrFld = FuzzerUtils.int1array(N, (int)-228);
                    i4 ^= (int)l;
                    Test.iArrFld[i5] += 23407;
                    try {
                        i6 = (i3 % -243);
                        Test.iArrFld[i1 - 1] = (Test.iFld / Test.iFld);
                        i6 = (Test.iArrFld[i1 - 1] % Test.iFld);
                    } catch (ArithmeticException a_e) {}
                    Test.sFld |= Test.sFld;
                }
            }
        } while (++i < 139);
        long meth_res = l + i + i1 + i2 + i3 + i4 + i5 + i6;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vSmallMeth() {

        double d=-2.37446;

        d = iMeth(Test.instanceCount);
        Test.iFld >>>= (int)Test.instanceCount;
        vSmallMeth_check_sum += Double.doubleToLongBits(d);
    }

    public void mainTest(String[] strArr1) {

        byte by1=0;
        int i7=17890, i8=-51859, i9=39256, i10=51619, i11=5, i12=-5995;
        float f1=1.889F;

        for (int smallinvoc=0; smallinvoc<795; smallinvoc++) vSmallMeth();
        Test.instanceCount -= Test.iFld;
        Test.iFld = by1;
        Test.iFld *= (int)Test.dFld;
        Test.iArrFld[(Test.iFld >>> 1) % N] = Test.iFld;
        i7 = 1;
        do {
            Test.dFld += Test.instanceCount;
            Test.lArrFld[i7 + 1] = 12;
            f1 = (float)Test.dFld;
            Test.instanceCount += i7;
            Test.iFld *= by1;
        } while (++i7 < 237);
        Test.iFld <<= (int)2570349006507681842L;
        f1 -= Test.iFld;
        for (i8 = 3; i8 < 142; ++i8) {
            for (i10 = 9; i10 < 180; i10++) {
                Test.dFld *= Test.instanceCount;
                by1 = (byte)i10;
                Test.iFld = i8;
                by1 += (byte)Test.instanceCount;
                i12 = 1;
                while (++i12 < 2) {
                    Test.instanceCount = 108;
                    i11 += (i12 + i11);
                    if (Test.bFld) continue;
                    i11 += (((i12 * i7) + by1) - i12);
                    Test.instanceCount += -7;
                    Test.iFld -= (int)-1.91672;
                    Test.dFld *= f1;
                    i9 = i9;
                    i9 -= (int)Test.instanceCount;
                }
                if (true) continue;
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  iMeth ->  iMeth vSmallMeth mainTest Test
//DEBUG  dMeth ->  dMeth iMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
