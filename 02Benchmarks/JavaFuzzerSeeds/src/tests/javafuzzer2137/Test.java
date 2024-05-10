package tests.javafuzzer2137;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 09:20:38 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=11L;
    public static int iFld=-239;
    public byte byFld=23;
    public static double dFld=-1.20572;
    public static volatile short sFld=22132;
    public static byte byFld1=54;
    public static float fArrFld[]=new float[N];
    public static double dArrFld[][]=new double[N][N];

    static {
        FuzzerUtils.init(Test.fArrFld, 1.437F);
        FuzzerUtils.init(Test.dArrFld, -2.12861);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long sMeth_check_sum = 0;

    public static short sMeth(int i5, long l) {


        i5 = (int)Test.instanceCount;
        i5 = i5;
        long meth_res = i5 + l;
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static void vMeth1() {

        int i6=-1, i7=-4, i8=-58254, i9=1, i10=11632;
        boolean b=true;

        Test.fArrFld[(-36296 >>> 1) % N] -= sMeth(Test.iFld, 117L);
        for (i6 = 5; i6 < 136; i6++) {
            i7 = i6;
            for (i8 = 1; i8 < 12; i8++) {
                i7 += i8;
                Test.iFld += i8;
                if (true) continue;
                i10 = 1;
                do {
                    Test.instanceCount = i9;
                    Test.iFld = (int)-1958637435L;
                    i9 -= i8;
                    Test.instanceCount *= Test.iFld;
                    Test.dFld = Test.instanceCount;
                    Test.instanceCount -= -22561;
                    if (b) break;
                } while (++i10 < 2);
            }
        }
        vMeth1_check_sum += i6 + i7 + i8 + i9 + i10 + (b ? 1 : 0);
    }

    public static void vMeth() {

        int i3=3, i4=-61659, i11=88, i12=-14, i13=5, i14=-55213, i15=-54337, i16=9, iArr[]=new int[N];
        boolean b1=true;

        FuzzerUtils.init(iArr, 7);

        for (i3 = 15; 312 > i3; i3++) {
            vMeth1();
            for (i11 = 1; i11 < 6; i11++) {
                iArr[i3] += Test.iFld;
                i4 += (int)Test.instanceCount;
                Test.iFld *= Test.iFld;
            }
            Test.sFld *= (short)2.176F;
        }
        i12 = i4;
        i13 = 1;
        do {
            if (b1) continue;
            Test.iFld += i13;
        } while (++i13 < 300);
        i14 -= (int)34.105519;
        for (i15 = 5; i15 < 152; ++i15) {
            Test.byFld1 >>= (byte)39335;
            i4 += Test.iFld;
        }
        vMeth_check_sum += i3 + i4 + i11 + i12 + i13 + (b1 ? 1 : 0) + i14 + i15 + i16 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i=8, i1=10787, i2=-5, i17=-6462, i18=-2, i19=122, i20=1, i21=108, i22=-122, i23=13, i24=108, iArr1[][]=new
            int[N][N];
        boolean b2=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -8219545811064226603L);
        FuzzerUtils.init(iArr1, 19313);

        Test.iFld ^= (int)Long.reverseBytes((--Test.iFld) * byFld);
        i = 1;
        do {
            for (i1 = 3; i1 < 121; ++i1) {
                vMeth();
                Test.iFld -= (int)Test.dFld;
                lArr[i1] = i;
                Test.iFld -= 36487;
                iArr1[i1 + 1][i] = i;
                lArr[i1] *= i1;
                Test.dArrFld = Test.dArrFld;
            }
            Test.iFld %= (int)(byFld | 1);
            Test.fArrFld[i - 1] += (float)Test.dFld;
            for (i17 = 4; i17 < 121; ++i17) {
                Test.sFld = (short)Test.dFld;
                Test.iFld -= i2;
            }
            Test.dFld += i;
            Test.instanceCount -= i2;
            if (b2) continue;
            Test.instanceCount = i2;
            Test.dFld -= 6;
        } while (++i < 208);
        for (i19 = 384; 12 < i19; i19 -= 3) {
            i2 = i21;
            if (b2) continue;
            Test.instanceCount += i19;
            if (true) break;
            i22 = 1;
            while (++i22 < 202) {
                for (i23 = 1; i23 < 1; i23++) {
                    i20 += (i23 * Test.iFld);
                    Test.instanceCount = Test.instanceCount;
                }
                Test.instanceCount &= i2;
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  sMeth ->  sMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
