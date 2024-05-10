package tests.javafuzzer192;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 23:48:54 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-3427333660520445700L;
    public static int iFld=252;
    public static int iFld1=-47023;
    public static double dFld=1.14667;
    public static int iArrFld[]=new int[N];
    public static volatile float fArrFld[][]=new float[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, -12);
        FuzzerUtils.init(Test.fArrFld, 1.186F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i3) {

        int i4=-131, i5=56022, i6=-203, i7=-145, i8=-161, i9=149;
        boolean b1=false;

        Test.iFld1 += Test.iFld1;
        for (i4 = 332; i4 > 1; i4 -= 2) {
            Test.iFld += (((i4 * i4) + i3) - Test.iFld1);
            for (i6 = i4; i6 < 10; i6 += 3) {
                i5 = i4;
                Test.instanceCount += (long)-56.940F;
                Test.iArrFld[i6 + 1] -= (int)-4L;
                i5 = i6;
                Test.iFld1 += i5;
                for (i8 = 1; i8 < 1; ++i8) {
                    b1 = false;
                    i9 += (((i8 * i8) + Test.instanceCount) - Test.instanceCount);
                    Test.fArrFld[i8 - 1][i4] = i5;
                    Test.instanceCount >>>= Test.iFld;
                    if (b1) continue;
                }
            }
        }
        vMeth2_check_sum += i3 + i4 + i5 + i6 + i7 + i8 + i9 + (b1 ? 1 : 0);
    }

    public static void vMeth1(long l1, float f2) {

        boolean b2=false;
        int i10=-26633, i11=34, i12=11, i13=-7, i14=231, i15=-50239;
        short s=18268;

        if (b2) {
            vMeth2(Test.iFld1);
            Test.instanceCount -= (long)1.329F;
        } else {
            for (i10 = 7; i10 < 137; ++i10) {
                Test.instanceCount = l1;
                f2 += (i10 * Test.iFld);
                for (i12 = 1; i12 < 12; i12++) {
                    Test.iArrFld[i10 - 1] >>>= (int)l1;
                    for (i14 = 1; i14 < 2; i14++) {
                        Test.instanceCount *= i12;
                        f2 += Test.iFld;
                        Test.instanceCount /= (Test.iFld1 | 1);
                        Test.iFld = 1828;
                        i15 += (((i14 * f2) + Test.iFld1) - Test.iFld);
                        s += (short)(i14 + i13);
                    }
                }
            }
        }
        vMeth1_check_sum += l1 + Float.floatToIntBits(f2) + (b2 ? 1 : 0) + i10 + i11 + i12 + i13 + i14 + i15 + s;
    }

    public static void vMeth(long l, float f1) {

        int i16=0, i17=-231, i18=-48556, i19=-170, i20=53192;
        byte by=-127;

        Test.iFld = (-Test.iArrFld[(Test.iFld1 >>> 1) % N]);
        vMeth1(l, f1);
        i16 = 202;
        while ((i16 -= 2) > 0) {
            l = i16;
            Test.iFld1 = (int)f1;
            Test.iFld = (int)l;
            Test.iArrFld[i16] += Test.iFld;
            i17 = 15;
            do {
                Test.iFld1 += (int)Test.instanceCount;
                Test.iArrFld[i17] = 18024;
                for (i18 = i16; i18 < 1; i18++) {
                    Test.dFld -= -44718;
                    Test.iFld1 -= i16;
                }
                by += (byte)(((i17 * i20) + i18) - i18);
            } while (--i17 > 0);
        }
        i19 *= i18;
        vMeth_check_sum += l + Float.floatToIntBits(f1) + i16 + i17 + i18 + i19 + by + i20;
    }

    public void mainTest(String[] strArr1) {

        int i=17368, i1=227, i2=6, i21=11, i22=49989, i23=48, i24=3, i25=123, i26=5, i27=-125, i28=52692;
        boolean b=false;
        float f=1.213F, f3=-2.175F;
        byte by1=12;
        short s1=-32243;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 3635537385L);

        i = Math.max(-(i + i), i--);
        i1 = 1;
        do {
            b = b;
            for (f = 183; f > 9; f--) {
                vMeth(-222L, 1.262F);
                Test.instanceCount += (long)Test.dFld;
                Test.fArrFld[(int)(f)][i1 - 1] = Test.iFld1;
                for (i21 = 1; i21 < 2; i21++) {
                    Test.instanceCount = i;
                    i = i2;
                    Test.fArrFld[(int)(f)][i1] *= f;
                    Test.iFld1 += -54561;
                }
                i22 <<= i;
                Test.instanceCount += (long)(f * Test.iFld1);
                i22 -= i21;
            }
            for (i23 = i1; i23 < 183; ++i23) {
                i24 *= (int)Test.instanceCount;
            }
            Test.iArrFld = FuzzerUtils.int1array(N, (int)-44573);
            by1 += (byte)(((i1 * Test.iFld) + Test.instanceCount) - Test.iFld);
            Test.iFld1 += i1;
            for (i25 = 7; 183 > i25; i25++) {
                f3 += (((i25 * Test.iFld1) + i22) - s1);
                by1 += (byte)i25;
                lArr[i25] -= by1;
                Test.iFld += (((i25 * f) + i23) - Test.instanceCount);
                Test.instanceCount += (i25 + i2);
                switch (((i25 % 2) * 5) + 69) {
                case 73:
                    for (i27 = 2; 1 < i27; i27--) {
                        Test.iFld += i27;
                        try {
                            i24 = (-220 / i24);
                            i = (735417250 / i25);
                            i22 = (178 / i);
                        } catch (ArithmeticException a_e) {}
                    }
                case 71:
                default:
                    s1 += (short)-58526;
                }
            }
        } while (++i1 < 137);


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
