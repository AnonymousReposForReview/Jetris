package tests.javafuzzer1587;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 23:23:53 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-35116L;
    public static float fFld=0.650F;
    public static short sFld=14178;
    public static boolean bFld=false;
    public static byte byFld=-64;
    public static volatile double dArrFld[]=new double[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.dArrFld, -90.98944);
        FuzzerUtils.init(Test.iArrFld, -2);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(double d, long l) {

        int i6=7, i7=175, i8=209, i9=39645, i10=41955, i11=165, i12=229;

        for (i6 = 375; i6 > 13; i6--) {
            Test.fFld = i6;
            for (i8 = 1; i8 < 5; ++i8) {
                switch ((i8 % 3) + 44) {
                case 44:
                    Test.fFld += (i8 - Test.sFld);
                    break;
                case 45:
                    i10 = 1;
                    do {
                        boolean b1=true;
                        if (b1) break;
                    } while (++i10 < 2);
                    switch (((i8 % 1) * 5) + 25) {
                    case 28:
                        if (false) continue;
                        for (i11 = i8; i11 < 2; ++i11) {
                            i7 += i10;
                            i12 += i7;
                            l = i8;
                            i7 += (((i11 * l) + Test.fFld) - Test.sFld);
                            i12 <<= i12;
                        }
                    }
                    break;
                case 46:
                    i9 += (i8 * i8);
                    break;
                default:
                    Test.instanceCount += (((i8 * i12) + Test.fFld) - i7);
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d) + l + i6 + i7 + i8 + i9 + i10 + i11 + i12;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i3, int i4, int i5) {

        double d1=42.76901;
        int i13=0, i14=-12, i15=105, i16=124, i17=58849;
        byte by=-41;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -2082038234L);

        Test.fFld *= iMeth(d1, Test.instanceCount);
        Test.fFld += Test.instanceCount;
        i5 += i5;
        for (i13 = 8; i13 < 148; i13++) {
            i4 += (int)Test.instanceCount;
            i4 += (i13 ^ Test.instanceCount);
            i15 = 1;
            while (++i15 < 11) {
                Test.sFld += (short)i4;
                for (i16 = 1; i16 < 1; ++i16) {
                    i4 %= (int)(i5 | 1);
                    i17 = i5;
                    Test.dArrFld[i15] += Test.fFld;
                    i4 += (((i16 * Test.instanceCount) + Test.instanceCount) - i17);
                    i3 = by;
                }
                lArr[i13 - 1] -= Test.instanceCount;
            }
        }
        vMeth1_check_sum += i3 + i4 + i5 + Double.doubleToLongBits(d1) + i13 + i14 + i15 + i16 + i17 + by +
            FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(boolean b) {

        int i1=25761, i2=32083, i18=1, i19=3, i20=-14, i21=1348;

        for (i1 = 3; 254 > i1; i1++) {
            vMeth1(i18, i1, -61);
            i18 |= i18;
            i2 = 11;
            i18 += (6 + (i1 * i1));
            i18 /= (int)(i18 | 1);
            Test.dArrFld[i1 + 1] = 122;
            i18 += 23623;
            i18 += -2351;
        }
        i19 = 1;
        while (++i19 < 202) {
            Test.fFld -= Test.instanceCount;
            i2 += i19;
            for (i20 = i19; i20 < 8; i20++) {
                i18 += i20;
                i2 = (int)Test.instanceCount;
            }
        }
        vMeth_check_sum += (b ? 1 : 0) + i1 + i2 + i18 + i19 + i20 + i21;
    }

    public void mainTest(String[] strArr1) {

        int i=8, i22=191, i23=-44376, i24=-5, i25=-52, i26=-54187, i27=-12973, i28=-139, i29=48396, i30=16321,
            i31=-30038, i32=-1;

        i = 139;
        while ((i -= 2) > 0) {
            vMeth(Test.bFld);
            Test.iArrFld[i] += i;
        }
        for (i22 = 7; i22 < 398; ++i22) {
            Test.iArrFld[i22 + 1] >>= i22;
        }
        for (i24 = 5; i24 < 212; i24++) {
            Test.fFld += (i24 + i23);
            i23 = i22;
            switch (((i22 >>> 1) % 4) + 58) {
            case 58:
                i25 /= (int)(i | 1);
                for (i26 = 2; i26 < 121; ++i26) {
                    Test.instanceCount &= Test.instanceCount;
                    i27 = (int)2.66273;
                    i27 *= Test.sFld;
                    for (i28 = 1; 2 > i28; i28++) {
                        i27 += i28;
                        Test.iArrFld[i26 + 1] += (int)Test.instanceCount;
                        i27 *= (int)Test.instanceCount;
                        i27 -= (int)Test.fFld;
                        Test.iArrFld[i28 - 1] = 54804;
                    }
                }
                Test.instanceCount ^= i28;
                Test.dArrFld = Test.dArrFld;
            case 59:
                i30 = 1;
                while (++i30 < 121) {
                    Test.instanceCount += (i30 * i30);
                    Test.bFld = Test.bFld;
                    Test.instanceCount += (i30 + Test.instanceCount);
                }
                for (i31 = 2; i31 < 121; ++i31) {
                    i27 += i;
                }
                break;
            case 60:
                Test.byFld += (byte)(((i24 * i31) + i27) - i31);
                Test.byFld += (byte)Test.instanceCount;
            case 61:
                Test.iArrFld[i24 + 1] = 5;
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
