package tests.javafuzzer3398;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 07:25:48 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=5407L;
    public int iFld=-10;
    public short sFld=-12459;
    public static float fFld=0.380F;
    public static volatile double dFld=-101.80213;
    public static boolean bFld=false;
    public volatile byte byFld=-115;
    public static long lArrFld[]=new long[N];
    public static boolean bArrFld[]=new boolean[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 28487L);
        FuzzerUtils.init(Test.bArrFld, false);
        FuzzerUtils.init(Test.iArrFld, -60501);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i4=12, i5=2331, i6=1, i7=0, i8=6, i9=-62, iArr[]=new int[N];
        double d=9.119747;
        byte by=54;
        boolean b=true;
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr, -1330);
        FuzzerUtils.init(fArr, 1.91F);

        iArr[(i4 >>> 1) % N] = (int)d;
        i4 /= (int)(i4 | 1);
        i5 = 1;
        while (++i5 < 185) {
            i4 = (int)Test.fFld;
            i4 = by;
            Test.instanceCount = Test.instanceCount;
            switch ((i5 % 1) + 65) {
            case 65:
                fArr[i5 + 1] *= Test.fFld;
                switch ((i5 % 4) + 43) {
                case 43:
                    i4 += i5;
                    for (i6 = i5; 9 > i6; i6++) {
                        for (i8 = i6; i8 < 1; ++i8) {
                            if (b) {
                                Test.instanceCount += (11 + (i8 * i8));
                            } else if (true) {
                                Test.lArrFld[i6] += 172L;
                            } else {
                                if (i8 != 0) {
                                }
                            }
                        }
                    }
                    break;
                case 44:
                case 45:
                    Test.bArrFld[i5 - 1] = b;
                    break;
                case 46:
                    i7 += i5;
                    break;
                default:
                    i4 += (i5 ^ i7);
                }
                break;
            default:
                Test.fFld += Test.fFld;
            }
        }
        long meth_res = i4 + Double.doubleToLongBits(d) + i5 + by + i6 + i7 + i8 + i9 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public long lMeth(long l1, int i2, int i3) {

        int i10=-76, i11=-30066, i12=202, i13=-54843, i14=22096;
        boolean b1=true;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)17283);

        iMeth();
        i3 *= i3;
        i2 = 2821;
        try {
            for (i10 = 8; i10 < 230; ++i10) {
                Test.iArrFld = Test.iArrFld;
                if (b1) {
                    for (i12 = 1; i12 < 7; ++i12) {
                        i14 = 2;
                        while (--i14 > 0) {
                            Test.lArrFld[i10] <<= i13;
                            i3 = (int)l1;
                            if (b1) {
                                Test.iArrFld[i12] += i10;
                                Test.iArrFld[i12 - 1] <<= (int)Test.instanceCount;
                                Test.iArrFld[i10 - 1] -= sFld;
                            } else if (b1) {
                                Test.iArrFld[i10 + 1] -= i3;
                            } else {
                                i13 >>= sFld;
                            }
                        }
                    }
                }
            }
        }
        catch (ArithmeticException exc2) {
            sArr[(i11 >>> 1) % N] -= (short)i3;
        }
        catch (UserDefinedExceptionTest exc3) {
            l1 += i14;
        }
        long meth_res = l1 + i2 + i3 + i10 + i11 + i12 + i13 + i14 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(sArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void vMeth(long l) {

        long l2=3332859512L;
        int i15=1, i16=-52, i17=9, i18=12, i19=3, i20=-243;
        byte by1=121, byArr[]=new byte[N];
        double d1=2.116641;

        FuzzerUtils.init(byArr, (byte)-88);

        sFld += (short)(Math.min(lMeth(l, -112, iFld), l2) - -98.65197);
        for (i15 = 10; i15 < 162; i15++) {
            Test.iArrFld[i15] /= (int)(i15 | 1);
            if (iFld != 0) {
                vMeth_check_sum += l + l2 + i15 + i16 + by1 + i17 + i18 + i19 + i20 + Double.doubleToLongBits(d1) +
                    FuzzerUtils.checkSum(byArr);
                return;
            }
            switch (((i15 >>> 1) % 3) + 100) {
            case 100:
                by1 = (byte)Test.instanceCount;
            case 101:
                Test.fFld += iFld;
            case 102:
                for (i17 = 1; i17 < 10; i17++) {
                    byArr[i17 + 1] |= (byte)13;
                    Test.fFld = i15;
                    i16 += (i17 | by1);
                }
                for (i19 = 1; i19 < 10; i19++) {
                    d1 = iFld;
                    i16 -= i19;
                }
                break;
            default:
                i20 |= (int)l2;
            }
        }
        vMeth_check_sum += l + l2 + i15 + i16 + by1 + i17 + i18 + i19 + i20 + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(byArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-9, i1=-210, i21=196, i22=54280, i23=106, i24=-37909, i25=10, i26=6959;
        float f=-1.140F, fArr1[]=new float[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -2.91262);
        FuzzerUtils.init(fArr1, -63.557F);

        dArr[(iFld >>> 1) % N] += (iFld--);
        if (Test.bFld) {
            for (i = 12; i < 287; i += 3) {
                vMeth(Test.instanceCount);
                for (i21 = 275; i21 > i; --i21) {
                    i1 <<= (int)Test.instanceCount;
                }
                iFld = -246;
                for (i23 = 10; i23 < 275; ++i23) {
                    iFld *= (int)Test.instanceCount;
                    switch ((i23 * 5) + 73) {
                    case 289:
                        Test.iArrFld[i23 - 1] += (int)Test.instanceCount;
                        for (f = 1; f < 2; f++) {
                            Test.instanceCount = 79;
                            Test.iArrFld[i23 + 1] = i21;
                            i25 += (int)f;
                            if (false) continue;
                            Test.iArrFld[i - 1] >>= 15241;
                            i22 = 14;
                            i25 <<= (int)Test.instanceCount;
                        }
                        iFld *= (int)f;
                        break;
                    case 92:
                        Test.instanceCount += (((i23 * i25) + i21) - i);
                        i24 = (int)Test.dFld;
                        i24 = (int)Test.instanceCount;
                        i22 -= (int)Test.instanceCount;
                        break;
                    case 176:
                        i22 = (int)Test.instanceCount;
                        Test.iArrFld[i + 1] = (int)Test.fFld;
                        break;
                    case 296:
                        Test.bFld = Test.bFld;
                    case 292:
                        i1 = byFld;
                        break;
                    case 394:
                        Test.iArrFld[i23 + 1] -= i23;
                        Test.iArrFld[i23 - 1] = (int)Test.dFld;
                        break;
                    case 123:
                        i24 &= i1;
                        break;
                    case 136:
                    case 240:
                        i1 >>>= i24;
                    case 171:
                        iFld += i23;
                        break;
                    case 185:
                        iFld += i25;
                        break;
                    case 337:
                        byFld += (byte)(i23 * Test.instanceCount);
                        break;
                    case 291:
                        Test.iArrFld[i - 1] = i21;
                        break;
                    case 104:
                        i1 = 92;
                        break;
                    case 158:
                        Test.fFld += (((i23 * Test.instanceCount) + i21) - i22);
                    case 189:
                        Test.iArrFld[i] &= 2636;
                        break;
                    case 364:
                        Test.fFld = i23;
                        break;
                    case 142:
                        sFld = (short)i1;
                        break;
                    case 135:
                        if (Test.bFld) break;
                        break;
                    case 383:
                        i26 -= iFld;
                        break;
                    case 208:
                        sFld = (short)i22;
                    case 93:
                        Test.fFld -= i1;
                        break;
                    case 149:
                    case 231:
                        iFld &= i1;
                        break;
                    case 375:
                        Test.dFld = Test.fFld;
                        break;
                    case 329:
                        i22 += (((i23 * i25) + i21) - iFld);
                        break;
                    case 124:
                        Test.instanceCount <<= i25;
                    case 169:
                        iFld += (i23 | i26);
                    case 421:
                        i25 += (int)Test.fFld;
                        break;
                    case 308:
                        byFld -= (byte)Test.dFld;
                        break;
                    case 253:
                        iFld += (i23 * i23);
                        break;
                    case 322:
                        Test.instanceCount *= (long)Test.dFld;
                    case 318:
                        Test.instanceCount >>= 85;
                    case 399:
                    case 226:
                        i26 += (i23 * i22);
                        break;
                    case 342:
                    case 232:
                        Test.instanceCount = i23;
                        break;
                    case 264:
                        Test.instanceCount = Test.instanceCount;
                        break;
                    case 324:
                        i24 += (0 + (i23 * i23));
                        break;
                    case 111:
                        Test.iArrFld[i + 1] = i23;
                        break;
                    case 190:
                        Test.instanceCount = 102;
                    case 300:
                        i1 += (i23 | iFld);
                    case 194:
                        fArr1[i + 1] = Test.instanceCount;
                    case 237:
                        Test.iArrFld[i23 + 1] >>>= iFld;
                    case 77:
                        Test.instanceCount += (4 + (i23 * i23));
                    case 293:
                        byFld *= (byte)i23;
                        break;
                    case 263:
                        Test.iArrFld[i23] = (int)Test.instanceCount;
                        break;
                    case 313:
                    case 369:
                    case 269:
                        Test.fFld += (i23 - Test.instanceCount);
                        break;
                    case 145:
                        Test.instanceCount *= iFld;
                        break;
                    case 191:
                        iFld = i;
                    case 172:
                        Test.instanceCount += i1;
                        break;
                    case 295:
                        fArr1[i23] = Test.fFld;
                        break;
                    case 159:
                        sFld *= (short)Test.instanceCount;
                        break;
                    case 224:
                        i25 -= i26;
                        break;
                    case 388:
                        i1 += (44279 + (i23 * i23));
                        break;
                    case 355:
                        Test.bFld = Test.bFld;
                        break;
                    case 101:
                        i24 += (int)Test.dFld;
                    case 351:
                        iFld += (int)Test.instanceCount;
                    case 262:
                        i1 += 15341;
                        break;
                    case 243:
                        Test.iArrFld = Test.iArrFld;
                        break;
                    case 167:
                        Test.fFld += (i23 + i24);
                        break;
                    case 209:
                        Test.instanceCount -= Test.instanceCount;
                        break;
                    case 398:
                        Test.iArrFld = FuzzerUtils.int1array(N, (int)-61);
                        break;
                    case 287:
                        i26 += (i23 * i23);
                    case 249:
                        i25 += (i23 + i23);
                        break;
                    case 177:
                        byFld += (byte)(((i23 * f) + Test.instanceCount) - iFld);
                        break;
                    case 335:
                    case 386:
                        dArr[i23] -= byFld;
                        break;
                    }
                }
            }
        } else if (Test.bFld) {
            Test.instanceCount -= 1061469684912377188L;
        } else {
            dArr[(i26 >>> 1) % N] = i25;
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
class UserDefinedExceptionTest extends RuntimeException {
    public int field;
}

//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
