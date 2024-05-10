package tests.javafuzzer2296;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 11:38:26 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=7L;
    public static volatile float fFld=-100.237F;
    public static boolean bFld=false;
    public static int iFld=-239;
    public int iArrFld[]=new int[N];
    public static int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld1, -243);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(double d1, double d2) {

        int i10=5, i11=-61587, i12=9, i13=56, i14=219;
        float f1=-115.1001F;
        short s1=18040;
        boolean b=true;
        byte byArr1[]=new byte[N];

        FuzzerUtils.init(byArr1, (byte)102);

        Test.fFld *= i10;
        Test.iArrFld1[(i10 >>> 1) % N] -= (int)d2;
        for (i11 = 8; i11 < 133; ++i11) {
            for (f1 = 1; f1 < 13; f1++) {
                i12 = (int)Test.instanceCount;
                byArr1[(int)(f1 - 1)] = (byte)i10;
                i14 = 1;
                while (++i14 < 2) {
                    i13 = (int)Test.fFld;
                    i12 = (int)Test.instanceCount;
                    s1 *= (short)14;
                    switch ((((i10 >>> 1) % 1) * 5) + 4) {
                    case 6:
                        Test.iArrFld1[i11] = i10;
                        break;
                    }
                    b = false;
                    Test.instanceCount = i12;
                    i12 = i10;
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d1) + Double.doubleToLongBits(d2) + i10 + i11 + i12 +
            Float.floatToIntBits(f1) + i13 + i14 + s1 + (b ? 1 : 0) + FuzzerUtils.checkSum(byArr1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth() {

        int i6=-60, i7=-13, i8=-8, i9=-118, i15=29369, iArr[]=new int[N];
        double d=0.103264;
        short s=-858;
        float f2=104.194F;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(iArr, 129);
        FuzzerUtils.init(bArr, false);

        iArr[(i6 >>> 1) % N] = (int)(d * Test.fFld);
        for (i7 = 23; 378 > i7; i7++) {
            Test.instanceCount += (((i7 * Test.instanceCount) + i8) - i8);
        }
        i9 = 1;
        do {
            i8 += (i9 ^ i6);
            iArr[i9] = i6;
            Test.fFld += Math.max(i6 += (iArr[i9 + 1] -= -7), (int)((s - 13) + (Test.instanceCount * i6)));
            d = i7;
        } while (++i9 < 296);
        i6 = (int)(((i8++) - fMeth(-74.28264, d)) - 28);
        for (f2 = 1; 122 > f2; ++f2) {
            i15 >>= s;
            bArr[(int)(f2)] = Test.bFld;
            i8 = (int)Test.instanceCount;
            Test.instanceCount = (long)d;
            Test.instanceCount = i15;
        }
        vMeth_check_sum += i6 + Double.doubleToLongBits(d) + i7 + i8 + i9 + s + Float.floatToIntBits(f2) + i15 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(bArr);
    }

    public static void vSmallMeth(int i3, int i4, int i5) {

        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-72);

        byArr[(-25478 >>> 1) % N] = (byte)(((i4 + Test.instanceCount) * Math.min(i4, i5)) * ((Test.fFld - i4) +
            Math.abs(i3)));
        vMeth();
        vSmallMeth_check_sum += i3 + i4 + i5 + FuzzerUtils.checkSum(byArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-13, i1=-69, i2=1, i16=13, i17=-59849, i18=-163, i19=-41105, i20=-188, i21=-49853;
        float f=2.423F, fArr[]=new float[N];
        double d3=-8.90530;
        short s2=25605;
        long lArr[]=new long[N];

        FuzzerUtils.init(fArr, 1.374F);
        FuzzerUtils.init(lArr, -41531L);

        iArrFld[(i >>> 1) % N] += (int)(Math.max(iArrFld[(i >>> 1) % N], (int)(f - -8)) / ((long)(f) | 1));
        for (i1 = 5; i1 < 317; i1++) {
            for (int smallinvoc=0; smallinvoc<62; smallinvoc++) vSmallMeth(i, i, -68);
            Test.instanceCount = i2;
            Test.instanceCount += (i1 * i1);
            i2 *= i2;
            Test.instanceCount = 674;
        }
        for (i16 = 9; 162 > i16; i16++) {
            if (Test.bFld) {
                for (i18 = i16; i18 < 164; i18++) {
                    d3 *= -188989527L;
                    iArrFld[i18 - 1] <<= i17;
                    i2 += (((i18 * i1) + i2) - Test.iFld);
                    i = i18;
                    i2 -= i17;
                    i17 -= (int)Test.instanceCount;
                    i17 += (int)d3;
                    switch (((i19 >>> 1) % 3) + 117) {
                    case 117:
                        d3 -= Test.instanceCount;
                        break;
                    case 118:
                        i += i16;
                        i -= (int)48333L;
                        for (i20 = 1; i20 > 1; --i20) {
                            i -= i17;
                            i21 += i20;
                            fArr[i20 + 1] -= i;
                        }
                        switch (((i16 % 5) * 5) + 13) {
                        case 18:
                            Test.instanceCount = -76;
                            break;
                        case 26:
                            i19 -= (int)Test.fFld;
                            i21 += i19;
                            s2 = (short)d3;
                            break;
                        case 28:
                            i *= (int)f;
                            break;
                        case 32:
                            Test.instanceCount = 1897;
                            break;
                        case 17:
                            lArr[(4 >>> 1) % N] = (long)-1.226F;
                            break;
                        }
                        break;
                    case 119:
                        Test.instanceCount -= s2;
                        break;
                    default:
                        i -= (int)d3;
                    }
                }
            } else if (Test.bFld) {
                i19 = i2;
            } else if (Test.bFld) {
                Test.instanceCount *= Test.instanceCount;
            } else {
                d3 -= Test.instanceCount;
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  fMeth ->  fMeth vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}