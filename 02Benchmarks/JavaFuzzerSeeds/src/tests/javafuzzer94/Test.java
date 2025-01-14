package tests.javafuzzer94;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 22:16:12 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-6L;
    public static volatile int iFld=-120;
    public static boolean bFld=true;
    public static int iFld1=-39;
    public static float fArrFld[]=new float[N];
    public static double dArrFld[]=new double[N];
    public static int iArrFld[]=new int[N];
    public boolean bArrFld[][]=new boolean[N][N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 0.814F);
        FuzzerUtils.init(Test.dArrFld, 1.28222);
        FuzzerUtils.init(Test.iArrFld, -1);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        double d=-1.18795;
        int i4=175, i5=59471, iArr[]=new int[N];

        FuzzerUtils.init(iArr, -62);

        iArr[(-4 >>> 1) % N] += Test.iFld;
        for (float f1 : Test.fArrFld) {
            for (d = 1; d < 4; d += 2) {
                iArr[(int)(d)] -= Test.iFld;
                Test.iFld = (int)Test.instanceCount;
                if (Test.bFld) continue;
                switch ((int)((d % 2) + 10)) {
                case 10:
                    Test.iFld += (int)(d * d);
                    if (Test.bFld) break;
                    switch ((int)(((d % 9) * 5) + 121)) {
                    case 133:
                        i4 = Test.iFld1;
                        i5 = 1;
                        while (++i5 < 4) {
                            Test.dArrFld[(int)(d)] = -56980;
                            Test.dArrFld[(int)(d)] = f1;
                            Test.iFld >>= Test.iFld1;
                        }
                        break;
                    case 166:
                        Test.instanceCount += (long)(d + Test.iFld1);
                    case 161:
                        Test.iFld1 = (int)-10L;
                        break;
                    case 144:
                        Test.iFld1 >>= (int)Test.instanceCount;
                        break;
                    case 163:
                        Test.iFld += (int)d;
                    case 139:
                        f1 = (float)d;
                    case 140:
                        i4 <<= Test.iFld;
                    case 152:
                        Test.instanceCount &= i4;
                    case 136:
                        Test.instanceCount = (long)f1;
                        break;
                    }
                    break;
                case 11:
                    try {
                        Test.iFld = (Test.iFld % Test.iFld);
                        Test.iFld = (iArr[(int)(d - 1)] % 51);
                        i4 = (Test.iFld / i5);
                    } catch (ArithmeticException a_e) {}
                    break;
                default:
                    iArr = iArr;
                }
            }
        }
        vMeth2_check_sum += Double.doubleToLongBits(d) + i4 + i5 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(int i2, int i3) {

        int i6=23598, i7=10, i8=-12, i9=225;
        short s=-23323;
        byte by=-95;
        float f2=40.776F, f3=22.658F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 0L);

        if (Test.bFld) {
            vMeth2();
            i6 = 1;
            while (++i6 < 222) {
                Test.iFld1 += i6;
                Test.iFld += (i6 * i6);
                s = (short)Test.instanceCount;
                for (i7 = 1; i7 < 7; i7++) {
                    by *= (byte)Test.iFld;
                    i9 = 1;
                    while (++i9 < 2) {
                        Test.iArrFld[i9 + 1] <<= Test.iFld;
                        Test.fArrFld[i7] = f2;
                        lArr[i7 - 1] = (long)f2;
                        Test.fArrFld[i7] -= Test.iFld;
                        Test.instanceCount *= Test.iFld1;
                        f3 += i6;
                    }
                }
            }
        } else if (false) {
            i8 += Test.iFld;
        }
        vMeth1_check_sum += i2 + i3 + i6 + s + i7 + i8 + by + i9 + Float.floatToIntBits(f2) + Float.floatToIntBits(f3)
            + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(float f) {


        vMeth1(Test.iFld, Test.iFld);
        vMeth_check_sum += Float.floatToIntBits(f);
    }

    public void mainTest(String[] strArr1) {

        int i=215, i1=206, i10=14509, i11=-16952, i12=-220, i13=-45966;
        float f4=-47.793F;
        double d1=59.1613;
        byte by1=11;

        for (i = 4; 390 > i; ++i) {
            vMeth(f4);
            try {
                Test.iFld1 = (-141 / i);
                Test.iFld1 = (Test.iArrFld[i + 1] / 677327291);
                Test.iArrFld[i - 1] = (Test.iFld1 % 196);
            } catch (ArithmeticException a_e) {}
            i10 = 65;
            do {
                switch ((((i >>> 1) % 7) * 5) + 46) {
                case 58:
                case 62:
                    i1 -= Test.iFld1;
                    Test.dArrFld[i10] = Test.instanceCount;
                    bArrFld[i10 + 1][i10] = Test.bFld;
                    break;
                case 65:
                    i1 += i10;
                    for (i11 = 1; i11 > i; i11 -= 3) {
                        i12 += (i11 * i11);
                        Test.iFld1 += (i11 * i11);
                        try {
                            Test.iFld1 = (Test.iFld % -84);
                            Test.iFld = (236 / i13);
                            i1 = (32 / Test.iArrFld[i11]);
                        } catch (ArithmeticException a_e) {}
                        Test.iFld -= (int)d1;
                        if (Test.bFld) {
                            Test.instanceCount -= i;
                            if (true) break;
                            lArrFld[i10 + 1] -= (long)f4;
                            Test.iArrFld[i11] = i13;
                        } else {
                            if (Test.bFld) {
                                Test.instanceCount += i11;
                                switch ((i11 % 10) + 87) {
                                case 87:
                                    i12 -= -2;
                                    break;
                                case 88:
                                case 89:
                                    Test.iFld1 += i13;
                                    break;
                                case 90:
                                    i1 = 17;
                                    Test.instanceCount = Test.iFld;
                                    f4 -= -148;
                                case 91:
                                    Test.iArrFld[i11 + 1] *= i;
                                    Test.bFld = Test.bFld;
                                    break;
                                case 92:
                                    i13 += (((i11 * i11) + f4) - i10);
                                    break;
                                case 93:
                                    Test.iArrFld[i + 1] <<= (int)Test.instanceCount;
                                    break;
                                case 94:
                                    Test.dArrFld[i11 + 1] *= i12;
                                case 95:
                                    Test.instanceCount >>= Test.instanceCount;
                                    break;
                                case 96:
                                    Test.instanceCount |= i10;
                                }
                            } else if (Test.bFld) {
                                Test.bFld = true;
                            } else if (Test.bFld) {
                                Test.iFld = i12;
                            }
                        }
                    }
                    break;
                case 70:
                    Test.iArrFld[i10] += i11;
                    break;
                case 56:
                    i12 = by1;
                    break;
                case 80:
                    try {
                        Test.iFld1 = (i1 % i11);
                        Test.iFld1 = (Test.iFld % 46951);
                        Test.iFld = (i / 194);
                    } catch (ArithmeticException a_e) {}
                case 74:
                    Test.iArrFld = FuzzerUtils.int1array(N, (int)212);
                    break;
                default:
                    i13 = Test.iFld;
                }
            } while (--i10 > 0);
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
