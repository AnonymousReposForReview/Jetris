package tests.javafuzzer3318;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 05:52:15 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=0L;
    public static byte byFld=50;
    public static double dFld=-93.23750;
    public long lFld=-30885L;
    public static int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 2);
        FuzzerUtils.init(Test.fArrFld, 1.534F);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static double dMeth() {

        float f1=-31.194F;
        int i2=13710, i3=-25734, i4=10819, i5=-7, i6=-87, i7=-83;
        short s=-31484;
        boolean b=true;

        f1 = Test.byFld;
        i2 += 41646;
        i3 = 1;
        while (++i3 < 389) {
            if (b) {
                i2 *= (int)Test.dFld;
                for (i4 = 1; 4 > i4; i4++) {
                    i5 -= i5;
                    for (i6 = 1; i6 < 2; ++i6) {
                        Test.instanceCount += (i6 * i6);
                        Test.iArrFld[i3 + 1] += (int)-2.294F;
                        try {
                            i7 = (i7 % -180);
                            i7 = (i7 / -18118);
                            i5 = (i2 / Test.iArrFld[i4 + 1]);
                        } catch (ArithmeticException a_e) {}
                        i7 *= (int)Test.instanceCount;
                        Test.dFld = s;
                        i7 += i6;
                        Test.byFld += (byte)(i6 | i7);
                    }
                }
            } else {
                i2 >>= i2;
            }
        }
        long meth_res = Float.floatToIntBits(f1) + i2 + i3 + i4 + i5 + i6 + i7 + s + (b ? 1 : 0);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static int iMeth(int i1, float f) {

        int i8=46, i9=42993, i10=6, i11=-6, i12=-54;
        boolean b1=true;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 2.331F);

        Test.instanceCount += (long)dMeth();
        if (b1) {
            Test.instanceCount = i1;
            for (i8 = 4; i8 < 124; ++i8) {
                Test.iArrFld[i8] *= (int)Test.instanceCount;
                for (i10 = 1; i10 < 13; ++i10) {
                    i12 = 1;
                    while (++i12 < 2) {
                        short s1=-10044;
                        if (true) {
                        } else {
                            s1 = (short)i8;
                            try {
                                Test.iArrFld[i8] = (i9 % 65434);
                                Test.iArrFld[i12 - 1] = (i1 % -140);
                                i1 = (57020 % i9);
                            } catch (ArithmeticException a_e) {}
                            Test.instanceCount += -38861;
                            i11 = i9;
                        }
                        fArr[i8 - 1] *= i9;
                        i11 = i11;
                        i11 += (i12 - Test.instanceCount);
                    }
                }
            }
        }
        long meth_res = i1 + Float.floatToIntBits(f) + i8 + i9 + i10 + i11 + i12 + (b1 ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i) {

        byte by=58;
        float f2=122.849F;

        by -= (byte)((iMeth(-80, 1.331F) >> i) - f2);
        Test.instanceCount <<= 36650;
        vMeth_check_sum += i + by + Float.floatToIntBits(f2);
    }

    public void mainTest(String[] strArr1) {

        int i13=-13, i14=22, i15=-25327, i16=4, i17=-13, i18=-54932, i19=5, i20=-61170, i21=211, i22=10, i23=26615;
        short s2=-19707, sArr[]=new short[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(sArr, (short)-12127);
        FuzzerUtils.init(lArr, 440253256341030756L);

        vMeth(i13);
        for (float f3 : Test.fArrFld) {
            sArr[(i13 >>> 1) % N] = (short)i13;
            i14 = 1;
            while ((i14 += 2) < 63) {
                Test.instanceCount += (long)f3;
                for (i15 = i14; i15 < 3; i15++) {
                    Test.instanceCount &= Test.instanceCount;
                    i13 += (((i15 * Test.instanceCount) + Test.instanceCount) - Test.byFld);
                    lArr[i14] -= (long)Test.dFld;
                    switch (((i14 % 2) * 5) + 20) {
                    case 24:
                        lArr[i15 - 1] = Test.instanceCount;
                        i13 >>= i15;
                        break;
                    case 25:
                        i13 *= (int)Test.instanceCount;
                        break;
                    }
                    f3 += (((i15 * i15) + s2) - i15);
                    i16 += (int)(0L + (i15 * i15));
                    Test.byFld += (byte)Test.instanceCount;
                    Test.instanceCount -= Test.instanceCount;
                    Test.iArrFld[i15 - 1] += (int)-42.565F;
                }
            }
            for (i17 = 63; i17 > 3; --i17) {
                i18 = (int)lFld;
                i18 += (int)f3;
                i18 += i14;
            }
            i19 = 1;
            while (++i19 < 63) {
                switch ((i19 % 2) + 69) {
                case 69:
                    for (i20 = i19; i20 < 1; ++i20) {
                        Test.iArrFld[i20] -= i21;
                    }
                    for (i22 = 1; i22 < 1; ++i22) {
                        Test.instanceCount += (i22 * i22);
                        i16 = -225;
                        Test.instanceCount -= i16;
                    }
                    break;
                case 70:
                    i18 += (((i19 * lFld) + f3) - Test.byFld);
                    break;
                default:
                    i13 += i19;
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  dMeth ->  dMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
