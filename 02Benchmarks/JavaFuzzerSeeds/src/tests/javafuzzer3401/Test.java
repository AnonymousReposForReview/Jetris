package tests.javafuzzer3401;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 07:25:55 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-7211625183156559785L;
    public static float fFld=-39.1009F;
    public static double dFld=-122.23302;
    public byte byFld=-93;
    public boolean bFld=true;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -125);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(int i10) {

        int i11=172, i12=7407, i13=-6, i14=116;
        float f1=-82.934F, f2=0.129F;
        byte by=-45;
        boolean b=false;

        i11 = 1;
        do {
            if (true) {
                i10 += (((i11 * Test.instanceCount) + Test.instanceCount) - f1);
                i10 += i10;
            } else if (b) {
                i10 += (((i11 * f1) + i11) - i11);
                for (f2 = 1; f2 < 10; ++f2) {
                    i12 /= (int)(i10 | 1);
                    for (i13 = 1; i13 < 2; ++i13) {
                        i14 *= (int)Test.instanceCount;
                        f1 = i14;
                        i14 = i12;
                        i14 -= (int)-2324924433L;
                        if (b) {
                            i14 = i14;
                            by = (byte)-44.846F;
                        } else if (b) {
                            Test.iArrFld[(int)(f2)] %= (int)(i12 | 1);
                        } else {
                            i12 = i12;
                        }
                    }
                }
            } else {
                by = (byte)-11;
            }
        } while (++i11 < 160);
        long meth_res = i10 + i11 + Float.floatToIntBits(f1) + Float.floatToIntBits(f2) + i12 + i13 + i14 + by + (b ? 1
            : 0);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static int iMeth(double d, int i7, int i8) {

        int i9=27, i15=1, i16=161;
        long l2=13L;

        i9 = 1;
        do {
            try {
                i7 = (Test.iArrFld[i9 - 1] / -73);
                i8 = (i8 / i7);
                i8 = (Test.iArrFld[i9 - 1] / i8);
            } catch (ArithmeticException a_e) {}
            i7 += (i9 + i9);
            if (fMeth(i7) != Test.fFld) break;
            Test.instanceCount -= i9;
            Test.instanceCount <<= -10;
            for (i15 = 1; i15 < 4; ++i15) {
                i16 -= (int)l2;
                Test.fFld = i9;
                i8 += i15;
                Test.iArrFld[i15 - 1] &= (int)Test.instanceCount;
                i8 >>>= i8;
            }
        } while (++i9 < 391);
        long meth_res = Double.doubleToLongBits(d) + i7 + i8 + i9 + i15 + i16 + l2;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(long l, int i2) {

        int i3=-5, i4=-163, i5=62006, i6=237, i17=-81, i18=11;
        float f=2.653F;
        long l1=-43384L;

        i3 = 1;
        do {
            i2 ^= Math.abs((int)((-l) - i3));
            i4 = 1;
            while (++i4 < 6) {
                l += (long)(Math.max(i4, Test.iArrFld[i3]) - ((i4 - -74.131035) - (i4 - i4)));
                Test.iArrFld[i3 - 1] <<= (int)((l--) * ((f - 8862) - (2533048212061531590L + (i4 - i3))));
                l -= i4;
            }
        } while (++i3 < 260);
        for (l1 = 12; l1 < 312; l1++) {
            i6 = 6;
            while (--i6 > 0) {
                i5 += i6;
                i5 >>= iMeth(2.109910, i4, i2);
                if (true) break;
                for (i17 = 1; i17 < 1; i17++) {
                    i18 %= (int)(i6 | 1);
                    i2 *= (int)f;
                    Test.dFld = -228;
                }
            }
        }
        vMeth_check_sum += l + i2 + i3 + i4 + Float.floatToIntBits(f) + l1 + i5 + i6 + i17 + i18;
    }

    public void mainTest(String[] strArr1) {

        int i=169, i1=-34526, i19=-210, i20=0, i21=-53820, i22=-222, i23=22911, i24=18823, i25=202;
        float f3=81.141F;

        for (i = 1; i < 174; i += 3) {
            vMeth(Test.instanceCount, i1);
            i19 += -14;
        }
        i20 = 1;
        while (++i20 < 392) {
            for (f3 = 3; f3 < 64; f3++) {
                Test.fFld += (f3 * f3);
                i22 = 2;
                do {
                    Test.iArrFld[(int)(f3 + 1)] *= i19;
                    i19 += i22;
                    Test.iArrFld[i20 + 1] = i19;
                    Test.instanceCount += (((i22 * i1) + i22) - i20);
                    i21 = (int)Test.fFld;
                    i19 += (i22 * i);
                    i19 = (int)Test.instanceCount;
                    Test.fFld *= Test.instanceCount;
                } while (--i22 > 0);
                i1 = i;
                byFld >>= (byte)-12;
                i1 = (int)Test.instanceCount;
            }
            i23 = 1;
            do {
                i19 += (i23 * i20);
                Test.instanceCount = -31440;
                if (bFld) continue;
            } while (++i23 < 64);
            bFld = bFld;
            i19 = -219;
        }
        for (i24 = 5; i24 < 280; i24++) {
            if (bFld) break;
            Test.iArrFld[i24] -= (int)Test.instanceCount;
            i19 += (int)2.128746;
            i19 = i20;
            Test.instanceCount = i19;
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  fMeth ->  fMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}