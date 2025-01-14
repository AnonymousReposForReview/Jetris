package tests.javafuzzer2794;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 20:09:11 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=2311546159135312510L;
    public static float fFld=-57.695F;
    public static boolean bFld=false;
    public static byte byFld=79;
    public static volatile double dFld=1.40603;
    public int iFld=39066;
    public static short sFld=22730;
    public static volatile float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.fArrFld, -62.612F);
    }

    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i6=6, i7=2, i8=-130, iArr[][]=new int[N][N];
        double d=41.44719;
        short s=-5714, sArr[]=new short[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 0L);
        FuzzerUtils.init(sArr, (short)-19090);
        FuzzerUtils.init(iArr, 113);

        i6 = 1;
        while (++i6 < 255) {
            switch ((i6 % 2) + 50) {
            case 50:
                lArr[(i6 >>> 1) % N] = (long)Test.fFld;
                break;
            case 51:
            }
            d = i6;
            sArr[i6 - 1] -= s;
            if (Test.bFld) break;
            for (i7 = 1; i7 < 6; ++i7) {
                Test.instanceCount += i7;
                if (Test.bFld) {
                    i8 += (int)Test.fFld;
                    iArr[i6 + 1] = FuzzerUtils.int1array(N, (int)25202);
                } else if (Test.bFld) {
                    s += (short)(((i7 * i7) + Test.fFld) - Test.instanceCount);
                    i8 += (i7 ^ i8);
                    try {
                        i8 = (379669998 % i8);
                        i8 = (i6 / iArr[i7][i7 - 1]);
                        iArr[i6][i6 - 1] = (i7 / -2665);
                    } catch (ArithmeticException a_e) {}
                } else if (Test.bFld) {
                    i8 += (((i7 * Test.instanceCount) + Test.fFld) - Test.byFld);
                }
            }
        }
        long meth_res = i6 + Double.doubleToLongBits(d) + s + i7 + i8 + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static float fMeth(int i3, int i4) {

        int i5=0, i9=25, i10=-234, i11=-2, iArr1[]=new int[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr1, 130);
        FuzzerUtils.init(dArr, -1.86122);

        i5 = 1;
        do {
            i4 = (int)(iMeth() - Test.instanceCount);
            i3 >>= i5;
            if (Test.bFld) {
                for (i9 = 1; i9 < 5; ++i9) {
                    iArr1[i5] = i3;
                    Test.instanceCount <<= i3;
                    try {
                        i4 = (i5 / i5);
                        i10 = (iArr1[i9] / -146);
                        i4 = (i4 % 240);
                    } catch (ArithmeticException a_e) {}
                    i11 = 1;
                    do {
                        i3 += i5;
                        iArr1[i9 - 1] -= (int)Test.instanceCount;
                    } while (++i11 < 2);
                    i10 += (int)Test.fFld;
                    Test.instanceCount = 25250;
                    dArr[i9] -= i5;
                    i10 += (((i9 * Test.instanceCount) + i5) - Test.byFld);
                }
            } else {
                iArr1[i5 + 1] *= i11;
            }
        } while (++i5 < 332);
        long meth_res = i3 + i4 + i5 + i9 + i10 + i11 + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth(boolean b, long l, int i) {

        float f=-126.943F;
        int i1=-122, i2=33239, i12=226, i13=-11, i14=-36222, i15=3, i16=47650, iArr2[]=new int[N];
        double d1=70.97751;
        short s1=-6469;

        FuzzerUtils.init(iArr2, -13);

        f = 315;
        do {
            i = (++i);
        } while (--f > 0);
        switch ((((i + i) >>> 1) % 4) + 107) {
        case 107:
            for (i1 = 6; 164 > i1; ++i1) {
                fMeth(9, -26501);
                for (i12 = i1; i12 < 10; ++i12) {
                    Test.dFld *= 5047;
                }
                i14 = 1;
                while (++i14 < 10) {
                    if (Test.bFld) break;
                    iArr2[i14 + 1] *= (int)64.979F;
                }
            }
            l = (long)d1;
            for (i15 = 1; i15 < 148; ++i15) {
                if (b) break;
                Test.dFld *= 0.840F;
                i2 += (i15 * i15);
            }
            break;
        case 108:
            s1 = (short)l;
            break;
        case 109:
            iArr2[(i15 >>> 1) % N] = -63063;
            break;
        case 110:
            i13 -= i2;
            break;
        }
        vMeth_check_sum += (b ? 1 : 0) + l + i + Float.floatToIntBits(f) + i1 + i2 + i12 + i13 + i14 +
            Double.doubleToLongBits(d1) + i15 + i16 + s1 + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i17=-5, i18=-130, i19=-203, i20=5, i21=-11, i22=14, i23=2, i25=-50075, iArr3[][]=new int[N][N], iArr4[]=new
            int[N];
        boolean b1=false;
        long l1=30550L, lArr1[]=new long[N];

        FuzzerUtils.init(iArr3, 69);
        FuzzerUtils.init(lArr1, -497774791L);
        FuzzerUtils.init(iArr4, 11);

        vMeth(Test.bFld, Test.instanceCount, i17);
        Test.instanceCount += i17;
        iArr3[(i17 >>> 1) % N][(i17 >>> 1) % N] -= i17;
        i18 = 1;
        do {
            if (b1) break;
        } while (++i18 < 299);
        for (i19 = 9; i19 < 146; i19++) {
            i21 = 1;
            do {
                i20 *= (int)Test.fFld;
                i17 *= i18;
                for (l1 = 1; 1 > l1; l1++) {
                    i17 >>= i19;
                    i22 = (int)-144L;
                    Test.dFld += iFld;
                    lArr1[(int)(l1)] <<= Test.instanceCount;
                    iFld += (int)-28.532F;
                    Test.instanceCount += -192;
                    Test.fFld += (((l1 * i21) + Test.fFld) - i21);
                    i20 += (int)(((l1 * i23) + Test.fFld) - l1);
                }
            } while (++i21 < 183);
            i23 *= Test.byFld;
            Test.fArrFld[i19] -= Test.fFld;
            i23 *= (int)Test.fFld;
            i22 <<= i17;
            Test.sFld = (short)i22;
        }
        iFld = (int)Test.fFld;
        Test.fFld = 51763L;
        i20 = i20;
        i20 = i21;
        i25 = 1;
        do {
            Test.byFld -= (byte)i19;
            try {
                iFld = (1584095694 / i25);
                iArr4[i25 + 1] = (iArr3[i25][i25] % 10093);
                i17 = (i21 / i22);
            } catch (ArithmeticException a_e) {}
        } while (++i25 < 294);


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
//DEBUG  fMeth ->  fMeth vMeth mainTest
//DEBUG  iMeth ->  iMeth fMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
