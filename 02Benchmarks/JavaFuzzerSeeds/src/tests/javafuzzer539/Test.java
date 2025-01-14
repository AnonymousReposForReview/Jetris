package tests.javafuzzer539;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 05:26:25 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1239923243L;
    public static boolean bFld=true;
    public static float fFld=0.6F;
    public static short sFld=-2022;
    public static byte byFld=-47;
    public int iFld=157;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 4);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i4) {

        byte by=-106;
        int i5=-234, i6=10, iArr[][]=new int[N][N];
        float f1=-2.688F;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -13.50483);
        FuzzerUtils.init(iArr, -36573);

        for (double d : dArr) {
            if (Test.bFld) break;
            i4 <<= i4;
            i4 += by;
            i5 = 1;
            while (++i5 < 4) {
                i4 += i5;
                i4 <<= i4;
                i4 = i5;
                i6 = 1;
                do {
                    short s1=-1385;
                    Test.instanceCount = s1;
                    f1 = i6;
                    iArr[i6 - 1][i5] <<= (int)Test.instanceCount;
                    try {
                        i4 = (i4 / iArr[i5][i5 - 1]);
                        i4 = (i4 / 138);
                        i4 = (-251 / i6);
                    } catch (ArithmeticException a_e) {}
                    i4 += i4;
                    i4 = -119;
                } while (--i6 > 0);
            }
        }
        vMeth2_check_sum += i4 + by + i5 + i6 + Float.floatToIntBits(f1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(short s, int i3) {

        float f2=67.753F;
        int i7=-12, i8=-14, i9=-206;
        double d1=61.125265;

        i3 <<= i3;
        vMeth2(i3);
        try {
            for (f2 = 327; f2 > 9; f2--) {
                if (Test.bFld) continue;
                for (i8 = 5; i8 > 1; i8--) {
                    i9 += i8;
                    s += (short)(((i8 * i9) + i9) - i9);
                    d1 /= (Test.instanceCount | 1);
                    Test.iArrFld[(int)(f2)] += i8;
                    i3 <<= i9;
                    i3 = i8;
                    i9 += (((i8 * i9) + i7) - i3);
                    i9 = i3;
                }
                Test.iArrFld[(int)(f2)] |= i7;
            }
        }
        catch (ArrayIndexOutOfBoundsException exc2) {
            Test.fFld -= i3;
        }
        catch (UserDefinedExceptionTest exc3) {
            Test.iArrFld[(i9 >>> 1) % N] = i9;
        }
        vMeth1_check_sum += s + i3 + Float.floatToIntBits(f2) + i7 + i8 + i9 + Double.doubleToLongBits(d1);
    }

    public static void vMeth() {

        int i=7, i1=21041, i2=-6801, i10=235;
        float f=0.91F;
        double d2=71.106842, dArr1[]=new double[N];

        FuzzerUtils.init(dArr1, 18.12979);

        i -= (int)((i -= (i - i)) << (++Test.instanceCount));
        f -= Test.instanceCount;
        Test.instanceCount >>>= -56074;
        for (i1 = 7; i1 < 361; ++i1) {
            if ((((i2 -= (int)Test.instanceCount) * Math.max(i2, i)) - (++i2)) != (((~(i2++)) - (i1 + -249L)) * (-247 -
                (4 - (Test.instanceCount = i2))))) break;
            i2 = 11;
            vMeth1(Test.sFld, i);
            i = i;
            Test.iArrFld[i1 + 1] += i1;
            for (d2 = 1; 5 > d2; d2++) {
                Test.fFld = -27357;
                if (Test.bFld) continue;
                dArr1[i1] *= i1;
                if (Test.bFld) break;
                Test.instanceCount = 123;
            }
        }
        vMeth_check_sum += i + Float.floatToIntBits(f) + i1 + i2 + Double.doubleToLongBits(d2) + i10 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
    }

    public void mainTest(String[] strArr1) {

        int i11=-12, i12=20155, i13=-64105, i14=0, i15=25661, i16=2, i17=24379, i18=-60896, i19=-41935, i20=38496,
            i21=47085;
        double d3=65.58060, d4=-85.104788;

        vMeth();
        i11 *= -2524;
        i11 ^= -12;
        for (i12 = 1; i12 < 299; i12++) {
            Test.instanceCount *= Test.byFld;
            i13 += i12;
        }
        i13 = i13;
        i13 -= 115;
        Test.iArrFld[(i13 >>> 1) % N] *= i12;
        i11 <<= i12;
        if (false) {
            d3 = 1;
            while ((d3 += 2) < 342) {
                for (i14 = 9; i14 < 147; ++i14) {
                    i11 = 6;
                    i11 += (i14 - i13);
                    i13 = -9;
                }
                Test.bFld = Test.bFld;
                i13 = (int)Test.instanceCount;
                Test.instanceCount += (long)(((d3 * Test.instanceCount) + i11) - Test.instanceCount);
            }
            i13 >>= (int)Test.instanceCount;
            for (i16 = 15; i16 < 262; ++i16) {
                i15 -= Test.byFld;
                i11 -= (int)Test.instanceCount;
                d4 *= Test.instanceCount;
                for (i18 = i16; i18 < 102; i18++) {
                    i19 = (int)2.3F;
                    for (i20 = 1; i20 > 1; i20 -= 2) {
                        i21 *= i21;
                        Test.instanceCount = i16;
                        Test.fFld = i20;
                    }
                }
            }
        } else if (Test.bFld) {
            Test.instanceCount += i16;
        } else if (false) {
            i17 >>>= Test.byFld;
        } else {
            Test.instanceCount *= iFld;
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
class UserDefinedExceptionTest extends RuntimeException {
    public int field;
}

//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
