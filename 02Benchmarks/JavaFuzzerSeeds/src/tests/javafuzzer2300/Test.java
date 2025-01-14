package tests.javafuzzer2300;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 11:42:19 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=5712092893286437602L;
    public int iFld=58399;
    public static byte byFld=14;
    public static float fFld=103.712F;
    public static double dFld=1.21694;
    public static int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];
    public short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -60);
        FuzzerUtils.init(Test.fArrFld, -83.359F);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(int i7) {

        int i8=-12, i9=56701, i10=50426, i11=9, i12=-166;
        double d1=1.75238;
        boolean b=true;
        byte by1=73;
        float f=-2.495F;

        i8 = 1;
        do {
            d1 += i7;
            try {
                i7 = (i8 % 227);
                Test.iArrFld[i8] = (i7 % i7);
                i7 = (780517588 / Test.iArrFld[i8 - 1]);
            } catch (ArithmeticException a_e) {}
            i7 -= i8;
            for (i9 = 1; i9 < 8; i9++) {
                Test.iArrFld = Test.iArrFld;
                Test.fArrFld[i9] += Test.instanceCount;
                for (i11 = 2; i11 > 1; i11--) {
                    d1 -= i7;
                    if (b) continue;
                    i7 >>= i10;
                    Test.iArrFld[i8 + 1] = -108;
                    by1 = (byte)Test.instanceCount;
                    Test.iArrFld[i11] >>= i10;
                    f = -185L;
                }
            }
        } while (++i8 < 195);
        long meth_res = i7 + i8 + Double.doubleToLongBits(d1) + i9 + i10 + i11 + i12 + (b ? 1 : 0) + by1 +
            Float.floatToIntBits(f);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth(int i, int i1) {

        int i2=4, i3=-5, i4=40, i5=0, i6=21930;
        byte by=-101;
        double d=-2.69523;
        short s=1791;
        float f1=-49.757F;
        long l1=-3L;

        i1 = (int)(((i2 + i) + (by * i)) - ((d -= i) - (i + -5)));
        for (i3 = 8; 142 > i3; ++i3) {
            for (i5 = 1; i5 < 12; i5++) {
                boolean b1=false;
                s -= (short)(i3 >>> (i3 + (-11532 + (i2 * -223))));
                d = (((i1 * -14025) >> (Test.instanceCount - Test.instanceCount)) - ((-(by + i1)) - fMeth(i2)));
                f1 += -9;
                by += (byte)i4;
                Test.instanceCount += i3;
                switch ((((i6 >>> 1) % 1) * 5) + 60) {
                case 61:
                    d -= i5;
                    i6 >>>= i;
                    if (b1) {
                        i1 += i5;
                        i6 += i6;
                        i += (i5 + i3);
                        vMeth_check_sum += i + i1 + i2 + by + Double.doubleToLongBits(d) + i3 + i4 + i5 + i6 + s +
                            Float.floatToIntBits(f1) + l1;
                        return;
                    } else if (b1) {
                        d /= -3;
                    } else {
                        i4 += i5;
                    }
                    break;
                default:
                    Test.instanceCount += (((i5 * i2) + f1) - l1);
                }
            }
        }
        vMeth_check_sum += i + i1 + i2 + by + Double.doubleToLongBits(d) + i3 + i4 + i5 + i6 + s +
            Float.floatToIntBits(f1) + l1;
    }

    public int iMeth(long l) {

        int i13=0, i14=63725, i15=5, i16=-23055, i17=-29931, i18=219;

        vMeth(iFld, 11);
        iFld <<= iFld;
        Test.instanceCount = iFld;
        for (i13 = 10; i13 < 242; i13 += 3) {
            iFld += (i13 ^ i14);
            Test.byFld <<= (byte)l;
        }
        i14 = -10;
        i14 *= iFld;
        for (i15 = 143; i15 > 5; i15--) {
            for (i17 = i15; i17 < 11; i17++) {
                i18 = i14;
                i16 = (int)-36531L;
                Test.fFld *= i16;
                i18 += i17;
                i18 += i17;
            }
        }
        long meth_res = l + i13 + i14 + i15 + i16 + i17 + i18;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i19=13, i20=-12517, i21=2, i22=-61, i23=-26246, i24=-53023, i25=-4, i26=-37540, i27=-10, i28=183, i29=14,
            i30=-35125;
        boolean b2=false;

        iFld += iMeth(Test.instanceCount);
        Test.fFld = (float)Test.dFld;
        for (i19 = 10; i19 < 290; i19++) {
            for (i21 = 90; i21 > 5; i21--) {
                if (false) continue;
                for (i23 = 1; i23 < 2; ++i23) {
                    Test.fFld = i24;
                    Test.instanceCount *= i19;
                    i20 = (int)Test.instanceCount;
                    i24 = i19;
                    i24 -= i21;
                }
                i20 >>= iFld;
            }
            Test.dFld = i24;
            i25 = 1;
            while (++i25 < 90) {
                i22 += (-9 + (i25 * i25));
                if (true) {
                } else if (b2) {
                    Test.instanceCount = i26;
                }
                Test.instanceCount *= 8038227202289173018L;
                i26 -= (int)Test.instanceCount;
                Test.fFld = 3333;
                Test.iArrFld[i25 - 1] = (int)Test.instanceCount;
                for (i27 = 1; i27 < 1; i27++) {
                    i24 += (i27 | i23);
                }
            }
            Test.instanceCount = (long)Test.dFld;
            for (i29 = 3; i29 < 90; ++i29) {
                switch (((i19 % 5) * 5) + 106) {
                case 127:
                    if (b2) break;
                    i22 = (int)Test.dFld;
                    sArrFld[i19 - 1] <<= (short)Test.instanceCount;
                    Test.dFld += 0.269F;
                    break;
                case 123:
                    Test.dFld -= i22;
                case 131:
                    b2 = b2;
                    break;
                case 111:
                    Test.instanceCount >>>= Test.instanceCount;
                case 107:
                    Test.fArrFld[i19] -= Test.fFld;
                    break;
                default:
                    i26 >>= (int)Test.instanceCount;
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  fMeth ->  fMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
