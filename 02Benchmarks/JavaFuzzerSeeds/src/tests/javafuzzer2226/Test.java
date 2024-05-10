package tests.javafuzzer2226;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 10:28:17 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-134L;
    public static float fFld=0.298F;
    public static byte byFld=24;
    public static double dFld=107.24429;
    public static long lArrFld[]=new long[N];
    public static double dArrFld[][]=new double[N][N];
    public static int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 8857L);
        FuzzerUtils.init(Test.dArrFld, 89.41138);
        FuzzerUtils.init(Test.iArrFld, -48363);
        FuzzerUtils.init(Test.fArrFld, 1.572F);
    }

    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static int iMeth() {

        int i8=-202;

        i8 = (int)(i8 -= (int)((i8 * i8) | (i8 + Test.instanceCount)));
        long meth_res = i8;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i10, int i11, int i12) {

        int i13=-231, i14=95, i15=-6, i16=11515, i17=-6843, i18=16511, i19=-12745, i20=5, iArr2[]=new int[N];
        double d1=1.93995;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 65.287F);
        FuzzerUtils.init(iArr2, -14027);

        for (i13 = 14; i13 < 267; i13 += 2) {
            for (i15 = 1; i15 < 12; i15++) {
                for (i17 = 1; i17 < 2; i17 += 3) {
                    Test.instanceCount *= (long)Test.fFld;
                    i10 += (16841 + (i17 * i17));
                    i10 += (((i17 * i12) + Test.instanceCount) - Test.instanceCount);
                    d1 *= i10;
                    Test.instanceCount *= i13;
                }
                i19 += (i15 - Test.byFld);
                i20 = 2;
                do {
                    fArr[i15] = (float)d1;
                    i16 += (54443 + (i20 * i20));
                    iArr2[i15 + 1] -= -23322;
                    Test.instanceCount += (-19 + (i20 * i20));
                    Test.lArrFld[i13] = i12;
                } while ((i20 -= 3) > 0);
            }
        }
        vMeth1_check_sum += i10 + i11 + i12 + i13 + i14 + i15 + i16 + i17 + i18 + Double.doubleToLongBits(d1) + i19 +
            i20 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr2);
    }

    public static void vMeth(long l, byte by1, int i9) {

        short s=-27917;
        int i21=-2, i22=58018, i23=-16505, i24=98, i25=-78, i26=158, i27=-9413, iArr1[]=new int[N];
        double d2=-39.22323;

        FuzzerUtils.init(iArr1, 57698);

        s += (short)(iArr1[(i9 >>> 1) % N]++);
        vMeth1(i9, 244, i9);
        Test.lArrFld[(i9 >>> 1) % N] *= l;
        for (i21 = 345; i21 > 1; --i21) {
            i22 -= i21;
            for (i23 = 1; i23 < 5; ++i23) {
                d2 += i21;
                i25 *= -157;
                for (i26 = 1; i26 < 2; ++i26) {
                    i27 += i26;
                    l += i24;
                }
                iArr1[i23 + 1] = -8;
                l += (((i23 * i22) + s) - i27);
            }
            i24 += (((i21 * Test.instanceCount) + i24) - Test.fFld);
            i22 += -56;
        }
        vMeth_check_sum += l + by1 + i9 + s + i21 + i22 + i23 + i24 + Double.doubleToLongBits(d2) + i25 + i26 + i27 +
            FuzzerUtils.checkSum(iArr1);
    }

    public static long lMeth() {

        float f=-1.484F;
        int i5=20230, i6=-21946, i7=-194, i28=221, i29=-59039;
        byte by=101, by2=-35;

        f *= i5;
        for (i6 = 14; 333 > i6; ++i6) {
            if ((i5++) > (--f)) continue;
            i7 = (int)((iMeth() - (f + i7)) * ((++by) + (--i5)));
            f += (i6 + Test.instanceCount);
            f *= i5;
            vMeth(Test.instanceCount, by2, -24424);
        }
        try {
            Test.instanceCount = i6;
            for (i28 = 2; i28 < 398; ++i28) {
                Test.dArrFld[i28 - 1][i28 + 1] = Test.dFld;
                switch (((i29 >>> 1) % 7) + 99) {
                case 99:
                    Test.fFld = i5;
                    i29 |= i29;
                    i29 *= i28;
                    break;
                case 100:
                    Test.lArrFld[i28] *= -82;
                    break;
                case 101:
                    i7 += (((i28 * i6) + i7) - i28);
                    break;
                case 102:
                    i7 = (int)-41760L;
                    break;
                case 103:
                    Test.iArrFld[i28 + 1] <<= i28;
                    break;
                case 104:
                    Test.fArrFld[i28 + 1] += 28;
                    break;
                case 105:
                default:
                    i29 -= (int)Test.instanceCount;
                }
            }
        }
        catch (ArithmeticException exc1) {
            f = 0;
        }
        finally {
            f -= Test.instanceCount;
        }
        long meth_res = Float.floatToIntBits(f) + i5 + i6 + i7 + by + by2 + i28 + i29;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=95, i1=0, i3=56475, i4=84, i30=53444, i32=-14929, i33=14482, i34=13, i35=-2, iArr[]=new int[N];
        double d=0.80397;
        short s1=-15434;
        long l1=-979894622L;

        FuzzerUtils.init(iArr, -13);

        for (i = 16; i < 328; ++i) {
            d *= -2947811362482036007L;
            i1 = iArr[i - 1];
            i1 += (i - i1);
            d += Float.intBitsToFloat(i1);
            i1 += (i1 += i);
            Test.instanceCount <<= Test.instanceCount;
            iArr[i] += (int)(-10L - iArr[i]);
            for (i3 = 1; i3 < 81; i3++) {
                Test.instanceCount -= (lMeth() - Test.instanceCount);
                i30 = 1;
                do {
                    Test.instanceCount = Test.instanceCount;
                    i1 += (i30 + i30);
                    s1 += (short)(i30 * s1);
                    i1 = i;
                    Test.fFld = Test.fFld;
                } while (++i30 < 2);
            }
            i4 += 97;
        }
        for (int i31 : iArr) {
            i32 = 1;
            do {
                for (l1 = 1; l1 > 1; l1 -= 3) {
                    i33 = i;
                    i33 -= i1;
                    i4 -= i30;
                    i33 += (1 + (l1 * l1));
                    Test.fFld = 0;
                }
                i31 += (((i32 * Test.instanceCount) + i4) - i1);
                for (i34 = 1; 1 > i34; ++i34) {
                    Test.instanceCount = i32;
                    try {
                        i35 = (i34 % i1);
                        i33 = (i32 / 1791242528);
                        i1 = (50809 / iArr[i32]);
                    } catch (ArithmeticException a_e) {}
                    Test.instanceCount = -168;
                }
            } while (++i32 < 63);
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
//DEBUG  iMeth ->  iMeth lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}