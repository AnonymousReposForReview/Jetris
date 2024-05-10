package tests.javafuzzer3358;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 06:38:35 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-50L;
    public static short sFld=-2800;
    public static byte byFld=-55;
    public static float fFld=1.196F;
    public static boolean bArrFld[]=new boolean[N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long bMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f, int i6) {

        int i7=-46521, i8=27, i9=-10, i10=-30555, i11=-142, i12=0, i13=241;
        long l2=-26469L;
        double d=96.115927;

        for (i7 = 4; i7 < 178; i7++) {
            for (i9 = 1; i9 < 9; i9++) {
                i6 += (((i9 * i10) + i10) - Test.instanceCount);
                if (i9 != 0) {
                    vMeth1_check_sum += Float.floatToIntBits(f) + i6 + i7 + i8 + i9 + i10 + i11 + i12 + l2 + i13 +
                        Double.doubleToLongBits(d);
                    return;
                }
            }
            for (i11 = 1; i11 < 9; ++i11) {
                for (l2 = 1; l2 < 2; ++l2) {
                    i8 += i11;
                    Test.instanceCount |= l2;
                    f = i13;
                    i10 = i9;
                    if (i8 != 0) {
                        vMeth1_check_sum += Float.floatToIntBits(f) + i6 + i7 + i8 + i9 + i10 + i11 + i12 + l2 + i13 +
                            Double.doubleToLongBits(d);
                        return;
                    }
                    i12 -= 7;
                }
            }
        }
        d = Test.instanceCount;
        vMeth1_check_sum += Float.floatToIntBits(f) + i6 + i7 + i8 + i9 + i10 + i11 + i12 + l2 + i13 +
            Double.doubleToLongBits(d);
    }

    public static void vMeth(long l1, int i4, int i5) {

        float f1=55.439F, fArr[][]=new float[N][N];
        int i14=0, i15=60023, i16=21332, i17=244, i18=-1, i19=-128, iArr1[]=new int[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr1, -4);
        FuzzerUtils.init(fArr, 103.700F);
        FuzzerUtils.init(lArr, -14842L);

        i5 += (Test.sFld--);
        vMeth1(f1, 9);
        f1 += i14;
        for (i15 = 4; i15 < 155; ++i15) {
            iArr1[i15] *= Test.byFld;
            l1 += i15;
            try {
                i14 = (-42 % i15);
                i5 = (i15 % 116);
                i16 = (-49948 % i4);
            } catch (ArithmeticException a_e) {}
            for (i17 = 10; 1 < i17; --i17) {
                fArr[i17][i15 - 1] = -112L;
                i18 = (int)f1;
                i16 += (((i17 * i4) + i18) - Test.instanceCount);
                lArr[i15 + 1] -= i17;
                iArr1[i15] *= i4;
                i4 += (int)Test.instanceCount;
            }
            i19 += (((i15 * l1) + i14) - l1);
        }
        vMeth_check_sum += l1 + i4 + i5 + Float.floatToIntBits(f1) + i14 + i15 + i16 + i17 + i18 + i19 +
            FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(lArr);
    }

    public static boolean bMeth(int i, int i1) {

        int i2=-63095, i3=-5, i20=50735, i21=-7, i22=50887, i23=175, i24=248, i25=63867, i26=5, iArr[]=new int[N];
        boolean b=true;
        byte by=4;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr, 13);
        FuzzerUtils.init(lArr1, 370531161L);

        switch ((((iArr[(i1 >>> 1) % N]++) >>> 1) % 2) + 123) {
        case 123:
            for (i2 = 286; i2 > 14; i2 -= 2) {
                if (i2 != 0) {
                    return ((int)(i + i1 + i2 + i3 + i20 + i21 + i22 + i23 + i24 + i25 + i26 + (b ? 1 : 0) + by +
                        FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr1))) % 2 > 0;
                }
                Test.instanceCount -= (--i1);
                i += i2;
                vMeth(-90L, -5, i3);
            }
            i20 = 1;
            do {
                for (i21 = 1; i21 < 7; ++i21) {
                    for (i23 = i21; i23 < 2; ++i23) {
                        Test.instanceCount |= 243L;
                    }
                    lArr1 = lArr1;
                    i22 = (int)Test.fFld;
                }
                for (i25 = 1; i25 < 7; i25++) {
                    Test.fFld = 47;
                    Test.fFld += i25;
                }
            } while (++i20 < 238);
            break;
        case 124:
            b = false;
            break;
        default:
            i24 -= by;
        }
        long meth_res = i + i1 + i2 + i3 + i20 + i21 + i22 + i23 + i24 + i25 + i26 + (b ? 1 : 0) + by +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr1);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void mainTest(String[] strArr1) {

        long l=11L, lArr2[]=new long[N];
        int i28=-3, i29=-5, i30=-166, i31=-63365, i32=6, i33=551, i34=234, i35=62, i36=-10;
        double d1=-25.129232;
        boolean b1=false;
        short sArr[]=new short[N];

        FuzzerUtils.init(lArr2, 40349L);
        FuzzerUtils.init(sArr, (short)203);

        l = 1;
        do {
            Test.bArrFld[(int)(l - 1)] = bMeth(i28, i28);
            d1 *= l;
            Test.instanceCount = l;
            i28 = i28;
            lArr2[(int)(l - 1)] = i28;
            i28 |= Test.byFld;
            sArr[(int)(l)] = (short)i28;
            i28 -= (int)d1;
            i28 += (int)(((l * i28) + l) - Test.sFld);
        } while (++l < 274);
        for (i29 = 10; i29 < 168; i29++) {
            Test.instanceCount = i30;
        }
        for (i31 = 16; i31 < 291; i31++) {
            i32 += (47406 + (i31 * i31));
            for (i33 = 3; 91 > i33; i33++) {
                Test.instanceCount = 4107261794881957688L;
                Test.fFld -= i34;
                i30 -= i31;
                Test.instanceCount %= (i35 | 1);
                i34 = (int)l;
                d1 -= i31;
                i36 = 1;
                do {
                    switch (((i31 % 5) * 5) + 98) {
                    case 117:
                        i28 = i29;
                        Test.instanceCount <<= i33;
                        i34 = i29;
                        i28 += (i36 * i36);
                    case 103:
                        Test.sFld += (short)i36;
                        try {
                            i34 = (i29 / -1021);
                            i28 = (i29 % i34);
                            iArrFld[i36] = (i28 % i36);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 115:
                        b1 = true;
                        break;
                    case 114:
                        iArrFld[i36] = i31;
                    case 106:
                        d1 -= d1;
                    default:
                        i28 >>>= 248;
                    }
                } while (++i36 < 2);
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
//DEBUG  bMeth ->  bMeth mainTest
//DEBUG  vMeth ->  vMeth bMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth bMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}