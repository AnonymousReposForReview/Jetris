package tests.javafuzzer2978;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 00:26:29 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-217L;
    public static float fFld=105.792F;
    public static double dFld=-50.94902;
    public long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -2);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;

    public static int iMeth2(int i5, int i6, int i7) {

        int i8=147, i9=-2, i10=107, i11=-53618, i12=-9;
        double d=0.75456;
        short s=3044;
        boolean b1=false;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 125.82F);

        fArr[(-11 >>> 1) % N] = i7;
        for (i8 = 2; i8 < 195; ++i8) {
            for (d = i8; d < 8; d++) {
                if (b1) {
                    i10 += (int)(((d * Test.fFld) + i7) - s);
                    for (i11 = 1; i11 > i8; i11 -= 3) {
                        if (b1) break;
                        i7 = i9;
                        Test.instanceCount += (i11 | i10);
                        i7 |= i9;
                        fArr[i8 - 1] = i9;
                        i6 %= (int)(i9 | 1);
                    }
                    Test.iArrFld[i8 - 1] = i12;
                    i5 <<= i6;
                } else if (b1) {
                    Test.iArrFld[(int)(d - 1)] -= (int)Test.fFld;
                }
            }
        }
        long meth_res = i5 + i6 + i7 + i8 + i9 + Double.doubleToLongBits(d) + i10 + s + i11 + i12 + (b1 ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth1(int i4, long l) {

        int i13=85, i14=-14, i15=-13, i16=13, i17=2936;

        Test.iArrFld[(i4 >>> 1) % N] -= Integer.reverseBytes(iMeth2(i4, i4, i4));
        i13 = 1;
        do {
            Test.iArrFld[i13 + 1] <<= 156;
            for (i14 = 1; i14 < 6; i14++) {
                Test.instanceCount >>>= i4;
                Test.iArrFld = Test.iArrFld;
                Test.instanceCount = -78;
                i4 -= (int)Test.instanceCount;
                for (i16 = 1; i16 < 2; i16++) {
                    Test.fFld = i13;
                    i15 += i16;
                    i17 = i14;
                    i4 *= (int)Test.fFld;
                    i17 = i13;
                    i15 = i13;
                }
            }
        } while (++i13 < 277);
        long meth_res = i4 + l + i13 + i14 + i15 + i16 + i17;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        int i1=-4, i2=10, i3=-127, i18=9, i19=189, iArr1[]=new int[N];
        boolean b=false;
        byte by=-69;
        float fArr1[]=new float[N];

        FuzzerUtils.init(iArr1, 34262);
        FuzzerUtils.init(fArr1, 1.565F);

        for (i1 = 23; i1 < 394; i1++) {
            if (b) {
                i3 = 1;
                while (++i3 < 5) {
                    if (b) continue;
                    iArr1[i1] -= (int)(Test.instanceCount -= iMeth1(i2, Test.instanceCount));
                    i2 += 44553;
                }
                i2 = -26;
                for (i18 = 5; i18 > i1; --i18) {
                    i19 = by;
                    i19 >>= (int)5243831343272071969L;
                    by = (byte)i1;
                    fArr1[i18 + 1] = Test.instanceCount;
                    Test.instanceCount -= Test.instanceCount;
                }
            } else if (true) {
                Test.iArrFld[i1 + 1] >>>= i19;
                i19 += (i1 * i1);
            } else if (b) {
                i2 = by;
            }
        }
        long meth_res = i1 + i2 + i3 + (b ? 1 : 0) + i18 + i19 + by + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i20=13437, i21=-214, i22=-60128, i23=5, i24=228, i25=-65382, i26=-245, i27=6, i28=-134, i29=-49843,
            iArr[]=new int[N];
        boolean b2=true;
        short s1=14719;

        FuzzerUtils.init(iArr, 50059);

        for (int i : iArr) {
            i >>>= (int)((~(long)(Test.fFld * Test.dFld)) - (Integer.reverseBytes(i) * (14608 - (Test.instanceCount *
                -31))));
            lArrFld[(i >>> 1) % N] = (long)(iMeth() - Test.fFld);
        }
        for (i20 = 7; i20 < 302; ++i20) {
            i21 += (i20 | i21);
        }
        for (i22 = 4; i22 < 303; i22++) {
            Test.instanceCount <<= i23;
            if (false) continue;
            for (i24 = 2; i24 < 84; i24++) {
                i21 = (int)Test.fFld;
                b2 = b2;
                lArrFld[i24 - 1] *= i22;
                i23 += (i24 ^ i21);
                i21 *= 56;
                i23 = (int)Test.fFld;
                for (i26 = 1; i26 < 2; i26++) {
                    if (b2) break;
                    Test.dFld += -61168L;
                    i27 += (i26 * i27);
                }
                i25 += (int)Test.instanceCount;
                for (i28 = i24; i28 < 2; i28++) {
                    lArrFld[i24] += (long)Test.fFld;
                    iArr[i24] = s1;
                    Test.iArrFld[i22 - 1] = -6;
                    i29 += (int)(-7L + (i28 * i28));
                    Test.instanceCount = (long)Test.dFld;
                    if (b2) break;
                    Test.iArrFld[i22] *= (int)Test.fFld;
                    i29 %= (int)(i24 | 1);
                }
                i23 >>= (int)-30L;
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
//DEBUG  iMeth2 ->  iMeth2 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}