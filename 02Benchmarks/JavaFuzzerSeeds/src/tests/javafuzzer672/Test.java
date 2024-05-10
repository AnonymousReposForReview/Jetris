package tests.javafuzzer672;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 07:41:55 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=201L;
    public static volatile long lFld=139L;
    public static volatile float fFld=0.451F;
    public static volatile double dFld=0.7664;
    public static int iArrFld[]=new int[N];
    public volatile float fArrFld[]=new float[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 218);
        FuzzerUtils.init(Test.dArrFld, 74.52223);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        short s=-30769;
        int i7=4, i8=-45;
        float f=78.179F, fArr[]=new float[N];
        boolean b=true;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 59.11364);
        FuzzerUtils.init(fArr, 47.124F);

        s += (short)i7;
        Test.iArrFld[(i7 >>> 1) % N] = 56165;
        f -= i7;
        i7 = s;
        dArr[(i7 >>> 1) % N] += -3090;
        i8 = 1;
        while (++i8 < 167) {
            fArr[i8 + 1] -= Test.instanceCount;
            i7 += (i8 | i8);
            i7 = (int)-2L;
            if (b) continue;
            i7 += (i8 * i8);
            i7 >>>= (int)336074974L;
            Test.lFld += Test.instanceCount;
            Test.instanceCount = i8;
        }
        i7 |= i7;
        vMeth2_check_sum += s + i7 + Float.floatToIntBits(f) + i8 + (b ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth1(int i4, int i5, int i6) {

        int i9=-29, i10=11432, i11=-4721, i12=-30, i13=57054, i14=2;
        boolean b1=true;
        byte by=121;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 2498304131L);

        vMeth2();
        for (i9 = 16; i9 < 285; ++i9) {
            i11 = 1;
            while (++i11 < 6) {
                try {
                    i5 = (707533149 % i4);
                    i6 = (18274 % i11);
                    Test.iArrFld[i11 + 1] = (i11 % Test.iArrFld[i9 - 1]);
                } catch (ArithmeticException a_e) {}
            }
            if (false) break;
            for (i12 = i9; i12 < 6; i12++) {
                Test.lFld += (-202 + (i12 * i12));
                if (i10 != 0) {
                    vMeth1_check_sum += i4 + i5 + i6 + i9 + i10 + i11 + i12 + i13 + (b1 ? 1 : 0) + i14 + by +
                        FuzzerUtils.checkSum(lArr);
                    return;
                }
                if (b1) continue;
                Test.instanceCount += i9;
                i14 = 1;
                while ((i14 += 3) < 1) {
                    switch (((-12801 >>> 1) % 7) + 98) {
                    case 98:
                        Test.instanceCount >>= i12;
                        break;
                    case 99:
                        i6 |= by;
                        break;
                    case 100:
                        b1 = b1;
                    case 101:
                        i4 += (i14 + i10);
                        break;
                    case 102:
                        i5 = (int)Test.instanceCount;
                        break;
                    case 103:
                        lArr[i14 + 1] += (long)Test.fFld;
                    case 104:
                        i10 *= -5;
                        break;
                    default:
                        Test.lFld = i12;
                    }
                }
            }
        }
        vMeth1_check_sum += i4 + i5 + i6 + i9 + i10 + i11 + i12 + i13 + (b1 ? 1 : 0) + i14 + by +
            FuzzerUtils.checkSum(lArr);
    }

    public void vMeth(int i, int i1) {

        int i2=-31303, i3=94, i15=-10, i16=-169, i17=105, i18=-191;
        double d=0.48918;
        short s1=24754;
        byte by1=-85;

        for (i2 = 6; i2 < 346; ++i2) {
            vMeth1(7, i1, i3);
            i3 -= (int)Test.fFld;
            for (i15 = 1; 5 > i15; i15++) {
                i1 -= (int)Test.fFld;
                Test.iArrFld[i2 + 1] = i3;
                for (i17 = 2; i17 > 1; i17 -= 3) {
                    fArrFld[i17] = Test.lFld;
                    d += i3;
                    i18 -= i;
                    Test.lFld >>= i16;
                    s1 *= (short)Test.lFld;
                    by1 = (byte)i3;
                    Test.iArrFld = FuzzerUtils.int1array(N, (int)-9);
                }
                Test.iArrFld[i15] >>= i18;
            }
        }
        vMeth_check_sum += i + i1 + i2 + i3 + i15 + i16 + i17 + i18 + Double.doubleToLongBits(d) + s1 + by1;
    }

    public void mainTest(String[] strArr1) {

        int i19=-7231, i20=-8, i21=-8, i22=6, i23=6, i24=16384, i25=3, i26=166, i27=0;
        short s2=16339;
        double d1=2.69777;
        boolean b2=false;
        long l=-5L;

        vMeth(i19, i19);
        for (i20 = 185; i20 > 10; i20--) {
            Test.lFld *= s2;
            Test.instanceCount += i20;
            if (b2) {
                Test.dArrFld[i20 + 1] += 12;
                for (i22 = 5; 143 > i22; ++i22) {
                    i19 += (i22 ^ i23);
                    for (i24 = 1; i24 < 2; ++i24) {
                        Test.fFld = i25;
                    }
                    Test.dFld += i22;
                    try {
                        i25 = (Test.iArrFld[i20] % -473031860);
                        i19 = (-172 / Test.iArrFld[i20]);
                        i19 = (i19 % -1251194251);
                    } catch (ArithmeticException a_e) {}
                    i25 += (i22 + Test.fFld);
                    for (d1 = 1; d1 < 2; ++d1) {
                        i23 >>= i26;
                    }
                    Test.dFld = Test.fFld;
                    switch ((i22 % 2) + 90) {
                    case 90:
                        Test.lFld += Test.lFld;
                        b2 = b2;
                        if (b2) {
                            for (l = 1; 2 > l; ++l) {
                                i25 += (int)(2541155158845717311L + (l * l));
                                i25 += (8 + (l * l));
                                i21 -= i26;
                                Test.lFld += Test.lFld;
                            }
                            i23 /= (int)-7066781106532864179L;
                            i19 = i27;
                        } else if (b2) {
                            Test.iArrFld[i20 - 1] *= (int)Test.lFld;
                        } else {
                            i19 += (i22 | i20);
                        }
                        break;
                    case 91:
                        i26 += 239;
                        break;
                    default:
                        i23 += -8;
                    }
                }
            } else {
                i26 -= i21;
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
