package tests.javafuzzer2317;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 12:13:15 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-4L;
    public static byte byFld=19;
    public static float fFld=-115.87F;
    public static double dArrFld[]=new double[N];
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 2.37521);
        FuzzerUtils.init(Test.lArrFld, -48L);
        FuzzerUtils.init(Test.iArrFld, 0);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l, int i14) {

        float f2=-1.602F, f3=-11.386F;
        double d1=32.17238;
        int i15=0, i16=-46709, i17=9, i18=15910, i19=-169;
        short s=18755;

        f2 = 1;
        while (++f2 < 317) {
            d1 -= i14;
            for (f3 = 1; 5 > f3; ++f3) {
                Test.dArrFld[(int)(f2 + 1)] -= Test.instanceCount;
            }
            i15 <<= i14;
            s += (short)(f2 * l);
        }
        for (i16 = 6; 133 > i16; i16++) {
            Test.fFld = Test.instanceCount;
            i14 >>= (int)l;
            Test.lArrFld[i16 - 1] = -12L;
            for (i18 = 1; i18 < 12; i18 += 3) {
                i17 -= (int)d1;
                i19 = Test.byFld;
                Test.iArrFld[i16 - 1] ^= i17;
                Test.iArrFld[i18 + 1] <<= i18;
            }
        }
        vMeth2_check_sum += l + i14 + Float.floatToIntBits(f2) + Double.doubleToLongBits(d1) + Float.floatToIntBits(f3)
            + i15 + s + i16 + i17 + i18 + i19;
    }

    public static void vMeth1(float f1) {

        int i9=8, i10=-2, i11=-24829, i12=-7, i13=-253;
        double d=14.116585;
        byte by=-81;

        i9 += (int)(-(i9 + (d - i9)));
        for (i10 = 11; i10 < 370; ++i10) {
            i9 = -94;
            for (i12 = 5; i12 > 1; i12--) {
                Test.byFld += (byte)(((i12 * f1) + i12) - by);
                vMeth2(74L, i10);
                Test.iArrFld[i10 + 1] *= 3;
                i9 += (int)Test.instanceCount;
                Test.lArrFld[i12] -= i9;
                Test.iArrFld[i10] = (int)66.457F;
                d = Test.instanceCount;
                Test.instanceCount >>= 62959L;
                Test.iArrFld[i12] <<= (int)Test.instanceCount;
            }
            i13 += (((i10 * Test.instanceCount) + i13) - Test.byFld);
            i11 = i11;
        }
        vMeth1_check_sum += Float.floatToIntBits(f1) + i9 + Double.doubleToLongBits(d) + i10 + i11 + i12 + i13 + by;
    }

    public static void vMeth(int i, int i1, int i2) {

        int i3=3, i4=-14, i5=9637, i6=5056, i7=-182, i8=-22904, i20=30111, i21=64821, iArr[]=new int[N];
        float f=0.588F;

        FuzzerUtils.init(iArr, -2);

        for (i3 = 2; i3 < 210; i3++) {
            i2 = (int)((-(Test.instanceCount - Test.instanceCount)) - ((f--) - i3));
        }
        for (i5 = 2; i5 < 336; ++i5) {
            for (i7 = 5; i7 > 1; --i7) {
                vMeth1(Test.fFld);
            }
            i8 >>= -19;
            Test.iArrFld[i5] -= i3;
            i4 *= i5;
            Test.iArrFld[i5] -= i6;
            Test.instanceCount -= Test.instanceCount;
            i1 &= i8;
            switch ((i5 % 2) + 83) {
            case 83:
                for (i20 = i5; i20 < 5; ++i20) {
                    i21 *= (int)Test.instanceCount;
                    i4 -= (int)f;
                }
                break;
            case 84:
                iArr[i5 + 1] += (int)Test.instanceCount;
            }
        }
        vMeth_check_sum += i + i1 + i2 + i3 + i4 + Float.floatToIntBits(f) + i5 + i6 + i7 + i8 + i20 + i21 +
            FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i22=-148;

        vMeth(i22, i22, i22);


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