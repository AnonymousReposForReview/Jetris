package tests.javafuzzer152;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 23:03:51 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=26333L;
    public static float fFld=-2.372F;
    public volatile boolean bFld=false;
    public static volatile int iArrFld[]=new int[N];
    public static volatile double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -76);
        FuzzerUtils.init(Test.dArrFld, -55.48498);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l1) {

        int i2=-69, i3=16609, i4=-157, i5=49402, i6=-28542, i7=195, i8=-47943, iArr[]=new int[N];
        float f2=92.249F;

        FuzzerUtils.init(iArr, 35040);

        for (i2 = 6; i2 < 130; i2++) {
            i4 = 1;
            while (++i4 < 13) {
                l1 *= i2;
                f2 *= f2;
                i3 -= (int)3L;
                i3 &= i2;
                i3 -= i2;
                i3 = 4;
                i3 += 83;
                i3 <<= (int)Test.instanceCount;
            }
            iArr[i2 - 1] += i3;
            for (i5 = 13; 1 < i5; --i5) {
                i7 = 1;
                do {
                    try {
                        i6 = (iArr[i5] % i4);
                        iArr[i5] = (i2 % 34654);
                        i3 = (18691 / i6);
                    } catch (ArithmeticException a_e) {}
                    i8 += (((i7 * l1) + l1) - i5);
                } while ((i7 += 3) < 2);
            }
        }
        vMeth2_check_sum += l1 + i2 + i3 + i4 + Float.floatToIntBits(f2) + i5 + i6 + i7 + i8 +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(int i1) {

        int i9=5, i10=-163, i11=-14, i12=189, i13=9813, iArr1[]=new int[N];
        boolean b=false;

        FuzzerUtils.init(iArr1, -671);

        vMeth2(Test.instanceCount);
        for (i9 = 15; i9 < 282; ++i9) {
            float f3=1.205F;
            i10 = (int)f3;
            i11 = 1;
            while (++i11 < 6) {
                for (i12 = 1; i12 < 1; ++i12) {
                    double d=-127.26023;
                    iArr1[i9] = (int)Test.instanceCount;
                    i10 += (-208 + (i12 * i12));
                    i1 += i12;
                    iArr1[i12] -= i10;
                    f3 += (-14 + (i12 * i12));
                    f3 += Test.instanceCount;
                    if (b) {
                        Test.instanceCount = i10;
                        i1 = 5;
                        Test.instanceCount <<= Test.instanceCount;
                    } else if (b) {
                        d -= 18593;
                    } else {
                        i1 -= (int)f3;
                    }
                }
            }
        }
        vMeth1_check_sum += i1 + i9 + i10 + i11 + i12 + i13 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(float f, float f1) {

        int i14=-51, i15=-14439, i16=201;
        short s=-2611;
        long l2=-202L;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 64.316F);

        vMeth1(i14);
        i15 = 1;
        while (++i15 < 312) {
            s = (short)-1291;
            i16 = 1;
            while (++i16 < 5) {
                Test.iArrFld[i15] = 41934;
                i14 = i14;
                l2 = 1;
                do {
                    i14 = i14;
                    i14 += (int)l2;
                    i14 = i16;
                    Test.instanceCount *= i15;
                    i14 = i15;
                    i14 += i16;
                } while (++l2 < 1);
                fArr[i16] += 5441875700059973108L;
                i14 *= i14;
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + Float.floatToIntBits(f1) + i14 + i15 + s + i16 + l2 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        long l=2093033442L, lArr[][]=new long[N][N];
        int i=89, i17=62223, i18=0, i19=232, i20=180, i21=-39, i22=71, i23=34823, i24=-2, i25=-69;
        short s1=4013;
        double d1=-101.64831;

        FuzzerUtils.init(lArr, -13L);

        for (l = 18; l < 309; ++l) {
            vMeth(Test.fFld, Test.fFld);
            if (bFld) continue;
            try {
                i = (-67 % i);
                i17 = (i / -71);
                i17 = (i % 102);
            } catch (ArithmeticException a_e) {}
            lArr[(int)(l - 1)] = lArr[(int)(l - 1)];
        }
        s1 *= (short)d1;
        Test.instanceCount += i17;
        Test.instanceCount = i17;
        Test.iArrFld[(i >>> 1) % N] = (int)38L;
        for (i18 = 2; i18 < 209; i18++) {
            i = -57;
            for (i20 = 5; 121 > i20; ++i20) {
                i17 = (int)54196L;
                i21 += (((i20 * l) + l) - i21);
                i = i19;
                for (i22 = 1; 2 > i22; ++i22) {
                    d1 += i23;
                    Test.dArrFld[i22 + 1] -= i17;
                    Test.instanceCount = s1;
                    d1 -= 11;
                    bFld = bFld;
                    i17 += i22;
                }
                Test.instanceCount *= i;
                i23 >>= (int)l;
            }
            for (i24 = 2; i24 < 121; ++i24) {
                i17 -= (int)1.870F;
                Test.iArrFld[i24 - 1] <<= -7;
                Test.instanceCount -= i18;
            }
            i17 -= 63333;
            Test.fFld = i18;
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
