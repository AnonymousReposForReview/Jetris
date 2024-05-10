package tests.javafuzzer270;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 01:07:55 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3639946321241695771L;
    public static short sFld=12973;
    public static double dFld=103.53803;
    public boolean bFld=true;
    public static int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -207);
        FuzzerUtils.init(Test.fArrFld, 66.929F);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i6) {

        int i7=-28280, i8=67, i9=-19064, i10=-238, i11=20538;
        double d=42.77510;
        float f2=-1.970F;
        long lArr[][]=new long[N][N];
        short sArr[]=new short[N];

        FuzzerUtils.init(lArr, 3537600907L);
        FuzzerUtils.init(sArr, (short)12593);

        i6 *= i6;
        Test.iArrFld[(i6 >>> 1) % N] = i6;
        i6 = i6;
        Test.instanceCount = -27038;
        Test.iArrFld[(i6 >>> 1) % N] *= (int)-5.130815;
        i6 = i6;
        for (i7 = 15; i7 < 313; i7++) {
            for (i9 = 1; i9 < 6; i9++) {
                i8 -= 12;
                switch ((i9 % 9) + 78) {
                case 78:
                    switch ((i9 % 3) + 125) {
                    case 125:
                    case 126:
                        i8 >>= 22453;
                        i11 = 1;
                        do {
                            i6 <<= (int)Test.instanceCount;
                            Test.instanceCount = i11;
                        } while (++i11 < 2);
                        break;
                    case 127:
                        i10 += (i9 - i8);
                        break;
                    }
                    break;
                case 79:
                    lArr[i7][i9 - 1] -= i7;
                case 80:
                    if (true) break;
                    break;
                case 81:
                    i8 <<= Test.sFld;
                    break;
                case 82:
                    Test.instanceCount |= -138;
                    break;
                case 83:
                    d *= Test.instanceCount;
                case 84:
                    i6 += (i9 | (long)f2);
                    break;
                case 85:
                    sArr[i9 - 1] *= (short)i6;
                case 86:
                    i10 -= i8;
                }
            }
        }
        vMeth1_check_sum += i6 + i7 + i8 + i9 + i10 + i11 + Double.doubleToLongBits(d) + Float.floatToIntBits(f2) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(sArr);
    }

    public static void vMeth(int i5) {

        int i12=54035, i13=162;
        double d1=1.90303;
        float f3=0.659F;

        vMeth1(9);
        i12 = 165;
        while ((i12 -= 2) > 0) {
            i5 += (int)Test.dFld;
        }
        Test.iArrFld[(i5 >>> 1) % N] &= (int)Test.instanceCount;
        Test.instanceCount = i5;
        for (d1 = 294; 5 < d1; --d1) {
            boolean b=true;
            if (b) {
                Test.iArrFld = Test.iArrFld;
                if (false) {
                    f3 += 25714;
                } else {
                    if (i13 != 0) {
                        vMeth_check_sum += i5 + i12 + Double.doubleToLongBits(d1) + i13 + Float.floatToIntBits(f3);
                        return;
                    }
                    Test.instanceCount = i5;
                }
                vMeth_check_sum += i5 + i12 + Double.doubleToLongBits(d1) + i13 + Float.floatToIntBits(f3);
                return;
            } else {
                b = b;
                Test.instanceCount += (long)(((d1 * i5) + Test.instanceCount) - i5);
                Test.iArrFld[(int)(d1 - 1)] += 1763;
            }
        }
        vMeth_check_sum += i5 + i12 + Double.doubleToLongBits(d1) + i13 + Float.floatToIntBits(f3);
    }

    public static int iMeth(float f1, int i3, int i4) {

        int i14=22844, i15=221, i16=33766, i17=54, i18=-3;
        byte by=-112;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 3085659096L);

        i4 ^= (int)134L;
        vMeth(i3);
        i14 = 1;
        do {
            for (i15 = 1; i15 < 8; i15++) {
                lArr1[i14 - 1] = 18147;
                Test.iArrFld[i14 + 1] -= -93;
                Test.iArrFld[i14 - 1] *= i4;
                i4 <<= by;
            }
            Test.dFld *= Test.instanceCount;
            by = (byte)Test.instanceCount;
            for (i17 = 1; i17 < 8; ++i17) {
                i3 -= (int)Test.instanceCount;
                try {
                    i18 = (i17 % -43460);
                    i4 = (i15 % i18);
                    Test.iArrFld[i14 - 1] = (i16 / i17);
                } catch (ArithmeticException a_e) {}
            }
        } while (++i14 < 199);
        Test.iArrFld[(i16 >>> 1) % N] += (int)f1;
        Test.fArrFld[(-11 >>> 1) % N] += f1;
        long meth_res = Float.floatToIntBits(f1) + i3 + i4 + i14 + i15 + i16 + by + i17 + i18 +
            FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-46964, i1=4984, i2=55704, i19=11, i20=-93;
        short s=10988;
        float f=2.322F;
        byte by1=-6;
        long lArr2[]=new long[N];

        FuzzerUtils.init(lArr2, -14L);

        Test.instanceCount += i;
        for (i1 = 9; i1 < 287; ++i1) {
            i = (int)(((s - i2) - (f - f)) + (iMeth(-35.711F, i2, i1) - f));
            i19 = 1;
            do {
                lArr2[i1 + 1] = -2067853308033892490L;
                i2 = 171;
                i2 += (i19 + Test.instanceCount);
                i20 = 1;
                do {
                    Test.instanceCount += (i20 | Test.instanceCount);
                    i += (i20 ^ i1);
                    i2 *= i;
                    i -= (int)Test.instanceCount;
                    Test.instanceCount *= (long)-1.621F;
                    i2 *= i19;
                } while ((i20 += 3) < 1);
                Test.instanceCount = i;
                Test.iArrFld[i1 + 1] = i;
                i -= i19;
                switch ((i19 % 2) + 92) {
                case 92:
                    if (false) continue;
                    Test.instanceCount += Test.instanceCount;
                    f += s;
                    break;
                case 93:
                    i += (((i19 * i20) + i20) - i20);
                    break;
                }
                i2 <<= -232;
                i -= (int)Test.instanceCount;
            } while (++i19 < 90);
            bFld = bFld;
            Test.iArrFld[i1] = (int)f;
            Test.instanceCount -= Test.instanceCount;
            try {
                i = (i19 % i1);
                i = (-52 % i19);
                i = (i20 / i1);
            } catch (ArithmeticException a_e) {}
            i += by1;
            i = i;
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}