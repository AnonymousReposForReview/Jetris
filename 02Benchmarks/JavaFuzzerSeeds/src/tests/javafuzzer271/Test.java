package tests.javafuzzer271;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 01:08:16 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3531023443L;
    public static int iFld=33189;
    public static float fFld=-49.489F;
    public static short sFld=-2038;
    public byte byFld=105;
    public static byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)-96);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        boolean b1=true;
        int i4=-59, i5=113;

        Test.iFld -= Test.iFld;
        Test.iFld = Test.iFld;
        Test.iFld = (int)Test.fFld;
        b1 = b1;
        for (i4 = 6; 359 > i4; ++i4) {
            i5 += i4;
        }
        Test.instanceCount = Test.iFld;
        vMeth1_check_sum += (b1 ? 1 : 0) + i4 + i5;
    }

    public static int iMeth(int i1, long l) {

        int i2=-4, i3=-146, i6=-11, i7=-170, i8=107, i9=159, i10=89;
        boolean b2=true;
        double d=-101.102496;
        long l1=6105369353755131303L;
        byte by1=29;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -2.645F);

        for (i2 = 10; 231 > i2; ++i2) {
            vMeth1();
            if (b2) continue;
            Test.sFld = (short)l;
            for (i6 = 1; i6 < 7; i6++) {
                i1 *= 39864;
                l += -41410;
                for (i8 = 2; i8 > 1; i8 -= 3) {
                    fArr[(i10 >>> 1) % N] *= Test.instanceCount;
                    if (b2) {
                        d += 5L;
                        l1 &= -15767;
                    } else if (b2) {
                        Test.iFld *= (int)Test.fFld;
                        i3 = i2;
                        Test.fFld = 2.15F;
                    } else if (b2) {
                        i9 -= i9;
                    } else {
                        l1 = by1;
                    }
                }
            }
        }
        long meth_res = i1 + l + i2 + i3 + (b2 ? 1 : 0) + i6 + i7 + i8 + i9 + i10 + Double.doubleToLongBits(d) + l1 +
            by1 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(boolean b, int i, byte by) {

        int i11=13649, i12=-8, i13=241, i14=-43951, i15=31425, iArr[]=new int[N];
        double d1=-12.30130;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -8921L);
        FuzzerUtils.init(iArr, 157);

        Test.instanceCount += (iMeth(Test.iFld, Test.instanceCount) + Test.instanceCount);
        i -= i;
        for (i11 = 9; i11 < 245; ++i11) {
            i12 = Test.iFld;
            Test.instanceCount += i11;
            i12 = i12;
            Test.byArrFld[i11] = (byte)i12;
            lArr[i11 + 1] += Test.iFld;
            iArr[i11 - 1] += Test.iFld;
            for (d1 = 1; 7 > d1; ++d1) {
                lArr[(int)(d1 + 1)] *= Test.instanceCount;
                for (i14 = 2; i14 > 1; --i14) {
                    i *= i;
                    iArr[(-42 >>> 1) % N] -= (int)Test.instanceCount;
                    i15 = (int)Test.fFld;
                }
            }
        }
        vMeth_check_sum += (b ? 1 : 0) + i + by + i11 + i12 + Double.doubleToLongBits(d1) + i13 + i14 + i15 +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        boolean b3=true;

        vMeth(b3, Test.iFld, byFld);


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
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
