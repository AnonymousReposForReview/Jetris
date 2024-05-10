package tests.javafuzzer2744;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 19:42:33 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=1003587919L;
    public int iFld=17117;
    public static byte byFld=-51;
    public static volatile short sFld=-26069;
    public static boolean bFld=false;
    public float fFld=-32.942F;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -6);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f1, int i8) {

        int i9=182, i10=145, i11=-133, i12=219, i13=1;
        boolean b=false;

        i9 = 1;
        while (++i9 < 172) {
            i8 = (int)Test.instanceCount;
            switch (((i9 % 2) * 5) + 66) {
            case 76:
                if (false) continue;
                if (b) continue;
                Test.iArrFld[i9] += 3;
                break;
            case 69:
                switch (((i9 % 7) * 5) + 70) {
                case 73:
                    for (i10 = 1; i10 < 9; ++i10) {
                        switch ((i10 % 8) + 69) {
                        case 69:
                            b = b;
                            for (i12 = 1; i12 < 2; i12++) {
                                i8 += i11;
                                Test.byFld += (byte)(i12 * i12);
                                i11 += i10;
                            }
                            Test.sFld += (short)(((i10 * Test.instanceCount) + i11) - i9);
                            break;
                        case 70:
                            Test.instanceCount = i12;
                            break;
                        case 71:
                            Test.iArrFld[i9] += (int)Test.instanceCount;
                            break;
                        case 72:
                            i11 <<= (int)Test.instanceCount;
                            break;
                        case 73:
                            f1 = Test.instanceCount;
                            break;
                        case 74:
                            i13 = i12;
                            break;
                        case 75:
                            Test.iArrFld[i10 + 1] -= i11;
                            break;
                        case 76:
                            i13 = (int)f1;
                        }
                    }
                    break;
                case 78:
                    i13 = i11;
                    break;
                case 92:
                    if (b) break;
                    break;
                case 83:
                    i13 >>= (int)Test.instanceCount;
                    break;
                case 97:
                    if (false) break;
                    break;
                case 85:
                    Test.sFld += (short)i9;
                    break;
                case 87:
                    i8 -= Test.sFld;
                    break;
                }
                break;
            default:
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f1) + i8 + i9 + (b ? 1 : 0) + i10 + i11 + i12 + i13;
    }

    public static int iMeth(int i6, int i7) {

        float f2=-40.441F;
        int i14=-2, i15=-10, i16=9;
        double d1=-124.38124;
        long l=-2839323466L, lArr[]=new long[N];

        FuzzerUtils.init(lArr, -6939L);

        i6 = (int)Test.instanceCount;
        vMeth1(f2, i7);
        for (i14 = 4; i14 < 234; i14++) {
            i6 += (i14 | Test.instanceCount);
            i15 = (int)d1;
            i7 = i14;
            lArr[i14] = i6;
            i6 += i14;
            l = 1;
            while (++l < 7) {
                i15 += 13;
                i16 = 1;
                do {
                    i6 += (i16 * i16);
                    i6 += i6;
                    d1 -= i6;
                    lArr = FuzzerUtils.long1array(N, (long)-7L);
                } while (++i16 < 1);
            }
        }
        long meth_res = i6 + i7 + Float.floatToIntBits(f2) + i14 + i15 + Double.doubleToLongBits(d1) + l + i16 +
            FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i1=54656, i2=-1713, i3=75, i4=1, i5=11;
        double d=0.103407;
        float f=-2.691F, f3=-36.249F, fArr[]=new float[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(fArr, -2.696F);
        FuzzerUtils.init(lArr1, 4320397854141336738L);

        i1 = 1;
        while (++i1 < 220) {
            d = Math.max(Test.instanceCount, (Test.instanceCount * i1) - (i2 /= (int)(i1 | 1)));
            for (f = 1; 7 > f; f++) {
                i3 += (int)f;
                for (i4 = (int)(f); i4 < 2; ++i4) {
                    Test.iArrFld = (Test.iArrFld = Test.iArrFld);
                    switch (((((i4 << i5) >>> 1) % 5) * 5) + 70) {
                    case 90:
                        fArr[(int)(f)] *= -2.326F;
                    case 82:
                        i3 += ((iMeth(i2, i2) * Test.byFld) - -48065);
                        i3 = i3;
                        Test.instanceCount -= i3;
                        break;
                    case 85:
                        f3 = -4;
                        break;
                    case 95:
                        if (false) {
                            i2 *= i2;
                        } else if (Test.bFld) {
                            lArr1[i1] += 20;
                        } else if (Test.bFld) {
                            i3 -= i1;
                            vMeth_check_sum += i1 + Double.doubleToLongBits(d) + i2 + Float.floatToIntBits(f) + i3 + i4
                                + i5 + Float.floatToIntBits(f3) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
                                FuzzerUtils.checkSum(lArr1);
                            return;
                        } else {
                            Test.iArrFld[i1] += (int)Test.instanceCount;
                        }
                        break;
                    case 81:
                    }
                }
            }
        }
        vMeth_check_sum += i1 + Double.doubleToLongBits(d) + i2 + Float.floatToIntBits(f) + i3 + i4 + i5 +
            Float.floatToIntBits(f3) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(lArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=-63660, i17=13, i18=16091, i19=3, i20=5;
        double d2=-1.123363;
        long lArr2[][]=new long[N][N];

        FuzzerUtils.init(lArr2, 3372611746L);

        iFld = (((iFld + iFld) - (-26546 * (iFld + -27670))) - (iFld * (iFld + iFld)));
        i = 224;
        while ((i -= 2) > 0) {
            if (Test.bFld) {
                iFld += i;
                vMeth();
            } else {
                iFld -= (int)8961069129714305802L;
                Test.instanceCount += Test.instanceCount;
                iFld >>= i;
                iFld = i;
            }
            iFld += iFld;
            Test.iArrFld = FuzzerUtils.int1array(N, (int)2);
            for (i17 = 224; i17 > i; --i17) {
                switch (((iFld >>> 1) % 7) + 17) {
                case 17:
                    iFld = (int)d2;
                    Test.instanceCount = i17;
                    break;
                case 18:
                    iFld = i;
                    Test.instanceCount += (((i17 * fFld) + i18) - iFld);
                case 19:
                    iFld ^= i18;
                    i18 += i17;
                    break;
                case 20:
                    Test.instanceCount -= i;
                    Test.instanceCount += i;
                    for (i19 = i; i19 < 1; ++i19) {
                        Test.sFld += (short)(i19 ^ i17);
                        i18 += i19;
                        switch (((iFld >>> 1) % 1) + 69) {
                        case 69:
                            i18 += (int)30055L;
                            break;
                        default:
                            lArr2[i + 1][i17 - 1] -= i;
                        }
                    }
                    break;
                case 21:
                    Test.iArrFld[i - 1] = i17;
                    iFld = Test.byFld;
                    break;
                case 22:
                    lArr2[i - 1][i17] = Test.sFld;
                    break;
                case 23:
                    iFld = (int)1.492F;
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}