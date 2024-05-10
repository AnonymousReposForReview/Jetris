package tests.javafuzzer2853;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 21:27:35 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=0L;
    public volatile byte byFld=-39;
    public static float fFld=97.721F;
    public static short sFld=17685;
    public static boolean bFld=true;
    public static int iFld=4867;
    public static long lFld=-220L;
    public static int iArrFld[]=new int[N];
    public static int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -61523);
        FuzzerUtils.init(Test.iArrFld1, 8);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(boolean b1, float f, int i11) {

        int i12=186, i13=6, i14=-12, i15=14;
        double d2=2.60283, dArr[]=new double[N];

        FuzzerUtils.init(dArr, 1.40076);

        for (i12 = 341; i12 > 13; i12 -= 3) {
            i13 = (int)Test.instanceCount;
            for (i14 = 14; 1 < i14; i14--) {
                i11 *= (int)Test.instanceCount;
                if (b1) {
                    i15 = i13;
                    i15 += i14;
                } else if (false) {
                    Test.fFld -= Test.sFld;
                    if (b1) {
                        i13 *= (int)Test.instanceCount;
                        Test.instanceCount += -1;
                        i15 -= (int)Test.instanceCount;
                        d2 = Test.instanceCount;
                    } else {
                        if (false) continue;
                    }
                    dArr = dArr;
                }
            }
        }
        long meth_res = (b1 ? 1 : 0) + Float.floatToIntBits(f) + i11 + i12 + i13 + i14 + i15 +
            Double.doubleToLongBits(d2) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        boolean b=true, bArr[][]=new boolean[N][N];
        int i7=-60711, i8=70, i9=-14897, i10=-58715, i16=23804, i17=-8917;
        double d1=-1.74444;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -240L);
        FuzzerUtils.init(bArr, true);

        b = Test.bFld;
        for (i7 = 3; i7 < 295; i7++) {
            for (i9 = 1; i9 < 6; ++i9) {
                i8 += (-62712 + (i9 * i9));
                lArr = (lArr = lArr);
            }
            bArr[i7 - 1][i7] = (((0.24068 * (d1 - i7)) + (Test.fFld++)) <= ((Test.instanceCount + d1) -
                iMeth1(Test.bFld, Test.fFld, i7)));
            Test.iArrFld = Test.iArrFld;
            Test.instanceCount <<= i10;
        }
        for (i16 = 12; i16 < 239; i16++) {
            i8 = (int)2091469805L;
            d1 += i16;
            i10 = i10;
            i10 ^= i8;
            try {
                Test.iArrFld[i16] = (64071 / i8);
                i17 = (185 / i7);
                i8 = (Test.iFld % i9);
            } catch (ArithmeticException a_e) {}
            i8 -= (int)5L;
        }
        vMeth_check_sum += (b ? 1 : 0) + i7 + i8 + i9 + i10 + Double.doubleToLongBits(d1) + i16 + i17 +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(bArr);
    }

    public static int iMeth() {

        int i3=44896, i4=7414, i5=60695, i6=-186, i18=38660, i19=41403, iArr[]=new int[N];
        byte by=112, byArr[]=new byte[N];
        double d3=2.12863;
        long lArr1[]=new long[N];
        boolean bArr1[]=new boolean[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr, -91);
        FuzzerUtils.init(lArr1, -9L);
        FuzzerUtils.init(byArr, (byte)-12);
        FuzzerUtils.init(bArr1, false);
        FuzzerUtils.init(fArr, -14.198F);

        i3 = i3;
        iArr = iArr;
        for (i4 = 4; i4 < 284; ++i4) {
            i5 += (i4 ^ Test.instanceCount);
            i6 = 1;
            do {
                Test.fFld += (-((Test.sFld--) + (138L + (-220 * (i5 * 77.298F)))));
                switch ((i6 * 5) + 70) {
                case 371:
                    i3 >>= (12 + (i3--));
                    vMeth();
                    i5 = -89;
                    switch (((i4 % 4) * 5) + 61) {
                    case 73:
                        for (i18 = 1; 1 > i18; ++i18) {
                            Test.iFld -= i19;
                            i3 *= 21;
                            if (Test.bFld) continue;
                        }
                    case 66:
                        lArr1[i6] = Test.sFld;
                        break;
                    case 70:
                        Test.fFld = Test.sFld;
                        break;
                    case 79:
                        Test.instanceCount -= i19;
                        break;
                    default:
                        Test.iArrFld[(Test.iFld >>> 1) % N] *= (int)Test.fFld;
                    }
                    break;
                case 235:
                    Test.iFld += i6;
                    break;
                case 219:
                    Test.iArrFld[i4] += -79;
                    break;
                case 96:
                    i3 = i5;
                    break;
                case 200:
                    byArr[i6] = by;
                    break;
                case 322:
                    lArr1[i4 - 1] = i18;
                    break;
                case 133:
                    Test.instanceCount += (i6 * i6);
                case 382:
                case 370:
                    if (i6 != 0) {
                    }
                case 324:
                    Test.instanceCount = Test.instanceCount;
                    break;
                case 234:
                    i19 -= i18;
                    break;
                case 326:
                    Test.instanceCount += (((i6 * Test.instanceCount) + Test.sFld) - by);
                    break;
                case 195:
                    Test.instanceCount = i19;
                case 413:
                case 191:
                    i3 = i5;
                    break;
                case 360:
                    i3 += i3;
                    break;
                case 338:
                    Test.iArrFld[i6 - 1] >>= i3;
                    break;
                case 173:
                    Test.iFld = (int)Test.instanceCount;
                    break;
                case 178:
                    if (Test.bFld) break;
                    break;
                case 116:
                    if (Test.bFld) continue;
                    break;
                case 198:
                    Test.instanceCount += i6;
                case 142:
                    if (i18 != 0) {
                    }
                    break;
                case 352:
                    Test.instanceCount -= (long)Test.fFld;
                    break;
                case 139:
                    bArr1[i6] = Test.bFld;
                case 276:
                    i3 = (int)d3;
                    break;
                case 409:
                    Test.iFld = -2;
                    break;
                case 420:
                    Test.iFld += i4;
                    break;
                case 273:
                    Test.fFld += (((i6 * i5) + Test.instanceCount) - Test.instanceCount);
                    break;
                case 184:
                    i19 -= i5;
                case 381:
                    Test.iFld = (int)Test.instanceCount;
                    break;
                case 153:
                    Test.iFld /= (int)(Test.instanceCount | 1);
                    break;
                case 264:
                    Test.instanceCount -= by;
                case 189:
                    i19 = Test.iFld;
                    break;
                case 92:
                    Test.instanceCount += (((i6 * Test.iFld) + i4) - i6);
                    break;
                case 151:
                    Test.instanceCount += (i6 | i6);
                case 258:
                    Test.instanceCount -= (long)d3;
                    break;
                case 242:
                    d3 = -2;
                case 290:
                    i3 += (((i6 * Test.instanceCount) + i18) - i6);
                    break;
                case 365:
                    Test.iArrFld1[i4 - 1] += i18;
                    break;
                case 283:
                    i19 ^= Test.iFld;
                    break;
                case 241:
                case 419:
                    Test.fFld += (i6 * i6);
                    break;
                case 73:
                    i19 += (i6 ^ i18);
                    break;
                case 207:
                    Test.iFld += (int)d3;
                case 346:
                    i3 <<= by;
                case 114:
                    Test.iArrFld1[i6 - 1] = (int)2.75F;
                case 82:
                    Test.instanceCount = Test.instanceCount;
                    break;
                case 345:
                    d3 = -110;
                    break;
                case 135:
                    Test.iFld -= by;
                    break;
                case 197:
                    Test.iArrFld1[i6 + 1] = Test.sFld;
                    break;
                case 374:
                    Test.instanceCount <<= Test.sFld;
                    break;
                case 215:
                case 107:
                    Test.iArrFld1[i4] >>>= 2;
                case 104:
                    Test.fFld -= i18;
                    break;
                case 222:
                    Test.bFld = Test.bFld;
                    break;
                case 152:
                    if (Test.bFld) break;
                    break;
                case 78:
                    d3 = Test.fFld;
                case 84:
                    Test.fFld -= -113.524F;
                case 145:
                    Test.bFld = Test.bFld;
                    break;
                case 250:
                    Test.iFld /= (int)(i4 | 1);
                case 299:
                    Test.instanceCount = Test.iFld;
                    break;
                case 83:
                    Test.iArrFld1[i4] -= i18;
                    break;
                case 397:
                    Test.instanceCount <<= 21000L;
                    break;
                case 400:
                    Test.iFld += (((i6 * i5) + Test.instanceCount) - i19);
                    break;
                case 209:
                    fArr[i6 - 1] += i6;
                case 177:
                    Test.instanceCount += 3980;
                case 127:
                case 260:
                    i5 += (i6 * i6);
                    break;
                case 331:
                    i19 += (i6 - i5);
                    break;
                case 364:
                    Test.iArrFld1[i6 + 1] += i19;
                    break;
                default:
                    i19 >>= i4;
                }
            } while (++i6 < 6);
        }
        long meth_res = i3 + i4 + i5 + i6 + i18 + i19 + by + Double.doubleToLongBits(d3) + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(bArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-21, i1=232, i2=-244, i20=58232, i21=243, i22=72, i23=-159, i24=147, i25=-28569, i26=-12;
        short s=-24087;
        double d=1.97566, d4=98.93373;
        float fArr1[]=new float[N];

        FuzzerUtils.init(fArr1, 10.504F);

        i = (int)((++i) - ((i * s) - (i += (int)d)));
        i1 = (int)88.82798;
        i = i;
        i2 = 336;
        do {
            byFld = (byte)(i1--);
            iMeth();
        } while (--i2 > 0);
        for (i20 = 8; i20 < 136; i20++) {
            i1 = (int)-29.649F;
        }
        Test.iArrFld1[(-55593 >>> 1) % N] *= i;
        Test.sFld = (short)Test.instanceCount;
        Test.lFld <<= i1;
        fArr1[(Test.iFld >>> 1) % N] += 2.901F;
        Test.lFld = i;
        for (i22 = 5; i22 < 133; i22++) {
            Test.fFld -= i22;
            for (i24 = 10; 196 > i24; ++i24) {
                s += (short)(i24 * i24);
                i += (int)-119.108368;
                i += (((i24 * i) + byFld) - i25);
                i1 += (((i24 * i20) + s) - Test.instanceCount);
            }
            d *= i21;
            i ^= -59;
            for (d4 = 1; 196 > d4; ++d4) {
                i25 %= 174;
                Test.sFld -= (short)Test.instanceCount;
                i = i22;
            }
            Test.instanceCount <<= i22;
            Test.instanceCount ^= i20;
            i1 *= i25;
            Test.fFld = Test.sFld;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}