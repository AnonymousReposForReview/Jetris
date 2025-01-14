package tests.javafuzzer3148;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 02:45:49 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-40L;
    public static byte byFld=33;
    public static int iFld=72;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];
    public static float fArrFld[]=new float[N];
    public short sArrFld[][]=new short[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 127);
        FuzzerUtils.init(Test.lArrFld, -3600812992L);
        FuzzerUtils.init(Test.fArrFld, 0.221F);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth() {

        int i4=-10;
        float f=72.346F;
        long l1=-64L, lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, 11L);

        lArr[(i4 >>> 1) % N][(i4 >>> 1) % N] |= Test.instanceCount;
        i4 -= i4;
        f = i4;
        i4 = (int)l1;
        Test.iArrFld = Test.iArrFld;
        long meth_res = i4 + Float.floatToIntBits(f) + l1 + FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i1, byte by) {

        int i2=2240, i3=-65497, i5=67, i6=30153, iArr[]=new int[N];
        float f1=0.52F;

        FuzzerUtils.init(iArr, -51168);

        for (i2 = 5; i2 < 178; ++i2) {
            Test.instanceCount += (Math.max(--iArr[i2 - 1], i2 + i3) - i1);
            lMeth();
            Test.instanceCount = i1;
            for (i5 = 1; i5 < 9; ++i5) {
                i3 += (((i5 * i3) + Test.instanceCount) - Test.instanceCount);
                Test.instanceCount ^= -44663;
                i6 = (int)f1;
                i3 += (i5 - i3);
                switch (((i2 >>> 1) % 1) + 108) {
                case 108:
                    i6 -= (int)Test.instanceCount;
                    i3 += (((i5 * i1) + Test.instanceCount) - f1);
                    i6 += i2;
                    break;
                default:
                    f1 *= i1;
                    i1 = (int)f1;
                }
            }
        }
        vMeth_check_sum += i1 + by + i2 + i3 + i5 + i6 + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(int i, long l, boolean b) {

        long l2=173L;
        int i7=-103;
        float f2=2.386F;
        short s=5732;

        vMeth(i, Test.byFld);
        Test.instanceCount = i;
        i = -239;
        for (l2 = 3; 129 > l2; l2++) {
            i -= Test.byFld;
            i7 = i;
            f2 = i;
            switch (((i7 >>> 1) % 2) + 114) {
            case 114:
                if (b) {
                    l = i7;
                    i7 += (int)(((l2 * i7) + i7) - i7);
                }
                if (i7 != 0) {
                }
                s -= (short)i7;
                Test.byFld += (byte)f2;
            case 115:
                Test.lArrFld[(int)(l2 + 1)] -= l2;
                break;
            }
        }
        long meth_res = i + l + (b ? 1 : 0) + l2 + i7 + Float.floatToIntBits(f2) + s;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        boolean b1=false, bArr[]=new boolean[N];
        int i8=-9, i9=-724, i10=9, i11=-8564, i12=-15856, i13=0, i14=120, i15=-6552, i16=-7;
        float f3=3.667F;
        short s1=-4919;
        long l3=-25317L;
        double d=-66.78282;

        FuzzerUtils.init(bArr, true);

        iMeth(Test.iFld, 8703L, b1);
        Test.instanceCount *= Test.iFld;
        for (i8 = 22; 359 > i8; i8++) {
            Test.lArrFld = Test.lArrFld;
            Test.instanceCount = (long)f3;
            i9 = -6;
        }
        Test.iFld -= s1;
        bArr[(i8 >>> 1) % N] = b1;
        Test.byFld *= (byte)i8;
        Test.iFld = i9;
        for (i10 = 6; i10 < 173; ++i10) {
            for (i12 = i10; i12 < 150; i12++) {
                for (i14 = 1; 1 > i14; ++i14) {
                    Test.iArrFld[i10] += (int)Test.instanceCount;
                    i9 += i9;
                    if (b1) continue;
                }
                try {
                    i15 = (i9 / Test.iArrFld[i10 - 1]);
                    Test.iFld = (i11 % 57017);
                    i15 = (i13 / -133);
                } catch (ArithmeticException a_e) {}
                Test.instanceCount += (((i12 * i12) + i10) - Test.instanceCount);
                f3 = Test.byFld;
                i9 += (int)(12L + (i12 * i12));
                l3 = 1;
                while (++l3 < 1) {
                    i11 = (int)l3;
                }
                b1 = true;
            }
            switch ((i10 % 7) + 4) {
            case 4:
                if (b1) {
                    i16 = 1;
                    while ((i16 += 3) < 150) {
                        Test.iFld >>= i15;
                        f3 -= 92.65F;
                        Test.fArrFld[i10 + 1] = i10;
                        Test.instanceCount += i16;
                    }
                }
                break;
            case 5:
                sArrFld[i10 + 1][i10] = (short)26018;
            case 6:
                i13 |= i10;
            case 7:
                s1 -= (short)-9;
                break;
            case 8:
                Test.lArrFld[i10 + 1] += i13;
            case 9:
                s1 <<= (short)i16;
                break;
            case 10:
                d = i12;
            default:
                Test.byFld = (byte)i16;
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
