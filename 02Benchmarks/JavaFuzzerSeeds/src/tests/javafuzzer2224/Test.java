package tests.javafuzzer2224;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 10:23:14 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-49057456948925519L;
    public static int iFld=7;
    public byte byFld=16;
    public volatile int iFld1=223;
    public static volatile int iArrFld[]=new int[N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 5);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        long l=237L, l1=-490913460818549998L;
        int i2=131, i3=-31750, i4=236;
        double d=-1.87499;
        float f=50.419F;
        short s1=-10936;

        for (l = 15; l < 327; ++l) {
            Test.iFld += i2;
            Test.iArrFld[(int)(l)] = (int)l;
        }
        Test.iArrFld = Test.iArrFld;
        i3 = 1;
        while (++i3 < 149) {
            Test.instanceCount += Test.iFld;
            Test.instanceCount >>= i2;
            d /= (i2 | 1);
            for (f = 1; f < 11; ++f) {
                l1 *= 21357;
                l1 = i2;
                Test.instanceCount += (long)f;
                Test.iFld = i3;
                s1 *= (short)f;
            }
            l1 += i4;
        }
        vMeth_check_sum += l + i2 + i3 + Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i4 + l1 + s1;
    }

    public static int iMeth1(short s) {

        int i5=-1, i6=-7, i7=-108, i8=-15, i9=-39, i10=6;
        byte by=-77;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-6127);

        Test.iFld <<= (++Test.iArrFld[(Test.iFld >>> 1) % N]);
        vMeth();
        Test.iFld -= Test.iFld;
        for (i5 = 17; i5 < 392; ++i5) {
            sArr[i5] %= (short)(Test.iFld | 1);
            for (i7 = 1; i7 < 5; i7++) {
                by >>= (byte)-57520L;
                i8 += i7;
                Test.instanceCount += (i7 * by);
                by = (byte)i8;
                for (i9 = i5; i9 < 2; ++i9) {
                    if (i7 != 0) {
                    }
                    i10 -= (int)14717L;
                    i6 >>= Test.iFld;
                }
                i8 += -187;
            }
        }
        long meth_res = s + i5 + i6 + i7 + i8 + by + i9 + i10 + FuzzerUtils.checkSum(sArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth(int i, int i1) {

        int i11=-17118, i12=-59268, i13=-10, i14=-8;
        short s2=14844;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 0.91205);

        i = iMeth1((short)(-10444));
        for (double d1 : dArr) {
            i1 += (int)17.91508;
            for (i11 = 1; i11 < 4; i11++) {
                byFld = (byte)i;
                iFld1 *= i11;
                lArrFld[i11 + 1] -= i1;
                i += (int)Test.instanceCount;
                for (i13 = 1; i13 < 2; ++i13) {
                    i12 += (((i13 * Test.instanceCount) + i11) - Test.iFld);
                    Test.instanceCount >>= s2;
                }
                i1 += (int)Test.instanceCount;
                Test.iFld = i;
            }
            Test.iArrFld[(i12 >>> 1) % N] -= iFld1;
        }
        i1 += (int)Test.instanceCount;
        long meth_res = i + i1 + i11 + i12 + i13 + i14 + s2 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {


        Test.iFld = (int)(Test.instanceCount - iMeth(Test.iFld, Test.iFld));


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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}