package tests.javafuzzer2780;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 19:57:54 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-231483765L;
    public static byte byFld=-112;
    public static boolean bFld=true;
    public static int iFld=218;
    public static int iFld1=14;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i14, int i15, int i16) {

        int i17=4, i18=58453, i19=35792, i20=59881, i21=-554, i22=-132, i23=-55299;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 20079L);

        i17 = 1;
        while (++i17 < 217) {
            for (i18 = i17; 7 > i18; i18++) {
                i14 |= i17;
                if (false) break;
                if (Test.bFld) break;
                lArr1[i18 - 1] = Test.instanceCount;
                for (i20 = i17; 1 > i20; i20++) {
                    lArr1 = FuzzerUtils.long1array(N, (long)21760L);
                    Test.instanceCount *= Test.instanceCount;
                    Test.instanceCount = i17;
                    Test.instanceCount = Test.byFld;
                }
            }
            for (i22 = 1; 7 > i22; i22++) {
                i21 -= Test.byFld;
                lArr1[i22 + 1] -= (long)53.14217;
                i23 *= 123;
            }
        }
        long meth_res = i14 + i15 + i16 + i17 + i18 + i19 + i20 + i21 + i22 + i23 + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(long l, int i9) {

        int i10=-23247, i11=12313, i12=9, i13=662;
        double d1=1.115869;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)57);

        for (i10 = 279; i10 > 7; i10--) {
            for (i12 = 1; i12 < 6; i12 += 2) {
                i11 += i12;
                i11 >>>= (i13 - i10);
                d1 += (i13++);
                i11 += iMeth(i11, 38, i9);
            }
            i13 = Test.iFld;
        }
        byArr[(i9 >>> 1) % N] = (byte)Test.instanceCount;
        i9 = Test.iFld1;
        vMeth1_check_sum += l + i9 + i10 + i11 + i12 + i13 + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(byArr);
    }

    public static void vMeth(int i2, int i3, double d) {

        int i4=-203, i5=-58759, i6=-21, i7=-13, i8=-26, iArr[]=new int[N];
        float f=-1.340F, f1=47.916F, fArr[]=new float[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(fArr, -37.752F);
        FuzzerUtils.init(lArr, 1389903265L);
        FuzzerUtils.init(iArr, -13520);

        fArr[(i3 >>> 1) % N] = Test.instanceCount;
        Test.instanceCount *= i3;
        for (i4 = 3; 216 > i4; ++i4) {
            if (i5 != 0) {
                vMeth_check_sum += i2 + i3 + Double.doubleToLongBits(d) + i4 + i5 + i6 + i7 + Float.floatToIntBits(f) +
                    Float.floatToIntBits(f1) + i8 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
                    FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
                return;
            }
            for (i6 = 1; i6 < 8; ++i6) {
                Test.byFld = (byte)(lArr[i6]--);
                if (Test.bFld) {
                    i5 += (((i6 * Test.instanceCount) + f) - i6);
                    i3 -= (int)Test.instanceCount;
                    Test.byFld = (byte)((i5++) + i5);
                } else if (false) {
                    for (f1 = 1; f1 < 2; f1++) {
                        iArr[(int)(f1 + 1)] -= (int)(i8 - ((-(i8++)) + Math.abs(d)));
                        iArr[i6] = (int)(++Test.instanceCount);
                        vMeth1(Test.instanceCount, i3);
                        iArr[i6 - 1] = i8;
                    }
                } else {
                    lArr[i4] += i2;
                }
            }
        }
        vMeth_check_sum += i2 + i3 + Double.doubleToLongBits(d) + i4 + i5 + i6 + i7 + Float.floatToIntBits(f) +
            Float.floatToIntBits(f1) + i8 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i=18722, i1=246, i24=28905, i25=25328, i26=115, i27=-11, i28=60, i29=5, iArr1[]=new int[N];
        double d2=0.114588, dArr[]=new double[N];
        float f2=-1.378F, f3=-115.606F;

        FuzzerUtils.init(iArr1, 9);
        FuzzerUtils.init(dArr, -41.111813);

        for (i = 2; 123 > i; i++) {
            vMeth(i, i, d2);
            if (Test.bFld) continue;
            for (i24 = 6; i24 < 207; i24++) {
                i1 -= i25;
                Test.iFld1 += (i24 * Test.instanceCount);
                Test.instanceCount += i24;
                iArr1[i - 1] = i24;
                iArr1[i24 - 1] = i25;
                dArr = dArr;
                d2 -= Test.instanceCount;
            }
        }
        for (i26 = 9; i26 < 364; i26++) {
            i28 = 1;
            do {
                i27 -= i;
                if (Test.bFld) break;
                Test.iFld1 *= (int)d2;
                Test.iFld >>>= (int)Test.instanceCount;
                Test.iFld *= (int)Test.instanceCount;
                dArr[i28 + 1] -= -8;
                if (Test.bFld) break;
                for (f2 = i28; f2 < 1; ++f2) {
                    if (Test.bFld) continue;
                    Test.instanceCount = i;
                    i25 = 0;
                    i25 += (int)(((f2 * Test.byFld) + Test.iFld) - Test.byFld);
                    i25 += (int)f2;
                    Test.instanceCount = Test.instanceCount;
                    i25 = (int)Test.instanceCount;
                    Test.iFld = i26;
                    f3 -= i27;
                }
            } while (++i28 < 71);
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
