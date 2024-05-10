package tests.javafuzzer2543;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 16:26:39 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=9L;
    public static int iFld=-4;
    public static byte byFld=92;
    public static double dFld=-14.36862;
    public boolean bFld=false;
    public int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];
    public static int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, -84.300F);
        FuzzerUtils.init(Test.iArrFld1, -54);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        byte by=79;

        by *= (byte)1.544F;
        Test.iFld = (int)Test.instanceCount;
        vMeth2_check_sum += by;
    }

    public static void vMeth1() {

        float f1=-76.708F;

        f1 += Test.iFld;
        vMeth2();
        vMeth1_check_sum += Float.floatToIntBits(f1);
    }

    public static void vMeth() {

        int i1=-1, i2=3, i3=-114, i4=60000;
        boolean b=true;

        for (i1 = 9; i1 < 158; i1++) {
            vMeth1();
            if (b) break;
        }
        Test.instanceCount >>>= i1;
        Test.byFld -= (byte)-24821L;
        Test.dFld *= Test.byFld;
        if (b) {
            Test.iFld -= (int)6L;
        } else if (b) {
            i2 *= (int)Test.instanceCount;
        } else {
            Test.iFld *= i1;
        }
        Test.iFld /= -41394;
        for (i3 = 6; i3 < 253; ++i3) {
            i2 += i3;
            Test.fArrFld[i3] = Test.instanceCount;
            Test.iArrFld1[i3 + 1] <<= Test.iFld;
        }
        vMeth_check_sum += i1 + i2 + (b ? 1 : 0) + i3 + i4;
    }

    public void mainTest(String[] strArr1) {

        int i=-181, i5=32067, i6=1, i7=37202, i8=12, i9=-115, i10=37195, i11=-3854, i12=-42672, i13=-39880, i14=42589,
            i15=-6;
        float f=1.941F;
        double d=-1.53890;
        short s=-26011;
        long l=143L, lArr[]=new long[N];

        FuzzerUtils.init(lArr, -4L);

        iArrFld[(i >>> 1) % N] = (int)Test.instanceCount;
        f += (float)d;
        Test.instanceCount |= (((-4L * (s--)) + Test.instanceCount) + (-(iArrFld[(i >>> 1) % N]--)));
        i = Math.max((i ^ i) + i, i--);
        vMeth();
        f *= Test.instanceCount;
        lArr[(i5 >>> 1) % N] -= i5;
        Test.instanceCount = -224;
        Test.instanceCount >>= i5;
        for (i6 = 16; i6 < 338; ++i6) {
            for (i8 = 1; i8 < 78; ++i8) {
                f += Test.byFld;
                Test.instanceCount += (i8 * i8);
                for (i10 = 2; i10 > 1; i10--) {
                    i7 >>= i11;
                    lArr[i6 - 1] <<= 6;
                    Test.instanceCount = i8;
                    Test.instanceCount += (((i10 * i8) + i9) - l);
                }
                if (false) break;
            }
        }
        Test.instanceCount += -47570;
        i5 -= (int)Test.dFld;
        i7 += (int)Test.instanceCount;
        for (i12 = 209; i12 > 7; i12 -= 2) {
            Test.instanceCount += (i12 ^ Test.iFld);
            l = Test.instanceCount;
            for (i14 = 12; i14 < 248; ++i14) {
                i += (i14 * l);
                if (bFld) break;
                i11 = i5;
                Test.iArrFld1[i14 + 1] -= i11;
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
