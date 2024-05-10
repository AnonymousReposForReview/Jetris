package tests.javafuzzer978;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 12:16:37 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-11666L;
    public byte byFld=-105;
    public double dFld=-1.52707;
    public static short sFld=16383;
    public int iArrFld[]=new int[N];
    public static int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld1, 3887);
    }

    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public void vMeth() {

        double d=0.6143;
        int i2=-13;

        d = i2;
        d += (Test.instanceCount--);
        vMeth_check_sum += Double.doubleToLongBits(d) + i2;
    }

    public static long lMeth(int i7) {

        int i8=79, i9=-5709, iArr[]=new int[N];
        double d2=12.14817;
        float f1=-52.98F;
        short s=-27388;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -26713);
        FuzzerUtils.init(lArr, -32L);

        i8 = 1;
        do {
            switch ((i8 % 2) + 104) {
            case 104:
                switch ((i8 % 7) + 120) {
                case 120:
                    Test.instanceCount += (i8 * i8);
                    if (false) continue;
                    break;
                case 121:
                    i7 += (((i8 * i7) + i7) - i8);
                    break;
                case 122:
                    try {
                        i7 = (iArr[i8 + 1] % 32707);
                        i7 = (iArr[i8 + 1] / iArr[i8 + 1]);
                        iArr[i8] = (-70 / i8);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 123:
                    iArr[i8] *= (int)-53L;
                    i9 = 1;
                    do {
                        i7 -= (int)d2;
                        iArr[i8] = -129;
                        iArr = FuzzerUtils.int1array(N, (int)3);
                        if (true) continue;
                        i7 += (((i9 * f1) + i7) - Test.instanceCount);
                    } while (++i9 < 9);
                    i7 = (int)d2;
                    break;
                case 124:
                    Test.instanceCount += (((i8 * Test.instanceCount) + f1) - s);
                case 125:
                    i7 = i7;
                    break;
                case 126:
                    Test.instanceCount += (i8 ^ i9);
                    break;
                }
                break;
            case 105:
                lArr[i8 - 1] *= -13;
                break;
            }
        } while (++i8 < 186);
        long meth_res = i7 + i8 + i9 + Double.doubleToLongBits(d2) + Float.floatToIntBits(f1) + s +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth(int i6, float f) {

        double d1=59.95088;
        int i10=-117, i11=-2048, i12=32185;

        d1 += (((i6 >>= i6) - lMeth(-1)) - d1);
        i6 = i6;
        i10 = 1;
        while (++i10 < 355) {
            switch ((i10 % 1) + 8) {
            case 8:
                Test.iArrFld1[i10] = -59215;
                i6 = i6;
            default:
                i6 ^= (int)Test.instanceCount;
                for (i11 = 1; 5 > i11; i11++) {
                    i12 *= (int)Test.instanceCount;
                    i12 >>>= -206;
                    i12 += (int)(47.333F + (i11 * i11));
                    i6 <<= (int)Test.instanceCount;
                    i12 += (((i11 * Test.instanceCount) + i10) - i10);
                    i6 /= (int)(i12 | 1);
                    i12 += i11;
                }
            }
        }
        long meth_res = i6 + Float.floatToIntBits(f) + Double.doubleToLongBits(d1) + i10 + i11 + i12;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static float fMeth(int i3, int i4) {

        int i5=-229, i13=51192, i14=-6, i15=53907, i16=-5368, i17=-6;
        float f2=-43.930F;
        double d3=-2.23588, dArr[][]=new double[N][N];

        FuzzerUtils.init(dArr, -13.9995);

        i5 = 334;
        while (--i5 > 0) {
            iMeth(i3, f2);
            i13 = 1;
            while ((i13 += 3) < 5) {
                f2 *= 49855;
                for (i14 = i5; i14 < 5; ++i14) {
                    if (true) continue;
                    i3 *= 12;
                }
                Test.iArrFld1 = Test.iArrFld1;
                for (i16 = 5; 1 < i16; i16 -= 3) {
                    if (i14 != 0) {
                    }
                    i3 += i16;
                }
                d3 = i5;
                Test.instanceCount = i13;
            }
        }
        dArr[(i5 >>> 1) % N][(i4 >>> 1) % N] = d3;
        long meth_res = i3 + i4 + i5 + Float.floatToIntBits(f2) + i13 + i14 + i15 + i16 + i17 +
            Double.doubleToLongBits(d3) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=9, i1=14, i18=104, i19=10, i20=57587, i21=39532, i22=35440, i23=13;
        float f3=0.812F;
        double d4=-57.117867;

        for (i = 2; i < 167; ++i) {
            Test.instanceCount *= (i1--);
            vMeth();
            iArrFld[i] -= (int)(((iArrFld[i]--) + (byFld--)) - (-fMeth(i1, i1)));
            Test.instanceCount = i;
            for (i18 = 5; 152 > i18; ++i18) {
                for (i20 = 1; 2 > i20; i20++) {
                    dFld = Test.instanceCount;
                    i21 += (i20 ^ Test.instanceCount);
                    f3 += i20;
                }
                for (d4 = 2; d4 > i18; --d4) {
                    Test.iArrFld1[(int)(d4)] *= i19;
                    if (false) continue;
                    dFld /= (Test.instanceCount | 1);
                    i1 += (int)Test.instanceCount;
                    f3 += Test.instanceCount;
                    iArrFld = iArrFld;
                    switch (((20849 >>> 1) % 2) + 62) {
                    case 62:
                    case 63:
                        i1 += (6 + (d4 * d4));
                        iArrFld[i + 1] = -61;
                        dFld = -63932;
                        break;
                    }
                    i22 = Test.sFld;
                    i1 += (int)(d4 * d4);
                    i22 = 3;
                }
                i23 = 1;
                do {
                    i22 += (((i23 * i) + Test.instanceCount) - Test.instanceCount);
                    i1 += (i23 * i23);
                    try {
                        i1 = (Test.iArrFld1[i] % iArrFld[i23 + 1]);
                        Test.iArrFld1[i23 - 1] = (-516880757 / i23);
                        i21 = (i21 / i1);
                    } catch (ArithmeticException a_e) {}
                    Test.instanceCount = Test.instanceCount;
                    i1 ^= (int)Test.instanceCount;
                } while (++i23 < 2);
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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  iMeth ->  iMeth fMeth mainTest
//DEBUG  lMeth ->  lMeth iMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}