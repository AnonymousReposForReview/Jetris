package tests.javafuzzer1319;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 18:10:41 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3641873129L;
    public static boolean bFld=false;
    public static float fFld=2.895F;
    public static double dFld=119.79755;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 986817342L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l1) {

        int i7=95, i8=11093, i9=-12, i10=-1, i11=37, i12=40, i13=3, iArr[]=new int[N];
        float f3=0.901F, fArr[]=new float[N];
        double d=-41.45845;

        FuzzerUtils.init(fArr, 104.440F);
        FuzzerUtils.init(iArr, -2);

        Test.instanceCount += i7;
        i7 &= (int)l1;
        for (f3 = 4; f3 < 140; ++f3) {
            switch ((int)((f3 % 4) + 27)) {
            case 27:
                i8 += (int)(f3 * f3);
            case 28:
                for (i9 = 1; i9 < 12; ++i9) {
                    i8 = i10;
                    fArr[(int)(f3)] += 112L;
                    if (Test.bFld) {
                        switch ((i9 % 7) + 85) {
                        case 85:
                            for (i11 = 2; i11 > i9; i11--) {
                                Test.instanceCount += i11;
                            }
                            i8 -= i11;
                            i10 = (int)d;
                            Test.fFld += (-6 + (i9 * i9));
                            break;
                        case 86:
                            i7 <<= i10;
                            break;
                        case 87:
                            i10 = 7;
                            break;
                        case 88:
                            i13 -= (int)Test.instanceCount;
                        case 89:
                            Test.fFld -= (float)d;
                            break;
                        case 90:
                            Test.instanceCount += (((i9 * i9) + i11) - Test.instanceCount);
                            break;
                        case 91:
                            Test.fFld = (float)d;
                            break;
                        default:
                            if (i11 != 0) {
                                vMeth2_check_sum += l1 + i7 + Float.floatToIntBits(f3) + i8 + i9 + i10 + i11 + i12 +
                                    Double.doubleToLongBits(d) + i13 +
                                    Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr);
                                return;
                            }
                        }
                    } else {
                        i7 = i11;
                    }
                }
                break;
            case 29:
                i13 += (int)f3;
            case 30:
                iArr[(int)(f3 - 1)] >>>= i12;
            default:
                Test.lArrFld[(int)(f3 - 1)] = 4;
            }
        }
        vMeth2_check_sum += l1 + i7 + Float.floatToIntBits(f3) + i8 + i9 + i10 + i11 + i12 + Double.doubleToLongBits(d)
            + i13 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(int i3, long l) {

        float f1=-14.499F, f2=-41.91F, fArr1[]=new float[N];
        int i4=8759, i5=46464, i6=-2, i14=205;
        double d1=2.69879;

        FuzzerUtils.init(fArr1, 1.605F);

        f1 = 332;
        do {
            for (i4 = 1; 10 > i4; ++i4) {
                for (f2 = f1; f2 < 2; f2 += 3) {
                    if (Test.bFld) continue;
                    vMeth2(l);
                    i6 = 3;
                    if (i5 != 0) {
                        vMeth1_check_sum += i3 + l + Float.floatToIntBits(f1) + i4 + i5 + Float.floatToIntBits(f2) + i6
                            + Double.doubleToLongBits(d1) + i14 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
                        return;
                    }
                    fArr1[i4] += -11;
                    i5 = i4;
                }
                i5 += i4;
                i6 = i4;
                for (d1 = 1; d1 < 2; d1++) {
                    i5 += i5;
                    Test.fFld -= (float)d1;
                    i14 += (int)(((d1 * i4) + Test.instanceCount) - i14);
                }
            }
        } while ((f1 -= 2) > 0);
        vMeth1_check_sum += i3 + l + Float.floatToIntBits(f1) + i4 + i5 + Float.floatToIntBits(f2) + i6 +
            Double.doubleToLongBits(d1) + i14 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public static void vMeth(float f) {

        int i=-1933, i1=10, i2=-775, i15=-238;

        for (i = 146; i > 1; i -= 3) {
            i1 += (-44094 + (i * i));
            i2 = 1;
            do {
                vMeth1(i2, Test.instanceCount);
                if (Test.bFld) {
                    Test.lArrFld[i2] = i;
                    i1 += i1;
                } else if (Test.bFld) {
                    Test.instanceCount += (i2 * i2);
                    Test.dFld *= f;
                    i1 <<= i1;
                    i1 -= (int)Test.instanceCount;
                } else if (true) {
                    i1 *= i1;
                    i15 = 1;
                    do {
                        i1 = i15;
                        if (i1 != 0) {
                            vMeth_check_sum += Float.floatToIntBits(f) + i + i1 + i2 + i15;
                            return;
                        }
                    } while (++i15 < 1);
                } else {
                    i1 -= (int)Test.instanceCount;
                }
            } while (++i2 < 32);
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i + i1 + i2 + i15;
    }

    public void mainTest(String[] strArr1) {

        int i16=14, i17=167, i18=55089, i19=-51939, i20=45025, i21=-244;
        short s=-6988;
        long l2=-101L;
        float fArr2[]=new float[N];

        FuzzerUtils.init(fArr2, 32.291F);

        vMeth(Test.fFld);
        Test.instanceCount += i16;
        i17 = s;
        Test.instanceCount = i16;
        if (Test.bFld) {
            i18 = 1;
            while (++i18 < 274) {
                for (i19 = 1; i19 < 92; ++i19) {
                    for (l2 = 1; 2 > l2; ++l2) {
                        i16 = (int)Test.dFld;
                        fArr2[i18 - 1] = Test.fFld;
                        i16 |= (int)l2;
                        Test.instanceCount = Test.instanceCount;
                        i16 += (int)(l2 * i18);
                        switch ((((160 >>> 1) % 2) * 5) + 17) {
                        case 21:
                            Test.instanceCount += l2;
                            i21 -= i20;
                            i20 += (int)l2;
                            i21 += (int)l2;
                            break;
                        case 23:
                            i16 += (int)l2;
                            try {
                                i16 = (i19 / i19);
                                i20 = (i17 / 2677);
                                i17 = (45557 / i19);
                            } catch (ArithmeticException a_e) {}
                            i21 = i20;
                            break;
                        }
                        i16 += (int)(l2 * i20);
                        Test.dFld += Test.instanceCount;
                        Test.dFld = i20;
                    }
                    Test.instanceCount += (((i19 * Test.instanceCount) + i19) - i17);
                    Test.instanceCount += (i19 | l2);
                    i20 -= i16;
                    i20 = s;
                    i21 -= i20;
                    Test.bFld = Test.bFld;
                }
            }
        } else {
            i17 += (int)Test.instanceCount;
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
