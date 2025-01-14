package tests.javafuzzer72;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 21:49:25 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=225L;
    public static float fFld=-123.753F;
    public static double dFld=2.88246;
    public volatile int iFld=-14;
    public static int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -4);
        FuzzerUtils.init(Test.dArrFld, 0.15004);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i5) {

        short s=32404;
        int i6=-249, i7=-14183;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)95);

        s -= (short)i5;
        Test.fFld = 1;
        for (i6 = 4; i6 < 312; i6++) {
            Test.fFld += (i6 + i7);
            Test.instanceCount += (((i6 * i6) + Test.instanceCount) - i6);
            i7 += (((i6 * Test.instanceCount) + Test.fFld) - i5);
            i5 ^= i5;
            if (i6 != 0) {
                vMeth_check_sum += i5 + s + i6 + i7 + FuzzerUtils.checkSum(byArr);
                return;
            }
        }
        Test.iArrFld[(-53174 >>> 1) % N] *= (int)Test.instanceCount;
        i7 = s;
        i7 /= (int)(Test.instanceCount | 1);
        vMeth_check_sum += i5 + s + i6 + i7 + FuzzerUtils.checkSum(byArr);
    }

    public static int iMeth1(boolean b) {

        int i3=-37191, i4=4, i8=186, i9=-166, i10=-26833, i11=40595, i12=7, i13=2;
        float f=-20.398F;
        byte by1=-70;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 0.4728);

        for (i3 = 2; 328 > i3; ++i3) {
            f -= (--by1);
            vMeth(i4);
            for (i8 = 1; i8 < 5; ++i8) {
                for (i10 = i3; 2 > i10; ++i10) {
                    i11 >>= (int)Test.instanceCount;
                    i9 <<= (int)-8L;
                }
                i11 = i3;
                for (i12 = 1; i12 < 2; i12++) {
                    i4 = i11;
                    f = f;
                    try {
                        i13 = (Test.iArrFld[i8] / -23201);
                        i4 = (i10 % -20530);
                        i9 = (-59466 % Test.iArrFld[i8 - 1]);
                    } catch (ArithmeticException a_e) {}
                    Test.iArrFld[i3] = i10;
                    dArr[i12 + 1] *= i8;
                    Test.instanceCount += (long)1.110988;
                }
            }
        }
        long meth_res = (b ? 1 : 0) + i3 + i4 + Float.floatToIntBits(f) + by1 + i8 + i9 + i10 + i11 + i12 + i13 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(byte by, int i) {

        int i1=-129, i2=-132, i14=-236, i15=6197, i16=-4, i17=6902, i18=-11, iArr[]=new int[N];
        double d=2.47829;

        FuzzerUtils.init(iArr, -24415);

        for (i1 = 13; i1 < 228; i1++) {
            iArr[i1 + 1] = (i2 = (iMeth1(false) + i1));
            i2 += (((i1 * i) + i2) - i1);
            for (d = 1; d < 7; d++) {
                i2 %= -7918;
                Test.fFld += Test.fFld;
                Test.instanceCount += (long)d;
                i2 += (int)d;
            }
        }
        for (i15 = 9; i15 < 321; i15++) {
            for (i17 = 1; i17 < 5; i17 += 2) {
                if (i17 != 0) {
                }
                switch ((i15 % 2) + 18) {
                case 18:
                    if (i18 != 0) {
                    }
                case 19:
                    Test.dFld = Test.fFld;
                    break;
                }
                i2 -= (int)Test.instanceCount;
            }
        }
        long meth_res = by + i + i1 + i2 + Double.doubleToLongBits(d) + i14 + i15 + i16 + i17 + i18 +
            FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        byte by3=-10;
        int i19=-236, i20=12, i21=-3114, i22=61922, i23=1, i24=-23, i25=-6, i26=13, i27=0;
        short s1=-10516;

        iMeth(by3, i19);
        iFld += i19;
        i19 *= 11;
        Test.instanceCount <<= s1;
        i20 = 1;
        while (++i20 < 358) {
            i19 += 194;
            Test.instanceCount -= i19;
            i19 += i20;
            Test.instanceCount += i20;
            Test.fFld += (-7L + (i20 * i20));
            for (i21 = 4; i21 < 70; ++i21) {
                i22 -= i22;
                if (false) {
                    i22 = by3;
                } else {
                    Test.iArrFld[(iFld >>> 1) % N] = (int)Test.dFld;
                    for (i23 = 1; 2 > i23; i23++) {
                        iFld = by3;
                        i19 = (int)Test.fFld;
                        Test.dArrFld[i21] = i23;
                        i22 = 10;
                        if (false) break;
                    }
                    Test.instanceCount += (((i21 * i25) + i19) - i23);
                }
                Test.instanceCount += -2;
                iFld = (int)Test.instanceCount;
            }
        }
        for (i26 = 7; i26 < 183; i26++) {
            Test.iArrFld[i26 + 1] = -6;
            i25 = (int)Test.instanceCount;
            i25 ^= 19;
            iFld *= (int)Test.instanceCount;
            Test.iArrFld[i26 - 1] += i20;
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
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
