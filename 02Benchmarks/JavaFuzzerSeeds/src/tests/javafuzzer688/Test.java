package tests.javafuzzer688;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 08:01:37 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-7048114575444789686L;
    public static int iFld=-5;
    public static short sFld=-19608;
    public static volatile int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -5);
        FuzzerUtils.init(Test.fArrFld, -10.123F);
    }

    public static long vMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i3=-4869, i4=-222, i5=3, i6=1, i7=-51343, iArr[]=new int[N];
        short s1=2135;
        boolean b1=true;
        double d1=0.29064;
        byte by=11;

        FuzzerUtils.init(iArr, 4624);

        if (b1) {
            Test.iFld = (int)Test.instanceCount;
            for (i3 = 185; i3 > 3; --i3) {
                int i8=-40949;
                i5 = 1;
                do {
                    for (i6 = 1; 1 > i6; i6++) {
                        Test.iFld += (i6 * Test.iFld);
                        iArr[i6] += s1;
                        if (b1) break;
                        b1 = b1;
                        iArr[i3 + 1] += (int)d1;
                        by *= (byte)-1.976F;
                        Test.instanceCount <<= i7;
                        d1 -= Test.instanceCount;
                    }
                } while (++i5 < 9);
                i7 += Test.iFld;
                iArr[i3 - 1] = i8;
            }
        }
        long meth_res = i3 + i4 + i5 + i6 + i7 + s1 + (b1 ? 1 : 0) + Double.doubleToLongBits(d1) + by +
            FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static boolean bMeth() {

        float f=0.694F;
        int i9=-14, i10=26007, i11=-33418, i12=-11, iArr1[][]=new int[N][N];
        double d2=-2.42983;
        long l=34393L;

        FuzzerUtils.init(iArr1, 53285);

        f -= ((Test.sFld--) - (-8111 - iMeth()));
        i9 = 257;
        do {
            for (i10 = 1; i10 < 6; ++i10) {
                Test.iFld |= Test.iFld;
                i11 *= (int)f;
                iArr1[i10] = FuzzerUtils.int1array(N, (int)-1945);
                Test.instanceCount += (-11211 + (i10 * i10));
                d2 = i9;
                i11 = (int)Test.instanceCount;
                i11 = (int)Test.instanceCount;
                Test.instanceCount = 87;
                for (l = 1; l < 2; ++l) {
                    Test.instanceCount = 14;
                }
                try {
                    Test.iFld = (i11 / -100);
                    iArr1[i10 + 1][i10 - 1] = (Test.iFld / iArr1[i9 + 1][i10]);
                    Test.iFld = (37549 % Test.iFld);
                } catch (ArithmeticException a_e) {}
            }
        } while (--i9 > 0);
        d2 *= Test.instanceCount;
        long meth_res = Float.floatToIntBits(f) + i9 + i10 + i11 + Double.doubleToLongBits(d2) + l + i12 +
            FuzzerUtils.checkSum(iArr1);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static void vMeth(int i1, short s, int i2) {

        boolean b=true;
        int i13=11, i14=100, iArr2[]=new int[N];
        float f1=58.806F;
        byte by1=18;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr2, -2);
        FuzzerUtils.init(lArr, -3199873392L);

        b = (b = (b = bMeth()));
        for (i13 = 3; i13 < 223; ++i13) {
            i1 += i13;
            Test.iFld >>= (int)Test.instanceCount;
        }
        i2 |= i1;
        iArr2[(Test.iFld >>> 1) % N] = i1;
        for (long l1 : lArr) {
            f1 -= i14;
        }
        by1 += (byte)-46;
        vMeth_check_sum += i1 + s + i2 + (b ? 1 : 0) + i13 + i14 + Float.floatToIntBits(f1) + by1 +
            FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        double d=-2.95886;
        int i=-35676, i15=-10505, i16=-22516, i17=4, i18=55751, i19=-3, i20=-9;
        float f2=-1.42F, f3=-2.890F;
        byte by2=-3;
        boolean b2=true;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -3758213763L);

        for (d = 11; d < 195; d++) {
            i = (Test.iFld++);
            vMeth(17, Test.sFld, 4);
            Test.iFld = (int)Test.instanceCount;
            switch ((int)(((d % 10) * 5) + 69)) {
            case 96:
                switch ((int)((d % 2) + 65)) {
                case 65:
                    i -= (int)-1.893F;
                    i *= (int)d;
                    for (f2 = 136; f2 > 2; f2--) {
                        i15 += i15;
                        Test.iFld *= -31;
                        i = i;
                    }
                    break;
                case 66:
                    f3 += i15;
                    for (i16 = 7; 136 > i16; i16++) {
                        lArr1[(int)(d)] = (long)f2;
                        f3 += (((i16 * i) + f3) - f2);
                        for (i18 = 1; i18 < 2; i18++) {
                            Test.sFld += (short)Test.iFld;
                            i += i18;
                            f3 *= 156297397L;
                            lArr1[i16] = i15;
                            i17 += (-3 + (i18 * i18));
                            i = 150;
                            Test.iArrFld = Test.iArrFld;
                            Test.fArrFld[(int)(d - 1)] *= 7;
                        }
                        i15 = (int)Test.instanceCount;
                        by2 *= (byte)i15;
                        Test.instanceCount *= Test.iFld;
                        i15 += (((i16 * i19) + Test.instanceCount) - i17);
                        f3 -= 122;
                    }
                    break;
                }
            case 88:
                i17 += (int)d;
                break;
            case 85:
                i20 = (int)f2;
                break;
            case 114:
                i19 -= i19;
            case 91:
                b2 = b2;
                break;
            case 103:
                Test.iFld += (int)4968207341702968275L;
                break;
            case 89:
                Test.sFld = (short)-77;
                break;
            case 102:
                Test.iFld *= (int)Test.instanceCount;
            case 72:
            case 115:
                Test.iFld += (int)d;
                break;
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
//DEBUG  bMeth ->  bMeth vMeth mainTest
//DEBUG  iMeth ->  iMeth bMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
