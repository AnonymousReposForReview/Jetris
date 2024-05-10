package tests.javafuzzer153;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 23:03:54 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=935372226L;
    public static int iFld=-2;
    public float fFld=0.540F;
    public byte byFld=-4;
    public double dFld=1.86931;
    public int iFld1=14475;
    public static int iArrFld[]=new int[N];
    public static boolean bArrFld[]=new boolean[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -63974);
        FuzzerUtils.init(Test.bArrFld, false);
        FuzzerUtils.init(Test.lArrFld, 37761L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i3=60967, i4=65250, i5=10, i6=13, i7=11;
        boolean b=false;

        Test.iArrFld[(-14980 >>> 1) % N] >>>= -73;
        for (i3 = 5; i3 < 163; i3++) {
            for (i5 = 1; i5 < 10; ++i5) {
                Test.iArrFld[i5] = i6;
                i7 = 1;
                do {
                    Test.instanceCount = i6;
                    Test.iArrFld[i5 - 1] -= (int)61318L;
                    i4 += (i7 - i5);
                    try {
                        i6 = (-163 / i7);
                        i6 = (Test.iArrFld[i5 - 1] / i5);
                        i4 = (i6 / 233);
                    } catch (ArithmeticException a_e) {}
                    Test.iArrFld[i3] = i6;
                    Test.iFld = i4;
                    Test.iFld += i7;
                    b = b;
                } while (++i7 < 2);
                Test.iArrFld[i3] = (int)Test.instanceCount;
                Test.iFld /= (int)(Test.iFld | 1);
            }
        }
        vMeth2_check_sum += i3 + i4 + i5 + i6 + i7 + (b ? 1 : 0);
    }

    public static void vMeth1(byte by, long l, long l1) {

        int i1=-9, i2=-38674, iArr[]=new int[N];
        float f2=0.269F;
        short s=-9266;

        FuzzerUtils.init(iArr, 56300);

        for (i1 = 5; i1 < 212; i1++) {
            if ((Test.iFld--) < iArr[i1 - 1]) continue;
            if ((-(iArr[i1] *= (int)(l1 - i2))) == i1) break;
            vMeth2();
            switch ((i1 % 1) + 108) {
            case 108:
                i2 = -15747;
                l1 += i1;
                f2 -= -908953957L;
                s = (short)i2;
                break;
            }
            f2 += -211;
            i2 = i1;
            i2 += (((i1 * i2) + Test.iFld) - i1);
            i2 += (i1 * i2);
            Test.iFld -= 3;
        }
        Test.bArrFld = FuzzerUtils.boolean1array(N, (boolean)false);
        vMeth1_check_sum += by + l + l1 + i1 + i2 + Float.floatToIntBits(f2) + s + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(float f, float f1) {

        int i=-14530, i8=-1, i9=-10;
        byte by1=19;
        short s1=-5327;
        long lArr[]=new long[N];
        float fArr[][]=new float[N][N];
        double dArr[]=new double[N];

        FuzzerUtils.init(lArr, 2L);
        FuzzerUtils.init(fArr, -2.833F);
        FuzzerUtils.init(dArr, -2.100666);

        Test.instanceCount = ((Test.iFld + (Test.iFld + Test.instanceCount)) * Test.iFld);
        i = 1;
        do {
            vMeth1(by1, 4419946264519886262L, Test.instanceCount);
            lArr = lArr;
            fArr[i] = fArr[i + 1];
            by1 += (byte)i;
            Test.iFld += (i - Test.iFld);
            for (i8 = 1; i8 < 4; ++i8) {
                Test.instanceCount <<= s1;
                Test.instanceCount += (-157L + (i8 * i8));
                f -= -13;
                s1 += (short)(((i8 * Test.iFld) + Test.iFld) - Test.iFld);
                i9 += i8;
                dArr[i] *= i;
            }
            f %= (Test.instanceCount | 1);
        } while (++i < 379);
        vMeth_check_sum += Float.floatToIntBits(f) + Float.floatToIntBits(f1) + i + by1 + i8 + i9 + s1 +
            FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        short s2=12678;
        double d=120.54039, dArr1[]=new double[N];
        int i10=213, i11=-35254, i12=165, i13=131, i14=9, i15=126, i16=-14;

        FuzzerUtils.init(dArr1, -1.83467);

        vMeth(fFld, fFld);
        Test.iArrFld[(Test.iFld >>> 1) % N] *= Test.iFld;
        s2 <<= byFld;
        Test.iFld += Test.iFld;
        for (d = 13; d < 272; ++d) {
            Test.instanceCount += (long)(((d * fFld) + Test.iFld) - Test.iFld);
            Test.iFld = 12094;
            for (i11 = (int)(d); i11 < 97; i11++) {
                for (i13 = 1; i13 > 1; i13 -= 2) {
                    Test.instanceCount += i11;
                    i10 += (i13 | Test.instanceCount);
                    Test.lArrFld[(int)(d)] *= i13;
                    i12 -= (int)Test.instanceCount;
                    byFld -= (byte)i10;
                    i14 = i10;
                    i12 += i13;
                    Test.iArrFld = Test.iArrFld;
                }
            }
            i10 = byFld;
            if (false) {
                for (i15 = 4; i15 < 97; ++i15) {
                    dArr1[(int)(d)] += Test.instanceCount;
                    Test.instanceCount *= i13;
                    Test.iArrFld[(int)(d)] <<= 9970;
                    i16 = i13;
                    switch (((i14 >>> 1) % 2) + 5) {
                    case 5:
                        dFld *= i12;
                        iFld1 /= (int)((long)(d) | 1);
                        break;
                    case 6:
                        Test.iArrFld[(int)(d)] += i13;
                        break;
                    }
                    i10 <<= Test.iFld;
                    Test.iArrFld[i15] = (int)fFld;
                }
            } else {
                fFld = Test.instanceCount;
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