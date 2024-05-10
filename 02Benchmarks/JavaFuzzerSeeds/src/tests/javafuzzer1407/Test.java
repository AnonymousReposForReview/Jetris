package tests.javafuzzer1407;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 19:53:55 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=1L;
    public static volatile int iFld=4;
    public static byte byFld=-67;
    public double dFld=0.66409;
    public short sFld=-4358;
    public static int iArrFld[]=new int[N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 14);
    }

    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(boolean b, long l) {

        int i6=35189, i7=157, i9=23322, i10=-182, i11=-22499, i12=-4, i13=-64190;
        float f2=30.770F;

        l |= Test.iFld;
        for (i6 = 9; i6 < 244; ++i6) {
            Test.iFld = (int)Test.instanceCount;
        }
        i7 -= (int)l;
        i9 = 1;
        while (++i9 < 306) {
            i7 += (int)l;
            for (i10 = 5; i10 > 1; i10 -= 2) {
                b = true;
                Test.iArrFld[i10] <<= -165;
                f2 -= Test.instanceCount;
            }
            Test.iFld -= i10;
            f2 -= Test.instanceCount;
            for (i12 = 5; i12 > 1; i12--) {
                Test.instanceCount = Test.byFld;
                if (b) continue;
            }
        }
        vMeth1_check_sum += (b ? 1 : 0) + l + i6 + i7 + i9 + i10 + i11 + Float.floatToIntBits(f2) + i12 + i13;
    }

    public static void vMeth(float f1) {

        boolean b1=false;
        double d1=12.102352;
        int i14=-8, i15=14, i16=-60405, i17=36083, i18=9, i19=3;

        vMeth1(b1, 2046L);
        d1 = 193;
        for (i14 = 1; i14 < 211; i14++) {
            Test.instanceCount <<= Test.iFld;
            for (i16 = 8; i16 > 1; --i16) {
                Test.instanceCount *= Test.iFld;
                Test.instanceCount += (((i16 * i16) + Test.iFld) - i17);
                Test.iFld += (i16 * i15);
                Test.instanceCount = i15;
            }
            i17 += i14;
        }
        i17 = Test.iFld;
        for (i18 = 11; i18 < 213; i18 += 2) {
            Test.instanceCount <<= Test.byFld;
            try {
                i17 = (i15 % 2);
                i15 = (i14 % -43238);
                i17 = (i17 % i17);
            } catch (ArithmeticException a_e) {}
            Test.iFld |= (int)-264390706659657137L;
        }
        vMeth_check_sum += Float.floatToIntBits(f1) + (b1 ? 1 : 0) + Double.doubleToLongBits(d1) + i14 + i15 + i16 +
            i17 + i18 + i19;
    }

    public float fMeth() {

        int i2=162, i3=-49160, i4=-49801, i5=14, i20=-20711, i21=-17028, i22=16355;
        double d=-96.78490;
        float f=0.999F;
        long l1=-602224832L;
        boolean b2=true;

        for (i2 = 4; i2 < 310; i2++) {
            for (i4 = i2; i4 < 5; ++i4) {
                i5 = i5;
                switch ((i4 % 2) + 106) {
                case 106:
                    d = ((++i5) - (i3 <<= (int)(f + 32498)));
                case 107:
                    Test.iArrFld[(i4 >>> 1) % N] += (int)Test.instanceCount;
                    vMeth(f);
                    Test.iFld += (((i4 * Test.iFld) + Test.byFld) - l1);
                default:
                    Test.iFld <<= -67;
                    lArrFld[i4 + 1] = i2;
                }
                if (b2) continue;
            }
            i20 = 1;
            do {
                for (i21 = 1; i21 > 1; --i21) {
                    i22 = 0;
                    Test.iArrFld = Test.iArrFld;
                }
            } while (++i20 < 5);
        }
        long meth_res = i2 + i3 + i4 + i5 + Double.doubleToLongBits(d) + Float.floatToIntBits(f) + l1 + (b2 ? 1 : 0) +
            i20 + i21 + i22;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=37935, i1=-56473, i23=57235, i24=-63264, i25=8012, i26=-7;
        float f3=0.347F, f4=-73.897F;
        long l2=-3990882031528774796L, l3=-3413543509L;
        boolean b3=true;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 71.105542);

        i = 1;
        while (++i < 363) {
            i1 += (int)(fMeth() + f3);
            for (l2 = 2; l2 < 69; ++l2) {
                Test.iArrFld[(int)(l2)] += (int)dFld;
                Test.instanceCount = 45670;
                i23 += Test.iFld;
                i23 = i23;
                sFld = (short)i1;
                f3 -= (float)10.12344;
                for (i24 = 1; i24 < 2; i24++) {
                    Test.byFld += (byte)7205;
                    dFld -= sFld;
                    Test.iArrFld[i] = (int)dFld;
                    Test.instanceCount ^= Test.instanceCount;
                    if (b3) {
                        l3 <<= i24;
                    }
                    switch (((i24 % 2) * 5) + 106) {
                    case 109:
                        Test.iFld = i23;
                        break;
                    case 111:
                        Test.instanceCount = i23;
                        Test.instanceCount += (i24 | Test.iFld);
                        break;
                    }
                    i23 = i24;
                    i1 = i;
                }
                l3 >>= i24;
            }
            for (f4 = 1; f4 < 69; f4++) {
                i23 = (int)dFld;
            }
            Test.instanceCount = 156;
            i1 ^= (int)Test.instanceCount;
            if (true) continue;
            dArr = FuzzerUtils.double1array(N, (double)1.45191);
            sFld = (short)Test.instanceCount;
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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}