package tests.javafuzzer1559;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 22:57:24 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=37271L;
    public static int iFld=12;
    public byte byFld=87;
    public static int iArrFld[][]=new int[N][N];
    public volatile long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 8);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static void vMeth1(long l1, float f) {


        f -= Test.iFld;
        vMeth1_check_sum += l1 + Float.floatToIntBits(f);
    }

    public static int iMeth1(long l2, double d, long l3) {

        int i6=124, i7=7, i8=83, i9=125;
        boolean b=false;
        float f3=91.116F;

        for (i6 = 3; i6 < 203; ++i6) {
            i8 = 1;
            while (++i8 < 8) {
                Test.iFld += (i8 * i8);
                b = b;
                i9 = 1;
                while (++i9 < 1) {
                    i7 = i9;
                    Test.iArrFld[i9 + 1][i9 + 1] = i9;
                    Test.instanceCount += -14;
                    Test.iFld += i6;
                    l3 += i9;
                    f3 = i8;
                    Test.iFld -= (int)d;
                    Test.iFld -= (int)Test.instanceCount;
                }
                l2 = i7;
                f3 -= 27622;
            }
        }
        long meth_res = l2 + Double.doubleToLongBits(d) + l3 + i6 + i7 + i8 + (b ? 1 : 0) + i9 +
            Float.floatToIntBits(f3);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        float f2=-94.584F;
        int i1=-4989, i2=0, i3=-11, i4=7, i5=226;
        double d1=77.126596;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 12L);

        Test.iFld += (int)((Test.iFld + Test.iFld) - ((f2--) + (++Test.iFld)));
        for (i1 = 7; i1 < 161; i1++) {
            i3 = 1;
            do {
                i4 = 1;
                while (++i4 < 1) {
                    f2 *= (--i2);
                    Test.iFld = i4;
                }
                i5 = 1;
                while (++i5 < 1) {
                    Test.iArrFld[i5][i1] += i4;
                    Test.instanceCount += ((iMeth1(Test.instanceCount, d1, Test.instanceCount) + 27541) - i2);
                    lArr[i3 - 1] = Test.instanceCount;
                    Test.iFld = i4;
                    Test.instanceCount += (((i5 * Test.instanceCount) + i5) - Test.instanceCount);
                    Test.iFld %= (int)(Test.instanceCount | 1);
                    i2 -= i1;
                }
                Test.instanceCount = 108;
            } while (++i3 < 10);
        }
        long meth_res = Float.floatToIntBits(f2) + i1 + i2 + i3 + i4 + i5 + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i) {

        float f1=-1.575F;
        int i10=-7, i11=0, i12=165;
        byte by=-43;
        boolean b1=true;
        short s=-8572;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 1124111252932084398L);

        vMeth1((long)(((f1 + f1) - iMeth()) - Test.instanceCount), f1);
        for (i10 = 2; i10 < 302; i10++) {
            i12 = 1;
            do {
                f1 += (((i12 * i12) + i) - Test.iFld);
                if (i12 != 0) {
                    vMeth_check_sum += i + Float.floatToIntBits(f1) + i10 + i11 + i12 + by + (b1 ? 1 : 0) + s +
                        FuzzerUtils.checkSum(lArr1);
                    return;
                }
                i11 += by;
            } while (++i12 < 6);
            Test.iFld += (i10 | i);
            Test.iArrFld[i10] = Test.iArrFld[i10 - 1];
        }
        for (long l4 : lArr1) {
            switch ((((-19 >>> 1) % 10) * 5) + 81) {
            case 115:
                i -= (int)-1L;
                break;
            case 100:
                f1 = by;
                if (b1) continue;
                l4 = i12;
                Test.iFld = s;
            case 107:
                Test.iArrFld[(i11 >>> 1) % N][(-10 >>> 1) % N] -= i12;
                break;
            case 92:
                Test.iFld += (int)Test.instanceCount;
                break;
            case 95:
            case 110:
                Test.iFld >>= i11;
                break;
            case 117:
            case 94:
                if (b1) break;
                break;
            case 126:
                Test.instanceCount -= i12;
                break;
            case 83:
            default:
                l4 -= l4;
            }
        }
        vMeth_check_sum += i + Float.floatToIntBits(f1) + i10 + i11 + i12 + by + (b1 ? 1 : 0) + s +
            FuzzerUtils.checkSum(lArr1);
    }

    public void mainTest(String[] strArr1) {

        long l=-3603949896894260253L, l5=159L;
        int i13=205, i14=45949, i15=-3, i16=-12, i17=106, i18=7656, i19=12, i20=-175;
        short s1=-6546;
        float f4=-2.881F;

        l = 1;
        while (++l < 361) {
            vMeth(-254);
        }
        i13 = 1;
        do {
            for (i14 = i13; i14 < 156; ++i14) {
                for (i16 = i14; i16 < 1; i16++) {
                    boolean b2=false;
                    Test.iArrFld[i16 - 1][i14 + 1] -= s1;
                    i15 = (int)f4;
                    b2 = b2;
                    lArrFld = lArrFld;
                    i17 += (int)1.124361;
                    try {
                        Test.iFld = (i16 % -152);
                        i15 = (i15 / 816089303);
                        i17 = (-46 / i16);
                    } catch (ArithmeticException a_e) {}
                }
                Test.instanceCount = i15;
                i15 &= i15;
                switch ((i13 % 2) + 126) {
                case 126:
                    i17 = (int)Test.instanceCount;
                    Test.iFld = Test.iFld;
                    i15 = Test.iFld;
                    byFld += (byte)-5;
                    break;
                case 127:
                    i17 -= (int)-4L;
                    Test.instanceCount += (i14 ^ Test.instanceCount);
                    for (i18 = i13; 1 > i18; i18++) {
                        try {
                            Test.iArrFld[i18 + 1][i14 - 1] = (-36181 / Test.iArrFld[i13 - 1][i18 - 1]);
                            Test.iArrFld[i18 + 1][i13 + 1] = (i18 % i19);
                            Test.iFld = (10078 / i19);
                        } catch (ArithmeticException a_e) {}
                    }
                    break;
                default:
                    i15 += (i14 * Test.iFld);
                }
            }
            i20 = 1;
            do {
                Test.instanceCount = byFld;
                i19 |= -181;
                l5 = 1;
                while (++l5 < 3) {
                    if (false) continue;
                    f4 = i15;
                    lArrFld[(int)(l5 + 1)] -= i18;
                }
            } while ((i20 += 3) < 156);
        } while ((i13 += 2) < 323);


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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}