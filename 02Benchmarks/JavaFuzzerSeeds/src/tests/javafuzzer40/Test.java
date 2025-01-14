package tests.javafuzzer40;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 21:26:44 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=6538070381031561414L;
    public static volatile int iFld=13;
    public static double dFld=2.107454;
    public static int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, -54629);
    }

    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        float f1=0.918F, f2=-61.17F;
        int i10=-13125, i11=-8;
        boolean b=false;
        double d2=-114.30185;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-1509);

        for (f1 = 7; f1 < 132; f1++) {
            i10 += (int)Test.instanceCount;
            f2 = 1;
            while (++f2 < 13) {
                short s=-24252;
                s -= (short)2197;
                i10 = i10;
                if (b) break;
                i10 = (int)f1;
                for (d2 = 1; d2 < 1; ++d2) {
                    switch ((int)(((f1 % 3) * 5) + 88)) {
                    case 99:
                        Test.iFld = -5;
                        Test.iFld += (int)(d2 - i11);
                    case 94:
                        sArr[(int)(d2)] = (short)20121;
                        break;
                    case 98:
                        s += (short)(((d2 * Test.iFld) + Test.iFld) - i10);
                    default:
                        s |= (short)Test.iFld;
                        i11 += (int)f2;
                    }
                }
            }
        }
        long meth_res = Float.floatToIntBits(f1) + i10 + Float.floatToIntBits(f2) + (b ? 1 : 0) +
            Double.doubleToLongBits(d2) + i11 + FuzzerUtils.checkSum(sArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static double dMeth(int i5, int i6, int i7) {

        int i8=-63, i9=-8, i12=221, i13=-28, i14=8, i15=12, i16=-47724, i17=-56626, iArr[]=new int[N];
        float f=0.13F, fArr[]=new float[N];
        double d1=-2.47931;
        boolean b1=false;

        FuzzerUtils.init(fArr, 2.48F);
        FuzzerUtils.init(iArr, 14844);

        for (i8 = 15; i8 < 357; i8++) {
            i6 += (--i5);
            i5 -= (int)(((i5 * f) - (Test.instanceCount -= (long)f)) - (i6 * (0 + (-d1))));
            i6 *= (int)(((fArr[i8 - 1]--) * (-75.495F * (d1 - i9))) - (iMeth() + i9));
            b1 = b1;
            fArr[i8] = Test.iFld;
            f = i6;
        }
        i9 -= (int)f;
        switch (((i8 >>> 1) % 3) + 53) {
        case 53:
            i7 >>= i5;
            break;
        case 54:
            for (i12 = 2; 298 > i12; i12++) {
                for (i14 = 6; i14 > i12; --i14) {
                    for (i16 = 1; 1 > i16; ++i16) {
                        i7 += (i16 - Test.iFld);
                        i13 += (i16 * i16);
                    }
                }
            }
        case 55:
            iArr[(i12 >>> 1) % N] = -44446;
            break;
        }
        long meth_res = i5 + i6 + i7 + i8 + i9 + Float.floatToIntBits(f) + Double.doubleToLongBits(d1) + (b1 ? 1 : 0) +
            i12 + i13 + i14 + i15 + i16 + i17 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(iArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth(int i, int i1, long l) {

        int i2=15544, i3=-9, i4=-254, i18=22858, i19=22, i20=-175;
        double d=-1.111997, d3=104.45826;
        float f3=0.837F, fArr1[][]=new float[N][N];
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, 286049948L);
        FuzzerUtils.init(fArr1, 2.921F);

        for (i2 = 11; 186 > i2; ++i2) {
            if (((i3 - (-251 + d)) / (((long)(Math.min(i4, 150) + dMeth(i2, i2, i2))) | 1)) != d) continue;
            lArr[i2 + 1][i2 - 1] += i4;
            i1 = Test.iFld;
            Test.instanceCount = i;
        }
        for (i18 = 244; i18 > 8; --i18) {
            i20 = 1;
            do {
                switch (((i18 % 5) * 5) + 109) {
                case 118:
                    Test.instanceCount += i3;
                    f3 -= i2;
                    d3 = 1;
                    while ((d3 += 3) < 1) {
                        i19 += i3;
                        l += (long)d3;
                        Test.iArrFld[i20 + 1][i20 + 1] >>= i;
                        i *= (int)f3;
                    }
                case 115:
                    if (true) continue;
                    break;
                case 127:
                    fArr1[i20 + 1][i18 + 1] *= 0.718F;
                    break;
                case 111:
                    if (i18 != 0) {
                        vMeth_check_sum += i + i1 + l + i2 + i3 + Double.doubleToLongBits(d) + i4 + i18 + i19 + i20 +
                            Float.floatToIntBits(f3) + Double.doubleToLongBits(d3) + FuzzerUtils.checkSum(lArr) +
                            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
                        return;
                    }
                    break;
                case 117:
                    f3 = i20;
                    break;
                }
            } while (++i20 < 7);
        }
        vMeth_check_sum += i + i1 + l + i2 + i3 + Double.doubleToLongBits(d) + i4 + i18 + i19 + i20 +
            Float.floatToIntBits(f3) + Double.doubleToLongBits(d3) + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public void mainTest(String[] strArr1) {

        int i21=239, i22=0, i23=14, i24=-54223, i25=3758, i26=234, i27=-14305;
        long l1=3089512760L;
        float f4=-109.643F, f5=-99.371F;
        byte by=-51, byArr[]=new byte[N];
        double d4=0.50225;
        boolean b2=true;
        short s1=-9196;

        FuzzerUtils.init(byArr, (byte)0);

        vMeth(69, Test.iFld, Test.instanceCount);
        for (i21 = 4; i21 < 301; ++i21) {
            Test.iFld += (i21 * i21);
            Test.iFld -= i22;
            Test.instanceCount <<= Test.instanceCount;
            Test.iArrFld[i21 + 1][i21 - 1] <<= 13;
        }
        for (l1 = 215; l1 > 11; --l1) {
            Test.iFld += (int)(((l1 * Test.iFld) + f4) - i21);
            byArr = byArr;
            Test.iFld += i23;
            by = (byte)3543451324L;
            f4 *= -245;
            i22 -= i22;
            Test.iFld -= i23;
        }
        Test.instanceCount += i21;
        for (d4 = 8; 292 > d4; ++d4) {
            i22 += (int)d4;
            i25 = 1;
            while (++i25 < 89) {
                i22 -= (int)f5;
                if (b2) continue;
                s1 *= (short)f4;
                Test.dFld = Test.instanceCount;
                f4 += i23;
            }
            i24 -= i24;
            for (i26 = (int)(d4); i26 < 89; i26++) {
                Test.iArrFld[(int)(d4)][i26] -= (int)Test.instanceCount;
                Test.dFld = Test.instanceCount;
                i27 <<= 0;
                s1 += (short)(((i26 * l1) + by) - l1);
                b2 = b2;
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
//DEBUG  dMeth ->  dMeth vMeth mainTest
//DEBUG  iMeth ->  iMeth dMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
