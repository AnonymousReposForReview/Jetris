package tests.javafuzzer1696;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 01:45:36 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=660951007L;
    public static int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 11);
        FuzzerUtils.init(Test.dArrFld, -1.56476);
    }

    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long byMeth_check_sum = 0;

    public static byte byMeth(boolean b, int i9, int i10) {

        int i11=-13, i12=-144, i13=-5, i14=16115, i15=98, i16=-3, i17=-14;
        float f2=2.682F, f3=9.895F, fArr[]=new float[N];
        short s1=-27321;

        FuzzerUtils.init(fArr, 0.294F);

        for (i11 = 210; i11 > 4; --i11) {
            Test.instanceCount += i11;
            i12 -= (int)f2;
            i9 = (int)Test.instanceCount;
        }
        if (b) {
            Test.instanceCount >>>= Test.instanceCount;
            for (i13 = 3; i13 < 135; ++i13) {
                i10 = 6731;
                f2 *= -42;
                for (i15 = 1; i15 < 12; ++i15) {
                    Test.instanceCount -= i11;
                    i17 = 1;
                    do {
                        if (b) {
                            i16 += (int)Test.instanceCount;
                            f3 += 113;
                        } else {
                            i10 += (((i17 * Test.instanceCount) + Test.instanceCount) - s1);
                        }
                    } while (++i17 < 2);
                }
            }
        } else {
            fArr[(i16 >>> 1) % N] -= i17;
        }
        long meth_res = (b ? 1 : 0) + i9 + i10 + i11 + i12 + Float.floatToIntBits(f2) + i13 + i14 + i15 + i16 + i17 +
            Float.floatToIntBits(f3) + s1 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public static void vMeth() {

        int i6=-8, i7=198, i8=-96, i18=35468, i19=11720, i20=-4251, i21=145;
        float f1=119.981F;
        boolean b1=true;
        long lArr1[][]=new long[N][N];

        FuzzerUtils.init(lArr1, -2517211002435557250L);

        i6 = (i6 | ((i6++) - (i6 >> i6)));
        f1 = 1;
        while (++f1 < 165) {
            for (i7 = 1; i7 < 10; ++i7) {
                Test.instanceCount = Test.iArrFld[i7 - 1];
                Test.iArrFld[i7 - 1] = (int)(((10L + (--Test.iArrFld[i7 - 1])) - (Test.instanceCount++)) +
                    Test.instanceCount);
                i6 ^= byMeth(b1, i7, i7);
                Test.instanceCount *= 126;
            }
            i8 += (int)(f1 * i6);
            i6 *= -39485;
        }
        for (i18 = 16; i18 < 328; ++i18) {
            for (i20 = i18; i20 < 5; ++i20) {
                lArr1[i18][i20] = i7;
                i8 -= i21;
                i19 -= i8;
                i19 += (int)1.300F;
            }
        }
        vMeth_check_sum += i6 + Float.floatToIntBits(f1) + i7 + i8 + (b1 ? 1 : 0) + i18 + i19 + i20 + i21 +
            FuzzerUtils.checkSum(lArr1);
    }

    public static float fMeth(int i3, float f, int i4) {

        int i5=-170, i22=38936, i23=-40495, i24=6;

        i4 *= (int)Test.instanceCount;
        i5 *= i5;
        i3 &= -4;
        vMeth();
        i4 <<= i3;
        i3 <<= 232;
        i4 -= (int)f;
        i5 -= -12;
        i4 >>= i3;
        for (i22 = 1; 257 > i22; i22++) {
            i23 -= i3;
            i24 = 1;
            do {
                i5 *= i24;
            } while (++i24 < 6);
            Test.iArrFld[i22 - 1] += (int)Test.instanceCount;
            i4 = (int)-1.257F;
        }
        long meth_res = i3 + Float.floatToIntBits(f) + i4 + i5 + i22 + i23 + i24;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr3) {

        int i1=-3, i2=-4, i25=4496, i26=-8, i27=159;
        double d=50.71820;
        byte by=-48;
        boolean b2=false;
        float f4=-1.119F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 12L);

        for (i1 = 13; i1 < 256; ++i1) {
            d = (Math.max(lArr[i1], lArr[i1]) + ((-8 * fMeth(i2, 2.842F, i1)) + i2));
            by = by;
            if (b2) {
                if (true) break;
                i2 *= i2;
            } else {
                switch ((i1 % 3) + 107) {
                case 107:
                    for (i25 = 2; i25 < 103; i25++) {
                        Test.instanceCount -= (long)f4;
                        b2 = b2;
                        Test.instanceCount += (((i25 * i2) + i1) - i26);
                        switch ((((i1 >>> 1) % 10) * 5) + 33) {
                        case 68:
                            switch (((i2 >>> 1) % 9) + 10) {
                            case 10:
                                i2 += (int)(1084385152062220943L + (i25 * i25));
                                break;
                            case 11:
                                i2 += (int)Test.instanceCount;
                                Test.instanceCount += Test.instanceCount;
                                Test.iArrFld[i1 - 1] += i25;
                                break;
                            case 12:
                                i27 = 2;
                                do {
                                    i2 += (i27 * i27);
                                    i26 = i2;
                                    Test.dArrFld[i25 + 1] *= -39.9F;
                                    i2 <<= (int)Test.instanceCount;
                                } while (--i27 > 0);
                                i26 += i25;
                                Test.instanceCount = i1;
                            case 13:
                            case 14:
                            case 15:
                                i2 += i1;
                                d += -58914;
                                break;
                            case 16:
                                lArr[i25] &= i1;
                            case 17:
                                Test.instanceCount *= i1;
                                i2 += i25;
                                i26 -= -124;
                                break;
                            case 18:
                                i26 *= -220;
                                break;
                            default:
                                lArr[i25 - 1] = Test.instanceCount;
                            }
                            break;
                        case 34:
                            i26 += i25;
                            break;
                        case 80:
                            i26 += i25;
                            break;
                        case 53:
                            i2 += (51745 + (i25 * i25));
                            break;
                        case 44:
                            i2 = (int)Test.instanceCount;
                            break;
                        case 35:
                            Test.instanceCount = i2;
                            break;
                        case 41:
                            f4 += (i25 * i25);
                            break;
                        case 62:
                            try {
                                i26 = (i1 % 226);
                                i26 = (i2 % i1);
                                Test.iArrFld[i25 - 1] = (i26 % -36676);
                            } catch (ArithmeticException a_e) {}
                            break;
                        case 56:
                            by = (byte)i26;
                        case 65:
                            Test.iArrFld[i25] = i27;
                            break;
                        }
                    }
                case 108:
                    Test.iArrFld[i1] ^= i2;
                    break;
                case 109:
                    f4 = i25;
                    break;
                }
            }
        }


    }
    public static void main(String[] strArr2) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr2);
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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  byMeth ->  byMeth vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
