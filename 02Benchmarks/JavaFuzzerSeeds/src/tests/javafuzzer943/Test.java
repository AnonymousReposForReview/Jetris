package tests.javafuzzer943;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 11:50:56 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=11L;
    public static float fFld=2.592F;
    public static volatile int iFld=-62733;
    public static byte byFld=-71;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -52454);
        FuzzerUtils.init(Test.lArrFld, 490702820337787063L);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vSmallMeth() {

        int i4=-14979;

        Test.fFld = ((i4--) / ((53823 * (i4++)) | 1));
        vSmallMeth_check_sum += i4;
    }

    public static void vMeth(int i7, long l, int i8) {

        double d=-1.1435;

        Test.iArrFld[(6568 >>> 1) % N] = (int)d;
        vMeth_check_sum += i7 + l + i8 + Double.doubleToLongBits(d);
    }

    public static int iMeth1() {

        int i6=-123, i9=-252, i10=12, iArr[]=new int[N];
        short s=27039;

        FuzzerUtils.init(iArr, 6);

        i6 = 1;
        do {
            vMeth(i6, Test.instanceCount, i6);
            Test.iFld -= 5;
            i9 = 1;
            do {
                i10 = 1;
                do {
                    Test.iFld = i6;
                    Test.iFld += Test.byFld;
                    Test.iArrFld[i6 - 1] = 51602;
                    Test.iFld -= Test.iFld;
                } while (++i10 < 1);
                iArr[i6 - 1] = 8;
                Test.fFld = -22.660F;
                Test.instanceCount += (i9 * i9);
                Test.iFld -= (int)-37583L;
                Test.instanceCount += (((i9 * i10) + Test.byFld) - Test.iFld);
                Test.fFld = s;
            } while (++i9 < 11);
        } while (++i6 < 149);
        long meth_res = i6 + i9 + i10 + s + FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth() {

        int i5=4, i11=29532, i12=171, i13=168, i14=9, i15=235, i16=52434, i17=-5;

        Test.lArrFld[(-171 >>> 1) % N] *= (((i5--) - (Test.instanceCount >> Test.instanceCount)) - iMeth1());
        for (i11 = 9; 233 > i11; ++i11) {
            Test.instanceCount *= Test.byFld;
            i5 <<= i5;
            Test.fFld = 87;
            i12 += i11;
            Test.iFld |= -10843;
            for (i13 = 1; i13 < 7; i13++) {
                for (i15 = i13; 2 > i15; ++i15) {
                    Test.iFld <<= (int)Test.instanceCount;
                    i14 ^= 13;
                    Test.iArrFld[i11] *= i17;
                    i16 += (int)Test.instanceCount;
                    Test.iFld = i5;
                    i12 += (((i15 * i14) + Test.instanceCount) - Test.fFld);
                }
            }
        }
        long meth_res = i5 + i11 + i12 + i13 + i14 + i15 + i16 + i17;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=39442, i1=14, i2=-226, i3=1, i18=-6, i19=1;
        byte by=64;
        double d1=56.44567, dArr[]=new double[N];
        boolean b=false;

        FuzzerUtils.init(dArr, 0.129866);

        for (i = 12; i < 306; ++i) {
            for (i2 = 86; i2 > 1; --i2) {
                for (int smallinvoc=0; smallinvoc<1; smallinvoc++) vSmallMeth();
                try {
                    i1 = (i / i2);
                    i3 = (1740981634 % i1);
                    i3 = (-43192 % Test.iArrFld[i2 + 1]);
                } catch (ArithmeticException a_e) {}
                Test.instanceCount -= (long)((Test.fFld++) - ((-(i3 - by)) - (i1++)));
                i1 = (int)(i - ((i1--) + Test.instanceCount));
                dArr[i + 1] += iMeth();
            }
            switch ((i % 2) + 102) {
            case 102:
                Test.iFld = Test.iFld;
                i3 >>>= i3;
                Test.iArrFld[i] += (int)d1;
                Test.iFld <<= 3;
                break;
            case 103:
                Test.fFld += (i * i);
                Test.instanceCount = (long)d1;
                i1 = i3;
                Test.lArrFld[i] = i1;
                break;
            default:
                d1 -= -5939L;
                i3 = i1;
                switch ((i % 1) + 105) {
                case 105:
                    Test.instanceCount = i2;
                    Test.instanceCount *= i1;
                    break;
                }
                Test.fFld -= i1;
            }
            i3 = i1;
            Test.instanceCount = Test.iFld;
            for (i18 = 4; i18 < 86; ++i18) {
                if (b) break;
                i1 = i3;
                d1 = i2;
                by <<= (byte)Test.instanceCount;
                by += (byte)i1;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
