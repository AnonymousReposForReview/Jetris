package tests.javafuzzer1453;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 20:57:13 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-2517373118563447568L;
    public static boolean bFld=false;
    public static volatile int iFld=-59887;
    public static short sFld=-17772;
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 105.34633);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(float f2, boolean b) {

        int i7=-12, i8=151, i9=-3, iArr1[][]=new int[N][N];
        long l1=1189595298L;
        byte by=-21;
        double d1=-2.39045, d2=62.745;

        FuzzerUtils.init(iArr1, -20046);

        i7 = 5;
        i7 -= i7;
        for (l1 = 7; 251 > l1; l1++) {
            if (b) {
                i7 = by;
                i7 += (-10 + (l1 * l1));
            } else if (b) {
                try {
                    i8 = (454503773 / iArr1[(int)(l1 + 1)][(int)(l1)]);
                    i8 = (i8 / i8);
                    iArr1[(int)(l1 - 1)][(int)(l1)] = (411044308 / i7);
                } catch (ArithmeticException a_e) {}
            }
            i8 += (int)l1;
            iArr1[(int)(l1 + 1)][(int)(l1)] = (int)d1;
            for (d2 = 1; d2 < 7; d2++) {
                if (b) continue;
                i7 *= (int)d2;
                if (b) break;
            }
            d1 *= Test.instanceCount;
            i8 += i8;
        }
        long meth_res = Float.floatToIntBits(f2) + (b ? 1 : 0) + i7 + l1 + i8 + by + Double.doubleToLongBits(d1) +
            Double.doubleToLongBits(d2) + i9 + FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(float f1, int i2) {

        int i3=35862, i4=85, i5=-11, i6=-147;
        long l=-7L;
        short s=-31487;
        double d=2.102192;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 108.670F);

        for (i3 = 8; i3 < 161; i3++) {
            for (l = 1; l < 10; l++) {
                i2 += (int)(((i3 >> l) + (++i5)) << (i2 - (s - i2)));
                i2 += (int)l;
                i6 = 1;
                while ((i6 += 3) < 2) {
                    switch ((int)(((l % 7) * 5) + 61)) {
                    case 75:
                        fArr[(int)(l - 1)] += -95;
                        break;
                    case 87:
                        i4 = (int)(((d / -57) - iMeth1(f1, Test.bFld)) + Test.instanceCount);
                        d += 10;
                        Test.instanceCount -= i3;
                        f1 *= l;
                    case 66:
                        i2 *= i3;
                        i4 &= -68;
                        f1 += i2;
                        break;
                    case 89:
                        i5 += i6;
                        break;
                    case 71:
                        i5 += (((i6 * i4) + Test.instanceCount) - i4);
                    case 73:
                        i2 -= i5;
                        break;
                    case 70:
                        i5 /= (int)(i2 | 1);
                    }
                }
            }
        }
        long meth_res = Float.floatToIntBits(f1) + i2 + i3 + i4 + l + i5 + s + i6 + Double.doubleToLongBits(d) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i=-58928, i1=-59, i10=-49241, i11=-237, iArr[][]=new int[N][N];
        float f=-82.893F;
        byte by1=94;

        FuzzerUtils.init(iArr, -223);

        for (i = 17; i < 333; ++i) {
            iArr[i + 1][i + 1] -= (i1--);
            f = 5;
            do {
                i1 += i;
                i1 = iMeth(f, -35740);
                i1 = (int)f;
                for (i10 = 1; 1 > i10; ++i10) {
                    i1 &= 99;
                }
                switch (((i10 >>> 1) % 1) + 80) {
                case 80:
                    Test.bFld = Test.bFld;
                    by1 <<= (byte)i11;
                    break;
                }
                Test.instanceCount -= Test.instanceCount;
                try {
                    i11 = (2116627171 / Test.iFld);
                    i1 = (i1 / i11);
                    i11 = (i1 % Test.iFld);
                } catch (ArithmeticException a_e) {}
                Test.instanceCount += (42 + (f * f));
                i11 = -19959;
            } while (--f > 0);
        }
        vMeth_check_sum += i + i1 + Float.floatToIntBits(f) + i10 + i11 + by1 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i12=-57437, i13=-63654, i14=-12, i15=55107, i16=-11694, i17=175, i18=-11, i19=-55603, i20=231, i21=-1,
            iArr2[]=new int[N];
        double d3=-1.49748;
        float f3=30.814F;
        long l2=3172806134478545898L, lArr[]=new long[N];
        byte by2=-15;
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr2, -8);
        FuzzerUtils.init(sArr, (short)-18724);
        FuzzerUtils.init(lArr, 2055348535680191999L);

        vMeth();
        for (i12 = 15; 307 > i12; i12++) {
            for (i14 = 1; i14 < 86; i14++) {
                for (i16 = 1; i16 < 2; ++i16) {
                    i17 = i12;
                    i15 >>>= i16;
                    iArr2[i12 + 1] = (int)d3;
                }
                iArr2[i14 + 1] = 15773;
                Test.instanceCount += -6L;
                Test.sFld -= (short)i17;
            }
            i13 = (int)Test.instanceCount;
            i18 = 1;
            do {
                i17 *= i18;
            } while (++i18 < 86);
            f3 += (i12 + i12);
        }
        for (i19 = 14; i19 < 232; ++i19) {
            Test.instanceCount += (i19 + Test.instanceCount);
            sArr[i19 + 1] += (short)i16;
            Test.bFld = Test.bFld;
            iArr2[i19 + 1] = (int)Test.instanceCount;
            switch ((((i14 >>> 1) % 9) * 5) + 53) {
            case 87:
                for (l2 = 2; l2 < 115; ++l2) {
                    iArr2[i19] = (int)Test.instanceCount;
                    Test.instanceCount = i13;
                    if (Test.bFld) {
                        i17 -= i18;
                        if (Test.bFld) continue;
                        f3 += (((l2 * l2) + i16) - i13);
                    }
                    Test.iFld -= Test.sFld;
                    f3 = i21;
                    i13 += (int)(l2 * l2);
                }
                break;
            case 93:
                iArr2[i19 + 1] *= i20;
                break;
            case 86:
                i13 += i19;
                break;
            case 56:
                Test.dArrFld = Test.dArrFld;
                break;
            case 94:
                Test.instanceCount *= Test.iFld;
                break;
            case 61:
                iArr2[i19 - 1] = i13;
                break;
            case 82:
                i20 *= i18;
                break;
            case 75:
                i13 = Test.iFld;
                break;
            case 72:
                by2 *= (byte)i15;
                break;
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
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
