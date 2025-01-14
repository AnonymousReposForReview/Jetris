package tests.javafuzzer2516;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 15:55:05 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=64478L;
    public static byte byFld=39;
    public static float fFld=-116.289F;
    public static boolean bFld=false;
    public static short sFld=5877;
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.fArrFld, -2.307F);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i2, int i3, short s) {

        int i4=2, i5=-122, i6=131, i7=11, i9=-14, i10=107, i11=-187, i12=5018, iArr1[]=new int[N];
        double d=-1.83512;

        FuzzerUtils.init(iArr1, 249);

        i3 <<= i2;
        i3 = i4;
        i5 = 1;
        while (++i5 < 249) {
            Test.byFld -= (byte)i4;
            for (i6 = 1; i6 < 7; i6++) {
                i3 += (i6 + i2);
                Test.instanceCount <<= Test.instanceCount;
            }
            if (i7 != 0) {
                vMeth_check_sum += i2 + i3 + s + i4 + i5 + i6 + i7 + i9 + i10 + Double.doubleToLongBits(d) + i11 + i12
                    + FuzzerUtils.checkSum(iArr1);
                return;
            }
            i7 = (int)Test.instanceCount;
            Test.fFld = i2;
            for (i9 = i5; 7 > i9; i9++) {
                d -= Test.instanceCount;
                for (i11 = 1; i11 < 1; ++i11) {
                    if (Test.bFld) continue;
                    Test.instanceCount += (((i11 * i7) + Test.fFld) - Test.instanceCount);
                }
            }
        }
        vMeth_check_sum += i2 + i3 + s + i4 + i5 + i6 + i7 + i9 + i10 + Double.doubleToLongBits(d) + i11 + i12 +
            FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth1() {

        int i1=33991, i13=-22, i14=-12, i15=-11, i16=3, i17=-13, i18=-31, i19=92, iArr[][]=new int[N][N];
        double d1=2.74859;

        FuzzerUtils.init(iArr, -6981);

        i1 = (iArr[(i1 >>> 1) % N][(-185 >>> 1) % N] = i1);
        vMeth(i1, i1, (short)(6256));
        i1 += i1;
        i13 = 1;
        do {
            i1 += i13;
            Test.instanceCount = i13;
            iArr[i13 + 1][i13 + 1] &= 18276;
            i1 += (((i13 * Test.fFld) + Test.instanceCount) - i1);
            for (i14 = 5; i14 > i13; i14 -= 3) {
                d1 %= ((long)(Test.fFld) | 1);
                iArr[i13 - 1][i14 + 1] -= 9;
            }
            for (i16 = 1; i16 < 5; i16++) {
                for (i18 = 1; i18 < 2; i18++) {
                    Test.fFld = Test.instanceCount;
                    if (i19 != 0) {
                    }
                }
            }
        } while (++i13 < 329);
        long meth_res = i1 + i13 + i14 + i15 + Double.doubleToLongBits(d1) + i16 + i17 + i18 + i19 +
            FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(float f, int i) {

        int i20=-156, i21=-13, i22=13, i23=-1;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -8201068980098519661L);

        i <<= (int)Test.instanceCount;
        Test.fArrFld[(i >>> 1) % N] *= iMeth1();
        for (i20 = 21; 351 > i20; i20++) {
            for (i22 = 1; i22 < 5; ++i22) {
                i = i23;
            }
            if (Test.bFld) break;
            f += (i20 * i20);
            i += (i20 * i20);
            Test.instanceCount = -14L;
            if (Test.bFld) continue;
            i23 += (((i20 * i21) + i23) - Test.byFld);
            switch (((i20 % 3) * 5) + 123) {
            case 135:
                Test.sFld = (short)-74.353F;
                i *= i23;
                lArr[i20] *= i21;
                break;
            case 130:
                i23 &= (int)Test.instanceCount;
            case 124:
                i += 54937;
                break;
            }
        }
        long meth_res = Float.floatToIntBits(f) + i + i20 + i21 + i22 + i23 + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i24=44163;

        iMeth(Test.fFld, i24);


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
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
