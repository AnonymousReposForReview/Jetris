package tests.javafuzzer1973;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 06:54:25 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=26060L;
    public static double dFld=0.43254;
    public static float fFld=-98.203F;
    public static short sFld=-12380;
    public static boolean bFld=true;
    public static int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 62);
        FuzzerUtils.init(Test.dArrFld, 0.21475);
        FuzzerUtils.init(Test.lArrFld, -58454L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i10=219, i11=-74, i12=-14, i13=89, i14=-223;
        short s=26063;

        for (i10 = 8; i10 < 219; i10++) {
            byte by=0;
            i11 *= s;
            i11 = i10;
            i11 = i11;
            by -= (byte)246;
            switch (((i12 >>> 1) % 3) + 26) {
            case 26:
                i11 = (int)Test.fFld;
                Test.instanceCount += i11;
                break;
            case 27:
                i12 += (int)Test.fFld;
                for (i13 = 1; i13 < 8; i13++) {
                    Test.iArrFld[i13] = i13;
                    i12 <<= (int)Test.instanceCount;
                    i14 += (int)(-2351463524L + (i13 * i13));
                    Test.instanceCount -= Test.instanceCount;
                    i14 *= (int)Test.fFld;
                }
                break;
            case 28:
                Test.iArrFld[i10] -= (int)78.450F;
                break;
            default:
                i14 = i12;
            }
        }
        vMeth2_check_sum += i10 + i11 + s + i12 + i13 + i14;
    }

    public static void vMeth1(int i5) {

        int i6=-8, i7=-69, i8=-3, i9=-12, i15=-32, i16=3, iArr1[]=new int[N];
        float f1=-1.62F;

        FuzzerUtils.init(iArr1, 5);

        for (i6 = 9; 189 > i6; ++i6) {
            i7 = (int)((i7 = (int)(iArr1[i6] += (int)Test.instanceCount)) - (i5++));
            for (i8 = 1; i8 < 9; i8++) {
                i7 += (int)(f1 / ((-(Test.instanceCount++)) | 1));
                i7 -= (int)((Integer.reverseBytes(i7) - (Test.dFld - i9)) * (-(i6 + Test.instanceCount)));
                vMeth2();
                i9 = i8;
                f1 += i8;
                for (i15 = 2; i15 > 1; i15 -= 3) {
                    f1 += (((i15 * i8) + i7) - i16);
                    i5 += i16;
                    f1 /= ((long)(Test.dFld) | 1);
                    Test.instanceCount *= i9;
                    Test.iArrFld[i15 - 1] -= i8;
                }
            }
            Test.instanceCount <<= 34167L;
        }
        vMeth1_check_sum += i5 + i6 + i7 + i8 + i9 + Float.floatToIntBits(f1) + i15 + i16 + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i2, int i3, int i4) {

        float f=0.53F;
        boolean b=false;
        double d=-2.88633;
        int i17=-3, i18=-11;
        byte by1=66;
        short s1=-9796;

        Test.instanceCount += (i3--);
        f = (i4 * ((-3909399743L + f) + (i4 - Test.instanceCount)));
        b = (b = ((1 - (i2 + d)) > (i3 | i3)));
        if (b) {
            vMeth1(i3);
        } else {
            i17 = 392;
            while (--i17 > 0) {
                Test.iArrFld[i17] = by1;
                Test.instanceCount = (long)Test.fFld;
                s1 += by1;
                Test.instanceCount += s1;
                Test.dArrFld[i17 - 1] += 213;
                if (b) continue;
                i18 = 4;
                do {
                    Test.lArrFld[i17] = 1014299215L;
                    i3 = i17;
                } while ((i18 -= 2) > 0);
            }
        }
        vMeth_check_sum += i2 + i3 + i4 + Float.floatToIntBits(f) + (b ? 1 : 0) + Double.doubleToLongBits(d) + i17 +
            by1 + s1 + i18;
    }

    public void mainTest(String[] strArr1) {

        int i=-64019, i1=-13, i19=-21141, i20=107, iArr[]=new int[N];
        long l=-138809801754206856L;
        double d1=-23.66475, dArr[]=new double[N];
        byte by2=-110;
        float fArr[][]=new float[N][N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(dArr, -100.118691);
        FuzzerUtils.init(iArr, -14265);
        FuzzerUtils.init(fArr, 0.319F);
        FuzzerUtils.init(bArr, true);

        dArr[(i >>> 1) % N] = (i++);
        i /= -189;
        for (l = 10; 288 > l; ++l) {
            try {
                iArr[(int)(l - 1)] = (iArr[(int)(l)] / -1311710470);
                i = (39754 / i1);
                i1 = (-235 % i);
            } catch (ArithmeticException a_e) {}
        }
        Test.instanceCount = (long)fArr[(i >>> 1) % N][(i1 >>> 1) % N];
        vMeth(-220, i1, i1);
        i += Test.sFld;
        i19 = 1;
        do {
            switch (((i19 % 6) * 5) + 17) {
            case 28:
                i += (int)Test.instanceCount;
                break;
            case 26:
                i1 = i1;
                i1 *= (int)l;
                break;
            case 30:
            case 23:
                try {
                    i1 = (i19 % i19);
                    iArr[i19] = (27112 % Test.iArrFld[i19 + 1]);
                    i = (i % i19);
                } catch (ArithmeticException a_e) {}
                i1 += (int)Test.instanceCount;
                break;
            case 42:
                Test.dFld += i;
                for (d1 = 1; d1 < 70; ++d1) {
                    Test.bFld = Test.bFld;
                    i20 <<= (int)Test.instanceCount;
                    if (Test.bFld) {
                        bArr[(int)(d1)] = Test.bFld;
                        Test.fFld = by2;
                        i1 += (int)(d1 * d1);
                        if (Test.bFld) continue;
                    } else {
                        i20 += (int)l;
                        try {
                            i1 = (i20 / -29022);
                            i = (i19 / i1);
                            i = (44037 / Test.iArrFld[(int)(d1 - 1)]);
                        } catch (ArithmeticException a_e) {}
                        fArr[(int)(d1 + 1)][(int)(d1 - 1)] = i20;
                        if (false) {
                            Test.dFld = Test.instanceCount;
                            Test.instanceCount = l;
                        } else {
                            Test.instanceCount *= Test.sFld;
                        }
                    }
                }
            case 47:
                i20 += (i19 ^ i19);
                break;
            }
        } while (++i19 < 358);

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