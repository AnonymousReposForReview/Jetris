package tests.javafuzzer2313;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 12:03:03 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2L;
    public static volatile double dFld=4.107878;
    public static boolean bFld=true;
    public static float fFld=1.320F;
    public static short sFld=-12608;
    public int iFld=14394;
    public static int iArrFld[]=new int[N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -27326);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        long l1=10L, lArr[][]=new long[N][N];
        int i7=10;
        float fArr[]=new float[N];

        FuzzerUtils.init(lArr, -61700L);
        FuzzerUtils.init(fArr, 55.1013F);

        for (l1 = 15; l1 < 292; l1++) {
            lArr[(int)(l1 - 1)][(int)(l1)] >>= i7;
            Test.iArrFld[(int)(l1)] = (int)Test.dFld;
            i7 = i7;
            i7 = (int)-1.452F;
            i7 += -10;
            if (Test.bFld) break;
            i7 -= i7;
            Test.fFld = i7;
            if (Test.bFld) continue;
        }
        Test.fFld -= -11979;
        switch ((((i7 >>> 1) % 2) * 5) + 29) {
        case 35:
            Test.instanceCount -= i7;
            fArr[(i7 >>> 1) % N] += Test.instanceCount;
            break;
        case 34:
            i7 ^= i7;
            break;
        }
        vMeth1_check_sum += l1 + i7 + FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static long lMeth(int i5, double d, int i6) {

        int i9=-3, i10=-11, i11=-22420, i12=56170, i13=49, i14=-151, i15=12, i16=90;
        byte by1=109;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 172L);

        vMeth1();
        for (i9 = 17; 344 > i9; i9++) {
            i6 = i10;
            Test.iArrFld[(-181 >>> 1) % N] -= Test.sFld;
            Test.bFld = false;
            if (Test.bFld) break;
            i6 >>>= 37;
            for (i11 = 1; i11 < 5; i11 += 3) {
                for (i13 = i11; i13 < 5; i13++) {
                    by1 += (byte)(i13 - i13);
                    lArr1 = lArr1;
                }
                for (i15 = 1; i15 < 5; ++i15) {
                    i5 += (i15 + i16);
                    Test.fFld -= i12;
                    i14 += (((i15 * i11) + i6) - i16);
                }
            }
        }
        long meth_res = i5 + Double.doubleToLongBits(d) + i6 + i9 + i10 + i11 + i12 + i13 + i14 + by1 + i15 + i16 +
            FuzzerUtils.checkSum(lArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void vMeth(float f, long l) {

        int i=0, i1=-13, i2=44377, i3=-232, i4=-9;
        byte by=121;
        long l2=-2578809722L;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 1.43288);

        for (i = 127; i > 1; i--) {
            f -= by;
            i2 = 12;
            do {
                for (i3 = 1; i3 < 1; ++i3) {
                    i4 -= (int)((Math.max(-14, i3) + (l * l)) + ((--dArr[i + 1]) + (i1 * i3)));
                    l += (++i1);
                    i1 = (int)lMeth(i, Test.dFld, i3);
                    Test.iArrFld[(i2 >>> 1) % N] *= (int)l;
                    switch ((i2 % 3) + 95) {
                    case 95:
                        i1 += (i3 | i1);
                        i4 += (((i3 * i3) + i2) - i4);
                        i1 = (int)l2;
                        i1 *= -7;
                        break;
                    case 96:
                        lArrFld[i + 1] = (long)2.20265;
                        break;
                    case 97:
                        Test.instanceCount *= i3;
                        break;
                    default:
                        Test.instanceCount *= Test.sFld;
                    }
                }
            } while (--i2 > 0);
        }
        vMeth_check_sum += Float.floatToIntBits(f) + l + i + i1 + by + i2 + i3 + i4 + l2 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i17=-118, i18=13, i19=-1, i20=11, i21=4, i22=78, i23=-132, i24=-259, i25=250;
        double dArr1[][]=new double[N][N];

        FuzzerUtils.init(dArr1, 0.78073);

        vMeth(Test.fFld, Test.instanceCount);
        Test.instanceCount += i17;
        for (i18 = 249; i18 > 3; --i18) {
            for (i20 = 5; i20 < 102; ++i20) {
                i21 = (int)2.573F;
                Test.fFld += (-127.198F + (i20 * i20));
            }
            i22 = 1;
            do {
                Test.fFld += (-10 + (i22 * i22));
                Test.fFld *= (float)Test.dFld;
                i23 = 1;
                while (--i23 > 0) {
                    byte by2=-41;
                    Test.iArrFld[i18 + 1] -= (int)Test.instanceCount;
                    Test.instanceCount <<= i18;
                    i21 += i23;
                    Test.iArrFld[i18 - 1] += i17;
                    i19 -= (int)Test.instanceCount;
                    Test.iArrFld = FuzzerUtils.int1array(N, (int)78);
                    Test.fFld = -31679;
                    i17 *= (int)Test.fFld;
                    switch (((i18 % 7) * 5) + 29) {
                    case 45:
                        i24 -= i23;
                        break;
                    case 46:
                        i19 += (i23 * i23);
                        break;
                    case 48:
                        Test.instanceCount = 57001;
                        Test.iArrFld[i23] -= (int)Test.instanceCount;
                        Test.dFld += iFld;
                    case 39:
                        i19 -= i25;
                        i25 += (i23 * i23);
                        Test.bFld = Test.bFld;
                        Test.instanceCount += (17 + (i23 * i23));
                    case 50:
                        Test.instanceCount <<= 5;
                        break;
                    case 37:
                        i25 = i23;
                        break;
                    case 36:
                        dArr1[i22 - 1][i18 + 1] -= by2;
                        break;
                    default:
                        i21 = i24;
                    }
                }
            } while (++i22 < 102);
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
//DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
