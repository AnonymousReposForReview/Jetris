package tests.javafuzzer725;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 08:37:32 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3769L;
    public static float fFld=-2.387F;
    public static double dArrFld[][]=new double[N][N];
    public static int iArrFld[]=new int[N];
    public float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.dArrFld, -104.30733);
        FuzzerUtils.init(Test.iArrFld, 6125);
    }

    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static float fMeth(int i1) {


        Test.dArrFld[(i1 >>> 1) % N] = Test.dArrFld[(i1 >>> 1) % N];
        long meth_res = i1;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth2(int i3, boolean b, int i4) {

        float f=98.315F;

        i3 = (int)f;
        vMeth2_check_sum += i3 + (b ? 1 : 0) + i4 + Float.floatToIntBits(f);
    }

    public static void vMeth1(int i2) {

        byte by1=74;
        int i5=5;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, 31824L);

        by1 *= (byte)(151L >>> (9 - (i2++)));
        i2 = (int)(lArr[(i2 >>> 1) % N][(i2 >>> 1) % N]--);
        i2 -= (int)(-6725692452569371156L - (Test.instanceCount--));
        i2 |= (((-49652 * (i2 * -231)) - i2) - (i2 + i2));
        i2 = Test.iArrFld[(8 >>> 1) % N];
        vMeth2(i2, true, i5);
        Test.iArrFld[(-10160 >>> 1) % N] = (int)Test.instanceCount;
        vMeth1_check_sum += i2 + by1 + i5 + FuzzerUtils.checkSum(lArr);
    }

    public void vMeth(int i) {

        byte by=71;
        float f1=2.150F;
        double d=-88.101039;
        int i6=-135, i7=10, i8=-7479, iArr[]=new int[N];

        FuzzerUtils.init(iArr, 12648);

        try {
            i *= i;
            by *= (byte)fMeth(Math.max(--i, iArr[(i >>> 1) % N]));
            vMeth1(56302);
            f1 -= i;
            fArrFld[(-1 >>> 1) % N] -= (float)d;
            d = Test.instanceCount;
        }
        catch (NegativeArraySizeException exc1) {
            i6 = 1;
            while (++i6 < 248) {
                i = i;
                for (i7 = 1; i7 < 7; ++i7) {
                    Test.instanceCount >>>= Test.instanceCount;
                    try {
                        i = (-5 % i);
                        i8 = (-54 % i);
                        i = (i8 / iArr[i6 + 1]);
                    } catch (ArithmeticException a_e) {}
                    i8 += i7;
                    i8 *= (int)Test.instanceCount;
                    f1 = i8;
                }
            }
        }
        finally {
            i8 = i8;
        }
        vMeth_check_sum += i + by + Float.floatToIntBits(f1) + Double.doubleToLongBits(d) + i6 + i7 + i8 +
            FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i9=3, i10=-12, i11=13, i12=49, i13=7, i14=-14, i15=-15785, i16=4;
        byte by2=31;
        boolean b1=true;
        short s=-22906;
        long lArr1[][]=new long[N][N];

        FuzzerUtils.init(lArr1, 7240012038454039294L);

        vMeth(i9);
        i10 = 1;
        do {
            fArrFld[i10] -= Test.fFld;
            for (i11 = i10; i11 < 202; i11++) {
                i12 += (i11 - i12);
                switch ((i11 % 1) + 122) {
                case 122:
                    Test.iArrFld[i11 - 1] >>= -2;
                    for (i13 = 1; i13 < 1; ++i13) {
                        i12 += (((i13 * Test.instanceCount) + i13) - i10);
                        i12 -= (int)-1.232F;
                        i14 += by2;
                        i9 += i10;
                    }
                }
                for (i15 = 1; i15 < 1; i15++) {
                    i16 += i15;
                    i9 += i9;
                    fArrFld[i11 - 1] += i13;
                    Test.instanceCount += (((i15 * Test.fFld) + i10) - i16);
                    i9 *= (int)Test.instanceCount;
                    Test.fFld += (((i15 * Test.instanceCount) + i16) - i12);
                    b1 = true;
                    Test.instanceCount *= i15;
                }
                try {
                    Test.iArrFld[i11 + 1] = (i10 % 1133386966);
                    i16 = (i9 % i11);
                    i12 = (61710 % i9);
                } catch (ArithmeticException a_e) {}
                switch (((i11 % 5) * 5) + 85) {
                case 101:
                    Test.instanceCount = 8L;
                    b1 = false;
                    break;
                case 93:
                    i14 += i16;
                    lArr1[i10][(i16 >>> 1) % N] += 10768;
                    break;
                case 90:
                    i16 <<= i14;
                    Test.instanceCount &= Test.instanceCount;
                    Test.instanceCount |= -7;
                    break;
                case 89:
                    i9 |= i12;
                    break;
                case 97:
                    i14 = s;
                    break;
                default:
                    Test.instanceCount += i11;
                }
            }
        } while (++i10 < 124);


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
//DEBUG  fMeth ->  fMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
