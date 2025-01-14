package tests.javafuzzer1221;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 16:41:53 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-21L;
    public static long lFld=714500325L;
    public static double dFld=114.117387;
    public short sFld=21856;
    public static boolean bArrFld[]=new boolean[N];
    public static long lArrFld[][]=new long[N][N];
    public static double dArrFld[]=new double[N];
    public static long lArrFld1[]=new long[N];
    public volatile int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.bArrFld, true);
        FuzzerUtils.init(Test.lArrFld, 1284877937L);
        FuzzerUtils.init(Test.dArrFld, 0.55578);
        FuzzerUtils.init(Test.lArrFld1, -845175097308894669L);
    }

    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i4, int i5) {

        float f1=-76.453F;
        double d=0.118034;
        int i6=22279, i7=40531, i8=2, iArr[]=new int[N];
        byte by=-9;
        boolean b1=true;

        FuzzerUtils.init(iArr, -149);

        i4 -= (int)f1;
        iArr = iArr;
        for (d = 152; d > 3; --d) {
            f1 += i4;
            i7 = 1;
            while ((i7 += 3) < 11) {
                short s=11778;
                i4 *= 7;
                Test.instanceCount *= by;
                i8 += (((i7 * Test.instanceCount) + Test.instanceCount) - s);
                if (b1) break;
                Test.instanceCount = i8;
                switch ((i7 % 5) + 58) {
                case 58:
                    i5 += (-28050 + (i7 * i7));
                    break;
                case 59:
                    s = (short)5;
                    Test.instanceCount = i6;
                    break;
                case 60:
                    Test.lArrFld[i7][(int)(d + 1)] = Test.instanceCount;
                    break;
                case 61:
                    i6 *= (int)-228L;
                    break;
                case 62:
                    b1 = b1;
                    break;
                }
            }
        }
        long meth_res = i4 + i5 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d) + i6 + i7 + by + i8 + (b1 ? 1 :
            0) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static double dMeth(long l, int i3) {

        double d1=1.105259, d2=-49.75;
        int i9=12, i10=-134, i11=9, i12=-40665, i13=-7;
        float f2=0.734F;

        i3 += (int)(Test.lArrFld[(-6762 >>> 1) % N][(i3 >>> 1) % N] * (iMeth(i3, i3) - -74L));
        for (d1 = 9; d1 < 164; ++d1) {
            i3 += (int)((long)d1 ^ i3);
            i10 = 10;
            while (--i10 > 0) {
                i9 &= (int)Test.instanceCount;
                for (i11 = 1; 1 > i11; ++i11) {
                    Test.dArrFld[i10] %= -124;
                }
                i13 = 1;
                do {
                    if (false) {
                        d2 = i13;
                        l -= (long)d2;
                        f2 += -1725;
                        i3 += i13;
                    }
                    Test.lFld = i12;
                    Test.lArrFld[(int)(d1 + 1)][(i12 >>> 1) % N] = i9;
                } while (++i13 < 1);
            }
        }
        long meth_res = l + i3 + Double.doubleToLongBits(d1) + i9 + i10 + i11 + i12 + i13 + Double.doubleToLongBits(d2)
            + Float.floatToIntBits(f2);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void vMeth(float f) {

        int i=152, i1=-53, i2=-50;
        boolean b=false;
        byte by1=94;
        float fArr[][]=new float[N][N];

        FuzzerUtils.init(fArr, 0.991F);

        for (i = 3; i < 150; ++i) {
            f += ((long)((Test.instanceCount - i) * (f * 111)) ^ Test.instanceCount);
            Test.bArrFld[i] = (i > ((f--) + (i1 = i1)));
            i2 = 1;
            while (++i2 < 11) {
                if (b = (dMeth(-2L, -5) >= i2)) break;
                i1 >>= i;
                if (b) continue;
                Test.lFld -= i1;
                f -= i;
            }
            i1 += i;
            i1 -= (int)f;
            i1 += i;
        }
        for (long l1 : Test.lArrFld1) {
            fArr[(i1 >>> 1) % N][(i2 >>> 1) % N] -= i2;
            i1 = by1;
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i + i1 + i2 + (b ? 1 : 0) + by1 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        float f3=1.883F, fArr1[]=new float[N];
        int i14=14, i15=-139, i16=19578, i17=-12, i18=-43;
        byte by2=10;
        long l2=1892949693L;
        boolean b2=false;

        FuzzerUtils.init(fArr1, 1.225F);

        vMeth(f3);
        for (i14 = 15; i14 < 256; i14++) {
            for (i16 = i14; i16 < 104; ++i16) {
                iArrFld[i16 - 1] = (int)Test.dFld;
                i15 -= (int)Test.lFld;
                by2 = (byte)i16;
                try {
                    i15 = (-1060 % i17);
                    i17 = (1517115879 / i14);
                    i15 = (694044241 / i17);
                } catch (ArithmeticException a_e) {}
                i17 -= 6;
                i17 = i17;
                i17 += (int)Test.lFld;
                if (b2) {
                    i15 <<= (int)Test.instanceCount;
                    i15 = i15;
                    f3 = -27251;
                    for (l2 = 1; l2 < 1; ++l2) {
                        Test.instanceCount <<= i17;
                        i15 += (int)l2;
                        i15 = i18;
                        try {
                            i18 = (i14 / -71);
                            iArrFld[(int)(l2 - 1)] = (-88 / i17);
                            iArrFld[i14] = (-1900402339 % i17);
                        } catch (ArithmeticException a_e) {}
                    }
                } else if (b2) {
                    if (b2) continue;
                    b2 = b2;
                    Test.dArrFld = Test.dArrFld;
                } else if (b2) {
                    i17 += (int)f3;
                    sFld = (short)i15;
                }
                fArr1[i14 - 1] += f3;
                i15 <<= i15;
            }
            switch ((i14 % 2) + 11) {
            case 11:
                Test.instanceCount = i15;
                i18 *= i16;
                iArrFld[i14 + 1] += (int)f3;
                break;
            case 12:
                Test.instanceCount = 8064;
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
//DEBUG  dMeth ->  dMeth vMeth mainTest
//DEBUG  iMeth ->  iMeth dMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
