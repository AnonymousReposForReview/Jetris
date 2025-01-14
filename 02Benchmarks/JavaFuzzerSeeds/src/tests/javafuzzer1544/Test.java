package tests.javafuzzer1544;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 22:25:23 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-6L;
    public int iFld=-50557;
    public static int iFld1=7;
    public static double dFld=-123.84946;
    public static short sFld=17469;
    public static volatile short sFld1=-18975;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -12L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l) {

        float f1=1.141F;
        int iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, -13953);

        iArr1[(Test.iFld1 >>> 1) % N] = Test.iFld1;
        Test.iFld1 = (int)1.634F;
        Test.iFld1 = (int)62877L;
        Test.lArrFld[(Test.iFld1 >>> 1) % N] += Test.iFld1;
        f1 -= 17139;
        vMeth1_check_sum += l + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth() {

        int i5=140, i6=9, i7=5, i8=8, i9=112, i10=41;
        float f2=54.272F;

        for (i5 = 2; i5 < 286; i5++) {
            vMeth1(Test.instanceCount);
            Test.iFld1 -= i6;
            Test.iFld1 += (int)Test.dFld;
            if (false) break;
            Test.sFld += (short)(5477198254571427644L + (i5 * i5));
            for (i7 = 1; i7 < 6; ++i7) {
                Test.iFld1 >>= (int)Test.instanceCount;
                Test.iFld1 = -8489;
                for (i9 = 1; i9 < 2; i9++) {
                    switch ((i9 % 2) + 108) {
                    case 108:
                    case 109:
                        Test.iFld1 ^= i5;
                        f2 = f2;
                        i8 += (((i9 * Test.sFld) + i9) - i6);
                    }
                    i8 += (i9 * Test.instanceCount);
                }
            }
        }
        vMeth_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + Float.floatToIntBits(f2);
    }

    public static int iMeth(int i, boolean b) {

        int i1=1, i2=49, i3=0, i4=170, i11=-131, i12=-25859, i13=231, iArr[]=new int[N];
        float f=91.448F, fArr[]=new float[N];

        FuzzerUtils.init(iArr, -16701);
        FuzzerUtils.init(fArr, -43.783F);

        i1 = 1;
        while (++i1 < 237) {
            iArr[i1 - 1] += (i1 * (i++));
            switch ((((((int)(i2 + -1.570F)) >>> 1) % 8) * 5) + 92) {
            case 125:
                i2 >>= (int)(((i2 + i2) + i1) * (fArr[i1]++));
                Test.instanceCount = (long)f;
                for (i3 = 1; i3 < 7; ++i3) {
                    vMeth();
                    try {
                        Test.iFld1 = (31 / i4);
                        Test.iFld1 = (3796 % iArr[i1]);
                        i = (i / iArr[i3]);
                    } catch (ArithmeticException a_e) {}
                    Test.iFld1 *= i1;
                    i2 += (int)(-41.259F + (i3 * i3));
                    iArr[i3 - 1] += (int)Test.instanceCount;
                    if (b) {
                        for (i11 = 2; i11 > 1; --i11) {
                            Test.iFld1 += (((i11 * i2) + i1) - Test.instanceCount);
                            i4 = Test.iFld1;
                        }
                    } else {
                        i -= Test.iFld1;
                    }
                }
                break;
            case 130:
                i13 = (int)-1L;
                break;
            case 103:
                fArr[i1 - 1] -= Test.instanceCount;
            case 100:
            case 117:
                iArr[i1] ^= i4;
                break;
            case 109:
                fArr[i1] -= 0.296F;
                break;
            case 114:
                i13 -= (int)32481L;
                break;
            case 120:
            }
        }
        long meth_res = i + (b ? 1 : 0) + i1 + i2 + Float.floatToIntBits(f) + i3 + i4 + i11 + i12 + i13 +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d=85.129924;

        d = (((++Test.lArrFld[(iFld >>> 1) % N]) * iMeth(Test.iFld1, false)) * Test.iFld1);
        iFld = iFld;
        Test.sFld1 -= (short)0L;



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
