package tests.javafuzzer1231;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 16:48:16 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=234L;
    public int iFld=1;
    public static byte byFld=93;
    public static short sFld=32335;
    public static float fFld=67.699F;
    public static int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 8);
        FuzzerUtils.init(Test.fArrFld, -116.74F);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(short s1, int i4, int i5) {


        i4 = (int)Test.instanceCount;
        vMeth1_check_sum += s1 + i4 + i5;
    }

    public static void vMeth(long l, float f, long l1) {

        int i3=7305, i6=-4250, i7=-164, i8=19260, i9=-59900, i10=11, i11=-45194, i12=14157, i13=-60075;

        i3 -= Test.iArrFld[(i3 >>> 1) % N];
        vMeth1((short)(-957), i3, i3);
        for (i6 = 378; 17 < i6; --i6) {
            for (i8 = 1; 5 > i8; i8++) {
                i3 += (i8 ^ i8);
                l1 = 63838L;
                Test.byFld += (byte)-14;
            }
            Test.sFld -= (short)i6;
            l += i6;
            for (i10 = 1; i10 < 5; ++i10) {
                l1 = 65L;
                for (i12 = 1; 2 > i12; i12++) {
                    l1 += -27372;
                }
            }
            f += -7;
        }
        vMeth_check_sum += l + Float.floatToIntBits(f) + l1 + i3 + i6 + i7 + i8 + i9 + i10 + i11 + i12 + i13;
    }

    public static int iMeth(int i) {

        int i1=1, i2=-36269, i14=24506, i15=-61208;
        short s=-16787;
        float f1=-2.987F;
        boolean b=false, b1=true;

        Test.instanceCount = ((Test.instanceCount--) - (i--));
        for (i1 = 9; i1 < 225; ++i1) {
            s += (short)i1;
            vMeth(Test.instanceCount, f1, 15423L);
            Test.iArrFld[i1] = 1;
            i14 = 1;
            while (++i14 < 7) {
                if (b) break;
                i2 += (-198 + (i14 * i14));
                i15 = 1;
                while (++i15 < 1) {
                    double d=20.27849;
                    i += 14;
                    b1 = b;
                    i += i;
                    i ^= i14;
                    i -= i1;
                    d -= Test.instanceCount;
                }
            }
        }
        long meth_res = i + i1 + i2 + s + Float.floatToIntBits(f1) + i14 + (b ? 1 : 0) + i15 + (b1 ? 1 : 0);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d1=2.128947;
        int i16=-11, i17=21, i18=-84, i19=-80, i20=10747, i21=-1, i22=-5, i23=61337;
        boolean b2=false;

        iFld = (int)(((-2791169909L ^ iMeth(-135)) + -2.108298) + d1);
        Test.fFld = 0.41F;
        Test.fFld *= -13;
        for (i16 = 16; i16 < 277; i16 += 3) {
            iFld >>>= iFld;
            Test.instanceCount += i16;
            Test.fFld += (i16 * Test.instanceCount);
        }
        for (i18 = 8; i18 < 149; i18++) {
            i17 += (((i18 * i18) + i17) - iFld);
            for (i20 = 6; 178 > i20; i20++) {
                Test.fFld *= -11;
                iFld >>= iFld;
                Test.instanceCount = -14;
                Test.instanceCount += (i20 * i20);
                i17 += i20;
                for (i22 = 2; i22 > 1; i22--) {
                    Test.instanceCount += i22;
                    switch (((i18 % 2) * 5) + 58) {
                    case 67:
                        Test.instanceCount = i21;
                        i17 = (int)d1;
                        Test.iArrFld[i20] = iFld;
                    case 68:
                        try {
                            i23 = (35851 % i17);
                            i23 = (Test.iArrFld[i20] % i19);
                            iFld = (i21 % 68);
                        } catch (ArithmeticException a_e) {}
                        d1 = Test.instanceCount;
                        break;
                    }
                    if (b2) continue;
                    i17 *= -6704;
                    i19 += (i22 - Test.instanceCount);
                }
                Test.fArrFld[i18 + 1] = i17;
                Test.fFld -= Test.sFld;
                Test.iArrFld[i20] <<= i23;
                Test.iArrFld[i18 + 1] <<= i19;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}