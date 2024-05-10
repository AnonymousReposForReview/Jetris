package tests.javafuzzer904;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 11:25:27 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-16000L;
    public int iFld=2412;
    public static volatile float fFld=76.286F;
    public boolean bFld=false;
    public static int iArrFld[]=new int[N];
    public static volatile short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -2);
        FuzzerUtils.init(Test.sArrFld, (short)-26652);
    }

    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i11, long l, float f1) {

        double d=1.61264;
        int i12=0, i13=-13, i14=3, i15=-1859;
        float f2=-2.868F;
        short s=4443;

        d = 1;
        while ((d += 2) < 336) {
            switch ((int)((d % 7) + 93)) {
            case 93:
                for (i12 = (int)(d); i12 < 9; ++i12) {
                    switch ((int)(((d % 2) * 5) + 125)) {
                    case 129:
                        if (i12 != 0) {
                            vMeth1_check_sum += i11 + l + Float.floatToIntBits(f1) + Double.doubleToLongBits(d) + i12 +
                                i13 + i14 + i15 + Float.floatToIntBits(f2) + s;
                            return;
                        }
                        i11 += (((i12 * i14) + i14) - i11);
                        break;
                    case 134:
                        f1 += i12;
                        i15 = 1;
                        do {
                            f2 += (2 + (i15 * i15));
                            f2 += l;
                            f2 += -12;
                            i14 -= (int)l;
                            i14 >>= (int)l;
                            Test.iArrFld[i12 + 1] -= (int)l;
                            s += (short)(i15 * s);
                        } while ((i15 += 3) < 1);
                        break;
                    }
                }
                break;
            case 94:
                Test.iArrFld[(int)(d)] &= (int)Test.instanceCount;
                break;
            case 95:
                i11 *= (int)d;
                break;
            case 96:
                if (i13 != 0) {
                    vMeth1_check_sum += i11 + l + Float.floatToIntBits(f1) + Double.doubleToLongBits(d) + i12 + i13 +
                        i14 + i15 + Float.floatToIntBits(f2) + s;
                    return;
                }
            case 97:
                i14 += (int)(((d * i11) + i12) - i12);
            case 98:
                f1 -= 12;
                break;
            case 99:
                i14 = (int)l;
                break;
            }
        }
        vMeth1_check_sum += i11 + l + Float.floatToIntBits(f1) + Double.doubleToLongBits(d) + i12 + i13 + i14 + i15 +
            Float.floatToIntBits(f2) + s;
    }

    public static double dMeth(int i6, int i7, int i8) {

        int i9=95, i10=58998, i16=-66, i17=51709, i18=8, i19=93, i20=16123;
        double d1=34.73049;
        boolean b=true;

        for (i9 = 7; i9 < 175; ++i9) {
            vMeth1(i7, -563828218027404082L, Test.fFld);
            i8 *= (int)1628359443L;
            Test.iArrFld[i9] += (int)Test.fFld;
        }
        for (i16 = 9; i16 < 166; ++i16) {
            for (d1 = 1; d1 < 10; d1 += 2) {
                for (i19 = 1; 3 > i19; ++i19) {
                    Test.sArrFld[i19] = (short)Test.instanceCount;
                    Test.iArrFld[i19] -= (int)Test.fFld;
                    if (b) break;
                    i18 = (int)d1;
                }
                i18 = i10;
                Test.instanceCount = i17;
                i7 = i18;
                if (b) break;
            }
        }
        long meth_res = i6 + i7 + i8 + i9 + i10 + i16 + i17 + Double.doubleToLongBits(d1) + i18 + i19 + i20 + (b ? 1 :
            0);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void vMeth() {

        int i2=95, i3=4, i4=-45212, i5=14, i21=0, i22=63763, i23=4;
        float f=-43.163F;
        double d2=51.59310;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -3198617772L);

        for (i2 = 5; i2 < 241; i2++) {
            boolean b1=true;
            if (b1) {
                for (i4 = i2; i4 < 7; i4++) {
                    Test.instanceCount -= (long)(((-105 - (++f)) * (iFld - i5)) - i2);
                    i5 -= (int)(dMeth(i5, i4, i5) - Test.fFld);
                }
            }
            switch (((i3 >>> 1) % 8) + 31) {
            case 31:
                b1 = b1;
                i5 /= 60423;
                break;
            case 32:
                iFld >>= i4;
                iFld += (i2 ^ Test.instanceCount);
            case 33:
                i3 += iFld;
                break;
            case 34:
                for (i21 = 1; i21 < 7; i21++) {
                    for (d2 = 1; d2 < 2; d2++) {
                        byte by=-69;
                        Test.iArrFld[(int)(d2 - 1)] = by;
                        f += Test.instanceCount;
                    }
                }
                break;
            case 35:
                lArr[i2] = iFld;
                break;
            case 36:
                Test.instanceCount <<= i4;
                break;
            case 37:
                Test.instanceCount = i23;
                break;
            case 38:
                Test.iArrFld[i2 - 1] = -3;
                break;
            }
        }
        vMeth_check_sum += i2 + i3 + i4 + i5 + Float.floatToIntBits(f) + i21 + i22 + Double.doubleToLongBits(d2) + i23
            + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i=168, i1=-5, i24=24, i25=-62, i26=12, i27=-9494, i28=7018, i29=-236, i30=-20277, i31=195, i32=-6, i33=-33,
            i34=-31;
        long l1=38L;
        float f3=1.497F;
        short s1=-2403;
        double d3=0.87408;

        Test.instanceCount -= iFld;
        for (i = 7; 139 > i; ++i) {
            vMeth();
            for (i24 = 7; i24 < 190; i24++) {
                for (l1 = 2; l1 > i; --l1) {
                    i1 += i;
                }
                for (i27 = 1; i27 < 2; i27++) {
                    boolean b2=false;
                    if (b2) continue;
                    Test.instanceCount = 41170;
                    i1 = i;
                }
                Test.instanceCount &= i25;
                i29 = 1;
                while (++i29 < 2) {
                    Test.fFld += l1;
                }
                i28 += i24;
                iFld = (int)Test.fFld;
                iFld -= 8;
                i1 -= -51481;
            }
            for (i30 = 10; i30 < 190; i30++) {
                i25 = -52657;
                if (bFld) {
                    for (f3 = i30; f3 < 2; ++f3) {
                        i32 = i26;
                        i25 = (int)139L;
                        Test.fFld = iFld;
                        try {
                            Test.iArrFld[i30] = (69 / i31);
                            i25 = (30385 % i29);
                            i1 = (Test.iArrFld[(int)(f3 + 1)] / i);
                        } catch (ArithmeticException a_e) {}
                    }
                    for (i33 = 1; i33 < 2; i33++) {
                        s1 = s1;
                        if (bFld) break;
                        i31 = -20837;
                    }
                } else if (bFld) {
                    if (bFld) continue;
                } else {
                    d3 -= -3;
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
//DEBUG  dMeth ->  dMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 dMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}