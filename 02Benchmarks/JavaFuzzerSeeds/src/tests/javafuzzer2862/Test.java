package tests.javafuzzer2862;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 21:44:21 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-44056L;
    public static short sFld=3645;
    public static byte byFld=-119;
    public boolean bFld=true;
    public static int iArrFld[][]=new int[N][N];
    public static long lArrFld[]=new long[N];
    public volatile double dArrFld[]=new double[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 37664);
        FuzzerUtils.init(Test.lArrFld, -70L);
        FuzzerUtils.init(Test.fArrFld, 0.585F);
    }

    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static long lMeth() {

        double d=108.100896;

        Test.instanceCount += (long)(++d);
        long meth_res = Double.doubleToLongBits(d);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static float fMeth(int i5, int i6, int i7) {

        int i8=-110, i9=1, i10=0;
        float f3=2.61F;
        double d1=-97.41936, d2=0.5041;
        short s1=-25573;
        byte by=-42;

        i8 = 1;
        while (++i8 < 166) {
            f3 = i7;
            i5 += (i8 * i7);
            switch ((i8 % 2) + 80) {
            case 80:
                Test.iArrFld[i8 - 1][i8 + 1] |= 5944;
            case 81:
                d1 -= i8;
                Test.instanceCount += (i8 * i8);
                i5 *= (int)d1;
                break;
            }
            d2 = 1;
            while (++d2 < 10) {
                for (i9 = 1; i9 < 1; i9++) {
                    s1 %= (short)(i8 | 1);
                }
                by += (byte)Test.instanceCount;
            }
        }
        long meth_res = i5 + i6 + i7 + i8 + Float.floatToIntBits(f3) + Double.doubleToLongBits(d1) +
            Double.doubleToLongBits(d2) + i9 + i10 + s1 + by;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth(int i3, short s) {

        int i4=-5, i11=-3, i12=-4685;
        double d3=0.58707;
        float f4=2.521F;

        switch (((((int)(-3051962241618387416L - (Test.instanceCount + -209))) >>> 1) % 1) + 74) {
        case 74:
            i3 = i3;
            i4 = 1;
            while ((i4 += 2) < 269) {
                i3 >>>= (i3--);
                Test.instanceCount -= (long)(fMeth(i3, i4, i4) + d3);
                Test.iArrFld[i4 + 1][i4 + 1] += i4;
                Test.instanceCount += i4;
                if (i3 != 0) {
                    vMeth_check_sum += i3 + s + i4 + Double.doubleToLongBits(d3) + i11 + i12 + Float.floatToIntBits(f4);
                    return;
                }
                s <<= (short)i4;
                i3 = i3;
            }
            try {
                for (i11 = 2; i11 < 179; i11++) {
                    i12 += (((i11 * Test.instanceCount) + i4) - i3);
                    d3 -= Test.instanceCount;
                    i3 = (int)f4;
                }
            }
            catch (NullPointerException exc2) {
                f4 = i11;
            }
            break;
        }
        vMeth_check_sum += i3 + s + i4 + Double.doubleToLongBits(d3) + i11 + i12 + Float.floatToIntBits(f4);
    }

    public static int iMeth(float f1, int i2, float f2) {

        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 2.80F);

        i2 = (int)lMeth();
        f1 -= Math.abs(Math.abs(++fArr[(i2 >>> 1) % N]));
        vMeth(i2, Test.sFld);
        Test.byFld = (byte)i2;
        long meth_res = Float.floatToIntBits(f1) + i2 + Float.floatToIntBits(f2) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-52208, i1=6, i13=-13, i14=239, i15=-37263, i16=-2, i17=8, i18=27311, i19=246, i20=194, i21=-7, i22=4,
            i23=-33, iArr[]=new int[N];
        float f=2.657F;
        double d4=-58.5389;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(iArr, 11);
        FuzzerUtils.init(bArr, false);

        for (i = 7; i < 128; i++) {
            iArr[i - 1] <<= (int)((i1++) + ((f++) - (-233 + (126 + (Test.instanceCount + -3024917854L)))));
            Test.instanceCount += (i1--);
            i1 = iMeth(1.1021F, i, f);
            if (bFld) {
                for (i13 = 6; i13 < 207; ++i13) {
                    Test.instanceCount <<= Test.instanceCount;
                    for (i15 = i13; 2 > i15; i15++) {
                        i1 += (i15 * i15);
                        bFld = bFld;
                        if (true) break;
                        iArr[i - 1] -= i15;
                    }
                    Test.instanceCount = i16;
                    d4 -= Test.instanceCount;
                    bArr[i] = bFld;
                    i16 *= i16;
                }
                i16 += (int)32.129108;
                i17 = 1;
                do {
                    for (i18 = 1; i18 > i; i18 -= 3) {
                        i16 = i15;
                        i14 <<= Test.byFld;
                        i1 += (((i18 * i20) + f) - i1);
                    }
                    switch ((i17 % 9) + 36) {
                    case 36:
                        for (i21 = 1; i21 < 1; ++i21) {
                            i20 = i14;
                            i23 = i22;
                            Test.iArrFld[i - 1][i21 + 1] -= i16;
                            i14 += (((i21 * Test.byFld) + Test.instanceCount) - i23);
                            i20 += (i21 * f);
                            Test.lArrFld[i21] *= 106;
                        }
                        break;
                    case 37:
                        Test.instanceCount += (((i17 * i14) + i20) - Test.instanceCount);
                    case 38:
                        dArrFld[i] -= d4;
                    case 39:
                        i23 += (i17 + i20);
                        break;
                    case 40:
                        i19 = i14;
                    case 41:
                        Test.fArrFld[i + 1] += f;
                        break;
                    case 42:
                        i23 += (((i17 * f) + Test.instanceCount) - i1);
                        break;
                    case 43:
                        i16 = (int)d4;
                        break;
                    case 44:
                        i22 = i15;
                    default:
                        Test.fArrFld = FuzzerUtils.float1array(N, (float)103.352F);
                    }
                } while (++i17 < 207);
            } else if (false) {
                Test.instanceCount = Test.instanceCount;
            } else if (bFld) {
                i20 = i15;
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
//DEBUG  lMeth ->  lMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  fMeth ->  fMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}