package tests.javafuzzer385;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 03:09:28 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-183L;
    public int iFld=-11;
    public double dFld=-85.108365;
    public int iFld1=0;
    public static boolean bFld=true;
    public static volatile int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, -13);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(double d1, int i8) {

        int i9=-220, i10=-56937;
        long l1=-4L, l2=-558224421L;
        short s1=-29935;

        i9 = 232;
        do {
            i8 = 10;
        } while (--i9 > 0);
        Test.instanceCount += i8;
        for (l1 = 15; l1 < 309; l1++) {
            i10 += (int)(l1 | i8);
            s1 = (short)i10;
            Test.iArrFld[(int)(l1)][(int)(l1 - 1)] = (int)-109.126490;
            d1 = l2;
        }
        long meth_res = Double.doubleToLongBits(d1) + i8 + i9 + l1 + i10 + s1 + l2;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(int i4, int i5) {

        int i6=-28870, i7=2, i11=59035, i12=24841, i13=4;
        boolean b=true;
        short s2=7962;
        float f=-1.990F;
        long lArr2[][]=new long[N][N];

        FuzzerUtils.init(lArr2, 140L);

        for (i6 = 1; i6 < 302; i6++) {
            i4 -= iMeth(0.66906, i7);
            i7 += (i6 * i6);
            i11 = 1;
            do {
                Test.instanceCount += i11;
                if (b) continue;
                Test.iArrFld[i11][i6] -= i11;
                Test.iArrFld[i11 - 1][i11 - 1] = i6;
                for (i12 = 1; 1 > i12; ++i12) {
                    i13 += (-37369 + (i12 * i12));
                    s2 = (short)Test.instanceCount;
                }
                lArr2[i11][i6 - 1] += Test.instanceCount;
                s2 += (short)i7;
            } while (++i11 < 5);
            if (false) continue;
            f += i11;
        }
        long meth_res = i4 + i5 + i6 + i7 + i11 + (b ? 1 : 0) + i12 + i13 + s2 + Float.floatToIntBits(f) +
            FuzzerUtils.checkSum(lArr2);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(short s, long l, int i) {

        int i1=83, i2=8, i3=3, i14=8, i15=-230, iArr[]=new int[N];
        double d=-80.103144;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr, 125);
        FuzzerUtils.init(lArr1, -55835L);

        i += iArr[(i >>> 1) % N];
        for (i1 = 13; 265 > i1; i1 += 3) {
            if (i1 != 0) {
                vMeth_check_sum += s + l + i + i1 + i2 + Double.doubleToLongBits(d) + i3 + i14 + i15 +
                    FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr1);
                return;
            }
            iArr[i1 - 1] = (--i);
            d *= lArr1[i1 + 1];
            i3 = 1;
            do {
                i2 += (int)(lMeth(i, i2) * Test.instanceCount);
                for (i14 = i1; i14 < 1; i14 += 2) {
                    i15 = -89;
                    i15 += (-1 + (i14 * i14));
                    Test.iArrFld[i14 + 1][i1 - 1] = (int)l;
                    i2 <<= i15;
                    try {
                        i = (-60104 / i2);
                        i = (i / i1);
                        i15 = (i15 % iArr[(i2 >>> 1) % N]);
                    } catch (ArithmeticException a_e) {}
                    i15 = i15;
                }
                l += i2;
            } while (++i3 < 18);
        }
        vMeth_check_sum += s + l + i + i1 + i2 + Double.doubleToLongBits(d) + i3 + i14 + i15 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr1);
    }

    public void mainTest(String[] strArr1) {

        short s3=11113;
        int i16=-12, i17=-10, i18=7, i19=-130, i20=755, i21=199, i22=-54687, i23=-14, i24=-2, i25=216;
        float f1=-1.753F, fArr[]=new float[N];
        long lArr[]=new long[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(lArr, 236L);
        FuzzerUtils.init(dArr, -65.39366);
        FuzzerUtils.init(fArr, 2.40F);

        iFld -= (int)lArr[(iFld >>> 1) % N];
        vMeth(s3, -186L, iFld);
        for (i16 = 6; i16 < 217; i16++) {
            switch ((((6 >>> 1) % 2) * 5) + 55) {
            case 64:
                Test.iArrFld[i16] = FuzzerUtils.int1array(N, (int)-6);
            case 56:
                if (true) {
                    iFld += (i16 ^ (long)f1);
                }
                iFld = (int)-5587946046168993187L;
            }
            dArr[i16 - 1] = dFld;
            for (i18 = 6; i18 < 119; ++i18) {
                lArr = lArr;
            }
            dArr[i16 + 1] = i19;
            Test.instanceCount = i18;
            i19 <<= i16;
            iFld ^= i17;
            Test.iArrFld[i16 - 1] = Test.iArrFld[i16];
        }
        Test.instanceCount = Test.instanceCount;
        fArr[(i16 >>> 1) % N] -= 212;
        if (Test.bFld) {
            for (i20 = 8; i20 < 171; i20++) {
                for (i22 = 154; 4 < i22; i22 -= 2) {
                    switch ((((i16 >>> 1) % 3) * 5) + 7) {
                    case 9:
                        for (i24 = 1; i24 < 3; ++i24) {
                            iFld <<= i22;
                            i25 += (((i24 * i20) + Test.instanceCount) - f1);
                            i23 *= (int)Test.instanceCount;
                            Test.iArrFld[i24][i24] <<= -5;
                            i25 = -8387;
                            try {
                                i17 = (i18 / -256);
                                iFld = (Test.iArrFld[i20 + 1][i22 + 1] % -50216);
                                i21 = (i24 / i16);
                            } catch (ArithmeticException a_e) {}
                            i19 += (i24 * i24);
                        }
                        break;
                    case 19:
                        f1 = i25;
                        break;
                    case 21:
                        i21 = i23;
                        break;
                    default:
                        fArr[i22] += iFld1;
                    }
                }
            }
        } else {
            dFld *= i24;
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
