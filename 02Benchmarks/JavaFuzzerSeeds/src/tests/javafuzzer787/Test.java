package tests.javafuzzer787;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 09:50:34 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=12L;
    public static float fFld=2.900F;
    public static short sFld=-11753;
    public static int iFld=4;
    public static boolean bFld=false;
    public static double dFld=2.96033;
    public int iArrFld[]=new int[N];

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        double d1=84.42994;
        int i12=125, i13=14, i14=6, i15=-10, i16=-8, iArr1[]=new int[N];
        byte by3=113;

        FuzzerUtils.init(iArr1, 14);

        try {
            iArr1[(Test.iFld >>> 1) % N] *= Test.iFld;
            Test.instanceCount >>= Test.instanceCount;
            d1 += Test.iFld;
            i12 = 1;
            do {
                Test.iFld += (i12 - Test.fFld);
                Test.fFld -= -72;
                Test.iFld *= (int)d1;
                for (i13 = 1; i13 < 6; i13++) {
                    byte by2=-86;
                    by2 <<= (byte)i14;
                    Test.fFld *= i12;
                }
            } while (++i12 < 268);
            i14 |= by3;
        }
        catch (UserDefinedExceptionTest exc1) {
            for (i15 = 16; i15 < 387; i15++) {
                if (true) continue;
                if (Test.bFld) break;
            }
        }
        finally {
            i16 = (int)d1;
        }
        vMeth_check_sum += Double.doubleToLongBits(d1) + i12 + i13 + i14 + by3 + i15 + i16 +
            FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth1(int i9, long l1) {

        int i10=20318, i11=-60, i17=51656, i18=55, iArr2[][]=new int[N][N];
        float fArr[][]=new float[N][N];
        double dArr[]=new double[N];

        FuzzerUtils.init(fArr, -31.1010F);
        FuzzerUtils.init(dArr, 2.5661);
        FuzzerUtils.init(iArr2, 13);

        if (Test.bFld) {
            Test.instanceCount += (long)fArr[(178 >>> 1) % N][(i9 >>> 1) % N];
            for (i10 = 10; i10 < 172; i10 += 3) {
                vMeth();
                for (i17 = 1; i17 < 28; i17++) {
                    switch (((i17 % 6) * 5) + 8) {
                    case 13:
                        Test.fFld += (i17 * i17);
                        switch ((i10 % 9) + 96) {
                        case 96:
                            dArr[i17] += i9;
                            iArr2[i10 + 1] = iArr2[i10 + 1];
                        case 97:
                            i9 >>= i10;
                            Test.iFld -= i11;
                            Test.instanceCount <<= i17;
                        case 98:
                            Test.iFld -= i10;
                            break;
                        case 99:
                            i9 *= (int)Test.dFld;
                            break;
                        case 100:
                            iArr2[i10][i10] -= (int)Test.instanceCount;
                            break;
                        case 101:
                            i18 -= i11;
                            break;
                        case 102:
                            try {
                                Test.iFld = (iArr2[i17 - 1][i10 - 1] / iArr2[i17][i10 + 1]);
                                iArr2[i10 + 1][i17 - 1] = (i18 % i17);
                                iArr2[i10 - 1][i10] = (236 % i9);
                            } catch (ArithmeticException a_e) {}
                            break;
                        case 103:
                            i18 += (i17 * i17);
                        case 104:
                            Test.iFld += (int)l1;
                        }
                    case 26:
                        Test.fFld += (i17 * i9);
                    case 9:
                        l1 = l1;
                    case 24:
                        i9 = i9;
                        break;
                    case 31:
                        Test.fFld = i11;
                    case 19:
                        Test.instanceCount = i17;
                        break;
                    }
                }
            }
        } else if (Test.bFld) {
            iArr2[(i11 >>> 1) % N][(i18 >>> 1) % N] = -11394;
        } else if (false) {
            Test.fFld -= i18;
        } else {
            Test.instanceCount = 84;
        }
        long meth_res = i9 + l1 + i10 + i11 + i17 + i18 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr2);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth(double d, int i5) {

        byte by1=39;
        int i6=-168, i7=-10, i8=36;
        long l=19L, lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -9L);

        Test.instanceCount += ((i5 + (Test.instanceCount - by1)) - (++iArrFld[(i5 >>> 1) % N]));
        for (i6 = 19; 356 > i6; ++i6) {
            Test.instanceCount += (i6 - i7);
            switch ((i6 % 1) + 97) {
            case 97:
                i7 = (int)(Test.instanceCount >>> ((i7 - -57266) - (i7 - i6)));
                i5 += (int)(Test.fFld - (lArr1[i6]++));
                i8 = 1;
                while (++i8 < 5) {
                    i7 >>= (int)((Test.fFld + (Test.instanceCount + Test.instanceCount)) - (++iArrFld[i6]));
                    d = (-(i5 ^= (int)(Test.sFld + -6072L)));
                    l = 1;
                    while (++l < 1) {
                        i5 = (int)(Test.fFld - iMeth1(i8, Test.instanceCount));
                        Test.instanceCount -= i7;
                        Test.iFld -= i5;
                        i7 += (int)(((l * i5) + Test.instanceCount) - i7);
                        iArrFld[i8 + 1] -= i7;
                    }
                }
                break;
            default:
                i7 += i6;
            }
        }
        long meth_res = Double.doubleToLongBits(d) + i5 + by1 + i6 + i7 + i8 + l + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f=1.663F;
        int i=-10413, i1=-58, i2=12, i3=24854, i4=-13, i19=9, i20=63405, iArr[]=new int[N];
        byte by=-96;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, 2679L);
        FuzzerUtils.init(iArr, -46491);

        for (f = 7; f < 210; f++) {
            i *= (--i);
            i = (int)f;
            lArr[(int)(f)][(int)(f + 1)] -= (iArr[(int)(f - 1)] = Math.max(Math.max(i, -17712), i - i));
        }
        i = (++i);
        for (i1 = 6; i1 < 183; ++i1) {
            Test.fFld = ((Integer.reverseBytes(20) * (i1 * i2)) - ((Test.instanceCount + by) * i1));
            i2 = i;
            lArr[i1 + 1] = (lArr[i1] = (lArr[i1] = lArr[i1 + 1]));
            for (i3 = i1; i3 < 142; i3++) {
                lArr[i3][i3 - 1] += i1;
                i4 += Integer.reverseBytes(Math.max(++i2, iMeth(91.129214, i2)));
                Test.iFld >>= 46;
                lArr[i3 - 1][i1 + 1] = Test.instanceCount;
                i2 = (int)Test.instanceCount;
            }
            i2 += i4;
            for (i19 = 4; i19 < 142; i19++) {
                iArrFld[i1] -= i19;
                Test.instanceCount = i1;
                Test.fFld -= 17572;
                Test.bFld = Test.bFld;
            }
            i += i1;
            switch ((i1 % 2) + 40) {
            case 40:
                i4 += (((i1 * i20) + i19) - i3);
                i4 += Test.iFld;
                i20 = i3;
                break;
            case 41:
                try {
                    iArr[i1] = (i1 % -886366320);
                    i20 = (-158 / i1);
                    i2 = (167 % iArrFld[i1 + 1]);
                } catch (ArithmeticException a_e) {}
                break;
            }
            Test.iFld += -16428;
        }
        i4 >>= (int)Test.instanceCount;
        i4 += (int)Test.instanceCount;



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
class UserDefinedExceptionTest extends RuntimeException {
    public int field;
}

//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
