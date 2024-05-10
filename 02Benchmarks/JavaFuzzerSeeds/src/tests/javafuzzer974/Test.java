package tests.javafuzzer974;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 12:16:15 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=30322L;
    public static double dFld=-93.115321;
    public static byte byFld=-59;
    public static volatile float fFld=10.105F;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -13L);
        FuzzerUtils.init(Test.iArrFld, 12);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        float f=3.372F, f2=2.580F;
        int i5=50925, i6=11, i7=-31244, i8=42534, i9=23618, i10=29105, i11=11;

        f += Test.instanceCount;
        for (i5 = 14; i5 < 340; i5 += 3) {
            float f1=69.789F;
            i6 = i6;
            f1 += i5;
            Test.dFld = i5;
            if (i5 != 0) {
                vMeth2_check_sum += Float.floatToIntBits(f) + i5 + i6 + i7 + i8 + i9 + i10 + Float.floatToIntBits(f2) +
                    i11;
                return;
            }
            i6 = (int)-2.950F;
        }
        for (i7 = 7; i7 < 222; ++i7) {
            for (i9 = 1; i9 < 7; ++i9) {
                i8 = (int)Test.instanceCount;
                i6 += (int)f;
                for (f2 = 1; f2 < 2; f2++) {
                    f = i11;
                    i6 -= (int)Test.dFld;
                    i6 |= 76;
                }
            }
        }
        vMeth2_check_sum += Float.floatToIntBits(f) + i5 + i6 + i7 + i8 + i9 + i10 + Float.floatToIntBits(f2) + i11;
    }

    public static void vMeth1(long l, long l1) {

        int i1=-23694, i2=13, i3=10, i4=252, i12=137, i13=58889, iArr[]=new int[N];
        double d=50.94847, d1=-46.61850;
        float f3=121.248F;
        boolean b=true;

        FuzzerUtils.init(iArr, 20318);

        i1 = 1;
        do {
            try {
                i2 = (-34881 / i1);
                i2 = (iArr[i1 - 1] / iArr[i1 - 1]);
                i2 = (149 % iArr[i1 - 1]);
            } catch (ArithmeticException a_e) {}
            i2 += (-19666 + (i1 * i1));
            iArr[(i2 >>> 1) % N] ^= ((i2--) - i2);
            for (i3 = i1; i3 < 5; i3++) {
                d -= (i2--);
                iArr[i3 - 1] -= (int)((Test.lArrFld[i3 - 1]++) * (-Math.abs(d)));
                vMeth2();
                Test.instanceCount = 133;
                if (b) {
                    d1 = 1;
                    do {
                        f3 -= f3;
                    } while (++d1 < 1);
                    vMeth1_check_sum += l + l1 + i1 + i2 + i3 + i4 + Double.doubleToLongBits(d) +
                        Double.doubleToLongBits(d1) + Float.floatToIntBits(f3) + i12 + i13 + (b ? 1 : 0) +
                        FuzzerUtils.checkSum(iArr);
                    return;
                } else if (true) {
                    for (i12 = 1; i12 < 1; i12++) {
                        l = i1;
                        i2 *= (int)Test.instanceCount;
                    }
                } else {
                    d = -215;
                }
            }
        } while (++i1 < 326);
        vMeth1_check_sum += l + l1 + i1 + i2 + i3 + i4 + Double.doubleToLongBits(d) + Double.doubleToLongBits(d1) +
            Float.floatToIntBits(f3) + i12 + i13 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i) {

        float f4=47.429F;
        int i14=-112, iArr1[]=new int[N];
        boolean b1=true;

        FuzzerUtils.init(iArr1, -10);

        vMeth1(Test.instanceCount, Test.instanceCount);
        Test.dFld *= f4;
        f4 *= i;
        i14 = 191;
        do {
            i ^= (int)346874882441289550L;
            Test.lArrFld[i14 + 1] <<= Test.instanceCount;
            i *= 0;
            iArr1[i14 + 1] -= (int)Test.dFld;
            iArr1[i14 - 1] = i14;
            Test.dFld += 1769870952L;
        } while (--i14 > 0);
        for (int i15 : iArr1) {
            i >>>= Test.byFld;
            if (b1) {
                i15 += (int)f4;
                Test.instanceCount = (long)1.100F;
            } else if (b1) {
                iArr1[(i15 >>> 1) % N] -= i;
            } else {
                i15 += i;
            }
        }
        vMeth_check_sum += i + Float.floatToIntBits(f4) + i14 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i16=190, i17=17536, i18=5863, i19=246, i20=-14, i21=107, i22=205, i23=-8, i24=-212;
        double d2=0.112288;
        short s=-6594;
        boolean b2=false;

        vMeth(i16);
        for (d2 = 9; d2 < 197; ++d2) {
            for (i18 = 2; 133 > i18; i18++) {
                Test.instanceCount -= (long)d2;
            }
            i16 *= i18;
            i17 /= (int)(i16 | 1);
            for (i20 = 1; i20 < 133; i20++) {
                i21 <<= (int)-394194059L;
                Test.iArrFld[i20 + 1] += i17;
                for (i22 = 2; i22 > 1; i22 -= 3) {
                    Test.instanceCount -= i18;
                    Test.instanceCount *= i16;
                    Test.fFld += (i22 * Test.instanceCount);
                    Test.lArrFld[i20] = Test.instanceCount;
                    Test.iArrFld[(int)(d2 - 1)] -= s;
                }
                if (b2) continue;
                i23 -= 252;
            }
            switch ((int)(((d2 % 4) * 5) + 89)) {
            case 103:
            case 93:
                i24 = 1;
                do {
                    i17 += (i24 * i24);
                    i19 += (i24 * i24);
                    Test.byFld = (byte)i16;
                    Test.instanceCount -= -5;
                    i23 += i16;
                    i17 *= 27261;
                    Test.instanceCount += -6382;
                    i21 >>>= i16;
                    i19 *= 37;
                    Test.fFld = i17;
                } while (++i24 < 133);
                i17 *= 96;
                break;
            case 105:
                i19 = i19;
                break;
            case 106:
                i16 += i22;
                break;
            default:
                if (b2) continue;
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