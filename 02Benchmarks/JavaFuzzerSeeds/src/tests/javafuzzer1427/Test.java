package tests.javafuzzer1427;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 20:14:39 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=5795620498214848306L;
    public static double dFld=-17.45994;
    public static boolean bFld=false;
    public static volatile int iFld=-30259;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -3233);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i2, long l1, float f1) {

        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -1L);

        Test.dFld += l1;
        lArr[(i2 >>> 1) % N] = i2;
        Test.dFld %= ((long)(f1) | 1);
        i2 %= (int)(Test.instanceCount | 1);
        vMeth2_check_sum += i2 + l1 + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(long l, float f) {

        int i3=-135, i4=-9, i5=17492, i6=8;
        boolean b=false;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)33);

        vMeth2(i3, -4304938219349977016L, f);
        i4 = 1;
        while (++i4 < 229) {
            if (b) continue;
            for (i5 = 1; 7 > i5; ++i5) {
                f = i5;
                Test.iArrFld = Test.iArrFld;
                if (b) break;
                if (b) break;
                Test.iArrFld[i5 - 1] /= (int)(i3 | 1);
            }
            if (b) {
                if (b) continue;
                Test.iArrFld[i4 - 1] = i4;
            } else if (b) {
                i6 = (int)-1224302818L;
                i6 += i4;
                byArr[i4 + 1] = (byte)i5;
            }
        }
        vMeth1_check_sum += l + Float.floatToIntBits(f) + i3 + i4 + (b ? 1 : 0) + i5 + i6 + FuzzerUtils.checkSum(byArr);
    }

    public static void vMeth() {

        float f2=-1.424F;
        double d=-2.63197;
        int i7=5, i8=-9, i9=92, i10=-13, i11=-15935, i12=-7, i13=4;
        byte by=-118;

        vMeth1(Test.instanceCount, f2);
        d = 1;
        do {
            i7 += (int)Test.dFld;
            Test.instanceCount += (11 + (d * d));
            i7 *= -47469;
            Test.instanceCount = i7;
            i8 = 1;
            do {
                Test.iArrFld[i8 - 1] = i8;
                Test.iArrFld[i8 - 1] = i9;
            } while (++i8 < 7);
            for (i10 = 1; i10 < 7; ++i10) {
                i11 += i10;
                i11 >>= by;
                for (i12 = 1; i12 < 2; i12++) {
                    Test.iArrFld[i12] = i12;
                    i11 <<= i13;
                }
            }
        } while (++d < 233);
        vMeth_check_sum += Float.floatToIntBits(f2) + Double.doubleToLongBits(d) + i7 + i8 + i9 + i10 + i11 + by + i12
            + i13;
    }

    public void mainTest(String[] strArr1) {

        int i=-5, i1=-43, i14=26985, i15=36, i16=-1, i17=154, i18=4, i19=-64658, i20=-81, i21=14;
        float f3=-47.314F;
        short s=3034;
        long l2=-45619L, lArr1[]=new long[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 1.108735);
        FuzzerUtils.init(lArr1, -2344831632L);

        for (i = 1; i < 194; ++i) {
            vMeth();
            i1 /= (int)((long)(Test.dFld) | 1);
            if (Test.bFld) {
                for (i14 = 130; 4 < i14; i14 -= 2) {
                    f3 += i14;
                    for (i16 = 3; i16 > 1; i16 -= 2) {
                        Test.dFld -= i1;
                        f3 *= Test.instanceCount;
                    }
                }
            } else if (Test.bFld) {
                i15 -= -10;
                f3 = s;
                i18 = 1;
                do {
                    s -= (short)i1;
                    f3 = i1;
                    switch (((i14 >>> 1) % 1) + 121) {
                    case 121:
                        i17 += (i18 * i18);
                        i17 -= -3;
                        break;
                    default:
                        for (i19 = 1; i19 < 1; i19++) {
                            i20 -= i17;
                            Test.instanceCount >>= i21;
                            switch ((i18 % 7) + 114) {
                            case 114:
                                i15 = s;
                            case 115:
                                Test.iArrFld[i19] ^= i21;
                            case 116:
                                switch ((((i21 >>> 1) % 10) * 5) + 34) {
                                case 49:
                                    f3 = i19;
                                    Test.iArrFld[i18 + 1] = (int)Test.instanceCount;
                                    break;
                                case 46:
                                    dArr[i19 - 1] = Test.instanceCount;
                                    Test.iArrFld[i18] += i21;
                                case 54:
                                    i17 += (((i19 * i19) + f3) - i18);
                                    break;
                                case 40:
                                    i1 += (((i19 * i18) + l2) - l2);
                                    break;
                                case 41:
                                    Test.iArrFld[i19 - 1] *= (int)Test.dFld;
                                    break;
                                case 60:
                                    Test.bFld = Test.bFld;
                                case 71:
                                    f3 = i1;
                                case 39:
                                    i17 += i19;
                                case 42:
                                    i17 *= i;
                                    break;
                                case 77:
                                    lArr1[i19 - 1] = l2;
                                    break;
                                default:
                                    Test.iArrFld[i + 1] *= (int)Test.instanceCount;
                                }
                            case 117:
                                i21 = i16;
                                break;
                            case 118:
                                f3 = i16;
                            case 119:
                                lArr1[i18 - 1] &= i1;
                                break;
                            case 120:
                                Test.instanceCount -= Test.iFld;
                            }
                        }
                    }
                } while (++i18 < 130);
            } else if (Test.bFld) {
                lArr1 = FuzzerUtils.long1array(N, (long)-120L);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
