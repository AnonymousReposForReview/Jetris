package tests.javafuzzer274;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 01:08:22 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=244L;
    public static double dFld=17.121372;
    public static int iArrFld[][]=new int[N][N];
    public static int iArrFld1[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 9252);
        FuzzerUtils.init(Test.iArrFld1, -13643);
        FuzzerUtils.init(Test.lArrFld, 43980L);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i6, float f1, long l) {

        int i8=75, i9=66, i10=-249;
        byte by=-1;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -231L);

        lArr[(i6 >>> 1) % N] += i6;
        i6 -= (int)l;
        i6 >>= i6;
        for (int i7 : Test.iArrFld1) {
            Test.iArrFld1[(-6 >>> 1) % N] *= 105;
            l = i6;
            Test.instanceCount -= (long)f1;
            i7 = 2859;
            for (i8 = 1; 4 > i8; i8++) {
                i6 -= i7;
                i10 = 1;
                while (++i10 < 2) {
                    i6 -= (int)l;
                    i6 -= (int)f1;
                    lArr = lArr;
                    by <<= (byte)-8005018920057618451L;
                }
            }
        }
        vMeth1_check_sum += i6 + Float.floatToIntBits(f1) + l + i8 + i9 + i10 + by + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth(int i2, int i3) {

        int i4=243, i5=2, i11=-10, i12=-4, i13=13;
        float f=-16.178F, fArr[][]=new float[N][N];

        FuzzerUtils.init(fArr, 18.628F);

        for (i4 = 17; i4 < 336; i4++) {
            Test.instanceCount = (i5 = (int)((i3 * i3) - (f * i5)));
            vMeth1(i2, f, Test.instanceCount);
            for (i11 = 1; i11 < 5; ++i11) {
                i12 += (int)Test.instanceCount;
                i3 ^= -3;
                Test.instanceCount = Test.instanceCount;
                Test.lArrFld[i11] >>= Test.instanceCount;
                Test.dFld *= f;
                i3 += i11;
                i13 = 1;
                do {
                    Test.iArrFld1[i11 - 1] -= (int)Test.instanceCount;
                    Test.iArrFld[i11 - 1][i11] -= i11;
                    i12 *= (int)Test.instanceCount;
                    fArr[i13][i4] -= i11;
                } while (++i13 < 2);
            }
        }
        long meth_res = i2 + i3 + i4 + i5 + Float.floatToIntBits(f) + i11 + i12 + i13 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i1=188, i14=-3, i15=121, i16=251, i17=9, i18=-196;
        boolean b=false;

        Test.iArrFld[(i1 >>> 1) % N][(i1 >>> 1) % N] &= iMeth(i1, i1);
        i1 = i1;
        for (i14 = 4; i14 < 243; ++i14) {
            Test.instanceCount &= -52L;
            Test.iArrFld[i14 - 1] = Test.iArrFld1;
            for (i16 = 1; i16 < 7; i16++) {
                Test.instanceCount *= i1;
                Test.iArrFld[i16 - 1][i16] = (int)Test.instanceCount;
                if (false) {
                    if (true) {
                        if (true) continue;
                        vMeth_check_sum += i1 + i14 + i15 + i16 + i17 + i18 + (b ? 1 : 0);
                        return;
                    }
                    i1 *= i14;
                } else if (b) {
                    i18 = 2;
                    do {
                        if (i15 != 0) {
                            vMeth_check_sum += i1 + i14 + i15 + i16 + i17 + i18 + (b ? 1 : 0);
                            return;
                        }
                        i15 += (61 + (i18 * i18));
                    } while (--i18 > 0);
                }
            }
        }
        vMeth_check_sum += i1 + i14 + i15 + i16 + i17 + i18 + (b ? 1 : 0);
    }

    public void mainTest(String[] strArr1) {

        int i19=40577, i20=130, i21=-4, i22=0, i23=10, iArr[]=new int[N];
        boolean b1=true, bArr[]=new boolean[N];
        float f2=-88.829F, f3=-122.218F;

        FuzzerUtils.init(iArr, 3);
        FuzzerUtils.init(bArr, false);

        for (int i : iArr) {
            vMeth();
            for (i19 = 2; i19 < 63; i19++) {
                if (b1) break;
                Test.dFld += Test.dFld;
            }
            i21 = 1;
            while (++i21 < 63) {
                i += i;
                Test.dFld += i20;
                Test.instanceCount += i21;
                b1 = b1;
                iArr = Test.iArrFld[i21];
                if (b1) break;
                Test.instanceCount += (i21 * i21);
                i20 = (int)Test.instanceCount;
            }
            for (i22 = 2; i22 < 63; i22++) {
                f2 = 2;
                while ((f2 -= 2) > 0) {
                    byte by1=20;
                    Test.instanceCount = (long)Test.dFld;
                    try {
                        i = (iArr[(int)(f2 + 1)] % 223);
                        i = (-59305 / i21);
                        i = (-233513889 % i20);
                    } catch (ArithmeticException a_e) {}
                    if (false) {
                        f3 = 201;
                        bArr[(int)(f2 - 1)] = b1;
                        i23 -= 113;
                        Test.iArrFld1[i22 + 1] <<= by1;
                    } else if (b1) {
                        Test.iArrFld1 = iArr;
                        f3 *= (float)Test.dFld;
                        i /= -63191;
                        i20 = i22;
                    } else if (b1) {
                        if (b1) {
                            Test.instanceCount = 8966L;
                            i20 >>= i23;
                        } else if (b1) {
                            i -= i22;
                        }
                    } else {
                        f3 -= i22;
                    }
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
