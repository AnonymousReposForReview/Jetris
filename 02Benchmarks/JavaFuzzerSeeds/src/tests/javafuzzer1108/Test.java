package tests.javafuzzer1108;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 14:32:13 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-205L;
    public static short sFld=17378;
    public volatile int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.fArrFld, -1.565F);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static void vMeth() {

        short s1=-25641;
        int i7=13;

        s1 = (short)(Test.instanceCount * ((i7 += i7) + (s1--)));
        vMeth_check_sum += s1 + i7;
    }

    public static int iMeth() {

        int i9=-25292, i10=75, i11=161, i12=108, i13=60, iArr[]=new int[N];
        double d1=-53.91917, dArr[]=new double[N];
        float f=2.883F;
        byte by=22;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -13945L);
        FuzzerUtils.init(iArr, 10);
        FuzzerUtils.init(dArr, -2.126168);

        Test.instanceCount = i9;
        i10 = 1;
        while (++i10 < 123) {
            lArr = lArr;
            lArr[i10] = i9;
            iArr[i10] += i9;
            for (i11 = 1; i11 < 13; i11++) {
                iArr[i11 + 1] = i11;
                i13 = 2;
                while (--i13 > 0) {
                    iArr[i13] *= (int)-5L;
                    Test.instanceCount *= i10;
                    d1 -= Test.instanceCount;
                    f += (i13 * i13);
                    by += (byte)(i13 - i10);
                    i12 -= i13;
                }
                dArr[i10 - 1] -= Test.instanceCount;
            }
        }
        long meth_res = i9 + i10 + i11 + i12 + i13 + Double.doubleToLongBits(d1) + Float.floatToIntBits(f) + by +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(double d, int i8) {

        float f1=-1.309F;
        int i14=-61;

        i8 >>= (iMeth() * i8);
        i8 -= (int)f1;
        i8 = (int)d;
        i8 += Test.sFld;
        i8 ^= i14;
        i14 |= i14;
        i8 -= i8;
        vMeth1_check_sum += Double.doubleToLongBits(d) + i8 + Float.floatToIntBits(f1) + i14;
    }

    public static long lMeth(short s, int i6) {

        int i15=-10, i16=11, i17=894, i18=9629, iArr1[]=new int[N];
        byte by1=-10;
        double d2=-122.23442;
        boolean b=true;
        float f3=-1.1012F;

        FuzzerUtils.init(iArr1, -217);

        vMeth();
        vMeth1(1.40727, 23651);
        for (i15 = 15; 251 > i15; i15 += 3) {
            long l=-1L;
            switch (((i15 % 7) * 5) + 7) {
            case 34:
                i16 = i16;
                if (b) {
                    by1 += (byte)-14L;
                    d2 += Test.instanceCount;
                    i6 += (((i15 * i15) + s) - Test.instanceCount);
                } else {
                    for (i17 = 1; i17 < 20; i17++) {
                        float f2=91.104F;
                        i6 = (int)f2;
                        i16 = i15;
                    }
                }
                if (b) {
                    i6 <<= -24;
                    f3 += (((i15 * i6) + Test.instanceCount) - Test.sFld);
                } else if (b) {
                    Test.instanceCount |= Test.instanceCount;
                } else if (false) {
                    Test.instanceCount *= l;
                }
                break;
            case 36:
                l += i15;
                break;
            case 8:
                i6 = Test.sFld;
                break;
            case 25:
                f3 += i15;
                break;
            case 21:
                d2 *= f3;
                break;
            case 22:
                if (i15 != 0) {
                }
            case 23:
                l = i6;
                break;
            }
        }
        long meth_res = s + i6 + i15 + i16 + by1 + Double.doubleToLongBits(d2) + (b ? 1 : 0) + i17 + i18 +
            Float.floatToIntBits(f3) + FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=14239, i1=-7423, i2=24408, i3=48, i4=-6, i5=-5, i20=12, i21=0, i22=179;
        boolean b1=false;
        float f4=1.411F, f5=1.931F;
        double d3=-51.90401;
        byte by2=-59;
        long l1=-3221803805L;

        for (i = 10; i < 220; i++) {
            i1 <<= (int)(Test.instanceCount + (Math.abs(Test.instanceCount) + 62499));
            for (i2 = 2; i2 < 120; i2++) {
                for (i4 = 2; 1 < i4; i4 -= 3) {
                    i1 = (int)lMeth(Test.sFld, i4);
                    if (b1) break;
                    iArrFld[i - 1] %= (int)(Test.instanceCount | 1);
                    i5 *= (int)Test.instanceCount;
                }
                for (f4 = i2; f4 < 2; f4 += 3) {
                    f5 = i2;
                    i3 = (int)Test.instanceCount;
                    Test.fArrFld[(int)(f4 + 1)] = Test.sFld;
                    Test.instanceCount = -123;
                    i5 *= (int)d3;
                    f5 += by2;
                    Test.instanceCount <<= i5;
                }
                Test.instanceCount = Test.instanceCount;
                i20 = i4;
                i5 *= (int)Test.instanceCount;
                i5 += (((i2 * f5) + i1) - Test.instanceCount);
                i3 += (int)l1;
                for (i21 = i; 2 > i21; ++i21) {
                    i22 += i21;
                    iArrFld[i2] >>= -9;
                    i22 += i21;
                    i22 = i21;
                    f5 = i20;
                    i5 += (i21 | i4);
                }
            }
        }
        i1 = i20;
        b1 = true;



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
//DEBUG  vMeth1 ->  vMeth1 lMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth1 lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
