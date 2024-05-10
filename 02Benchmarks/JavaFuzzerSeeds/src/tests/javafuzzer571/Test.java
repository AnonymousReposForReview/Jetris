package tests.javafuzzer571;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 06:04:23 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=2289572694L;
    public static short sFld=4788;
    public double dFld=-2.33001;
    public static double dFld1=31.125543;
    public static boolean bFld=true;
    public static byte byFld=43;
    public static float fArrFld[]=new float[N];
    public static volatile long lArrFld[]=new long[N];
    public int iArrFld[]=new int[N];
    public double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 84.844F);
        FuzzerUtils.init(Test.lArrFld, -218L);
    }

    public static long iMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public int iMeth(long l, short s, int i3) {


        i3 += (i3++);
        long meth_res = l + s + i3;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(int i11, int i12) {

        int i13=-236, i14=-26950, i15=217, i16=-20220, iArr1[]=new int[N];
        boolean b=true;

        FuzzerUtils.init(iArr1, -8);

        i12 <<= i12;
        Test.instanceCount >>= i12;
        Test.instanceCount *= i12;
        i12 = i12;
        i13 = 1;
        while (++i13 < 234) {
            iArr1[i13 - 1] = (int)249L;
            i12 += i13;
            i11 -= 35411;
            i11 += (i13 - i12);
            if (b) {
                i14 = 1;
                do {
                    for (i15 = 1; 1 > i15; i15++) {
                        Test.lArrFld[i15 - 1] <<= -51571;
                        if (b) continue;
                        i16 += (((i15 * i15) + Test.instanceCount) - i13);
                    }
                } while (++i14 < 7);
            }
        }
        long meth_res = i11 + i12 + i13 + i14 + i15 + i16 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i10) {

        float f=-2.562F;
        int i17=-10719, i18=-2, i19=-3, iArr2[]=new int[N];

        FuzzerUtils.init(iArr2, -8195);

        f *= (i10 * lMeth(i10, i10));
        Test.dFld1 -= Test.instanceCount;
        i17 = 1;
        while (++i17 < 356) {
            for (i18 = 5; 1 < i18; --i18) {
                Test.instanceCount += i18;
                i10 *= -27210;
                Test.dFld1 += i18;
                iArr2[i17 + 1] -= -206;
                iArr2[i17] <<= i18;
                switch (((i18 % 2) * 5) + 5) {
                case 8:
                    Test.instanceCount += (i18 + Test.instanceCount);
                    i19 -= (int)Test.instanceCount;
                    break;
                case 13:
                    if (Test.bFld) break;
                default:
                    i19 = i19;
                }
                i19 *= Test.sFld;
            }
        }
        vMeth_check_sum += i10 + Float.floatToIntBits(f) + i17 + i18 + i19 + FuzzerUtils.checkSum(iArr2);
    }

    public float fMeth() {

        int i6=28218, i7=-13, i8=-237, i9=8, i20=-8, i21=-10, iArr[]=new int[N];
        float f1=-86.87F;

        FuzzerUtils.init(iArr, 16376);

        for (i6 = 282; 13 < i6; i6--) {
            for (i8 = 6; i8 > 1; --i8) {
                dFld = iMeth((long)((i9 * dFld) + iArr[i6 - 1]), (short)(Test.sFld--), i8);
                vMeth(-54149);
                f1 += -101;
                Test.bFld = Test.bFld;
                switch (((i8 % 4) * 5) + 83) {
                case 86:
                    for (i20 = 1; i20 < 2; ++i20) {
                        switch (((i6 % 7) * 5) + 107) {
                        case 133:
                            i7 = (int)f1;
                            f1 += i20;
                            i7 += (-35263 + (i20 * i20));
                            Test.dFld1 = Test.instanceCount;
                            break;
                        case 117:
                            i9 *= i8;
                            f1 -= Test.sFld;
                            break;
                        case 109:
                            i7 -= i7;
                            break;
                        case 115:
                        case 110:
                            if (Test.bFld) continue;
                            break;
                        case 130:
                            Test.instanceCount *= -127;
                            break;
                        case 121:
                            Test.sFld = Test.sFld;
                            break;
                        }
                    }
                case 99:
                    i7 = (int)Test.instanceCount;
                    break;
                case 84:
                    i9 *= i7;
                    break;
                case 93:
                    i21 = i8;
                    break;
                default:
                    i21 = i6;
                }
            }
        }
        long meth_res = i6 + i7 + i8 + i9 + Float.floatToIntBits(f1) + i20 + i21 + FuzzerUtils.checkSum(iArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-1, i1=122, i2=6532, i4=22, i5=13, i22=-68, i23=-3, i24=5;
        float f2=107.711F;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-36);

        Test.sFld = (short)(-(-3 + (i--)));
        for (i1 = 5; i1 < 204; i1++) {
            iMeth(Test.instanceCount, Test.sFld, (int)(dFld - Test.instanceCount));
            i4 = 1;
            do {
                Test.fArrFld[i4 - 1] = (i - i);
                i += i4;
                Test.instanceCount -= (long)(((i1 * Test.instanceCount) + (-98 - (i5 + i1))) + fMeth());
                Test.instanceCount += (i4 * i4);
                f2 = i2;
                i22 = 1;
                do {
                    if (Test.bFld) continue;
                    i2 ^= (int)-106L;
                    i2 = i1;
                    try {
                        iArrFld[i4 - 1] = (i2 % i5);
                        iArrFld[i22] = (i4 / -36);
                        i5 = (-19784 % iArrFld[i22]);
                    } catch (ArithmeticException a_e) {}
                    Test.byFld -= (byte)i2;
                    f2 += 47687;
                    i2 = i2;
                    dArrFld[i1] = i1;
                } while (++i22 < 1);
                if (true) break;
                for (i23 = i1; i23 < 1; i23++) {
                    i5 <<= i5;
                    Test.lArrFld[i23 - 1] -= Test.byFld;
                    f2 = 199;
                    i >>= 0;
                    Test.instanceCount += (i23 * i23);
                    Test.instanceCount += (long)Test.dFld1;
                    Test.instanceCount *= 16;
                    i5 += (int)Test.instanceCount;
                }
                Test.bFld = Test.bFld;
                byArr[i4 + 1] -= (byte)Test.sFld;
            } while (++i4 < 126);
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
//DEBUG  iMeth ->  iMeth mainTest fMeth
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}