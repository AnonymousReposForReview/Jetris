package tests.javafuzzer3007;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 00:45:01 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1240177521L;
    public double dFld=13.97890;
    public static int iFld=24;
    public static volatile double dFld1=9.67822;
    public static int iFld1=6149;
    public static volatile float fFld=8.945F;
    public static long lArrFld[]=new long[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 62840L);
        FuzzerUtils.init(Test.fArrFld, -2.594F);
    }

    public static long bMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i8) {

        int i9=3098;

        Test.iFld *= i8;
        i9 = 1;
        do {
            Test.dFld1 += Test.instanceCount;
            i8 <<= i8;
            i8 = i8;
            Test.instanceCount = (long)-9.72147;
        } while (++i9 < 161);
        Test.iFld = 63778;
        long meth_res = i8 + i9;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i5, int i6) {

        int i7=-150;

        i7 = 345;
        do {
            i6 -= iMeth(Test.iFld);
            Test.lArrFld[i7] ^= Test.instanceCount;
            Test.instanceCount *= -791525957L;
        } while ((i7 -= 3) > 0);
        vMeth_check_sum += i5 + i6 + i7;
    }

    public static boolean bMeth() {

        float f=93.823F;
        int i10=243, i11=-45, i12=-13, i13=40313, i14=-63713, i15=100, iArr1[]=new int[N];
        short s=28654;
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr1, 11);
        FuzzerUtils.init(dArr, 1.41476);

        switch ((((((int)(f + f)) >>> 1) % 9) * 5) + 72) {
        case 110:
            Test.iFld <<= (int)Test.instanceCount;
            break;
        case 86:
            Test.iFld = ((Test.iFld++) * iArr1[(Test.iFld >>> 1) % N]);
            break;
        case 78:
            vMeth(i10, Test.iFld);
        case 106:
            Test.dFld1 = i10;
            break;
        case 112:
        case 105:
            dArr[(-14 >>> 1) % N] /= (i10 | 1);
            i10 <<= Test.iFld1;
            for (i11 = 4; 169 > i11; i11++) {
                f += (i11 - i12);
                for (i13 = 1; 10 > i13; ++i13) {
                    iArr1[i13] = i11;
                    s += (short)i13;
                    i15 = 1;
                    do {
                        iArr1[i15 - 1] -= i11;
                        if (i13 != 0) {
                            return ((int)(Float.floatToIntBits(f) + i10 + i11 + i12 + i13 + i14 + s + i15 +
                                FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)))) % 2
                                > 0;
                        }
                    } while (++i15 < 2);
                }
            }
            break;
        case 84:
            i10 -= i15;
            break;
        case 98:
            Test.fArrFld[(Test.iFld >>> 1) % N] -= i15;
            break;
        case 73:
            iArr1[(i14 >>> 1) % N] += 36980;
            break;
        }
        long meth_res = Float.floatToIntBits(f) + i10 + i11 + i12 + i13 + i14 + s + i15 + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void mainTest(String[] strArr1) {

        int i=-70, i1=10, i2=34434, i3=69, i4=-17055, i16=26810, iArr[]=new int[N];
        byte by=124;
        boolean b=true;

        FuzzerUtils.init(iArr, -12);

        for (i = 9; 168 > i; ++i) {
            if (false) {
                for (i2 = 8; i2 < 158; i2++) {
                    iArr[i] -= (int)(dFld++);
                    i4 = 1;
                    do {
                        if (bMeth()) break;
                        i3 += i2;
                        Test.instanceCount >>= i4;
                        switch (((i4 % 6) * 5) + 116) {
                        case 144:
                            Test.instanceCount = i1;
                        case 131:
                            i1 += (i4 * i4);
                            Test.iFld1 *= (int)Test.instanceCount;
                            Test.iFld = i;
                        case 141:
                            Test.instanceCount = i3;
                            switch (((i4 % 5) * 5) + 98) {
                            case 108:
                                switch ((i4 % 2) + 53) {
                                case 53:
                                    Test.fFld *= -6;
                                    Test.instanceCount -= i3;
                                case 54:
                                    Test.iFld = (int)Test.instanceCount;
                                    break;
                                default:
                                    iArr[i2 - 1] <<= i1;
                                    Test.fFld *= Test.instanceCount;
                                    Test.fFld = by;
                                }
                                break;
                            case 104:
                                Test.iFld *= -55489;
                            case 116:
                                Test.iFld1 = (int)Test.instanceCount;
                                Test.instanceCount *= Test.instanceCount;
                                try {
                                    iArr[i + 1] = (i3 % -89);
                                    i1 = (Test.iFld % 35170);
                                    Test.iFld = (iArr[i4 - 1] / 1032318642);
                                } catch (ArithmeticException a_e) {}
                                i1 ^= i1;
                                break;
                            case 121:
                                if (b) {
                                    Test.iFld <<= i3;
                                } else {
                                    i16 += (int)-4203399945044953548L;
                                }
                            case 99:
                                try {
                                    i16 = (200 % i1);
                                    Test.iFld = (19 / i1);
                                    Test.iFld1 = (i % i1);
                                } catch (ArithmeticException a_e) {}
                                break;
                            }
                            break;
                        case 145:
                            iArr[i4 - 1] = by;
                        case 125:
                            i3 += i4;
                            break;
                        case 129:
                            iArr[i2] *= i16;
                        default:
                            Test.instanceCount -= i2;
                        }
                    } while ((i4 += 3) < 2);
                }
            } else {
                i3 += i4;
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
//DEBUG  bMeth ->  bMeth mainTest
//DEBUG  vMeth ->  vMeth bMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth bMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
