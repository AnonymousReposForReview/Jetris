package tests.javafuzzer1022;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 12:55:21 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-21265L;
    public static float fFld=18.240F;
    public static short sFld=-16650;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 888744600612648152L);
        FuzzerUtils.init(Test.iArrFld, -190);
    }

    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static void vMeth(int i4, long l) {

        int i5=-13884;

        i5 = 1;
        while (++i5 < 247) {
            i4 *= (--i4);
            i4 = (int)(l++);
        }
        vMeth_check_sum += i4 + l + i5;
    }

    public static int iMeth1(int i10, short s, double d1) {

        int i11=196, i12=-59488, i13=59294, i14=-111, i15=95, i16=-64697, i17=83;
        double d2=2.28680;
        byte by=-26;
        long l1=-7326552345620939482L;

        i10 = (int)Test.instanceCount;
        i10 /= (int)(i10 | 1);
        for (i11 = 5; i11 < 172; ++i11) {
            for (d2 = i11; d2 < 9; d2++) {
                by += (byte)i13;
                i14 = 1;
                while (++i14 < 1) {
                    Test.fFld = i12;
                    Test.instanceCount += -76;
                }
            }
            for (i15 = 9; i15 > 1; i15--) {
                for (l1 = 1; l1 < 2; ++l1) {
                    Test.iArrFld[(int)(l1)] += -3;
                    i16 += (int)(l1 - l1);
                    i16 += 1;
                }
                i10 += (int)2019205554194053722L;
                i13 |= i10;
            }
        }
        long meth_res = i10 + s + Double.doubleToLongBits(d1) + i11 + i12 + Double.doubleToLongBits(d2) + i13 + by +
            i14 + i15 + i16 + l1 + i17;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i6, double d, int i7) {

        int i8=-30, i9=-88, i18=-40747;

        i8 = 1;
        while (++i8 < 365) {
            Test.instanceCount &= Test.iArrFld[i8 + 1];
            i9 = 1;
            while (++i9 < 5) {
                Test.iArrFld[i8 + 1] *= (++i7);
                i6 += (iMeth1(i7, Test.sFld, -2.69745) * i7);
                i18 = 1;
                do {
                    Test.instanceCount >>= i7;
                } while (--i18 > 0);
                Test.iArrFld[i8] += (int)Test.instanceCount;
                i6 += (int)Test.instanceCount;
                i6 -= i18;
                Test.instanceCount += (i9 * i9);
                Test.instanceCount = i6;
                d = i9;
                Test.instanceCount &= Test.sFld;
            }
            d -= Test.instanceCount;
        }
        long meth_res = i6 + Double.doubleToLongBits(d) + i7 + i8 + i9 + i18;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static float fMeth(int i3) {

        double d3=0.81089;

        vMeth((i3++) - ((++Test.iArrFld[(-19877 >>> 1) % N]) + iMeth(i3, d3, i3)), Test.instanceCount);
        i3 |= i3;
        Test.iArrFld[(i3 >>> 1) % N] = i3;
        i3 |= 4;
        Test.iArrFld[(i3 >>> 1) % N] -= i3;
        long meth_res = i3 + Double.doubleToLongBits(d3);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=5, i1=-233, i2=14510, i19=-13, i20=-254, i21=-190, i22=2, i23=-3;
        byte by1=-125;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)26432);

        i = 1;
        do {
            for (i1 = 6; i1 < 103; i1++) {
                Test.instanceCount -= (long)((Test.fFld++) * i1);
                i2 += (int)(--Test.lArrFld[i1 - 1]);
            }
            Test.iArrFld[i] -= (int)(fMeth(i2) - i1);
            Test.instanceCount += i;
        } while (++i < 245);
        for (i19 = 2; i19 < 362; ++i19) {
            boolean b=false;
            i2 ^= i;
            i20 <<= i;
            Test.instanceCount += (long)Test.fFld;
            Test.iArrFld[i19] = (int)Test.instanceCount;
            if (b) continue;
            i21 = 1;
            while (++i21 < 70) {
                switch (((i21 % 4) * 5) + 106) {
                case 125:
                    Test.lArrFld[i21 + 1] = i;
                    break;
                case 107:
                    i20 |= -3;
                case 120:
                    by1 <<= (byte)-7183;
                    i20 &= by1;
                    break;
                case 109:
                    switch ((i19 % 2) + 33) {
                    case 33:
                        try {
                            i2 = (i1 % i21);
                            Test.iArrFld[i21] = (i1 / i21);
                            i2 = (Test.iArrFld[i19 - 1] % i2);
                        } catch (ArithmeticException a_e) {}
                        Test.sFld <<= Test.sFld;
                        try {
                            i20 = (19 % i21);
                            Test.iArrFld[i21] = (-210 / i);
                            Test.iArrFld[i21 - 1] = (i2 % Test.iArrFld[i21 - 1]);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 34:
                        i20 += (int)Test.instanceCount;
                    default:
                        for (i22 = 1; i22 > 1; --i22) {
                            i20 += (((i22 * i21) + i22) - by1);
                            Test.instanceCount >>= i1;
                            sArr[i19] = (short)i21;
                        }
                    }
                    break;
                }
                Test.sFld += (short)(i21 * Test.instanceCount);
                i2 >>= 32609;
                i20 >>= i1;
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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  iMeth ->  iMeth fMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}