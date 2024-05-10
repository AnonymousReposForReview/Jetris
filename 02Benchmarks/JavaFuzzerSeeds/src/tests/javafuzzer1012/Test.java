package tests.javafuzzer1012;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 12:49:49 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=12354081L;
    public static byte byFld=81;
    public static volatile int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -153);
        FuzzerUtils.init(Test.dArrFld, 53.18688);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i4, int i5) {

        double d2=0.46396;
        int i6=-64860, i7=244, i8=13580, i9=10103, i10=21928, i11=-5;
        boolean b=false;
        float f1=-2.562F;

        i5 *= (int)d2;
        Test.dArrFld = Test.dArrFld;
        for (i6 = 11; 198 > i6; ++i6) {
            if (b) {
                for (i8 = i6; 9 > i8; ++i8) {
                    if (b) break;
                    i7 >>= i9;
                    Test.instanceCount = i7;
                    switch ((i6 % 7) + 106) {
                    case 106:
                        i9 = (int)Test.instanceCount;
                        Test.iArrFld = Test.iArrFld;
                        for (i10 = 1; i10 < 1; ++i10) {
                            i4 = i7;
                        }
                        break;
                    case 107:
                        i11 *= i10;
                        break;
                    case 108:
                        i7 += (int)f1;
                        break;
                    case 109:
                        try {
                            i9 = (-213 / i5);
                            Test.iArrFld[i6] = (-74 / i9);
                            i5 = (i11 / 242);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 110:
                    case 111:
                        Test.instanceCount += (((i8 * i8) + i5) - i6);
                        break;
                    case 112:
                        try {
                            i7 = (1849033415 / i9);
                            i5 = (i10 / i11);
                            i9 = (i7 / i4);
                        } catch (ArithmeticException a_e) {}
                        break;
                    }
                }
            }
        }
        vMeth2_check_sum += i4 + i5 + Double.doubleToLongBits(d2) + i6 + i7 + i8 + i9 + (b ? 1 : 0) + i10 + i11 +
            Float.floatToIntBits(f1);
    }

    public static void vMeth1(float f, int i3) {

        byte by=-45;
        int i12=-26283, i13=82, i14=-14271, i15=70, i16=-3;
        boolean b1=true;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 0.667F);

        i3 = by;
        i3 <<= (int)(((++Test.instanceCount) + Test.iArrFld[(i3 >>> 1) % N]) * (i3--));
        vMeth2(i3, i3);
        i3 += 21407;
        for (i12 = 7; i12 < 175; ++i12) {
            i3 += (((i12 * Test.instanceCount) + f) - i14);
            for (i15 = 1; i15 < 9; i15++) {
                if (b1) break;
                Test.instanceCount = i12;
                switch ((i12 % 1) + 94) {
                case 94:
                    Test.iArrFld[i12] = (int)3715537115L;
                    Test.iArrFld[i15] <<= (int)Test.instanceCount;
                    if (i15 != 0) {
                        vMeth1_check_sum += Float.floatToIntBits(f) + i3 + by + i12 + i13 + i14 + i15 + i16 + (b1 ? 1 :
                            0) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                        return;
                    }
                    break;
                }
                i16 = -14420;
            }
            i14 += (((i12 * i14) + i12) - f);
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + i3 + by + i12 + i13 + i14 + i15 + i16 + (b1 ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(double d, double d1, int i) {

        int i1=-8, i2=22528, i17=-176, i18=-2;
        double d3=-49.108529;
        short s=30077;

        switch ((((int)(Test.instanceCount + i)) >>> 1) % 6) {
        case 0:
        case 1:
            for (i1 = 16; 376 > i1; ++i1) {
                float f3=0.249F;
                vMeth1(f3, 8);
                Test.instanceCount += (-9 + (i1 * i1));
                switch ((i1 % 8) + 99) {
                case 99:
                    Test.instanceCount += (i1 * i1);
                    for (i17 = 1; i17 < 5; ++i17) {
                        i2 += (((i17 * i17) + i17) - f3);
                    }
                case 100:
                case 101:
                    i18 += (i1 * i1);
                    break;
                case 102:
                    i = (int)d;
                    d3 = 1;
                    while (++d3 < 5) {
                        Test.instanceCount = -39863;
                        i += (int)111.24462;
                        Test.instanceCount -= 17736;
                    }
                    Test.iArrFld[i1 + 1] -= i18;
                    break;
                case 103:
                    i2 += (i1 * Test.byFld);
                    break;
                case 104:
                    Test.instanceCount *= i;
                    break;
                case 105:
                    Test.dArrFld[i1] = f3;
                case 106:
                    Test.instanceCount += (((i1 * i18) + i1) - i17);
                    break;
                }
            }
            break;
        case 2:
        case 3:
            Test.instanceCount <<= -13756;
        case 4:
            i2 += (int)5.577F;
            break;
        case 5:
            s += (short)-2.21F;
            break;
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + Double.doubleToLongBits(d1) + i + i1 + i2 + i17 + i18 +
            Double.doubleToLongBits(d3) + s;
    }

    public void mainTest(String[] strArr1) {

        float f4=-91.314F;
        int i19=-8, i20=11, i21=107, i22=2, i23=21877, i24=-11268, i25=-12688;
        double d4=0.66236, d5=-53.54048;
        boolean b2=false;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)5286);

        vMeth(-1.71172, 28.103185, -53961);
        for (short s1 : sArr) {
            for (f4 = 2; 63 > f4; ++f4) {
                Test.instanceCount += (long)f4;
                i19 -= 64561;
                for (i20 = 1; i20 < 2; i20++) {
                    d4 *= 0.194F;
                }
                Test.instanceCount = i19;
                i19 = i21;
                Test.instanceCount -= Test.instanceCount;
                Test.iArrFld = Test.iArrFld;
                for (i22 = 1; i22 < 2; i22++) {
                    Test.byFld += (byte)(((i22 * i23) + i22) - f4);
                    if (b2) break;
                    i23 -= (int)Test.instanceCount;
                    i21 *= i22;
                    Test.iArrFld[(int)(f4)] <<= (int)Test.instanceCount;
                    if (true) {
                        i19 += (-10 + (i22 * i22));
                    }
                    b2 = b2;
                }
            }
            i24 = 1;
            while (++i24 < 63) {
                i21 += i23;
                Test.instanceCount <<= i20;
                i19 += 58611;
                i23 = 11;
                i19 -= (int)Test.instanceCount;
                i19 >>= (int)Test.instanceCount;
                for (d5 = i24; d5 < 1; d5 += 2) {
                    i25 += (int)d4;
                    i21 += 106;
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
