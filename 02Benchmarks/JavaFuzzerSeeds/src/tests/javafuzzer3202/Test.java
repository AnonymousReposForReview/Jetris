package tests.javafuzzer3202;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 03:48:06 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=111L;
    public static int iFld=-85;
    public static float fFld=-105.340F;
    public static short sFld=-25934;
    public static volatile int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -4);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        byte by=-67;
        double d=-1.63595, dArr1[]=new double[N];
        int i2=-40, i3=9498, i4=-8;

        FuzzerUtils.init(dArr1, -13.83124);

        by += (byte)Test.instanceCount;
        d = 1;
        do {
            i2 = 1;
            while (++i2 < 5) {
                for (i3 = i2; i3 < 1; i3 += 3) {
                    Test.fFld += (i3 - i4);
                    Test.iArrFld[(int)(d - 1)] >>= (int)Test.instanceCount;
                    i4 >>= (int)5875934610493597649L;
                    Test.instanceCount = Test.sFld;
                    Test.iArrFld[(int)(d + 1)] += i2;
                    Test.instanceCount += (i3 + Test.sFld);
                    Test.iFld %= (int)((long)(Test.fFld) | 1);
                    if (true) {
                        i4 = -169;
                    } else {
                        by += (byte)(i3 + Test.iFld);
                        dArr1[i2 + 1] = Test.iFld;
                    }
                }
            }
        } while (++d < 372);
        vMeth1_check_sum += by + Double.doubleToLongBits(d) + i2 + i3 + i4 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
    }

    public static int iMeth(int i, int i1) {

        byte by1=94;
        int i5=-7213, i6=-137, i7=42661;
        long l=-7L, lArr[]=new long[N];
        boolean b=false;
        double dArr[][]=new double[N][N];
        short sArr[]=new short[N];

        FuzzerUtils.init(dArr, 19.52124);
        FuzzerUtils.init(sArr, (short)4496);
        FuzzerUtils.init(lArr, 3026817373L);

        i1 = (int)dArr[(i >>> 1) % N][(i >>> 1) % N];
        vMeth1();
        sArr[(i >>> 1) % N] -= by1;
        Test.iFld -= (int)Test.instanceCount;
        Test.iArrFld[(i1 >>> 1) % N] += -21903;
        lArr[(53345 >>> 1) % N] <<= 59131;
        Test.instanceCount >>= i;
        Test.fFld += Test.iFld;
        Test.fFld = i1;
        Test.instanceCount <<= Test.iFld;
        Test.iArrFld[(i >>> 1) % N] -= (int)Test.instanceCount;
        for (i5 = 3; i5 < 227; i5++) {
            for (l = 1; l < 7; ++l) {
                dArr[(int)(l - 1)] = dArr[(i6 >>> 1) % N];
            }
            b = b;
        }
        long meth_res = i + i1 + by1 + i5 + i6 + l + i7 + (b ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(sArr) +
            FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i8=28626, i10=170, i11=209, i12=-21405, i13=43, i14=-9, i15=-176;

        Test.iFld *= iMeth(i8, i8);
        Test.instanceCount >>= i8;
        for (int i9 : Test.iArrFld) {
            for (i10 = 1; i10 < 4; i10++) {
                i9 -= (int)Test.instanceCount;
                Test.iArrFld = Test.iArrFld;
                i9 ^= Test.iFld;
            }
            Test.iArrFld[(12 >>> 1) % N] = i9;
            Test.sFld = Test.sFld;
            Test.iArrFld[(-20695 >>> 1) % N] = Test.iFld;
            for (i12 = 1; i12 < 4; ++i12) {
                for (i14 = 1; i14 < 2; ++i14) {
                    i8 /= 25460;
                    i11 -= Test.sFld;
                    i8 -= -8;
                }
            }
        }
        vMeth_check_sum += i8 + i10 + i11 + i12 + i13 + i14 + i15;
    }

    public void mainTest(String[] strArr1) {

        double d1=27.97820, d2=-2.95413, d3=1.72562, dArr2[]=new double[N];
        int i16=-8, i17=1, i18=-4458, i19=52347, i20=-11;

        FuzzerUtils.init(dArr2, 0.22272);

        vMeth();
        Test.instanceCount = Test.instanceCount;
        for (d1 = 7; d1 < 134; d1++) {
            Test.iFld = (int)Test.instanceCount;
            Test.instanceCount -= Test.sFld;
            for (i17 = 2; i17 < 197; i17++) {
                d2 = i18;
                Test.iFld += (int)(105.470F + (i17 * i17));
                Test.fFld = i17;
                i16 += (((i17 * i18) + Test.iFld) - Test.instanceCount);
                Test.iArrFld[i17 - 1] = Test.iFld;
                Test.iFld += (int)14L;
                Test.sFld += (short)(i17 | i16);
            }
            d3 = 1;
            do {
                if (true) continue;
                i18 += (int)(((d3 * Test.fFld) + Test.fFld) - Test.iFld);
                Test.instanceCount = Test.instanceCount;
            } while (++d3 < 197);
            Test.instanceCount >>= Test.instanceCount;
            i18 += (int)(d1 * Test.fFld);
            Test.iFld -= 21305;
            for (i19 = 4; i19 < 197; i19++) {
                Test.fFld += (i19 * i19);
                Test.iArrFld[i19 - 1] = (int)Test.instanceCount;
                dArr2[(int)(d1)] -= Test.instanceCount;
                Test.instanceCount *= Test.instanceCount;
                i18 = Test.iFld;
                i20 |= (int)Test.instanceCount;
                i16 -= (int)Test.instanceCount;
                i18 -= (int)Test.instanceCount;
            }
            i18 <<= -224;
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
