package tests.javafuzzer2097;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 09:07:02 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-7L;
    public short sFld=-9246;
    public static int iFld=13;
    public static short sFld1=10000;
    public static boolean bFld=false;
    public static byte byFld=25;
    public float fFld=-80.1008F;
    public static int iArrFld[]=new int[N];
    public static int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -936);
        FuzzerUtils.init(Test.iArrFld1, 44475);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l, double d, long l1) {

        int i4=9, i5=-23885, i6=-10, i7=-46768, i8=-41640, i9=223, iArr[]=new int[N];
        float f1=-13.631F;
        boolean b1=false;

        FuzzerUtils.init(iArr, -21832);

        for (i4 = 5; i4 < 318; ++i4) {
            iArr[i4 - 1] -= i5;
            iArr[i4 + 1] -= Test.iFld;
            for (i6 = i4; i6 < 5; i6++) {
                if (b1) {
                    Test.sFld1 += (short)(((i6 * i7) + Test.instanceCount) - Test.sFld1);
                    for (i8 = 1; i8 < 1; ++i8) {
                        i9 = (int)f1;
                        switch (((i4 % 1) * 5) + 10) {
                        case 14:
                            iArr[(i6 >>> 1) % N] = i7;
                            try {
                                i9 = (-23250 / i5);
                                i9 = (i7 % i9);
                                i7 = (i9 / -83);
                            } catch (ArithmeticException a_e) {}
                            break;
                        }
                        Test.iFld += i8;
                        i5 *= i8;
                        iArr[i4] = i5;
                    }
                    i5 *= i7;
                } else if (false) {
                    l += (long)-87.617F;
                } else if (false) {
                    Test.instanceCount += (i6 | Test.sFld1);
                }
            }
        }
        vMeth1_check_sum += l + Double.doubleToLongBits(d) + l1 + i4 + i5 + i6 + i7 + i8 + i9 +
            Float.floatToIntBits(f1) + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i2, int i3, float f) {

        double d1=13.27888;
        long l2=7357978127880502875L, l3=-1989602926354883373L;
        int i10=13, i11=81, i12=106, iArr1[][]=new int[N][N];

        FuzzerUtils.init(iArr1, 168);

        vMeth1(Test.instanceCount, d1, Test.instanceCount);
        Test.instanceCount <<= i3;
        Test.instanceCount += i2;
        i3 += -15393;
        l2 = -7;
        for (i10 = 2; 226 > i10; ++i10) {
            for (l3 = 7; l3 > i10; l3--) {
                switch ((int)(((l3 % 2) * 5) + 72)) {
                case 77:
                    Test.iFld -= i2;
                    f *= -127;
                    Test.instanceCount += (l3 ^ i11);
                    break;
                case 76:
                    iArr1 = iArr1;
                    l2 <<= i12;
                    iArr1[(int)(l3 - 1)][i10 - 1] = i11;
                default:
                    l2 += (l3 * Test.instanceCount);
                }
            }
        }
        vMeth_check_sum += i2 + i3 + Float.floatToIntBits(f) + Double.doubleToLongBits(d1) + l2 + i10 + i11 + l3 + i12
            + FuzzerUtils.checkSum(iArr1);
    }

    public static long lMeth(boolean b, int i) {

        int i1=-56911, i13=47987, i14=58148, i15=-209, i16=-33960;
        float f2=43.995F;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, false);

        i1 = 1;
        do {
            vMeth(i, Test.iFld, f2);
            for (i13 = 1; i13 < 6; i13++) {
                double d2=-11.50053;
                d2 = f2;
                bArr[i13 + 1] = b;
                Test.iArrFld = Test.iArrFld;
                i14 *= i14;
                for (i15 = 1; i15 < 2; ++i15) {
                    switch (((i15 % 2) * 5) + 104) {
                    case 110:
                        i14 |= i14;
                        Test.iArrFld1[i13] %= (int)-56221L;
                        break;
                    case 114:
                        switch ((((i13 >>> 1) % 2) * 5) + 104) {
                        case 113:
                            i14 += i15;
                            break;
                        case 106:
                            Test.instanceCount -= (long)f2;
                            break;
                        }
                        Test.iFld += (int)Test.instanceCount;
                        break;
                    }
                }
            }
        } while (++i1 < 260);
        long meth_res = (b ? 1 : 0) + i + i1 + Float.floatToIntBits(f2) + i13 + i14 + i15 + i16 +
            FuzzerUtils.checkSum(bArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i17=-63802, i18=-9165, i19=4823, i20=184, i21=142, i22=-176, i23=10030, i24=-28, i25=9695, i26=-49541,
            i27=-10, i28=-9, i29=20478, i30=-54;
        double d3=0.109081, dArr[]=new double[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -1.593F);
        FuzzerUtils.init(dArr, -39.84110);

        sFld = (short)lMeth(Test.bFld, Test.iFld);
        Test.byFld = (byte)Test.instanceCount;
        Test.instanceCount *= Test.iFld;
        for (i17 = 15; i17 < 286; i17++) {
            Test.iFld += i17;
            Test.iFld >>= -3;
        }
        switch (((i18 >>> 1) % 9) + 47) {
        case 47:
            for (i19 = 5; i19 < 378; ++i19) {
                Test.bFld = true;
            }
        case 48:
            for (i21 = 10; i21 < 172; ++i21) {
                Test.byFld = (byte)-1;
            }
            break;
        case 49:
            for (i23 = 6; 130 > i23; i23++) {
                Test.iArrFld1[i23] <<= (int)Test.instanceCount;
                i22 += (i23 ^ Test.iFld);
                Test.iArrFld[i23 - 1] -= sFld;
                fFld += sFld;
                if (Test.bFld) {
                    i20 += i23;
                    i25 = 1;
                    do {
                        for (i26 = 1; i26 > 1; --i26) {
                            Test.bFld = true;
                            i24 = (int)Test.instanceCount;
                            try {
                                i27 = (27908 / i23);
                                i24 = (203 / i21);
                                i18 = (i20 % 60659);
                            } catch (ArithmeticException a_e) {}
                            fArr = fArr;
                        }
                        i24 += i25;
                        i24 >>= Test.byFld;
                    } while (++i25 < 202);
                    i27 = 14;
                }
            }
            for (d3 = 13; d3 < 249; d3++) {
                i20 += i29;
                if (Test.bFld) continue;
            }
            break;
        case 50:
            i24 = i29;
        case 51:
            i18 >>= (int)Test.instanceCount;
            break;
        case 52:
            dArr[(i26 >>> 1) % N] = Test.instanceCount;
            break;
        case 53:
            Test.instanceCount = i30;
            break;
        case 54:
            Test.instanceCount -= i25;
            break;
        case 55:
            i24 = Test.iFld;
            break;
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
