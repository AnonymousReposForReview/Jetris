package tests.javafuzzer2876;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 22:06:42 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-6049523410738293265L;
    public static boolean bFld=false;
    public static volatile double dFld=-7.94279;
    public int iFld=6;
    public static float fFld=64.574F;
    public volatile short sFld=-20214;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 0);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i9=-214, i10=9, i11=-44015, i12=-141, i13=5183, i14=-17592, iArr[]=new int[N];
        byte by=4;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -50.107535);
        FuzzerUtils.init(iArr, 8);

        for (i9 = 266; i9 > 3; i9 -= 2) {
            i10 += i9;
            i10 >>= -7;
            i10 += (int)Test.instanceCount;
            if (true) break;
            dArr[i9 - 1] *= i10;
            for (i11 = 1; i11 < 12; ++i11) {
                i12 >>= by;
                i12 >>= i13;
                i13 = i10;
            }
            i14 = 1;
            while (++i14 < 12) {
                if (Test.bFld) continue;
                if (Test.bFld) continue;
                i10 %= (int)(i11 | 1);
                iArr[i9 + 1] = i12;
            }
        }
        vMeth1_check_sum += i9 + i10 + i11 + i12 + by + i13 + i14 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr))
            + FuzzerUtils.checkSum(iArr);
    }

    public static long lMeth(int i8, double d, long l1) {

        int i15=149, i16=-196, i17=-245, i18=-23, i19=227, i20=5, i21=-8;
        float f=-1.822F;
        byte by1=64;
        boolean b1=false;
        short sArr[][]=new short[N][N];

        FuzzerUtils.init(sArr, (short)-5821);

        Test.instanceCount *= (i8++);
        vMeth1();
        for (i15 = 7; i15 < 185; ++i15) {
            Test.iArrFld[i15] = -34099;
        }
        for (f = 2; f < 132; f++) {
            l1 = i8;
            if (Test.bFld) {
                i8 += (int)((long)f | Test.instanceCount);
                i17 += (int)(((f * i15) + f) - i16);
                d = -53;
                for (i18 = 1; i18 < 12; ++i18) {
                    for (i20 = 1; 2 > i20; ++i20) {
                        l1 *= Test.instanceCount;
                    }
                    sArr = sArr;
                    l1 *= (long)f;
                }
            } else if (b1) {
                by1 += (byte)i19;
            } else if (true) {
                i19 *= 181;
            } else {
                i8 = i18;
            }
        }
        long meth_res = i8 + Double.doubleToLongBits(d) + l1 + i15 + i16 + Float.floatToIntBits(f) + i17 + i18 + i19 +
            i20 + i21 + by1 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(sArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(long l, int i, int i1) {

        int i2=1, i3=-156, i4=6, i5=167, i6=-6, i7=-65206, i22=3;
        boolean b=false;
        byte by2=-31;
        float f1=-55.869F;

        for (i2 = 7; i2 < 214; ++i2) {
            switch ((i2 % 6) + 85) {
            case 85:
                for (i4 = 1; i4 < 8; i4++) {
                    short s=-21121;
                    for (i6 = 1; i6 < 2; i6++) {
                        if (b) break;
                        i7 = (int)(-lMeth(i2, Test.dFld, l));
                        i7 = by2;
                    }
                    s += (short)(((i4 * i) + l) - l);
                    l = l;
                    switch (((i2 % 3) * 5) + 73) {
                    case 75:
                        f1 = 2;
                        while (--f1 > 0) {
                            i22 = 73;
                            if (b) {
                                i1 += (int)(f1 - f1);
                                i1 ^= 103;
                            } else {
                            }
                        }
                    case 78:
                    case 83:
                        i5 += (i4 | i);
                        break;
                    default:
                        try {
                            i22 = (139 % i1);
                            i3 = (-35615 % Test.iArrFld[i4 - 1]);
                            i7 = (Test.iArrFld[i4] / i5);
                        } catch (ArithmeticException a_e) {}
                    }
                }
            case 86:
                if (b) break;
                break;
            case 87:
                i22 += i2;
            case 88:
                i1 <<= i3;
            case 89:
                by2 >>= (byte)i22;
            case 90:
                Test.dFld = Test.instanceCount;
                break;
            default:
                i1 = 20966;
            }
        }
        vMeth_check_sum += l + i + i1 + i2 + i3 + i4 + i5 + i6 + i7 + (b ? 1 : 0) + by2 + Float.floatToIntBits(f1) +
            i22;
    }

    public void mainTest(String[] strArr1) {

        int i23=0, i24=9, i25=14, i26=152, i27=-23681, i28=9, i29=-206, i30=24240, i31=-160, i32=26178, i33=-7,
            i34=117, iArr1[][]=new int[N][N];
        long lArr[]=new long[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(iArr1, -54);
        FuzzerUtils.init(lArr, -5517336793015308399L);
        FuzzerUtils.init(byArr, (byte)-76);

        vMeth(Test.instanceCount, iFld, iFld);
        iFld += -6;
        for (i23 = 165; i23 > 1; --i23) {
            iArr1 = iArr1;
            i24 = (int)Test.instanceCount;
            for (i25 = 1; i25 < 153; ++i25) {
                i26 += i23;
            }
            lArr[i23] += i24;
            byArr[i23] = (byte)i24;
            Test.iArrFld[i23] = i25;
        }
        i24 -= iFld;
        for (i27 = 18; i27 < 304; i27++) {
            lArr[i27] += (long)Test.dFld;
        }
        Test.fFld = i24;
        for (i29 = 1; i29 < 157; i29++) {
            byte by3=-3;
            switch (((41 >>> 1) % 10) + 102) {
            case 102:
                i30 = i24;
                for (i31 = 6; i31 < 161; i31++) {
                    Test.instanceCount <<= iFld;
                    i26 -= i24;
                    iFld -= (int)Test.fFld;
                    try {
                        i30 = (iArr1[i29 - 1][i31] / i28);
                        iFld = (-117 / i27);
                        iFld = (i30 % -214);
                    } catch (ArithmeticException a_e) {}
                    for (i33 = 2; i33 > 1; i33--) {
                        Test.dFld += i23;
                        i30 -= i29;
                        if (Test.bFld) continue;
                        Test.instanceCount += (((i33 * i31) + sFld) - i33);
                        i24 = i25;
                        iArr1[i29][i33] = i25;
                        Test.instanceCount = (long)Test.fFld;
                    }
                }
                break;
            case 103:
                i34 += (-11 + (i29 * i29));
                break;
            case 104:
                iFld *= 157;
            case 105:
                Test.instanceCount += (i29 * i23);
                break;
            case 106:
                Test.fFld += (i29 + i27);
                break;
            case 107:
                i26 += i23;
            case 108:
                i28 += i29;
                break;
            case 109:
                i26 += (((i29 * by3) + iFld) - Test.instanceCount);
                break;
            case 110:
                i26 *= 4420;
            case 111:
                i34 -= (int)Test.instanceCount;
                break;
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
