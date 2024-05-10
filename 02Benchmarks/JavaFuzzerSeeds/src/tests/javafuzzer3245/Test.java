package tests.javafuzzer3245;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 04:34:20 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=0L;
    public static short sFld=32419;
    public static double dFld=51.128914;
    public static boolean bFld=false;
    public int iFld=-3;
    public static long lArrFld[]=new long[N];
    public int iArrFld[]=new int[N];
    public float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -3L);
    }

    public static long iMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(short s, float f1, long l1) {


        s |= (short)Test.instanceCount;
        vMeth_check_sum += s + Float.floatToIntBits(f1) + l1;
    }

    public static float fMeth(long l) {

        int i2=1, i3=241, i5=-25923, i6=-3768, i7=7358, i8=2728, iArr[]=new int[N];
        boolean b=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 8626577573507368316L);
        FuzzerUtils.init(iArr, -97);

        for (i2 = 192; i2 > 7; i2 -= 2) {
            float f2=84.831F;
            i3 += i2;
            vMeth(Test.sFld, f2, 780129959296917627L);
            lArr[i2] = Test.instanceCount;
            for (i5 = 1; 17 > i5; ++i5) {
                double d=-38.105776;
                d = -11;
                for (i7 = i2; i7 < 2; i7++) {
                    i6 *= i2;
                    i8 += (int)f2;
                    i6 = i5;
                    l += i7;
                }
                if (i8 != 0) {
                }
                if (b) break;
            }
            i6 = 4;
            Test.instanceCount = i8;
        }
        long meth_res = l + i2 + i3 + i5 + i6 + i7 + i8 + (b ? 1 : 0) + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static int iMeth(int i1) {

        float f=2.240F;
        int i9=157, i10=4, i11=16552, i12=66, i13=142, i14=16375, iArr1[]=new int[N];
        boolean b1=false;
        long lArr1[][]=new long[N][N];

        FuzzerUtils.init(iArr1, 53197);
        FuzzerUtils.init(lArr1, 12L);

        f -= fMeth(Test.instanceCount);
        Test.lArrFld = FuzzerUtils.long1array(N, (long)8573581235416884181L);
        for (i9 = 10; i9 < 177; ++i9) {
            for (i11 = i9; i11 < 9; ++i11) {
                iArr1 = iArr1;
                for (i13 = i9; i13 < 1; ++i13) {
                    iArr1[i9 + 1] >>= (int)Test.instanceCount;
                    if (b1) continue;
                }
            }
            lArr1 = lArr1;
            iArr1[i9] %= (int)(i10 | 1);
            Test.instanceCount += i9;
            f = 53;
            Test.sFld += (short)i13;
            i12 += (int)Test.dFld;
            i10 = (int)Test.instanceCount;
        }
        long meth_res = i1 + Float.floatToIntBits(f) + i9 + i10 + i11 + i12 + i13 + i14 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=11, i15=130, i16=-5, i17=-20572, i18=12, i19=-13, i20=12770, i21=29285;
        float f3=0.671F;
        byte by=-29;
        boolean bArr[]=new boolean[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(dArr, 1.38900);

        i = (((i * i) * iMeth(i)) - i);
        bArr[(i >>> 1) % N] = Test.bFld;
        Test.instanceCount = -3;
        for (i15 = 356; i15 > 9; i15 -= 3) {
            for (i17 = 5; 218 > i17; i17++) {
                Test.instanceCount = i15;
                i19 = 1;
                do {
                    dArr[i19 - 1] += Test.dFld;
                } while (++i19 < 2);
                i20 = 2;
                while ((i20 -= 3) > 0) {
                    iArrFld[i17] = -6;
                    iArrFld[i20] -= (int)f3;
                    switch (((i17 % 6) * 5) + 60) {
                    case 76:
                        Test.instanceCount = i20;
                        iArrFld[i20 - 1] = (int)8006021324597779057L;
                        break;
                    case 77:
                        switch (((i17 % 2) * 5) + 78) {
                        case 88:
                            Test.instanceCount <<= Test.instanceCount;
                            f3 = i;
                            i += (i20 ^ i);
                            break;
                        case 85:
                            Test.instanceCount += i16;
                            Test.instanceCount += (long)f3;
                            i18 ^= by;
                            break;
                        }
                        iArrFld[i15 - 1] = i15;
                        break;
                    case 86:
                        i16 = (int)f3;
                        Test.dFld -= i16;
                        Test.dFld += Test.instanceCount;
                    case 65:
                        i = i19;
                        switch ((i17 % 4) + 105) {
                        case 105:
                            fArrFld[i20 + 1] = i;
                            iArrFld[i15 + 1] ^= i16;
                        case 106:
                            i -= (int)-8952748050257450585L;
                            break;
                        case 107:
                            f3 += i18;
                            break;
                        case 108:
                            iFld = i19;
                        }
                    case 88:
                        iFld *= i21;
                        break;
                    case 63:
                        i18 -= (int)Test.dFld;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  fMeth ->  fMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
