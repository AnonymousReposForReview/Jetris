package tests.javafuzzer252;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 00:55:51 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2514405774L;
    public static byte byFld=-20;
    public static double dFld=0.3014;
    public static float fArrFld[][]=new float[N][N];
    public static int iArrFld[]=new int[N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 4.653F);
        FuzzerUtils.init(Test.iArrFld, -52);
    }

    public static long dMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i4, double d, int i5) {

        int i6=12, i7=122;
        float f1=0.34F;
        boolean b=false;
        short s1=-6589;

        switch (((i4 >>> 1) % 3) + 49) {
        case 49:
            Test.instanceCount += i4;
            break;
        case 50:
            for (i6 = 6; i6 < 394; i6 += 2) {
                switch (((i6 % 10) * 5) + 116) {
                case 125:
                    i4 = (int)Test.instanceCount;
                case 138:
                    i5 = i4;
                    break;
                case 119:
                    Test.iArrFld[i6 - 1] = (int)f1;
                    if (b) break;
                    i5 &= i5;
                    break;
                case 129:
                    i7 += i4;
                    i4 |= i7;
                    i4 = i4;
                    i7 <<= -54;
                    break;
                case 140:
                    i4 = i5;
                    Test.instanceCount += i6;
                case 161:
                    i5 /= (int)(i5 | 1);
                case 141:
                    Test.instanceCount >>>= -253;
                case 120:
                    Test.iArrFld = Test.iArrFld;
                case 133:
                    s1 = Test.byFld;
                    break;
                case 147:
                    i5 += (i6 * i6);
                    break;
                default:
                    Test.iArrFld[i6 + 1] *= i5;
                }
            }
            break;
        case 51:
            Test.iArrFld = FuzzerUtils.int1array(N, (int)6);
            break;
        }
        vMeth_check_sum += i4 + Double.doubleToLongBits(d) + i5 + i6 + i7 + Float.floatToIntBits(f1) + (b ? 1 : 0) + s1;
    }

    public static int iMeth(int i3) {

        double d1=0.38619;

        vMeth(i3, 57.28069, -11004);
        Test.instanceCount -= (long)d1;
        long meth_res = i3 + Double.doubleToLongBits(d1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static double dMeth(int i2, float f) {

        long l=-892777442L;
        int i8=49615, i9=12, i10=-57, i11=-3, i12=76, iArr[]=new int[N];
        double d2=-5.52782;
        boolean b1=true;
        float fArr[][]=new float[N][N];

        FuzzerUtils.init(fArr, 19.474F);
        FuzzerUtils.init(iArr, -211);

        fArr = (fArr = (fArr = (fArr = Test.fArrFld)));
        iArr[(i2 >>> 1) % N] -= Math.min((int)((++Test.instanceCount) - iMeth(i2)), i2);
        l += i2;
        for (i8 = 4; i8 < 210; i8++) {
            Test.instanceCount += (long)d2;
            if (b1) break;
            i2 += (i8 * i8);
            f *= i2;
            i2 = i9;
        }
        for (i10 = 16; 343 > i10; ++i10) {
            i12 -= (int)-4216966656L;
            if (b1) break;
            i2 -= (int)l;
            f -= i2;
            d2 += 1;
        }
        long meth_res = i2 + Float.floatToIntBits(f) + l + i8 + i9 + Double.doubleToLongBits(d2) + (b1 ? 1 : 0) + i10 +
            i11 + i12 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=41180, i1=175, i13=6886, i14=-51875, i15=-182, i16=11, i17=5, i18=149;
        short s=25455;
        float f2=0.234F, f3=0.103F;
        boolean b2=true;

        for (i = 159; 8 < i; --i) {
            Test.instanceCount -= (Test.instanceCount--);
            if (b2) {
                s = (short)(i1 - dMeth(i, f2));
                s = (short)i;
            }
            i1 += i;
            Test.instanceCount = (long)f2;
            for (i13 = 9; i13 < 166; ++i13) {
                i1 += (i13 * i);
                if (b2) break;
                switch ((i13 % 2) + 9) {
                case 9:
                    i14 = 0;
                    break;
                case 10:
                    i1 += (int)8453L;
                    lArrFld = lArrFld;
                    switch (((i % 1) * 5) + 69) {
                    case 72:
                        for (i15 = 1; i15 < 2; i15++) {
                            i1 &= -22196;
                            Test.instanceCount = Test.instanceCount;
                            f2 -= i14;
                            i1 += i17;
                            Test.dFld *= i17;
                        }
                        Test.byFld <<= (byte)Test.instanceCount;
                        for (f3 = 1; f3 < 2; ++f3) {
                            Test.dFld += f2;
                            i14 += (int)f3;
                            s = (short)i1;
                            Test.iArrFld[i13] = (int)f2;
                            Test.byFld -= (byte)Test.instanceCount;
                            if (true) continue;
                            i1 <<= 10;
                        }
                        break;
                    default:
                        i16 += (((i13 * i18) + i1) - Test.instanceCount);
                    }
                    break;
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
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  iMeth ->  iMeth dMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
