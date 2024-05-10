package tests.javafuzzer2892;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 22:22:37 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=37206L;
    public static boolean bFld=true;
    public static int iFld=-3;
    public static short sFld=26384;
    public static short sArrFld[][]=new short[N][N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)20816);
    }

    public static long iMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(double d1) {

        int i6=-22542, i7=31236, i8=12, i9=0, i10=-42836, i11=-10, i12=-239, iArr1[]=new int[N];
        float f1=-1.233F;
        long l=18128L;

        FuzzerUtils.init(iArr1, -39);

        for (i6 = 9; i6 < 196; ++i6) {
            i7 += i6;
            iArr1[i6 + 1] = i7;
        }
        for (f1 = 9; f1 < 195; f1++) {
            short s=-26670;
            s ^= (short)Test.instanceCount;
        }
        l = i7;
        Test.bFld = Test.bFld;
        d1 = i8;
        for (i9 = 7; 390 > i9; ++i9) {
            Test.sArrFld[i9 + 1][i9] -= (short)i6;
            for (i11 = i9; i11 < 4; i11++) {
                i8 = (int)l;
                i8 += i7;
                i12 *= (int)f1;
                i12 *= (int)l;
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d1) + i6 + i7 + Float.floatToIntBits(f1) + i8 + l + i9 + i10 + i11 +
            i12 + FuzzerUtils.checkSum(iArr1);
    }

    public static double dMeth(int i3, byte by1) {

        int i4=49611, i5=8, iArr[]=new int[N];
        double d=-39.112384;

        FuzzerUtils.init(iArr, 130);

        for (i4 = 8; i4 < 305; ++i4) {
            try {
                i5 = (iArr[i4 + 1] / -29971);
                iArr[i4] = (29088 / i3);
                i5 = (i5 / 18850);
            } catch (ArithmeticException a_e) {}
            i3 = (int)((d - (1.900F + (i4 + i3))) * (--i5));
            Test.instanceCount += (((i4 * i3) + i3) - i5);
        }
        vMeth(d);
        long meth_res = i3 + by1 + i4 + i5 + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static int iMeth(byte by) {

        float f2=2.27F, fArr[]=new float[N];
        int i13=-14, i14=229, iArr2[]=new int[N];
        short s1=-21397;
        double d2=-30.123531;

        FuzzerUtils.init(fArr, -4.519F);
        FuzzerUtils.init(iArr2, 235);

        if (Test.bFld) {
            Test.instanceCount *= (long)dMeth(Test.iFld, (byte)(48));
            Test.iFld = Test.iFld;
        } else {
            Test.instanceCount >>= Test.instanceCount;
            Test.iFld *= (int)f2;
            for (i13 = 13; 210 > i13; ++i13) {
                if (Test.bFld) {
                    fArr[i13 + 1] += i14;
                    fArr[i13] += i14;
                    if (Test.bFld) {
                        if (Test.bFld) {
                            f2 -= Test.instanceCount;
                            Test.iFld += (i13 - Test.instanceCount);
                            s1 += (short)-1.969F;
                            Test.iFld += (i13 * i13);
                        } else if (Test.bFld) {
                            d2 = -49090L;
                        } else if (Test.bFld) {
                            Test.instanceCount >>= i14;
                        }
                    }
                } else if (true) {
                    i14 = Test.iFld;
                } else if (Test.bFld) {
                    try {
                        i14 = (Test.iFld % Test.iFld);
                        iArr2[i13 + 1] = (-15378 % i14);
                        iArr2[i13] = (Test.iFld / -252);
                    } catch (ArithmeticException a_e) {}
                }
            }
        }
        long meth_res = by + Float.floatToIntBits(f2) + i13 + i14 + s1 + Double.doubleToLongBits(d2) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f=-92.629F;
        int i=-25566, i1=133, i2=222, i15=-125, i16=1, i17=103, i18=-10, iArr3[]=new int[N];
        byte by2=-72;

        FuzzerUtils.init(iArr3, 247);

        Test.instanceCount *= (long)(((--f) - (i - f)) * (i - (f++)));
        i1 = 1;
        do {
            i2 = 71;
            while (--i2 > 0) {
                i -= (int)(i1 * Float.intBitsToFloat(iMeth((byte)(-67))));
                lArrFld[i2 - 1] = Test.iFld;
                Test.iFld = -57447;
                Test.instanceCount += Test.instanceCount;
            }
            i += i2;
            Test.iFld += (i1 * i1);
            Test.iFld += (((i1 * Test.instanceCount) + i2) - Test.iFld);
            f += -59.778F;
            f -= Test.iFld;
        } while (++i1 < 353);
        for (i15 = 6; i15 < 141; i15++) {
            lArrFld[i15] = 162L;
            iArr3[i15] -= (int)f;
            switch (((i15 % 2) * 5) + 87) {
            case 91:
                lArrFld[i15 - 1] <<= by2;
            case 90:
                i17 = 186;
                while ((i17 -= 2) > 0) {
                    i16 *= (int)Test.instanceCount;
                    i *= i17;
                    i16 += (int)(-44.281F + (i17 * i17));
                }
                i += i15;
                i16 += (int)Test.instanceCount;
                break;
            default:
                i18 = 1;
                while (++i18 < 186) {
                    Test.iFld = (int)-67L;
                    Test.instanceCount -= 8;
                    Test.instanceCount %= ((long)(f) | 1);
                    Test.sFld = (short)i2;
                    Test.iFld -= (int)-11L;
                }
                i = -176;
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
//DEBUG  dMeth ->  dMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth dMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}