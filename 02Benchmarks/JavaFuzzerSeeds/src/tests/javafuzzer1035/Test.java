package tests.javafuzzer1035;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 13:01:20 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=177L;
    public static int iFld=-11025;
    public short sFld=-27338;
    public float fFld=68.369F;
    public static byte byFld=88;
    public static boolean bFld=false;
    public int iArrFld[]=new int[N];
    public static boolean bArrFld[]=new boolean[N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.bArrFld, true);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;

    public short sMeth() {

        int i=93, i1=14213, i2=-14;
        double d=0.65509, d1=1.86597;
        boolean b1=false;

        sFld <<= (short)Test.instanceCount;
        if (b1) {
            i = 1;
            do {
                d = 1;
                while (++d < 8) {
                    Test.instanceCount = Test.iFld;
                    Test.iFld -= Test.iFld;
                    Test.instanceCount += (long)d;
                    iArrFld[i - 1] += Test.iFld;
                    Test.iFld += (int)(((d * sFld) + fFld) - fFld);
                    for (i1 = i; 1 > i1; ++i1) {
                        d1 *= i;
                        Test.instanceCount = i1;
                        Test.iFld >>= i2;
                        i2 = (int)fFld;
                    }
                    i2 /= (int)(i2 | 1);
                }
            } while (++i < 194);
        } else {
            iArrFld[(i1 >>> 1) % N] += Test.byFld;
        }
        long meth_res = i + Double.doubleToLongBits(d) + i1 + i2 + Double.doubleToLongBits(d1) + (b1 ? 1 : 0);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public long lMeth(long l, boolean b) {

        int i3=9821, i4=-32473, i5=8, i6=18113, i7=16938;
        double d2=-2.64748;

        sMeth();
        Test.byFld = Test.byFld;
        for (i3 = 10; i3 < 194; ++i3) {
            Test.iFld += (((i3 * i3) + Test.iFld) - Test.iFld);
            i4 = -3;
            i5 = 1;
            while (++i5 < 9) {
                switch ((((i3 >>> 1) % 10) * 5) + 108) {
                case 121:
                    Test.iFld = i3;
                    break;
                case 156:
                    iArrFld[i3] = (int)l;
                    for (i6 = i3; i6 < 1; i6++) {
                        i4 += i6;
                        d2 += fFld;
                        l >>= i5;
                        Test.instanceCount += i4;
                        Test.instanceCount += i6;
                    }
                    break;
                case 113:
                    i4 %= (int)((long)(d2) | 1);
                    break;
                case 152:
                    Test.iFld += 32151;
                    break;
                case 154:
                    i4 += Test.iFld;
                case 145:
                    try {
                        i7 = (iArrFld[i5 - 1] / i4);
                        i7 = (219 / i3);
                        i4 = (i6 % -58407);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 118:
                    Test.bArrFld[i5 - 1] = b;
                    break;
                case 136:
                    Test.iFld += (int)(-3491263403845308778L + (i5 * i5));
                    break;
                case 127:
                    i7 *= (int)l;
                case 155:
                    Test.instanceCount = 109L;
                    break;
                default:
                    fFld %= (l | 1);
                }
            }
        }
        long meth_res = l + (b ? 1 : 0) + i3 + i4 + i5 + i6 + i7 + Double.doubleToLongBits(d2);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void vMeth() {

        int i8=-32252, i9=12, i10=-11;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -1.45514);

        iArrFld[(Test.iFld >>> 1) % N] = (int)((--Test.instanceCount) + lMeth(Test.instanceCount, Test.bFld));
        i8 = 1;
        while (++i8 < 308) {
            double d3=0.26306;
            d3 -= fFld;
            for (i9 = 1; i9 < 5; ++i9) {
                if (i10 != 0) {
                    vMeth_check_sum += i8 + i9 + i10 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                    return;
                }
                i10 |= i8;
                i10 -= (int)-60911L;
                lArrFld[i8 + 1] -= i10;
                Test.instanceCount >>= -46;
                iArrFld = FuzzerUtils.int1array(N, (int)-47392);
                dArr[i9 + 1] = 4727;
                sFld += (short)(i9 * i9);
                Test.iFld = (int)Test.instanceCount;
                Test.iFld = (int)Test.instanceCount;
            }
            iArrFld[i8 - 1] |= Test.iFld;
        }
        vMeth_check_sum += i8 + i9 + i10 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i11=-62663, i12=-2, i13=94, i14=12, i15=22981, i17=0, i18=158, i19=-7, i20=-20510, i21=13, i22=-48918;
        double dArr1[]=new double[N];

        FuzzerUtils.init(dArr1, 10.12162);

        vMeth();
        Test.iFld <<= Test.byFld;
        for (i11 = 17; 294 > i11; i11++) {
            for (i13 = 3; 91 > i13; i13++) {
                i12 = (int)fFld;
                fFld *= sFld;
                Test.iFld *= (int)Test.instanceCount;
                i12 -= 10335;
                Test.instanceCount >>= i13;
                lArrFld[i11] *= Test.byFld;
            }
            i15 = 91;
            while (--i15 > 0) {
                dArr1[i11] -= 113;
                try {
                    i12 = (i13 / -27587);
                    iArrFld[i11] = (42948 / Test.iFld);
                    Test.iFld = (i11 % Test.iFld);
                } catch (ArithmeticException a_e) {}
                i12 *= i11;
                Test.instanceCount += i13;
                i14 += i15;
                Test.iFld *= i14;
                try {
                    Test.iFld = (i12 / Test.iFld);
                    i12 = (i13 / 256);
                    Test.iFld = (-43952 / i12);
                } catch (ArithmeticException a_e) {}
            }
            lArrFld[i11] = 11L;
            Test.iFld *= i11;
            i14 = i12;
        }
        i17 = 1;
        do {
            iArrFld[i17] >>= (int)Test.instanceCount;
        } while (++i17 < 187);
        for (i18 = 5; 363 > i18; ++i18) {
            for (i20 = 1; i20 < 70; i20++) {
                if (Test.bFld) break;
                i14 ^= (int)Test.instanceCount;
                i22 = 1;
                while (++i22 < 2) {
                    fFld += 3;
                }
                Test.instanceCount = i13;
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  sMeth ->  sMeth lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
