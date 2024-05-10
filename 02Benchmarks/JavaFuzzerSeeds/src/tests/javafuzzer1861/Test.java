package tests.javafuzzer1861;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 04:46:21 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=152L;
    public static int iFld=53;
    public static double dFld=2.21035;
    public static float fFld=2.527F;
    public static int iFld1=6;
    public byte byFld=86;
    public static boolean bArrFld[]=new boolean[N];
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];
    public int iArrFld1[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.bArrFld, true);
        FuzzerUtils.init(Test.iArrFld, -10);
        FuzzerUtils.init(Test.lArrFld, 5394887261248892831L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(double d1) {

        int i5=9, i6=-10, i7=-10063, i8=11, i9=24691;
        short s=25084;
        boolean b=true;

        for (i5 = 1; i5 < 139; i5++) {
            Test.iArrFld[i5] += (int)-6671L;
            i7 = 1;
            while (++i7 < 11) {
                s = (short)Test.instanceCount;
                Test.instanceCount = -43276;
                Test.instanceCount += i6;
                for (i8 = 1; 1 > i8; i8++) {
                    i9 += (-31549 + (i8 * i8));
                    i9 = i8;
                    i9 *= (int)Test.instanceCount;
                    if (true) break;
                    i9 += i8;
                }
                i9 = i7;
                if (b) break;
                Test.iFld = (int)Test.instanceCount;
            }
        }
        vMeth1_check_sum += Double.doubleToLongBits(d1) + i5 + i6 + i7 + s + i8 + i9 + (b ? 1 : 0);
    }

    public static void vMeth(long l, long l1, long l2) {

        int i3=24400, i4=-6, i10=-2, i11=-14449, i12=-14, i13=5, i14=-25989, i15=-14, i16=4;
        long l3=3266404107L;

        for (i3 = 248; i3 > 14; --i3) {
            vMeth1(Test.dFld);
            if (i3 != 0) {
                vMeth_check_sum += l + l1 + l2 + i3 + i4 + i10 + i11 + l3 + i12 + i13 + i14 + i15 + i16;
                return;
            }
        }
        for (i10 = 8; i10 < 277; ++i10) {
            Test.instanceCount += (-3104279649L + (i10 * i10));
        }
        for (l3 = 174; l3 > 2; --l3) {
            l += l;
            i13 = 1;
            while (++i13 < 9) {
                l += l3;
            }
            i4 *= 4975;
            i14 = 1;
            while (++i14 < 9) {
                Test.fFld += i4;
                for (i15 = 1; i15 < 1; ++i15) {
                    i4 <<= (int)l3;
                    i12 = (int)-3232031500L;
                }
            }
        }
        vMeth_check_sum += l + l1 + l2 + i3 + i4 + i10 + i11 + l3 + i12 + i13 + i14 + i15 + i16;
    }

    public int iMeth(int i1) {

        int i17=-96, i18=57056, i19=9, i20=13;
        long l4=112L;

        for (int i2 : Test.iArrFld) {
            vMeth(Test.instanceCount, Test.instanceCount, Test.instanceCount);
            for (i17 = 1; i17 < 4; i17++) {
                try {
                    Test.iFld1 = (Test.iFld1 % -54991);
                    Test.iFld = (193175220 / Test.iFld);
                    Test.iFld1 = (Test.iFld % i1);
                } catch (ArithmeticException a_e) {}
                i1 = Test.iFld1;
                for (i19 = 1; i19 < 2; ++i19) {
                    i20 *= i20;
                    switch (((-34922 >>> 1) % 1) + 96) {
                    case 96:
                        Test.dFld -= l4;
                        break;
                    }
                    i18 += (8 + (i19 * i19));
                    i18 = (int)Test.instanceCount;
                    Test.iFld1 += (i19 | i1);
                }
            }
            Test.iFld += (int)l4;
            Test.lArrFld = FuzzerUtils.long1array(N, (long)31244L);
            i2 += (int)Test.dFld;
        }
        long meth_res = i1 + i17 + i18 + i19 + i20 + l4;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d=-53.123716;
        int i=4, i21=221, i22=13394, i23=-7, i24=-26120, i25=-6430, i26=-11, i27=-123, i28=-6, i29=-98;
        long l5=5L;
        boolean b1=false;

        Test.instanceCount -= (long)(((d - -2.128129) + (Test.instanceCount * 10)) * (i--));
        Test.bArrFld[(0 >>> 1) % N] = ((iMeth(i) + Test.fFld) <= Test.iFld);
        Test.instanceCount &= Test.iFld;
        Test.iArrFld[(i >>> 1) % N] = (int)Test.fFld;
        for (i21 = 5; i21 < 340; ++i21) {
            for (i23 = 4; i23 < 75; ++i23) {
                Test.iArrFld[i21] *= Test.iFld1;
                Test.instanceCount += i23;
            }
            i25 = 1;
            do {
                Test.fFld = i;
                Test.iFld1 -= -27317;
                try {
                    i = (i24 / i22);
                    i = (i % i23);
                    Test.iFld1 = (-32472 % i22);
                } catch (ArithmeticException a_e) {}
                Test.instanceCount = Test.iFld;
                for (i26 = 1; i26 < 1; ++i26) {
                    d = Test.dFld;
                    Test.instanceCount -= (long)Test.fFld;
                    Test.instanceCount ^= -11;
                }
                Test.lArrFld[i25] -= 98L;
                Test.instanceCount += (((i25 * Test.iFld) + i23) - Test.iFld);
                for (l5 = 1; 1 > l5; l5 += 2) {
                    switch ((i21 % 8) + 28) {
                    case 28:
                        i28 -= i25;
                        byFld += (byte)l5;
                        break;
                    case 29:
                        i22 += -118;
                        Test.fFld *= i23;
                        i27 += (int)(((l5 * i23) + Test.fFld) - i25);
                        i29 -= (int)Test.fFld;
                        break;
                    case 30:
                        i28 *= (int)Test.dFld;
                    case 31:
                        iArrFld1 = iArrFld1;
                        i24 *= (int)l5;
                        break;
                    case 32:
                        b1 = true;
                    case 33:
                        byFld += (byte)i;
                        break;
                    case 34:
                        Test.iFld1 = i21;
                        break;
                    case 35:
                        Test.instanceCount >>= Test.instanceCount;
                        break;
                    }
                }
            } while (++i25 < 75);
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}