package tests.javafuzzer1079;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 14:15:12 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=9L;
    public static byte byFld=65;
    public static float fFld=122.554F;
    public static volatile boolean bFld=true;
    public static double dFld=-120.21992;
    public static long lArrFld[]=new long[N];
    public static volatile int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 46120L);
        FuzzerUtils.init(Test.iArrFld, -216);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long byMeth_check_sum = 0;

    public static byte byMeth(short s, double d1) {

        int i7=-103, i8=2, iArr[]=new int[N];
        boolean b=true;
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr, -51361);
        FuzzerUtils.init(dArr, -21.88252);

        i7 -= i7;
        iArr[(i7 >>> 1) % N] = i7;
        Test.lArrFld[(-54 >>> 1) % N] <<= -4L;
        dArr = dArr;
        Test.byFld -= (byte)i7;
        Test.instanceCount -= 6;
        i8 = 1;
        while (++i8 < 282) {
            i7 |= i7;
            iArr[i8] *= i7;
            if (b) {
                i7 *= i8;
                i7 -= i8;
            } else if (true) {
                iArr = iArr;
                if (true) continue;
                i7 = (int)Test.instanceCount;
            }
        }
        long meth_res = s + Double.doubleToLongBits(d1) + i7 + i8 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public static void vMeth(int i6) {

        double d2=37.20848;
        int i9=28, i10=54706, i11=-53177, i12=-56345, i13=2231, i14=-9;
        byte by1=28;

        i6 >>= (byMeth((short)(-23279), d2) | i6);
        d2 = Test.instanceCount;
        for (i9 = 208; i9 > 8; --i9) {
            by1 = (byte)i6;
            i10 = (int)Test.fFld;
            i10 = -24216;
            try {
                Test.iArrFld[i9 + 1] = (i10 / i10);
                i10 = (i9 / Test.iArrFld[i9]);
                i6 = (i9 / i10);
            } catch (ArithmeticException a_e) {}
            i6 = (int)Test.instanceCount;
            if (Test.bFld) {
                for (i11 = 1; i11 < 8; i11++) {
                    i12 += i11;
                    for (i13 = 1; 2 > i13; ++i13) {
                        i14 %= (int)(i12 | 1);
                        i12 *= 4247;
                        Test.bFld = Test.bFld;
                    }
                }
            }
        }
        vMeth_check_sum += i6 + Double.doubleToLongBits(d2) + i9 + i10 + by1 + i11 + i12 + i13 + i14;
    }

    public static int iMeth() {

        int i4=5, i5=18939, i15=51374, i16=-9, i17=-41620, i18=29676, i19=-5800;
        byte by=-17;
        float f=-21.435F;

        for (i4 = 11; i4 < 239; i4++) {
            i5 *= by;
        }
        vMeth(i4);
        Test.lArrFld[(i5 >>> 1) % N] += i5;
        i15 = 1;
        while (++i15 < 198) {
            Test.fFld += (float)Test.dFld;
            Test.iArrFld = Test.iArrFld;
            for (i16 = 1; i16 < 8; i16++) {
                for (i18 = 1; i18 < 2; i18++) {
                    i5 = (int)Test.instanceCount;
                    i17 <<= i16;
                    Test.bFld = Test.bFld;
                    f = i19;
                    i19 -= i17;
                    i19 *= -169;
                }
            }
        }
        long meth_res = i4 + i5 + by + i15 + i16 + i17 + i18 + i19 + Float.floatToIntBits(f);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-2, i1=-248, i2=6514, i3=-3, i20=-37245, i21=-6, i22=65226, i23=-98;
        double d=0.123428, dArr1[]=new double[N];
        short s1=-25723;
        float f1=-92.441F;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, -1L);
        FuzzerUtils.init(dArr1, -1.33200);

        for (i = 198; i > 2; i -= 2) {
            i1 *= Math.max(i1, i);
            for (i2 = i; i2 < 256; ++i2) {
                i3 = -14;
                d += ((--Test.lArrFld[i + 1]) * iMeth());
                for (i20 = 1; i20 < 1; i20++) {
                    lArr = lArr;
                    i3 = i;
                    Test.instanceCount -= s1;
                    Test.instanceCount += (i20 | Test.instanceCount);
                    i21 += (int)Test.instanceCount;
                    i21 += i2;
                    Test.instanceCount *= i2;
                    i3 += (int)(-2.660F + (i20 * i20));
                    i1 += i21;
                    Test.instanceCount = (long)f1;
                }
                switch (((i % 2) * 5) + 89) {
                case 91:
                    switch (((i1 >>> 1) % 7) + 32) {
                    case 32:
                        i21 += i1;
                        i21 += i2;
                    case 33:
                    case 34:
                        dArr1[i + 1] = s1;
                        break;
                    case 35:
                        if (Test.bFld) {
                            for (i22 = 1; i22 < 1; ++i22) {
                                Test.iArrFld[i22 + 1] <<= (int)Test.instanceCount;
                                Test.instanceCount <<= 14L;
                                Test.fFld = -14;
                                switch (((i22 >>> 1) % 1) + 67) {
                                case 67:
                                    Test.lArrFld[(i22 >>> 1) % N] = i1;
                                }
                                i1 %= (int)((long)(Test.fFld) | 1);
                                i1 = i20;
                            }
                        } else {
                            s1 >>= (short)i2;
                        }
                    case 36:
                        i1 += (((i2 * s1) + Test.instanceCount) - i1);
                        break;
                    case 37:
                        lArr[i2 + 1][i + 1] += Test.instanceCount;
                    case 38:
                        Test.dFld += Test.byFld;
                        break;
                    default:
                        i23 -= (int)Test.instanceCount;
                    }
                    break;
                case 95:
                    i21 += -82;
                    break;
                default:
                    s1 += (short)(i2 + f1);
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  byMeth ->  byMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
