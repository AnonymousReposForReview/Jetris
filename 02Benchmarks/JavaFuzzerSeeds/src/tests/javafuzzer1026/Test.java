package tests.javafuzzer1026;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 12:55:38 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-104L;
    public static boolean bFld=true;
    public int iFld=-52253;
    public static volatile float fFld=-2.353F;
    public int iFld1=-21;
    public int iArrFld[]=new int[N];
    public static long lArrFld[][]=new long[N][N];
    public static boolean bArrFld[]=new boolean[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 5153242017480505413L);
        FuzzerUtils.init(Test.bArrFld, false);
        FuzzerUtils.init(Test.dArrFld, -1.67134);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i2, int i3) {

        int i4=-5, i5=124, i6=-14, i7=88, iArr[]=new int[N];
        float f1=-15.271F;
        short s=8832;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 4979929902150393755L);
        FuzzerUtils.init(iArr, -34568);

        for (long l2 : lArr) {
            for (i4 = 1; 4 > i4; ++i4) {
                for (i6 = 1; 2 > i6; i6++) {
                    f1 += i6;
                    i3 += i6;
                    i5 = i6;
                    i3 += (1 + (i6 * i6));
                    if (Test.bFld) {
                        iArr[i4 + 1] = i7;
                        lArr = lArr;
                    } else {
                        try {
                            i5 = (iArr[i6 + 1] / i4);
                            i3 = (-87864837 / i7);
                            i7 = (2773 / i3);
                        } catch (ArithmeticException a_e) {}
                        f1 += (((i6 * Test.instanceCount) + i7) - f1);
                        Test.instanceCount += (long)2.149F;
                        i2 = s;
                    }
                    i3 = 81;
                }
            }
        }
        vMeth1_check_sum += i2 + i3 + i4 + i5 + i6 + i7 + Float.floatToIntBits(f1) + s + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(long l1, int i, int i1) {

        long l3=42126L;
        int i9=8, i10=3, iArr1[]=new int[N];
        byte by=105;
        float f2=-1.563F;

        FuzzerUtils.init(iArr1, 12);

        vMeth1(i1, 220);
        i = i1;
        for (int i8 : iArr1) {
            l1 >>= i8;
            i = i;
            iArr1[(-45 >>> 1) % N] += 53154;
            for (l3 = 1; l3 < 4; ++l3) {
                i10 = 1;
                do {
                    i8 *= i1;
                    by += (byte)(((i10 * i10) + i10) - i);
                    try {
                        i9 = (i / 770641243);
                        i9 = (-1598909269 % i1);
                        i = (-356817691 / i8);
                    } catch (ArithmeticException a_e) {}
                    i8 += (i10 - Test.instanceCount);
                    i += i10;
                    i -= (int)f2;
                    iArr1[i10] = i1;
                } while (++i10 < 2);
            }
        }
        vMeth_check_sum += l1 + i + i1 + l3 + i9 + i10 + by + Float.floatToIntBits(f2) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vSmallMeth(long l, float f, double d) {

        int i11=113;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -2109130305L);

        vMeth(l, i11, i11);
        lArr1[(i11 >>> 1) % N] += i11;
        vSmallMeth_check_sum += l + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i11 +
            FuzzerUtils.checkSum(lArr1);
    }

    public void mainTest(String[] strArr1) {

        double d1=-92.18150, d2=0.111221;
        int i12=81, i13=-10594, i14=13, i15=0, i16=108, i17=-35045, i18=-4062, i19=55334, i20=35391;
        short s1=-15714;

        Test.bFld = (((--iFld) + (iFld * -73.930F)) != (Test.instanceCount ^= (-1774794316L - (138 - (iFld *
            Test.instanceCount)))));
        for (int smallinvoc=0; smallinvoc<584; smallinvoc++) vSmallMeth(Test.instanceCount, Test.fFld, 0.72487);
        for (d1 = 4; d1 < 216; ++d1) {
            iFld *= (int)Test.instanceCount;
            Test.instanceCount = s1;
            i12 -= i12;
        }
        iArrFld[(iFld >>> 1) % N] = -45;
        for (i13 = 14; i13 < 332; i13++) {
            d2 *= Test.instanceCount;
            for (i15 = 4; i15 < 79; i15++) {
                iFld += i13;
                try {
                    i16 = (iArrFld[i13 + 1] / i12);
                    i16 = (i15 % -170);
                    i16 = (-116 / i16);
                } catch (ArithmeticException a_e) {}
                if (false) break;
            }
            for (i17 = 1; i17 < 79; i17++) {
                i12 = (int)-2.71713;
                Test.lArrFld = Test.lArrFld;
                i18 = (int)Test.instanceCount;
                switch ((i17 % 10) + 83) {
                case 83:
                    iFld *= (int)Test.instanceCount;
                    for (i19 = 1; i19 < 2; i19++) {
                        Test.instanceCount &= Test.instanceCount;
                        Test.bArrFld[i13 - 1] = Test.bFld;
                        i18 += (57530 + (i19 * i19));
                        Test.instanceCount *= i13;
                        Test.instanceCount = -43045L;
                        i12 += i19;
                        iFld |= i13;
                        Test.fFld += (i19 * i19);
                        i18 += (((i19 * Test.instanceCount) + Test.fFld) - Test.instanceCount);
                    }
                    i16 >>= i17;
                    break;
                case 84:
                    i18 += (30017 + (i17 * i17));
                case 85:
                    iArrFld[i13] <<= s1;
                    break;
                case 86:
                    i14 = i20;
                    break;
                case 87:
                case 88:
                    Test.dArrFld[i13] = i15;
                case 89:
                    d2 -= iFld1;
                    break;
                case 90:
                case 91:
                    Test.instanceCount = Test.instanceCount;
                    break;
                case 92:
                    Test.instanceCount += Test.instanceCount;
                    break;
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  vMeth1 ->  vMeth1 vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
