package tests.javafuzzer2069;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 08:36:12 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3153246713619324784L;
    public static float fFld=-5.882F;
    public volatile boolean bFld=true;
    public static short sFld=6525;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -2);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i3, int i4) {

        int i5=-199, i6=-56, i7=123, i8=0, i9=6;
        double d=52.4295;
        float f=-2.520F;
        byte by=-88;
        short s=5352;
        long l3=-2280961539L;

        i5 = 1;
        do {
            i3 = (int)d;
            f = 1;
            while (++f < 8) {
                try {
                    i3 = (i5 / i5);
                    i3 = (37444 / i4);
                    i3 = (i4 / i4);
                } catch (ArithmeticException a_e) {}
                i3 += i4;
                i3 *= (int)Test.instanceCount;
            }
            i4 <<= by;
            s >>= (short)i3;
            for (i6 = 1; i6 < 8; i6++) {
                i3 = (int)Test.instanceCount;
                i8 += (int)f;
                try {
                    i8 = (991128180 % i7);
                    i7 = (i3 / 1413404706);
                    i3 = (i5 % i5);
                } catch (ArithmeticException a_e) {}
                for (l3 = 2; l3 > i5; l3 -= 2) {
                    i8 += -19565;
                    d = 25;
                }
            }
        } while (++i5 < 207);
        vMeth2_check_sum += i3 + i4 + i5 + Double.doubleToLongBits(d) + Float.floatToIntBits(f) + by + s + i6 + i7 + i8
            + l3 + i9;
    }

    public static void vMeth1(long l2, boolean b) {

        int i2=-27267, i11=-65, i12=-34014, i13=0, i14=-4, i15=116, iArr1[]=new int[N];
        double d1=-2.39565, dArr[]=new double[N];
        byte by1=-47;

        FuzzerUtils.init(iArr1, -7496);
        FuzzerUtils.init(dArr, 0.106170);

        l2 -= iArr1[(i2 >>> 1) % N];
        vMeth2(-4, i2);
        for (int i10 : iArr1) {
            iArr1[(i10 >>> 1) % N] *= (int)Test.instanceCount;
            d1 = i2;
            i10 -= i2;
            dArr[(-36 >>> 1) % N] += l2;
            iArr1[(i10 >>> 1) % N] = 13;
        }
        for (i11 = 6; i11 < 122; ++i11) {
            i13 = 1;
            while (++i13 < 13) {
                for (i14 = 1; i14 < 1; ++i14) {
                    i12 *= by1;
                    if (b) {
                        iArr1[i11 - 1] += by1;
                        Test.fFld += (((i14 * i12) + l2) - i12);
                    } else {
                        i2 = (int)Test.fFld;
                        vMeth1_check_sum += l2 + (b ? 1 : 0) + i2 + Double.doubleToLongBits(d1) + i11 + i12 + i13 + i14
                            + i15 + by1 + FuzzerUtils.checkSum(iArr1) +
                            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                        return;
                    }
                }
            }
        }
        vMeth1_check_sum += l2 + (b ? 1 : 0) + i2 + Double.doubleToLongBits(d1) + i11 + i12 + i13 + i14 + i15 + by1 +
            FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth(long l, long l1, int i) {

        int i1=43, i16=63, iArr[]=new int[N];
        boolean b1=false;
        short s1=-27180;

        FuzzerUtils.init(iArr, -46161);

        i1 = 1;
        while (++i1 < 311) {
            iArr[i1] -= (i--);
            vMeth1(l1, b1);
            i += i1;
            i *= i;
            try {
                i = (i1 % i1);
                i = (i / i1);
                i = (i % 20832);
            } catch (ArithmeticException a_e) {}
            Test.fFld += i;
            i16 = 1;
            while (++i16 < 5) {
                i <<= 1054;
                switch ((i1 % 6) + 49) {
                case 49:
                    l *= i16;
                    break;
                case 50:
                    i += i16;
                    s1 <<= (short)-20;
                case 51:
                    i = i1;
                    i = i16;
                    break;
                case 52:
                    Test.instanceCount = i1;
                    break;
                case 53:
                    try {
                        i = (iArr[i1 - 1] % 12632);
                        i = (-147 / iArr[i16 - 1]);
                        i = (15275 / i1);
                    } catch (ArithmeticException a_e) {}
                case 54:
                    l *= (long)-53.666F;
                    break;
                }
            }
        }
        vMeth_check_sum += l + l1 + i + i1 + (b1 ? 1 : 0) + i16 + s1 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i17=196, i18=-9, i19=-12, i20=-3233, i21=153, i22=-57, i23=-113, i24=1, i25=1;
        double d2=69.11166, dArr1[]=new double[N];
        byte by2=-36;
        float f1=-1.952F;
        long lArr[]=new long[N];

        FuzzerUtils.init(dArr1, -92.12058);
        FuzzerUtils.init(lArr, -4129193316L);

        vMeth(-13L, Test.instanceCount, -12);
        dArr1 = FuzzerUtils.double1array(N, (double)-112.54097);
        switch ((((-81 >>> 1) % 7) * 5) + 88) {
        case 121:
            i17 = 1;
            do {
                i18 -= -62406;
                d2 += i17;
                for (i19 = 1; 73 > i19; i19 += 3) {
                    by2 -= (byte)i17;
                    for (i21 = i17; 4 > i21; i21++) {
                        Test.iArrFld[i21 + 1] += i22;
                        d2 += Test.instanceCount;
                        i18 += (int)Test.fFld;
                        if (bFld) break;
                    }
                    if (bFld) {
                        Test.sFld >>>= (short)-1946;
                    } else if (bFld) {
                        Test.iArrFld[i19 + 1] = i22;
                        i23 = 1;
                        while (++i23 < 4) {
                            i18 = by2;
                            Test.instanceCount = i17;
                        }
                        i24 = 1;
                        do {
                            i20 <<= i17;
                            bFld = bFld;
                            lArr[i24] = i20;
                            i22 += (int)Test.instanceCount;
                            i20 -= -57;
                            Test.fFld -= i25;
                        } while (++i24 < 4);
                    } else {
                        i22 -= (int)Test.instanceCount;
                        f1 = 1;
                        while (++f1 < 4) {
                            i22 -= (int)0L;
                            i25 += -74;
                        }
                    }
                }
            } while (++i17 < 347);
            break;
        case 100:
            Test.sFld -= (short)i21;
        case 109:
            Test.iArrFld = Test.iArrFld;
        case 108:
            Test.iArrFld[(i17 >>> 1) % N] = -25;
            break;
        case 113:
            i25 *= (int)-45843L;
            break;
        case 106:
            i18 = -8;
            break;
        case 101:
            by2 = (byte)105;
            break;
        default:
            Test.iArrFld[(i21 >>> 1) % N] <<= 43743;
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
