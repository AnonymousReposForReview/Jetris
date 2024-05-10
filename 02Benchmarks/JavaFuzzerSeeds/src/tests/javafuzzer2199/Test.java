package tests.javafuzzer2199;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 10:07:42 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2528792048L;
    public static volatile float fFld=55.587F;
    public static byte byFld=1;
    public static double dFld=2.98432;
    public boolean bFld=false;
    public static int iArrFld[]=new int[N];
    public double dArrFld[]=new double[N];
    public long lArrFld[]=new long[N];
    public static short sArrFld[][]=new short[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 7773);
        FuzzerUtils.init(Test.sArrFld, (short)-22745);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        long l=0L;
        int i9=-110, i10=9;
        short s1=-16989;
        double d=-3.57432;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-106);

        for (l = 11; l < 225; l++) {
            Test.iArrFld[(int)(l)] -= s1;
            s1 *= (short)i9;
            s1 = (short)i9;
            switch ((int)((l % 2) + 11)) {
            case 11:
                byArr[(int)(l)] += (byte)d;
                try {
                    i9 = (i9 / -8224);
                    i9 = (i9 % i9);
                    i9 = (i9 / 138);
                } catch (ArithmeticException a_e) {}
                i10 = 1;
                do {
                    i9 -= (int)Test.instanceCount;
                    switch (((27633 >>> 1) % 7) + 89) {
                    case 89:
                        Test.fFld -= Test.byFld;
                        Test.fFld += (i10 * i10);
                        i9 = 29;
                        i9 = (int)l;
                        break;
                    case 90:
                        i9 += i10;
                    case 91:
                        i9 = 6;
                        break;
                    case 92:
                        i9 >>= i9;
                        break;
                    case 93:
                        Test.instanceCount -= i9;
                        break;
                    case 94:
                        Test.iArrFld[(int)(l)] = i10;
                    case 95:
                        i9 += (i10 * i10);
                    }
                } while (++i10 < 8);
                break;
            case 12:
                i9 -= i9;
                break;
            }
        }
        vMeth2_check_sum += l + i9 + s1 + Double.doubleToLongBits(d) + i10 + FuzzerUtils.checkSum(byArr);
    }

    public static void vMeth1(int i5, int i6) {

        int i7=-4, i8=-178;
        short s=-3947;
        boolean b=true;

        for (i7 = 1; i7 < 141; ++i7) {
            i8 = s;
            i6 += (int)(-5.102F + (i7 * i7));
            vMeth2();
            Test.iArrFld[i7] *= -53177;
            switch ((i7 % 4) + 55) {
            case 55:
                Test.iArrFld[i7 + 1] <<= i8;
                break;
            case 56:
                try {
                    i8 = (Test.iArrFld[i7] / i6);
                    i5 = (i8 % 11);
                    i5 = (12585 / i6);
                } catch (ArithmeticException a_e) {}
                break;
            case 57:
                Test.fFld /= (i5 | 1);
                Test.instanceCount -= i7;
            case 58:
                if (i7 != 0) {
                    vMeth1_check_sum += i5 + i6 + i7 + i8 + s + (b ? 1 : 0);
                    return;
                }
                if (b) {
                    i5 = (int)Test.instanceCount;
                } else if (b) {
                    i6 = i7;
                    Test.iArrFld[i7] = i6;
                } else {
                    i8 = i8;
                }
                break;
            }
        }
        vMeth1_check_sum += i5 + i6 + i7 + i8 + s + (b ? 1 : 0);
    }

    public static void vMeth() {

        int i2=20571, i3=-4, i4=12, i12=11519, i13=-14516, i14=-8;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 1.682F);

        switch (((((int)(i2 - Test.fFld)) >>> 1) % 7) + 44) {
        case 44:
            i2 = (int)(i2 + (i2 += (int)(i2 - 0.265F)));
            for (i3 = 16; 335 > i3; ++i3) {
                vMeth1(i2, i2);
                i2 += (int)Test.fFld;
                for (i12 = 1; i12 < 5; ++i12) {
                    if (false) {
                        Test.iArrFld[i3 + 1] = 0;
                        Test.instanceCount += i2;
                        Test.iArrFld[i3 + 1] -= (int)Test.dFld;
                    } else {
                        i14 = 1;
                        do {
                            i4 -= Test.byFld;
                            Test.iArrFld[i14 + 1] -= i14;
                            Test.fFld = i13;
                            i4 -= (int)Test.fFld;
                        } while (++i14 < 2);
                    }
                }
            }
            break;
        case 45:
            i13 *= i12;
        case 46:
            Test.dFld -= Test.fFld;
            break;
        case 47:
            Test.instanceCount *= i2;
            break;
        case 48:
            i2 = i12;
        case 49:
            i2 = (int)7L;
            break;
        case 50:
            i4 = (int)Test.instanceCount;
        default:
            i13 += i14;
        }
        vMeth_check_sum += i2 + i3 + i4 + i12 + i13 + i14 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i=10, i1=-9, i15=37171, i16=-3, i17=28375, i18=1, i19=236, i20=4, i21=42852, i22=23136, i23=37, i24=-12;
        double d1=77.49718;
        short s2=-6790;

        i *= (i++);
        i1 = 1;
        do {
            if (bFld) {
                i += (int)(-57037L + (i1 * i1));
                vMeth();
            } else if (false) {
                for (i15 = 178; i15 > 7; i15 -= 2) {
                    for (i17 = 1; i17 < 3; ++i17) {
                        if (bFld) continue;
                        dArrFld[i15 + 1] += i16;
                        Test.instanceCount -= (long)Test.fFld;
                        lArrFld[i15] = 1694419221L;
                        Test.fFld -= (float)1.39032;
                        i16 += (int)Test.instanceCount;
                        Test.instanceCount >>= i17;
                        Test.instanceCount += Test.instanceCount;
                    }
                }
                i16 *= (int)-6L;
                for (i19 = 6; i19 < 178; i19 += 2) {
                    for (d1 = 1; d1 < 3; ++d1) {
                        i20 |= (int)Test.instanceCount;
                    }
                    for (i22 = 1; i22 < 3; i22++) {
                        if (bFld) break;
                        Test.iArrFld[i19 + 1] = 9258;
                        switch (((i22 >>> 1) % 9) + 33) {
                        case 33:
                            Test.fFld = i17;
                            Test.fFld += (((i22 * Test.fFld) + i17) - s2);
                            i20 = i16;
                            i16 = i16;
                            break;
                        case 34:
                            i21 >>= (int)Test.instanceCount;
                            bFld = false;
                            i23 = (int)Test.instanceCount;
                        case 35:
                            i18 -= i18;
                            break;
                        case 36:
                            i23 = i18;
                            break;
                        case 37:
                            i21 = i1;
                        case 38:
                            Test.fFld = i24;
                            break;
                        case 39:
                            Test.sArrFld[i22 + 1][i19] = (short)Test.instanceCount;
                        case 40:
                            dArrFld[i19 - 1] = i24;
                            break;
                        case 41:
                            i20 -= -238;
                        }
                    }
                }
            }
        } while (++i1 < 141);


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
