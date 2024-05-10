package tests.javafuzzer2127;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 09:13:07 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-13762L;
    public static short sFld=-17630;
    public float fFld=0.165F;
    public boolean bFld=false;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l1, long l2) {

        int i4=-1, i5=-4, i6=-2, i7=211, iArr1[]=new int[N];
        double d1=-2.60558;
        float f2=122.865F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 9800L);
        FuzzerUtils.init(iArr1, -9);

        for (i4 = 18; i4 < 359; ++i4) {
            i5 = (int)l2;
            i5 -= (int)l1;
            switch (((i4 >>> 1) % 4) + 4) {
            case 4:
                lArr[i4 - 1] = (long)d1;
                for (i6 = 1; i6 < 5; i6++) {
                    Test.sFld = (short)i4;
                    Test.instanceCount *= l1;
                    i7 *= 17414;
                    i7 = (int)-8563492473194007215L;
                    i5 *= i5;
                    iArr1[i6 - 1] = i5;
                    f2 += i4;
                }
            case 5:
                i7 *= (int)2125601863808753627L;
                break;
            case 6:
                i5 += (5 + (i4 * i4));
                break;
            case 7:
                i7 += (i4 - i7);
                break;
            default:
                d1 *= d1;
            }
        }
        vMeth2_check_sum += l1 + l2 + i4 + i5 + Double.doubleToLongBits(d1) + i6 + i7 + Float.floatToIntBits(f2) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth1(float f1, int i3, double d) {

        double d2=0.83372;
        int i8=-57, i9=41761, i10=2, i11=-41658, i12=177, iArr2[]=new int[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 14L);
        FuzzerUtils.init(iArr2, -4);

        i3 ^= (int)Test.instanceCount;
        vMeth2(Test.instanceCount, Test.instanceCount);
        i3 = (int)-28848L;
        for (d2 = 1; d2 < 228; ++d2) {
            for (i9 = 1; i9 < 7; ++i9) {
                i8 <<= i3;
                lArr1[(int)(d2 - 1)] -= i3;
                i8 += (((i9 * Test.instanceCount) + i8) - i3);
                Test.sFld = (short)i3;
                for (i11 = 1; i11 < 2; ++i11) {
                    lArr1[(int)(d2 + 1)] = (long)1.244F;
                    i12 += (i11 * i11);
                    iArr2[i9 - 1] = i8;
                    i3 = i10;
                    f1 += i3;
                }
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f1) + i3 + Double.doubleToLongBits(d) + Double.doubleToLongBits(d2) +
            i8 + i9 + i10 + i11 + i12 + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr2);
    }

    public static void vMeth(float f, int i1, long l) {

        int i2=42093, i13=-3, i14=213, i15=-12052, i16=-11, i17=-14, i18=-8, iArr3[]=new int[N];
        double d3=2.73083;
        byte by1=-53;
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr3, -4);
        FuzzerUtils.init(fArr, -47.777F);

        i2 = 1;
        do {
            vMeth1(f, i2, d3);
            i1 *= i2;
        } while (++i2 < 146);
        by1 += (byte)5;
        for (i13 = 16; i13 < 289; i13++) {
            i15 = 1;
            do {
                iArr3 = iArr3;
                by1 = (byte)Test.instanceCount;
                fArr[i13] -= i14;
                try {
                    i14 = (i14 / 59467);
                    i1 = (i14 % i15);
                    i1 = (-67 / i1);
                } catch (ArithmeticException a_e) {}
                for (i16 = 1; 1 > i16; i16++) {
                    try {
                        iArr3[i15 + 1] = (2015634221 / i13);
                        i14 = (i1 / i13);
                        i18 = (234 % i14);
                    } catch (ArithmeticException a_e) {}
                    by1 += (byte)l;
                    f *= (float)70.54818;
                    i1 >>= i17;
                }
            } while (++i15 < 6);
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i1 + l + i2 + Double.doubleToLongBits(d3) + by1 + i13 + i14 + i15
            + i16 + i17 + i18 + FuzzerUtils.checkSum(iArr3) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i=46594, i19=-11, i21=-4684, i22=-13, i23=57445, i24=-21676, i25=3, i26=-14, i27=12, i28=-228, iArr[]=new
            int[N];
        byte by=51;
        double d4=0.47541;
        float f3=-33.417F;

        FuzzerUtils.init(iArr, 59531);

        i = ((iArr[(i >>> 1) % N] * (i - by)) - i);
        i += (int)(i + Test.instanceCount);
        vMeth(fFld, i, Test.instanceCount);
        switch (((i >>> 1) % 2) + 125) {
        case 125:
            by *= (byte)i;
            i19 = 1;
            while (++i19 < 248) {
                i <<= 14;
                for (d4 = 1; d4 < 101; ++d4) {
                    switch ((int)(((d4 % 2) * 5) + 10)) {
                    case 17:
                        fFld += 3060;
                        i = i21;
                        break;
                    case 18:
                        i21 = i19;
                        for (i22 = 1; i22 < 2; i22++) {
                            i21 += (i22 ^ Test.sFld);
                            Test.instanceCount = i;
                            fFld = i;
                            i23 <<= i21;
                            if (bFld) break;
                        }
                        if (true) continue;
                        break;
                    }
                }
            }
            break;
        case 126:
            iArr[(i22 >>> 1) % N] = 2;
            for (f3 = 2; f3 < 367; ++f3) {
                for (i25 = 2; i25 < 69; i25++) {
                    fFld = i;
                    fFld = i23;
                    for (i27 = 1; i27 < 2; ++i27) {
                        i28 >>>= i;
                    }
                    by = (byte)Test.instanceCount;
                    fFld += (((i25 * Test.instanceCount) + i23) - i22);
                    i23 += (i25 - by);
                    Test.instanceCount = -20084;
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