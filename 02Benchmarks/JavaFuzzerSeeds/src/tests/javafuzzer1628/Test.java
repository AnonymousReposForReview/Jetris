package tests.javafuzzer1628;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 00:27:22 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-69L;
    public static int iFld=0;
    public static float fFld=41.745F;
    public static boolean bFld=true;
    public static byte byFld=53;
    public double dFld=44.84695;
    public int iFld1=84;
    public static volatile short sArrFld[][]=new short[N][N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)27057);
    }

    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth(int i) {

        int i1=52527, iArr[]=new int[N];
        double d=-45.62063;

        FuzzerUtils.init(iArr, -141);

        i1 = 1;
        while (++i1 < 262) {
            i = iArr[(i >>> 1) % N];
            i = (int)(--d);
        }
        vMeth_check_sum += i + i1 + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr);
    }

    public static long lMeth(boolean b) {


        Test.iFld += (Test.iFld + (--Test.iFld));
        long meth_res = (b ? 1 : 0);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1(long l, boolean b2, int i4) {

        int i5=196, i6=163, i7=0, i8=12350, i9=-23271, i10=64, i11=-7, iArr2[]=new int[N];
        short s=28861, sArr[]=new short[N];
        double d1=0.44805, dArr[][]=new double[N][N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(dArr, -1.79329);
        FuzzerUtils.init(sArr, (short)-22101);
        FuzzerUtils.init(iArr2, 0);
        FuzzerUtils.init(byArr, (byte)59);

        for (i5 = 10; i5 < 180; i5++) {
            switch (((-1 >>> 1) % 1) + 88) {
            case 88:
                i7 = 1;
                while (++i7 < 9) {
                    Test.iFld += 74;
                    s = (short)l;
                    d1 *= 44260;
                }
                Test.instanceCount += (((i5 * i4) + s) - Test.fFld);
                for (i8 = 1; i8 < 9; ++i8) {
                    if (b2) break;
                    for (i10 = 1; i10 < 2; i10++) {
                        switch ((i10 % 10) + 118) {
                        case 118:
                            i6 += Test.iFld;
                            if (b2) break;
                            dArr[i10 + 1][i8] += i9;
                            if (false) continue;
                            break;
                        case 119:
                            s -= (short)-9;
                        case 120:
                            sArr[i10 + 1] *= (short)17L;
                            break;
                        case 121:
                            Test.fFld = Test.instanceCount;
                            break;
                        case 122:
                            iArr2[i10 + 1] = (int)Test.instanceCount;
                            break;
                        case 123:
                            Test.iFld = i6;
                            break;
                        case 124:
                            i11 -= Test.iFld;
                            break;
                        case 125:
                            iArr2[i5 - 1] /= (int)(i6 | 1);
                        case 126:
                            i11 = i9;
                        case 127:
                            byArr[i10 + 1] += (byte)-27356L;
                            break;
                        }
                    }
                }
                break;
            }
        }
        vMeth1_check_sum += l + (b2 ? 1 : 0) + i4 + i5 + i6 + i7 + s + Double.doubleToLongBits(d1) + i8 + i9 + i10 +
            i11 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(sArr) +
            FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(byArr);
    }

    public static int iMeth() {

        int i12=9, i13=-5, i14=149, i15=173;

        vMeth1(Test.instanceCount, Test.bFld, Test.iFld);
        for (i12 = 14; i12 < 314; ++i12) {
            if (Test.bFld) {
                i13 *= (int)Test.instanceCount;
            } else {
                Test.sArrFld[i12 - 1][i12 - 1] = (short)i12;
                if (Test.bFld) break;
            }
            for (i14 = 1; i14 < 6; ++i14) {
                Test.instanceCount += (((i14 * i15) + Test.iFld) - i14);
                Test.iFld = 26;
                Test.instanceCount = -12;
                Test.fFld += Test.iFld;
                if (Test.bFld) break;
            }
            Test.byFld -= (byte)i14;
            if (Test.bFld) continue;
            i13 = i15;
        }
        long meth_res = i12 + i13 + i14 + i15;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static float fMeth() {

        boolean b1=true;
        int i3=-4, i16=47394, i17=1, i18=-3, i19=117, i20=-236, i21=-4, iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, 47);

        vMeth(Test.iFld--);
        vMeth((int)((lMeth(b1) * Test.iFld) + ((++i3) >>> (i3--))));
        iArr1[(i3 >>> 1) % N] += (i3 * iMeth());
        for (i16 = 380; i16 > 9; i16--) {
            Test.iFld >>= i17;
        }
        for (i18 = 353; i18 > 13; --i18) {
            Test.iFld = 12;
            if (b1) {
                iArr1[i18] -= (int)Test.fFld;
                for (i20 = 1; i20 < 5; ++i20) {
                    if (b1) {
                        i3 += (((i20 * i16) + Test.instanceCount) - i21);
                        if (i17 != 0) {
                        }
                    } else if (false) {
                        iArr1[i20 + 1] -= (int)Test.instanceCount;
                    }
                }
                try {
                    Test.iFld = (iArr1[i18] % i19);
                    i3 = (i19 % i16);
                    Test.iFld = (i18 / -50);
                } catch (ArithmeticException a_e) {}
            } else if (Test.bFld) {
                iArr1[i18] = -10215;
            } else {
                i3 = i18;
            }
        }
        long meth_res = (b1 ? 1 : 0) + i3 + i16 + i17 + i18 + i19 + i20 + i21 + FuzzerUtils.checkSum(iArr1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i2=-91, i22=57793, i23=-62, i24=61844, i25=43, i27=124, i28=-11, i29=50172, iArr3[]=new int[N];
        float f=-28.784F, f1=76.226F, f2=-2.886F, f3=117.390F;
        short s1=-1701;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, -40868L);
        FuzzerUtils.init(iArr3, 17067);

        vMeth((int)((++i2) * fMeth()));
        for (f = 9; f < 217; f++) {
            f1 = 1;
            while (++f1 < 121) {
                i23 = 1;
                do {
                    Test.bFld = false;
                    Test.instanceCount += (i23 * i23);
                    lArr[(int)(f + 1)][i23 + 1] += -233;
                    Test.iFld = (int)dFld;
                    Test.instanceCount -= i2;
                    i22 += (((i23 * Test.iFld) + s1) - Test.iFld);
                } while (++i23 < 1);
                lArr[(int)(f)][(int)(f1 + 1)] *= i22;
                Test.fFld *= 6;
                Test.byFld += (byte)(21 + (f1 * f1));
            }
            f2 *= Test.instanceCount;
            iArr3[(int)(f + 1)] *= (int)Test.instanceCount;
            iArr3[(int)(f + 1)] -= 79;
        }
        for (i24 = 10; i24 < 298; i24++) {
            Test.instanceCount |= i25;
            Test.iFld += 11;
            s1 = (short)Test.instanceCount;
            iArr3[i24] += Test.byFld;
            if (true) {
                for (f3 = 1; f3 < 87; ++f3) {
                    switch ((int)((f3 % 2) + 3)) {
                    case 3:
                        if (Test.bFld) {
                            if (Test.bFld) break;
                            try {
                                i2 = (-55544 / i23);
                                i2 = (i27 % i25);
                                i25 = (56316 % i22);
                            } catch (ArithmeticException a_e) {}
                            for (i28 = 1; 2 > i28; i28++) {
                                Test.instanceCount = Test.instanceCount;
                                f2 += i28;
                            }
                        } else if (Test.bFld) {
                            dFld /= (iFld1 | 1);
                        } else {
                            Test.fFld -= i29;
                        }
                        break;
                    case 4:
                        i27 += (int)(f3 + i2);
                        break;
                    }
                }
            } else if (Test.bFld) {
                f2 += iFld1;
            } else if (Test.bFld) {
                Test.instanceCount += i2;
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
//DEBUG  vMeth ->  vMeth mainTest fMeth
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  lMeth ->  lMeth fMeth mainTest
//DEBUG  iMeth ->  iMeth fMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
