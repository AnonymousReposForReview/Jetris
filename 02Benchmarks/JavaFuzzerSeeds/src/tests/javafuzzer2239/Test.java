package tests.javafuzzer2239;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 10:47:50 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2538155907714816779L;
    public static byte byFld=-93;
    public int iArrFld[]=new int[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i2) {

        int i3=62841, i4=159, i5=145, i6=-110, i7=-117, i8=58506, iArr[]=new int[N];
        float f1=1.883F;

        FuzzerUtils.init(iArr, 9);

        for (i3 = 134; i3 > 5; --i3) {
            i4 += -72;
            i4 += 53507;
            i4 *= i2;
            for (i5 = 1; i5 < 12; i5++) {
                for (i7 = 1; i7 < 2; ++i7) {
                    f1 = i5;
                    Test.instanceCount += (((i7 * i3) + i3) - Test.instanceCount);
                    i6 += i7;
                    i6 += i2;
                }
                i8 = i3;
                f1 += -30880;
                try {
                    i6 = (-42888 / iArr[i5 - 1]);
                    i6 = (i5 % -218);
                    i2 = (i2 % -861435496);
                } catch (ArithmeticException a_e) {}
                iArr[i3 - 1] = i6;
                iArr[i5 - 1] = (int)Test.instanceCount;
            }
        }
        vMeth2_check_sum += i2 + i3 + i4 + i5 + i6 + i7 + i8 + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(int i, int i1, short s1) {

        float f2=-2.955F, f3=-1.401F;
        int i9=208, i10=60713, i11=8, i12=11, i13=-12539;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -89.55271);

        vMeth2(i);
        f2 = i;
        for (i9 = 398; i9 > 6; --i9) {
            f2 = i10;
            f2 = 8564;
            dArr[i9] -= Test.instanceCount;
            i10 = i9;
            for (i11 = 4; i11 > 1; i11 -= 3) {
                switch (((i9 % 2) * 5) + 53) {
                case 57:
                    f2 *= i9;
                    break;
                case 63:
                    for (f3 = 1; f3 < 4; f3++) {
                        Test.byFld = (byte)Test.instanceCount;
                        i1 = i12;
                        i10 -= (int)Test.instanceCount;
                        i >>= i1;
                    }
                default:
                    f2 += (i11 * i11);
                }
            }
        }
        vMeth1_check_sum += i + i1 + s1 + Float.floatToIntBits(f2) + i9 + i10 + i11 + i12 + Float.floatToIntBits(f3) +
            i13 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth() {

        int i14=10116, i15=-20034, i16=23803, i17=57343, i18=11, i19=116, iArr1[]=new int[N];
        short s2=-28540, sArr[]=new short[N];
        float f4=-1.779F;
        boolean b=true;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)64);
        FuzzerUtils.init(iArr1, 8);
        FuzzerUtils.init(sArr, (short)31638);

        vMeth1(i14, i14, s2);
        for (i15 = 17; i15 < 378; ++i15) {
            f4 = 31215L;
            for (i17 = 1; i17 < 5; ++i17) {
                i18 = i17;
                byArr[i17 + 1] *= (byte)i18;
                try {
                    i14 = (i18 % i18);
                    i14 = (i14 % iArr1[i15 + 1]);
                    iArr1[i15] = (iArr1[i15 + 1] / i14);
                } catch (ArithmeticException a_e) {}
                i14 -= i18;
                sArr[i17 + 1] <<= (short)-52192L;
                i19 = 1;
                do {
                    iArr1[i19 + 1] ^= (int)Test.instanceCount;
                    if (b) continue;
                    f4 = i17;
                    f4 *= i17;
                    if (i17 != 0) {
                        vMeth_check_sum += i14 + s2 + i15 + i16 + Float.floatToIntBits(f4) + i17 + i18 + i19 + (b ? 1 :
                            0) + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(sArr);
                        return;
                    }
                } while (++i19 < 2);
            }
        }
        vMeth_check_sum += i14 + s2 + i15 + i16 + Float.floatToIntBits(f4) + i17 + i18 + i19 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(sArr);
    }

    public void mainTest(String[] strArr1) {

        short s=-21951;
        float f=-126.543F, fArr[]=new float[N];
        int i20=14, i21=-23493, i22=-23, i24=-6, i25=-34659, i26=-4;
        double d=-31.46984;
        boolean b1=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -4L);
        FuzzerUtils.init(fArr, 65.868F);

        s |= (short)(Long.reverseBytes(Test.byFld * Test.instanceCount) + Math.abs(f--));
        vMeth();
        if (b1) {
            for (i20 = 16; i20 < 336; i20++) {
                for (d = 4; 79 > d; d++) {
                    i21 += (int)(d - Test.instanceCount);
                    i22 += (int)-710915060L;
                    i21 += (int)(d - Test.instanceCount);
                    if (b1) break;
                    i21 += (int)((long)d | s);
                }
                i22 = (int)-1167181744L;
                iArrFld[i20 + 1] = (int)Test.instanceCount;
                lArr[i20 + 1] = i20;
                Test.instanceCount >>= i20;
                i21 = i20;
            }
            try {
                fArr[(i22 >>> 1) % N] += f;
                for (int i23 : iArrFld) {
                    if (false) {
                        i21 = i23;
                        for (i24 = 63; i24 > 1; i24--) {
                            s *= (short)d;
                            i26 = 1;
                            while (++i26 < 2) {
                                i23 ^= (int)Test.instanceCount;
                                Test.instanceCount += (i26 * i26);
                                Test.instanceCount += (i26 * i23);
                                Test.instanceCount /= i23;
                                s = (short)229;
                                i23 = i26;
                                s >>= (short)i24;
                            }
                        }
                    } else if (b1) {
                        i25 >>= s;
                    } else if (b1) {
                        i22 >>>= i25;
                    } else {
                        i25 = (int)Test.instanceCount;
                    }
                }
            }
            catch (ArithmeticException exc2) {
                i25 -= (int)Test.instanceCount;
            }
        } else if (b1) {
            i22 += i24;
        } else if (b1) {
            i25 += i20;
        } else {
            s = (short)i26;
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
