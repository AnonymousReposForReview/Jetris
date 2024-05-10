package tests.javafuzzer657;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 07:26:49 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3754712565L;
    public int iFld=51594;
    public static float fFld=35.590F;
    public static float fArrFld[][]=new float[N][N];
    public static int iArrFld[]=new int[N];
    public static volatile double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 2.683F);
        FuzzerUtils.init(Test.iArrFld, -54651);
        FuzzerUtils.init(Test.dArrFld, -23.17660);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vSmallMeth(int i) {

        float f=-62.127F;
        double d=1.90307;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -236L);

        lArr[(i >>> 1) % N] += (long)(f - f);
        Test.fArrFld[(i >>> 1) % N][(i >>> 1) % N] += Math.min((int)(i += (int)(Test.instanceCount--)), (int)((f *
            Test.instanceCount) - d));
        vSmallMeth_check_sum += i + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i3, long l, int i4) {

        byte by1=-74;

        Test.instanceCount = (++i3);
        i3 -= (int)-8L;
        vSmallMeth(i3);
        i3 += i3;
        i3 = by1;
        vMeth_check_sum += i3 + l + i4 + by1;
    }

    public static int iMeth(int i1, int i2, byte by) {

        float f1=0.928F;
        long l1=38021L, l2=1133443394052042416L, lArr1[]=new long[N];
        int i5=206, i6=4, i7=11, i8=7, i9=10, iArr[][]=new int[N][N], iArr1[]=new int[N];

        FuzzerUtils.init(iArr, 132);
        FuzzerUtils.init(iArr1, -101);
        FuzzerUtils.init(lArr1, -3258647302L);

        f1 = 331;
        do {
            Test.fFld += i2;
            vMeth(i2, l1, i2);
        } while (--f1 > 0);
        for (l2 = 10; l2 < 286; l2++) {
            i1 += (int)(((l2 * i5) + Test.fFld) - i1);
            try {
                i2 = (59 % i2);
                iArr1[(-5 >>> 1) % N] = (i5 % iArr[(int)(l2)][(int)(l2 - 1)]);
                i5 = (i1 % i2);
            } catch (ArithmeticException a_e) {}
            for (i6 = 6; i6 > 1; i6--) {
                i2 -= 226;
                for (i8 = (int)(l2); i8 < 2; ++i8) {
                    lArr1[i6 - 1] = l1;
                    i2 += i8;
                    i7 += (i8 - i7);
                    i2 *= by;
                    i7 %= (int)(i8 | 1);
                    Test.fFld -= i5;
                }
            }
        }
        long meth_res = i1 + i2 + by + Float.floatToIntBits(f1) + l1 + l2 + i5 + i6 + i7 + i8 + i9 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        byte by2=-77;
        int i10=-4, i11=-114, i12=1, i13=-71, i14=-246, i15=-27921, i16=115, i17=-88, i18=221, i19=-5;
        boolean b=false;
        short s=4885;
        long lArr2[]=new long[N];

        FuzzerUtils.init(lArr2, -2945964218L);

        for (int smallinvoc=0; smallinvoc<577; smallinvoc++) vSmallMeth(iFld);
        Test.instanceCount = (long)(iMeth(iFld, -12999, by2) * Test.fFld);
        lArr2[(-4 >>> 1) % N] = Test.instanceCount;
        for (i10 = 17; i10 < 393; ++i10) {
            iFld = i10;
            i11 = i10;
            for (i12 = 1; i12 < 67; i12++) {
                i13 += (i12 * i12);
                Test.instanceCount <<= iFld;
                iFld = i13;
                iFld >>= i10;
                Test.iArrFld[i12 - 1] = -6187;
                i13 += i12;
                Test.instanceCount >>= i11;
            }
        }
        for (i14 = 9; 277 > i14; ++i14) {
            iFld += (-8 + (i14 * i14));
            i15 += i14;
            for (i16 = 3; i16 < 94; ++i16) {
                by2 *= (byte)Test.instanceCount;
                i15 *= i17;
                Test.fFld = i15;
                Test.iArrFld[i16 + 1] -= 7;
                for (i18 = i16; i18 < 2; ++i18) {
                    i13 -= -55033;
                    if (b) break;
                    Test.dArrFld[i16 - 1] -= i16;
                    iFld += i18;
                    i13 += i18;
                }
                s += (short)i16;
                Test.fFld = s;
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test vMeth iMeth
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}