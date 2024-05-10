package tests.javafuzzer777;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 09:37:04 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=14L;
    public static double dFld=0.120981;

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i1) {

        int i2=53837, i3=137, i4=24;
        double d=2.12654;
        float f2=0.320F;
        short s=32153;

        i2 = 290;
        while ((i2 -= 2) > 0) {
            switch (((i2 % 2) * 5) + 104) {
            case 113:
                i1 = i2;
                for (i3 = i2; i3 < 11; ++i3) {
                    i1 -= i1;
                    Test.instanceCount += 396154809455755738L;
                }
                i4 = 1;
                i4 = (int)Test.instanceCount;
                break;
            case 112:
                i1 *= i4;
                Test.instanceCount *= Test.instanceCount;
                i4 += (int)Test.instanceCount;
                d -= f2;
                break;
            }
            s += (short)f2;
            i4 = -48040;
            i4 += (((i2 * i2) + i3) - i2);
        }
        long meth_res = i1 + i2 + i3 + i4 + Double.doubleToLongBits(d) + Float.floatToIntBits(f2) + s;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i, long l1) {

        float f1=-26.769F;

        f1 = iMeth(i);
        vMeth_check_sum += i + l1 + Float.floatToIntBits(f1);
    }

    public static void vSmallMeth(long l, float f) {

        int i5=35486;

        vMeth(i5, l);
        vSmallMeth_check_sum += l + Float.floatToIntBits(f) + i5;
    }

    public void mainTest(String[] strArr1) {

        float f3=48.766F;
        double d1=-16.84432, d2=-2.102230;
        int i6=-47222, i7=-2, i8=7, i9=-10, iArr[]=new int[N];
        byte by=-25;
        short s1=-2110;
        boolean b=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -5903085876546740872L);
        FuzzerUtils.init(iArr, 13);

        for (int smallinvoc=0; smallinvoc<805; smallinvoc++) vSmallMeth(Test.instanceCount, f3);
        for (d1 = 12; d1 < 252; d1++) {
            i7 = 1;
            do {
                i6 = i7;
                switch ((int)(((d1 % 1) * 5) + 78)) {
                case 81:
                    i6 += (i7 + by);
                    s1 = (short)i6;
                    break;
                default:
                    switch ((i7 % 8) + 21) {
                    case 21:
                        lArr[(int)(d1 - 1)] = -211;
                        i6 += i7;
                        for (i8 = 1; i8 < 1; i8++) {
                            Test.instanceCount *= Test.instanceCount;
                            switch ((i7 % 1) + 29) {
                            case 29:
                                Test.instanceCount = by;
                                i6 *= (int)-3544924573L;
                                Test.dFld = i7;
                                break;
                            }
                            i6 *= (int)Test.instanceCount;
                        }
                        Test.instanceCount = Test.instanceCount;
                        break;
                    case 22:
                        f3 += i9;
                        break;
                    case 23:
                        if (b) break;
                        i6 *= i7;
                        if (b) {
                        } else {
                            i9 = (int)Test.instanceCount;
                            i6 += (-113 + (i7 * i7));
                            f3 = (float)Test.dFld;
                            try {
                                i9 = (136 % i6);
                                iArr[i7 - 1] = (-11520 % i9);
                                i9 = (-3437 / i8);
                            } catch (ArithmeticException a_e) {}
                        }
                        d2 = 1;
                        while (--d2 > 0) {
                            Test.instanceCount -= Test.instanceCount;
                            i9 += (int)Test.dFld;
                            Test.instanceCount = (long)d2;
                        }
                        break;
                    case 24:
                        try {
                            i9 = (i8 % i7);
                            i9 = (iArr[(int)(d1 + 1)] % 151);
                            i6 = (i8 % 1442440997);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 25:
                        iArr[i7 + 1] = (int)Test.dFld;
                        break;
                    case 26:
                        i6 = by;
                        break;
                    case 27:
                        i6 *= (int)f3;
                    case 28:
                        iArr = iArr;
                    default:
                        f3 -= (float)d1;
                    }
                }
            } while (++i7 < 105);
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  iMeth ->  iMeth vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}