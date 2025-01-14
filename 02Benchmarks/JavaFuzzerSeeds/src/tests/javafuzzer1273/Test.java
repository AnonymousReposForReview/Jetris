package tests.javafuzzer1273;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 17:39:32 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=22892L;
    public static volatile int iFld=5008;
    public static boolean bFld=false;
    public static double dFld=54.33091;
    public static byte byFld=105;
    public int iFld1=-13;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -9L);
    }

    public static long fMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i11, int i12, int i13) {

        float f2=0.249F;
        int i14=52289, i15=225, i16=241, i17=-35365, iArr2[]=new int[N];
        long l2=85L;

        FuzzerUtils.init(iArr2, 11);

        f2 = i11;
        for (i14 = 19; i14 < 381; ++i14) {
            Test.instanceCount *= (long)f2;
            Test.lArrFld[i14 - 1] >>>= i14;
            for (i16 = 1; i16 < 5; i16++) {
                l2 = 1;
                do {
                    Test.iFld = i17;
                    switch ((int)((l2 % 4) + 118)) {
                    case 118:
                        Test.instanceCount = l2;
                        Test.instanceCount += (-14L + (l2 * l2));
                        break;
                    case 119:
                        iArr2[i14] >>>= -17346;
                        i13 += (int)(l2 | i13);
                        break;
                    case 120:
                        Test.lArrFld = Test.lArrFld;
                        i15 += (int)(l2 - Test.iFld);
                        i15 >>= (int)l2;
                        break;
                    case 121:
                        i13 = i17;
                        break;
                    }
                } while ((l2 += 3) < 2);
            }
        }
        vMeth_check_sum += i11 + i12 + i13 + Float.floatToIntBits(f2) + i14 + i15 + i16 + i17 + l2 +
            FuzzerUtils.checkSum(iArr2);
    }

    public static int iMeth(double d1, int i6, double d2) {

        int i7=-4, i8=12, i9=-26, i10=-68, i18=-2658, i19=3, i20=5, i21=133, iArr1[][]=new int[N][N], iArr3[]=new
            int[N];

        FuzzerUtils.init(iArr1, 46545);
        FuzzerUtils.init(iArr3, -576);

        i7 = 1;
        while (++i7 < 394) {
            try {
                iArr1[i7 + 1][i7] = (1 / i7);
                Test.iFld = (-18623 % Test.iFld);
                iArr1[i7 + 1][i7] = (-58376 % i8);
            } catch (ArithmeticException a_e) {}
            for (i9 = 1; i9 < 4; i9 += 2) {
                vMeth(i8, 2, i6);
            }
            Test.instanceCount -= i10;
            i8 <<= -23;
        }
        for (i18 = 13; i18 < 242; ++i18) {
            if (Test.bFld) {
                for (i20 = 1; i20 < 7; i20++) {
                    i8 *= (int)-116.700F;
                    i21 = (int)Test.instanceCount;
                    iArr1[i18 - 1][i18] += Test.iFld;
                    i10 -= 24138;
                    i10 += i8;
                    i8 ^= i19;
                }
            } else {
                i21 += (-39210 + (i18 * i18));
            }
        }
        long meth_res = Double.doubleToLongBits(d1) + i6 + Double.doubleToLongBits(d2) + i7 + i8 + i9 + i10 + i18 + i19
            + i20 + i21 + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(iArr3);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static float fMeth(long l, long l1, float f1) {

        int i4=-51453, i5=-12, i23=5, i24=1, i25=96, i26=-1, i27=15881, iArr4[]=new int[N];
        float f3=0.80F, fArr[]=new float[N];
        short s=-12669;
        double dArr[]=new double[N];

        FuzzerUtils.init(fArr, 0.299F);
        FuzzerUtils.init(iArr4, 44103);
        FuzzerUtils.init(dArr, 84.63968);

        for (i4 = 3; i4 < 347; i4++) {
            fArr[i4] += iMeth(Test.dFld, Test.iFld, Test.dFld);
            Test.iFld |= i4;
            for (f3 = 1; f3 < 5; f3++) {
                for (i24 = 1; i24 < 2; i24++) {
                    Test.lArrFld[(i5 >>> 1) % N] *= i5;
                    Test.iFld = -29299;
                    iArr4[(int)(f3)] += -10;
                    iArr4[(int)(f3)] += i23;
                    dArr[i24 + 1] *= i23;
                    i23 >>= (int)l;
                }
                i25 += (int)f3;
                for (i26 = 1; i26 < 2; i26++) {
                    Test.iFld = s;
                    if (i5 != 0) {
                    }
                }
            }
        }
        long meth_res = l + l1 + Float.floatToIntBits(f1) + i4 + i5 + Float.floatToIntBits(f3) + i23 + i24 + i25 + i26
            + i27 + s + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr4) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=34788, i2=241, i3=-182, i28=-223, i29=-11, iArr[]=new int[N];
        double d=0.91423;
        float f=-1.964F, f4=24.16F;

        FuzzerUtils.init(iArr, -29981);

        i = 1;
        while (++i < 381) {
            Test.instanceCount = (long)d;
            f = 1;
            while (++f < 66) {
                try {
                    iArr[(int)(f - 1)] = (16660 / i);
                    Test.iFld = (21074 / i);
                    Test.iFld = (iArr[i - 1] / -128);
                } catch (ArithmeticException a_e) {}
                for (i2 = 1; i2 < 1; i2++) {
                    iArr = (iArr = (iArr = (iArr = iArr)));
                    Test.iFld = (int)((Test.instanceCount += (long)fMeth(Test.instanceCount, Test.instanceCount, f)) +
                        Test.instanceCount);
                    i3 >>>= i3;
                    Test.iFld *= i;
                    Test.instanceCount += (i2 ^ i);
                    Test.dFld -= i;
                }
                if (Test.bFld) continue;
            }
            i28 = 1;
            do {
                i3 *= 138;
                i3 >>>= Test.iFld;
                f4 += i28;
                Test.instanceCount += (-1276052737L + (i28 * i28));
                Test.instanceCount *= Test.byFld;
                i29 = 1;
                while (++i29 < 1) {
                    Test.iFld += Test.byFld;
                    Test.instanceCount += 63902;
                    Test.iFld = (int)Test.instanceCount;
                    Test.instanceCount ^= iFld1;
                    switch (((i % 5) * 5) + 11) {
                    case 28:
                        Test.byFld = (byte)i2;
                        break;
                    case 15:
                        Test.iFld = (int)Test.instanceCount;
                        Test.iFld <<= -41732;
                    case 33:
                        iArr[i28 + 1] <<= iFld1;
                        Test.instanceCount = Test.instanceCount;
                        break;
                    case 29:
                        Test.iFld |= (int)Test.instanceCount;
                        break;
                    case 21:
                        Test.iFld -= Test.iFld;
                        break;
                    default:
                        Test.dFld *= i2;
                    }
                }
            } while (++i28 < 66);
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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  iMeth ->  iMeth fMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
