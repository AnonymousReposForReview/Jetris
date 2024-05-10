package tests.javafuzzer2435;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 14:28:46 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2L;
    public static volatile byte byFld=40;
    public static short sArrFld[][]=new short[N][N];
    public static long lArrFld[]=new long[N];
    public static volatile int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)74);
        FuzzerUtils.init(Test.lArrFld, 30L);
        FuzzerUtils.init(Test.iArrFld, 2);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i13, int i14) {

        int i15=-63, i16=0, iArr[]=new int[N];
        float f=-1.931F;

        FuzzerUtils.init(iArr, -15979);

        Test.instanceCount += (long)14.539F;
        i14 += 221;
        i15 = 1;
        do {
            i14 += i14;
            for (f = i15; f < 12; ++f) {
                float f1=25.997F;
                f1 += (((f * Test.byFld) + i15) - i13);
                i16 += (int)(f * i16);
                switch ((((-9 >>> 1) % 2) * 5) + 90) {
                case 98:
                    Test.instanceCount *= i16;
                    break;
                case 94:
                    Test.instanceCount >>= -243838662L;
                    break;
                default:
                    i16 += (int)(((f * i14) + i14) - i14);
                }
                iArr[i15 - 1] *= i16;
                i14 -= i14;
            }
            Test.sArrFld[i15] = FuzzerUtils.short1array(N, (short)25650);
        } while (++i15 < 128);
        i14 = (int)Test.instanceCount;
        long meth_res = i13 + i14 + i15 + Float.floatToIntBits(f) + i16 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i4, int i5, int i6) {

        int i7=17, i8=-8, i9=-4, i10=-39347, i11=-111, i12=-147;
        byte by=-89;
        float f2=-53.62F;
        double d=-2.61963;

        for (i7 = 9; i7 < 243; i7++) {
            i9 = 1;
            do {
                for (i10 = 1; i10 < 4; ++i10) {
                    boolean b1=false;
                    i12 >>>= (i11 + (i5--));
                    i12 += (int)(-157L + (i10 * i10));
                    i4 += (((i10 * i4) + i4) - i12);
                    i8 += (i10 | i10);
                    if (i4 != 0) {
                        vMeth1_check_sum += i4 + i5 + i6 + i7 + i8 + i9 + i10 + i11 + i12 + by +
                            Float.floatToIntBits(f2) + Double.doubleToLongBits(d);
                        return;
                    }
                    i4 += (i10 * i10);
                    if ((Test.instanceCount * (++by)) != iMeth(i11, i6)) continue;
                    Test.byFld += (byte)(i10 * Test.instanceCount);
                    switch ((i7 % 4) + 117) {
                    case 117:
                        i6 += (i10 ^ i11);
                        f2 -= (float)d;
                        Test.instanceCount = i5;
                        break;
                    case 118:
                        f2 -= i4;
                        break;
                    case 119:
                        Test.lArrFld[i10] += (long)f2;
                        break;
                    case 120:
                        if (i10 != 0) {
                            vMeth1_check_sum += i4 + i5 + i6 + i7 + i8 + i9 + i10 + i11 + i12 + by +
                                Float.floatToIntBits(f2) + Double.doubleToLongBits(d);
                            return;
                        }
                    default:
                        if (b1) break;
                    }
                }
            } while ((i9 += 3) < 7);
        }
        vMeth1_check_sum += i4 + i5 + i6 + i7 + i8 + i9 + i10 + i11 + i12 + by + Float.floatToIntBits(f2) +
            Double.doubleToLongBits(d);
    }

    public static void vMeth(int i1, int i2, boolean b) {

        int i3=13, i17=16024, i18=-56022, i19=6, iArr1[]=new int[N], iArr2[]=new int[N];
        float f3=-73.672F, fArr[]=new float[N];

        FuzzerUtils.init(iArr1, 108);
        FuzzerUtils.init(iArr2, -11);
        FuzzerUtils.init(fArr, 0.49F);

        i3 = 1;
        while (++i3 < 283) {
            vMeth1(i3, i1, i2);
            iArr1[i3 - 1] = (int)f3;
            i1 += (-62678 + (i3 * i3));
            i2 = i2;
            if (b) break;
            Test.byFld >>= (byte)i3;
            i17 = 1;
            while (++i17 < 6) {
                for (i18 = 1; i18 < 1; i18++) {
                    Test.instanceCount += i18;
                }
                f3 += i1;
                i2 = (int)Test.instanceCount;
            }
            i19 = 5;
        }
        iArr2[(42120 >>> 1) % N] *= i1;
        fArr = fArr;
        vMeth_check_sum += i1 + i2 + (b ? 1 : 0) + i3 + Float.floatToIntBits(f3) + i17 + i18 + i19 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(iArr2) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i=-5, i20=-41511, i21=129, i22=-5, i23=70, i24=-127;
        boolean b2=true;
        float f4=0.457F, f5=2.390F, fArr1[]=new float[N];
        short s=14536;
        double d1=-1.100981;

        FuzzerUtils.init(fArr1, -1.149F);

        i = (int)(Test.instanceCount = (i - -63));
        vMeth(34, i, b2);
        for (i20 = 2; i20 < 142; ++i20) {
            i22 = 1;
            while (++i22 < 179) {
                for (f4 = 1; 1 < f4; f4 -= 2) {
                    int i25=-169;
                    s >>>= (short)Test.instanceCount;
                    i = i22;
                    switch ((((i >>> 1) % 4) * 5) + 85) {
                    case 104:
                        Test.byFld = (byte)i23;
                        i21 = (int)d1;
                    case 95:
                        f5 -= 20;
                        i21 += (int)((long)f4 | i22);
                        i23 += i24;
                    case 90:
                        fArr1[i22 - 1] -= 13;
                        i += (int)(f4 - Test.instanceCount);
                        i24 += (int)f5;
                        break;
                    case 102:
                        i25 = 3;
                        break;
                    default:
                        switch (((i >>> 1) % 1) + 111) {
                        case 111:
                            Test.lArrFld[i22 + 1] += (long)d1;
                            i23 = (int)Test.instanceCount;
                            i21 -= 13972;
                            if (false) continue;
                            break;
                        }
                        if (b2) break;
                        i25 >>= Test.byFld;
                    }
                    i23 -= i22;
                }
                i23 += (((i22 * i22) + i20) - f4);
                Test.iArrFld[i22] -= i;
            }
            f5 = i24;
            i += (int)69.75607;
            d1 -= d1;
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
