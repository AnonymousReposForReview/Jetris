package tests.javafuzzer3221;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 04:17:08 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=137L;
    public static boolean bFld=true;
    public static int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 10);
        FuzzerUtils.init(Test.fArrFld, -2.687F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i2, int i3, int i4) {

        int i5=-50561, i6=10, i7=19825, i8=-114, i9=2, i10=13, i11=32, i12=-177;
        float f1=115.571F;

        for (i5 = 165; i5 > 5; i5--) {
            Test.iArrFld[i5 + 1] = i4;
            Test.instanceCount >>= -15207;
            for (i7 = 1; i7 < 10; ++i7) {
                i8 += (int)Test.instanceCount;
                if (i8 != 0) {
                    vMeth2_check_sum += i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9 + Float.floatToIntBits(f1) + i10 + i11 +
                        i12;
                    return;
                }
                switch (((i8 >>> 1) % 1) + 10) {
                case 10:
                    i9 = 1;
                    while (++i9 < 2) {
                        i4 += i9;
                        i4 += (int)(86.1023F + (i9 * i9));
                    }
                    i2 += (((i7 * i3) + i6) - f1);
                    try {
                        i4 = (i9 % i5);
                        Test.iArrFld[i5 + 1] = (i8 % Test.iArrFld[i5 + 1]);
                        i10 = (31629 % i2);
                    } catch (ArithmeticException a_e) {}
                default:
                    for (i11 = 1; i11 < 2; ++i11) {
                        i4 += i11;
                        Test.instanceCount = i2;
                    }
                }
            }
        }
        vMeth2_check_sum += i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9 + Float.floatToIntBits(f1) + i10 + i11 + i12;
    }

    public static void vMeth1() {

        float f=-98.846F;
        int i1=3894, i13=8, i14=18329, i15=-23244, i16=-47749;
        short s=-14158;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 1858566627764489617L);

        f += Integer.reverseBytes((int)((-1364618990L >> (1690806307L + Math.max(i1, i1))) * (Test.instanceCount +
            Test.instanceCount)));
        vMeth2(i1, i1, i1);
        Test.instanceCount = i1;
        Test.fArrFld[(i1 >>> 1) % N] = Test.instanceCount;
        lArr[(-52834 >>> 1) % N] = 2965585054L;
        Test.bFld = Test.bFld;
        i13 = 1;
        do {
            switch ((i13 % 5) + 102) {
            case 102:
                i1 ^= -9945;
            case 103:
                for (i14 = i13; i14 < 6; i14++) {
                    i16 = 1;
                    while (++i16 < 1) {
                        i1 += (121 + (i16 * i16));
                        s *= (short)12L;
                        Test.instanceCount -= i15;
                        Test.bFld = Test.bFld;
                    }
                }
            case 104:
                f += i13;
                break;
            case 105:
                Test.instanceCount += (i13 ^ (long)f);
                break;
            case 106:
                Test.instanceCount += i15;
                break;
            }
        } while (++i13 < 295);
        vMeth1_check_sum += Float.floatToIntBits(f) + i1 + i13 + i14 + i15 + i16 + s + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth() {

        int i17=-131, i18=-198, i19=48980, i20=-9, i21=60944;
        float f2=1.220F;
        double d=0.19482;

        vMeth1();
        for (i17 = 1; i17 < 340; ++i17) {
            if (i18 != 0) {
                vMeth_check_sum += i17 + i18 + Float.floatToIntBits(f2) + i19 + Double.doubleToLongBits(d) + i20 + i21;
                return;
            }
            f2 *= Test.instanceCount;
            i18 += (((i17 * i18) + Test.instanceCount) - Test.instanceCount);
            Test.iArrFld = Test.iArrFld;
            Test.instanceCount = i19;
            d = 1;
            while (++d < 5) {
                f2 %= ((long)(d) | 1);
                for (i20 = 1; i20 < 1; ++i20) {
                    f2 = i20;
                    Test.instanceCount *= i18;
                    Test.iArrFld[i20] = i19;
                    i18 = i18;
                    Test.iArrFld[i17 - 1] *= i19;
                }
            }
        }
        vMeth_check_sum += i17 + i18 + Float.floatToIntBits(f2) + i19 + Double.doubleToLongBits(d) + i20 + i21;
    }

    public void mainTest(String[] strArr1) {

        int i=0;

        i ^= (int)((++i) + (--Test.instanceCount));
        vMeth();



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
