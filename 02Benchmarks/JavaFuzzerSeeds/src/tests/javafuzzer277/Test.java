package tests.javafuzzer277;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 01:09:09 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=239L;
    public double dFld=-112.14863;
    public static byte byFld=-62;
    public static volatile int iArrFld[]=new int[N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 2846);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i4, int i5) {

        int i6=263, i7=65131, i8=-231, i9=-38781;
        byte by=-51;
        double d=-1.16666;
        float fArr[][]=new float[N][N];

        FuzzerUtils.init(fArr, 32.389F);

        i5 &= (int)Test.instanceCount;
        i5 = i4;
        i6 = 373;
        while ((i6 -= 2) > 0) {
            for (i7 = i6; i7 < 9; i7++) {
                by = (byte)-197;
                Test.iArrFld[i6] += by;
                i8 = i8;
                i8 = i4;
            }
            i8 += (int)d;
            fArr[i6][i6 - 1] += Test.instanceCount;
            i9 = 1;
            do {
                Test.instanceCount -= i9;
                Test.iArrFld[i6] += i9;
            } while (++i9 < 9);
            i5 = (int)Test.instanceCount;
        }
        i8 = i9;
        vMeth1_check_sum += i4 + i5 + i6 + i7 + i8 + by + Double.doubleToLongBits(d) + i9 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static long lMeth(long l, int i3) {


        vMeth1(i3, i3);
        long meth_res = l + i3;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void vMeth(int i, float f) {

        short s=-14325;
        int i1=8, i2=36332, i10=4, i11=163, i12=-13687, i13=164, i14=-42416, iArr[]=new int[N];

        FuzzerUtils.init(iArr, -9);

        dFld -= s;
        for (i1 = 21; i1 < 368; i1++) {
            f -= ((892362972L * iArr[i1 + 1]) * (lMeth(Test.instanceCount, -55478) + i2));
            i = (int)Test.instanceCount;
            switch ((i1 % 1) + 111) {
            case 111:
                Test.iArrFld[i1 + 1] *= (int)17037L;
                Test.instanceCount += s;
            default:
                for (i10 = 1; 5 > i10; i10++) {
                    iArr[i10 - 1] |= -22180;
                }
                i12 = 5;
                while ((i12 -= 3) > 0) {
                    Test.instanceCount = i10;
                    for (i13 = 1; i13 < 3; ++i13) {
                        i2 >>= (int)-8472L;
                        i11 += (int)Test.instanceCount;
                        i2 += (int)(-3813378011668425450L + (i13 * i13));
                    }
                }
            }
        }
        vMeth_check_sum += i + Float.floatToIntBits(f) + s + i1 + i2 + i10 + i11 + i12 + i13 + i14 +
            FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i15=10, i16=-138, i17=-2, i18=54012, i19=-144, i20=-51361, i21=11, i22=-53, i23=40712, i24=-1;
        float f1=-122.210F, f2=-1.119F;
        short s1=6909;

        vMeth(-34905, 0.352F);
        i15 >>= Test.byFld;
        Test.instanceCount *= (long)f1;
        i15 = i15;
        for (i16 = 4; i16 < 331; i16++) {
            for (i18 = 3; i18 < 77; ++i18) {
                for (i20 = 1; 2 > i20; i20 += 3) {
                    f1 = s1;
                    lArrFld[i16] = Test.instanceCount;
                    Test.iArrFld[i18 + 1] = (int)f1;
                    i17 += (int)Test.instanceCount;
                }
                Test.instanceCount = Test.instanceCount;
                switch (((i18 % 4) * 5) + 41) {
                case 51:
                    Test.iArrFld[i16] ^= Test.byFld;
                    Test.iArrFld = FuzzerUtils.int1array(N, (int)24107);
                    break;
                case 49:
                    i21 |= i15;
                    i21 = i18;
                    i19 += (i18 * i18);
                    i17 *= i20;
                    break;
                case 57:
                    i22 = 1;
                    do {
                        i21 += (i22 | (long)f1);
                    } while (++i22 < 2);
                    i17 -= -100;
                    break;
                case 52:
                    lArrFld[i16 - 1] -= (long)f2;
                    break;
                }
                Test.iArrFld[i18 + 1] <<= Test.byFld;
                Test.byFld += (byte)i15;
                i17 *= (int)Test.instanceCount;
                i21 -= i15;
                for (i23 = 1; i23 < 2; ++i23) {
                    i17 = i22;
                    i21 -= (int)f2;
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
