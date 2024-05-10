package tests.javafuzzer1592;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 23:24:57 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2727103906111612464L;
    public static volatile float fFld=-107.993F;
    public static int iFld=-65518;
    public static double dFld=0.39597;
    public static int iArrFld[]=new int[N];
    public static boolean bArrFld[]=new boolean[N];
    public static double dArrFld[]=new double[N];
    public static byte byArrFld[][]=new byte[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, -25366);
        FuzzerUtils.init(Test.bArrFld, true);
        FuzzerUtils.init(Test.dArrFld, -38.97002);
        FuzzerUtils.init(Test.byArrFld, (byte)111);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(double d2, int i12) {

        int i13=-89, i14=1, i15=-46427, i16=-201, i17=-76;
        boolean b1=true;
        float f=103.901F;
        byte by=22;

        for (i13 = 10; i13 < 198; ++i13) {
            if (b1) continue;
            i15 = 1;
            do {
                i14 -= i16;
                d2 = f;
                Test.instanceCount += i13;
                Test.iArrFld[i13] = i14;
                i17 = 1;
                while (++i17 < 1) {
                    Test.instanceCount = i17;
                    i12 = i16;
                }
                i16 += (int)(69L + (i15 * i15));
                switch ((i15 % 2) + 22) {
                case 22:
                    by += (byte)-3633240781L;
                    break;
                case 23:
                    if (i12 != 0) {
                        vMeth2_check_sum += Double.doubleToLongBits(d2) + i12 + i13 + i14 + (b1 ? 1 : 0) + i15 + i16 +
                            Float.floatToIntBits(f) + i17 + by;
                        return;
                    }
                }
                i14 += (-129 + (i15 * i15));
            } while (++i15 < 8);
        }
        vMeth2_check_sum += Double.doubleToLongBits(d2) + i12 + i13 + i14 + (b1 ? 1 : 0) + i15 + i16 +
            Float.floatToIntBits(f) + i17 + by;
    }

    public static void vMeth1(double d1, int i7, int i8) {

        int i9=28027, i10=50, i11=-140, i18=-211, i19=-54, i20=57, i21=-40670, i22=5709, i23=-3440;
        boolean b2=true;
        short s=13299, sArr[]=new short[N];
        byte by1=83;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -7L);
        FuzzerUtils.init(sArr, (short)8343);

        for (i9 = 9; i9 < 278; i9++) {
            i10 ^= i11;
            if (b2) {
                vMeth2(d1, i7);
                for (i18 = i9; i18 < 6; ++i18) {
                    i7 += i8;
                    if (i8 != 0) {
                        vMeth1_check_sum += Double.doubleToLongBits(d1) + i7 + i8 + i9 + i10 + i11 + i18 + i19 + (b2 ?
                            1 : 0) + i20 + i21 + s + by1 + i22 + i23 + FuzzerUtils.checkSum(lArr1) +
                            FuzzerUtils.checkSum(sArr);
                        return;
                    }
                    if (b2) {
                        if (b2) break;
                    } else {
                        Test.iArrFld = Test.iArrFld;
                        switch (i9 + 68) {
                        case 68:
                        case 69:
                            lArr1[i9 - 1] = i11;
                        case 70:
                            for (i20 = 1; i18 < i20; --i20) {
                                i8 += (i20 - i8);
                                Test.iArrFld = Test.iArrFld;
                            }
                            break;
                        case 71:
                            Test.fFld += i11;
                            break;
                        case 72:
                            i21 += (((i18 * i20) + i11) - i21);
                            break;
                        case 73:
                            Test.instanceCount += (55710 + (i18 * i18));
                            break;
                        case 74:
                            i11 += 51535;
                            break;
                        case 75:
                            i11 += (i18 - i10);
                        case 76:
                            Test.dArrFld[i9] -= i10;
                            break;
                        case 77:
                            if (b2) continue;
                            break;
                        case 78:
                            Test.instanceCount = i8;
                            break;
                        case 79:
                            Test.instanceCount -= i8;
                            break;
                        case 80:
                            i21 >>= i8;
                            break;
                        case 81:
                            if (i8 != 0) {
                                vMeth1_check_sum += Double.doubleToLongBits(d1) + i7 + i8 + i9 + i10 + i11 + i18 + i19
                                    + (b2 ? 1 : 0) + i20 + i21 + s + by1 + i22 + i23 + FuzzerUtils.checkSum(lArr1) +
                                    FuzzerUtils.checkSum(sArr);
                                return;
                            }
                            break;
                        case 82:
                            i10 -= 76;
                            break;
                        case 83:
                            i7 = i19;
                            break;
                        case 84:
                            if (b2) break;
                        case 85:
                            Test.instanceCount ^= i20;
                            break;
                        case 86:
                            s += (short)Test.iFld;
                            break;
                        case 87:
                            i10 >>>= i18;
                        case 88:
                            i10 += s;
                            break;
                        case 89:
                            lArr1[i18 - 1] ^= i21;
                            break;
                        case 90:
                        case 91:
                            Test.instanceCount += 41235L;
                        case 92:
                            Test.iArrFld[i18 + 1] &= i21;
                        case 93:
                            i7 -= (int)Test.instanceCount;
                        case 94:
                            Test.dArrFld[i18] = i8;
                            break;
                        case 95:
                            i11 += i18;
                            break;
                        case 96:
                            sArr[i9 + 1] = by1;
                            break;
                        case 97:
                            Test.instanceCount = i22;
                        case 98:
                            d1 += i11;
                            break;
                        case 99:
                            lArr1[i18 - 1] = i11;
                        case 100:
                        case 101:
                            if (i22 != 0) {
                                vMeth1_check_sum += Double.doubleToLongBits(d1) + i7 + i8 + i9 + i10 + i11 + i18 + i19
                                    + (b2 ? 1 : 0) + i20 + i21 + s + by1 + i22 + i23 + FuzzerUtils.checkSum(lArr1) +
                                    FuzzerUtils.checkSum(sArr);
                                return;
                            }
                        case 102:
                            Test.instanceCount += (((i18 * i10) + Test.iFld) - Test.instanceCount);
                            break;
                        case 103:
                            Test.iArrFld[i9 - 1] = i8;
                            break;
                        case 104:
                            i19 += by1;
                            break;
                        case 105:
                            d1 += i8;
                        case 106:
                            i10 <<= i11;
                            break;
                        case 107:
                            Test.instanceCount &= Test.iFld;
                            break;
                        case 108:
                            lArr1[i9] += Test.instanceCount;
                            break;
                        case 109:
                            s += (short)(i18 | i18);
                            break;
                        case 110:
                            s <<= (short)i11;
                            break;
                        case 111:
                            Test.fFld += by1;
                            break;
                        case 112:
                            i21 = i20;
                        case 113:
                            if (b2) break;
                            break;
                        case 114:
                            i19 += (10 + (i18 * i18));
                            break;
                        case 115:
                            Test.iArrFld[i18] -= (int)-184L;
                            break;
                        case 116:
                            i8 += 14157;
                        case 117:
                            i22 = i10;
                            break;
                        case 118:
                            i10 += (((i18 * i18) + i8) - i22);
                            break;
                        case 119:
                            i21 *= i7;
                        case 120:
                            i10 = -16638;
                            break;
                        case 121:
                            Test.instanceCount = 36079;
                        case 122:
                            Test.instanceCount = i20;
                            break;
                        case 123:
                            Test.fFld = 161L;
                        case 124:
                            Test.instanceCount = Test.instanceCount;
                        case 125:
                            i10 += (-164 + (i18 * i18));
                            break;
                        case 126:
                            Test.byArrFld[i9 - 1] = Test.byArrFld[i18];
                            break;
                        case 127:
                            Test.iFld <<= (int)Test.instanceCount;
                            break;
                        case 128:
                            i10 = (int)Test.fFld;
                            break;
                        case 129:
                            i11 += (14 + (i18 * i18));
                            break;
                        case 130:
                            i22 += (i18 * i18);
                            break;
                        case 131:
                            by1 &= (byte)-31;
                            break;
                        case 132:
                            if (true) continue;
                            break;
                        case 133:
                            Test.iArrFld[i9 - 1] += (int)Test.fFld;
                            break;
                        case 134:
                            by1 = (byte)i11;
                        case 135:
                            Test.iArrFld[i18] = s;
                            break;
                        case 136:
                            i19 = (int)Test.instanceCount;
                            break;
                        case 137:
                            i23 = (int)Test.fFld;
                        }
                    }
                }
            } else if (b2) {
                lArr1[i9 + 1] = 150;
            } else if (b2) {
                try {
                    i11 = (-39109 / Test.iArrFld[i9]);
                    i11 = (-32 % i7);
                    i7 = (-188 % i23);
                } catch (ArithmeticException a_e) {}
            } else {
                Test.instanceCount += (((i9 * i21) + i23) - Test.iFld);
            }
        }
        vMeth1_check_sum += Double.doubleToLongBits(d1) + i7 + i8 + i9 + i10 + i11 + i18 + i19 + (b2 ? 1 : 0) + i20 +
            i21 + s + by1 + i22 + i23 + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(sArr);
    }

    public static void vMeth(int i2, int i3, double d) {

        int i4=-8, i5=-6, i6=57881;
        boolean b=true;
        short s1=-22396;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 5583525849090532584L);

        for (i4 = 23; i4 < 394; i4++) {
            i3 = Test.iArrFld[i4 - 1];
            Test.bArrFld[i4] = b;
            i6 = 1;
            while (++i6 < 5) {
                Test.bArrFld[i4] = b;
                vMeth1(d, 1, i6);
                Test.iArrFld = Test.iArrFld;
                i3 += (0 + (i6 * i6));
                i3 *= i2;
                switch (((i6 % 2) * 5) + 62) {
                case 68:
                    if (b) {
                        d += Test.fFld;
                        i3 += (i6 * i6);
                        Test.iFld += i6;
                    } else if (b) {
                        Test.instanceCount += -78L;
                    }
                    break;
                case 65:
                    Test.instanceCount *= s1;
                    break;
                }
            }
        }
        vMeth_check_sum += i2 + i3 + Double.doubleToLongBits(d) + i4 + i5 + (b ? 1 : 0) + i6 + s1 +
            FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-13, i1=11, i24=36, i25=-3, i26=7, i27=11, i28=240, i29=2, i30=15, i31=-15377, i32=-9;
        boolean b3=false;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -117.835F);

        i = 1;
        while (++i < 358) {
            Test.instanceCount += (124 + (i * i));
            i1 += (57533 + (i * i));
            vMeth(Test.iFld, Test.iFld, Test.dFld);
            if (b3) break;
            for (i24 = i; i24 < 70; ++i24) {
                for (i26 = 1; i26 < 1; i26++) {
                    i1 *= (int)Test.dFld;
                }
                i27 += (int)36143L;
                Test.iArrFld[i24 - 1] = i26;
                i27 = i1;
                Test.fFld -= 2.267F;
                for (i28 = 1; i28 < 1; i28++) {
                    Test.instanceCount -= i24;
                    i25 = i26;
                    i29 = i28;
                    Test.iFld += i28;
                    i1 ^= (int)Test.instanceCount;
                    i25 = i26;
                    i27 = -250;
                    Test.iFld -= i1;
                    Test.iArrFld[i24 + 1] += i28;
                }
                for (i30 = 1; i30 < 1; i30++) {
                    Test.iArrFld[i + 1] = -27582;
                    i25 = i1;
                }
            }
            i25 = 26700;
            i27 *= 63611;
            Test.instanceCount += Test.instanceCount;
        }
        i32 *= i29;
        fArr[(i25 >>> 1) % N] = i27;


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
