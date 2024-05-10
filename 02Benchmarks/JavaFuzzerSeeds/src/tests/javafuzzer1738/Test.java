package tests.javafuzzer1738;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 02:43:58 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-875543542L;
    public int iFld=-64063;
    public static volatile int iFld1=-9;
    public static boolean bFld=false;
    public static int iFld2=-76;
    public long lFld=-57398L;
    public static boolean bArrFld[]=new boolean[N];
    public static int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.bArrFld, false);
        FuzzerUtils.init(Test.iArrFld, 14);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(float f1, boolean b) {

        int i5=-131, i6=-20385, i7=-58787, i8=151, i9=-4, iArr[]=new int[N];
        double d2=0.55874, dArr[]=new double[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(dArr, -82.29683);
        FuzzerUtils.init(fArr, -75.549F);
        FuzzerUtils.init(iArr, -9);

        i5 = 1;
        while (++i5 < 139) {
            Test.iFld1 = i5;
            Test.iFld1 = i5;
        }
        if (b) {
            Test.iFld1 *= (int)d2;
            fArr[(Test.iFld1 >>> 1) % N] -= i5;
        } else {
            iArr[(Test.iFld1 >>> 1) % N] <<= (int)Test.instanceCount;
            Test.iFld1 *= (int)Test.instanceCount;
            Test.iFld1 >>= (int)Test.instanceCount;
        }
        for (i6 = 5; i6 < 122; i6++) {
            if (i6 != 0) {
            }
            for (i8 = 1; i8 < 13; ++i8) {
                Test.instanceCount <<= i5;
            }
            iArr[i6 + 1] *= i6;
            i7 += (-42 + (i6 * i6));
        }
        long meth_res = Float.floatToIntBits(f1) + (b ? 1 : 0) + i5 + Double.doubleToLongBits(d2) + i6 + i7 + i8 + i9 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i2, int i3, int i4) {

        float f2=-77.267F;
        boolean b1=true;
        double d3=50.72295, d4=-58.60694;
        int i10=8, i11=-38226, i12=-7, i13=-5, i14=32, iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, 105);

        Test.instanceCount = ((++i3) + iMeth(f2, b1));
        d3 %= (Test.iFld1 | 1);
        Test.iFld1 -= Test.iFld1;
        for (d4 = 3; d4 < 254; d4 += 2) {
            for (i11 = 1; i11 < 13; ++i11) {
                short s=-31672;
                i3 -= i2;
                Test.instanceCount &= Test.instanceCount;
                i4 = s;
                for (i13 = 1; i13 < 2; i13++) {
                    f2 += f2;
                    d3 += f2;
                    f2 = i4;
                    Test.iArrFld[i13 - 1][i13] >>= (int)Test.instanceCount;
                }
            }
            iArr1[(int)(d4 - 1)] = i10;
            i4 += (int)((long)d4 ^ i2);
        }
        vMeth1_check_sum += i2 + i3 + i4 + Float.floatToIntBits(f2) + (b1 ? 1 : 0) + Double.doubleToLongBits(d3) +
            Double.doubleToLongBits(d4) + i10 + i11 + i12 + i13 + i14 + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth() {

        int i1=-227, i15=-2, i16=2, i17=0;
        float f3=2.45F;
        short s1=18256;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -221L);

        i1 = 1;
        do {
            Test.bArrFld = (Test.bArrFld = (Test.bArrFld = Test.bArrFld));
            vMeth1(Test.iFld1, Test.iFld1, Test.iFld1);
            if (Test.bFld) {
                Test.iFld1 = 45282;
                switch ((i1 % 2) + 90) {
                case 90:
                    i15 = 10;
                    while (--i15 > 0) {
                        if (Test.bFld) continue;
                        lArr[i15] *= i15;
                        Test.iFld1 -= i15;
                        for (i16 = 1; i16 < 1; ++i16) {
                            Test.iArrFld[i1 - 1][i1 + 1] = (int)Test.instanceCount;
                            Test.iArrFld[i15 + 1][i1 - 1] -= (int)Test.instanceCount;
                            f3 += i16;
                        }
                        Test.iFld1 = s1;
                    }
                    break;
                case 91:
                    Test.bFld = Test.bFld;
                    break;
                default:
                    Test.iFld2 += i1;
                }
            }
        } while (++i1 < 159);
        vMeth_check_sum += i1 + i15 + i16 + i17 + Float.floatToIntBits(f3) + s1 + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        float f=122.38F, f4=60.241F;
        int i=-10, i18=111, i19=62752, i20=8664, i21=13, i22=-159, i23=47, i24=10120, iArr2[]=new int[N], iArr3[]=new
            int[N];
        double d=52.94827, d5=108.88560, d6=2.124909;
        byte by=-55;
        long l=-1846732919519081036L;

        FuzzerUtils.init(iArr2, 60841);
        FuzzerUtils.init(iArr3, -9);

        iFld += (int)Test.instanceCount;
        for (f = 7; f < 318; f++) {
            d = by;
            if (Test.bArrFld[(int)(f)]) continue;
            vMeth();
            Test.iFld2 &= (int)Test.instanceCount;
        }
        i18 = 1;
        while (++i18 < 143) {
            for (i19 = 175; i19 > i18; i19--) {
                short s2=14349;
                s2 += (short)i;
                i20 += (int)(-2.171F + (i19 * i19));
                i20 >>= Test.iFld2;
                for (d5 = i18; d5 < 1; ++d5) {
                    f4 = 153;
                    d += i;
                }
                Test.instanceCount = 2110721063L;
                try {
                    Test.iFld2 = (iFld / -129);
                    Test.iArrFld[i18][i19] = (i18 / Test.iArrFld[i18][i19 + 1]);
                    i20 = (i21 / Test.iFld2);
                } catch (ArithmeticException a_e) {}
                i += i19;
                Test.instanceCount -= i21;
                i20 = i20;
                i20 <<= i21;
            }
            switch (((Test.iFld2 >>> 1) % 2) + 80) {
            case 80:
                for (d6 = 3; d6 < 175; d6++) {
                    Test.iArrFld[(int)(d6 - 1)][i18 - 1] *= i23;
                    for (l = 1; l < 2; ++l) {
                        Test.iArrFld[(Test.iFld1 >>> 1) % N][(int)(l - 1)] = -27895;
                        Test.iArrFld[i18][(int)(l + 1)] = (int)f;
                        i22 = -57312;
                        iArr2[(int)(l - 1)] *= (int)d;
                        d += i;
                        Test.instanceCount += lFld;
                    }
                }
            case 81:
                iArr3[i18 + 1] -= i23;
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
