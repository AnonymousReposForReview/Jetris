package tests.javafuzzer2815;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 20:50:50 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-14L;
    public static short sFld=31287;
    public static int iFld=-59748;
    public static volatile boolean bFld=false;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -57652);
        FuzzerUtils.init(Test.lArrFld, 3509159479L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(double d, int i3) {

        int i4=14, i5=14;
        byte byArr[]=new byte[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(byArr, (byte)73);
        FuzzerUtils.init(dArr, 83.11798);

        Test.iArrFld[(-92 >>> 1) % N] *= i3;
        Test.lArrFld = FuzzerUtils.long1array(N, (long)3860425338L);
        Test.instanceCount <<= i3;
        Test.instanceCount >>= -6880;
        for (byte by : byArr) {
            dArr[(i3 >>> 1) % N] = i3;
            for (i4 = 1; 4 > i4; ++i4) {
                i5 += (i4 * i4);
                i5 += (i4 * i4);
                i5 -= (int)1601853332714777549L;
                i3 -= 232;
                Test.instanceCount -= -231;
                i5 -= (int)Test.instanceCount;
                Test.instanceCount = i5;
                by = (byte)i4;
            }
        }
        vMeth2_check_sum += Double.doubleToLongBits(d) + i3 + i4 + i5 + FuzzerUtils.checkSum(byArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth1() {

        double d1=53.75095;
        int i6=20201, i7=65272, i8=32480;
        byte by1=-89;
        float f1=1.377F;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-27055);

        vMeth2(d1, i6);
        i7 = 1;
        do {
            i8 = 9;
            while ((i8 -= 2) > 0) {
                d1 -= by1;
                i6 = i6;
                switch ((i8 % 4) + 47) {
                case 47:
                    Test.instanceCount *= (long)f1;
                    Test.lArrFld[i8 + 1] <<= i6;
                    by1 -= (byte)i8;
                    switch ((i7 % 2) + 21) {
                    case 21:
                        switch (((i7 >>> 1) % 7) + 6) {
                        case 6:
                            Test.iArrFld[i7 + 1] = (int)-124L;
                            try {
                                Test.iArrFld[i8] = (i7 / -97);
                                i6 = (i6 / -48711);
                                Test.iArrFld[i7 + 1] = (i7 % i7);
                            } catch (ArithmeticException a_e) {}
                        case 7:
                            sArr[i8] += (short)Test.instanceCount;
                            Test.iArrFld[i7] |= i8;
                            break;
                        case 8:
                            Test.instanceCount -= i8;
                            break;
                        case 9:
                            Test.iFld *= (int)Test.instanceCount;
                            break;
                        case 10:
                            Test.iFld <<= i8;
                        case 11:
                            Test.iFld = (int)Test.instanceCount;
                            break;
                        case 12:
                            i6 >>>= (int)Test.instanceCount;
                            break;
                        default:
                            Test.iFld += (int)Test.instanceCount;
                        }
                        break;
                    case 22:
                        Test.iArrFld[i7 - 1] = i8;
                        break;
                    }
                    break;
                case 48:
                    Test.lArrFld[i7 + 1] >>>= i6;
                case 49:
                    Test.instanceCount += (long)(-49.520F + (i8 * i8));
                    break;
                case 50:
                    Test.iFld = i8;
                    break;
                }
            }
        } while (++i7 < 167);
        vMeth1_check_sum += Double.doubleToLongBits(d1) + i6 + i7 + i8 + by1 + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(sArr);
    }

    public static void vMeth(int i) {

        int i1=-29356, i9=57311, i10=-109, i11=-26036, i12=104, i13=-48, i14=70;
        float f=1.64F, fArr[]=new float[N];

        FuzzerUtils.init(fArr, 36.234F);

        i += 70;
        i1 = 1;
        while (++i1 < 308) {
            i += (((i1 * f) + Test.instanceCount) - i);
            Test.iArrFld[i1] -= Short.reverseBytes((short)((14 * (i + Test.sFld)) - i1));
        }
        vMeth1();
        for (i9 = 140; 2 < i9; --i9) {
            try {
                i10 = (i % Test.iFld);
                i10 = (Test.iFld % i);
                i = (-60501 / i9);
            } catch (ArithmeticException a_e) {}
            for (i11 = 1; i11 < 11; ++i11) {
                if (Test.bFld) {
                    for (i13 = 1; i13 < 2; i13 += 3) {
                        Test.instanceCount += (i13 ^ Test.instanceCount);
                        fArr[i11] -= -4;
                        i12 = (int)Test.instanceCount;
                        i = (int)f;
                        i10 -= i14;
                    }
                }
            }
        }
        vMeth_check_sum += i + i1 + Float.floatToIntBits(f) + i9 + i10 + i11 + i12 + i13 + i14 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i15=-167, i16=29077;

        vMeth(Test.iFld);
        for (i15 = 1; i15 < 220; i15++) {
            Test.instanceCount >>= i16;
            Test.instanceCount >>= 79;
            Test.iArrFld[i15] = (int)Test.instanceCount;
        }
        Test.bFld = Test.bFld;
        Test.iFld = i15;
        i16 += i16;
        Test.iArrFld[(-9294 >>> 1) % N] += i15;


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
