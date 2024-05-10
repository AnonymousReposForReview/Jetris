package tests.javafuzzer2379;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 13:47:34 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2312031867156201390L;
    public static boolean bFld=true;
    public static byte byFld=-92;
    public int iFld=4;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 60591);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static void vMeth(long l, int i3, int i4) {

        int i5=60676, i6=-2204, i7=1, i8=-231, i9=209, i10=-4, i11=-62491;
        double d=-43.128976;
        float f1=104.3F;
        short s=10237;

        if (Test.bFld) {
            for (i5 = 8; i5 < 307; ++i5) {
                i7 = 6;
                do {
                    l += (i3--);
                } while (--i7 > 0);
            }
            for (d = 1; 251 > d; ++d) {
                f1 += (float)d;
                i6 += (int)((i7 - (25.492F + s)) - d);
                for (i9 = 1; 7 > i9; i9++) {
                    i11 = 1;
                    while (++i11 < 2) {
                        f1 *= (--i4);
                        Test.iArrFld[i11 + 1] -= Math.min((int)((l / (i4 | 1)) * 0L), Test.iArrFld[i11 + 1]);
                        switch (((((i6 - i4) >>> 1) % 1) * 5) + 68) {
                        case 70:
                            i3 += (int)((++i8) - ((l &= Test.instanceCount) / ((i6 * -12) | 1)));
                            Test.instanceCount += (long)d;
                            break;
                        default:
                            i10 += (((i11 * i8) + f1) - i3);
                        }
                    }
                }
            }
        } else if (Test.bFld != ((++Test.instanceCount) > (f1 + (i3 += i3)))) {
            f1 -= (l - (i8 - (l--)));
        } else {
            Test.instanceCount = Test.iArrFld[(-8 >>> 1) % N];
        }
        vMeth_check_sum += l + i3 + i4 + i5 + i6 + i7 + Double.doubleToLongBits(d) + i8 + Float.floatToIntBits(f1) + s
            + i9 + i10 + i11;
    }

    public static int iMeth1(int i12, int i13, int i14) {

        int i15=12, i16=33771, i17=225, i18=15622;
        float f2=0.480F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 666514927L);

        vMeth(Test.instanceCount, i12, i12);
        Test.instanceCount &= i13;
        for (i15 = 12; i15 < 287; ++i15) {
            double d2=1.29667;
            switch (((i15 % 2) * 5) + 126) {
            case 127:
                d2 += Test.instanceCount;
                break;
            case 131:
                if (Test.bFld) continue;
                break;
            default:
                Test.instanceCount = Test.instanceCount;
                i12 = i13;
            }
            if (Test.bFld) {
                f2 /= (i12 | 1);
                lArr[i15 - 1] *= i15;
                for (i17 = 1; i17 < 6; ++i17) {
                    if (Test.bFld) {
                        if (Test.bFld) continue;
                    }
                    Test.byFld *= (byte)i17;
                }
            }
        }
        long meth_res = i12 + i13 + i14 + i15 + i16 + Float.floatToIntBits(f2) + i17 + i18 + FuzzerUtils.checkSum(lArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth(float f) {

        int i=105, i1=-5, i2=31061, i19=53647, i20=11, i21=-5, iArr[]=new int[N];
        short s1=-17718;
        double d1=120.21396;

        FuzzerUtils.init(iArr, 231);

        iArr[(-51107 >>> 1) % N] = i;
        for (i1 = 9; i1 < 182; i1++) {
            vMeth(Short.reverseBytes((short)(s1 *= (short)-22)) - Test.iArrFld[i1 - 1], i2++, (int)(iArr[i1] -=
                (int)101.470F));
            d1 -= (((d1 * 49418) / (iMeth1(i1, 13, i1) | 1)) + i1);
            i += (((i1 * i1) + i1) - i2);
            Test.instanceCount *= i;
            i19 = 1;
            while (++i19 < 9) {
                Test.iArrFld[i1] += i2;
                i2 += i19;
                for (i20 = 1; i20 < 1; i20++) {
                    iArr[i19] = (int)43159L;
                    i2 -= 70;
                    try {
                        Test.iArrFld[i20 - 1] = (i1 / -34130);
                        i21 = (i2 % i);
                        i = (127 % i20);
                    } catch (ArithmeticException a_e) {}
                    if (Test.bFld) break;
                    Test.byFld += (byte)Test.instanceCount;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f) + i + i1 + i2 + s1 + Double.doubleToLongBits(d1) + i19 + i20 + i21 +
            FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f3=90.385F;
        int i22=9, i23=-6, i24=-9, i25=-42860, i26=-219, i27=1361, i29=-208, i30=-20, i31=-7, i32=7, i33=-15418;
        double d3=78.3102;
        short s2=-12031;
        long l1=-7870051511321726926L, l2=8L;

        iMeth(f3);
        iFld >>>= (int)57795L;
        for (i22 = 1; i22 < 145; ++i22) {
            i23 = (int)Test.instanceCount;
            for (i24 = 3; i24 < 174; i24++) {
                i25 *= i23;
                if (Test.bFld) continue;
                iFld %= (int)((long)(f3) | 1);
                iFld -= i24;
            }
            Test.iArrFld[i22 + 1] -= 47186;
            i23 = -8804;
            i23 |= i22;
        }
        iFld = (int)Test.instanceCount;
        for (i26 = 5; i26 < 199; ++i26) {
            i25 -= i27;
            i27 -= i23;
            for (i29 = 1; i29 < 129; i29++) {
                d3 = -2.556F;
                for (i31 = i29; i31 < 2; ++i31) {
                    i23 = i29;
                    i27 = i25;
                    d3 = s2;
                    f3 -= Test.instanceCount;
                }
                Test.byFld = (byte)i27;
                i27 -= i29;
            }
            for (l1 = 2; l1 < 129; ++l1) {
                l2 = 1;
                do {
                    Test.instanceCount = -12;
                    if (Test.bFld) continue;
                    i23 >>= iFld;
                } while (++l2 < 2);
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
//DEBUG  vMeth ->  vMeth iMeth mainTest iMeth1
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
