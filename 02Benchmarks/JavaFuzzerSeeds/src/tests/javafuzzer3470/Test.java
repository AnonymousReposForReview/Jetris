package tests.javafuzzer3470;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 08:59:55 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-33225L;
    public static int iFld=-177;
    public static short sFld=5876;
    public static float fFld=-126.928F;
    public long lFld=-49174L;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 11);
        FuzzerUtils.init(Test.lArrFld, 3490157309L);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(double d) {

        int i3=-11, i4=-63, i5=62765, i6=18800, i7=14873;
        boolean b1=false;
        byte by=16;

        if (b1) {
            i3 = 200;
            while ((i3 -= 2) > 0) {
                switch ((i3 % 1) + 93) {
                case 93:
                default:
                    for (i4 = 1; i4 < 16; i4++) {
                        Test.iArrFld[i4] = Test.sFld;
                        if (b1) continue;
                        i5 -= i3;
                        Test.instanceCount += -112;
                    }
                    Test.sFld ^= by;
                }
                d -= 120;
                Test.iFld += i4;
                for (i6 = 1; i6 < 16; i6++) {
                    Test.iArrFld[i3 + 1] >>= (int)-72L;
                }
                if (i3 != 0) {
                    vMeth1_check_sum += Double.doubleToLongBits(d) + i3 + i4 + i5 + (b1 ? 1 : 0) + by + i6 + i7;
                    return;
                }
                Test.iFld += i3;
            }
        }
        vMeth1_check_sum += Double.doubleToLongBits(d) + i3 + i4 + i5 + (b1 ? 1 : 0) + by + i6 + i7;
    }

    public static void vMeth(long l) {

        short s=-25342;
        double d1=0.84366;
        int i8=52339, i9=-22910, i10=20975;
        boolean b2=false;

        Test.iArrFld[(Test.iFld >>> 1) % N] -= s;
        Test.iFld = (int)((Test.iFld *= (int)(Test.instanceCount++)) * ((l--) - (++Test.iFld)));
        vMeth1(d1);
        for (i8 = 376; 6 < i8; i8 -= 3) {
            i9 -= i8;
        }
        l += -221L;
        i10 = 1;
        while (++i10 < 322) {
            if (b2) {
                d1 -= Test.fFld;
                Test.iArrFld[i10 + 1] = i10;
                Test.fFld -= Test.iFld;
            } else if (b2) {
                l += (i10 ^ i9);
                i9 = i8;
                Test.instanceCount -= (long)d1;
            } else {
                d1 += -77;
            }
        }
        vMeth_check_sum += l + s + Double.doubleToLongBits(d1) + i8 + i9 + i10 + (b2 ? 1 : 0);
    }

    public static void vSmallMeth(int i2, boolean b) {


        vMeth(Test.instanceCount);
        vSmallMeth_check_sum += i2 + (b ? 1 : 0);
    }

    public void mainTest(String[] strArr1) {

        int i=-63962, i1=-163, i11=247, i12=-92, i13=-1396;
        boolean b3=true;
        double d2=0.56974, dArr[]=new double[N];
        byte by1=-47;

        FuzzerUtils.init(dArr, 1.58657);

        for (i = 11; i < 223; ++i) {
            i1 = i;
        }
        for (int smallinvoc=0; smallinvoc<468; smallinvoc++) vSmallMeth(i1, b3);
        Test.iArrFld[(i >>> 1) % N] = Test.iFld;
        i11 = 1;
        while (++i11 < 369) {
            i1 -= Test.iFld;
            i1 >>= Test.iFld;
            i12 = 1;
            do {
                for (d2 = i12; d2 < 1; d2++) {
                    dArr[i12] += -150;
                    i1 = i11;
                    Test.iFld = i;
                    Test.iFld += i;
                    Test.instanceCount += Test.sFld;
                    Test.iFld = i13;
                    Test.instanceCount += (long)(((d2 * Test.instanceCount) + i12) - i12);
                    i13 >>>= i12;
                    switch (((i11 % 1) * 5) + 42) {
                    case 45:
                        Test.fFld -= 28086;
                        i13 -= 24091;
                        Test.iArrFld[(int)(d2)] ^= Test.iFld;
                        Test.iFld += (int)(((d2 * i12) + i) - Test.iFld);
                        break;
                    default:
                        Test.iFld -= by1;
                        Test.fFld += (float)(((d2 * i11) + Test.sFld) - Test.instanceCount);
                        lFld += i11;
                        Test.iFld = i13;
                    }
                    Test.iFld += (int)(d2 * i13);
                }
            } while (++i12 < 68);
            i1 += i1;
            i13 |= (int)Test.instanceCount;
            i13 -= -240;
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
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  vMeth1 ->  vMeth1 vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
