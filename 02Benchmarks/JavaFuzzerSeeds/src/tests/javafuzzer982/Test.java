package tests.javafuzzer982;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 12:23:06 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=4241083603665982871L;
    public static int iFld=5;
    public static volatile double dFld=59.39462;
    public static float fFld=2.399F;
    public static byte byFld=-92;
    public int iArrFld[]=new int[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i1, int i2) {

        float f1=126.980F;
        double d1=-1.11912;
        int i3=2, i4=134, i5=11, i6=9, i7=-12, i8=228, i9=-29405, i10=-2, i11=-23, iArr[]=new int[N];
        byte by=13;

        FuzzerUtils.init(iArr, -118);

        f1 += Test.instanceCount;
        d1 = i2;
        for (i3 = 7; i3 < 250; i3++) {
            Test.instanceCount += i3;
            d1 *= i2;
            i1 = Test.iFld;
            for (i5 = 7; i5 > 1; --i5) {
                i2 = -32;
            }
            i1 = i6;
            for (i7 = i3; 7 > i7; i7++) {
                iArr[i7] *= by;
            }
            i9 = 7;
            do {
                for (i10 = 1; i10 < 1; ++i10) {
                    iArr[i10 - 1] *= (int)f1;
                    Test.instanceCount >>= i2;
                }
            } while (--i9 > 0);
        }
        vMeth2_check_sum += i1 + i2 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d1) + i3 + i4 + i5 + i6 + i7 +
            i8 + by + i9 + i10 + i11 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(long l1) {

        float f=-2.625F;

        f -= (f - ((Test.iFld - -7) % (Test.iFld | 1)));
        vMeth2(Test.iFld, -7);
        vMeth1_check_sum += l1 + Float.floatToIntBits(f);
    }

    public static void vMeth(double d, long l, int i) {

        int i12=101, i13=29, iArr1[]=new int[N];
        float f2=-2.135F;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr1, -35849);
        FuzzerUtils.init(lArr, -1942155668085704410L);

        vMeth1(Test.instanceCount);
        iArr1[(i >>> 1) % N] = i;
        for (i12 = 3; i12 < 186; ++i12) {
            i13 = (int)f2;
        }
        i13 -= i13;
        i += (int)f2;
        i13 >>= Test.iFld;
        lArr = lArr;
        Test.iFld = i13;
        vMeth_check_sum += Double.doubleToLongBits(d) + l + i + i12 + i13 + Float.floatToIntBits(f2) +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i14=-34816, i15=1, i16=13, i17=230, i18=87, i19=62747, i20=204;
        boolean b=true;
        short s=-22359, sArr[]=new short[N];
        float fArr[]=new float[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(fArr, 30.685F);
        FuzzerUtils.init(sArr, (short)17586);
        FuzzerUtils.init(lArr1, -30L);

        vMeth(Test.dFld, Test.instanceCount, Test.iFld);
        for (i14 = 6; i14 < 196; ++i14) {
            Test.fFld = 34461;
            for (i16 = 6; i16 < 132; i16++) {
                Test.dFld = i17;
                iArrFld[i14 - 1] -= i15;
                fArr[(i15 >>> 1) % N] *= -29862;
                Test.instanceCount = i14;
                i17 *= i14;
                if (true) {
                    Test.fFld += (47081 + (i16 * i16));
                } else {
                    Test.byFld -= (byte)Test.fFld;
                    i18 = 1;
                    while (++i18 < 2) {
                        Test.iFld >>= i14;
                        i15 += (int)Test.instanceCount;
                        sArr = sArr;
                    }
                    lArr1[i16 - 1] = -9;
                }
                i15 += (i16 * i15);
                for (i19 = 1; i19 < 2; i19++) {
                    iArrFld = iArrFld;
                    if (b) break;
                    iArrFld = iArrFld;
                    Test.instanceCount = Test.instanceCount;
                    Test.iFld -= (int)Test.instanceCount;
                    Test.fFld += i19;
                    i15 = 121;
                }
                Test.byFld += (byte)i16;
                if (b) {
                    Test.dFld = i20;
                    Test.instanceCount *= i20;
                } else if (b) {
                    iArrFld[i16 + 1] = s;
                } else if (b) {
                    Test.iFld &= -13;
                } else {
                    i15 += (i16 + i15);
                }
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
