package tests.javafuzzer3064;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 01:22:50 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=12L;
    public static short sFld=4940;
    public static volatile float fFld=-124.250F;
    public static int iFld=123;
    public volatile double dFld=35.53595;
    public byte byFld=63;
    public static int iArrFld[]=new int[N];
    public static int iArrFld1[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, -10);
        FuzzerUtils.init(Test.iArrFld1, -146);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth1(int i, long l) {

        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, false);

        bArr = (bArr = bArr);
        vMeth1_check_sum += i + l + FuzzerUtils.checkSum(bArr);
    }

    public static void vMeth2() {

        int i2=-217, i3=34, i4=11852, i5=-4;
        boolean b=true;
        double d1=0.35028;
        float f=64.543F;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, -8278648208491964192L);

        for (i2 = 5; i2 < 231; ++i2) {
            b = b;
            i3 <<= i3;
            i3 *= i2;
            for (i4 = 1; i4 < 7; ++i4) {
                Test.instanceCount += (i4 | i2);
                d1 = 1;
                do {
                    f = (float)d1;
                    lArr[i4][i4] = Test.sFld;
                    i5 += (12 + (d1 * d1));
                    i3 = i5;
                    i3 += -21463;
                    i5 <<= (int)3641172225L;
                } while (++d1 < 2);
                Test.instanceCount = 1555744912073323533L;
                lArr[i4][i2 + 1] += i2;
            }
        }
        vMeth2_check_sum += i2 + i3 + (b ? 1 : 0) + i4 + i5 + Double.doubleToLongBits(d1) + Float.floatToIntBits(f) +
            FuzzerUtils.checkSum(lArr);
    }

    public static float fMeth() {


        vMeth2();
        long meth_res = 0;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth() {

        int i1=18423, i6=-154, i7=10, i8=38406, i9=-58, i10=5, i11=101;
        double d=-1.69887, dArr[]=new double[N];
        boolean b1=true;

        FuzzerUtils.init(dArr, 6.124798);

        vMeth1((int)((Test.iArrFld[(i1 >>> 1) % N] - d) + (++i1)), (long)(((74.63774 * Math.max(i1, i1)) + i1) + (i1 +
            fMeth())));
        dArr[(i1 >>> 1) % N] = 168;
        for (i6 = 2; 244 > i6; ++i6) {
            Test.instanceCount &= i7;
            i1 >>>= i7;
            switch ((i6 % 2) + 88) {
            case 88:
                dArr[i6] -= -82L;
                Test.fFld *= Test.instanceCount;
                i1 += i6;
                for (i8 = i6; i8 < 7; i8++) {
                    for (i10 = 1; i10 < 1; ++i10) {
                        i7 += i10;
                        Test.instanceCount += (i10 * Test.instanceCount);
                        Test.iArrFld[i8] += Test.sFld;
                        if (b1) break;
                    }
                }
                break;
            case 89:
                i1 = i10;
                break;
            }
        }
        vMeth_check_sum += i1 + Double.doubleToLongBits(d) + i6 + i7 + i8 + i9 + i10 + i11 + (b1 ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i12=-4891, i13=13, i14=64582, i15=-232, i16=-1, i17=-1, i18=-14, i19=32435, i20=-1, i21=37;
        double d2=-101.100902, dArr1[]=new double[N];
        boolean b2=true;
        long lArr1[]=new long[N];

        FuzzerUtils.init(dArr1, -62.10529);
        FuzzerUtils.init(lArr1, 8403595800314899594L);

        vMeth();
        i12 += i12;
        if (b2) {
            d2 = 1;
            do {
                Test.iArrFld1 = Test.iArrFld1;
                i12 += (int)((long)d2 | (long)Test.fFld);
                for (i13 = 1; i13 < 108; ++i13) {
                    i12 -= (int)Test.instanceCount;
                    Test.instanceCount += i12;
                    for (i15 = i13; i15 < 2; ++i15) {
                        i14 = Test.iFld;
                        dArr1[i13 + 1] -= d2;
                        Test.instanceCount = Test.instanceCount;
                        Test.instanceCount += (i15 - Test.fFld);
                        lArr1[(int)(d2)] += 4762790526230481198L;
                    }
                    dFld += 3;
                    switch ((int)((d2 % 2) + 39)) {
                    case 39:
                        for (i17 = i13; i17 < 2; ++i17) {
                            i16 = (int)Test.instanceCount;
                            Test.instanceCount = i19;
                            Test.fFld += (((i17 * i13) + i12) - byFld);
                            i18 -= (int)Test.instanceCount;
                            try {
                                Test.iFld = (-35369 % i17);
                                Test.iArrFld1[i13 + 1][(int)(d2 + 1)] = (116 % Test.iArrFld[i17]);
                                i18 = (-53 % Test.iFld);
                            } catch (ArithmeticException a_e) {}
                            i14 = i19;
                        }
                        break;
                    case 40:
                        for (i20 = 1; i20 < 2; ++i20) {
                            Test.fFld += (((i20 * i15) + i13) - i14);
                            Test.instanceCount >>= byFld;
                            i19 -= byFld;
                            i21 += i16;
                            dArr1[i13 + 1] *= i14;
                        }
                    }
                }
            } while (++d2 < 233);
        } else {
            b2 = true;
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
//DEBUG  fMeth ->  fMeth vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 fMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}