package tests.javafuzzer1274;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 17:39:33 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=173L;
    public static volatile byte byFld=-110;
    public static volatile float fFld=1.945F;
    public long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -135);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l1, int i5) {

        int i6=19827, i7=-3810, i8=7015, i9=0, i10=-8, i11=-1;
        short s=5483;
        float f1=-5.905F;

        for (i6 = 131; i6 > 2; i6--) {
            i7 += (int)(0.449F + (i6 * i6));
            s += (short)i5;
            for (i8 = 1; 12 > i8; i8++) {
                i7 *= (int)Test.instanceCount;
                f1 -= 20942;
                try {
                    i9 = (-41 / i6);
                    Test.iArrFld[i8] = (-11019 / i5);
                    i9 = (i9 / Test.iArrFld[i6 - 1]);
                } catch (ArithmeticException a_e) {}
                for (i10 = 1; i10 < 2; i10++) {
                    i9 += -17;
                    i7 -= i10;
                    i5 |= 18354;
                    l1 = (long)-1.92413;
                    Test.iArrFld[i6] = (int)f1;
                    i7 = i9;
                    i7 = 19111;
                }
            }
        }
        vMeth1_check_sum += l1 + i5 + i6 + i7 + s + i8 + i9 + Float.floatToIntBits(f1) + i10 + i11;
    }

    public static int iMeth(int i4) {

        int i12=-37, i13=-42525, i14=3, i15=-100, iArr[]=new int[N];
        float f2=-106.798F;
        long l2=79L;
        short s1=25837;

        FuzzerUtils.init(iArr, -185);

        vMeth1(Test.instanceCount, i4);
        i12 = 1;
        while (++i12 < 124) {
            boolean b=true;
            i4 = -24296;
            i4 %= 14;
            i4 = i4;
            Test.instanceCount &= Test.instanceCount;
            i4 >>= (int)Test.instanceCount;
            iArr[i12 - 1] <<= i4;
            if (b) continue;
            f2 -= Test.instanceCount;
            for (l2 = 13; l2 > 1; l2--) {
                for (i14 = 1; i14 < 2; ++i14) {
                    i15 = -3;
                    i13 = s1;
                }
            }
            i15 += (i12 | (long)f2);
        }
        long meth_res = i4 + i12 + Float.floatToIntBits(f2) + l2 + i13 + i14 + i15 + s1 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(long l) {

        float f=0.897F;
        int i16=-40, i17=-123, i18=-5, i20=-13;
        boolean b1=true;
        double d=44.75370;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-19);

        f -= iMeth(i16);
        i16 &= i16;
        for (i17 = 5; 156 > i17; ++i17) {
            short s2=-1337;
            f += (((i17 * i18) + s2) - i18);
            f = i17;
            i16 = (int)Test.instanceCount;
            switch (((12 >>> 1) % 6) + 79) {
            case 79:
                byArr[i17] -= (byte)i16;
                break;
            case 80:
                i16 += (i17 * i17);
                Test.byFld += (byte)i17;
                i20 = 10;
                do {
                    Test.iArrFld[i20 + 1] = (int)-3703701184L;
                    i16 -= i17;
                    i18 *= 45287;
                } while (--i20 > 0);
                if (b1) break;
            case 81:
            case 82:
                Test.iArrFld[i17] *= (int)d;
            case 83:
                f *= l;
                break;
            case 84:
                s2 += (short)(((i17 * Test.byFld) + Test.instanceCount) - i20);
                break;
            }
        }
        vMeth_check_sum += l + Float.floatToIntBits(f) + i16 + i17 + i18 + i20 + (b1 ? 1 : 0) +
            Double.doubleToLongBits(d) + FuzzerUtils.checkSum(byArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-2, i1=212, i2=-3471, i3=202, i21=-11, i22=4249, i23=8, i24=-64, i25=-142, i26=52879;
        double d1=2.35679;
        boolean b2=false;

        for (i = 230; i > 10; i--) {
            for (i2 = i; i2 < 114; ++i2) {
                lArrFld = (lArrFld = (lArrFld = (lArrFld = lArrFld)));
                vMeth(Test.instanceCount);
                Test.instanceCount += (long)-51.516F;
                i3 -= -52145;
                i1 ^= Test.byFld;
                i21 = 1;
                do {
                    Test.fFld += Test.fFld;
                    i3 += i21;
                    Test.instanceCount += (-45600 + (i21 * i21));
                    Test.fFld = i2;
                } while (++i21 < 1);
            }
            i22 = 1;
            do {
                for (i23 = 1; 1 > i23; ++i23) {
                    Test.instanceCount <<= i24;
                    Test.iArrFld = Test.iArrFld;
                    i3 += (int)d1;
                    i24 *= i;
                }
            } while (++i22 < 114);
            lArrFld[(i2 >>> 1) % N] = (long)Test.fFld;
            if (b2) break;
            Test.instanceCount += i;
            i24 *= (int)-39.714F;
            i24 += (66 + (i * i));
            i1 = i3;
        }
        for (i25 = 16; i25 < 333; ++i25) {
            i24 -= i23;
        }
        Test.instanceCount = 62076;
        i1 = i21;
        Test.fFld -= Test.instanceCount;
        i3 = i21;


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