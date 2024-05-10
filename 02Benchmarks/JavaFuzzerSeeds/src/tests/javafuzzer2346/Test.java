package tests.javafuzzer2346;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 13:04:20 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-52742L;
    public static byte byFld=-14;
    public static float fFld=-50.533F;
    public static int iFld=-7;
    public static int iFld1=-82;
    public static short sFld=-3945;
    public double dFld=0.30168;
    public static volatile long lFld=6L;
    public static volatile int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];
    public static boolean bArrFld[]=new boolean[N];
    public static long lArrFld1[][]=new long[N][N];
    public volatile double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -13);
        FuzzerUtils.init(Test.lArrFld, -4043969081L);
        FuzzerUtils.init(Test.bArrFld, true);
        FuzzerUtils.init(Test.lArrFld1, 8042732548315788946L);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f1, int i4) {

        int i5=-205, i6=-36581, i7=-49745, i8=0, iArr[]=new int[N];
        float f2=-81.194F, fArr1[]=new float[N];
        short s1=10940;

        FuzzerUtils.init(fArr1, 85.86F);
        FuzzerUtils.init(iArr, 1);

        i4 += -95;
        i4 -= Test.byFld;
        i5 = 379;
        while ((i5 -= 3) > 0) {
            Test.instanceCount -= 0;
            Test.instanceCount *= (long)Test.fFld;
            i4 <<= (int)Test.instanceCount;
            fArr1[i5 + 1] = i5;
            i4 <<= i4;
            for (f2 = 1; f2 < 12; ++f2) {
                for (i7 = 1; i7 < 2; ++i7) {
                    i8 >>= i6;
                    i6 += i7;
                    try {
                        i4 = (i7 / -19952);
                        iArr[i5 + 1] = (i5 % i5);
                        i8 = (i6 / i7);
                    } catch (ArithmeticException a_e) {}
                    i4 = i8;
                    Test.instanceCount <<= s1;
                }
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f1) + i4 + i5 + Float.floatToIntBits(f2) + i6 + i7 + i8 + s1 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(float f, short s) {

        int i9=64129, i10=-58999, i11=-47169, i12=-25600, i13=-43988, i14=7179;
        boolean b=true;

        Test.instanceCount += (Test.instanceCount++);
        vMeth1(f, i9);
        i9 = i9;
        i10 = 1;
        while (++i10 < 243) {
            for (i11 = 1; i11 < 7; i11++) {
                Test.instanceCount -= Test.instanceCount;
                i12 <<= i10;
                Test.iArrFld[i11] += -28942;
                for (i13 = 1; 2 > i13; ++i13) {
                    i14 >>= i14;
                    f += (((i13 * i14) + i14) - i14);
                    Test.instanceCount *= i9;
                }
                Test.instanceCount = i12;
            }
            if (b) break;
            Test.iFld = Test.iFld;
        }
        vMeth_check_sum += Float.floatToIntBits(f) + s + i9 + i10 + i11 + i12 + i13 + i14 + (b ? 1 : 0);
    }

    public static long lMeth(int i2, int i3) {

        short s2=-30897;
        int i15=0, i16=26356, i17=4, i18=-6;
        double d1=-88.18760, d2=0.15269;

        vMeth(Test.fFld, s2);
        for (i15 = 5; i15 < 299; i15++) {
            i2 += (5 + (i15 * i15));
            d1 = 1;
            while (++d1 < 6) {
                for (i17 = 1; 1 < i17; i17 -= 2) {
                    Test.iFld += i15;
                    Test.lArrFld[i15 + 1] += Test.instanceCount;
                    switch (i15 % 6) {
                    case 0:
                        switch ((int)(((d1 % 5) * 5) + 4)) {
                        case 15:
                            i18 = i16;
                            break;
                        case 26:
                            Test.iFld += i17;
                            try {
                                i18 = (-24127 % i3);
                                i3 = (4121 / Test.iArrFld[i17 + 1]);
                                i2 = (Test.iFld1 / Test.iFld1);
                            } catch (ArithmeticException a_e) {}
                            Test.fFld += i3;
                            Test.instanceCount -= Test.instanceCount;
                            break;
                        case 9:
                            i3 -= i18;
                            break;
                        case 25:
                            d2 *= Test.instanceCount;
                            break;
                        case 16:
                            i3 += i17;
                            break;
                        }
                        break;
                    case 1:
                        Test.iArrFld[i15] += i15;
                        break;
                    case 2:
                        Test.iFld -= (int)d2;
                        break;
                    case 3:
                        Test.instanceCount += i17;
                        break;
                    case 4:
                        Test.instanceCount *= -2;
                    case 5:
                        i3 = s2;
                        break;
                    default:
                        if (Test.iFld != 0) {
                        }
                    }
                }
            }
        }
        long meth_res = i2 + i3 + s2 + i15 + i16 + Double.doubleToLongBits(d1) + i17 + i18 +
            Double.doubleToLongBits(d2);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-9, i1=-23, i19=25, i20=168, i21=9, i22=12, i23=-114, i24=5;
        double d=0.82463;
        float f3=110.662F, fArr[]=new float[N];
        boolean b1=true;
        long l1=-56489L;

        FuzzerUtils.init(fArr, -53.265F);

        for (i = 7; i < 176; i += 2) {
            switch (((i % 7) * 5) + 49) {
            case 76:
                Test.byFld ^= (byte)(((-3947604682L + d) + fArr[i + 1]) + i);
                Test.fFld -= ((++Test.byFld) - (lMeth(Test.iFld1, Test.iFld) - Test.instanceCount));
                break;
            case 57:
                Test.instanceCount -= (long)Test.fFld;
                break;
            case 73:
                f3 = 298;
                while ((f3 -= 3) > 0) {
                    Test.iArrFld[(int)(f3)] = Test.iFld;
                    Test.iArrFld[(int)(f3 + 1)] = -4573;
                    Test.iFld1 *= Test.sFld;
                    i1 += (int)f3;
                    dFld = Test.instanceCount;
                }
                Test.iFld1 += Test.iFld;
                Test.iFld = i;
                break;
            case 66:
                for (i19 = 298; i19 > 10; i19--) {
                    switch ((i19 * 5) + 22) {
                    case 154:
                        for (i21 = i; i21 < 2; ++i21) {
                            Test.iFld += i21;
                            Test.sFld = (short)i21;
                            i20 = -132;
                            i20 = -10302;
                            Test.byFld = (byte)i21;
                            i20 &= Test.iFld1;
                            Test.fFld = Test.byFld;
                            Test.instanceCount += 7111;
                        }
                    case 362:
                        Test.fFld += (9 + (i19 * i19));
                        for (i23 = 2; i23 > 1; i23 -= 2) {
                            Test.lArrFld[i19 - 1] <<= Test.instanceCount;
                            Test.iFld1 = (int)1.32051;
                            Test.iFld1 *= 184;
                        }
                    case 320:
                        if (false) break;
                        break;
                    case 273:
                    case 310:
                        Test.iArrFld = Test.iArrFld;
                        break;
                    case 246:
                        fArr[i19] *= Test.byFld;
                        break;
                    case 137:
                        Test.fFld -= i;
                        break;
                    case 60:
                        Test.iArrFld[i19 + 1] = i24;
                        break;
                    case 331:
                        if (b1) continue;
                        break;
                    case 325:
                        Test.instanceCount -= i20;
                        break;
                    case 228:
                        Test.instanceCount = i20;
                    case 132:
                        Test.fFld -= i1;
                        break;
                    case 317:
                        Test.iArrFld[(i23 >>> 1) % N] /= (int)(i21 | 1);
                        break;
                    case 357:
                        i1 = 3;
                        break;
                    case 104:
                    case 29:
                        Test.fFld *= 83.400F;
                        break;
                    case 270:
                        if (b1) continue;
                    case 198:
                        Test.iArrFld[i - 1] *= (int)Test.fFld;
                    case 350:
                        Test.fFld = f3;
                        break;
                    case 121:
                        Test.byFld += (byte)(i19 * i19);
                        break;
                    case 269:
                        Test.bArrFld[i19] = b1;
                    case 218:
                        dFld += i19;
                        break;
                    case 114:
                        Test.iArrFld = FuzzerUtils.int1array(N, (int)-24437);
                        break;
                    case 25:
                        if (b1) continue;
                        break;
                    case 250:
                        Test.lArrFld[i + 1] = i20;
                        break;
                    case 349:
                        Test.instanceCount += Test.instanceCount;
                        break;
                    case 355:
                        Test.iArrFld[i19 + 1] = (int)Test.instanceCount;
                    case 54:
                        i22 &= i23;
                    case 28:
                        b1 = b1;
                        break;
                    case 333:
                    case 177:
                        Test.fFld += (i19 - i23);
                        break;
                    case 251:
                        if (b1) break;
                        break;
                    case 294:
                        Test.lArrFld[i19] = i1;
                        break;
                    case 249:
                        i24 += (i19 * i19);
                        break;
                    case 220:
                        Test.sFld -= (short)0;
                        break;
                    case 107:
                        i20 = 3;
                    case 180:
                        Test.fFld = Test.fFld;
                    case 351:
                    case 167:
                        Test.lArrFld[i] %= -54377;
                        break;
                    case 171:
                    case 67:
                        i22 >>= i1;
                        break;
                    case 289:
                        i1 = -5;
                        break;
                    case 172:
                        i22 = i22;
                        break;
                    case 364:
                        i24 = Test.iFld1;
                        break;
                    case 157:
                        Test.instanceCount += (((i19 * i) + Test.fFld) - i23);
                        break;
                    case 305:
                        i20 -= Test.sFld;
                    case 330:
                        Test.sFld += (short)i19;
                        break;
                    case 205:
                        i1 += i21;
                        break;
                    case 368:
                        dFld += i24;
                        break;
                    case 225:
                        Test.instanceCount += (((i19 * Test.lFld) + f3) - Test.lFld);
                        break;
                    case 139:
                        Test.lFld <<= Test.lFld;
                    case 336:
                        i1 += (((i19 * i19) + i22) - Test.iFld);
                    case 112:
                        Test.iArrFld = FuzzerUtils.int1array(N, (int)-190);
                        break;
                    case 42:
                        Test.lArrFld[i19 + 1] = Test.iFld;
                        break;
                    case 36:
                        Test.lFld = Test.lFld;
                        break;
                    case 291:
                        Test.lArrFld1 = Test.lArrFld1;
                    case 226:
                        if (b1) break;
                        break;
                    case 268:
                        if (b1) continue;
                        break;
                    case 64:
                        Test.iArrFld[i19 + 1] = Test.sFld;
                        break;
                    case 100:
                        i20 += i19;
                    case 110:
                        Test.lFld = Test.iFld1;
                        break;
                    case 367:
                        Test.iArrFld[i19] -= i22;
                        break;
                    case 62:
                        Test.fFld = Test.fFld;
                        break;
                    case 214:
                        l1 >>= -96L;
                    case 303:
                        i1 *= i19;
                        break;
                    case 117:
                        Test.iFld1 *= (int)d;
                    case 312:
                        l1 += Test.iFld;
                    case 344:
                        i20 <<= (int)l1;
                    case 193:
                        dArrFld[i + 1] = d;
                        break;
                    case 285:
                        i22 = Test.iFld;
                        break;
                    }
                }
                break;
            case 67:
                Test.iArrFld[i] = Test.iFld;
                break;
            case 83:
                Test.iArrFld[i - 1] += (int)124L;
                break;
            case 74:
                try {
                    i20 = (9398 % i1);
                    Test.iFld1 = (Test.iArrFld[i + 1] % Test.iFld1);
                    i22 = (246 % Test.iFld1);
                } catch (ArithmeticException a_e) {}
                break;
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