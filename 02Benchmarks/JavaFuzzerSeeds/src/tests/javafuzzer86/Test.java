package tests.javafuzzer86;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 22:07:42 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-174L;
    public static boolean bFld=true;
    public static float fFld=-57.915F;
    public short sFld=12722;
    public static short sFld1=8933;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -35);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i3, double d1) {

        int i4=3, i5=9, i6=5017, i7=192, iArr[]=new int[N];
        float f=0.842F;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(iArr, 51112);

        bArr = FuzzerUtils.boolean1array(N, (boolean)false);
        i4 = 282;
        while (--i4 > 0) {
            i3 += (i4 * i3);
            for (i5 = 1; i5 < 6; i5++) {
                Test.instanceCount += Test.instanceCount;
                i6 = (int)Test.instanceCount;
            }
            iArr[i4 + 1] *= i5;
            for (f = 1; f < 6; f++) {
                Test.instanceCount = i5;
                i6 += (int)Test.instanceCount;
                if (Test.bFld) break;
                i7 >>= (int)256778273564238499L;
                Test.fFld += i4;
                i7 += i4;
                i3 ^= (int)Test.instanceCount;
            }
        }
        vMeth1_check_sum += i3 + Double.doubleToLongBits(d1) + i4 + i5 + i6 + Float.floatToIntBits(f) + i7 +
            FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i2, double d) {

        int i8=0, i9=-94;

        vMeth1(i2, d);
        for (i8 = 10; i8 < 166; i8++) {
            i9 += (-36691 + (i8 * i8));
            i2 += -1;
        }
        i2 *= i9;
        i2 ^= i8;
        vMeth_check_sum += i2 + Double.doubleToLongBits(d) + i8 + i9;
    }

    public int iMeth(int i, int i1) {

        double d2=102.127386;
        int i10=-5, i11=-40882, i12=142, i13=10;
        long l=-8L;
        byte by=-111;
        float f1=-1.195F;

        vMeth(-4, d2);
        for (i10 = 9; 361 > i10; ++i10) {
            l = 1;
            while (++l < 5) {
                Test.iArrFld[(int)(l - 1)] += (int)Test.instanceCount;
                Test.iArrFld[i10 + 1] = i10;
                i11 = by;
                i = -113;
                i1 -= sFld;
            }
            i12 = 1;
            do {
                Test.iArrFld[i10] -= i1;
                for (f1 = 1; f1 < 1; ++f1) {
                    Test.bFld = Test.bFld;
                    i13 /= (int)(Test.instanceCount | 1);
                    Test.sFld1 += (short)f1;
                }
                Test.instanceCount >>= i;
            } while (++i12 < 5);
        }
        long meth_res = i + i1 + Double.doubleToLongBits(d2) + i10 + i11 + l + by + i12 + Float.floatToIntBits(f1) +
            i13;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i14=-12;

        iMeth(i14, i14);


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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
