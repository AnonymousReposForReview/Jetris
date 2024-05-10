package tests.javafuzzer203;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 00:08:57 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-46476L;
    public static volatile int iFld=-51266;
    public static short sFld=32353;
    public static double dFld=1.104150;
    public static float fFld=18.403F;
    public boolean bFld=false;
    public static volatile int iArrFld[]=new int[N];
    public double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 253);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i5=-23, i6=12, i7=51575, i8=-62358, i9=-83;
        long l1=42701L, lArr[]=new long[N];
        float f=38.671F;
        double d=-38.46289;
        byte by=-100;
        boolean b=true;

        FuzzerUtils.init(lArr, -183L);

        for (i5 = 165; i5 > 10; i5 -= 2) {
            if (b) {
                for (l1 = 1; 20 > l1; ++l1) {
                    f += i5;
                    i6 += i7;
                }
            } else if (b) {
                switch (((i5 % 2) * 5) + 96) {
                case 97:
                    d += -195;
                    i6 %= (int)2026334250L;
                    break;
                case 98:
                    Test.instanceCount <<= i6;
                    switch (((i5 % 8) * 5) + 72) {
                    case 106:
                        i7 = i6;
                        Test.iArrFld[i5] -= Test.iFld;
                        for (i8 = 1; i8 < 20; i8++) {
                            by >>= (byte)i7;
                            i9 += i6;
                        }
                    case 77:
                        f *= i9;
                        break;
                    case 111:
                        d = Test.instanceCount;
                        break;
                    case 86:
                        f += 4;
                        break;
                    case 76:
                        Test.instanceCount -= Test.iFld;
                    case 101:
                    case 103:
                        Test.instanceCount = Test.instanceCount;
                    case 95:
                        i9 <<= 4;
                        break;
                    }
                    break;
                default:
                    Test.iArrFld[i5 - 1] >>= (int)l1;
                }
            } else if (b) {
                i7 = (int)l1;
            } else {
                lArr[i5 + 1] /= (Test.instanceCount | 1);
            }
        }
        vMeth1_check_sum += i5 + i6 + l1 + i7 + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i8 + i9 + by +
            (b ? 1 : 0) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i1, long l, int i2) {

        int i3=216, i4=-127, i11=-14816, i12=-3, iArr[]=new int[N];
        float f1=-2.194F;
        byte by1=77;
        boolean b1=true;
        double dArr[]=new double[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(dArr, -1.26209);
        FuzzerUtils.init(iArr, -38755);
        FuzzerUtils.init(lArr1, -1335692449L);

        i1 |= (int)(dArr[(i2 >>> 1) % N] + iArr[(i1 >>> 1) % N]);
        for (i3 = 7; i3 < 186; i3++) {
            vMeth1();
            Test.iFld -= (int)f1;
            lArr1[i3 - 1] = i3;
            Test.iFld &= Test.iFld;
            i1 += (i3 * i3);
            by1 = (byte)Test.iFld;
        }
        Test.instanceCount <<= i2;
        if (b1) {
            i2 = Test.sFld;
            for (i11 = 2; 167 > i11; i11++) {
                Test.dFld *= Test.instanceCount;
                try {
                    Test.iFld = (2975 % iArr[i11 - 1]);
                    i4 = (i12 % 4);
                    i12 = (Test.iFld % i12);
                } catch (ArithmeticException a_e) {}
                i12 >>>= (int)Test.instanceCount;
            }
        } else {
            Test.iFld -= (int)l;
        }
        vMeth_check_sum += i1 + l + i2 + i3 + i4 + Float.floatToIntBits(f1) + by1 + i11 + i12 + (b1 ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(lArr1);
    }

    public static long lMeth() {

        int i13=0, i14=42363, i15=8;
        float f2=1.106F;
        byte by2=57;
        boolean b2=false;
        long lArr2[]=new long[N];

        FuzzerUtils.init(lArr2, -132L);

        vMeth(Test.iFld, -3098591467L, Test.iFld);
        for (i13 = 9; i13 < 334; ++i13) {
            lArr2[i13] |= Test.instanceCount;
            Test.iFld *= i14;
        }
        f2 -= -4382978998974959005L;
        f2 -= Test.sFld;
        i15 = 1;
        while (++i15 < 351) {
            Test.iArrFld[i15] ^= i13;
            if (b2) {
                if (b2) {
                    Test.iFld += (((i15 * i13) + Test.instanceCount) - Test.instanceCount);
                    if (i13 != 0) {
                    }
                    Test.iFld += by2;
                    Test.iFld ^= i15;
                } else if (b2) {
                    try {
                        Test.iFld = (-6 % Test.iFld);
                        i14 = (7 / i15);
                        Test.iFld = (-35725 % i13);
                    } catch (ArithmeticException a_e) {}
                }
            }
        }
        long meth_res = i13 + i14 + Float.floatToIntBits(f2) + i15 + by2 + (b2 ? 1 : 0) + FuzzerUtils.checkSum(lArr2);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=235, i16=-133, i17=133, i18=212, i19=29772, i20=-252, i21=88, i22=13986, i23=13, i24=122, i25=-8;
        byte by3=-80, byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-87);

        i <<= (int)(Test.instanceCount++);
        i += (int)lMeth();
        i16 = 1;
        while (++i16 < 128) {
            Test.dFld -= Test.iFld;
            for (i17 = 8; i17 < 196; ++i17) {
                for (i19 = 2; i19 > i16; i19 -= 3) {
                    Test.fFld *= i17;
                    if (bFld) continue;
                }
                i18 += (((i17 * by3) + Test.iFld) - Test.instanceCount);
            }
            i20 += i16;
            Test.iArrFld[i16 + 1] = i18;
            i18 -= (int)700270816008934436L;
            Test.fFld -= by3;
            for (i21 = 6; i21 < 196; ++i21) {
                if (true) break;
                Test.iFld <<= Test.iFld;
                i18 *= i17;
                Test.sFld = (short)i16;
            }
            switch (((i16 % 4) * 5) + 62) {
            case 74:
                for (i23 = 12; i23 < 196; i23++) {
                    bFld = true;
                    byArr[i16 + 1] = (byte)i20;
                    bFld = bFld;
                }
                Test.fFld = 496063409389515652L;
                switch ((i16 % 7) + 97) {
                case 97:
                    try {
                        Test.iArrFld[i16 - 1] = (-19924 / i24);
                        i20 = (i23 % 128);
                        i24 = (i16 / -13780);
                    } catch (ArithmeticException a_e) {}
                    i25 = 1;
                    while ((i25 += 2) < 196) {
                        Test.iArrFld[(i20 >>> 1) % N] = Test.iFld;
                        Test.iArrFld[i25 - 1] = i23;
                    }
                    Test.fFld *= -7;
                case 98:
                    i22 *= i;
                    break;
                case 99:
                    Test.iArrFld[(139 >>> 1) % N] = i20;
                case 100:
                    i24 = (int)Test.dFld;
                    break;
                case 101:
                    Test.instanceCount >>= Test.instanceCount;
                    break;
                case 102:
                    i -= (int)29.30012;
                    break;
                case 103:
                    i22 |= i19;
                    break;
                default:
                    Test.instanceCount = i18;
                }
                break;
            case 76:
                Test.iArrFld[i16 + 1] += by3;
                break;
            case 65:
                dArrFld[i16 - 1] = 79.82522;
                break;
            case 66:
                Test.fFld += (((i16 * Test.sFld) + i19) - i21);
                break;
            default:
                i *= i;
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}