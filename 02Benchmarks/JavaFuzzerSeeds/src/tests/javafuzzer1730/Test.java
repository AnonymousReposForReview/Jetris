package tests.javafuzzer1730;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 02:38:15 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=1615808168433297328L;
    public static double dFld=64.114735;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 52);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static void vMeth(double d1, double d2, int i1) {

        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -1.944F);

        i1 -= -1;
        i1 /= (int)(((long)(fArr[(i1 >>> 1) % N] = Test.instanceCount)) | 1);
        vMeth_check_sum += Double.doubleToLongBits(d1) + Double.doubleToLongBits(d2) + i1 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static long lMeth() {

        int i9=9, i10=-254, i11=-1681, i12=-58975, i13=39986, iArr[]=new int[N];
        boolean b1=true;
        float f3=109.302F;

        FuzzerUtils.init(iArr, -12);

        for (i9 = 9; i9 < 230; i9++) {
            if (b1) continue;
            i11 = 1;
            do {
                Test.instanceCount += i11;
                for (i12 = i11; i12 < 1; i12++) {
                    i13 += (int)-8L;
                    try {
                        i13 = (i13 % -63515);
                        i13 = (i10 / iArr[i9 - 1]);
                        i13 = (i13 / i9);
                    } catch (ArithmeticException a_e) {}
                    i13 = (int)Test.instanceCount;
                    i13 = i9;
                    f3 -= 0L;
                }
                switch (((i9 % 5) * 5) + 96) {
                case 113:
                    Test.instanceCount *= -17502L;
                    i10 *= i13;
                    break;
                case 116:
                    i13 = 30009;
                case 100:
                    f3 *= i12;
                case 119:
                    Test.instanceCount -= (long)f3;
                    break;
                case 97:
                    i13 = i11;
                    break;
                }
            } while (++i11 < 7);
        }
        long meth_res = i9 + i10 + (b1 ? 1 : 0) + i11 + i12 + i13 + Float.floatToIntBits(f3) +
            FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1(boolean b, int i4, long l) {

        int i5=94, i6=-61127, i7=-58960, i8=2, i14=-20947;
        double d3=2.17063;
        byte by=5;
        float f2=39.852F;
        short s1=18141;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -13L);

        for (i5 = 1; i5 < 298; i5 += 2) {
            for (i7 = 1; i7 < 11; ++i7) {
                lArr[i7 + 1] <<= (long)((d3 += (by - Test.instanceCount)) - i8);
                f2 -= (Math.max((int)(Test.instanceCount - i8), (int)(-48.737F + i6)) - s1);
                i8 = (int)(Test.instanceCount - lMeth());
                i8 = 59557;
            }
            l -= (long)1.472F;
            i14 = 1;
            do {
                l = by;
                i8 <<= i4;
                switch (((i14 % 1) * 5) + 6) {
                case 9:
                    l += i14;
                    d3 += i4;
                    Test.instanceCount >>= i6;
                }
                Test.instanceCount *= i14;
            } while ((i14 += 3) < 11);
        }
        vMeth1_check_sum += (b ? 1 : 0) + i4 + l + i5 + i6 + i7 + i8 + Double.doubleToLongBits(d3) + by +
            Float.floatToIntBits(f2) + s1 + i14 + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth(float f1) {

        boolean b2=true;
        int i15=24678, i16=15956, i17=-770, i18=-29398, i19=-42408, i20=0, iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, 3);

        vMeth1(b2, i15, -5L);
        iArr1[(i15 >>> 1) % N] = i15;
        for (i16 = 3; 292 > i16; ++i16) {
            Test.instanceCount = (long)f1;
            switch (((i16 % 4) * 5) + 21) {
            case 22:
                i17 += i16;
            case 41:
                if (i16 != 0) {
                }
                i17 += i16;
            case 38:
                try {
                    i18 = (i17 / i16);
                    i15 = (i15 % i16);
                    i18 = (i17 / 24152);
                } catch (ArithmeticException a_e) {}
                for (i19 = 6; i19 > 1; i19--) {
                    i18 *= -14706;
                    i18 += (((i19 * i19) + i15) - Test.instanceCount);
                    Test.instanceCount -= i15;
                    if (i18 != 0) {
                    }
                    i15 += i18;
                }
                break;
            case 36:
                b2 = b2;
            default:
                Test.instanceCount += (long)Test.dFld;
            }
        }
        long meth_res = Float.floatToIntBits(f1) + (b2 ? 1 : 0) + i15 + i16 + i17 + i18 + i19 + i20 +
            FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d=-8.99379;
        int i=-13127, i2=-204, i3=4, i21=-3, i22=158, i23=-59769, i24=-89, i25=-17527, i26=7, i27=-208;
        short s=-21252;
        float f=-53.384F;
        boolean b3=true, bArr[]=new boolean[N];
        long l1=2950204581805941067L;

        FuzzerUtils.init(bArr, false);

        d *= i;
        vMeth((--s) + ((i + f) + (i + 112.103295)), d--, (int)(-Test.instanceCount));
        for (i2 = 3; i2 < 222; ++i2) {
            i = Math.abs((int)(iMeth(f) * Test.dFld));
            for (i21 = 115; i21 > 2; --i21) {
                f -= 11551;
                for (i23 = 1; i23 < 2; i23++) {
                    f -= -121.960F;
                    if (b3) {
                        i22 += (((i23 * f) + f) - i24);
                        Test.iArrFld[i2] <<= -2;
                    }
                    i = i2;
                    f -= i2;
                    f = (float)54.4459;
                    Test.instanceCount >>= i;
                    i = i22;
                }
            }
            i25 = 1;
            do {
                i24 *= i;
            } while (++i25 < 115);
            Test.instanceCount = i3;
            bArr[i2] = b3;
        }
        for (i26 = 20; i26 < 341; i26++) {
            i24 = (int)Test.instanceCount;
            l1 = 1;
            while ((l1 += 2) < 78) {
                byte by1=-22;
                b3 = false;
                Test.iArrFld[i26] |= i27;
                Test.iArrFld[i26 + 1] = (int)f;
                i27 *= by1;
                Test.instanceCount -= (long)f;
                i += (int)(((l1 * i24) + i24) - i25);
                i >>>= i27;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
