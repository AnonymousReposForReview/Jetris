package tests.javafuzzer3034;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 01:04:53 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-13L;
    public static float fFld=-14.415F;
    public static boolean bFld=true;
    public static volatile short sFld=-24852;
    public static double dArrFld[]=new double[N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 25.18946);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;

    public static long lMeth1() {

        int i4=-23903, i5=9719, i6=-38209, i7=-242, i8=169, i9=-10820, iArr[][]=new int[N][N];
        short s1=-12719;
        double d1=-15.118485;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 0);
        FuzzerUtils.init(lArr, 7872377441189349829L);

        for (i4 = 18; i4 < 329; i4++) {
            Test.fFld += -8;
            for (i6 = 1; 5 > i6; i6++) {
                for (i8 = 1; i8 < 2; ++i8) {
                    try {
                        i9 = (i4 / 248);
                        i7 = (iArr[i6 - 1][i4] % -51271);
                        iArr[i6 - 1][i6 + 1] = (-56 % iArr[i8 - 1][i6]);
                    } catch (ArithmeticException a_e) {}
                    i7 -= 130;
                    i7 += i9;
                    iArr[i6 - 1][i6] >>= i9;
                    Test.fFld %= (s1 | 1);
                    switch (((i4 % 4) * 5) + 97) {
                    case 104:
                        if (Test.bFld) {
                            if (Test.bFld) {
                                i5 += (((i8 * i7) + Test.fFld) - Test.instanceCount);
                            } else {
                                i7 <<= i7;
                                Test.instanceCount *= (long)-2.960F;
                            }
                        } else if (Test.bFld) {
                            i7 = i8;
                        } else {
                            lArr[i6 - 1] = Test.instanceCount;
                        }
                    case 102:
                        iArr[i4 - 1][i6 - 1] = (int)d1;
                        break;
                    case 115:
                        Test.bFld = Test.bFld;
                        break;
                    case 108:
                        iArr[i8][i4] >>= i8;
                        break;
                    default:
                        i7 += (int)-10L;
                    }
                }
            }
        }
        long meth_res = i4 + i5 + i6 + i7 + i8 + i9 + s1 + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(lArr);
        lMeth1_check_sum += meth_res;
        return (long)meth_res;
    }

    public static long lMeth(int i3) {

        int i10=-72, i11=-147, iArr1[]=new int[N];
        byte by1=-118;

        FuzzerUtils.init(iArr1, -11);

        switch ((((((int)(Test.instanceCount + i3)) >>> 1) % 2) * 5) + 10) {
        case 18:
            Test.instanceCount <<= (Test.instanceCount / (lMeth1() | 1));
            i3 >>= i3;
            break;
        case 15:
            Test.instanceCount >>= Test.sFld;
            i10 = 1;
            while (++i10 < 218) {
                by1 -= (byte)6;
                i11 = 1;
                do {
                    Test.dArrFld[i11 - 1] = i3;
                    if (Test.bFld) break;
                    i3 += (((i11 * i10) + Test.fFld) - i10);
                    i3 = 2;
                } while (++i11 < 7);
                iArr1[i10] -= i3;
                Test.fFld = i11;
                Test.fFld += (i10 * i11);
                i3 &= -8;
            }
            break;
        }
        long meth_res = i3 + i10 + by1 + i11 + FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(short s) {

        int i=3, i1=-33450, i2=-67, iArr2[]=new int[N];
        float f=-1.77F, f1=32.844F;
        double d=46.4792;
        byte by=-10;
        long l=-160L;

        FuzzerUtils.init(iArr2, -23854);

        for (i = 18; i < 322; i++) {
            f = 1;
            while (++f < 5) {
                i1 += (int)(f - Test.instanceCount);
                for (d = 1; d > 1; --d) {
                    by += (byte)(((d * Test.instanceCount) + i1) - by);
                    Test.instanceCount += i2;
                    Test.instanceCount += -14298;
                    f1 -= Test.instanceCount;
                    i2 -= (int)Test.instanceCount;
                    l += (-(i1 -= (int)lMeth(i1)));
                    iArr2[(int)(d)] ^= i;
                    i2 += (int)((long)d | i);
                }
                i2 += (int)f;
                l += (long)(((f * Test.instanceCount) + i2) - i1);
                l += i1;
            }
        }
        vMeth_check_sum += s + i + i1 + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i2 + by +
            Float.floatToIntBits(f1) + l + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i12=-55, i13=192, i14=172, i15=-49153, i16=-14687, i17=32315, i18=193, i19=143, i20=4, i21=-45607;
        double d2=82.89680;
        long l1=-7437997151383570235L, lArr1[]=new long[N];
        byte by2=-4;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 124.908F);
        FuzzerUtils.init(lArr1, -3051542664198927884L);

        vMeth(Test.sFld);
        iArrFld[(i12 >>> 1) % N] = (int)52640L;
        for (i13 = 207; i13 > 5; i13 -= 2) {
            switch ((i13 % 1) + 12) {
            case 12:
                i12 += i13;
                switch (((-10 >>> 1) % 8) + 21) {
                case 21:
                    i12 *= (int)Test.instanceCount;
                    break;
                case 22:
                    for (i15 = 12; i15 < 248; ++i15) {
                        for (i17 = i13; i17 < 2; i17++) {
                            i12 += (int)(-2.149F + (i17 * i17));
                            i16 += (i17 * i17);
                        }
                        Test.sFld *= (short)i16;
                        i12 *= (int)Test.instanceCount;
                    }
                    fArr[i13 + 1] -= -10;
                    switch ((((i15 >>> 1) % 2) * 5) + 42) {
                    case 49:
                        Test.instanceCount += (i13 * i18);
                        break;
                    case 51:
                        i19 = 1;
                        do {
                            Test.instanceCount += i19;
                            for (i20 = 1; i20 < 1; i20++) {
                                iArrFld[i20 - 1] = i18;
                                d2 *= Test.instanceCount;
                                iArrFld[i20 - 1] *= i12;
                                Test.instanceCount *= i16;
                            }
                            lArr1[i19] -= i14;
                            i18 = i20;
                            i21 *= (int)Test.instanceCount;
                            i12 = Test.sFld;
                            i16 >>>= (int)l1;
                            i21 -= -2;
                            Test.sFld += (short)(((i19 * Test.fFld) + i21) - l1);
                        } while (++i19 < 248);
                        break;
                    default:
                        i18 += i18;
                    }
                case 23:
                    by2 -= (byte)i20;
                    break;
                case 24:
                    iArrFld[i13] = 10;
                    break;
                case 25:
                    i16 += i14;
                case 26:
                    i18 += i16;
                    break;
                case 27:
                    i21 *= by2;
                case 28:
                    lArr1[i13] >>= Test.instanceCount;
                    break;
                }
                break;
            default:
                Test.instanceCount *= i15;
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  lMeth1 ->  lMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
