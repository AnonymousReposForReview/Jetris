package tests.javafuzzer2016;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 07:27:08 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=10L;
    public int iFld=-3;
    public static double dFld=97.38035;
    public static byte byFld=83;
    public float fFld=1.252F;
    public int iFld1=-5;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];
    public double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 3314257613600744999L);
        FuzzerUtils.init(Test.iArrFld, 5);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l1) {

        short s=-13837;
        double d1=-1.4197, d2=-35.97899;
        int i1=-5, i2=8656, i3=-51990, i4=170, i5=31866, i6=-1, iArr[][]=new int[N][N];
        byte by=72;
        long l2=7076137100959835180L;

        FuzzerUtils.init(iArr, 10);

        l1 += s;
        for (d1 = 11; d1 < 398; ++d1) {
            for (i2 = 1; i2 < 4; ++i2) {
                Test.instanceCount = Test.instanceCount;
            }
            i1 ^= i1;
            iArr[(int)(d1)][(int)(d1 + 1)] = -187;
            switch ((int)(((d1 % 1) * 5) + 53)) {
            case 58:
                Test.lArrFld[(int)(d1 + 1)] += i2;
                iArr[(int)(d1 - 1)][(int)(d1)] = i2;
                d2 -= i1;
                by += (byte)d1;
            }
            for (l2 = 1; l2 < 4; ++l2) {
                for (i5 = 1; i5 < 2; i5++) {
                    d2 = i5;
                }
                try {
                    i3 = (i5 / -525129285);
                    iArr[(int)(d1 - 1)][(int)(d1 - 1)] = (i3 / 88);
                    i1 = (-1941013488 % i6);
                } catch (ArithmeticException a_e) {}
            }
        }
        vMeth1_check_sum += l1 + s + Double.doubleToLongBits(d1) + i1 + i2 + i3 + Double.doubleToLongBits(d2) + by + l2
            + i4 + i5 + i6 + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth() {

        int i7=33942, i8=147, i9=-52213, i10=107, i11=-37968, i12=227, i13=171;
        boolean b=false;
        short s1=2947;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -2.285F);

        vMeth1(Test.instanceCount);
        for (i7 = 172; i7 > 9; --i7) {
            switch (((i7 >>> 1) % 1) + 121) {
            case 121:
                i8 = i8;
                for (i9 = 1; 10 > i9; ++i9) {
                    i11 += i10;
                    Test.instanceCount -= (long)Test.dFld;
                    try {
                        Test.iArrFld[i7 + 1] = (i8 / 42980);
                        i8 = (i10 / 28372);
                        i10 = (i9 / i9);
                    } catch (ArithmeticException a_e) {}
                    for (i12 = i7; i12 < 2; ++i12) {
                        b = b;
                        i10 = i8;
                        fArr[i12 - 1] += s1;
                        Test.instanceCount = i9;
                        i8 += i12;
                        i10 = (int)Test.dFld;
                    }
                }
                break;
            default:
                Test.dFld -= Test.instanceCount;
            }
        }
        long meth_res = i7 + i8 + i9 + i10 + i11 + i12 + i13 + (b ? 1 : 0) + s1 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(float f, double d, long l) {

        int i=-7, i14=13077, i15=8481, i16=65500, i17=-1;
        float f1=-1.994F;
        boolean b1=false, bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, true);

        i -= Math.abs((int)(Float.intBitsToFloat(i) - iMeth()));
        for (i14 = 18; i14 < 326; ++i14) {
            short s2=24854;
            i ^= s2;
            Test.iArrFld[i14 + 1] = -1;
            f1 = 1;
            do {
                Test.byFld = (byte)d;
                for (i16 = 1; i16 < 1; i16++) {
                    Test.iArrFld[i14] = i16;
                    try {
                        i = (-185 / i);
                        i17 = (Test.iArrFld[i14 + 1] / i);
                        i = (i14 % -44976);
                    } catch (ArithmeticException a_e) {}
                    f -= -4867;
                    if (b1) break;
                    bArr[i14] = b1;
                    i15 = (int)Test.instanceCount;
                }
                f = l;
                i += (int)(f1 * i);
            } while (++f1 < 5);
        }
        vMeth_check_sum += Float.floatToIntBits(f) + Double.doubleToLongBits(d) + l + i + i14 + i15 +
            Float.floatToIntBits(f1) + i16 + i17 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(bArr);
    }

    public void mainTest(String[] strArr1) {

        int i18=-11, i19=-35028, i21=55832, i22=-53100, i23=-1;
        short s3=-7142;
        boolean b2=true;
        long l3=51484L;

        iFld -= (-Integer.reverseBytes(iFld * iFld));
        vMeth(fFld, Test.dFld, Test.instanceCount);
        Test.instanceCount %= (Test.instanceCount | 1);
        for (i18 = 12; i18 < 316; ++i18) {
            Test.iArrFld[i18 - 1] = i18;
            dArrFld[i18] += iFld;
        }
        s3 = (short)i19;
        i19 <<= -41484;
        iFld += iFld;
        s3 -= (short)40733;
        iFld >>= -6;
        for (int i20 : Test.iArrFld) {
            i19 -= iFld;
            Test.instanceCount = i18;
            iFld -= iFld;
            Test.dFld = -13;
            i21 = 1;
            do {
                for (i22 = i21; i22 < 1; i22++) {
                    Test.iArrFld[i21 - 1] ^= i22;
                    i23 = i19;
                    iFld1 = Test.byFld;
                    switch ((i22 % 2) + 72) {
                    case 72:
                        b2 = b2;
                        l3 -= iFld;
                    case 73:
                        Test.instanceCount -= (long)Test.dFld;
                    }
                    i19 -= s3;
                    i20 ^= 199;
                    i20 = i21;
                    b2 = b2;
                    Test.instanceCount >>= 208;
                }
            } while (++i21 < 63);
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
