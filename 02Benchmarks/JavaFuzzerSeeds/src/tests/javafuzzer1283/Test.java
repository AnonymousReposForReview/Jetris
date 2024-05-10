package tests.javafuzzer1283;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 17:40:22 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-302566367L;
    public static float fFld=-45.114F;
    public short sFld=-15456;
    public volatile int iFld=173;
    public static volatile long lArrFld[]=new long[N];
    public static short sArrFld[][]=new short[N][N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -20990L);
        FuzzerUtils.init(Test.sArrFld, (short)12560);
        FuzzerUtils.init(Test.iArrFld, 0);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth() {

        int i3=250, i4=-89, i5=62715, i6=-188, i7=2, i8=-97, i9=-58, i10=-19602, iArr[]=new int[N];
        long l=0L;
        boolean b1=true;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)11699);
        FuzzerUtils.init(iArr, -108);

        i3 = 1;
        do {
            sArr[i3] *= (short)i3;
            i4 >>>= i3;
        } while (++i3 < 179);
        for (i5 = 340; 1 < i5; i5 -= 3) {
            if (i3 != 0) {
            }
            for (i7 = 1; i7 < 14; ++i7) {
                Test.sArrFld = Test.sArrFld;
                l += i5;
            }
            for (i9 = 1; i9 < 14; ++i9) {
                i6 += 18787;
                i4 += (i9 * i9);
                iArr[i9 - 1] -= (int)l;
                iArr[i5 - 1] = (int)l;
                Test.lArrFld[i9] -= 30L;
            }
            b1 = b1;
        }
        long meth_res = i3 + i4 + i5 + i6 + i7 + i8 + l + i9 + i10 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(sArr) +
            FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1() {

        int i=4, i1=-47502, i2=-239;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -81.112044);

        Test.fFld -= (Test.lArrFld[(i >>> 1) % N]++);
        for (i1 = 2; i1 < 265; ++i1) {
            lMeth();
            i = i;
            Test.instanceCount += i;
            dArr[i1 - 1] -= i2;
            i2 = i2;
        }
        Test.fFld += -248;
        vMeth1_check_sum += i + i1 + i2 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth(double d, boolean b) {

        int i11=42, i12=17, i13=-51144, i14=-64456, i15=5, i16=-19871, i17=-238, iArr1[][]=new int[N][N];
        byte by=51;
        float f=1.525F;
        short s=-32629;

        FuzzerUtils.init(iArr1, -225);

        vMeth1();
        for (i11 = 10; i11 < 282; i11++) {
            i12 += i12;
            i12 = -715;
            by >>= (byte)i11;
            Test.fFld /= 28;
        }
        for (f = 11; f < 394; ++f) {
            iArr1[(int)(f + 1)][(int)(f - 1)] |= -58;
            Test.instanceCount = 6;
            for (i14 = 1; i14 < 4; ++i14) {
                Test.instanceCount = i12;
                for (i16 = 1; i16 < 2; i16++) {
                    i17 = i15;
                    Test.instanceCount = s;
                    Test.fFld += (((i16 * i13) + i14) - by);
                }
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + (b ? 1 : 0) + i11 + i12 + by + Float.floatToIntBits(f) + i13 +
            i14 + i15 + i16 + i17 + s + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        double d1=-107.127299;
        boolean b2=true;
        int i18=-253, i19=-222, i20=-10, i21=-187, i22=-46550, i23=6;
        byte by1=115, byArr[]=new byte[N];
        long l1=115L, l2=36L, l3=6538341449080581352L;

        FuzzerUtils.init(byArr, (byte)50);

        vMeth(d1, b2);
        i18 -= i18;
        i18 += by1;
        i18 += i18;
        l1 -= i18;
        Test.iArrFld = Test.iArrFld;
        i18 >>>= 136;
        Test.fFld = i18;
        if (b2) {
            l2 = 1;
            while (++l2 < 197) {
                i18 = (int)Test.instanceCount;
                d1 = i18;
                for (i19 = 6; i19 < 127; ++i19) {
                    switch ((int)(l2 + 19)) {
                    case 19:
                        i20 += (-38 + (i19 * i19));
                        d1 = 1.114070;
                        Test.instanceCount = sFld;
                        break;
                    case 20:
                        i18 = i19;
                        i21 = 2;
                        while ((i21 -= 2) > 0) {
                            i20 += (i21 | i20);
                            i18 -= i18;
                            Test.iArrFld[i19 + 1] -= i20;
                            byArr[(int)(l2 + 1)] -= (byte)8687;
                        }
                        iFld = i18;
                        break;
                    case 21:
                        i22 = 1;
                        do {
                            Test.lArrFld[i22 + 1] -= 3L;
                            l1 >>= 122;
                            by1 = (byte)l1;
                            iFld += -8;
                            i20 >>= i18;
                        } while (++i22 < 2);
                        break;
                    case 22:
                        if (b2) continue;
                        break;
                    case 23:
                        Test.instanceCount = 12;
                        break;
                    case 24:
                        Test.fFld = i18;
                        break;
                    case 25:
                        iFld -= i20;
                    case 26:
                        Test.iArrFld = Test.iArrFld;
                    case 27:
                        i20 += (63418 + (i19 * i19));
                        break;
                    case 28:
                        Test.instanceCount = i20;
                        break;
                    case 29:
                        Test.lArrFld[(int)(l2 - 1)] = i22;
                        break;
                    case 30:
                        i18 -= (int)l1;
                        break;
                    case 31:
                        i18 *= i20;
                    case 32:
                        Test.iArrFld[(int)(l2 - 1)] &= (int)Test.instanceCount;
                        break;
                    case 33:
                        l1 = i22;
                        break;
                    case 34:
                        iFld = i20;
                        break;
                    case 35:
                        Test.instanceCount = i18;
                        break;
                    case 36:
                        i18 += (int)l1;
                        break;
                    case 37:
                        Test.iArrFld[i19] = (int)1549500410L;
                        break;
                    case 38:
                        i18 = iFld;
                        break;
                    case 39:
                        Test.iArrFld[i19 + 1] += 91;
                        break;
                    case 40:
                        Test.instanceCount += (i19 * i19);
                        break;
                    case 41:
                        Test.iArrFld[i19 + 1] = i20;
                        break;
                    case 42:
                        iFld *= i20;
                        break;
                    case 43:
                        Test.instanceCount &= 147;
                        break;
                    case 44:
                        l1 -= i18;
                        break;
                    case 45:
                        d1 += by1;
                        break;
                    case 46:
                        Test.lArrFld[(int)(l2)] = i18;
                        break;
                    case 47:
                        l1 += -27191;
                    case 48:
                        Test.instanceCount >>= l1;
                        break;
                    case 49:
                        Test.instanceCount += (i19 * i19);
                        break;
                    case 50:
                        i20 >>= i21;
                    case 51:
                        Test.iArrFld[(int)(l2)] = i22;
                        break;
                    case 52:
                        by1 += (byte)d1;
                        break;
                    case 53:
                        l1 = i20;
                        break;
                    case 54:
                        Test.fFld += (((i19 * i20) + i20) - i22);
                        break;
                    case 55:
                        sFld ^= (short)Test.instanceCount;
                        break;
                    case 56:
                        iFld += (int)(5075918103490110455L + (i19 * i19));
                    case 57:
                        iFld -= i22;
                        break;
                    case 58:
                        try {
                            i18 = (1097684374 / i18);
                            iFld = (-1255109562 % i22);
                            i18 = (42446 / i19);
                        } catch (ArithmeticException a_e) {}
                    case 59:
                        Test.iArrFld[(int)(l2 + 1)] = (int)Test.fFld;
                        break;
                    case 60:
                        Test.fFld += (i19 + Test.fFld);
                        break;
                    case 61:
                        l1 <<= -46;
                        break;
                    case 62:
                        Test.fFld -= i22;
                        break;
                    case 63:
                        Test.fFld += i18;
                        break;
                    case 64:
                        l1 += (i19 * by1);
                        break;
                    case 65:
                        i20 = i23;
                        break;
                    case 66:
                        i20 += (int)1631776841L;
                        break;
                    case 67:
                        d1 = i18;
                        break;
                    case 68:
                        Test.iArrFld[i19 + 1] = (int)l2;
                        break;
                    case 69:
                        by1 = (byte)l1;
                        break;
                    case 70:
                        if (b2) continue;
                    case 71:
                        iFld += (i19 + iFld);
                        break;
                    case 72:
                        iFld += (i19 ^ i18);
                        break;
                    case 73:
                    case 74:
                        i18 <<= (int)l1;
                    case 75:
                        i18 += (((i19 * Test.fFld) + i20) - by1);
                        break;
                    case 76:
                        i23 += i23;
                        break;
                    case 77:
                        i20 += (int)l1;
                        break;
                    case 78:
                        Test.instanceCount *= i18;
                        break;
                    case 79:
                    case 80:
                        iFld >>= (int)2L;
                        break;
                    case 81:
                        i23 -= (int)Test.instanceCount;
                    case 82:
                        if (false) continue;
                        break;
                    case 83:
                        l1 = l2;
                        break;
                    case 84:
                        iFld += i19;
                        break;
                    case 85:
                        iFld = (int)l3;
                        break;
                    case 86:
                        i23 ^= i18;
                        break;
                    case 87:
                        Test.iArrFld[(int)(l2 + 1)] *= i21;
                    case 88:
                        i23 = iFld;
                    }
                }
            }
        } else {
            l3 = i19;
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