package tests.javafuzzer2581;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 16:56:39 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=5L;
    public int iFld=-209;
    public static int iFld1=-2;
    public static float fFld=0.63F;
    public static boolean bFld=false;
    public static volatile byte byFld=29;
    public static volatile int iFld2=-142;
    public static double dFld=-1.69802;
    public volatile short sFld=21870;
    public byte byArrFld[]=new byte[N];
    public volatile long lArrFld[]=new long[N];
    public static int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, -13);
    }

    public static long vMeth_check_sum = 0;
    public static long byMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        double d=0.113394;
        int i3=-201, i4=-7, i5=133, i6=28367, iArr[]=new int[N];
        byte by=93;

        FuzzerUtils.init(iArr, 48);

        Test.iFld1 = (int)d;
        for (i3 = 19; i3 < 371; i3++) {
            for (i5 = 1; i5 < 5; ++i5) {
                by = (byte)i6;
                i6 -= Test.iFld1;
                by |= (byte)Test.instanceCount;
                i4 += i5;
                Test.instanceCount = i6;
                Test.fFld -= Test.instanceCount;
                i4 >>= i6;
                if (Test.bFld) {
                    Test.instanceCount = -165;
                    Test.instanceCount -= Test.iFld1;
                    iArr[i3 - 1] = i6;
                    Test.iFld1 = 229;
                }
            }
        }
        vMeth1_check_sum += Double.doubleToLongBits(d) + i3 + i4 + i5 + i6 + by + FuzzerUtils.checkSum(iArr);
    }

    public static byte byMeth(int i2) {

        int i7=-90, i8=-6, i9=0, i10=-62556, i11=2307;
        float f=-1.219F, fArr[]=new float[N];
        byte by1=33;

        FuzzerUtils.init(fArr, 0.623F);

        vMeth1();
        for (i7 = 6; i7 < 252; i7 += 2) {
            i2 += (i7 * i7);
            for (f = 1; f < 13; ++f) {
                i9 >>= (int)Test.instanceCount;
                fArr[(int)(f + 1)] -= by1;
                Test.iFld1 -= i2;
                i10 = 2;
                do {
                    Test.byFld *= (byte)i10;
                } while (--i10 > 0);
                i11 = 1;
                do {
                    if (Test.bFld) {
                        i2 += (int)Test.instanceCount;
                    } else if (Test.bFld) {
                        i8 += i11;
                    } else {
                        Test.iArrFld[i11][i11] = (int)6965108316701440069L;
                        Test.iArrFld[(int)(f + 1)][i11 - 1] = i11;
                    }
                } while (++i11 < 2);
            }
        }
        long meth_res = i2 + i7 + i8 + Float.floatToIntBits(f) + i9 + by1 + i10 + i11 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public void vMeth() {

        int i=0, i1=-16, i12=177, i13=21190;
        short s=13513;
        long l=26041L;

        i = 1;
        while (++i < 257) {
            Test.instanceCount += (i * i);
        }
        byArrFld[(i >>> 1) % N] = (byte)((iFld + (i - Test.instanceCount)) - (lArrFld[(i >>> 1) % N] - (i - s)));
        i1 = 1;
        do {
            iFld = (int)(((Test.instanceCount + iFld) - byMeth(i)) - i1);
        } while (++i1 < 189);
        Test.fFld = l;
        for (i12 = 373; 1 < i12; i12--) {
            Test.fFld = i12;
            Test.byFld -= (byte)960800640L;
            iFld += i12;
        }
        i13 *= i;
        Test.instanceCount *= i1;
        Test.instanceCount *= Test.instanceCount;
        vMeth_check_sum += i + s + i1 + l + i12 + i13;
    }

    public void mainTest(String[] strArr1) {

        boolean b=false, bArr[]=new boolean[N];
        int i14=-1, i15=3, i16=41078, i17=5, i18=136, i19=-79;
        double d1=64.78380;

        FuzzerUtils.init(bArr, false);

        switch (((((++iFld) >>> 1) % 1) * 5) + 2) {
        case 5:
            bArr[(iFld >>> 1) % N] = b;
            vMeth();
            Test.instanceCount *= Test.instanceCount;
            Test.fFld *= 220;
            break;
        default:
            for (i14 = 8; 160 > i14; ++i14) {
                i15 -= iFld;
                for (i16 = 2; 165 > i16; i16++) {
                    Test.instanceCount = -192L;
                    for (i18 = i14; i18 < 2; ++i18) {
                        i17 += i14;
                        Test.fFld += Test.iFld1;
                        switch (((iFld >>> 1) % 9) + 99) {
                        case 99:
                            if (b) break;
                            lArrFld[i18 - 1] = i14;
                            break;
                        case 100:
                            if (false) break;
                            Test.iArrFld[i18 - 1][i18] -= i14;
                            if (Test.bFld) {
                                if (b) {
                                    Test.instanceCount = iFld;
                                } else if (Test.bFld) {
                                    Test.iFld2 >>= i17;
                                    Test.iArrFld[i18][i16 - 1] = i17;
                                    Test.dFld *= i16;
                                    Test.instanceCount += sFld;
                                } else if (true) {
                                    if (Test.bFld) continue;
                                    Test.fFld -= 10L;
                                } else {
                                    i15 += i18;
                                }
                                Test.instanceCount = Test.instanceCount;
                                Test.iFld1 *= (int)Test.fFld;
                                Test.instanceCount -= 41880;
                            } else {
                                Test.fFld = Test.fFld;
                            }
                        case 101:
                            Test.iFld2 *= i15;
                        case 102:
                            Test.instanceCount += (long)d1;
                        case 103:
                            lArrFld[i16] -= i17;
                            break;
                        case 104:
                            Test.fFld += 5693545214751154162L;
                            break;
                        case 105:
                            Test.instanceCount += (long)Test.fFld;
                            break;
                        case 106:
                            i17 += (i18 + i15);
                        case 107:
                            Test.iFld1 += (int)Test.instanceCount;
                            break;
                        }
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  byMeth ->  byMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 byMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}