package tests.javafuzzer2263;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 11:06:34 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3216032359L;
    public static int iFld=2067;
    public static volatile byte byFld=96;
    public static double dFld=-110.107170;
    public static long lFld=-1932436175L;
    public static float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 40.283F);
        FuzzerUtils.init(Test.iArrFld, 231);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l2) {

        int i1=235, i2=-167, i3=-57285, i4=62783, i5=-201;
        boolean b=true;
        long l3=0L;
        float f=0.367F;

        for (i1 = 15; 329 > i1; i1++) {
            Test.iFld *= i1;
        }
        i3 = 1;
        while (++i3 < 249) {
            if (b) break;
            i4 = 1;
            while (++i4 < 7) {
                Test.byFld -= (byte)i4;
                i2 = i3;
                Test.instanceCount -= Test.byFld;
                Test.iFld %= (int)(i5 | 1);
                i2 += (((i4 * l3) + i2) - f);
                i2 += (i4 | i1);
                Test.dFld += f;
                l2 = i3;
                i2 &= (int)l2;
                Test.iArrFld[i3] *= i5;
            }
        }
        vMeth2_check_sum += l2 + i1 + i2 + i3 + (b ? 1 : 0) + i4 + i5 + l3 + Float.floatToIntBits(f);
    }

    public static void vMeth1(long l1, int i, double d) {

        float f1=50.264F;
        int i6=-114, i7=57641, i8=24627, i9=82, i10=-51205, i11=53750;
        boolean b1=true;

        i -= (int)(++Test.fArrFld[(-3 >>> 1) % N]);
        vMeth2(Test.instanceCount);
        if (false) {
            i -= (int)f1;
            i6 >>= i;
            i6 = (int)Test.dFld;
            Test.instanceCount >>= Test.instanceCount;
        } else if (false) {
            for (i7 = 4; i7 < 197; i7++) {
                for (i9 = 1; i9 < 8; i9++) {
                    switch ((i9 % 1) + 52) {
                    case 52:
                        Test.lFld = 0;
                        break;
                    }
                    i6 += (int)f1;
                    i11 = 1;
                    do {
                        Test.lFld += i11;
                        i += i9;
                    } while (++i11 < 2);
                }
            }
        } else if (b1) {
            Test.iFld -= 10661;
        } else {
            Test.iArrFld[(-41190 >>> 1) % N] = (int)Test.instanceCount;
        }
        vMeth1_check_sum += l1 + i + Double.doubleToLongBits(d) + Float.floatToIntBits(f1) + i6 + i7 + i8 + i9 + i10 +
            i11 + (b1 ? 1 : 0);
    }

    public static void vMeth(long l, short s) {

        int i12=12, i13=46534, i14=178, i15=12, i16=-236, i17=157, i18=65248;
        boolean b2=true;

        Test.iFld = (--Test.iFld);
        switch ((((((int)(Test.iFld + -1922661876L)) >>> 1) % 2) * 5) + 11) {
        case 14:
            vMeth1(Test.instanceCount, 14, Test.dFld);
            for (i12 = 308; 7 < i12; --i12) {
                for (i14 = 1; i14 < 5; i14++) {
                    i15 <<= (int)Test.lFld;
                    i13 = (int)Test.lFld;
                }
                i16 = 1;
                while (++i16 < 5) {
                    switch (((i12 % 2) * 5) + 119) {
                    case 127:
                        i13 = i15;
                        Test.lFld = 20682;
                        if (b2) break;
                        for (i17 = 1; i17 < 1; i17++) {
                            if (i14 != 0) {
                                vMeth_check_sum += l + s + i12 + i13 + i14 + i15 + i16 + (b2 ? 1 : 0) + i17 + i18;
                                return;
                            }
                            i15 = Test.iFld;
                        }
                    case 121:
                        Test.lFld = i15;
                        break;
                    }
                }
            }
            break;
        case 18:
            Test.lFld ^= 48738;
            break;
        default:
            Test.lFld = i14;
        }
        vMeth_check_sum += l + s + i12 + i13 + i14 + i15 + i16 + (b2 ? 1 : 0) + i17 + i18;
    }

    public void mainTest(String[] strArr1) {

        short s1=21018;
        double d1=43.63447;
        int i19=-110, i20=-132, i21=708, i22=-11, i23=-10281, i24=-12, i25=-231;
        float f2=66.498F;
        long l4=1711936021L, lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, 14L);

        vMeth(Test.instanceCount, s1);
        Test.iFld = Test.iFld;
        Test.iFld += Test.iFld;
        d1 = 1;
        while (++d1 < 243) {
            Test.lFld *= Test.instanceCount;
            Test.iFld = (int)Test.lFld;
            switch ((int)((d1 % 1) + 78)) {
            case 78:
                for (i19 = 4; i19 < 103; ++i19) {
                    Test.lFld += (i19 - i20);
                    Test.iFld += Test.iFld;
                    for (i21 = 1; 2 > i21; i21++) {
                        Test.iArrFld[i21 + 1] = Test.iFld;
                    }
                    Test.iFld >>= i19;
                    f2 *= i22;
                    Test.iFld += i22;
                    l4 = s1;
                    Test.dFld -= -27320;
                }
                i22 = (int)Test.instanceCount;
                i23 = 103;
                do {
                    for (i24 = 1; 2 > i24; i24++) {
                        i20 *= i20;
                        i25 += i24;
                        f2 += i24;
                        lArr[i24][i24 + 1] = s1;
                        Test.lFld = (long)d1;
                        i22 = i25;
                        try {
                            i20 = (i19 % 27560);
                            Test.iFld = (i23 % 1216930761);
                            i20 = (1013149443 / Test.iFld);
                        } catch (ArithmeticException a_e) {}
                        i25 += 118;
                        i20 ^= i25;
                    }
                    try {
                        Test.iFld = (1102527329 / i21);
                        i20 = (i23 / i24);
                        Test.iArrFld[(int)(d1 + 1)] = (i23 % 968121182);
                    } catch (ArithmeticException a_e) {}
                } while ((i23 -= 2) > 0);
                break;
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
