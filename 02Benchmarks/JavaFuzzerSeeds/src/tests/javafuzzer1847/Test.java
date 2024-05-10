package tests.javafuzzer1847;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 04:25:44 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-9111903550942026152L;
    public static double dFld=-1.7609;
    public static long lFld=0L;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 2182323612L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i8) {

        int i10=5114, i11=13, i12=-37704, i13=-34197, iArr1[]=new int[N];
        float f1=-13.370F;
        boolean b=false;
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr1, -10);
        FuzzerUtils.init(sArr, (short)20400);

        i8 = (int)6L;
        for (int i9 : iArr1) {
            if (b) {
                Test.dFld *= 21290;
                Test.dFld -= -6;
                vMeth1_check_sum += i8 + i10 + i11 + i12 + i13 + Float.floatToIntBits(f1) + (b ? 1 : 0) +
                    FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(sArr);
                return;
            } else if (b) {
                i9 = (int)Test.instanceCount;
                Test.lFld &= i8;
                for (i10 = 1; 4 > i10; i10++) {
                    for (i12 = 1; i12 < 2; ++i12) {
                        Test.instanceCount += Test.lFld;
                        f1 = Test.lFld;
                        i8 += (i12 - i8);
                        i13 >>= (int)Test.instanceCount;
                        if (i9 != 0) {
                            vMeth1_check_sum += i8 + i10 + i11 + i12 + i13 + Float.floatToIntBits(f1) + (b ? 1 : 0) +
                                FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(sArr);
                            return;
                        }
                        if (b) break;
                    }
                }
            } else if (b) {
                i9 ^= 21;
            }
        }
        vMeth1_check_sum += i8 + i10 + i11 + i12 + i13 + Float.floatToIntBits(f1) + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(sArr);
    }

    public static void vMeth(int i6, double d, int i7) {

        int i14=61, i15=-238, i16=41609, i17=1, iArr2[]=new int[N];
        float f2=1.28F;
        short s1=28895;
        boolean b1=true;

        FuzzerUtils.init(iArr2, -3);

        vMeth1(5431);
        for (i14 = 7; i14 < 328; ++i14) {
            f2 = 5;
            do {
                i15 -= (int)f2;
                iArr2[i14 - 1] = i15;
                for (i16 = i14; i16 < 1; ++i16) {
                    s1 = (short)i17;
                    Test.lArrFld[(int)(f2)] ^= i14;
                    i15 = i15;
                    if (b1) {
                        i6 += (-117 + (i16 * i16));
                        i17 = (int)Test.instanceCount;
                        i15 += (int)Test.instanceCount;
                    } else if (b1) {
                        i7 = i7;
                        Test.dFld += i6;
                    }
                }
            } while (--f2 > 0);
        }
        vMeth_check_sum += i6 + Double.doubleToLongBits(d) + i7 + i14 + i15 + Float.floatToIntBits(f2) + i16 + i17 + s1
            + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr2);
    }

    public static int iMeth(float f, long l, long l1) {

        int i2=37, i3=1, i4=-4, i5=-26772, i18=43, i19=27751, i20=-3, iArr3[]=new int[N];
        long l2=-247L;

        FuzzerUtils.init(iArr3, -184);

        for (i2 = 6; i2 < 124; i2++) {
            i3 = (int)((-(i2 - 34412)) * ((++Test.dFld) - (i3++)));
            for (i4 = 1; i4 < 13; i4++) {
                vMeth(-14, Test.dFld, i5);
                for (l2 = i4; 2 > l2; l2++) {
                    i3 >>= i2;
                    i5 += (int)(l2 * l2);
                    i18 += (int)(l2 - i5);
                    iArr3[i2 - 1] += -124;
                    f += ((long)l2 | (long)i3);
                }
                for (i19 = 1; 2 > i19; i19++) {
                    i3 <<= (int)Test.instanceCount;
                    if (i2 != 0) {
                    }
                    i3 >>= (int)l2;
                    f = (float)Test.dFld;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f) + l + l1 + i2 + i3 + i4 + i5 + l2 + i18 + i19 + i20 +
            FuzzerUtils.checkSum(iArr3);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-9, i1=12, i21=-27389, i22=44622, i23=-136, i24=-52563, i25=249, i26=157, i28=62, i29=-93, iArr[]=new
            int[N];
        float f3=-18.746F;
        boolean b2=true;

        FuzzerUtils.init(iArr, 56260);

        for (i = 203; i > 7; i--) {
            i1 -= (i1--);
            try {
                i1 = (-65389 / i);
                iArr[i - 1] = (i / -13863);
                iArr[i + 1] = (i / i);
            } catch (ArithmeticException a_e) {}
            i1 += iMeth(f3, Test.lFld, Test.instanceCount);
            for (i21 = 6; i21 < 128; i21++) {
                i22 += (((i21 * i) + Test.lFld) - i22);
                Test.dFld += i1;
                if (b2) break;
                i22 ^= (int)37805L;
                i1 *= (int)Test.dFld;
            }
            i1 = i1;
            for (i23 = 7; i23 < 128; i23++) {
                i1 = i1;
                try {
                    i1 = (47546 % iArr[i23 - 1]);
                    i1 = (i / i22);
                    iArr[i23 - 1] = (i22 / i1);
                } catch (ArithmeticException a_e) {}
                Test.lFld = i1;
            }
            i24 += (int)Test.lFld;
        }
        for (i25 = 2; i25 < 135; i25++) {
            i22 = i22;
            i24 >>>= i25;
            i22 >>>= i23;
            f3 -= -39;
            if (b2) {
                Test.dFld -= i23;
            } else if (b2) {
                if (false) {
                    i1 = 99;
                    Test.dFld -= i;
                    i1 >>= i1;
                } else if (true) {
                    for (i28 = 1; i28 < 188; i28 += 3) {
                        f3 += (((i28 * i28) + Test.lFld) - i);
                        if (b2) continue;
                    }
                } else {
                    i1 = i;
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}