package tests.javafuzzer3483;

import utils.FuzzerUtils;

// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 09:15:39 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3760419305302039212L;
    public static float fFld=0.333F;
    public static byte byFld=46;
    public static double dFld=-2.42852;
    public static int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -43);
        FuzzerUtils.init(Test.dArrFld, 0.60530);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth3_check_sum = 0;

    public static void vMeth1(long l, int i2) {

        double d=80.78289;
        int i3=-181;

        d = (i3 * (Math.min(i2, 13) - (Test.fFld + i3)));
        vMeth1_check_sum += l + i2 + Double.doubleToLongBits(d) + i3;
    }

    public static void vMeth2() {

        byte by=-60;
        int i4=53090;

        by += (byte)(i4++);
        vMeth2_check_sum += by + i4;
    }

    public static void vMeth3(float f1, int i13, int i14) {

        int i15=-82, i16=240, i17=185, i18=6, i19=-14, i20=8, i21=13;
        float f2=-2.955F;
        double d3=-1.65926;

        for (i15 = 11; i15 < 211; i15++) {
            for (i17 = 1; 8 > i17; i17++) {
                for (f2 = 2; f2 > 1; f2 -= 2) {
                    i18 = i13;
                    if (true) continue;
                    f1 += -104;
                    f1 = (float)d3;
                    Test.instanceCount *= Test.instanceCount;
                }
                for (i20 = 1; 2 > i20; i20++) {
                    Test.instanceCount = 38346;
                    Test.iArrFld[i15 + 1] -= i21;
                    Test.instanceCount = Test.instanceCount;
                    Test.iArrFld[i17 - 1] += i20;
                    i18 = (int)f2;
                    i18 = -9;
                }
            }
        }
        vMeth3_check_sum += Float.floatToIntBits(f1) + i13 + i14 + i15 + i16 + i17 + i18 + Float.floatToIntBits(f2) +
            i19 + Double.doubleToLongBits(d3) + i20 + i21;
    }

    public static int iMeth(int i9, double d2, int i10) {

        int i11=-45, i12=-53674;

        for (i11 = 272; 3 < i11; --i11) {
            vMeth3(Test.fFld, i12, i11);
            Test.instanceCount ^= -26;
            i10 = (int)-87.816F;
            try {
                i12 = (i12 % i11);
                i9 = (43592 % i10);
                Test.iArrFld[i11] = (i11 / 2);
            } catch (ArithmeticException a_e) {}
            Test.instanceCount = i12;
            d2 = i11;
            i12 += (((i11 * Test.byFld) + Test.instanceCount) - i10);
        }
        long meth_res = i9 + Double.doubleToLongBits(d2) + i10 + i11 + i12;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i1) {

        double d1=-2.28019;
        int i5=32877, i6=7, i7=30854, i8=0, i22=167;
        float f=0.652F;

        vMeth1((long)(-Test.fFld), i1--);
        vMeth2();
        Test.instanceCount = (long)(--Test.fFld);
        for (d1 = 4; d1 < 232; ++d1) {
            for (f = 7; f > 1; f -= 3) {
                for (i7 = 1; i7 < 4; i7++) {
                    Test.iArrFld[(int)(f)] <<= (int)((Test.instanceCount + Math.min(-10, 13)) / (iMeth(i6, 32.124400,
                        5) | 1));
                    i5 = i8;
                    Test.fFld -= i7;
                    Test.instanceCount = i22;
                    i22 += i7;
                    i1 -= (int)Test.fFld;
                }
                Test.instanceCount += (-53727 + (f * f));
                i6 = 8;
                i6 = (int)Test.instanceCount;
            }
        }
        vMeth_check_sum += i1 + Double.doubleToLongBits(d1) + i5 + Float.floatToIntBits(f) + i6 + i7 + i8 + i22;
    }

    public void mainTest(String[] strArr1) {

        int i=41677, i23=-10, i24=-49, i25=27, i26=134, i27=-31722, i28=-22854, i29=0, i30=4;
        short s=-10047;
        boolean b=false;

        Test.instanceCount = (-((i++) + (-58 - i)));
        vMeth(i);
        Test.dArrFld[(i >>> 1) % N] = Test.instanceCount;
        for (i23 = 5; i23 < 211; i23++) {
            i24 = (int)Test.instanceCount;
            Test.fFld += Test.byFld;
        }
        i25 = 1;
        do {
            for (i26 = 4; i26 < 76; ++i26) {
                Test.instanceCount += i26;
                Test.instanceCount -= i;
                for (i28 = 1; 2 > i28; i28++) {
                    Test.instanceCount -= (long)Test.fFld;
                    i24 >>= i24;
                    if (true) break;
                    switch (((i28 % 10) * 5) + 79) {
                    case 111:
                    case 99:
                        i = i24;
                        switch ((((i27 >>> 1) % 10) * 5) + 121) {
                        case 148:
                            if (false) {
                                Test.iArrFld[i26] = i24;
                                Test.byFld = (byte)i25;
                            } else {
                                Test.fFld += i23;
                                Test.instanceCount += (((i28 * Test.instanceCount) + Test.instanceCount) - Test.byFld);
                                Test.instanceCount <<= i27;
                                if (false) {
                                    switch ((i25 % 4) + 99) {
                                    case 99:
                                        i *= i23;
                                        Test.dFld = i28;
                                        break;
                                    case 100:
                                        i27 = i29;
                                        i29 |= i25;
                                        break;
                                    case 101:
                                        i29 = i24;
                                        break;
                                    case 102:
                                        i24 = i23;
                                        break;
                                    }
                                }
                            }
                            break;
                        case 135:
                            i29 += i;
                            break;
                        case 159:
                            Test.fFld += Test.instanceCount;
                            break;
                        case 156:
                            Test.iArrFld = Test.iArrFld;
                            break;
                        case 154:
                            s += (short)(0.838F + (i28 * i28));
                            break;
                        case 145:
                            Test.iArrFld[i25 + 1] = (int)Test.fFld;
                        case 124:
                        case 171:
                            i27 += (i28 + Test.instanceCount);
                        case 170:
                        case 140:
                            i24 += i23;
                            break;
                        default:
                            try {
                                i24 = (i26 % 25);
                                Test.iArrFld[i25 - 1] = (i26 % -107);
                                i = (i26 / i25);
                            } catch (ArithmeticException a_e) {}
                        }
                        break;
                    case 91:
                        Test.dFld += i28;
                        break;
                    case 118:
                        Test.instanceCount += s;
                        break;
                    case 90:
                        Test.iArrFld = Test.iArrFld;
                    case 83:
                        if (b) break;
                        break;
                    case 100:
                        i24 += (-12736 + (i28 * i28));
                        break;
                    case 84:
                        Test.instanceCount *= i28;
                        break;
                    case 85:
                        i -= i30;
                        break;
                    case 121:
                        i -= (int)Test.instanceCount;
                    }
                }
            }
        } while (++i25 < 332);

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
//DEBUG  vMeth2 ->  vMeth2 vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth3 ->  vMeth3 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
