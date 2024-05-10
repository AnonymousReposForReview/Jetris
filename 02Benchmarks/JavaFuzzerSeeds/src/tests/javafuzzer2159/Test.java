package tests.javafuzzer2159;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 09:42:38 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3763530639863006336L;
    public static short sFld=-7701;
    public boolean bFld=true;
    public static float fFld=93.157F;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -149);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i2, long l, long l1) {

        double d=-61.31368;
        int i3=126, i4=53861, iArr[][]=new int[N][N];
        float f=-88.255F;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 11);
        FuzzerUtils.init(lArr, 121L);

        for (d = 386; d > 19; --d) {
            i2 += (int)d;
            i2 *= i2;
            iArr[(int)(d + 1)][(int)(d)] += i3;
            i3 += (30 + (d * d));
            iArr[(int)(d + 1)][(int)(d - 1)] <<= i3;
            switch ((int)((d % 2) + 22)) {
            case 22:
            case 23:
                l1 += -244;
            default:
                lArr[(int)(d - 1)] += Test.instanceCount;
                i3 = i2;
                f += (float)d;
                i4 = 1;
                while (++i4 < 5) {
                    if (i4 != 0) {
                    }
                    i3 *= i2;
                }
            }
        }
        Test.instanceCount = (long)d;
        long meth_res = i2 + l + l1 + Double.doubleToLongBits(d) + i3 + Float.floatToIntBits(f) + i4 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i5=-7, i6=-13, i7=-10, i8=81, i9=40125, i10=-8, i11=3;
        long l2=-63249L;
        float f1=-120.748F;
        double d1=3.115081;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)19463);

        Test.instanceCount += iMeth(i5, Test.instanceCount, l2);
        for (i6 = 15; i6 < 364; i6++) {
            i8 = 1;
            do {
                i7 += i6;
                i9 = 1;
                while (++i9 < 1) {
                    i5 -= (int)f1;
                }
                if (i7 != 0) {
                    vMeth_check_sum += i5 + l2 + i6 + i7 + i8 + i9 + Float.floatToIntBits(f1) + i10 + i11 +
                        Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(sArr);
                    return;
                }
                sArr[i6] *= (short)f1;
                for (i10 = 1; i10 < 1; ++i10) {
                    if (false) continue;
                    Test.iArrFld[i8 + 1] = i6;
                    i11 = Test.sFld;
                    d1 += f1;
                    Test.iArrFld[i6 + 1] = 104;
                    i11 <<= i6;
                }
            } while (++i8 < 5);
        }
        vMeth_check_sum += i5 + l2 + i6 + i7 + i8 + i9 + Float.floatToIntBits(f1) + i10 + i11 +
            Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(sArr);
    }

    public static long lMeth(boolean b) {

        int i12=-8, i13=168, i14=11, i15=10, i16=-5;
        float f2=-1.488F;
        double dArr[]=new double[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(dArr, 101.12878);
        FuzzerUtils.init(lArr1, 417891595171329804L);

        vMeth();
        for (i12 = 9; i12 < 171; ++i12) {
            dArr[i12 - 1] *= i13;
            i13 += i12;
            for (i14 = 1; i14 < 10; ++i14) {
                switch (((i12 % 5) * 5) + 18) {
                case 20:
                    for (f2 = 1; f2 < 2; f2++) {
                        if (i13 != 0) {
                        }
                        Test.instanceCount -= i15;
                        Test.instanceCount -= i13;
                    }
                    break;
                case 19:
                    lArr1[i14 - 1] *= 515972471322741840L;
                    i16 *= i14;
                    i16 += (i14 ^ (long)f2);
                    if (i12 != 0) {
                    }
                case 40:
                    Test.instanceCount >>= i16;
                case 27:
                    i13 -= i15;
                case 30:
                }
            }
        }
        long meth_res = (b ? 1 : 0) + i12 + i13 + i14 + i15 + Float.floatToIntBits(f2) + i16 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(lArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=17, i1=50031, i17=9, i18=-5, i19=11, i20=-1, i21=-11, iArr1[][]=new int[N][N];
        long l3=-3L, lArr2[]=new long[N];
        double d2=111.48226;
        byte by=34;

        FuzzerUtils.init(lArr2, 53674L);
        FuzzerUtils.init(iArr1, 0);

        for (i = 14; i < 365; ++i) {
            lMeth(bFld);
            i1 += i;
        }
        i1 -= -12;
        for (l3 = 267; l3 > 16; --l3) {
            i1 <<= -248;
            for (i18 = (int)(l3); i18 < 100; ++i18) {
                switch ((((1 >>> 1) % 6) * 5) + 79) {
                case 101:
                    Test.iArrFld[i18 + 1] += (int)d2;
                    by += (byte)i18;
                    i1 <<= i;
                    break;
                case 98:
                    i1 *= (int)Test.fFld;
                    if (bFld) {
                        Test.instanceCount >>= i;
                        i19 += (i18 | (long)Test.fFld);
                        i1 = (int)l3;
                        by += (byte)i18;
                    } else if (bFld) {
                        lArr2[i18 - 1] += i1;
                        Test.instanceCount += i18;
                        for (i20 = (int)(l3); i20 < 1; i20++) {
                            Test.sFld = (short)Test.instanceCount;
                            Test.instanceCount = i;
                            Test.fFld += i;
                            switch ((i18 % 3) + 38) {
                            case 38:
                                i19 >>= i21;
                                iArr1 = iArr1;
                                if (bFld) continue;
                                if (bFld) break;
                                break;
                            case 39:
                                Test.iArrFld[(int)(l3)] -= i19;
                                Test.instanceCount &= -60847;
                                break;
                            case 40:
                                i17 = i1;
                            default:
                                Test.instanceCount += i20;
                            }
                        }
                    } else {
                        i21 += i;
                    }
                case 97:
                    Test.fFld += (i18 - i17);
                    break;
                case 106:
                case 81:
                    by ^= (byte)i18;
                case 100:
                    Test.sFld += (short)(-3336620321L + (i18 * i18));
                    break;
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}