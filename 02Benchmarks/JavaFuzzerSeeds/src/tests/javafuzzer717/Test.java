package tests.javafuzzer717;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 08:29:02 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-45084L;
    public static boolean bFld=true;
    public static byte byFld=-71;
    public static byte byArrFld[][]=new byte[N][N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)11);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(double d, byte by, int i11) {

        int i12=-29, i13=4, i14=-78, iArr2[]=new int[N];
        boolean b1=true;
        short s1=17413;
        float f1=-1.78F, f2=64.368F;

        FuzzerUtils.init(iArr2, -10);

        i11 = -93;
        for (i12 = 6; i12 < 225; ++i12) {
            try {
                i13 = (-225 / i12);
                i13 = (i12 / -87);
                i11 = (-3511 / iArr2[i12]);
            } catch (ArithmeticException a_e) {}
            if (b1) continue;
            Test.instanceCount += i13;
            i11 += (((i12 * i11) + Test.instanceCount) - Test.instanceCount);
            s1 = (short)0;
        }
        i13 += (int)f1;
        i11 <<= i12;
        for (f2 = 2; f2 < 238; f2++) {
            s1 += (short)f2;
            i14 <<= i13;
            d *= f1;
            Test.instanceCount <<= i14;
            i11 += i14;
        }
        vMeth2_check_sum += Double.doubleToLongBits(d) + by + i11 + i12 + i13 + (b1 ? 1 : 0) + s1 +
            Float.floatToIntBits(f1) + Float.floatToIntBits(f2) + i14 + FuzzerUtils.checkSum(iArr2);
    }

    public static void vMeth1(boolean b, float f, int i6) {

        int i7=1, i8=0, i9=-138, i10=-57097, iArr1[]=new int[N];
        short s=11888;
        double d1=-63.124384;
        byte by1=0;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -1L);
        FuzzerUtils.init(iArr1, 207);

        for (long l : lArr) {
            for (i7 = 1; i7 < 4; i7 += 2) {
                for (i9 = 1; i9 < 4; ++i9) {
                    i6 = (int)1102680757388517082L;
                    i6 += i9;
                    i10 += Math.max((int)((s - Test.instanceCount) * l), (int)(Test.instanceCount + f));
                    i10 = (int)(((--l) + (i8 * i8)) + ((i8 - i6) + (-63231L * (++i8))));
                    iArr1[i7 + 1] *= (int)(((l * i8) - (i10++)) + -251);
                }
                i8 = (int)(((i8--) >>> i6) * ((l + 11.214F) - (i9 | l)));
            }
            f += i10;
            vMeth2(d1, by1, i10);
            i8 >>= i10;
        }
        Test.byArrFld = Test.byArrFld;
        Test.instanceCount = i7;
        vMeth1_check_sum += (b ? 1 : 0) + Float.floatToIntBits(f) + i6 + i7 + i8 + i9 + i10 + s +
            Double.doubleToLongBits(d1) + by1 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
    }

    public void vMeth(int i2, int i3, int i4) {

        int i5=125, iArr[]=new int[N];

        FuzzerUtils.init(iArr, 5);

        i5 = 1;
        while (++i5 < 213) {
            iArr = (iArr = iArr);
            vMeth1(Test.bFld, 2.124F, i3);
            i3 -= (int)71.926F;
        }
        vMeth_check_sum += i2 + i3 + i4 + i5 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i=7, i1=211, i15=97, i16=5, i17=-42424, i18=12, i19=242, i20=5, iArr3[]=new int[N];
        float f3=-98.626F;
        double d2=-24.14092;
        short s2=31893;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr3, 6);
        FuzzerUtils.init(lArr1, 3212551738030008304L);

        for (i = 6; 337 > i; ++i) {
            vMeth(i, i1, i);
            if (Test.bFld) break;
            Test.bFld = Test.bFld;
            i1 += (i + Test.instanceCount);
            f3 = i1;
            d2 *= -2;
            if (Test.bFld) continue;
            i1 += i;
        }
        if (Test.bFld) {
            switch (((i1 >>> 1) % 7) + 20) {
            case 20:
                i15 = 1;
                do {
                    i16 = 1;
                    do {
                        i17 = 1;
                        do {
                            iArr3[i15 - 1] *= (int)Test.instanceCount;
                            lArr1[i16 + 1] >>= i16;
                            i1 -= i;
                            i1 += (int)(-5228060694132239845L + (i17 * i17));
                            i1 = i16;
                            d2 %= ((long)(d2) | 1);
                            f3 = Test.byFld;
                        } while (++i17 < 1);
                        f3 += f3;
                        i18 = (int)Test.instanceCount;
                        try {
                            i1 = (i16 / -46994);
                            iArr3[i16] = (-45158 % i18);
                            i1 = (-1225502897 % i16);
                        } catch (ArithmeticException a_e) {}
                        for (i19 = 1; i19 > 1; i19--) {
                            i20 += (int)Test.instanceCount;
                            i18 = (int)Test.instanceCount;
                            i1 = i18;
                            i20 = i1;
                            s2 *= (short)Test.instanceCount;
                        }
                    } while (++i16 < 71);
                } while (++i15 < 355);
                break;
            case 21:
                i18 -= 203;
                break;
            case 22:
                d2 -= i15;
                break;
            case 23:
            case 24:
            case 25:
                i18 -= (int)Test.instanceCount;
            case 26:
                d2 = Test.instanceCount;
            default:
                i1 = i;
            }
        } else if (Test.bFld) {
            i18 += (int)Test.instanceCount;
        } else {
            Test.bFld = Test.bFld;
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
