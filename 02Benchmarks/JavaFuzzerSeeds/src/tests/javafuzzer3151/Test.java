package tests.javafuzzer3151;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 02:53:58 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=40931L;
    public static int iFld=-217;
    public short sFld=10253;
    public static int iArrFld[]=new int[N];
    public static volatile boolean bArrFld[][]=new boolean[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 31662);
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth() {

        double d1=22.497, d2=-2.62875, dArr[][]=new double[N][N];
        int i2=0, i3=-70, i4=-9416, i5=1;
        long l1=-206L;
        boolean b=true;

        FuzzerUtils.init(dArr, -2.57376);

        d1 = Test.instanceCount;
        dArr[(Test.iFld >>> 1) % N][(i2 >>> 1) % N] = Test.iFld;
        for (l1 = 297; l1 > 2; --l1) {
            Test.instanceCount += l1;
            for (i4 = 1; i4 < 6; i4++) {
                d2 = 1;
                while (++d2 < 2) {
                    Test.iArrFld[i4 + 1] += 26670;
                    i3 *= 0;
                    i3 = 30;
                    d1 -= i5;
                    Test.instanceCount += (long)(((d2 * i2) + i5) - Test.instanceCount);
                    Test.instanceCount *= i4;
                    if (b) {
                        i2 &= i3;
                        i3 *= -136;
                    } else {
                        i2 >>= i4;
                    }
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d1) + i2 + l1 + i3 + i4 + i5 + Double.doubleToLongBits(d2) + (b ? 1 :
            0) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth1(long l) {

        double d=0.90263;
        float f2=-2.255F;
        int i1=-46, i6=-9, i7=-28254, i8=-4, i9=14;
        short s=-10518;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -4L);

        Test.iFld += (int)(l--);
        d = 1;
        while (++d < 131) {
            Test.iFld += (int)(((d * Test.iFld) + Test.iFld) - Test.iFld);
            f2 = (-((Test.instanceCount + Test.iFld) + (i1 - 4L)));
        }
        l -= (long)-2.56752;
        Test.iArrFld[(Test.iFld >>> 1) % N] += (int)fMeth();
        i1 = i1;
        f2 = -7;
        lArr[(Test.iFld >>> 1) % N] >>= Test.iFld;
        i1 = i1;
        for (i6 = 2; i6 < 201; i6++) {
            for (i8 = i6; i8 < 8; i8++) {
                i9 += (i8 * l);
                s = (short)i6;
                f2 = Test.instanceCount;
            }
        }
        vMeth1_check_sum += l + Double.doubleToLongBits(d) + Float.floatToIntBits(f2) + i1 + i6 + i7 + i8 + i9 + s +
            FuzzerUtils.checkSum(lArr);
    }

    public void vMeth(int i, float f, float f1) {

        long l2=-3024124113022839513L;
        double d3=59.59618;
        int i10=3, i11=180, i12=-59476;
        boolean b1=false;
        short s1=-18454;

        vMeth1(l2);
        for (d3 = 2; d3 < 169; d3++) {
            l2 = -34926;
            Test.bArrFld[(int)(d3)][(int)(d3 + 1)] = b1;
            for (i11 = (int)(d3); i11 < 9; ++i11) {
                byte by=-63;
                i10 *= i;
                Test.iFld = Test.iFld;
                i12 += (int)d3;
                s1 = (short)i12;
                Test.iFld = (int)d3;
                Test.instanceCount = (long)1.826F;
                by *= (byte)l2;
            }
        }
        f -= l2;
        i12 += (int)Test.instanceCount;
        s1 = (short)i10;
        vMeth_check_sum += i + Float.floatToIntBits(f) + Float.floatToIntBits(f1) + l2 + Double.doubleToLongBits(d3) +
            i10 + (b1 ? 1 : 0) + i11 + i12 + s1;
    }

    public void mainTest(String[] strArr1) {

        float f3=2.821F;
        int i13=-2, i14=35337, i15=17312, i16=-46626, i17=8, i18=27225, i19=23, i20=165, i21=-137;
        boolean b2=false;
        byte by1=-97;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -24161L);

        vMeth(Test.iFld, f3, f3);
        for (i13 = 9; i13 < 358; ++i13) {
            sFld += (short)1.1003F;
            for (i15 = 3; i15 < 72; i15++) {
                lArr1[i15 - 1] = 6;
                Test.iArrFld[i15 + 1] -= -32090;
                f3 += f3;
                f3 *= Test.instanceCount;
                i17 = 1;
                while ((i17 += 3) < 2) {
                    f3 = 2.1007F;
                    i14 += (((i17 * Test.iFld) + i14) - sFld);
                    Test.iFld += (int)Test.instanceCount;
                    i16 = Test.iFld;
                    try {
                        i14 = (i16 / i13);
                        Test.iFld = (i14 % -36892);
                        i14 = (i15 / i16);
                    } catch (ArithmeticException a_e) {}
                    f3 += i14;
                }
                for (i18 = 1; i18 < 2; ++i18) {
                    if (b2) continue;
                    lArr1[i18 + 1] *= i13;
                    try {
                        Test.iFld = (i15 % Test.iArrFld[i15]);
                        i16 = (-35901 % Test.iArrFld[i13 + 1]);
                        i16 = (108 % i19);
                    } catch (ArithmeticException a_e) {}
                }
                Test.iArrFld[i13] &= i13;
                for (i20 = 1; i20 < 2; i20++) {
                    by1 -= (byte)Test.instanceCount;
                    i16 += i20;
                    i14 += i20;
                    Test.iArrFld[i15 - 1] = -60;
                    i16 += (i20 | by1);
                    i14 <<= i20;
                    Test.iFld -= i17;
                    f3 += i13;
                    Test.instanceCount += (i20 * i20);
                }
            }
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  fMeth ->  fMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
