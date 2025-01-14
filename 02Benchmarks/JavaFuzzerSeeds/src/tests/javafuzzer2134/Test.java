package tests.javafuzzer2134;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 09:20:28 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=5071044806438763206L;
    public static volatile byte byFld=-115;
    public static boolean bFld=false;
    public static short sFld=-2913;
    public byte byFld1=-22;
    public static float fArrFld[]=new float[N];
    public long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 91.285F);
        FuzzerUtils.init(Test.iArrFld, 10);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(double d1, long l, boolean b1) {

        int i10=129, i11=-20831, i12=10, i13=-54797, i14=-10, i15=-251, i16=-17923, i17=13175;

        for (i10 = 8; i10 < 338; ++i10) {
            i11 += i11;
            i11 |= i11;
            Test.iArrFld[(i11 >>> 1) % N] += i10;
            i12 = 1;
            do {
                i11 += i10;
            } while (++i12 < 5);
            Test.iArrFld[i10] *= (int)l;
            i11 += -210;
        }
        i11 *= (int)d1;
        for (i13 = 7; i13 < 143; i13 += 3) {
            i15 = 1;
            do {
                i14 = i12;
            } while (++i15 < 34);
            for (i16 = 1; 34 > i16; ++i16) {
                i11 += i16;
                Test.iArrFld[i16 - 1] <<= (int)-1143206369969607650L;
            }
        }
        vMeth2_check_sum += Double.doubleToLongBits(d1) + l + (b1 ? 1 : 0) + i10 + i11 + i12 + i13 + i14 + i15 + i16 +
            i17;
    }

    public void vMeth1(double d, int i4, int i5) {

        int i6=231, i7=4, i8=3, i9=-1, i18=7;
        double d2=-1.90663;
        short s=-25756, sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)15613);

        i6 = 1;
        while (++i6 < 172) {
            sArr[i6] = (short)((~(long)(2913304691L * (d - i6))) * (lArrFld[i6 + 1] - Test.instanceCount));
            for (i7 = 1; i7 < 9; ++i7) {
                i9 = 1;
                do {
                    i5 = (--Test.byFld);
                    d += Math.min(-Math.min(Test.instanceCount, Test.instanceCount), ++Test.instanceCount);
                    vMeth2(d, -7L, Test.bFld);
                    Test.iArrFld[i7] = i9;
                    d = -1632;
                } while (++i9 < 2);
                i4 *= -15869;
                for (d2 = i6; d2 < 2; ++d2) {
                    try {
                        i5 = (-5 % Test.iArrFld[(int)(d2)]);
                        i8 = (Test.iArrFld[i6 + 1] / i8);
                        i18 = (i8 / -24292);
                    } catch (ArithmeticException a_e) {}
                    i8 += (int)(((d2 * i18) + i7) - i7);
                    s /= (short)(i7 | 1);
                    i4 += (int)(((d2 * i9) + i18) - i4);
                }
            }
        }
        vMeth1_check_sum += Double.doubleToLongBits(d) + i4 + i5 + i6 + i7 + i8 + i9 + Double.doubleToLongBits(d2) +
            i18 + s + FuzzerUtils.checkSum(sArr);
    }

    public void vMeth(int i1, boolean b) {

        int i2=-21, i3=-141, i20=-33824, i21=-1107, i22=61910, i23=-15624, i24=-7;
        float f=-2.498F;

        for (i2 = 276; i2 > 4; i2 -= 3) {
            vMeth1(0.21682, -64443, i1);
            for (i20 = 1; i20 < 17; i20++) {
                Test.sFld += (short)i20;
                Test.bFld = true;
                b = b;
            }
            i3 = (int)-15255L;
        }
        i3 += (int)f;
        i21 = 121;
        i22 = 1;
        while (++i22 < 202) {
            Test.instanceCount = byFld1;
            Test.iArrFld[i22] -= (int)-580669402L;
            for (i23 = 1; i23 < 8; i23++) {
                i24 >>>= (int)Test.instanceCount;
                i3 -= Test.sFld;
            }
        }
        vMeth_check_sum += i1 + (b ? 1 : 0) + i2 + i3 + i20 + i21 + Float.floatToIntBits(f) + i22 + i23 + i24;
    }

    public void mainTest(String[] strArr1) {

        int i=4415;

        i = 9;
        i = (int)Test.fArrFld[(i >>> 1) % N];
        vMeth(i, Test.bFld);
        i >>= -6;
        i = (int)Test.instanceCount;
        Test.instanceCount -= i;
        i *= i;
        Test.fArrFld[(i >>> 1) % N] = i;


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
