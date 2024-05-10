package tests.javafuzzer2912;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 22:58:12 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=0L;
    public static float fFld=96.940F;
    public static volatile byte byFld=-60;
    public static int iFld=41221;
    public static volatile boolean bFld=true;
    public float fFld1=-1.565F;
    public static int iArrFld[]=new int[N];
    public static byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 7);
        FuzzerUtils.init(Test.byArrFld, (byte)-25);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i2, int i3, double d1) {

        int i4=20264, i5=2, i6=-173, i7=235, i8=0, i9=-63742, i10=-3739;
        long l=45569L;
        float fArr[][]=new float[N][N];

        FuzzerUtils.init(fArr, 79.175F);

        i4 = 273;
        do {
            d1 = i4;
            i3 = i4;
        } while (--i4 > 0);
        for (i5 = 210; i5 > 3; i5 -= 2) {
            i2 <<= i5;
            Test.instanceCount *= i2;
            Test.iArrFld[i5 + 1] <<= i2;
            i2 <<= (int)Test.instanceCount;
        }
        for (i7 = 9; i7 < 196; ++i7) {
            switch (((i7 % 8) * 5) + 16) {
            case 45:
                i9 = 1;
                do {
                    fArr[i7 - 1][i7 - 1] = -13353;
                    for (l = 1; l < 1; ++l) {
                        i2 = i7;
                        i3 += (int)l;
                    }
                } while (++i9 < 9);
                break;
            case 38:
                i3 = i10;
            case 44:
                Test.iArrFld = Test.iArrFld;
                break;
            case 51:
                i3 = (int)Test.fFld;
                break;
            case 48:
                Test.instanceCount = i9;
                break;
            case 40:
                i2 += i7;
                break;
            case 50:
                Test.fFld += (i7 - i6);
                break;
            case 26:
                i6 = i4;
                break;
            }
        }
        long meth_res = i2 + i3 + Double.doubleToLongBits(d1) + i4 + i5 + i6 + i7 + i8 + i9 + l + i10 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(short s, int i) {

        float f=1.77F;
        int i1=8, i12=93, i13=-46216, i14=-9610;
        double d=0.55312;
        boolean b=true;

        for (f = 1; f < 207; ++f) {
            i1 = (int)(Test.iArrFld[(int)(f + 1)] = (int)((++d) + Float.intBitsToFloat(i1)));
            i1 += (int)(Test.instanceCount -= (long)((s * i1) + (19.4894 * (i - 8617550315499388239L))));
            d += ((iMeth(i, -30572, d) - -14) - Test.instanceCount);
            d *= -15422;
            if (b) {
                Test.iArrFld[(int)(f)] >>= i1;
            } else if (false) {
                for (i12 = 1; i12 < 8; ++i12) {
                    i1 += (((i12 * i1) + i1) - Test.fFld);
                    Test.fFld -= f;
                    i14 = 1;
                    do {
                        Test.instanceCount -= i12;
                        i -= (int)Test.instanceCount;
                        i = Test.byFld;
                        i += (((i14 * Test.instanceCount) + Test.fFld) - Test.instanceCount);
                    } while (++i14 < 2);
                }
            }
        }
        vMeth1_check_sum += s + i + Float.floatToIntBits(f) + i1 + Double.doubleToLongBits(d) + i12 + i13 + i14 + (b ?
            1 : 0);
    }

    public static void vMeth() {

        short s1=-25126;
        float f1=-120.289F;
        int i16=-95, i17=12, i18=10, i19=14;
        double d2=1.121784;

        vMeth1(s1, Test.iFld);
        for (int i15 : Test.iArrFld) {
            for (f1 = 4; f1 > 1; --f1) {
                i17 = 1;
                do {
                    Test.iFld >>>= Test.iFld;
                    i16 += i16;
                    switch (((i17 % 7) * 5) + 123) {
                    case 140:
                        i15 += i17;
                        if (false) continue;
                        Test.instanceCount += i18;
                        break;
                    case 134:
                        Test.iFld += (i17 * i17);
                        d2 *= Test.iFld;
                        break;
                    case 151:
                        s1 /= (short)-61635;
                        Test.iArrFld[(int)(f1)] -= Test.iFld;
                        break;
                    case 125:
                        if (Test.bFld) continue;
                        break;
                    case 146:
                        Test.iArrFld[(int)(f1 - 1)] >>= i16;
                    case 126:
                        i16 += (((i17 * Test.instanceCount) + i19) - Test.instanceCount);
                    case 157:
                    }
                } while (++i17 < 2);
            }
        }
        vMeth_check_sum += s1 + Float.floatToIntBits(f1) + i16 + i17 + i18 + Double.doubleToLongBits(d2) + i19;
    }

    public void mainTest(String[] strArr1) {

        long l1=-4083041183L, lArr[][]=new long[N][N];
        int i20=-7, i21=61745, i22=48118, i23=113;
        double d3=-1.119294;
        short s2=19782;

        FuzzerUtils.init(lArr, 1022785838L);

        vMeth();
        for (l1 = 241; l1 > 8; l1--) {
            for (i21 = (int)(l1); i21 < 108; i21++) {
                Test.instanceCount += (-168 + (i21 * i21));
                try {
                    Test.iArrFld[(int)(l1)] = (Test.iArrFld[i21] % -52596);
                    i22 = (i21 / Test.iArrFld[(int)(l1 + 1)]);
                    i20 = (-187 / Test.iArrFld[(int)(l1)]);
                } catch (ArithmeticException a_e) {}
                i23 = 1;
                while (++i23 < 1) {
                    switch ((i21 % 10) + 27) {
                    case 27:
                        Test.instanceCount <<= i20;
                        i20 = Test.iFld;
                        i20 += (i23 | i20);
                        Test.instanceCount -= (long)fFld1;
                        break;
                    case 28:
                        Test.iFld += (((i23 * i22) + Test.instanceCount) - Test.fFld);
                        i22 *= i21;
                        i22 *= i20;
                        Test.iFld = (int)d3;
                        break;
                    case 29:
                        i22 *= (int)Test.instanceCount;
                        break;
                    case 30:
                        s2 += (short)(((i23 * i21) + i21) - i23);
                        break;
                    case 31:
                        i22 <<= (int)Test.instanceCount;
                    case 32:
                        fFld1 += (i23 + i23);
                        Test.fFld %= -44.861F;
                        i22 = (int)Test.instanceCount;
                        s2 += (short)(i23 * i23);
                        break;
                    case 33:
                        Test.iFld *= i22;
                        break;
                    case 34:
                        d3 -= i20;
                        if (Test.bFld) break;
                        Test.byArrFld[(int)(l1 + 1)] += (byte)i23;
                        break;
                    case 35:
                        Test.byFld = (byte)Test.iFld;
                        break;
                    case 36:
                        lArr[(int)(l1)][i21] -= Test.instanceCount;
                        break;
                    default:
                        i22 += (int)l1;
                    }
                    Test.instanceCount <<= i23;
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
