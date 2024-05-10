package tests.javafuzzer1413;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 19:55:22 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-160810210L;
    public static short sFld=31294;
    public static long lFld=-5877114294280120882L;
    public volatile double dFld=1.87369;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -1610032019210541400L);
        FuzzerUtils.init(Test.iArrFld, 32);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l, int i8, float f2) {

        float f3=1.322F;
        int i9=-14, i10=-234, i11=-182, i12=-6, iArr1[]=new int[N];
        byte by=31;

        FuzzerUtils.init(iArr1, 6454);

        for (f3 = 11; f3 < 187; ++f3) {
            iArr1[(int)(f3 + 1)] = 207;
            i10 = 9;
            while ((i10 -= 3) > 0) {
                l <<= i9;
                i9 >>= i10;
                Test.instanceCount += i8;
                i11 = by;
                i11 = i11;
                l = i10;
            }
            i12 = 1;
            do {
                if (false) continue;
                iArr1[i12] = -111;
                i9 = (int)-6948898469532451644L;
                if (false) break;
            } while ((i12 += 2) < 9);
            i11 = (int)Test.instanceCount;
        }
        vMeth1_check_sum += l + i8 + Float.floatToIntBits(f2) + Float.floatToIntBits(f3) + i9 + i10 + i11 + by + i12 +
            FuzzerUtils.checkSum(iArr1);
    }

    public static long lMeth(double d) {

        float f1=2.813F;
        int i7=52137;

        f1 -= (Test.instanceCount >>= (Test.lArrFld[(i7 >>> 1) % N]--));
        vMeth1(Test.instanceCount, i7, f1);
        i7 += i7;
        d -= f1;
        i7 >>= i7;
        long meth_res = Double.doubleToLongBits(d) + Float.floatToIntBits(f1) + i7;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i, int i1, int i2) {

        int i3=12, i4=-7, i5=-9, i6=208, iArr[]=new int[N];
        float f=-1.199F, fArr[]=new float[N];
        double d1=-104.69038;
        byte by1=-82;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -7565);
        FuzzerUtils.init(lArr, -199L);
        FuzzerUtils.init(fArr, -47.865F);

        for (i3 = 2; i3 < 129; ++i3) {
            i2 += (int)(iArr[i3] % (((long)(lArr[i3 + 1] / (((long)(-2 + (f * i2))) | 1))) | 1));
            i5 = 1;
            do {
                i = (int)(f--);
                switch ((i3 % 5) + 77) {
                case 77:
                    Test.instanceCount += (i5 | i2);
                    break;
                case 78:
                    i2 ^= iArr[i5];
                    i6 = 1;
                    do {
                        if (i2 != 0) {
                            vMeth_check_sum += i + i1 + i2 + i3 + i4 + Float.floatToIntBits(f) + i5 + i6 +
                                Double.doubleToLongBits(d1) + by1 + FuzzerUtils.checkSum(iArr) +
                                FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                            return;
                        }
                        Test.sFld = (short)i;
                        i4 += (int)Test.instanceCount;
                        Test.instanceCount = ((i5 + i1) * lMeth(d1));
                        i1 = i4;
                        i1 <<= i;
                        fArr[i5 + 1] -= i;
                    } while (--i6 > 0);
                    break;
                case 79:
                    Test.lFld *= -30292L;
                    break;
                case 80:
                    by1 += (byte)-2;
                    break;
                case 81:
                    f += (i5 * i5);
                    break;
                }
            } while (++i5 < 12);
        }
        vMeth_check_sum += i + i1 + i2 + i3 + i4 + Float.floatToIntBits(f) + i5 + i6 + Double.doubleToLongBits(d1) +
            by1 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i13=24896, i14=0, i15=12, i16=-29221, i17=13, i18=227, i19=-33, i20=-219, i21=5311;
        boolean b=true;
        float f4=-2.526F;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -1.91084);

        vMeth(i13, i13, i13);
        for (i14 = 7; i14 < 145; ++i14) {
            for (i16 = 5; i16 < 182; ++i16) {
                i18 = 1;
                while ((i18 += 2) < 2) {
                    dArr[i14 + 1] = -206;
                    i17 = i14;
                    Test.iArrFld[i14] &= i17;
                }
                i13 = (int)Test.lFld;
            }
            i13 = (int)-55719L;
            Test.iArrFld[i14] -= i14;
            if (b) {
                Test.instanceCount = 118;
                Test.lArrFld[i14] = (long)dFld;
                for (i19 = 7; i19 < 182; ++i19) {
                    Test.instanceCount <<= Test.instanceCount;
                    i21 = 2;
                    while ((i21 -= 3) > 0) {
                        i13 = i15;
                        switch (((i15 >>> 1) % 3) + 58) {
                        case 58:
                            Test.lFld = i19;
                            i17 += (i21 - i21);
                            Test.iArrFld[i19 - 1] <<= i20;
                            break;
                        case 59:
                            i17 += (i21 ^ i20);
                            break;
                        case 60:
                            i20 -= i13;
                            break;
                        default:
                            if (b) continue;
                            i20 = i15;
                        }
                        Test.lArrFld = Test.lArrFld;
                        if (true) break;
                        dFld *= dFld;
                        i20 += (i21 * i21);
                        Test.lFld = -32178L;
                    }
                }
            } else {
                f4 += (218 + (i14 * i14));
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
//DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}