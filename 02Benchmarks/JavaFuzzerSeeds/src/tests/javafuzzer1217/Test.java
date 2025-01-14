package tests.javafuzzer1217;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 16:41:19 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-274152032L;
    public static int iFld=49993;
    public static volatile float fFld=75.487F;
    public boolean bFld=false;
    public static volatile int iArrFld[]=new int[N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 39973);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long sMeth_check_sum = 0;

    public static short sMeth(int i8, double d, int i9) {

        byte by=2;
        float f1=71.1002F;
        int i10=7, i11=-10, i12=-116, i13=-43500, i14=12, iArr1[]=new int[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr1, -51079);
        FuzzerUtils.init(lArr, 9L);

        i8 = (int)Test.fFld;
        iArr1[(54695 >>> 1) % N] += i8;
        by = (byte)Test.iFld;
        for (f1 = 2; f1 < 363; f1++) {
            switch ((int)(((f1 % 7) * 5) + 36)) {
            case 71:
                for (i11 = 5; i11 > f1; --i11) {
                    Test.fFld = i12;
                    for (i13 = 1; i13 < 1; i13++) {
                        iArr1[(int)(f1 + 1)] += i13;
                        lArr[(int)(f1 - 1)] = -32;
                        Test.fFld += Test.fFld;
                        i12 -= i9;
                        i8 = (int)-9301L;
                    }
                    i10 = (int)f1;
                    lArr = lArr;
                }
                break;
            case 69:
                Test.fFld += Test.instanceCount;
                break;
            case 67:
                Test.fFld += f1;
                break;
            case 59:
                Test.fFld += by;
                break;
            case 62:
                i10 >>= i8;
            case 70:
                Test.instanceCount += by;
                break;
            case 51:
                Test.fFld *= -5465620696427128518L;
                break;
            }
        }
        long meth_res = i8 + Double.doubleToLongBits(d) + i9 + by + Float.floatToIntBits(f1) + i10 + i11 + i12 + i13 +
            i14 + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static void vMeth1(int i3, int i4) {

        int i5=-4, i6=-7, i7=195, i15=60932, i16=40584, iArr[][]=new int[N][N];
        long l=996522381L;
        float f=1.205F, fArr[]=new float[N];
        double d1=0.126952;
        short s=3761, sArr[][]=new short[N][N];

        FuzzerUtils.init(fArr, 0.51F);
        FuzzerUtils.init(iArr, 7);
        FuzzerUtils.init(sArr, (short)-18930);

        i5 = 1;
        do {
            i6 = 1;
            do {
                for (l = i6; l < 1; l++) {
                    fArr[(int)(l)] = (((i7 * 8) * (--i4)) - (--i7));
                    Test.instanceCount += (((l * Test.iFld) + i4) - i5);
                    Test.instanceCount = (long)(Float.intBitsToFloat(i6 + Test.iFld) * i3);
                    i7 += (int)(l * f);
                    iArr[i6][(int)(l)] *= (int)(sMeth(i6, d1, i7) + d1);
                    i4 = Test.iFld;
                }
                Test.iFld = (int)Test.instanceCount;
                sArr[i6][i5] = (short)i3;
                switch (((i6 % 2) * 5) + 15) {
                case 24:
                    for (i15 = 1; i15 < 1; i15++) {
                        iArr[i15][i15] = s;
                        i4 += (((i15 * Test.iFld) + i3) - i4);
                    }
                case 21:
                    i16 += i4;
                }
            } while (++i6 < 5);
        } while (++i5 < 371);
        vMeth1_check_sum += i3 + i4 + i5 + i6 + l + i7 + Float.floatToIntBits(f) + Double.doubleToLongBits(d1) + i15 +
            i16 + s + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(sArr);
    }

    public void vMeth(int i2, boolean b) {

        int i17=168, i18=106, i19=6, i20=-78, i21=6;
        double d2=1.42442;
        float fArr1[][]=new float[N][N];

        FuzzerUtils.init(fArr1, 66.241F);

        vMeth1(i2, i2);
        for (i17 = 10; i17 < 210; i17++) {
            i19 = 1;
            do {
                i18 ^= i19;
                Test.instanceCount += i19;
            } while ((i19 += 2) < 8);
            for (i20 = i17; i20 < 8; i20++) {
                if (i21 != 0) {
                    vMeth_check_sum += i2 + (b ? 1 : 0) + i17 + i18 + i19 + i20 + i21 + Double.doubleToLongBits(d2) +
                        Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
                    return;
                }
                Test.instanceCount += i20;
                d2 = 1;
                do {
                    Test.iArrFld = Test.iArrFld;
                    Test.fFld += (float)d2;
                    Test.instanceCount = i21;
                    Test.fFld -= i2;
                    fArr1 = fArr1;
                    Test.fFld -= (float)d2;
                } while (++d2 < 1);
            }
        }
        vMeth_check_sum += i2 + (b ? 1 : 0) + i17 + i18 + i19 + i20 + i21 + Double.doubleToLongBits(d2) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public void mainTest(String[] strArr1) {

        int i=-13, i1=35351, i22=7, i23=-57, i24=4;
        double d3=-1.81602;
        short s1=15070;

        for (i = 2; i < 190; ++i) {
            i1 += i;
            vMeth(Test.iFld, bFld);
            for (i22 = 6; i22 < 133; i22++) {
                d3 *= d3;
                i24 = 1;
                while (++i24 < 2) {
                    Test.iFld = (int)Test.instanceCount;
                    i1 = Test.iFld;
                    Test.instanceCount -= Test.instanceCount;
                    Test.iFld -= s1;
                    switch (i % 1) {
                    case 0:
                        Test.iArrFld[i - 1] += (int)Test.instanceCount;
                        switch ((((23701 >>> 1) % 7) * 5) + 112) {
                        case 136:
                            i23 >>= s1;
                            Test.iFld >>>= i1;
                            i1 += (int)Test.instanceCount;
                            Test.iFld += (i24 * i24);
                        case 116:
                            switch (((i22 % 8) * 5) + 4) {
                            case 9:
                                Test.instanceCount += i24;
                                Test.instanceCount *= i22;
                                break;
                            case 34:
                                Test.iFld = (int)Test.instanceCount;
                            case 12:
                                Test.instanceCount <<= i1;
                                break;
                            case 18:
                                lArrFld[i24 + 1] = i22;
                                break;
                            case 27:
                                Test.fFld = Test.iFld;
                                Test.instanceCount -= (long)d3;
                                break;
                            case 30:
                                d3 += Test.iFld;
                                break;
                            case 33:
                                Test.iFld = i24;
                                break;
                            case 35:
                                Test.fFld = (float)121.32925;
                                break;
                            default:
                                Test.iFld = (int)Test.instanceCount;
                                if (bFld) break;
                            }
                        case 121:
                            Test.iArrFld[i24] = Test.iFld;
                            break;
                        case 128:
                            i1 += (((i24 * i23) + i24) - i24);
                            break;
                        case 134:
                            i1 += (((i24 * Test.instanceCount) + Test.instanceCount) - i22);
                            break;
                        case 118:
                            i1 += (i24 - i22);
                            break;
                        case 142:
                            Test.iFld += (i24 ^ i1);
                            break;
                        }
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  sMeth ->  sMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
