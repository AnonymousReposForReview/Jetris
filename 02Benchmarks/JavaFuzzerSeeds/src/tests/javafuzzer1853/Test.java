package tests.javafuzzer1853;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 04:35:47 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-98L;
    public int iFld=26;
    public static double dFld=15.28990;
    public static int iFld1=-23223;
    public static float fFld=0.371F;
    public static short sFld=10101;
    public static boolean bFld=true;
    public volatile int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];
    public static int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -42424L);
        FuzzerUtils.init(Test.iArrFld1, 5);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;
    public static long vMeth3_check_sum = 0;

    public void vMeth() {

        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)28326);

        Test.instanceCount += (((++iArrFld[(iFld >>> 1) % N]) % (Math.min(iFld, iFld) | 1)) * (Test.instanceCount <<
            sArr[(iFld >>> 1) % N]));
        vMeth_check_sum += FuzzerUtils.checkSum(sArr);
    }

    public static int iMeth(long l) {

        int i3=-11;
        float f1=2.474F;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-106);

        Test.dFld = Double.longBitsToDouble(Test.lArrFld[(i3 >>> 1) % N] = (i3 + i3));
        f1 = byArr[(i3 >>> 1) % N];
        long meth_res = l + i3 + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(byArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth3(int i7) {

        int i8=50798, i9=228, i10=10, i11=-52256, i12=53959;
        short s=-2207;
        double d=-2.13996;
        byte by=-108, byArr1[][]=new byte[N][N];

        FuzzerUtils.init(byArr1, (byte)-92);

        for (i8 = 6; i8 < 164; i8++) {
            boolean b=false;
            i7 += (((i8 * Test.fFld) + Test.fFld) - Test.instanceCount);
            s = (short)Test.instanceCount;
            switch ((i8 % 1) + 47) {
            case 47:
                i9 *= i9;
                b = b;
                i9 += (i8 | (long)Test.fFld);
                break;
            }
        }
        for (d = 13; d < 253; d++) {
            by |= (byte)s;
        }
        i7 >>= i7;
        i9 = (int)Test.fFld;
        byArr1[(i9 >>> 1) % N][(i10 >>> 1) % N] = (byte)Test.dFld;
        for (i11 = 6; i11 < 354; ++i11) {
            i7 += (int)Test.instanceCount;
            i12 = 200;
        }
        vMeth3_check_sum += i7 + i8 + i9 + s + Double.doubleToLongBits(d) + i10 + by + i11 + i12 +
            FuzzerUtils.checkSum(byArr1);
    }

    public static void vMeth2() {

        int i13=-1, i14=4, i15=1;
        long l1=-53144L;
        boolean b1=false;
        float f2=1.72F;

        Test.iFld1 += ((Test.iFld1++) - Test.iFld1);
        vMeth3(Test.iFld1);
        for (i13 = 7; i13 < 338; ++i13) {
            Test.instanceCount += (((i13 * l1) + i13) - Test.iFld1);
            Test.instanceCount |= Test.iFld1;
            i15 = 1;
            do {
                l1 -= Test.iFld1;
                Test.iFld1 ^= Test.iFld1;
                Test.iFld1 += Test.iFld1;
            } while (++i15 < 5);
            if (b1) continue;
            f2 = 1;
            do {
                i14 -= Test.sFld;
                Test.fFld += i13;
                l1 += 185;
                Test.iFld1 += i14;
            } while ((f2 += 2) < 5);
        }
        vMeth2_check_sum += i13 + i14 + l1 + i15 + (b1 ? 1 : 0) + Float.floatToIntBits(f2);
    }

    public static void vMeth1(int i4, int i5, int i6) {

        boolean b2=true;
        byte by1=42;
        int i16=-6, i17=10, i18=6, i19=-30690, i20=-14, i21=-154;

        Test.iArrFld1[(14 >>> 1) % N] >>= i5;
        vMeth2();
        b2 = b2;
        Test.iFld1 &= by1;
        for (i16 = 330; i16 > 12; i16--) {
            by1 -= (byte)i4;
            i4 -= (int)Test.instanceCount;
            Test.iFld1 += i16;
        }
        for (i18 = 2; i18 < 136; ++i18) {
            if (b2) continue;
            if (b2) continue;
            for (i20 = i18; 12 > i20; i20++) {
                if (b2) {
                    i4 += (int)Test.instanceCount;
                    by1 += (byte)(i20 | i17);
                } else {
                    Test.fFld -= i17;
                }
            }
        }
        vMeth1_check_sum += i4 + i5 + i6 + (b2 ? 1 : 0) + by1 + i16 + i17 + i18 + i19 + i20 + i21;
    }

    public void mainTest(String[] strArr1) {

        int i=-11685, i1=179, i2=-170, i22=-42, i23=-1, i24=-59223, i25=6854;
        float f=0.208F, fArr[]=new float[N];
        byte by2=-103;

        FuzzerUtils.init(fArr, 3.863F);

        for (i = 9; 266 > i; i++) {
            i1 %= (int)((((iArrFld[i]++) + (++i1)) + Math.max(Math.max(i1, iFld), 20661)) | 1);
        }
        vMeth();
        f += i1;
        i2 = 1;
        while (++i2 < 159) {
            if (Test.bFld) {
                iMeth(--Test.instanceCount);
                vMeth();
            } else if (Test.bFld) {
                vMeth1(i1, 59640, iFld);
                Test.instanceCount += (i2 | i);
                if (Test.bFld) {
                    iFld += (i2 ^ Test.iFld1);
                    f = i;
                } else {
                    by2 ^= (byte)14;
                    if (Test.bFld) {
                        for (i22 = 4; i22 < 158; i22++) {
                            if (Test.bFld) break;
                            Test.fFld -= 0;
                            i23 += (i22 * i22);
                            Test.bFld = Test.bFld;
                            f += (((i22 * iFld) + Test.instanceCount) - Test.iFld1);
                            fArr[i2] = iFld;
                        }
                        iArrFld[i2 + 1] >>= (int)Test.instanceCount;
                        Test.sFld = (short)Test.instanceCount;
                    }
                    Test.iFld1 -= i2;
                    Test.dFld = iFld;
                }
                for (i24 = 2; 158 > i24; ++i24) {
                    i1 += (13 + (i24 * i24));
                    i1 -= (int)Test.instanceCount;
                    iFld = (int)Test.instanceCount;
                }
            } else if (Test.bFld) {
                iFld += (int)Test.dFld;
            } else {
                i25 += (i2 ^ Test.instanceCount);
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 mainTest
//DEBUG  vMeth3 ->  vMeth3 vMeth2 vMeth1 mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
