package tests.javafuzzer1541;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 22:25:17 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-6L;
    public static byte byFld=32;
    public static float fFld=-63.250F;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 0L);
        FuzzerUtils.init(Test.iArrFld, 36716);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l, double d1, float f2) {

        int i9=-1, i10=-241, i11=106, i12=-111, i13=-60, iArr[]=new int[N];
        short s1=16134;

        FuzzerUtils.init(iArr, 39332);

        for (i9 = 19; i9 < 341; i9++) {
            i10 += (-3 + (i9 * i9));
            iArr[i9 + 1] >>= (int)Test.instanceCount;
            i10 = 84;
            i11 = 5;
            while (--i11 > 0) {
                i10 = s1;
                Test.instanceCount = Test.byFld;
                f2 = (float)d1;
                Test.instanceCount = i11;
            }
            l -= i9;
            i10 %= (int)((long)(f2) | 1);
        }
        for (i12 = 388; i12 > 13; --i12) {
            f2 *= Test.instanceCount;
        }
        i13 *= 89;
        iArr[(i12 >>> 1) % N] -= (int)Test.instanceCount;
        vMeth1_check_sum += l + Double.doubleToLongBits(d1) + Float.floatToIntBits(f2) + i9 + i10 + i11 + s1 + i12 +
            i13 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i5, float f1, int i6) {

        int i7=-10, i8=-71, i14=30789, i15=-153, i16=-140, i17=-45593, i18=-52254, i19=-35686, i20=-14, i21=-13,
            iArr1[][]=new int[N][N];
        short s=-2543;
        double d2=-1.121872;
        boolean b=false;

        FuzzerUtils.init(iArr1, -132);

        for (i7 = 2; i7 < 128; i7++) {
            f1 += (i7 - s);
        }
        vMeth1(Test.instanceCount, d2, f1);
        i6 = (int)Test.instanceCount;
        iArr1[(i14 >>> 1) % N][(i7 >>> 1) % N] = i6;
        for (i15 = 14; i15 < 314; i15++) {
            Test.byFld = (byte)41800;
            for (i17 = 1; 6 > i17; ++i17) {
                i19 = 1;
                while (++i19 < 2) {
                    Test.fFld /= ((long)(Test.fFld) | 1);
                }
                b = b;
                switch (((i17 % 10) * 5) + 101) {
                case 118:
                    for (i20 = 1; i20 < 2; i20++) {
                        Test.fFld -= s;
                        i16 >>= (int)Test.instanceCount;
                    }
                case 102:
                    i16 -= (int)Test.instanceCount;
                    break;
                case 109:
                    Test.lArrFld[i17 + 1] = 97;
                    break;
                case 135:
                    Test.byFld -= (byte)221;
                case 136:
                    i21 *= (int)Test.fFld;
                    break;
                case 142:
                    i18 = (int)Test.instanceCount;
                    break;
                case 106:
                    i8 /= (int)(i7 | 1);
                    break;
                case 141:
                    i14 -= i8;
                    break;
                case 140:
                    Test.instanceCount = Test.instanceCount;
                    break;
                case 103:
                    Test.instanceCount = 33;
                    break;
                }
            }
        }
        vMeth_check_sum += i5 + Float.floatToIntBits(f1) + i6 + i7 + i8 + s + Double.doubleToLongBits(d2) + i14 + i15 +
            i16 + i17 + i18 + i19 + (b ? 1 : 0) + i20 + i21 + FuzzerUtils.checkSum(iArr1);
    }

    public static void vSmallMeth(int i4) {


        vMeth(i4, Test.fFld, i4);
        vSmallMeth_check_sum += i4;
    }

    public void mainTest(String[] strArr1) {

        int i=26233, i1=12785, i2=-214, i3=40, i22=41;
        double d=18.76080, dArr[]=new double[N];
        float f=-1.292F;
        boolean b1=true;

        FuzzerUtils.init(dArr, 0.125573);

        for (i = 11; i < 265; i++) {
            i1 &= (int)(Test.instanceCount++);
            for (i2 = 5; i2 < 99; i2++) {
                switch (((i2 % 9) * 5) + 116) {
                case 149:
                    d -= ((--Test.instanceCount) + d);
                    switch ((i2 % 7) + 42) {
                    case 42:
                        Test.instanceCount += (((i2 * i2) + f) - i2);
                        break;
                    case 43:
                        i1 += (int)Test.instanceCount;
                        i3 += (((i2 * i2) + f) - f);
                        break;
                    case 44:
                        for (int smallinvoc=0; smallinvoc<1; smallinvoc++) vSmallMeth(i);
                        i22 = 1;
                        do {
                            short s2=2652;
                            switch ((((i1 >>> 1) % 10) * 5) + 19) {
                            case 59:
                                if (b1) {
                                    f = Test.instanceCount;
                                    i3 *= -56;
                                    i1 += 7;
                                    i1 = i1;
                                }
                            case 38:
                                Test.instanceCount >>= i3;
                                i3 += (int)Test.fFld;
                                Test.iArrFld[i22] = -26;
                                i3 += i22;
                                break;
                            case 49:
                                i1 -= i;
                                i1 += (i22 * i22);
                                i3 += i;
                            case 62:
                                i1 += i3;
                                break;
                            case 64:
                                Test.iArrFld[i - 1] = i2;
                                Test.instanceCount = -5;
                                break;
                            case 65:
                                b1 = b1;
                                d += i;
                                break;
                            case 61:
                                Test.iArrFld[i22 - 1] *= i;
                                break;
                            case 51:
                                i3 += (i22 * i3);
                                break;
                            case 66:
                                try {
                                    i3 = (Test.iArrFld[i + 1] % -1100046478);
                                    i3 = (i2 / i1);
                                    i1 = (i % i3);
                                } catch (ArithmeticException a_e) {}
                                break;
                            case 25:
                                s2 &= (short)i;
                            default:
                                Test.instanceCount -= i22;
                            }
                        } while (++i22 < 2);
                    case 45:
                        f = i3;
                    case 46:
                        dArr[i] = i3;
                        break;
                    case 47:
                        i1 <<= i3;
                        break;
                    case 48:
                        i1 -= (int)f;
                    default:
                        i3 *= i1;
                    }
                case 121:
                    i1 += (((i2 * Test.fFld) + i) - Test.instanceCount);
                    break;
                case 122:
                    Test.instanceCount *= (long)d;
                    break;
                case 139:
                    Test.lArrFld[i2] *= Test.instanceCount;
                    break;
                case 147:
                    Test.iArrFld = Test.iArrFld;
                    break;
                case 155:
                    Test.instanceCount += (long)(63.981F + (i2 * i2));
                    break;
                case 120:
                    i1 *= Test.byFld;
                    break;
                case 136:
                    i1 ^= i1;
                    break;
                case 145:
                    i1 += (i2 + i2);
                    break;
                default:
                    Test.lArrFld[i2 - 1] += i1;
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  vMeth1 ->  vMeth1 vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
