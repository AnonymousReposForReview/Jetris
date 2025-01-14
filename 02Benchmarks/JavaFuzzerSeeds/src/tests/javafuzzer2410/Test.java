package tests.javafuzzer2410;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 14:21:22 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=14L;
    public static byte byFld=-52;
    public static double dFld=34.7010;
    public static float fFld=75.473F;
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.bArrFld, true);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(double d, int i3) {

        int i4=3, i5=-128, i6=5, i7=2, i8=-22100, i9=-4, i10=15115, iArr1[][]=new int[N][N];
        boolean b=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr1, -45191);
        FuzzerUtils.init(lArr, -2617428752877876814L);

        i4 = 1;
        do {
            for (i5 = 1; i5 < 10; ++i5) {
                float f1=1.401F;
                f1 -= i6;
                for (i7 = 1; i7 < 2; i7++) {
                    if (i4 != 0) {
                    }
                    Test.byFld = (byte)f1;
                    i8 = Test.byFld;
                    i6 = i3;
                }
                b = b;
                switch (((i5 % 7) * 5) + 24) {
                case 51:
                    for (i9 = 1; 2 > i9; ++i9) {
                        i6 += (int)f1;
                        iArr1[i9 + 1][i5] *= i8;
                        i10 = 5;
                        iArr1[i4][i9 + 1] += 217;
                    }
                    break;
                case 33:
                    if (b) break;
                    break;
                case 42:
                    if (true) continue;
                    break;
                case 45:
                    f1 -= i7;
                    break;
                case 49:
                    lArr[i4 + 1] = Test.instanceCount;
                    break;
                case 37:
                    Test.instanceCount = 6972822530639816399L;
                case 38:
                    i3 >>>= (int)28780L;
                    break;
                }
            }
        } while (++i4 < 158);
        long meth_res = Double.doubleToLongBits(d) + i3 + i4 + i5 + i6 + i7 + i8 + (b ? 1 : 0) + i9 + i10 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1() {

        int i11=-186, i12=0, i13=-22023, i15=57621, i16=37565, i17=-6, iArr2[]=new int[N];
        boolean b1=true;
        float f2=0.255F;
        long l2=9L;

        FuzzerUtils.init(iArr2, 6);

        Test.instanceCount >>>= iMeth(Test.dFld, i11);
        for (i12 = 20; i12 < 353; i12++) {
            if (b1) continue;
            i11 -= (int)Test.fFld;
            for (i15 = 1; i15 < 5; ++i15) {
                i13 += i11;
                switch ((i15 % 9) + 102) {
                case 102:
                    iArr2[i15 - 1] = i11;
                    if (false) break;
                    i16 -= i16;
                case 103:
                    switch ((((i15 >>> 1) % 2) * 5) + 62) {
                    case 72:
                        for (f2 = 1; f2 < 2; f2++) {
                            i11 -= (int)-248L;
                            Test.instanceCount <<= i16;
                            i13 <<= (int)Test.instanceCount;
                        }
                        break;
                    case 63:
                        Test.dFld -= Test.instanceCount;
                    }
                    break;
                case 104:
                    i11 %= (int)(Test.byFld | 1);
                    break;
                case 105:
                    if (b1) break;
                    break;
                case 106:
                    i13 += (i15 * i15);
                case 107:
                case 108:
                case 109:
                    i16 = (int)Test.instanceCount;
                case 110:
                    l2 = i15;
                    break;
                default:
                    Test.fFld *= Test.fFld;
                }
            }
        }
        vMeth1_check_sum += i11 + i12 + i13 + (b1 ? 1 : 0) + i15 + i16 + Float.floatToIntBits(f2) + i17 + l2 +
            FuzzerUtils.checkSum(iArr2);
    }

    public static void vMeth(long l, long l1) {

        int i18=-42777, i19=-13, i20=6, i21=56, i22=-6640;
        boolean b2=false;

        vMeth1();
        for (i18 = 6; i18 < 285; i18++) {
            for (i20 = 1; 6 > i20; ++i20) {
                Test.fFld = i20;
                i19 = 74;
                Test.fFld += i20;
                i19 <<= i21;
                try {
                    i21 = (i18 / i21);
                    i19 = (i18 / -29563);
                    i19 = (64733 / i19);
                } catch (ArithmeticException a_e) {}
                l += (i20 + i21);
                i21 += i19;
            }
            if (i19 != 0) {
                vMeth_check_sum += l + l1 + i18 + i19 + i20 + i21 + (b2 ? 1 : 0) + i22;
                return;
            }
            b2 = b2;
            i22 = 1;
            while (++i22 < 6) {
                l1 += (((i22 * l1) + l1) - i22);
                Test.bArrFld[i18] = true;
            }
        }
        vMeth_check_sum += l + l1 + i18 + i19 + i20 + i21 + (b2 ? 1 : 0) + i22;
    }

    public void mainTest(String[] strArr1) {

        int i1=0, i2=-48, i23=-82, i24=14, i25=-21631, i27=45699, i28=-10, i29=-31796, i30=156, iArr[]=new int[N];
        float f=-2.692F;
        boolean b3=false;
        short s=2214, sArr[]=new short[N];

        FuzzerUtils.init(iArr, -39013);
        FuzzerUtils.init(sArr, (short)24485);

        for (int i : iArr) {
            for (i1 = 1; 63 > i1; ++i1) {
                f = (iArr[i1 - 1]--);
            }
            vMeth(Test.instanceCount, Test.instanceCount);
            i += -14;
            i = i1;
            for (i23 = 2; 63 > i23; i23++) {
                Test.instanceCount *= i1;
                iArr[i23] /= 62291;
                Test.instanceCount += (i23 * i23);
                if (b3) continue;
                Test.instanceCount += (((i23 * s) + i23) - Test.instanceCount);
            }
            i2 -= i24;
        }
        sArr[(i23 >>> 1) % N] *= (short)Test.instanceCount;
        i25 = 1;
        do {
            i2 = i24;
            i2 = i25;
            i24 >>= (int)Test.instanceCount;
        } while (++i25 < 186);
        for (int i26 : iArr) {
            for (i27 = 2; i27 < 63; i27++) {
                b3 = b3;
                switch ((i27 % 1) + 122) {
                case 122:
                    i28 += i27;
                    i28 *= (int)Test.dFld;
                    Test.instanceCount = i2;
                    break;
                }
                for (i29 = 1; i29 < 2; i29++) {
                    Test.instanceCount = Test.instanceCount;
                    Test.instanceCount = i2;
                    i24 = (int)f;
                    s = Test.byFld;
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
