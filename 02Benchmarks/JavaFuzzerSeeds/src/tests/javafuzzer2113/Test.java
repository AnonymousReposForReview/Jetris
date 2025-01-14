package tests.javafuzzer2113;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 09:09:52 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-7L;
    public static volatile short sFld=13912;
    public double dFld=-119.61123;
    public float fFld=-1.567F;
    public static boolean bFld=true;
    public static int iArrFld[]=new int[N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 247);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i3) {

        long l1=-3L, lArr[]=new long[N];
        int i4=52942, i5=-34084, i6=213, i7=-10, i8=-29385, i9=-6;
        float f=73.767F;

        FuzzerUtils.init(lArr, 75L);

        for (l1 = 17; l1 < 346; ++l1) {
            switch (((i3 >>> 1) % 1) + 122) {
            case 122:
                for (i5 = 1; 5 > i5; i5++) {
                    i7 = 1;
                    while (++i7 < 2) {
                        Test.instanceCount += (i7 - f);
                        i4 = (int)l1;
                        lArr[i5 + 1] &= i5;
                        Test.sFld += (short)(((i7 * i4) + i7) - i3);
                        i3 += (((i7 * i7) + Test.sFld) - i7);
                    }
                    i6 = (int)-3313027505L;
                    switch (((i5 % 5) * 5) + 90) {
                    case 94:
                        for (i8 = i5; i8 < 2; i8++) {
                            i6 += (i8 * i6);
                            Test.instanceCount += (i8 * Test.instanceCount);
                            Test.sFld += (short)i8;
                        }
                    case 107:
                        i4 = 9101;
                        break;
                    case 112:
                        Test.iArrFld[i5] <<= i5;
                        break;
                    case 113:
                        i9 = (int)f;
                        break;
                    case 109:
                        i3 = i8;
                    }
                }
                break;
            default:
                f = i5;
            }
        }
        vMeth2_check_sum += i3 + l1 + i4 + i5 + i6 + i7 + Float.floatToIntBits(f) + i8 + i9 +
            FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(double d1, int i1, int i2) {

        int i10=11493, i11=-6, i12=-104, i13=-26, i14=65362, i15=12, i16=49042;
        float f1=-1.878F;
        boolean b=false;

        vMeth2(i2);
        if (b) {
            for (i10 = 8; i10 < 380; i10++) {
                i2 <<= i1;
                if (false) {
                    for (i12 = 5; i12 > i10; i12--) {
                        i13 += i13;
                        Test.sFld >>= (short)47;
                        for (i14 = 1; i14 < 1; ++i14) {
                            i1 *= i14;
                            switch ((i14 % 2) + 96) {
                            case 96:
                                i1 += (((i14 * Test.instanceCount) + i15) - f1);
                            case 97:
                                f1 += ((long)i14 | (long)i2);
                                i11 *= i16;
                            }
                            i11 = i16;
                        }
                    }
                    vMeth1_check_sum += Double.doubleToLongBits(d1) + i1 + i2 + i10 + i11 + i12 + i13 + i14 + i15 +
                        Float.floatToIntBits(f1) + i16 + (b ? 1 : 0);
                    return;
                } else if (b) {
                    if (b) break;
                } else {
                    i15 = (int)8584L;
                    vMeth1_check_sum += Double.doubleToLongBits(d1) + i1 + i2 + i10 + i11 + i12 + i13 + i14 + i15 +
                        Float.floatToIntBits(f1) + i16 + (b ? 1 : 0);
                    return;
                }
            }
        } else {
            i16 &= i15;
        }
        vMeth1_check_sum += Double.doubleToLongBits(d1) + i1 + i2 + i10 + i11 + i12 + i13 + i14 + i15 +
            Float.floatToIntBits(f1) + i16 + (b ? 1 : 0);
    }

    public static void vMeth(double d, long l) {

        int i=53186, i17=41400;

        i = 1;
        while (++i < 252) {
            vMeth1(24.32085, i, 27698);
        }
        i17 -= 157;
        i17 = i;
        Test.instanceCount = i17;
        i17 -= i;
        vMeth_check_sum += Double.doubleToLongBits(d) + l + i + i17;
    }

    public void mainTest(String[] strArr1) {

        float f2=8.423F, f3=1.407F, fArr[]=new float[N];
        int i18=-162, i19=-6, i20=-8, i21=1, i22=191, i23=-50424, i24=198;
        byte by=-36;
        double d2=-2.41805;

        FuzzerUtils.init(fArr, 114.719F);

        vMeth(dFld, 145L);
        f2 = 1;
        while (++f2 < 351) {
            for (i19 = (int)(f2); i19 < 72; i19++) {
                i20 -= (int)-2.974F;
                lArrFld = lArrFld;
                i20 = (int)Test.instanceCount;
                f3 -= i19;
                for (i21 = i19; i21 < 1; ++i21) {
                    i22 *= (int)Test.instanceCount;
                    by += (byte)(((i21 * i20) + i21) - Test.instanceCount);
                    i20 = i19;
                    Test.iArrFld[(int)(f2 - 1)] = (int)27.74928;
                    try {
                        i20 = (17194 / i18);
                        i20 = (i19 % i21);
                        i18 = (i19 / i20);
                    } catch (ArithmeticException a_e) {}
                }
                for (d2 = 1; 1 > d2; ++d2) {
                    i24 += (int)d2;
                    Test.instanceCount = by;
                    Test.iArrFld[(int)(f2)] -= (int)f2;
                    switch ((int)(((f2 % 1) * 5) + 106)) {
                    case 107:
                        dFld = 41;
                        i23 += (int)(d2 - Test.sFld);
                        fArr[i19] = i21;
                        i24 = (int)Test.instanceCount;
                        break;
                    }
                    i20 -= (int)Test.instanceCount;
                    fFld /= (i24 | 1);
                    i18 += (int)Test.instanceCount;
                    i22 <<= (int)Test.instanceCount;
                    i20 += by;
                    i20 -= i24;
                }
            }
            Test.instanceCount = i20;
            Test.bFld = Test.bFld;
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
