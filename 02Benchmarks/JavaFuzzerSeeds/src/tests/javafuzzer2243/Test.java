package tests.javafuzzer2243;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 10:47:57 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=53L;
    public static double dFld=42.34092;
    public static short sFld=-4267;
    public static int iFld=13;
    public float fFld=84.386F;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i5=61402;

        i5 -= i5;
        vMeth2_check_sum += i5;
    }

    public static void vMeth1(int i3, int i4) {

        int i6=30775, i7=44377, i8=21829, i9=-247, i10=-244, i11=55152, iArr1[]=new int[N];
        float f=-42.724F;

        FuzzerUtils.init(iArr1, -7);

        vMeth2();
        i4 = 11;
        for (i6 = 13; i6 < 328; ++i6) {
            i7 *= i6;
            i8 = 1;
            do {
                i7 = i9;
                iArr1[i6 - 1] = (int)5587268769715271768L;
                i7 -= i7;
                i4 = -32;
                f = Test.instanceCount;
                switch (((i6 % 2) * 5) + 12) {
                case 18:
                    Test.instanceCount = -7;
                    for (i10 = 1; i10 < 1; i10++) {
                        iArr1[i8 - 1] += i7;
                        i3 = (int)Test.instanceCount;
                    }
                    break;
                case 13:
                    i4 += i8;
                    break;
                }
            } while (++i8 < 5);
        }
        vMeth1_check_sum += i3 + i4 + i6 + i7 + i8 + i9 + Float.floatToIntBits(f) + i10 + i11 +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i2) {

        int i12=-11577, i13=81, i14=1289, i15=30224, i16=12, iArr[][]=new int[N][N];
        boolean b=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -64957);
        FuzzerUtils.init(lArr, 4L);

        i2 <<= (i2 >> i2);
        iArr[(i2 >>> 1) % N] = iArr[(i2 >>> 1) % N];
        vMeth1(-4685, i2);
        lArr[(i2 >>> 1) % N] -= (long)2.769F;
        Test.dFld += i2;
        Test.instanceCount = i2;
        i12 = 1;
        while (++i12 < 273) {
            if (b) break;
            for (i13 = 1; i13 < 6; ++i13) {
                i2 = i14;
                iArr[i13 - 1][i13] = i2;
            }
            i14 += Test.sFld;
            for (i15 = i12; 6 > i15; ++i15) {
                iArr[i12 + 1][i12] *= i12;
                i14 = i14;
            }
        }
        vMeth_check_sum += i2 + i12 + (b ? 1 : 0) + i13 + i14 + i15 + i16 + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-70, i1=-15859, i17=-13, i18=-11, i19=-191, i20=35618, i21=7, i22=-36, i23=-123, i24=-237, i25=21,
            i27=201, i28=28281, iArr2[]=new int[N];

        FuzzerUtils.init(iArr2, 22451);

        for (i = 8; i < 210; i++) {
            Test.instanceCount = (long)((Test.instanceCount--) % (((long)(Test.dFld = (i - i))) | 1));
        }
        vMeth(10);
        for (i17 = 1; i17 < 122; i17++) {
            i1 += (((i17 * Test.instanceCount) + i17) - i1);
            i18 += (int)Test.dFld;
            i19 = 1;
            while (++i19 < 207) {
                i1 = i17;
            }
            iArr2[i17 + 1] *= i17;
            i1 >>= i19;
            for (i20 = 207; i20 > 7; i20--) {
                Test.instanceCount -= i19;
                i18 += (int)Test.dFld;
                for (i22 = 2; i22 > i17; i22 -= 2) {
                    Test.instanceCount += i18;
                }
            }
            switch (((i17 >>> 1) % 9) + 26) {
            case 26:
                switch (((i17 % 8) * 5) + 31) {
                case 44:
                case 47:
                    i21 -= i19;
                case 70:
                    for (i24 = 10; i24 < 207; i24++) {
                        i23 += i24;
                    }
                    Test.instanceCount = Test.instanceCount;
                case 42:
                    i25 = (int)Test.instanceCount;
                    i27 = 207;
                    while (--i27 > 0) {
                        i28 = 1;
                        do {
                            Test.iFld += i28;
                            Test.instanceCount += (((i28 * Test.instanceCount) + Test.instanceCount) - fFld);
                            iArr2[i28] += i25;
                            i18 += (i28 * i28);
                            fFld += (i28 * i28);
                            i21 += (int)4072801755L;
                        } while (++i28 < 1);
                    }
                    break;
                case 36:
                    fFld = (float)Test.dFld;
                    break;
                case 45:
                    Test.instanceCount = 10L;
                    break;
                case 67:
                    Test.iFld >>= Test.iFld;
                    break;
                case 34:
                    i21 -= -66;
                    break;
                }
                break;
            case 27:
                try {
                    Test.iFld = (-32171 % iArr2[i17 + 1]);
                    i23 = (369 / iArr2[(3 >>> 1) % N]);
                    i21 = (-43333 % i19);
                } catch (ArithmeticException a_e) {}
                break;
            case 28:
                i18 *= (int)-27902L;
                break;
            case 29:
                iArr2[i17 - 1] &= i17;
                break;
            case 30:
                Test.iFld -= (int)Test.instanceCount;
                break;
            case 31:
            case 32:
                i1 = i28;
            case 33:
                i18 = i17;
                break;
            case 34:
                Test.dFld = Test.instanceCount;
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
