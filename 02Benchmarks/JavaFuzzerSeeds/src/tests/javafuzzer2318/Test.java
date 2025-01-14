package tests.javafuzzer2318;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 12:15:36 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=4253530035L;
    public static int iFld=41989;
    public short sFld=-2941;
    public static double dFld=66.14996;
    public static float fFld=2.366F;
    public static int iFld1=251;
    public static volatile boolean bArrFld[]=new boolean[N];
    public static int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];
    public static short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.bArrFld, false);
        FuzzerUtils.init(Test.iArrFld, 0);
        FuzzerUtils.init(Test.dArrFld, -1.126120);
        FuzzerUtils.init(Test.sArrFld, (short)13760);
    }

    public static long fMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i6) {

        int i8=-13, i9=35908, i10=10, i11=-38957;
        float f1=1.355F;
        byte by=1;

        for (int i7 : Test.iArrFld) {
            try {
                i6 = (i7 % i6);
                i7 = (Test.iFld / -53269);
                Test.iArrFld[(i7 >>> 1) % N] = (i7 % i6);
            } catch (ArithmeticException a_e) {}
            Test.instanceCount -= i6;
            for (i8 = 1; 4 > i8; i8++) {
                Test.instanceCount += (i8 - i9);
                for (i10 = 2; i10 > 1; i10 -= 2) {
                    i9 = (int)-133L;
                    Test.instanceCount += (long)f1;
                    Test.instanceCount -= by;
                    i11 += i10;
                    i7 = (int)f1;
                }
                switch (((i8 % 2) * 5) + 95) {
                case 100:
                    f1 = i11;
                    Test.iFld -= (int)Test.instanceCount;
                    Test.iFld = i8;
                case 102:
                    f1 = Test.instanceCount;
                    break;
                default:
                    f1 *= Test.instanceCount;
                }
            }
        }
        vMeth_check_sum += i6 + i8 + i9 + i10 + i11 + Float.floatToIntBits(f1) + by;
    }

    public static double dMeth(short s, int i5) {

        boolean b=true;
        int i12=-23063, i13=251, i14=-6529, i15=-134, i16=-213, i17=0, i18=13;
        byte by1=25;
        short sArr[]=new short[N];
        long lArr[]=new long[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(sArr, (short)6261);
        FuzzerUtils.init(lArr, -4188897463L);
        FuzzerUtils.init(fArr, 0.960F);

        b = b;
        vMeth(Test.iFld);
        try {
            for (short s1 : sArr) {
                i12 = 1;
                do {
                    for (i13 = 1; i13 < 1; ++i13) {
                        i5 = i14;
                        i5 |= by1;
                        Test.iArrFld[i13] = 56;
                        Test.instanceCount >>= 0;
                        lArr[i12] *= i12;
                        switch ((i13 * 5) + 111) {
                        case 212:
                            Test.dFld = i5;
                            Test.fFld += -13802;
                            Test.instanceCount -= i12;
                            break;
                        case 226:
                            i14 += (i13 * i13);
                            break;
                        case 373:
                            try {
                                i5 = (i12 % 50288);
                                i14 = (54358 / i5);
                                i14 = (569442052 / i12);
                            } catch (ArithmeticException a_e) {}
                            break;
                        case 264:
                            Test.iFld = i5;
                        case 199:
                            Test.iArrFld[i13] >>= Test.iFld;
                            break;
                        case 366:
                            i14 = (int)Test.instanceCount;
                            break;
                        case 440:
                            i5 += i13;
                            break;
                        case 286:
                            if (true) continue;
                            break;
                        case 171:
                            Test.iFld -= by1;
                            break;
                        case 428:
                            i15 = i12;
                            break;
                        case 318:
                        case 304:
                            b = b;
                            break;
                        case 342:
                            sArr[i12 - 1] = (short)i13;
                        case 246:
                            i14 = 60379;
                            break;
                        case 405:
                            b = b;
                            break;
                        case 408:
                            Test.iFld += (16484 + (i13 * i13));
                        case 291:
                            i14 |= i15;
                            break;
                        case 390:
                            i14 += (11598 + (i13 * i13));
                            break;
                        case 251:
                            fArr[i12 + 1] -= Test.fFld;
                            break;
                        case 365:
                            Test.instanceCount <<= i15;
                            break;
                        case 150:
                            i14 &= i12;
                            break;
                        case 348:
                            i14 += i13;
                            break;
                        case 184:
                            Test.dArrFld[i12] = -178;
                            break;
                        case 220:
                            s += (short)i5;
                            break;
                        case 427:
                            i5 = by1;
                            break;
                        case 209:
                            fArr[i13] += Test.instanceCount;
                            break;
                        case 371:
                            if (b) break;
                            break;
                        case 119:
                            i15 -= i15;
                        case 215:
                            Test.dArrFld[i12 + 1] += i5;
                            break;
                        case 183:
                            Test.iArrFld[i13] = i16;
                            break;
                        case 238:
                            i14 = (int)1386696317L;
                        case 414:
                            i15 = Test.iFld1;
                            break;
                        case 437:
                            Test.iArrFld[i13 - 1] *= i12;
                            break;
                        case 177:
                            Test.fFld = i15;
                            break;
                        case 381:
                            Test.dFld -= 7360858953896301246L;
                            break;
                        case 146:
                            Test.iArrFld[i12 - 1] -= (int)Test.instanceCount;
                            break;
                        case 156:
                            Test.dArrFld[i13] = i14;
                            break;
                        case 449:
                            i15 = 45135;
                            break;
                        case 344:
                            Test.instanceCount <<= -4;
                            break;
                        case 328:
                            i14 += (i13 * i13);
                            break;
                        case 254:
                            Test.instanceCount -= (long)Test.fFld;
                        case 317:
                            i5 += (i13 + i5);
                        case 138:
                            Test.iArrFld[i12 + 1] *= i13;
                            break;
                        case 372:
                            fArr[i12 + 1] *= i17;
                        case 224:
                            Test.iArrFld[i12] += i13;
                            break;
                        case 393:
                            i15 <<= i13;
                            break;
                        case 410:
                            Test.instanceCount <<= -7L;
                            break;
                        case 203:
                            i17 >>>= i5;
                            break;
                        case 368:
                            Test.dFld = i17;
                        case 234:
                            i5 <<= i5;
                            break;
                        case 362:
                            i17 <<= -7476;
                            break;
                        case 123:
                            Test.iFld1 += (((i13 * Test.instanceCount) + Test.fFld) - i17);
                            break;
                        case 308:
                            Test.fFld = i14;
                            break;
                        case 272:
                            i14 *= (int)Test.dFld;
                            break;
                        case 135:
                            Test.iFld1 += i12;
                            break;
                        case 459:
                            i15 *= i17;
                            break;
                        case 331:
                            Test.instanceCount += Test.iFld1;
                        case 190:
                            s -= (short)i17;
                        case 143:
                            by1 += (byte)(((i13 * i15) + Test.instanceCount) - i5);
                            break;
                        case 208:
                            Test.iArrFld[i12] = by1;
                            break;
                        case 350:
                            Test.fFld += (((i13 * i16) + Test.instanceCount) - i15);
                            break;
                        case 455:
                            Test.bArrFld[i12 + 1] = b;
                        case 397:
                            Test.iFld1 = i15;
                            break;
                        case 296:
                            Test.iFld = (int)Test.instanceCount;
                            break;
                        case 363:
                            Test.iArrFld[i13 + 1] ^= i16;
                            break;
                        case 323:
                            i14 = -11;
                        case 353:
                            try {
                                i15 = (i16 % 170);
                                i17 = (Test.iFld1 / i18);
                                Test.iFld = (i15 % -242);
                            } catch (ArithmeticException a_e) {}
                        case 420:
                            i5 += (-10350 + (i13 * i13));
                            break;
                        case 271:
                            Test.fFld -= -98;
                            break;
                        case 429:
                            Test.iArrFld = Test.iArrFld;
                            break;
                        default:
                            Test.fFld += i18;
                        }
                    }
                } while (++i12 < 4);
            }
        }
        catch (ArithmeticException exc1) {
            i15 -= (int)-7303987640483717013L;
        }
        long meth_res = s + i5 + (b ? 1 : 0) + i12 + i13 + i14 + by1 + i15 + i16 + i17 + i18 +
            FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public float fMeth() {

        float f=1.338F, f2=2.786F;
        int i2=-3, i3=-22141, i4=-87, i19=-10, i20=-10354, iArr[]=new int[N];
        boolean b1=false;

        FuzzerUtils.init(iArr, -42801);

        iArr = (iArr = (iArr = (iArr = iArr)));
        for (f = 7; f < 163; f++) {
            for (i3 = 1; i3 < 10; i3++) {
                switch ((((((int)(i2 * Test.instanceCount)) >>> 1) % 9) * 5) + 90) {
                case 122:
                    Test.iFld -= (int)dMeth(sFld, 0);
                    switch ((((Test.iFld >>> 1) % 10) * 5) + 83) {
                    case 100:
                        Test.instanceCount >>>= -12;
                        Test.iFld += (((i3 * f) + Test.iFld) - i2);
                        if (b1) break;
                    case 128:
                        for (i19 = 1; i19 < 2; ++i19) {
                            b1 = b1;
                            Test.sArrFld[i19] = (short)Test.instanceCount;
                            Test.instanceCount *= i3;
                            i2 += (int)Test.instanceCount;
                            Test.dFld *= 5503;
                        }
                        break;
                    case 124:
                        if (b1) break;
                        break;
                    case 129:
                        Test.instanceCount >>= 5360;
                        break;
                    case 85:
                        i4 += (int)27583L;
                        break;
                    case 105:
                        Test.fFld += (((i3 * Test.fFld) + Test.iFld1) - Test.iFld1);
                        break;
                    case 123:
                        Test.instanceCount >>= i20;
                        break;
                    case 84:
                        Test.fFld = -115;
                        break;
                    case 90:
                        i4 += (((i3 * Test.iFld) + i20) - f);
                    case 107:
                    }
                    break;
                case 111:
                    Test.iArrFld[(int)(f)] *= (int)f2;
                case 103:
                    b1 = b1;
                    break;
                case 97:
                    Test.instanceCount -= (long)Test.fFld;
                    break;
                case 100:
                    i2 += (i3 - i3);
                case 118:
                    Test.iFld += i3;
                case 96:
                    if (b1) continue;
                    break;
                case 107:
                    if (Test.iFld1 != 0) {
                    }
                    break;
                case 93:
                    i4 += (i3 ^ i19);
                    break;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f) + i2 + i3 + i4 + (b1 ? 1 : 0) + i19 + i20 + Float.floatToIntBits(f2) +
            FuzzerUtils.checkSum(iArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d=1.72769, d1=27.98962;
        int i=19, i1=97, i21=-11, i22=15064, i23=10, i24=-17682, i25=-48, i26=-14, i27=-1, i28=-23320, i29=-9981,
            iArr1[]=new int[N];
        byte by2=61, byArr[]=new byte[N];
        float fArr1[]=new float[N];

        FuzzerUtils.init(fArr1, 2.343F);
        FuzzerUtils.init(byArr, (byte)-25);
        FuzzerUtils.init(iArr1, 241);

        Test.instanceCount *= Test.iFld;
        d += Test.instanceCount;
        for (i = 2; i < 177; ++i) {
            Test.iFld += (i * i);
            if (Test.bArrFld[i + 1]) continue;
        }
        sFld += (short)Float.intBitsToFloat((int)(fMeth() * -7));
        Test.dArrFld[(Test.iFld >>> 1) % N] *= 8;
        i21 = 1;
        while (++i21 < 293) {
            Test.iFld1 += (i21 | Test.iFld);
            Test.iFld1 -= i;
        }
        Test.fFld = -12;
        Test.dArrFld = Test.dArrFld;
        for (d1 = 2; d1 < 342; d1++) {
            Test.instanceCount ^= 146;
            for (i23 = (int)(d1); i23 < 74; ++i23) {
                i1 = i21;
                Test.dFld += d;
            }
            for (i25 = 1; 74 > i25; ++i25) {
                byArr[(int)(d1)] *= (byte)i21;
                switch ((int)((d1 % 6) + 87)) {
                case 87:
                    Test.iArrFld[(int)(d1)] <<= (int)Test.instanceCount;
                    Test.iFld += (((i25 * i23) + by2) - i23);
                    i27 += (((i25 * i24) + i26) - Test.instanceCount);
                    break;
                case 88:
                    i1 += i27;
                    break;
                case 89:
                    Test.iFld |= (int)Test.instanceCount;
                    Test.fFld += (i25 * i25);
                    i26 += 10;
                    break;
                case 90:
                    for (i28 = 2; i28 > 1; i28 -= 3) {
                        i24 += (int)(0.717F + (i28 * i28));
                        byArr[i28 + 1] = (byte)Test.iFld;
                    }
                    break;
                case 91:
                    Test.fFld += (i25 + i23);
                case 92:
                    Test.fFld -= i28;
                    break;
                default:
                    iArr1 = Test.iArrFld;
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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  dMeth ->  dMeth fMeth mainTest
//DEBUG  vMeth ->  vMeth dMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
