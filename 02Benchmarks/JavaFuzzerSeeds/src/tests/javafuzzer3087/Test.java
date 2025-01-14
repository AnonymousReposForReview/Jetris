package tests.javafuzzer3087;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 01:34:41 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3L;
    public static double dFld=68.109525;
    public static boolean bFld=false;
    public static int iFld=36026;
    public static volatile float fFld=0.1010F;
    public static short sFld=-18137;
    public static int iArrFld[]=new int[N];
    public static volatile float fArrFld[]=new float[N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 79);
        FuzzerUtils.init(Test.fArrFld, -1.213F);
        FuzzerUtils.init(Test.bArrFld, true);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(float f) {

        long l=-7L;
        int i5=6547, i6=-3, i7=-160, i8=24302, i9=64090, i10=-179, iArr[]=new int[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr, 2);
        FuzzerUtils.init(fArr, 0.209F);

        for (int i4 : iArr) {
            iArr[(i4 >>> 1) % N] -= (int)Test.dFld;
            i4 -= i4;
            for (l = 1; l < 4; l++) {
                fArr[(int)(l)] -= i4;
                i4 -= (int)Test.instanceCount;
            }
        }
        i6 = 1;
        while (++i6 < 274) {
            if (Test.bFld) {
                for (i7 = i6; i7 < 6; ++i7) {
                    for (i9 = 1; i9 < 1; ++i9) {
                        i10 += (i9 * i9);
                        Test.dFld -= i9;
                        i10 *= (int)Test.instanceCount;
                        i8 = (int)3096852060L;
                        i10 += i8;
                    }
                }
            } else if (Test.bFld) {
                i8 *= -43;
            } else {
                i10 -= i10;
            }
        }
        long meth_res = Float.floatToIntBits(f) + l + i5 + i6 + i7 + i8 + i9 + i10 + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(boolean b, double d1) {

        int i2=-26090, i11=-134;
        float f1=-1.469F;
        short s1=8947;

        i2 = 1;
        while (++i2 < 127) {
            int i3=63;
            short s=-4795;
            i3 *= (iMeth1(f1) / (i3 | 1));
            Test.iArrFld[i2 - 1] = (int)f1;
            i3 = (int)Test.instanceCount;
            i3 += i3;
            i3 += i2;
            i3 += (((i2 * i2) + i2) - Test.instanceCount);
            i3 = s;
        }
        i11 <<= i2;
        Test.instanceCount += -1624105324L;
        s1 &= (short)i2;
        if (Test.bFld) {
            Test.instanceCount = s1;
            Test.iArrFld[(i2 >>> 1) % N] = 92;
            i11 ^= i11;
        } else if (Test.bFld) {
            i11 += i11;
        } else {
            Test.instanceCount |= Test.iFld;
        }
        long meth_res = (b ? 1 : 0) + Double.doubleToLongBits(d1) + i2 + Float.floatToIntBits(f1) + i11 + s1;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(double d) {

        int i=-6, i1=203, i12=-154;
        byte by=-22;
        boolean bArr[]=new boolean[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(lArr, 167L);

        for (i = 2; i < 190; i++) {
            Test.instanceCount += iMeth(Test.bFld, Test.dFld);
            Test.fArrFld[i] += i;
            switch ((i % 2) + 108) {
            case 108:
                i1 >>= (int)Test.instanceCount;
                bArr[i + 1] = Test.bFld;
                Test.fFld -= Test.instanceCount;
                break;
            case 109:
                Test.iArrFld[i] -= i1;
                Test.fFld *= Test.fFld;
                lArr[i + 1] = Test.iFld;
                break;
            default:
                i12 = 1;
                while (++i12 < 8) {
                    switch (((i >>> 1) % 1) + 99) {
                    case 99:
                    default:
                        Test.dFld = 12;
                        by = (byte)Test.instanceCount;
                        Test.instanceCount += (-96 + (i12 * i12));
                    }
                }
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i + i1 + i12 + by + FuzzerUtils.checkSum(bArr) +
            FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i14=40223, i15=9, i16=6, i17=-190, i18=2, i19=24, i20=-63281, i21=-30624, i22=-63210, i23=127, i24=-223,
            i25=3, i26=4, i27=29325;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 241536478863034419L);

        vMeth(75.70737);
        for (int i13 : Test.iArrFld) {
            Test.iArrFld = FuzzerUtils.int1array(N, (int)-4);
            for (i14 = 2; i14 < 63; ++i14) {
                short s2=-14124;
                s2 += (short)Test.iFld;
                Test.dFld = Test.fFld;
                for (i16 = 1; 2 > i16; ++i16) {
                    Test.fFld = (float)Test.dFld;
                    i15 += (int)Test.instanceCount;
                    Test.dFld *= Test.instanceCount;
                    Test.instanceCount *= i15;
                    Test.iFld *= i15;
                }
            }
            Test.iArrFld[(i13 >>> 1) % N] >>>= i17;
            for (i18 = 1; i18 < 63; i18++) {
                lArr1[i18] *= (long)2.53279;
                for (i20 = 2; i20 > 1; i20--) {
                    Test.instanceCount += (i20 | i17);
                }
            }
            if (Test.bFld) {
                Test.bArrFld[(i15 >>> 1) % N] = Test.bFld;
                for (i22 = 2; i22 < 63; i22++) {
                    i15 %= (int)(Test.iFld | 1);
                    for (i24 = 1; i24 < 2; ++i24) {
                        Test.dFld -= i14;
                        Test.iFld *= i20;
                        Test.instanceCount -= i16;
                        Test.instanceCount = i17;
                        i23 &= 5;
                    }
                    for (i26 = 1; i26 < 2; i26++) {
                        i13 = Test.iFld;
                        Test.sFld -= (short)Test.iFld;
                    }
                }
            } else if (Test.bFld) {
                i15 -= i23;
            } else {
                Test.iFld -= (int)Test.instanceCount;
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
