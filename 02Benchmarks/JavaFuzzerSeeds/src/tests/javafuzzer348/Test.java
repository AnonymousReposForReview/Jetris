package tests.javafuzzer348;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 02:37:14 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-64368L;
    public static float fFld=1.621F;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[][]=new long[N][N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 477);
        FuzzerUtils.init(Test.lArrFld, 3234991879720942461L);
        FuzzerUtils.init(Test.fArrFld, 5.1020F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l, boolean b1, int i4) {

        int i5=-4, i6=-42315, i7=-4943, i8=-214;
        float f=0.85F;
        double d=-119.122074;
        byte by1=71;

        i5 = 1;
        while (++i5 < 165) {
            i6 = 1;
            do {
                Test.iArrFld[i6 + 1] += i5;
                f -= (float)d;
                for (i7 = 1; i7 < 1; ++i7) {
                    Test.instanceCount *= Test.instanceCount;
                    l -= (long)1.378F;
                    i8 = i5;
                    i8 <<= i4;
                    b1 = b1;
                    i8 *= i7;
                }
                i8 += i6;
                i8 += i6;
                i4 <<= (int)Test.instanceCount;
                i8 += by1;
            } while (++i6 < 10);
        }
        vMeth2_check_sum += l + (b1 ? 1 : 0) + i4 + i5 + i6 + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i7
            + i8 + by1;
    }

    public static void vMeth1(byte by, int i2, int i3) {

        boolean b2=true;
        float f1=67.140F;
        int i9=-10, i10=3, i11=-208, i12=55107;

        vMeth2(Test.instanceCount, b2, 201);
        f1 = -13L;
        for (i9 = 19; i9 < 379; ++i9) {
            Test.instanceCount += (48312L + (i9 * i9));
            i11 = 1;
            do {
                Test.lArrFld = Test.lArrFld;
                i12 = 1;
                do {
                    if (b2) {
                        Test.instanceCount <<= i2;
                        i10 += by;
                        i10 = i2;
                    }
                    f1 = f1;
                    Test.iArrFld[i12] -= i12;
                    i2 += (i12 * i12);
                } while (++i12 < 1);
            } while (++i11 < 5);
        }
        Test.instanceCount *= Test.instanceCount;
        vMeth1_check_sum += by + i2 + i3 + (b2 ? 1 : 0) + Float.floatToIntBits(f1) + i9 + i10 + i11 + i12;
    }

    public void vMeth(boolean b) {

        int i=-185, i1=-4, i13=-64869, i14=14, i15=-28135, i16=6;
        byte by2=-120;
        double d1=93.56528;

        for (i = 3; i < 163; i++) {
            i1 = i;
            vMeth1(by2, i1, i);
        }
        for (i13 = 15; i13 < 268; ++i13) {
            i1 = 47938;
            d1 = Test.instanceCount;
            i14 &= i13;
            Test.iArrFld[i13] += i13;
            i14 += (i13 ^ i13);
            Test.iArrFld[i13] *= i14;
            Test.fArrFld[i13 - 1] *= i14;
            i1 = i1;
            for (i15 = i13; i15 < 6; ++i15) {
                Test.instanceCount += 2;
                Test.fFld -= Test.instanceCount;
            }
        }
        vMeth_check_sum += (b ? 1 : 0) + i + i1 + by2 + i13 + i14 + Double.doubleToLongBits(d1) + i15 + i16;
    }

    public void mainTest(String[] strArr1) {

        int i17=-221, i18=-2512, iArr[][]=new int[N][N];
        boolean b3=true;

        FuzzerUtils.init(iArr, -232);

        vMeth(false);
        iArr = FuzzerUtils.int2array(N, (int)-1);
        for (i17 = 11; i17 < 361; i17++) {
            if (b3) continue;
            Test.fFld -= Test.instanceCount;
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