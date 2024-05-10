package tests.javafuzzer592;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 06:16:16 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-239L;
    public int iFld=-5;
    public static double dFld=-111.66394;
    public static byte byFld=59;
    public boolean bFld=true;
    public static volatile double dArrFld[]=new double[N];
    public static int iArrFld[][]=new int[N][N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.dArrFld, -1.64993);
        FuzzerUtils.init(Test.iArrFld, 94);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long bMeth_check_sum = 0;

    public static boolean bMeth(float f, int i1) {

        int i2=133, i3=200, i4=-133, i5=58, i6=28157, iArr[][]=new int[N][N];
        boolean b1=true;
        short s=-21309, sArr[]=new short[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 4981);
        FuzzerUtils.init(sArr, (short)16885);
        FuzzerUtils.init(lArr, 1904183807457432306L);

        for (i2 = 8; i2 < 189; ++i2) {
            if (b1) continue;
            f -= i1;
            i4 = 1;
            do {
                i3 = i1;
                for (i5 = 1; i5 < 1; i5++) {
                    i3 = i5;
                    Test.instanceCount <<= i4;
                    i1 <<= i3;
                    iArr = iArr;
                    sArr[i4] = (short)Test.instanceCount;
                    Test.dFld += f;
                    lArr[i2 - 1] <<= 6953619657964886504L;
                }
            } while (++i4 < 9);
            i3 += (i2 ^ i5);
            Test.instanceCount += (i2 ^ s);
        }
        long meth_res = Float.floatToIntBits(f) + i1 + i2 + i3 + (b1 ? 1 : 0) + i4 + i5 + i6 + s +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(lArr);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static void vMeth1(int i, boolean b) {

        float f1=84.764F, fArr[]=new float[N];
        short s1=13733;
        int i7=9408, i8=5427, i9=2, i10=-96;
        long lArr1[]=new long[N];

        FuzzerUtils.init(fArr, 1.669F);
        FuzzerUtils.init(lArr1, -112388818544885994L);

        bMeth(f1, i);
        i = i;
        i -= s1;
        for (i7 = 10; i7 < 234; i7++) {
            Test.dArrFld = Test.dArrFld;
        }
        for (i9 = 7; i9 < 325; ++i9) {
            Test.dArrFld[i9 + 1] = Test.dFld;
            Test.iArrFld[i9 - 1][i9 + 1] = i9;
            fArr[i9 + 1] += s1;
            lArr1[i9] = 50474;
            Test.dFld *= -2088686184754784460L;
            if (true) break;
            Test.byFld += (byte)(((i9 * i8) + i7) - i10);
            i8 = i8;
        }
        Test.dFld *= Test.dFld;
        vMeth1_check_sum += i + (b ? 1 : 0) + Float.floatToIntBits(f1) + s1 + i7 + i8 + i9 + i10 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr1);
    }

    public static void vMeth() {

        boolean b2=false;
        int i11=-218;

        vMeth1(-165, b2);
        Test.iArrFld[(i11 >>> 1) % N][(i11 >>> 1) % N] = (int)Test.instanceCount;
        vMeth_check_sum += (b2 ? 1 : 0) + i11;
    }

    public void mainTest(String[] strArr1) {

        int i12=-13, i13=-1448, i14=-12, i15=11991, i16=12, i17=-181, i18=16775;
        float f2=-1.936F;
        long l=-6L;

        iFld = (int)Test.instanceCount;
        vMeth();
        for (i12 = 143; 4 < i12; --i12) {
            for (i14 = 2; i14 < 180; i14++) {
                if (bFld) continue;
                if (true) continue;
                iFld *= i14;
                lArrFld[i14] *= 31684;
                i15 += (((i14 * i14) + i15) - i13);
                bFld = bFld;
                Test.iArrFld[i12 - 1][i12 - 1] += i13;
            }
            i16 = 1;
            while (++i16 < 180) {
                for (i17 = 1; i17 < 1; ++i17) {
                    short s2=32617;
                    f2 /= 49790L;
                    i18 = 29;
                    switch (((i12 % 8) * 5) + 71) {
                    case 82:
                        i13 += (i17 * iFld);
                        Test.dArrFld[i12] = Test.instanceCount;
                        break;
                    case 107:
                        i15 -= i12;
                        Test.iArrFld[i12 + 1][i17 - 1] -= (int)1.97550;
                        if (bFld) break;
                        break;
                    case 99:
                        i15 = 12;
                        l *= i14;
                        break;
                    case 92:
                        if (bFld) continue;
                        break;
                    case 102:
                        i13 = i13;
                    case 80:
                        i15 = (int)l;
                        iFld += s2;
                        i13 += (i17 | i18);
                    case 84:
                        i13 = i16;
                        i18 += (i17 * i17);
                        break;
                    case 100:
                        l -= l;
                        break;
                    }
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  bMeth ->  bMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
