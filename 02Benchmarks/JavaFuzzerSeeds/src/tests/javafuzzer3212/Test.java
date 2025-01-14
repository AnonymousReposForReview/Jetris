package tests.javafuzzer3212;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 03:56:15 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-3255338206L;
    public static float fFld=-118.84F;
    public double dFld=1.80158;
    public static short sFld=1680;
    public int iFld=9;
    public long lFld=8L;
    public static volatile long lArrFld[]=new long[N];
    public static volatile int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -64L);
        FuzzerUtils.init(Test.iArrFld, -118);
        FuzzerUtils.init(Test.dArrFld, 0.91447);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long sMeth_check_sum = 0;

    public static short sMeth(int i4, long l1) {

        int i5=-40, i6=81, iArr[]=new int[N];
        byte by=0;
        double dArr[][]=new double[N][N];

        FuzzerUtils.init(iArr, -42);
        FuzzerUtils.init(dArr, -1.43651);

        for (i5 = 10; 182 > i5; ++i5) {
            short s1=10141;
            i6 >>= s1;
            i4 *= by;
            Test.lArrFld[i5] = (long)Test.fFld;
            Test.instanceCount += 6;
            iArr[i5 + 1] += i4;
            i4 = i4;
            i6 -= (int)l1;
        }
        i6 -= i5;
        dArr = FuzzerUtils.double2array(N, (double)0.52377);
        long meth_res = i4 + l1 + i5 + i6 + by + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static void vMeth1(int i1, long l) {

        int i2=-9, i3=-3, i8=-37387, i9=81, iArr1[]=new int[N];
        short s=-32248;
        byte by1=78;
        boolean b1=false;

        FuzzerUtils.init(iArr1, 57740);

        for (i2 = 9; 395 > i2; i2++) {
            Test.fFld = (((--i1) + s) - i1);
            switch (((((int)(i3 / (l | 1))) >>> 1) % 4) + 16) {
            case 16:
                i3 = (int)(-(sMeth(i3, 213L) - Test.instanceCount));
                i1 += i2;
                i8 = 4;
                while (--i8 > 0) {
                    i1 = i1;
                }
                switch ((((i3 >>> 1) % 2) * 5) + 75) {
                case 82:
                    Test.fFld += i2;
                    break;
                case 79:
                    if (i3 != 0) {
                        vMeth1_check_sum += i1 + l + i2 + i3 + s + i8 + i9 + by1 + (b1 ? 1 : 0) +
                            FuzzerUtils.checkSum(iArr1);
                        return;
                    }
                    i9 = 1;
                    while (++i9 < 4) {
                        by1 *= (byte)i2;
                        i1 = i9;
                        Test.fFld = i1;
                        i3 += -16090;
                    }
                    break;
                default:
                    i3 = i1;
                }
                break;
            case 17:
                i3 = -12;
                break;
            case 18:
                try {
                    i1 = (iArr1[i2] / -7862);
                    i3 = (i8 % i8);
                    i1 = (i9 % -1577282056);
                } catch (ArithmeticException a_e) {}
                break;
            case 19:
                i3 *= by1;
            default:
                b1 = false;
            }
        }
        vMeth1_check_sum += i1 + l + i2 + i3 + s + i8 + i9 + by1 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i, boolean b, double d) {

        int i11=-13, i12=8439, i13=-214;
        short s2=27575;
        byte by2=25;

        vMeth1(i, Test.instanceCount);
        for (i11 = 8; i11 < 215; ++i11) {
            i13 = 1;
            while (++i13 < 8) {
                i12 += (((i13 * i12) + i11) - Test.instanceCount);
                Test.instanceCount -= i;
                switch (((i11 % 1) * 5) + 127) {
                case 131:
                    Test.iArrFld[i13] = i11;
                    Test.instanceCount = i11;
                    Test.instanceCount += i13;
                    if (b) break;
                    break;
                }
                Test.instanceCount = i;
                s2 <<= (short)Test.instanceCount;
                i12 = i13;
                Test.iArrFld = Test.iArrFld;
            }
            by2 -= (byte)d;
        }
        vMeth_check_sum += i + (b ? 1 : 0) + Double.doubleToLongBits(d) + i11 + i12 + i13 + s2 + by2;
    }

    public void mainTest(String[] strArr1) {

        int i14=-13158, i15=-65054, i16=103, i17=47685, i18=-25;
        double d1=-18.60702, d2=0.80255;
        boolean b2=false;
        byte by3=-93;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -1.277F);

        vMeth(i14, false, dFld);
        i14 = i14;
        for (i15 = 7; 170 > i15; i15++) {
            Test.instanceCount -= 156;
            i14 = (int)dFld;
            switch ((i15 % 10) * 5) {
            case 11:
                for (d1 = 1; d1 < 154; d1++) {
                    Test.iArrFld[(int)(d1 + 1)] = (int)Test.instanceCount;
                    fArr[(int)(d1)] = Test.instanceCount;
                    b2 = b2;
                    i17 += (int)(d1 * i17);
                }
                break;
            case 32:
                Test.iArrFld[i15 - 1] = i16;
                break;
            case 29:
            case 37:
                Test.lArrFld[i15 + 1] -= -127;
                i14 += 74;
                i18 = 1;
                do {
                    i14 *= 21549;
                    dFld += by3;
                    i14 += (i18 * i18);
                    Test.instanceCount += i16;
                    Test.sFld += (short)(((i18 * i16) + iFld) - iFld);
                    Test.fFld -= i16;
                    iFld -= (int)d2;
                    Test.instanceCount += Test.instanceCount;
                    iFld ^= i16;
                    Test.dArrFld[i18 - 1] -= i18;
                } while (++i18 < 154);
                Test.instanceCount += i15;
                break;
            case 27:
                Test.lArrFld[i15] *= iFld;
                break;
            case 6:
                if (b2) break;
                i14 = iFld;
                lFld = i17;
                break;
            case 26:
                Test.lArrFld[i15] = i18;
            case 9:
                if (b2) break;
                break;
            case 34:
                i16 = (int)d1;
                break;
            case 43:
                i16 -= Test.sFld;
                break;
            default:
                i14 = (int)2.782F;
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
//DEBUG  sMeth ->  sMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
