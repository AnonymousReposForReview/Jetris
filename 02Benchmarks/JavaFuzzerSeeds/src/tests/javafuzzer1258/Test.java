package tests.javafuzzer1258;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 17:31:31 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=232L;
    public int iFld=61861;
    public static float fFld=-40.650F;
    public static short sFld=-667;
    public static volatile int iFld1=-2;
    public static long lArrFld[]=new long[N];
    public volatile int iArrFld[]=new int[N];
    public static int iArrFld1[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.lArrFld, -949645014L);
        FuzzerUtils.init(Test.iArrFld1, -9441);
    }

    public static long sMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i4=-3, i5=-57892, i6=41443, i7=-49133, i8=-53, i9=-2, i10=-12, i11=10, i12=1, i13=19267, iArr[]=new int[N];
        long l2=0L;
        byte by=-103;
        double d=-67.107859;
        boolean b=true;

        FuzzerUtils.init(iArr, -12);

        if (false) {
            for (i4 = 5; 288 > i4; ++i4) {
                i5 = i5;
                try {
                    iArr[i4] = (i5 / 30);
                    i6 = (i4 / 14585);
                    i6 = (i6 / 73);
                } catch (ArithmeticException a_e) {}
            }
            l2 = 339;
            do {
                for (i7 = 1; i7 < 5; ++i7) {
                    Test.fFld += Test.sFld;
                    for (i9 = 2; i9 > 1; i9--) {
                        by = (byte)i7;
                        i5 -= i5;
                        iArr[i7] >>= 14368;
                    }
                    for (i11 = 1; i11 < 2; i11++) {
                        i8 += (((i11 * Test.instanceCount) + i13) - Test.fFld);
                        d = l2;
                        Test.instanceCount = l2;
                    }
                }
            } while (--l2 > 0);
        } else if (b) {
            i6 >>= 75;
        } else {
            Test.fFld /= (i4 | 1);
        }
        vMeth1_check_sum += i4 + i5 + i6 + l2 + i7 + i8 + i9 + i10 + by + i11 + i12 + i13 + Double.doubleToLongBits(d)
            + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i2, long l1, int i3) {

        long l3=3258607077689759165L;
        int i15=26001, i16=113, i17=-11, i18=-35692, i19=-28580, i20=-37;
        double d1=113.79620, dArr[]=new double[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(dArr, -62.36747);
        FuzzerUtils.init(sArr, (short)4779);

        vMeth1();
        Test.fFld *= l3;
        for (i15 = 11; i15 < 193; i15++) {
            d1 *= -1566502362L;
            dArr[i15] = Test.fFld;
            i16 += i3;
            i16 >>= i16;
            for (i17 = 1; i17 < 9; ++i17) {
                Test.fFld += i3;
                sArr[i17] <<= (short)Test.instanceCount;
            }
            Test.instanceCount |= i15;
            for (i19 = 1; i19 < 9; i19++) {
                l1 = (long)Test.fFld;
                Test.fFld = -4;
                i18 *= i3;
            }
        }
        vMeth_check_sum += i2 + l1 + i3 + l3 + i15 + i16 + Double.doubleToLongBits(d1) + i17 + i18 + i19 + i20 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(sArr);
    }

    public static short sMeth(long l) {

        int i21=-13, i22=53099, i23=12, i24=48545, i25=-25568, i26=-3, i27=183;
        double d2=-2.57965;
        boolean b1=false;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-87);

        vMeth(i21, Test.instanceCount, i21);
        i21 >>>= i21;
        for (i22 = 7; i22 < 146; i22++) {
            for (i24 = 1; i24 < 11; ++i24) {
                l *= l;
            }
            byArr[i22] -= (byte)i21;
            switch (((i23 >>> 1) % 6) + 44) {
            case 44:
                for (i26 = 1; i26 < 11; ++i26) {
                    l -= -10L;
                    d2 = -139;
                    b1 = false;
                    if (i22 != 0) {
                    }
                    i23 += -1511;
                    i21 -= i21;
                    i21 += (((i26 * l) + i21) - l);
                }
                break;
            case 45:
                i21 += (((i22 * i25) + i26) - i21);
            case 46:
                Test.iArrFld1[i22][i22 + 1] = i27;
                break;
            case 47:
                l = -64117;
                break;
            case 48:
                l += 14;
                break;
            case 49:
                i25 -= (int)Test.instanceCount;
                break;
            default:
                Test.iArrFld1[i22][i22 + 1] += i21;
            }
        }
        long meth_res = l + i21 + i22 + i23 + i24 + i25 + i26 + i27 + Double.doubleToLongBits(d2) + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(byArr);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=105, i1=-21026, i28=62, i29=9, i30=-10516;
        double d3=-87.11021;
        boolean b2=false;
        byte by1=-48;
        short sArr1[]=new short[N];

        FuzzerUtils.init(sArr1, (short)-21577);

        iFld |= (int)Test.lArrFld[(iFld >>> 1) % N];
        for (i = 7; 151 > i; i++) {
            Test.lArrFld = (Test.lArrFld = Test.lArrFld);
            iFld |= (int)(-((i + Test.instanceCount) >>> iArrFld[i - 1]));
            Test.fFld += (iFld *= ((iFld - iFld) - sMeth(Test.instanceCount)));
            for (i28 = 4; 174 > i28; ++i28) {
                Test.instanceCount -= (long)Test.fFld;
                i1 -= 6;
                i1 += (int)Test.instanceCount;
                d3 = 1;
                do {
                    double d4=-1.68574;
                    Test.iFld1 <<= 8677;
                    Test.fFld += Test.instanceCount;
                    d4 -= -41;
                    Test.iFld1 >>= 59;
                    Test.instanceCount %= ((long)(Test.fFld) | 1);
                    Test.iFld1 += i;
                    iFld += (-11 + (d3 * d3));
                    Test.iArrFld1[i28][(int)(d3)] -= Test.iFld1;
                } while (++d3 < 2);
                try {
                    i1 = (i28 / i28);
                    i1 = (i1 % iArrFld[i]);
                    iArrFld[i - 1] = (i1 / Test.iFld1);
                } catch (ArithmeticException a_e) {}
                i29 -= (int)Test.instanceCount;
                Test.instanceCount += Test.iFld1;
                i30 += (i28 * iFld);
            }
            Test.instanceCount >>= i30;
            switch ((i % 2) + 93) {
            case 93:
                Test.fFld += i28;
                b2 = b2;
                i30 += (i - Test.sFld);
                break;
            case 94:
                Test.lArrFld[i + 1] &= 0L;
                sArr1[i] -= (short)Test.fFld;
                by1 -= (byte)i1;
            default:
                iFld = iFld;
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
//DEBUG  sMeth ->  sMeth mainTest
//DEBUG  vMeth ->  vMeth sMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth sMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}