package tests.javafuzzer2742;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 19:42:00 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2858974547L;
    public int iFld=183;
    public static volatile int iFld1=14;
    public static float fFld=34.442F;
    public static byte byArrFld[][]=new byte[N][N];
    public int iArrFld[]=new int[N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)119);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i11, long l1, float f) {

        int i12=-7, i13=-57961, i14=0, iArr2[]=new int[N], iArr3[]=new int[N];

        FuzzerUtils.init(iArr2, 66);
        FuzzerUtils.init(iArr3, 239);

        iArr2[(i11 >>> 1) % N] *= (int)f;
        iArr2[(i11 >>> 1) % N] = (int)86L;
        for (i12 = 306; i12 > 10; --i12) {
            f += i12;
            iArr3[i12] /= (int)(i11 | 1);
            i13 -= i11;
            f = i14;
            f -= l1;
            i14 += 76;
            i11 %= (int)(i14 | 1);
            Test.instanceCount += (-10 + (i12 * i12));
            l1 += i12;
            try {
                iArr2[i12 - 1] = (i13 % 23499);
                i14 = (-4833 / i14);
                i11 = (i12 / 1208198545);
            } catch (ArithmeticException a_e) {}
        }
        l1 += i11;
        long meth_res = i11 + l1 + Float.floatToIntBits(f) + i12 + i13 + i14 + FuzzerUtils.checkSum(iArr2) +
            FuzzerUtils.checkSum(iArr3);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(boolean b1, long l, boolean b2) {

        int i5=-14106, i6=-2, i7=-18730, i8=14590, i9=-10, i10=-53, iArr1[][]=new int[N][N];
        float f1=-53.82F;

        FuzzerUtils.init(iArr1, 4);

        for (i5 = 17; i5 < 388; ++i5) {
            for (i7 = 1; i7 < 5; i7++) {
                for (i9 = 1; 2 > i9; i9++) {
                    double d=-2.49117;
                    if (i6 != 0) {
                        vMeth_check_sum += (b1 ? 1 : 0) + l + (b2 ? 1 : 0) + i5 + i6 + i7 + i8 + i9 + i10 +
                            Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr1);
                        return;
                    }
                    i6 = (int)((++iArr1[i9][i7]) - (iMeth(i6, l, -103.225F) + d));
                    Test.instanceCount *= (long)29.52F;
                    i8 += 14957;
                    if (b1) {
                        l /= (i6 | 1);
                        iArr1[i7 - 1][i7] = (int)f1;
                        vMeth_check_sum += (b1 ? 1 : 0) + l + (b2 ? 1 : 0) + i5 + i6 + i7 + i8 + i9 + i10 +
                            Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr1);
                        return;
                    } else {
                        if (b1) break;
                        try {
                            i8 = (i10 / 27934);
                            i8 = (i6 % i7);
                            iArr1[i9][i5 - 1] = (i5 % i9);
                        } catch (ArithmeticException a_e) {}
                        f1 += (i9 * i9);
                    }
                    i8 -= i6;
                    iArr1[i5 - 1][i7 - 1] += (int)Test.instanceCount;
                }
            }
        }
        vMeth_check_sum += (b1 ? 1 : 0) + l + (b2 ? 1 : 0) + i5 + i6 + i7 + i8 + i9 + i10 + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static long lMeth(byte by, boolean b, int i) {

        int i1=-221, i2=206, i3=-52415, i4=27854, i15=-45938, i16=-59, iArr[]=new int[N];

        FuzzerUtils.init(iArr, 9);

        for (i1 = 6; 265 > i1; i1++) {
            for (i3 = 1; 6 > i3; ++i3) {
                switch ((i1 % 1) + 91) {
                case 91:
                    iArr[i1] <<= (((i + i4) - (i4--)) * ((i4--) * (Test.byArrFld[i1 + 1][i3]--)));
                    by = (byte)(i4--);
                    vMeth(false, Test.instanceCount, b);
                default:
                    i *= by;
                    for (i15 = i3; 2 > i15; ++i15) {
                        i2 = i2;
                        Test.instanceCount >>= 8528;
                        Test.instanceCount *= Test.iFld1;
                        if (i2 != 0) {
                        }
                        iArr[i3 + 1] <<= (int)10L;
                        Test.instanceCount += (-249 + (i15 * i15));
                        i4 += (5 + (i15 * i15));
                    }
                }
            }
        }
        long meth_res = by + (b ? 1 : 0) + i + i1 + i2 + i3 + i4 + i15 + i16 + FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        byte by1=-6;
        boolean b3=true;
        short s=-3935;
        int i17=-57275, i18=-26935, i19=-211, i20=5, i21=116, i22=-74;
        double d1=-2.14676;

        iFld = (int)(Math.abs(iFld) + lMeth(by1, b3, iFld));
        s = (short)Test.instanceCount;
        Test.instanceCount += -114;
        Test.instanceCount = Test.instanceCount;
        iFld <<= by1;
        i17 = 1;
        while (++i17 < 190) {
            Test.iFld1 += iFld;
            for (i18 = 132; i18 > 8; i18 -= 3) {
                iArrFld[i17 + 1] += (int)Test.instanceCount;
                iFld += (62097 + (i18 * i18));
                Test.iFld1 += (i18 * i18);
                iArrFld[i17 + 1] = i20;
                if (b3) {
                    i19 /= (int)(s | 1);
                    d1 *= Test.instanceCount;
                    lArrFld[i17 - 1] &= 58275;
                    for (i21 = 4; 1 < i21; i21--) {
                        i22 += i21;
                        i20 += (-13 + (i21 * i21));
                        Test.iFld1 += (i21 ^ i19);
                        iArrFld[i18] = i17;
                        Test.instanceCount += (i21 - Test.fFld);
                        if (b3) continue;
                        i20 <<= -138;
                        b3 = b3;
                        Test.iFld1 += i21;
                    }
                } else if (false) {
                    i19 -= s;
                    i19 *= i22;
                    Test.instanceCount *= by1;
                }
                b3 = b3;
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
