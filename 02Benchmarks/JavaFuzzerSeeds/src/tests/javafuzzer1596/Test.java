package tests.javafuzzer1596;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 23:32:11 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-80L;
    public static float fFld=0.728F;
    public short sFld=-12378;
    public static double dFld=-1.56378;
    public static boolean bFld=false;

    public static long vSmallMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i2, boolean b, int i3) {

        byte by=-50;
        float f1=-86.648F;
        int i4=-2, i5=55, i6=-42910, i7=170, i8=13, iArr[]=new int[N];
        double d=84.122051;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 2738610676L);
        FuzzerUtils.init(iArr, 52);

        i3 *= by;
        for (f1 = 3; f1 < 178; ++f1) {
            short s1=-6833;
            i2 /= (int)1.54841;
            lArr = lArr;
            i2 <<= i2;
            switch ((int)((f1 % 8) + 25)) {
            case 25:
                by = (byte)s1;
                iArr[(int)(f1 - 1)] = s1;
                for (i5 = 1; i5 < 9; ++i5) {
                    try {
                        i6 = (i2 % i2);
                        i2 = (444104363 % i6);
                        i6 = (i2 % -248);
                    } catch (ArithmeticException a_e) {}
                    Test.fFld -= s1;
                    i2 = i2;
                    for (i7 = i5; i7 < 2; ++i7) {
                        i6 += i7;
                        Test.fFld = i5;
                    }
                }
                break;
            case 26:
                d += i8;
                break;
            case 27:
                i2 += (int)34.3793;
                break;
            case 28:
                Test.instanceCount += (long)(f1 * f1);
                break;
            case 29:
                i6 = (int)Test.fFld;
                break;
            case 30:
                i8 = (int)d;
                break;
            case 31:
                i4 &= i2;
                break;
            case 32:
                Test.instanceCount += (long)f1;
            }
        }
        vMeth_check_sum += i2 + (b ? 1 : 0) + i3 + by + Float.floatToIntBits(f1) + i4 + i5 + i6 + i7 + i8 +
            Double.doubleToLongBits(d) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
    }

    public static long lMeth(int i1, long l) {

        boolean b1=true;
        int i9=8, i10=54525, i11=-12, i12=1, i13=-2, i14=-33041, i15=-54184;
        double d1=-2.34028;
        byte by1=-81;

        vMeth(7, b1, 217);
        for (i9 = 8; 255 > i9; i9++) {
            i1 >>= (int)l;
            i1 = i9;
            for (i11 = 7; 1 < i11; i11--) {
                i13 = 1;
                while (++i13 < 2) {
                    i12 += (((i13 * i13) + i12) - l);
                    d1 = i11;
                }
                i12 += -251;
                Test.fFld *= by1;
                for (i14 = 1; i14 < 2; ++i14) {
                    i1 += (((i14 * i15) + i11) - i15);
                    i1 = i14;
                    i15 >>>= i15;
                    Test.fFld -= Test.fFld;
                }
            }
        }
        long meth_res = i1 + l + (b1 ? 1 : 0) + i9 + i10 + i11 + i12 + i13 + Double.doubleToLongBits(d1) + by1 + i14 +
            i15;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vSmallMeth(int i, short s, float f) {


        i = (int)lMeth(i, Test.instanceCount);
        i <<= (int)Test.instanceCount;
        vSmallMeth_check_sum += i + s + Float.floatToIntBits(f);
    }

    public void mainTest(String[] strArr1) {

        int i16=-167, i17=-27619, i18=-12, i19=-93, i20=0, i21=-6, iArr1[]=new int[N];
        float f2=48.443F;
        byte by2=-67;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr1, -3);
        FuzzerUtils.init(lArr1, -11L);

        for (int smallinvoc=0; smallinvoc<822; smallinvoc++) vSmallMeth(i16, sFld, Test.fFld);
        iArr1[(i16 >>> 1) % N] = i16;
        iArr1[(i16 >>> 1) % N] /= (int)(i16 | 1);
        i16 = i16;
        i16 -= (int)Test.dFld;
        Test.instanceCount = 7;
        iArr1[(i16 >>> 1) % N] = (int)Test.instanceCount;
        f2 = 125;
        while (--f2 > 0) {
            i16 <<= i16;
            Test.instanceCount += Test.instanceCount;
            for (i17 = (int)(f2); i17 < 201; i17++) {
                i19 = 1;
                do {
                    i18 %= 21128;
                    i16 -= i16;
                } while (--i19 > 0);
                try {
                    i18 = (i17 / i17);
                    i16 = (i16 / -247);
                    i18 = (1982718771 / i19);
                } catch (ArithmeticException a_e) {}
                i16 += i16;
                for (i20 = 1; i20 < 1; ++i20) {
                    Test.dFld = Test.fFld;
                    switch ((int)((f2 % 6) + 72)) {
                    case 72:
                        Test.instanceCount += (i20 * i20);
                        break;
                    case 73:
                        lArr1[(int)(f2 + 1)] *= by2;
                        i18 = i21;
                        lArr1[(int)(f2)] = i18;
                        Test.fFld -= f2;
                    case 74:
                        Test.dFld += 119.352F;
                        if (Test.bFld) break;
                        i21 = i18;
                        i16 += (int)Test.instanceCount;
                    case 75:
                    case 76:
                        Test.dFld *= 3838125285083039495L;
                        Test.instanceCount *= 8435;
                        break;
                    case 77:
                        i21 += (((i20 * i20) + i21) - i17);
                        break;
                    default:
                        Test.instanceCount = Test.instanceCount;
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  lMeth ->  lMeth vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth lMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}