package tests.javafuzzer402;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 03:17:15 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=3L;
    public static int iFld=12;
    public float fFld=0.23F;
    public static volatile int iArrFld[][]=new int[N][N];
    public static short sArrFld[]=new short[N];
    public boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -65192);
        FuzzerUtils.init(Test.sArrFld, (short)18761);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i4) {

        int i5=-7, i6=-35333, i7=183, i8=0, i9=24317;
        boolean b=false;
        float f=-36.19F;
        double d=1.379;

        i5 = 1;
        do {
            b = b;
            i6 = 1;
            do {
                f -= i7;
                Test.iArrFld[i5][i6] -= i7;
                if (i4 != 0) {
                }
                i7 <<= -4;
                i4 -= i6;
                for (i8 = 1; 1 > i8; ++i8) {
                    Test.instanceCount &= i7;
                    f += -5346;
                    i7 += i8;
                    Test.sArrFld[i6 - 1] = (short)Test.instanceCount;
                }
                d = Test.instanceCount;
            } while (++i6 < 10);
            i9 -= (int)d;
        } while (++i5 < 166);
        long meth_res = i4 + i5 + (b ? 1 : 0) + i6 + Float.floatToIntBits(f) + i7 + i8 + i9 +
            Double.doubleToLongBits(d);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth(int i1) {

        int i2=10787, i3=2, i10=10, i11=-240, i12=-52597, i13=-35853;
        short s=21351;
        float f1=1.591F, f2=-24.971F, fArr[]=new float[N];
        double d1=-91.29218;

        FuzzerUtils.init(fArr, -1.85F);

        for (i2 = 5; i2 < 231; i2++) {
            Test.instanceCount >>= (s - ((-Test.iArrFld[i2][i2 + 1]) + lMeth(i2)));
            if (i2 != 0) {
            }
            i10 = 1;
            do {
                for (f1 = 1; f1 < 1; ++f1) {
                    d1 = i1;
                    Test.instanceCount -= 211;
                    Test.iArrFld[i10][i2 + 1] >>>= 10;
                }
                i11 /= (int)(i3 | 1);
                for (i12 = 1; i12 > i10; i12 -= 3) {
                    f2 *= i12;
                    i3 -= i10;
                    fArr[i10] -= 28460;
                    i3 = (int)3176509115L;
                }
                s -= (short)Test.instanceCount;
            } while (++i10 < 7);
        }
        long meth_res = i1 + i2 + i3 + s + i10 + Float.floatToIntBits(f1) + i11 + Double.doubleToLongBits(d1) + i12 +
            i13 + Float.floatToIntBits(f2) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth() {

        int i=-7, i14=-49, i15=-1, i16=-1, i17=-5, i18=22978;
        boolean b1=true;
        short s1=-7250;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -22.97943);

        i = 1;
        do {
            switch ((i % 8) + 116) {
            case 116:
                iMeth(i);
            case 117:
                i14 += (i ^ i14);
                i14 += (int)(123L + (i * i));
                for (i15 = 14; i15 > 1; --i15) {
                    b1 = b1;
                    if (b1) {
                        switch ((i15 % 9) + 123) {
                        case 123:
                            for (i17 = 1; 2 > i17; i17++) {
                                i14 += (i17 | i17);
                                s1 = (short)i15;
                                i14 = i14;
                                i14 *= i;
                                bArrFld[i] = b1;
                            }
                            break;
                        case 124:
                            i14 *= 120;
                            break;
                        case 125:
                        case 126:
                            Test.instanceCount = -7540;
                            break;
                        case 127:
                            try {
                                i18 = (Test.iArrFld[i][i] / i17);
                                i16 = (-13 / i16);
                                i16 = (i17 % Test.iArrFld[i + 1][i + 1]);
                            } catch (ArithmeticException a_e) {}
                            break;
                        case 128:
                        case 129:
                            i14 += i17;
                            break;
                        case 130:
                            i18 += (((i15 * s1) + i15) - i17);
                            break;
                        case 131:
                            i14 += (((i15 * i16) + i) - i16);
                        }
                    } else if (b1) {
                        Test.instanceCount -= i15;
                    }
                }
                break;
            case 118:
                try {
                    i16 = (-52288 % i);
                    i18 = (Test.iArrFld[i][i + 1] % 15251);
                    Test.iFld = (Test.iFld / 57810);
                } catch (ArithmeticException a_e) {}
                break;
            case 119:
                dArr[i + 1] *= i17;
            case 120:
                Test.iArrFld[i][i + 1] >>>= i18;
                break;
            case 121:
                dArr[i] = i16;
                break;
            case 122:
                Test.iArrFld[i][i + 1] = 176;
                break;
            case 123:
                i18 += (i | i17);
                break;
            }
        } while ((i += 2) < 218);
        vMeth_check_sum += i + i14 + i15 + i16 + (b1 ? 1 : 0) + i17 + i18 + s1 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i19=-61669, i20=-187, i21=41029, i22=-545, i23=-9, i24=57586, i25=239, i26=-6, i27=171;
        boolean b2=true;
        double d2=2.120805;

        vMeth();
        for (i19 = 21; i19 < 395; ++i19) {
            i20 = i19;
            Test.instanceCount = i20;
            b2 = b2;
        }
        i20 *= (int)Test.instanceCount;
        for (i21 = 1; i21 < 224; ++i21) {
            d2 += i19;
            switch ((((i20 >>> 1) % 2) * 5) + 120) {
            case 130:
                d2 *= i21;
            case 128:
                Test.iFld >>= i20;
                break;
            default:
                for (i23 = 5; i23 < 113; i23++) {
                    i20 += (i23 * i23);
                    i20 = i23;
                    i20 += i19;
                    bArrFld[i21] = b2;
                    Test.iFld <<= (int)Test.instanceCount;
                }
                Test.instanceCount += i22;
                i22 += (-10 + (i21 * i21));
                i24 %= (int)-3780344260L;
            }
            fFld = -220;
            i25 = 113;
            while ((i25 -= 3) > 0) {
                i22 = 33541;
                Test.iArrFld[i25] = Test.iArrFld[i25];
                Test.instanceCount += (((i25 * Test.instanceCount) + Test.instanceCount) - i19);
                for (i26 = 1; i26 < 3; i26++) {
                    bArrFld[i25] = b2;
                    Test.iFld += (i26 ^ i21);
                    Test.iArrFld[i25][i26 - 1] -= i20;
                }
                Test.instanceCount -= i25;
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
//DEBUG  lMeth ->  lMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
