package tests.javafuzzer3323;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 06:01:10 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-14L;
    public static volatile double dFld=28.102791;
    public static float fFld=0.690F;
    public static short sFld=-4356;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 31133);
    }

    public static long iMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i6, int i7) {

        boolean b=false;
        float f=-1.439F;
        int i8=45793, i9=47849, i10=-128, i11=-4, i12=-12, i13=49660, iArr[][]=new int[N][N];
        long l1=13L;
        byte by1=64;
        short s=-2285;

        FuzzerUtils.init(iArr, -3);

        b = b;
        i6 = i6;
        for (f = 22; f < 374; ++f) {
            i7 = i8;
            Test.dFld = i6;
        }
        Test.instanceCount *= i7;
        for (i9 = 1; i9 < 320; ++i9) {
            for (i11 = 1; i11 < 5; i11++) {
                i12 *= i10;
                i10 <<= i10;
                for (l1 = 1; l1 < 2; l1++) {
                    i7 += i7;
                    i6 += by1;
                }
                iArr[i11][i9] += s;
                Test.instanceCount -= l1;
            }
        }
        vMeth_check_sum += i6 + i7 + (b ? 1 : 0) + Float.floatToIntBits(f) + i8 + i9 + i10 + i11 + i12 + l1 + i13 + by1
            + s + FuzzerUtils.checkSum(iArr);
    }

    public static double dMeth(int i4, long l, int i5) {

        byte by2=73;
        int i14=2, i15=-2, i16=-5, i17=12765, i18=-2092, i19=195, i20=-1;

        vMeth(i5, i5);
        by2 = (byte)i5;
        Test.instanceCount = i4;
        for (i14 = 5; 178 > i14; i14++) {
            i15 *= (int)3L;
        }
        l >>= i4;
        i16 = 1;
        do {
            for (i17 = 1; i17 < 11; ++i17) {
                for (i19 = i17; i19 < 2; i19++) {
                    i18 -= i18;
                    Test.dFld = Test.dFld;
                    i5 = i16;
                    Test.iArrFld[i17 + 1] = (int)l;
                    l = i16;
                    Test.iArrFld[i19] -= -6;
                }
            }
        } while (++i16 < 144);
        long meth_res = i4 + l + i5 + by2 + i14 + i15 + i16 + i17 + i18 + i19 + i20;
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public int iMeth(byte by) {

        int i21=8, i22=-4, i23=9, i24=-75, i25=-5, i26=4, i27=-12094;

        Test.instanceCount -= (long)dMeth(10, Test.instanceCount, i21);
        i22 = (int)Test.instanceCount;
        i23 = 1;
        do {
            i22 >>= -41;
            for (i24 = 1; i24 < 5; ++i24) {
                by >>= (byte)i23;
                for (i26 = 1; i26 < 2; i26++) {
                    i27 = -9;
                    i22 += (-3 + (i26 * i26));
                    Test.iArrFld = FuzzerUtils.int1array(N, (int)1989);
                    Test.iArrFld[i24] = (int)Test.dFld;
                    Test.iArrFld[i26 + 1] = (int)61.305F;
                    i25 = by;
                }
                i21 = i22;
                Test.instanceCount += (i24 * i22);
            }
        } while (++i23 < 366);
        long meth_res = by + i21 + i22 + i23 + i24 + i25 + i26 + i27;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=151, i1=13, i2=124, i3=17, i28=-12, i29=31, i30=-12, i31=-54, i32=233, i33=-57626;
        byte by3=-76;
        boolean b1=true, bArr[]=new boolean[N];
        long lArr[][]=new long[N][N];
        double dArr[]=new double[N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(lArr, -5445L);
        FuzzerUtils.init(dArr, 119.21470);

        for (i = 10; i < 239; ++i) {
            for (i2 = 6; 110 > i2; i2++) {
                if (bArr[i2 + 1]) break;
                Test.instanceCount += lArr[i][i];
                Test.instanceCount >>= Test.instanceCount;
                lArr[i - 1][i2] = (i3 - ((-(8 - (i - i3))) + Math.max(20328, i)));
                i3 >>= i1;
                iMeth(by3);
                Test.instanceCount += (long)Test.fFld;
                i1 -= (int)0L;
                i1 <<= i2;
            }
            if (b1) continue;
            for (i28 = 2; 110 > i28; i28++) {
                for (i30 = 1; i30 < 2; ++i30) {
                    Test.instanceCount = (long)Test.fFld;
                    i29 -= -223;
                    i31 *= (int)Test.instanceCount;
                    Test.instanceCount <<= -45523;
                    i31 = -57814;
                }
                Test.instanceCount = i1;
                i3 += (i28 + Test.instanceCount);
                dArr[i28] -= Test.sFld;
                lArr[i - 1][i28 - 1] = -31;
            }
            Test.sFld += (short)(i | i3);
            i31 += (i * i);
            i1 >>= i30;
            for (i32 = 5; i32 < 110; i32++) {
                if (b1) continue;
                i31 = i30;
                b1 = b1;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  dMeth ->  dMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth dMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
