package tests.javafuzzer729;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 08:42:41 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=163L;
    public static int iFld=12;
    public static volatile short sFld=-18667;
    public static float fFld=114.177F;
    public byte byFld=117;
    public static volatile boolean bFld=true;
    public static int iArrFld[][]=new int[N][N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 0);
        FuzzerUtils.init(Test.fArrFld, 0.288F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        boolean b=false;
        int i4=0, i5=-20, i6=27320, i7=196, i8=9, i9=-9, i10=-19, i11=-8;
        float f1=83.954F;
        short s=-9509;

        b = false;
        Test.iFld = (int)Test.instanceCount;
        Test.iFld += (int)Test.instanceCount;
        Test.iFld -= (int)-197L;
        for (i4 = 6; i4 < 398; ++i4) {
            Test.iArrFld[i4][i4] = i5;
            Test.instanceCount += (((i4 * i4) + f1) - i5);
            f1 -= i5;
        }
        for (i6 = 17; i6 < 276; ++i6) {
            s = (short)Test.instanceCount;
        }
        for (i8 = 8; i8 < 148; i8++) {
            for (i10 = 1; i10 < 11; ++i10) {
                i11 = i10;
                i5 |= (int)Test.instanceCount;
                i7 *= (int)Test.instanceCount;
            }
        }
        vMeth2_check_sum += (b ? 1 : 0) + i4 + i5 + Float.floatToIntBits(f1) + i6 + i7 + s + i8 + i9 + i10 + i11;
    }

    public static void vMeth1() {

        int i3=0, i12=-13, i13=-2, i14=-62617;
        float f2=-1.884F;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 0.23806);

        i3 = 191;
        while ((i3 -= 3) > 0) {
            vMeth2();
        }
        Test.iFld ^= Test.iFld;
        i12 = 1;
        do {
            Test.instanceCount = 24215L;
            Test.fArrFld[i12 + 1] -= i12;
            Test.sFld >>= (short)Test.iFld;
            for (i13 = i12; i13 < 7; i13++) {
                try {
                    Test.iFld = (i12 / i3);
                    Test.iFld = (i12 / -108997148);
                    i14 = (i3 % 18274);
                } catch (ArithmeticException a_e) {}
                dArr[i12 + 1] += i13;
                Test.iArrFld[i13 - 1][i13 + 1] -= (int)-108377274L;
            }
            Test.iFld = (int)3214879991098975839L;
            f2 -= i3;
            i14 -= (int)Test.instanceCount;
            Test.instanceCount &= i12;
        } while (++i12 < 248);
        vMeth1_check_sum += i3 + i12 + i13 + i14 + Float.floatToIntBits(f2) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth(int i1, int i2) {

        int i15=-119, i16=124, i17=9685, i18=-26809, i19=217, i20=48, i21=226, i22=-4;
        byte by=-32;

        i1 = (i2++);
        vMeth1();
        for (i15 = 9; 242 > i15; ++i15) {
            i17 = 1;
            while (++i17 < 7) {
                i2 *= i17;
                for (i18 = i15; i18 < 1; ++i18) {
                    i1 -= i15;
                }
                switch ((i15 % 2) + 69) {
                case 69:
                    for (i20 = 1; 1 > i20; i20++) {
                        Test.iArrFld[i15 - 1][i17 + 1] += i19;
                        i19 = by;
                        Test.iArrFld[i15 + 1][i17 - 1] -= i2;
                        Test.sFld -= (short)i15;
                        Test.instanceCount = i22;
                        Test.fArrFld[i17] -= i21;
                    }
                    break;
                case 70:
                    i19 += (i17 ^ i2);
                }
            }
        }
        vMeth_check_sum += i1 + i2 + i15 + i16 + i17 + i18 + i19 + i20 + i21 + by + i22;
    }

    public void mainTest(String[] strArr1) {

        float f=-51.778F;
        int i=205, i23=6, i24=20102, i25=-223, i26=-74, i27=3, iArr[]=new int[N];
        double d=0.38412;
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr, 187);
        FuzzerUtils.init(sArr, (short)3947);

        if (Test.bFld) {
            for (f = 14; f < 229; ++f) {
                try {
                    i = (-1847265297 % i);
                    i = (iArr[(int)(f + 1)] % iArr[(int)(f + 1)]);
                    iArr[(int)(f - 1)] = (i / iArr[(int)(f)]);
                } catch (ArithmeticException a_e) {}
                vMeth(97, i);
                i += i;
                Test.fFld += Test.fFld;
                for (i23 = 6; i23 < 117; ++i23) {
                    try {
                        i24 = (130 / i23);
                        Test.iFld = (i / i23);
                        i24 = (i24 % 234);
                    } catch (ArithmeticException a_e) {}
                    Test.instanceCount <<= i25;
                    if (Test.bFld) {
                        for (i26 = 1; i26 < 2; ++i26) {
                            i24 += (2 + (i26 * i26));
                            Test.instanceCount = 252;
                            Test.iFld = (int)f;
                            i >>= -8;
                            Test.iFld >>>= Test.iFld;
                            Test.iArrFld[i26][i26] = (int)f;
                            Test.fFld += (i26 * i26);
                            i25 += (((i26 * i26) + i27) - i23);
                            if (false) {
                                Test.instanceCount += i26;
                            } else {
                                iArr[i23 + 1] ^= i25;
                                sArr[i23 - 1] += (short)Test.fFld;
                                Test.iFld <<= (int)Test.instanceCount;
                                byFld -= (byte)i24;
                            }
                            Test.sFld *= (short)i24;
                        }
                        d = i27;
                    }
                    Test.iFld = (int)Test.instanceCount;
                    i25 -= (int)-8890596791922301078L;
                    Test.fArrFld[(int)(f)] += i;
                }
            }
        } else {
            Test.iFld = i26;
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
