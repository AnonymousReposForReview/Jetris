package tests.javafuzzer2841;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 21:16:08 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-534103790707594071L;
    public static int iFld=-9;
    public static short sFld=15575;
    public static volatile boolean bFld=true;

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static double dMeth(long l, int i2) {

        int i3=53521, i4=24191, i5=-219, i6=23416, i7=-52365;
        short s=-20102;
        double d2=0.20809;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -24057L);

        i3 = i2;
        lArr[(2 >>> 1) % N] |= s;
        for (d2 = 276; d2 > 9; d2--) {
            i4 += (-9 + (d2 * d2));
            i5 = 1;
            while (++i5 < 6) {
                l *= i4;
                for (i6 = 1; i6 < 1; i6++) {
                    Test.iFld -= (int)d2;
                    i4 >>>= i4;
                    i3 += (int)(72.502F + (i6 * i6));
                    i4 <<= i2;
                    Test.iFld *= (int)Test.instanceCount;
                    i4 += (int)1.127262;
                    s = (short)-1087L;
                    Test.instanceCount += i7;
                }
            }
        }
        long meth_res = l + i2 + i3 + s + Double.doubleToLongBits(d2) + i4 + i5 + i6 + i7 + FuzzerUtils.checkSum(lArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth() {

        int i=-37391, i1=10, i8=1601, i9=191, i10=115, i11=-50943, i12=62213, iArr[][]=new int[N][N];
        double d1=-119.125775;

        FuzzerUtils.init(iArr, -9);

        i = 1;
        do {
            d1 = 1;
            do {
                i1 *= (int)(dMeth(-3931979487L, i1) % (Test.iFld | 1));
                Test.iFld -= (int)-36848L;
                i8 = 1;
                while (++i8 < 1) {
                    if (i != 0) {
                        vMeth_check_sum += i + Double.doubleToLongBits(d1) + i1 + i8 + i9 + i10 + i11 + i12 +
                            FuzzerUtils.checkSum(iArr);
                        return;
                    }
                    Test.iFld = i1;
                }
                iArr[i][(int)(d1)] -= (int)Test.instanceCount;
                Test.iFld &= i9;
                for (i10 = 1; i10 < 1; ++i10) {
                    i1 &= Test.sFld;
                    i9 += i10;
                }
                Test.instanceCount -= Test.instanceCount;
                i12 += -11955;
                Test.instanceCount >>= i1;
            } while (++d1 < 8);
        } while (++i < 212);
        vMeth_check_sum += i + Double.doubleToLongBits(d1) + i1 + i8 + i9 + i10 + i11 + i12 +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vSmallMeth() {

        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 2.55033);

        vMeth();
        vSmallMeth_check_sum += Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i13=-10, i14=-5953, i15=54947, i16=31938, i17=2, i18=56079, i19=-241, i20=-18223, i21=-11, iArr1[][]=new
            int[N][N];
        float f=0.1001F;
        double d3=0.115279;
        long lArr1[]=new long[N];
        boolean bArr[][]=new boolean[N][N];

        FuzzerUtils.init(iArr1, 38);
        FuzzerUtils.init(lArr1, -14L);
        FuzzerUtils.init(bArr, true);

        for (int smallinvoc=0; smallinvoc<817; smallinvoc++) vSmallMeth();
        Test.bFld = Test.bFld;
        Test.iFld <<= Test.iFld;
        i13 = 1;
        do {
            f -= (float)d3;
            for (i14 = 5; i14 < 140; i14++) {
                Test.iFld += (i14 - i15);
                for (i16 = 1; 2 > i16; ++i16) {
                    byte by=-30;
                    Test.iFld += i16;
                    i17 *= i13;
                    i17 += i15;
                    i15 |= -8;
                    f = i14;
                    f = i17;
                    by -= by;
                    if (Test.bFld) continue;
                }
                try {
                    i17 = (iArr1[i14 + 1][i14] % Test.iFld);
                    i15 = (i13 % -177);
                    i17 = (i17 / i15);
                } catch (ArithmeticException a_e) {}
            }
            lArr1[i13] = 3;
            i15 >>= (int)Test.instanceCount;
            for (i18 = 8; 140 > i18; ++i18) {
                d3 *= Test.iFld;
                d3 *= Test.instanceCount;
                bArr[i13][i13] = Test.bFld;
                for (i20 = i18; 2 > i20; ++i20) {
                    f -= Test.instanceCount;
                    i21 <<= i13;
                    i17 = i13;
                    i15 -= (int)f;
                    i15 = i18;
                    if (Test.bFld) break;
                }
            }
        } while (++i13 < 179);



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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  dMeth ->  dMeth vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
