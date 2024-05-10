package tests.javafuzzer3328;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 06:16:15 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-23212L;
    public int iFld=24140;
    public static int iFld1=9;
    public static double dFld=115.57858;
    public static byte byFld=-116;
    public short sFld=-20793;
    public static volatile long lArrFld[]=new long[N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 4L);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;

    public static void vSmallMeth(long l, float f, double d) {


        Test.iFld1 = (int)Test.lArrFld[(Test.iFld1 >>> 1) % N];
        vSmallMeth_check_sum += l + Float.floatToIntBits(f) + Double.doubleToLongBits(d);
    }

    public static double dMeth(int i, float f2, short s) {

        int i1=199, i2=-23694, i3=-113, i4=-34204, iArr[][]=new int[N][N];
        boolean b=false;
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr, -1);
        FuzzerUtils.init(fArr, 8.330F);

        i -= iArr[(4941 >>> 1) % N][(i >>> 1) % N];
        Test.lArrFld[(i >>> 1) % N] -= (--iArr[(Test.iFld1 >>> 1) % N][(Test.iFld1 >>> 1) % N]);
        for (i1 = 5; 304 > i1; ++i1) {
            i3 = 1;
            while (++i3 < 6) {
                i += (i3 * i);
                fArr[i1 + 1] = (Test.instanceCount -= (Test.instanceCount * (i2 * Test.instanceCount)));
                Test.iFld1 += (i3 ^ i);
                Test.dFld *= -6;
                i4 = 1;
                while (--i4 > 0) {
                    Test.instanceCount >>= (long)(Test.instanceCount - fArr[i3 - 1]);
                    i2 >>= (i--);
                    if (b) break;
                    Test.iFld1 = (int)44831L;
                    Test.iFld1 *= (int)(((i4 * Test.instanceCount) - Test.instanceCount) - (1 ^ i4));
                    Test.instanceCount &= Math.min((++iArr[i4][i1 - 1]) * (Test.iFld1 - i1), (int)((Test.dFld *
                        Test.instanceCount) - (f2--)));
                }
            }
        }
        long meth_res = i + Float.floatToIntBits(f2) + s + i1 + i2 + i3 + i4 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr)
            + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static long lMeth1() {

        int i15=46025, i16=-166, i17=-9, i18=-4965, i19=-203, i20=14, iArr1[]=new int[N];
        float f5=0.486F;

        FuzzerUtils.init(iArr1, 19);

        for (i15 = 6; 336 > i15; ++i15) {
            i16 += i15;
            for (i17 = 5; i17 > 1; i17--) {
                Test.instanceCount = Test.byFld;
                switch ((i17 % 10) + 101) {
                case 101:
                    i16 += 114;
                case 102:
                    for (i19 = 1; i19 < 2; i19++) {
                        Test.instanceCount += (long)f5;
                        if (true) continue;
                        Test.iFld1 += i19;
                        i20 += i19;
                        f5 -= 9;
                        Test.iFld1 -= 36328;
                        try {
                            iArr1[i19] = (Test.iFld1 / 24452);
                            i18 = (i20 % 76);
                            i18 = (i15 / 42);
                        } catch (ArithmeticException a_e) {}
                        Test.dFld += f5;
                    }
                    break;
                case 103:
                    i20 = i17;
                    break;
                case 104:
                    i16 += (i17 * i17);
                    break;
                case 105:
                    Test.iFld1 += i17;
                    break;
                case 106:
                    try {
                        i16 = (i18 / i16);
                        iArr1[i17] = (-86 / i15);
                        i20 = (Test.iFld1 % 1410068259);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 107:
                    i16 /= (int)(Test.instanceCount | 1);
                    break;
                case 108:
                    i20 *= (int)-125.350F;
                    break;
                case 109:
                    Test.iFld1 += i20;
                    break;
                case 110:
                    Test.instanceCount += (((i17 * i19) + Test.instanceCount) - i18);
                    break;
                }
            }
        }
        long meth_res = i15 + i16 + i17 + i18 + i19 + i20 + Float.floatToIntBits(f5) + FuzzerUtils.checkSum(iArr1);
        lMeth1_check_sum += meth_res;
        return (long)meth_res;
    }

    public static long lMeth(int i9, int i10) {

        int i11=64, i12=12, i13=-12, i14=-13, iArr2[]=new int[N];
        float f4=0.462F;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(iArr2, 12);
        FuzzerUtils.init(lArr, 27L);

        for (i11 = 240; 9 < i11; i11 -= 3) {
            i13 = 1;
            while (++i13 < 20) {
                i9 += i13;
                Test.instanceCount += i13;
                i10 += (i13 * i13);
                switch (((i13 % 2) * 5) + 10) {
                case 16:
                    try {
                        Test.iFld1 = (-55283 % i13);
                        i14 = (7279 / i14);
                        i14 = (i11 / -3173);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 17:
                    Test.instanceCount -= (long)(-((Test.instanceCount + f4) - lMeth1()));
                    break;
                }
                Test.lArrFld = Test.lArrFld;
                iArr2[i11 + 1] = i10;
                f4 = Test.instanceCount;
                i10 >>= -92;
                f4 -= Test.instanceCount;
            }
            Test.instanceCount = Test.byFld;
            lArr = lArr;
        }
        long meth_res = i9 + i10 + i11 + i12 + i13 + i14 + Float.floatToIntBits(f4) + FuzzerUtils.checkSum(iArr2) +
            FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth(int i5) {

        int i6=-11, i7=6, i8=-251, i21=189, i22=4, i23=-65016, i24=53700;
        float f3=-42.740F;
        boolean b1=true;
        long l1=612436341L;

        for (i6 = 5; i6 < 377; i6 += 3) {
            i5 = (int)(Test.instanceCount + ((Test.iFld1 * Test.dFld) + Test.iFld1));
        }
        dMeth((int)((Test.instanceCount - Test.byFld) + (2 * Test.iFld1)), ((i6 * Test.iFld1) + (-Test.byFld)) + (-(i7
            * -214)), (short)((Math.min(i6, 4) << Test.iFld1) + ((7679 * (i7 -= Test.iFld1)) >>> (long)(i5 -
            84.985F))));
        for (f3 = 2; f3 < 197; ++f3) {
            vSmallMeth(lMeth(i5, 3), 0.564F, Test.dFld);
            i5 += (int)(f3 * Test.iFld1);
            for (i21 = 1; i21 < 8; i21++) {
                i22 >>= i7;
                Test.instanceCount *= i5;
                Test.iFld1 = -25907;
                if (b1) break;
                i22 += (i21 ^ i23);
            }
            for (l1 = 1; 8 > l1; l1 += 3) {
                i22 = (int)9L;
                i22 = (int)Test.instanceCount;
            }
        }
        long meth_res = i5 + i6 + i7 + Float.floatToIntBits(f3) + i8 + i21 + i22 + (b1 ? 1 : 0) + i23 + l1 + i24;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f1=-110.826F;
        int i25=14, i26=13364, i27=58138, i28=-111, i29=-185, i30=3, i31=-3738, i32=11, i33=120, i34=232;

        switch (((Math.max(iFld, iFld) >>> 1) % 6) + 110) {
        case 110:
            for (int smallinvoc=0; smallinvoc<239; smallinvoc++) vSmallMeth((long)((-(f1--)) + Test.instanceCount), f1,
                dMeth(Integer.reverseBytes(iMeth(Test.iFld1)), f1, sFld));
            Test.instanceCount <<= Test.instanceCount;
            for (i25 = 16; 312 > i25; i25++) {
                i26 -= 3;
                Test.lArrFld[i25 + 1] *= Test.iFld1;
                Test.iFld1 += i25;
                Test.instanceCount += Test.instanceCount;
                for (i27 = 3; i27 < 85; i27++) {
                    i29 = 1;
                    while (++i29 < 2) {
                        i26 -= i26;
                        i28 = (int)Test.instanceCount;
                        iFld += i29;
                    }
                    Test.instanceCount += (((i27 * iFld) + Test.byFld) - sFld);
                    i26 *= i27;
                    i30 = 1;
                    do {
                        sFld = (short)i30;
                        Test.instanceCount += (i30 + sFld);
                        Test.dFld *= f1;
                    } while (++i30 < 2);
                    Test.instanceCount += Test.instanceCount;
                }
            }
            break;
        case 111:
            iArrFld[(i28 >>> 1) % N] += Test.byFld;
            i31 = 1;
            while (++i31 < 331) {
                f1 += (-64495L + (i31 * i31));
                i32 = 1;
                do {
                    Test.byFld = (byte)Test.instanceCount;
                    switch ((((iFld >>> 1) % 2) * 5) + 73) {
                    case 75:
                        iArrFld[i32] = (int)Test.instanceCount;
                        for (i33 = 1; i33 > 1; --i33) {
                            i34 += (-14 + (i33 * i33));
                            i28 *= iFld;
                        }
                    case 82:
                        i26 = i27;
                        break;
                    default:
                        iArrFld[i31 + 1] = i34;
                    }
                } while (++i32 < 76);
            }
        case 112:
            i26 ^= (int)Test.instanceCount;
            break;
        case 113:
            Test.instanceCount <<= Test.iFld1;
        case 114:
            Test.dFld += i33;
            break;
        case 115:
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test iMeth
//DEBUG  dMeth ->  dMeth mainTest iMeth
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  lMeth ->  lMeth iMeth mainTest
//DEBUG  lMeth1 ->  lMeth1 lMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
