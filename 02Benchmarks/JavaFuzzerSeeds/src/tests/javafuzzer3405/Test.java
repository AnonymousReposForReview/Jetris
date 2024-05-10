package tests.javafuzzer3405;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 07:31:09 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3285777140424322488L;
    public static short sFld=-28184;
    public static double dFld=0.24934;
    public static int iFld=180;
    public boolean bFld=true;
    public static volatile int iFld1=-1;
    public static long lArrFld[]=new long[N];
    public static short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -32885L);
        FuzzerUtils.init(Test.sArrFld, (short)-24387);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i3) {

        int i4=24, i5=-166, i6=11, i7=35482, i8=-5, i9=7, i10=-31207, i11=-219, i12=-126, iArr[]=new int[N];
        float f=-115.459F;
        boolean b=false;

        FuzzerUtils.init(iArr, 13);

        Test.dFld = Test.instanceCount;
        for (i4 = 19; 328 > i4; ++i4) {
            i5 = (int)-2638142837736045589L;
        }
        Test.iFld = 33;
        if (true) {
            Test.lArrFld[(i4 >>> 1) % N] = 51838;
            f -= 31369;
            for (i6 = 143; 8 < i6; i6--) {
                f -= -8856;
                for (i8 = i6; i8 < 12; ++i8) {
                    for (i10 = 1; i10 < 1; i10 += 3) {
                        if (b) break;
                        i12 += (int)(59713L + (i10 * i10));
                        Test.instanceCount += (((i10 * Test.instanceCount) + Test.instanceCount) - f);
                        try {
                            iArr[i8 + 1] = (i6 / -255);
                            i5 = (i3 / i6);
                            i3 = (-46516 % i12);
                        } catch (ArithmeticException a_e) {}
                    }
                }
            }
        } else {
            Test.instanceCount = Test.iFld;
        }
        long meth_res = i3 + i4 + i5 + Float.floatToIntBits(f) + i6 + i7 + i8 + i9 + i10 + i11 + (b ? 1 : 0) + i12 +
            FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i2) {

        int i13=-49501, i14=-67, i15=-98, i16=3, i17=-2480;
        boolean b1=true;
        float f1=64.46F, fArr[]=new float[N];
        short sArr[][]=new short[N][N];

        FuzzerUtils.init(fArr, 2.994F);
        FuzzerUtils.init(sArr, (short)15650);

        iMeth(i2);
        for (i13 = 15; i13 < 383; ++i13) {
            if (b1) continue;
        }
        Test.dFld -= Test.iFld;
        Test.iFld >>= (int)Test.instanceCount;
        i15 = 1;
        do {
            i16 = 1;
            do {
                Test.instanceCount <<= i2;
                i17 = 1;
                do {
                    Test.iFld = Test.iFld;
                    i2 |= Test.iFld;
                    fArr[i16] = i14;
                    sArr = FuzzerUtils.short2array(N, (short)-25595);
                    f1 += Test.instanceCount;
                    Test.iFld = i16;
                } while (++i17 < 1);
            } while (++i16 < 8);
        } while (++i15 < 192);
        vMeth1_check_sum += i2 + i13 + i14 + (b1 ? 1 : 0) + i15 + i16 + i17 + Float.floatToIntBits(f1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(sArr);
    }

    public static void vMeth(int i1) {

        double d=-30.102487, d1=-114.129883, dArr[]=new double[N];
        byte by=-56;
        float f2=1.478F;

        FuzzerUtils.init(dArr, -1.97478);

        i1 -= (int)(((--i1) + (i1 * Test.sFld)) - d);
        vMeth1(-9);
        d1 = 1;
        do {
            Test.iFld = (int)Test.instanceCount;
            dArr[(int)(d1 + 1)] = Test.instanceCount;
            Test.sFld += (short)(d1 * d1);
            Test.iFld = i1;
            Test.instanceCount = by;
            i1 += (-25363 + (d1 * d1));
        } while (++d1 < 231);
        Test.instanceCount -= (long)f2;
        i1 >>= Test.iFld;
        vMeth_check_sum += i1 + Double.doubleToLongBits(d) + Double.doubleToLongBits(d1) + by +
            Float.floatToIntBits(f2) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i=48605, i18=64723, i19=97, i20=40, i21=5, i22=62, i23=-57370, i24=138, iArr1[]=new int[N];
        long l=-6325L;
        float f3=127.991F;
        double d2=2.54186;

        FuzzerUtils.init(iArr1, 0);

        Test.instanceCount += -2;
        i = (i - i);
        vMeth(Test.iFld);
        for (i18 = 6; i18 < 239; ++i18) {
            for (i20 = i18; 108 > i20; i20++) {
                iArr1 = iArr1;
                Test.dFld = i18;
                l = 1;
                while (++l < 1) {
                    Test.instanceCount -= -51;
                    iArr1[(int)(l + 1)] = 23672;
                    Test.iFld &= 43712;
                    i19 = i20;
                    Test.sArrFld[i18 + 1] = (short)Test.iFld;
                    f3 += 82.342F;
                    Test.dFld += i20;
                    Test.sFld |= (short)l;
                    Test.iFld -= Test.iFld;
                    Test.instanceCount = i19;
                }
                i21 += (((i20 * Test.iFld) + Test.sFld) - i18);
                if (bFld) break;
                d2 = 1;
                do {
                    i21 += (int)d2;
                } while (++d2 < 1);
                iArr1[i18] += (int)l;
                for (i22 = 1; i22 < 1; i22++) {
                    Test.instanceCount *= -52869;
                    i19 >>= i22;
                }
            }
            i += (((i18 * Test.iFld1) + Test.instanceCount) - f3);
        }
        i24 = 1;
        while (++i24 < 217) {
            f3 -= Test.sFld;
            if (bFld) break;
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}