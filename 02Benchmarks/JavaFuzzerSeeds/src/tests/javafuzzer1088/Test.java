package tests.javafuzzer1088;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 14:16:29 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-8L;
    public static double dFld=2.83827;
    public short sFld=15485;
    public static volatile float fFld=114.162F;
    public static long lArrFld[][]=new long[N][N];
    public static volatile int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 1433706961L);
        FuzzerUtils.init(Test.iArrFld, 38605);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i9=6, i10=51490, i11=-2, i12=-41875, i13=21, i14=28144, i15=-81, i16=254;
        float f=-1.631F;
        boolean b=false;

        Test.lArrFld[(i9 >>> 1) % N][(i9 >>> 1) % N] |= i9;
        for (f = 7; 259 > f; f++) {
            for (i11 = 6; i11 > 1; i11--) {
                i12 = (int)f;
            }
            i9 += (int)(f * f);
            if (i11 != 0) {
                vMeth2_check_sum += i9 + Float.floatToIntBits(f) + i10 + i11 + i12 + i13 + i14 + i15 + i16 + (b ? 1 :
                    0);
                return;
            }
            for (i13 = 1; 6 > i13; ++i13) {
                for (i15 = (int)(f); i15 < 2; i15 += 3) {
                    if (b) continue;
                    i16 *= -25846;
                    if (i15 != 0) {
                        vMeth2_check_sum += i9 + Float.floatToIntBits(f) + i10 + i11 + i12 + i13 + i14 + i15 + i16 + (b
                            ? 1 : 0);
                        return;
                    }
                    i10 = (int)f;
                    Test.instanceCount = i16;
                    i12 += (((i15 * i13) + i15) - i9);
                    i9 /= (int)(i16 | 1);
                }
            }
        }
        vMeth2_check_sum += i9 + Float.floatToIntBits(f) + i10 + i11 + i12 + i13 + i14 + i15 + i16 + (b ? 1 : 0);
    }

    public static void vMeth1(int i4, int i5, int i6) {

        int i7=-2, i8=-2285, i17=19129, i18=5, i19=36, i20=9, i21=-6, i22=130;
        float f1=0.126F;
        byte by=26;
        long l1=8L;

        for (i7 = 10; i7 < 202; i7++) {
            vMeth2();
            for (i17 = 1; 8 > i17; ++i17) {
                Test.dFld *= i17;
                if (i18 != 0) {
                    vMeth1_check_sum += i4 + i5 + i6 + i7 + i8 + i17 + i18 + Float.floatToIntBits(f1) + i19 + by + l1 +
                        i20 + i21 + i22;
                    return;
                }
                f1 += i17;
            }
            try {
                Test.iArrFld[i7 + 1] = (i19 % i6);
                i19 = (-241 / i17);
                i8 = (i18 / 52021);
            } catch (ArithmeticException a_e) {}
            by = (byte)i4;
            i5 = i5;
            for (l1 = i7; l1 < 8; l1++) {
                for (i21 = 1; i21 < 1; i21++) {
                    try {
                        Test.iArrFld[(int)(l1)] = (i19 % 391823841);
                        i22 = (-3423 / i8);
                        i6 = (i6 % -17542);
                    } catch (ArithmeticException a_e) {}
                    f1 -= i7;
                    i19 *= i21;
                    i22 += (int)Test.instanceCount;
                }
            }
        }
        vMeth1_check_sum += i4 + i5 + i6 + i7 + i8 + i17 + i18 + Float.floatToIntBits(f1) + i19 + by + l1 + i20 + i21 +
            i22;
    }

    public void vMeth(long l) {

        int i2=19390, i3=-149;
        short s=29076;

        i2 = i2;
        Test.iArrFld[(i3 >>> 1) % N] = (++i3);
        s -= (short)(Test.instanceCount--);
        vMeth1(i3, -4, i2);
        vMeth_check_sum += l + i2 + i3 + s;
    }

    public void mainTest(String[] strArr1) {

        int i=-15988, i1=-137, i23=-62762, i24=-145, i25=29591, i26=14, i27=62, i28=-18610, i29=-81;
        boolean b1=true;
        float f2=0.716F;
        byte by1=-84;
        double d=100.124590;

        for (i = 17; i < 322; ++i) {
            if (b1) {
                Test.lArrFld[i] = (Test.lArrFld[i - 1] = (Test.lArrFld[i - 1] = (Test.lArrFld[i - 1] =
                    FuzzerUtils.long1array(N, (long)-2974213083804839646L))));
            } else if (b1) {
                vMeth(Test.instanceCount);
                i1 |= i;
            } else {
                i1 = (int)Test.dFld;
                for (i23 = 5; i23 < 82; ++i23) {
                    for (f2 = 1; f2 < 2; f2++) {
                        Test.lArrFld[(int)(f2 - 1)] = Test.lArrFld[i];
                        i25 = (int)Test.dFld;
                    }
                    i25 += i25;
                    i26 = 1;
                    while (++i26 < 2) {
                        sFld += (short)(((i26 * i) + i26) - i23);
                        i25 += i25;
                        Test.dFld += i24;
                    }
                    i24 = (int)Test.fFld;
                    for (i27 = 1; i27 < 2; ++i27) {
                        i28 = i1;
                        Test.instanceCount >>= i28;
                        i25 = i23;
                        i25 = (int)-2804593943L;
                        i25 += (((i27 * f2) + i26) - by1);
                        Test.instanceCount += -2;
                    }
                    for (d = 1; 2 > d; d++) {
                        Test.dFld = i25;
                        i1 = i29;
                        i28 *= i27;
                    }
                    if (b1) break;
                    i28 += sFld;
                }
                Test.iArrFld = Test.iArrFld;
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
