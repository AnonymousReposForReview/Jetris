package tests.javafuzzer388;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 03:09:38 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-2945556911L;
    public static byte byFld=-80;
    public static volatile double dFld=-90.56287;
    public int iFld=-63;
    public static boolean bFld=true;
    public static volatile int iArrFld[]=new int[N];
    public short sArrFld[]=new short[N];
    public static long lArrFld[]=new long[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 10);
        FuzzerUtils.init(Test.lArrFld, 8422L);
        FuzzerUtils.init(Test.fArrFld, 48.767F);
    }

    public static long vMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(byte by, int i8, double d1) {

        int i9=25, i10=-55368, i11=-226, i12=111, i13=-51, iArr[][]=new int[N][N];
        float f1=-1.955F;
        short s=10492;

        FuzzerUtils.init(iArr, 5);

        for (i9 = 20; i9 < 358; i9++) {
            by += (byte)(i9 * i9);
            i8 -= i9;
            i11 = 1;
            while (++i11 < 5) {
                i10 -= i11;
                Test.instanceCount += (long)-2.113886;
                i10 += (((i11 * f1) + i8) - f1);
                for (i12 = 1; 1 > i12; i12 += 2) {
                    i8 = -9;
                    Test.instanceCount = i8;
                    iArr[i12][i9 + 1] -= s;
                    i8 += i12;
                    try {
                        i10 = (i10 / i8);
                        i10 = (i8 % 34342);
                        i8 = (iArr[i9][i11 + 1] % i8);
                    } catch (ArithmeticException a_e) {}
                }
                Test.instanceCount = Test.instanceCount;
                f1 = by;
            }
        }
        long meth_res = by + i8 + Double.doubleToLongBits(d1) + i9 + i10 + i11 + Float.floatToIntBits(f1) + i12 + i13 +
            s + FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static boolean bMeth(int i3) {

        int i4=27059, i5=-12513, i6=40, i7=-17916, i14=-190, iArr1[][]=new int[N][N];
        double d=2.818;
        float f2=86.252F, fArr[]=new float[N];

        FuzzerUtils.init(iArr1, -45858);
        FuzzerUtils.init(fArr, 0.525F);

        for (i4 = 2; 216 > i4; i4++) {
            for (d = 1; d < 8; ++d) {
                i6 += (int)(d * d);
                i7 = 1;
                while (++i7 < 2) {
                    lMeth(Test.byFld, i4, d);
                    Test.instanceCount <<= i7;
                    iArr1[i7 - 1][i7 + 1] >>= i7;
                    fArr[(int)(d)] -= Test.instanceCount;
                    i6 += (i7 - i6);
                    i14 &= i4;
                    Test.instanceCount <<= -12;
                    iArr1[(int)(d)] = FuzzerUtils.int1array(N, (int)0);
                    Test.instanceCount += (i7 * i7);
                }
                i3 -= -46;
                i14 += (int)(((d * f2) + Test.instanceCount) - i14);
            }
        }
        long meth_res = i3 + i4 + i5 + Double.doubleToLongBits(d) + i6 + i7 + i14 + Float.floatToIntBits(f2) +
            FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static void vMeth(int i, float f) {

        int i1=14, i2=27191, i15=-5;
        boolean b=true;
        long l=-2921750056026005462L, lArr[]=new long[N];

        FuzzerUtils.init(lArr, 7155462043588909994L);

        for (i1 = 4; 302 > i1; ++i1) {
            i2 ^= (int)Math.min(lArr[i1], --Test.instanceCount);
            if (bMeth(i) ^ b) break;
            i += 2;
            Test.instanceCount = i2;
            i15 = 1;
            do {
                switch ((((i2 >>> 1) % 2) * 5) + 74) {
                case 84:
                    l = 1;
                    while (++l < 1) {
                        Test.dFld -= 18L;
                        i2 = i1;
                        Test.iArrFld[i15] >>>= i2;
                        i *= (int)f;
                        Test.instanceCount += (long)f;
                        i2 += (int)(l ^ i1);
                        f = i2;
                    }
                    break;
                case 82:
                    i2 = 13313;
                    break;
                default:
                    lArr[i1 + 1] >>>= i;
                }
            } while (++i15 < 6);
        }
        vMeth_check_sum += i + Float.floatToIntBits(f) + i1 + i2 + (b ? 1 : 0) + i15 + l + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        float f3=0.248F;
        int i16=11, i17=-48559, i18=237, i19=-34356, i20=-4, i21=-10, i22=134, i23=-136, i24=-11, i25=231, i26=51117,
            i28=17154;
        short s1=-19541;
        long l1=-56225L;
        byte byArr[]=new byte[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(byArr, (byte)59);
        FuzzerUtils.init(bArr, false);

        vMeth(iFld, f3);
        for (i16 = 9; i16 < 307; ++i16) {
            i17 = s1;
            iFld += (((i16 * Test.byFld) + f3) - i17);
            i17 = (int)Test.instanceCount;
            i17 -= (int)Test.instanceCount;
            iFld <<= -24417;
        }
        i18 = 1;
        while (++i18 < 144) {
            Test.byFld = (byte)123.823F;
            for (i19 = 174; i19 > 3; i19--) {
                i17 /= (int)(Test.instanceCount | 1);
                f3 -= i16;
                for (i21 = 1; 2 > i21; ++i21) {
                    Test.instanceCount += Test.byFld;
                    Test.iArrFld[i18] = i18;
                }
            }
            sArrFld = sArrFld;
            for (i23 = 4; i23 < 174; ++i23) {
                Test.instanceCount = Test.instanceCount;
                iFld &= i17;
                i20 = (int)-50886L;
            }
            Test.lArrFld = FuzzerUtils.long1array(N, (long)-4872779760425287494L);
        }
        for (i25 = 9; i25 < 217; i25++) {
            switch (i25 * 5) {
            case 160:
                iFld = (int)Test.dFld;
                break;
            case 320:
                switch ((((i18 >>> 1) % 2) * 5) + 63) {
                case 67:
                    Test.fArrFld[i25 + 1] *= 2.187F;
                    i26 += (((i25 * i24) + i16) - i23);
                    i22 += (i25 | i20);
                case 69:
                    Test.fArrFld[i25 - 1] -= Test.instanceCount;
                    i17 = (int)l1;
                    break;
                }
                break;
            case 240:
                Test.bFld = Test.bFld;
                break;
            case 292:
                f3 = i16;
            case 138:
                Test.instanceCount |= Test.instanceCount;
                break;
            case 197:
                i22 *= Test.byFld;
                break;
            case 329:
                i20 += i22;
                break;
            case 64:
                Test.instanceCount += i25;
                break;
            case 298:
                l1 += (((i25 * Test.byFld) + i17) - i22);
                break;
            case 114:
                try {
                    i17 = (i18 % Test.iArrFld[i25 - 1]);
                    iFld = (i24 % -48153);
                    i24 = (i21 % 1224305294);
                } catch (ArithmeticException a_e) {}
                break;
            case 321:
                i24 += (i25 * i25);
                break;
            case 115:
                Test.instanceCount *= i23;
                break;
            case 253:
            case 316:
                i17 = i22;
                break;
            case 137:
                i24 -= (int)l1;
                break;
            case 341:
                i22 >>= i24;
                break;
            case 19:
                i24 <<= Test.byFld;
                break;
            case 82:
                i22 /= 4;
            case 211:
                i20 += (int)l1;
                break;
            case 177:
                f3 += i25;
            case 257:
                i20 *= i25;
            case 43:
                i26 += i25;
                break;
            case 350:
                f3 = l1;
                break;
            case 136:
                iFld = (int)Test.dFld;
            case 158:
                Test.instanceCount = l1;
            case 9:
                i20 += (int)f3;
                break;
            case 181:
                i26 += i25;
                break;
            case 5:
                Test.iArrFld[i25 + 1] = -98;
            case 290:
                i24 = iFld;
            case 331:
                Test.iArrFld[i25 + 1] += (int)Test.instanceCount;
                break;
            case 242:
                f3 = i17;
                break;
            case 207:
                Test.lArrFld[i25 + 1] = (long)f3;
            case 218:
                Test.bFld = Test.bFld;
            case 195:
                Test.instanceCount = i19;
                break;
            case 18:
                iFld = i21;
                break;
            case 28:
                Test.instanceCount += (i25 * Test.instanceCount);
                break;
            case 96:
                Test.bFld = Test.bFld;
                break;
            case 15:
                Test.lArrFld[i25] += i17;
                break;
            case 131:
                byArr[i25 + 1] -= (byte)l1;
                break;
            case 11:
                f3 += (((i25 * l1) + l1) - i17);
            case 153:
                i26 -= iFld;
                break;
            case 268:
                i24 = i28;
                break;
            case 295:
                i26 = i21;
                break;
            case 168:
                Test.instanceCount += i20;
                break;
            case 36:
                Test.lArrFld[i25 - 1] -= i18;
                break;
            case 44:
                Test.iArrFld[i25 - 1] = (int)Test.instanceCount;
            case 163:
                i17 += (i25 | i26);
                break;
            case 241:
                Test.dFld *= i26;
                break;
            case 293:
                iFld = i28;
                break;
            case 245:
                i22 += i21;
            case 294:
                Test.lArrFld[i25 - 1] = -3;
                break;
            case 172:
                f3 += -16462;
            case 94:
                i17 += (int)-113.359F;
                break;
            case 326:
                Test.instanceCount -= l1;
            case 88:
            case 90:
            case 146:
                i24 -= i28;
                break;
            case 185:
                i20 = (int)l1;
                break;
            case 239:
                Test.dFld = Test.dFld;
                break;
            case 95:
                i24 -= i23;
            case 110:
                i26 = i19;
            case 235:
                iFld += i24;
                break;
            case 306:
                Test.lArrFld[i25] <<= i17;
                break;
            case 176:
                Test.fArrFld[i25 - 1] = (float)Test.dFld;
            case 13:
                l1 *= (long)f3;
                break;
            case 38:
                i26 += (((i25 * i18) + l1) - i24);
                break;
            case 124:
                bArr[i25] = Test.bFld;
                break;
            case 214:
                Test.instanceCount = i25;
                break;
            case 223:
                i26 >>= i20;
                break;
            case 258:
                f3 = 7;
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  bMeth ->  bMeth vMeth mainTest
//DEBUG  lMeth ->  lMeth bMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
