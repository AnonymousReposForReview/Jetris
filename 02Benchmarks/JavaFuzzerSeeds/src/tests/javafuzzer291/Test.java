package tests.javafuzzer291;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 01:19:24 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=41537L;
    public static int iFld=-26980;
    public static float fFld=2.892F;
    public static byte byFld=-65;
    public static boolean bFld=false;
    public int iFld1=-42983;
    public long lArrFld[][]=new long[N][N];
    public static double dArrFld[]=new double[N];
    public static short sArrFld[]=new short[N];
    public static long lArrFld1[][]=new long[N][N];
    public float fArrFld[][]=new float[N][N];

    static {
        FuzzerUtils.init(Test.dArrFld, 0.14341);
        FuzzerUtils.init(Test.sArrFld, (short)16022);
        FuzzerUtils.init(Test.lArrFld1, -51098L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i2, long l, long l1) {

        int i3=-31744, i4=2, i5=2, i6=52103, i7=208, i8=-22611, iArr1[]=new int[N];
        byte by=86;
        boolean b=true;

        FuzzerUtils.init(iArr1, -74);

        Test.fFld += i2;
        for (i3 = 377; i3 > 8; --i3) {
            for (i5 = i3; i5 < 5; ++i5) {
                by *= (byte)-2300331618296371092L;
                for (i7 = 1; i7 > 1; i7--) {
                    iArr1[i7] <<= -31298;
                    i4 = (int)Test.fFld;
                    by -= (byte)i7;
                    if (b) continue;
                    i8 += (i7 - Test.instanceCount);
                    try {
                        i8 = (iArr1[i7] % i5);
                        i8 = (-57612 / Test.iFld);
                        iArr1[i5] = (-1493862671 / i6);
                    } catch (ArithmeticException a_e) {}
                    i4 += i7;
                }
                try {
                    Test.iFld = (Test.iFld / 13408);
                    Test.iFld = (Test.iFld % i8);
                    i2 = (i2 % iArr1[i5]);
                } catch (ArithmeticException a_e) {}
            }
            i6 = (int)l;
            Test.dArrFld[i3 + 1] *= i3;
        }
        vMeth2_check_sum += i2 + l + l1 + i3 + i4 + i5 + i6 + by + i7 + i8 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth1(int i, int i1) {

        double d1=-1.23797;
        byte by1=29;
        int i9=-45111, i10=61771, i11=-59, i12=-4, i13=-50651, iArr2[][]=new int[N][N];
        short s1=9285;

        FuzzerUtils.init(iArr2, -28987);

        vMeth2(i1, Test.instanceCount, Test.instanceCount);
        d1 = Test.instanceCount;
        Test.fFld = by1;
        Test.iFld -= i;
        Test.instanceCount *= (long)d1;
        i9 = 1;
        do {
            iArr2[i9][i9] += 6;
            if (false) {
                iArr2[(i1 >>> 1) % N][i9 + 1] = s1;
            }
        } while (++i9 < 305);
        for (i10 = 5; i10 < 197; i10++) {
            i11 += (((i10 * i9) + Test.fFld) - Test.instanceCount);
            i11 >>= Test.iFld;
            for (i12 = 1; i12 < 8; ++i12) {
                Test.instanceCount = 56469;
                d1 -= d1;
            }
        }
        vMeth1_check_sum += i + i1 + Double.doubleToLongBits(d1) + by1 + i9 + s1 + i10 + i11 + i12 + i13 +
            FuzzerUtils.checkSum(iArr2);
    }

    public static void vMeth(double d, short s, float f) {

        int i14=10, i15=46447, i16=-4742, i17=-137, i18=2044, i19=9, iArr3[]=new int[N];
        long l2=-3048029400L;
        byte byArr[][]=new byte[N][N];

        FuzzerUtils.init(iArr3, -1);
        FuzzerUtils.init(byArr, (byte)-11);

        Test.iFld *= (int)Test.instanceCount;
        vMeth1(Test.iFld, Test.iFld);
        for (i14 = 359; i14 > 8; --i14) {
            s -= (short)4;
            Test.iFld += i14;
        }
        for (short s2 : Test.sArrFld) {
            switch (((-30409 >>> 1) % 7) + 34) {
            case 34:
                Test.lArrFld1[(i15 >>> 1) % N][(i14 >>> 1) % N] += (long)Test.fFld;
                iArr3[(i15 >>> 1) % N] -= Test.iFld;
                Test.instanceCount *= i15;
                for (i16 = 1; i16 < 4; i16++) {
                    for (l2 = i16; l2 < 2; ++l2) {
                        i17 += -181;
                        iArr3[(int)(l2 + 1)] = i17;
                    }
                    Test.byFld *= (byte)Test.instanceCount;
                }
                break;
            case 35:
                byArr[(i17 >>> 1) % N] = byArr[(i15 >>> 1) % N];
                break;
            case 36:
                i15 /= -4;
                break;
            case 37:
                Test.instanceCount = i18;
                break;
            case 38:
            case 39:
                i19 >>>= Test.iFld;
                break;
            case 40:
                Test.bFld = true;
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + s + Float.floatToIntBits(f) + i14 + i15 + i16 + i17 + l2 + i18
            + i19 + FuzzerUtils.checkSum(iArr3) + FuzzerUtils.checkSum(byArr);
    }

    public void mainTest(String[] strArr1) {

        double d2=-92.70301;
        short s3=-30454;
        int i20=55356, i21=-118, i22=1, i23=-41, i24=45876, i25=48812, i26=39880, iArr[]=new int[N];

        FuzzerUtils.init(iArr, -6621);

        lArrFld[(Test.iFld >>> 1) % N][(Test.iFld >>> 1) % N] = (--iArr[(Test.iFld >>> 1) % N]);
        vMeth(d2, s3, Test.fFld);
        Test.iFld = (int)1.77724;
        Test.iFld >>>= Test.iFld;
        Test.iFld = Test.iFld;
        for (i20 = 7; i20 < 298; ++i20) {
            for (i22 = 4; i22 < 86; i22++) {
                for (i24 = 1; 2 > i24; i24++) {
                    if (Test.bFld) {
                        Test.byFld += (byte)i24;
                        i23 = (int)-190L;
                        iFld1 += (i24 - i21);
                        i23 += (-97 + (i24 * i24));
                    } else {
                        Test.iFld = -11;
                    }
                    Test.lArrFld1[i24 - 1][i24 + 1] = 272581054L;
                    fArrFld[i22 - 1][i24] += i25;
                    Test.instanceCount = i21;
                    Test.instanceCount = i20;
                    Test.iFld = i23;
                    Test.iFld >>= (int)Test.instanceCount;
                }
                Test.iFld -= (int)Test.instanceCount;
                i26 = 1;
                while (++i26 < 2) {
                    iArr[i22] += i21;
                    switch (((i20 % 3) * 5) + 55) {
                    case 68:
                        Test.fFld += i26;
                    case 70:
                        i23 >>= i25;
                        i21 = i22;
                        iFld1 = iFld1;
                        break;
                    case 59:
                        i23 <<= -11;
                        s3 -= (short)i25;
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}