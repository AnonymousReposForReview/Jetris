package tests.javafuzzer3008;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 00:45:02 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-42752L;
    public float fFld=0.825F;
    public static short sFld=17201;
    public static volatile byte byFld=6;
    public float fArrFld[]=new float[N];

    public static long byMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i4, int i5, long l) {

        int i6=10, i7=-2, i8=249, i9=44422, i10=-10;
        double d1=57.14442;
        float f=2.764F;
        byte by=114;
        boolean b=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -4198403169L);

        i6 = 1;
        while (++i6 < 234) {
            i4 -= -157;
            lArr[i6 + 1] += i6;
            d1 -= i6;
        }
        for (i7 = 6; i7 < 176; i7++) {
            for (i9 = 1; i9 < 9; ++i9) {
                f += i5;
                try {
                    i8 = (53 / i4);
                    i5 = (i5 % -36);
                    i4 = (i5 % 6);
                } catch (ArithmeticException a_e) {}
                i4 += (i9 * Test.instanceCount);
                i10 += (((i9 * f) + f) - i7);
                i10 -= (int)Test.instanceCount;
                f -= l;
            }
            by >>= (byte)i5;
            if (b) continue;
            i8 += Test.sFld;
        }
        vMeth_check_sum += i4 + i5 + l + i6 + Double.doubleToLongBits(d1) + i7 + i8 + i9 + i10 +
            Float.floatToIntBits(f) + by + (b ? 1 : 0) + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth() {

        int i2=7, i3=-5, i11=41850, i12=51971, i13=-25509, iArr[]=new int[N];
        double d=0.113276;
        long l1=84L, lArr1[]=new long[N];
        float f1=-104.5F;
        boolean b1=true;

        FuzzerUtils.init(iArr, -10);
        FuzzerUtils.init(lArr1, 216L);

        for (i2 = 17; i2 < 365; i2++) {
            i3 = i2;
        }
        d = (((i3 + Test.instanceCount) + (i2 * i2)) + ((Test.instanceCount + Test.instanceCount) +
            Test.instanceCount));
        vMeth(i3, i2, 159L);
        for (l1 = 10; 187 > l1; ++l1) {
            iArr = iArr;
            for (i12 = (int)(l1); i12 < 9; ++i12) {
                switch ((i12 % 6) + 28) {
                case 28:
                    i13 += Test.byFld;
                    i13 -= (int)f1;
                    i11 = (int)Test.instanceCount;
                    lArr1[(int)(l1)] += Test.instanceCount;
                    break;
                case 29:
                    i3 += (i12 * i12);
                    i11 = i13;
                    Test.instanceCount += (((i12 * i3) + Test.instanceCount) - Test.instanceCount);
                    break;
                case 30:
                    i13 = 7;
                case 31:
                    Test.instanceCount *= i11;
                    break;
                case 32:
                    if (b1) break;
                    break;
                case 33:
                    Test.instanceCount += (((i12 * i12) + i3) - i3);
                    break;
                default:
                    try {
                        i13 = (iArr[(int)(l1)] % i13);
                        iArr[i12 + 1] = (i3 % i12);
                        i13 = (i3 % i13);
                    } catch (ArithmeticException a_e) {}
                }
            }
        }
        long meth_res = i2 + i3 + Double.doubleToLongBits(d) + l1 + i11 + i12 + i13 + Float.floatToIntBits(f1) + (b1 ?
            1 : 0) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static byte byMeth() {

        int i1=51979, i14=2, i15=-52046, i16=-4, i17=188, i18=37490, iArr1[]=new int[N];
        boolean b2=true;

        FuzzerUtils.init(iArr1, -14399);

        i1 = Math.max(iMeth(), i1);
        for (i14 = 2; 356 > i14; i14 += 3) {
            i16 = 1;
            while (++i16 < 13) {
                for (i17 = i16; i17 < 1; i17++) {
                    Test.instanceCount -= i1;
                    i1 += (128 + (i17 * i17));
                    i15 = i16;
                    switch (((i17 % 6) * 5) + 24) {
                    case 37:
                        try {
                            i15 = (i17 / 14);
                            i1 = (iArr1[i16 + 1] / i14);
                            i18 = (i18 % i14);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 51:
                        i18 /= (int)(i15 | 1);
                        i1 += (i17 * i17);
                        switch (((i14 >>> 1) % 3) + 63) {
                        case 63:
                            b2 = b2;
                            break;
                        case 64:
                            i15 = i14;
                            i15 += i15;
                        case 65:
                            Test.instanceCount >>= i14;
                            break;
                        default:
                            i18 += i18;
                        }
                    case 26:
                        i15 -= (int)Test.instanceCount;
                    case 32:
                        i18 ^= i14;
                        break;
                    case 54:
                    case 30:
                        Test.sFld -= (short)2418;
                        break;
                    default:
                        i1 = 34749;
                    }
                }
            }
        }
        long meth_res = i1 + i14 + i15 + i16 + i17 + i18 + (b2 ? 1 : 0) + FuzzerUtils.checkSum(iArr1);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-9078, i19=-184, i20=-7, i21=180, i22=181, i23=11, i24=-23557, i25=0, i26=5;
        double d2=-1.64004, d3=-47.115915;
        float f2=-2.839F;
        long lArr2[]=new long[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(lArr2, -10L);
        FuzzerUtils.init(byArr, (byte)1);

        Test.instanceCount = ((long)((i - i) - (-(++fFld))) ^ ((2L - byMeth()) + i));
        i *= i;
        for (i19 = 342; i19 > 16; i19--) {
            fArrFld[i19 - 1] += i;
            i21 = 1;
            do {
                fFld -= i;
            } while (++i21 < 77);
            fFld -= Test.instanceCount;
            i20 -= (int)d2;
            for (i22 = i19; 77 > i22; ++i22) {
                Test.instanceCount *= (long)d2;
                switch (((i20 >>> 1) % 5) + 42) {
                case 42:
                    Test.byFld = (byte)Test.sFld;
                    break;
                case 43:
                case 44:
                    i23 += (int)Test.instanceCount;
                    break;
                case 45:
                case 46:
                    i20 += i22;
                    lArr2[i19] += (long)15.104502;
                    lArr2[i19 + 1] = i23;
                    Test.instanceCount <<= i20;
                default:
                    Test.instanceCount += i22;
                }
                Test.sFld += (short)i23;
                i23 = i23;
                Test.instanceCount = i20;
            }
            for (f2 = 1; f2 < 77; f2++) {
                i24 += (int)d2;
                d3 = 1;
                while ((d3 += 2) < 2) {
                    i += i23;
                }
                Test.instanceCount = Test.sFld;
                i24 += (int)(((f2 * i24) + i22) - Test.instanceCount);
                for (i25 = 1; i25 < 2; ++i25) {
                    fFld *= 22.275F;
                    byArr[i19 - 1] >>>= (byte)i19;
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
//DEBUG  byMeth ->  byMeth mainTest
//DEBUG  iMeth ->  iMeth byMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth byMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}