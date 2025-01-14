package tests.javafuzzer741;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 08:58:35 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=4437128021980769055L;
    public boolean bFld=false;
    public static boolean bFld1=false;
    public static double dFld=1.23148;
    public static volatile short sFld=-10814;
    public static int iArrFld[]=new int[N];
    public volatile float fArrFld[][]=new float[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, -58652);
    }

    public static long bMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l3) {

        int i2=32113, i3=-49, i4=-11;

        Test.iArrFld[(i2 >>> 1) % N] *= i2;
        for (i3 = 312; i3 > 12; i3--) {
            i4 = i3;
            Test.iArrFld[i3 + 1] = -1091;
            Test.bFld1 = Test.bFld1;
            i4 = (int)l3;
        }
        vMeth1_check_sum += l3 + i2 + i3 + i4;
    }

    public static void vMeth(double d, long l2, float f) {

        int i=226, i1=-40784, i5=584;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 1664312768L);

        for (i = 9; i < 162; i++) {
            vMeth1(Test.instanceCount);
            Test.bFld1 = Test.bFld1;
            f = 203;
            i1 -= i;
            lArr[i - 1] -= i1;
            i1 += i1;
            i5 = 1;
            while (++i5 < 10) {
                switch ((i % 3) + 12) {
                case 12:
                    i1 = (int)Test.instanceCount;
                    Test.iArrFld[i] -= (int)l2;
                    break;
                case 13:
                    i1 &= (int)Test.instanceCount;
                    i1 -= i;
                    i1 = (int)f;
                    break;
                case 14:
                    i1 ^= (int)l2;
                    break;
                default:
                    i1 += (i5 | i5);
                }
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + l2 + Float.floatToIntBits(f) + i + i1 + i5 +
            FuzzerUtils.checkSum(lArr);
    }

    public static boolean bMeth(long l, long l1) {

        int i6=-20403, i7=28218, i8=-6891, i9=12, i10=13296, i11=-213, i12=4;

        l1 = 3173436734L;
        vMeth(Test.dFld, l, 2.521F);
        for (i6 = 1; i6 < 313; ++i6) {
            for (i8 = i6; 5 > i8; i8++) {
                i7 += (int)(1.1F + (i8 * i8));
                Test.sFld += (short)Test.instanceCount;
                if (true) {
                    for (i10 = 1; i10 < 1; i10++) {
                        i9 *= i11;
                        Test.dFld = -2.120011;
                    }
                    if (Test.bFld1) {
                        i11 >>>= i11;
                        if (false) {
                            i9 <<= (int)l;
                            i9 |= i12;
                        }
                    }
                } else if (Test.bFld1) {
                    i7 = 7;
                }
            }
        }
        long meth_res = l + l1 + i6 + i7 + i8 + i9 + i10 + i11 + i12;
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void mainTest(String[] strArr1) {

        int i13=46884, i14=23151, i15=-37671, i16=40904, i17=59888, i18=6616, i19=13;
        float f1=43.248F;
        byte by=-44;
        long l4=10L;

        bFld = bMeth(Test.instanceCount, Test.instanceCount);
        for (i13 = 16; i13 < 289; i13++) {
            Test.instanceCount = Test.sFld;
            if (bFld) {
                if (Test.bFld1) {
                    i14 <<= i14;
                    Test.instanceCount = (long)Test.dFld;
                    i15 = 1;
                    do {
                        i14 = i15;
                    } while (++i15 < 92);
                } else {
                    i14 -= -90;
                    if (true) break;
                    f1 -= by;
                    i16 = 1;
                    while (++i16 < 92) {
                        Test.iArrFld[i16 - 1] += i16;
                        Test.iArrFld[i13 - 1] = (int)f1;
                        i14 += i16;
                        i14 += (((i16 * i14) + i15) - i15);
                        for (i17 = 1; i17 < 1; ++i17) {
                            f1 -= Test.sFld;
                            i14 = (int)f1;
                            Test.iArrFld[i16] -= -4;
                            i18 = i17;
                            i14 = -3749;
                            Test.iArrFld[i17 - 1] += (int)f1;
                            fArrFld = fArrFld;
                            i18 = (int)Test.dFld;
                        }
                        Test.instanceCount += (-1347 + (i16 * i16));
                        for (l4 = 1; l4 > i13; l4--) {
                            i19 = i17;
                            i18 = i17;
                        }
                    }
                }
            } else {
                Test.iArrFld[i13 + 1] = by;
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
//DEBUG  bMeth ->  bMeth mainTest
//DEBUG  vMeth ->  vMeth bMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth bMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
