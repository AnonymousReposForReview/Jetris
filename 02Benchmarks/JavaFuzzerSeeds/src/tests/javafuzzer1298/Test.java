package tests.javafuzzer1298;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 17:51:34 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-1492468273L;
    public static short sFld=-2754;
    public static volatile boolean bFld=true;
    public static double dFld=0.60438;
    public static short sArrFld[]=new short[N];
    public static long lArrFld[]=new long[N];
    public int iArrFld[]=new int[N];
    public static boolean bArrFld[][]=new boolean[N][N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)-3877);
        FuzzerUtils.init(Test.lArrFld, 53133L);
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f, int i3) {

        int i4=9, i5=1, i6=-16989, i7=-64752, i8=-156, i9=-12, iArr[]=new int[N];

        FuzzerUtils.init(iArr, -151);

        for (i4 = 1; i4 < 141; ++i4) {
            for (i6 = 1; i6 < 11; i6 += 3) {
                iArr[i6 + 1] = i7;
                Test.sArrFld[i6 - 1] *= (short)31006;
                for (i8 = 1; i8 < 4; ++i8) {
                    i3 += Test.sFld;
                    if (Test.bFld) {
                        Test.instanceCount += i6;
                    } else if (Test.bFld) {
                        i3 += i8;
                        vMeth1_check_sum += Float.floatToIntBits(f) + i3 + i4 + i5 + i6 + i7 + i8 + i9 +
                            FuzzerUtils.checkSum(iArr);
                        return;
                    } else if (Test.bFld) {
                        i5 &= i9;
                        if (Test.bFld) break;
                        try {
                            i3 = (i3 % -56710);
                            i9 = (i9 % iArr[i8 + 1]);
                            i3 = (-1481711844 % i9);
                        } catch (ArithmeticException a_e) {}
                    }
                    Test.instanceCount ^= i6;
                    Test.instanceCount += i8;
                    Test.bFld = true;
                }
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + i3 + i4 + i5 + i6 + i7 + i8 + i9 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i2) {

        float f1=-2.1F, f2=-126.409F;
        int i10=-49, i11=32805, i12=38, i13=8248, i14=9;

        vMeth1(f1, i2);
        for (f2 = 8; f2 < 169; ++f2) {
            i11 = 1;
            do {
                i10 -= Test.sFld;
                i10 = i10;
            } while (++i11 < 10);
            i2 <<= i11;
            i12 = 1;
            do {
                if (Test.bFld) {
                    Test.instanceCount >>>= Test.instanceCount;
                    i10 = (int)3L;
                } else {
                    if (Test.bFld) continue;
                }
                for (i13 = 1; i13 > 1; --i13) {
                    Test.instanceCount += (((i13 * Test.instanceCount) + i10) - i11);
                }
            } while (++i12 < 10);
            Test.instanceCount -= (long)f1;
        }
        i14 -= (int)-10672L;
        vMeth_check_sum += i2 + Float.floatToIntBits(f1) + Float.floatToIntBits(f2) + i10 + i11 + i12 + i13 + i14;
    }

    public static float fMeth(int i1) {

        double d=-82.97584;
        int i15=3989, i16=67;

        i1 += (int)Test.instanceCount;
        d *= ((--Test.instanceCount) / ((Long.reverseBytes(Test.instanceCount) - 48) | 1));
        vMeth(i1);
        Test.sArrFld[(i1 >>> 1) % N] = (short)Test.instanceCount;
        for (i15 = 395; i15 > 6; i15--) {
            i1 += (int)Test.instanceCount;
            Test.instanceCount -= (long)d;
            Test.sFld -= (short)-159;
            i1 += (-28039 + (i15 * i15));
        }
        long meth_res = i1 + Double.doubleToLongBits(d) + i15 + i16;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-11570, i17=-35700, i18=-13, i19=28888, i20=-13, i21=4, i22=61322, i23=-53517, i24=-59, i25=-4385;

        i = (int)(fMeth(i) - 11);
        for (i17 = 8; 244 > i17; ++i17) {
            if (Test.bFld) {
                i &= i;
                i19 = 106;
                while ((i19 -= 2) > 0) {
                    float f3=-28.683F;
                    switch (((i17 % 7) * 5) + 101) {
                    case 114:
                        for (i20 = 1; i20 < 2; i20++) {
                            byte by=99;
                            Test.lArrFld = Test.lArrFld;
                            i21 >>>= by;
                            iArrFld[i20 - 1] += i21;
                            Test.lArrFld[i17 - 1] = i20;
                            Test.instanceCount = -24808;
                            i = i20;
                            iArrFld[i19] = i22;
                            Test.dFld += i22;
                            try {
                                iArrFld[i19] = (i21 % -27001);
                                iArrFld[i17 + 1] = (i19 / iArrFld[i20 - 1]);
                                i21 = (i20 % i20);
                            } catch (ArithmeticException a_e) {}
                            Test.instanceCount = i20;
                        }
                        break;
                    case 111:
                        iArrFld[i17] += (int)-11190L;
                        break;
                    case 128:
                        f3 -= i;
                        i18 += (i19 + f3);
                        for (i23 = 1; i23 < 2; ++i23) {
                            Test.dFld = 41031;
                            i += (i23 * i23);
                            i21 |= i;
                            Test.instanceCount ^= i24;
                            iArrFld[i17 - 1] |= i17;
                            Test.bFld = Test.bFld;
                            Test.lArrFld[i19 + 1] += i17;
                        }
                        f3 = f3;
                    case 124:
                        iArrFld[i19] -= i24;
                    case 105:
                    case 131:
                        Test.instanceCount += i20;
                        break;
                    case 106:
                        try {
                            i25 = (i22 % 27768);
                            i25 = (i19 / -29925);
                            i25 = (i21 % -97);
                        } catch (ArithmeticException a_e) {}
                        break;
                    }
                }
            } else if (true) {
                Test.bArrFld[i17 + 1][i17 - 1] = Test.bFld;
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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
