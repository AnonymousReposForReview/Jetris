package tests.javafuzzer2983;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 00:26:38 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-15686L;
    public static short sFld=-4139;
    public static boolean bFld=true;
    public int iArrFld[]=new int[N];
    public volatile short sArrFld[]=new short[N];

    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(float f1, int i4) {

        float f2=106.962F;
        int i5=11, i6=46, i7=-12393;

        f2 = 1;
        while (++f2 < 307) {
            for (i5 = 5; i5 > 1; i5 -= 2) {
                if (i5 != 0) {
                }
                i6 += (i5 ^ Test.instanceCount);
                i6 *= Test.sFld;
                f1 = i4;
                i6 += (int)Test.instanceCount;
                Test.instanceCount += (((i5 * i4) + Test.instanceCount) - i4);
                i7 = 1;
                while ((i7 += 2) < 3) {
                    i4 = (int)Test.instanceCount;
                    if (Test.bFld) break;
                    Test.instanceCount = -2390;
                    i6 += (int)1.216F;
                    Test.instanceCount *= 16201;
                    i6 = i4;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f1) + i4 + Float.floatToIntBits(f2) + i5 + i6 + i7;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i3, long l1) {

        float f3=-2.212F;
        int i8=203, iArr[]=new int[N];
        byte by=-97, byArr[]=new byte[N];

        FuzzerUtils.init(iArr, -41606);
        FuzzerUtils.init(byArr, (byte)-106);

        iMeth1(f3, i3);
        switch (((i3 >>> 1) % 1) + 117) {
        case 117:
        }
        iArr[(i3 >>> 1) % N] &= i3;
        i8 = 1;
        do {
            Test.bFld = Test.bFld;
            byArr[i8] -= (byte)i3;
            i3 = by;
            i3 += i8;
            if (Test.bFld) {
                i3 += i8;
                i3 = (int)Test.instanceCount;
            } else if (Test.bFld) {
                l1 += (((i8 * i8) + i8) - l1);
                Test.instanceCount += i8;
            } else if (Test.bFld) {
                i3 = by;
                i3 += (i8 * l1);
            } else {
                if (i3 != 0) {
                }
            }
        } while (++i8 < 213);
        long meth_res = i3 + l1 + Float.floatToIntBits(f3) + i8 + by + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(byArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(int i1, int i2, long l) {

        float f=66.52F;
        int i9=-82, i10=35129, i11=17191, i12=-6, i13=212, i14=-60922, i15=2, iArr1[]=new int[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 5328892346261031075L);
        FuzzerUtils.init(iArr1, -6);

        f *= Math.min((int)(iMeth(i1, l) - l), i1);
        i1 %= -179;
        Test.bFld = Test.bFld;
        i2 = i1;
        for (i9 = 271; i9 > 11; --i9) {
            i11 = 1;
            while (++i11 < 6) {
                i1 += i2;
            }
            f -= i2;
        }
        i1 >>= i11;
        i1 = -9;
        lArr[(i2 >>> 1) % N] |= Test.instanceCount;
        for (i12 = 11; i12 < 359; i12++) {
            for (i14 = 5; i14 > i12; --i14) {
                l += (i14 * i14);
                iArr1[i12] >>>= i2;
            }
        }
        long meth_res = i1 + i2 + l + Float.floatToIntBits(f) + i9 + i10 + i11 + i12 + i13 + i14 + i15 +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=89, i16=-32834, i17=131, i18=0, i19=-32702, i20=-160, i21=-52983, i22=158, i23=8, i24=-13;
        double d=-106.25006;
        float f4=2.142F;

        i -= (int)(-1105115660L | lMeth(i, i, Test.instanceCount));
        i = -40;
        Test.instanceCount = i;
        i16 = 1;
        while (++i16 < 144) {
            Test.instanceCount -= i16;
            iArrFld[i16 + 1] -= i;
            for (i17 = 8; i17 < 174; i17++) {
                iArrFld[i16] *= (int)1.813F;
            }
            for (i19 = 5; i19 < 174; ++i19) {
                i20 = Test.sFld;
                for (d = 1; d < 2; d++) {
                    f4 = f4;
                    iArrFld = iArrFld;
                    i21 = i;
                    i <<= i18;
                    switch ((int)((d % 1) + 3)) {
                    case 3:
                        iArrFld[i16 - 1] += (int)Test.instanceCount;
                        f4 = Test.instanceCount;
                        f4 += (float)(d - i20);
                        i18 = (int)Test.instanceCount;
                    }
                    sArrFld[i16 + 1] += (short)Test.instanceCount;
                }
                i21 -= i18;
                switch ((((i18 >>> 1) % 1) * 5) + 46) {
                case 48:
                    for (i22 = 1; i22 < 2; i22++) {
                        iArrFld[i22 + 1] = 165;
                        i24 += i22;
                        try {
                            i = (i24 / -7983);
                            i23 = (-19122 % i17);
                            i = (i16 % i16);
                        } catch (ArithmeticException a_e) {}
                        i += (i22 * i);
                        Test.instanceCount += (i22 - Test.instanceCount);
                    }
                    i21 = i21;
                    break;
                default:
                    iArrFld[i19] = i21;
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
