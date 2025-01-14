package tests.javafuzzer651;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 07:25:17 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-254L;
    public static int iArrFld[][]=new int[N][N];
    public short sArrFld[]=new short[N];
    public static double dArrFld[]=new double[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -79);
        FuzzerUtils.init(Test.dArrFld, 116.58712);
        FuzzerUtils.init(Test.lArrFld, -8L);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(float f1, int i8) {

        int i9=9, i10=157, i11=12228, i12=-134, i13=-2;
        byte by=-1;
        boolean b=true;

        i8 &= i8;
        for (i9 = 9; i9 < 148; i9++) {
            try {
                i8 = (Test.iArrFld[i9][i9 - 1] % 909111889);
                i10 = (i8 / -19003);
                i10 = (-42124 / i9);
            } catch (ArithmeticException a_e) {}
            i10 -= i8;
            Test.instanceCount = i9;
            i8 = i9;
            i11 = 1;
            while ((i11 += 3) < 11) {
                for (i12 = 1; i12 < 4; i12++) {
                    i10 += (((i12 * by) + i10) - Test.instanceCount);
                    i13 += i12;
                }
                if (b) {
                    Test.instanceCount += (((i11 * by) + i11) - Test.instanceCount);
                    Test.instanceCount -= 4L;
                    i8 = i8;
                    vMeth_check_sum += Float.floatToIntBits(f1) + i8 + i9 + i10 + i11 + i12 + i13 + by + (b ? 1 : 0);
                    return;
                }
            }
            i10 = 196;
        }
        vMeth_check_sum += Float.floatToIntBits(f1) + i8 + i9 + i10 + i11 + i12 + i13 + by + (b ? 1 : 0);
    }

    public static int iMeth1(int i4) {

        int i5=30781, i6=10, i7=120, i14=2710, i15=198, i16=7, i17=230, iArr[][]=new int[N][N];
        float f=127.784F;
        double dArr[][]=new double[N][N];

        FuzzerUtils.init(iArr, 54);
        FuzzerUtils.init(dArr, 0.36200);

        i5 = 1;
        do {
            try {
                i4 = (i5 / i5);
                i4 = (i5 / -44295);
                i4 = (i4 % -104);
            } catch (ArithmeticException a_e) {}
            f += iArr[i5 + 1][i5 + 1];
            i4 = (int)(((Test.instanceCount - f) + (Test.instanceCount--)) + (iArr[i5][i5]--));
        } while (++i5 < 230);
        i4 += (int)(((Test.instanceCount++) * (i4 + i4)) - (Test.instanceCount - i5));
        i4 >>= i4;
        for (i6 = 16; 259 > i6; i6++) {
            vMeth(f, i5);
        }
        i14 = 1;
        while (++i14 < 247) {
            i15 = 1;
            while (++i15 < 7) {
                for (i16 = i15; 1 > i16; i16++) {
                    Test.instanceCount += -1;
                    f = 229;
                    i17 >>= (int)Test.instanceCount;
                    dArr[i16][i15 + 1] = i15;
                }
            }
        }
        long meth_res = i4 + i5 + Float.floatToIntBits(f) + i6 + i7 + i14 + i15 + i16 + i17 +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        int i1=-158, i2=56099, i3=10, i18=57, i19=-62560;
        short s=-24252;
        boolean b1=false;
        double d=1.46708;
        float f2=-1.69F;

        i1 = 1;
        while (++i1 < 376) {
            for (i2 = 1; 4 > i2; i2++) {
                s += (short)(((--i3) + i3) - ((i1 - i1) * (1.671F - iMeth1(i2))));
                s = (short)Test.instanceCount;
                Test.instanceCount *= Test.instanceCount;
                for (i18 = 1; 2 > i18; i18 += 2) {
                    b1 = b1;
                    d += -5936;
                    f2 *= i2;
                    d -= 7044303626888143212L;
                    i3 += i1;
                    Test.instanceCount += 38343;
                    d = i3;
                }
                Test.iArrFld[i1][(i18 >>> 1) % N] = (int)Test.instanceCount;
                i19 -= (int)Test.instanceCount;
            }
        }
        long meth_res = i1 + i2 + i3 + s + i18 + i19 + (b1 ? 1 : 0) + Double.doubleToLongBits(d) +
            Float.floatToIntBits(f2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=6165, i20=-363, i21=-125, i22=-170, i23=2, i24=-2;
        long l=59180L, l1=1412261631352978848L;
        short s1=-23686;
        float f3=-96.858F, fArr[]=new float[N];

        FuzzerUtils.init(fArr, -127.758F);

        i = iMeth();
        i += i;
        for (l = 11; 277 > l; l += 3) {
            double d1=56.42343;
            d1 *= 1223198183L;
            for (i21 = 11; i21 < 285; i21 += 3) {
                i += (i21 * i21);
                for (l1 = 1; l1 < 4; l1 += 2) {
                    Test.instanceCount -= l1;
                    i22 >>= i22;
                    i22 += (int)(l1 * l1);
                    switch ((((i23 >>> 1) % 1) * 5) + 24) {
                    case 28:
                        switch ((int)((l1 % 2) + 123)) {
                        case 123:
                            Test.instanceCount = i;
                        case 124:
                            i20 *= (int)3161101328990515695L;
                            Test.instanceCount <<= i;
                        default:
                            sArrFld[(int)(l)] = (short)i21;
                            i22 += (int)3434728120L;
                            i24 += (int)(((l1 * s1) + i23) - f3);
                            i24 += (int)l1;
                        }
                        s1 &= (short)i21;
                    default:
                        i24 = (int)l;
                        Test.dArrFld[(int)(l + 1)] += -58535;
                    }
                    i24 <<= i21;
                    s1 >>= (short)l;
                    Test.iArrFld[(int)(l1)] = Test.iArrFld[(int)(l + 1)];
                    Test.lArrFld[(int)(l1)] *= i22;
                    i24 ^= i23;
                    fArr[(int)(l1)] = (float)d1;
                }
                i23 += i21;
                Test.instanceCount *= l;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
