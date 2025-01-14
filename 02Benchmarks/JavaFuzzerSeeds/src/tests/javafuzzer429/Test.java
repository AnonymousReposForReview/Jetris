package tests.javafuzzer429;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 03:38:37 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-25898L;
    public static float fFld=49.240F;
    public static int iFld=41;
    public static volatile short sFld=-13817;
    public static double dFld=0.71648;
    public static byte byArrFld[]=new byte[N];
    public static long lArrFld[]=new long[N];
    public static volatile int iArrFld[]=new int[N];
    public static long lArrFld1[][]=new long[N][N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)15);
        FuzzerUtils.init(Test.lArrFld, 2477047535L);
        FuzzerUtils.init(Test.iArrFld, -139);
        FuzzerUtils.init(Test.lArrFld1, 253L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(double d1, int i4, int i5) {

        float f1=58.644F;
        int i6=-6, i7=-90, i8=-7, i9=3687, i10=5403;
        short s=-3821;
        boolean b=false;

        i4 += -52277;
        if (b) {
            for (f1 = 16; 293 > f1; ++f1) {
                Test.byArrFld = FuzzerUtils.byte1array(N, (byte)62);
                i5 &= -27;
                for (i7 = 1; i7 < 6; i7++) {
                    Test.byArrFld = Test.byArrFld;
                    for (i9 = 2; i9 > i7; --i9) {
                        i6 += (int)1.42695;
                        i5 += i9;
                        Test.lArrFld[(int)(f1 - 1)] = i8;
                    }
                    s += (short)(i7 - i5);
                    i5 = 59238;
                    i10 ^= i5;
                    Test.instanceCount += (i7 ^ (long)f1);
                }
            }
        } else if (b) {
            Test.fFld -= i4;
        } else if (false) {
            Test.instanceCount = i4;
        }
        long meth_res = Double.doubleToLongBits(d1) + i4 + i5 + Float.floatToIntBits(f1) + i6 + i7 + i8 + i9 + i10 + s
            + (b ? 1 : 0);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(double d, byte by, int i3) {

        int i11=153, i12=-63070, i13=6, i14=17537, iArr1[][]=new int[N][N];
        byte byArr[][]=new byte[N][N];

        FuzzerUtils.init(byArr, (byte)-45);
        FuzzerUtils.init(iArr1, 63817);

        byArr[(-182 >>> 1) % N][(i3 >>> 1) % N] = (byte)(Math.abs(-9) * iMeth1(-89.119737, i3, i3));
        for (i11 = 5; 389 > i11; ++i11) {
            i12 = i11;
            i12 <<= (int)-57588L;
            try {
                i3 = (iArr1[i11 + 1][i11] % 137);
                i3 = (i12 % i3);
                i3 = (-193 / i12);
            } catch (ArithmeticException a_e) {}
            Test.instanceCount -= by;
            i13 = 1;
            do {
                i3 -= i14;
                by = by;
                Test.lArrFld[i13 - 1] -= (long)Test.fFld;
                i12 = (int)Test.instanceCount;
                i3 += (int)Test.instanceCount;
                Test.instanceCount = i14;
                Test.instanceCount += 7L;
                Test.instanceCount = Test.instanceCount;
            } while (++i13 < 4);
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + by + i3 + i11 + i12 + i13 + i14 + FuzzerUtils.checkSum(byArr) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth(float f) {

        double d2=0.120944;
        byte by1=-3;
        int i17=11, i18=-160, i19=175, i20=50705, i21=-29948;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 1.780F);

        vMeth(d2, by1, Test.iFld);
        for (int i15 : Test.iArrFld) {
            Test.instanceCount += -10;
        }
        for (i17 = 3; 398 > i17; ++i17) {
            i18 <<= (int)Test.instanceCount;
            Test.iArrFld[i17] -= Test.iFld;
            Test.iArrFld[i17 + 1] *= Test.iFld;
            f = Test.instanceCount;
            f = 2.753F;
            i19 = 1;
            while (++i19 < 4) {
                for (i20 = 1; i20 > 1; i20--) {
                    fArr = FuzzerUtils.float1array(N, (float)-30.447F);
                }
                d2 = Test.iFld;
                Test.instanceCount += i19;
                Test.iArrFld[i19 - 1] *= i17;
            }
        }
        long meth_res = Float.floatToIntBits(f) + Double.doubleToLongBits(d2) + by1 + i17 + i18 + i19 + i20 + i21 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-60846, i1=187, i22=1, i23=-63849, i24=61, i25=14, i26=43827, iArr[]=new int[N], iArr2[]=new int[N];
        double d3=-2.121200;
        byte by2=-93;
        float f2=10.173F;
        boolean b1=false;

        FuzzerUtils.init(iArr, 152);
        FuzzerUtils.init(iArr2, 20113);

        i <<= Math.abs((-(--i)) * (++i));
        i1 = 1;
        while (++i1 < 382) {
            i += (((i1 * Test.instanceCount) + Test.instanceCount) - Test.instanceCount);
            i <<= iMeth(Test.fFld);
            for (d3 = 3; d3 < 66; ++d3) {
                i22 *= (int)Test.instanceCount;
                Test.iFld -= (int)1.104504;
                Test.instanceCount >>= i22;
                Test.iFld >>>= i1;
                i += (int)Test.instanceCount;
                Test.iFld += (int)(d3 * d3);
            }
            try {
                iArr[i1] = (i22 / -17759);
                i22 = (100 % iArr[i1 - 1]);
                i = (iArr2[i1 + 1] % -836131660);
            } catch (ArithmeticException a_e) {}
            Test.lArrFld[i1 - 1] = i1;
            for (i23 = 1; i23 < 66; i23++) {
                Test.lArrFld[i1 + 1] = by2;
                i22 = i24;
                i22 += (i23 * i23);
                Test.sFld -= (short)i1;
                i25 = 1;
                do {
                    Test.lArrFld1 = FuzzerUtils.long2array(N, (long)-4320475232318384791L);
                    i22 -= (int)Test.instanceCount;
                    f2 += (i25 + i22);
                    Test.dFld -= f2;
                    switch (((Test.iFld >>> 1) % 3) + 69) {
                    case 69:
                        Test.iFld ^= (int)-12L;
                        switch (((i24 >>> 1) % 6) + 49) {
                        case 49:
                            Test.instanceCount = 45626;
                            Test.sFld += (short)(((i25 * i22) + i) - Test.instanceCount);
                            Test.iFld = 99;
                            break;
                        case 50:
                            Test.dFld -= i23;
                        case 51:
                            Test.instanceCount *= i24;
                        case 52:
                            i26 = Test.iFld;
                            break;
                        case 53:
                            iArr2[i23 - 1] = (int)Test.instanceCount;
                            break;
                        case 54:
                            i22 = (int)Test.instanceCount;
                            break;
                        }
                        break;
                    case 70:
                        b1 = b1;
                    case 71:
                        i26 |= i24;
                        break;
                    default:
                        Test.iFld += i25;
                    }
                } while (++i25 < 2);
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
