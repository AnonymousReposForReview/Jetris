package tests.javafuzzer1448;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 20:49:38 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-64576L;
    public float fFld=-100.742F;
    public static volatile int iArrFld[]=new int[N];
    public static volatile long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 7314);
        FuzzerUtils.init(Test.lArrFld, -5449L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i10=7, i11=-4, i12=-14;
        short s1=-1280;
        boolean b1=true;

        for (int i9 : Test.iArrFld) {
            i9 += i9;
            for (i10 = 1; i10 < 4; ++i10) {
                Test.instanceCount -= Test.instanceCount;
                switch ((i10 % 2) + 114) {
                case 114:
                case 115:
                    Test.instanceCount = s1;
                    s1 += (short)i10;
                    i9 += (i10 | Test.instanceCount);
                    break;
                default:
                    if (b1) break;
                }
                i11 += (29313 + (i10 * i10));
                Test.lArrFld[i10 - 1] += 11852;
                i12 = 1;
                do {
                    Test.instanceCount = i10;
                } while (++i12 < 2);
                i11 = (int)Test.instanceCount;
                Test.iArrFld[i10] = i12;
            }
        }
        vMeth1_check_sum += i10 + i11 + s1 + (b1 ? 1 : 0) + i12;
    }

    public void vMeth(int i4, int i5, int i6) {

        int i7=43751, i8=-107, iArr1[]=new int[N];
        short s=5852;

        FuzzerUtils.init(iArr1, 47294);

        for (i7 = 7; i7 < 219; i7 += 2) {
            Test.instanceCount <<= (iArr1[i7 - 1]++);
        }
        i8 = (int)(-((i8 + i5) - (s * Test.instanceCount)));
        vMeth1();
        vMeth_check_sum += i4 + i5 + i6 + i7 + i8 + s + FuzzerUtils.checkSum(iArr1);
    }

    public int iMeth(int i2, long l, int i3) {

        float f=-67.247F;
        boolean b=true;
        int i13=-55, i14=17828, i15=2, i16=-9, i17=209, iArr[]=new int[N];
        double d=1.46928;

        FuzzerUtils.init(iArr, -9);

        l = (long)f;
        b = (iArr[(11 >>> 1) % N] < (i3 + (i2--)));
        vMeth(i3, i2, i2);
        i13 = 1;
        do {
            for (i14 = 1; i14 < 5; i14 += 2) {
                i2 += i14;
                i2 <<= i13;
                if (b) {
                    d -= f;
                    for (i16 = 1; i16 < 3; ++i16) {
                        i15 >>= (int)Test.instanceCount;
                        Test.lArrFld[i16 + 1] += (long)1.873F;
                        i17 >>= -51;
                        Test.instanceCount += (((i16 * l) + i13) - i17);
                        i3 -= i17;
                    }
                }
            }
        } while (++i13 < 336);
        long meth_res = i2 + l + i3 + Float.floatToIntBits(f) + (b ? 1 : 0) + i13 + i14 + i15 +
            Double.doubleToLongBits(d) + i16 + i17 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr3) {

        int i1=16227, i18=-53749, i19=-33357, i20=7811, i21=-1, i22=212, i23=-11, i24=7;
        double d1=2.118773, d2=0.71253;
        short s2=-16778;
        boolean b2=true;
        byte by1=-20, byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-112);

        byArr[(i1 >>> 1) % N] += (byte)(Math.abs(Math.max(Test.instanceCount, Test.instanceCount)) % (iMeth(i1,
            Test.instanceCount, i1) | 1));
        for (i18 = 191; i18 > 1; i18 -= 2) {
            i1 += (i18 ^ i18);
            fFld *= Test.instanceCount;
            d1 = fFld;
        }
        s2 |= (short)i18;
        i20 = 1;
        while (++i20 < 196) {
            switch (((i20 >>> 1) % 7) + 93) {
            case 93:
                i19 += i20;
                i21 = 1;
                do {
                    i19 -= -6;
                    Test.instanceCount *= i19;
                    fFld -= i19;
                    d1 = i19;
                    i19 = i19;
                    if (b2) continue;
                    i1 <<= (int)Test.instanceCount;
                } while (++i21 < 128);
                break;
            case 94:
                switch (((i20 % 10) * 5) + 59) {
                case 63:
                    Test.lArrFld[i20] += i1;
                    Test.iArrFld[i20 - 1] = i19;
                    try {
                        i19 = (Test.iArrFld[i20] / -78258564);
                        i1 = (-4743 % i20);
                        Test.iArrFld[i20 - 1] = (i20 / 106);
                    } catch (ArithmeticException a_e) {}
                    fFld += (i20 * s2);
                case 84:
                    for (i22 = i20; i22 < 128; ++i22) {
                        if (b2) break;
                        i19 += (int)(-10L + (i22 * i22));
                        i1 = (int)fFld;
                        Test.instanceCount += (long)-2.662F;
                        for (d2 = 1; d2 < 1; ++d2) {
                            try {
                                i24 = (i21 / 23949);
                                Test.iArrFld[i20] = (i24 / 11196);
                                i24 = (Test.iArrFld[(int)(d2)] / -417851525);
                            } catch (ArithmeticException a_e) {}
                        }
                        d1 *= -119.1004F;
                    }
                case 78:
                    b2 = b2;
                    break;
                case 103:
                    i23 += (i20 - s2);
                    break;
                case 85:
                    i19 += (i20 | i18);
                    break;
                case 69:
                    try {
                        i1 = (Test.iArrFld[i20] / -16378);
                        i19 = (i21 / -33920);
                        i23 = (i1 / 68);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 61:
                    Test.instanceCount >>= i22;
                case 75:
                    Test.iArrFld[i20] += (int)fFld;
                case 79:
                    Test.instanceCount = i1;
                case 95:
                    fFld = 21L;
                    break;
                default:
                    i23 += (i20 * i20);
                }
            case 95:
                i23 >>= i20;
                break;
            case 96:
                i19 <<= i18;
                break;
            case 97:
                i24 -= i21;
                break;
            case 98:
                Test.iArrFld = Test.iArrFld;
                break;
            case 99:
                i23 <<= (int)Test.instanceCount;
                break;
            default:
                i24 -= by1;
            }
        }



    }
    public static void main(String[] strArr2) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr2);
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