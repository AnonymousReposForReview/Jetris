package tests.javafuzzer807;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 10:20:27 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-4410000264277016758L;
    public static double dFld=20.81338;
    public int iFld=-9075;

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i1, float f1, float f2) {

        int i2=-4, i3=-12, i4=-140, i5=9, i6=-6, iArr[]=new int[N];
        float f3=0.454F, f4=-6.947F;
        boolean b=true;
        double d1=0.104625;

        FuzzerUtils.init(iArr, -218);

        i2 = 1;
        do {
            for (f3 = 6; f3 > 1; f3--) {
                if (b) {
                    for (f4 = 1; f4 < 2; f4++) {
                        i3 = i4;
                        i4 += (int)f1;
                        Test.instanceCount = i3;
                    }
                    f2 *= i2;
                    i3 *= i4;
                    i1 = i2;
                } else {
                    for (i5 = 2; i5 > 1; i5--) {
                        i1 = -6;
                        iArr[i2 - 1] = (int)f3;
                        d1 += i3;
                        i6 <<= i1;
                    }
                }
            }
        } while (++i2 < 292);
        vMeth1_check_sum += i1 + Float.floatToIntBits(f1) + Float.floatToIntBits(f2) + i2 + Float.floatToIntBits(f3) +
            i3 + Float.floatToIntBits(f4) + i4 + (b ? 1 : 0) + i5 + i6 + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i) {

        float f5=-48.157F;
        double d2=-1.117541;

        vMeth1(202, f5, f5);
        d2 += Test.instanceCount;
        i += i;
        vMeth_check_sum += i + Float.floatToIntBits(f5) + Double.doubleToLongBits(d2);
    }

    public static void vSmallMeth(float f, double d) {

        int i7=52308;

        vMeth(i7);
        i7 >>= i7;
        vSmallMeth_check_sum += Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i7;
    }

    public void mainTest(String[] strArr1) {

        float f6=0.683F;

        for (int smallinvoc=0; smallinvoc<855; smallinvoc++) vSmallMeth(f6, Test.dFld);
        iFld += iFld;
        iFld = iFld;
        iFld >>= iFld;


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