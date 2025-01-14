package tests.javafuzzer3273;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 05:31:56 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=6040499472944094422L;
    public static boolean bFld=false;
    public int iFld=57814;
    public volatile double dFld=-83.13058;
    public static byte byFld=-31;
    public int iArrFld[]=new int[N];
    public static boolean bArrFld[]=new boolean[N];
    public static volatile int iArrFld1[]=new int[N];
    public static volatile long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.bArrFld, true);
        FuzzerUtils.init(Test.iArrFld1, -52323);
        FuzzerUtils.init(Test.lArrFld, -240L);
    }

    public static long sMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1() {

        int i13=88, i14=6, i15=182, i16=12;
        float f3=-4.792F;
        short s1=-16309;

        for (i13 = 11; 197 > i13; ++i13) {
            for (i15 = i13; i15 < 9; i15++) {
                f3 += Test.instanceCount;
                if (Test.bFld) {
                    Test.iArrFld1[i15 + 1] += (int)Test.instanceCount;
                    i14 = (int)f3;
                    Test.bArrFld[i15] = Test.bFld;
                } else {
                    i14 -= i14;
                    Test.instanceCount = i13;
                }
                i14 <<= i16;
                i14 += -13;
                i14 &= (int)Test.instanceCount;
                Test.byFld = (byte)i14;
                s1 += (short)i16;
                f3 += i15;
            }
        }
        long meth_res = i13 + i14 + i15 + i16 + Float.floatToIntBits(f3) + s1;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(long l) {

        int i5=-54448, i6=63310, i7=12, i8=-6, i9=1, i10=-8, i11=-36874, i12=9, iArr[]=new int[N];
        float f1=1.470F, f2=20.596F, fArr[]=new float[N];
        byte by1=91;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 60469);
        FuzzerUtils.init(lArr, -8295256160721537420L);
        FuzzerUtils.init(fArr, 0.912F);

        i5 = (int)(((Test.instanceCount--) * (i5 * f1)) - i5);
        for (i6 = 289; i6 > 2; --i6) {
            for (i8 = 1; i8 < 6; i8++) {
                double d=2.68945;
                i9 = (int)(-(f2 + (i7--)));
                by1 += (byte)((--i7) - ((-34L - (-iArr[i6 + 1])) + (++l)));
                iArr = iArr;
                switch ((i8 % 7) + 88) {
                case 88:
                    l += i8;
                    break;
                case 89:
                    for (i10 = 1; i10 < 2; ++i10) {
                        if (Test.bFld = Test.bArrFld[i6 + 1]) break;
                        if (Test.bFld) break;
                        i7 = (int)(lArr[i10 - 1] - (++f2));
                        l -= (++Test.instanceCount);
                        if (Test.bFld) break;
                    }
                    break;
                case 90:
                    i11 += (((i8 * i11) + by1) - i7);
                case 91:
                    i7 = (int)(0.825F * ((d + i12) * (Test.instanceCount - -194L)));
                case 92:
                    f1 = iMeth1();
                    break;
                case 93:
                    fArr[i6 - 1] *= -53701;
                    break;
                case 94:
                    try {
                        Test.iArrFld1[i6 - 1] = (Test.iArrFld1[i6 + 1] % Test.iArrFld1[i8]);
                        iArr[i8 + 1] = (i11 / i5);
                        Test.iArrFld1[i8] = (i10 % 74);
                    } catch (ArithmeticException a_e) {}
                    break;
                default:
                    if (true) continue;
                }
            }
        }
        long meth_res = l + i5 + Float.floatToIntBits(f1) + i6 + i7 + i8 + i9 + Float.floatToIntBits(f2) + by1 + i10 +
            i11 + i12 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static short sMeth(byte by) {

        short s=-649;
        int i17=7, i18=-19732, i19=11, i20=3, i21=-8;
        byte by2=-36;
        float f4=0.95F, fArr1[]=new float[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 62.78026);
        FuzzerUtils.init(fArr1, 0.323F);

        s >>>= (short)-809359116L;
        iMeth(Test.instanceCount);
        for (i17 = 3; 294 > i17; ++i17) {
            i18 += (int)(369833513L + (i17 * i17));
            dArr[i17 + 1] = i17;
            if (i17 != 0) {
            }
            i19 = 6;
            while (--i19 > 0) {
                i18 += i19;
            }
        }
        i20 = 1;
        while (++i20 < 272) {
            by2 = (byte)i18;
            fArr1[i20 + 1] = Test.instanceCount;
            Test.iArrFld1[i20 + 1] = -6;
            i21 += by;
            Test.lArrFld[i20 - 1] *= (long)f4;
        }
        i18 <<= 55790;
        long meth_res = by + s + i17 + i18 + i19 + i20 + by2 + i21 + Float.floatToIntBits(f4) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-48180, i1=-12, i2=-67, i3=232, i4=20774, i22=0, i23=130, i24=-23903, i25=-54792, i26=0, i27=199,
            i28=-12, i29=-11;
        float f=1.731F;
        short s2=-15454;

        Test.bFld = (-156 == (++iFld));
        for (i = 7; i < 154; i++) {
            if (dFld >= i1) continue;
            iFld += (int)(((Test.instanceCount * i) + (++i1)) - Test.instanceCount);
            for (f = 171; 5 < f; f--) {
                for (i3 = i; i3 < 2; ++i3) {
                    Test.instanceCount += i3;
                    iArrFld[i3 + 1] *= (((-64 + (-(i + 7))) + (i1 * i2)) + sMeth(Test.byFld));
                    Test.bFld = Test.bFld;
                    i1 <<= i;
                    Test.instanceCount += i22;
                    Test.iArrFld1[i] += (int)-11030L;
                }
                s2 -= (short)f;
                Test.instanceCount *= i4;
                i22 = (int)dFld;
            }
            if (Test.bFld) {
                dFld = 162;
            }
        }
        for (i23 = 5; i23 < 279; ++i23) {
            Test.instanceCount *= Test.instanceCount;
            for (i25 = 92; i25 > i23; i25--) {
                i1 -= 3;
                i22 = (int)dFld;
                i27 *= (int)Test.instanceCount;
                Test.instanceCount += (((i25 * i2) + i25) - f);
                i26 -= (int)f;
                iArrFld[i23 - 1] >>= i;
                i24 &= i3;
                for (i28 = 1; i28 > 1; --i28) {
                    try {
                        i4 = (iArrFld[i23] / i2);
                        i27 = (153 / i3);
                        i24 = (Test.iArrFld1[i28] / i);
                    } catch (ArithmeticException a_e) {}
                    Test.byFld += (byte)(((i28 * Test.instanceCount) + iFld) - i2);
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
//DEBUG  sMeth ->  sMeth mainTest
//DEBUG  iMeth ->  iMeth sMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth sMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
