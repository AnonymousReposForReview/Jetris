package tests.javafuzzer1599;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 23:37:27 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-4136026609L;
    public volatile int iFld=-5;
    public static int iFld1=55850;
    public static float fFld=89.887F;
    public static volatile double dFld=-124.59062;
    public static boolean bFld=true;
    public static short sFld=-23753;
    public static volatile int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -64);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i4=-102, i5=50646, i6=6, i7=-42563, i8=-3, i9=14, i10=-12, iArr[]=new int[N];
        short s=-5835;

        FuzzerUtils.init(iArr, 4258);

        Test.instanceCount *= -9;
        try {
            iArr[(Test.iFld1 >>> 1) % N] <<= Test.iFld1;
            Test.iFld1 <<= Test.iFld1;
            for (i4 = 3; i4 < 317; i4++) {
                iArr[i4] *= Test.iFld1;
                Test.iFld1 = Test.iFld1;
            }
            iArr[(i5 >>> 1) % N] = i4;
            i6 = 1;
            while (++i6 < 276) {
                for (i7 = 1; 6 > i7; i7++) {
                    Test.fFld -= Test.fFld;
                    for (i9 = 1; i9 < 2; i9++) {
                        s -= (short)10353;
                        iArr[i9 - 1] -= (int)-78.212F;
                        i10 -= (int)-2720398994L;
                    }
                }
            }
        }
        catch (NullPointerException exc1) {
            Test.instanceCount >>>= i6;
        }
        vMeth1_check_sum += i4 + i5 + i6 + i7 + i8 + i9 + i10 + s + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth() {

        int i3=3, i12=-59673, i13=-10, i14=-217, iArr1[]=new int[N];
        float f1=68.955F;
        byte by=-94;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(iArr1, -8);
        FuzzerUtils.init(lArr, -67893981L);

        i3 = 154;
        do {
            vMeth1();
            Test.instanceCount += (long)Test.dFld;
        } while (--i3 > 0);
        Test.iFld1 >>= (int)-8L;
        i12 = 1;
        do {
            i13 = 1;
            do {
                for (f1 = 1; f1 < 1; f1++) {
                    Test.instanceCount -= (long)Test.dFld;
                    iArr1[(i13 >>> 1) % N] = (int)f1;
                    switch (((i12 % 1) * 5) + 5) {
                    case 7:
                        Test.iFld1 += (int)(f1 + i12);
                        by += (byte)f1;
                        lArr[(int)(f1)][i12 + 1] = 233;
                        break;
                    default:
                        try {
                            Test.iFld1 = (i14 % 58706);
                            iArr1[i12] = (i13 / 5172);
                            i14 = (Test.iFld1 % Test.iFld1);
                        } catch (ArithmeticException a_e) {}
                        iArr1[(int)(f1)] -= (int)-13.335F;
                    }
                }
            } while (++i13 < 9);
        } while (++i12 < 178);
        vMeth_check_sum += i3 + i12 + i13 + Float.floatToIntBits(f1) + i14 + by + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth(int i, int i1, int i2) {

        float f=-121.568F, f2=1.761F, f3=0.138F;
        int i15=-3, i16=56882, i17=2765;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -236L);

        i1 -= Math.max((int)((i >>> i1) - (f - i)), (int)(Test.instanceCount * (9 * (i2--))));
        vMeth();
        i *= 85;
        Test.iArrFld[(i >>> 1) % N] += 146;
        lArr1[(i >>> 1) % N] *= Test.instanceCount;
        f2 = 1;
        while (++f2 < 300) {
            i15 = 1;
            do {
                Test.dFld = Test.dFld;
                f -= f2;
                for (i16 = 1; f2 < i16; i16 -= 3) {
                    Test.iArrFld[i15 + 1] -= Test.iFld1;
                    i17 = -2;
                    f3 += i17;
                }
                i2 /= (int)(i | 1);
                i2 = i15;
            } while (++i15 < 6);
        }
        long meth_res = i + i1 + i2 + Float.floatToIntBits(f) + Float.floatToIntBits(f2) + i15 + i16 + i17 +
            Float.floatToIntBits(f3) + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i18=112, i19=244, i20=-17075, i21=14, i22=-222, i23=-212, i24=-125;
        byte by1=-86;

        iFld >>= iMeth(Test.iFld1, Test.iFld1, -159);
        i18 = 1;
        while (++i18 < 293) {
            iFld *= (int)Test.instanceCount;
            Test.bFld = Test.bFld;
            iFld += (((i18 * i18) + by1) - Test.sFld);
            iFld = (int)Test.instanceCount;
            i19 = 1;
            while (++i19 < 86) {
                by1 = (byte)Test.instanceCount;
                Test.instanceCount /= (i18 | 1);
                Test.iArrFld[i19 + 1] = by1;
                iFld -= (int)Test.instanceCount;
                Test.bFld = Test.bFld;
                Test.iFld1 = i18;
                Test.iFld1 <<= i18;
                Test.iFld1 >>= i18;
                Test.iFld1 = (int)Test.instanceCount;
                Test.iFld1 = (int)Test.fFld;
            }
        }
        for (i20 = 372; i20 > 18; --i20) {
            i22 = 1;
            while (++i22 < 71) {
                Test.iArrFld[i22 + 1] *= i22;
                Test.fFld -= i21;
                Test.fFld *= i19;
                for (i23 = 1; i23 > 1; --i23) {
                    switch ((i20 % 9) + 35) {
                    case 35:
                        i24 += (i23 - Test.iFld1);
                        if (Test.bFld) continue;
                        i24 = i18;
                        break;
                    case 36:
                        Test.sFld = (short)i24;
                        break;
                    case 37:
                        Test.sFld = (short)i23;
                        break;
                    case 38:
                        iFld -= (int)Test.instanceCount;
                    case 39:
                        Test.bFld = Test.bFld;
                        break;
                    case 40:
                        Test.iFld1 = i22;
                        break;
                    case 41:
                        Test.iFld1 += i23;
                        break;
                    case 42:
                        if (Test.bFld) break;
                    case 43:
                        Test.dFld = -5371;
                    }
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
