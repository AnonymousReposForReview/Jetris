package tests.javafuzzer939;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 11:50:28 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=8137729239765074963L;
    public static int iFld=-6;
    public static byte byFld=-57;
    public static int iFld1=-7419;
    public int iFld2=-161;
    public static int iArrFld[]=new int[N];
    public volatile float fArrFld[]=new float[N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 178);
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i6=10062, i7=60421, i8=0;
        float f=53.411F;
        double d=-1.119449;
        boolean b=true, bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, true);

        Test.iFld += Test.iFld;
        Test.iArrFld[(Test.iFld >>> 1) % N] *= (int)37452L;
        i6 = 1;
        while (++i6 < 193) {
            Test.iFld = -104;
            Test.iFld += i6;
            switch ((i6 % 2) + 95) {
            case 95:
                if (b) {
                    Test.iFld += (((i6 * Test.instanceCount) + Test.instanceCount) - f);
                    Test.iFld = (int)d;
                    bArr[i6 + 1] = b;
                } else {
                    for (i7 = i6; 8 > i7; i7++) {
                        Test.instanceCount %= (Test.iFld | 1);
                        if (b) continue;
                        Test.iFld += (i7 * i7);
                        Test.iArrFld[i6] = (int)Test.instanceCount;
                    }
                }
            case 96:
                i8 ^= i6;
                break;
            }
        }
        vMeth2_check_sum += i6 + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + (b ? 1 : 0) + i7 + i8 +
            FuzzerUtils.checkSum(bArr);
    }

    public static void vMeth1(int i5) {

        int i9=-8, i10=5482, i11=-1, i12=-208;
        float f1=88.16F;

        vMeth2();
        for (i9 = 9; i9 < 325; ++i9) {
            double d1=64.39201;
            d1 += i10;
            switch ((i9 % 4) + 30) {
            case 30:
                d1 = Test.byFld;
                Test.instanceCount -= (long)f1;
            case 31:
                for (i11 = 1; 5 > i11; ++i11) {
                    i12 = (int)d1;
                    f1 = i5;
                    if (false) continue;
                    d1 = d1;
                    i12 -= i9;
                    Test.iFld = i9;
                    Test.iArrFld[i9] -= (int)Test.instanceCount;
                    d1 -= Test.instanceCount;
                }
                break;
            case 32:
                i10 = i5;
            case 33:
                d1 /= (Test.instanceCount | 1);
                break;
            }
        }
        vMeth1_check_sum += i5 + i9 + i10 + Float.floatToIntBits(f1) + i11 + i12;
    }

    public static void vMeth(int i, int i1) {

        int i2=79, i3=252, i4=-10657, i13=126, i14=-202, i15=0, i16=-47879;
        short s=-7901;

        i = (int)((i1++) + (-(i1 + 77L)));
        for (i2 = 4; i2 < 128; i2++) {
            i4 = 1;
            do {
                i3 = i;
                vMeth1(20158);
            } while (++i4 < 13);
            for (i13 = 1; 13 > i13; i13++) {
                switch (((i13 % 2) * 5) + 59) {
                case 61:
                    i3 *= (int)-20599L;
                    break;
                case 60:
                    s += (short)i13;
                    for (i15 = i13; i15 < 2; i15++) {
                        i16 += (i15 | i4);
                        Test.iArrFld[i13 - 1] = i13;
                        i1 = i16;
                        Test.byFld += (byte)Test.instanceCount;
                        i1 *= i;
                    }
                    break;
                }
            }
        }
        vMeth_check_sum += i + i1 + i2 + i3 + i4 + i13 + i14 + s + i15 + i16;
    }

    public void mainTest(String[] strArr1) {

        float f2=100.503F;
        int i17=163, i18=6693, i19=5, i20=-36478, i21=-63040, i22=61431, i23=-27933, i24=-33488, i25=-195, i26=-3;
        boolean b1=true;
        double d2=0.106739, dArr[][]=new double[N][N];
        short s1=-30861;

        FuzzerUtils.init(dArr, 97.49550);

        vMeth(Test.iFld, Test.iFld);
        Test.iArrFld[(Test.iFld >>> 1) % N] = (int)f2;
        Test.iArrFld[(-175 >>> 1) % N] = -98;
        for (i17 = 1; i17 < 236; ++i17) {
            for (i19 = i17; 107 > i19; ++i19) {
                Test.iFld += Test.iFld;
            }
            f2 = i20;
            Test.iFld = 206;
            Test.iFld += i17;
            if (b1) break;
            i18 = Test.iFld;
            Test.instanceCount <<= i19;
            if (false) {
                Test.iFld1 -= i20;
                for (i21 = 6; i21 < 107; ++i21) {
                    Test.instanceCount = Test.instanceCount;
                }
                switch ((i17 % 10) + 25) {
                case 25:
                    Test.instanceCount += (i17 + i21);
                    for (i23 = 4; i23 < 107; ++i23) {
                        long l=-179L;
                        i24 -= i18;
                        switch ((i17 % 3) + 87) {
                        case 87:
                            switch (((i24 >>> 1) % 5) + 74) {
                            case 74:
                                for (i25 = i17; i25 < 2; i25++) {
                                    Test.iArrFld[i17] *= iFld2;
                                    Test.instanceCount = iFld2;
                                    i24 = (int)-483512227597849449L;
                                    fArrFld[i17 + 1] -= i19;
                                    f2 = -4380;
                                }
                                d2 += l;
                                break;
                            case 75:
                                s1 = (short)Test.instanceCount;
                            case 76:
                                i26 *= (int)l;
                            case 77:
                                Test.iFld1 = (int)f2;
                                break;
                            case 78:
                                l += (i23 * i23);
                                break;
                            default:
                                Test.iFld += i23;
                            }
                            break;
                        case 88:
                            Test.instanceCount = s1;
                            break;
                        case 89:
                            f2 += (((i23 * i22) + Test.instanceCount) - s1);
                            break;
                        default:
                            Test.instanceCount += i23;
                        }
                    }
                case 26:
                    Test.bArrFld[i17 - 1] = b1;
                    break;
                case 27:
                    try {
                        iFld2 = (0 / Test.iArrFld[i17 + 1]);
                        iFld2 = (53932 % Test.iArrFld[i17]);
                        Test.iArrFld[i17] = (i22 / -54020);
                    } catch (ArithmeticException a_e) {}
                case 28:
                    i20 &= -236;
                    break;
                case 29:
                    i18 -= (int)Test.instanceCount;
                    break;
                case 30:
                    Test.byFld = (byte)i25;
                    break;
                case 31:
                    Test.iFld1 <<= 58;
                    break;
                case 32:
                    iFld2 += (int)Test.instanceCount;
                    break;
                case 33:
                    i26 -= (int)f2;
                    break;
                case 34:
                    dArr[i17 - 1] = dArr[i17];
                    break;
                }
            } else if (b1) {
                f2 -= i20;
            } else if (b1) {
                Test.iArrFld[i17 + 1] *= i21;
            } else {
                i26 = i22;
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