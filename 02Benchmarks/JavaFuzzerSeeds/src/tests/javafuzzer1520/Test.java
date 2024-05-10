package tests.javafuzzer1520;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 22:03:40 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=6601L;
    public static int iFld=69;
    public static float fFld=-80.313F;
    public int iArrFld[]=new int[N];
    public static int iArrFld1[]=new int[N];
    public static volatile float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld1, -42);
        FuzzerUtils.init(Test.fArrFld, 88.962F);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i3, int i4, int i5) {

        int i6=-49969, i7=-3, i8=101, i9=-14, i10=6, i11=-22253, i12=7;
        long l3=-7803545936991023915L, lArr[]=new long[N];
        boolean b=false;
        float f=0.989F;

        FuzzerUtils.init(lArr, 12134L);

        for (i6 = 2; 126 > i6; i6++) {
            for (l3 = i6; l3 < 13; l3++) {
                lArr[(int)(l3 + 1)] >>= l3;
                lArr[(int)(l3)] = i6;
                lArr[(int)(l3 - 1)] %= (l3 | 1);
            }
            Test.instanceCount -= l3;
            Test.iFld -= -44004;
            b = b;
            for (i9 = 1; i9 < 13; i9++) {
                for (i11 = 1; i11 < 2; i11++) {
                    i10 = i7;
                    Test.instanceCount = i4;
                    i7 = (int)l3;
                }
                Test.instanceCount -= (long)f;
                Test.iFld *= (int)-65446L;
            }
        }
        vMeth1_check_sum += i3 + i4 + i5 + i6 + i7 + l3 + i8 + (b ? 1 : 0) + i9 + i10 + i11 + i12 +
            Float.floatToIntBits(f) + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth(long l1, byte by) {

        int i1=0, i2=-244, i13=-43;
        long l2=1717017122L;
        short s=1673;
        double d=-69.1080, dArr1[][]=new double[N][N];

        FuzzerUtils.init(dArr1, 36.84136);

        for (i1 = 2; i1 < 155; ++i1) {
            l2 = 1;
            do {
                vMeth1(i1, i13, i2);
                Test.iFld *= i1;
                Test.iArrFld1[(int)(l2)] &= 180;
                i13 += (int)l1;
                dArr1[i1 + 1][i1 - 1] = i1;
                Test.iArrFld1[(int)(l2 - 1)] += (int)Test.fFld;
                i2 += (int)1883834135L;
                i13 >>= s;
                i2 += (int)(l2 * l2);
            } while (++l2 < 10);
            Test.iArrFld1[i1 - 1] *= (int)d;
            Test.fArrFld[i1 + 1] = i13;
            i13 = i13;
            try {
                Test.iArrFld1[i1] = (i2 / -28770);
                i13 = (i2 % 1853747426);
                i13 = (48850 % i2);
            } catch (ArithmeticException a_e) {}
        }
        long meth_res = l1 + by + i1 + i2 + l2 + i13 + s + Double.doubleToLongBits(d) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(long l) {

        int i=-131, i14=-101, i15=-24507;
        byte by1=7;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -1967856616668117092L);

        i = 1;
        do {
            short s1=3794;
            Test.iArrFld1[i - 1] = (int)(Math.abs(86 * iMeth(Test.instanceCount, by1)) * -4927367747559783763L);
            lArr1[i] >>= i;
            Test.instanceCount += i;
            Test.iFld *= Test.iFld;
            s1 += (short)i;
            l += (i - Test.iFld);
            Test.iFld *= i;
            for (i14 = i; i14 < 9; ++i14) {
                i15 += i14;
                try {
                    Test.iArrFld1[i - 1] = (2009736434 % Test.iArrFld1[i + 1]);
                    i15 = (i15 % 445588216);
                    Test.iArrFld1[i + 1] = (-1649643111 % i15);
                } catch (ArithmeticException a_e) {}
                Test.iFld >>= Test.iFld;
                Test.iArrFld1[i14 - 1] *= s1;
            }
            l += Test.iFld;
            lArr1[i - 1] += by1;
        } while (++i < 184);
        vMeth_check_sum += l + i + by1 + i14 + i15 + FuzzerUtils.checkSum(lArr1);
    }

    public void mainTest(String[] strArr1) {

        double d1=112.51359, dArr[]=new double[N];

        FuzzerUtils.init(dArr, -86.43401);

        Test.iFld -= (int)dArr[(Test.iFld >>> 1) % N];
        iArrFld = (iArrFld = (iArrFld = (iArrFld = FuzzerUtils.int1array(N, (int)-8))));
        Test.iFld += (int)(Test.instanceCount++);
        Test.iFld |= (iArrFld[(Test.iFld >>> 1) % N] ^= Test.iFld);
        vMeth(Test.instanceCount);
        Test.iArrFld1[(Test.iFld >>> 1) % N] = Test.iFld;
        Test.iFld *= (int)d1;
        Test.iFld -= Test.iFld;

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