package tests.javafuzzer220;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 00:18:09 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=71L;
    public int iFld=-4;
    public static float fFld=-81.487F;
    public static byte byFld=-123;
    public static boolean bFld=false;
    public volatile long lArrFld[][]=new long[N][N];

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l, long l1, double d) {

        int i2=-12, i3=-166, i4=199, i5=11705, i6=-4, i7=8;
        byte byArr[]=new byte[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(byArr, (byte)-26);
        FuzzerUtils.init(lArr, 47412L);

        i2 = 1;
        do {
            Test.instanceCount = -126;
            i3 += i2;
            i3 >>= i2;
            for (i4 = i2; i4 < 6; i4++) {
                for (i6 = 1; i6 < 1; i6 += 2) {
                    i3 >>= -10;
                    i7 = i6;
                    i7 -= 45835;
                    i3 -= (int)Test.instanceCount;
                    i3 = i4;
                }
                byArr[i2] = (byte)116;
                i7 = i6;
                i5 += -2;
            }
        } while (++i2 < 274);
        lArr[(i7 >>> 1) % N] += l1;
        vMeth1_check_sum += l + l1 + Double.doubleToLongBits(d) + i2 + i3 + i4 + i5 + i6 + i7 +
            FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(float f, int i1) {

        double d1=-36.55776;

        vMeth1(Test.instanceCount, Test.instanceCount, d1);
        i1 += i1;
        d1 = i1;
        Test.instanceCount = Test.instanceCount;
        vMeth_check_sum += Float.floatToIntBits(f) + i1 + Double.doubleToLongBits(d1);
    }

    public static void vSmallMeth(byte by, int i) {


        vMeth(Test.fFld, i);
        vSmallMeth_check_sum += by + i;
    }

    public void mainTest(String[] strArr1) {

        int i8=223, i9=-7460, i10=-95, i11=31768, i12=-7428, iArr[]=new int[N];
        float f1=1.586F;
        short s=-21033;

        FuzzerUtils.init(iArr, 29112);

        Test.instanceCount = iFld;
        for (int smallinvoc=0; smallinvoc<421; smallinvoc++) vSmallMeth(Test.byFld, iFld);
        iFld = (int)Test.instanceCount;
        i8 = 1;
        do {
            for (i9 = 3; i9 < 70; i9++) {
                iArr[i9 - 1] -= i8;
                switch (((i8 % 7) * 5) + 2) {
                case 30:
                    if (Test.bFld) break;
                    break;
                case 29:
                case 32:
                    i10 += i10;
                    if (Test.bFld) break;
                    iFld += (((i9 * i10) + Test.instanceCount) - iFld);
                    break;
                case 13:
                    if (false) break;
                    lArrFld[i9 - 1][i9] = 2;
                    break;
                case 26:
                    lArrFld[i9][i8] *= i10;
                    iFld <<= -51860;
                case 24:
                    Test.fFld = Test.instanceCount;
                    f1 = 1;
                    while (++f1 < 2) {
                        iFld = (int)Test.instanceCount;
                        i10 = i9;
                        Test.byFld = Test.byFld;
                        s += (short)((long)f1 | iFld);
                        Test.bFld = false;
                        lArrFld[i9 - 1][(int)(f1)] <<= i8;
                        s = (short)i9;
                    }
                    iArr[i8 + 1] = i10;
                    break;
                case 19:
                    Test.byFld &= (byte)iFld;
                    for (i11 = i9; i11 < 2; ++i11) {
                        i12 -= -25;
                        lArrFld[i8 + 1] = FuzzerUtils.long1array(N, (long)608245619L);
                        Test.instanceCount = i12;
                    }
                    break;
                }
            }
        } while (++i8 < 358);


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