package tests.javafuzzer1330;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 18:29:20 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=83006154L;
    public static float fFld=113.313F;
    public static short sFld=25992;
    public volatile double dFld=-120.9243;
    public static byte byFld=82;
    public static float fFld1=0.446F;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];
    public static short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -95L);
        FuzzerUtils.init(Test.iArrFld, 0);
        FuzzerUtils.init(Test.sArrFld, (short)14568);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i5) {

        int i6=198, i7=-10391, i8=-35175, i9=-73;
        long l1=-11L;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 1.376F);

        i5 -= (int)Test.instanceCount;
        i6 = 1;
        do {
            i5 <<= i7;
            i7 -= (int)Test.instanceCount;
            i8 = 1;
            do {
                i5 -= (int)Test.instanceCount;
                i9 = 1;
                while (++i9 < 1) {
                    Test.fFld -= Test.fFld;
                    fArr[i9] -= i9;
                    fArr[i9] = -190;
                    i5 += (i9 * i9);
                    l1 = l1;
                    Test.fFld += i9;
                    i5 = (int)Test.fFld;
                    try {
                        i5 = (i8 / Test.iArrFld[i9]);
                        i7 = (i8 / 13863);
                        Test.iArrFld[i6 - 1] = (Test.iArrFld[i8] / i6);
                    } catch (ArithmeticException a_e) {}
                }
            } while (++i8 < 9);
        } while ((i6 += 2) < 350);
        long meth_res = i5 + i6 + i7 + i8 + i9 + l1 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i4) {

        byte by1=-101;
        double d1=2.20582;
        int i10=63, i11=157, i12=48447, i13=242, i14=9;

        Test.iArrFld[(i4 >>> 1) % N] -= (iMeth1(i4) - by1);
        Test.sFld += (short)d1;
        i4 <<= (int)Test.instanceCount;
        i4 = i4;
        for (short s : Test.sArrFld) {
            Test.fFld *= i4;
            for (i10 = 1; i10 < 4; ++i10) {
                Test.instanceCount += (i10 ^ Test.sFld);
                Test.sFld = (short)Test.instanceCount;
                for (i12 = i10; i12 < 2; ++i12) {
                    Test.instanceCount -= i12;
                    Test.instanceCount += Test.instanceCount;
                    i4 = by1;
                    i4 += by1;
                    i14 += (i12 * i12);
                }
            }
        }
        vMeth_check_sum += i4 + by1 + Double.doubleToLongBits(d1) + i10 + i11 + i12 + i13 + i14;
    }

    public static int iMeth(long l, double d, boolean b) {

        int i2=4, i3=12, i15=-58560, i16=-117, i17=-44689;
        byte by=84;
        double d2=-1.14130;

        for (i2 = 12; i2 < 392; i2++) {
            Test.lArrFld[i2] = 1;
            if (true) continue;
            Test.iArrFld[i2 - 1] -= (int)(((++l) + (i2 - by)) - ((i2 + -75) - (i3 + -11L)));
            vMeth(i2);
            if (b) {
                try {
                    i3 = (1117430805 % i2);
                    i15 = (i15 / i3);
                    i3 = (i3 / -75);
                } catch (ArithmeticException a_e) {}
                i15 += (-148 + (i2 * i2));
                i15 += (-19208 + (i2 * i2));
            } else if (b) {
                for (d2 = 1; d2 < 4; d2++) {
                    Test.instanceCount += (long)(d2 * d2);
                    i3 += i3;
                    Test.fFld *= i17;
                    i17 >>= i15;
                    i16 += -17;
                }
            } else if (b) {
                if (b) break;
            } else {
                l += (-32L + (i2 * i2));
            }
        }
        long meth_res = l + Double.doubleToLongBits(d) + (b ? 1 : 0) + i2 + i3 + by + i15 + Double.doubleToLongBits(d2)
            + i16 + i17;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-212, i1=88, i18=-7, i19=-211, i20=14, i21=32, i22=-43675;
        float f=1.985F, f1=-2.80F;
        boolean b1=true;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -54.130237);

        for (i = 7; i < 204; ++i) {
            f += iMeth(Test.instanceCount, dFld, b1);
            Test.lArrFld[i - 1] *= i1;
            f += 60017;
        }
        for (double d3 : dArr) {
            i1 -= i;
            Test.byFld <<= (byte)-39023;
            for (i18 = 1; i18 < 63; ++i18) {
                i19 += (int)10L;
                Test.lArrFld[i18] -= 2779199689L;
                dFld *= Test.instanceCount;
            }
            switch ((((i >>> 1) % 2) * 5) + 33) {
            case 38:
                for (i20 = 2; i20 < 63; i20++) {
                    switch ((i20 % 4) + 69) {
                    case 69:
                        Test.iArrFld[i20 + 1] = (int)Test.instanceCount;
                        switch ((i20 % 4) + 101) {
                        case 101:
                            Test.fFld -= i1;
                            break;
                        case 102:
                            Test.fFld1 -= i20;
                            i1 += (59359 + (i20 * i20));
                            i19 += i20;
                            break;
                        case 103:
                        case 104:
                            for (f1 = i20; f1 < 2; f1++) {
                                if (b1) {
                                    i21 += (int)f1;
                                    Test.instanceCount ^= i19;
                                } else if (false) {
                                    Test.instanceCount = -23568;
                                    i22 *= (int)Test.instanceCount;
                                } else {
                                    switch ((i20 % 8) + 77) {
                                    case 77:
                                        i1 += i1;
                                        i1 += (int)(((f1 * i) + Test.instanceCount) - Test.instanceCount);
                                        Test.instanceCount += (long)f1;
                                    case 78:
                                        try {
                                            i22 = (i / -251);
                                            i19 = (-22379 % i21);
                                            i1 = (i1 / i1);
                                        } catch (ArithmeticException a_e) {}
                                        break;
                                    case 79:
                                        Test.iArrFld[i20 - 1] = i21;
                                        break;
                                    case 80:
                                        f += i18;
                                        break;
                                    case 81:
                                    case 82:
                                        try {
                                            i19 = (i20 / -122);
                                            i21 = (i / -12980);
                                            Test.iArrFld[i20] = (i18 % Test.iArrFld[i20 - 1]);
                                        } catch (ArithmeticException a_e) {}
                                        break;
                                    case 83:
                                    case 84:
                                        i22 -= (int)d3;
                                        break;
                                    default:
                                        i1 -= (int)f1;
                                    }
                                }
                            }
                            break;
                        default:
                            i1 -= 39049;
                        }
                    case 70:
                        i22 += (i20 * i20);
                        break;
                    case 71:
                        d3 += -8085574064682178601L;
                        break;
                    case 72:
                        if (false) continue;
                        break;
                    }
                }
            case 34:
                Test.instanceCount += i18;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}