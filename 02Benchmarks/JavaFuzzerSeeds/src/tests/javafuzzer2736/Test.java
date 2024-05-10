package tests.javafuzzer2736;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 19:41:20 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=26890L;
    public static volatile int iFld=-51792;
    public static byte byFld=120;
    public static int iFld1=5;
    public int iFld2=-11;
    public volatile int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 0L);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;

    public static int iMeth2(long l1, int i, int i1) {

        int i2=7, i3=-142, i4=14, i5=12, iArr[]=new int[N];
        double d=-76.86018;
        short s=16183;

        FuzzerUtils.init(iArr, -175);

        for (i2 = 8; i2 < 174; i2 += 2) {
            float f1=0.654F;
            boolean b=true;
            for (i4 = 1; i4 < 19; i4++) {
                i1 = Test.byFld;
                i5 = Test.iFld;
                i5 = (int)d;
                i1 = i5;
                i1 += (((i4 * i3) + Test.byFld) - l1);
            }
            iArr[i2 - 1] -= i2;
            i1 += (i2 * i2);
            d -= f1;
            i3 /= (int)(l1 | 1);
            if (b) {
                i5 += (i2 * i2);
            } else {
                s += (short)(i2 ^ Test.instanceCount);
                i1 += i3;
            }
        }
        long meth_res = l1 + i + i1 + i2 + i3 + i4 + i5 + Double.doubleToLongBits(d) + s + FuzzerUtils.checkSum(iArr);
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth1(long l) {

        float f=61.828F;

        f += Test.iFld;
        iMeth2(Test.instanceCount, Test.iFld, -42798);
        long meth_res = l + Float.floatToIntBits(f);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        int i7=127, i8=155, i9=6529, i10=0, iArr1[]=new int[N];
        short s1=30697;
        float f2=0.296F;
        boolean b1=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 57L);
        FuzzerUtils.init(iArr1, 5402);

        lArr[(50815 >>> 1) % N] = iMeth1(-8732890518855039605L);
        Test.iFld -= Test.iFld;
        Test.instanceCount = 73L;
        i7 = 312;
        while (--i7 > 0) {
            Test.iFld1 <<= s1;
            for (f2 = 1; f2 < 5; ++f2) {
                for (i9 = 2; i9 > 1; i9--) {
                    iArr1[i7] -= (int)Test.instanceCount;
                    Test.iFld *= Test.byFld;
                    Test.instanceCount = (long)105.877F;
                    Test.iFld1 <<= (int)Test.instanceCount;
                    b1 = b1;
                    iArr1[i7] += i10;
                }
                iArr1[(int)(f2)] += i9;
                i10 %= (int)(i9 | 1);
            }
        }
        long meth_res = i7 + s1 + Float.floatToIntBits(f2) + i8 + i9 + i10 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(lArr)
            + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i11=-238, i12=-14, i13=0, i14=-4, i15=14047, i16=35941, i17=-42125;
        boolean b2=false;

        Test.iFld += (iMeth() - Test.iFld1);
        iArrFld[(Test.iFld1 >>> 1) % N] = Test.iFld;
        for (i11 = 7; i11 < 234; i11++) {
            iFld2 -= iFld2;
            for (i13 = i11; 111 > i13; ++i13) {
                try {
                    i12 = (iArrFld[i11 - 1] % 2089586585);
                    i14 = (580550360 % i14);
                    Test.iFld = (-30549 % i13);
                } catch (ArithmeticException a_e) {}
                Test.lArrFld = Test.lArrFld;
                Test.instanceCount = Test.byFld;
                for (i15 = 1; i15 > 1; --i15) {
                    float f3=-2.738F;
                    if (b2) {
                        Test.iFld1 *= (int)Test.instanceCount;
                    } else if (false) {
                        Test.iFld1 *= i11;
                        if (b2) continue;
                    } else if (b2) {
                        iFld2 *= (int)-111.812F;
                        if (false) break;
                    } else {
                        Test.iFld1 *= (int)1.98423;
                        b2 = b2;
                        Test.iFld1 >>= i11;
                        f3 += (((i15 * Test.instanceCount) + Test.instanceCount) - i11);
                    }
                    i12 += (int)Test.instanceCount;
                    Test.instanceCount = 55608;
                    i12 += (i15 * i15);
                    switch ((i13 % 5) + 124) {
                    case 124:
                        Test.iFld1 -= (int)Test.instanceCount;
                        Test.iFld1 = i11;
                        Test.iFld *= 3493;
                        Test.iFld1 += i15;
                        break;
                    case 125:
                    case 126:
                        Test.iFld -= i17;
                        break;
                    case 127:
                        Test.instanceCount -= i13;
                        f3 += i12;
                        break;
                    case 128:
                        Test.iFld1 += (i15 * i15);
                        break;
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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  iMeth2 ->  iMeth2 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
