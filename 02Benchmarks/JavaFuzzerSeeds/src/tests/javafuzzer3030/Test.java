package tests.javafuzzer3030;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 00:59:46 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=48872L;
    public static double dFld=-66.34646;
    public static volatile int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];
    public volatile double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 5);
        FuzzerUtils.init(Test.fArrFld, 58.1021F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i5, boolean b2, int i6) {

        int i7=-4, i8=-216, i9=-25163, i10=28056;
        float f1=1.525F;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)77);

        byArr[(126 >>> 1) % N] -= (byte)Test.instanceCount;
        i7 = 1;
        do {
            f1 = 1;
            while (++f1 < 9) {
                Test.instanceCount -= -6L;
                i6 += -205;
                for (i8 = 1; i8 < 1; ++i8) {
                    if (i9 != 0) {
                    }
                }
                i9 = i9;
                i5 >>= i8;
                i5 &= (int)Test.instanceCount;
            }
            i9 += (int)f1;
            i6 = 11660;
            i10 = 1;
            do {
                b2 = b2;
                i6 ^= i5;
            } while ((i10 += 2) < 9);
        } while (++i7 < 174);
        long meth_res = i5 + (b2 ? 1 : 0) + i6 + i7 + Float.floatToIntBits(f1) + i8 + i9 + i10 +
            FuzzerUtils.checkSum(byArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i1, int i2, boolean b1) {

        int i3=-13, i4=4;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, 0L);

        for (i3 = 4; i3 < 341; i3++) {
            iMeth(-47012, b1, i1);
            Test.iArrFld[i3] *= (int)Test.instanceCount;
        }
        i1 = (int)Test.dFld;
        i1 >>>= (int)Test.instanceCount;
        Test.instanceCount = i1;
        if (b1) {
            lArr[(i2 >>> 1) % N][(i1 >>> 1) % N] >>>= i1;
            i1 = i2;
        } else {
            Test.iArrFld = Test.iArrFld;
        }
        Test.fArrFld[(251 >>> 1) % N] = 5050;
        vMeth1_check_sum += i1 + i2 + (b1 ? 1 : 0) + i3 + i4 + FuzzerUtils.checkSum(lArr);
    }

    public void vMeth(long l) {

        int i11=-226, i12=-64281, i13=-14, i14=159, i15=6, i16=3;
        float f2=0.829F;
        long lArr1[][]=new long[N][N];

        FuzzerUtils.init(lArr1, -29022L);

        vMeth1(i11, i11, true);
        i12 = 1;
        while (++i12 < 355) {
            lArr1[i12][i12 + 1] = (long)-115.454F;
            l = Test.instanceCount;
            for (i13 = 5; 1 < i13; i13--) {
                i14 -= i11;
                i14 = i13;
            }
            if (true) break;
            lArr1[i12 - 1][i12 + 1] = i12;
            Test.iArrFld[i12] %= -161;
            for (i15 = i12; i15 < 5; i15++) {
                lArr1[i12 - 1] = FuzzerUtils.long1array(N, (long)-8L);
                i11 += i11;
                f2 += (i15 - f2);
            }
            i16 += (i12 | i13);
        }
        vMeth_check_sum += l + i11 + i12 + i13 + i14 + i15 + i16 + Float.floatToIntBits(f2) +
            FuzzerUtils.checkSum(lArr1);
    }

    public void mainTest(String[] strArr1) {

        float f=76.601F;
        int i=-171, i17=-36, i18=-67, i19=0, i20=82, i21=170, i22=-34131;
        boolean b=false;
        byte by=52;

        f -= (++i);
        Test.iArrFld[(i >>> 1) % N] >>= ((i + 14) % ((Test.iArrFld[(i >>> 1) % N] -= (i--)) | 1));
        b = ((Test.iArrFld[(i >>> 1) % N] - (~i)) != 3849);
        vMeth(Test.instanceCount);
        for (i17 = 17; i17 < 375; i17 += 3) {
            for (i19 = 2; i19 < 211; i19++) {
                i18 *= (int)Test.instanceCount;
                Test.iArrFld[i17] = -128;
                Test.dFld = i18;
                if (b) {
                    i18 = by;
                    i20 += (i19 - i17);
                    by += (byte)27664;
                    dArrFld[i17] *= 0;
                } else if (true) {
                    i20 *= (int)Test.dFld;
                    i18 &= i20;
                } else if (b) {
                    Test.iArrFld[i17 - 1] *= (int)9.374F;
                    f += i19;
                    i20 = (int)-203L;
                    i += i19;
                }
                i18 += (i19 - by);
                for (i21 = 1; i21 < 2; ++i21) {
                    Test.iArrFld[i21 + 1] -= 8;
                    Test.iArrFld[i19 - 1] += -16438;
                    dArrFld[i21 + 1] = i22;
                    Test.iArrFld[i17 + 1] = i21;
                    Test.instanceCount += Test.instanceCount;
                    b = true;
                    if (b) break;
                }
            }
            i22 = -28690;
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
