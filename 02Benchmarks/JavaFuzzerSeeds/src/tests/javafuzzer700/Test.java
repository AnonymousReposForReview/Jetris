package tests.javafuzzer700;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 08:13:33 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-83L;
    public static boolean bFld=false;
    public static float fFld=-67.192F;
    public double dFld=118.12297;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 30);
    }

    public static long byMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(double d2, float f1) {

        int i7=-3847, i8=-5, i10=14, i11=-8, i12=13, i13=3370, iArr1[]=new int[N];
        double d3=0.116145;
        byte by=51;
        float fArr[]=new float[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr1, 221);
        FuzzerUtils.init(fArr, 1.363F);
        FuzzerUtils.init(lArr, 49L);

        i7 |= i7;
        for (d3 = 137; 5 < d3; d3--) {
            if (true) break;
            i8 -= i8;
            i8 = by;
            Test.instanceCount += (long)d3;
            if (Test.bFld) {
                fArr[(int)(d3 + 1)] -= i7;
                Test.instanceCount -= i8;
            } else {
                for (i10 = (int)(d3); i10 < 12; i10++) {
                    f1 += i10;
                    for (i12 = 1; i12 > 1; i12--) {
                        i11 += (int)(85502662L + (i12 * i12));
                        lArr[i10] = Test.instanceCount;
                    }
                    i13 += i10;
                }
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d2) + Float.floatToIntBits(f1) + i7 + Double.doubleToLongBits(d3) +
            i8 + by + i10 + i11 + i12 + i13 + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth(int i3, int i4, double d1) {

        int i5=58670, i6=-51815, i14=-35, i15=-4, i16=13, i17=5877;
        float f2=-67.169F;

        for (i5 = 1; i5 < 171; i5++) {
            if (i5 != 0) {
            }
            vMeth(d1, f2);
            i4 += (i5 | i5);
            Test.instanceCount = i3;
            i6 >>>= (int)Test.instanceCount;
        }
        i3 <<= i6;
        Test.iArrFld[(-4 >>> 1) % N] *= (int)d1;
        for (i14 = 1; i14 < 143; ++i14) {
            Test.iArrFld[i14 + 1] = i14;
            switch (((i3 >>> 1) % 3) + 9) {
            case 9:
                Test.instanceCount += i14;
                break;
            case 10:
                for (i16 = 1; 11 > i16; ++i16) {
                    Test.iArrFld[i14] = (int)Test.instanceCount;
                    i3 = (int)3701323586L;
                }
                break;
            case 11:
                f2 += (i14 - i16);
            default:
                d1 = i16;
            }
        }
        long meth_res = i3 + i4 + Double.doubleToLongBits(d1) + i5 + i6 + Float.floatToIntBits(f2) + i14 + i15 + i16 +
            i17;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static byte byMeth(float f) {

        int i=-2, i1=-24, i2=13, i18=45472, i19=-21, iArr[]=new int[N];
        double d=-2.51407, dArr[]=new double[N];
        long l=10L;
        byte by1=-82;

        FuzzerUtils.init(iArr, -15);
        FuzzerUtils.init(dArr, 124.91587);

        i %= -69;
        f -= (float)(iArr[(i >>> 1) % N] + d);
        for (i1 = 16; i1 < 340; ++i1) {
            if (iMeth(i, i1, d) <= 11) continue;
            i2 *= i;
            i = (int)Test.instanceCount;
            if (Test.bFld) continue;
        }
        i <<= (int)Test.instanceCount;
        l = 1;
        do {
            Test.iArrFld[(int)(l)] <<= i2;
            for (i18 = 1; i18 < 8; ++i18) {
                i2 += -9;
                dArr[i18 + 1] *= d;
                by1 <<= (byte)1;
            }
            if (Test.bFld) continue;
        } while (++l < 207);
        long meth_res = Float.floatToIntBits(f) + i + Double.doubleToLongBits(d) + i1 + i2 + l + i18 + i19 + by1 +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i20=-31042, i21=82, i22=62922, i23=5, i24=-95, i25=6, i26=-22, i27=17, i28=-229, iArr2[][]=new int[N][N];
        long lArr1[]=new long[N];
        short sArr[][]=new short[N][N];

        FuzzerUtils.init(lArr1, -2219547110L);
        FuzzerUtils.init(iArr2, -45736);
        FuzzerUtils.init(sArr, (short)3228);

        byMeth(Test.fFld);
        i20 = 331;
        do {
            i21 -= i20;
        } while ((i20 -= 2) > 0);
        dFld = -31546;
        Test.fFld += i21;
        for (i22 = 10; i22 < 304; ++i22) {
            lArr1[i22 - 1] = (long)33.41971;
            for (i24 = 3; i24 < 86; i24++) {
                if (Test.bFld) break;
                Test.fFld += i24;
                i21 = i24;
                i21 = i21;
                Test.instanceCount -= i23;
                i23 -= (int)-1.51292;
                Test.instanceCount = i23;
                for (i26 = 2; i26 > 1; i26--) {
                    switch ((i26 % 8) + 22) {
                    case 22:
                        i21 += i24;
                        Test.instanceCount -= (long)116.443F;
                        Test.instanceCount >>>= -3;
                        Test.instanceCount <<= Test.instanceCount;
                        break;
                    case 23:
                        i23 = i26;
                        switch (((i21 >>> 1) % 10) + 69) {
                        case 69:
                            if (Test.bFld) break;
                            i27 += i27;
                            i23 += (i26 ^ i24);
                            break;
                        case 70:
                            i25 += (i26 ^ i21);
                            i25 += i26;
                            i27 = i26;
                            i21 *= (int)Test.fFld;
                            break;
                        case 71:
                            i27 -= (int)Test.instanceCount;
                            break;
                        case 72:
                            iArr2 = FuzzerUtils.int2array(N, (int)12824);
                        case 73:
                            iArr2[i24 + 1][i22] -= (int)Test.instanceCount;
                        case 74:
                            Test.instanceCount = i22;
                            break;
                        case 75:
                            i25 <<= i23;
                            break;
                        case 76:
                            Test.fFld *= 0.9F;
                            break;
                        case 77:
                            Test.instanceCount -= i24;
                            break;
                        case 78:
                            i25 += i26;
                        }
                    case 24:
                        Test.instanceCount /= ((long)(Test.fFld) | 1);
                    case 25:
                        sArr = sArr;
                        break;
                    case 26:
                        i25 += i26;
                        break;
                    case 27:
                        i23 += i26;
                        break;
                    case 28:
                        i27 -= i28;
                        break;
                    case 29:
                        i23 += (int)Test.fFld;
                        break;
                    }
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
//DEBUG  byMeth ->  byMeth mainTest
//DEBUG  iMeth ->  iMeth byMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth byMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
