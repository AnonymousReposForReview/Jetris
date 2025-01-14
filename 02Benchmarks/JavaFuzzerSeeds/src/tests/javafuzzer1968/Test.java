package tests.javafuzzer1968;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 06:49:17 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=12718L;
    public static float fFld=-13.559F;
    public static boolean bFld=true;
    public static boolean bFld1=false;
    public static double dFld=-94.113331;
    public static short sFld=29344;
    public static byte byFld=-18;
    public static int iArrFld[][]=new int[N][N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -170);
        FuzzerUtils.init(Test.dArrFld, -36.124287);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i7, int i8, int i9) {

        int i10=251, i11=0, i12=139, i13=45;
        boolean b=false;
        float f1=72.690F;

        Test.instanceCount = i9;
        Test.fFld -= Test.fFld;
        i7 = i8;
        for (i10 = 5; i10 < 214; ++i10) {
            Test.instanceCount ^= i8;
            if (b) break;
            i12 = 1;
            do {
                Test.instanceCount -= i12;
                for (f1 = i12; 1 > f1; ++f1) {
                    b = b;
                    i13 -= i9;
                    i8 = (int)2.790F;
                    if (Test.bFld) break;
                    Test.instanceCount = 6782;
                    i11 += (int)Test.instanceCount;
                }
            } while (++i12 < 8);
        }
        long meth_res = i7 + i8 + i9 + i10 + i11 + (b ? 1 : 0) + i12 + Float.floatToIntBits(f1) + i13;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        int i6=-36867, i14=-4, i15=14, i16=-7, i17=8, i18=5;
        double d=1.19230;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 2021740083L);

        i6 = 1;
        while (++i6 < 335) {
            d += iMeth1(i6, i6, i6);
            Test.iArrFld[i6][i6 - 1] -= i6;
        }
        Test.instanceCount -= 19;
        i14 *= (int)Test.fFld;
        Test.instanceCount = -5L;
        for (i15 = 8; i15 < 148; i15++) {
            switch (((i14 >>> 1) % 2) + 60) {
            case 60:
                for (i17 = i15; i17 < 11; ++i17) {
                    i14 += (i17 - i18);
                    lArr1[i17 - 1] >>= Test.instanceCount;
                }
                Test.iArrFld[i15][i15] = (int)0L;
                i16 >>= i14;
                Test.instanceCount = (long)d;
                break;
            case 61:
                Test.fFld -= -5;
                break;
            }
        }
        long meth_res = i6 + Double.doubleToLongBits(d) + i14 + i15 + i16 + i17 + i18 + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(float f, long l1, long l2) {

        int i5=-5, i19=35040, i20=58746, i21=-25095, i22=15804;
        short sArr[]=new short[N];
        long lArr2[]=new long[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(sArr, (short)8709);
        FuzzerUtils.init(lArr2, 51441L);
        FuzzerUtils.init(dArr, 82.2096);

        l2 -= (long)((++i5) - (i5 + (f - 16732)));
        i5 >>= iMeth();
        if (Test.bFld) {
            i19 = 1;
            while (++i19 < 267) {
                i20 = 1;
                while (++i20 < 6) {
                    Test.instanceCount -= i19;
                    i5 >>>= i20;
                    switch (((i20 % 10) * 5) + 49) {
                    case 58:
                        for (i21 = i19; 1 > i21; i21++) {
                            Test.bFld = Test.bFld1;
                            sArr[i20] = (short)l1;
                            switch ((i20 % 6) + 99) {
                            case 99:
                                if (Test.bFld1) break;
                                lArr2[i21 + 1] >>= i5;
                                i5 = i19;
                                break;
                            case 100:
                                try {
                                    i22 = (-165 / i5);
                                    i22 = (Test.iArrFld[i19][i21] % 32);
                                    i22 = (Test.iArrFld[i20][i20 - 1] / i5);
                                } catch (ArithmeticException a_e) {}
                            case 101:
                                i5 += (i21 * i21);
                                break;
                            case 102:
                                Test.fFld = l1;
                                break;
                            case 103:
                                Test.iArrFld[i19 + 1][i20] = (int)Test.fFld;
                            case 104:
                                lArr2[i21 - 1] -= i22;
                            default:
                                i5 += (int)1976L;
                            }
                        }
                        break;
                    case 95:
                        Test.dFld *= i20;
                        break;
                    case 52:
                        dArr = dArr;
                        break;
                    case 89:
                        lArr2[i20] = i20;
                    case 87:
                        l1 = (long)Test.dFld;
                        break;
                    case 76:
                        l1 = i20;
                        break;
                    case 82:
                        Test.bFld = Test.bFld1;
                        break;
                    case 51:
                        sArr[i20 + 1] = (short)-50937;
                        break;
                    case 96:
                        Test.dFld += l1;
                        break;
                    case 50:
                        Test.instanceCount = i22;
                        break;
                    }
                }
            }
        } else if (Test.bFld1) {
            i22 >>= i5;
        } else {
            i22 = Test.sFld;
        }
        vMeth_check_sum += Float.floatToIntBits(f) + l1 + l2 + i5 + i19 + i20 + i21 + i22 + FuzzerUtils.checkSum(sArr)
            + FuzzerUtils.checkSum(lArr2) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i=-199, i1=173, i2=5, i3=-244, i4=-6, i23=-9, iArr[]=new int[N];
        long l=114L, lArr[]=new long[N];
        double d1=-72.512;

        FuzzerUtils.init(lArr, 4559794785220281457L);
        FuzzerUtils.init(iArr, 135);

        if (Test.bFld1) {
            for (i = 5; 121 > i; i++) {
                i1 += i;
                if (Test.bFld1) {
                    for (i2 = i; i2 < 216; ++i2) {
                        if (Test.bFld) {
                            for (l = 1; l < 1; ++l) {
                                lArr[i - 1] = (long)(Test.fFld % (i2 | 1));
                                vMeth(Test.fFld, l, l);
                                Test.dFld -= 20089L;
                                Test.dArrFld = FuzzerUtils.double1array(N, (double)38.37578);
                                Test.byFld ^= (byte)7;
                                i1 *= i2;
                                Test.iArrFld[i][i2 - 1] *= (int)-249L;
                                i1 /= (int)(i | 1);
                                i4 *= i;
                            }
                            i4 *= i2;
                            i1 += (((i2 * i) + i2) - Test.sFld);
                            i23 = 1;
                            while (++i23 < 1) {
                                Test.iArrFld[i2][i] <<= i4;
                                i3 = i3;
                                switch (((i >>> 1) % 4) + 61) {
                                case 61:
                                    lArr[i2] *= i;
                                    break;
                                case 62:
                                    lArr[i + 1] >>= l;
                                    Test.dFld *= Test.instanceCount;
                                case 63:
                                    i4 = -6371;
                                    iArr[i23 - 1] = Test.byFld;
                                    i3 -= i;
                                    i1 += (i23 * i23);
                                case 64:
                                    i4 ^= i3;
                                    break;
                                default:
                                    i4 -= i1;
                                }
                            }
                        } else {
                            i3 *= (int)d1;
                        }
                    }
                } else if (Test.bFld1) {
                    i1 += (((i * i3) + i2) - i1);
                }
            }
        } else {
            Test.iArrFld[(26777 >>> 1) % N] = Test.iArrFld[(i >>> 1) % N];
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
