package tests.javafuzzer2614;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 17:30:37 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-36986147L;
    public int iFld=2423;
    public int iFld1=11;
    public static byte byFld=-65;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 7774796782339927984L);
        FuzzerUtils.init(Test.iArrFld, -20494);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(float f1, float f2, short s) {

        int i2=-6, i3=19408, i4=-35, iArr[][]=new int[N][N];
        boolean b=false;

        FuzzerUtils.init(iArr, -199);

        if (b) {
            Test.iArrFld[(-2 >>> 1) % N] *= i2;
            Test.iArrFld[(i2 >>> 1) % N] *= i2;
            for (i3 = 2; i3 < 182; ++i3) {
                f2 = 28;
                Test.iArrFld[i3] -= (int)Test.instanceCount;
                iArr = iArr;
                i2 = (int)Test.instanceCount;
                s <<= (short)i4;
                Test.instanceCount = i4;
                f2 += (i3 * i3);
                i2 >>= i3;
            }
            i2 *= (int)Test.instanceCount;
        } else {
            Test.instanceCount = Test.instanceCount;
            i2 += -75;
        }
        long meth_res = Float.floatToIntBits(f1) + Float.floatToIntBits(f2) + s + i2 + i3 + i4 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static int iMeth(float f, int i1) {

        short s1=2521;
        int i5=-9, i6=50061, i7=-125, i8=76, i9=-138;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-105);

        fMeth(f, f, s1);
        for (i5 = 23; i5 < 368; ++i5) {
            i1 += i5;
            for (i7 = 1; i7 < 5; ++i7) {
                switch ((i5 % 1) + 58) {
                case 58:
                }
                i6 *= i7;
                i1 += (((i7 * i1) + i8) - i5);
                i8 -= Test.byFld;
                i9 = 1;
                while (++i9 < 2) {
                    i6 = (int)Test.instanceCount;
                    byArr = FuzzerUtils.byte1array(N, (byte)12);
                    if (false) continue;
                    Test.instanceCount -= Test.instanceCount;
                    i6 += -30369;
                }
                i1 = (int)Test.instanceCount;
            }
        }
        long meth_res = Float.floatToIntBits(f) + i1 + s1 + i5 + i6 + i7 + i8 + i9 + FuzzerUtils.checkSum(byArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth(long l) {

        float f3=118.115F;

        Test.iArrFld[(iFld >>> 1) % N] -= (int)(Test.instanceCount = (Test.iArrFld[(iFld1 >>> 1) % N]++));
        iFld1 -= iMeth(f3, iFld1);
        vMeth_check_sum += l + Float.floatToIntBits(f3);
    }

    public void mainTest(String[] strArr1) {

        int i=12, i10=233;
        short s2=23869;
        float f4=0.18F;

        Test.instanceCount = (((++Test.lArrFld[(-6 >>> 1) % N]) * (Test.instanceCount * i)) + (++i));
        vMeth(34427L);
        iFld <<= i;
        Test.instanceCount = iFld1;
        i10 = 307;
        do {
            s2 *= (short)f4;
        } while ((i10 -= 3) > 0);
        Test.iArrFld[(i10 >>> 1) % N] = iFld;


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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  fMeth ->  fMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}