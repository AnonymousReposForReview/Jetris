package tests.javafuzzer3300;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 05:40:42 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=8L;
    public static volatile float fFld=0.532F;
    public static volatile int iFld=186;
    public static byte byFld=98;
    public static boolean bFld=false;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -22630);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i10) {

        int i11=156, i12=8, i13=64704, i14=13586, i15=33615;
        byte by=-92;
        float f1=2.819F;

        for (i11 = 9; i11 < 248; i11++) {
            i13 += (i11 - by);
            i14 = 1;
            while (++i14 < 7) {
                float f=2.120F;
                f += Test.instanceCount;
                try {
                    i13 = (77 / i14);
                    i13 = (i12 % i12);
                    i12 = (Test.iArrFld[i11] / i10);
                } catch (ArithmeticException a_e) {}
            }
            i15 = 7;
            do {
                i12 &= (int)Test.instanceCount;
                i13 = i13;
                f1 = -155;
                Test.iArrFld[i11] += 30339;
                i12 *= (int)Test.fFld;
                if (false) break;
                i12 = (int)f1;
                i10 -= i15;
                i12 = i10;
            } while ((i15 -= 2) > 0);
        }
        vMeth1_check_sum += i10 + i11 + i12 + i13 + by + i14 + i15 + Float.floatToIntBits(f1);
    }

    public int iMeth(int i8) {

        short s=-5553;
        double d=69.45094;
        int i9=20649, i16=-4, i17=-34462, i19=200, i20=4512, i21=-14, iArr[]=new int[N];
        boolean b=false;
        byte by1=11;

        FuzzerUtils.init(iArr, -204);

        if (b) {
            i8 = (int)(((iArr[(i8 >>> 1) % N] = s) + Math.min(i8, i8)) + d);
            i9 = 1;
            do {
                vMeth1(i8);
            } while (++i9 < 210);
            for (i16 = 10; i16 < 233; ++i16) {
                if (b) {
                    i17 -= i16;
                }
                for (i19 = 1; 7 > i19; i19++) {
                    i8 += (((i19 * i8) + i17) - i16);
                    Test.fFld -= Test.instanceCount;
                    Test.fFld *= i19;
                }
                Test.iArrFld[i16 - 1] *= i19;
                try {
                    i8 = (iArr[i16] % i19);
                    iArr[i16 - 1] = (i19 / Test.iArrFld[i16 + 1]);
                    i21 = (i21 % i20);
                } catch (ArithmeticException a_e) {}
                s += (short)i16;
                Test.instanceCount += (i16 | i9);
            }
        } else {
            by1 += (byte)i20;
        }
        long meth_res = i8 + s + Double.doubleToLongBits(d) + i9 + i16 + i17 + (b ? 1 : 0) + i19 + i20 + i21 + by1 +
            FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth(int i, int i1, int i2) {

        int i3=-35733, i4=2, i5=-35075, i6=-34912, i7=-58, i22=10, i23=11, i24=121;

        for (i3 = 7; i3 < 207; i3++) {
            i2 <<= (i4 + Integer.reverseBytes((int)(Test.instanceCount - 235)));
            i1 *= i4;
            for (i5 = 1; 8 > i5; i5 += 2) {
                i7 ^= iMeth(i3);
                i22 = (int)Test.instanceCount;
                for (i23 = 1; i23 < 3; i23++) {
                    i7 += i23;
                    i2 >>= (int)Test.instanceCount;
                    i22 = (int)Test.instanceCount;
                    Test.instanceCount += i;
                }
                Test.fFld = -54078;
                i4 <<= i6;
            }
            i24 += (-10 + (i3 * i3));
            Test.fFld += (i3 - Test.fFld);
        }
        vMeth_check_sum += i + i1 + i2 + i3 + i4 + i5 + i6 + i7 + i22 + i23 + i24;
    }

    public void mainTest(String[] strArr1) {

        int i25=-2, i26=-42472, i27=-28845, i28=6, i29=-14, i30=-8, i31=-12874, i32=28, i33=-7, i34=-7;
        long l=160142980L;
        double d1=0.42197;
        short s1=16180;

        vMeth(Test.iFld, Test.iFld, -190);
        for (i25 = 12; i25 < 248; ++i25) {
            i26 = i26;
        }
        Test.fFld += i25;
        Test.iFld = 2;
        i26 = 13;
        i27 = 1;
        do {
            Test.iFld = 30574;
            Test.instanceCount *= (long)1.87660;
            Test.iFld = (int)Test.fFld;
            Test.iArrFld[i27 + 1] = i27;
            if (true) continue;
            for (l = 1; l < 321; l++) {
                switch ((((i25 >>> 1) % 1) * 5) + 57) {
                case 60:
                    for (i29 = 1; i29 < 2; i29++) {
                        i30 -= (int)l;
                        d1 = Test.fFld;
                    }
                    for (i31 = 1; i31 < 2; ++i31) {
                        Test.byFld = (byte)d1;
                        i32 = i26;
                        try {
                            i30 = (i32 % -33661);
                            i28 = (i30 / -8915);
                            i28 = (48637 % i32);
                        } catch (ArithmeticException a_e) {}
                        Test.bFld = Test.bFld;
                        i26 += i31;
                        try {
                            i30 = (Test.iArrFld[i27 - 1] % i32);
                            i26 = (Test.iArrFld[i27 + 1] / Test.iArrFld[i31]);
                            i28 = (-207 / i30);
                        } catch (ArithmeticException a_e) {}
                        Test.iFld -= s1;
                    }
                    for (i33 = 1; 2 > i33; i33++) {
                        i26 *= i25;
                        i34 += (((i33 * Test.fFld) + i25) - Test.iFld);
                        i26 = i34;
                        i26 += i33;
                    }
                }
            }
        } while ((i27 += 2) < 157);


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
