package tests.javafuzzer2852;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 21:27:33 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-5885565857697284422L;
    public static int iFld=12765;
    public static byte byFld=122;
    public double dArrFld[]=new double[N];

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {


        Test.iFld += Test.iFld;
        long meth_res = 0;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth() {

        int i3=-34280, i4=-8, i5=29, i6=-40136, i7=-63684, i8=9905, iArr[]=new int[N];
        boolean b=true, bArr[]=new boolean[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -61150L);
        FuzzerUtils.init(iArr, 9);
        FuzzerUtils.init(bArr, true);

        iMeth();
        for (i3 = 12; i3 < 265; i3++) {
            i5 = 1;
            while (++i5 < 6) {
                for (i6 = 1; i6 < 1; i6++) {
                    double d=86.105465;
                    Test.instanceCount = Test.instanceCount;
                    Test.byFld = (byte)Test.iFld;
                    lArr1[i3] = 2;
                    iArr[i5] *= Test.iFld;
                    if (b) break;
                    iArr[i3 + 1] >>= i3;
                    i7 += i6;
                    d -= i4;
                    bArr[i6] = b;
                    i8 ^= i8;
                }
                try {
                    i4 = (i7 / i5);
                    iArr[i5] = (i4 / -88);
                    iArr[i3 - 1] = (i6 % i4);
                } catch (ArithmeticException a_e) {}
            }
        }
        long meth_res = i3 + i4 + i5 + i6 + i7 + (b ? 1 : 0) + i8 + FuzzerUtils.checkSum(lArr1) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(bArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i) {

        int i1=183, i2=32205, i9=1, i10=36502, iArr1[]=new int[N];
        float f=44.125F, f1=-46.860F;
        double d1=71.101155;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, -2220078567L);
        FuzzerUtils.init(iArr1, 184);

        lArr[(i >>> 1) % N][(i >>> 1) % N] = -128;
        for (i1 = 5; i1 < 211; ++i1) {
            f *= (lMeth() << i2);
            i -= (int)d1;
            i += (int)d1;
            i9 = (int)7L;
            i10 = 1;
            do {
                try {
                    iArr1[i10 - 1] = (i1 % -1541315768);
                    iArr1[i10] = (51298 % Test.iFld);
                    iArr1[i10 - 1] = (Test.iFld % 42631);
                } catch (ArithmeticException a_e) {}
                Test.instanceCount *= i10;
                Test.iFld = i2;
                f += i10;
                i -= i2;
                i = (int)-158L;
                f1 = i9;
                f = 0.225F;
            } while (++i10 < 8);
        }
        vMeth_check_sum += i + i1 + i2 + Float.floatToIntBits(f) + Double.doubleToLongBits(d1) + i9 + i10 +
            Float.floatToIntBits(f1) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i11=-195, i12=48445, i13=-4722, i14=-58486, i15=-7, i16=237, i17=12, i18=3, i19=240, i20=-7, i21=33323,
            i22=-21645, i23=-14, iArr2[][]=new int[N][N];
        boolean b1=true, bArr1[]=new boolean[N];
        double d2=10.87670;

        FuzzerUtils.init(bArr1, true);
        FuzzerUtils.init(iArr2, -50547);

        vMeth(-4);
        for (i11 = 4; i11 < 164; i11++) {
            Test.instanceCount += Test.iFld;
            bArr1[i11] = b1;
            switch (((i12 >>> 1) % 1) + 126) {
            case 126:
                for (i13 = 9; i13 < 157; ++i13) {
                    Test.iFld += (int)Test.instanceCount;
                }
                for (i15 = 9; i15 < 157; ++i15) {
                    Test.instanceCount += -177;
                    b1 = true;
                    iArr2[i15][i15 - 1] = i14;
                }
                for (i17 = 157; i17 > 2; --i17) {
                    for (i19 = 2; i19 > i17; --i19) {
                        iArr2[i17 + 1][i19] += (int)Test.instanceCount;
                        Test.instanceCount *= i15;
                        Test.byFld = (byte)17727;
                        dArrFld[i11] %= (Test.instanceCount | 1);
                        Test.instanceCount *= (long)2.16F;
                        Test.iFld = i12;
                        i16 += i20;
                        Test.instanceCount *= i16;
                        if (b1) continue;
                    }
                    if (b1) continue;
                    i21 += (i17 * i17);
                    i14 += i20;
                    for (i22 = 2; i22 > 1; --i22) {
                        i23 = (int)Test.instanceCount;
                        d2 %= (i12 | 1);
                        i16 -= (int)d2;
                        i20 = (int)Test.instanceCount;
                    }
                }
                break;
            default:
                iArr2[i11 + 1][i11] += 0;
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
//DEBUG  iMeth ->  iMeth lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
