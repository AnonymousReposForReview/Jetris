package tests.javafuzzer2326;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 12:27:18 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-166L;
    public static float fFld=-112.32F;
    public static double dArrFld[][]=new double[N][N];

    static {
        FuzzerUtils.init(Test.dArrFld, 2.42908);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(long l, int i2) {

        int i3=202, i4=-111, i5=6, i6=2869, i7=13, iArr1[]=new int[N];
        double d=-78.118823, d1=67.77305, d2=43.47245;
        short s2=-17416;
        byte by=14;
        float f2=0.726F;
        boolean b=false, bArr[]=new boolean[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 4211582766774360310L);
        FuzzerUtils.init(iArr1, 42);
        FuzzerUtils.init(bArr, false);

        lArr[(i2 >>> 1) % N] <<= i2;
        l = i3;
        if (b) {
            for (i4 = 289; i4 > 10; i4--) {
                for (d = 1; d < 6; ++d) {
                    iArr1 = FuzzerUtils.int1array(N, (int)-11711);
                    for (d1 = i4; d1 < 2; ++d1) {
                        d2 = Test.instanceCount;
                        s2 += (short)d2;
                        i7 = 45873;
                        l += (long)(d1 * i2);
                    }
                    i7 *= by;
                }
                f2 = 6;
                do {
                    bArr[i4] = true;
                    Test.instanceCount *= i5;
                } while ((f2 -= 2) > 0);
            }
        } else if (b) {
            Test.fFld += f2;
        }
        vMeth_check_sum += l + i2 + i3 + i4 + i5 + Double.doubleToLongBits(d) + i6 + Double.doubleToLongBits(d1) + i7 +
            Double.doubleToLongBits(d2) + s2 + by + Float.floatToIntBits(f2) + (b ? 1 : 0) + FuzzerUtils.checkSum(lArr)
            + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(bArr);
    }

    public static int iMeth1(float f1) {

        int i8=4, i9=7, i10=1, i11=10333, i12=-50840, i13=98, i14=-115, iArr2[]=new int[N];
        float f3=82.637F;
        double d3=94.6196;
        boolean b1=false;
        short s3=17881;

        FuzzerUtils.init(iArr2, -44);

        vMeth(Test.instanceCount, i8);
        for (i9 = 12; 343 > i9; i9++) {
            if (b1) {
                for (i11 = i9; i11 < 5; i11++) {
                    f3 = 1;
                    do {
                        i10 >>>= i11;
                    } while (++f3 < 1);
                    for (i13 = 1; i13 > 1; i13 -= 3) {
                        Test.instanceCount -= i11;
                        Test.instanceCount += 5816;
                    }
                    i8 -= (int)d3;
                    i10 -= i8;
                    i10 = 236;
                }
                iArr2 = iArr2;
            } else {
                s3 = (short)i9;
                Test.instanceCount *= i9;
            }
        }
        long meth_res = Float.floatToIntBits(f1) + i8 + i9 + i10 + i11 + i12 + Float.floatToIntBits(f3) + i13 + i14 +
            Double.doubleToLongBits(d3) + (b1 ? 1 : 0) + s3 + FuzzerUtils.checkSum(iArr2);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(short s1, float f) {

        int i1=2783, i15=12489, i16=-183, i17=-244, i18=60, iArr3[]=new int[N];
        float f4=66.208F;
        long lArr1[]=new long[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr3, 7523);
        FuzzerUtils.init(lArr1, -7L);
        FuzzerUtils.init(dArr, 0.7451);

        i1 >>= iMeth1(-103.360F);
        for (f4 = 4; 389 > f4; f4++) {
            iArr3 = iArr3;
            for (i16 = 1; i16 < 4; i16++) {
                i15 = (int)2.45766;
                Test.instanceCount = Test.instanceCount;
                i17 += i16;
                iArr3[i16 + 1] = i15;
                iArr3[(int)(f4 + 1)] = i15;
                Test.instanceCount += (((i16 * f4) + i1) - s1);
                if (i16 != 0) {
                }
            }
            lArr1[(int)(f4 - 1)] *= Test.instanceCount;
            i18 = 1;
            do {
                dArr[(int)(f4 + 1)] = i17;
                i1 *= -6873;
            } while (++i18 < 4);
        }
        long meth_res = s1 + Float.floatToIntBits(f) + i1 + Float.floatToIntBits(f4) + i15 + i16 + i17 + i18 +
            FuzzerUtils.checkSum(iArr3) + FuzzerUtils.checkSum(lArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        short s=17228;
        int i20=13, i21=-14, i22=-217, i23=27, iArr[]=new int[N];
        byte by1=111;
        float fArr[]=new float[N];
        long lArr2[]=new long[N];

        FuzzerUtils.init(iArr, -55);
        FuzzerUtils.init(fArr, 59.372F);
        FuzzerUtils.init(lArr2, -176L);

        for (int i : iArr) {
            s %= (short)(((long)(fArr[(i >>> 1) % N] = iMeth(s, Test.fFld))) | 1);
            fArr[(i >>> 1) % N] *= i;
            Test.dArrFld[(i >>> 1) % N][(i >>> 1) % N] -= 224;
            i += -13036;
            i += 178;
            for (i20 = 2; i20 < 63; i20++) {
                i += -8;
                Test.instanceCount += (i20 * i20);
                for (i22 = 1; 2 > i22; ++i22) {
                    Test.instanceCount -= i;
                    s &= s;
                    i += (((i22 * i23) + Test.fFld) - i21);
                    switch (((i22 % 2) * 5) + 41) {
                    case 45:
                        by1 = (byte)i20;
                        i21 <<= i;
                        switch ((i22 % 3) + 68) {
                        case 68:
                            i += s;
                            Test.fFld = i21;
                            Test.instanceCount *= i23;
                            break;
                        case 69:
                            i += i22;
                            i23 <<= i;
                            break;
                        case 70:
                            i -= (int)Test.instanceCount;
                            i21 += (i22 * i22);
                        }
                        break;
                    case 48:
                        i -= (int)-6364424790302031360L;
                        if (false) continue;
                        lArr2[i22 - 1] -= Test.instanceCount;
                        break;
                    }
                    i21 += by1;
                    Test.fFld += i22;
                    i23 |= (int)Test.instanceCount;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
