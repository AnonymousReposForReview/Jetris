package tests.javafuzzer1582;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 23:18:33 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=116L;
    public short sFld=4716;
    public static byte byFld=-44;
    public static double dFld=-2.66;
    public static int iFld=-141;
    public static short sFld1=132;
    public static float fFld=-92.61F;
    public static int iFld1=-68;
    public static boolean bFld=false;
    public static volatile int iArrFld[]=new int[N];
    public static volatile long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -29);
        FuzzerUtils.init(Test.lArrFld, 9L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i3, int i4, boolean b) {

        int i5=-5, i6=-140, i7=13, i8=245, i9=-90, i10=-9;
        float f=0.497F;

        for (i5 = 22; i5 < 380; i5++) {
            Test.lArrFld[i5] = Test.instanceCount;
            Test.iArrFld[i5 + 1] += (int)Test.instanceCount;
            Test.instanceCount = Test.iFld;
            for (i7 = 1; i7 < 5; i7++) {
                Test.sFld1 = (short)i4;
                i9 = 1;
                do {
                    i4 = Test.byFld;
                } while (++i9 < 2);
                i6 += Test.iFld;
                if (false) continue;
                i10 = 1;
                while (++i10 < 2) {
                    Test.iArrFld[i7] = (int)f;
                    Test.sFld1 = (short)i9;
                    f = i10;
                    Test.instanceCount *= (long)-2.156F;
                }
            }
        }
        long meth_res = i3 + i4 + (b ? 1 : 0) + i5 + i6 + i7 + i8 + i9 + i10 + Float.floatToIntBits(f);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void vMeth1() {

        boolean b1=false;
        int i11=-242, i12=-9, i13=-222, i14=7, i15=-42658, i16=-13;

        for (int i2 : Test.iArrFld) {
            i2 += (int)(((i2 *= sFld) + (Test.byFld--)) * (i2 + (Test.dFld + 181L)));
            i2 ^= (int)lMeth(Test.iFld, Test.iFld, b1);
            Test.iFld = Test.iFld;
            Test.iFld = (int)Test.instanceCount;
            for (i11 = 1; i11 < 4; ++i11) {
                Test.iFld = i12;
                for (i13 = 1; i13 < 2; i13++) {
                    i14 = 236;
                    i14 = (int)Test.fFld;
                }
                Test.fFld *= -4;
                for (i15 = 1; i15 < 2; ++i15) {
                    Test.dFld -= i11;
                    Test.fFld += i11;
                }
                Test.iFld1 = i2;
            }
        }
        vMeth1_check_sum += (b1 ? 1 : 0) + i11 + i12 + i13 + i14 + i15 + i16;
    }

    public void vMeth() {

        int i1=4, i17=3, i18=59970, i19=196, i20=248, i21=83;
        double d=117.39253;

        i1 = 1;
        do {
            vMeth1();
        } while (++i1 < 347);
        Test.fFld = Test.fFld;
        Test.iFld *= (int)Test.fFld;
        Test.instanceCount <<= Test.instanceCount;
        Test.iFld += Test.iFld1;
        Test.dFld = Test.fFld;
        Test.iArrFld[(i1 >>> 1) % N] -= 185;
        for (i17 = 19; 383 > i17; i17++) {
            Test.iArrFld = Test.iArrFld;
        }
        for (i19 = 19; i19 < 382; ++i19) {
            for (d = i19; d < 5; ++d) {
                Test.iFld1 >>= i17;
                Test.fFld += (float)((long)d | (long)Test.iFld1);
                Test.iArrFld[(int)(d + 1)] = i19;
            }
        }
        vMeth_check_sum += i1 + i17 + i18 + i19 + i20 + Double.doubleToLongBits(d) + i21;
    }

    public void mainTest(String[] strArr1) {

        byte by=44, by1=98;
        int i=177, i22=5, i23=134, i24=-157, i25=31350, i26=23760, i27=-4;
        double d1=66.81791;

        by = (byte)(((++i) - (i++)) * i);
        vMeth();
        Test.iFld1 = Test.iFld;
        for (d1 = 10; d1 < 189; ++d1) {
            Test.fFld += (float)(d1 * d1);
            Test.lArrFld[(int)(d1 - 1)] = Test.sFld1;
            for (i23 = 1; i23 < 140; i23++) {
                Test.iFld >>= 50064;
                switch ((int)((d1 % 3) + 73)) {
                case 73:
                    Test.iFld ^= i22;
                    Test.iArrFld[i23 - 1] >>= (int)Test.instanceCount;
                    break;
                case 74:
                case 75:
                    for (i25 = (int)(d1); i25 < 2; i25++) {
                        i22 >>= i24;
                        Test.instanceCount += Test.iFld;
                        if (Test.bFld) {
                            Test.dFld = Test.iFld1;
                            i26 += (int)-27L;
                            i24 = i24;
                            Test.iArrFld[i23 + 1] = i26;
                        } else {
                            if (Test.bFld) continue;
                            if (Test.bFld) break;
                        }
                        i26 *= by1;
                        Test.instanceCount *= i25;
                    }
                    Test.instanceCount -= i23;
                }
                i27 = 1;
                do {
                    i26 -= i27;
                    Test.iFld += (12 + (i27 * i27));
                    Test.instanceCount += (i27 | (long)Test.fFld);
                    Test.iArrFld = Test.iArrFld;
                    i22 *= 182;
                } while (++i27 < 2);
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
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}