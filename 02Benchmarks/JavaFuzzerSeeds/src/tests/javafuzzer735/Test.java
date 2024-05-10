package tests.javafuzzer735;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 08:48:13 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=100L;
    public static double dFld=1.41395;
    public static short sFld=-26669;
    public static int iFld=11;
    public static volatile byte byFld=-24;
    public static float fArrFld[][]=new float[N][N];

    static {
        FuzzerUtils.init(Test.fArrFld, 118.27F);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i7=-153, i8=-134, i9=-52509, i10=0, i11=16565, i12=30641, i13=6, i14=-2, iArr2[]=new int[N];
        float f=-1.35F;

        FuzzerUtils.init(iArr2, 11);

        i7 = 1;
        while (++i7 < 335) {
            Test.iFld += (((i7 * Test.instanceCount) + Test.iFld) - i7);
        }
        for (i8 = 5; i8 < 279; i8++) {
            for (i10 = i8; i10 < 6; ++i10) {
                f -= i7;
                Test.iFld -= i8;
            }
            try {
                i9 = (i8 / Test.iFld);
                iArr2[i8 - 1] = (i7 / Test.iFld);
                iArr2[i8 - 1] = (i10 % 61);
            } catch (ArithmeticException a_e) {}
            Test.instanceCount += Test.instanceCount;
            iArr2[(Test.iFld >>> 1) % N] *= (int)7L;
            i12 = 1;
            while (++i12 < 6) {
                switch ((((i11 >>> 1) % 4) * 5) + 61) {
                case 68:
                    for (i13 = 1; 1 > i13; i13++) {
                        iArr2[i12] += (int)f;
                    }
                    iArr2[i12] -= 254;
                    i14 = -36789;
                    break;
                case 75:
                    i9 -= (int)Test.instanceCount;
                    break;
                case 74:
                    Test.instanceCount = i12;
                case 62:
                    Test.instanceCount -= 123;
                    break;
                default:
                    i11 += i12;
                }
            }
        }
        vMeth1_check_sum += i7 + i8 + i9 + i10 + i11 + Float.floatToIntBits(f) + i12 + i13 + i14 +
            FuzzerUtils.checkSum(iArr2);
    }

    public static void vMeth(int i2, double d) {

        int i3=45775, i4=-4, i5=31755, i6=-19361, i15=9117, i16=-153, iArr1[]=new int[N];
        byte by=34, byArr[]=new byte[N];
        float f1=-2.799F;
        boolean b=false;

        FuzzerUtils.init(iArr1, -103);
        FuzzerUtils.init(byArr, (byte)16);

        for (i3 = 255; i3 > 10; i3 -= 3) {
            i2 += (((i3 * i4) + Test.instanceCount) - by);
            iArr1[i3] *= (int)Test.instanceCount;
            for (i5 = 1; i5 < 19; i5++) {
                i2 -= (int)Test.fArrFld[i3 - 1][i5 + 1];
                switch ((i5 % 7) + 59) {
                case 59:
                    if (b) {
                        vMeth1();
                        Test.iFld = i6;
                        f1 = 7100;
                        Test.dFld *= 4;
                    } else if (b) {
                        iArr1[i3 + 1] += Test.iFld;
                        for (i15 = 1; i15 < 2; i15++) {
                            i6 -= (int)Test.instanceCount;
                            by = (byte)i3;
                        }
                    } else {
                        i6 |= i6;
                    }
                case 60:
                    d *= Test.iFld;
                    break;
                case 61:
                    byArr[i3] = (byte)1083066250873522666L;
                    break;
                case 62:
                    try {
                        Test.iFld = (-43976 % i2);
                        i6 = (Test.iFld % i3);
                        iArr1[i3 + 1] = (iArr1[i5] % Test.iFld);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 63:
                    i6 += i5;
                    break;
                case 64:
                    f1 += (-125L + (i5 * i5));
                    break;
                case 65:
                    Test.instanceCount = i15;
                default:
                    i2 += (int)Test.instanceCount;
                }
            }
        }
        vMeth_check_sum += i2 + Double.doubleToLongBits(d) + i3 + i4 + by + i5 + i6 + Float.floatToIntBits(f1) + i15 +
            i16 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(byArr);
    }

    public static int iMeth() {

        int i=-44177, i1=62094, i17=-12, i18=24298, i19=54939, i20=39, iArr[]=new int[N];
        long l=55733L;
        float f2=-2.873F;

        FuzzerUtils.init(iArr, 9);

        i = 1;
        while (++i < 208) {
            Test.sFld += (short)(i1++);
            i1 -= (int)(iArr[i - 1] += (int)14539L);
            l = 1;
            while (++l < 8) {
                i1 -= (int)Test.instanceCount;
                vMeth(Test.iFld, Test.dFld);
            }
            for (i17 = 1; i17 < 8; i17++) {
                i1 |= i1;
                iArr[i17 + 1] = Test.byFld;
                i1 -= i;
                i1 *= i;
                for (i19 = 1; 2 > i19; ++i19) {
                    Test.dFld -= Test.dFld;
                    i18 += (i19 | (long)f2);
                }
                i1 += (i17 * i17);
            }
        }
        long meth_res = i + i1 + l + i17 + i18 + i19 + i20 + Float.floatToIntBits(f2) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i21=4, i22=-112;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 5L);

        Test.dFld %= ((iMeth() + Test.iFld) | 1);
        for (i21 = 7; 142 > i21; i21++) {
            Test.instanceCount += (-201 + (i21 * i21));
            Test.iFld += (((i21 * Test.iFld) + i22) - i22);
            Test.instanceCount = Test.instanceCount;
            lArr[i21] = 9;
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
