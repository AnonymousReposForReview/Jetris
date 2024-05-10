package tests.javafuzzer3131;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 02:27:51 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-154L;
    public int iFld=-42;
    public static boolean bFld=true;
    public static long lFld=-214L;
    public static short sFld=30220;
    public static byte byFld=104;
    public volatile float fFld=-53.833F;
    public static boolean bArrFld[]=new boolean[N];
    public long lArrFld[]=new long[N];
    public static int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.bArrFld, true);
        FuzzerUtils.init(Test.iArrFld, 56);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static int iMeth(int i1, boolean b) {


        i1 = i1;
        long meth_res = i1 + (b ? 1 : 0);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth2() {

        short s=18056;
        int i7=0, i8=-216, i9=-14, i10=-99, i11=42, i12=-9, i13=-9, i14=-4082, i15=-73, i16=14747, iArr[]=new int[N];
        byte by=-93;
        float f1=-1.53F;

        FuzzerUtils.init(iArr, 0);

        s <<= (short)Test.instanceCount;
        for (i7 = 5; i7 < 195; i7++) {
            i8 -= i8;
            for (i9 = 1; i9 < 8; ++i9) {
                by -= (byte)i10;
                iArr[i9 - 1] = i9;
                i11 += i8;
                i12 += (int)Test.instanceCount;
            }
            for (i13 = 1; i13 < 8; i13++) {
                for (i15 = 1; i15 < 2; i15++) {
                    try {
                        iArr[i7 - 1] = (i12 % 12);
                        iArr[i15 + 1] = (i16 % i14);
                        i10 = (i9 / i8);
                    } catch (ArithmeticException a_e) {}
                    f1 += i14;
                }
                i12 *= 11;
            }
            i11 -= (int)Test.instanceCount;
            i14 -= i16;
        }
        vMeth2_check_sum += s + i7 + i8 + i9 + i10 + by + i11 + i12 + i13 + i14 + i15 + i16 + Float.floatToIntBits(f1)
            + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(float f, int i2) {

        int i3=-11, i4=20, i5=-5, i6=54089, i17=39409, i18=102;
        double d2=98.87010, d3=113.4180, dArr[]=new double[N];

        FuzzerUtils.init(dArr, 1.22470);

        for (i3 = 2; i3 < 163; i3++) {
            i5 = 1;
            while (++i5 < 10) {
                if (Test.bFld) continue;
                for (d2 = i5; d2 < 1; ++d2) {
                    d3 -= i2;
                    i4 |= i4;
                    dArr[i3] *= -5;
                    vMeth2();
                }
                Test.instanceCount += Test.instanceCount;
                for (i17 = 1; i17 < 1; i17++) {
                    f += i18;
                    Test.lFld += Test.lFld;
                    i4 += (int)(-2478L + (i17 * i17));
                    i2 += i5;
                    i18 -= i3;
                }
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + i2 + i3 + i4 + i5 + Double.doubleToLongBits(d2) + i6 +
            Double.doubleToLongBits(d3) + i17 + i18 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void vMeth(long l) {

        double d1=64.110950;
        float f2=-1.45F;
        int i19=12, i20=6, i21=7, i22=11, iArr1[]=new int[N];
        byte by1=-60;

        FuzzerUtils.init(iArr1, 3);

        d1 /= (iMeth((int)(iFld = (int)(l + iFld)), (iFld < iFld) && (5 <= (iFld * -11.633F))) | 1);
        iFld = (int)(lArrFld[(iFld >>> 1) % N] - iFld);
        vMeth1(f2, iFld);
        iFld >>= -5;
        for (i19 = 10; i19 < 360; ++i19) {
            iArr1[i19] += (int)l;
            for (i21 = 1; i21 < 5; ++i21) {
                by1 += (byte)(((i21 * i22) + iFld) - Test.lFld);
                i22 *= i19;
                i22 &= Test.sFld;
                f2 += i20;
                d1 *= -171;
                if (Test.bFld) break;
                Test.iArrFld[i21][i19] *= (int)-2.339F;
                i22 = i22;
            }
        }
        vMeth_check_sum += l + Double.doubleToLongBits(d1) + Float.floatToIntBits(f2) + i19 + i20 + i21 + i22 + by1 +
            FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=33359, i23=50297, i24=242, i25=5889, i26=23154, i27=179, i28=89, i29=-27101, i30=-13;
        double d=9.29691;
        float f3=-2.839F, fArr[]=new float[N];

        FuzzerUtils.init(fArr, 0.351F);

        Test.instanceCount -= Math.min((int)((iFld + iFld) - (Test.instanceCount ^ iFld)), ++iFld);
        i = 1;
        do {
            d *= iMeth((i * iFld) - iFld, Test.bArrFld[i] = Test.bFld);
            iFld = (int)(~(lArrFld[i - 1]++));
            vMeth(Test.lFld);
            iFld >>= iFld;
            f3 = 1;
            do {
                Test.lFld += (long)f3;
                iFld += (int)(((f3 * iFld) + i) - i);
                iFld += (int)(28L + (f3 * f3));
            } while (++f3 < 173);
            iFld += i;
            iFld += iFld;
            Test.iArrFld[i][i + 1] = i;
            Test.bFld = false;
            Test.iArrFld[i][i] += (int)Test.lFld;
        } while (++i < 145);
        for (i23 = 12; i23 < 251; i23++) {
            for (i25 = 1; 105 > i25; i25++) {
                i26 += (i25 * i25);
                i24 /= (int)((long)(f3) | 1);
            }
            for (i27 = 3; i27 < 105; i27++) {
                i26 += i27;
                Test.lFld = i26;
                for (i29 = 2; i29 > 1; --i29) {
                    i26 = 6;
                    lArrFld[i27] += i25;
                }
                Test.iArrFld[i23 - 1][i23 + 1] -= i28;
                fArr[i27] = i28;
                Test.byFld = (byte)-32061;
                i26 <<= iFld;
            }
        }
        fFld = i30;


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
//DEBUG  iMeth ->  iMeth mainTest vMeth
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}