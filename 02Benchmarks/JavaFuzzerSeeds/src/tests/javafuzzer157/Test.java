package tests.javafuzzer157;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 23:04:32 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-5103270333044647990L;
    public static float fFld=-124.172F;
    public static short sFld=13779;
    public static int iFld=-62740;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -31);
        FuzzerUtils.init(Test.lArrFld, -62L);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        int i4=233, i5=-240, i6=-4, i7=-11;

        i4 = 1;
        do {
            Test.iArrFld[i4] = i4;
            Test.iArrFld[i4 + 1] |= (int)Test.instanceCount;
            i5 += (((i4 * Test.instanceCount) + Test.instanceCount) - i4);
            i5 = 27293;
            Test.fFld += (i4 - i5);
            try {
                i5 = (i5 / i5);
                i5 = (i4 / -76);
                i5 = (-27690 % i4);
            } catch (ArithmeticException a_e) {}
        } while (++i4 < 289);
        for (i6 = 19; i6 < 352; ++i6) {
            i7 >>= -47508;
            i7 *= (int)Test.instanceCount;
            Test.instanceCount >>= i5;
            Test.iArrFld = FuzzerUtils.int1array(N, (int)7);
            i5 >>= i4;
            Test.sFld += (short)(i6 + i5);
            i5 >>= (int)Test.instanceCount;
        }
        vMeth_check_sum += i4 + i5 + i6 + i7;
    }

    public static int iMeth1(int i3) {

        float f=-40.307F;
        int i8=203, i9=60320, i10=91, i11=156;
        boolean b=false;

        i3 += i3;
        Test.instanceCount *= (long)Test.fFld;
        f = 1;
        while (++f < 342) {
            vMeth();
            for (i8 = 1; i8 < 5; i8++) {
                Test.iArrFld[(int)(f + 1)] += i9;
                Test.fFld = 8;
                i9 *= (int)Test.instanceCount;
                Test.fFld = Test.instanceCount;
                if (i9 != 0) {
                }
                for (i10 = 2; i10 > 1; --i10) {
                    if (b) {
                        i11 += i3;
                        Test.instanceCount += Test.instanceCount;
                    } else {
                        Test.fFld *= Test.instanceCount;
                    }
                }
            }
        }
        long meth_res = i3 + Float.floatToIntBits(f) + i8 + i9 + i10 + i11 + (b ? 1 : 0);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(short s) {

        int i2=5, i12=-10, i13=13, i14=-37, i15=-56, i16=64186, i17=-16367;
        byte by=-127;
        boolean b1=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 1727852790658488901L);

        s -= (short)(lArr[(i2 >>> 1) % N] * (iMeth1(i2) - -99.68872));
        by = (byte)i2;
        for (i12 = 6; i12 < 345; i12++) {
            Test.instanceCount >>= 3;
            Test.fFld += (i12 * i12);
        }
        for (i14 = 13; i14 < 234; i14 += 3) {
            i15 = i12;
            i13 -= i2;
            Test.instanceCount += (((i14 * i2) + i2) - i12);
            if (b1) continue;
            for (i16 = 1; i16 < 21; i16++) {
                try {
                    i2 = (-7833 % i15);
                    i17 = (53 / i13);
                    i13 = (i13 / -10386);
                } catch (ArithmeticException a_e) {}
                Test.iArrFld[(i13 >>> 1) % N] -= (int)Test.fFld;
                by = (byte)i12;
                i15 >>= i13;
            }
        }
        long meth_res = s + i2 + by + i12 + i13 + i14 + i15 + (b1 ? 1 : 0) + i16 + i17 + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-10, i1=68, i18=27459, i19=32712, i20=1171;
        double d=2.66157, dArr[]=new double[N];
        boolean b2=true;
        byte by1=97;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -114.101F);
        FuzzerUtils.init(dArr, -49.66927);

        for (i = 15; i < 298; i++) {
            Test.fFld -= iMeth(Test.sFld);
            Test.instanceCount |= 9L;
            i1 += (i | i);
            switch ((i % 5) + 88) {
            case 88:
                i1 /= (int)(i | 1);
                if (b2) {
                    Test.iArrFld[i - 1] += 37799;
                } else if (b2) {
                    switch (((i1 >>> 1) % 4) + 7) {
                    case 7:
                        i1 += (i | Test.instanceCount);
                        try {
                            i1 = (Test.iFld / Test.iFld);
                            Test.iFld = (45459 / Test.iArrFld[i]);
                            Test.iFld = (-30 % i1);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 8:
                        switch (((i % 7) * 5) + 44) {
                        case 49:
                            for (d = i; d < 89; ++d) {
                                if (b2) continue;
                                for (i19 = 1; i19 < 1; i19++) {
                                    i18 = (int)Test.instanceCount;
                                    Test.sFld = (short)Test.fFld;
                                    fArr[(int)(d + 1)] -= 9921;
                                    Test.iArrFld = Test.iArrFld;
                                    Test.lArrFld[(int)(d - 1)] = i1;
                                    Test.instanceCount = Test.instanceCount;
                                    i18 *= (int)d;
                                }
                                i1 = Test.iFld;
                                switch ((int)(((d % 2) * 5) + 40)) {
                                case 47:
                                    Test.iArrFld[(int)(d)] = (int)Test.instanceCount;
                                    Test.iFld -= (int)d;
                                case 46:
                                    i20 -= i;
                                    break;
                                default:
                                    Test.lArrFld[(int)(d)] |= Test.instanceCount;
                                    by1 = (byte)i;
                                    i20 <<= i19;
                                }
                            }
                            break;
                        case 67:
                            i20 += (14878 + (i * i));
                            break;
                        case 48:
                            i1 -= (int)Test.instanceCount;
                            break;
                        case 51:
                            i18 += i;
                            break;
                        case 65:
                            i1 += (int)(-51.117F + (i * i));
                            break;
                        case 50:
                            by1 = (byte)i19;
                            break;
                        case 70:
                            Test.iArrFld[i] %= (int)(i19 | 1);
                            break;
                        }
                        break;
                    case 9:
                        Test.fFld += i;
                    case 10:
                    }
                } else if (b2) {
                    i20 += (int)Test.instanceCount;
                } else {
                    i18 -= (int)d;
                }
                break;
            case 89:
                i20 <<= i1;
            case 90:
                try {
                    i20 = (i20 % 7500);
                    i1 = (-61700 % i18);
                    i18 = (i % i);
                } catch (ArithmeticException a_e) {}
                break;
            case 91:
                i20 += (i - i18);
                break;
            case 92:
                i20 += (i * i);
                break;
            default:
                dArr[i - 1] -= i18;
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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}