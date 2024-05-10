package tests.javafuzzer3025;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 00:53:52 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-24L;
    public static int iFld=-151;
    public static volatile boolean bFld=true;
    public static float fFld=0.521F;
    public static int iFld1=201;
    public static float fArrFld[]=new float[N];
    public long lArrFld[]=new long[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 2.694F);
        FuzzerUtils.init(Test.dArrFld, 1.94985);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(boolean b) {

        float f1=-44.484F;

        f1 -= Test.iFld;
        long meth_res = (b ? 1 : 0) + Float.floatToIntBits(f1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(float f, int i3) {

        short s=-24521;
        boolean b1=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -1L);

        lArr = (lArr = (lArr = (lArr = lArr)));
        Test.iFld = (int)((s - (i3 - Test.instanceCount)) + i3);
        Test.iFld = (iMeth(b1) * 5);
        i3 -= (int)1.71622;
        long meth_res = Float.floatToIntBits(f) + i3 + s + (b1 ? 1 : 0) + FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void vMeth(int i2) {

        float f2=-2.19F;
        byte by=66;
        long l=-1554941988L, lArr1[]=new long[N];
        short s1=12590;
        int iArr[]=new int[N];

        FuzzerUtils.init(iArr, -11);
        FuzzerUtils.init(lArr1, 147L);

        if (Test.bFld) {
            try {
                lMeth(f2, Test.iFld);
                Test.iFld -= by;
                i2 -= (int)14L;
                Test.instanceCount ^= Test.instanceCount;
                if ((Test.iFld) < 65536) throw new UserDefinedExceptionTest();
            }
            catch (UserDefinedExceptionTest exc2) {
                i2 = (int)-5428706461390854010L;
            }
            finally {
                i2 -= (int)Test.instanceCount;
                for (int i4 : iArr) {
                    f2 += l;
                    i2 -= (int)f2;
                    if (Test.bFld) {
                        s1 ^= (short)i2;
                        Test.fArrFld[(Test.iFld >>> 1) % N] *= i4;
                        vMeth_check_sum += i2 + Float.floatToIntBits(f2) + by + l + s1 + FuzzerUtils.checkSum(iArr) +
                            FuzzerUtils.checkSum(lArr1);
                        return;
                    } else if (Test.bFld) {
                        lArr1[(i4 >>> 1) % N] = i2;
                    } else {
                        l -= s1;
                    }
                }
            }
            vMeth_check_sum += i2 + Float.floatToIntBits(f2) + by + l + s1 + FuzzerUtils.checkSum(iArr) +
                FuzzerUtils.checkSum(lArr1);
            return;
        }
        vMeth_check_sum += i2 + Float.floatToIntBits(f2) + by + l + s1 + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(lArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=8, i1=-59908, i5=43, i6=222, i7=1384, i8=-58127, i9=-215, i10=38, iArr1[]=new int[N];
        double d=2.115454;
        byte by1=-39;
        long l2=1025131419271312029L;
        short s2=-15658;

        FuzzerUtils.init(iArr1, -6);

        Test.iFld = (Test.iFld--);
        for (i = 2; i < 165; i++) {
            vMeth(i1);
        }
        i1 = i;
        for (i5 = 10; i5 < 242; i5++) {
            for (d = 4; 108 > d; d++) {
                i1 = i5;
                Test.instanceCount >>= i;
                if (Test.bFld) {
                    i6 += by1;
                    i1 -= i7;
                    Test.dArrFld[i5] *= 241;
                } else {
                    for (l2 = (long)(d); l2 < 2; l2++) {
                        i6 >>= i1;
                        Test.instanceCount = Test.instanceCount;
                        iArr1[(int)(d)] -= i7;
                    }
                    Test.fFld += (float)(((d * Test.fFld) + i6) - i7);
                }
                i8 += (int)d;
                i7 = (int)l2;
                Test.iFld += (int)(((d * l2) + Test.fFld) - i7);
                for (i9 = 1; i9 < 2; i9++) {
                    iArr1[i5] ^= (int)l2;
                    iArr1[i5] = Test.iFld;
                    Test.fFld += i9;
                    s2 += (short)(7 + (i9 * i9));
                    Test.instanceCount += i9;
                }
                Test.instanceCount += (long)((long)d | (long)Test.fFld);
                i1 += (int)(d - Test.instanceCount);
                try {
                    i10 = (63122 % iArr1[i5 - 1]);
                    iArr1[i5 - 1] = (-214 % i8);
                    i6 = (Test.iFld1 / 1057958205);
                } catch (ArithmeticException a_e) {}
            }
            i1 |= 6;
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
class UserDefinedExceptionTest extends RuntimeException {
    public int field;
}

//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
