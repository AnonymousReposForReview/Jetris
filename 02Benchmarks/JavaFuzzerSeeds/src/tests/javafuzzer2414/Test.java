package tests.javafuzzer2414;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 14:21:55 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=9L;
    public static boolean bFld=false;
    public byte byFld=-23;
    public int iFld=24186;
    public float fFld=-37.690F;
    public static double dArrFld[]=new double[N];
    public static int iArrFld[]=new int[N];
    public short sArrFld[]=new short[N];
    public long lArrFld[][]=new long[N][N];

    static {
        FuzzerUtils.init(Test.dArrFld, 1.29647);
        FuzzerUtils.init(Test.iArrFld, 0);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i2, int i3) {

        int i4=9, i5=51709, i6=51770, i7=-8, i8=-174, i9=58739, i10=209, iArr[]=new int[N];
        double d1=-95.88055;
        short s1=24450;
        byte by=-75, byArr[]=new byte[N];
        float f=-94.304F;

        FuzzerUtils.init(byArr, (byte)-39);
        FuzzerUtils.init(iArr, -7);

        switch (((i2 >>> 1) % 9) + 74) {
        case 74:
            for (i4 = 6; i4 < 203; i4++) {
                i5 = i5;
                if (Test.bFld) break;
                for (i6 = 1; i6 < 8; i6++) {
                    d1 += d1;
                    i5 += s1;
                }
                for (i8 = 1; i8 < 8; ++i8) {
                    by *= (byte)Test.instanceCount;
                    byArr[i4] >>= (byte)-61538;
                    i10 = 1;
                    do {
                        i9 -= (int)Test.instanceCount;
                        i7 -= i8;
                        i7 -= (int)f;
                        by += (byte)(i10 * i10);
                    } while (++i10 < 2);
                }
            }
            break;
        case 75:
            d1 = f;
            break;
        case 76:
        case 77:
            f -= i5;
            break;
        case 78:
        case 79:
            iArr[(i2 >>> 1) % N] ^= 59804;
            break;
        case 80:
            i5 >>= i5;
        case 81:
            Test.instanceCount = 2;
        case 82:
            i5 = i7;
            break;
        default:
            i3 += (int)Test.instanceCount;
        }
        vMeth2_check_sum += i2 + i3 + i4 + i5 + i6 + i7 + Double.doubleToLongBits(d1) + s1 + i8 + i9 + by + i10 +
            Float.floatToIntBits(f) + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(int i1) {

        short s=-28624;
        double d=0.47847;
        byte by1=8;
        int i11=7, i12=-1, i13=-61898, i14=-6926;
        float f1=99.421F;

        i1 = ((s--) + (i1 + -61049));
        d = 1;
        while (++d < 148) {
            i1 >>>= (--s);
            vMeth2(53436, -199);
            by1 = (byte)i1;
            i1 *= (int)-1526605819L;
            Test.instanceCount = i1;
            for (i11 = 1; i11 < 11; ++i11) {
                for (i13 = 1; 2 > i13; i13++) {
                    if (Test.bFld) break;
                    i14 = i1;
                    i12 += i13;
                    i14 -= 53720;
                    f1 = i1;
                }
                Test.iArrFld[(int)(d)] = s;
            }
        }
        vMeth1_check_sum += i1 + s + Double.doubleToLongBits(d) + by1 + i11 + i12 + i13 + i14 +
            Float.floatToIntBits(f1);
    }

    public void vMeth(long l, int i) {

        int i15=0, i16=49;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 1.821F);

        vMeth1(-9);
        for (i15 = 8; i15 < 262; ++i15) {
            i16 <<= 6772;
            i = (int)101.77861;
            fArr[i15] = byFld;
            sArrFld[i15 + 1] += (short)Test.instanceCount;
        }
        vMeth_check_sum += l + i + i15 + i16 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        float f2=-1.177F;
        int i17=-235, i18=-12726, i19=-15971, i20=-112, i21=62386, i22=35676, i23=-9, i24=-118, i25=-225, i26=19843,
            i27=-3;
        double d3=78.58863;

        vMeth(Test.instanceCount, iFld);
        Test.instanceCount += iFld;
        for (f2 = 3; 244 > f2; ++f2) {
            i17 += (int)(f2 * iFld);
            fFld += (((f2 * i17) + Test.instanceCount) - fFld);
        }
        for (i18 = 8; i18 < 151; i18++) {
            iFld = i19;
            for (i20 = 175; i20 > 8; i20 -= 3) {
                i21 = (int)Test.instanceCount;
            }
        }
        iFld *= i20;
        for (i22 = 9; i22 < 192; ++i22) {
            switch (((i22 % 2) * 5) + 59) {
            case 66:
                byFld = (byte)i17;
                if (Test.bFld) {
                    for (i24 = 8; i24 < 137; i24++) {
                        d3 = Test.instanceCount;
                    }
                    i17 += (10 + (i22 * i22));
                    Test.instanceCount -= -137L;
                } else {
                    switch (((162 >>> 1) % 6) + 30) {
                    case 30:
                        Test.iArrFld = FuzzerUtils.int1array(N, (int)17958);
                    case 31:
                        iFld += (72 + (i22 * i22));
                        i19 = 11;
                        break;
                    case 32:
                        for (i26 = i22; i26 < 137; ++i26) {
                            Test.iArrFld[i26] = (int)Test.instanceCount;
                            iFld -= i22;
                            Test.instanceCount += (((i26 * iFld) + Test.instanceCount) - i24);
                            Test.instanceCount >>= Test.instanceCount;
                        }
                        i19 *= -7;
                        lArrFld = lArrFld;
                        break;
                    case 33:
                        i19 = i27;
                        break;
                    case 34:
                        fFld += (((i22 * i25) + iFld) - i25);
                        break;
                    case 35:
                        i27 = byFld;
                        break;
                    default:
                        i23 = i26;
                    }
                }
                break;
            case 68:
                i27 /= (int)(i24 | 1);
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
