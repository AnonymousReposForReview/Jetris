package tests.javafuzzer2762;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 19:50:25 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=5290242747838563276L;
    public static short sFld=5427;
    public byte byFld=33;
    public int iArrFld[][]=new int[N][N];
    public static int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld1, 119);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i9, long l) {

        boolean b=true;
        int i10=1, i11=8, i12=2, i13=-3, i14=6, i15=-196;
        float f1=-2.599F;

        b = true;
        i9 -= i9;
        Test.iArrFld1[(-14510 >>> 1) % N] *= 831;
        for (i10 = 7; i10 < 183; ++i10) {
            f1 += (((i10 * i11) + i9) - f1);
            Test.instanceCount = i11;
        }
        Test.sFld -= (short)i11;
        for (i12 = 381; i12 > 14; --i12) {
            if (false) {
                l -= i11;
                Test.sFld += (short)(((i12 * Test.instanceCount) + i13) - l);
                for (i14 = 5; i14 > i12; i14--) {
                    byte by=16;
                    f1 = i11;
                    l = by;
                    try {
                        i11 = (Test.iArrFld1[i14 - 1] % -26);
                        i15 = (i15 % i12);
                        i9 = (i12 / i9);
                    } catch (ArithmeticException a_e) {}
                }
            } else if (b) {
                Test.instanceCount = -57867;
            } else {
                i15 -= (int)l;
            }
        }
        long meth_res = i9 + l + (b ? 1 : 0) + i10 + i11 + Float.floatToIntBits(f1) + i12 + i13 + i14 + i15;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(float f, int i8) {

        int i16=-27944, i17=199, i18=-27, i19=-223, i20=6;
        byte by1=116;
        boolean b1=false;

        Test.iArrFld1[(i8 >>> 1) % N] += iMeth1(18578, Test.instanceCount);
        for (i16 = 12; i16 < 395; i16 += 2) {
            for (i18 = i16; i18 < 8; ++i18) {
                Test.instanceCount -= by1;
                i20 = 1;
                while (++i20 < 1) {
                    if (b1) continue;
                    i19 = -48167;
                    by1 += (byte)i20;
                    switch (((i18 % 2) * 5) + 86) {
                    case 91:
                        i17 += (int)Test.instanceCount;
                        Test.instanceCount &= Test.instanceCount;
                        break;
                    case 96:
                    default:
                        f = -9099;
                        i17 = i19;
                        i8 += (((i20 * Test.sFld) + i8) - i8);
                        i8 = -43234;
                    }
                }
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i8 + i16 + i17 + i18 + i19 + by1 + i20 + (b1 ? 1 : 0);
    }

    public static int iMeth(int i5) {

        int i6=53356, i7=-24, i21=13715, i22=-28480;
        float f2=-1.419F, f3=-42.155F;
        double d=61.61377;

        for (i6 = 8; i6 < 182; ++i6) {
            vMeth(f2, i5);
            f3 = 1;
            while (++f3 < 9) {
                i7 -= (int)85.92F;
                Test.iArrFld1 = Test.iArrFld1;
                i5 = 11;
                for (i21 = 1; i21 < 1; ++i21) {
                    d += -72.28F;
                    i7 = i21;
                    Test.instanceCount -= i6;
                    f2 += ((long)i21 | (long)i6);
                    Test.iArrFld1[(int)(f3 + 1)] += i6;
                    i7 <<= i5;
                    f2 -= i7;
                    Test.instanceCount *= i7;
                }
            }
        }
        long meth_res = i5 + i6 + i7 + Float.floatToIntBits(f2) + Float.floatToIntBits(f3) + i21 + i22 +
            Double.doubleToLongBits(d);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=63325, i1=-13138, i2=-49289, i3=-184, i4=27040, i23=40772, i24=5, i25=-11, i26=6241, i27=0, i28=-27504,
            i29=42683, i30=162;
        boolean b2=true;
        double d2=0.99071;
        float f4=0.1018F, fArr[][]=new float[N][N];
        long l1=-6116907083085774247L, lArr[]=new long[N];

        FuzzerUtils.init(lArr, -48185L);
        FuzzerUtils.init(fArr, -2.582F);

        for (i = 9; 234 > i; i++) {
            iArrFld[i - 1][i] += (int)Test.instanceCount;
            i1 *= iArrFld[i][i];
        }
        i2 = 1;
        while (++i2 < 293) {
            for (i3 = 3; i3 < 86; ++i3) {
                if ((--iArrFld[i2 + 1][i2 + 1]) >= iMeth(i1)) break;
                for (i23 = 1; i23 < 2; i23++) {
                    double d1=0.112447;
                    lArr[i3] -= (long)d1;
                    if (b2) continue;
                }
                switch (((i3 % 1) * 5) + 53) {
                case 57:
                    i1 += i3;
                    iArrFld[i3 + 1][i2] += i24;
                    for (i25 = 1; i25 < 2; i25 += 2) {
                        d2 -= 3L;
                        Test.instanceCount -= i25;
                        fArr[i2][i2] *= f4;
                        f4 -= Test.instanceCount;
                    }
                    i26 = Test.sFld;
                    break;
                default:
                    i1 = 1;
                    Test.instanceCount -= 38;
                    l1 -= l1;
                    f4 += l1;
                }
                lArr[i2] = -193;
                i1 |= byFld;
            }
            fArr[i2][i2] -= i26;
            for (i27 = 86; i27 > i2; i27 -= 3) {
                for (i29 = i27; i29 < 1; i29++) {
                    i28 += i29;
                    Test.sFld -= (short)i27;
                    lArr[i2 + 1] -= (long)f4;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
