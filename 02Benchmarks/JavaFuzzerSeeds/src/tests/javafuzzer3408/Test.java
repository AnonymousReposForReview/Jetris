package tests.javafuzzer3408;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 07:36:36 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-27256L;
    public static float fFld=-1.936F;
    public static double dFld=61.29750;
    public int iFld=-10;
    public static volatile byte byFld=-107;
    public static volatile int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 6);
        FuzzerUtils.init(Test.fArrFld, 1.581F);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(double d, int i2, boolean b) {

        int i3=5, i4=14, i5=124, i6=48382, i7=-187, i8=-11, i9=-20095, iArr[]=new int[N];
        long lArr1[][]=new long[N][N];

        FuzzerUtils.init(iArr, 73);
        FuzzerUtils.init(lArr1, 63803L);

        iArr[(i2 >>> 1) % N] = (int)Test.instanceCount;
        for (i3 = 8; i3 < 348; i3++) {
            for (i5 = 5; i5 > 1; i5--) {
                i4 += i6;
                i7 = 1;
                while (++i7 < 2) {
                    Test.instanceCount += i7;
                    Test.fFld = 4221;
                    lArr1[i5][i5 + 1] <<= 14;
                    Test.instanceCount -= i6;
                    i2 = i6;
                    Test.instanceCount *= i7;
                }
                for (i8 = 1; 2 > i8; i8++) {
                    if (b) continue;
                    if (b) break;
                    i2 += i8;
                }
            }
        }
        vMeth1_check_sum += Double.doubleToLongBits(d) + i2 + (b ? 1 : 0) + i3 + i4 + i5 + i6 + i7 + i8 + i9 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr1);
    }

    public static int iMeth(int i1, long l1) {

        boolean b1=true;
        int i10=-1, i11=4847, i12=233, i13=59904, i14=-5;
        float f=9.762F, fArr[]=new float[N];
        short s=16653;

        FuzzerUtils.init(fArr, -78.354F);

        vMeth1(Test.dFld, i1, b1);
        for (i10 = 1; 313 > i10; ++i10) {
            l1 += (-13L + (i10 * i10));
            l1 += i10;
            for (f = 1; f < 5; ++f) {
                i11 += (int)f;
                Test.instanceCount = (long)Test.fFld;
                i11 >>>= i12;
            }
            for (i13 = 5; i13 > i10; i13--) {
                Test.iArrFld[i10 + 1] *= (int)l1;
            }
            Test.fFld += 43273;
            s = (short)i10;
            i12 = i11;
            l1 = i14;
            fArr[i10] = i13;
        }
        long meth_res = i1 + l1 + (b1 ? 1 : 0) + i10 + i11 + Float.floatToIntBits(f) + i12 + i13 + i14 + s +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i, long l) {

        int i15=-20790, i16=51, i17=-6, i18=-13, i19=-123, i20=-175, i21=-53810;
        byte by=72;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -1984325782L);

        i *= (int)((lArr[(i >>> 1) % N] >> (--Test.instanceCount)) - iMeth(234, l));
        i = (int)Test.instanceCount;
        l >>= l;
        for (i15 = 13; 396 > i15; i15++) {
            i16 -= (int)l;
            i <<= i15;
            Test.iArrFld = Test.iArrFld;
            for (i17 = 1; i17 < 4; i17++) {
                by += (byte)(-15339 + (i17 * i17));
                for (i19 = 1; 2 > i19; i19++) {
                    if (false) {
                        if (i != 0) {
                            vMeth_check_sum += i + l + i15 + i16 + i17 + i18 + by + i19 + i20 + i21 +
                                FuzzerUtils.checkSum(lArr);
                            return;
                        }
                    } else {
                        Test.iArrFld[i19] = (int)1.18184;
                        Test.fFld *= i16;
                        try {
                            i21 = (i17 % -255);
                            i21 = (i16 % i20);
                            i20 = (1744733388 % i15);
                        } catch (ArithmeticException a_e) {}
                        vMeth_check_sum += i + l + i15 + i16 + i17 + i18 + by + i19 + i20 + i21 +
                            FuzzerUtils.checkSum(lArr);
                        return;
                    }
                }
            }
        }
        vMeth_check_sum += i + l + i15 + i16 + i17 + i18 + by + i19 + i20 + i21 + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i22=9, i23=-89, i24=-2855, i25=172, i26=46308, i27=53794, i28=-13, i29=-8;
        boolean b2=true;

        vMeth(iFld, -67L);
        Test.instanceCount = iFld;
        for (i22 = 7; i22 < 285; ++i22) {
            i23 -= i22;
            Test.fFld = 1;
            i24 = 1;
            do {
                iFld -= i22;
                iFld >>= -4;
            } while (++i24 < 90);
            Test.instanceCount += Test.byFld;
            Test.dFld += Test.byFld;
            Test.instanceCount += (((i22 * iFld) + Test.instanceCount) - Test.instanceCount);
        }
        for (i25 = 7; i25 < 177; i25++) {
            i27 = 148;
            while ((i27 -= 2) > 0) {
                Test.instanceCount = 2;
                i23 *= (int)Test.fFld;
                i26 <<= i26;
                Test.instanceCount -= i27;
                for (i28 = 1; i28 < 2; ++i28) {
                    Test.fFld = i25;
                    Test.iArrFld[i28] >>= i26;
                    Test.fFld -= 40327L;
                    Test.iArrFld[i25] = i23;
                    if (b2) break;
                    iFld += (int)Test.dFld;
                    Test.fArrFld[i28 - 1] = i26;
                    Test.instanceCount += (34960 + (i28 * i28));
                    Test.instanceCount *= i26;
                    Test.instanceCount += Test.instanceCount;
                }
                iFld = (int)Test.instanceCount;
                i23 += i28;
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
