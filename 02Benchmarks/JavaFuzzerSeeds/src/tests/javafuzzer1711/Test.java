package tests.javafuzzer1711;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 02:18:19 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-8421689818961573555L;
    public static float fFld=-1.98F;
    public static volatile int iFld=2;
    public static double dFld=0.96703;
    public boolean bFld=false;
    public static int iArrFld[]=new int[N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 206);
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(float f, int i3) {

        int i4=-12599, i5=59256, i6=139, i7=4, i8=10, i9=-13, i10=-172, i11=95;
        byte by=-102;

        i3 -= i3;
        for (i4 = 1; i4 < 333; ++i4) {
            f = 9416;
        }
        for (i6 = 6; i6 < 132; ++i6) {
            i7 -= i3;
            i7 += (-70 + (i6 * i6));
        }
        by *= (byte)61423;
        Test.fFld -= 14L;
        for (i8 = 3; i8 < 126; ++i8) {
            i3 += i7;
            Test.iArrFld[i8 + 1] *= (int)Test.instanceCount;
            for (i10 = 1; i10 < 13; ++i10) {
                i9 *= i8;
                Test.iArrFld[i10 - 1] -= i7;
                i7 = 47487;
            }
        }
        long meth_res = Float.floatToIntBits(f) + i3 + i4 + i5 + i6 + i7 + by + i8 + i9 + i10 + i11;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(long l) {

        int i2=-458, i12=-12, i13=157, i14=0;
        double d1=108.36377, dArr[]=new double[N];
        byte by1=-107;
        long lArr[]=new long[N];

        FuzzerUtils.init(dArr, 70.119544);
        FuzzerUtils.init(lArr, 2954068341L);

        i2 = 1;
        do {
            Test.fFld = (((++l) + iMeth(Test.fFld, i2)) + i2);
            Test.iFld += (((i2 * i2) + i2) - i2);
            for (i12 = 1; 5 > i12; ++i12) {
                boolean b=false;
                b = b;
                Test.iFld += (((i12 * l) + i13) - i13);
                i13 = i2;
            }
            i13 *= (int)d1;
            Test.iFld -= Test.iFld;
            dArr[i2 + 1] /= ((long)(Test.fFld) | 1);
            i14 = 1;
            do {
                lArr[i14] |= Test.iFld;
                Test.iArrFld = Test.iArrFld;
                Test.iFld = (int)d1;
                by1 = (byte)i2;
            } while (++i14 < 5);
        } while (++i2 < 345);
        vMeth1_check_sum += l + i2 + i12 + i13 + Double.doubleToLongBits(d1) + i14 + by1 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(double d, int i1) {

        int i15=11, i16=194, i17=-36676, i18=-131, i19=-3, i20=-1722;
        short s=28434;
        byte by2=-127;

        vMeth1(Test.instanceCount);
        for (i15 = 22; i15 < 355; i15++) {
            i16 += i15;
        }
        i1 = Test.iFld;
        i1 -= (int)Test.instanceCount;
        Test.iArrFld[(-8 >>> 1) % N] -= (int)Test.instanceCount;
        for (i17 = 2; i17 < 152; ++i17) {
            Test.instanceCount = Test.instanceCount;
            for (i19 = 1; 11 > i19; ++i19) {
                Test.fFld += Test.instanceCount;
                Test.iArrFld[i17 - 1] -= Test.iFld;
                i16 -= i16;
                Test.instanceCount += (((i19 * Test.fFld) + Test.instanceCount) - i19);
                Test.iArrFld[i17 - 1] += s;
                by2 -= (byte)i18;
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i1 + i15 + i16 + i17 + i18 + i19 + i20 + s + by2;
    }

    public void mainTest(String[] strArr1) {

        int i=-35840, i21=-6, i22=73, i23=-30317, i24=-7, i25=-151, i26=-208, i27=-150, i28=-7;
        byte by3=26, byArr[]=new byte[N];
        long l1=2709789236L, lArr1[]=new long[N];

        FuzzerUtils.init(byArr, (byte)1);
        FuzzerUtils.init(lArr1, 59L);

        i = 1;
        while (++i < 372) {
            vMeth(Test.dFld, i);
        }
        Test.iFld = 36518;
        for (i21 = 1; i21 < 194; i21++) {
            Test.bArrFld[i21 + 1] = bFld;
            i23 = 1;
            do {
                i22 -= (int)Test.fFld;
                for (i24 = 1; i24 < 1; ++i24) {
                    Test.iFld >>>= (int)Test.instanceCount;
                    i25 += i22;
                    Test.fFld += i24;
                    i25 += 3;
                    Test.iFld += (i24 * Test.fFld);
                }
                by3 *= (byte)i21;
                Test.iFld *= i24;
                byArr[i23 + 1] >>>= (byte)Test.instanceCount;
                i22 -= Test.iFld;
                i25 -= i24;
                Test.iFld = (int)Test.fFld;
                if (bFld) {
                    Test.fFld -= i21;
                } else {
                    i22 >>= (int)Test.instanceCount;
                }
            } while (++i23 < 130);
            Test.instanceCount += i21;
            i22 += (((i21 * Test.fFld) + i24) - i25);
            i22 -= (int)-251L;
            for (l1 = 5; l1 < 130; ++l1) {
                for (i27 = 1; 2 > i27; i27++) {
                    lArr1[i21 + 1] *= 6852347444117866548L;
                    Test.instanceCount -= i27;
                    i28 += -169;
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
