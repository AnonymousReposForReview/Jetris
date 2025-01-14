package tests.javafuzzer1595;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 23:32:08 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=16L;
    public static boolean bFld=false;
    public static byte byFld=21;
    public static float fFld=0.593F;
    public static volatile int iFld=-11;
    public short sFld=11256;
    public long lArrFld[][]=new long[N][N];
    public static long lArrFld1[][]=new long[N][N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.lArrFld1, 94L);
        FuzzerUtils.init(Test.fArrFld, -1.429F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth() {

        int i5=30406, i6=18455, i7=-3, i8=-125, i9=-12225;
        short s=31183;

        for (i5 = 11; 396 > i5; ++i5) {
            i7 = 1;
            while (++i7 < 4) {
                if (Test.bFld) {
                    i6 -= i6;
                    i6 = 0;
                } else {
                    s = (short)i6;
                    for (i8 = 1; i8 < 1; i8++) {
                        i6 = i5;
                        Test.lArrFld1[i7 + 1] = Test.lArrFld1[i7];
                        i9 += (i8 + Test.byFld);
                        i6 += (i8 + i9);
                        i6 += i9;
                        Test.instanceCount *= i5;
                        s -= (short)Test.fFld;
                        i9 = -60210;
                    }
                }
            }
        }
        long meth_res = i5 + i6 + i7 + s + i8 + i9;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth1(boolean b, int i3, long l) {

        int i4=-184, i10=-109, i11=54406, i12=21, i13=-47082, iArr[]=new int[N];
        byte by=-40;

        FuzzerUtils.init(iArr, -18007);

        i4 = 200;
        do {
            double d1=50.36102;
            i3 += (i4 + i3);
            by *= (byte)(7128 * (fMeth() + d1));
            switch ((i4 % 6) + 88) {
            case 88:
                for (i10 = 1; i10 < 8; i10++) {
                    for (i12 = 1; i12 < 2; i12++) {
                        Test.fFld -= i4;
                        i3 -= (int)-1121745917L;
                        i11 = by;
                        i3 = (int)-13121L;
                        i3 = (int)Test.instanceCount;
                        i13 += i12;
                    }
                    iArr = FuzzerUtils.int1array(N, (int)-20982);
                    i11 += (i10 ^ i3);
                    Test.fFld -= (float)-57.15025;
                }
                break;
            case 89:
                Test.lArrFld1[i4 + 1][i4 - 1] |= i11;
            case 90:
                Test.lArrFld1[i4 + 1][i4 - 1] = l;
            case 91:
                i3 >>>= (int)l;
                break;
            case 92:
                i3 += (int)l;
            case 93:
                i3 -= (int)Test.fFld;
            default:
                d1 += i12;
            }
        } while (--i4 > 0);
        vMeth1_check_sum += (b ? 1 : 0) + i3 + l + i4 + by + i10 + i11 + i12 + i13 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(double d, int i1, int i2) {

        int i14=5382, i15=-5, i16=-45354, i17=-3, i18=-59, iArr1[]=new int[N];
        double dArr[][]=new double[N][N];

        FuzzerUtils.init(dArr, 0.120613);
        FuzzerUtils.init(iArr1, 11);

        vMeth1(true, -56064, Test.instanceCount);
        i14 = 1;
        while ((i14 += 3) < 147) {
            Test.instanceCount = -6;
            for (i15 = 1; i15 < 31; ++i15) {
                dArr[i14][i14 - 1] += i14;
                Test.fArrFld[i15 + 1] = Test.fFld;
                for (i17 = 2; i17 > 1; i17--) {
                    if (Test.bFld) continue;
                    Test.instanceCount += 64119;
                    i18 /= (int)(i16 | 1);
                }
                i2 += -8076;
                try {
                    i16 = (i17 % -37);
                    iArr1[i14] = (i1 / Test.iFld);
                    iArr1[i14 + 1] = (i16 % i17);
                } catch (ArithmeticException a_e) {}
            }
            Test.fFld *= Test.iFld;
            i2 += Test.iFld;
            Test.fFld += ((long)i14 | (long)Test.fFld);
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i1 + i2 + i14 + i15 + i16 + i17 + i18 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=-38, i19=2040, i20=4, i21=-1, i22=106, i23=-4, i25=20892, i26=11, i27=54099, iArr2[]=new int[N],
            iArr3[]=new int[N], iArr4[][]=new int[N][N];
        double d2=1.90298, d3=119.2158, d4=2.46983;
        long l1=-10L;
        byte by1=75;

        FuzzerUtils.init(iArr2, -6);
        FuzzerUtils.init(iArr3, 60);
        FuzzerUtils.init(iArr4, 2076);

        Test.instanceCount = (-((i - -86) + (lArrFld[(i >>> 1) % N][(-1964 >>> 1) % N]++)));
        try {
            vMeth(d2, Test.iFld, Test.iFld);
            i *= Test.iFld;
            for (l1 = 7; l1 < 179; ++l1) {
                for (i20 = 9; i20 < 146; ++i20) {
                    Test.instanceCount = Test.instanceCount;
                    i19 *= Test.iFld;
                }
                Test.instanceCount -= i;
                try {
                    i = (-4038 / i);
                    i19 = (Test.iFld / 169);
                    i19 = (-2364 / i);
                } catch (ArithmeticException a_e) {}
                Test.byFld = (byte)i20;
                i = i20;
            }
            for (i22 = 2; i22 < 186; i22++) {
                i19 = Test.iFld;
                Test.fFld = Test.iFld;
                Test.instanceCount += (i22 - i23);
                for (i25 = i22; i25 < 136; ++i25) {
                    iArr3[i22] <<= (int)Test.instanceCount;
                    for (d3 = i22; d3 < 1; ++d3) {
                        by1 *= (byte)13;
                        lArrFld[i25][i22] -= Test.instanceCount;
                        Test.instanceCount -= 144;
                        Test.instanceCount -= (long)Test.fFld;
                        i23 -= (int)d4;
                        Test.iFld = (int)l1;
                        i23 >>= sFld;
                        iArr3[i22] = i26;
                        iArr4 = iArr4;
                        i += (-25680 + (d3 * d3));
                    }
                    i += (int)(-50658L + (i25 * i25));
                }
            }
        }
        catch (NullPointerException exc1) {
            Test.iFld += sFld;
        }
        finally {
            d2 = d4;
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
//DEBUG  fMeth ->  fMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
