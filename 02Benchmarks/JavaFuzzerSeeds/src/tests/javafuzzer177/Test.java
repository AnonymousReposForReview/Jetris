package tests.javafuzzer177;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 23:20:21 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2482326122L;
    public static int iFld=174;
    public static float fFld=2.271F;
    public static volatile boolean bFld=true;
    public static long lArrFld[]=new long[N];
    public static float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -118L);
        FuzzerUtils.init(Test.fArrFld, -43.471F);
        FuzzerUtils.init(Test.iArrFld, -125);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(long l1) {

        int i4=12, i5=-3, i6=10, i7=-56041, iArr1[]=new int[N];
        float f1=-98.481F;

        FuzzerUtils.init(iArr1, 180);

        iArr1 = FuzzerUtils.int1array(N, (int)-24906);
        i4 = 1;
        while (++i4 < 240) {
            i5 = 1;
            while (++i5 < 7) {
                Test.iFld = i4;
                for (i6 = i5; 1 > i6; i6++) {
                    Test.iFld = i4;
                    Test.instanceCount = i7;
                    iArr1[i5] <<= i5;
                    Test.iFld += (int)l1;
                    Test.iFld += (i6 + i7);
                    Test.fArrFld[i6] *= -13L;
                    i7 += (((i6 * i4) + Test.iFld) - l1);
                    i7 -= i4;
                    f1 = Test.instanceCount;
                    if (true) break;
                }
            }
        }
        long meth_res = l1 + i4 + i5 + i6 + i7 + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1(int i3, byte by) {

        int i8=14, i9=3, i10=-5, i11=-5;
        boolean b=true, bArr[]=new boolean[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(dArr, 53.89258);

        lMeth(-3681994148645451857L);
        for (i8 = 12; i8 < 224; ++i8) {
            Test.iArrFld[i8] -= Test.iFld;
            if (b) {
                for (i10 = 1; 8 > i10; i10++) {
                    short s1=-14566;
                    i11 *= i10;
                    bArr = FuzzerUtils.boolean1array(N, (boolean)false);
                    Test.fFld += Test.iFld;
                    i3 = i9;
                    dArr[i10 - 1] = Test.instanceCount;
                    Test.iArrFld[i8 - 1] = s1;
                    s1 -= (short)i3;
                    i3 >>= 14258;
                }
            }
            Test.instanceCount = i9;
            Test.iFld += (i8 - i11);
        }
        vMeth1_check_sum += i3 + by + i8 + i9 + i10 + i11 + (b ? 1 : 0) + FuzzerUtils.checkSum(bArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth(int i, double d, long l) {

        float f=-65.324F;
        int i1=9218, i2=-23630, i12=-213, i13=-14828, i14=9, iArr[]=new int[N];
        short s=2686;
        byte by1=65;

        FuzzerUtils.init(iArr, 52380);

        Test.iFld *= (int)Math.abs((f * 56893) + (Test.iFld * 25668));
        for (i1 = 8; i1 < 241; ++i1) {
            f = (float)(((i1 * i2) * Math.abs(d)) + f);
            i = (i - (iArr[i1 - 1] + (i - i)));
            Test.instanceCount *= (Test.instanceCount * (--iArr[i1 + 1]));
            Test.lArrFld[(i1 >>> 1) % N] += s;
            vMeth1(i, by1);
            if (Test.bFld) break;
            try {
                i = (Test.iFld % -2076729118);
                i2 = (127 % i2);
                iArr[i1 - 1] = (-251 / Test.iFld);
            } catch (ArithmeticException a_e) {}
            Test.lArrFld[i1 - 1] = l;
            for (i12 = 7; i12 > 1; i12--) {
                i14 = 1;
                while (++i14 < 2) {
                    l += (i14 | i1);
                }
                f *= 2.1018F;
                i13 -= i;
            }
        }
        vMeth_check_sum += i + Double.doubleToLongBits(d) + l + Float.floatToIntBits(f) + i1 + i2 + s + by1 + i12 + i13
            + i14 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        double d1=0.97610, d2=-6.19206;
        int i15=81, i16=-117, i17=1, i18=-14, i19=-2, i20=16, i21=-2;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, 3824720446L);

        Test.iFld = (int)Test.instanceCount;
        vMeth(Test.iFld, d1, Test.instanceCount);
        Test.iArrFld[(Test.iFld >>> 1) % N] >>= 57181;
        Test.iArrFld[(10620 >>> 1) % N] = Test.iFld;
        Test.iFld += (int)Test.instanceCount;
        Test.iFld -= (int)Test.instanceCount;
        Test.instanceCount ^= -48L;
        Test.instanceCount = Test.iFld;
        for (i15 = 1; i15 < 308; i15++) {
            i16 -= (int)Test.instanceCount;
            Test.instanceCount = Test.instanceCount;
            Test.instanceCount += i15;
            Test.iFld += (i15 * i15);
            Test.fFld = Test.iFld;
            Test.iFld = Test.iFld;
            Test.fFld = Test.fFld;
        }
        Test.iFld += i16;
        for (d2 = 324; 1 < d2; --d2) {
            Test.instanceCount += (long)(((d2 * Test.iFld) + i17) - Test.iFld);
            for (i18 = 1; i18 < 78; ++i18) {
                i17 += (((i18 * Test.instanceCount) + i15) - Test.instanceCount);
                Test.iFld += (int)d1;
                Test.instanceCount *= 1001325396L;
                for (i20 = 1; i20 < 2; ++i20) {
                    Test.lArrFld = lArr[i20 - 1];
                    Test.instanceCount += i17;
                }
                i16 += (int)Test.instanceCount;
                Test.iFld += (int)-2584200518L;
            }
            i16 = 79;
            i19 *= -25096;
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
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}