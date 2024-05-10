package tests.javafuzzer2109;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 09:08:50 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-51403L;
    public static byte byFld=69;
    public static volatile float fFld=0.405F;
    public boolean bFld=false;
    public int iFld=7;
    public static long lArrFld[]=new long[N];
    public static short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -1103351024L);
        FuzzerUtils.init(Test.sArrFld, (short)28974);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(long l, int i4) {

        boolean b=true;
        int i5=-53756;
        double d=0.126455, d1=21.21141, dArr[]=new double[N];

        FuzzerUtils.init(dArr, 102.115136);

        i4 += (int)Test.instanceCount;
        Test.byFld = (byte)i4;
        b = b;
        Test.lArrFld[(-7 >>> 1) % N] -= Test.instanceCount;
        i5 = 1;
        do {
            i4 <<= i5;
            d = 115;
            b = b;
            d1 = 1;
            while (++d1 < 9) {
                Test.sArrFld[(int)(d1)] -= (short)i4;
                i4 += (int)Test.instanceCount;
            }
            i4 *= i4;
            i4 -= (int)Test.instanceCount;
            i4 = (int)l;
            dArr[i5 + 1] = Test.byFld;
        } while (++i5 < 184);
        vMeth_check_sum += l + i4 + (b ? 1 : 0) + i5 + Double.doubleToLongBits(d) + Double.doubleToLongBits(d1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static int iMeth1() {

        int i2=60026, i3=-4206, i6=-57587, iArr[]=new int[N];
        short s=-14582;
        boolean b1=false;
        float f1=-90.409F;

        FuzzerUtils.init(iArr, 154);

        i2 = 1;
        while (++i2 < 269) {
            float f=0.738F;
            iArr[i2 - 1] += Test.byFld;
            i3 = (i3 - ((i2 - 8) - (i3++)));
            i3 += (int)Test.instanceCount;
            s >>= (short)(++Test.instanceCount);
            vMeth(Test.instanceCount, i3);
            f *= -11;
        }
        i6 = 1;
        do {
            b1 = b1;
            try {
                iArr[i6 + 1] = (i3 % i2);
                i3 = (iArr[i6 - 1] % -65);
                i3 = (-180400223 / i6);
            } catch (ArithmeticException a_e) {}
            i3 = 63748;
            f1 *= 48455;
            Test.byFld = (byte)-6145;
            Test.instanceCount += (long)f1;
            s *= (short)f1;
        } while (++i6 < 198);
        long meth_res = i2 + i3 + s + i6 + (b1 ? 1 : 0) + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        int i=3, i1=-13, i7=-33968, i8=31, i9=248, i10=-71, i11=-10, i12=17874;
        double d2=13.81889;
        short s1=-15055;

        for (i = 11; i < 396; ++i) {
            i1 >>= (int)((i1 + (Test.instanceCount + Test.byFld)) * iMeth1());
        }
        i1 = (int)d2;
        for (i7 = 4; i7 < 233; ++i7) {
            Test.instanceCount += -1;
            for (i9 = 1; i9 < 7; i9++) {
                for (i11 = i7; i11 < 2; i11++) {
                    Test.byFld -= (byte)i1;
                    i10 += i11;
                    switch ((i7 % 8) + 39) {
                    case 39:
                        Test.fFld = s1;
                        Test.lArrFld[i11 - 1] <<= i7;
                        Test.instanceCount -= i11;
                        Test.fFld /= ((long)(Test.fFld) | 1);
                        break;
                    case 40:
                        if (i1 != 0) {
                        }
                        break;
                    case 41:
                        Test.instanceCount += (i11 * i11);
                        break;
                    case 42:
                        i12 -= (int)1.319F;
                        break;
                    case 43:
                        s1 = (short)-38.112740;
                        break;
                    case 44:
                        Test.instanceCount -= -84;
                        break;
                    case 45:
                        Test.instanceCount = i12;
                        break;
                    case 46:
                        i1 ^= 5;
                    }
                }
            }
        }
        long meth_res = i + i1 + Double.doubleToLongBits(d2) + i7 + i8 + i9 + i10 + i11 + i12 + s1;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        long l1=1231402361L;
        int i13=1, i14=-52662, i15=-2, i16=-5, i17=-60591, i18=45903, i19=60819, i20=-5313, iArr1[]=new int[N];
        double d3=52.46760;
        short s2=20314;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(iArr1, 32);

        iMeth();
        for (l1 = 5; l1 < 262; ++l1) {
            i14 = 1;
            while (++i14 < 98) {
                i13 += (i14 ^ i14);
                Test.lArrFld[i14 - 1] -= Test.byFld;
                d3 = Test.instanceCount;
                i13 = i13;
                Test.instanceCount += (14L + (i14 * i14));
                bArr[(int)(l1 + 1)] = bFld;
                Test.fFld += i13;
            }
            Test.lArrFld[(int)(l1 - 1)] += Test.instanceCount;
            for (i15 = 3; i15 < 98; i15++) {
                i16 += Test.byFld;
                i16 += i15;
                bFld = bFld;
                for (i17 = 1; i17 < 2; i17++) {
                    i13 += i18;
                }
                i13 = (int)l1;
                if (bFld) continue;
                i16 = (int)l1;
                for (i19 = 1; i19 < 2; i19++) {
                    switch ((int)(((l1 % 2) * 5) + 95)) {
                    case 97:
                        Test.instanceCount += i16;
                        switch ((int)((l1 % 4) + 36)) {
                        case 36:
                            Test.instanceCount += (((i19 * i13) + i16) - Test.instanceCount);
                            switch ((int)((l1 % 10) + 28)) {
                            case 28:
                                Test.lArrFld[i15 - 1] += s2;
                                i13 += i18;
                                break;
                            case 29:
                                iArr1[i19 - 1] = (int)l1;
                                break;
                            case 30:
                            case 31:
                                i18 += i19;
                                break;
                            case 32:
                                try {
                                    i16 = (14240 / i20);
                                    i20 = (-105 / i19);
                                    i20 = (-1679842837 % iArr1[(-55 >>> 1) % N]);
                                } catch (ArithmeticException a_e) {}
                                break;
                            case 33:
                                i20 = 5;
                                break;
                            case 34:
                                i16 += (((i19 * l1) + i17) - l1);
                                break;
                            case 35:
                                Test.lArrFld[(int)(l1 - 1)] = 7336;
                            case 36:
                                Test.instanceCount >>= s2;
                                break;
                            case 37:
                                Test.instanceCount -= i16;
                                break;
                            }
                            break;
                        case 37:
                            i13 += (int)(-8.495F + (i19 * i19));
                        case 38:
                            try {
                                i20 = (i15 / i14);
                                i16 = (i14 / 229);
                                i18 = (i20 % 9205);
                            } catch (ArithmeticException a_e) {}
                        case 39:
                            i18 ^= i19;
                            break;
                        default:
                            i18 -= 40;
                        }
                        break;
                    case 102:
                        Test.instanceCount += s2;
                        break;
                    default:
                        Test.instanceCount *= iFld;
                    }
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
