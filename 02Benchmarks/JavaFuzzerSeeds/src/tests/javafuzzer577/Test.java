package tests.javafuzzer577;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 06:13:38 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3497581087L;
    public static long lFld=227L;
    public static volatile boolean bFld=true;
    public static double dFld=-2.762;
    public static float fFld=0.328F;
    public static int iFld=9;
    public static float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, -37.1003F);
        FuzzerUtils.init(Test.iArrFld, 10011);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(double d1) {

        int i1=115, i2=-2, i3=-52397, i4=14606, i5=-26845, i6=-16127, i7=-14722;
        float f=-2.270F;
        short s=-22875;
        byte byArr[]=new byte[N];
        long lArr[]=new long[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(byArr, (byte)-78);
        FuzzerUtils.init(lArr, 55493L);
        FuzzerUtils.init(dArr, 0.122903);

        for (i1 = 12; i1 < 231; i1++) {
            i2 += (((i1 * Test.instanceCount) + i1) - i1);
            byArr[i1 + 1] = (byte)i1;
            f += (((i1 * i2) + f) - f);
            for (i3 = 1; i3 < 7; ++i3) {
                Test.lFld = 15679;
            }
            i5 = 1;
            while (++i5 < 7) {
                i4 += (i5 - f);
                f -= Test.instanceCount;
                lArr[i1 + 1] = i4;
                switch ((i1 % 9) + 80) {
                case 80:
                    dArr[i5] += i1;
                case 81:
                    for (i6 = i1; 1 > i6; ++i6) {
                        i2 += i6;
                        i7 += s;
                    }
                    break;
                case 82:
                    i4 = i3;
                case 83:
                    i7 += (int)f;
                    break;
                case 84:
                    i4 = i3;
                    break;
                case 85:
                    i4 = i6;
                case 86:
                    i4 += (int)Test.lFld;
                    break;
                case 87:
                    d1 -= i7;
                case 88:
                    i4 += i3;
                default:
                    Test.instanceCount -= i2;
                }
            }
        }
        vMeth1_check_sum += Double.doubleToLongBits(d1) + i1 + i2 + Float.floatToIntBits(f) + i3 + i4 + i5 + i6 + i7 +
            s + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static int iMeth(boolean b, double d, long l) {

        int i8=207, i9=22588, i10=-1, i11=52903, i12=-56408, i13=-105, i14=-7, i15=2, iArr[]=new int[N];
        short s1=21864;
        float f1=-71.935F;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr, -4);
        FuzzerUtils.init(lArr1, 3076467560L);

        vMeth1(1.53234);
        for (i8 = 7; i8 < 164; i8++) {
            iArr[i8] = s1;
            l += i9;
            Test.instanceCount = i9;
            i9 -= (int)l;
            for (i10 = 1; i10 < 10; i10 += 3) {
                f1 += (((i10 * i8) + i10) - f1);
                Test.fArrFld[i10 - 1] -= i11;
                i11 <<= i8;
            }
            for (i12 = 10; i8 < i12; i12 -= 3) {
                for (i14 = i12; i14 < 1; ++i14) {
                    i13 = (int)f1;
                    lArr1[i12 + 1] = i12;
                    Test.lFld += i14;
                }
            }
        }
        long meth_res = (b ? 1 : 0) + Double.doubleToLongBits(d) + l + i8 + i9 + s1 + i10 + i11 +
            Float.floatToIntBits(f1) + i12 + i13 + i14 + i15 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i) {

        int i16=61033, i17=46459, i18=26, i19=-55842, i20=44703, iArr1[][]=new int[N][N];
        byte byArr1[]=new byte[N];

        FuzzerUtils.init(iArr1, 6);
        FuzzerUtils.init(byArr1, (byte)-44);

        i -= iMeth(Test.bFld, Test.dFld, Test.instanceCount);
        iArr1[(i >>> 1) % N][(i16 >>> 1) % N] -= i;
        for (i17 = 4; i17 < 381; i17 += 3) {
            switch ((i17 % 3) + 123) {
            case 123:
                i18 -= (int)-2.64F;
                iArr1[i17 - 1][i17] %= (int)(Test.lFld | 1);
                Test.fFld += (65944180992874885L + (i17 * i17));
                i16 -= 10;
                break;
            case 124:
                if (Test.bFld) break;
                i = i;
                Test.instanceCount >>= Test.lFld;
                for (i19 = 1; i19 < 13; ++i19) {
                    Test.instanceCount += 26;
                    i -= (int)Test.lFld;
                    byArr1[i17 - 1] += (byte)i19;
                }
            case 125:
                i16 = i17;
                break;
            }
        }
        vMeth_check_sum += i + i16 + i17 + i18 + i19 + i20 + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(byArr1);
    }

    public void mainTest(String[] strArr1) {

        int i21=6, i22=19, i23=27372, i24=-250, i26=4916, i27=13, i28=4, i29=13;
        short s2=-32389;
        long l1=-138L, l2=-6L;

        vMeth(Test.iFld);
        for (i21 = 148; i21 > 7; i21 -= 2) {
            int i25=-52794;
            i22 += (i21 * i21);
            Test.fFld *= -5.750F;
            switch ((i21 % 9) + 79) {
            case 79:
            case 80:
                for (i23 = 21; i23 < 358; i23++) {
                    if (Test.bFld) continue;
                }
                i25 *= Test.iFld;
                break;
            case 81:
                i25 += i21;
            case 82:
                Test.iArrFld[i21 - 1] = s2;
                break;
            case 83:
                for (l1 = i21; l1 < 358; ++l1) {
                    i22 += -14;
                    Test.fFld = Test.instanceCount;
                    Test.iFld = 24;
                    Test.lFld = i23;
                    for (i27 = 1; i27 < 1; ++i27) {
                        Test.iArrFld[(int)(l1 - 1)] >>= -3;
                        Test.iArrFld[i21 + 1] -= (int)Test.dFld;
                    }
                }
            case 84:
                s2 += (short)(((i21 * s2) + l1) - i28);
                i24 += (((i21 * l1) + i21) - i24);
                break;
            case 85:
                if (Test.bFld) {
                    Test.lFld += (i21 | i27);
                    Test.dFld += i26;
                } else if (Test.bFld) {
                    Test.instanceCount -= (long)67.48646;
                    Test.fFld = 12;
                    Test.lFld -= i22;
                }
                break;
            case 86:
                i26 = -11;
                for (l2 = 12; 358 > l2; ++l2) {
                    Test.instanceCount = i28;
                    Test.iArrFld[i21 - 1] = (int)l2;
                }
                break;
            case 87:
                s2 += (short)(((i21 * i23) + i23) - i21);
                break;
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
