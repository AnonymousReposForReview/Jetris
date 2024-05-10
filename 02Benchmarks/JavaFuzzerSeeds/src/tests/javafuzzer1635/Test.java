package tests.javafuzzer1635;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 00:32:59 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=8L;
    public static boolean bFld=false;
    public static double dFld=-1.4778;
    public volatile int iFld=4;
    public static float fFld=0.857F;
    public static int iArrFld[]=new int[N];
    public float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 9);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i1, long l2, float f) {

        int i2=25, i3=208, i4=0, i5=116, i6=226, i7=-3699, i8=-63600;
        double d=1.31053;
        boolean b=false;

        for (i2 = 7; i2 < 310; ++i2) {
            i3 >>= i1;
            for (d = i2; d < 5; ++d) {
                i3 >>= i4;
            }
            Test.iArrFld[i2 - 1] -= -219;
            Test.instanceCount = i1;
            switch (((-32536 >>> 1) % 10) + 62) {
            case 62:
                Test.instanceCount -= Test.instanceCount;
                i3 = i2;
                f -= Test.instanceCount;
                for (i5 = 1; i5 < 5; ++i5) {
                    i3 = (int)l2;
                    i7 = 2;
                    while (--i7 > 0) {
                        i3 = i1;
                        i8 += (((i7 * i7) + Test.instanceCount) - i1);
                    }
                }
            case 63:
                i3 = i7;
                break;
            case 64:
                Test.iArrFld[i2 + 1] += -30047;
                break;
            case 65:
                i4 += i2;
                break;
            case 66:
                l2 = -5111389877468881521L;
                break;
            case 67:
                i6 += i2;
                break;
            case 68:
                Test.iArrFld[i2 - 1] = i5;
            case 69:
                i1 &= (int)l2;
                break;
            case 70:
                if (b) continue;
            case 71:
                i6 = (int)l2;
                break;
            default:
                Test.iArrFld[i2] >>= i6;
            }
        }
        vMeth2_check_sum += i1 + l2 + Float.floatToIntBits(f) + i2 + i3 + Double.doubleToLongBits(d) + i4 + i5 + i6 +
            i7 + i8 + (b ? 1 : 0);
    }

    public static void vMeth1(long l1, int i) {

        float f1=-117.461F, f2=-1.304F;
        int i9=-172, i10=5, i11=-15343, i12=1775, i13=-40691, i14=-193;

        i >>= Test.iArrFld[(i >>> 1) % N];
        l1 += (i++);
        vMeth2(-64342, 11073L, f1);
        for (i9 = 2; i9 < 198; ++i9) {
            for (i11 = 1; i11 < 8; ++i11) {
                Test.instanceCount >>= Test.instanceCount;
                i10 = (int)f2;
                Test.iArrFld[i9] = -20445;
                for (i13 = 1; i13 < 2; ++i13) {
                    if (i != 0) {
                        vMeth1_check_sum += l1 + i + Float.floatToIntBits(f1) + i9 + i10 + i11 + i12 +
                            Float.floatToIntBits(f2) + i13 + i14;
                        return;
                    }
                    i <<= i10;
                    if (Test.bFld) break;
                    i12 >>= (int)Test.instanceCount;
                    Test.iArrFld[i9 - 1] -= i14;
                    Test.dFld += i;
                }
            }
        }
        vMeth1_check_sum += l1 + i + Float.floatToIntBits(f1) + i9 + i10 + i11 + i12 + Float.floatToIntBits(f2) + i13 +
            i14;
    }

    public void vMeth(byte by, long l) {


        vMeth1(l, iFld);
        vMeth_check_sum += by + l;
    }

    public void mainTest(String[] strArr1) {

        int i15=-36546, i16=121, i17=4, i18=26021, i19=-51243, i20=135, i21=62585;
        double d1=-57.124039;
        short s=-20496;

        vMeth((byte)(5), Test.instanceCount);
        for (i15 = 14; i15 < 296; ++i15) {
            for (d1 = 4; 89 > d1; ++d1) {
                try {
                    Test.iArrFld[(int)(d1 + 1)] = (i16 % i17);
                    iFld = (Test.iArrFld[i15 - 1] / 39895);
                    i16 = (i15 / 9808);
                } catch (ArithmeticException a_e) {}
                for (i18 = 2; i18 > 1; --i18) {
                    i16 = (int)Test.instanceCount;
                    fArrFld = FuzzerUtils.float1array(N, (float)25.280F);
                    s = (short)Test.instanceCount;
                    i17 += (((i18 * i17) + iFld) - i15);
                    i17 = (int)Test.instanceCount;
                    i17 = i17;
                    i16 += (47744 + (i18 * i18));
                    iFld += (i18 | iFld);
                }
                switch (((i16 >>> 1) % 2) + 31) {
                case 31:
                    Test.iArrFld[(int)(d1 - 1)] += i17;
                    switch ((i15 % 7) + 41) {
                    case 41:
                        Test.fFld *= i15;
                    case 42:
                        iFld -= i20;
                        i21 = 1;
                        while ((i21 += 3) < 2) {
                            iFld = i16;
                            Test.instanceCount += (long)1.85279;
                            Test.dFld -= i16;
                            Test.fFld *= i21;
                            iFld += (((i21 * i19) + i17) - Test.instanceCount);
                            if (true) break;
                            Test.iArrFld = Test.iArrFld;
                        }
                        s ^= (short)i19;
                        break;
                    case 43:
                        Test.iArrFld = FuzzerUtils.int1array(N, (int)23567);
                        break;
                    case 44:
                        Test.dFld = 0;
                        Test.iArrFld[(int)(d1)] >>= i17;
                        break;
                    case 45:
                        i16 <<= iFld;
                        break;
                    case 46:
                        try {
                            Test.iArrFld[(int)(d1)] = (i18 % 243);
                            i17 = (37005 / i19);
                            iFld = (Test.iArrFld[i15] % i20);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 47:
                        i20 += (int)(d1 + Test.fFld);
                        break;
                    }
                    break;
                case 32:
                    Test.iArrFld[i15] += iFld;
                    break;
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}