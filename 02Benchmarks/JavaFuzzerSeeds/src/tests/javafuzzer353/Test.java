package tests.javafuzzer353;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 02:37:22 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-38458L;
    public static double dFld=2.122322;
    public static int iFld=-88;
    public static short sFld=-30398;
    public static int iArrFld[][]=new int[N][N];
    public static int iArrFld1[]=new int[N];
    public static short sArrFld[][]=new short[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, -233);
        FuzzerUtils.init(Test.iArrFld1, 3);
        FuzzerUtils.init(Test.sArrFld, (short)-2092);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i2=-27888, i3=49, i4=-14, i5=0, i6=-10, i7=-13;
        boolean b1=false;
        long l2=-2598530493L, lArr[]=new long[N];

        FuzzerUtils.init(lArr, -248L);

        Test.instanceCount = -38941;
        i2 = 1;
        while (++i2 < 395) {
            Test.iArrFld[i2][i2 + 1] = -31045;
            for (i3 = 4; i3 > 1; i3 -= 3) {
                for (i5 = 1; i5 < 4; ++i5) {
                    Test.dFld = Test.instanceCount;
                }
            }
            i4 = (int)Test.instanceCount;
            i4 += Test.iFld;
            Test.instanceCount >>>= i2;
            Test.iArrFld[i2 + 1][i2 - 1] >>= (int)-8L;
            b1 = b1;
            for (l2 = 1; 4 > l2; l2++) {
                try {
                    i6 = (31512 / Test.iArrFld[(int)(l2 - 1)][i2 + 1]);
                    i4 = (Test.iArrFld[i2 + 1][i2 - 1] % Test.iFld);
                    i4 = (Test.iArrFld[i2 + 1][i2] / Test.iArrFld[(int)(l2 - 1)][(int)(l2)]);
                } catch (ArithmeticException a_e) {}
                Test.instanceCount += (l2 - Test.instanceCount);
            }
        }
        lArr[(i2 >>> 1) % N] *= 3812;
        vMeth1_check_sum += i2 + i3 + i4 + i5 + i6 + (b1 ? 1 : 0) + l2 + i7 + FuzzerUtils.checkSum(lArr);
    }

    public static long lMeth() {

        boolean b=true;
        int i1=44212, i8=29099, i9=5, i10=-16332, i12=7, i13=-59815;
        long l3=1056363620L, lArr1[]=new long[N];
        float f2=0.103F, fArr[][]=new float[N][N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-103);
        FuzzerUtils.init(lArr1, 12L);
        FuzzerUtils.init(fArr, -23.629F);

        b = b;
        i1 -= (int)Test.dFld;
        vMeth1();
        for (l3 = 2; l3 < 155; l3++) {
            Test.iFld = Test.iFld;
            for (i9 = 1; i9 < 10; ++i9) {
                byArr[i9 - 1] += (byte)39116L;
            }
            Test.instanceCount *= i10;
            if (i9 != 0) {
            }
            lArr1[(int)(l3 - 1)] = i9;
            i8 = 0;
            for (i12 = (int)(l3); i12 < 10; i12++) {
                i13 *= (int)11880L;
                f2 += i12;
                fArr[(int)(l3 + 1)][(int)(l3 - 1)] -= Test.iFld;
            }
        }
        long meth_res = (b ? 1 : 0) + i1 + l3 + i8 + i9 + i10 + i12 + i13 + Float.floatToIntBits(f2) +
            FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(lArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(long l, float f1, long l1) {

        int i=10, i14=8086, i15=-19776, i16=29346, i17=108, i18=60764, i19=-210, iArr[]=new int[N];
        byte by1=-61;
        boolean b2=true;
        float fArr1[]=new float[N];

        FuzzerUtils.init(iArr, 4);
        FuzzerUtils.init(fArr1, 0.89F);

        i += i;
        i = (int)(-(iArr[(i >>> 1) % N] >> lMeth()));
        Test.iFld = -46285;
        for (i14 = 372; i14 > 16; --i14) {
            for (i16 = 1; i16 < 5; ++i16) {
                switch ((i16 % 2) + 64) {
                case 64:
                    i18 = 1;
                    do {
                        switch (((i16 % 9) * 5) + 18) {
                        case 24:
                            i15 = -4;
                            Test.sArrFld = FuzzerUtils.short2array(N, (short)-19790);
                            f1 += (9 + (i18 * i18));
                            i15 = 20;
                        case 49:
                            Test.instanceCount = Test.sFld;
                            Test.iArrFld[i16 - 1][i14 + 1] *= i14;
                            i += i18;
                            break;
                        case 63:
                            i17 = Test.iFld;
                            break;
                        case 39:
                            Test.iFld *= (int)Test.dFld;
                        case 43:
                            Test.iArrFld[i16] = Test.iArrFld[i14 + 1];
                            break;
                        case 40:
                            i19 = by1;
                            break;
                        case 28:
                            Test.iFld += (i18 - i14);
                            break;
                        case 48:
                            l1 = i18;
                            break;
                        case 42:
                            fArr1[i16 + 1] -= i19;
                            break;
                        default:
                            Test.iFld += (i18 * i18);
                        }
                    } while (++i18 < 2);
                    break;
                case 65:
                    if (b2) continue;
                    break;
                }
            }
        }
        vMeth_check_sum += l + Float.floatToIntBits(f1) + l1 + i + i14 + i15 + i16 + i17 + i18 + i19 + by1 + (b2 ? 1 :
            0) + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public void mainTest(String[] strArr1) {

        float f=-34.778F;
        byte by=-62;
        double d=-109.18464;
        int i20=-8, i21=-59794, i22=-26691, i23=-176, i24=7299, i25=10;
        boolean b3=true;

        f = Math.abs((int)(Test.instanceCount * (by - 4875238325484069587L)));
        if (b3) {
            vMeth(Test.instanceCount, f, Test.instanceCount);
            if (true) {
                Test.iFld -= (int)Test.instanceCount;
            } else {
                Test.iFld += (int)304398922235761022L;
                Test.instanceCount -= Test.iFld;
                for (d = 2; d < 179; d++) {
                    Test.dFld += Test.iFld;
                    for (i21 = 8; i21 < 142; i21++) {
                        switch ((((172 >>> 1) % 3) * 5) + 88) {
                        case 91:
                            i22 = i21;
                            Test.instanceCount += (i21 - Test.instanceCount);
                            i23 = 1;
                            do {
                                Test.instanceCount += i23;
                            } while (++i23 < 2);
                            Test.dFld /= (i22 | 1);
                            break;
                        case 99:
                            Test.iArrFld[(int)(d)][(int)(d)] += (int)Test.instanceCount;
                            for (i24 = 1; i24 < 2; i24++) {
                                Test.instanceCount = (long)Test.dFld;
                                Test.dFld += -16405;
                                switch (((210 >>> 1) % 5) + 73) {
                                case 73:
                                    Test.iFld >>= (int)Test.instanceCount;
                                    i25 -= 18315;
                                    break;
                                case 74:
                                    i22 *= Test.iFld;
                                    i20 = (int)Test.instanceCount;
                                    Test.sFld += (short)i25;
                                    i25 -= (int)58418L;
                                    break;
                                case 75:
                                    Test.instanceCount += (-13355 + (i24 * i24));
                                    i20 = (int)Test.instanceCount;
                                    Test.iFld *= 74;
                                    break;
                                case 76:
                                    i25 >>>= i23;
                                case 77:
                                    Test.dFld *= i20;
                                }
                            }
                        case 103:
                            Test.sArrFld[(int)(d)][(int)(d)] = (short)Test.iFld;
                            break;
                        }
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
