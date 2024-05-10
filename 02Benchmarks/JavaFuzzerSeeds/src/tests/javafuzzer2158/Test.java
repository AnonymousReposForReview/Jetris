package tests.javafuzzer2158;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 09:42:36 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-5505203607076376811L;
    public static volatile float fFld=1.155F;
    public static boolean bFld=true;
    public short sFld=15711;
    public long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -159);
        FuzzerUtils.init(Test.fArrFld, -114.515F);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i6=27936, i7=-187, i8=143, i9=44899, iArr1[][]=new int[N][N];
        float fArr[]=new float[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(fArr, 67.96F);
        FuzzerUtils.init(lArr1, -1298250151502034689L);
        FuzzerUtils.init(iArr1, 39372);

        for (i6 = 141; 5 < i6; --i6) {
            i7 += (i6 * i6);
            i8 = 1;
            do {
                fArr[i8 - 1] += i7;
                i9 = 1;
                do {
                    i7 = i8;
                    i7 >>>= i9;
                    i7 += (((i9 * i7) + Test.fFld) - i8);
                    Test.instanceCount -= Test.instanceCount;
                    i7 >>= (int)Test.instanceCount;
                    i7 += (i9 * i9);
                } while (++i9 < 1);
                lArr1 = lArr1;
                Test.fFld += Test.instanceCount;
                Test.fFld -= i6;
                iArr1[i8][i8 - 1] -= (int)1.968F;
            } while (++i8 < 12);
        }
        vMeth1_check_sum += i6 + i7 + i8 + i9 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth() {

        int i10=-2, i11=-14, i12=231, i13=1;
        long l1=-507503550920667743L;
        byte by=-78;
        double dArr1[]=new double[N];
        float fArr1[]=new float[N];

        FuzzerUtils.init(dArr1, -2.22105);
        FuzzerUtils.init(fArr1, 59.20F);

        vMeth1();
        for (i10 = 203; i10 > 12; i10--) {
            for (l1 = 1; l1 < 8; l1++) {
                Test.fFld = i11;
                by = (byte)137;
            }
            dArr1[i10 - 1] = i11;
            i13 = 1;
            do {
                i11 = i13;
                Test.instanceCount = i12;
                i12 >>= (int)l1;
                fArr1 = fArr1;
                i12 += (i13 - i11);
                if (Test.bFld) continue;
            } while (++i13 < 8);
        }
        fArr1[(i13 >>> 1) % N] = i10;
        i11 *= (int)Test.instanceCount;
        vMeth_check_sum += i10 + i11 + l1 + i12 + by + i13 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public static long lMeth(int i3, int i4, int i5) {

        double d=0.84803, dArr[]=new double[N];
        short s=15268;
        int i14=-6, i15=71, i16=-7, i17=-12, iArr[]=new int[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -6L);
        FuzzerUtils.init(iArr, 126);
        FuzzerUtils.init(dArr, -5.96749);

        d *= (--i3);
        for (long l : lArr) {
            iArr[(i4 >>> 1) % N] = (i5 * (i5 = Math.max(i5, i5)));
            s = (short)(++i3);
            if (i5 != 0) {
            }
            i5 = (int)(((i5 - Test.instanceCount) - (++i4)) - ((-l) << i4));
            i3 %= (int)(((long)(dArr[(i4 >>> 1) % N] += (l--))) | 1);
            vMeth();
        }
        for (i14 = 9; i14 < 276; ++i14) {
            i15 = (int)Test.instanceCount;
            switch (((i14 >>> 1) % 1) + 83) {
            case 83:
                for (i16 = 6; i16 > 1; i16--) {
                    i15 = (int)Test.instanceCount;
                    i5 += (((i16 * i14) + Test.instanceCount) - i16);
                    d -= -57.583F;
                }
            }
        }
        long meth_res = i3 + i4 + i5 + Double.doubleToLongBits(d) + s + i14 + i15 + i16 + i17 +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-7, i1=4, i2=4, i18=-59457, i19=64885, i20=33834, i21=23474;
        byte by1=64;

        i = (int)(Test.instanceCount++);
        for (i1 = 18; i1 < 305; ++i1) {
            switch (((i1 % 7) * 5) + 108) {
            case 140:
                i2 += (i1 * i1);
                break;
            case 137:
                switch ((((Integer.reverseBytes(-24) >>> 1) % 3) * 5) + 71) {
                case 75:
                    Test.instanceCount -= lMeth(i1, i1, i1);
                    for (i18 = i1; i18 < 88; ++i18) {
                        for (i20 = 1; i20 > 1; i20 -= 2) {
                            lArrFld[i20] += i19;
                            lArrFld[i18] <<= sFld;
                            i19 = i20;
                            i2 += (((i20 * i) + i21) - Test.instanceCount);
                            lArrFld[(i20 >>> 1) % N] /= (Test.instanceCount | 1);
                            switch ((((i20 >>> 1) % 2) * 5) + 50) {
                            case 59:
                                try {
                                    i19 = (i19 % i2);
                                    i2 = (i / 49);
                                    i = (i18 % i);
                                } catch (ArithmeticException a_e) {}
                                i21 = i2;
                                i19 >>>= i20;
                                break;
                            case 57:
                                try {
                                    i = (i / 22382);
                                    i2 = (Test.iArrFld[i18 - 1] % i);
                                    i2 = (655960053 / i21);
                                } catch (ArithmeticException a_e) {}
                                break;
                            default:
                                if (Test.bFld) {
                                    i2 += i20;
                                    try {
                                        i = (i21 / i18);
                                        i19 = (i20 / i);
                                        i21 = (Test.iArrFld[(i >>> 1) % N] / i1);
                                    } catch (ArithmeticException a_e) {}
                                    Test.fArrFld[i1 - 1] -= -4;
                                    i += i20;
                                } else if (Test.bFld) {
                                    switch ((i1 % 1) + 72) {
                                    case 72:
                                        i2 = sFld;
                                        Test.fFld -= sFld;
                                        Test.instanceCount += i20;
                                        i21 /= (int)(i1 | 1);
                                        break;
                                    default:
                                        if (Test.bFld) continue;
                                        Test.iArrFld[i20 + 1] = i1;
                                    }
                                } else if (false) {
                                    i2 -= i19;
                                }
                            }
                        }
                    }
                    break;
                case 77:
                    sFld += (short)i1;
                    break;
                case 82:
                    Test.fArrFld[i1 + 1] = Test.fFld;
                    break;
                }
                break;
            case 110:
                i21 += (((i1 * i21) + by1) - i1);
                break;
            case 127:
                i21 <<= (int)Test.instanceCount;
                break;
            case 123:
                Test.instanceCount = i20;
                break;
            case 113:
                i2 += (int)Test.instanceCount;
                break;
            case 121:
                by1 -= (byte)i2;
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
