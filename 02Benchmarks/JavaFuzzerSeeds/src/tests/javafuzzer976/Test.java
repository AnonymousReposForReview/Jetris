package tests.javafuzzer976;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 12:16:20 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-4L;
    public static int iFld=12;
    public static float fFld=2.366F;
    public byte byFld=-81;
    public static volatile float fArrFld[]=new float[N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, -1.1013F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i10=-4, i11=56, i12=-35, i13=-129, i14=-61365, i15=2, i16=-12169, i17=-4, i18=55, iArr[]=new int[N];
        boolean b=false;
        double d=-2.38723;
        long lArr1[][]=new long[N][N];

        FuzzerUtils.init(iArr, 11);
        FuzzerUtils.init(lArr1, 151L);

        iArr[(Test.iFld >>> 1) % N] >>= Test.iFld;
        for (i10 = 8; i10 < 247; ++i10) {
            i12 = 1;
            do {
                i11 += (i12 ^ i12);
                if (b) break;
            } while (++i12 < 7);
            lArr1[(Test.iFld >>> 1) % N][i10] += i10;
            Test.fArrFld[i10] -= i12;
        }
        for (i13 = 6; i13 < 356; i13++) {
            for (i15 = 1; i15 < 5; i15++) {
                Test.iFld += i15;
                Test.instanceCount -= i10;
                for (i17 = 1; 2 > i17; i17++) {
                    Test.iFld += (int)Test.instanceCount;
                    i16 += i17;
                    d += Test.fFld;
                }
            }
        }
        long meth_res = i10 + i11 + i12 + (b ? 1 : 0) + i13 + i14 + i15 + i16 + i17 + i18 + Double.doubleToLongBits(d)
            + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i, int i1) {

        int i2=-5, i3=-28791, i4=190, i5=3321, i6=-3980, i7=1, i8=-100, i9=553, iArr1[]=new int[N];
        byte by=101;
        short s=23701;
        boolean b1=false;
        float fArr[]=new float[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(fArr, -49.247F);
        FuzzerUtils.init(lArr, 35535L);
        FuzzerUtils.init(iArr1, -59316);

        for (i2 = 7; i2 < 264; i2++) {
            Test.instanceCount = (Math.abs(by % (i1 | 1)) - ((i1--) - i2));
            fArr[i2 + 1] *= lArr[i2 - 1];
        }
        for (i4 = 19; i4 < 362; ++i4) {
            double d1=-1.62948;
            Test.fFld = i5;
            switch ((i4 % 4) + 60) {
            case 60:
                s = (short)i3;
                for (i6 = 1; i6 < 5; i6++) {
                    i3 += (i6 * i6);
                    for (i8 = 1; i8 < 2; ++i8) {
                        if (i5 != 0) {
                            vMeth1_check_sum += i + i1 + i2 + i3 + by + i4 + i5 + s + i6 + i7 + i8 + i9 + (b1 ? 1 : 0)
                                + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr) +
                                FuzzerUtils.checkSum(iArr1);
                            return;
                        }
                        Test.iFld -= (iMeth() >>> -14596);
                        i7 = i1;
                        if (b1) continue;
                        try {
                            Test.iFld = (-38259 / i7);
                            i1 = (iArr1[i8 + 1] / i9);
                            i1 = (i1 / 18228);
                        } catch (ArithmeticException a_e) {}
                    }
                }
            case 61:
                Test.instanceCount >>= i8;
            case 62:
                iArr1[i4 - 1] += (int)Test.instanceCount;
                break;
            case 63:
                Test.instanceCount += (i4 * Test.fFld);
                break;
            default:
                d1 = i2;
            }
        }
        vMeth1_check_sum += i + i1 + i2 + i3 + by + i4 + i5 + s + i6 + i7 + i8 + i9 + (b1 ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth() {

        int i19=47307, i20=54143, i21=5, i22=20697, i23=14, i24=41247, i25=12, i26=4, iArr2[][]=new int[N][N];
        double d2=2.33167;
        short s1=-32082;
        long lArr2[]=new long[N];

        FuzzerUtils.init(iArr2, 29660);
        FuzzerUtils.init(lArr2, 28709L);

        vMeth1(Test.iFld, Test.iFld);
        Test.iFld -= i19;
        for (i20 = 16; i20 < 337; i20 += 2) {
            iArr2 = iArr2;
            Test.fArrFld[i20 + 1] = i20;
            lArr2[i20 + 1] += -24818;
            for (i22 = i20; 10 > i22; i22++) {
                Test.iFld >>= i23;
            }
            i23 += i20;
        }
        for (i24 = 5; i24 < 285; i24++) {
            i19 = i25;
            i26 = 6;
            do {
                d2 += Test.instanceCount;
                s1 = (short)Test.instanceCount;
            } while ((i26 -= 2) > 0);
        }
        Test.fFld = 10;
        vMeth_check_sum += i19 + i20 + i21 + i22 + i23 + i24 + i25 + i26 + Double.doubleToLongBits(d2) + s1 +
            FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(lArr2);
    }

    public void mainTest(String[] strArr1) {

        int i27=16, i28=-205, i29=-62, i30=5931, i31=-181, i32=-1, i33=110, i34=190, i35=-8, i36=37913;
        short s2=11309;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 2.54911);

        Test.instanceCount ^= Test.iFld;
        vMeth();
        Test.fArrFld[(Test.iFld >>> 1) % N] += Test.instanceCount;
        i27 = 1;
        do {
            Test.iFld += (i27 | Test.instanceCount);
            for (i28 = i27; i28 < 131; i28++) {
                Test.iFld += byFld;
            }
            i29 += i29;
            i30 = 1;
            do {
                i29 *= (int)Test.instanceCount;
                Test.iFld = Test.iFld;
                for (i31 = 1; i31 > 1; i31--) {
                    Test.fFld -= i31;
                    Test.instanceCount *= byFld;
                    Test.iFld = i28;
                }
                Test.fFld = byFld;
                i29 = i28;
            } while (++i30 < 131);
            dArr[i27 - 1] = i29;
            switch ((i27 % 7) + 111) {
            case 111:
                switch ((((i33 >>> 1) % 2) * 5) + 78) {
                case 83:
                    for (i34 = 4; 131 > i34; ++i34) {
                        Test.iFld = i32;
                        iArrFld = iArrFld;
                        i36 = 1;
                        while (++i36 < 2) {
                            if (true) continue;
                            i29 <<= Test.iFld;
                            Test.iFld = i35;
                            Test.instanceCount = byFld;
                            i29 = (int)Test.fFld;
                            Test.iFld = i35;
                        }
                    }
                    break;
                case 79:
                    i32 = i30;
                    break;
                default:
                    i32 = i34;
                }
                break;
            case 112:
                i35 = (int)-2L;
            case 113:
                i32 = i30;
            case 114:
                try {
                    i32 = (i33 % iArrFld[i27]);
                    i32 = (iArrFld[i27 + 1] / i32);
                    Test.iFld = (i33 / i35);
                } catch (ArithmeticException a_e) {}
            case 115:
                i32 *= i29;
                break;
            case 116:
                Test.fArrFld[i27] *= i30;
                break;
            case 117:
                i29 &= s2;
            default:
                i33 -= i31;
            }
        } while (++i27 < 191);

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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}