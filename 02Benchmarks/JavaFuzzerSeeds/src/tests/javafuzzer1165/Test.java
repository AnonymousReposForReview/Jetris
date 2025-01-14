package tests.javafuzzer1165;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 15:56:42 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-5L;
    public static volatile int iFld=3;
    public static short sFld=18339;
    public static volatile float fFld=12.404F;
    public boolean bFld=false;
    public static byte byFld=-114;
    public static int iArrFld[]=new int[N];
    public static short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -4);
        FuzzerUtils.init(Test.sArrFld, (short)-11493);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth() {

        int i6=254, i7=134, i8=2, i9=7;
        float f2=-2.460F;

        Test.iArrFld = Test.iArrFld;
        Test.iFld += (int)1.103081;
        Test.iFld = -202;
        for (i6 = 10; i6 < 161; ++i6) {
            for (i8 = 10; i8 > 1; --i8) {
                i9 += (i8 * i8);
                Test.instanceCount += (i8 + i7);
            }
            i7 = i9;
            try {
                i7 = (Test.iArrFld[i6 - 1] / 57);
                i9 = (i9 / -237);
                i9 = (i8 % -24781);
            } catch (ArithmeticException a_e) {}
            i7 %= (int)(Test.iFld | 1);
            Test.instanceCount = -118L;
        }
        Test.iFld += (int)f2;
        i9 = (int)Test.instanceCount;
        Test.instanceCount += 27664;
        i9 = i6;
        long meth_res = i6 + i7 + i8 + i9 + Float.floatToIntBits(f2);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static int iMeth1(long l, long l1, long l2) {

        float f1=-1.106F;
        int i10=102, i11=61371, i12=37856, i13=62577, i14=0, i15=-22;
        double d1=52.130116, dArr[]=new double[N];
        byte byArr[]=new byte[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(byArr, (byte)92);
        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(dArr, 0.97238);

        f1 -= byArr[(Test.iFld >>> 1) % N];
        bArr[(Test.iFld >>> 1) % N] = (((Test.iFld + Test.iFld) - (Test.instanceCount + Test.instanceCount)) ==
            (fMeth() + Test.instanceCount));
        for (i10 = 1; i10 < 137; i10++) {
            l2 = l2;
            Test.iFld += (((i10 * i11) + i10) - l2);
            for (i12 = 1; i12 < 12; i12++) {
                for (i14 = 1; i14 < 2; ++i14) {
                    Test.iFld = Test.iFld;
                    dArr[i14 + 1] *= l2;
                    Test.iFld += (int)d1;
                }
                i13 -= (int)Test.instanceCount;
            }
            l1 += i12;
        }
        Test.iArrFld[(i15 >>> 1) % N] = -6977;
        Test.iFld += Test.iFld;
        Test.iArrFld = Test.iArrFld;
        long meth_res = l + l1 + l2 + Float.floatToIntBits(f1) + i10 + i11 + i12 + i13 + i14 + i15 +
            Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(bArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        double d=118.106023;
        byte by=2;
        float f=-101.562F;
        int i3=-243, i4=-21, i5=17748, iArr[]=new int[N];
        boolean b=false;

        FuzzerUtils.init(iArr, -83);

        Test.instanceCount = (long)((Test.iFld * d) + ((14 + (by * Test.iFld)) + 126));
        iArr[(Test.iFld >>> 1) % N] += (int)854517603L;
        switch ((((Test.iFld + Test.iFld) >>> 1) % 1) + 93) {
        case 93:
            iArr[(Test.iFld >>> 1) % N] += Test.iFld;
            if (b) {
                f = 153;
                while (--f > 0) {
                    Test.iFld += iArr[(int)(f + 1)];
                    Test.iFld += (int)f;
                    for (i3 = 10; 1 < i3; --i3) {
                        i5 = 1;
                        while (++i5 < 2) {
                            Test.sFld -= (short)(-6341263826496669412L + (Test.iFld + (Test.iFld - f)));
                            i4 = (((by--) / (Test.iFld | 1)) * iMeth1(-136L, Test.instanceCount, Test.instanceCount));
                            i4 += (i5 * i5);
                            Test.iFld += i5;
                            Test.iFld += (int)(107L + (i5 * i5));
                        }
                    }
                }
            }
            break;
        default:
            Test.iFld >>= -196;
        }
        long meth_res = Double.doubleToLongBits(d) + by + Float.floatToIntBits(f) + i3 + i4 + i5 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-3, i1=-7, i2=100, i17=56762, i18=4870, i19=-197;
        double d2=12.128352;
        byte by1=-61;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, -24854L);

        i = 1;
        do {
            for (i1 = 70; i1 > 3; i1 -= 2) {
                Test.instanceCount /= (iMeth() | 1);
            }
            Test.instanceCount = i2;
            for (i17 = 3; i17 < 70; i17 += 2) {
                Test.sFld = (short)-14;
                Test.iFld -= (int)Test.fFld;
                try {
                    Test.iFld = (Test.iFld / -59123);
                    i18 = (i17 % 64119);
                    Test.iFld = (i1 % i18);
                } catch (ArithmeticException a_e) {}
            }
            d2 = 1;
            do {
                Test.iFld *= i2;
                Test.sArrFld[i - 1] = (short)i1;
                Test.iArrFld[i + 1] = 243;
                Test.instanceCount = i1;
                switch (((37 >>> 1) % 7) + 108) {
                case 108:
                    lArr[i - 1][i + 1] = 3;
                    break;
                case 109:
                    switch (((i % 7) * 5) + 119) {
                    case 140:
                        lArr[(int)(d2 - 1)][i] = i18;
                    case 136:
                        i2 ^= i19;
                        Test.instanceCount /= -238L;
                        i2 = Test.iFld;
                        break;
                    case 135:
                        Test.sArrFld[i - 1] = (short)-2.222F;
                        i18 >>>= 4;
                        break;
                    case 131:
                        i2 += (int)1.103584;
                        i19 -= (int)Test.instanceCount;
                        Test.instanceCount = Test.iFld;
                        Test.iArrFld = FuzzerUtils.int1array(N, (int)-8);
                        break;
                    case 137:
                        if (bFld) continue;
                        i18 += (int)d2;
                        by1 *= (byte)Test.instanceCount;
                        break;
                    case 129:
                        i2 += (int)d2;
                        break;
                    case 153:
                        i2 += 41808;
                        break;
                    default:
                        i2 |= i1;
                    }
                    break;
                case 110:
                    i19 += (int)d2;
                    break;
                case 111:
                    Test.instanceCount = i17;
                    break;
                case 112:
                    by1 += (byte)i17;
                    break;
                case 113:
                    Test.fFld += (float)((long)d2 ^ (long)i1);
                    break;
                case 114:
                    Test.byFld |= (byte)i1;
                }
            } while (++d2 < 70);
        } while (++i < 358);


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
//DEBUG  fMeth ->  fMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
