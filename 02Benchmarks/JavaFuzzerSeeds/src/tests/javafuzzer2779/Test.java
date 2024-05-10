package tests.javafuzzer2779;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 19:57:49 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-148L;
    public static short sFld=11472;
    public static boolean bFld=true;
    public float fFld=-56.865F;
    public static volatile int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];
    public float fArrFld[][]=new float[N][N];
    public static volatile byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 28596);
        FuzzerUtils.init(Test.lArrFld, 5593215868253927244L);
        FuzzerUtils.init(Test.byArrFld, (byte)70);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i7) {

        double d3=92.7214;
        int i9=0, i10=-15392, i11=-7, i12=2;
        boolean b=false;

        for (int i8 : Test.iArrFld) {
            i7 *= i7;
            Test.lArrFld[(-128 >>> 1) % N] <<= 16836;
            i8 += (int)d3;
            for (i9 = 1; i9 < 4; ++i9) {
                for (i11 = 1; i11 < 2; i11++) {
                    i8 = i9;
                    i8 = i7;
                    Test.lArrFld = Test.lArrFld;
                    i10 -= i9;
                }
                i8 -= Test.sFld;
                b = false;
                Test.instanceCount = -3L;
                Test.lArrFld = Test.lArrFld;
                i10 += (((i9 * i9) + i8) - i12);
            }
        }
        vMeth1_check_sum += i7 + Double.doubleToLongBits(d3) + i9 + i10 + i11 + i12 + (b ? 1 : 0);
    }

    public static void vMeth(double d2, float f, int i4) {

        int i5=82, i6=10, i13=58228, i14=-55310;

        for (i5 = 3; 313 > i5; i5++) {
            if (Test.bFld) {
                vMeth1(i4);
                i6 &= i6;
                if (Test.bFld) continue;
                if (Test.bFld) {
                    Test.instanceCount += i5;
                    Test.iArrFld = Test.iArrFld;
                    f = 19665;
                    if (Test.bFld) break;
                } else {
                    Test.iArrFld[i5] += (int)Test.instanceCount;
                }
            } else {
                i4 += (i5 * i5);
                for (i13 = 5; i13 > i5; i13 -= 3) {
                    Test.iArrFld[i5 - 1] += i13;
                    Test.instanceCount += (((i13 * i14) + Test.instanceCount) - i6);
                }
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d2) + Float.floatToIntBits(f) + i4 + i5 + i6 + i13 + i14;
    }

    public long lMeth(int i1, long l, int i2) {

        double d=114.114665, d1=1.125407, dArr[]=new double[N];
        int i3=-108;
        long l1=-43730L, lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, 4L);
        FuzzerUtils.init(dArr, -110.1523);

        i2 ^= (int)lArr[(i2 >>> 1) % N][(i2 >>> 1) % N];
        for (d = 9; d < 220; d++) {
            d1 -= i2;
            vMeth(d1, fFld, -56128);
            i3 -= i3;
            switch ((int)(((d % 10) * 5) + 117)) {
            case 148:
                l1 = 1;
                do {
                    fFld += l1;
                    i2 = i3;
                    i3 += (int)fFld;
                    dArr = dArr;
                    i3 = i2;
                    Test.sFld *= (short)i1;
                    i2 %= (int)((long)(fFld) | 1);
                    fArrFld[(int)(d - 1)][(int)(l1)] = l;
                } while (++l1 < 8);
                break;
            case 166:
                i2 -= (int)-136L;
                break;
            case 126:
                i1 = (int)-2.184F;
                break;
            case 136:
                Test.instanceCount -= Test.instanceCount;
                break;
            case 122:
                Test.bFld = Test.bFld;
            case 129:
                d1 *= 140;
            case 144:
                i1 += (int)(d * l1);
                break;
            case 149:
                if (Test.bFld) break;
                break;
            case 134:
                fFld += i2;
                break;
            case 151:
                Test.sFld += (short)((long)d ^ i3);
                break;
            }
        }
        long meth_res = i1 + l + i2 + Double.doubleToLongBits(d) + i3 + Double.doubleToLongBits(d1) + l1 +
            FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-239, i15=-8, i16=153, i17=55454, i18=171, i19=148, i20=-59255, i21=-14, i22=9;
        float f1=0.8F;
        double d4=2.1046;

        i = -24;
        lMeth(i, Test.instanceCount, -242);
        for (i15 = 10; 266 > i15; ++i15) {
            i = -120;
            Test.sFld = (short)i;
            for (f1 = i15; f1 < 98; f1++) {
                fArrFld[i15 + 1][i15 + 1] = Test.sFld;
                for (i18 = 1; i18 < 1; i18++) {
                    Test.instanceCount = i16;
                    try {
                        i16 = (i15 / 435566558);
                        Test.iArrFld[(int)(f1)] = (28 / i17);
                        i19 = (i19 % 1925797732);
                    } catch (ArithmeticException a_e) {}
                    if (Test.bFld) {
                        i17 += i;
                        Test.instanceCount += i18;
                    } else if (Test.bFld) {
                        i17 -= i17;
                        i += i;
                        Test.instanceCount += i17;
                        Test.byArrFld[i18] = (byte)Test.instanceCount;
                    }
                    Test.instanceCount = 204L;
                    Test.instanceCount -= (long)d4;
                }
                i20 = 1;
                do {
                    Test.iArrFld[i20] = (int)f1;
                    d4 *= i19;
                    Test.instanceCount += -250;
                } while (++i20 < 1);
                d4 += i19;
                Test.iArrFld[(int)(f1)] = (int)Test.instanceCount;
                i17 -= 7836;
                i *= 7;
                for (i21 = 1; 1 > i21; ++i21) {
                    i19 = i16;
                    if (true) break;
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}