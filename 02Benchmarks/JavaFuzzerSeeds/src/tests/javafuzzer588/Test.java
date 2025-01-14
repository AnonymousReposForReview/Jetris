package tests.javafuzzer588;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 06:15:42 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-78L;
    public int iFld=-5;
    public static volatile byte byFld=-75;
    public static float fFld=1.47F;
    public static double dFld=87.39276;
    public static volatile int iArrFld[]=new int[N];
    public static long lArrFld[][]=new long[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, -156);
        FuzzerUtils.init(Test.lArrFld, -49L);
    }

    public static long bMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i3=-5, i4=218, i5=-238, i6=13, i7=-11;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -47722L);

        i3 = 1;
        while (++i3 < 341) {
            Test.instanceCount -= i3;
            Test.instanceCount += i3;
            Test.instanceCount = Test.instanceCount;
            for (i4 = i3; 5 > i4; ++i4) {
                Test.iArrFld[i4] += (int)Test.instanceCount;
                i5 += (int)Test.instanceCount;
                Test.byFld *= (byte)i3;
            }
            i5 += i3;
            try {
                i5 = (-19711 % i4);
                i5 = (-163538022 / Test.iArrFld[i3]);
                Test.iArrFld[i3] = (i3 / 166);
            } catch (ArithmeticException a_e) {}
            for (i6 = 5; i6 > i3; i6--) {
                int i8=-7;
                if (i3 != 0) {
                    vMeth1_check_sum += i3 + i4 + i5 + i6 + i7 + FuzzerUtils.checkSum(lArr);
                    return;
                }
                i7 = i8;
                i7 += (i6 | (long)Test.fFld);
                lArr[i3] /= (long)-31.469F;
            }
        }
        vMeth1_check_sum += i3 + i4 + i5 + i6 + i7 + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i2) {

        int i9=214, i10=11, i11=29235, i12=47696, i13=-14, i14=-9;
        short s=29557;
        double d=2.115732;

        vMeth1();
        for (i9 = 7; i9 < 133; i9++) {
            i2 += (((i9 * i2) + i2) - i10);
        }
        for (i11 = 140; i11 > 2; i11 -= 2) {
            i13 = 1;
            do {
                i10 = i9;
                if (i11 != 0) {
                    vMeth_check_sum += i2 + i9 + i10 + i11 + i12 + i13 + i14 + s + Double.doubleToLongBits(d);
                    return;
                }
                Test.iArrFld = Test.iArrFld;
                i2 <<= i11;
                i14 = 1;
                do {
                    s += (short)7;
                    i2 *= (int)d;
                    i12 -= i9;
                } while (++i14 < 1);
                i10 += i13;
                d *= -4;
            } while (++i13 < 22);
        }
        vMeth_check_sum += i2 + i9 + i10 + i11 + i12 + i13 + i14 + s + Double.doubleToLongBits(d);
    }

    public static boolean bMeth(int i1) {

        int i15=-49, i16=-19423, i17=58, i18=-28628, i19=11, i20=30622;
        short s1=-15259;
        boolean b1=false;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -1.73F);

        vMeth(i1);
        for (i15 = 10; i15 < 228; i15++) {
            if (b1) {
                i16 += (int)(-1.502F + (i15 * i15));
                s1 = (short)Test.instanceCount;
            } else {
                for (i17 = 1; i17 < 7; ++i17) {
                    for (i19 = 1; i19 < 2; ++i19) {
                        i20 += s1;
                    }
                    try {
                        Test.iArrFld[i17] = (i18 / 120);
                        i20 = (i17 % 37835);
                        Test.iArrFld[i15] = (-88 % i17);
                    } catch (ArithmeticException a_e) {}
                    Test.iArrFld = Test.iArrFld;
                    i1 += (i17 - i16);
                    i16 = (int)Test.instanceCount;
                    fArr[i17] -= i15;
                }
            }
            if (b1) continue;
        }
        long meth_res = i1 + i15 + i16 + s1 + (b1 ? 1 : 0) + i17 + i18 + i19 + i20 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void mainTest(String[] strArr1) {

        float f=-41.538F, f1=28.407F;
        int i=44, i21=1, i22=140, i23=-6;
        long l=-7639068004236272221L;

        f = (iFld++);
        i = 1;
        do {
            boolean b=true;
            iFld >>>= 139;
            if (b = (b = bMeth(i))) continue;
            switch (((i % 4) * 5) + 33) {
            case 43:
                f1 *= f;
                Test.lArrFld[i - 1][i + 1] += iFld;
                break;
            case 37:
                iFld += (((i * f1) + iFld) - Test.instanceCount);
                break;
            case 38:
                iFld = i;
                iFld = iFld;
                break;
            case 51:
                i21 = 1;
                do {
                    double d1=0.101506;
                    d1 += 186;
                    iFld >>= (int)l;
                    iFld = i;
                    l = i;
                    iFld += iFld;
                    iFld += i21;
                    iFld -= -233;
                    iFld &= (int)Test.instanceCount;
                } while (++i21 < 101);
                break;
            default:
                Test.lArrFld[i + 1][i] = (long)Test.dFld;
                iFld += (i * i);
            }
            Test.instanceCount *= l;
            iFld >>= iFld;
            Test.instanceCount = i;
            iFld += i;
            for (i22 = 1; 101 > i22; ++i22) {
                iFld = -9;
                i23 -= i;
            }
            try {
                i23 = (Test.iArrFld[i] % -146);
                i23 = (-62337 % i);
                Test.iArrFld[i - 1] = (i22 % 23937);
            } catch (ArithmeticException a_e) {}
        } while (++i < 250);
        iFld *= i22;



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
//DEBUG  bMeth ->  bMeth mainTest
//DEBUG  vMeth ->  vMeth bMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth bMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
