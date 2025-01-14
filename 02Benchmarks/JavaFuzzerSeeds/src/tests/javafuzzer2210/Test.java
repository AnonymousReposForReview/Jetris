package tests.javafuzzer2210;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 10:22:37 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=8399747307460497296L;
    public int iFld=-72;
    public static double dFld=-26.64287;
    public static short sFld=-32016;
    public boolean bFld=true;
    public static long lArrFld[]=new long[N];
    public static double dArrFld[]=new double[N];
    public int iArrFld[]=new int[N];
    public short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -5L);
        FuzzerUtils.init(Test.dArrFld, 87.39704);
    }

    public static long vMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i6, byte by, int i7) {

        int i8=-54031, i9=-11, i10=-149, iArr1[]=new int[N];
        float f1=2.911F;
        boolean b1=true;

        FuzzerUtils.init(iArr1, 9);

        i8 = 1;
        while (++i8 < 264) {
            i6 += (((i8 * Test.instanceCount) + i7) - i8);
            Test.dFld -= -2.68F;
            Test.sFld = (short)f1;
            iArr1[i8 + 1] = (int)Test.dFld;
            switch ((i8 % 10) + 76) {
            case 76:
                if (b1) {
                    iArr1[i8] -= i8;
                    Test.lArrFld[i8] *= (long)1.75174;
                    for (i9 = i8; i9 < 6; ++i9) {
                        Test.dFld -= 136;
                        f1 += (((i9 * Test.sFld) + i9) - i6);
                    }
                } else {
                    i7 = (int)Test.instanceCount;
                    f1 -= i9;
                    f1 *= (float)Test.dFld;
                }
                break;
            case 77:
                i7 += (((i8 * i9) + Test.instanceCount) - i10);
                break;
            case 78:
                i6 += i10;
            case 79:
            case 80:
                i10 = i6;
                break;
            case 81:
                i6 &= i10;
                break;
            case 82:
                i10 = (int)1920342408724304226L;
                break;
            case 83:
                i10 += (i8 | i8);
                break;
            case 84:
                Test.lArrFld[i8 - 1] *= Test.instanceCount;
                break;
            case 85:
                i7 = (int)Test.instanceCount;
                break;
            }
        }
        vMeth1_check_sum += i6 + by + i7 + i8 + Float.floatToIntBits(f1) + i9 + i10 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static boolean bMeth(int i5) {

        byte by1=67;
        int i11=-254, i12=115, i13=37282, i14=61577, i15=3, i16=11, i17=50243, iArr2[]=new int[N];
        long l=62L;

        FuzzerUtils.init(iArr2, 223);

        vMeth1(i5, by1, i11);
        Test.instanceCount = i11;
        i5 *= i11;
        i12 = 1;
        do {
            Test.instanceCount -= i11;
            Test.sFld = (short)Test.dFld;
            for (i13 = 7; 1 < i13; i13 -= 2) {
                i11 >>= (int)1460355956L;
            }
            for (i15 = 1; i15 < 7; i15++) {
                Test.lArrFld[i12] -= 7907620734861993307L;
                for (l = 1; l < 2; ++l) {
                    Test.instanceCount = i12;
                }
                Test.instanceCount += (((i15 * i11) + i16) - i5);
            }
            iArr2[i12 + 1] -= by1;
            Test.instanceCount -= by1;
        } while (++i12 < 249);
        long meth_res = i5 + by1 + i11 + i12 + i13 + i14 + i15 + i16 + l + i17 + FuzzerUtils.checkSum(iArr2);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static void vMeth() {

        boolean b=false;
        int i1=57997, i2=14059, i3=4, i4=-38937, iArr[]=new int[N];
        float f=0.510F;

        FuzzerUtils.init(iArr, -10);

        for (int i : iArr) {
            i *= (i--);
            if (b = b) continue;
            for (i1 = 1; i1 < 4; ++i1) {
                Test.instanceCount += (i1 ^ Test.instanceCount);
                for (i3 = 1; i3 < 2; i3++) {
                    i4 = i4;
                    i4 += (i * iArr[i1 + 1]);
                    switch ((((((int)(7L + (Test.instanceCount - i1))) >>> 1) % 2) * 5) + 76) {
                    case 85:
                        i2 <<= (int)(-Test.instanceCount);
                        i2 += i2;
                        Test.instanceCount += i3;
                        if (-12 > (Math.min((int)(i % (Test.instanceCount | 1)), ++i2) + (i1 + (i * 135)))) {
                            i4 += i3;
                            i4 += i3;
                        } else if (147L < i3) {
                            i += (i3 * i3);
                        } else if (bMeth(i1)) {
                            f *= (i3 + Math.max(i, i4));
                        }
                        break;
                    case 79:
                        i4 += (((i3 * i1) + i3) - i3);
                        break;
                    }
                }
            }
        }
        vMeth_check_sum += (b ? 1 : 0) + i1 + i2 + i3 + i4 + Float.floatToIntBits(f) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i18=-5536, i19=-182, i20=55788, i21=0, i22=-10, i23=-1697, iArr3[]=new int[N];
        float f2=-92.249F, fArr[]=new float[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(fArr, -57.391F);
        FuzzerUtils.init(iArr3, 37);
        FuzzerUtils.init(bArr, true);

        Test.instanceCount = iFld;
        vMeth();
        fArr = fArr;
        Test.lArrFld[(iFld >>> 1) % N] = iFld;
        Test.instanceCount = iFld;
        for (i18 = 1; i18 < 166; ++i18) {
            for (i20 = 6; i20 < 152; i20++) {
                f2 = i19;
                if (bFld) break;
                Test.instanceCount = Test.instanceCount;
                i21 += (((i20 * f2) + Test.instanceCount) - i19);
                Test.dArrFld = Test.dArrFld;
                for (i22 = 1; i22 < 2; i22++) {
                    i19 += (int)Test.dFld;
                    iArrFld[i18 - 1] += i22;
                    sArrFld[i20] -= (short)i21;
                    if (bFld) {
                        Test.instanceCount = iFld;
                        Test.dFld += i21;
                        Test.instanceCount = i22;
                    } else if (bFld) {
                        fArr[i22 - 1] = 20400;
                        iArr3[i20] *= (int)Test.dFld;
                        if (bFld) break;
                    }
                    i23 = i20;
                    Test.instanceCount = Test.sFld;
                    i19 += i22;
                    i23 = (int)f2;
                }
            }
            i21 = 75;
            bArr[i18 + 1] = false;
            if (bFld) break;
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
//DEBUG  bMeth ->  bMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 bMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
