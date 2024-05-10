package tests.javafuzzer1366;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 18:52:21 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-118L;
    public byte byFld=24;
    public static boolean bFld=true;
    public static int iArrFld[]=new int[N];
    public static volatile double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -4);
        FuzzerUtils.init(Test.dArrFld, -2.31251);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i7, int i8, int i9) {

        float f2=0.811F, f3=1.322F;
        int i10=-10, i11=99, i12=-198, i13=170, i14=61, i15=-38226, iArr1[]=new int[N];
        double d1=-122.58857;
        boolean b=true;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -12L);
        FuzzerUtils.init(iArr1, 81);

        if (b) {
            for (f2 = 273; f2 > 7; f2 -= 3) {
                f3 -= i8;
            }
            lArr1[(i8 >>> 1) % N] >>= i8;
            for (i11 = 5; i11 < 370; i11 += 2) {
                d1 -= i10;
                if (false) {
                    iArr1[i11 + 1] /= (int)(i9 | 1);
                    for (i13 = 1; i13 < 9; i13++) {
                        iArr1 = iArr1;
                        i15 = 1;
                        do {
                            d1 += i7;
                            iArr1[i15 - 1] -= i10;
                            Test.instanceCount <<= i15;
                            i14 |= i12;
                        } while (++i15 < 2);
                    }
                } else if (b) {
                    Test.instanceCount <<= i14;
                } else {
                    d1 += i8;
                }
            }
            vMeth1_check_sum += i7 + i8 + i9 + Float.floatToIntBits(f2) + i10 + Float.floatToIntBits(f3) + i11 + i12 +
                Double.doubleToLongBits(d1) + i13 + i14 + i15 + (b ? 1 : 0) + FuzzerUtils.checkSum(lArr1) +
                FuzzerUtils.checkSum(iArr1);
            return;
        }
        vMeth1_check_sum += i7 + i8 + i9 + Float.floatToIntBits(f2) + i10 + Float.floatToIntBits(f3) + i11 + i12 +
            Double.doubleToLongBits(d1) + i13 + i14 + i15 + (b ? 1 : 0) + FuzzerUtils.checkSum(lArr1) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth() {

        int i16=-226, i17=-50, i18=-7, i19=-31, i20=7, i21=-1, i22=-101;
        float f4=29.984F;
        double d2=2.93727;

        vMeth1(i16, i16, i16);
        i16 = (int)Test.instanceCount;
        i16 -= (int)f4;
        i16 = (int)Test.instanceCount;
        i16 += -5;
        Test.instanceCount = -14;
        i16 += (int)d2;
        i16 += (int)f4;
        for (i17 = 6; i17 < 199; ++i17) {
            for (i19 = 8; i19 > 1; --i19) {
                for (i21 = 1; 2 > i21; ++i21) {
                    Test.instanceCount = i21;
                }
                Test.iArrFld[i17 + 1] = -211;
                i16 %= (int)(i22 | 1);
                if (i17 != 0) {
                    vMeth_check_sum += i16 + Float.floatToIntBits(f4) + Double.doubleToLongBits(d2) + i17 + i18 + i19 +
                        i20 + i21 + i22;
                    return;
                }
            }
        }
        vMeth_check_sum += i16 + Float.floatToIntBits(f4) + Double.doubleToLongBits(d2) + i17 + i18 + i19 + i20 + i21 +
            i22;
    }

    public static int iMeth(float f1) {

        int i5=-234, i6=5, i23=-241, i24=-44427, i25=-10, i26=4, i27=-3, i28=-243;
        float f5=0.322F;
        boolean b1=false;
        short s=-27297;

        for (i5 = 1; i5 < 268; ++i5) {
            vMeth();
            if (false) continue;
        }
        i6 >>= -59;
        i23 = 389;
        while ((i23 -= 2) > 0) {
            i6 -= i23;
            for (f5 = i23; f5 < 8; f5 += 2) {
                Test.instanceCount *= -65;
            }
            i25 = 1;
            while (++i25 < 8) {
                if (b1) break;
                i6 *= i25;
            }
            i24 += (i23 + i5);
            for (i26 = i23; i26 < 8; i26++) {
                s = (short)i28;
                Test.dArrFld[i23 + 1] *= i26;
            }
        }
        long meth_res = Float.floatToIntBits(f1) + i5 + i6 + i23 + Float.floatToIntBits(f5) + i24 + i25 + (b1 ? 1 : 0)
            + i26 + i27 + s + i28;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-22723, i1=236, i2=-108, i3=-61328, i4=-64, iArr[]=new int[N];
        float f=-1.39F;
        double d=-2.98825, d3=-18.33567;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -27);
        FuzzerUtils.init(lArr, -881L);

        for (i = 228; 12 < i; i--) {
            for (i2 = 2; 116 > i2; ++i2) {
                Test.instanceCount += (long)(-4172443643L + ((i2 + f) * (f + f)));
                d = 1;
                while (++d < 2) {
                    i1 *= -13;
                    if (Test.bFld) {
                        Test.instanceCount += (long)(d - byFld);
                        switch (((((176 + Math.min(i2, i)) >>> 1) % 3) * 5) + 77) {
                        case 90:
                            i4 <<= i3;
                            iArr[i2 - 1] = (int)((lArr[(int)(d)]--) * (++i1));
                            switch ((((Math.abs(i4) >>> 1) % 8) * 5) + 42) {
                            case 53:
                                byFld += (byte)d;
                                iMeth(f);
                                d3 = f;
                                break;
                            case 75:
                                i4 >>= i;
                                break;
                            case 72:
                                i4 = i2;
                                d3 = i;
                                i4 += (int)2.402F;
                                i1 = i;
                                break;
                            case 82:
                                Test.instanceCount >>>= 222;
                                i4 <<= i1;
                                Test.instanceCount += i1;
                                break;
                            case 54:
                                f += -13;
                                switch ((((i2 >>> 1) % 3) * 5) + 12) {
                                case 24:
                                    i4 = (int)Test.instanceCount;
                                    f += (float)d;
                                    Test.iArrFld[(int)(d + 1)] = (int)d3;
                                    try {
                                        i4 = (i3 / -51527);
                                        i4 = (i / -67);
                                        i3 = (-902205905 / i2);
                                    } catch (ArithmeticException a_e) {}
                                case 25:
                                    i3 += (int)(1.992F + (d * d));
                                    break;
                                case 16:
                                    iArr[i + 1] *= i2;
                                    break;
                                default:
                                    if (Test.bFld) break;
                                }
                                break;
                            case 46:
                                i4 &= (int)53022L;
                            case 58:
                                byFld += (byte)d;
                                break;
                            case 43:
                                iArr[i2] >>= 31676;
                                break;
                            default:
                                i1 += i1;
                            }
                            break;
                        case 87:
                            iArr = iArr;
                            break;
                        case 91:
                            lArr[i2 - 1] *= -87;
                            break;
                        }
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
