package tests.javafuzzer1843;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 04:25:08 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=0L;
    public static int iFld=-8;
    public static double dFld=0.100514;
    public static short sFld=17780;
    public static boolean bFld=false;
    public static volatile long lArrFld[]=new long[N];
    public static byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -8517456058597200323L);
        FuzzerUtils.init(Test.byArrFld, (byte)-66);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long byMeth_check_sum = 0;

    public static byte byMeth(float f2, float f3) {

        int i4=-2, i5=6, i6=59571, i7=-59232, i8=-100, iArr[]=new int[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 25.299F);
        FuzzerUtils.init(iArr, 182);

        for (i4 = 7; 188 > i4; ++i4) {
            i6 = 1;
            while (++i6 < 9) {
                for (i7 = 1; 1 > i7; i7++) {
                    i8 = Test.iFld;
                    fArr[i7] = (float)Test.dFld;
                    Test.lArrFld[i4 - 1] += -6;
                    Test.iFld = i7;
                    i5 += (i7 ^ Test.iFld);
                    fArr[i6] -= f3;
                    if (i5 != 0) {
                    }
                    switch (((i6 >>> 1) % 7) + 18) {
                    case 18:
                        switch (((-58052 >>> 1) % 6) + 112) {
                        case 112:
                            i5 += i5;
                            i5 = i6;
                            break;
                        case 113:
                            f2 -= (float)Test.dFld;
                        case 114:
                            iArr[i6] -= i5;
                            break;
                        case 115:
                            i5 += (((i7 * i8) + Test.sFld) - i8);
                            break;
                        case 116:
                            i5 ^= (int)Test.instanceCount;
                            break;
                        case 117:
                            i8 = i8;
                        }
                        break;
                    case 19:
                        i8 -= (int)1.47664;
                        break;
                    case 20:
                        Test.iFld += (i7 ^ i4);
                        break;
                    case 21:
                        Test.iFld = (int)Test.instanceCount;
                    case 22:
                        Test.iFld -= i8;
                        break;
                    case 23:
                        if (i8 != 0) {
                        }
                    case 24:
                    default:
                        i8 += (((i7 * Test.iFld) + i7) - i8);
                    }
                }
            }
        }
        long meth_res = Float.floatToIntBits(f2) + Float.floatToIntBits(f3) + i4 + i5 + i6 + i7 + i8 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public static void vMeth1() {

        float f1=69.216F, f4=96.933F;
        int i2=-9, i3=5, i9=-64317, i10=19360, iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, 32811);

        Test.iFld += (int)(f1--);
        for (i2 = 22; i2 < 365; ++i2) {
            switch ((i2 % 2) + 26) {
            case 26:
                byMeth(f1, f1);
                break;
            case 27:
                f1 = (float)Test.dFld;
                i3 >>= Test.iFld;
                for (i9 = 1; 5 > i9; i9++) {
                    f4 = 1;
                    do {
                        f1 *= i2;
                        i10 -= (int)f1;
                        i3 = i3;
                        iArr1[i2 - 1] = i2;
                    } while (++f4 < 2);
                    Test.instanceCount = -46548;
                    Test.instanceCount += (i9 * Test.instanceCount);
                }
                if (false) break;
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f1) + i2 + i3 + i9 + i10 + Float.floatToIntBits(f4) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(byte by, long l, long l1) {

        int i=-34094, i1=62295, i11=-5, i12=-36348, iArr2[]=new int[N];
        float f=-49.464F, fArr1[]=new float[N];
        short s=19231;
        boolean b=false;

        FuzzerUtils.init(fArr1, 0.427F);
        FuzzerUtils.init(iArr2, -141);

        l1 <<= (long)(((i *= i) - (--f)) + l1);
        i1 = 1;
        do {
            s >>= (short)((i - i) + Test.instanceCount);
            vMeth1();
        } while (++i1 < 143);
        b = false;
        Test.iFld = Test.iFld;
        fArr1[(Test.iFld >>> 1) % N] += i1;
        for (i11 = 7; i11 < 187; i11++) {
            f = (float)Test.dFld;
            switch ((i11 % 8) + 7) {
            case 7:
                f += i11;
                i -= i;
                break;
            case 8:
                i += (-4 + (i11 * i11));
                Test.iFld += (i11 * i11);
                break;
            case 9:
                try {
                    Test.iFld = (i11 % 1210);
                    Test.iFld = (Test.iFld % 54725);
                    i = (i1 % iArr2[i11 + 1]);
                } catch (ArithmeticException a_e) {}
                break;
            case 10:
            case 11:
                by = (byte)i;
            case 12:
                l += (i11 * i11);
                break;
            case 13:
                i = Test.iFld;
                break;
            case 14:
                Test.lArrFld[i11 + 1] *= i;
                break;
            }
        }
        vMeth_check_sum += by + l + l1 + i + Float.floatToIntBits(f) + i1 + s + (b ? 1 : 0) + i11 + i12 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        byte by1=10;
        int i13=254, i14=226, i15=-3, i16=-39946, i17=63530, i18=3, i19=75, iArr3[]=new int[N];
        float f5=0.693F, f6=58.1007F, fArr2[]=new float[N];
        boolean b1=false;
        double d=-2.43401;

        FuzzerUtils.init(iArr3, -9);
        FuzzerUtils.init(fArr2, -1.405F);

        vMeth(by1, Test.instanceCount, Test.instanceCount);
        for (i13 = 7; i13 < 138; ++i13) {
            if (b1) {
                iArr3[i13 + 1] = i13;
                Test.iFld >>>= (int)Test.instanceCount;
                Test.iFld += (i13 * Test.sFld);
            } else if (b1) {
                Test.iFld = i13;
                i14 *= (int)Test.instanceCount;
            } else if (Test.bFld) {
                f5 += (i13 + by1);
                i14 += i13;
                Test.iFld += (((i13 * f5) + Test.instanceCount) - Test.iFld);
            }
        }
        f5 *= (float)Test.dFld;
        fArr2[(Test.iFld >>> 1) % N] += Test.iFld;
        i14 -= -181;
        for (i15 = 1; i15 < 231; ++i15) {
            Test.lArrFld[i15 + 1] *= -5489;
            by1 += (byte)(-179 + (i15 * i15));
            Test.dFld -= Test.sFld;
        }
        for (d = 2; d < 276; d++) {
            Test.instanceCount += (long)1.143F;
            Test.sFld = (short)f5;
            if (b1) {
                i18 = 1;
                while (++i18 < 92) {
                    for (f6 = (float)(d); f6 < 1; f6++) {
                        f5 = i14;
                        i19 -= -49539;
                        Test.iFld >>= i18;
                        Test.byArrFld[(int)(f6 - 1)] = (byte)i19;
                    }
                    Test.iFld >>= -19062;
                    Test.instanceCount = -7858378557736038505L;
                }
            } else if (b1) {
                i17 -= -142;
            } else if (b1) {
                Test.sFld -= (short)8208;
            } else {
                Test.instanceCount = Test.sFld;
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
//DEBUG  byMeth ->  byMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
