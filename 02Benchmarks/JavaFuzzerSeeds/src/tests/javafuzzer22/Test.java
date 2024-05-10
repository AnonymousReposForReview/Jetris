package tests.javafuzzer22;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 21:07:48 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-555476462536015411L;
    public static short sFld=26192;
    public static boolean bFld=true;
    public static double dFld=-1.93618;
    public static short sArrFld[][]=new short[N][N];
    public int iArrFld[]=new int[N];
    public static long lArrFld[][]=new long[N][N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)12541);
        FuzzerUtils.init(Test.lArrFld, -230912985L);
        FuzzerUtils.init(Test.bArrFld, true);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(double d1) {

        int i8=27, i9=6932, i10=-19555, i11=36864, i12=45982, iArr1[]=new int[N];
        float f=1.658F;

        FuzzerUtils.init(iArr1, -187);

        i8 = 1;
        while (++i8 < 307) {
            for (i9 = 1; i9 < 5; ++i9) {
                switch ((i8 % 4) + 99) {
                case 99:
                    for (i11 = i8; i11 < 2; ++i11) {
                        Test.instanceCount -= -4L;
                        if (Test.bFld) {
                            i12 += (i11 * i11);
                        }
                        iArr1 = iArr1;
                        f -= i12;
                        if (Test.bFld) continue;
                    }
                    f = i8;
                    i12 += (i9 * i9);
                    break;
                case 100:
                    i12 += i9;
                    i10 = 10;
                    iArr1[i8 - 1] = (int)d1;
                    break;
                case 101:
                    i10 += (int)1.39958;
                    break;
                case 102:
                    i10 >>= i9;
                    break;
                }
            }
        }
        vMeth1_check_sum += Double.doubleToLongBits(d1) + i8 + i9 + i10 + i11 + i12 + Float.floatToIntBits(f) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i7) {


        vMeth1(Test.dFld);
        vMeth_check_sum += i7;
    }

    public static int iMeth(long l) {

        int i5=14, i6=10947, i13=147, i14=94, i15=-6696, i16=10, i17=30321, iArr[]=new int[N];

        FuzzerUtils.init(iArr, 61);

        for (i5 = 6; i5 < 147; ++i5) {
            i6 = (int)(((iArr[i5]++) * Test.instanceCount) - i6);
            vMeth(i5);
            Test.instanceCount += (i5 * i5);
            for (i13 = 1; i13 < 11; ++i13) {
                Test.dFld -= Test.dFld;
                i15 = 1;
                while (++i15 < 2) {
                    if (Test.bFld) continue;
                    l += i15;
                    iArr[i5 - 1] += i13;
                }
                i6 = i15;
                iArr[i13 - 1] += (int)Test.dFld;
                for (i16 = 2; i16 > 1; i16--) {
                    i6 -= i14;
                    Test.instanceCount -= Test.instanceCount;
                }
            }
        }
        long meth_res = l + i5 + i6 + i13 + i14 + i15 + i16 + i17 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr3) {

        double d=88.78044;
        int i1=88, i2=-30018, i3=3, i4=13, i18=62236, i19=-211, i20=194, i21=55152;
        float f1=-82.804F;
        long l1=-3L;

        d += (++Test.sFld);
        for (i1 = 7; i1 < 212; i1++) {
            for (i3 = 4; i3 < 122; ++i3) {
                Test.sArrFld[i3 + 1][i1] += (short)(((++i2) + i1) + iMeth(Test.instanceCount));
                switch ((i1 % 2) + 13) {
                case 13:
                    Test.instanceCount = (long)f1;
                    break;
                case 14:
                    iArrFld = iArrFld;
                    Test.dFld -= i4;
                    break;
                }
                Test.lArrFld[i1][i1 - 1] = i1;
                i2 -= (int)127L;
                i4 = 10;
                i18 = 1;
                do {
                    i4 &= (int)Test.instanceCount;
                    Test.instanceCount |= Test.instanceCount;
                    i4 = Test.sFld;
                } while (++i18 < 2);
                Test.instanceCount = i1;
            }
            Test.instanceCount *= -12;
            d -= i3;
            for (i19 = 1; i19 < 122; i19++) {
                i2 <<= 2;
                f1 += (((i19 * i19) + i20) - f1);
                iArrFld = iArrFld;
                for (l1 = 1; l1 < 2; l1++) {
                    i2 -= i2;
                    i21 -= (int)f1;
                    i4 -= i20;
                    Test.bArrFld[i1] = Test.bFld;
                }
                i4 += (i19 * i19);
                Test.bFld = Test.bFld;
                Test.instanceCount %= -26403;
            }
        }


    }
    public static void main(String[] strArr2) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr2);
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