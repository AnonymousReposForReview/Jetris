package tests.javafuzzer882;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 11:18:28 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=6L;
    public static float fFld=-2.915F;
    public static int iArrFld[]=new int[N];
    public static byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 242);
        FuzzerUtils.init(Test.byArrFld, (byte)-112);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(long l1) {

        int i6=2, i7=12, i8=-34506, i9=-172, i10=-219, i11=-8;
        double d=-124.122119;
        byte by1=-119;
        boolean b=true;

        l1 += i6;
        i6 = i6;
        i6 |= -8;
        if (b) {
            Test.byArrFld[(i6 >>> 1) % N] |= (byte)i6;
            i7 %= (int)(i7 | 1);
            i6 += i7;
        } else if (b) {
            i6 = (int)d;
            for (i8 = 315; i8 > 13; i8--) {
                switch ((((i6 >>> 1) % 10) * 5) + 18) {
                case 55:
                case 41:
                case 26:
                    for (i10 = i8; i10 < 5; ++i10) {
                        Test.fFld = Test.fFld;
                        i6 = (int)Test.instanceCount;
                        i7 = i6;
                        Test.fFld += l1;
                    }
                    break;
                case 39:
                    by1 <<= (byte)0;
                    break;
                case 38:
                    i9 = i6;
                case 19:
                    i9 = i11;
                    break;
                case 61:
                    i7 -= i6;
                    break;
                case 56:
                    i9 = i8;
                    break;
                case 65:
                    Test.iArrFld[i8 + 1] = i10;
                    break;
                case 48:
                    l1 ^= i9;
                default:
                    i9 += i8;
                }
            }
        } else {
            Test.iArrFld[(i9 >>> 1) % N] = i6;
        }
        long meth_res = l1 + i6 + i7 + Double.doubleToLongBits(d) + i8 + i9 + i10 + i11 + by1 + (b ? 1 : 0);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(float f2) {

        long l=-1341327716929015254L;
        int i12=101;

        l = (iMeth(Test.instanceCount) - i12);
        i12 += i12;
        vMeth_check_sum += Float.floatToIntBits(f2) + l + i12;
    }

    public static void vSmallMeth(int i4, int i5) {

        float f1=-36.432F;

        f1 += ((i4 + (i5 >> i5)) - i4);
        vMeth(f1);
        vSmallMeth_check_sum += i4 + i5 + Float.floatToIntBits(f1);
    }

    public void mainTest(String[] strArr1) {

        int i=11, i1=60, i2=-6, i3=88, i13=-132;
        float f=-101.193F;
        byte by=41;
        double d1=-1.75379;
        boolean b1=true;
        long lArr[][]=new long[N][N];
        short sArr[]=new short[N];

        FuzzerUtils.init(lArr, -3227061651680652125L);
        FuzzerUtils.init(sArr, (short)-19214);

        for (i = 8; i < 343; i++) {
            f = Test.iArrFld[i + 1];
            for (i2 = 1; i2 < 75; ++i2) {
                Test.iArrFld[i] <<= 158;
                by = (byte)((-Test.instanceCount) - i2);
                for (int smallinvoc=0; smallinvoc<1; smallinvoc++) vSmallMeth(36994, i3);
                f += (((i2 * Test.fFld) + i) - i1);
                i13 = 1;
                do {
                    i1 += (((i13 * by) + Test.instanceCount) - i13);
                    i3 += (-55588 + (i13 * i13));
                    if (false) {
                        i3 = i;
                    } else if (b1) {
                        switch ((i % 9) + 104) {
                        case 104:
                            Test.instanceCount -= (long)f;
                            i1 = (int)Test.instanceCount;
                            i1 += (int)Test.fFld;
                            break;
                        case 105:
                            Test.iArrFld = Test.iArrFld;
                            d1 = Test.fFld;
                            switch (((i % 9) * 5) + 31) {
                            case 62:
                                Test.iArrFld[i - 1] = 61009;
                                lArr[i2 - 1][i2] = 3711287831704297476L;
                                Test.fFld = 16836;
                            case 47:
                                d1 += d1;
                                switch (((i >>> 1) % 4) + 25) {
                                case 25:
                                    Test.fFld %= ((long)(f) | 1);
                                    break;
                                case 26:
                                    i3 >>= i3;
                                    break;
                                case 27:
                                    Test.instanceCount = (long)Test.fFld;
                                    by |= (byte)i3;
                                    i1 >>= i;
                                    f = i13;
                                    break;
                                case 28:
                                    i3 &= i13;
                                    break;
                                }
                            case 58:
                                try {
                                    i1 = (-105 / i1);
                                    i3 = (i2 % i3);
                                    i1 = (-41364 % i);
                                } catch (ArithmeticException a_e) {}
                                break;
                            case 63:
                                Test.iArrFld[i13] = (int)Test.instanceCount;
                                break;
                            case 61:
                                Test.instanceCount &= i1;
                                break;
                            case 38:
                                f = i2;
                                break;
                            case 37:
                                i1 += (i13 - i13);
                            case 42:
                                Test.instanceCount += i13;
                                break;
                            case 45:
                                Test.instanceCount += i13;
                                break;
                            }
                            break;
                        case 106:
                            d1 += 4374;
                            break;
                        case 107:
                            sArr[i2 - 1] = (short)i13;
                            break;
                        case 108:
                            i3 -= -13;
                        case 109:
                            Test.instanceCount <<= i;
                            break;
                        case 110:
                            Test.instanceCount -= i;
                            break;
                        case 111:
                            i3 -= (int)Test.instanceCount;
                            break;
                        case 112:
                            i3 += i13;
                            break;
                        default:
                            f += (i13 * i13);
                        }
                    }
                } while (++i13 < 2);
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
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  iMeth ->  iMeth vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
