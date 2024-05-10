package tests.javafuzzer2025;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 07:43:10 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-4241582913L;
    public static float fFld=-4.436F;
    public static double dFld=2.56970;
    public static volatile byte byFld=31;
    public static volatile int iFld=-54025;
    public static int iArrFld[][]=new int[N][N];
    public static double dArrFld[]=new double[N];
    public static byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 7);
        FuzzerUtils.init(Test.dArrFld, -106.110564);
        FuzzerUtils.init(Test.byArrFld, (byte)67);
    }

    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i10=-26668, i11=7, i12=-162, i13=13, i14=53849, i15=6;
        double d=-92.13625;
        short s=8857;
        boolean b=true;

        i10 = 1;
        do {
            d = 1;
            while (++d < 6) {
                s = (short)i10;
                Test.instanceCount += (long)(((d * i10) + Test.fFld) - i10);
                for (i11 = 1; i11 < 1; ++i11) {
                    Test.instanceCount -= Test.instanceCount;
                }
                i12 -= -43306;
            }
            switch ((i10 % 10) + 31) {
            case 31:
                Test.iArrFld[i10 - 1][i10 + 1] -= i10;
                break;
            case 32:
                for (i13 = 1; i13 < 6; ++i13) {
                    i14 += (((i13 * Test.instanceCount) + i12) - Test.fFld);
                    i15 = 1;
                    do {
                        int i16=8;
                        Test.fFld = Test.byFld;
                        i12 = i15;
                        i14 -= i16;
                    } while (++i15 < 2);
                }
                break;
            case 33:
                i12 = i14;
                break;
            case 34:
                Test.byArrFld = Test.byArrFld;
                break;
            case 35:
                Test.instanceCount = i14;
            case 36:
                Test.iArrFld[i10][i10 - 1] = i10;
            case 37:
                i14 += i14;
            case 38:
                i14 += (i10 ^ i10);
                break;
            case 39:
                if (b) break;
                break;
            case 40:
                i14 += (i10 | Test.byFld);
                break;
            default:
                i14 = (int)Test.instanceCount;
            }
        } while (++i10 < 261);
        vMeth1_check_sum += i10 + Double.doubleToLongBits(d) + s + i11 + i12 + i13 + i14 + i15 + (b ? 1 : 0);
    }

    public static float fMeth() {

        int i8=3, i9=107, i17=22714, i18=-13, i19=-58831, i20=121;
        short s1=25987;

        for (i8 = 11; 256 > i8; ++i8) {
            Test.dFld -= (((-172 * (Test.instanceCount * i9)) + Test.instanceCount) - (++Test.dArrFld[i8 - 1]));
            vMeth1();
            i17 = 1;
            while (++i17 < 7) {
                Test.instanceCount = -52094L;
                for (i18 = 1; i18 < 1; i18++) {
                    Test.fFld += (((i18 * Test.instanceCount) + s1) - i19);
                    Test.fFld = Test.instanceCount;
                    Test.instanceCount = (long)Test.fFld;
                    i9 <<= s1;
                    i19 <<= 72;
                    i9 = (int)Test.instanceCount;
                }
                i20 = 1;
                while (++i20 < 1) {
                    i9 >>= s1;
                    i19 += (i20 - Test.instanceCount);
                }
            }
        }
        long meth_res = i8 + i9 + i17 + i18 + i19 + s1 + i20;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void vMeth(int i2, int i3, int i4) {

        int i5=8, i6=-10, i7=0, i21=142, i22=-43541;
        long l=8445121618934980052L;
        boolean b1=false;

        i5 = 1;
        do {
            for (i6 = 1; i6 < 10; ++i6) {
                i4 = i7;
                l += i6;
                Test.instanceCount *= (-(i4 = (int)(l++)));
                Test.instanceCount += i6;
                Test.iArrFld = (Test.iArrFld = (Test.iArrFld = Test.iArrFld));
                Test.fFld = ((-(--l)) + fMeth());
                for (i21 = 1; i21 < 2; ++i21) {
                    int i23=12;
                    Test.iArrFld[i5 + 1][i6 - 1] = i23;
                    i7 = (int)Test.dFld;
                    i23 &= 6;
                    Test.iArrFld[i21][i21 - 1] = -251;
                    b1 = true;
                    if (b1) continue;
                }
            }
        } while (++i5 < 158);
        vMeth_check_sum += i2 + i3 + i4 + i5 + i6 + i7 + l + i21 + i22 + (b1 ? 1 : 0);
    }

    public void mainTest(String[] strArr1) {

        int i=-4, i1=4, i24=60, i25=47406, i26=38, i27=-203, i28=33, i29=-42, i30=-69, i31=30844, i32=-28836;
        boolean b2=false;
        short s2=981;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 0.831F);

        i = (i - Math.abs(i1 - i1));
        i *= (int)Test.instanceCount;
        vMeth(i1, i24, i24);
        i1 >>= i1;
        Test.instanceCount -= -108;
        Test.byFld >>= (byte)i;
        Test.instanceCount >>= 238;
        b2 = b2;
        for (i25 = 4; i25 < 214; ++i25) {
            for (i27 = i25; i27 < 120; i27++) {
                switch ((((i1 >>> 1) % 1) * 5) + 127) {
                case 130:
                    Test.byArrFld[i25 + 1] = (byte)41358;
                    i28 *= i27;
                    for (i29 = 1; 1 > i29; ++i29) {
                        fArr[i25 + 1] = i29;
                        Test.dFld += Test.fFld;
                        Test.iFld += i29;
                        Test.byFld *= (byte)-8760;
                        Test.fFld -= i24;
                        i24 += -5;
                    }
                    break;
                default:
                    Test.iFld = i28;
                }
                Test.instanceCount = i;
                i28 = s2;
                s2 = (short)24;
                Test.instanceCount += i27;
                i26 *= i1;
                i24 = i24;
                for (i31 = i27; i31 < 1; ++i31) {
                    Test.instanceCount = i27;
                    i += i31;
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  fMeth ->  fMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 fMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}