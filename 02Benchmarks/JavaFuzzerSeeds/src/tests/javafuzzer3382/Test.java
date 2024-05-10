package tests.javafuzzer3382;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 07:02:56 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-206L;
    public static short sFld=-2755;
    public static int iFld=223;
    public static volatile boolean bFld=false;
    public static volatile float fFld=-54.393F;
    public static long lArrFld[]=new long[N];
    public float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 1585321877L);
    }

    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i5, int i6) {


        i6 = (int)10L;
        long meth_res = i5 + i6;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        int i4=-10, i7=-85, i8=-19130, i9=150, i10=-160;
        float f=3.108F;
        double d=44.42423;

        i4 -= (i4 * (iMeth1(i4, i4) * -245));
        Test.instanceCount <<= i4;
        Test.sFld = Test.sFld;
        i7 = 1;
        do {
            i4 += i7;
            i4 = (int)f;
        } while (++i7 < 270);
        i4 /= (int)((long)(f) | 1);
        for (i8 = 17; 273 > i8; ++i8) {
            i4 += (i8 * i4);
            i9 = i4;
            Test.instanceCount += (((i8 * i9) + i7) - Test.instanceCount);
            Test.sFld = (short)-35523;
            i9 = i7;
            i10 = Test.iFld;
            d += i9;
        }
        long meth_res = i4 + i7 + Float.floatToIntBits(f) + i8 + i9 + i10 + Double.doubleToLongBits(d);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(int i2, long l) {

        int i3=75, i11=43274, i12=-160, i13=-2, i14=8, iArr1[]=new int[N];
        byte by=41;
        float f1=-2.339F;

        FuzzerUtils.init(iArr1, -11268);

        i3 = 1;
        do {
            Test.sFld = (short)Math.abs((i3 + -16336) | (i2--));
            i2 |= i3;
            i2 += (i3 * i3);
            by -= (byte)Float.intBitsToFloat(iMeth());
            for (i11 = 1; 5 > i11; ++i11) {
                Test.iFld ^= i12;
                for (i13 = 2; i13 > 1; i13 -= 2) {
                    i2 ^= i11;
                    if (i14 != 0) {
                    }
                    Test.instanceCount += Test.instanceCount;
                    Test.lArrFld[i11 + 1] += i12;
                    f1 += -207;
                }
            }
            f1 += (((i3 * i12) + i12) - by);
            iArr1[i3] <<= Test.iFld;
        } while (++i3 < 319);
        long meth_res = i2 + l + i3 + by + i11 + i12 + i13 + i14 + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-94, i1=-29911, i15=1, i16=11, i17=17575, i18=176, i19=57547, i20=-8, i21=-48808, i22=-85, i23=-166,
            i24=54695, iArr[][]=new int[N][N];
        long l1=3591894853L;
        byte by1=0;
        double d1=-112.50477;

        FuzzerUtils.init(iArr, -385);

        for (i = 11; i < 378; i++) {
            iArr[i][i] <<= (int)(Math.abs(Math.max(i, i)) * lMeth(-57412, Test.instanceCount));
            i1 = i;
            if (Test.bFld) {
                Test.lArrFld[i + 1] -= Test.sFld;
            }
            Test.instanceCount += (((i * l1) + l1) - i);
            for (i15 = 1; i15 < 69; ++i15) {
                by1 = (byte)i17;
                i17 <<= i;
                iArr[i15 - 1][i - 1] <<= i17;
                i17 += i1;
                i17 += i15;
                by1 = (byte)i17;
            }
            fArrFld[i] += i1;
            for (i18 = 1; i18 < 69; ++i18) {
                iArr[i18][(134 >>> 1) % N] = (int)Test.fFld;
                l1 += 83;
                for (i20 = 1; i20 < 2; i20++) {
                    i1 += i20;
                    i17 = i18;
                    i1 |= Test.iFld;
                    Test.fFld = (float)d1;
                    by1 -= (byte)118;
                    iArr[i18][i - 1] = i21;
                    i21 >>= i16;
                    Test.instanceCount += i17;
                    i22 -= i18;
                }
                for (i23 = 1; 2 > i23; ++i23) {
                    i19 -= i17;
                    i1 = i22;
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
