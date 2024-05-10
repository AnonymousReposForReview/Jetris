package tests.javafuzzer1030;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 12:56:12 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2191646491L;
    public static byte byFld=74;
    public static boolean bFld=true;
    public volatile float fFld=-94.915F;

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i9, int i10, int i11) {

        int i12=-3095, i13=-57, i14=-222, i15=-206, iArr2[]=new int[N];
        double d3=25.79019;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 2.314F);
        FuzzerUtils.init(iArr2, -38091);

        if (Test.bFld) {
            fArr[(i9 >>> 1) % N] = 42144;
            i11 -= i11;
            iArr2[(i10 >>> 1) % N] += i10;
        }
        i9 -= i9;
        Test.instanceCount = i9;
        switch (((-14 >>> 1) % 2) + 127) {
        case 127:
            for (i12 = 3; i12 < 160; i12++) {
                i10 = i9;
            }
            for (i14 = 12; i14 < 268; i14++) {
                if (Test.bFld) continue;
                iArr2[i14] -= (int)d3;
            }
            break;
        case 128:
            Test.instanceCount *= i10;
        }
        Test.instanceCount = i14;
        i9 = i9;
        long meth_res = i9 + i10 + i11 + i12 + i13 + i14 + i15 + Double.doubleToLongBits(d3) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr2);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i8) {

        double d2=-2.43383;
        short s=1274;
        int i16=51182, i17=10, i18=58853, i19=-58005, iArr1[][]=new int[N][N];
        float f1=-33.985F, fArr1[]=new float[N];

        FuzzerUtils.init(iArr1, 4);
        FuzzerUtils.init(fArr1, -2.62F);

        d2 += i8;
        s = (short)iArr1[(i8 >>> 1) % N][(i8 >>> 1) % N];
        Test.byFld *= (byte)((i8 += (int)(-1L * i8)) << (Test.byFld <<= (byte)iMeth1(i8, -100, i8)));
        i8 = i8;
        for (i16 = 20; i16 < 391; i16++) {
            iArr1[i16 - 1][i16 + 1] -= i17;
            f1 += i17;
            i17 = (int)Test.instanceCount;
            Test.instanceCount += (12 + (i16 * i16));
            f1 += i8;
            i17 >>>= i8;
            for (i18 = 5; i18 > 1; i18--) {
                Test.instanceCount &= 13;
                i8 = i19;
                fArr1[i18] -= i19;
            }
        }
        long meth_res = i8 + Double.doubleToLongBits(d2) + s + i16 + i17 + Float.floatToIntBits(f1) + i18 + i19 +
            FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth(double d1, long l, int i3) {

        int i4=218, i5=-30957, i6=-169, i7=-13, i20=4538, i21=-242, iArr3[]=new int[N];
        short s1=17291;

        FuzzerUtils.init(iArr3, -64);

        for (i4 = 335; i4 > 8; i4--) {
            for (i6 = i4; i6 < 5; ++i6) {
                switch ((i6 % 1) + 124) {
                case 124:
                    i3 = (int)(iMeth(i5) + Test.instanceCount);
                    i5 += i5;
                    break;
                }
                Test.bFld = Test.bFld;
                for (i20 = i6; 1 > i20; i20++) {
                    Test.byFld = (byte)i4;
                    i21 &= 253;
                    iArr3 = iArr3;
                    l -= l;
                    i21 += s1;
                    i3 += (int)fFld;
                }
                Test.instanceCount += i6;
                l = (long)fFld;
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d1) + l + i3 + i4 + i5 + i6 + i7 + i20 + i21 + s1 +
            FuzzerUtils.checkSum(iArr3);
    }

    public void mainTest(String[] strArr1) {

        int i=-137, i1=-26680, i2=22258, i22=-187, i23=1, i24=7, i25=245, i26=43030, i27=5, i28=-4, iArr[][]=new
            int[N][N];
        double d=0.76078;
        float f=38.582F;
        boolean b=true;

        FuzzerUtils.init(iArr, -10);

        iArr[(109 >>> 1) % N][(i >>> 1) % N] = (int)((-(Test.instanceCount++)) + (--d));
        switch ((((i++) >>> 1) % 1) + 76) {
        case 76:
            Test.instanceCount = (long)((--iArr[(i >>> 1) % N][(i >>> 1) % N]) * ((i + f) + (Test.instanceCount++)));
            for (i1 = 8; 348 > i1; i1++) {
                i >>= (int)Test.instanceCount;
                vMeth(54.26295, -8484234253105324164L, i2);
                i2 += (46817 + (i1 * i1));
                i2 -= (int)78.746F;
                fFld += (((i1 * i2) + i2) - i);
                for (i22 = i1; i22 < 74; i22++) {
                    i24 = 1;
                    while (++i24 < 1) {
                        i2 = (int)-1.385F;
                        iArr[i22 - 1][i1 - 1] = i23;
                    }
                    i = i22;
                    Test.instanceCount &= 8;
                    iArr[i22 + 1][i22 + 1] += i23;
                    Test.bFld = Test.bFld;
                    Test.instanceCount = i23;
                    i2 *= -21274;
                    iArr[(i1 >>> 1) % N][i1 - 1] = i22;
                }
            }
        }
        for (i25 = 7; i25 < 314; i25++) {
            i += (i25 | i);
            i2 += (int)Test.instanceCount;
            for (i27 = 2; i27 < 82; ++i27) {
                f = i24;
                b = Test.bFld;
                iArr[i27 + 1][i27] = i28;
                iArr[i27 - 1][i25 + 1] >>>= Test.byFld;
                d *= Test.instanceCount;
                Test.bFld = b;
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