package tests.javafuzzer2789;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 20:03:55 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=886334675L;
    public static double dFld=1.4137;
    public static int iFld=-249;
    public static float fFld=-97.374F;
    public static byte byFld=119;
    public volatile boolean bFld=false;
    public int iFld1=-4;
    public static double dArrFld[]=new double[N];
    public volatile long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 0.83326);
        FuzzerUtils.init(Test.iArrFld, -9);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1() {

        int i5=41, i6=-6, i7=4, i8=-65026, i9=242, i10=3663, iArr1[]=new int[N];
        float f=-126.989F;

        FuzzerUtils.init(iArr1, 8);

        for (i5 = 3; 132 > i5; i5++) {
            i6 *= 36847;
            for (i7 = 1; i7 < 12; i7++) {
                i8 >>= -57746;
                f = (float)61.23798;
            }
            Test.dFld += i5;
            i6 += i5;
            i8 += i5;
            Test.instanceCount *= i6;
            iArr1[i5] += (int)Test.instanceCount;
        }
        for (i9 = 18; i9 < 362; ++i9) {
            Test.instanceCount += i9;
            iArr1[i9 + 1] = (int)Test.instanceCount;
            i6 = (int)Test.instanceCount;
            Test.instanceCount = 273435106L;
        }
        long meth_res = i5 + i6 + i7 + i8 + Float.floatToIntBits(f) + i9 + i10 + FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(long l) {

        int i1=28, i2=59693, i3=12, i4=-3, i11=3, i12=2, iArr2[]=new int[N];
        boolean b=true;
        float f1=40.326F;
        short sArr[]=new short[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(sArr, (short)-25661);
        FuzzerUtils.init(lArr1, 138L);
        FuzzerUtils.init(iArr2, -11);

        for (i1 = 1; i1 < 147; i1++) {
            for (i3 = 1; i3 < 11; i3++) {
                i4 >>= (--i2);
                i4 = (int)(--Test.instanceCount);
                sArr[i1 - 1] = (short)(Test.dArrFld[i3 + 1] * (~(long)(Test.dFld - i1)));
                try {
                    i2 = (i4 / i3);
                    i4 = (55039 / i1);
                    i4 = (i4 / i4);
                } catch (ArithmeticException a_e) {}
            }
            i2 = (int)(((-(l - i3)) + (Test.dFld + i2)) + ((-2 + (i4 - -14L)) - iMeth1()));
            b = b;
            i2 <<= 81;
            lArr1[i1] >>>= i2;
            if (b) {
                for (i11 = i1; i11 < 11; ++i11) {
                    f1 += i3;
                    i12 -= Test.iFld;
                    iArr2[(7 >>> 1) % N] ^= (int)3476318722L;
                }
            } else {
                Test.iFld = -13091;
            }
        }
        long meth_res = l + i1 + i2 + i3 + i4 + (b ? 1 : 0) + i11 + i12 + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i=-163, i14=-119, i15=10, i16=8, i17=8, iArr[]=new int[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -14);
        FuzzerUtils.init(lArr, 1114582987L);

        iArr[(i >>> 1) % N] >>= (i &= i);
        lArr[(i >>> 1) % N] = iArr[(i >>> 1) % N];
        Test.instanceCount %= ((i++) | 1);
        Test.instanceCount -= iMeth(Test.instanceCount);
        switch ((((Test.iFld >>> 1) % 4) * 5) + 33) {
        case 35:
            for (int i13 : iArr) {
                Test.fFld = Test.byFld;
                for (i14 = 1; 4 > i14; ++i14) {
                    Test.byFld = (byte)i14;
                    Test.dFld = Test.instanceCount;
                    Test.fFld += i13;
                }
                for (i16 = 4; i16 > 1; i16--) {
                    i15 <<= Test.iFld;
                }
                i13 *= (int)Test.fFld;
                try {
                    i13 = (Test.iFld / i);
                    i17 = (iArr[(i15 >>> 1) % N] / Test.iFld);
                    i17 = (-13564 / i15);
                } catch (ArithmeticException a_e) {}
            }
            break;
        case 49:
            lArr[(Test.iFld >>> 1) % N] -= -5;
            break;
        case 47:
            Test.byFld = (byte)i;
        case 43:
            Test.iFld += 250;
            break;
        default:
            Test.instanceCount = i17;
        }
        vMeth_check_sum += i + i14 + i15 + i16 + i17 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i18=-21278, i19=-43716, i20=14337, i21=-217, i22=-44207, i23=-35180, i24=-41, i25=-221;
        short s=4699;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -45.888F);

        vMeth();
        Test.instanceCount += -213;
        Test.fFld = 189;
        for (i18 = 8; 318 > i18; ++i18) {
            for (i20 = 2; i20 < 81; i20++) {
                i21 -= (int)Test.instanceCount;
                i19 += (i20 * s);
                lArrFld[i18 - 1] = 44709L;
                i21 = 38347;
                i22 = 1;
                do {
                    Test.iFld += (i22 - s);
                    Test.dFld -= i18;
                    Test.iArrFld[i20] = i22;
                } while (++i22 < 2);
                switch ((((i18 >>> 1) % 4) * 5) + 2) {
                case 8:
                    Test.instanceCount *= i19;
                case 10:
                    for (i23 = 1; i23 < 2; ++i23) {
                        lArrFld[i23 + 1] ^= Test.byFld;
                        if (bFld) continue;
                        if (bFld) {
                            i21 += i23;
                            Test.iArrFld[i20] = Test.byFld;
                            Test.iFld >>= i23;
                        } else if (bFld) {
                            Test.iArrFld = Test.iArrFld;
                            iFld1 = i21;
                        } else {
                            iFld1 |= (int)Test.instanceCount;
                            s &= (short)i19;
                            i24 += (int)(1898665032L + (i23 * i23));
                            Test.iFld *= -2590;
                        }
                        i21 -= 209;
                    }
                    Test.iFld += (((i20 * i21) + i22) - i24);
                    break;
                case 16:
                    fArr[i20 + 1] += 10;
                    break;
                case 18:
                    lArrFld[i20] >>= iFld1;
                    break;
                default:
                    i25 += (((i20 * Test.fFld) + Test.instanceCount) - Test.iFld);
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}