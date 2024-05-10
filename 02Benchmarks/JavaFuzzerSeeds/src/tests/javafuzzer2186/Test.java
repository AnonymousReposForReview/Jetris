package tests.javafuzzer2186;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 09:48:23 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=4748251838284612801L;
    public static float fFld=1.763F;
    public static int iFld=54503;
    public static volatile short sFld=29576;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 1104);
        FuzzerUtils.init(Test.lArrFld, -4170606396L);
    }

    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static void vMeth(long l, float f1) {


        Test.sFld = (short)(Test.sFld + -25986L);
        vMeth_check_sum += l + Float.floatToIntBits(f1);
    }

    public static int iMeth(int i2, float f2) {

        double d1=110.104763, d2=0.42644;
        int i3=209, i4=-58468, i5=48;
        boolean b=true;

        for (d1 = 13; d1 < 253; ++d1) {
            vMeth(Test.instanceCount, Test.fFld);
            for (i4 = 1; 7 > i4; ++i4) {
                if (b) break;
                d2 += Test.iFld;
                i3 = 47417;
                i2 = i4;
                Test.iArrFld[(int)(d1 + 1)] = (int)Test.instanceCount;
                switch ((int)((d1 % 2) + 123)) {
                case 123:
                    i3 += (int)1.474F;
                case 124:
                    Test.instanceCount += (((i4 * i5) + Test.iFld) - i5);
                    break;
                default:
                    Test.lArrFld = Test.lArrFld;
                    try {
                        i3 = (i5 % i2);
                        i3 = (-244 / i4);
                        i5 = (-223 / Test.iArrFld[(int)(d1)]);
                    } catch (ArithmeticException a_e) {}
                    i5 %= (int)(i5 | 1);
                }
                Test.fFld += (((i4 * i5) + Test.iFld) - i5);
            }
        }
        long meth_res = i2 + Float.floatToIntBits(f2) + Double.doubleToLongBits(d1) + i3 + i4 + i5 + (b ? 1 : 0) +
            Double.doubleToLongBits(d2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static double dMeth(float f) {

        double d=-1.55540;

        Test.iFld = (Test.iFld--);
        Test.iFld += Math.abs(-4);
        vMeth((long)(f - ((long)(d + Test.iFld) << (Test.iArrFld[(Test.iFld >>> 1) % N]++))), Math.abs(-(Test.iFld -
            Test.iFld)));
        d -= iMeth(-1940, f);
        Test.iFld = (int)Test.instanceCount;
        Test.iFld *= Test.iFld;
        long meth_res = Float.floatToIntBits(f) + Double.doubleToLongBits(d);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-5, i1=5, i6=-2762, i7=-18675, i8=-6, i9=32;
        boolean b1=true;
        double d3=-2.11171;

        Test.fFld = (-Test.iFld);
        Test.iFld <<= (int)((Test.instanceCount--) + ((~(Test.iFld + Test.iFld)) - (Test.instanceCount++)));
        for (i = 11; i < 253; ++i) {
            if (((Test.instanceCount++) + (dMeth(Test.fFld) - 35444)) > 149) break;
            i6 = 1;
            do {
                for (i7 = 1; i7 < 1; ++i7) {
                    i1 ^= i6;
                    Test.iFld = i8;
                    Test.iFld >>= (int)Test.instanceCount;
                    Test.iFld >>= -87;
                    Test.sFld -= (short)i8;
                    Test.instanceCount *= i6;
                    Test.iArrFld[i6 + 1] = (int)1.33024;
                    if (b1) break;
                    switch ((i % 3) + 15) {
                    case 15:
                        if (b1) break;
                        i1 |= (int)Test.instanceCount;
                        i8 = (int)Test.fFld;
                        try {
                            i1 = (Test.iArrFld[i7] % -69);
                            i8 = (Test.iArrFld[i7 - 1] / i6);
                            Test.iFld = (i / -83);
                        } catch (ArithmeticException a_e) {}
                    case 16:
                        Test.fFld += Test.instanceCount;
                        Test.fFld += i7;
                        break;
                    case 17:
                        Test.iFld += (52 + (i7 * i7));
                        Test.iFld /= (int)((long)(d3) | 1);
                        break;
                    }
                }
                i1 <<= i8;
            } while (++i6 < 104);
            Test.instanceCount += (i * i);
            i8 = i6;
            i9 = 1;
            do {
                Test.iFld *= (int)d3;
                i1 >>= (int)Test.instanceCount;
                i8 = i1;
            } while (++i9 < 104);
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
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  vMeth ->  vMeth dMeth mainTest iMeth
//DEBUG  iMeth ->  iMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
