package tests.javafuzzer217;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 00:17:19 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3611873149340580071L;
    public static boolean bFld=true;
    public static int iFld=-12;
    public static float fFld=78.854F;
    public volatile int iFld1=29899;
    public static int iArrFld[]=new int[N];
    public static volatile int iArrFld1[][]=new int[N][N];
    public static volatile long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 141);
        FuzzerUtils.init(Test.iArrFld1, -41966);
        FuzzerUtils.init(Test.lArrFld, -18L);
    }

    public static long dMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i6, int i7, int i8) {

        int i9=-40816, i10=-13, i11=-120, i12=-34, i13=-33, i14=1, i15=38752, iArr[][]=new int[N][N];
        float f1=-127.406F;
        long l1=2084589109625703036L;
        boolean b=false;
        byte by=-7;
        double d=-57.130751, dArr[]=new double[N];

        FuzzerUtils.init(iArr, 208);
        FuzzerUtils.init(dArr, -108.82818);

        for (i9 = 12; i9 < 231; i9 += 3) {
            f1 += (i9 * Test.instanceCount);
            for (l1 = 1; l1 < 21; l1++) {
                if (b) break;
                i7 *= i8;
            }
            if (i9 != 0) {
                vMeth_check_sum += i6 + i7 + i8 + i9 + i10 + Float.floatToIntBits(f1) + l1 + i11 + (b ? 1 : 0) + i12 +
                    i13 + i14 + i15 + by + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr) +
                    Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                return;
            }
            iArr[i9 - 1][i9 - 1] >>= 60919;
            for (i12 = 21; i12 > 1; i12--) {
                i11 += (i12 * i12);
                switch ((i12 % 8) + 109) {
                case 109:
                    for (i14 = 1; 2 > i14; i14++) {
                        i7 <<= i9;
                        Test.instanceCount += (i14 | (long)f1);
                        by <<= (byte)l1;
                        d += i11;
                    }
                case 110:
                    i10 *= i9;
                    break;
                case 111:
                    iArr[i12 + 1][i12] += i6;
                    break;
                case 112:
                    d = d;
                    break;
                case 113:
                    dArr[i9] -= f1;
                case 114:
                    i7 += i14;
                    break;
                case 115:
                    iArr[i12 - 1][i9] = i12;
                    break;
                case 116:
                    Test.instanceCount <<= i8;
                default:
                    f1 = i10;
                }
            }
        }
        vMeth_check_sum += i6 + i7 + i8 + i9 + i10 + Float.floatToIntBits(f1) + l1 + i11 + (b ? 1 : 0) + i12 + i13 +
            i14 + i15 + by + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static long lMeth(int i5, long l) {

        int i16=-11355, i17=11579, i18=8, i19=-14, i20=1, iArr1[]=new int[N];
        float f2=-2.661F;
        short s1=-15164;
        double d1=-23.127395;

        FuzzerUtils.init(iArr1, -43);

        vMeth(i5, i5, i5);
        i5 = i5;
        i16 = 1;
        do {
            i5 >>= i5;
            i5 *= (int)f2;
        } while (++i16 < 142);
        s1 = (short)i16;
        for (i17 = 10; i17 < 304; i17++) {
            Test.bFld = Test.bFld;
            Test.instanceCount -= i16;
            for (i19 = 1; 6 > i19; ++i19) {
                if (i19 != 0) {
                }
                i5 &= i20;
            }
            d1 = i20;
            iArr1[i17] = i18;
            i5 -= i5;
        }
        long meth_res = i5 + l + i16 + Float.floatToIntBits(f2) + s1 + i17 + i18 + i19 + i20 +
            Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static double dMeth(float f) {

        int i1=-99, i2=-3, i3=225, i4=48568, i21=138, i22=-32269;
        short s=-22965;
        double d2=0.42712;
        byte by1=-107;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -4081885440639289378L);

        for (i1 = 14; i1 < 333; ++i1) {
            for (i3 = 5; i3 > 1; --i3) {
                s = (short)(i4 *= (int)lMeth(Test.iFld, Test.instanceCount));
                i2 -= Test.iFld;
                for (i21 = i1; i21 < 2; i21++) {
                    Test.iFld >>= -60503;
                    Test.instanceCount += Test.instanceCount;
                    i22 -= (int)-1.33698;
                    Test.iArrFld[i3] >>= (int)Test.instanceCount;
                    i2 = (int)d2;
                    i4 += i21;
                }
                switch ((i1 % 6) + 122) {
                case 122:
                    i22 -= s;
                    s = (short)i2;
                    f += i22;
                    break;
                case 123:
                    Test.iArrFld[i1 + 1] <<= -29205;
                    break;
                case 124:
                    by1 = (byte)i1;
                case 125:
                    Test.iArrFld1 = Test.iArrFld1;
                case 126:
                    i4 = (int)Test.instanceCount;
                    break;
                case 127:
                    lArr[i1 + 1] = i4;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f) + i1 + i2 + i3 + i4 + s + i21 + i22 + Double.doubleToLongBits(d2) + by1
            + FuzzerUtils.checkSum(lArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=2, i23=1, i24=44, i25=152, i26=10, i27=131, i28=-214, i29=-10540;
        double d3=0.114040, d4=0.58079;

        i *= (int)(Math.sqrt(dMeth(Test.fFld)) + Test.iFld);
        Test.instanceCount = i;
        Test.iArrFld1[(iFld1 >>> 1) % N][(iFld1 >>> 1) % N] = Test.iFld;
        for (i23 = 385; 7 < i23; i23--) {
            iFld1 %= (int)(i | 1);
            for (i25 = 1; i25 < 67; i25++) {
                switch ((((Test.iFld >>> 1) % 8) * 5) + 29) {
                case 37:
                    Test.fFld += Test.instanceCount;
                    Test.bFld = Test.bFld;
                case 39:
                    Test.instanceCount = iFld1;
                    break;
                case 57:
                    for (i27 = 1; i27 < 2; i27++) {
                        switch (((-37 >>> 1) % 1) + 38) {
                        case 38:
                            if (true) continue;
                            Test.iArrFld1[i23][i27 + 1] += -9;
                        }
                        if (Test.bFld) {
                            Test.iArrFld[i23 - 1] += Test.iFld;
                            Test.instanceCount = Test.instanceCount;
                            Test.iArrFld[i27 - 1] = (int)Test.instanceCount;
                            Test.instanceCount = (long)d3;
                        }
                    }
                    Test.iFld = i27;
                    break;
                case 45:
                    Test.iFld += i25;
                    Test.iFld += (i25 + i28);
                    i28 >>= -85;
                    break;
                case 40:
                case 56:
                    Test.lArrFld[i23] += 3978118275L;
                    Test.iArrFld = Test.iArrFld1[i23 - 1];
                    Test.iArrFld = Test.iArrFld1[i23 + 1];
                    for (d4 = 1; d4 < 2; ++d4) {
                        Test.iArrFld1[(iFld1 >>> 1) % N][i23] *= i23;
                        iFld1 += (int)d4;
                        i26 += i26;
                    }
                    break;
                case 60:
                    Test.lArrFld = Test.lArrFld;
                    break;
                case 36:
                    i += (((i25 * iFld1) + i23) - i28);
                    break;
                default:
                    i >>= i26;
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
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  lMeth ->  lMeth dMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
