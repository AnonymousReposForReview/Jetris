package tests.javafuzzer3267;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 05:16:05 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-14L;
    public static int iFld=-43378;
    public float fFld=55.192F;
    public byte byFld=-87;
    public static int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -14);
        FuzzerUtils.init(Test.dArrFld, 56.37807);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i4=133, i5=60904, i6=-7, i7=0, i8=-25601, i9=-197, i10=10;
        byte by=24;
        float f2=48.607F;
        boolean b=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 2815769047L);

        for (i4 = 17; i4 < 359; ++i4) {
            Test.iFld *= by;
            for (i6 = 1; i6 < 5; i6++) {
                Test.iFld += (((i6 * Test.instanceCount) + Test.iFld) - Test.instanceCount);
                lArr[i4 + 1] += (long)f2;
            }
            Test.instanceCount -= i6;
            try {
                Test.iArrFld[i4 - 1] = (i5 / Test.iFld);
                i5 = (-1537254057 % Test.iFld);
                i5 = (i4 % -30);
            } catch (ArithmeticException a_e) {}
            if (b) {
                i5 = (int)-2.110021;
            } else if (b) {
                i7 = 39;
            } else {
                for (i8 = i4; i8 < 5; i8++) {
                    i5 = i10;
                    lArr = FuzzerUtils.long1array(N, (long)202L);
                    Test.iFld = i5;
                    i5 = i6;
                }
            }
        }
        vMeth2_check_sum += i4 + i5 + by + i6 + i7 + Float.floatToIntBits(f2) + (b ? 1 : 0) + i8 + i9 + i10 +
            FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1() {

        int i1=228, i2=-12, i3=-10292, i11=-25592, iArr[]=new int[N];
        float f1=2.441F;
        double d=0.44067;
        boolean b1=false;

        FuzzerUtils.init(iArr, -5);

        Test.iFld -= Test.iFld;
        i1 = 1;
        while (++i1 < 154) {
            for (i2 = 1; 10 > i2; i2++) {
                Test.iFld += (int)(((Test.instanceCount + f1) * (++iArr[i1 + 1])) + (++iArr[i2 - 1]));
                vMeth2();
                Test.iArrFld[i1 + 1] <<= -143;
                d *= d;
            }
            i11 = 1;
            while (++i11 < 10) {
                i3 += (i11 * i11);
                Test.iFld -= (int)f1;
                i3 -= i3;
                if (b1) {
                    Test.iFld += (i11 - i3);
                    f1 *= i1;
                    try {
                        Test.iFld = (i11 / -51);
                        Test.iFld = (i1 % i11);
                        Test.iFld = (Test.iArrFld[i11] / i1);
                    } catch (ArithmeticException a_e) {}
                    vMeth1_check_sum += i1 + i2 + i3 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d) + i11 +
                        (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr);
                    return;
                } else if (b1) {
                    Test.instanceCount = i3;
                } else if (b1) {
                    Test.iArrFld[i1 - 1] <<= i3;
                }
            }
        }
        vMeth1_check_sum += i1 + i2 + i3 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d) + i11 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(long l, long l1, float f) {

        int i=-59268, i12=-174, i13=-7;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)83);

        f = Float.intBitsToFloat(--i);
        vMeth1();
        Test.instanceCount -= i;
        Test.iArrFld[(i >>> 1) % N] |= (int)Test.instanceCount;
        byArr[(-11 >>> 1) % N] = (byte)Test.iFld;
        Test.iFld *= Test.iFld;
        for (i12 = 9; i12 < 191; i12++) {
            if (i12 != 0) {
                vMeth_check_sum += l + l1 + Float.floatToIntBits(f) + i + i12 + i13 + FuzzerUtils.checkSum(byArr);
                return;
            }
        }
        vMeth_check_sum += l + l1 + Float.floatToIntBits(f) + i + i12 + i13 + FuzzerUtils.checkSum(byArr);
    }

    public void mainTest(String[] strArr1) {

        float f3=45.421F;
        int i14=168, i15=189, i16=-246, i17=-13, i18=5, i19=-30094, i20=-56291, i21=-6, i22=-110, iArr1[][]=new
            int[N][N];
        boolean b2=false;
        short s=31676;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 13L);
        FuzzerUtils.init(iArr1, -36197);

        vMeth(Test.instanceCount, Test.instanceCount, fFld);
        lArr1[(Test.iFld >>> 1) % N] = Test.iFld;
        lArr1[(19349 >>> 1) % N] = Test.instanceCount;
        Test.iFld *= (int)Test.instanceCount;
        Test.iFld += (int)fFld;
        for (f3 = 13; f3 < 336; f3++) {
            b2 = b2;
        }
        switch ((((Test.iFld >>> 1) % 9) * 5) + 121) {
        case 126:
            for (i15 = 12; 316 > i15; i15++) {
                for (i17 = 2; i17 < 83; ++i17) {
                    double d1=-34.94569;
                    for (i19 = 1; i19 < 2; ++i19) {
                        Test.instanceCount &= i20;
                        iArr1 = FuzzerUtils.int2array(N, (int)57);
                        i16 = i18;
                        byFld -= (byte)-243;
                    }
                    Test.instanceCount |= i15;
                    s += (short)Test.instanceCount;
                    if (b2) continue;
                    lArr1 = lArr1;
                    d1 += Test.iFld;
                    i16 += (i17 * i17);
                    i18 += (i17 + Test.instanceCount);
                    Test.instanceCount = i18;
                    i14 += (((i17 * i18) + i16) - i19);
                }
                for (i21 = 1; i21 < 83; i21++) {
                    i18 ^= -50754;
                    Test.instanceCount += i21;
                    if (b2) break;
                    i20 <<= i21;
                    i14 *= i19;
                }
            }
            break;
        case 151:
            Test.dArrFld[(-29793 >>> 1) % N] -= i18;
        case 146:
        case 136:
            i22 += i20;
            break;
        case 125:
            lArr1[(i19 >>> 1) % N] += Test.instanceCount;
        case 159:
            iArr1[(i20 >>> 1) % N][(-4854 >>> 1) % N] = i16;
        case 165:
            iArr1[(Test.iFld >>> 1) % N][(i20 >>> 1) % N] >>= 66;
            break;
        case 129:
        case 127:
            Test.instanceCount *= Test.instanceCount;
            break;
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
