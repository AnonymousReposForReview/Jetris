package tests.javafuzzer825;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 10:27:16 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2L;
    public static short sFld=18511;
    public static boolean bFld=false;
    public static byte byFld=-78;
    public float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];
    public long lArrFld[]=new long[N];
    public double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 6);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(short s, boolean b, int i5) {

        float f1=61.412F, fArr[]=new float[N];
        int i6=62412, i7=16304, i8=-41842, i9=-56282, i10=32635, i11=-27200, i12=0, iArr[]=new int[N];
        long l=-254L;

        FuzzerUtils.init(iArr, 144);
        FuzzerUtils.init(fArr, 0.444F);

        f1 += i5;
        iArr[(i5 >>> 1) % N] = i5;
        for (i6 = 19; i6 < 328; ++i6) {
            Test.instanceCount += i6;
        }
        for (i8 = 14; i8 < 352; ++i8) {
            i5 += (int)5L;
            for (i10 = 1; 5 > i10; i10++) {
                for (l = 1; l < 2; l++) {
                    i9 <<= (int)Test.instanceCount;
                    Test.instanceCount -= i11;
                }
            }
            i5 += i7;
            f1 *= l;
            if (b) {
                i11 -= i10;
                iArr[i8 - 1] <<= (int)Test.instanceCount;
            } else {
                if (i7 != 0) {
                    vMeth1_check_sum += s + (b ? 1 : 0) + i5 + Float.floatToIntBits(f1) + i6 + i7 + i8 + i9 + i10 + i11
                        + l + i12 + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                    return;
                }
            }
        }
        vMeth1_check_sum += s + (b ? 1 : 0) + i5 + Float.floatToIntBits(f1) + i6 + i7 + i8 + i9 + i10 + i11 + l + i12 +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static long lMeth(int i4) {

        int i13=0, iArr1[]=new int[N];
        float f3=23.26F;
        short sArr[]=new short[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(sArr, (short)-20987);
        FuzzerUtils.init(iArr1, -7);
        FuzzerUtils.init(bArr, false);

        vMeth1(Test.sFld, Test.bFld, i4);
        i4 *= i4;
        if (Test.bFld) {
            Test.instanceCount = 11;
        }
        i4 = (int)Test.instanceCount;
        sArr[(i13 >>> 1) % N] += (short)i13;
        Test.instanceCount ^= i4;
        iArr1[(i13 >>> 1) % N] = i4;
        f3 = 1;
        do {
            i4 -= (int)f3;
            Test.sFld += (short)Test.instanceCount;
            Test.bFld = Test.bFld;
        } while (++f3 < 178);
        bArr[(i4 >>> 1) % N] = Test.bFld;
        iArr1[(i4 >>> 1) % N] = 184;
        i13 -= 2;
        long meth_res = i4 + i13 + Float.floatToIntBits(f3) + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr1)
            + FuzzerUtils.checkSum(bArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(float f, double d, int i) {

        int i1=-3, i2=-13, i3=56104, i14=253, i15=58355, iArr2[]=new int[N];
        float fArr1[]=new float[N];

        FuzzerUtils.init(fArr1, 2.692F);
        FuzzerUtils.init(iArr2, 138);

        i -= Math.abs(i);
        for (i1 = 6; i1 < 171; ++i1) {
            i3 = 1;
            do {
                lMeth(i3);
                i2 += (i3 + i);
                i >>= 0;
                i += (int)f;
                for (i14 = 1; i14 < 1; i14++) {
                    Test.instanceCount = -3;
                    fArr1[i14] = i15;
                    i <<= Test.sFld;
                    i2 += i3;
                    iArr2[i14] >>= (int)Test.instanceCount;
                }
            } while (++i3 < 10);
        }
        Test.instanceCount &= -53;
        d += Test.instanceCount;
        vMeth_check_sum += Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i + i1 + i2 + i3 + i14 + i15 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        float f4=-2.477F;
        double d1=2.67806;
        int i16=-40253, i17=-2, i18=222, i19=15, i20=-28387, i21=23, i22=-135, i23=-2158;

        vMeth(f4, d1, i16);
        for (i17 = 258; i17 > 9; i17 -= 2) {
            i19 = 1;
            while (++i19 < 202) {
                switch (((i17 % 6) * 5) + 98) {
                case 123:
                    Test.instanceCount *= -29461;
                    fArrFld[(i16 >>> 1) % N] -= Test.instanceCount;
                    for (i20 = 1; i20 < 1; i20++) {
                        i16 = (int)d1;
                        i21 = i20;
                        Test.instanceCount = Test.instanceCount;
                        Test.sFld += Test.sFld;
                        i16 -= i19;
                    }
                    for (i22 = 1; i22 < 1; ++i22) {
                        switch (((i21 >>> 1) % 10) + 122) {
                        case 122:
                        case 123:
                            Test.iArrFld[i19] += 0;
                            i18 /= (int)((long)(d1) | 1);
                            i18 = (int)Test.instanceCount;
                            i18 *= (int)-114.872F;
                            break;
                        case 124:
                            d1 -= i20;
                            lArrFld[i19 - 1] += -58913L;
                            Test.instanceCount = i23;
                            break;
                        case 125:
                            i18 <<= (int)Test.instanceCount;
                            i21 *= i18;
                            i16 = 2629;
                            break;
                        case 126:
                            if (true) break;
                            i16 -= (int)8L;
                            Test.iArrFld[i22] <<= i19;
                        case 127:
                            i18 += -8;
                            break;
                        case 128:
                            Test.instanceCount += (((i22 * i17) + Test.sFld) - f4);
                            i16 = (int)82.896F;
                            break;
                        case 129:
                            i21 += (int)1.41928;
                            break;
                        case 130:
                            i21 %= (int)(i16 | 1);
                        case 131:
                        }
                    }
                case 117:
                    fArrFld[i17] -= i23;
                    break;
                case 124:
                    dArrFld[i17 + 1] = i16;
                    break;
                case 110:
                    i23 = i22;
                    break;
                case 113:
                    Test.instanceCount += (((i19 * Test.instanceCount) + Test.byFld) - Test.instanceCount);
                case 109:
                    lArrFld[i19 - 1] = Test.byFld;
                    break;
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
