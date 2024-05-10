package tests.javafuzzer1292;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 17:46:21 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=8486923179796627177L;
    public static boolean bFld=false;
    public static double dFld=87.85500;
    public static byte byFld=90;
    public static int iFld=-14;
    public static short sFld=-21756;
    public byte byFld1=66;
    public static int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, -165);
    }

    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i3=54, i4=2108, i5=-76, i6=-20, i7=154, i8=-41, iArr1[]=new int[N];
        float f2=-57.476F;
        double dArr1[]=new double[N];

        FuzzerUtils.init(iArr1, 2);
        FuzzerUtils.init(dArr1, 106.17347);

        i3 ^= i3;
        for (i4 = 23; i4 < 379; ++i4) {
            i6 = 1;
            while (++i6 < 5) {
                try {
                    iArr1[i4] = (-88 / i3);
                    i5 = (i4 % 36);
                    i5 = (i4 % i3);
                } catch (ArithmeticException a_e) {}
                Test.instanceCount -= -19;
                i5 += i6;
                i5 |= i6;
                if (Test.bFld) continue;
            }
            i7 = 1;
            while (++i7 < 5) {
                i8 = 1;
                while ((i8 -= 2) > 0) {
                    f2 = i5;
                    try {
                        i3 = (i7 / -871332907);
                        i3 = (i8 % i6);
                        i5 = (i3 % i5);
                    } catch (ArithmeticException a_e) {}
                    iArr1[i4 - 1] += i4;
                    dArr1[i4] += f2;
                    f2 = i8;
                }
            }
        }
        vMeth1_check_sum += i3 + i4 + i5 + i6 + i7 + i8 + Float.floatToIntBits(f2) + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
    }

    public static double dMeth(double d, int i1, int i2) {

        float f1=2.322F;
        int iArr[]=new int[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr, -153);
        FuzzerUtils.init(dArr, -38.71210);

        iArr[(12 >>> 1) % N] *= ((++i1) * Math.abs(10 + Math.max(i1, i1)));
        i2 = (int)374683131L;
        dArr = (dArr = (dArr = (dArr = FuzzerUtils.double1array(N, (double)-124.7385))));
        f1 *= iArr[(i1 >>> 1) % N];
        i1 = (int)Test.instanceCount;
        i2 = (i2--);
        vMeth1();
        long meth_res = Double.doubleToLongBits(d) + i1 + i2 + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth(int i) {

        float f=-1.759F;
        int i9=-10896;
        long l=5152311109948487900L, l1=-7056023171293394950L;
        short s=-26843;

        f += (float)Math.sqrt(dMeth(Test.dFld, i, i));
        i *= (int)Test.dFld;
        i9 = 1;
        do {
            try {
                Test.iArrFld[i9 - 1][i9 + 1] = (i / i9);
                i = (180 % i);
                Test.iArrFld[i9 - 1][i9] = (i9 % 761049230);
            } catch (ArithmeticException a_e) {}
            l = 1;
            while ((l += 2) < 4) {
                Test.instanceCount -= Test.instanceCount;
                l1 = (long)1.402F;
                Test.byFld = (byte)i;
                i >>>= -115;
                i += (int)(l * i);
                i ^= 119;
                i += (int)(((l * i9) + s) - i);
                i -= (int)Test.instanceCount;
                i <<= i9;
                i = i;
            }
        } while (++i9 < 387);
        vMeth_check_sum += i + Float.floatToIntBits(f) + i9 + l + l1 + s;
    }

    public void mainTest(String[] strArr1) {

        int i10=1, i11=31078, i12=8, i13=-21444, i14=-57195, i15=-13, i16=14, i17=0, i18=-4309, i19=-59145, i20=-7,
            i21=56036;
        float f3=0.754F, fArr[]=new float[N];

        FuzzerUtils.init(fArr, -6.573F);

        vMeth(Test.iFld);
        Test.iFld -= Test.iFld;
        for (i10 = 7; i10 < 293; ++i10) {
            f3 += f3;
            for (i12 = 1; i12 < 88; i12++) {
                for (i14 = 2; i14 > 1; i14 -= 3) {
                    i13 += i14;
                    Test.iArrFld[i14 - 1] = Test.iArrFld[i14 - 1];
                    Test.sFld += (short)-26242;
                }
                Test.bFld = Test.bFld;
                i16 = 1;
                do {
                    fArr = fArr;
                } while (++i16 < 2);
                i15 += (((i12 * byFld1) + Test.sFld) - i12);
            }
            Test.instanceCount += (i10 + i10);
            for (i17 = i10; i17 < 88; i17++) {
                i15 += (i17 * Test.instanceCount);
                i11 = (int)Test.instanceCount;
                switch ((i17 % 1) + 74) {
                case 74:
                    i11 *= i12;
                    switch ((i10 % 2) + 72) {
                    case 72:
                        i13 = i18;
                        i15 *= (int)f3;
                        for (i19 = 1; i19 < 1; ++i19) {
                            i21 -= 9;
                            Test.iArrFld[i19 - 1][i19] += (int)f3;
                        }
                        i18 -= i12;
                    case 73:
                        Test.instanceCount = Test.sFld;
                        Test.iFld = i21;
                        i13 = (int)f3;
                        i21 = i10;
                        break;
                    default:
                        i20 += -70;
                    }
                    break;
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
//DEBUG  dMeth ->  dMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 dMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
