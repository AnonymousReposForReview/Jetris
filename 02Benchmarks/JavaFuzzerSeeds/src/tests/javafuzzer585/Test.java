package tests.javafuzzer585;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 06:14:29 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=6L;
    public static byte byFld=-84;
    public static volatile int iFld=-65221;
    public double dFld=104.65886;
    public static int iArrFld[]=new int[N];
    public static volatile long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -27826);
        FuzzerUtils.init(Test.lArrFld, 111L);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vSmallMeth(int i, int i1, int i2) {

        float f=2.854F;

        f -= -122;
        vSmallMeth_check_sum += i + i1 + i2 + Float.floatToIntBits(f);
    }

    public static void vMeth(byte by, long l) {

        int i7=12;

        i7 = 9;
        i7 = i7;
        vMeth_check_sum += by + l + i7;
    }

    public static int iMeth1() {

        int i5=-32565, i6=7033, i8=0, i9=10, i10=106;
        byte by1=33;
        float f2=100.125F;

        for (i5 = 6; 225 > i5; i5++) {
            i6 = (i6 + -23313);
            i6 *= (++i6);
            i6 <<= (int)(~(long)((i6 + i6) - Double.longBitsToDouble(Test.instanceCount)));
            vMeth(by1, Test.instanceCount);
            for (i8 = i5; i8 < 7; ++i8) {
                f2 += 13224L;
                i6 = i5;
                i6 = (int)f2;
                switch ((i8 % 8) + 40) {
                case 40:
                    if (i5 != 0) {
                    }
                    f2 = f2;
                    i10 = 1;
                    do {
                        Test.lArrFld[i8 - 1] ^= Test.instanceCount;
                        i9 += (((i10 * f2) + i8) - i8);
                    } while (--i10 > 0);
                    break;
                case 41:
                    if (i6 != 0) {
                    }
                    break;
                case 42:
                    by1 += (byte)(i8 ^ i8);
                    break;
                case 43:
                    i6 = i5;
                    break;
                case 44:
                    if (i5 != 0) {
                    }
                    break;
                case 45:
                    i9 += i8;
                    break;
                case 46:
                    i6 += i5;
                    break;
                case 47:
                    i9 = (int)Test.instanceCount;
                    break;
                default:
                    Test.instanceCount = i9;
                }
            }
        }
        long meth_res = i5 + i6 + by1 + i8 + i9 + Float.floatToIntBits(f2) + i10;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i3) {

        short s=9925;
        int i4=-18776, i11=-4774, i12=-2, i13=237, i14=-30, i15=24;
        float f1=-63.249F;
        double d=-113.124207;

        s = (short)(i3 += (i3 = Test.iArrFld[(i3 >>> 1) % N]));
        switch (((((int)(-(i4 * f1))) >>> 1) % 9) + 91) {
        case 91:
            Test.instanceCount -= (--Test.instanceCount);
            s -= (short)(--Test.iArrFld[(i4 >>> 1) % N]);
            i3 <<= (int)((--Test.instanceCount) - (-(i4 * i4)));
            break;
        case 92:
            i4 = iMeth1();
            for (i11 = 6; i11 < 229; ++i11) {
                for (i13 = 7; i13 > 1; i13 -= 3) {
                    boolean b=true;
                    i14 = i14;
                    switch ((i13 % 5) + 105) {
                    case 105:
                    case 106:
                        Test.byFld *= (byte)i3;
                        break;
                    case 107:
                        b = false;
                        d *= i15;
                        i12 += (((i13 * f1) + i11) - f1);
                        break;
                    case 108:
                        i3 = i12;
                        break;
                    case 109:
                        i15 &= i13;
                        break;
                    default:
                        i15 -= i13;
                    }
                }
            }
            break;
        case 93:
            Test.iArrFld[(i4 >>> 1) % N] = (int)Test.instanceCount;
            break;
        case 94:
            Test.iArrFld[(-11 >>> 1) % N] += -1;
        case 95:
            Test.iArrFld[(i11 >>> 1) % N] <<= i13;
            break;
        case 96:
        case 97:
            i14 += i14;
            break;
        case 98:
            d -= s;
            break;
        case 99:
            Test.instanceCount = i12;
            break;
        default:
            d -= i12;
        }
        long meth_res = i3 + s + i4 + Float.floatToIntBits(f1) + i11 + i12 + i13 + i14 + Double.doubleToLongBits(d) +
            i15;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i16=251, i17=-8, i18=8, i19=165, i21=-3, i22=-88, i23=-4, i24=2, i25=153, i26=22749;
        float f3=-22.483F;
        short s1=-4472;
        boolean b1=true;
        long l1=836306888592057257L;

        for (int smallinvoc=0; smallinvoc<284; smallinvoc++) vSmallMeth(iMeth(Test.iFld), Test.iFld, Test.iFld);
        Test.lArrFld = Test.lArrFld;
        for (i16 = 9; 330 > i16; ++i16) {
            for (i18 = 2; i18 < 78; ++i18) {
                int i20=3;
                Test.iArrFld[i18] += 2;
                Test.iFld += (int)f3;
                Test.iFld = i17;
                try {
                    i19 = (i19 % -1215134631);
                    i17 = (-66173544 / Test.iFld);
                    i20 = (71 / i17);
                } catch (ArithmeticException a_e) {}
            }
            i17 = (int)Test.instanceCount;
            Test.instanceCount += i17;
            Test.iArrFld[i16 - 1] ^= i18;
            Test.instanceCount += (i16 - Test.instanceCount);
            Test.instanceCount += (((i16 * i17) + Test.iFld) - f3);
            for (i21 = 2; i21 < 78; ++i21) {
                s1 <<= (short)-38337L;
                for (i23 = 1; 2 > i23; ++i23) {
                    if (b1) break;
                    f3 = -96;
                    i17 = i19;
                }
                Test.instanceCount <<= 50091;
            }
            l1 = 1;
            while (++l1 < 78) {
                Test.instanceCount /= (Test.instanceCount | 1);
                for (i25 = 1; i25 < 1; ++i25) {
                    i19 <<= Test.byFld;
                    i26 += i17;
                    Test.iArrFld[i25] = (int)dFld;
                    Test.iArrFld[i16 - 1] += i17;
                    i19 *= i22;
                }
                i22 += (int)(l1 * l1);
                b1 = b1;
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
