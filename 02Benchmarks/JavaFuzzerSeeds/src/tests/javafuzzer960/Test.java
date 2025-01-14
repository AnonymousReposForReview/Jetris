package tests.javafuzzer960;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 12:08:42 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-5L;
    public static byte byFld=-67;
    public static volatile int iFld=-5;
    public static float fFld=51.119F;
    public static short sFld=8828;
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 71.43394);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1() {

        long l=1026891770L;
        int i10=-60, i11=-2305, i12=11, i13=32565, i14=55630, i15=5, i16=29743;
        boolean b=true;
        float f2=1.108F;
        double d=-67.4779;
        short s1=-27727;

        l = 357;
        while (--l > 0) {
            switch ((((i10 >>> 1) % 2) * 5) + 83) {
            case 85:
                i10 = (int)99L;
                b = b;
                break;
            case 87:
                f2 += (float)d;
                i10 = i10;
                break;
            }
            for (i11 = 1; i11 < 5; i11++) {
                for (i13 = 1; i13 < 2; ++i13) {
                    i10 *= i11;
                    i15 += (((i13 * s1) + Test.instanceCount) - i14);
                }
                d -= i13;
                i12 = i12;
                Test.byFld = (byte)i15;
                i15 = i10;
                i15 = i16;
            }
        }
        long meth_res = l + i10 + (b ? 1 : 0) + Float.floatToIntBits(f2) + Double.doubleToLongBits(d) + i11 + i12 + i13
            + i14 + i15 + s1 + i16;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        short s=30726;
        int i7=32229, i8=0, i9=-30723, i17=-22973;
        double d1=1.99832;
        float f3=1.400F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 3053252721L);

        s = (short)(i7++);
        i7 = (++i7);
        for (i8 = 19; i8 < 385; ++i8) {
            byte by=60;
            i9 += (by * iMeth1());
            Test.instanceCount += (i8 - i7);
            d1 *= Test.instanceCount;
            Test.instanceCount += (i8 * s);
            Test.instanceCount += (i8 + Test.iFld);
            f3 -= i7;
            i17 = 1;
            do {
                Test.instanceCount += Test.instanceCount;
                Test.instanceCount -= i7;
                Test.instanceCount = i17;
            } while (++i17 < 5);
        }
        Test.instanceCount = i8;
        Test.iFld += i9;
        vMeth_check_sum += s + i7 + i8 + i9 + Double.doubleToLongBits(d1) + Float.floatToIntBits(f3) + i17 +
            FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth(int i3, int i4) {

        int i5=4, i6=-7, i18=-23, i19=-29223, i20=-245, i21=-11, iArr[]=new int[N];
        float f1=0.208F, fArr[]=new float[N];
        double d2=-14.92294;

        FuzzerUtils.init(fArr, -2.712F);
        FuzzerUtils.init(iArr, 153);

        for (i5 = 2; i5 < 319; i5++) {
            f1 -= ((i6 <<= (int)(-906930149222038125L - fArr[i5 + 1])) - i3);
            Test.dArrFld[i5] = ((--Test.instanceCount) + Math.max(Test.instanceCount, --Test.instanceCount));
            vMeth();
        }
        i18 = 1;
        while (++i18 < 233) {
            Test.iFld = -14;
            Test.iFld = (int)f1;
            for (d2 = i18; d2 < 7; d2 += 2) {
                iArr[(int)(d2 - 1)] = i19;
            }
            Test.iFld = i18;
            switch ((i18 % 3) + 70) {
            case 70:
                Test.iFld += (int)d2;
            case 71:
                for (i20 = 1; 7 > i20; ++i20) {
                    if (Test.iFld != 0) {
                    }
                    iArr[i18 - 1] = i21;
                }
                break;
            case 72:
                i21 += i18;
                break;
            default:
                Test.iFld = (int)-60927L;
            }
        }
        long meth_res = i3 + i4 + i5 + i6 + Float.floatToIntBits(f1) + i18 + Double.doubleToLongBits(d2) + i19 + i20 +
            i21 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-56687, i1=11, i2=2, i22=73, i23=-48711, i24=-2, i25=61660;
        float f=-47.775F;
        double d3=-2.65262;
        boolean b1=true;

        for (i = 11; i < 211; ++i) {
            for (f = 1; f < 126; f++) {
                switch (((i % 2) * 5) + 86) {
                case 88:
                    i1 = iMeth(Test.iFld, i2);
                    break;
                case 96:
                    Test.iFld += (int)f;
                    i1 += (int)Test.instanceCount;
                    for (i22 = i; i22 < 2; i22 += 2) {
                        Test.iFld *= i22;
                        Test.fFld += (float)d3;
                        Test.byFld += (byte)(i22 + i1);
                    }
                    Test.byFld -= (byte)3844;
                    break;
                default:
                    Test.iFld = Test.iFld;
                }
                for (i24 = (int)(f); i24 < 2; i24++) {
                    Test.instanceCount &= Test.instanceCount;
                    Test.sFld <<= (short)i22;
                    Test.instanceCount -= i24;
                    i25 += (161 + (i24 * i24));
                    b1 = b1;
                    i23 *= i24;
                    d3 += Test.fFld;
                    Test.sFld *= (short)166;
                    i2 = Test.iFld;
                }
                Test.instanceCount += -4182550536L;
            }
            i1 = (int)Test.instanceCount;
            i1 -= i1;
            i2 = i24;
            i25 = 9;
            i23 = i;
        }
        Test.instanceCount >>= Test.instanceCount;
        i25 <<= (int)Test.instanceCount;


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
//DEBUG  iMeth1 ->  iMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
