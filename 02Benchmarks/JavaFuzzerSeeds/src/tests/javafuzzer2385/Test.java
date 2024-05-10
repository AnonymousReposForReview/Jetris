package tests.javafuzzer2385;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 13:58:56 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-83L;
    public static boolean bFld=true;
    public static float fFld=-2.10F;
    public static volatile double dFld=1.68655;
    public static int iArrFld[][]=new int[N][N];
    public static int iArrFld1[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -94);
        FuzzerUtils.init(Test.iArrFld1, -206);
        FuzzerUtils.init(Test.lArrFld, -3690246879L);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long bMeth_check_sum = 0;

    public static boolean bMeth(int i5, int i6) {


        i5 -= i5;
        long meth_res = i5 + i6;
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static int iMeth1(float f, int i, int i1) {

        int i2=226, i3=17096, i4=-10, iArr[]=new int[N];
        double d1=-2.13721;
        boolean b=true;
        long l=10828L, lArr[]=new long[N];

        FuzzerUtils.init(lArr, 5L);
        FuzzerUtils.init(iArr, -29921);

        for (i2 = 2; i2 < 197; ++i2) {
            switch (((i2 % 2) * 5) + 58) {
            case 65:
                i4 = 1;
                do {
                    d1 += lArr[i4 - 1];
                    if ((b = false) == bMeth(i4, i3)) continue;
                    i1 <<= (int)Test.instanceCount;
                    try {
                        i = (-89 / i3);
                        i = (i2 % -40373);
                        i3 = (iArr[i2] % 9095);
                    } catch (ArithmeticException a_e) {}
                    l = 1;
                    do {
                        byte by=-38;
                        f += by;
                        i3 = i4;
                    } while (++l < 1);
                    Test.instanceCount ^= 2;
                    Test.bFld = b;
                    i = (int)l;
                    i3 &= 0;
                } while (++i4 < 8);
                i1 *= -36;
                break;
            case 67:
                Test.instanceCount += i3;
                break;
            default:
                i3 = i;
            }
        }
        long meth_res = Float.floatToIntBits(f) + i + i1 + i2 + i3 + i4 + Double.doubleToLongBits(d1) + (b ? 1 : 0) + l
            + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        double d=99.12898;
        int i7=4, i9=185;
        short s=-3246;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -11L);

        d -= (iMeth1(Test.fFld, 14, i7) - Test.fFld);
        Test.iArrFld[(i7 >>> 1) % N][(i7 >>> 1) % N] |= i7;
        i7 += i7;
        i7 <<= -14;
        Test.fFld = (float)d;
        s -= (short)Test.instanceCount;
        for (int i8 : Test.iArrFld1) {
            Test.iArrFld[(i8 >>> 1) % N][(i7 >>> 1) % N] = 300;
            Test.instanceCount = Test.instanceCount;
            lArr1 = FuzzerUtils.long1array(N, (long)-10L);
            i7 -= (int)d;
            i8 = (int)13319L;
        }
        i9 = 387;
        do {
            i7 >>= i7;
            i7 = i7;
        } while (--i9 > 0);
        long meth_res = Double.doubleToLongBits(d) + i7 + s + i9 + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i10=230, i11=-227, i12=3, i13=11, i14=-64, i15=54683, i16=6, i17=-2, i18=-5, i19=31857, i20=-85;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -83.990F);

        iMeth();
        for (i10 = 5; i10 < 280; ++i10) {
            Test.bFld = Test.bFld;
            i11 -= 5;
            i11 += i11;
            for (i12 = i10; i12 < 91; i12++) {
                i11 = (int)-1.478F;
                if (Test.bFld) continue;
                switch (((i11 >>> 1) % 2) + 16) {
                case 16:
                    Test.bFld = Test.bFld;
                    if (Test.bFld) break;
                    Test.dFld = i12;
                    Test.instanceCount += i10;
                    break;
                case 17:
                    Test.instanceCount *= i11;
                    for (i14 = i10; i14 < 1; i14++) {
                        i15 += i14;
                    }
                    break;
                default:
                    if (Test.bFld) continue;
                    Test.instanceCount = i13;
                    for (i16 = 1; i16 < 1; i16++) {
                        fArr[i12] = Test.instanceCount;
                    }
                    i11 += i12;
                }
                Test.iArrFld1[i10 + 1] -= (int)-60.120562;
                i18 = 1;
                while (++i18 < 1) {
                    Test.instanceCount -= (long)Test.fFld;
                    Test.lArrFld = Test.lArrFld;
                }
                for (i19 = i10; i19 < 1; ++i19) {
                    Test.instanceCount += i12;
                }
            }
            Test.fFld *= 0.886F;
            i15 += (i10 * i10);
            Test.bFld = Test.bFld;
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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  bMeth ->  bMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}