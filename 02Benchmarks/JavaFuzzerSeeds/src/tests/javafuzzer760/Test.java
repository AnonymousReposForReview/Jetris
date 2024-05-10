package tests.javafuzzer760;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 09:10:35 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=85L;
    public static short sFld=-3874;
    public static volatile float fFld=-1.396F;
    public static boolean bFld=false;
    public static byte byFld=-117;
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 1.68475);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(long l1, byte by1, int i6) {

        int i7=-12, i8=14954, i9=-26, i10=-6, i11=5117, i12=10, iArr1[]=new int[N];
        boolean b=true;
        double d=0.1402;

        FuzzerUtils.init(iArr1, -12040);

        i6 *= (int)Test.fFld;
        for (i7 = 12; i7 < 273; ++i7) {
            if (b) break;
            i6 -= 0;
            i6 -= i8;
            try {
                iArr1[i7 + 1] = (i6 % i8);
                iArr1[i7] = (i8 / i9);
                i9 = (i6 / i7);
            } catch (ArithmeticException a_e) {}
            Test.sFld = (short)i6;
            l1 += (((i7 * i8) + i8) - Test.fFld);
            Test.instanceCount >>= i9;
            i8 += (((i7 * Test.instanceCount) + i7) - i8);
            i9 <<= -51612;
            for (i10 = 6; i7 < i10; i10 -= 3) {
                for (d = 1; d < 1; d += 3) {
                    iArr1[i10 + 1] = (int)l1;
                    i6 += (int)(((d * i8) + i10) - i7);
                }
            }
        }
        long meth_res = l1 + by1 + i6 + i7 + i8 + (b ? 1 : 0) + i9 + i10 + i11 + Double.doubleToLongBits(d) + i12 +
            FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(long l) {

        float f=117.608F;
        int i1=37894, i2=1, i3=10, i4=-2, i5=9, i13=-3, i14=240, iArr[]=new int[N];
        byte by=-51;
        double d1=85.33180;

        FuzzerUtils.init(iArr, -110);

        for (f = 2; 218 > f; ++f) {
            if (Test.bFld) {
                try {
                    i1 = (i1 / -182);
                    iArr[(int)(f)] = (i1 % 101);
                    i1 = (iArr[(int)(f - 1)] / 39375);
                } catch (ArithmeticException a_e) {}
                for (i2 = 1; i2 < 7; i2 += 2) {
                    i1 = i2;
                    i3 &= (int)(((i3 *= i1) * (f - Test.instanceCount)) + (++by));
                    for (i4 = 1; i4 < 3; i4++) {
                        l *= (long)(i5 *= (int)((--Test.fFld) + iMeth(l, by, i4)));
                    }
                    for (i13 = 1; i13 < 3; i13++) {
                        d1 -= i4;
                        Test.sFld -= Test.sFld;
                        Test.bFld = Test.bFld;
                        i1 += i13;
                        Test.fFld += Test.instanceCount;
                        i1 += (i13 ^ Test.instanceCount);
                    }
                }
            } else if (true) {
                Test.fFld *= i4;
            } else {
                iArr = FuzzerUtils.int1array(N, (int)-150);
            }
        }
        vMeth1_check_sum += l + Float.floatToIntBits(f) + i1 + i2 + i3 + by + i4 + i5 + i13 + i14 +
            Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth() {

        int i15=-73, i16=5, i17=10, i18=-45, i19=103, iArr2[]=new int[N];
        double d2=-36.115687;
        byte by2=8;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(iArr2, 227);
        FuzzerUtils.init(bArr, true);

        vMeth1(Test.instanceCount);
        i15 >>= i15;
        Test.instanceCount = (long)d2;
        for (i16 = 153; i16 > 8; i16--) {
            if (Test.bFld) {
                Test.sFld <<= (short)i15;
                for (i18 = 1; 11 > i18; ++i18) {
                    by2 <<= (byte)i15;
                    Test.instanceCount = i16;
                    i19 <<= i17;
                    i19 += i16;
                    Test.instanceCount = -17;
                    iArr2[i18] = i18;
                    bArr[i16] = Test.bFld;
                    iArr2[i16 - 1] = i17;
                }
            } else {
                i15 *= (int)Test.instanceCount;
            }
        }
        vMeth_check_sum += i15 + Double.doubleToLongBits(d2) + i16 + i17 + i18 + i19 + by2 +
            FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(bArr);
    }

    public void mainTest(String[] strArr1) {

        int i=54234, i20=-9, i21=16972, i22=10710, i23=46457, i24=97, i25=64169, i26=1, i27=7, i28=0, i29=3978,
            iArr3[]=new int[N];

        FuzzerUtils.init(iArr3, -40829);

        switch ((((Test.sFld + i) >>> 1) % 8) + 78) {
        case 78:
            vMeth();
            i -= i;
            break;
        case 79:
            for (i20 = 10; 183 > i20; i20 += 2) {
                if (true) break;
                switch ((i20 % 2) + 115) {
                case 115:
                    i21 <<= i21;
                    for (i22 = 3; i22 < 291; ++i22) {
                        for (i24 = 1; 2 > i24; ++i24) {
                            Test.sFld = (short)i21;
                            i25 += (i24 * i24);
                            i = (int)Test.instanceCount;
                            Test.sFld -= (short)i23;
                            i23 >>= i21;
                            i25 -= (int)Test.instanceCount;
                        }
                        for (i26 = 1; i26 < 2; ++i26) {
                            Test.bFld = Test.bFld;
                            Test.byFld += (byte)(((i26 * i23) + i25) - i20);
                            i27 *= (int)Test.instanceCount;
                        }
                        i23 /= (int)(Test.instanceCount | 1);
                        Test.fFld += (i22 * i20);
                        iArr3[i22] -= i24;
                        for (i28 = 1; i28 < 2; ++i28) {
                            i29 += (int)Test.instanceCount;
                            i21 &= i26;
                            Test.instanceCount -= i29;
                            i29 *= -168;
                            i21 = -9495;
                            Test.instanceCount += i27;
                            Test.instanceCount += Test.sFld;
                        }
                    }
                    break;
                case 116:
                    Test.fFld += (i20 * i20);
                    break;
                }
            }
        case 80:
            Test.instanceCount *= -247;
            break;
        case 81:
            Test.instanceCount -= -4;
            break;
        case 82:
        case 83:
            i21 ^= 67;
            break;
        case 84:
            Test.dArrFld[(i20 >>> 1) % N] -= i21;
            break;
        case 85:
            Test.byFld -= (byte)i24;
        default:
            i = i20;
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