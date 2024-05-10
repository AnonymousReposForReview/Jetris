package tests.javafuzzer3019;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 00:46:47 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=8660616106903445566L;
    public static double dFld=-1.63566;
    public int iFld=-8;
    public byte byFld=9;
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 2.105026);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i5, int i6) {

        int i7=27195, i8=62975, i9=96, i10=58100, i11=201, i12=177, iArr[]=new int[N];
        double d1=-36.73324;
        float f=0.120F, fArr[]=new float[N];
        boolean b=true;

        FuzzerUtils.init(fArr, -2.7F);
        FuzzerUtils.init(iArr, 168);

        for (i7 = 379; 9 < i7; i7 -= 2) {
            i6 += i5;
            i6 += (int)Test.instanceCount;
            i6 = i8;
            if (b) {
                for (i9 = 1; i9 < 9; i9 += 3) {
                    fArr[i7 - 1] = -6;
                    for (i11 = 1; i11 < 5; ++i11) {
                        d1 *= Test.instanceCount;
                    }
                    i12 -= (int)Test.instanceCount;
                    i12 -= -13;
                }
                i8 += (int)f;
                iArr[i7] += -82;
            }
            i10 += i8;
            i12 += i7;
        }
        vMeth2_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + i11 + i12 + Double.doubleToLongBits(d1) +
            Float.floatToIntBits(f) + (b ? 1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(int i2) {

        int i3=28, i4=-2446, i13=-119, i14=-103, iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, 11);

        for (i3 = 15; 344 > i3; ++i3) {
            switch ((i3 % 1) + 119) {
            case 119:
                vMeth2(41, i2);
                for (i13 = 1; i13 < 5; i13 += 3) {
                    i14 <<= i13;
                    Test.instanceCount += (i13 | i2);
                    Test.instanceCount += -237L;
                    i14 += i13;
                    iArr1[i13] = (int)-249L;
                    switch ((i3 % 2) + 108) {
                    case 108:
                        Test.dFld -= i2;
                        i2 = (int)Test.instanceCount;
                        i2 <<= i4;
                        i2 = (int)Test.instanceCount;
                        break;
                    case 109:
                        Test.instanceCount = i2;
                        break;
                    default:
                        i14 >>= i14;
                    }
                }
                break;
            }
        }
        vMeth1_check_sum += i2 + i3 + i4 + i13 + i14 + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i, long l, int i1) {

        double d=41.85534;
        int i15=75, i16=-37954, i17=-40, iArr2[]=new int[N];
        byte by=-75;
        short s=19673;
        boolean b1=false;
        float f1=-1.970F, fArr1[]=new float[N];

        FuzzerUtils.init(iArr2, -5261);
        FuzzerUtils.init(fArr1, -1.368F);

        i <<= (int)(-d);
        i1 = (int)-1.98581;
        vMeth1(i1);
        i15 = 169;
        do {
            i16 = 1;
            while (++i16 < 9) {
                by = (byte)i16;
                i -= i16;
                l ^= i16;
            }
            iArr2[i15] = i15;
            i17 = 1;
            do {
                i += (int)l;
            } while (++i17 < 9);
        } while (--i15 > 0);
        fArr1[(i15 >>> 1) % N] *= s;
        b1 = b1;
        f1 += i;
        i1 -= i17;
        vMeth_check_sum += i + l + i1 + Double.doubleToLongBits(d) + i15 + i16 + by + i17 + s + (b1 ? 1 : 0) +
            Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr2) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public void mainTest(String[] strArr1) {

        int i18=0, i19=6, i20=4, i21=3, i22=21803, i23=39103, i24=-25573, i25=44933, i26=12726, iArr3[]=new int[N];
        float f2=0.509F, f3=2.973F;
        boolean b2=true;
        double d2=-2.46866;

        FuzzerUtils.init(iArr3, 61588);

        vMeth(iFld, Test.instanceCount, iFld);
        for (i18 = 7; i18 < 156; i18 += 2) {
            for (f2 = i18; f2 < 338; ++f2) {
                i20 >>= i18;
                for (i21 = (int)(f2); i21 < 1; ++i21) {
                    i22 += (((i21 * i18) + i19) - Test.instanceCount);
                    Test.dFld *= i20;
                    Test.instanceCount = Test.instanceCount;
                    f3 += (((i21 * f3) + i18) - f3);
                    f3 += (i21 + byFld);
                    i19 += (i21 + i21);
                    Test.instanceCount *= byFld;
                    i19 -= i19;
                }
                i22 = i22;
                i20 += i19;
                i22 += (int)(((f2 * Test.instanceCount) + Test.instanceCount) - f2);
            }
            switch (((i18 % 2) * 5) + 10) {
            case 15:
                i22 = 23;
            case 11:
                i22 *= (int)f3;
            default:
                if (b2) break;
                i22 <<= (int)60030L;
            }
            for (d2 = 16; d2 < 338; d2++) {
                switch (((iFld >>> 1) % 2) + 106) {
                case 106:
                    i19 += iFld;
                    Test.dFld -= iFld;
                    for (i24 = i18; i24 < 2; i24++) {
                        Test.dArrFld[i24] -= f2;
                        iFld += (((i24 * i22) + i24) - i22);
                        iFld += i23;
                        try {
                            i25 = (-2013328665 / i21);
                            i26 = (i21 % i18);
                            iArr3[(int)(d2 + 1)] = (-78 % i24);
                        } catch (ArithmeticException a_e) {}
                    }
                    break;
                case 107:
                    iArr3[(int)(d2 - 1)] -= 13;
                    break;
                default:
                    Test.dFld += i19;
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