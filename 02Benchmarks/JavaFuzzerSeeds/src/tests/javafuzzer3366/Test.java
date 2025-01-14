package tests.javafuzzer3366;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 06:45:40 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=29L;
    public volatile int iFld=-50982;
    public static int iFld1=13;
    public static byte byFld=108;
    public static double dFld=-2.51288;
    public static volatile float fFld=-1.752F;
    public static int iFld2=50167;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];
    public float fArrFld[][]=new float[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 60179);
        FuzzerUtils.init(Test.lArrFld, 60079L);
    }

    public static long byMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i1, int i2, int i3) {

        double d=2.208;
        boolean b=true;
        byte by=-50;
        int i5=14, i6=213;
        float f1=0.505F, fArr[]=new float[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -1450707367925682194L);
        FuzzerUtils.init(fArr, -86.981F);

        i2 *= (int)d;
        i1 /= (int)(i2 | 1);
        for (int i4 : Test.iArrFld) {
            lArr1[(i2 >>> 1) % N] &= Test.instanceCount;
            Test.iArrFld[(-177 >>> 1) % N] <<= i3;
            switch (((i4 >>> 1) % 6) + 6) {
            case 6:
                b = false;
                i4 = by;
            case 7:
                Test.instanceCount = (long)d;
                i3 = -20756;
                if (i4 != 0) {
                    vMeth_check_sum += i1 + i2 + i3 + Double.doubleToLongBits(d) + (b ? 1 : 0) + by + i5 + i6 +
                        Float.floatToIntBits(f1) + FuzzerUtils.checkSum(lArr1) +
                        Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                    return;
                }
                break;
            case 8:
                for (i5 = 4; i5 > 1; --i5) {
                    i4 >>= i2;
                    i3 += i1;
                    if (i1 != 0) {
                        vMeth_check_sum += i1 + i2 + i3 + Double.doubleToLongBits(d) + (b ? 1 : 0) + by + i5 + i6 +
                            Float.floatToIntBits(f1) + FuzzerUtils.checkSum(lArr1) +
                            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                        return;
                    }
                }
            case 9:
                i4 += by;
                break;
            case 10:
                i4 += (int)f1;
            case 11:
                f1 = f1;
                break;
            }
        }
        vMeth_check_sum += i1 + i2 + i3 + Double.doubleToLongBits(d) + (b ? 1 : 0) + by + i5 + i6 +
            Float.floatToIntBits(f1) + FuzzerUtils.checkSum(lArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth() {

        int i7=-88, i8=-14244, i9=-168, i10=0, i11=217;
        double d1=2.113760, d2=-61.110729;
        float f2=0.804F;

        vMeth(Test.iFld1, Test.iFld1, i7);
        for (d1 = 18; d1 < 360; ++d1) {
            Test.lArrFld[(int)(d1)] = i7;
            Test.iFld1 += (int)(d1 + Test.byFld);
            Test.iArrFld = Test.iArrFld;
            i8 = Test.iFld1;
            for (i9 = 5; i9 > 1; i9--) {
                Test.iFld1 += (i9 | i7);
                i7 += i9;
                i8 = 1;
                switch ((i9 % 6) + 15) {
                case 15:
                    i7 += (i9 ^ (long)f2);
                case 16:
                    i11 = 1;
                    while (++i11 < 2) {
                        Test.lArrFld = Test.lArrFld;
                        i10 += (-7 + (i11 * i11));
                    }
                    break;
                case 17:
                    i7 += (i9 * Test.iFld1);
                    break;
                case 18:
                    Test.instanceCount %= (i7 | 1);
                    break;
                case 19:
                    Test.byFld ^= (byte)Test.instanceCount;
                case 20:
                    d2 += i11;
                    break;
                }
            }
        }
        long meth_res = i7 + Double.doubleToLongBits(d1) + i8 + i9 + i10 + Float.floatToIntBits(f2) + i11 +
            Double.doubleToLongBits(d2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static byte byMeth() {

        int i=-226, i12=13, i13=16014, i14=47484, i15=-104;
        short s=30913, sArr[][]=new short[N][N];
        boolean b1=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 6388068611726401689L);
        FuzzerUtils.init(sArr, (short)-25479);

        Test.instanceCount -= i;
        for (long l : lArr) {
            i = (-Math.min(iMeth(), Test.iFld1));
            Test.iFld1 = i;
            switch ((((i >>> 1) % 2) * 5) + 6) {
            case 13:
                for (i12 = 1; 4 > i12; ++i12) {
                    i = i;
                    Test.iArrFld[i12] += (int)Test.instanceCount;
                    if (true) {
                        for (i14 = 1; i14 < 2; ++i14) {
                            sArr[i14][i14] <<= (short)l;
                            Test.dFld *= i14;
                            i += (-1 + (i14 * i14));
                            Test.iFld1 /= (int)(s | 1);
                            Test.instanceCount += (((i14 * l) + Test.instanceCount) - Test.iFld1);
                        }
                    } else if (b1) {
                        sArr[i12][i12 - 1] -= (short)l;
                    }
                }
            case 10:
                i15 = -252;
            default:
                i += i15;
            }
        }
        long meth_res = i + i12 + i13 + i14 + i15 + s + (b1 ? 1 : 0) + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(sArr);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i16=10, i17=-12, i18=6, i19=-55760, i20=125, i21=-15059;
        double d3=-2.129020;
        boolean b2=false;

        iFld *= byMeth();
        for (i16 = 360; i16 > 17; --i16) {
            i17 = Test.iFld1;
            i17 = -31;
            Test.iFld1 = (int)-6354845077138469030L;
            fArrFld[i16][i16 - 1] = iFld;
            if (false) break;
            Test.iArrFld[i16 - 1] += Test.iFld1;
            iFld += i16;
            i17 += Test.iFld1;
        }
        for (d3 = 12; d3 < 236; ++d3) {
            Test.fFld += (float)d3;
            Test.iArrFld[(int)(d3 + 1)] <<= (int)Test.instanceCount;
            for (i19 = 6; i19 < 112; i19++) {
                Test.instanceCount -= Test.iFld1;
                Test.instanceCount = Test.instanceCount;
                iFld <<= (int)43117L;
                i21 = 2;
                do {
                    short s1=-20645;
                    Test.iArrFld[i21] = i21;
                    i17 = i18;
                    iFld *= Test.iFld1;
                    i18 -= -60437;
                    try {
                        i18 = (-142 % iFld);
                        Test.iFld1 = (114 / Test.iArrFld[i19]);
                        Test.iFld2 = (-32585 % i19);
                    } catch (ArithmeticException a_e) {}
                    Test.iFld1 <<= i19;
                    switch (((i21 % 10) * 5) + 55) {
                    case 56:
                        i20 = (int)Test.instanceCount;
                        Test.iFld1 = (int)Test.instanceCount;
                        Test.byFld += (byte)(((i21 * i19) + i21) - iFld);
                    case 60:
                        b2 = b2;
                        Test.iFld2 += (i21 * i21);
                        break;
                    case 103:
                        Test.instanceCount = iFld;
                        break;
                    case 64:
                        i17 += (i21 * i18);
                        break;
                    case 89:
                        Test.iArrFld[i19] >>= (int)Test.instanceCount;
                        break;
                    case 87:
                        i20 = s1;
                        break;
                    case 62:
                        Test.instanceCount &= 13;
                        break;
                    case 105:
                        i20 = i19;
                        break;
                    case 92:
                        iFld = Test.iFld1;
                        break;
                    case 70:
                        Test.iFld1 = iFld;
                    default:
                        Test.iFld2 += (int)1.16063;
                    }
                } while ((i21 -= 3) > 0);
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
//DEBUG  byMeth ->  byMeth mainTest
//DEBUG  iMeth ->  iMeth byMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth byMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
