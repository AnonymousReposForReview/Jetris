package tests.javafuzzer2817;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 20:50:54 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=27271L;
    public static float fFld=86.127F;
    public short sFld=4854;
    public static long lArrFld[]=new long[N];
    public static byte byArrFld[][]=new byte[N][N];

    static {
        FuzzerUtils.init(Test.lArrFld, -1129058819L);
        FuzzerUtils.init(Test.byArrFld, (byte)44);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i4, long l) {

        double d=0.11038;
        int i5=55830, i6=-36499, i7=11;
        float f=118.270F;
        boolean b=false, b1=false;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)84);

        byArr[(i4 >>> 1) % N] >>= (byte)l;
        for (d = 19; d < 341; d++) {
            i5 = i5;
            i4 *= 10;
            i4 += (int)(d * d);
            i6 = 5;
            while ((i6 -= 3) > 0) {
                i5 += (int)Test.instanceCount;
                i5 += i4;
                i4 >>= i4;
                i5 += (i6 + Test.instanceCount);
                for (f = 1; f < 3; f++) {
                    l = l;
                    Test.fFld = Test.instanceCount;
                    i7 = (int)Test.fFld;
                    b = b1;
                }
            }
        }
        vMeth1_check_sum += i4 + l + Double.doubleToLongBits(d) + i5 + i6 + Float.floatToIntBits(f) + i7 + (b ? 1 : 0)
            + (b1 ? 1 : 0) + FuzzerUtils.checkSum(byArr);
    }

    public static int iMeth() {

        int i8=-26276, i9=5, i10=-7, i11=23703, iArr[][]=new int[N][N];
        float f1=1.177F;
        double d1=0.93649;
        short s1=-1048, sArr[]=new short[N];
        byte by=88;

        FuzzerUtils.init(iArr, 27750);
        FuzzerUtils.init(sArr, (short)15691);

        vMeth1(i8, Test.instanceCount);
        i8 *= (int)2.522F;
        for (f1 = 7; f1 < 149; f1++) {
            for (d1 = 1; d1 < 11; ++d1) {
                i10 -= (int)Test.fFld;
            }
            Test.fFld = Test.instanceCount;
            i10 *= s1;
            iArr[(int)(f1 - 1)][(int)(f1 + 1)] *= i10;
            i10 += i8;
            sArr[(int)(f1)] = (short)-9696;
            i11 = 1;
            while (++i11 < 11) {
                i8 += (((i11 * i11) + f1) - i11);
                by |= (byte)Test.instanceCount;
                i8 <<= i11;
                i10 %= (int)((long)(d1) | 1);
            }
        }
        long meth_res = i8 + Float.floatToIntBits(f1) + i9 + Double.doubleToLongBits(d1) + i10 + s1 + i11 + by +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(sArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(short s) {

        int i=0, i1=-8510, i2=56703, i3=191, i12=-134, i13=-31622, iArr1[]=new int[N];
        double d2=-78.125469, dArr[][]=new double[N][N];
        boolean b2=true;

        FuzzerUtils.init(dArr, 1.40577);
        FuzzerUtils.init(iArr1, 13);

        for (i = 6; i < 183; ++i) {
            for (i2 = 1; i2 < 9; ++i2) {
                i3 += (i2 * i1);
                Test.fFld -= (--i1);
                Test.lArrFld[i2 - 1] += iMeth();
                d2 -= i2;
                i12 = 1;
                while (++i12 < 2) {
                    s += (short)(i12 ^ (long)Test.fFld);
                    i13 += (i12 | i);
                    dArr[i12][i12 + 1] = -59725L;
                    switch (((i2 % 10) * 5) + 50) {
                    case 54:
                        try {
                            i3 = (i1 % 8724);
                            i1 = (-35592 / i2);
                            i13 = (29391 / iArr1[i + 1]);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 67:
                        i3 += i2;
                        s -= (short)-244;
                        i1 += (i12 - i);
                        break;
                    case 97:
                        Test.instanceCount >>= i3;
                        break;
                    case 86:
                        i13 *= i1;
                        break;
                    case 77:
                        s <<= (short)i2;
                        break;
                    case 88:
                        if (b2) break;
                    case 75:
                        i13 += i12;
                        break;
                    case 89:
                        i3 = (int)-60L;
                        break;
                    case 51:
                        i1 += (int)Test.fFld;
                        break;
                    case 52:
                        Test.lArrFld[i12 - 1] -= i2;
                        break;
                    default:
                        iArr1[i2] = (int)Test.fFld;
                    }
                }
            }
        }
        vMeth_check_sum += s + i + i1 + i2 + i3 + Double.doubleToLongBits(d2) + i12 + i13 + (b2 ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i14=-226, i15=32, i16=-8038, i17=-10175, i18=-196, i19=-12, i20=-57506, i21=-12, i22=-50743, i23=-204,
            i24=4, i25=130, iArr2[]=new int[N];
        byte by1=-99;
        double d3=1.37592;

        FuzzerUtils.init(iArr2, 7);

        vMeth(sFld);
        i14 = 1;
        do {
            i15 += (i14 * Test.fFld);
            Test.fFld += Test.instanceCount;
        } while (++i14 < 267);
        for (i16 = 9; i16 < 173; i16++) {
            for (i18 = i16; i18 < 153; i18++) {
                i15 += (i18 * Test.instanceCount);
            }
            i15 += (((i16 * Test.instanceCount) + i18) - Test.instanceCount);
            Test.fFld += i16;
            for (i20 = 4; i20 < 153; i20++) {
                sFld *= (short)i17;
                i19 += i20;
                i21 = (int)Test.fFld;
                Test.instanceCount += (i20 * i18);
            }
            Test.byArrFld[i16][i16 + 1] *= (byte)i14;
            iArr2[i16 + 1] -= (int)-146L;
            i19 += i18;
            for (i22 = 153; i22 > 2; --i22) {
                switch (((i22 % 2) * 5) + 8) {
                case 14:
                    for (i24 = 2; i24 > i22; i24 -= 2) {
                        i23 = by1;
                        Test.instanceCount *= (long)d3;
                        Test.lArrFld = Test.lArrFld;
                        Test.instanceCount >>= -70;
                    }
                    break;
                case 12:
                    Test.fFld += i22;
                    Test.instanceCount *= (long)Test.fFld;
                    i15 += i22;
                    break;
                default:
                    i23 = (int)d3;
                    Test.fFld = i17;
                    i21 += i20;
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
