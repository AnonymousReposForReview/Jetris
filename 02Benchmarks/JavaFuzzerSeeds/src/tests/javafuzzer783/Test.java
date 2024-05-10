package tests.javafuzzer783;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 09:43:02 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-160L;
    public static volatile boolean bFld=false;
    public static short sFld=-554;
    public static float fFld=15.201F;
    public static int iArrFld[]=new int[N];
    public volatile boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 28035);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i2, long l2) {

        int i3=1445, i4=-244, i5=-194, i6=6;
        long lArr[]=new long[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(lArr, 6988175662205037032L);
        FuzzerUtils.init(bArr, true);

        i2 = i2;
        for (long l3 : lArr) {
            for (i3 = 1; i3 < 4; i3++) {
                if (Test.bFld) continue;
                i4 += (((i3 * i4) + Test.instanceCount) - i3);
                i5 -= i4;
                i6 = 1;
                while (++i6 < 2) {
                    i4 += (i6 ^ Test.sFld);
                    bArr[i3] = Test.bFld;
                    i5 += 5880;
                    i5 = (int)133L;
                    i2 = i2;
                    i2 = i4;
                }
                Test.iArrFld[i3] *= (int)Test.fFld;
                i4 *= (int)-125.55990;
            }
        }
        vMeth1_check_sum += i2 + l2 + i3 + i4 + i5 + i6 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(bArr);
    }

    public static void vMeth(float f) {

        int i7=79, i8=22586, i9=137, i10=-247, i11=88, i12=49;
        byte by=5;
        double d=56.113754;

        vMeth1(i7, -20461L);
        for (i8 = 9; i8 < 177; i8++) {
            Test.instanceCount *= i7;
            for (i10 = 1; 9 > i10; ++i10) {
                switch (((i8 % 1) * 5) + 72) {
                case 75:
                    i12 = 1;
                    while (++i12 < 2) {
                        i7 += (int)Test.instanceCount;
                        i9 = (int)7.948F;
                        by += (byte)(((i12 * i7) + i9) - i7);
                        switch ((i8 % 8) + 95) {
                        case 95:
                            if (Test.bFld) {
                                i9 -= i7;
                                Test.iArrFld[i8 + 1] = i10;
                                vMeth_check_sum += Float.floatToIntBits(f) + i7 + i8 + i9 + i10 + i11 + i12 + by +
                                    Double.doubleToLongBits(d);
                                return;
                            } else {
                                Test.instanceCount += (long)13.90478;
                                i7 = (int)d;
                            }
                            break;
                        case 96:
                            i7 += (75 + (i12 * i12));
                        case 97:
                            Test.instanceCount += (i12 + Test.fFld);
                        case 98:
                            i7 >>= i7;
                            break;
                        case 99:
                            i9 = i10;
                            break;
                        case 100:
                            Test.fFld = -3.185F;
                            break;
                        case 101:
                            i9 >>= (int)2778909147L;
                        case 102:
                            i9 *= (int)63023L;
                            break;
                        default:
                            d = -3211636377810315998L;
                        }
                    }
                    break;
                }
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i7 + i8 + i9 + i10 + i11 + i12 + by + Double.doubleToLongBits(d);
    }

    public static int iMeth(long l, long l1) {

        int i1=-14;

        Test.instanceCount *= (i1--);
        Test.instanceCount = (i1++);
        vMeth(Test.fFld);
        i1 += (int)l;
        long meth_res = l + l1 + i1;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=185, i13=-24455, i14=47761, i16=-252, i17=-78, i18=2838, i19=-58947;
        byte by1=-60;
        double d1=2.70796, dArr[]=new double[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -88677101L);
        FuzzerUtils.init(dArr, -2.124283);

        i += (iMeth(Test.instanceCount, Test.instanceCount) - i);
        for (i13 = 16; 310 > i13; i13++) {
            Test.iArrFld[i13 - 1] = i;
            Test.iArrFld[i13 - 1] = (int)Test.fFld;
            i = i;
            bArrFld[i13] = Test.bFld;
            i = 64770;
            lArr1[i13 + 1] += i14;
        }
        for (int i15 : Test.iArrFld) {
            i15 = i13;
            i += i15;
            by1 = (byte)i13;
            i = (int)-4230248040L;
            for (i16 = 2; i16 < 63; i16++) {
                for (i18 = i16; i18 < 2; ++i18) {
                    i17 <<= (int)Test.instanceCount;
                    Test.sFld >>= (short)i13;
                    i -= i13;
                    i14 -= -37255;
                    try {
                        i14 = (i15 / 111);
                        i = (i14 % -29265);
                        i17 = (16590 % Test.iArrFld[i16 + 1]);
                    } catch (ArithmeticException a_e) {}
                    Test.fFld *= i19;
                    if (Test.bFld) {
                        switch ((i16 % 5) + 13) {
                        case 13:
                            switch ((i16 % 10) + 69) {
                            case 69:
                                switch (((i15 >>> 1) % 6) + 97) {
                                case 97:
                                    Test.fFld += (214 + (i18 * i18));
                                    break;
                                case 98:
                                    i17 += 238;
                                    i19 = (int)Test.instanceCount;
                                case 99:
                                    Test.instanceCount += i;
                                    Test.fFld *= i15;
                                case 100:
                                case 101:
                                    i += (i18 ^ Test.instanceCount);
                                case 102:
                                    Test.instanceCount -= i17;
                                default:
                                    i14 -= (int)Test.instanceCount;
                                }
                                break;
                            case 70:
                                i19 *= (int)Test.instanceCount;
                                break;
                            case 71:
                                i19 = (int)-2L;
                                break;
                            case 72:
                                i += (((i18 * Test.instanceCount) + Test.fFld) - i15);
                                break;
                            case 73:
                                Test.iArrFld[i16] = i14;
                                break;
                            case 74:
                                d1 *= i;
                                break;
                            case 75:
                                if (Test.bFld) continue;
                                break;
                            case 76:
                                i15 += (int)Test.instanceCount;
                                break;
                            case 77:
                                Test.fFld += Test.sFld;
                            case 78:
                                dArr[i18 + 1] += -1.24629;
                                break;
                            default:
                                lArr1[i16 - 1] += Test.instanceCount;
                            }
                        case 14:
                            i15 += -4641;
                        case 15:
                            i15 = (int)d1;
                        case 16:
                            i14 = i19;
                            break;
                        case 17:
                            i17 -= (int)-2287688013828654628L;
                            break;
                        }
                    } else {
                        i19 >>>= i16;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}