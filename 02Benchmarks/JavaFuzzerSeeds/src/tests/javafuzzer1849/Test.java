package tests.javafuzzer1849;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 04:27:07 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=8L;
    public static int iFld=-28;
    public static int iArrFld[]=new int[N];
    public static volatile long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -10);
        FuzzerUtils.init(Test.lArrFld, 470672296L);
    }

    public static long vMeth_check_sum = 0;
    public static long byMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;

    public static boolean bMeth() {

        int i7=10231, i8=11, i9=-82, i10=-19884, i11=0, i12=-24, i13=-77, i14=-46465;
        long l1=5596L, l2=-9L;
        short s=3810;
        float f1=77.502F;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -1.128454);

        for (i7 = 6; 320 > i7; i7++) {
            i8 ^= 5;
        }
        for (l1 = 12; l1 < 383; ++l1) {
            for (i10 = 1; i10 < 5; i10++) {
                Test.iArrFld = Test.iArrFld;
                i11 = (int)4155133620L;
            }
            s *= (short)i8;
            Test.iArrFld[(int)(l1 - 1)] = (int)l1;
            for (i12 = 1; 5 > i12; ++i12) {
                i13 -= (int)f1;
                switch (((i12 % 1) * 5) + 37) {
                case 39:
                    i13 = 12;
                    for (l2 = 1; l2 < 2; ++l2) {
                        Test.instanceCount = i11;
                        Test.instanceCount += i8;
                    }
                    break;
                }
            }
        }
        long meth_res = i7 + i8 + l1 + i9 + i10 + i11 + s + i12 + i13 + Float.floatToIntBits(f1) + l2 + i14 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static byte byMeth(int i5, int i6) {

        float f2=0.264F;
        int i15=6, i16=-43184, i17=6348, i18=2, i19=9, i20=9687;
        boolean b1=false;
        byte by=76;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -137L);

        Test.instanceCount -= i6;
        bMeth();
        f2 *= f2;
        for (long l3 : lArr) {
            try {
                i5 = (i6 / Test.iArrFld[(8 >>> 1) % N]);
                i6 = (i5 % -124);
                Test.iArrFld[(161 >>> 1) % N] = (-7226 / i5);
            } catch (ArithmeticException a_e) {}
        }
        i15 = 1;
        do {
            for (i16 = 7; i16 > 1; i16 -= 2) {
                try {
                    i5 = (i15 / i17);
                    i17 = (i6 / i5);
                    Test.iArrFld[i16] = (i15 % i18);
                } catch (ArithmeticException a_e) {}
                Test.instanceCount >>= -6;
                for (i19 = 1; i19 < 3; ++i19) {
                    i18 = 133;
                    if (b1) break;
                    i20 += (((i19 * i20) + by) - i18);
                    Test.iArrFld[i19 - 1] += i17;
                    i5 -= i15;
                }
            }
        } while (++i15 < 236);
        long meth_res = i5 + i6 + Float.floatToIntBits(f2) + i15 + i16 + i17 + i18 + i19 + i20 + (b1 ? 1 : 0) + by +
            FuzzerUtils.checkSum(lArr);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public void vMeth(int i2, int i3, long l) {

        int i4=-10, i21=13, i22=99, i23=69, i24=3;
        boolean b=false;
        long l5=-9L;

        i4 = 1;
        do {
            i2 += (i2--);
            if (b = (b = (byMeth(i4, i3) >= -12L))) break;
            i3 += (i4 ^ i2);
            i21 = 1;
            while (++i21 < 5) {
                Test.lArrFld[i4 - 1] = Test.iFld;
                Test.instanceCount = -24994;
                Test.instanceCount *= 1236843429L;
            }
            Test.iFld += i4;
            for (i22 = 1; i22 < 5; ++i22) {
                for (l5 = 1; l5 < 2; l5++) {
                    i3 *= (int)-1.494F;
                    Test.lArrFld[(int)(l5 - 1)] = 578149131L;
                    Test.iArrFld[i4] = Test.iFld;
                    i2 -= i2;
                }
            }
        } while (++i4 < 308);
        vMeth_check_sum += i2 + i3 + l + i4 + (b ? 1 : 0) + i21 + i22 + i23 + l5 + i24;
    }

    public void mainTest(String[] strArr1) {

        int i=49379, i1=0, i25=-9, i26=-71, i27=-6, i28=10, i29=-13256, i30=63820, i31=34385, i32=-25929;
        float f=1.1012F;
        short s1=-5746;
        long l6=24L, l7=-3521469808127872244L;

        i = 1;
        while (++i < 148) {
            i1 += (int)(Test.instanceCount--);
            f += (1.153F + (i * i));
            f += i;
            vMeth(i1, i, Test.instanceCount);
            Test.iArrFld = FuzzerUtils.int1array(N, (int)6);
        }
        Test.iFld = s1;
        for (i25 = 11; 375 > i25; ++i25) {
            i26 = i25;
            i1 <<= i;
        }
        for (l6 = 9; l6 < 298; l6++) {
            for (i28 = 3; 87 > i28; ++i28) {
                for (i30 = 1; i30 < 2; ++i30) {
                    Test.instanceCount *= (long)f;
                }
                for (l7 = 2; 1 < l7; l7--) {
                    double d1=82.125225;
                    i1 = -9;
                    Test.iArrFld[i28] += i;
                    f += i26;
                    Test.iArrFld[(int)(l7 + 1)] += (int)l7;
                    switch (((115 >>> 1) % 5) + 67) {
                    case 67:
                        i29 *= (int)l7;
                        f += (((l7 * i32) + f) - i30);
                        i1 = (int)l6;
                    case 68:
                        Test.instanceCount >>= l6;
                        break;
                    case 69:
                        i31 = i31;
                        Test.instanceCount += (l7 - Test.iFld);
                        i32 = (int)d1;
                        s1 += (short)(l7 * l7);
                        break;
                    case 70:
                        d1 *= 9;
                        s1 >>= (short)i29;
                        break;
                    case 71:
                        Test.iArrFld = Test.iArrFld;
                        break;
                    default:
                        i1 = Test.iFld;
                    }
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
//DEBUG  byMeth ->  byMeth vMeth mainTest
//DEBUG  bMeth ->  bMeth byMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}