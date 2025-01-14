package tests.javafuzzer224;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 00:23:29 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=216L;
    public static byte byFld=4;
    public static boolean bFld=false;
    public static volatile short sFld=25369;
    public int iFld=11;
    public float fFld=2.151F;
    public static volatile int iFld1=-78;
    public static volatile int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 149);
        FuzzerUtils.init(Test.fArrFld, -1.423F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i4) {

        boolean b=true;
        short s=12575;
        double d=1.7400;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -51.369F);

        Test.instanceCount *= -5;
        i4 = i4;
        for (int i5 : Test.iArrFld) {
            if (b) continue;
            fArr[(i4 >>> 1) % N] -= i5;
            Test.instanceCount = s;
            d = 4;
            do {
                i5 = (int)1.483F;
                i4 &= i4;
            } while ((d -= 2) > 0);
            Test.instanceCount = i4;
            s <<= (short)-4664978920296010027L;
            i4 = i4;
            if (i4 != 0) {
                vMeth2_check_sum += i4 + (b ? 1 : 0) + s + Double.doubleToLongBits(d) +
                    Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                return;
            }
        }
        Test.byFld <<= (byte)i4;
        i4 -= (int)Test.instanceCount;
        vMeth2_check_sum += i4 + (b ? 1 : 0) + s + Double.doubleToLongBits(d) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth1(int i3) {

        int i6=29, i7=53800, i8=-13, i9=42905, i10=-125;
        float f=0.450F;
        double d1=0.56874;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-32);

        vMeth2(-180);
        for (i6 = 7; i6 < 156; i6++) {
            for (f = 1; f < 11; ++f) {
                Test.instanceCount = Test.instanceCount;
                i7 += (int)f;
                byArr = byArr;
                i8 <<= i3;
                i7 = i7;
                byArr[i6 - 1] >>>= (byte)i3;
            }
            Test.iArrFld[i6 - 1] = i7;
            for (i9 = 1; i9 < 11; ++i9) {
                try {
                    i10 = (-55529 / i8);
                    Test.iArrFld[i9] = (Test.iArrFld[i9 + 1] % i3);
                    i7 = (i8 / i9);
                } catch (ArithmeticException a_e) {}
                if (Test.bFld) continue;
                d1 -= i9;
                i10 ^= (int)Test.instanceCount;
            }
        }
        vMeth1_check_sum += i3 + i6 + i7 + Float.floatToIntBits(f) + i8 + i9 + i10 + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(byArr);
    }

    public void vMeth(int i, long l, int i1) {

        int i2=246, i11=-22, i12=25, i13=6, i14=-21740;
        float f1=-73.116F;

        i2 = 1;
        do {
            if (true) {
                vMeth1(-49862);
                i = Test.byFld;
            } else if (false) {
                for (i11 = 1; i11 < 8; ++i11) {
                    for (i13 = 2; i13 > 1; i13--) {
                        f1 *= Test.instanceCount;
                        if (Test.bFld) {
                            f1 *= 4629;
                            Test.instanceCount += i13;
                            i14 = Test.sFld;
                            vMeth_check_sum += i + l + i1 + i2 + i11 + i12 + i13 + i14 + Float.floatToIntBits(f1);
                            return;
                        } else if (false) {
                            i14 = (int)f1;
                            if (true) {
                                i14 <<= i11;
                                Test.iArrFld[i13] += Test.sFld;
                            } else if (Test.bFld) {
                                Test.iArrFld[i11 - 1] = i11;
                                vMeth_check_sum += i + l + i1 + i2 + i11 + i12 + i13 + i14 + Float.floatToIntBits(f1);
                                return;
                            } else if (Test.bFld) {
                                i14 -= (int)f1;
                                vMeth_check_sum += i + l + i1 + i2 + i11 + i12 + i13 + i14 + Float.floatToIntBits(f1);
                                return;
                            }
                        }
                    }
                }
            }
        } while (++i2 < 193);
        vMeth_check_sum += i + l + i1 + i2 + i11 + i12 + i13 + i14 + Float.floatToIntBits(f1);
    }

    public void mainTest(String[] strArr1) {

        int i15=-4, i16=99, i17=64528, i18=98, i19=-55;
        double d2=-2.72366, dArr[][]=new double[N][N];
        boolean bArr[][]=new boolean[N][N];

        FuzzerUtils.init(dArr, 68.84226);
        FuzzerUtils.init(bArr, true);

        vMeth(i15, Test.instanceCount, i15);
        switch ((((i15 >>> 1) % 4) * 5) + 120) {
        case 132:
            Test.iArrFld[(i15 >>> 1) % N] = i15;
            i15 >>= (int)219L;
            Test.sFld = (short)i15;
            break;
        case 125:
            Test.sFld *= (short)d2;
            d2 -= Test.instanceCount;
            i15 = i15;
            for (i16 = 1; i16 < 364; i16++) {
                i17 += i16;
                i17 = i16;
                i17 <<= i17;
                i15 += iFld;
                switch ((i16 * 5) + 78) {
                case 253:
                    i17 = i17;
                    Test.instanceCount >>= -42;
                    Test.instanceCount <<= Test.instanceCount;
                    break;
                case 379:
                case 220:
                    i15 = (int)d2;
                    break;
                case 323:
                    try {
                        i15 = (Test.iArrFld[i16 + 1] % 228);
                        i15 = (i17 / i16);
                        i17 = (i17 / -7118);
                    } catch (ArithmeticException a_e) {}
                    for (i18 = 1; i18 < 69; i18 += 3) {
                        iFld -= (int)d2;
                        Test.instanceCount >>= -3;
                        i15 *= (int)Test.instanceCount;
                    }
                    Test.sFld >>= (short)i17;
                    break;
                case 260:
                    d2 += -63923;
                    if (Test.bFld) {
                        switch (((i15 >>> 1) % 6) + 43) {
                        case 43:
                            fFld -= Test.instanceCount;
                        case 44:
                            i15 >>>= i15;
                            Test.bFld = Test.bFld;
                            break;
                        case 45:
                        case 46:
                            Test.instanceCount = iFld;
                        case 47:
                            i17 *= (int)fFld;
                        case 48:
                            dArr[i16 + 1][i16 + 1] = 5L;
                            break;
                        default:
                            Test.byFld += (byte)(((i16 * fFld) + fFld) - Test.byFld);
                        }
                    } else if (Test.bFld) {
                        Test.iArrFld[i16] = i15;
                    } else {
                        i15 = i18;
                    }
                case 410:
                    fFld = iFld;
                    break;
                case 113:
                    Test.byFld = (byte)141;
                case 222:
                    iFld -= (int)d2;
                    break;
                case 309:
                    Test.iArrFld[i16 + 1] -= (int)Test.instanceCount;
                    break;
                case 358:
                case 187:
                    Test.instanceCount += i16;
                    break;
                case 264:
                    Test.iFld1 -= (int)-2.6950;
                    break;
                case 317:
                    Test.iArrFld[i16] += (int)fFld;
                    break;
                case 284:
                case 283:
                case 370:
                    i17 += (i16 ^ iFld);
                case 98:
                    i19 -= i18;
                    break;
                case 156:
                    iFld += i16;
                case 349:
                    iFld = (int)-57L;
                    break;
                case 420:
                    i17 += (int)d2;
                    break;
                case 111:
                    Test.fArrFld[i16] = fFld;
                case 381:
                case 271:
                    fFld *= Test.iFld1;
                    break;
                case 343:
                    i17 += i18;
                    break;
                case 334:
                    Test.iFld1 *= (int)d2;
                    break;
                case 319:
                    i17 += i18;
                    break;
                case 152:
                    d2 = Test.sFld;
                case 175:
                    i19 = Test.sFld;
                    break;
                case 373:
                    Test.iArrFld = Test.iArrFld;
                    break;
                case 418:
                    Test.instanceCount += (((i16 * Test.instanceCount) + fFld) - iFld);
                    break;
                case 79:
                    if (Test.bFld) break;
                case 235:
                    Test.iArrFld[i16 - 1] -= i17;
                case 135:
                    Test.instanceCount += (0 + (i16 * i16));
                case 327:
                    Test.sFld = (short)-24680;
                    break;
                case 419:
                case 285:
                    Test.iArrFld[i16 - 1] += i19;
                case 180:
                    Test.iArrFld[i16] -= (int)fFld;
                    break;
                case 226:
                    iFld = (int)Test.instanceCount;
                case 189:
                    d2 -= Test.iFld1;
                    break;
                case 231:
                    i19 += Test.iFld1;
                case 310:
                    Test.instanceCount -= iFld;
                    break;
                case 236:
                case 138:
                    Test.iArrFld[i16 - 1] <<= Test.iFld1;
                    break;
                case 402:
                    fFld /= (i16 | 1);
                    break;
                case 282:
                    try {
                        i15 = (i16 % 38077);
                        i17 = (177 / i19);
                        Test.iArrFld[i16 + 1] = (i19 % -43978);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 421:
                    Test.instanceCount <<= Test.instanceCount;
                    break;
                case 228:
                    iFld += (i16 * i16);
                    break;
                case 340:
                    bArr[i16 - 1] = bArr[i16];
                case 281:
                    i15 += i15;
                    break;
                case 178:
                    i19 = Test.iFld1;
                    break;
                case 316:
                    Test.instanceCount = Test.instanceCount;
                case 142:
                    i19 += (((i16 * i15) + Test.instanceCount) - i19);
                    break;
                case 199:
                case 365:
                    i17 = (int)-1258480653L;
                    break;
                case 289:
                    Test.iFld1 = iFld;
                    break;
                case 375:
                    i19 = (int)-41.109053;
                    break;
                case 143:
                    Test.iFld1 *= Test.byFld;
                    break;
                case 322:
                    i19 *= Test.byFld;
                    break;
                case 385:
                    iFld = 55519;
                case 293:
                    i15 += (i16 * i16);
                    break;
                case 237:
                    iFld <<= i19;
                case 279:
                    i17 = -104;
                    break;
                case 254:
                    fFld -= i15;
                case 364:
                    iFld += i18;
                    break;
                case 314:
                    fFld *= fFld;
                case 121:
                    Test.iArrFld[i16 - 1] = (int)fFld;
                case 132:
                    Test.bFld = Test.bFld;
                case 118:
                    i19 += (((i16 * iFld) + i17) - Test.byFld);
                    break;
                case 104:
                    i15 >>= Test.iFld1;
                case 95:
                    i15 >>= Test.iFld1;
                }
            }
        case 140:
        case 128:
            fFld = i16;
        default:
            Test.iArrFld[(i19 >>> 1) % N] = (int)d2;
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
