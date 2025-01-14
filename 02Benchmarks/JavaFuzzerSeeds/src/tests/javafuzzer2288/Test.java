package tests.javafuzzer2288;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 11:34:19 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3455687987L;
    public static boolean bFld=true;
    public static float fFld=86.1012F;
    public static int iFld=17306;
    public int iArrFld[]=new int[N];
    public static int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld1, -66);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(float f) {

        int i3=-52482, i4=-9, i5=10, i7=-86, i8=-175;
        double d=-1.17546, dArr[]=new double[N];

        FuzzerUtils.init(dArr, -2.37791);

        i3 = 1;
        while (++i3 < 285) {
            try {
                i4 = (10725 / i3);
                i4 = (i4 / 60623);
                i5 = (171 / i4);
            } catch (ArithmeticException a_e) {}
            dArr[i3 - 1] += d;
            i7 = 1;
            do {
                i8 = 1;
                while (++i8 < 1) {
                    Test.instanceCount += i3;
                    i5 = (int)Test.instanceCount;
                    if (Test.bFld) continue;
                    f += i5;
                    try {
                        i4 = (i7 % -1605130006);
                        i4 = (16 / Test.iArrFld1[i7 - 1]);
                        i4 = (147 % i4);
                    } catch (ArithmeticException a_e) {}
                    Test.instanceCount ^= i5;
                    switch (((i7 % 1) * 5) + 42) {
                    case 45:
                        if (Test.bFld) break;
                        if (true) continue;
                        break;
                    default:
                        i5 += (13 + (i8 * i8));
                    }
                }
            } while (++i7 < 6);
        }
        vMeth2_check_sum += Float.floatToIntBits(f) + i3 + i4 + i5 + Double.doubleToLongBits(d) + i7 + i8 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth1() {

        int i9=-100, i10=-33691, i11=10, i12=9, i13=8, i14=-60107, i15=-240, i16=-58586;
        byte by=-116;

        vMeth2(Test.fFld);
        for (i9 = 8; i9 < 163; ++i9) {
            for (i11 = 1; i11 < 10; ++i11) {
                i10 = i10;
                by -= (byte)i9;
                Test.iArrFld1[i11 - 1] -= (int)-1.418F;
                i12 -= i9;
                i10 = (int)Test.instanceCount;
            }
            for (i13 = 10; 1 < i13; i13 -= 2) {
                Test.iArrFld1[i9 + 1] *= i12;
                Test.fFld += Test.fFld;
                Test.instanceCount = i14;
                for (i15 = 1; i15 < 3; ++i15) {
                    i10 += (((i15 * Test.instanceCount) + i16) - i10);
                    Test.fFld += -29;
                }
            }
        }
        vMeth1_check_sum += i9 + i10 + i11 + i12 + by + i13 + i14 + i15 + i16;
    }

    public static void vMeth(long l) {

        int i17=4;

        vMeth1();
        i17 += i17;
        vMeth_check_sum += l + i17;
    }

    public void mainTest(String[] strArr1) {

        int i=-148, i1=18, i2=-19, i18=1, i19=-62087, i20=0, i21=63267, i22=30408, i23=-169, i24=14744;
        double d1=-1.91314;

        iArrFld[(i >>> 1) % N] *= (i * (++i));
        for (i1 = 8; i1 < 235; i1++) {
            Test.instanceCount = (i--);
            vMeth(Test.instanceCount);
            i2 >>= i2;
            i18 = 1;
            do {
                if (Test.bFld) break;
                i2 = i1;
            } while (++i18 < 111);
            i19 = 1;
            while (++i19 < 111) {
                i >>= 13;
                i20 ^= i;
                i21 = 1;
                do {
                    i2 *= i;
                    switch ((i21 % 1) + 99) {
                    case 99:
                        i20 *= i;
                        Test.fFld = Test.instanceCount;
                        i2 <<= 46921;
                        break;
                    default:
                        i20 = i19;
                    }
                    d1 = 124;
                    Test.instanceCount = i22;
                    i20 = i19;
                } while (++i21 < 1);
                for (i23 = 1; 1 > i23; i23++) {
                    try {
                        i = (i22 % 80051502);
                        iArrFld[(i24 >>> 1) % N] = (iArrFld[i19 + 1] / i23);
                        Test.iFld = (Test.iArrFld1[i1] / i2);
                    } catch (ArithmeticException a_e) {}
                    Test.instanceCount -= Test.instanceCount;
                    Test.fFld *= Test.fFld;
                    i20 = i;
                    Test.instanceCount = i22;
                    i -= (int)-1.101230;
                    Test.iFld = i1;
                    Test.instanceCount *= i21;
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
