package tests.javafuzzer547;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 05:26:44 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=178L;
    public static short sFld=4410;
    public static boolean bFld=false;
    public static volatile int iFld=11929;
    public static float fFld=28.311F;
    public static double dFld=63.24189;

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f, int i4, int i5) {

        int i6=1, i7=2, i8=-1560, i9=7, i10=-13, i11=0, i12=-244, i13=4768, i14=-64, i15=45633;
        byte by=-40;

        i5 = (int)Test.instanceCount;
        for (i6 = 6; i6 < 278; i6++) {
            for (i8 = 1; i8 < 6; i8++) {
                for (i10 = 1; i10 < 2; ++i10) {
                    i5 <<= i5;
                    i9 = (int)Test.instanceCount;
                    i9 <<= i5;
                    Test.instanceCount += i10;
                }
                i11 <<= i12;
                Test.instanceCount -= Test.sFld;
                for (i13 = 1; i13 < 2; ++i13) {
                    i4 = (int)Test.instanceCount;
                    i15 += (((i13 * i11) + i7) - i6);
                    Test.bFld = false;
                    by += (byte)i13;
                }
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + i4 + i5 + i6 + i7 + i8 + i9 + i10 + i11 + i12 + i13 + i14 + i15 +
            by;
    }

    public static void vMeth(long l, int i2, int i3) {

        int i16=-132, i17=65, i18=6, i19=61545, i20=-1136, i21=-1;
        boolean b=false, bArr[]=new boolean[N];
        float f1=-1.500F;
        long lArr[]=new long[N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(lArr, -2712147970L);

        vMeth1(-57.103F, -5, i3);
        for (i16 = 162; 6 < i16; i16 -= 2) {
            Test.instanceCount = i17;
            i18 = 1;
            while (++i18 < 20) {
                i3 += (i18 ^ i3);
                i2 -= (int)-2.78467;
                i3 /= 8;
                for (i19 = i18; i19 < 1; i19++) {
                    i20 >>= (int)l;
                    bArr[i16 + 1] = b;
                    i17 = i2;
                    i20 >>= i3;
                    lArr[i19] = -225;
                    i17 += i16;
                    f1 = i21;
                }
            }
        }
        vMeth_check_sum += l + i2 + i3 + i16 + i17 + i18 + i19 + i20 + (b ? 1 : 0) + Float.floatToIntBits(f1) + i21 +
            FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(lArr);
    }

    public static void vSmallMeth(int i, int i1) {

        int i22=-7;

        vMeth(Test.instanceCount, i1, i1);
        i1 += i22;
        vSmallMeth_check_sum += i + i1 + i22;
    }

    public void mainTest(String[] strArr1) {

        int i23=-243, i24=-23067, i25=-148, i26=144, i27=-135, i28=10, i29=34467, iArr[]=new int[N];
        double d=2.91348;
        long lArr1[]=new long[N];
        float fArr[][]=new float[N][N];
        short sArr[][]=new short[N][N];

        FuzzerUtils.init(iArr, -52066);
        FuzzerUtils.init(lArr1, -59617L);
        FuzzerUtils.init(fArr, 118.27F);
        FuzzerUtils.init(sArr, (short)-25037);

        for (int smallinvoc=0; smallinvoc<189; smallinvoc++) vSmallMeth(Test.iFld, Test.iFld);
        i23 = 316;
        while (--i23 > 0) {
            Test.fFld += Test.iFld;
            i24 = 1;
            while (++i24 < 80) {
                Test.iFld = (int)Test.instanceCount;
                Test.iFld -= Test.iFld;
                Test.iFld = i23;
                iArr[i23] = 0;
                Test.iFld >>= i24;
            }
            iArr[i23 - 1] = Test.iFld;
            Test.iFld -= (int)Test.instanceCount;
            Test.iFld -= (int)Test.fFld;
            Test.dFld -= Test.dFld;
            Test.iFld += (i23 * i23);
            Test.instanceCount = Test.sFld;
            Test.dFld = 15323L;
        }
        fArr = FuzzerUtils.float2array(N, (float)0.189F);
        d = 1;
        do {
            sArr[(int)(d + 1)][(int)(d)] = (short)Test.iFld;
            Test.iFld = -53;
        } while (++d < 370);
        Test.instanceCount = i23;
        i25 = 1;
        while (++i25 < 329) {
            if (Test.bFld) {
                iArr[i25 + 1] -= Test.iFld;
            } else if (Test.bFld) {
                Test.iFld -= i24;
            } else if (Test.bFld) {
                for (i26 = 76; i26 > 2; --i26) {
                    Test.instanceCount *= i25;
                    for (i28 = 1; 2 > i28; i28++) {
                        iArr[i28] = (int)Test.instanceCount;
                        Test.bFld = Test.bFld;
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  vMeth1 ->  vMeth1 vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
