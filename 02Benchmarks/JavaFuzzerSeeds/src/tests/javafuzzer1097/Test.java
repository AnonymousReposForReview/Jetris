package tests.javafuzzer1097;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 14:26:54 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2L;
    public static int iFld=10;
    public static boolean bFld=true;
    public static short sFld=-27747;
    public static float fFld=-32.830F;
    public static long lFld=35179L;
    public static int iArrFld[]=new int[N];
    public static float fArrFld[][]=new float[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 155);
        FuzzerUtils.init(Test.fArrFld, 0.955F);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i3=7, i4=-59636, i5=12887, i6=18291, i7=-90, i8=11, i9=43;
        short s=27980;
        double d=1.64748;
        byte by=-58;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 1591992676286608521L);

        i3 = 1;
        do {
            Test.instanceCount ^= s;
            for (i4 = 1; i4 < 13; ++i4) {
                Test.instanceCount = i5;
                for (i6 = i3; i6 < 2; i6++) {
                    i7 -= -2944;
                }
            }
            if (Test.bFld) {
                i5 *= (int)d;
            }
            for (i8 = 1; 13 > i8; ++i8) {
                Test.iArrFld[i3] /= (int)(i7 | 1);
                by += (byte)(118 + (i8 * i8));
                d -= i6;
                lArr[i3 + 1] = i6;
                i9 <<= i4;
                Test.instanceCount += s;
            }
        } while (++i3 < 122);
        vMeth1_check_sum += i3 + s + i4 + i5 + i6 + i7 + Double.doubleToLongBits(d) + i8 + i9 + by +
            FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(long l, int i1, int i2) {

        float f=-2.368F;
        int i10=10289, i11=-57839, i12=-14, i13=45354, i14=11;
        double d1=104.123985;

        vMeth1();
        Test.fArrFld[(i2 >>> 1) % N][(Test.iFld >>> 1) % N] -= Test.iFld;
        i2 -= (int)f;
        i1 = i2;
        for (i10 = 12; i10 < 269; ++i10) {
            for (i12 = 6; i12 > 1; --i12) {
                i14 -= (int)d1;
                i14 += -30;
                d1 *= Test.instanceCount;
                i13 ^= i12;
                switch (((i1 >>> 1) % 2) + 38) {
                case 38:
                    switch ((((i13 >>> 1) % 2) * 5) + 116) {
                    case 118:
                        Test.iArrFld[i12] -= i10;
                        i14 = i13;
                        Test.iFld <<= i2;
                        break;
                    case 126:
                        Test.iArrFld[i12 - 1] <<= i2;
                    }
                    break;
                case 39:
                    Test.instanceCount *= l;
                }
            }
        }
        vMeth_check_sum += l + i1 + i2 + Float.floatToIntBits(f) + i10 + i11 + i12 + i13 + i14 +
            Double.doubleToLongBits(d1);
    }

    public static void vSmallMeth(int i) {


        vMeth(Test.instanceCount, Test.iFld, Test.iFld);
        vSmallMeth_check_sum += i;
    }

    public void mainTest(String[] strArr1) {

        double d2=-1.10235, d3=15.79227, d4=-67.10071, dArr[]=new double[N];
        int i15=-12, i16=34, i17=-44998, i18=45471;
        byte by1=51;
        long l1=21511L, lArr1[]=new long[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(lArr1, -7053985564416346560L);
        FuzzerUtils.init(dArr, 2.111547);

        Test.iFld -= Math.abs(Math.min(Test.iFld + Test.iFld, (int)(Test.instanceCount + Test.iFld)));
        for (int smallinvoc=0; smallinvoc<719; smallinvoc++) vSmallMeth(Test.iFld);
        switch ((((Test.iFld >>> 1) % 6) * 5) + 91) {
        case 118:
            Test.iFld = Test.iFld;
            Test.iFld = -165;
        case 106:
            Test.instanceCount /= (Test.iFld | 1);
            d2 = 1;
            while (++d2 < 153) {
                i15 = 1;
                while (++i15 < 164) {
                    bArr[(int)(d2 + 1)] = Test.bFld;
                    switch ((i15 % 1) + 6) {
                    case 6:
                        switch ((int)(((d2 % 8) * 5) + 13)) {
                        case 25:
                            Test.iFld = Test.sFld;
                            break;
                        case 37:
                            for (i16 = i15; i16 < 1; ++i16) {
                                Test.instanceCount += i16;
                                Test.iFld = i16;
                                Test.iFld = Test.iFld;
                                Test.fFld -= i17;
                                i17 = (int)Test.instanceCount;
                                lArr1[i16 + 1] = i15;
                                Test.fFld *= Test.iFld;
                                Test.instanceCount <<= 14;
                                by1 += (byte)172;
                                Test.lFld *= Test.instanceCount;
                            }
                            for (d3 = 1; d3 < 1; ++d3) {
                                Test.instanceCount -= 1525;
                                dArr[(int)(d3)] = d3;
                                Test.iFld += (int)d3;
                                Test.fFld += (float)(((d3 * Test.sFld) + i17) - i16);
                                l1 *= Test.instanceCount;
                                by1 = (byte)d3;
                            }
                            break;
                        case 14:
                            i17 -= (int)d2;
                            break;
                        case 20:
                            d4 += l1;
                            break;
                        case 34:
                            Test.iFld = i17;
                            break;
                        case 26:
                            Test.iFld = (int)Test.fFld;
                        case 31:
                            Test.iFld += (i15 * i18);
                            break;
                        case 29:
                            Test.sFld += (short)(((i15 * i17) + i18) - i17);
                        default:
                            Test.fFld *= (float)d2;
                        }
                    default:
                        Test.instanceCount >>>= i15;
                    }
                }
            }
            break;
        case 111:
            i18 += (int)-126.76636;
            break;
        case 121:
            Test.iFld -= (int)l1;
            break;
        case 114:
            Test.iFld -= i17;
            break;
        case 109:
            Test.iFld -= Test.sFld;
            break;
        default:
            dArr[(Test.iFld >>> 1) % N] -= i15;
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
//DEBUG  vMeth1 ->  vMeth1 vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
