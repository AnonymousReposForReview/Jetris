package tests.javafuzzer761;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 09:10:37 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-14772L;
    public float fFld=-1.717F;
    public static int iArrFld[]=new int[N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -2);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(double d, int i1) {

        int i2=-85, i3=-36, i4=-4, i5=0, i6=-4, i7=103, iArr[]=new int[N];
        short s=-6743;
        float f1=-88.654F;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -84);
        FuzzerUtils.init(lArr, -54605L);

        for (i2 = 4; 154 > i2; ++i2) {
            i1 = i2;
            Test.instanceCount &= i2;
            for (i4 = 1; i4 < 11; ++i4) {
                for (i6 = 1; 2 > i6; ++i6) {
                    i5 += (((i6 * Test.instanceCount) + Test.instanceCount) - i5);
                    try {
                        i1 = (i4 % 37704);
                        i7 = (i3 / i6);
                        iArr[i4] = (i5 % i7);
                    } catch (ArithmeticException a_e) {}
                    s = (short)i6;
                    switch (((i4 % 5) * 5) + 24) {
                    case 36:
                        i5 += i6;
                        f1 -= i6;
                    case 42:
                        try {
                            i7 = (1939036677 / i4);
                            i5 = (i4 % i1);
                            i7 = (iArr[i2 - 1] % iArr[i4]);
                        } catch (ArithmeticException a_e) {}
                        Test.instanceCount += (long)d;
                        i1 += (i6 - i6);
                        lArr[i4] += i3;
                        break;
                    case 34:
                        i7 = (int)Test.instanceCount;
                        break;
                    case 49:
                        i3 >>= (int)Test.instanceCount;
                        break;
                    case 40:
                        f1 = (float)71.92272;
                        break;
                    default:
                        i5 += (i6 - i4);
                    }
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d) + i1 + i2 + i3 + i4 + i5 + i6 + i7 + s + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        double d1=2.38352, dArr[][]=new double[N][N];
        int i8=-54628, i9=22548, i10=-3, i11=123, i12=-55973, i13=3, i14=-58704, iArr1[]=new int[N];
        short s1=22306;
        byte by=-95;
        float f2=117.861F;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 59730L);
        FuzzerUtils.init(iArr1, 6);
        FuzzerUtils.init(dArr, -1.30506);

        iMeth1(d1, i8);
        for (i9 = 5; i9 < 253; i9++) {
            Test.instanceCount += (((i9 * i10) + Test.instanceCount) - i8);
            lArr1 = FuzzerUtils.long1array(N, (long)1856091808L);
            switch (((i9 >>> 1) % 5) + 47) {
            case 47:
                i10 = i10;
                for (i11 = 1; 7 > i11; i11++) {
                    iArr1 = iArr1;
                    for (i13 = 2; i13 > 1; --i13) {
                        dArr[i13 - 1][i13 + 1] = Test.instanceCount;
                        i12 *= s1;
                        by += (byte)f2;
                        i8 >>>= i14;
                        Test.instanceCount += by;
                        d1 += s1;
                    }
                }
                break;
            case 48:
                try {
                    i14 = (i11 % -25699);
                    i8 = (iArr1[i9] / i10);
                    i10 = (i14 % i9);
                } catch (ArithmeticException a_e) {}
                break;
            case 49:
                iArr1 = iArr1;
                break;
            case 50:
                Test.instanceCount += by;
                break;
            case 51:
                i14 -= i12;
                break;
            default:
                i14 = (int)f2;
            }
        }
        long meth_res = Double.doubleToLongBits(d1) + i8 + i9 + i10 + i11 + i12 + i13 + i14 + s1 + by +
            Float.floatToIntBits(f2) + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(float f, int i, long l) {

        int i15=-143, i16=36333, i17=-11, i18=-170, i19=5, i20=11, iArr2[]=new int[N];
        boolean b=false, b1=true;

        FuzzerUtils.init(iArr2, 43163);

        i += (int)(iMeth() - l);
        i *= -4;
        for (i15 = 16; i15 < 373; ++i15) {
            for (i17 = 1; i17 < 5; ++i17) {
                l = -156;
                i18 <<= (int)Test.instanceCount;
                switch (((i16 >>> 1) % 5) + 101) {
                case 101:
                    for (i19 = i17; i19 < 2; ++i19) {
                        if (true) break;
                        if (b) continue;
                        i16 *= (int)l;
                        b1 = b1;
                        i <<= i17;
                        i16 += (i19 ^ i20);
                        if (i15 != 0) {
                            vMeth_check_sum += Float.floatToIntBits(f) + i + l + i15 + i16 + i17 + i18 + i19 + i20 + (b
                                ? 1 : 0) + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr2);
                            return;
                        }
                    }
                    break;
                case 102:
                    i16 *= i18;
                    break;
                case 103:
                    i16 = i15;
                case 104:
                    i16 += -142;
                    break;
                case 105:
                    iArr2[i15 + 1] = (int)l;
                    break;
                }
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i + l + i15 + i16 + i17 + i18 + i19 + i20 + (b ? 1 : 0) + (b1 ? 1
            : 0) + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i21=-215, i22=-12, i23=12, i24=50627, i25=16840, i26=177, i27=2;
        double d2=-88.50203;
        byte by1=-64;
        boolean b2=false;
        short s2=15641;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 1.401F);

        vMeth(fFld, i21, Test.instanceCount);
        i21 -= (int)fFld;
        Test.instanceCount = 8;
        for (i22 = 20; i22 < 359; i22++) {
            fArr = fArr;
            i23 -= i23;
            i23 = (int)-5L;
            Test.instanceCount -= i21;
            Test.instanceCount += i21;
            Test.iArrFld[i22 - 1] = (int)d2;
            i23 += i23;
            for (i24 = 4; i24 < 74; ++i24) {
                i25 ^= i21;
                i26 = 1;
                while (++i26 < 2) {
                    Test.instanceCount += (i26 - by1);
                }
                i27 = 1;
                while (++i27 < 2) {
                    switch ((i27 % 7) + 28) {
                    case 28:
                    case 29:
                        if (b2) continue;
                        Test.instanceCount <<= i26;
                    case 30:
                        Test.instanceCount *= (long)d2;
                        i23 -= i21;
                        Test.instanceCount *= Test.instanceCount;
                        break;
                    case 31:
                        lArrFld[i24 - 1] -= (long)d2;
                        i23 += i22;
                        fArr[i22] += i22;
                        Test.instanceCount %= (s2 | 1);
                        break;
                    case 32:
                        switch ((i27 % 5) + 104) {
                        case 104:
                            i23 = i27;
                            i25 = (int)fFld;
                            Test.instanceCount *= i23;
                        case 105:
                            i21 = (int)Test.instanceCount;
                            break;
                        case 106:
                            i21 *= (int)fFld;
                            break;
                        case 107:
                            i23 -= (int)-46.775F;
                            break;
                        case 108:
                            i25 -= -45472;
                            break;
                        }
                        break;
                    case 33:
                        by1 = (byte)i23;
                        break;
                    case 34:
                        if (b2) break;
                        break;
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
