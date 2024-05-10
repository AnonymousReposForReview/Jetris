package tests.javafuzzer138;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 23:01:45 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-17063L;
    public static float fFld=2.773F;
    public double dFld=40.95500;
    public static int iArrFld[][]=new int[N][N];
    public static byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -219);
        FuzzerUtils.init(Test.byArrFld, (byte)91);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static double dMeth(double d2, int i6, int i7) {

        int i8=-126, i9=23891, i10=203, i11=-3658, i12=1, i13=28663, i14=9, i15=-3, i16=-70, i17=-8382;
        byte by=-82;
        short s=25690;

        Test.iArrFld[(i6 >>> 1) % N][(i7 >>> 1) % N] += i7;
        Test.iArrFld[(i7 >>> 1) % N][(75 >>> 1) % N] -= i8;
        for (i9 = 16; i9 < 344; i9++) {
            Test.byArrFld[i9 + 1] = by;
            i10 -= (int)-1L;
        }
        i7 &= i7;
        i11 = 1;
        while (++i11 < 290) {
            for (i12 = 1; i12 < 6; ++i12) {
                for (i14 = 1; i14 < 2; ++i14) {
                    d2 *= 61637;
                    Test.instanceCount -= i14;
                    i13 = i9;
                }
                for (i16 = 1; i16 < 2; ++i16) {
                    Test.iArrFld[i11][i12] -= i7;
                    Test.iArrFld[i12][i12 - 1] = s;
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d2) + i6 + i7 + i8 + i9 + i10 + by + i11 + i12 + i13 + i14 + i15 + i16
            + i17 + s;
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth1(int i4, double d1, int i5) {

        float f=-93.519F;
        short s1=25215;
        int i18=33176, i19=-194, i20=-3, i21=180;

        f -= Test.iArrFld[(i5 >>> 1) % N][(i4 >>> 1) % N];
        switch ((((i5++) >>> 1) % 4) + 31) {
        case 31:
        case 32:
            i5 = (int)dMeth(d1, 2, -4);
            i4 = (int)Test.instanceCount;
            d1 *= s1;
            break;
        case 33:
            f *= i5;
            break;
        case 34:
            Test.instanceCount -= (long)-33.93311;
            break;
        default:
            i5 *= (int)Test.instanceCount;
            i4 += i5;
            for (i18 = 5; i18 < 363; i18++) {
                Test.fFld = (float)d1;
                for (i20 = 5; i20 > 1; i20--) {
                    try {
                        i5 = (i21 % 229);
                        i19 = (i21 / -7703);
                        i19 = (i18 % -100);
                    } catch (ArithmeticException a_e) {}
                    Test.instanceCount &= Test.instanceCount;
                    i5 += (int)Test.instanceCount;
                }
            }
        }
        vMeth1_check_sum += i4 + Double.doubleToLongBits(d1) + i5 + Float.floatToIntBits(f) + s1 + i18 + i19 + i20 +
            i21;
    }

    public void vMeth(double d) {

        int i=165, i1=0, i2=11230, i3=-93, i22=-33718, i23=-19452;
        short s2=21951;
        float fArr[][]=new float[N][N];

        FuzzerUtils.init(fArr, -2.1002F);

        for (i = 12; i < 389; i++) {
            Test.iArrFld[i - 1] = Test.iArrFld[i - 1];
            i1 >>= (int)(Test.instanceCount + -6996);
            for (i2 = 1; i2 < 4; ++i2) {
                Test.instanceCount *= i;
                vMeth1(i1, d, i1);
                i3 |= i2;
                for (i22 = 1; i22 < 2; ++i22) {
                    Test.instanceCount -= 46916;
                    i23 += i;
                    fArr[i + 1][i2] += Test.instanceCount;
                    i1 += i3;
                }
                i23 *= s2;
                Test.iArrFld[i2][i2 - 1] = i23;
                i23 *= i2;
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i + i1 + i2 + i3 + i22 + i23 + s2 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i24=5472, i25=6, i26=9, i27=-8, i28=-61, i29=23, i30=58476, i31=-14, i32=-11, i33=234, i34=-4539, i35=0,
            i36=-165, i37=9;
        byte by1=33;
        float f1=0.251F;
        boolean b=true;
        short s3=16756, sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-12222);

        vMeth(dFld);
        for (i24 = 142; i24 > 6; --i24) {
            i25 -= by1;
        }
        i25 += i25;
        sArr[(i24 >>> 1) % N] -= (short)-223;
        for (i26 = 16; 323 > i26; ++i26) {
            f1 = 82;
            do {
                i27 += (int)(f1 * f1);
                i27 = i25;
                i25 += i27;
                i25 = i26;
                for (i28 = 1; i28 < 1; ++i28) {
                    i27 += 31963;
                    i29 *= i24;
                }
            } while (--f1 > 0);
            for (i30 = 4; i30 < 82; i30++) {
                for (i32 = 1; i32 < 2; ++i32) {
                    i25 += (int)Test.instanceCount;
                    if (b) continue;
                }
                Test.instanceCount -= i32;
                Test.instanceCount = Test.instanceCount;
                i27 += i34;
                for (i35 = i26; i35 < 2; i35++) {
                    i27 += (i35 | i35);
                    i36 >>= i33;
                    try {
                        i34 = (14291 / Test.iArrFld[i26][i30 + 1]);
                        i27 = (149 / i33);
                        i31 = (i31 % i24);
                    } catch (ArithmeticException a_e) {}
                    i37 += (((i35 * i27) + Test.instanceCount) - Test.instanceCount);
                    s3 += (short)(i35 + i25);
                    Test.fFld -= f1;
                    Test.iArrFld[i35 - 1][i35] *= (int)f1;
                    Test.iArrFld[i26][i30 + 1] -= i37;
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
//DEBUG  dMeth ->  dMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
