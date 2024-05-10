package tests.javafuzzer3436;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 08:16:48 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3L;
    public static double dFld=1.46312;
    public static volatile boolean bFld=true;
    public long lFld=-3394549792L;
    public static short sArrFld[][]=new short[N][N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)-14675);
        FuzzerUtils.init(Test.lArrFld, -9L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i7, int i8, double d1) {

        int i9=-30598, i10=1, i11=151, i12=21629, i13=-156, i14=197, i15=23148;
        byte by1=-100;
        short s1=-1771;

        i7 = i8;
        i8 &= i7;
        i8 += (int)-2790473188L;
        i7 >>= i7;
        i9 = 1;
        while (++i9 < 351) {
            for (i10 = 1; i10 < 5; ++i10) {
                try {
                    i7 = (i7 % i10);
                    i11 = (i10 % 208);
                    i8 = (i8 % 151);
                } catch (ArithmeticException a_e) {}
                for (i12 = 1; i12 < 2; i12++) {
                    i7 = i9;
                }
                by1 -= (byte)s1;
                by1 = (byte)i13;
            }
            for (i14 = 1; i14 < 5; i14++) {
                i15 *= -9;
                Test.instanceCount += 20432;
                i13 = (int)Test.instanceCount;
            }
        }
        long meth_res = i7 + i8 + Double.doubleToLongBits(d1) + i9 + i10 + i11 + i12 + i13 + by1 + s1 + i14 + i15;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1(int i3, int i4, int i5) {

        int i6=-63875, i16=161, i17=-5, i18=-14, i19=-12, iArr1[]=new int[N];
        byte by=69;
        float f1=0.691F, fArr[]=new float[N];
        short s=6452, sArr[]=new short[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(fArr, 1.300F);
        FuzzerUtils.init(iArr1, -128);
        FuzzerUtils.init(sArr, (short)21084);
        FuzzerUtils.init(dArr, -2.86114);

        i6 = 1;
        do {
            i5 <<= (-(9 * (i6 + by)));
            f1 += (Math.max((int)(i3 - Test.instanceCount), (int)(14429 * (-(-14 * (s - Test.instanceCount))))) + ((f1
                * i4) - lMeth(i3, i5, -2.90973)));
            fArr[i6] *= (float)Test.dFld;
            for (i16 = 1; i16 < 7; i16++) {
                for (i18 = 1; i18 < 2; ++i18) {
                    f1 += (float)2.41149;
                    Test.instanceCount *= (long)Test.dFld;
                    try {
                        i4 = (i16 % i17);
                        i3 = (9759 / i17);
                        iArr1[i18 - 1] = (iArr1[i6] % 11322);
                    } catch (ArithmeticException a_e) {}
                    i19 += 128;
                    switch (((i6 % 8) * 5) + 76) {
                    case 115:
                        sArr[i16 - 1] = (short)Test.dFld;
                        i17 = by;
                        i5 *= (int)Test.instanceCount;
                        break;
                    case 84:
                        iArr1[i18] *= i6;
                    case 112:
                        dArr = FuzzerUtils.double1array(N, (double)43.16760);
                        break;
                    case 105:
                        Test.bFld = Test.bFld;
                        break;
                    case 110:
                        iArr1 = FuzzerUtils.int1array(N, (int)-9);
                        break;
                    case 91:
                        i3 = i6;
                        break;
                    case 100:
                        iArr1[i16] = 3200;
                        break;
                    case 89:
                        by = (byte)Test.instanceCount;
                        break;
                    }
                }
            }
        } while (++i6 < 218);
        vMeth1_check_sum += i3 + i4 + i5 + i6 + by + Float.floatToIntBits(f1) + s + i16 + i17 + i18 + i19 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(sArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth(double d) {

        int i20=-51350, i22=-4263, i23=5, i25=9, i26=-65, iArr2[]=new int[N];
        float f2=38.496F;
        byte by2=77;
        double d2=1.67388;

        FuzzerUtils.init(iArr2, 7);

        vMeth1(-95, 207, i20);
        for (int i21 : iArr2) {
            Test.sArrFld = Test.sArrFld;
        }
        for (i22 = 17; i22 < 295; i22++) {
            f2 = f2;
            i20 = 9;
            iArr2[i22 + 1] += i22;
            d = i22;
            i23 -= (int)Test.instanceCount;
            f2 = -6L;
            by2 |= (byte)i22;
        }
        for (d2 = 5; d2 < 265; ++d2) {
            i26 = 6;
            while ((i26 -= 3) > 0) {
                i23 ^= i22;
                Test.dFld = 35717;
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i20 + i22 + i23 + Float.floatToIntBits(f2) + by2 +
            Double.doubleToLongBits(d2) + i25 + i26 + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i=128, i1=-20783, i2=1309, i27=0, i28=-5, i29=179, i30=0, i31=193, i32=7, i33=6, iArr[]=new int[N];
        float f=-2.187F;
        short s2=5745;

        FuzzerUtils.init(iArr, -201);

        iArr[(-122 >>> 1) % N] = (int)((--i) + f);
        for (i1 = 1; i1 < 398; i1++) {
            vMeth(Test.dFld);
            Test.instanceCount += i2;
            for (i27 = 2; 63 > i27; ++i27) {
                iArr[i27 - 1] = (int)Test.instanceCount;
                i2 = 5;
            }
            if (false) {
                i2 ^= (int)Test.instanceCount;
                for (i29 = 2; i29 < 63; ++i29) {
                    for (i31 = 1; i31 < 2; ++i31) {
                        i28 += (((i31 * f) + i32) - i30);
                    }
                    i33 = 1;
                    do {
                        i2 += (int)f;
                        i2 <<= i2;
                        i32 = (int)lFld;
                        iArr[i1 + 1] -= i32;
                        Test.dFld += i31;
                        switch ((i1 % 2) + 63) {
                        case 63:
                            i += (((i33 * s2) + lFld) - f);
                            break;
                        case 64:
                            iArr[i29 + 1] = i30;
                            break;
                        default:
                            s2 = (short)i;
                            iArr[i33 + 1] *= (int)f;
                        }
                        i30 += i33;
                        i28 += (((i33 * f) + i) - i27);
                        if (Test.bFld) continue;
                        switch ((i29 % 3) + 55) {
                        case 55:
                            Test.instanceCount >>= i31;
                            break;
                        case 56:
                            iArr[(i33 >>> 1) % N] = (int)Test.instanceCount;
                            if (Test.bFld) continue;
                            break;
                        case 57:
                            i28 += (4 + (i33 * i33));
                            break;
                        default:
                            i >>= -29078;
                        }
                    } while (++i33 < 2);
                }
            } else {
                Test.dFld = i2;
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
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
