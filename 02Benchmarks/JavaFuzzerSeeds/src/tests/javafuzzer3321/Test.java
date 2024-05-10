package tests.javafuzzer3321;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 06:00:43 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-29228L;
    public static int iFld=-208;
    public static boolean bFld=false;
    public static float fFld=-31.285F;
    public static short sFld=-32713;
    public volatile int iArrFld[]=new int[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i2, int i3) {

        double d1=77.70882;
        int i4=196, i5=233, i6=-36747, i7=10;
        boolean b=false, bArr[][]=new boolean[N][N];
        float f2=2.957F, fArr[][]=new float[N][N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(fArr, 0.482F);

        for (d1 = 3; d1 < 230; ++d1) {
            i2 = (int)2.698F;
            i4 = (int)d1;
            bArr[(int)(d1)][(int)(d1 - 1)] = b;
            i4 *= (int)Test.instanceCount;
        }
        f2 += i4;
        i3 = i4;
        for (i5 = 3; i5 < 312; i5++) {
            if (i5 != 0) {
                vMeth2_check_sum += i2 + i3 + Double.doubleToLongBits(d1) + i4 + (b ? 1 : 0) + Float.floatToIntBits(f2)
                    + i5 + i6 + i7 + FuzzerUtils.checkSum(bArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                return;
            }
        }
        i3 = i2;
        i7 = 1;
        while (++i7 < 276) {
            Test.instanceCount += (i7 * i7);
        }
        i3 = -18323;
        fArr[(i5 >>> 1) % N][(i2 >>> 1) % N] = 5053;
        i6 >>= i4;
        vMeth2_check_sum += i2 + i3 + Double.doubleToLongBits(d1) + i4 + (b ? 1 : 0) + Float.floatToIntBits(f2) + i5 +
            i6 + i7 + FuzzerUtils.checkSum(bArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth1(double d, float f1) {

        int i8=-1, i9=153, i10=4, i11=-5, iArr[]=new int[N];
        short s=-19853;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-51);
        FuzzerUtils.init(iArr, -3);

        vMeth2(Test.iFld, Test.iFld);
        for (i8 = 223; 5 < i8; i8--) {
            if (Test.iFld != 0) {
                vMeth1_check_sum += Double.doubleToLongBits(d) + Float.floatToIntBits(f1) + i8 + i9 + s + i10 + i11 +
                    FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr);
                return;
            }
        }
        s <<= (short)i8;
        i9 += i9;
        Test.iFld = (int)-122.1018F;
        for (i10 = 1; i10 < 277; ++i10) {
            if (false) {
                i9 += (int)d;
                f1 -= i10;
                Test.instanceCount += i10;
            } else if (Test.bFld) {
                Test.iFld += i8;
            } else if (Test.bFld) {
                i11 *= (int)Test.instanceCount;
            }
            iArr = FuzzerUtils.int1array(N, (int)13);
            Test.bFld = false;
        }
        vMeth1_check_sum += Double.doubleToLongBits(d) + Float.floatToIntBits(f1) + i8 + i9 + s + i10 + i11 +
            FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i) {

        float f=-2.142F;
        int i1=-5, i13=-212, i14=47955, i15=7, i16=10, iArr1[]=new int[N];
        double d2=0.60587;

        FuzzerUtils.init(iArr1, -95);

        for (f = 21; f < 377; f += 3) {
            float f3=-98.690F;
            vMeth1(d2, 13.166F);
            f3 += -117;
            for (i13 = 1; 13 > i13; ++i13) {
                f3 = 0.689F;
                Test.iFld += i13;
                iArr1[(int)(f - 1)] = -11;
                for (i15 = 1; i15 < 2; ++i15) {
                    Test.instanceCount = i;
                    switch ((i15 % 2) + 88) {
                    case 88:
                        i14 -= (int)Test.instanceCount;
                        Test.iFld &= i14;
                        iArr1[(int)(f - 1)] ^= (int)Test.instanceCount;
                        i16 <<= (int)Test.instanceCount;
                        break;
                    case 89:
                        iArr1[i13] += i15;
                    }
                }
            }
        }
        vMeth_check_sum += i + Float.floatToIntBits(f) + i1 + Double.doubleToLongBits(d2) + i13 + i14 + i15 + i16 +
            FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i17=-9, i18=2871, i19=11407, i20=-10, i21=19, i22=10, i23=-87, i24=-7604;
        long l=16L, lArr[]=new long[N];
        byte by1=-69;
        float fArr1[]=new float[N];

        FuzzerUtils.init(lArr, 13L);
        FuzzerUtils.init(fArr1, 72.226F);

        if (Test.bFld) {
            vMeth(10390);
            for (i17 = 16; i17 < 287; ++i17) {
                lArr[i17 + 1] = l;
                lArr[i17 - 1] = i18;
                l |= by1;
                i19 = 1;
                while (++i19 < 93) {
                    Test.iFld += (int)Test.instanceCount;
                    Test.fFld = i19;
                    Test.instanceCount = Test.iFld;
                    i18 += i17;
                    i18 /= (int)(Test.instanceCount | 1);
                    i18 += i18;
                    if (Test.bFld) continue;
                    Test.iFld += (i19 * i19);
                    Test.fFld += Test.instanceCount;
                }
                for (i20 = 4; i20 < 93; ++i20) {
                    by1 = (byte)i19;
                    Test.iFld >>= by1;
                    for (i22 = 2; i22 > 1; --i22) {
                        i23 >>= i23;
                        fArr1[i17 + 1] *= i19;
                    }
                }
                l += (1711155476L + (i17 * i17));
                iArrFld[i17] = (int)11L;
                l = 13046;
                i21 *= (int)Test.fFld;
                iArrFld[i17 - 1] -= i19;
            }
            i24 = 1;
            do {
                iArrFld[i24] |= Test.sFld;
                lArr = lArr;
            } while (++i24 < 345);
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