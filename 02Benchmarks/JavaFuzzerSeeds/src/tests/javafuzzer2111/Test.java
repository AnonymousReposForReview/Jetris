package tests.javafuzzer2111;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 09:09:14 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=58670L;
    public static double dFld=1.64375;
    public static byte byFld=37;
    public static boolean bFld=true;
    public static int iFld=-42893;
    public short sFld=14606;
    public static volatile long lArrFld[]=new long[N];
    public static double dArrFld[]=new double[N];
    public static int iArrFld[]=new int[N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 126L);
        FuzzerUtils.init(Test.dArrFld, 114.12695);
        FuzzerUtils.init(Test.iArrFld, 226);
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i10=-59740, i11=-12, i12=31850, i13=-199, i14=-8411, i15=206, i16=41393, i17=-8725;
        float f=108.385F;

        for (i10 = 16; i10 < 327; i10 += 3) {
            Test.instanceCount >>>= i11;
            Test.iArrFld[i10] -= (int)Test.instanceCount;
            for (i12 = 1; i12 < 15; ++i12) {
                for (i14 = 1; i14 < 2; ++i14) {
                    Test.iArrFld[i10 - 1] = Test.byFld;
                    i15 += (i14 * i14);
                    Test.iArrFld[(i10 >>> 1) % N] ^= i11;
                    Test.lArrFld[i10 - 1] *= i15;
                }
                for (i16 = 1; i16 < 2; i16++) {
                    boolean b=true;
                    Test.instanceCount = i14;
                    try {
                        i11 = (1074427289 % i13);
                        i13 = (i14 % -3);
                        i11 = (i13 / -57324);
                    } catch (ArithmeticException a_e) {}
                    i13 = (int)f;
                    Test.bArrFld[i12 - 1] = b;
                    Test.dArrFld[i12] -= i10;
                }
            }
        }
        long meth_res = i10 + i11 + i12 + i13 + i14 + i15 + i16 + i17 + Float.floatToIntBits(f);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(int i3, long l1, byte by) {

        int i4=-56737, i5=29534, i6=-82, i7=-21109, i8=11, i9=0;

        for (i4 = 10; 332 > i4; i4++) {
            Test.dArrFld = (Test.dArrFld = (Test.dArrFld = Test.dArrFld));
            i3 <<= (int)(l1--);
            for (i6 = 5; i6 > 1; i6 -= 2) {
                for (i8 = 1; i8 < 3; ++i8) {
                    i3 = (int)(((long)(Test.dFld + Test.instanceCount) >> iMeth()) - l1);
                    i5 += (((i8 * i7) + i3) - Test.instanceCount);
                    i9 <<= i8;
                    if (Test.bFld) {
                        i9 >>= i5;
                    }
                    Test.dFld += i4;
                    i3 += (i8 | i7);
                    Test.iArrFld[i8 - 1] = i3;
                    l1 -= i8;
                    if (true) break;
                }
            }
        }
        long meth_res = i3 + l1 + by + i4 + i5 + i6 + i7 + i8 + i9;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(long l, int i) {

        int i1=11, i2=-5083, i18=-25203;
        float f1=123.706F;

        for (i1 = 9; i1 < 365; ++i1) {
            i += (i1 ^ Test.instanceCount);
            i2 <<= (int)(i - (++Test.lArrFld[i1 + 1]));
            Test.instanceCount += lMeth(-77, l, Test.byFld);
            i18 = 1;
            while (++i18 < 5) {
                switch ((i18 % 2) + 85) {
                case 85:
                    Test.instanceCount = i1;
                    i2 += (((i18 * Test.instanceCount) + i) - i18);
                    break;
                case 86:
                    Test.instanceCount -= (long)f1;
                    Test.iArrFld[i18 + 1] = i18;
                    i2 += -157;
                    break;
                }
            }
            Test.byFld += (byte)(i1 | i2);
            i += (int)l;
            l ^= 203;
            i2 >>= i;
        }
        vMeth_check_sum += l + i + i1 + i2 + i18 + Float.floatToIntBits(f1);
    }

    public void mainTest(String[] strArr1) {

        int i19=-11, i20=248, i21=8, i22=-66, i23=7, i24=-95, i25=156;
        float f2=73.439F, f3=0.225F;
        boolean b1=true;

        vMeth(Test.instanceCount, Test.iFld);
        for (i19 = 5; i19 < 226; i19++) {
            f2 -= i19;
            for (i21 = 3; i21 < 114; i21++) {
                try {
                    Test.iFld = (i21 % Test.iFld);
                    Test.iFld = (i21 % -1014918633);
                    i22 = (i19 / 452573543);
                } catch (ArithmeticException a_e) {}
                for (i23 = 1; i23 < 2; ++i23) {
                    long l2=-16540L;
                    i22 <<= i22;
                    i22 += (i23 - i20);
                    Test.dArrFld[i19] += 15450;
                    switch ((i21 % 2) + 9) {
                    case 9:
                        Test.instanceCount += (i23 - i19);
                        l2 = l2;
                        Test.iArrFld[i23 + 1] *= Test.iFld;
                        break;
                    case 10:
                        sFld <<= (short)Test.instanceCount;
                        f2 += (i23 * i23);
                        if (b1) {
                            i24 = i22;
                            i24 *= Test.iFld;
                            i20 += (int)Test.dFld;
                            i24 >>>= (int)Test.instanceCount;
                        }
                        i24 += 49576;
                        break;
                    }
                    Test.instanceCount <<= i20;
                    Test.iArrFld[i21 - 1] += (int)f2;
                    i22 += (i23 * Test.iFld);
                }
                i24 = i19;
                i24 += (((i21 * Test.instanceCount) + i23) - sFld);
                Test.iFld = i20;
                for (f3 = i19; f3 < 2; ++f3) {
                    if (b1) continue;
                    Test.iArrFld[i21] -= (int)Test.instanceCount;
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
