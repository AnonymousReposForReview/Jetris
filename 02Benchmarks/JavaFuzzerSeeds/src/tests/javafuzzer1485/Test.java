package tests.javafuzzer1485;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 21:18:27 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-13L;
    public static boolean bFld=true;
    public static double dFld=-1.65215;
    public static int iFld=-10100;
    public int iFld1=-25263;
    public long lFld=-1669429984L;
    public static volatile int iArrFld[]=new int[N];
    public static double dArrFld[][]=new double[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, -55);
        FuzzerUtils.init(Test.dArrFld, -1.77955);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i1) {

        int i2=7, i3=12, i4=-73, i5=-135, i6=-192, iArr[]=new int[N];
        long l=-12L;
        float fArr[][]=new float[N][N];
        double dArr[][]=new double[N][N];

        FuzzerUtils.init(iArr, -8);
        FuzzerUtils.init(fArr, 36.514F);
        FuzzerUtils.init(dArr, -2.123083);

        i2 = 166;
        do {
            double d=-103.16208;
            i1 += (int)d;
            i1 ^= i2;
            iArr[i2] >>= (int)Test.instanceCount;
            i1 *= i1;
            for (l = 1; l < 10; l++) {
                i1 += i3;
                i4 = 1;
                while (++i4 < 2) {
                    i3 += i1;
                    i1 = i4;
                }
            }
            for (i5 = 10; i5 > 1; i5 -= 3) {
                d = l;
                fArr[i2 + 1][i2 + 1] = -16783;
                dArr[i5][i5 - 1] = i3;
                iArr = iArr;
            }
        } while (--i2 > 0);
        vMeth1_check_sum += i1 + i2 + l + i3 + i4 + i5 + i6 + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static long lMeth() {

        int i7=-25, i8=-7, i9=-65283, iArr1[][]=new int[N][N];
        float f1=1.218F, f2=-2.55F;
        byte by=-62;

        FuzzerUtils.init(iArr1, 9221);

        vMeth1(14);
        for (i7 = 8; i7 < 381; ++i7) {
            i8 = i8;
            for (f1 = 1; f1 < 5; ++f1) {
                i8 += (int)(((f1 * i8) + by) - f1);
            }
            i9 = i9;
            i8 = i7;
            f2 -= -1;
            Test.bFld = true;
            i8 = (int)-9L;
            iArr1[i7][i7 - 1] = i9;
            i9 = (int)-165L;
        }
        Test.instanceCount -= i9;
        i8 = i9;
        long meth_res = i7 + i8 + Float.floatToIntBits(f1) + i9 + by + Float.floatToIntBits(f2) +
            FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth() {

        float f=0.831F, f3=65.284F;
        int i=79, i10=216, i11=-42797, i12=-49910, i13=14;
        byte by1=43;
        double dArr1[]=new double[N];

        FuzzerUtils.init(dArr1, -21.48115);

        f -= (Math.max(Math.max(i, i), i++) + Math.min(lMeth(), Test.instanceCount));
        if (Test.bFld) {
            for (i10 = 4; i10 < 294; i10++) {
                for (f3 = 1; f3 < 6; f3++) {
                    if (true) break;
                    try {
                        Test.iArrFld[i10 - 1] = (Test.iArrFld[(int)(f3 + 1)] % 488031555);
                        i = (-56303 / i);
                        i11 = (-165867172 / i12);
                    } catch (ArithmeticException a_e) {}
                    i13 = 1;
                    do {
                        switch (((i13 >>> 1) % 9) + 19) {
                        case 19:
                            f -= f3;
                            break;
                        case 20:
                            i += (i13 ^ i12);
                            f -= i10;
                            i *= -177;
                            dArr1[i10 - 1] = f3;
                        case 21:
                            Test.dFld *= i;
                            i12 += (((i13 * i12) + i13) - i);
                            break;
                        case 22:
                            by1 += (byte)(i13 | i);
                        case 23:
                        case 24:
                            Test.instanceCount *= -19;
                            break;
                        case 25:
                            if (i11 != 0) {
                                vMeth_check_sum += Float.floatToIntBits(f) + i + i10 + i11 + Float.floatToIntBits(f3) +
                                    i12 + i13 + by1 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
                                return;
                            }
                            break;
                        case 26:
                            Test.instanceCount -= -35243;
                            break;
                        case 27:
                            Test.instanceCount += (((i13 * i12) + i10) - f);
                        default:
                            i11 -= i10;
                        }
                    } while (++i13 < 2);
                }
            }
        } else if (Test.bFld) {
            i12 *= (int)f;
        } else {
            f = i12;
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i + i10 + i11 + Float.floatToIntBits(f3) + i12 + i13 + by1 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
    }

    public void mainTest(String[] strArr1) {

        int i14=0, i15=12, i16=-219, i17=30289, i18=65155, i19=-26340, i20=9, i21=-61, i22=-52, iArr2[]=new int[N];
        short s=-2351;
        byte by2=124;
        float fArr1[]=new float[N];

        FuzzerUtils.init(fArr1, 33.607F);
        FuzzerUtils.init(iArr2, -1);

        vMeth();
        fArr1 = fArr1;
        i14 += i14;
        for (i15 = 7; i15 < 141; ++i15) {
            Test.instanceCount *= i16;
            Test.iFld += i15;
            Test.iArrFld[i15] += (int)Test.instanceCount;
            for (i17 = 2; i17 < 187; ++i17) {
                Test.iArrFld[i17 - 1] += i14;
            }
            Test.iFld += (i15 | Test.instanceCount);
            switch ((i15 % 10) + 1) {
            case 1:
                i16 += (i15 * s);
                Test.iArrFld = Test.iArrFld;
                Test.instanceCount -= i15;
                i14 = (int)Test.instanceCount;
                break;
            case 2:
                for (i19 = i15; i19 < 187; i19++) {
                    switch (((i19 >>> 1) % 4) + 103) {
                    case 103:
                        Test.dFld -= 92.899F;
                        i20 ^= by2;
                        break;
                    case 104:
                        Test.iArrFld[i19] = (int)Test.instanceCount;
                        try {
                            iFld1 = (Test.iArrFld[i15] / i17);
                            i14 = (i14 / Test.iFld);
                            i16 = (2892 / i17);
                        } catch (ArithmeticException a_e) {}
                    case 105:
                        s += (short)(i19 - i14);
                        break;
                    case 106:
                        Test.iFld += (i19 * s);
                        i14 = i16;
                        break;
                    }
                    Test.dArrFld[i15][i19] -= lFld;
                    Test.iArrFld[i19 + 1] += iFld1;
                    Test.iArrFld[i15] -= (int)Test.instanceCount;
                    for (i21 = 1; i21 < 1; ++i21) {
                        Test.iArrFld = Test.iArrFld;
                        i14 += (-24 + (i21 * i21));
                    }
                }
                break;
            case 3:
                i18 = Test.iFld;
                break;
            case 4:
                i14 = i15;
                break;
            case 5:
                i22 = i19;
                break;
            case 6:
                Test.iArrFld = Test.iArrFld;
                break;
            case 7:
                Test.instanceCount *= Test.instanceCount;
                break;
            case 8:
                Test.instanceCount %= (i20 | 1);
                break;
            case 9:
                iArr2[i15 + 1] -= i18;
                break;
            case 10:
                Test.instanceCount |= Test.instanceCount;
                break;
            default:
                Test.instanceCount += (-12 + (i15 * i15));
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
