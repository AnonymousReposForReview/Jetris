package tests.javafuzzer2906;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 22:43:51 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-5831747502310301538L;
    public int iArrFld[]=new int[N];
    public static int iArrFld1[]=new int[N];
    public static double dArrFld[]=new double[N];
    public volatile float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld1, 12);
        FuzzerUtils.init(Test.dArrFld, 1.91451);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static int iMeth() {

        int i7=-62717;

        Test.instanceCount += ((Test.iArrFld1[(i7 >>> 1) % N] - Math.abs(-98)) - ((i7++) + (i7 - i7)));
        long meth_res = i7;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth2(int i11) {

        float f2=2.273F, f3=0.633F;
        int i12=-55535, i13=55067, i14=-11, i15=-243, i16=68, i17=-8763;
        boolean b=false;
        double d=70.20361;

        for (f2 = 9; f2 < 251; f2++) {
            i11 *= i11;
            if (b) continue;
            try {
                Test.iArrFld1[(int)(f2)] = (2003862107 / i12);
                i11 = (i12 % Test.iArrFld1[(int)(f2)]);
                Test.iArrFld1[(int)(f2 - 1)] = (i11 % 248);
            } catch (ArithmeticException a_e) {}
            for (i13 = 1; i13 < 7; i13++) {
                i15 >>= i11;
                switch (((i15 >>> 1) % 4) + 21) {
                case 21:
                    Test.iArrFld1[(int)(f2)] *= (int)d;
                    f3 -= Test.instanceCount;
                    d += Test.instanceCount;
                    i14 -= (int)Test.instanceCount;
                    break;
                case 22:
                    for (i16 = 1; i16 < 2; i16++) {
                        Test.iArrFld1[i13 - 1] += i15;
                        Test.iArrFld1[i16] *= i12;
                        i14 += 14970;
                    }
                case 23:
                    i12 += (i13 - i16);
                    break;
                case 24:
                    i17 = i13;
                    break;
                default:
                    Test.instanceCount = Test.instanceCount;
                }
            }
        }
        vMeth2_check_sum += i11 + Float.floatToIntBits(f2) + i12 + (b ? 1 : 0) + i13 + i14 + i15 +
            Double.doubleToLongBits(d) + Float.floatToIntBits(f3) + i16 + i17;
    }

    public static void vMeth1() {

        int i18=11;

        vMeth2(i18);
        i18 = i18;
        vMeth1_check_sum += i18;
    }

    public static void vMeth(int i1, int i2) {

        int i3=177, i4=-11, i5=-8, i6=-59531, i8=147, i9=50158, iArr[]=new int[N];
        float f=0.583F, fArr[][]=new float[N][N], fArr1[]=new float[N];
        byte by=36;
        short s=-32748;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr, -5);
        FuzzerUtils.init(fArr, -1.258F);
        FuzzerUtils.init(lArr1, 57416L);
        FuzzerUtils.init(fArr1, -85.59F);

        for (i3 = 10; i3 < 251; i3++) {
            f -= i4;
            iArr[i3 + 1] = i2;
            for (i5 = 1; i5 < 7; ++i5) {
                i6 = iMeth();
                i2 -= i4;
                by += (byte)(((i5 * i4) + i1) - Test.instanceCount);
                i4 = (int)((++fArr[i5 + 1][i5 - 1]) - (f * (i1 | i5)));
            }
            for (i8 = 1; 7 > i8; ++i8) {
                i6 <<= s;
                lArr1[i8] = (++i4);
                i4 += i8;
            }
            i9 += i3;
            Test.iArrFld1[i3] += i3;
        }
        vMeth1();
        vMeth_check_sum += i1 + i2 + i3 + i4 + Float.floatToIntBits(f) + i5 + i6 + by + i8 + i9 + s +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(lArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public void mainTest(String[] strArr1) {

        int i=105, i19=-9614, i20=1, i21=100, i22=-26388, i23=-8, i24=-169, i25=-94, i26=-35, i27=-1;
        byte by1=-44;
        double d3=-94.84132;
        long l=-4044793110L, lArr[]=new long[N];
        float f4=-1.514F;

        FuzzerUtils.init(lArr, -28177L);

        iArrFld[(-219 >>> 1) % N] <<= (int)lArr[(i >>> 1) % N];
        vMeth(626, i);
        by1 %= (byte)(i | 1);
        i -= i;
        for (double d1 : Test.dArrFld) {
            d1 *= i;
            switch (((i >>> 1) % 1) + 104) {
            case 104:
                Test.instanceCount *= 5361283176302131294L;
                break;
            }
            iArrFld[(-54627 >>> 1) % N] <<= i;
        }
        for (i19 = 5; i19 < 252; i19++) {
            d3 -= Test.instanceCount;
        }
        for (i21 = 11; 277 > i21; ++i21) {
            iArrFld[i21] /= 228;
            for (i23 = 3; i23 < 94; ++i23) {
                short s1=8202;
                if (false) break;
                i22 /= (int)(s1 | 1);
            }
            by1 += (byte)12;
            fArrFld[i21 + 1] += i19;
            lArr[i21 - 1] = 14916;
            i20 = i19;
            for (l = 3; l < 94; ++l) {
                Test.instanceCount -= Test.instanceCount;
                for (i26 = 2; i26 > 1; --i26) {
                    i25 = i25;
                    by1 = (byte)i19;
                    iArrFld[i21 + 1] = -31630;
                }
            }
            i += (i21 - i20);
            iArrFld[i21 - 1] += (int)f4;
            Test.instanceCount += (long)1.478F;
        }
        Test.iArrFld1 = Test.iArrFld1;

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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}