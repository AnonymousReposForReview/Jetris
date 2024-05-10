package tests.javafuzzer965;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 12:13:51 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-8936L;
    public static short sFld=8862;
    public static boolean bFld=false;
    public static byte byFld=-72;
    public static float fFld=1.353F;
    public static volatile double dFld=-28.37552;
    public short sFld1=3598;
    public short sFld2=18870;
    public static int iArrFld[][]=new int[N][N];
    public static boolean bArrFld[][]=new boolean[N][N];
    public long lArrFld[][]=new long[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 3);
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long vMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i11) {

        int i12=-9, i13=-14, i14=150, i15=114, i16=7, i17=-108;

        for (i12 = 238; i12 > 1; --i12) {
            for (i14 = 1; i14 < 7; i14++) {
                Test.byFld = (byte)i11;
                i15 = i14;
                i11 -= i15;
                switch (((i12 % 1) * 5) + 67) {
                case 68:
                    Test.byFld = (byte)i15;
                    Test.instanceCount += (long)Test.fFld;
                    for (i16 = 1; i16 < 2; i16++) {
                        Test.byFld <<= (byte)i11;
                    }
                    Test.instanceCount += (i14 + Test.fFld);
                    break;
                default:
                    Test.sFld >>= Test.sFld;
                    Test.instanceCount += i14;
                    i13 *= (int)Test.dFld;
                    Test.instanceCount -= Test.instanceCount;
                }
            }
        }
        vMeth1_check_sum += i11 + i12 + i13 + i14 + i15 + i16 + i17;
    }

    public static boolean bMeth(short s, int i7, int i8) {

        int i9=-14, i10=-4, i18=5, i19=5113, i20=216, i21=-3, i22=-40, i23=-4, iArr1[]=new int[N];
        float f1=-61.787F, fArr1[]=new float[N];

        FuzzerUtils.init(iArr1, -11598);
        FuzzerUtils.init(fArr1, 86.586F);

        for (i9 = 10; i9 < 180; ++i9) {
            vMeth1(i8);
            for (i18 = 1; i18 < 9; i18++) {
                i8 = i9;
            }
            Test.instanceCount += (long)f1;
            i8 += (i9 * Test.instanceCount);
            iArr1[i9] = (int)Test.fFld;
            i20 = 1;
            while (++i20 < 9) {
                f1 = f1;
                fArr1[i20] += i7;
                i21 >>= i7;
                for (i22 = i9; i22 < 1; ++i22) {
                    try {
                        i21 = (-217 % Test.iArrFld[i22][i9 - 1]);
                        i19 = (i23 % i20);
                        i10 = (i7 / i18);
                    } catch (ArithmeticException a_e) {}
                    try {
                        i7 = (i20 / 2053468469);
                        i19 = (Test.iArrFld[i22][i9] / -14048);
                        i21 = (161 % i8);
                    } catch (ArithmeticException a_e) {}
                    Test.fFld += (i22 + i20);
                }
            }
        }
        long meth_res = s + i7 + i8 + i9 + i10 + i18 + i19 + Float.floatToIntBits(f1) + i20 + i21 + i22 + i23 +
            FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static void vMeth() {

        int i1=-52, i2=-186, i3=-201, i4=64782, i5=-16297, i6=50110, iArr[]=new int[N];
        float f=-92.257F, fArr[]=new float[N];
        boolean b=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 7);
        FuzzerUtils.init(fArr, -112.341F);
        FuzzerUtils.init(lArr, 45L);

        for (i1 = 3; i1 < 246; i1++) {
            i2 %= (int)((i2 - ((Test.instanceCount++) << (Test.instanceCount - 235))) | 1);
            iArr[i1] *= i2;
            i2 = (iArr[i1]--);
            if ((i2 != (Test.instanceCount++)) | (bMeth(Test.sFld, i2, 6) && b)) {
                for (i3 = 1; i3 < 7; ++i3) {
                    i2 = -33448;
                    fArr[i1] = lArr[i3 - 1];
                    Test.instanceCount += (i3 * i3);
                    i2 = (int)Test.instanceCount;
                    i2 += (i3 + f);
                    i4 *= Test.byFld;
                    for (i5 = i3; i5 < 2; i5 += 2) {
                        Test.bFld = b;
                        i4 += (int)Test.instanceCount;
                    }
                }
            } else {
                i4 = i5;
                vMeth_check_sum += i1 + i2 + i3 + i4 + Float.floatToIntBits(f) + i5 + i6 + (b ? 1 : 0) +
                    FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
                    FuzzerUtils.checkSum(lArr);
                return;
            }
        }
        vMeth_check_sum += i1 + i2 + i3 + i4 + Float.floatToIntBits(f) + i5 + i6 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-22736, i25=152, i27=-55205, i28=7525, i29=5764, i30=-7, i31=169, iArr2[]=new int[N];
        float fArr2[][]=new float[N][N];

        FuzzerUtils.init(iArr2, -58046);
        FuzzerUtils.init(fArr2, 0.758F);

        Test.sFld >>= (short)((-(i++)) + i);
        Test.bFld = false;
        vMeth();
        i25 = 1;
        do {
            Test.bArrFld = Test.bArrFld;
            Test.fFld += ((long)i25 ^ (long)sFld1);
            switch ((i25 % 2) + 43) {
            case 43:
                i += (((i25 * Test.instanceCount) + Test.instanceCount) - i);
                i *= i;
                i -= i25;
                Test.instanceCount += (((i25 * Test.instanceCount) + i25) - i25);
                break;
            case 44:
                i27 = 1;
                do {
                    if (Test.bFld) break;
                    for (i28 = 1; 1 < i28; i28--) {
                        i += (((i28 * Test.instanceCount) + i28) - i28);
                        Test.bArrFld[i28][i25] = Test.bFld;
                        i += (i28 ^ i25);
                        i29 >>>= i28;
                        i = i25;
                        i = i29;
                        i += (i28 * i28);
                        lArrFld[i25][i27] ^= 13;
                        i += i;
                    }
                    for (i30 = 1; 1 > i30; i30++) {
                        fArr2[i30 + 1][i27] += sFld2;
                        i = i28;
                        iArr2[i27 - 1] = i28;
                        i29 = i31;
                        Test.bFld = Test.bFld;
                        Test.iArrFld[(i29 >>> 1) % N][i30 + 1] += i25;
                    }
                } while (++i27 < 182);
                break;
            default:
                Test.fFld += (1833804427L + (i25 * i25));
            }
        } while (++i25 < 138);

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
//DEBUG  bMeth ->  bMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 bMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
