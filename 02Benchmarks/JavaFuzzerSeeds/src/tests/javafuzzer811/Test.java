package tests.javafuzzer811;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 10:21:05 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=1L;
    public static volatile int iFld=30537;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -9);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l, int i6, int i7) {

        short s=-13871;

        l -= s;
        vMeth1_check_sum += l + i6 + i7 + s;
    }

    public static int iMeth(int i3) {

        int i4=209, i5=-9, i8=10, i9=-205, i10=-61558, i11=-4;
        short s1=8186;
        float f1=-1.96F, fArr[]=new float[N];
        double d1=116.111959;
        boolean b=false;
        byte by=-59;

        FuzzerUtils.init(fArr, -98.882F);

        for (i4 = 1; i4 < 142; i4++) {
            vMeth1(Test.instanceCount, i4, i3);
            for (i8 = 1; 11 > i8; i8++) {
                for (i10 = i8; i10 < 2; i10++) {
                    Test.iArrFld[i10 - 1] ^= (int)Test.instanceCount;
                    try {
                        i5 = (i11 % i4);
                        Test.iArrFld[i4 - 1] = (-57317 / i9);
                        i11 = (i11 / 107);
                    } catch (ArithmeticException a_e) {}
                    fArr[i8] *= s1;
                    i11 += (((i10 * i9) + f1) - Test.instanceCount);
                    Test.iArrFld[i8] = (int)d1;
                    i9 -= i11;
                    i3 &= (int)Test.instanceCount;
                    Test.instanceCount = Test.instanceCount;
                }
                b = b;
                i3 += i8;
                by += (byte)(134 + (i8 * i8));
            }
        }
        long meth_res = i3 + i4 + i5 + i8 + i9 + i10 + i11 + s1 + Float.floatToIntBits(f1) +
            Double.doubleToLongBits(d1) + (b ? 1 : 0) + by + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i=7114, i2=55781, iArr[][]=new int[N][N], iArr1[]=new int[N];
        float f=-1.790F;
        double d=-2.13947;
        boolean b1=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 0);
        FuzzerUtils.init(lArr, 57881L);
        FuzzerUtils.init(iArr1, -113);

        i -= (int)(Math.min((int)(i -= (int)Test.instanceCount), (int)(i |= (int)Test.instanceCount)) - Math.abs(f +
            i));
        Test.instanceCount += (-(i & (18153 * (i++))));
        iArr[(i >>> 1) % N][(-188 >>> 1) % N] = (int)((++i) + (-(i + -56358L)));
        Test.instanceCount &= (long)((--d) + ((197 - f) - (lArr[(i >>> 1) % N] = Test.instanceCount)));
        for (int i1 : iArr1) {
            i2 = 1;
            do {
                Test.instanceCount += ((i++) - (--i1));
                i -= (int)((iArr[i2 - 1][i2 + 1] * (Test.instanceCount + 4944)) - ((i2 + Test.instanceCount) +
                    iMeth(i1)));
                Test.instanceCount = 209;
                try {
                    i1 = (i1 % -421128229);
                    i = (718532949 % i1);
                    i = (iArr1[i2 + 1] % 199);
                } catch (ArithmeticException a_e) {}
                iArr[i2][i2] = i2;
            } while (++i2 < 4);
            i1 += (int)Test.instanceCount;
            if (true) {
                Test.instanceCount |= i1;
                iArr[(100 >>> 1) % N][(i2 >>> 1) % N] *= i;
            } else {
                b1 = false;
            }
        }
        vMeth_check_sum += i + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i2 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        long l1=-2998754528923842204L, l2=-182L;
        float f2=-103.931F, fArr1[]=new float[N];
        int i12=-29375, i13=6, i14=-89, i15=178, i16=9, i17=230, i18=-1;
        byte by1=-2;
        double d2=2.76121;

        FuzzerUtils.init(fArr1, 2.654F);

        vMeth();
        Test.iFld += (int)Test.instanceCount;
        Test.instanceCount = Test.iFld;
        l1 = 210;
        do {
            Test.iFld |= Test.iFld;
            f2 += (((l1 * Test.iFld) + Test.iFld) - l1);
        } while (--l1 > 0);
        for (i12 = 11; i12 < 284; i12++) {
            Test.iFld = -102;
            Test.iArrFld[(i12 >>> 1) % N] = i13;
            Test.iFld += i12;
            for (i14 = 4; i14 < 92; i14++) {
                i13 /= (int)(i13 | 1);
                Test.iFld += (i14 * i14);
                fArr1[i14] = i13;
                switch ((i12 % 3) + 52) {
                case 52:
                    Test.instanceCount = -3666019278847302665L;
                    break;
                case 53:
                    by1 = (byte)Test.iFld;
                    break;
                case 54:
                    f2 = i14;
                    break;
                default:
                    i15 = 25;
                }
                i13 -= i13;
            }
            Test.iFld = i14;
            for (d2 = 5; d2 < 92; d2++) {
                i13 = (int)l1;
                Test.instanceCount += 51258L;
                i16 &= 8116;
                for (l2 = i12; l2 < 2; l2++) {
                    i16 += (int)l2;
                    Test.iArrFld[i12 - 1] += i14;
                    i18 <<= (int)l1;
                    Test.instanceCount >>>= Test.instanceCount;
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}