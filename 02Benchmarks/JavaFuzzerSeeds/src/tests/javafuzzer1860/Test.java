package tests.javafuzzer1860;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 04:46:19 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-52436L;
    public static boolean bFld=false;
    public short sFld=1206;
    public static int iArrFld[]=new int[N];
    public static volatile long lArrFld[]=new long[N];
    public static int iArrFld1[]=new int[N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 7);
        FuzzerUtils.init(Test.lArrFld, -239L);
        FuzzerUtils.init(Test.iArrFld1, 176);
        FuzzerUtils.init(Test.bArrFld, true);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth() {

        int i5=11, i7=37564, i8=-33, i9=-54510, i10=-50803;
        double d=0.75094;
        float f=-1.945F;
        long l=-8L;

        i5 += (int)Test.instanceCount;
        for (int i6 : Test.iArrFld) {
            Test.lArrFld[(i6 >>> 1) % N] >>= 31124;
            for (d = 1; d < 4; ++d) {
                i6 += (int)(d + Test.instanceCount);
                i7 = i7;
            }
            for (f = 1; f < 4; f++) {
                if (i5 != 0) {
                }
                for (l = 1; l < 2; l++) {
                    Test.bFld = Test.bFld;
                    Test.lArrFld[(int)(f)] = i9;
                    Test.iArrFld[(int)(f)] = i5;
                    i8 -= (int)47294L;
                    if (Test.bFld) break;
                }
                i10 = (int)Test.instanceCount;
            }
        }
        long meth_res = i5 + Double.doubleToLongBits(d) + i7 + Float.floatToIntBits(f) + i8 + l + i9 + i10;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1() {

        int i11=83, i12=-13916, i13=-85, i14=3, i15=31209, i16=5, i17=128, i18=-7, i19=-74, i20=5;
        double d1=-2.117219, dArr[]=new double[N];

        FuzzerUtils.init(dArr, -1.104845);

        lMeth();
        for (i11 = 138; i11 > 4; i11 -= 3) {
            for (i13 = i11; 35 > i13; ++i13) {
                if (Test.bFld) {
                    for (i15 = 1; i15 < 1; i15 += 2) {
                        try {
                            i14 = (i12 % i11);
                            i12 = (i15 / Test.iArrFld[i15]);
                            i14 = (i14 / 19835);
                        } catch (ArithmeticException a_e) {}
                        Test.bFld = Test.bFld;
                    }
                    for (i17 = 1; i17 < 1; ++i17) {
                        i14 = (int)3889115197L;
                    }
                    for (i19 = 1; i19 < 1; ++i19) {
                        i14 |= i17;
                        switch (((i13 % 2) * 5) + 59) {
                        case 66:
                            d1 += 197;
                            i12 += (int)Test.instanceCount;
                            dArr = dArr;
                        case 62:
                        }
                    }
                } else if (Test.bFld) {
                    Test.instanceCount ^= i20;
                    vMeth1_check_sum += i11 + i12 + i13 + i14 + i15 + i16 + i17 + i18 + i19 + i20 +
                        Double.doubleToLongBits(d1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                    return;
                } else if (true) {
                    i16 = (int)-2L;
                }
            }
        }
        vMeth1_check_sum += i11 + i12 + i13 + i14 + i15 + i16 + i17 + i18 + i19 + i20 + Double.doubleToLongBits(d1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void vMeth() {

        int i3=-240, i4=221, i21=26994;

        for (i3 = 10; 380 > i3; ++i3) {
            vMeth1();
        }
        i4 >>= i4;
        sFld = (short)i21;
        vMeth_check_sum += i3 + i4 + i21;
    }

    public void mainTest(String[] strArr1) {

        int i=15494, i1=43, i2=7735, i22=1848, i23=-245, i24=-90, i25=-62846, i26=-92, i27=-238, i28=14, i29=-3,
            i30=-30744, i31=156;
        float f1=-96.17F;
        double d2=-1.112505;

        if (Test.bFld) {
            i += (i--);
            for (i1 = 140; i1 > 2; --i1) {
                vMeth();
            }
        }
        for (i22 = 4; 384 > i22; i22++) {
            f1 -= 12;
        }
        Test.instanceCount *= -9L;
        i24 = 239;
        while (--i24 > 0) {
            i += (i24 * i24);
        }
        Test.iArrFld[(i2 >>> 1) % N] += sFld;
        sFld = (short)-4;
        i23 += (int)f1;
        for (i25 = 346; i25 > 1; i25 -= 3) {
            f1 += (float)29.28027;
            Test.instanceCount >>>= i;
            i2 = i1;
            i27 = 1;
            do {
                for (i28 = 1; i28 < 1; ++i28) {
                    f1 -= (float)d2;
                    i26 ^= i26;
                    Test.iArrFld1[i28] = i;
                    Test.instanceCount -= i1;
                    Test.instanceCount += (i28 * i28);
                    Test.bArrFld[i28] = false;
                    i += (((i28 * i22) + i25) - i28);
                }
                i29 += (int)d2;
                Test.bFld = Test.bFld;
                for (i30 = 1; 1 > i30; ++i30) {
                    i29 >>>= i30;
                    i26 *= i2;
                }
            } while (++i27 < 218);
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
