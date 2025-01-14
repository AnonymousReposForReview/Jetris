package tests.javafuzzer2382;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 13:58:51 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2L;
    public static float fFld=0.134F;
    public static short sFld=-31680;
    public volatile int iFld=0;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -46491);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f1, int i13, int i14) {

        int i15=3, i16=0, i17=-88, i18=11, i19=17042, i20=-150, iArr[]=new int[N];
        byte by1=-8;

        FuzzerUtils.init(iArr, 1);

        for (i15 = 7; i15 < 162; i15++) {
            for (i17 = 1; i17 < 10; ++i17) {
                double d1=47.7391;
                i18 -= (int)9L;
                switch ((i17 % 8) + 3) {
                case 3:
                    for (i19 = 2; i19 > 1; i19 -= 3) {
                        i18 = (int)f1;
                        i13 = i16;
                        i16 <<= i19;
                        Test.instanceCount -= Test.instanceCount;
                    }
                    f1 -= i18;
                    i18 = i13;
                    i14 += (int)1.43F;
                    break;
                case 4:
                    iArr[i17] -= (int)d1;
                    i13 += (((i17 * i19) + i15) - i15);
                    iArr[i15 - 1] <<= (int)Test.instanceCount;
                case 5:
                    i16 -= -43111;
                    break;
                case 6:
                    Test.instanceCount /= (long)-81.26949;
                    break;
                case 7:
                    try {
                        Test.iArrFld[i15 + 1] = (i13 / i20);
                        i20 = (143 / i15);
                        i13 = (-176 / Test.iArrFld[i15 - 1]);
                    } catch (ArithmeticException a_e) {}
                case 8:
                    iArr[i17 - 1] -= (int)Test.instanceCount;
                case 9:
                    by1 >>= (byte)i15;
                case 10:
                    i18 = i19;
                }
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f1) + i13 + i14 + i15 + i16 + i17 + i18 + i19 + i20 + by1 +
            FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(float f, int i9, int i10) {

        int i11=-5, i12=110, i21=34607, i22=-220, i23=9625;
        byte by=110;
        double d2=-1.113984;
        float f2=0.624F;
        short s1=1967;

        for (i11 = 8; i11 < 193; ++i11) {
            by += (byte)(i11 | i11);
            Test.iArrFld[i11] += by;
            vMeth1(f, i12, i9);
            by += (byte)d2;
        }
        i9 >>= i10;
        for (f2 = 14; 273 > f2; ++f2) {
            Test.instanceCount *= i12;
            i10 += (int)(f2 + i10);
            i21 += 35934;
        }
        Test.iArrFld[(15323 >>> 1) % N] -= i10;
        i21 -= i12;
        for (i22 = 4; i22 < 179; ++i22) {
            i23 = i22;
            i10 |= s1;
        }
        long meth_res = Float.floatToIntBits(f) + i9 + i10 + i11 + i12 + by + Double.doubleToLongBits(d2) +
            Float.floatToIntBits(f2) + i21 + i22 + i23 + s1;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth(short s, int i7) {

        int i8=58386, i24=12, i25=-137, i26=11, i27=-2, i28=-176;

        i8 >>= iMeth(Test.fFld, 47, i7);
        try {
            i7 >>= i8;
            for (i24 = 4; 337 > i24; ++i24) {
                for (i26 = 1; i26 < 5; i26++) {
                    i8 += (((i26 * s) + Test.instanceCount) - i24);
                    i8 += i8;
                    Test.instanceCount += i25;
                    i25 <<= i7;
                    i27 -= i7;
                    if (i24 != 0) {
                        vMeth_check_sum += s + i7 + i8 + i24 + i25 + i26 + i27 + i28;
                        return;
                    }
                }
                Test.fFld = i24;
            }
            i28 = 1;
            do {
                i8 *= i25;
                Test.fFld = Test.fFld;
            } while (++i28 < 192);
        }
        catch (NegativeArraySizeException exc1) {
            Test.instanceCount = i24;
        }
        finally {
            s += (short)i24;
        }
        vMeth_check_sum += s + i7 + i8 + i24 + i25 + i26 + i27 + i28;
    }

    public void mainTest(String[] strArr1) {

        double d=-1.109404;
        int i=-1, i1=43567, i2=-6, i3=-61185, i4=-9, i5=-46511, i6=57583, i29=-12, i30=-181;
        long l=-123L, lArr[]=new long[N];
        byte byArr[]=new byte[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(byArr, (byte)123);
        FuzzerUtils.init(sArr, (short)-26059);
        FuzzerUtils.init(lArr, -10L);

        for (d = 6; d < 138; ++d) {
            for (i1 = (int)(d); i1 < 190; i1 += 2) {
                i = (int)(--Test.instanceCount);
            }
            for (i3 = (int)(d); i3 < 190; i3++) {
                i += i3;
                for (i5 = 1; i5 < 1; ++i5) {
                    switch (((i3 % 2) * 5) + 115) {
                    case 121:
                        i6 += (49 - (--i4));
                        i2 -= (((byArr[(int)(d)] += (byte)7) >>> 2) % ((i6 <<= (11 + (i3 - i6))) | 1));
                        Test.iArrFld = (Test.iArrFld = (Test.iArrFld = Test.iArrFld));
                        break;
                    case 122:
                        try {
                            i4 = (i1 / -17);
                            i6 = (i % -58691);
                            i = (Test.iArrFld[i3 + 1] / 24070);
                        } catch (ArithmeticException a_e) {}
                        i -= Math.min((int)(i4 & (Test.instanceCount++)), i2);
                    }
                    Test.iArrFld = (Test.iArrFld = Test.iArrFld);
                    i4 += (i5 - i2);
                    sArr[i5] -= (short)(((i - -1327303773264354021L) + (Test.iArrFld[i5]++)) + (--Test.iArrFld[i5 +
                        1]));
                    vMeth(Test.sFld, -118);
                    i4 <<= i;
                    i2 = i;
                    Test.iArrFld[(int)(d)] *= (int)Test.fFld;
                }
            }
            Test.instanceCount += -25778;
            Test.iArrFld[(int)(d)] = (int)Test.instanceCount;
            Test.iArrFld[(int)(d + 1)] += iFld;
            iFld = 104;
        }
        iFld = (int)Test.instanceCount;
        Test.iArrFld[(i2 >>> 1) % N] = i3;
        l -= i;
        lArr = lArr;
        for (i29 = 12; i29 < 236; i29++) {
            try {
                i30 = (i6 / Test.iArrFld[(i6 >>> 1) % N]);
                i2 = (i4 / i2);
                i30 = (i2 / Test.iArrFld[i29 + 1]);
            } catch (ArithmeticException a_e) {}
            i = iFld;
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
