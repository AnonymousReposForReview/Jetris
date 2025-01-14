package tests.javafuzzer3078;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 01:32:41 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=4949325350087360391L;
    public static boolean bFld=true;
    public volatile double dFld=-75.89664;
    public short sFld=-13265;
    public static int iArrFld[]=new int[N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 144);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static void vSmallMeth(int i1, int i2, int i3) {

        float f=0.801F;
        int iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, -7);

        iArr1[(i2 >>> 1) % N] = (int)(i2 >> (long)(i2 + (i2 - f)));
        vSmallMeth_check_sum += i1 + i2 + i3 + Float.floatToIntBits(f) + FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth(long l, boolean b, int i8) {

        int i9=-56335, i10=10, i11=5, i12=-12, i13=-138, i14=-2212;
        float f1=22.742F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 140L);

        for (i9 = 14; i9 < 299; ++i9) {
            for (i11 = 1; i11 < 6; ++i11) {
                b = b;
                i10 += i8;
                for (i13 = 2; i13 > 1; i13 -= 2) {
                    Test.instanceCount = i13;
                    i8 += i13;
                    b = b;
                    switch ((i11 % 2) * 5) {
                    case 3:
                        Test.iArrFld[i13] -= -139;
                        i12 -= (int)Test.instanceCount;
                    case 7:
                        i8 += i13;
                        break;
                    default:
                        lArr[i13 + 1] = i8;
                        i8 %= (int)((long)(f1) | 1);
                        Test.instanceCount = Test.instanceCount;
                    }
                }
            }
        }
        long meth_res = l + (b ? 1 : 0) + i8 + i9 + i10 + i11 + i12 + i13 + i14 + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1() {

        int i7=-47, i15=2, i16=-226, iArr2[]=new int[N];
        short s=14008;
        double d1=-121.13983;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(iArr2, -6357);
        FuzzerUtils.init(bArr, false);

        iArr2[(i7 >>> 1) % N] >>= Math.max(iMeth(Test.instanceCount, Test.bFld, -11), i7);
        if (Test.bFld) {
            bArr[(i7 >>> 1) % N] = Test.bFld;
            i7 -= i7;
        } else {
            Test.instanceCount -= 44180;
            Test.iArrFld[(i7 >>> 1) % N] ^= i7;
            iArr2[(i7 >>> 1) % N] ^= i7;
        }
        s = (short)d1;
        i7 = i7;
        iArr2[(i7 >>> 1) % N] = -13446;
        for (i15 = 11; i15 < 366; ++i15) {
            i7 *= (int)d1;
            i7 >>>= i15;
            i16 >>= (int)9L;
            Test.instanceCount = i15;
        }
        vMeth1_check_sum += i7 + s + Double.doubleToLongBits(d1) + i15 + i16 + FuzzerUtils.checkSum(iArr2) +
            FuzzerUtils.checkSum(bArr);
    }

    public static void vMeth(double d, int i6) {

        int i17=63185, i18=-231, i19=3, i20=112, i21=116;
        float f2=-2.671F;
        long l1=19L;
        short s1=-3252;

        vMeth1();
        for (i17 = 1; 161 > i17; i17++) {
            for (i19 = 10; 1 < i19; i19 -= 2) {
                i20 >>= -34594;
                f2 *= i19;
                i20 -= (int)l1;
                l1 ^= Test.instanceCount;
                i21 = 1;
                while (++i21 < 3) {
                    s1 = (short)Test.instanceCount;
                    switch ((i19 % 3) + 1) {
                    case 1:
                        i6 = i21;
                        break;
                    case 2:
                        s1 <<= (short)i6;
                    case 3:
                        Test.iArrFld[i21] = (int)f2;
                        if (i18 != 0) {
                            vMeth_check_sum += Double.doubleToLongBits(d) + i6 + i17 + i18 + i19 + i20 +
                                Float.floatToIntBits(f2) + l1 + i21 + s1;
                            return;
                        }
                        f2 += i21;
                    }
                }
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i6 + i17 + i18 + i19 + i20 + Float.floatToIntBits(f2) + l1 +
            i21 + s1;
    }

    public void mainTest(String[] strArr1) {

        int i=62440, i4=24933, i5=-237, i22=-35, i23=-12927, i24=7, i25=38324, i26=-39674, i27=1, i28=11, iArr[]=new
            int[N];
        float f3=-1.131F;
        byte by=100;
        double dArr[][]=new double[N][N];

        FuzzerUtils.init(iArr, 130);
        FuzzerUtils.init(dArr, 2.35070);

        iArr[(i >>> 1) % N] *= (int)Test.instanceCount;
        for (int smallinvoc=0; smallinvoc<947; smallinvoc++) vSmallMeth(i4 = ((i4 - i5) - (i4--)), -(i++), iArr[(-116
            >>> 1) % N] + i4);
        vMeth(dFld, i);
        for (i22 = 5; 213 > i22; i22++) {
            i4 += (i22 + f3);
            if (Test.bFld) {
                for (i24 = 3; i24 < 121; i24++) {
                    dFld += i23;
                    Test.instanceCount *= -13194;
                    i5 >>= i24;
                    iArr[i22 + 1] *= i5;
                    switch (((i25 >>> 1) % 9) + 14) {
                    case 14:
                        i26 &= -251;
                        i26 += (i24 ^ i);
                        Test.instanceCount -= Test.instanceCount;
                        dArr[i22] = FuzzerUtils.double1array(N, (double)2.108729);
                    case 15:
                        Test.instanceCount = sFld;
                        for (i27 = i22; i27 < 2; i27++) {
                            sFld = (short)i25;
                            Test.instanceCount = i5;
                            i4 <<= i24;
                            i23 = i;
                            i4 >>= i27;
                            Test.instanceCount = i25;
                            i5 += i24;
                            lArrFld[i24 + 1] = Test.instanceCount;
                            f3 = 0;
                        }
                        if (Test.bFld) {
                            i4 += (((i24 * i4) + i27) - i26);
                        } else if (true) {
                            f3 += i24;
                        }
                        break;
                    case 16:
                        i5 = (int)-1689710506L;
                    case 17:
                        by /= (byte)(Test.instanceCount | 1);
                        break;
                    case 18:
                        iArr[(i26 >>> 1) % N] += i24;
                        break;
                    case 19:
                        i23 -= sFld;
                        break;
                    case 20:
                        Test.instanceCount += i24;
                    case 21:
                        try {
                            i26 = (i4 % 10974);
                            i4 = (i25 / 189);
                            i23 = (iArr[i24 - 1] % i27);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 22:
                        Test.iArrFld = Test.iArrFld;
                        break;
                    }
                }
            } else {
                dArr[i22 - 1][i22] = 74L;
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
