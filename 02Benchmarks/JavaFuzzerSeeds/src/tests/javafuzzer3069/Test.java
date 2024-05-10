package tests.javafuzzer3069;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 01:31:28 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=8974248069287231512L;
    public static int iFld=7;
    public static int iFld1=-14;
    public static int iArrFld[]=new int[N];
    public static byte byArrFld[]=new byte[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -1);
        FuzzerUtils.init(Test.byArrFld, (byte)29);
        FuzzerUtils.init(Test.lArrFld, -4466531607545288759L);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(byte by) {

        int i11=-26, i13=153, i14=62589, i15=-12, i16=-4;
        double d=0.92086;
        boolean b=true;
        float f1=104.331F;

        i11 = i11;
        i11 >>= i11;
        if (b) {
            for (int i12 : Test.iArrFld) {
                switch (((i12 >>> 1) % 7) + 2) {
                case 2:
                    for (i13 = 1; 4 > i13; i13++) {
                        i15 = 1;
                        while (++i15 < 2) {
                            short s=-28264;
                            Test.instanceCount = i15;
                            d += 22729L;
                            i11 >>= (int)Test.instanceCount;
                            s &= (short)Test.instanceCount;
                            i12 += (i15 | i14);
                            b = b;
                        }
                        Test.iArrFld[i13] += (int)f1;
                        i11 = i11;
                    }
                    break;
                case 3:
                    i14 = i14;
                    break;
                case 4:
                    Test.instanceCount = i14;
                    break;
                case 5:
                    i11 >>= i16;
                    break;
                case 6:
                    i16 += i15;
                    break;
                case 7:
                    Test.iArrFld[(-240 >>> 1) % N] = Test.iFld;
                    break;
                case 8:
                    if (i13 != 0) {
                        vMeth1_check_sum += by + i11 + i13 + i14 + i15 + Double.doubleToLongBits(d) + (b ? 1 : 0) +
                            Float.floatToIntBits(f1) + i16;
                        return;
                    }
                    break;
                default:
                    Test.iArrFld[(i14 >>> 1) % N] = i14;
                }
            }
            vMeth1_check_sum += by + i11 + i13 + i14 + i15 + Double.doubleToLongBits(d) + (b ? 1 : 0) +
                Float.floatToIntBits(f1) + i16;
            return;
        } else {
            Test.instanceCount <<= Test.iFld;
        }
        vMeth1_check_sum += by + i11 + i13 + i14 + i15 + Double.doubleToLongBits(d) + (b ? 1 : 0) +
            Float.floatToIntBits(f1) + i16;
    }

    public static long lMeth(int i10, long l1, long l2) {

        byte by1=36;
        float f2=98.567F, f3=-8.884F;
        int i17=13, i18=-41872, i19=823, i20=47301;
        short s1=-22111;
        double d1=1.18284;
        boolean b1=false, b2=false;

        vMeth1(by1);
        f2 = 130;
        do {
            for (i17 = 12; i17 > 1; --i17) {
                for (f3 = 1; 2 > f3; ++f3) {
                    Test.byArrFld[i17] >>>= (byte)i18;
                    s1 += (short)(f3 * Test.instanceCount);
                    Test.instanceCount >>= Test.iFld;
                    try {
                        i18 = (Test.iFld / Test.iFld);
                        i10 = (Test.iArrFld[(int)(f3)] % Test.iFld1);
                        i10 = (Test.iArrFld[(int)(f2 + 1)] / 40);
                    } catch (ArithmeticException a_e) {}
                    i19 = i17;
                    i18 = Test.iFld1;
                    l1 += (long)(((f3 * by1) + i19) - s1);
                    i18 -= (int)f3;
                }
                i20 = 1;
                do {
                    d1 = i20;
                    b1 = b2;
                } while (++i20 < 2);
            }
        } while (--f2 > 0);
        long meth_res = i10 + l1 + l2 + by1 + Float.floatToIntBits(f2) + i17 + i18 + Float.floatToIntBits(f3) + i19 +
            s1 + i20 + Double.doubleToLongBits(d1) + (b1 ? 1 : 0) + (b2 ? 1 : 0);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i2, long l, int i3) {

        int i4=0, i5=-10, i6=20, i7=-35348, i8=4, i9=1;
        float f=4.283F, fArr[]=new float[N];
        double d2=0.32309;

        FuzzerUtils.init(fArr, 59.18F);

        for (i4 = 4; i4 < 133; i4++) {
            i2 -= (i5--);
            i3 ^= (int)(-(Test.instanceCount = (-13 - (i3++))));
            for (i6 = i4; i6 < 12; ++i6) {
                for (i8 = 1; i8 < 1; i8++) {
                    i2 += (i8 | i9);
                    i2 -= (int)(f * ((-30.108641 - (2114 * (i4 + l))) + (i7 + i4)));
                    Test.instanceCount = ((--i2) % (lMeth(i9, Test.instanceCount, Test.instanceCount) | 1));
                    i3 -= Test.iFld;
                    f += (float)-124.121244;
                    fArr[i4] += i8;
                    l += (((i8 * Test.instanceCount) + i8) - Test.iFld1);
                }
                if (Test.iFld1 != 0) {
                    vMeth_check_sum += i2 + l + i3 + i4 + i5 + i6 + i7 + i8 + i9 + Float.floatToIntBits(f) +
                        Double.doubleToLongBits(d2) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                    return;
                }
                f -= (float)d2;
                l += (((i6 * Test.instanceCount) + i4) - i5);
            }
        }
        vMeth_check_sum += i2 + l + i3 + i4 + i5 + i6 + i7 + i8 + i9 + Float.floatToIntBits(f) +
            Double.doubleToLongBits(d2) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i=-229, i1=59932, i21=3, i22=21172, i23=8, i24=52643;
        double d3=-2.82543;
        long l3=-18139L;
        float f4=1.24F;
        byte by2=53;

        for (i = 15; i < 370; ++i) {
            vMeth(Test.iFld1, Test.instanceCount, i);
            switch (((Test.iFld1 >>> 1) % 6) + 121) {
            case 121:
                i1 = (int)Test.instanceCount;
                for (i21 = 4; i21 < 71; ++i21) {
                    if (true) continue;
                    Test.iFld = i1;
                    Test.iFld = i21;
                    d3 -= i21;
                }
                l3 = i1;
                Test.instanceCount &= l3;
                break;
            case 122:
                i1 += i;
                break;
            case 123:
                for (i23 = i; i23 < 71; i23++) {
                    f4 += i24;
                    Test.iArrFld[i - 1] += (int)f4;
                    Test.iFld1 += (i23 * i23);
                    d3 -= f4;
                    i22 >>>= Test.iFld1;
                    Test.lArrFld[i + 1] = 4;
                    Test.instanceCount <<= l3;
                    Test.iArrFld[i - 1] = by2;
                }
                Test.iFld1 += by2;
                by2 += (byte)i21;
                i24 = i;
                break;
            case 124:
                Test.iFld += 1;
                i22 = i;
                break;
            case 125:
                i22 *= (int)Test.instanceCount;
                by2 = (byte)i;
                break;
            case 126:
                i22 += i;
                Test.iFld1 += (((i * Test.iFld1) + by2) - Test.iFld);
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
