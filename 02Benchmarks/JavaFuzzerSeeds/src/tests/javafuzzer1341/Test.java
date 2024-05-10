package tests.javafuzzer1341;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 18:32:26 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=6437548854592863079L;
    public static double dFld=1.40109;
    public short sFld=2278;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -63965L);
        FuzzerUtils.init(Test.iArrFld, 226);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i7, float f2) {

        int i8=-236, i9=-156, i10=0, i11=57773, i12=-227, i13=54002, iArr[]=new int[N];
        boolean b=false;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(iArr, 69);
        FuzzerUtils.init(byArr, (byte)50);

        for (i8 = 6; i8 < 148; ++i8) {
            byte by=-73;
            by |= (byte)Test.instanceCount;
            if (b) {
                Test.instanceCount += (i8 * i8);
            } else {
                i10 = 1;
                do {
                    switch ((i8 % 2) + 64) {
                    case 64:
                        i7 *= i7;
                        i7 += (i10 - i8);
                        i7 = (int)Test.instanceCount;
                        break;
                    case 65:
                        switch ((i8 % 2) + 86) {
                        case 86:
                            i9 = i9;
                            iArr = iArr;
                            for (i11 = 1; i11 < 1; i11++) {
                                Test.lArrFld[i10 + 1] = i8;
                            }
                            byArr[i10 + 1] += (byte)i9;
                        case 87:
                            by += (byte)(i10 * i10);
                            break;
                        default:
                            i13 -= by;
                        }
                        break;
                    }
                } while (++i10 < 11);
            }
        }
        vMeth2_check_sum += i7 + Float.floatToIntBits(f2) + i8 + i9 + (b ? 1 : 0) + i10 + i11 + i12 + i13 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(byArr);
    }

    public static void vMeth1(int i4, int i5, int i6) {

        float f3=-1.137F;
        int i14=0, i15=0, i16=-90, i17=-12;
        boolean b1=true;

        vMeth2(i4, f3);
        for (i14 = 11; i14 < 176; i14++) {
            if (b1) continue;
            f3 = i6;
            try {
                i15 = (Test.iArrFld[i14 + 1] / 128);
                i4 = (22782 % i5);
                i15 = (194 % i5);
            } catch (ArithmeticException a_e) {}
            for (i16 = 1; i16 < 10; i16++) {
                i17 = 9;
                switch (((-165 >>> 1) % 2) + 111) {
                case 111:
                    i17 *= (int)-238L;
                    if (i16 != 0) {
                        vMeth1_check_sum += i4 + i5 + i6 + Float.floatToIntBits(f3) + i14 + i15 + (b1 ? 1 : 0) + i16 +
                            i17;
                        return;
                    }
                    if (b1) break;
                    Test.instanceCount += (i16 | (long)f3);
                    break;
                case 112:
                    f3 += 32438;
                    i6 <<= i6;
                    break;
                default:
                    i17 += (i16 * i5);
                }
            }
        }
        vMeth1_check_sum += i4 + i5 + i6 + Float.floatToIntBits(f3) + i14 + i15 + (b1 ? 1 : 0) + i16 + i17;
    }

    public void vMeth(int i2, int i3, float f1) {

        int i18=-51397, i19=-1398, i20=10, i21=-5, i22=2579, i23=8, i24=-63;
        boolean b2=false;
        short s=-23763;

        vMeth1(i2, i3, i3);
        Test.dFld += Test.instanceCount;
        i18 = 1;
        while (++i18 < 152) {
            switch (((i18 >>> 1) % 8) + 65) {
            case 65:
                if (b2) {
                    i19 -= (int)Test.instanceCount;
                }
                for (i20 = i18; i20 < 10; i20++) {
                    if (true) continue;
                    for (i22 = 1; i22 < 1; ++i22) {
                        try {
                            Test.iArrFld[i22] = (-188 / i24);
                            i24 = (Test.iArrFld[i18] / i24);
                            i3 = (i2 % -39525);
                        } catch (ArithmeticException a_e) {}
                        if (i18 != 0) {
                            vMeth_check_sum += i2 + i3 + Float.floatToIntBits(f1) + i18 + i19 + (b2 ? 1 : 0) + i20 +
                                i21 + i22 + i23 + i24 + s;
                            return;
                        }
                        i19 = (int)f1;
                        i21 += (((i22 * s) + f1) - i3);
                        Test.instanceCount += (((i22 * i20) + i21) - i23);
                        f1 += (((i22 * i24) + Test.instanceCount) - i24);
                    }
                }
                break;
            case 66:
                Test.lArrFld = FuzzerUtils.long1array(N, (long)-1129241388L);
            case 67:
                i21 /= (int)(Test.instanceCount | 1);
                break;
            case 68:
                Test.instanceCount = i23;
                break;
            case 69:
                Test.instanceCount += (i18 + i20);
            case 70:
                Test.instanceCount <<= i18;
                break;
            case 71:
                Test.iArrFld[i18 - 1] -= i2;
                break;
            case 72:
                i19 = i22;
                break;
            default:
                Test.instanceCount -= Test.instanceCount;
            }
        }
        vMeth_check_sum += i2 + i3 + Float.floatToIntBits(f1) + i18 + i19 + (b2 ? 1 : 0) + i20 + i21 + i22 + i23 + i24
            + s;
    }

    public void mainTest(String[] strArr1) {

        int i=-13, i1=52, i25=-170, i26=9, i27=-5152, i28=-2;
        float f=1.584F;
        long l=-155L;
        double d=-2.117429, dArr[]=new double[N];
        boolean b3=false;
        byte by2=123;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-17670);
        FuzzerUtils.init(dArr, 2.123317);

        i <<= (int)(f - (i * i));
        for (l = 215; l > 13; --l) {
            vMeth(5, i, f);
            Test.instanceCount = sFld;
            switch (((i1 >>> 1) % 6) + 95) {
            case 95:
                Test.instanceCount -= Test.instanceCount;
                switch ((((194 >>> 1) % 4) * 5) + 121) {
                case 138:
                    Test.instanceCount += sFld;
                    f += l;
                    i += (int)l;
                    break;
                case 140:
                    for (i25 = 7; i25 < 124; i25 += 2) {
                        byte by1=33;
                        i26 >>= (int)2231905888L;
                        switch ((int)(((l % 2) * 5) + 52)) {
                        case 56:
                            i = by1;
                            for (d = i25; d < 3; d++) {
                                Test.lArrFld[(int)(d)] = 3235144443L;
                                Test.instanceCount <<= by1;
                            }
                            f += (-169 + (i25 * i25));
                            break;
                        case 57:
                            f += i25;
                            if (b3) break;
                            break;
                        default:
                            i = i26;
                        }
                        Test.iArrFld[i25 - 1] -= (int)f;
                        f *= -70L;
                        Test.dFld = -1.258F;
                        switch (((i25 % 8) * 5) + 38) {
                        case 61:
                            i28 = 1;
                            do {
                                Test.dFld -= i27;
                                Test.instanceCount *= i1;
                                b3 = b3;
                                i26 += i1;
                            } while (++i28 < 3);
                            break;
                        case 75:
                            i26 &= i26;
                            break;
                        case 71:
                            i1 *= i27;
                            break;
                        case 57:
                            sFld -= by1;
                            break;
                        case 60:
                            sArr[i25 + 1] = (short)l;
                            break;
                        case 73:
                            i *= (int)f;
                            break;
                        case 70:
                            dArr[(int)(l)] = i28;
                            break;
                        case 74:
                            i1 -= (int)Test.instanceCount;
                        }
                    }
                case 141:
                    Test.iArrFld = FuzzerUtils.int1array(N, (int)-51);
                    break;
                case 134:
                    dArr[(int)(l - 1)] += i;
                    break;
                default:
                    i26 += 50706;
                }
                break;
            case 96:
                Test.instanceCount *= Test.instanceCount;
            case 97:
            case 98:
                by2 *= (byte)i1;
                break;
            case 99:
                f = i27;
            case 100:
                i26 = (int)Test.instanceCount;
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
