package tests.javafuzzer1227;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 16:43:10 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-170318518507780904L;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 189);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i4, int i5) {

        int i6=-11, i7=-142, i8=42261, i9=242, i10=-59424, i11=7, i12=-3, i13=-204, i14=121;
        float f=-2.382F;
        double d1=2.24444;
        byte by=-32;

        for (i6 = 2; i6 < 160; ++i6) {
            if (i7 != 0) {
                vMeth2_check_sum += i4 + i5 + i6 + i7 + i8 + i9 + i10 + i11 + Float.floatToIntBits(f) + i12 + i13 +
                    Double.doubleToLongBits(d1) + i14 + by;
                return;
            }
            Test.instanceCount = i4;
            for (i8 = i6; i8 < 10; ++i8) {
                for (i10 = 1; i10 < 1; i10++) {
                    i9 += (i10 - i10);
                    Test.instanceCount = 0;
                }
                i11 = (int)Test.instanceCount;
                Test.instanceCount = 9;
                Test.instanceCount = i11;
                f = 13;
            }
            for (i12 = 1; i12 < 10; ++i12) {
                i4 = (int)d1;
                i14 += i13;
                i13 += (((i12 * by) + i4) - f);
            }
        }
        vMeth2_check_sum += i4 + i5 + i6 + i7 + i8 + i9 + i10 + i11 + Float.floatToIntBits(f) + i12 + i13 +
            Double.doubleToLongBits(d1) + i14 + by;
    }

    public static void vMeth1(double d, int i2, int i3) {

        int i15=-49940, i16=9, i17=-6259, i18=-46309, i19=-13;
        float f1=1.858F;

        vMeth2(i2, i2);
        i15 = 1;
        while (++i15 < 246) {
            Test.instanceCount -= -13;
            Test.instanceCount += (i15 - i3);
            i2 = (int)Test.instanceCount;
            i2 = (int)f1;
            Test.instanceCount <<= Test.instanceCount;
            for (i16 = 1; i16 < 7; i16++) {
                Test.instanceCount >>>= 42503;
                i18 = 1;
                do {
                    i3 = -2;
                } while (++i18 < 2);
                Test.iArrFld[i15] += (int)Test.instanceCount;
                Test.instanceCount = i18;
                f1 += i18;
                i19 = i15;
            }
        }
        vMeth1_check_sum += Double.doubleToLongBits(d) + i2 + i3 + i15 + Float.floatToIntBits(f1) + i16 + i17 + i18 +
            i19;
    }

    public static void vMeth(long l, long l1, int i) {

        int i1=-42817, i20=3;
        double d2=1.56983, d3=0.93903;
        float f2=0.981F, fArr[]=new float[N];
        boolean b=true;

        FuzzerUtils.init(fArr, 90.94F);

        i1 = 1;
        do {
            Test.iArrFld[i1 - 1] = (--i);
            vMeth1(d2, i, i1);
            fArr[i1] -= f2;
            b = b;
            try {
                i = (i1 % i1);
                i = (i1 / i);
                i = (i % i);
            } catch (ArithmeticException a_e) {}
        } while (++i1 < 340);
        if (true) {
            for (d3 = 11; d3 < 220; ++d3) {
                f2 *= -94;
                if (i1 != 0) {
                    vMeth_check_sum += l + l1 + i + i1 + Double.doubleToLongBits(d2) + Float.floatToIntBits(f2) + (b ?
                        1 : 0) + Double.doubleToLongBits(d3) + i20 +
                        Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                    return;
                }
                i += (int)l;
                l1 -= (long)f2;
            }
        } else if (b) {
            Test.iArrFld[(i >>> 1) % N] *= (int)l;
            l1 = i20;
            i += (int)l1;
        } else {
            d2 *= i1;
        }
        vMeth_check_sum += l + l1 + i + i1 + Double.doubleToLongBits(d2) + Float.floatToIntBits(f2) + (b ? 1 : 0) +
            Double.doubleToLongBits(d3) + i20 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i21=187;

        vMeth(Test.instanceCount, Test.instanceCount, i21);


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
