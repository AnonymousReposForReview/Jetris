package tests.javafuzzer1722;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 02:32:23 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=1331497296L;
    public static long lFld=-234L;
    public static byte byFld=-106;
    public int iFld=22324;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[][]=new int[N][N];
    public float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -6L);
        FuzzerUtils.init(Test.iArrFld, -7);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;

    public static long lMeth1(int i10, int i11, float f2) {

        long l4=-15319L;
        int i12=-212, i13=58574, i14=97;
        byte by1=125, by2=-4;
        short s1=7062;
        double d=2.316;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, false);

        for (l4 = 1; l4 < 273; l4++) {
            Test.instanceCount *= -48315;
            f2 += l4;
            i10 >>>= i11;
            by1 = (byte)i11;
            i11 = by1;
            i10 -= s1;
            i10 += (int)(l4 * l4);
            for (d = 1; d < 6; d++) {
                i12 = i13;
                Test.lArrFld[(int)(l4 - 1)] = i10;
                i14 = 1;
                while (++i14 < 2) {
                    Test.iArrFld[(int)(l4 + 1)][(int)(l4)] -= i11;
                    i12 = by2;
                    bArr = bArr;
                }
            }
        }
        long meth_res = i10 + i11 + Float.floatToIntBits(f2) + l4 + i12 + by1 + s1 + Double.doubleToLongBits(d) + i13 +
            i14 + by2 + FuzzerUtils.checkSum(bArr);
        lMeth1_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(long l1, float f1, long l2) {

        int i4=-9, i5=-4, i6=4, i7=52385, i8=-5, i9=-8;
        long l3=162L;

        i4 = (int)(Math.max(l1, Test.lFld) - (f1 = f1));
        for (i5 = 2; 203 > i5; i5++) {
            for (l3 = 1; l3 < 8; l3 += 2) {
                for (i8 = 3; i8 > 1; i8 -= 2) {
                    i9 >>= (int)(((i7 * i4) + (l2 + i5)) % (l3 | 1));
                    l1 -= (-lMeth1(-5, i5, f1));
                    Test.instanceCount = -2L;
                    i9 >>= (int)l1;
                    i9 += (((i8 * i4) + f1) - l1);
                    i6 &= i6;
                    i4 |= (int)l1;
                    i9 -= 38027;
                }
                Test.lArrFld[(int)(l3)] += i7;
                try {
                    Test.iArrFld[(int)(l3)][(int)(l3 - 1)] = (i6 % i9);
                    i4 = (i6 / i4);
                    Test.iArrFld[i5][i5 + 1] = (i9 / 25);
                } catch (ArithmeticException a_e) {}
                Test.iArrFld[(int)(l3)][i5] -= -14;
            }
        }
        vMeth_check_sum += l1 + Float.floatToIntBits(f1) + l2 + i4 + i5 + i6 + l3 + i7 + i8 + i9;
    }

    public static long lMeth(long l, float f, int i2) {

        int i3=10, i15=0, i16=-32213, i17=13;
        short s=-18262;
        float f3=2.660F;
        boolean b1=false;

        i3 = 233;
        do {
            i2 <<= (int)(Test.instanceCount + ((s - 22977) * (Test.instanceCount - i2)));
            vMeth(Test.instanceCount, f3, Test.lFld);
            switch (((i3 >>> 1) % 7) + 62) {
            case 62:
                i15 = 7;
                while ((i15 -= 3) > 0) {
                    boolean b=false;
                    Test.lFld = i15;
                    switch (((i15 % 8) * 5) + 74) {
                    case 83:
                        Test.iArrFld[i15][i3 - 1] = (int)Test.lFld;
                        break;
                    case 94:
                        Test.lFld += (i15 * i15);
                        for (i16 = 1; i16 < 3; i16++) {
                            Test.iArrFld[i16][i16] *= (int)124.327F;
                            i17 -= i17;
                            i17 += (int)Test.lFld;
                            i2 += (i16 + f3);
                        }
                    case 99:
                        Test.byFld += (byte)i16;
                    case 77:
                        Test.byFld = (byte)s;
                        break;
                    case 104:
                        i2 *= i2;
                        break;
                    case 75:
                        i17 -= -38593;
                    case 90:
                        if (b) continue;
                    case 109:
                        i17 <<= 35261;
                        break;
                    }
                }
                break;
            case 63:
                i2 = i3;
            case 64:
                i2 += (((i3 * f3) + i2) - Test.instanceCount);
            case 65:
                i17 &= (int)Test.lFld;
                break;
            case 66:
                i2 += (int)(-1313494650L + (i3 * i3));
                break;
            case 67:
                Test.iArrFld[i3][i3] += (int)f3;
                break;
            case 68:
                if (b1) continue;
                break;
            }
        } while (--i3 > 0);
        long meth_res = l + Float.floatToIntBits(f) + i2 + i3 + s + Float.floatToIntBits(f3) + i15 + i16 + i17 + (b1 ?
            1 : 0);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-5, i1=-10, i18=10, i19=0, i20=4, i21=-17868, i22=18, i23=-123, i24=52, i25=49565, i26=7, i27=202, i29=3;
        byte by=21;
        short s2=15848;
        float f4=102.400F;
        double d1=0.107765;

        i -= 8;
        i1 *= (int)(by + lMeth(Test.lFld, 0.455F, i));
        for (i18 = 210; i18 > 11; i18 -= 2) {
            i20 <<= s2;
            switch (((i19 >>> 1) % 7) + 76) {
            case 76:
                i1 >>= i20;
                i21 = 1;
                do {
                    Test.lFld += i21;
                    Test.lFld += i21;
                    i = 149;
                    for (i22 = 1; i22 < 1; i22++) {
                        i += i21;
                        i += (int)Test.lFld;
                    }
                    i20 += (i21 * i21);
                    switch (((i18 % 9) * 5) + 54) {
                    case 65:
                        f4 += i21;
                        for (i24 = 1; i24 > 1; --i24) {
                            fArrFld[i21 - 1] += (float)d1;
                            i23 <<= (int)Test.lFld;
                        }
                        f4 += (0 + (i21 * i21));
                        i25 += (int)Test.lFld;
                        break;
                    case 88:
                        fArrFld = fArrFld;
                        for (i26 = 1; i26 > i21; i26 -= 3) {
                            int i28=-59990;
                            i27 <<= i26;
                            Test.instanceCount += Test.instanceCount;
                            i19 += (i26 * i23);
                            try {
                                i1 = (i19 % i27);
                                i20 = (i28 % 228);
                                Test.iArrFld[i26 + 1][i18 - 1] = (i / iFld);
                            } catch (ArithmeticException a_e) {}
                            Test.lFld = i27;
                        }
                        break;
                    case 69:
                        i1 = (int)Test.instanceCount;
                        Test.lFld += (i21 * i18);
                    case 86:
                        i29 = i;
                        break;
                    case 64:
                        i27 += (i21 * i21);
                        break;
                    case 84:
                        i20 -= (int)f4;
                        break;
                    case 62:
                        Test.lFld <<= i22;
                        break;
                    case 85:
                        Test.lFld = 73;
                        break;
                    case 56:
                        i1 += i23;
                        break;
                    }
                } while (++i21 < 253);
            case 77:
                f4 -= Test.lFld;
                break;
            case 78:
                Test.lFld *= i;
                break;
            case 79:
            case 80:
                i25 = i23;
                break;
            case 81:
                Test.instanceCount = i1;
                break;
            case 82:
                if (false) continue;
                break;
            default:
                Test.iArrFld[i18 - 1][i18 - 1] -= (int)d1;
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
//DEBUG  lMeth1 ->  lMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}