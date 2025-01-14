package tests.javafuzzer2691;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 18:46:57 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-5L;
    public static float fFld=0.412F;
    public static volatile short sFld=-14083;
    public static long lArrFld[]=new long[N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -519466808L);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static void vSmallMeth(short s, long l) {

        int i1=7;

        l += (long)((Test.instanceCount--) - ((Test.fFld - i1) + i1));
        vSmallMeth_check_sum += s + l + i1;
    }

    public int iMeth(int i7, int i8) {

        int i9=84, i10=23255, iArr1[]=new int[N];
        byte by1=-86;
        double d=-2.78337;

        FuzzerUtils.init(iArr1, -87);

        iArr1 = (iArr1 = FuzzerUtils.int1array(N, (int)13655));
        for (i9 = 9; i9 < 279; i9++) {
            i10 += (i9 + i7);
        }
        i7 <<= Math.max((int)((by1 + d) - (33339 * (i9 ^ i8))), i8);
        vSmallMeth(Test.sFld, Test.instanceCount);
        Test.instanceCount -= i10;
        Test.instanceCount -= 9;
        i8 -= (int)3765288321011264992L;
        d /= (i8 | 1);
        Test.fFld -= i7;
        i8 += i7;
        i8 = (int)37.104213;
        i10 = (int)Test.instanceCount;
        Test.instanceCount -= i9;
        i8 >>= -30600;
        long meth_res = i7 + i8 + i9 + i10 + by1 + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth(int i5, int i6) {

        double d1=-1.12347;
        int iArr[]=new int[N];

        FuzzerUtils.init(iArr, -7);

        i6 >>>= (int)Test.instanceCount;
        iArr[(i5 >>> 1) % N] >>= (int)(((long)(Test.fFld + i6) ^ Math.min(i6, i5)) * (i5 - (i6 + i6)));
        Test.instanceCount = Math.min((i5 + i6) - Math.abs(-30429), iMeth(i5, i6));
        Test.fFld = i5;
        for (long l1 : Test.lArrFld) {
            Test.lArrFld[(i6 >>> 1) % N] += (long)d1;
        }
        iArr[(i6 >>> 1) % N] += i5;
        vMeth_check_sum += i5 + i6 + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i=8, i2=-46816, i3=-41094, i4=36396, i11=9, i12=43492, i13=-52, i14=6, i15=196;
        short s1=-26329;
        byte by=9;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 0.312F);

        Test.fFld -= i;
        for (int smallinvoc=0; smallinvoc<171; smallinvoc++) vSmallMeth((short)((s1--) * ((by--) + (by - i))), i * s1);
        Test.lArrFld[(i >>> 1) % N] = (long)(i * (Test.instanceCount - (Test.fFld * i)));
        for (i2 = 3; i2 < 215; i2++) {
            i3 <<= (int)(9 + ((Test.fFld++) - (Test.fFld + i2)));
            i4 = 1;
            while (++i4 < 118) {
                i3 *= (int)(i4 + Test.instanceCount);
                vMeth(i, i4);
                Test.instanceCount += i3;
                try {
                    iArrFld[i2 + 1] = (i3 / i2);
                    i = (-59256 / i4);
                    iArrFld[i4 - 1] = (i3 / i);
                } catch (ArithmeticException a_e) {}
            }
            iArrFld[i2] -= (int)Test.instanceCount;
        }
        i11 = 1;
        while (++i11 < 279) {
            i3 += (((i11 * i11) + i3) - i);
            Test.lArrFld[i11] += -17;
            fArr[i11] -= i;
            i3 += (((i11 * Test.fFld) + i4) - Test.fFld);
            i3 += (i11 * i11);
            for (i12 = 2; i12 < 90; ++i12) {
                i13 = i2;
                for (i14 = 1; i14 < 2; i14++) {
                    i13 += (i14 + Test.instanceCount);
                    i = (int)Test.fFld;
                    Test.lArrFld[i14 + 1] = i11;
                    Test.lArrFld[i12 - 1] = Test.instanceCount;
                    switch (((i2 >>> 1) % 1) + 3) {
                    case 3:
                    default:
                        try {
                            i3 = (i11 % i15);
                            i = (iArrFld[i12] % -129);
                            i15 = (-58 % i15);
                        } catch (ArithmeticException a_e) {}
                        try {
                            iArrFld[i11] = (19939 / iArrFld[i14]);
                            i15 = (i15 / 61444436);
                            i13 = (i14 / -29006);
                        } catch (ArithmeticException a_e) {}
                    }
                    i13 += i4;
                }
                Test.fFld += (i12 * Test.instanceCount);
            }
            i15 += i11;
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test iMeth vMeth
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
