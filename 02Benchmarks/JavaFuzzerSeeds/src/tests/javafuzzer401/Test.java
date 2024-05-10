package tests.javafuzzer401;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 03:16:58 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=9378L;
    public static volatile float fFld=0.676F;
    public static boolean bFld=true;
    public static volatile short sFld=4415;
    public static byte byFld=123;
    public static int iArrFld[]=new int[N];
    public int iArrFld1[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, -58291);
    }

    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i5) {

        int i6=127, i7=-5, i8=11, i9=11, i10=-30513;
        byte by=-74;
        long l=21925L;
        short s1=26671;

        i5 = -24;
        Test.iArrFld[(i5 >>> 1) % N] += -2;
        for (i6 = 6; i6 < 254; ++i6) {
            for (i8 = 7; i8 > 1; i8--) {
                i10 = 1;
                do {
                    Test.instanceCount = by;
                    i5 = (int)Test.instanceCount;
                    i9 += (-21617 + (i10 * i10));
                    i7 += (i10 * Test.instanceCount);
                } while (++i10 < 2);
                i7 >>>= (int)l;
                if (true) continue;
                i9 += 7;
                l = i8;
                if (true) continue;
                s1 = (short)-170;
            }
        }
        long meth_res = i5 + i6 + i7 + i8 + i9 + i10 + by + l + s1;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i4, short s) {

        double d2=-75.44189, dArr[]=new double[N];

        FuzzerUtils.init(dArr, -2.128353);

        for (double d1 : dArr) {
            Test.iArrFld[(i4 >>> 1) % N] >>>= (-iMeth(i4));
        }
        i4 = i4;
        i4 *= (int)d2;
        Test.fFld = Test.fFld;
        vMeth_check_sum += i4 + s + Double.doubleToLongBits(d2) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static double dMeth(double d, int i3) {

        short s2=-9198;
        int i11=43, i12=14, i13=5, i14=2, i15=-97;

        switch (((i3 >>> 1) % 5) + 59) {
        case 59:
            i3 <<= (8 * (++i3));
            break;
        case 60:
            vMeth(i3, s2);
            for (i11 = 230; i11 > 12; --i11) {
                d = 2273100415L;
                Test.instanceCount += i11;
                d += 186;
                i13 = 7;
                do {
                    Test.fFld *= i12;
                    for (i14 = 1; i14 < 1; i14++) {
                        i12 = i12;
                        Test.bFld = Test.bFld;
                        i3 = -8962;
                        i12 = i12;
                        i12 -= (int)Test.instanceCount;
                    }
                } while (--i13 > 0);
            }
            break;
        case 61:
            i15 = i15;
            break;
        case 62:
            Test.fFld = i13;
        case 63:
        }
        long meth_res = Double.doubleToLongBits(d) + i3 + s2 + i11 + i12 + i13 + i14 + i15;
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-6, i1=203, i2=0, i16=5, i17=-12, i18=-3, i19=-78, i20=19480, i21=2286, i22=-59, i23=10, iArr[]=new
            int[N];
        float f=-121.417F, fArr[]=new float[N];
        double d3=1.120147;

        FuzzerUtils.init(iArr, 6);
        FuzzerUtils.init(fArr, 0.96F);

        i += (int)(((i * i) + f) - (Math.abs(i) * (Test.instanceCount = i)));
        i *= (int)(iArr[(i >>> 1) % N] += (int)(i >> Test.instanceCount));
        for (i1 = 5; i1 < 183; i1++) {
            i -= (int)(((iArr[i1 - 1]++) - dMeth(d3, i2)) + 37.254F);
            i2 = (int)d3;
            d3 = -23.120166;
            for (i16 = i1; i16 < 141; i16++) {
                byte by1=-45;
                Test.instanceCount *= i;
                by1 = (byte)Test.instanceCount;
                i += i17;
                fArr[i16 + 1] -= Test.instanceCount;
                f -= Test.instanceCount;
                Test.instanceCount -= (long)f;
                i |= Test.sFld;
                i = 63605;
            }
            i17 += (int)3L;
        }
        i2 *= -146;
        iArr[(i1 >>> 1) % N] -= i;
        i17 += i2;
        i17 <<= (int)-251L;
        for (i18 = 10; i18 < 207; i18 += 2) {
            f = -223;
            for (i20 = 10; i20 < 256; i20++) {
                for (i22 = 1; i22 < 2; i22++) {
                    switch (((i20 % 4) * 5) + 70) {
                    case 78:
                        iArr[i18] *= (int)Test.fFld;
                        i21 = i;
                        break;
                    case 88:
                        i += (i22 + i1);
                        i21 *= i;
                        Test.byFld += (byte)(i22 * f);
                        break;
                    case 74:
                        iArrFld1 = iArrFld1;
                        break;
                    case 76:
                        Test.iArrFld[i22] = 1;
                        break;
                    default:
                        i17 >>= i17;
                    }
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
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  vMeth ->  vMeth dMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}