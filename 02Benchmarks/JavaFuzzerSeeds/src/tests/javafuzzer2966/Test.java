package tests.javafuzzer2966;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 00:02:18 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-7283455887269284829L;
    public static short sFld=-24874;
    public static byte byFld=57;
    public static boolean bFld=true;
    public static int iFld=-61;
    public int iFld1=120;
    public static long lArrFld[]=new long[N];
    public static short sArrFld[]=new short[N];
    public static byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -2465347387L);
        FuzzerUtils.init(Test.sArrFld, (short)-14307);
        FuzzerUtils.init(Test.byArrFld, (byte)57);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static double dMeth(long l1, int i1, int i2) {

        int i3=42, i4=-5, i5=-104, i6=30212, i7=13, i8=8, iArr[]=new int[N];
        float f1=-101.857F;
        long l2=65450L;

        FuzzerUtils.init(iArr, -9);

        for (i3 = 7; i3 < 321; ++i3) {
            i1 -= i2;
            switch ((i3 % 1) + 75) {
            case 75:
                l1 += Test.sFld;
                f1 += ((long)i3 | (long)i3);
                Test.byFld >>= (byte)i2;
                break;
            }
            switch (((-6 >>> 1) % 7) + 120) {
            case 120:
            case 121:
                for (i5 = 1; i5 < 5; i5++) {
                    iArr = iArr;
                    i4 -= (int)-1.27150;
                    l2 = Test.instanceCount;
                    Test.sFld += (short)(i5 | (long)f1);
                }
                for (i7 = 1; i7 < 5; i7++) {
                    l2 += (i7 + i4);
                    i1 += (((i7 * Test.instanceCount) + l2) - i4);
                }
            case 122:
                i6 |= i6;
            case 123:
                f1 -= i4;
                break;
            case 124:
                Test.sFld = (short)f1;
            case 125:
                i8 = Test.sFld;
                break;
            case 126:
                i2 += i3;
                break;
            }
        }
        long meth_res = l1 + i1 + i2 + i3 + i4 + Float.floatToIntBits(f1) + i5 + i6 + l2 + i7 + i8 +
            FuzzerUtils.checkSum(iArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth() {

        int i10=-3, i11=13, i12=22045, i13=-24299, i14=8, i15=1, i16=-4509, i17=-6609, i18=6, iArr1[]=new int[N];
        float f2=-67.185F;
        boolean b=true;

        FuzzerUtils.init(iArr1, -13);

        Test.instanceCount += (long)dMeth(Test.instanceCount, 55597, i10);
        iArr1[(i10 >>> 1) % N] -= i10;
        for (i11 = 11; i11 < 251; i11++) {
            i12 = i10;
            i12 |= i11;
        }
        f2 -= i11;
        for (i13 = 9; i13 < 160; i13++) {
            Test.bFld = Test.bFld;
            for (i15 = 10; i15 > 1; --i15) {
                if (b) continue;
                for (i17 = 1; i17 < 2; i17++) {
                    Test.instanceCount += (((i17 * Test.sFld) + Test.instanceCount) - i14);
                    Test.lArrFld[i15 - 1] &= i10;
                    iArr1[i17] *= i15;
                    f2 = i16;
                }
            }
        }
        vMeth_check_sum += i10 + i11 + i12 + Float.floatToIntBits(f2) + i13 + i14 + i15 + i16 + (b ? 1 : 0) + i17 + i18
            + FuzzerUtils.checkSum(iArr1);
    }

    public static void vSmallMeth(long l, int i, double d) {

        float f3=1.397F;

        vMeth();
        Test.instanceCount = (long)f3;
        vSmallMeth_check_sum += l + i + Double.doubleToLongBits(d) + Float.floatToIntBits(f3);
    }

    public void mainTest(String[] strArr1) {

        double d1=-1.17064;
        int i19=-3, i20=9, i21=-13, i22=217, i23=-6651, iArr2[]=new int[N], iArr3[]=new int[N];
        float f4=-125.402F, fArr[]=new float[N];
        long l3=2L;

        FuzzerUtils.init(fArr, -14.189F);
        FuzzerUtils.init(iArr2, 173);
        FuzzerUtils.init(iArr3, 59);

        for (float f : fArr) {
            for (int smallinvoc=0; smallinvoc<62; smallinvoc++) vSmallMeth(Test.instanceCount, Test.iFld, d1);
            Test.iFld *= Test.iFld;
            for (i19 = 63; 1 < i19; i19--) {
                f = (float)d1;
                i20 -= i20;
                Test.iFld += (int)f;
                for (f4 = 1; f4 < 2; f4++) {
                    switch ((int)((f4 * 5) + 45)) {
                    case 177:
                        switch (((i21 >>> 1) % 8) + 79) {
                        case 79:
                            Test.instanceCount += (long)f4;
                            break;
                        case 80:
                            d1 *= f4;
                            switch ((int)((f4 % 2) + 55)) {
                            case 55:
                                switch (((i21 >>> 1) % 1) + 22) {
                                case 22:
                                    i20 <<= (int)Test.instanceCount;
                                    iArr2[(int)(f4)] <<= -14915;
                                    i21 += (int)Test.instanceCount;
                                    i20 += (int)(((f4 * i20) + i22) - i19);
                                    break;
                                default:
                                    i22 += (5 + (f4 * f4));
                                }
                                iArr2[(int)(f4)] *= iFld1;
                                iArr2[i19] = Test.byFld;
                                break;
                            case 56:
                                Test.sArrFld[i19 + 1] = (short)iFld1;
                                d1 = f;
                                Test.lArrFld[(int)(f4)] += 183;
                                break;
                            default:
                                i21 |= iFld1;
                                f *= i22;
                                Test.instanceCount -= Test.instanceCount;
                                if (Test.bFld) continue;
                            }
                            Test.instanceCount = i21;
                            i20 += (int)(f4 + i21);
                            break;
                        case 81:
                            i22 <<= i20;
                            break;
                        case 82:
                            Test.bFld = Test.bFld;
                            break;
                        case 83:
                            if (Test.bFld) break;
                            break;
                        case 84:
                            i20 += (int)((long)f4 ^ i22);
                            break;
                        case 85:
                            Test.byArrFld[(int)(f4)] >>= (byte)i22;
                            break;
                        case 86:
                            d1 += Test.byFld;
                            break;
                        default:
                            Test.instanceCount += (long)f4;
                        }
                        break;
                    case 285:
                        Test.iFld >>= i21;
                        break;
                    case 269:
                        i20 -= (int)2L;
                        break;
                    case 59:
                    case 392:
                        iFld1 = (int)Test.instanceCount;
                        break;
                    case 257:
                        iFld1 += (int)(f4 - iFld1);
                        break;
                    case 181:
                        iFld1 += (int)d1;
                        break;
                    case 370:
                        if (Test.bFld) break;
                    case 120:
                        Test.instanceCount = Test.iFld;
                        break;
                    case 303:
                        Test.iFld += (40766 + (f4 * f4));
                        break;
                    case 291:
                        i22 = iFld1;
                    case 275:
                    case 148:
                        Test.iFld += (int)(((f4 * i20) + f4) - i21);
                        break;
                    case 282:
                        Test.iFld += iFld1;
                        break;
                    case 53:
                        l3 >>= iFld1;
                        break;
                    case 199:
                        f = i20;
                        break;
                    case 248:
                        Test.lArrFld[i19] *= -4L;
                        break;
                    case 301:
                        i21 -= (int)f;
                        break;
                    case 84:
                        l3 = Test.sFld;
                    case 383:
                        iArr2[(int)(f4)] >>>= Test.iFld;
                        break;
                    case 309:
                        i22 = Test.byFld;
                        break;
                    case 229:
                        d1 += d1;
                        break;
                    case 260:
                        fArr = fArr;
                        break;
                    case 281:
                        iFld1 = (int)d1;
                        break;
                    case 216:
                        if (Test.bFld) continue;
                        break;
                    case 290:
                        d1 += f4;
                        break;
                    case 228:
                        l3 = Test.instanceCount;
                    case 218:
                        iFld1 = Test.sFld;
                        break;
                    case 247:
                        f *= i20;
                        break;
                    case 264:
                        Test.iFld = 2252;
                        break;
                    case 172:
                        i20 += (int)(f4 * Test.instanceCount);
                        break;
                    case 387:
                        i21 >>= iFld1;
                        break;
                    case 204:
                        iArr2[i19 - 1] -= (int)d1;
                        break;
                    case 345:
                        Test.lArrFld[(int)(f4)] += l3;
                        break;
                    case 322:
                    case 142:
                        i22 = (int)Test.instanceCount;
                    case 237:
                        Test.sFld |= (short)Test.iFld;
                        break;
                    case 220:
                        Test.iFld -= iFld1;
                        break;
                    case 292:
                        Test.iFld += iFld1;
                        break;
                    case 81:
                        Test.lArrFld[(int)(f4)] += l3;
                    case 124:
                        Test.sFld += (short)(f4 * f4);
                    case 386:
                        d1 -= Test.instanceCount;
                        break;
                    case 205:
                    case 103:
                        Test.iFld *= (int)2829416387L;
                        break;
                    case 276:
                        i22 += (int)(-85.670F + (f4 * f4));
                        break;
                    case 71:
                        if (Test.bFld) continue;
                        break;
                    case 179:
                        f += (((f4 * Test.instanceCount) + Test.sFld) - iFld1);
                        break;
                    case 238:
                    case 259:
                        iArr2[i19 + 1] <<= i22;
                        break;
                    case 318:
                        f += 8080652352236896829L;
                        break;
                    case 339:
                        if (Test.bFld) continue;
                        break;
                    case 92:
                        iArr3[(int)(f4 - 1)] += -202;
                    case 86:
                        i20 >>= (int)Test.instanceCount;
                        break;
                    case 354:
                        Test.iFld += i20;
                        break;
                    case 161:
                        iFld1 += iFld1;
                        break;
                    case 110:
                        l3 = 152L;
                        break;
                    case 67:
                        i20 += (int)(f4 - i22);
                        break;
                    case 188:
                        Test.instanceCount >>= i21;
                        break;
                    case 286:
                        iFld1 += (int)(((f4 * l3) + i23) - f);
                        break;
                    case 244:
                        i22 += (int)(f4 * f4);
                        break;
                    case 349:
                        i21 = i19;
                        break;
                    case 261:
                        iArr2 = iArr3;
                        break;
                    case 170:
                        if (Test.bFld) break;
                        break;
                    case 65:
                        iFld1 <<= i20;
                        break;
                    case 58:
                        if (Test.bFld) break;
                        break;
                    case 389:
                        Test.sFld += (short)i20;
                    case 187:
                        l3 += Test.instanceCount;
                        break;
                    case 165:
                        Test.instanceCount += (long)52.98115;
                        break;
                    case 379:
                        try {
                            iFld1 = (i22 / 55441);
                            i22 = (i20 / iFld1);
                            i23 = (125 / iArr3[(int)(f4 - 1)]);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 75:
                        iArr2[(int)(f4)] %= (int)(i20 | 1);
                        break;
                    default:
                        Test.sFld = (short)-45;
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  dMeth ->  dMeth vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}