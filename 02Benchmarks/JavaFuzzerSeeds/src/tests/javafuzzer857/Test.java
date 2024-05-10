package tests.javafuzzer857;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 10:55:29 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=5L;
    public static double dFld=-113.31076;
    public static float fFld=-109.438F;
    public boolean bFld=false;
    public static short sFld=-836;
    public static long lFld=5550560791932561178L;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 48659);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i8=129, i9=-4, i10=-22465, i11=223;
        short s=-11546;
        float f=1.16F;
        boolean b=true;

        if (b) {
            for (i8 = 11; i8 < 256; i8 += 2) {
                i9 -= (int)-74L;
                for (i10 = i8; i10 < 13; i10++) {
                    switch (((i8 % 6) * 5) + 20) {
                    case 32:
                        i9 = i9;
                        i11 ^= i8;
                    case 47:
                        i11 = s;
                        f -= -61126;
                        s = (short)13;
                        break;
                    case 36:
                        i9 = (int)-101.197F;
                        f -= -17741;
                        Test.iArrFld[i10 - 1] /= (int)(i9 | 1);
                        break;
                    case 42:
                        Test.dFld = -10;
                        i11 -= i8;
                        break;
                    case 25:
                        i11 /= (int)(i10 | 1);
                        break;
                    case 30:
                        i11 += (-1859 + (i10 * i10));
                        break;
                    }
                }
            }
        } else if (true) {
            i9 = i9;
        }
        long meth_res = i8 + i9 + i10 + i11 + s + Float.floatToIntBits(f) + (b ? 1 : 0);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1() {

        int i3=3, i4=-1, i5=39, i6=9715, i7=21;
        float f1=2.230F;
        boolean b1=false;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -44139L);

        for (i3 = 13; i3 < 345; i3++) {
            for (i5 = 5; i5 > 1; i5 -= 3) {
                i6 &= (int)((-82.114720 + (i3 / 16848)) + i3);
                i7 = 1;
                do {
                    try {
                        i4 = (-254 / i6);
                        i4 = (i3 / 144);
                        i4 = (i7 / -20894);
                    } catch (ArithmeticException a_e) {}
                } while (++i7 < 5);
                try {
                    i4 = (159 / i5);
                    i6 = (i6 % 137);
                    i6 = (203 % i7);
                } catch (ArithmeticException a_e) {}
                Test.instanceCount -= iMeth();
                lArr1[i5] = 1477619447L;
                f1 = i4;
                i6 = i5;
                if (b1) {
                    i6 = (int)f1;
                    i6 >>= i7;
                } else if (b1) {
                    i4 *= i3;
                    Test.iArrFld[i3 + 1] = 45270;
                } else {
                    i6 -= (int)64L;
                }
            }
        }
        vMeth1_check_sum += i3 + i4 + i5 + i6 + i7 + Float.floatToIntBits(f1) + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(lArr1);
    }

    public static void vMeth(int i, int i1, int i2) {

        long l=-8801890349194475868L, lArr[]=new long[N];
        byte by=-88;
        double d=2.100358;
        int i13=-6, i14=12, i15=-13;

        FuzzerUtils.init(lArr, 3571731580L);

        l = 341;
        do {
            boolean b2=false;
            int i12=1;
            by = (byte)(((-202 - lArr[(int)(l)]) + (by + d)) + (--Test.instanceCount));
            vMeth1();
            i >>= (int)l;
            if (b2) break;
            i1 += i;
            i12 += (int)(((l * i2) + i1) - i);
        } while (--l > 0);
        for (i13 = 254; 15 < i13; i13--) {
            if (i1 != 0) {
                vMeth_check_sum += i + i1 + i2 + l + by + Double.doubleToLongBits(d) + i13 + i14 + i15 +
                    FuzzerUtils.checkSum(lArr);
                return;
            }
        }
        Test.fFld *= i2;
        Test.iArrFld = Test.iArrFld;
        i15 = 311;
        do {
            Test.instanceCount <<= i;
            Test.iArrFld[i15 + 1] += -42093;
        } while (--i15 > 0);
        i1 += i;
        vMeth_check_sum += i + i1 + i2 + l + by + Double.doubleToLongBits(d) + i13 + i14 + i15 +
            FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i16=-10, i17=-172, i18=-61232, i19=30452, i20=-18319, i21=-2443, i22=-28874, i23=-46, i24=-97, i25=220,
            i26=57, i27=1;
        long l1=-8L, lArr2[]=new long[N];
        double d1=-9.98961, dArr[]=new double[N];
        byte by1=0;

        FuzzerUtils.init(dArr, -93.13146);
        FuzzerUtils.init(lArr2, 11L);

        vMeth(i16, i16, i16);
        for (l1 = 15; l1 < 283; ++l1) {
            Test.dFld = -420477725079698825L;
            if (bFld) {
                i18 = 1;
                do {
                    for (d1 = 1; d1 < 1; d1++) {
                        Test.dFld += i19;
                        Test.fFld += (float)d1;
                    }
                    if (bFld) break;
                } while (++i18 < 94);
                try {
                    i19 = (192 / i17);
                    i19 = (-169 / i18);
                    i17 = (i19 / -154);
                } catch (ArithmeticException a_e) {}
                dArr[(int)(l1 + 1)] += -5453969816538612757L;
            } else {
                i16 = 213;
            }
            for (i20 = 94; 5 < i20; i20 -= 3) {
                short s1=-15140;
                i19 += i20;
                by1 -= (byte)s1;
                try {
                    i16 = (i18 / Test.iArrFld[i20]);
                    i17 = (-1398160262 % i21);
                    i19 = (i17 % i17);
                } catch (ArithmeticException a_e) {}
                s1 *= (short)i20;
            }
            Test.fFld += i17;
        }
        i21 += i21;
        for (i22 = 5; i22 < 268; ++i22) {
            for (i24 = 1; i24 < 96; i24++) {
                Test.iArrFld[i22 + 1] = i22;
                Test.instanceCount += (long)Test.fFld;
                i21 += (i24 * i24);
                for (i26 = 2; i26 > i22; i26--) {
                    Test.sFld = (short)Test.lFld;
                    Test.sFld <<= (short)12;
                    Test.fFld += i22;
                }
                lArr2[i22] -= (long)Test.dFld;
                lArr2[(-5 >>> 1) % N] -= Test.lFld;
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
