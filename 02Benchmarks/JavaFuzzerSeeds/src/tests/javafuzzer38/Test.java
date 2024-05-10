package tests.javafuzzer38;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 21:26:33 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2413939795969674364L;
    public float fFld=107.905F;
    public static double dFld=2.26582;
    public static short sFld=11884;
    public static long lArrFld[]=new long[N];
    public byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -6299092529564126779L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i8, int i9, double d1) {

        float f1=-7.81F;
        int i10=-4, i11=-4, i12=-7, i13=53088, i14=-163, i15=-20, i16=-13;
        boolean b=true;

        f1 += (float)d1;
        i10 = 1;
        while (++i10 < 207) {
            for (i11 = 1; i11 < 8; ++i11) {
                for (i13 = i11; i13 < 2; i13 += 2) {
                    Test.instanceCount = -178;
                    i12 -= i13;
                    i14 *= i9;
                    i14 = i9;
                    i12 += (int)Test.instanceCount;
                    i14 += (((i13 * Test.instanceCount) + i14) - i9);
                    d1 = i12;
                }
                i9 += i11;
                for (i15 = i11; i15 < 2; ++i15) {
                    if (b) break;
                    d1 -= 4135;
                }
            }
        }
        long meth_res = i8 + i9 + Double.doubleToLongBits(d1) + Float.floatToIntBits(f1) + i10 + i11 + i12 + i13 + i14
            + i15 + i16 + (b ? 1 : 0);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1(int i3, int i4, int i5) {

        float f=-2.776F;
        int i6=1, i7=174, i17=0, i18=43, i19=-62298, i20=51025, i21=39491, i22=-168, iArr[]=new int[N];
        double dArr[][]=new double[N][N];

        FuzzerUtils.init(iArr, 232);
        FuzzerUtils.init(dArr, -22.110142);

        iArr[(i3 >>> 1) % N] += (int)((Test.lArrFld[(i3 >>> 1) % N] * (i3 * i3)) * f);
        for (i6 = 4; i6 < 157; i6 += 3) {
            i4 <<= (int)Math.max(lMeth(i3, i5, Test.dFld), 4112072968L);
            for (i17 = i6; i17 < 30; ++i17) {
                i3 = (int)Test.instanceCount;
                for (i19 = 1; i19 < 1; ++i19) {
                    dArr[i19][i6 + 1] = f;
                    i20 += (int)f;
                    i20 ^= i18;
                    Test.lArrFld[i17] += (long)Test.dFld;
                    i20 += i19;
                }
                for (i21 = 1; i21 < 1; ++i21) {
                    i22 += i21;
                    i5 *= i7;
                    i4 += Test.sFld;
                }
            }
        }
        vMeth1_check_sum += i3 + i4 + i5 + Float.floatToIntBits(f) + i6 + i7 + i17 + i18 + i19 + i20 + i21 + i22 +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth(int i1, int i2, short s) {

        float f2=-46.576F;
        int i23=4217, i24=-32237, i25=-10, i26=132, iArr1[]=new int[N];
        boolean b1=false;

        FuzzerUtils.init(iArr1, -2);

        if (b1) {
            vMeth1(i2, i1, i1);
            i1 = (int)f2;
        } else if (b1) {
            for (i23 = 1; i23 < 190; ++i23) {
                Test.dFld = i1;
                Test.sFld = (short)-10;
                for (i25 = 1; i25 < 8; ++i25) {
                    Test.instanceCount = i26;
                    i24 *= i23;
                    iArr1[i25] *= i2;
                }
                Test.lArrFld[i23] *= Test.instanceCount;
                i26 *= i24;
                try {
                    i24 = (i26 / 160);
                    i24 = (i25 % 137);
                    i24 = (iArr1[i23] / iArr1[i23]);
                } catch (ArithmeticException a_e) {}
                i24 += (-5 + (i23 * i23));
                i24 = i1;
            }
        } else {
            i26 *= i24;
        }
        vMeth_check_sum += i1 + i2 + s + Float.floatToIntBits(f2) + i23 + i24 + i25 + i26 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        double d=-17.26723;
        int i=-38346, i27=135, i28=-9, i29=-219, i30=-1495, i31=-59, i32=-2, i33=-11199, i34=5, i35=-57138, i36=-8,
            i37=-164, i38=6, i39=-14, iArr2[]=new int[N];
        boolean b2=false;
        byte by=-35;

        FuzzerUtils.init(iArr2, 0);

        for (d = 19; 327 > d; ++d) {
            fFld += ((-(i * i)) - ((++i) + (i - i)));
            vMeth(i, i, Test.sFld);
            i -= (int)d;
            fFld *= Test.instanceCount;
        }
        iArr2[(i >>> 1) % N] -= (int)Test.instanceCount;
        i27 = 1;
        while (++i27 < 368) {
            for (i28 = 2; i28 < 68; ++i28) {
                i29 += i27;
            }
            iArr2[i27] = (int)Test.instanceCount;
            for (i30 = i27; i30 < 68; i30++) {
                Test.dFld += i;
                byArrFld[i30] *= (byte)i29;
            }
        }
        for (i32 = 166; i32 > 2; i32 -= 2) {
            for (i34 = 305; 8 < i34; i34--) {
                i35 >>= (int)Test.instanceCount;
                i35 += (int)7L;
                i31 -= (int)-163L;
                i35 = 6;
                i35 += i34;
            }
            if (b2) break;
            fFld += i27;
        }
        Test.dFld = Test.instanceCount;
        for (i36 = 7; i36 < 132; ++i36) {
            Test.instanceCount += 32623;
            for (i38 = 1; 201 > i38; ++i38) {
                if (b2) {
                    iArr2[i36 + 1] &= i29;
                    b2 = b2;
                    Test.lArrFld[i36 + 1] -= by;
                } else if (true) {
                    i35 = -6000;
                } else {
                    Test.sFld += (short)i;
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
