package tests.javafuzzer648;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 07:25:12 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-9L;
    public static byte byFld=42;
    public static short sFld=17269;
    public static double dFld=0.64901;
    public int iFld=22273;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(float f, long l1) {

        int i5=14, i6=-4, i7=-3, i8=242, iArr[]=new int[N];
        double d=1.55902, dArr[]=new double[N];
        short s=-1551;

        FuzzerUtils.init(dArr, 2.125667);
        FuzzerUtils.init(iArr, -12);

        for (i5 = 13; i5 < 337; i5++) {
            i6 += (int)Test.instanceCount;
        }
        f -= i5;
        dArr[(i5 >>> 1) % N] = 35105;
        iArr[(i6 >>> 1) % N] -= (int)d;
        iArr[(i5 >>> 1) % N] += i6;
        iArr[(i6 >>> 1) % N] ^= i5;
        i6 >>= 6657;
        i6 += (int)-453620402L;
        for (i7 = 5; i7 < 200; ++i7) {
            iArr[i7] <<= i6;
            i6 *= s;
            i8 >>= i6;
            iArr[i7] <<= i7;
            i6 >>= -5;
        }
        long meth_res = Float.floatToIntBits(f) + l1 + i5 + i6 + Double.doubleToLongBits(d) + i7 + i8 + s +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(long l) {

        int i2=-13, i3=-9, i4=11, i9=1972, i10=60831, i11=0, i12=-236, i13=232;
        boolean b=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -50192L);

        switch ((((i2--) >>> 1) % 5) + 3) {
        case 3:
            i2 = (int)Test.instanceCount;
            for (i3 = 300; i3 > 15; i3 -= 2) {
                float f1=38.223F;
                i2 <<= Math.abs(iMeth(f1, Test.instanceCount));
                i2 -= 207;
                i4 -= i4;
                i4 += (((i3 * i4) + f1) - i2);
            }
            lArr[(i2 >>> 1) % N] += i3;
            break;
        case 4:
            b = b;
            for (i9 = 2; i9 < 177; ++i9) {
                for (i11 = 1; i11 < 9; i11++) {
                    i13 = 1;
                    while (++i13 < 2) {
                        lArr[i9] = i3;
                        i12 ^= Test.byFld;
                        l += (-55950 + (i13 * i13));
                    }
                }
            }
        case 5:
            i12 = (int)l;
            break;
        case 6:
            i4 -= i3;
            break;
        case 7:
            i12 >>>= i11;
            break;
        default:
            b = b;
        }
        vMeth1_check_sum += l + i2 + i3 + i4 + (b ? 1 : 0) + i9 + i10 + i11 + i12 + i13 + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i, int i1) {

        int i14=-19818, i15=-13, i16=87, i17=-167, iArr1[]=new int[N];
        boolean b1=true;

        FuzzerUtils.init(iArr1, -195);

        vMeth1(Test.instanceCount);
        i14 = 1;
        while (++i14 < 334) {
            switch (((i14 >>> 1) % 5) + 34) {
            case 34:
                i15 = 1;
                while (++i15 < 5) {
                    iArr1[i14 + 1] >>= -12683;
                    for (i16 = 1; i16 < 1; ++i16) {
                        switch ((i15 % 10) + 28) {
                        case 28:
                            try {
                                i = (i14 / iArr1[i16 + 1]);
                                iArr1[i16] = (i1 % 133);
                                iArr1[i16] = (iArr1[i14] % i1);
                            } catch (ArithmeticException a_e) {}
                            i1 += (((i16 * Test.byFld) + i16) - i1);
                            Test.instanceCount += Test.sFld;
                        case 29:
                            i17 = i1;
                            break;
                        case 30:
                            i17 += (i16 * Test.instanceCount);
                            i *= i1;
                            Test.instanceCount = 54684;
                            i1 += (int)Test.dFld;
                            break;
                        case 31:
                            Test.dFld = -178;
                        case 32:
                            Test.instanceCount += -21906;
                        case 33:
                        case 34:
                            Test.dFld = Test.sFld;
                            break;
                        case 35:
                            i17 = i17;
                            break;
                        case 36:
                            iArr1 = iArr1;
                            break;
                        case 37:
                            Test.instanceCount >>= 108L;
                        }
                    }
                }
                break;
            case 35:
                if (b1) break;
                break;
            case 36:
                i ^= i;
                break;
            case 37:
                i17 += i14;
                break;
            case 38:
                if (i != 0) {
                    vMeth_check_sum += i + i1 + i14 + i15 + i16 + i17 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr1);
                    return;
                }
                break;
            }
        }
        vMeth_check_sum += i + i1 + i14 + i15 + i16 + i17 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i18=10, i19=-6, i20=-11377, i21=-12, i22=113, iArr2[]=new int[N];
        long l2=1122307425L, l3=15980L, lArr1[]=new long[N];
        float f2=0.397F;

        FuzzerUtils.init(iArr2, -99);
        FuzzerUtils.init(lArr1, 0L);

        vMeth(33092, -8);
        Test.dFld += i18;
        l2 = 1;
        do {
            i18 += i18;
            i19 = 1;
            while (++i19 < 76) {
                f2 = 1;
                do {
                    iArr2[(int)(l2 - 1)] *= i19;
                    i18 += i18;
                    i18 <<= 11070;
                } while (++f2 < 1);
                i18 -= (int)f2;
                Test.instanceCount += (((i19 * i19) + Test.instanceCount) - Test.instanceCount);
                lArr1[i19 + 1] = i18;
                iArr2 = iArr2;
                for (l3 = 1; l3 < 1; ++l3) {
                    i20 += i20;
                    i20 = (int)f2;
                    i18 -= (int)l2;
                    iArr2[(int)(l3 + 1)] = (int)Test.instanceCount;
                }
                for (i21 = 1; i21 < 1; i21++) {
                    i18 -= i18;
                    i22 -= (int)Test.instanceCount;
                    i20 += (i21 + Test.instanceCount);
                    i22 <<= i20;
                    iFld += (i21 ^ i21);
                    switch ((((2028 >>> 1) % 2) * 5) + 18) {
                    case 23:
                        i20 += (i21 ^ iFld);
                        i22 = i18;
                        iArr2[(int)(l2 - 1)] = (int)-2.17734;
                        try {
                            iFld = (i18 % iFld);
                            iArr2[i21 + 1] = (iFld / i19);
                            iArr2[(int)(l2 + 1)] = (i18 / 40999);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 26:
                        Test.instanceCount -= i18;
                    }
                }
            }
        } while (++l2 < 329);



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
