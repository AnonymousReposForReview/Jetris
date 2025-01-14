package tests.javafuzzer1085;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 14:16:22 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2598416293L;
    public volatile byte byFld=-32;
    public static short sFld=10187;
    public static volatile double dFld=2.12731;
    public static float fFld=23.730F;
    public static boolean bFld=false;
    public static int iArrFld[]=new int[N];
    public static byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -10038);
        FuzzerUtils.init(Test.byArrFld, (byte)53);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i4, byte by, short s) {

        int i5=13, i6=36219, i7=55027, i8=-1, i9=-6, i10=-41271;
        boolean b=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 989530535L);

        for (i5 = 16; i5 < 322; i5++) {
            for (i7 = 1; i7 < 5; i7++) {
                Test.iArrFld[i5] -= 2;
                Test.dFld += i7;
                i4 += i6;
                for (i9 = i7; i9 < 2; i9++) {
                    i10 <<= i8;
                    i6 *= (int)Test.instanceCount;
                    switch ((i7 % 8) + 30) {
                    case 30:
                        if (b) continue;
                        break;
                    case 31:
                        i10 -= i6;
                        Test.iArrFld[i9 + 1] += i6;
                        break;
                    case 32:
                        if (i8 != 0) {
                            vMeth2_check_sum += i4 + by + s + i5 + i6 + i7 + i8 + i9 + i10 + (b ? 1 : 0) +
                                FuzzerUtils.checkSum(lArr);
                            return;
                        }
                        break;
                    case 33:
                        i10 >>= (int)Test.instanceCount;
                        break;
                    case 34:
                        Test.dFld -= 14823;
                    case 35:
                        Test.instanceCount <<= i6;
                    case 36:
                        Test.iArrFld[i7 - 1] -= (int)Test.fFld;
                        break;
                    case 37:
                        i10 += i9;
                    }
                }
            }
        }
        vMeth2_check_sum += i4 + by + s + i5 + i6 + i7 + i8 + i9 + i10 + (b ? 1 : 0) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1() {

        int i2=-83, i3=10, i11=-46, i12=-39652;
        long l1=10113L, lArr1[]=new long[N];
        boolean b1=false;

        FuzzerUtils.init(lArr1, 2567844603L);

        for (i2 = 2; i2 < 293; ++i2) {
            byte by1=66;
            vMeth2(i2, by1, Test.sFld);
            i11 = 1;
            while (++i11 < 6) {
                Test.instanceCount += 197;
                Test.instanceCount = 90;
                for (l1 = i11; l1 < 1; ++l1) {
                    i3 = i11;
                    Test.instanceCount += Test.sFld;
                    lArr1 = lArr1;
                    lArr1[i2 + 1] >>>= by1;
                    i12 += (int)(l1 * l1);
                    if (b1) {
                        i12 -= i2;
                        i12 *= (int)-2.770F;
                    } else if (b1) {
                        by1 = (byte)l1;
                    }
                }
            }
        }
        vMeth1_check_sum += i2 + i3 + i11 + l1 + i12 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(lArr1);
    }

    public static void vMeth() {

        int i=8, i1=-4, i13=-13010, i14=0, i15=40518, i16=39;
        byte by2=45;
        float fArr[][]=new float[N][N];

        FuzzerUtils.init(fArr, 44.551F);

        for (i = 13; i < 218; ++i) {
            vMeth1();
            i1 *= i1;
            for (i13 = 1; i13 < 8; ++i13) {
                fArr[i13 + 1][i + 1] *= Test.instanceCount;
                i1 += (int)Test.dFld;
                Test.instanceCount -= Test.instanceCount;
                Test.instanceCount += Test.instanceCount;
                try {
                    i14 = (Test.iArrFld[i + 1] % -33593);
                    i1 = (i / i);
                    i14 = (Test.iArrFld[i13] / -22796);
                } catch (ArithmeticException a_e) {}
                i1 += i13;
                for (i15 = i13; i15 < 2; i15++) {
                    i14 >>>= i13;
                    if (i16 != 0) {
                        vMeth_check_sum += i + i1 + i13 + i14 + i15 + i16 + by2 +
                            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                        return;
                    }
                    by2 ^= (byte)-7;
                    Test.dFld /= (i13 | 1);
                }
            }
        }
        vMeth_check_sum += i + i1 + i13 + i14 + i15 + i16 + by2 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i17=-19161, i18=42207, i19=-38440, i20=-11;
        double d=95.34556;
        boolean b2=true;

        byFld *= (byte)Test.sFld;
        vMeth();
        i17 = 1;
        do {
            i18 += (int)0L;
            Test.sFld += (short)(i17 * i17);
            i18 += (int)Test.instanceCount;
            i18 += i17;
            i18 += (((i17 * i17) + i18) - Test.instanceCount);
            d = 1;
            while (++d < 93) {
                Test.instanceCount -= i18;
                switch (((i18 >>> 1) % 5) + 56) {
                case 56:
                    for (i19 = 1; i19 < 1; i19 += 2) {
                        Test.dFld = Test.instanceCount;
                        Test.fFld += -215;
                        Test.instanceCount += (((i19 * Test.instanceCount) + i20) - i20);
                        byFld = (byte)i20;
                        Test.bFld = Test.bFld;
                        i18 += i19;
                        Test.dFld = i18;
                        switch ((int)(((d % 1) * 5) + 100)) {
                        case 102:
                            i20 += i20;
                            Test.byArrFld[i17] = (byte)i18;
                            break;
                        default:
                            i20 -= -138;
                            i20 = (int)125.476F;
                            i20 %= (int)(i19 | 1);
                        }
                        i20 -= (int)d;
                    }
                    i18 = i18;
                    break;
                case 57:
                    try {
                        Test.iArrFld[(int)(d)] = (i20 % -26787);
                        Test.iArrFld[(int)(d + 1)] = (i18 / 40569);
                        i20 = (i20 / i17);
                    } catch (ArithmeticException a_e) {}
                    i20 = -9978;
                    Test.bFld = b2;
                case 58:
                    Test.iArrFld[(int)(d)] = (int)Test.fFld;
                case 59:
                    Test.instanceCount *= (long)Test.fFld;
                case 60:
                    byFld = (byte)i19;
                    break;
                }
            }
        } while (++i17 < 270);


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
