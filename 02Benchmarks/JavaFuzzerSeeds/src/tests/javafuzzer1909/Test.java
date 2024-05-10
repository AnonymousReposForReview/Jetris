package tests.javafuzzer1909;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 05:42:05 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-5299618429378055563L;
    public static float fFld=1.920F;
    public static byte byFld=14;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i3, int i4, double d) {

        int i5=-68, i6=-3568, i7=-100, i8=12, i9=95, i10=-11516;
        short s=31710;

        i4 = i4;
        for (i5 = 23; i5 < 382; ++i5) {
            i6 = i5;
            for (i7 = 1; 5 > i7; i7++) {
                for (i9 = 1; 2 > i9; i9++) {
                    d *= -254;
                    i8 += (((i9 * Test.instanceCount) + i6) - Test.fFld);
                    Test.fFld += (16928 + (i9 * i9));
                    i10 ^= i7;
                    d = i9;
                    i8 = s;
                }
                i6 += (((i7 * i7) + i3) - Test.fFld);
                i10 -= i6;
                try {
                    i6 = (-28579 % i5);
                    i10 = (-35358 % i10);
                    i10 = (i4 / i6);
                } catch (ArithmeticException a_e) {}
                s >>= (short)i9;
            }
        }
        long meth_res = i3 + i4 + Double.doubleToLongBits(d) + i5 + i6 + i7 + i8 + i9 + i10 + s;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i1, int i2, long l1) {

        float f=-9.648F;
        double d1=0.65385;

        i2 >>= (int)(f + iMeth(-23407, i1, d1));
        l1 = 14;
        Test.byFld = (byte)-1626;
        vMeth1_check_sum += i1 + i2 + l1 + Float.floatToIntBits(f) + Double.doubleToLongBits(d1);
    }

    public static void vMeth(int i, long l) {

        int i11=-142, i12=-2283, i13=61668;

        vMeth1(i, i, Test.instanceCount);
        i += i;
        for (i11 = 9; 331 > i11; i11 += 2) {
            Test.byFld = (byte)6;
            i = i12;
            i13 = 1;
            do {
                l += (23362 + (i13 * i13));
            } while (++i13 < 10);
            i12 *= i11;
        }
        vMeth_check_sum += i + l + i11 + i12 + i13;
    }

    public void mainTest(String[] strArr1) {

        int i14=12, i15=0, i16=-217, i17=-187, i18=87, i19=62631, i20=12, i21=-7774, i22=12, iArr[]=new int[N];
        double d2=0.67959;
        short s1=32528;

        FuzzerUtils.init(iArr, 7);

        vMeth(i14, Test.instanceCount);
        i14 += i14;
        Test.instanceCount -= (long)d2;
        Test.fFld = Test.fFld;
        i14 -= i14;
        i14 = (int)-13L;
        Test.instanceCount <<= i14;
        for (i15 = 123; i15 > 1; i15 -= 3) {
            for (i17 = 1; i17 < i15; ++i17) {
                boolean b=false;
                if (b) continue;
                i18 *= i17;
                Test.instanceCount /= ((long)(Test.fFld) | 1);
                d2 += i17;
                for (i19 = 1; i19 < 2; i19++) {
                    s1 = (short)Test.instanceCount;
                    Test.instanceCount *= (long)Test.fFld;
                    i16 <<= Test.byFld;
                    i20 &= i14;
                    iArr[i19 + 1] -= i16;
                    i18 &= i15;
                    i14 = (int)Test.instanceCount;
                }
                for (i21 = 1; 2 > i21; ++i21) {
                    int i23=12;
                    i22 *= i15;
                    s1 += (short)(i21 - i23);
                    Test.instanceCount = i21;
                    i14 += (i21 - i19);
                    i16 *= -6;
                    try {
                        i18 = (-244 / iArr[i21]);
                        i14 = (i22 % i18);
                        i22 = (i22 / iArr[i21 - 1]);
                    } catch (ArithmeticException a_e) {}
                    i18 <<= (int)Test.instanceCount;
                    Test.instanceCount |= s1;
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
