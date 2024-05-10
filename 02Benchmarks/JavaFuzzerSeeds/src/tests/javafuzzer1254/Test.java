package tests.javafuzzer1254;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 17:31:05 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-4L;
    public int iFld=118;
    public static float fFld=53.706F;
    public static short sFld=1277;
    public static int iFld1=196;
    public static boolean bFld=true;
    public volatile byte byFld=-69;
    public static volatile int iArrFld[]=new int[N];
    public static float fArrFld[][]=new float[N][N];
    public static volatile boolean bArrFld[]=new boolean[N];
    public int iArrFld1[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 79);
        FuzzerUtils.init(Test.fArrFld, 2.60F);
        FuzzerUtils.init(Test.bArrFld, true);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i1=-26082, i2=47384, i3=-135;
        double d=-44.98497;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -3181696175L);

        i1 = 180;
        do {
            i2 = i2;
            i2 = i1;
            i2 += (int)(-12L + (i1 * i1));
        } while (--i1 > 0);
        Test.sFld = (short)i1;
        i3 = 1;
        do {
            i2 = i3;
            i2 = (int)25925L;
            i2 += i3;
            lArr[i3 - 1] = (long)Test.fFld;
            i2 = (int)Test.instanceCount;
        } while (++i3 < 325);
        d -= i3;
        Test.instanceCount += i2;
        i2 -= i2;
        Test.iArrFld[(i1 >>> 1) % N] += i2;
        vMeth1_check_sum += i1 + i2 + i3 + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth() {

        int i4=40362, i5=173, i6=10, i7=-123, i8=-224;

        vMeth1();
        Test.instanceCount >>= Test.iFld1;
        Test.iFld1 >>= Test.iFld1;
        Test.iFld1 = 6;
        Test.iFld1 *= (int)Test.instanceCount;
        Test.fArrFld[(Test.iFld1 >>> 1) % N][(Test.iFld1 >>> 1) % N] += Test.iFld1;
        Test.bFld = Test.bFld;
        Test.iArrFld[(Test.iFld1 >>> 1) % N] = Test.iFld1;
        Test.bArrFld[(Test.iFld1 >>> 1) % N] = Test.bFld;
        for (i4 = 4; 296 > i4; ++i4) {
            i6 = 1;
            do {
                for (i7 = 1; i7 < 1; ++i7) {
                    i5 = i7;
                    i8 += Test.iFld1;
                }
                i8 -= i4;
            } while (++i6 < 6);
        }
        vMeth_check_sum += i4 + i5 + i6 + i7 + i8;
    }

    public static int iMeth(int i) {


        vMeth();
        long meth_res = i;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i9=-26231, i10=225, i11=64520, i12=114, i13=1, i14=-13, i15=-38541, i16=12, i17=234, i18=-22973, i19=-8;

        iFld *= (int)(Test.fFld - -1.33037);
        iMeth(Test.iFld1);
        iFld = iFld;
        for (i9 = 5; i9 < 275; ++i9) {
            iFld >>= iFld;
            for (i11 = 5; i11 < 93; i11++) {
                i12 *= 47;
                for (i13 = 1; i13 < 2; i13++) {
                    i14 += (i13 | iFld);
                    Test.fFld = i11;
                    Test.instanceCount += i10;
                    i12 += (int)(2598814994L + (i13 * i13));
                    Test.instanceCount >>= Test.iFld1;
                    Test.instanceCount = i9;
                    Test.instanceCount = Test.iFld1;
                    Test.iFld1 = iFld;
                }
            }
            for (i15 = 2; 93 > i15; ++i15) {
                if (Test.bFld) {
                    Test.instanceCount = 15;
                    Test.iArrFld[i15 - 1] += byFld;
                    switch ((((i12 >>> 1) % 1) * 5) + 77) {
                    case 78:
                        Test.bFld = Test.bFld;
                        Test.fFld += i15;
                        Test.instanceCount += (i15 * i15);
                        for (i17 = 2; i17 > 1; i17 -= 2) {
                            iFld += (((i17 * Test.iFld1) + i11) - i10);
                            switch (((i17 % 3) * 5) + 38) {
                            case 50:
                                i16 += (((i17 * iFld) + Test.instanceCount) - Test.instanceCount);
                                Test.sFld = (short)Test.instanceCount;
                                iFld >>= (int)Test.instanceCount;
                            case 49:
                                Test.iArrFld[i9 - 1] -= i19;
                                break;
                            case 41:
                                Test.fArrFld[i15 - 1] = Test.fArrFld[i17 + 1];
                                break;
                            default:
                                iArrFld1[i9][i15 - 1] = (int)Test.instanceCount;
                            }
                        }
                        break;
                    default:
                        i12 |= (int)Test.instanceCount;
                    }
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}