package tests.javafuzzer2332;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 12:38:42 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2134784989210894878L;
    public static float fFld=29.17F;
    public static volatile double dFld=2.123062;
    public short sFld=27578;
    public static int iFld=96;
    public static byte byFld=118;
    public static int iFld1=-59560;
    public static long lArrFld[]=new long[N];
    public float fArrFld[]=new float[N];
    public static volatile short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -198L);
        FuzzerUtils.init(Test.sArrFld, (short)29420);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static double dMeth() {

        int i9=-64710, i10=-253, i11=4, i12=87, iArr1[]=new int[N];
        boolean b1=false;
        short s=5945;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -5632L);
        FuzzerUtils.init(iArr1, -137);

        i9 = 340;
        while (--i9 > 0) {
            if (b1) break;
            Test.iFld += (((i9 * i9) + Test.instanceCount) - i9);
            Test.iFld -= i9;
            Test.iFld += (int)Test.dFld;
            Test.instanceCount = s;
            Test.iFld %= (int)(i9 | 1);
            i10 = 1;
            while (++i10 < 5) {
                for (i11 = 1; i11 < 1; i11++) {
                    Test.fFld = i12;
                    Test.fFld += Test.instanceCount;
                    lArr[i10 - 1] = (long)1.913F;
                }
                i12 <<= Test.iFld;
                Test.instanceCount <<= i9;
            }
            Test.iFld = Test.iFld;
        }
        long meth_res = i9 + (b1 ? 1 : 0) + s + i10 + i11 + i12 + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr1);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static int iMeth(boolean b, int i4) {

        double d=-88.100059, dArr[][]=new double[N][N];
        int i5=33119, i6=142, i7=15068, i8=6, i14=-64511, i15=2, iArr2[][]=new int[N][N];
        short s1=-30057;
        float fArr[]=new float[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(dArr, 90.77231);
        FuzzerUtils.init(iArr2, 58);
        FuzzerUtils.init(fArr, -49.97F);
        FuzzerUtils.init(byArr, (byte)-122);

        for (d = 9; d < 191; d += 3) {
            i6 = 1;
            while (++i6 < 26) {
                for (i7 = 1; i7 < 1; ++i7) {
                    i8 += (-166 + (i7 * i7));
                    i8 >>= (int)Long.reverseBytes(Test.instanceCount * (++i4));
                    if (i6 != 0) {
                    }
                    i4 = i7;
                    Test.instanceCount -= (long)(((Test.instanceCount--) / ((long)(dArr[(int)(d - 1)][i7 + 1]) | 1)) -
                        95.31715);
                }
            }
            switch ((int)((d % 9) + 18)) {
            case 18:
                dMeth();
                switch ((int)((d % 2) + 5)) {
                case 5:
                    s1 -= (short)-2.954F;
                    break;
                case 6:
                    for (i14 = 1; i14 < 26; ++i14) {
                        Test.iFld = (int)857508289L;
                        iArr2[(int)(d + 1)][i14] <<= Test.iFld;
                    }
                    break;
                default:
                    Test.instanceCount <<= i7;
                }
                break;
            case 19:
                Test.dFld = i7;
            case 20:
                byArr[(int)(d - 1)] += Test.byFld;
                break;
            case 21:
                i15 = i5;
                break;
            case 22:
                iArr2[(int)(d + 1)][(int)(d + 1)] = i4;
                break;
            case 23:
            case 24:
                Test.fFld += (-7 + (d * d));
                break;
            case 25:
            case 26:
                i4 = -3313;
                break;
            default:
                i4 = i5;
            }
        }
        long meth_res = (b ? 1 : 0) + i4 + Double.doubleToLongBits(d) + i5 + i6 + i7 + i8 + s1 + i14 + i15 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr2) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(byArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(long l, int i2, int i3) {

        int i16=-10, i17=171, i18=135, i19=-2, i20=195, iArr3[][]=new int[N][N];
        float f1=100.925F;
        short s2=-5298;
        boolean b2=false;

        FuzzerUtils.init(iArr3, -4);

        l >>= iMeth(false, i2);
        for (i16 = 5; i16 < 127; i16++) {
            for (f1 = 1; 13 > f1; ++f1) {
                iArr3[(int)(f1 + 1)][i16] >>= (int)Test.instanceCount;
                i18 = Test.iFld;
                Test.iFld <<= 31802;
                i17 += (int)(f1 + l);
                for (i19 = (int)(f1); i19 < 2; i19++) {
                    s2 += (short)i19;
                }
                switch ((int)(((f1 % 10) * 5) + 114)) {
                case 139:
                    i20 -= (int)l;
                    i20 = 169;
                    break;
                case 135:
                    i3 = (int)l;
                    iArr3[(int)(f1)][i16 + 1] = i16;
                    l *= 6164;
                    break;
                case 159:
                    i3 += (int)(f1 * i3);
                    break;
                case 153:
                    b2 = true;
                    break;
                case 128:
                    i20 = (int)Test.instanceCount;
                    break;
                case 147:
                    Test.instanceCount = Test.instanceCount;
                    break;
                case 134:
                    Test.instanceCount += (long)f1;
                    break;
                case 142:
                    Test.lArrFld[i16] += (long)f1;
                    break;
                case 136:
                    Test.lArrFld[i16 - 1] -= i2;
                    break;
                case 149:
                    i20 += (int)(0.253F + (f1 * f1));
                    break;
                }
            }
        }
        vMeth_check_sum += l + i2 + i3 + i16 + i17 + Float.floatToIntBits(f1) + i18 + i19 + i20 + s2 + (b2 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr3);
    }

    public void mainTest(String[] strArr1) {

        int i=-8, i1=9, i21=-6, i22=-6, i23=10, i24=0, i25=-4, i26=180, i27=9, iArr[]=new int[N];
        long l1=43018L;
        float f2=1.764F;

        FuzzerUtils.init(iArr, -7965);

        i -= (int)((Test.fFld++) - (iArr[(i >>> 1) % N] * (Test.dFld - Test.fFld)));
        i1 *= (int)(Test.instanceCount - (-(sFld + i)));
        vMeth(Test.instanceCount, i, Test.iFld);
        fArrFld[(i >>> 1) % N] -= Test.instanceCount;
        for (l1 = 2; l1 < 284; ++l1) {
            Test.instanceCount = Test.instanceCount;
            Test.dFld -= Test.fFld;
            for (f2 = 3; f2 < 89; f2++) {
                Test.instanceCount *= i21;
                for (i23 = 1; i23 < 2; i23++) {
                    Test.instanceCount += (((i23 * Test.instanceCount) + Test.byFld) - i21);
                    sFld += (short)i22;
                    Test.iFld1 *= (int)l1;
                    i22 += i23;
                    try {
                        i21 = (i21 / iArr[(int)(f2)]);
                        i24 = (i22 / i23);
                        Test.iFld1 = (19685 % i23);
                    } catch (ArithmeticException a_e) {}
                }
                i21 -= (int)Test.instanceCount;
                Test.iFld += i23;
                fArrFld[(int)(l1)] -= i;
                iArr[(int)(f2 - 1)] *= (int)2.6280;
                Test.byFld += (byte)f2;
            }
            i1 *= -90;
            Test.iFld1 &= sFld;
        }
        Test.dFld += 28786;
        Test.sArrFld[(-39518 >>> 1) % N] /= (short)(Test.instanceCount | 1);
        for (i25 = 396; i25 > 8; --i25) {
            i27 = 1;
            while (++i27 < 65) {
                i21 >>>= i24;
                Test.iFld1 -= i;
                i24 += (((i27 * i24) + i24) - i26);
                Test.instanceCount += 44711;
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
//DEBUG  dMeth ->  dMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
