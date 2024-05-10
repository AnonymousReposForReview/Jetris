package tests.javafuzzer2860;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 21:44:17 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=125L;
    public static float fFld=-1.70F;
    public static double dFld=0.70804;
    public static volatile byte byFld=-116;
    public static float fArrFld[]=new float[N];
    public static long lArrFld[]=new long[N];
    public boolean bArrFld[]=new boolean[N];
    public byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 72.330F);
        FuzzerUtils.init(Test.lArrFld, -14L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i5, int i6) {

        int i7=20, i8=-58265, i9=-56647, i10=-14, i11=30;
        float f1=75.551F;
        boolean b1=false;

        for (i7 = 240; i7 > 5; i7 -= 3) {
            switch ((((i8 >>> 1) % 1) * 5) + 101) {
            case 106:
                i6 = i7;
                f1 += Test.instanceCount;
                Test.fArrFld[i7 + 1] = Test.instanceCount;
                Test.instanceCount -= i5;
                break;
            }
            i8 >>>= 11;
            for (i9 = 1; i9 < 20; ++i9) {
                i6 += (int)-1.21145;
                i11 = 1;
                while (++i11 < 2) {
                    i6 += 42346;
                    f1 += (i11 * Test.fFld);
                    Test.instanceCount = i9;
                    Test.lArrFld[i7] = (long)1.127785;
                    if (b1) break;
                }
            }
        }
        vMeth2_check_sum += i5 + i6 + i7 + i8 + Float.floatToIntBits(f1) + i9 + i10 + i11 + (b1 ? 1 : 0);
    }

    public static void vMeth1(int i4, float f, boolean b) {

        int i12=-11, i13=9, iArr1[]=new int[N];
        double d=-2.81183;

        FuzzerUtils.init(iArr1, -217);

        vMeth2(i4, i4);
        for (i12 = 5; i12 < 143; ++i12) {
            i4 >>>= 124;
            f -= Test.instanceCount;
        }
        d *= i12;
        iArr1[(i12 >>> 1) % N] += i4;
        vMeth1_check_sum += i4 + Float.floatToIntBits(f) + (b ? 1 : 0) + i12 + i13 + Double.doubleToLongBits(d) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i3) {

        int i14=53, i15=239, i16=-8, i17=2, i18=59155, i19=-50642, i20=3;
        double d1=1.16730;
        boolean b2=true;

        vMeth1(i3, -2.158F, true);
        for (i14 = 3; i14 < 133; ++i14) {
            i15 *= (int)Test.instanceCount;
            d1 = 98;
            Test.fFld = Test.instanceCount;
            for (i16 = 1; i16 < 12; i16++) {
                i18 = 1;
                while (++i18 < 2) {
                    i3 <<= (int)Test.instanceCount;
                }
            }
            i15 *= 106;
            if (b2) break;
            for (i19 = 1; 12 > i19; ++i19) {
                i3 += (-227 + (i19 * i19));
                i15 = i16;
            }
            b2 = b2;
            Test.fFld *= i14;
        }
        vMeth_check_sum += i3 + i14 + i15 + Double.doubleToLongBits(d1) + i16 + i17 + i18 + (b2 ? 1 : 0) + i19 + i20;
    }

    public void mainTest(String[] strArr1) {

        int i=-16159, i1=-10589, i2=17335, i21=-41330, i22=-4584, i23=-31, i24=-13624, i25=-11079, i26=-67, i27=-59281,
            iArr[][]=new int[N][N], iArr2[]=new int[N];
        boolean b3=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -100);
        FuzzerUtils.init(lArr, 213L);
        FuzzerUtils.init(iArr2, -203);

        for (i = 13; i < 233; ++i) {
            switch ((i % 7) + 76) {
            case 76:
                if (b3) {
                    i1 /= (int)(((++iArr[i - 1][i]) - ((i - i) * (Test.instanceCount++))) | 1);
                    i2 = 114;
                    while ((i2 -= 3) > 0) {
                        vMeth(i2);
                        Test.instanceCount += (67 + (i2 * i2));
                        Test.dFld /= (i | 1);
                        i1 += i2;
                    }
                    i1 ^= i1;
                    Test.byFld -= (byte)Test.instanceCount;
                } else {
                    for (i21 = 4; i21 < 114; i21++) {
                        i22 *= i1;
                        bArrFld[i] = false;
                        iArr[i21][i21 + 1] += i1;
                        for (i23 = 2; 1 < i23; --i23) {
                            i24 >>= (int)Test.instanceCount;
                        }
                        switch ((((i22 >>> 1) % 1) * 5) + 98) {
                        case 101:
                            Test.fFld += (i21 + Test.fFld);
                            Test.instanceCount *= i21;
                            lArr[i] = i;
                        }
                        for (i25 = 1; 2 > i25; i25++) {
                            if (b3) continue;
                            Test.dFld = Test.fFld;
                            switch ((((i21 >>> 1) % 1) * 5) + 122) {
                            case 127:
                                i22 += i25;
                                i22 += (((i25 * Test.byFld) + i22) - Test.instanceCount);
                                break;
                            }
                            iArr[i25 + 1][i21 + 1] <<= -49241;
                            i27 += i25;
                            Test.instanceCount >>>= i1;
                        }
                    }
                }
                break;
            case 77:
                byArrFld[i + 1] -= (byte)i23;
                break;
            case 78:
                Test.fArrFld[i] *= i25;
                break;
            case 79:
                try {
                    i26 = (iArr[i - 1][i] / 36183);
                    i27 = (i2 % -21);
                    i26 = (iArr[i + 1][i] % 7796);
                } catch (ArithmeticException a_e) {}
            case 80:
                Test.fFld = Test.byFld;
                break;
            case 81:
                try {
                    i1 = (i1 / i22);
                    i26 = (i2 % -1370631516);
                    i27 = (i23 / -4955);
                } catch (ArithmeticException a_e) {}
            case 82:
                i26 += (((i * Test.byFld) + i27) - i23);
                break;
            default:
                Test.dFld -= i24;
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