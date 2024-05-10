package tests.javafuzzer2750;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 19:48:03 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-5036509819578669821L;
    public int iFld=-19243;
    public static double dFld=-29.23090;
    public static float fFld=-2.534F;
    public static int iFld1=-10;
    public static long lArrFld[]=new long[N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 170L);
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(long l, float f1, long l1) {

        int i5=0, i6=85, i7=-111, i8=-8, i9=-9;

        f1 = 35058;
        for (i5 = 1; i5 < 266; ++i5) {
            for (i7 = 1; i7 < 6; i7++) {
                try {
                    i8 = (i8 % i6);
                    i8 = (i8 % i8);
                    i6 = (61437 % i6);
                } catch (ArithmeticException a_e) {}
                l1 += (-48239 + (i7 * i7));
                i6 <<= i5;
                i6 = i6;
                i9 = 2;
                do {
                    i6 = i5;
                    i8 += (int)1.57F;
                    i6 = (int)l1;
                    i8 -= 0;
                    l1 += i9;
                    if (i6 != 0) {
                    }
                    Test.instanceCount += (long)Test.dFld;
                } while ((i9 -= 2) > 0);
            }
        }
        long meth_res = l + Float.floatToIntBits(f1) + l1 + i5 + i6 + i7 + i8 + i9;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i) {

        int i1=3, i2=-58420, i3=68, i4=0, i10=6, i11=42, i12=26334, i13=-17940, i14=-118, iArr[][]=new int[N][N];
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -82.90120);
        FuzzerUtils.init(iArr, -246);

        for (i1 = 8; i1 < 181; i1++) {
            for (i3 = 1; i3 < 9; i3++) {
                i2 -= (int)(++dArr[i3]);
                Test.instanceCount += (((i3 * i3) + i2) - i3);
            }
            Test.instanceCount = iMeth(Test.instanceCount, Test.fFld, Test.instanceCount);
            i10 = 1;
            while (++i10 < 9) {
                for (i11 = 1; i11 < 1; i11++) {
                    Test.instanceCount += (i11 * Test.fFld);
                    i4 = i4;
                    i2 = i11;
                }
                i <<= (int)11L;
                for (i13 = 1; 1 > i13; ++i13) {
                    Test.lArrFld[i10] -= i4;
                }
                try {
                    i4 = (i14 / i10);
                    iArr[i10 - 1][i1 - 1] = (i2 / i1);
                    i12 = (6790 / i3);
                } catch (ArithmeticException a_e) {}
            }
            Test.instanceCount += (((i1 * i10) + i3) - i14);
        }
        vMeth_check_sum += i + i1 + i2 + i3 + i4 + i10 + i11 + i12 + i13 + i14 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr);
    }

    public static void vSmallMeth() {


        vMeth(-7);
        vSmallMeth_check_sum += 0;
    }

    public void mainTest(String[] strArr1) {

        float f=-35.991F;
        double d=-2.17754, d1=-67.36867;
        int i15=-6, i16=49969, i17=29829, i18=-48944, i19=4, i20=48451, iArr1[][]=new int[N][N];
        byte by=-7;
        short s=-23906;
        boolean b=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -43982L);
        FuzzerUtils.init(iArr1, -28318);

        f = 1;
        do {
            iFld += (int)(f + iFld);
        } while (++f < 213);
        d += (((Test.instanceCount / (iFld | 1)) * lArr[(121 >>> 1) % N]) ^ (lArr[(iFld >>> 1) % N]--));
        for (int smallinvoc=0; smallinvoc<847; smallinvoc++) vSmallMeth();
        for (d1 = 5; 130 > d1; ++d1) {
            i15 += iFld;
            i15 += (int)Test.instanceCount;
            i16 = 1;
            while (++i16 < 201) {
                i15 *= iFld;
                iFld = i16;
                i17 = 1;
                while (++i17 < 1) {
                    iFld += i17;
                    Test.bArrFld[i17] = false;
                    iFld -= i17;
                    iFld -= i17;
                    by = (byte)Test.iFld1;
                    iFld *= (int)f;
                }
                Test.instanceCount = Test.iFld1;
                for (i18 = 1; i18 < 1; ++i18) {
                    iFld += (int)106.934F;
                    i15 = i15;
                    if (b) {
                        s += (short)i18;
                        Test.iFld1 *= i20;
                        i15 += (int)Test.instanceCount;
                    }
                    Test.instanceCount = -6;
                    i19 -= (int)1.688F;
                    try {
                        iFld = (i15 / 6865);
                        i19 = (Test.iFld1 / iArr1[(int)(d1)][i16 + 1]);
                        iFld = (i18 / i19);
                    } catch (ArithmeticException a_e) {}
                    i15 -= i16;
                }
                try {
                    iArr1[i16][(int)(d1 + 1)] = (iArr1[(int)(d1 + 1)][i16 + 1] / Test.iFld1);
                    iArr1[i16][(int)(d1 - 1)] = (iFld / i20);
                    iArr1[(int)(d1 - 1)][(int)(d1)] = (i16 % -229);
                } catch (ArithmeticException a_e) {}
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
//DEBUG  iMeth ->  iMeth vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}