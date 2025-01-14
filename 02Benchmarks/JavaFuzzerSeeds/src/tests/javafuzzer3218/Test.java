package tests.javafuzzer3218;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 04:16:38 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=120L;
    public static int iFld=156;
    public static volatile float fFld=-89.320F;
    public static volatile int iFld1=13579;
    public float fFld1=0.66F;
    public int iFld2=-83;
    public double dFld=0.118970;

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(boolean b, int i4) {

        int i5=-111, i6=-173, i7=-65127, i8=5, iArr1[]=new int[N];
        byte by=-48;
        double d1=16.43539;
        float f1=-80.936F;

        FuzzerUtils.init(iArr1, 62690);

        Test.instanceCount = i4;
        for (i5 = 1; i5 < 296; ++i5) {
            iArr1[i5 - 1] &= i5;
            for (i7 = 1; i7 < 6; i7++) {
                i8 -= by;
                switch ((i7 % 6) + 110) {
                case 110:
                    switch (((4 >>> 1) % 1) + 55) {
                    case 55:
                        i4 *= (int)Test.instanceCount;
                        i8 >>= -90;
                        break;
                    default:
                        d1 += Test.instanceCount;
                        iArr1[i5 + 1] >>>= (int)Test.instanceCount;
                        i6 = i5;
                    }
                case 111:
                    iArr1[i5 - 1] += (int)f1;
                    break;
                case 112:
                    i8 >>= i7;
                    d1 = i7;
                    break;
                case 113:
                    i6 *= i7;
                    break;
                case 114:
                    i8 <<= i7;
                    break;
                case 115:
                    f1 += i7;
                default:
                    i4 += (int)f1;
                }
            }
        }
        vMeth1_check_sum += (b ? 1 : 0) + i4 + i5 + i6 + i7 + i8 + by + Double.doubleToLongBits(d1) +
            Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i2) {

        float f=-17.987F, fArr[][]=new float[N][N];
        int i3=6, i9=41, i10=137;
        boolean b1=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -12L);
        FuzzerUtils.init(fArr, -58.112F);

        for (f = 4; 186 > f; ++f) {
            Test.instanceCount = (4140 - (-(-(i3 - i3))));
            vMeth1(b1, i2);
            switch ((((i3 >>> 1) % 1) * 5) + 81) {
            case 84:
                for (i9 = (int)(f); i9 < 9; ++i9) {
                    i10 >>= (int)Test.instanceCount;
                    lArr = lArr;
                    fArr[i9 - 1][(int)(f - 1)] -= i10;
                    b1 = b1;
                    lArr[i9 - 1] = i9;
                    i2 += i9;
                }
                i10 %= (int)((long)(f) | 1);
                i3 = i3;
                break;
            }
            if (b1) continue;
            i10 *= i10;
        }
        vMeth_check_sum += i2 + Float.floatToIntBits(f) + i3 + (b1 ? 1 : 0) + i9 + i10 + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth(double d, int i1) {

        int i11=-4, i12=-14, i13=-226, i14=-227;
        boolean b2=true;
        float f2=0.863F;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 30972L);

        vMeth(i1);
        for (i11 = 10; i11 < 179; ++i11) {
            i12 += (int)Test.instanceCount;
            i12 *= (int)Test.instanceCount;
            i12 += i11;
            lArr1[i11] = Test.iFld;
            b2 = true;
        }
        for (i13 = 24; 388 > i13; i13++) {
            i14 += (((i13 * i1) + i1) - i12);
            i1 -= i13;
            Test.iFld -= Test.iFld;
            Test.instanceCount <<= i14;
            if (b2) {
                i1 -= (int)f2;
                Test.iFld += (i13 | Test.instanceCount);
            }
        }
        long meth_res = Double.doubleToLongBits(d) + i1 + i11 + i12 + (b2 ? 1 : 0) + i13 + i14 +
            Float.floatToIntBits(f2) + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=9, i15=-104, i16=-59, i17=-8, i18=107, i19=163, iArr[]=new int[N];
        double d2=-117.8079;
        boolean b3=false;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(iArr, 27838);
        FuzzerUtils.init(byArr, (byte)-81);

        i = (int)((iArr[(i >>> 1) % N] = iMeth(d2, Test.iFld)) - d2);
        Test.iFld += 24278;
        for (i15 = 284; i15 > 16; --i15) {
            i17 = 1;
            do {
                iArr[i17 - 1] -= (int)Test.fFld;
                byArr[i17 - 1] += (byte)46396;
                for (i18 = 1; i18 < 1; ++i18) {
                    d2 *= 8567;
                    i19 >>= i18;
                    if (b3) {
                        i16 += (((i18 * Test.instanceCount) + i17) - i17);
                        Test.iFld += (((i18 * Test.fFld) + i15) - Test.iFld);
                    } else if (b3) {
                        Test.instanceCount -= (long)d2;
                        switch (((i17 % 5) * 5) + 125) {
                        case 140:
                            i -= (int)Test.instanceCount;
                            break;
                        case 138:
                            Test.iFld += (((i18 * Test.instanceCount) + i18) - i17);
                            Test.iFld1 >>= i15;
                            break;
                        case 137:
                            if (b3) break;
                            Test.instanceCount += i18;
                            if (b3) continue;
                        case 139:
                            i16 += (((i18 * i19) + Test.instanceCount) - Test.iFld1);
                            break;
                        case 150:
                            fFld1 += iFld2;
                            iFld2 <<= (int)Test.instanceCount;
                        default:
                            i16 -= (int)d2;
                        }
                        i *= i;
                        iArr = iArr;
                    } else if (b3) {
                        i <<= i16;
                        Test.instanceCount += i18;
                        iArr[i18] += (int)dFld;
                    }
                    fFld1 += (-39 + (i18 * i18));
                }
            } while (++i17 < 94);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
