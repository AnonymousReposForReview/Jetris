package tests.javafuzzer1309;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 17:52:18 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=58653L;
    public static int iFld=-4;
    public static boolean bFld=false;
    public int iFld1=11;
    public static int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 88);
        FuzzerUtils.init(Test.dArrFld, -2.50350);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(short s) {

        byte by=-95;
        double d=-42.11669;
        int i3=7, i4=-10, i5=46, i6=81;

        Test.instanceCount = by;
        Test.iFld += 17045;
        Test.bFld = true;
        for (d = 5; 129 > d; ++d) {
            for (i4 = 1; 13 > i4; i4++) {
                i6 = 1;
                do {
                    float f1=56.929F;
                    i3 *= Test.iFld;
                    Test.iFld = by;
                    Test.instanceCount -= Test.instanceCount;
                    f1 += 132;
                    i3 = i5;
                    i5 -= 7;
                } while (++i6 < 2);
                i3 += i4;
                i3 = i3;
                Test.instanceCount = i3;
            }
        }
        vMeth2_check_sum += s + by + Double.doubleToLongBits(d) + i3 + i4 + i5 + i6;
    }

    public static void vMeth1(float f) {

        short s1=-30203;
        int i7=74, i8=-40066, i9=-85;
        double d1=-109.7421;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 5898465405505702460L);

        vMeth2(s1);
        i7 = 1;
        while (++i7 < 363) {
            Test.iFld = i7;
            Test.iFld += (((i7 * i7) + i7) - f);
            for (i8 = 1; i8 < 5; ++i8) {
                Test.iArrFld[i8 + 1] = (int)Test.instanceCount;
                Test.bFld = Test.bFld;
                Test.instanceCount = i9;
                if (i7 != 0) {
                    vMeth1_check_sum += Float.floatToIntBits(f) + s1 + i7 + i8 + i9 + Double.doubleToLongBits(d1) +
                        FuzzerUtils.checkSum(lArr);
                    return;
                }
                Test.instanceCount = i9;
                f = (float)d1;
                Test.instanceCount = i8;
            }
            i9 *= i8;
            lArr[i7 + 1] >>= i7;
            i9 *= i8;
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + s1 + i7 + i8 + i9 + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i) {

        int i1=0, i2=1, i11=121, i12=35348, i13=16, i14=10;
        float f2=-55.923F, fArr[]=new float[N];
        short s2=-16017;

        FuzzerUtils.init(fArr, 74.221F);

        for (i1 = 16; i1 < 262; ++i1) {
            double d2=20.93549;
            vMeth1(21.72F);
            Test.iArrFld = Test.iArrFld;
            d2 += Test.instanceCount;
            f2 += Test.instanceCount;
            Test.dArrFld = Test.dArrFld;
            Test.iArrFld[i1 - 1] += (int)Test.instanceCount;
            d2 = s2;
            fArr[i1 + 1] = f2;
            i = 4;
        }
        for (i11 = 9; i11 < 304; ++i11) {
            if (Test.bFld) continue;
            for (i13 = 1; i13 < 6; i13++) {
                Test.iArrFld[i13] &= -5;
                Test.iArrFld[i11] += i13;
            }
        }
        vMeth_check_sum += i + i1 + i2 + Float.floatToIntBits(f2) + s2 + i11 + i12 + i13 + i14 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i15=-5837, i16=14, i17=20, i18=149, i19=22574;
        float f3=32.72F;
        double d3=-106.61791;
        byte by1=88;

        Test.iFld -= (int)(Test.iFld += (int)(-(Test.instanceCount * Test.instanceCount)));
        vMeth(Test.iFld);
        for (i15 = 11; i15 < 246; i15++) {
            Test.iFld <<= 4;
            i17 = 1;
            while (++i17 < 107) {
                for (i18 = 1; i18 < 1; ++i18) {
                    short s3=-518;
                    s3 *= (short)f3;
                    Test.iArrFld[i18 - 1] >>>= i17;
                    Test.instanceCount = i15;
                    f3 -= Test.instanceCount;
                    i19 = (int)Test.instanceCount;
                    Test.instanceCount = Test.iFld;
                    Test.instanceCount += i18;
                    Test.iFld *= (int)Test.instanceCount;
                    switch (((i15 % 10) * 5) + 59) {
                    case 75:
                        i16 = (int)Test.instanceCount;
                        Test.iArrFld[i15 + 1] &= i16;
                    case 91:
                        Test.bFld = Test.bFld;
                        try {
                            i16 = (i19 % -13);
                            Test.iFld = (-183 / i17);
                            i16 = (-201 % Test.iFld);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 85:
                        if (false) break;
                        f3 += (((i18 * Test.instanceCount) + Test.instanceCount) - i17);
                        break;
                    case 100:
                        Test.iFld += (i18 - i19);
                        Test.iFld += i16;
                        i16 += (i18 - i16);
                        break;
                    case 97:
                        switch (((i17 % 10) * 5) + 62) {
                        case 76:
                            f3 = i17;
                            if (Test.bFld) break;
                            f3 += (i18 * Test.iFld);
                            f3 = (float)d3;
                            break;
                        case 81:
                            i19 += i18;
                            break;
                        case 84:
                            f3 %= (Test.instanceCount | 1);
                        case 111:
                            Test.iArrFld[i18 - 1] = i19;
                        case 71:
                            f3 *= 47527;
                            break;
                        case 108:
                        case 69:
                            try {
                                i16 = (i19 / 65114);
                                iFld1 = (Test.iArrFld[i18] / iFld1);
                                i16 = (i18 / i16);
                            } catch (ArithmeticException a_e) {}
                            break;
                        case 63:
                            Test.iFld += i18;
                            break;
                        case 97:
                            s3 += (short)i15;
                        case 92:
                            i19 *= (int)f3;
                            break;
                        }
                    case 87:
                        if (false) break;
                        break;
                    case 65:
                        Test.instanceCount *= (long)f3;
                        break;
                    case 109:
                        iFld1 <<= iFld1;
                        break;
                    case 60:
                        Test.iFld += iFld1;
                        break;
                    case 81:
                    default:
                        by1 -= (byte)i17;
                    }
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}