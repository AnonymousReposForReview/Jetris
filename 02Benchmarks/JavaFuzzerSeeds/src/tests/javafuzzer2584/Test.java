package tests.javafuzzer2584;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 16:56:43 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-194L;
    public static short sFld=30114;
    public static double dFld=24.38968;
    public static long lFld=-174L;
    public float fFld=0.248F;
    public static int iFld=112;
    public double dArrFld[]=new double[N];

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l, int i6, int i7) {

        int i8=130, i9=-52890, i10=-54312, i11=-14836, i12=60105, iArr[]=new int[N];
        float f1=-66.671F;
        boolean b=false;

        FuzzerUtils.init(iArr, 12);

        for (i8 = 12; 215 > i8; i8++) {
            Test.instanceCount += (((i8 * i7) + i9) - i6);
            i7 >>>= i7;
            if (b) {
                i6 += (int)Test.instanceCount;
                switch ((i8 % 1) + 104) {
                case 104:
                    for (i10 = i8; 8 > i10; ++i10) {
                        iArr[i8] -= (int)-1.11026;
                        Test.dFld -= i9;
                        iArr = iArr;
                        i12 = 1;
                        while (++i12 < 1) {
                            i11 = i11;
                            f1 = i10;
                            i9 -= (int)l;
                            Test.lFld = i9;
                        }
                    }
                default:
                    i9 = (int)Test.lFld;
                }
            } else if (b) {
                i9 -= (int)Test.instanceCount;
            } else {
                if (i9 != 0) {
                    vMeth1_check_sum += l + i6 + i7 + i8 + i9 + i10 + i11 + i12 + Float.floatToIntBits(f1) + (b ? 1 :
                        0) + FuzzerUtils.checkSum(iArr);
                    return;
                }
            }
        }
        vMeth1_check_sum += l + i6 + i7 + i8 + i9 + i10 + i11 + i12 + Float.floatToIntBits(f1) + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr);
    }

    public static long lMeth() {

        int i5=10;
        float f=-2.824F;
        double d=-2.14731;

        Test.instanceCount -= i5;
        f = (float)((d - Long.reverseBytes(Test.instanceCount)) - (Test.sFld = (short)Math.abs(Test.instanceCount)));
        vMeth1(-8788711278690739529L, i5, i5);
        i5 += (int)d;
        i5 -= i5;
        long meth_res = i5 + Float.floatToIntBits(f) + Double.doubleToLongBits(d);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void vMeth(int i, int i1, int i2) {

        int i3=89, i4=-99, i14=-44381, i15=-51, i16=-7, i17=158, iArr1[]=new int[N];
        boolean b1=true;

        FuzzerUtils.init(iArr1, -56053);

        for (i3 = 3; i3 < 257; ++i3) {
            Test.instanceCount += (long)((lMeth() + Test.lFld) + fFld);
            fFld += (((i3 * fFld) + Test.lFld) - Test.instanceCount);
            Test.lFld += i3;
            for (i14 = 6; i14 > 1; --i14) {
                switch (((i14 % 3) * 5) + 10) {
                case 19:
                    for (i16 = 1; 2 > i16; ++i16) {
                        i4 *= i17;
                        Test.instanceCount = Test.lFld;
                        i2 -= Test.sFld;
                        i1 += (int)Test.instanceCount;
                        iArr1[i14] >>>= (int)Test.lFld;
                        dArrFld[i14 - 1] += Test.instanceCount;
                        Test.lFld *= Test.sFld;
                        iArr1[i3 - 1] -= (int)Test.dFld;
                    }
                case 22:
                    i17 = i4;
                    break;
                case 17:
                    b1 = b1;
                    break;
                }
            }
        }
        vMeth_check_sum += i + i1 + i2 + i3 + i4 + i14 + i15 + i16 + i17 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {


        vMeth(Test.iFld, Test.iFld, Test.iFld);



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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
