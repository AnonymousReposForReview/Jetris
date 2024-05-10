package tests.javafuzzer1295;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 17:51:26 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=206L;
    public int iFld=-55523;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 7L);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(double d1) {

        int i5=23062;

        Test.lArrFld[(i5 >>> 1) % N] = i5;
        long meth_res = Double.doubleToLongBits(d1) + i5;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i2) {

        int i3=-173, i4=-20113, i6=-5485, i7=4980, i8=157, i9=-5, iArr1[][]=new int[N][N];
        double d2=13.40331;
        float f=-2.960F;
        boolean b=false;

        FuzzerUtils.init(iArr1, 49422);

        for (i3 = 2; i3 < 209; i3++) {
            Test.instanceCount -= (-((--iArr1[i3 + 1][i3]) * (Test.instanceCount + i3)));
            i2 = (iMeth(d2) + -38209);
            i4 += i3;
            d2 += i4;
        }
        for (i6 = 12; i6 < 359; ++i6) {
            Test.instanceCount >>= i6;
            for (i8 = 1; i8 < 5; i8++) {
                f = 2L;
                i7 *= (int)Test.instanceCount;
                i4 += i8;
                if (i9 != 0) {
                    vMeth_check_sum += i2 + i3 + i4 + Double.doubleToLongBits(d2) + i6 + i7 + i8 + i9 +
                        Float.floatToIntBits(f) + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr1);
                    return;
                }
                i7 <<= i8;
                i4 += (i8 - i4);
                b = true;
            }
        }
        vMeth_check_sum += i2 + i3 + i4 + Double.doubleToLongBits(d2) + i6 + i7 + i8 + i9 + Float.floatToIntBits(f) +
            (b ? 1 : 0) + FuzzerUtils.checkSum(iArr1);
    }

    public long lMeth() {

        int i=61, i1=27088, i10=13, i11=-12874, iArr[]=new int[N];
        long l=13L, l1=4L;
        float f1=57.415F;
        boolean b1=false;

        FuzzerUtils.init(iArr, -137);

        for (i = 6; 124 > i; ++i) {
            iArr[i + 1] -= 2662;
            i1 <<= i;
            vMeth(iFld);
            l = 1;
            do {
                for (l1 = 1; 1 > l1; l1++) {
                    i10 >>= i1;
                    iFld += (int)l1;
                    f1 /= (l | 1);
                    i1 <<= i1;
                    switch ((int)((l % 8) + 12)) {
                    case 12:
                        i10 += i;
                        try {
                            iFld = (22323 / i1);
                            i1 = (i1 % 233);
                            iArr[i + 1] = (7782 / iFld);
                        } catch (ArithmeticException a_e) {}
                        i10 += (int)(l1 + l1);
                        break;
                    case 13:
                        Test.instanceCount *= i1;
                        break;
                    case 14:
                        try {
                            i10 = (i10 / iFld);
                            i11 = (i10 / -162);
                            iArr[(int)(l1 + 1)] = (iArr[(int)(l1)] / 179);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 15:
                        i10 >>= -21265;
                        break;
                    case 16:
                        Test.instanceCount += l;
                        break;
                    case 17:
                        i1 *= i;
                    case 18:
                        b1 = b1;
                        break;
                    case 19:
                        i10 = i11;
                        break;
                    }
                }
            } while (++l < 13);
        }
        long meth_res = i + i1 + l + l1 + i10 + Float.floatToIntBits(f1) + i11 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d=93.14857;

        d -= ((--iFld) + (d * lMeth()));
        iFld += (int)d;
        iFld = iFld;


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
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}