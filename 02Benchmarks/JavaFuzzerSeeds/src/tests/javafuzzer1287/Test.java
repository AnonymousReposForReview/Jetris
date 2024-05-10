package tests.javafuzzer1287;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 17:40:39 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=16513L;
    public static byte byFld=114;
    public static int iFld=-64385;
    public byte byArrFld[]=new byte[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -3448102288874640447L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i1, int i2, byte by) {

        int i3=-4894, i4=-55381, i6=-45471, iArr[]=new int[N];
        float f1=-1.33F, fArr[]=new float[N];
        double d2=-113.52751;
        boolean b=false;

        FuzzerUtils.init(iArr, -7308);
        FuzzerUtils.init(fArr, 25.895F);

        for (i3 = 8; 167 > i3; ++i3) {
            i2 += i3;
            Test.instanceCount += (i3 | i2);
            i2 >>= 7;
            i4 += i4;
            Test.instanceCount = -9;
            i1 %= (int)(i4 | 1);
            i2 <<= 165;
        }
        if (b) {
            for (int i5 : iArr) {
                i6 = 4;
                while (--i6 > 0) {
                    f1 = -6;
                    i1 *= (int)f1;
                    fArr[i6 - 1] += i2;
                    d2 -= i1;
                }
            }
        } else {
            iArr[(i6 >>> 1) % N] -= i4;
        }
        vMeth2_check_sum += i1 + i2 + by + i3 + i4 + i6 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d2) + (b ?
            1 : 0) + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth1(float f, double d1) {

        int i7=44564, i8=170, i9=16839, i10=130, i11=0, i12=7;
        byte by1=-100;
        boolean b1=false;

        vMeth2(18915, i7, (byte)(25));
        if (b1) {
            i7 <<= i7;
            by1 = (byte)i7;
        }
        i7 >>>= i7;
        for (i8 = 8; i8 < 148; i8++) {
            Test.instanceCount += (i8 * i8);
            Test.instanceCount += (((i8 * i7) + i9) - Test.instanceCount);
            Test.instanceCount = i9;
            i10 = 1;
            do {
                i7 >>= i8;
                for (i11 = i8; i11 < 1; ++i11) {
                    i9 >>= i12;
                    f *= i8;
                }
                d1 = i11;
            } while (++i10 < 11);
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + Double.doubleToLongBits(d1) + i7 + by1 + (b1 ? 1 : 0) + i8 + i9 +
            i10 + i11 + i12;
    }

    public static void vMeth(long l, double d, int i) {

        float f2=-92.666F;
        int i13=-14, i14=-6, i15=17, i16=-9, i17=184, i18=-77;
        short s=19194;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 10L);

        vMeth1(f2, d);
        f2 += -38169;
        for (i13 = 4; i13 < 239; ++i13) {
            Test.instanceCount += 59700;
        }
        Test.byFld -= (byte)24976;
        lArr = lArr;
        for (i15 = 1; i15 < 384; i15++) {
            i += (((i15 * i16) + Test.instanceCount) - s);
            i = (int)l;
            i *= (int)f2;
            i14 += i15;
            switch ((i15 % 1) + 69) {
            case 69:
                for (i17 = i15; i17 < 4; i17++) {
                    i18 += (((i17 * Test.instanceCount) + s) - l);
                    i14 *= s;
                }
                break;
            }
        }
        vMeth_check_sum += l + Double.doubleToLongBits(d) + i + Float.floatToIntBits(f2) + i13 + i14 + i15 + i16 + s +
            i17 + i18 + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        double d3=16.102258;
        int i19=-208, i20=-24, i21=9, i22=-45238, i23=40234, i24=-156, i25=125, i26=169, iArr1[]=new int[N];
        float f3=1.27F, f4=-2.93F, fArr1[]=new float[N];
        short s1=-14436;

        FuzzerUtils.init(iArr1, 2);
        FuzzerUtils.init(fArr1, -30.250F);

        vMeth(Test.instanceCount, d3, -56521);
        Test.iFld |= Test.iFld;
        i19 = 1;
        while ((i19 += 2) < 274) {
            switch ((i19 % 1) + 78) {
            case 78:
                switch ((((Test.iFld >>> 1) % 2) * 5) + 120) {
                case 123:
                    for (f3 = 183; f3 > i19; f3 -= 2) {
                        for (i21 = 1; i21 < 1; i21++) {
                            Test.instanceCount += i20;
                            s1 %= (short)(Test.instanceCount | 1);
                            Test.iFld <<= i21;
                            iArr1[i19] = (int)Test.instanceCount;
                            Test.instanceCount -= Test.iFld;
                            byArrFld[i19 - 1] >>= (byte)i22;
                            Test.lArrFld[i19 - 1] = Test.byFld;
                            fArr1[i21 - 1] -= Test.instanceCount;
                            iArr1[(int)(f3)] &= i21;
                        }
                    }
                    for (i23 = 4; i23 < 183; i23++) {
                        f4 += i23;
                        Test.byFld += (byte)(i23 * i23);
                        Test.lArrFld[i23 + 1] += Test.instanceCount;
                        for (i25 = i19; i25 < 2; i25++) {
                            iArr1[i19] -= i26;
                            i20 = (int)Test.instanceCount;
                            f4 += i22;
                            i22 += (0 + (i25 * i25));
                            iArr1[i25] = i19;
                            Test.instanceCount *= i20;
                            i22 >>= i24;
                            try {
                                Test.iFld = (-1679992493 % iArr1[i25 - 1]);
                                iArr1[i19] = (Test.iFld % iArr1[i23 + 1]);
                                i20 = (i19 / -701);
                            } catch (ArithmeticException a_e) {}
                            f4 += (i25 + i22);
                        }
                    }
                    break;
                case 127:
                    Test.iFld = i19;
                }
                break;
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