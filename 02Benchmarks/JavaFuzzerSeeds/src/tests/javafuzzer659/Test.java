package tests.javafuzzer659;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 07:31:52 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=2992591401735066993L;
    public static float fFld=-85.84F;
    public static byte byFld=89;
    public static double dFld=-2.126653;
    public boolean bFld=false;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -37);
    }

    public static long bMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(float f, double d1) {

        int i10=5, i11=11, i12=10289, i13=-123, i14=180;
        boolean b1=true;
        double d2=0.84654;

        Test.iArrFld[(-1165 >>> 1) % N] += i10;
        for (i11 = 14; i11 < 294; i11++) {
            Test.fFld += (((i11 * i10) + f) - Test.instanceCount);
            if (b1) {
                i12 = i12;
            }
            for (d2 = i11; d2 < 6; ++d2) {
                if (b1) break;
                i13 >>= i10;
                i13 += (int)((long)d2 ^ i13);
                i13 -= -5;
            }
            try {
                i13 = (-57226 / Test.iArrFld[i11 - 1]);
                Test.iArrFld[i11 + 1] = (-33465 / Test.iArrFld[i11 - 1]);
                i10 = (Test.iArrFld[i11] % i12);
            } catch (ArithmeticException a_e) {}
            i10 += i11;
            i14 = 1;
            do {
                Test.instanceCount = i13;
                Test.instanceCount += (-2796095231L + (i14 * i14));
            } while (++i14 < 6);
        }
        long meth_res = Float.floatToIntBits(f) + Double.doubleToLongBits(d1) + i10 + i11 + i12 + (b1 ? 1 : 0) +
            Double.doubleToLongBits(d2) + i13 + i14;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i5, int i6, int i7) {

        boolean b=true;
        int i8=47, i9=-103, i15=234;
        short s1=-29227;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -4006809113L);

        for (long l : lArr) {
            if (b || (i7 >= (i5 - (-(i6 * i5))))) continue;
            for (i8 = 1; 4 > i8; i8 += 3) {
                Test.iArrFld[i8] *= (int)Test.fFld;
                l = (0 + ((Test.byFld - i6) >> iMeth(-2.51F, Test.dFld)));
                Test.dFld += i5;
            }
        }
        i7 += -25731;
        b = b;
        s1 -= (short)i8;
        i15 = 1;
        while (++i15 < 157) {
            Test.dFld = Test.dFld;
            i9 -= i6;
            if (b) continue;
            b = b;
            i7 += (int)(2201224775L + (i15 * i15));
        }
        vMeth_check_sum += i5 + i6 + i7 + (b ? 1 : 0) + i8 + i9 + s1 + i15 + FuzzerUtils.checkSum(lArr);
    }

    public boolean bMeth(short s) {

        int i3=-147, i4=-139, i17=54, i18=-14;
        boolean b2=false;

        for (i3 = 14; 369 > i3; i3++) {
            if (false) {
                vMeth(-13, i4, i4);
            } else if (b2) {
                Test.iArrFld[i3] -= -12;
                if (b2) break;
                Test.iArrFld[i3 - 1] = i3;
                Test.instanceCount = i4;
            } else if (b2) {
                if (i4 != 0) {
                    return ((int)(s + i3 + i4 + (b2 ? 1 : 0) + i17 + i18)) % 2 > 0;
                }
            } else {
                Test.iArrFld[i3] ^= s;
                return ((int)(s + i3 + i4 + (b2 ? 1 : 0) + i17 + i18)) % 2 > 0;
            }
            i4 >>= i3;
            Test.fFld -= -52569;
            for (i17 = 1; i17 < 5; ++i17) {
                i18 = (int)Test.instanceCount;
                i4 = -48684;
                Test.instanceCount += (235 + (i17 * i17));
            }
        }
        long meth_res = s + i3 + i4 + (b2 ? 1 : 0) + i17 + i18;
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void mainTest(String[] strArr1) {

        double d=1.93858;
        int i=9, i1=166, i2=-51235, i19=-71, i20=-73;
        short s2=-21463;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 0.1003F);

        for (d = 7; d < 148; ++d) {
            i += (int)d;
            i1 = 1;
            do {
                i -= (i--);
                i2 = 1;
                do {
                    if (bMeth(s2)) break;
                    Test.iArrFld[i2 - 1] += (int)Test.instanceCount;
                } while (++i2 < 1);
                if (bFld) break;
                i <<= (int)Test.instanceCount;
                Test.instanceCount += (i1 ^ s2);
                for (i19 = i1; i19 < 1; ++i19) {
                    i = (int)Test.instanceCount;
                    i20 &= i20;
                    Test.instanceCount -= i19;
                    if (bFld) {
                        Test.iArrFld[(int)(d)] += i;
                        i -= i20;
                        fArr[(int)(d + 1)] += Test.fFld;
                        Test.dFld *= Test.fFld;
                    } else if (false) {
                        i += (i19 * i19);
                        i20 = i;
                        i20 -= (int)Test.fFld;
                        Test.byFld = (byte)i19;
                    } else {
                        Test.iArrFld[i19 - 1] += i20;
                    }
                    Test.dFld = 75.212F;
                    i20 *= s2;
                    Test.byFld += (byte)(((i19 * i1) + i19) - i);
                    i += i19;
                    Test.iArrFld = Test.iArrFld;
                }
                try {
                    i = (i / -1867474582);
                    i = (Test.iArrFld[(i1 >>> 1) % N] % i2);
                    Test.iArrFld[i1 + 1] = (56213 % i1);
                } catch (ArithmeticException a_e) {}
            } while (++i1 < 178);
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
//DEBUG  bMeth ->  bMeth mainTest
//DEBUG  vMeth ->  vMeth bMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth bMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
