package tests.javafuzzer449;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 04:02:44 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1L;
    public static int iFld=-3;
    public static float fFld=-2.529F;
    public static byte byFld=46;
    public static short sFld=27771;
    public boolean bFld=true;
    public static double dFld=-71.88627;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i2, double d1, int i3) {

        int i4=42809, i5=147, i6=6, i7=-209, i8=8120, iArr1[]=new int[N];
        boolean b=false;
        byte by=-84;

        FuzzerUtils.init(iArr1, 28);

        iArr1[(i3 >>> 1) % N] += Test.iFld;
        for (i4 = 1; i4 < 345; i4++) {
            i3 = (int)Test.fFld;
            try {
                i5 = (iArr1[i4 + 1] % i4);
                i3 = (iArr1[i4] % Test.iFld);
                i5 = (i4 / i2);
            } catch (ArithmeticException a_e) {}
            for (i6 = 1; i6 < 5; ++i6) {
                i7 = -8;
                i2 += i6;
                i8 = 1;
                while (++i8 < 2) {
                    if (b) break;
                    Test.instanceCount += Test.instanceCount;
                    switch (((i4 % 9) * 5) + 12) {
                    case 26:
                        try {
                            i7 = (i5 % 51875);
                            i2 = (-954038596 % i7);
                            i2 = (iArr1[i8] / Test.iFld);
                        } catch (ArithmeticException a_e) {}
                        by += (byte)(((i8 * i7) + i4) - Test.fFld);
                        i5 = -32991;
                        break;
                    case 33:
                    case 38:
                        Test.fFld += i8;
                    case 43:
                        i3 *= (int)15537L;
                        break;
                    case 40:
                        d1 = i6;
                        break;
                    case 42:
                        i3 >>= i8;
                        break;
                    case 14:
                        Test.iFld += i2;
                        break;
                    case 32:
                        Test.fFld += -9721;
                        break;
                    case 54:
                        iArr1[i4 + 1] = (int)-13L;
                        break;
                    default:
                        d1 = i8;
                    }
                }
            }
        }
        vMeth2_check_sum += i2 + Double.doubleToLongBits(d1) + i3 + i4 + i5 + i6 + i7 + i8 + (b ? 1 : 0) + by +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth1() {

        double d=-4.53757;
        int i=63537, i1=-58082, iArr[]=new int[N];
        long l=7258L, lArr[]=new long[N];
        float f=1.275F, fArr[]=new float[N];

        FuzzerUtils.init(iArr, -4);
        FuzzerUtils.init(lArr, 2326397099092359881L);
        FuzzerUtils.init(fArr, -1.526F);

        Test.instanceCount += (((Test.instanceCount * Test.instanceCount) - (--Test.iFld)) - Math.max((int)(173 * (d +
            d)), iArr[(Test.iFld >>> 1) % N]--));
        for (i = 8; 173 > i; ++i) {
            lArr[i] -= (long)94.26F;
            vMeth2(i, d, 145);
            d = Test.byFld;
            Test.fFld += Test.fFld;
            Test.iFld += i;
            l = 1;
            while (++l < 10) {
                lArr[(int)(l + 1)] = (long)Test.fFld;
            }
            i1 = i;
            fArr[i - 1] = l;
        }
        f = 1;
        while (++f < 341) {
            Test.instanceCount += i1;
            iArr = iArr;
            i1 += (int)(((f * i) + Test.iFld) - Test.fFld);
        }
        vMeth1_check_sum += Double.doubleToLongBits(d) + i + i1 + l + Float.floatToIntBits(f) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void vMeth() {

        int i9=185, i10=-2, i11=-12, i12=50925, i13=-5;
        long lArr1[]=new long[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(lArr1, -745316372L);
        FuzzerUtils.init(dArr, -2.74643);

        vMeth1();
        lArr1[(-13 >>> 1) % N] <<= -44292;
        i9 = 1;
        while (++i9 < 206) {
            switch (((Test.iFld >>> 1) % 5) + 26) {
            case 26:
                switch (((Test.iFld >>> 1) % 1) + 91) {
                case 91:
                    for (i10 = i9; i10 < 8; i10++) {
                        dArr[i10 - 1] += Test.iFld;
                    }
                default:
                    lArr1[i9] *= (long)Test.fFld;
                    for (i12 = 1; i12 < 8; ++i12) {
                        i11 = i12;
                        i13 += (i12 - Test.instanceCount);
                    }
                }
                break;
            case 27:
                switch ((i9 % 2) + 8) {
                case 8:
                    Test.sFld = (short)i10;
                    break;
                case 9:
                    i11 = (int)Test.fFld;
                    Test.iFld -= i12;
                    break;
                default:
                    if (bFld) break;
                }
                break;
            case 28:
                i13 >>= i10;
                break;
            case 29:
                try {
                    i13 = (i13 % i11);
                    Test.iFld = (i13 % -8690);
                    Test.iFld = (i12 % i10);
                } catch (ArithmeticException a_e) {}
                break;
            case 30:
                if (i10 != 0) {
                    vMeth_check_sum += i9 + i10 + i11 + i12 + i13 + FuzzerUtils.checkSum(lArr1) +
                        Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                    return;
                }
                break;
            default:
                i11 = i9;
            }
        }
        vMeth_check_sum += i9 + i10 + i11 + i12 + i13 + FuzzerUtils.checkSum(lArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i14=-19330, i15=3879, i16=10, i17=-228, i18=208, i19=4, i20=-20847, iArr2[]=new int[N];
        long l1=-64L, lArr2[]=new long[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(iArr2, 10746);
        FuzzerUtils.init(byArr, (byte)-1);
        FuzzerUtils.init(lArr2, 240L);

        vMeth();
        i14 = 1;
        do {
            Test.iFld = Test.iFld;
            iArr2[i14] *= (int)Test.instanceCount;
            iArr2[i14 - 1] -= (int)Test.instanceCount;
            for (i15 = 177; 11 < i15; --i15) {
                Test.instanceCount -= i14;
                Test.byFld += (byte)Test.fFld;
                i16 = i15;
                byArr[i15 + 1] = (byte)i15;
                i17 = 1;
                do {
                    Test.dFld += Test.byFld;
                    i16 |= i17;
                } while (++i17 < 2);
                for (l1 = i15; l1 < 2; l1++) {
                    i16 = Test.iFld;
                    Test.iFld += (int)(l1 + Test.instanceCount);
                    lArr2[i14 + 1] += 6;
                }
                Test.instanceCount %= (i16 | 1);
                Test.fFld -= l1;
                Test.dFld /= (Test.instanceCount | 1);
            }
            i19 = 177;
            do {
                i18 >>= -62;
                Test.fFld += (i19 * i19);
                Test.fFld *= 1987328330L;
                Test.iFld = -1251;
                Test.instanceCount -= (long)Test.fFld;
                Test.iFld += (((i19 * Test.byFld) + i17) - i15);
                i20 = 1;
                do {
                    i18 -= i19;
                    lArr2 = lArr2;
                } while (++i20 < 1);
            } while (--i19 > 0);
        } while (++i14 < 142);



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