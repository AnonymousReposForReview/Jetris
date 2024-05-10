package tests.javafuzzer1424;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 20:14:26 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=11L;
    public static volatile boolean bFld=true;
    public static byte byFld=-124;
    public double dFld=2.42422;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -25478);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i4, long l) {

        long l1=93L;
        int i5=13, i6=-22158, i7=-5, i8=35452;
        boolean b=true;

        i4 &= i4;
        Test.instanceCount = i4;
        for (l1 = 161; l1 > 7; l1--) {
            i5 /= (int)1643268571890263087L;
            for (i6 = 1; i6 < 10; i6++) {
                b = b;
                switch ((int)(((l1 % 2) * 5) + 65)) {
                case 70:
                    i8 = 1;
                    while (++i8 < 2) {
                        if (b) {
                            i7 %= (int)(Test.instanceCount | 1);
                            vMeth1_check_sum += i4 + l + l1 + i5 + i6 + i7 + (b ? 1 : 0) + i8;
                            return;
                        } else {
                            Test.iArrFld[i8 + 1] *= (int)Test.instanceCount;
                            i4 += i8;
                            try {
                                i5 = (i4 % i6);
                                i7 = (i8 % i7);
                                Test.iArrFld[(int)(l1 - 1)] = (i6 / i5);
                            } catch (ArithmeticException a_e) {}
                        }
                        i7 += i6;
                        i7 *= i6;
                    }
                    break;
                case 73:
                    Test.instanceCount = i4;
                    break;
                }
            }
        }
        vMeth1_check_sum += i4 + l + l1 + i5 + i6 + i7 + (b ? 1 : 0) + i8;
    }

    public static void vMeth(double d, float f) {

        int i2=6462, i3=3, i9=10, i10=-102;
        long lArr[]=new long[N];
        byte byArr1[][]=new byte[N][N];

        FuzzerUtils.init(lArr, 2304L);
        FuzzerUtils.init(byArr1, (byte)19);

        for (i2 = 7; i2 < 242; ++i2) {
            vMeth1(i2, Test.instanceCount);
            if (Test.bFld) {
                i3 += (i2 * Test.instanceCount);
            } else {
                Test.instanceCount = Test.instanceCount;
                for (i9 = i2; i9 < 7; i9++) {
                    i10 += i3;
                    Test.instanceCount += (((i9 * i2) + i2) - i10);
                    if (Test.bFld) break;
                    Test.iArrFld[i9 - 1] -= (int)f;
                    Test.iArrFld[i2] *= i2;
                    switch (((i2 % 5) * 5) + 23) {
                    case 25:
                        if (Test.bFld) continue;
                        Test.iArrFld[(146 >>> 1) % N] = (int)Test.instanceCount;
                        Test.instanceCount += (0 + (i9 * i9));
                        break;
                    case 38:
                        lArr[i9] *= -61798;
                        break;
                    case 34:
                        Test.iArrFld[i2 - 1] += (int)Test.instanceCount;
                        break;
                    case 32:
                        Test.instanceCount += (((i9 * Test.byFld) + i9) - i2);
                        break;
                    case 37:
                        Test.iArrFld[i2 + 1] <<= i9;
                        break;
                    default:
                        byArr1[i9][i2] += (byte)60.773F;
                    }
                }
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i2 + i3 + i9 + i10 +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(byArr1);
    }

    public static int iMeth() {

        int i=-40333, i1=118, i11=34263, i12=-4, i13=-238, i14=60240, i15=-98, i16=-63660;
        float f1=104.754F;
        double d1=0.39247, d2=67.128390;
        short s=21869;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-53);

        for (i = 6; 124 > i; i++) {
            try {
                i1 = (Test.iArrFld[i - 1] % i);
                i1 = (Test.iArrFld[i] % -38088);
                i1 = (i1 / Test.iArrFld[i + 1]);
            } catch (ArithmeticException a_e) {}
            Test.instanceCount *= (byArr[i]--);
            vMeth(-108.35889, f1);
            for (i11 = i; i11 < 13; i11++) {
                for (i13 = 1; i13 < 1; ++i13) {
                    i14 -= i15;
                    Test.iArrFld[i13 + 1] += (int)Test.instanceCount;
                }
                f1 = i;
                for (d1 = 1; d1 < 1; ++d1) {
                    s += (short)5;
                    d2 -= d2;
                    d2 = 23.54619;
                    Test.instanceCount += Test.instanceCount;
                    i15 += i;
                }
            }
        }
        long meth_res = i + i1 + Float.floatToIntBits(f1) + i11 + i12 + i13 + i14 + i15 + Double.doubleToLongBits(d1) +
            i16 + s + Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(byArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i17=-6, i18=-12, i19=215, i20=-169, i21=324, i22=47, i23=-99;
        float f2=58.273F, f3=2.335F, f4=-2.423F, fArr[]=new float[N];
        short s1=14146;
        double dArr[][]=new double[N][N];

        FuzzerUtils.init(fArr, -2.808F);
        FuzzerUtils.init(dArr, 2.117501);

        iMeth();
        Test.instanceCount *= 13;
        i17 += (int)Test.instanceCount;
        for (f2 = 277; f2 > 17; f2 -= 2) {
            for (i19 = 193; i19 > 5; i19--) {
                i20 = (int)Test.instanceCount;
                dFld += Test.instanceCount;
                try {
                    i20 = (i19 % 54877);
                    i17 = (i19 % i18);
                    i18 = (i18 / -20309);
                } catch (ArithmeticException a_e) {}
                i20 += 44628;
                if (false) {
                    fArr[(int)(f2)] += s1;
                    Test.instanceCount += Test.byFld;
                    if (Test.bFld) continue;
                } else if (Test.bFld) {
                    switch ((int)(((f2 % 3) * 5) + 9)) {
                    case 11:
                        dFld += i19;
                        dFld = i18;
                        i20 -= (int)-1.320F;
                        switch (((i20 >>> 1) % 10) + 58) {
                        case 58:
                            for (f3 = 1; f3 < 2; ++f3) {
                                f4 += i20;
                                f4 -= Test.byFld;
                                i20 -= (int)Test.instanceCount;
                                i18 += (int)(((f3 * i17) + i21) - i20);
                            }
                            i21 += (i19 * i19);
                            break;
                        case 59:
                            for (i22 = 1; 2 > i22; ++i22) {
                                i23 = i17;
                                i18 -= 7063;
                                i23 -= (int)1.639F;
                                i23 >>>= i22;
                                i18 += i22;
                            }
                            break;
                        case 60:
                            Test.iArrFld[(int)(f2 - 1)] = (int)Test.instanceCount;
                            break;
                        case 61:
                            i20 += i19;
                            break;
                        case 62:
                            s1 += (short)i19;
                            break;
                        case 63:
                            i23 = 4;
                            break;
                        case 64:
                            i23 += i18;
                            break;
                        case 65:
                            i18 += (103 + (i19 * i19));
                            break;
                        case 66:
                        case 67:
                            f4 += (i19 * i17);
                        }
                    case 12:
                        Test.bFld = true;
                        break;
                    case 23:
                    }
                } else if (Test.bFld) {
                    dArr[i19 - 1][(int)(f2 + 1)] += s1;
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
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}