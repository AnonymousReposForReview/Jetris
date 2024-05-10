package tests.javafuzzer842;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 10:53:08 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3L;
    public static float fFld=-2.797F;
    public static float fFld1=0.992F;
    public int iArrFld[]=new int[N];
    public static int iArrFld1[]=new int[N];
    public float fArrFld[][]=new float[N][N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.iArrFld1, -45889);
        FuzzerUtils.init(Test.bArrFld, true);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i3, long l1, int i4) {

        int i5=108, i6=105, i7=13, iArr[]=new int[N];
        byte by=-13;
        short s=-24236;
        float f=-1.567F, fArr[]=new float[N];

        FuzzerUtils.init(iArr, -38303);
        FuzzerUtils.init(fArr, -1.864F);

        iArr[(i4 >>> 1) % N] *= i3;
        l1 = i4;
        for (i5 = 17; 283 > i5; i5++) {
            boolean b1=true;
            by = (byte)s;
            Test.fFld += l1;
            l1 >>= i6;
            if (b1) continue;
        }
        for (f = 5; 379 > f; f++) {
            switch ((int)((f % 2) + 49)) {
            case 49:
            case 50:
                if (i7 != 0) {
                    vMeth1_check_sum += i3 + l1 + i4 + i5 + i6 + by + s + Float.floatToIntBits(f) + i7 +
                        FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                    return;
                }
            }
            i7 *= (int)Test.instanceCount;
            fArr[(int)(f - 1)] = i4;
            i6 -= (int)-2854810976120838315L;
            Test.fFld += f;
            Test.fFld -= i7;
        }
        vMeth1_check_sum += i3 + l1 + i4 + i5 + i6 + by + s + Float.floatToIntBits(f) + i7 + FuzzerUtils.checkSum(iArr)
            + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(int i2, long l) {

        int i8=3;

        vMeth1(i2, l, i8);
        Test.iArrFld1[(i2 >>> 1) % N] -= i8;
        vMeth_check_sum += i2 + l + i8;
    }

    public static int iMeth(int i1) {

        int i9=-211, i10=-170, i11=46169, i12=4, i13=9, i14=-6, i15=-3;
        double d1=-94.70619;
        long l2=5521958783020082258L, lArr[]=new long[N];
        byte by1=56;

        FuzzerUtils.init(lArr, -14739L);

        vMeth(i1, -60711L);
        i1 += 12;
        for (i9 = 391; i9 > 8; --i9) {
            for (i11 = 1; i11 < 4; i11++) {
                for (i13 = i11; i13 < 2; ++i13) {
                    i12 -= (int)Test.fFld;
                    i14 &= i12;
                    i10 += (int)d1;
                    lArr[i13 + 1] -= i13;
                    l2 -= i1;
                }
                lArr[i9] -= 21006;
                i15 = 1;
                while (++i15 < 2) {
                    Test.instanceCount = 7375;
                    by1 = (byte)-133;
                    i14 += (int)Test.fFld;
                }
            }
        }
        long meth_res = i1 + i9 + i10 + i11 + i12 + i13 + i14 + Double.doubleToLongBits(d1) + l2 + i15 + by1 +
            FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d=0.38039, d2=-26.68867;
        boolean b=false;
        int i=251, i16=-252, i17=22940, i18=-120, i19=-13524, i20=30817, i21=24192;
        short s1=-11749;
        byte by2=8;

        d = 1;
        while (++d < 267) {
            b = (i < i);
            if (b) continue;
            iArrFld[(int)(d)] += -66;
            i <<= (int)(iMeth(3) * Test.instanceCount);
            for (i16 = 4; i16 < 94; i16++) {
                i -= -200;
                fArrFld[i16 + 1][i16] += Test.instanceCount;
                s1 = (short)i16;
                switch (((i16 >>> 1) % 8) + 35) {
                case 35:
                    for (i18 = i16; 2 > i18; i18++) {
                        switch ((i18 % 1) + 87) {
                        case 87:
                            Test.instanceCount -= -11;
                            break;
                        }
                        i17 += i19;
                        i20 = i18;
                        switch ((((i20 >>> 1) % 10) * 5) + 86) {
                        case 126:
                            Test.bArrFld[(int)(d + 1)] = b;
                            i17 = i;
                            Test.instanceCount = -61;
                            try {
                                i20 = (i16 / 174);
                                i19 = (i19 % Test.iArrFld1[i16 - 1]);
                                i19 = (i17 / i);
                            } catch (ArithmeticException a_e) {}
                            break;
                        case 123:
                            i20 = i19;
                            i17 += (((i18 * i16) + i18) - i17);
                            break;
                        case 94:
                            switch (((i16 >>> 1) % 2) + 75) {
                            case 75:
                                switch ((int)((d % 8) + 103)) {
                                case 103:
                                    Test.bArrFld[i18 - 1] = b;
                                    i20 >>>= i20;
                                    fArrFld[(int)(d + 1)][(int)(d)] += i20;
                                case 104:
                                    iArrFld[i16 - 1] >>= i17;
                                    break;
                                case 105:
                                    i20 |= i19;
                                    Test.instanceCount *= i17;
                                    break;
                                case 106:
                                    by2 &= (byte)i18;
                                    break;
                                case 107:
                                    Test.iArrFld1[i16] = (int)Test.fFld;
                                case 108:
                                    i = (int)Test.instanceCount;
                                case 109:
                                    iArrFld[i18] *= i17;
                                    break;
                                case 110:
                                    Test.iArrFld1[(i19 >>> 1) % N] = i19;
                                    break;
                                }
                                break;
                            case 76:
                            default:
                                d2 = -10;
                            }
                        case 104:
                            Test.fFld += (((i18 * Test.fFld) + i17) - i17);
                            break;
                        case 110:
                            i -= (int)Test.fFld;
                            break;
                        case 105:
                            i17 = i17;
                            break;
                        case 108:
                            i21 = (int)455398179L;
                            break;
                        case 130:
                            i19 = i20;
                            break;
                        case 121:
                            i17 -= (int)7L;
                            break;
                        case 114:
                            i17 = i17;
                            break;
                        }
                    }
                case 36:
                    i19 = i17;
                    break;
                case 37:
                    i17 <<= 14;
                    break;
                case 38:
                    Test.fFld1 = i20;
                    break;
                case 39:
                    i17 += (i16 ^ (long)Test.fFld);
                    break;
                case 40:
                    i21 += i20;
                    break;
                case 41:
                    d2 *= i16;
                    break;
                case 42:
                    iArrFld[(int)(d)] <<= i16;
                    break;
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