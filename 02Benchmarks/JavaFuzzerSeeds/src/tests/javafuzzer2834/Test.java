package tests.javafuzzer2834;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 21:04:25 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-4864084830160068831L;
    public static byte byFld=-123;
    public static float fFld=-86.537F;
    public static short sFld=23977;
    public static float fArrFld[]=new float[N];
    public static int iArrFld[][]=new int[N][N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 2.229F);
        FuzzerUtils.init(Test.iArrFld, -139);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l1) {

        int i9=2697, i10=53058, i11=148, i12=112, i13=109, i14=-7, iArr1[]=new int[N];
        short s1=32040;
        boolean b=true;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr1, -10);
        FuzzerUtils.init(lArr1, -3761608040L);

        i9 = 1;
        while (++i9 < 300) {
            if (b) {
                i10 += i9;
                for (i11 = i9; i11 < 6; ++i11) {
                    float f=104.195F;
                    l1 *= i10;
                    try {
                        iArr1[i9 - 1] = (iArr1[i9 - 1] % 27358);
                        iArr1[i9 + 1] = (i10 / -92);
                        i10 = (i12 / 61208);
                    } catch (ArithmeticException a_e) {}
                    Test.fArrFld = Test.fArrFld;
                    i12 -= i11;
                    for (i13 = i11; i13 < 1; ++i13) {
                        iArr1[i11 - 1] >>= 5;
                        i12 -= i9;
                        i10 *= s1;
                    }
                    lArr1 = lArr1;
                    i12 = (int)f;
                    l1 >>= 26700;
                }
            } else if (b) {
                i14 = i11;
            } else if (b) {
                l1 *= -45176;
            }
        }
        vMeth1_check_sum += l1 + i9 + i10 + i11 + i12 + i13 + i14 + s1 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(lArr1);
    }

    public static void vMeth(byte by, long l, int i8) {

        float f1=25.80F;
        int i15=4151, i16=-139, i17=-11852, i18=-38, i19=80, iArr2[]=new int[N];
        double d4=-2.12076, d5=109.20870;

        FuzzerUtils.init(iArr2, -211);

        if (false) {
            vMeth1(Test.instanceCount);
            i8 *= (int)f1;
            vMeth_check_sum += by + l + i8 + Float.floatToIntBits(f1) + i15 + i16 + Double.doubleToLongBits(d4) + i17 +
                i18 + i19 + Double.doubleToLongBits(d5) + FuzzerUtils.checkSum(iArr2);
            return;
        }
        l *= 13;
        for (i15 = 9; i15 < 269; i15++) {
            for (d4 = 1; d4 < 6; d4++) {
                if (false) continue;
                i16 -= i17;
                for (i18 = 1; i18 < 2; i18++) {
                    d5 *= -115;
                    f1 += f1;
                    if (i18 != 0) {
                        vMeth_check_sum += by + l + i8 + Float.floatToIntBits(f1) + i15 + i16 +
                            Double.doubleToLongBits(d4) + i17 + i18 + i19 + Double.doubleToLongBits(d5) +
                            FuzzerUtils.checkSum(iArr2);
                        return;
                    }
                    i16 *= (int)l;
                    iArr2[(int)(d4 + 1)] = (int)f1;
                    i17 -= i15;
                }
            }
        }
        vMeth_check_sum += by + l + i8 + Float.floatToIntBits(f1) + i15 + i16 + Double.doubleToLongBits(d4) + i17 + i18
            + i19 + Double.doubleToLongBits(d5) + FuzzerUtils.checkSum(iArr2);
    }

    public static long lMeth(double d1, double d2, double d3) {

        int i7=5, i20=-30263, i21=-22;
        float f2=0.289F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -2900827446L);

        lArr[(i7 >>> 1) % N] += (++i7);
        vMeth((byte)(65), Test.instanceCount, i7);
        i20 = 296;
        while (--i20 > 0) {
            lArr[i20] ^= Test.instanceCount;
            Test.iArrFld[i20][i20] += -201;
            i7 -= (int)Test.instanceCount;
            i7 = Test.byFld;
            i7 += (((i20 * Test.instanceCount) + Test.instanceCount) - Test.fFld);
            Test.iArrFld[i20][i20 - 1] *= (int)Test.fFld;
            for (f2 = 1; f2 < 6; ++f2) {
                switch ((int)((f2 % 4) + 65)) {
                case 65:
                    Test.instanceCount = Test.instanceCount;
                    lArr[(int)(f2 + 1)] = i21;
                    break;
                case 66:
                case 67:
                    i7 &= Test.sFld;
                    break;
                case 68:
                    try {
                        i7 = (i20 % i20);
                        Test.iArrFld[(int)(f2 - 1)][(int)(f2)] = (230 % i7);
                        i7 = (Test.iArrFld[i20 + 1][(int)(f2 - 1)] % -213);
                    } catch (ArithmeticException a_e) {}
                    break;
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d1) + Double.doubleToLongBits(d2) + Double.doubleToLongBits(d3) + i7 +
            i20 + Float.floatToIntBits(f2) + i21 + FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-11, i1=51835, i2=39322, i3=8425, i4=36426, i5=217, i6=1, i22=52249, iArr[]=new int[N];
        double d=-2.85642;
        short s=28220, sArr[]=new short[N];
        long l2=-223L;

        FuzzerUtils.init(sArr, (short)14925);
        FuzzerUtils.init(iArr, 3);

        sArr[(i >>> 1) % N] = (short)((i -= iArr[(19861 >>> 1) % N]) % (Math.max(13174 & (++i), --i) | 1));
        i -= (int)Test.instanceCount;
        for (i1 = 2; i1 < 363; i1++) {
            i2 += i1;
            i3 = 1;
            do {
                i += i3;
                i <<= (i--);
                i2 -= (int)(((d += s) + (i2++)) - Short.reverseBytes((short)(i3 * 215)));
                i += (73 + (i3 * i3));
            } while (++i3 < 70);
            for (i4 = i1; i4 < 70; i4++) {
                Test.instanceCount >>>= ((-62003 + (i + i3)) / (i5 | 1));
                i6 = 1;
                do {
                    i2 ^= (int)lMeth(d, d, d);
                    Test.fFld = Test.instanceCount;
                } while (++i6 < 1);
                i2 = (int)Test.instanceCount;
                l2 = 1;
                while (++l2 < 1) {
                    Test.fFld += (l2 * l2);
                    Test.fFld -= -58526;
                    Test.iArrFld[(int)(l2 - 1)][i1 - 1] -= i2;
                    lArrFld[(int)(l2)] = l2;
                    i >>>= i1;
                    i2 >>= -124;
                }
                Test.fFld += 24598;
            }
            i = i1;
            i22 = 70;
            do {
                Test.iArrFld[i1 - 1][i22 + 1] = i1;
                i2 <<= i1;
                Test.fFld = 20596;
                Test.instanceCount >>= i;
                Test.instanceCount = i2;
            } while (--i22 > 0);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}