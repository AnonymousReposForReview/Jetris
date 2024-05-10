package tests.javafuzzer895;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 11:19:21 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2557127429036105556L;
    public int iFld=12013;
    public float fFld=0.0F;
    public static double dArrFld[]=new double[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.dArrFld, -95.57299);
        FuzzerUtils.init(Test.iArrFld, 193);
    }

    public static long iMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i5, int i6) {

        int i8=7, i9=-7, i10=162, i11=217, i12=8, iArr[]=new int[N];
        byte by=102, byArr[][]=new byte[N][N];
        float f=0.483F;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 13581);
        FuzzerUtils.init(byArr, (byte)23);
        FuzzerUtils.init(lArr, 3812233042L);

        for (int i7 : iArr) {
            byArr[(-34841 >>> 1) % N][(i7 >>> 1) % N] = (byte)6779;
            switch (((i6 >>> 1) % 4) + 78) {
            case 78:
            case 79:
                for (i8 = 1; i8 < 4; i8++) {
                    Test.instanceCount += (i8 * i8);
                    i5 <<= (int)Test.instanceCount;
                    i10 = 1;
                    while (++i10 < 2) {
                        i9 += (i10 + i8);
                        by = (byte)-3347;
                        f += Test.instanceCount;
                        i9 = i7;
                    }
                    for (i11 = 1; i11 < 2; ++i11) {
                        i9 = by;
                    }
                    i7 = (int)-43.866F;
                }
                lArr[(i9 >>> 1) % N] += i9;
                break;
            case 80:
                try {
                    i6 = (i6 % 63643);
                    iArr[(i5 >>> 1) % N] = (124 % i8);
                    i5 = (i12 / iArr[(i9 >>> 1) % N]);
                } catch (ArithmeticException a_e) {}
                break;
            case 81:
                i5 *= -57872;
                break;
            default:
                Test.instanceCount = Test.instanceCount;
            }
        }
        vMeth_check_sum += i5 + i6 + i8 + i9 + i10 + by + Float.floatToIntBits(f) + i11 + i12 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(lArr);
    }

    public static double dMeth(int i2) {

        int i3=-8, i4=0, i13=13, i14=5, iArr1[]=new int[N];
        float f1=2.652F;
        boolean b=true;

        FuzzerUtils.init(iArr1, -54959);

        for (i3 = 4; i3 < 216; i3 += 3) {
            Test.instanceCount = (++i2);
            vMeth(i2, i2);
            for (i13 = 1; 22 > i13; ++i13) {
                i14 += i4;
                iArr1[i3] = i14;
            }
            switch ((i3 % 4) + 52) {
            case 52:
                f1 -= Test.instanceCount;
                Test.instanceCount += i13;
                break;
            case 53:
                try {
                    i14 = (i13 / iArr1[i3]);
                    iArr1[i3] = (i4 % -41973);
                    iArr1[i3 - 1] = (i14 % 740640474);
                } catch (ArithmeticException a_e) {}
                i14 >>= i13;
                try {
                    i2 = (i4 / iArr1[i3]);
                    i4 = (-64095 / i4);
                    i2 = (i2 % iArr1[i3 - 1]);
                } catch (ArithmeticException a_e) {}
                break;
            case 54:
                if (b) continue;
                i14 = i14;
                i2 += (18414 + (i3 * i3));
                break;
            case 55:
                iArr1[i3 - 1] -= (int)-1.10553;
                break;
            }
        }
        long meth_res = i2 + i3 + i4 + i13 + i14 + Float.floatToIntBits(f1) + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr1);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static int iMeth() {

        int i=-5, i1=183, i15=7, i16=22, i17=6;
        boolean b1=true;
        double d=1.58951;
        float f2=0.502F;
        short s=13462;

        for (i = 8; i < 241; i++) {
            dMeth(i1);
            switch (((i >>> 1) % 4) + 119) {
            case 119:
                i1 *= i;
                switch (((i >>> 1) % 1) + 51) {
                case 51:
                    for (i15 = 1; i15 < 7; i15++) {
                        b1 = b1;
                        i16 += -222;
                        switch (((i15 % 2) * 5) + 38) {
                        case 42:
                            Test.instanceCount = Test.instanceCount;
                            i16 >>>= i;
                            Test.instanceCount = Test.instanceCount;
                            i1 |= i15;
                            break;
                        case 41:
                            d += 1;
                            i1 += (((i15 * i1) + f2) - i);
                        }
                    }
                    break;
                }
                break;
            case 120:
                Test.instanceCount = i;
                break;
            case 121:
                i16 -= i;
            case 122:
                f2 += (((i * i15) + s) - i17);
                break;
            default:
                Test.iArrFld[i - 1] -= i15;
            }
        }
        long meth_res = i + i1 + i15 + i16 + (b1 ? 1 : 0) + Double.doubleToLongBits(d) + Float.floatToIntBits(f2) + s +
            i17;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i18=16684, i19=-54298, i20=54835, i21=-184, i22=-22119;
        short s1=29144;
        byte by1=87;

        Test.dArrFld[(2 >>> 1) % N] += ((++iFld) + iMeth());
        for (i18 = 22; i18 < 354; i18++) {
            boolean b2=false;
            fFld -= -26479;
            if (true) break;
            i19 -= i19;
            Test.iArrFld[i18] = i18;
            iFld = i19;
            iFld >>= s1;
            i20 = 76;
            do {
                iFld = iFld;
                Test.instanceCount = Test.instanceCount;
                Test.instanceCount = i18;
                Test.instanceCount += Test.instanceCount;
            } while (--i20 > 0);
            if (b2) {
                Test.instanceCount *= i18;
                switch ((i18 % 3) + 59) {
                case 59:
                    for (i21 = 1; i21 < 76; ++i21) {
                        Test.dArrFld[i18] -= iFld;
                        i22 &= (int)Test.instanceCount;
                    }
                    break;
                case 60:
                    i19 = i18;
                case 61:
                    fFld += 186;
                    i19 += (-107 + (i18 * i18));
                    Test.instanceCount = Test.instanceCount;
                    break;
                default:
                    Test.instanceCount += 0L;
                    Test.instanceCount += i18;
                }
                Test.instanceCount -= i19;
                by1 = (byte)49574;
            } else if (b2) {
                Test.instanceCount += (i18 ^ i20);
                s1 += (short)i21;
                try {
                    i22 = (iFld % i21);
                    iFld = (-46543 / i19);
                    i19 = (i22 % -24);
                } catch (ArithmeticException a_e) {}
            } else if (b2) {
                b2 = b2;
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
//DEBUG  dMeth ->  dMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth dMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
