package tests.javafuzzer3362;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 06:43:56 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-32740L;
    public static byte byFld=127;
    public static double dFld=-1.87676;
    public long lArrFld[]=new long[N];
    public static int iArrFld[][]=new int[N][N];
    public static long lArrFld1[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -147);
        FuzzerUtils.init(Test.lArrFld1, -11L);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long sMeth_check_sum = 0;

    public static short sMeth(float f) {

        double d1=-2.21229;
        int i11=13, i12=198, i13=59299, i14=-166, i15=-13, i16=59449;
        boolean b=false;
        short s1=8951;

        d1 -= i11;
        for (i12 = 7; i12 < 274; i12++) {
            Test.lArrFld1[i12] = i13;
            i11 >>= i12;
            f += Test.instanceCount;
            i11 -= -158;
            b = b;
            if (b) {
                switch ((i12 % 7) + 24) {
                case 24:
                    Test.lArrFld1[i12] <<= i11;
                    i14 = 1;
                    do {
                        f *= i13;
                        i15 = 1;
                        do {
                            i13 = i12;
                            if (i15 != 0) {
                            }
                        } while (++i15 < 1);
                    } while (++i14 < 6);
                    break;
                case 25:
                    i13 = i12;
                    break;
                case 26:
                    Test.iArrFld[i12][i12 - 1] -= i14;
                case 27:
                    Test.instanceCount *= -206;
                    break;
                case 28:
                case 29:
                    Test.lArrFld1 = Test.lArrFld1;
                    break;
                case 30:
                    Test.instanceCount -= Test.instanceCount;
                    break;
                }
            } else if (b) {
                f += (i12 - i15);
            } else {
                i16 += s1;
            }
        }
        long meth_res = Float.floatToIntBits(f) + Double.doubleToLongBits(d1) + i11 + i12 + i13 + (b ? 1 : 0) + i14 +
            i15 + i16 + s1;
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static int iMeth1() {

        int i10=-1, i17=185, i18=193, i19=-112, i20=8, i21=163, i22=11;
        float f1=-29.257F;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, 40410L);

        lArr[(i10 >>> 1) % N][(18878 >>> 1) % N] = sMeth(f1);
        i10 = (int)1.128045;
        for (i17 = 156; 4 < i17; --i17) {
            Test.instanceCount -= (long)-37.418F;
            for (i19 = 1; i19 < 10; i19++) {
                Test.iArrFld[i17 - 1][i17 - 1] -= i17;
                Test.iArrFld[i17][i17] += (int)Test.instanceCount;
                i10 += (-10 + (i19 * i19));
                try {
                    i10 = (Test.iArrFld[i17][i17] / -215);
                    Test.iArrFld[i17 + 1][i19] = (336409172 / i17);
                    i10 = (i10 / i10);
                } catch (ArithmeticException a_e) {}
                i20 += i19;
                Test.instanceCount -= i17;
                for (i21 = i17; i21 < 2; i21++) {
                    i10 += (int)(-7374286351755520146L + (i21 * i21));
                    Test.iArrFld[i21 - 1][i17 - 1] = 0;
                    i22 = (int)Test.instanceCount;
                }
            }
        }
        long meth_res = i10 + Float.floatToIntBits(f1) + i17 + i18 + i19 + i20 + i21 + i22 + FuzzerUtils.checkSum(lArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i1, int i2, int i3) {

        int i4=185, i5=2, i6=-5242, i7=-230, i8=7, i9=-102, i23=-11, i24=62511;
        double d=48.128776;
        float f2=-2.492F;

        for (i4 = 17; 391 > i4; i4++) {
            Test.byFld -= (byte)((++d) + (Float.intBitsToFloat(i2) + (Test.instanceCount * i3)));
            for (i6 = 1; i6 < 5; ++i6) {
                for (i8 = 1; i8 < 2; ++i8) {
                    Test.iArrFld[i8][i8] *= iMeth1();
                    i5 &= i2;
                    i2 -= 12;
                }
                Test.instanceCount += (((i6 * Test.instanceCount) + i7) - f2);
                i5 <<= i5;
                i1 = (int)f2;
                i5 += i3;
            }
            i2 *= i6;
            for (i23 = 1; 5 > i23; ++i23) {
                i3 += (i23 ^ i2);
                Test.instanceCount -= -229;
            }
        }
        long meth_res = i1 + i2 + i3 + i4 + i5 + Double.doubleToLongBits(d) + i6 + i7 + i8 + i9 +
            Float.floatToIntBits(f2) + i23 + i24;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-147, i25=1902, i26=-9854, i28=0, i29=-4, i30=-5, i31=-10, iArr[]=new int[N];
        long l=8936531273670868396L, l1=-59L;
        short s=27547;
        float f3=-2.894F;
        boolean b1=true;

        FuzzerUtils.init(iArr, 12);

        lArrFld[(i >>> 1) % N] = ((i + (-8 + (l &= s))) - ((i >>> i) + Test.byFld));
        i = (int)(((85 * (i -= (int)0L)) >>> iMeth(i, i, i)) - i);
        Test.iArrFld[(i >>> 1) % N][(i >>> 1) % N] += i;
        for (f3 = 4; f3 < 258; ++f3) {
            i += (3 + (f3 * f3));
            Test.instanceCount -= i;
            try {
                Test.iArrFld[(int)(f3)][(int)(f3 - 1)] = (Test.iArrFld[(int)(f3 - 1)][(int)(f3)] / -54157);
                i25 = (Test.iArrFld[(int)(f3 + 1)][(int)(f3)] % 848270107);
                i25 = (i25 % -46405);
            } catch (ArithmeticException a_e) {}
            s = (short)-166;
            i26 *= (int)l;
            l = i;
            if (b1) continue;
            try {
                i26 = (i25 % iArr[(int)(f3 - 1)]);
                i26 = (45443200 % i26);
                i25 = (iArr[(int)(f3 + 1)] % 178);
            } catch (ArithmeticException a_e) {}
            l1 = 1;
            while (++l1 < 99) {
                i26 >>= i26;
                i += (int)(l1 * l1);
                switch ((int)((l1 % 2) + 97)) {
                case 97:
                    switch ((int)((f3 % 1) + 86)) {
                    case 86:
                        for (i28 = 1; i28 < 1; i28++) {
                            Test.iArrFld[i28 - 1][(int)(f3 + 1)] -= (int)f3;
                            iArr[i28 - 1] = (int)f3;
                            iArr[i28 + 1] >>>= (int)l;
                            i26 = 7930;
                            l <<= 249;
                        }
                        i25 += i29;
                        i26 -= i26;
                        i25 += i;
                        break;
                    }
                    try {
                        i29 = (254814448 / iArr[(int)(l1 - 1)]);
                        i = (1835754266 / iArr[(int)(l1 + 1)]);
                        i25 = (-37237 % i28);
                    } catch (ArithmeticException a_e) {}
                    for (i30 = 1; i30 < 1; ++i30) {
                        if (true) continue;
                        Test.instanceCount -= i;
                    }
                    break;
                case 98:
                    i26 += (int)(l1 - i31);
                    break;
                default:
                    Test.dFld += l;
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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  sMeth ->  sMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
