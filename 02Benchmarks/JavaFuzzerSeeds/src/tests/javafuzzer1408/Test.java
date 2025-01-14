package tests.javafuzzer1408;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 19:53:58 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=5L;
    public static int iFld=-33649;
    public static float fFld=0.513F;
    public static boolean bFld=true;
    public static long lArrFld[]=new long[N];
    public static double dArrFld[][]=new double[N][N];
    public float fArrFld[]=new float[N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 940429880L);
        FuzzerUtils.init(Test.dArrFld, -60.116415);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        double d1=-115.11708;
        int i3=105, i4=-126, i5=169, i6=28, i7=9, i8=32858, i9=160, iArr1[]=new int[N];
        byte by=-98;
        float f=9.595F;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr1, 12);
        FuzzerUtils.init(lArr, -6310466229388558487L);

        d1 += 6;
        Test.iFld <<= 5;
        iArr1[(Test.iFld >>> 1) % N] >>= Test.iFld;
        for (i3 = 8; i3 < 161; i3++) {
            Test.fFld += (((i3 * by) + i5) - i5);
        }
        for (i6 = 7; i6 < 337; i6++) {
            i4 *= i7;
            Test.fFld += i6;
            for (i8 = 1; 5 > i8; i8++) {
                i5 += i7;
                Test.fFld *= i9;
                Test.fFld += i8;
                Test.iFld += (4 + (i8 * i8));
            }
            if (i6 != 0) {
                vMeth1_check_sum += Double.doubleToLongBits(d1) + i3 + i4 + by + i5 + i6 + i7 + i8 + i9 +
                    Float.floatToIntBits(f) + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
                return;
            }
            lArr[i6] += (long)f;
        }
        vMeth1_check_sum += Double.doubleToLongBits(d1) + i3 + i4 + by + i5 + i6 + i7 + i8 + i9 +
            Float.floatToIntBits(f) + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth(boolean b) {

        int i10=-130, i11=-22991, i12=-8;
        short s=30488;
        byte by1=-49;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 8.10529);

        vMeth1();
        i10 = 1;
        while (++i10 < 149) {
            dArr[i10] = i10;
            if (true) {
                for (i11 = 1; 11 > i11; ++i11) {
                    switch (((i11 % 1) * 5) + 79) {
                    case 84:
                        Test.iFld = i12;
                        s += (short)(i11 * i10);
                        if (true) break;
                        by1 = (byte)Test.fFld;
                        break;
                    }
                    Test.iFld &= i10;
                    Test.iFld = (int)-74.35472;
                    Test.iFld = i11;
                    i12 += (int)Test.instanceCount;
                    Test.instanceCount *= Test.iFld;
                }
            } else {
                Test.iFld = i12;
            }
        }
        long meth_res = (b ? 1 : 0) + i10 + i11 + i12 + s + by1 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth(double d, int i2) {

        int i13=-70, iArr[]=new int[N];

        FuzzerUtils.init(iArr, 69);

        iArr[(i2 >>> 1) % N] += (iMeth(Test.bFld) * Test.iFld);
        i13 = 1;
        while (++i13 < 159) {
            short s1=30405;
            i2 += (((i13 * Test.iFld) + Test.fFld) - Test.iFld);
            s1 += (short)252;
            Test.lArrFld[i13 + 1] = i2;
            Test.instanceCount += Test.iFld;
            i2 = 43328;
            Test.dArrFld[i13][i13 + 1] += Test.instanceCount;
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i2 + i13 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-2, i1=231, i14=-4, i15=-53469, i16=49866, i17=7, i18=-57748;
        double d2=-46.44314;
        short s2=26575;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -41636L);

        for (i = 122; i > 4; i--) {
            i1 = i;
            vMeth(d2, i);
            Test.iFld += (((i * i1) + i) - i1);
            d2 %= (Test.instanceCount | 1);
            i14 = 1;
            while (++i14 < 212) {
                i1 <<= i1;
            }
            switch ((((i >>> 1) % 1) * 5) + 55) {
            case 60:
                i1 = i1;
                Test.iFld <<= i;
                break;
            default:
                switch (((i % 9) * 5) + 43) {
                case 45:
                    Test.instanceCount = i;
                    Test.iFld = i14;
                    i1 = (int)Test.instanceCount;
                    for (i15 = 7; i15 < 212; i15++) {
                        Test.iFld <<= i16;
                        if (Test.bFld) continue;
                        Test.instanceCount <<= s2;
                        for (i17 = 1; i17 < 2; i17++) {
                            fArrFld[i + 1] = i18;
                            if (Test.bFld) {
                                Test.instanceCount -= i16;
                            } else if (false) {
                                switch ((((-184 >>> 1) % 10) * 5) + 120) {
                                case 142:
                                    i16 = (int)-3424498019L;
                                    i18 = i16;
                                    break;
                                case 128:
                                    Test.instanceCount *= i;
                                    i18 = i18;
                                    i1 += i17;
                                    i18 += -5928;
                                    break;
                                case 163:
                                    Test.iFld = 3;
                                case 125:
                                case 155:
                                    Test.iFld = (int)Test.instanceCount;
                                    break;
                                case 139:
                                    i16 -= (int)Test.instanceCount;
                                    break;
                                case 152:
                                    i18 += (i17 * i17);
                                    break;
                                case 135:
                                    lArr1[i17] = Test.instanceCount;
                                    break;
                                case 166:
                                    iArrFld[i] -= (int)Test.instanceCount;
                                    break;
                                case 153:
                                    iArrFld = iArrFld;
                                    break;
                                }
                            } else if (Test.bFld) {
                                Test.iFld >>= (int)-10L;
                            } else {
                                i16 |= (int)Test.instanceCount;
                            }
                        }
                    }
                case 47:
                    i18 += (int)(-84L + (i * i));
                case 53:
                    i1 *= (int)d2;
                case 72:
                    Test.instanceCount -= -11621;
                case 73:
                    Test.iFld >>= i;
                    break;
                case 48:
                    lArr1[i + 1] = Test.instanceCount;
                    break;
                case 83:
                    i18 += (i * i14);
                    break;
                case 75:
                    Test.fFld += i;
                    break;
                case 51:
                    if (Test.bFld) continue;
                    break;
                default:
                    Test.iFld = (int)d2;
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
