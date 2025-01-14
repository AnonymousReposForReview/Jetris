package tests.javafuzzer641;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 07:14:50 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=5L;
    public boolean bFld=true;
    public static byte byFld=-15;
    public int iFld=4;
    public static long lArrFld[]=new long[N];
    public boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 126L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l1, int i2, long l2) {

        int i3=52021, i4=-177, i5=129, i6=61529, iArr[]=new int[N];
        double d=2.61311, dArr[]=new double[N];
        float f=-2.246F;

        FuzzerUtils.init(dArr, 61.119546);
        FuzzerUtils.init(iArr, -124);

        for (i3 = 6; i3 < 191; ++i3) {
            switch ((i3 % 2) + 80) {
            case 80:
                i4 -= (int)d;
                switch ((i3 % 2) + 41) {
                case 41:
                    i4 += (i3 * i3);
                    break;
                case 42:
                    iArr[i3 + 1] += (int)Test.instanceCount;
                    for (i5 = i3; i5 < 9; i5++) {
                        Test.lArrFld[i5] = -3502;
                        iArr[i3] -= i2;
                        iArr[i5 - 1] = i6;
                        f -= i4;
                        i2 <<= i4;
                        i4 >>= i3;
                    }
                    i2 += (i3 * i3);
                    iArr[i3] |= i5;
                }
                break;
            case 81:
                i6 += (int)(-3701223926L + (i3 * i3));
                break;
            default:
                iArr[i3] >>= i2;
            }
        }
        vMeth1_check_sum += l1 + i2 + l2 + i3 + i4 + Double.doubleToLongBits(d) + i5 + i6 + Float.floatToIntBits(f) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(long l) {

        int i7=14, iArr1[][]=new int[N][N];
        double d2=-57.80035;
        float f1=125.477F;

        FuzzerUtils.init(iArr1, -58719);

        vMeth1(l, i7, l);
        iArr1[(i7 >>> 1) % N][(i7 >>> 1) % N] += (int)d2;
        f1 *= l;
        vMeth_check_sum += l + i7 + Double.doubleToLongBits(d2) + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(iArr1);
    }

    public int iMeth(int i1, byte by) {

        double d3=5.55069;
        float f2=-25.364F;
        int i8=-38700, i9=6, i10=59704, i11=1;

        vMeth(Test.instanceCount);
        i1 = (int)1.111449;
        i1 = (int)2.342F;
        Test.lArrFld[(i1 >>> 1) % N] = i1;
        Test.instanceCount += (long)d3;
        f2 = -56.765F;
        for (i8 = 1; i8 < 193; ++i8) {
            Test.instanceCount -= i8;
            i1 += i8;
            bFld = bFld;
            for (i10 = 8; i8 < i10; i10--) {
                i11 -= i10;
                i9 += -102;
            }
            Test.instanceCount += (long)f2;
            i9 <<= i9;
        }
        long meth_res = i1 + by + Double.doubleToLongBits(d3) + Float.floatToIntBits(f2) + i8 + i9 + i10 + i11;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=0, i12=-131, i13=42524, i14=-191, i15=211, i16=-43, i17=52, iArr2[]=new int[N];
        short s=31907;
        float f3=61.133F;
        double dArr1[]=new double[N];

        FuzzerUtils.init(iArr2, 1726);
        FuzzerUtils.init(dArr1, -1.58673);

        i = ((iMeth(i, Test.byFld) - i) + -17);
        i ^= (int)Test.instanceCount;
        i = Test.byFld;
        for (i12 = 370; i12 > 23; i12--) {
            i14 = 1;
            do {
                for (i15 = 1; i15 < 1; ++i15) {
                    i13 >>= 22504;
                    Test.instanceCount = 6L;
                    s -= (short)i16;
                    i16 /= (int)(Test.instanceCount | 1);
                    iArr2[i12] *= (int)Test.instanceCount;
                    i13 += (int)Test.instanceCount;
                }
                i >>= i12;
                bArrFld[i14 + 1] = bFld;
                i16 += (i14 | i16);
                Test.byFld += (byte)i13;
                i13 = i16;
                Test.lArrFld = Test.lArrFld;
                f3 += 7090;
                i13 += i16;
            } while (++i14 < 73);
            iFld -= i;
            if (bFld) break;
            s = (short)i14;
            Test.byFld *= (byte)iFld;
            iArr2[i12 + 1] *= i15;
            i17 = 1;
            while (++i17 < 73) {
                i13 += (((i17 * i) + i15) - Test.instanceCount);
            }
            iFld -= i14;
        }
        bFld = bFld;
        Test.instanceCount = iFld;

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
