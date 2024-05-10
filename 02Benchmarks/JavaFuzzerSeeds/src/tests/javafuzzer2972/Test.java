package tests.javafuzzer2972;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 00:16:02 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=4692944083155958398L;
    public static volatile int iFld=-89;
    public static double dFld=-1.81086;
    public static float fFld=2.473F;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 52224);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(boolean b, float f) {

        long l=219L, lArr[]=new long[N];
        int i2=-184, i3=-140, i4=-1, i5=-1, i6=-9;
        float f1=-127.446F, fArr[]=new float[N];
        byte by=14;
        double dArr[][]=new double[N][N];

        FuzzerUtils.init(dArr, -116.107391);
        FuzzerUtils.init(fArr, 0.829F);
        FuzzerUtils.init(lArr, -2347998199L);

        l = 1;
        do {
            Test.instanceCount = 27291;
            dArr[(int)(l - 1)][(int)(l)] /= (Test.iFld | 1);
            Test.iFld *= Test.iFld;
            for (i2 = 6; i2 > 1; --i2) {
                Test.iFld += (((i2 * Test.iFld) + i2) - i3);
                for (f1 = 1; f1 < 2; ++f1) {
                    fArr = fArr;
                    i3 = (int)f;
                    by += (byte)((long)f1 ^ i4);
                    lArr[(int)(l + 1)] = i4;
                }
                for (i5 = 1; i5 < 2; i5++) {
                    i4 += (int)Test.dFld;
                    Test.dFld += i3;
                }
                i6 += (i2 - i5);
            }
        } while (++l < 280);
        vMeth1_check_sum += (b ? 1 : 0) + Float.floatToIntBits(f) + l + i2 + i3 + Float.floatToIntBits(f1) + i4 + by +
            i5 + i6 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr);
    }

    public static long lMeth() {

        boolean b1=false;
        float f2=1.700F, f3=92.838F;
        int i7=4, i8=-204, i9=-116, i10=-42757, i11=27932, i12=9;

        vMeth1(b1, f2);
        for (i7 = 220; i7 > 8; i7--) {
            switch ((i7 % 4) + 21) {
            case 21:
                Test.instanceCount <<= i7;
                try {
                    i8 = (150 % Test.iArrFld[i7]);
                    i8 = (i7 % Test.iFld);
                    Test.iArrFld[i7] = (i7 % -47742);
                } catch (ArithmeticException a_e) {}
                for (f3 = 1; f3 < 8; ++f3) {
                    f2 += (f3 * f3);
                }
            case 22:
                Test.instanceCount += (i7 * f3);
                Test.instanceCount += Test.instanceCount;
                break;
            case 23:
                if (b1) {
                    for (i10 = 1; i10 < 8; i10++) {
                        i12 = 2;
                        while ((i12 -= 2) > 0) {
                            Test.iArrFld[i7 - 1] *= 14457;
                            Test.instanceCount <<= -213;
                            i9 = (int)Test.dFld;
                        }
                    }
                } else if (b1) {
                    i9 += (118 + (i7 * i7));
                } else if (false) {
                    if (Test.iFld != 0) {
                    }
                }
            case 24:
                Test.iFld += i7;
                break;
            default:
                i8 = i8;
            }
        }
        long meth_res = (b1 ? 1 : 0) + Float.floatToIntBits(f2) + i7 + i8 + Float.floatToIntBits(f3) + i9 + i10 + i11 +
            i12;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth() {

        int i1=-3, i13=204, i14=19781, i15=45037, i16=-54446;
        double d1=42.8440, dArr1[][]=new double[N][N];

        FuzzerUtils.init(dArr1, -1.19775);

        Test.iArrFld[(i1 >>> 1) % N] += i1;
        Test.instanceCount = Math.min((long)((-21791 * Math.abs(d1)) - lMeth()), Test.instanceCount);
        for (i13 = 12; i13 < 234; ++i13) {
            Test.fFld = i14;
            i1 += (i13 * i13);
            Test.iFld += -10;
            Test.iFld = i14;
            Test.instanceCount >>= Test.iFld;
            i1 /= (int)(Test.instanceCount | 1);
            for (i15 = 1; i15 < 7; i15++) {
                dArr1[i15][i13 + 1] = i14;
                i14 -= Test.iFld;
                Test.instanceCount -= Test.instanceCount;
                Test.dFld += 18531;
                i1 = i15;
            }
        }
        vMeth_check_sum += i1 + Double.doubleToLongBits(d1) + i13 + i14 + i15 + i16 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
    }

    public void mainTest(String[] strArr1) {

        double d=2.98084;
        int i=-130, i17=77, i18=6;
        short s=25047;

        for (d = 1; d < 176; d++) {
            Test.iArrFld[(int)(d - 1)] |= i;
            vMeth();
        }
        i <<= (int)-2508739234L;
        for (i17 = 16; 261 > i17; i17 += 3) {
            Test.iFld &= i17;
            Test.fFld += (((i17 * Test.instanceCount) + i) - s);
            i += (i17 ^ i);
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
