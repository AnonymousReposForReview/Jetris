package tests.javafuzzer2757;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 19:49:27 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3609497139L;
    public static int iFld=-102;
    public static short sFld=-23935;
    public static float fFld=-42.980F;
    public static volatile double dFld=-40.117943;
    public volatile byte byFld=-19;
    public static int iFld1=-156;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];
    public static volatile short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 33503L);
        FuzzerUtils.init(Test.iArrFld, 13297);
        FuzzerUtils.init(Test.sArrFld, (short)-10754);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(long l1, float f3, int i9) {

        int i10=-192, i11=9, i12=-29599, i13=182;
        long l2=3281407890144134559L;

        i10 *= (int)232L;
        i11 = 1;
        do {
            Test.dFld -= -9.86463;
        } while (++i11 < 149);
        i9 = (int)Test.fFld;
        l2 = 1;
        do {
            byte by1=43;
            switch ((int)((l2 % 5) + 18)) {
            case 18:
                Test.iFld ^= by1;
                break;
            case 19:
                Test.iArrFld[(int)(l2)] = i10;
                break;
            case 20:
                Test.iArrFld[(int)(l2)] = i11;
                for (i12 = 1; i12 < 7; ++i12) {
                    i10 += i10;
                    i10 += (((i12 * Test.sFld) + i11) - Test.iFld);
                    Test.sFld += (short)i12;
                    Test.iArrFld[(int)(l2 + 1)] = Test.iFld;
                    Test.sArrFld[(int)(l2)] += (short)i13;
                }
                break;
            case 21:
                i13 >>= i12;
                break;
            case 22:
                by1 = (byte)i12;
                break;
            default:
                Test.instanceCount <<= l2;
            }
        } while (++l2 < 244);
        long meth_res = l1 + Float.floatToIntBits(f3) + i9 + i10 + i11 + l2 + i12 + i13;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1() {

        double d=1.23756;
        int i8=-5, i14=3, i15=-28063;
        float f4=-1.712F;
        byte by2=-44;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, true);

        Test.fFld = Test.instanceCount;
        for (long l : Test.lArrFld) {
            for (d = 1; d < 4; d++) {
                Test.instanceCount += (long)(d * i8);
                if (bArr[(int)(d - 1)]) break;
                Test.lArrFld[(int)(d + 1)] >>>= (Integer.reverseBytes(i8) * (Test.iArrFld[(int)(d)]--));
                i8 *= i8;
                Test.iFld = Math.max((int)(iMeth(l, f4, Test.iFld) + Test.fFld), i8);
                for (i14 = (int)(d); i14 < 2; ++i14) {
                    Test.iFld = i14;
                    i15 >>= i8;
                    switch ((((i14 >>> 1) % 2) * 5) + 111) {
                    case 117:
                        i15 = Test.iFld;
                        by2 += (byte)(((i14 * Test.instanceCount) + i15) - Test.iFld);
                    case 115:
                        Test.instanceCount = Test.iFld;
                        break;
                    default:
                        Test.dFld -= l;
                    }
                }
            }
        }
        vMeth1_check_sum += Double.doubleToLongBits(d) + i8 + Float.floatToIntBits(f4) + i14 + i15 + by2 +
            FuzzerUtils.checkSum(bArr);
    }

    public void vMeth(int i2, byte by) {

        int i3=-60742, i4=38382, i5=-4, i6=-124, i7=109;
        float f2=-2.709F;

        i3 = 1;
        while (++i3 < 391) {
            for (i4 = i3; i4 < 4; i4++) {
                Test.iFld = Test.iArrFld[i4 + 1];
                for (i6 = i3; i6 < 1; i6++) {
                    f2 = by;
                    vMeth1();
                    Test.fFld += i6;
                    Test.instanceCount += i4;
                    Test.iArrFld[i3] += by;
                    i2 = 10097;
                    Test.iFld += (i6 * i6);
                    i5 = i7;
                }
                by ^= by;
                i5 += i4;
                i5 = 44080;
            }
        }
        vMeth_check_sum += i2 + by + i3 + i4 + i5 + i6 + i7 + Float.floatToIntBits(f2);
    }

    public void mainTest(String[] strArr1) {

        float f=-1.151F, f1=67.621F;
        int i=14, i1=8, i16=68, i17=-173, i18=-126, i19=-6, i20=-240, i21=-179, i22=-252;

        Test.iFld = (int)(((Test.sFld--) + (Test.iFld--)) + ((Test.instanceCount + f) + (-52595 - (3 + (-14 |
            (Test.iFld--))))));
        for (i = 7; i < 313; i++) {
            i1 ^= (--i1);
            f1 = 1;
            do {
                f *= Test.lArrFld[i - 1];
                i1 = (Test.iFld++);
            } while (++f1 < 82);
        }
        vMeth(i1, byFld);
        for (i16 = 4; i16 < 277; ++i16) {
            i17 = i;
        }
        i1 <<= i17;
        Test.fFld *= 15006;
        switch (((i16 >>> 1) % 6) + 6) {
        case 6:
            i1 = i1;
            Test.lArrFld[(i17 >>> 1) % N] >>>= i16;
            break;
        case 7:
            Test.iFld &= Test.iFld;
            break;
        case 8:
            Test.instanceCount = i;
            for (i18 = 240; i18 > 10; i18 -= 3) {
                for (i20 = i18; i20 < 329; ++i20) {
                    i22 = 1;
                    do {
                        Test.instanceCount &= i17;
                        Test.iFld += (int)Test.fFld;
                        Test.sArrFld[(i19 >>> 1) % N] = (short)Test.dFld;
                        i21 += i22;
                        Test.instanceCount *= i17;
                        i1 += (int)Test.instanceCount;
                        Test.fFld -= -34522;
                    } while (++i22 < 1);
                    i1 *= i;
                    i17 -= -172;
                    i19 = i17;
                    Test.sFld += (short)i20;
                }
            }
        case 9:
            Test.dFld += 62321;
            break;
        case 10:
            Test.instanceCount = (long)Test.dFld;
            break;
        case 11:
            Test.iArrFld[(0 >>> 1) % N] ^= (int)-3857868891L;
            break;
        default:
            Test.iArrFld[(Test.iFld1 >>> 1) % N] = -3;
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
