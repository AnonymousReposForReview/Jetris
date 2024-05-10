package tests.javafuzzer3125;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 02:22:18 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=1170005391L;
    public static short sFld=-10464;
    public byte byFld=40;
    public static double dFld=0.100339;
    public static boolean bFld=true;
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 0.853F);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i2, int i3) {

        int i4=-13, i5=152, i6=29764, i7=-54290, i8=-79, i9=34523, i10=9;
        float f1=-2.126F;

        for (i4 = 2; i4 < 286; i4 += 3) {
            i6 = 1;
            while (++i6 < 16) {
                i3 |= 46;
            }
            i5 += (((i4 * i6) + i6) - Test.sFld);
            Test.fArrFld[i4 + 1] = i7;
            i8 = 1;
            while (++i8 < 16) {
                i3 += (i8 * i8);
                Test.instanceCount = i7;
                for (i9 = 1; i9 < 1; ++i9) {
                    if (i10 != 0) {
                        vMeth1_check_sum += i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9 + i10 + Float.floatToIntBits(f1);
                        return;
                    }
                    if (true) break;
                    i2 -= (int)f1;
                    i5 <<= (int)Test.instanceCount;
                    if (i5 != 0) {
                        vMeth1_check_sum += i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9 + i10 + Float.floatToIntBits(f1);
                        return;
                    }
                    i10 &= i7;
                }
            }
        }
        vMeth1_check_sum += i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9 + i10 + Float.floatToIntBits(f1);
    }

    public static int iMeth(float f) {

        int i11=-11, i12=6, i13=5, i14=112, i15=-151;
        long l1=13L;
        float f2=-6.11F;

        vMeth1(i11, i11);
        i11 += i11;
        i11 -= (int)f;
        for (l1 = 18; l1 < 311; ++l1) {
            for (f2 = 1; f2 < 6; ++f2) {
                Test.instanceCount = i13;
                i11 -= (int)Test.instanceCount;
                i12 -= (int)38036L;
                Test.instanceCount = i11;
                i12 <<= i13;
                f %= (i13 | 1);
                i13 = (int)-1707451256L;
            }
            for (i14 = (int)(l1); i14 < 6; ++i14) {
                i11 <<= (int)l1;
            }
        }
        i13 += i13;
        long meth_res = Float.floatToIntBits(f) + i11 + l1 + i12 + Float.floatToIntBits(f2) + i13 + i14 + i15;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i, byte by, double d) {

        double d1=2.342, d2=1.26078;
        int i1=-6509, i16=44043, i17=3, i18=223, i19=-43, i20=-27964, iArr[]=new int[N];
        long l=-3L;

        FuzzerUtils.init(iArr, -42);

        for (d1 = 11; d1 < 248; ++d1) {
            l = ((59L + (5 ^ (--Test.instanceCount))) * iMeth(-112.600F));
            i1 = i1;
            l = i;
            i = (int)Test.instanceCount;
            for (d2 = 1; 7 > d2; ++d2) {
                i1 -= (int)l;
                iArr = iArr;
            }
            for (i17 = 1; i17 < 7; i17++) {
                i16 = i1;
            }
            for (i19 = 1; 7 > i19; i19 += 3) {
                i += (((i19 * i1) + i16) - i18);
                Test.instanceCount = i18;
                l += (i19 | i20);
                iArr = iArr;
            }
        }
        vMeth_check_sum += i + by + Double.doubleToLongBits(d) + Double.doubleToLongBits(d1) + i1 + l +
            Double.doubleToLongBits(d2) + i16 + i17 + i18 + i19 + i20 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i21=76, i22=-13, i23=35043, i24=-34269, i25=-16960, i26=7, i27=225, i28=11, i29=-35, i30=-6, i31=13,
            i32=-12, iArr1[]=new int[N];
        double d3=16.52109, dArr[]=new double[N];
        float f3=51.680F;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(iArr1, -6);
        FuzzerUtils.init(lArr, 14L);
        FuzzerUtils.init(dArr, -67.122574);

        vMeth(51439, byFld, Test.dFld);
        for (i21 = 17; i21 < 336; ++i21) {
            for (i23 = 79; i23 > 1; i23 -= 3) {
                i22 = byFld;
            }
            i24 = i22;
        }
        i22 = i24;
        for (i25 = 1; 235 > i25; i25++) {
            switch (((i23 >>> 1) % 2) + 118) {
            case 118:
                Test.instanceCount = i23;
                i26 = 43839;
                iArr1[i25] -= (int)Test.instanceCount;
                for (d3 = 4; d3 < 107; ++d3) {
                    Test.dFld += i21;
                    f3 -= Test.instanceCount;
                }
                break;
            case 119:
                i24 <<= (int)Test.instanceCount;
                Test.instanceCount *= Test.instanceCount;
                lArr[i25 + 1][i25 - 1] <<= i26;
                break;
            default:
                Test.instanceCount -= 7;
            }
            i28 = 1;
            do {
                for (i29 = 1; 1 > i29; ++i29) {
                    Test.instanceCount = i22;
                    Test.instanceCount = i28;
                    Test.bFld = Test.bFld;
                    i27 += (int)(-210923633L + (i29 * i29));
                    Test.sFld += (short)i29;
                    dArr[i25 - 1] = i30;
                }
                Test.instanceCount = Test.instanceCount;
            } while (++i28 < 107);
            for (i31 = 1; i31 < 107; i31++) {
                iArr1[i31 + 1] = byFld;
                i27 += 15714;
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
