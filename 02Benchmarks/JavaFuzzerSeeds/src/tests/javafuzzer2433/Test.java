package tests.javafuzzer2433;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 14:23:43 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=9436L;
    public static boolean bFld=false;
    public static int iFld=4;
    public byte byFld=3;
    public static int iFld1=20868;
    public int iArrFld[]=new int[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i5) {

        int i6=5;

        i6 = 1;
        do {
            i5 += -31433;
            Test.instanceCount >>= 0L;
            Test.bFld = Test.bFld;
        } while (++i6 < 167);
        vMeth2_check_sum += i5 + i6;
    }

    public static void vMeth1(float f, int i3, int i4) {

        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 3753708006201012100L);

        vMeth2(Test.iFld);
        Test.instanceCount += i4;
        i3 %= (int)((long)(f) | 1);
        Test.iFld += i4;
        i3 += (int)-1997620403L;
        lArr[(12 >>> 1) % N] = Test.instanceCount;
        vMeth1_check_sum += Float.floatToIntBits(f) + i3 + i4 + FuzzerUtils.checkSum(lArr);
    }

    public void vMeth() {

        float f1=2.418F, fArr[]=new float[N];
        int i7=3571, i8=-201, i9=6, i10=3, i11=226, i12=-7, i13=-12, i14=-34353, iArr[]=new int[N];
        double d=-87.47328;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr, 3893);
        FuzzerUtils.init(lArr1, 198L);
        FuzzerUtils.init(fArr, -2.747F);

        vMeth1(f1, Test.iFld, Test.iFld);
        for (i7 = 3; 151 > i7; ++i7) {
            iArr = iArr;
            for (i9 = 11; i9 > 1; i9 -= 2) {
                short s=28626;
                for (i11 = i9; i11 < 3; ++i11) {
                    byFld -= (byte)i7;
                    d *= -3;
                    lArr1 = lArr1;
                    i12 %= 3;
                }
                iArr[i9 + 1] = i12;
                for (i13 = 1; i13 < 3; ++i13) {
                    Test.iFld += (((i13 * i11) + f1) - i10);
                }
                fArr[i9] = s;
                lArr1[i7 - 1] ^= Test.instanceCount;
                i8 = Test.iFld;
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f1) + i7 + i8 + i9 + i10 + i11 + i12 + Double.doubleToLongBits(d) + i13
            + i14 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i=-34673, i1=1, i2=14, i15=177, i16=-57424, i17=55449, i18=-62725, i19=-44930, i20=49;
        double d1=25.14086, d2=64.76806;
        float f2=125.446F, f3=-2.320F;
        byte byArr[][]=new byte[N][N];
        long lArr2[]=new long[N];

        FuzzerUtils.init(byArr, (byte)-104);
        FuzzerUtils.init(lArr2, -36981L);

        i = -93;
        for (i1 = 3; i1 < 228; i1 += 3) {
            vMeth();
        }
        Test.iFld1 *= (int)-7.63F;
        byArr[(i2 >>> 1) % N][(Test.iFld >>> 1) % N] ^= (byte)202;
        if (Test.bFld) {
            i15 = 1;
            while (++i15 < 177) {
                for (d1 = 2; d1 < 142; d1++) {
                    f2 += (float)d1;
                    i16 -= Test.iFld;
                    Test.instanceCount += (long)(d1 + f3);
                    i16 = 205;
                    for (i17 = i15; i17 < 2; i17++) {
                        lArr2[i17] ^= Test.instanceCount;
                        iArrFld[i17] += (int)Test.instanceCount;
                        if (true) {
                            i18 = (int)4285001492091766463L;
                            iArrFld = iArrFld;
                            d2 += byFld;
                        } else {
                            Test.bFld = Test.bFld;
                            Test.iFld1 += (((i17 * i2) + i1) - i17);
                        }
                        iArrFld[i17] += (int)Test.instanceCount;
                    }
                    Test.iFld >>= i17;
                }
                i18 += (((i15 * byFld) + i1) - Test.instanceCount);
                Test.bFld = false;
                for (i19 = 142; i19 > 1; i19--) {
                    Test.instanceCount = Test.instanceCount;
                    f3 += i19;
                    i20 = 10;
                }
            }
        } else if (Test.bFld) {
            iArrFld[(-61 >>> 1) % N] >>= i18;
        } else if (false) {
            Test.instanceCount = Test.iFld1;
        } else {
            Test.instanceCount = i15;
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}