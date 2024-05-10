package tests.javafuzzer2416;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 14:21:58 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=96L;
    public static short sFld=2793;
    public static int iFld=-13;
    public static double dFld=117.48640;
    public int iArrFld[][]=new int[N][N];

    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(long l, int i3, float f) {

        int i4=-193, i5=46266, i6=-86, i7=0, i8=34185;
        boolean b=true;
        short s=-31254;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 24077L);

        i4 = 1;
        while (++i4 < 342) {
            b = b;
            i3 -= (int)l;
            for (i5 = 1; i5 < 5; i5++) {
                lArr[i4 + 1] &= i5;
                i3 *= i5;
                i6 >>= s;
                Test.instanceCount -= Test.instanceCount;
                f += i5;
                l += (i5 * l);
                for (i7 = 1; i7 < 2; i7++) {
                    f = Test.instanceCount;
                    i3 -= i5;
                    Test.instanceCount *= i5;
                }
            }
            l = 24;
        }
        long meth_res = l + i3 + Float.floatToIntBits(f) + i4 + (b ? 1 : 0) + i5 + i6 + s + i7 + i8 +
            FuzzerUtils.checkSum(lArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(double d) {

        int i2=194, i9=17736, i10=2, i11=23173, i12=35281, i13=129, i14=-5, i15=-3, i16=-10, i17=15, iArr[]=new int[N];
        float f1=-1.391F;
        boolean b1=false;

        FuzzerUtils.init(iArr, -221);

        iArr[(i2 >>> 1) % N] *= (int)(iMeth1(Test.instanceCount, i2, 57.229F) - Test.instanceCount);
        for (i9 = 159; i9 > 6; i9 -= 3) {
            byte by1=74;
            f1 *= f1;
            i2 *= i11;
            by1 += (byte)Test.sFld;
            for (i12 = 1; i12 < 30; i12++) {
                f1 -= i2;
            }
            for (i14 = 1; i14 < 30; ++i14) {
                Test.instanceCount = -50651;
                for (i16 = 1; i16 < 2; ++i16) {
                    switch (((i9 % 4) * 5) + 127) {
                    case 145:
                        Test.iFld = by1;
                    case 143:
                        b1 = b1;
                        d += i11;
                        break;
                    case 144:
                        i11 = by1;
                        break;
                    case 135:
                        i10 = (int)-6449448531492934936L;
                        break;
                    }
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d) + i2 + i9 + i10 + Float.floatToIntBits(f1) + i11 + i12 + i13 + i14 +
            i15 + i16 + i17 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(int i, int i1) {

        double d1=1.83892;

        iMeth(d1);
        long meth_res = i + i1 + Double.doubleToLongBits(d1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        byte by=66;
        int i18=-4, i19=-6, i20=3, i21=-40413, i22=-33, i23=9, i24=-9;
        float f2=-1.242F, f3=100.236F, fArr[]=new float[N];
        long l1=203L;
        boolean b2=false;

        FuzzerUtils.init(fArr, 7.441F);

        by >>>= (byte)((++Test.instanceCount) - 26);
        lMeth(Test.iFld, Test.iFld);
        Test.dFld = Test.iFld;
        for (i18 = 254; i18 > 13; --i18) {
            f2 += (((i18 * Test.iFld) + Test.iFld) - i19);
            i20 = 1;
            do {
                l1 /= (l1 | 1);
                for (f3 = 1; f3 > 1; --f3) {
                    fArr[i18 - 1] -= i21;
                }
                switch (((i20 % 8) * 5) + 44) {
                case 71:
                    Test.iFld -= i19;
                case 63:
                    Test.iFld = 9;
                    Test.iFld >>= (int)-8715964248805752086L;
                    for (i22 = i20; i22 < 1; ++i22) {
                        i24 *= (int)l1;
                        Test.instanceCount ^= i24;
                        Test.iFld = (int)f3;
                        Test.iFld <<= (int)463168753L;
                        l1 >>= -199;
                        Test.instanceCount = i19;
                        iArrFld[i20 + 1] = iArrFld[i22 - 1];
                    }
                    if (b2) continue;
                    break;
                case 66:
                    try {
                        i21 = (99 / Test.iFld);
                        i24 = (i18 % i19);
                        i24 = (i22 / 71);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 50:
                case 54:
                    Test.instanceCount += (((i20 * l1) + i19) - Test.instanceCount);
                    switch (((i18 % 2) * 5) + 101) {
                    case 102:
                        iArrFld[i18 - 1][i20 - 1] *= i20;
                        iArrFld[i20][i18 + 1] = i20;
                        l1 += (i20 * i22);
                        break;
                    case 105:
                        l1 = Test.instanceCount;
                        i19 *= i19;
                        break;
                    }
                    break;
                case 55:
                    iArrFld[i18 + 1][i18] = i19;
                case 56:
                case 59:
                    Test.instanceCount = 138;
                default:
                    i19 = i20;
                }
            } while (++i20 < 104);
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}