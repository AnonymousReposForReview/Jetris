package tests.javafuzzer556;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 05:41:59 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=12L;
    public static byte byFld=-102;
    public static volatile float fFld=2.349F;
    public double dFld=5.40905;
    public short sArrFld[]=new short[N];
    public int iArrFld[]=new int[N];
    public byte byArrFld[]=new byte[N];

    public static long iMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static double dMeth(float f) {

        int i3=-76;
        byte by=18;

        i3 *= (int)(by - (--f));
        long meth_res = Float.floatToIntBits(f) + i3 + by;
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth1(int i12) {

        int i13=3, i14=-87, i15=4, i16=144, i17=3, iArr1[]=new int[N];
        short s=15685;
        byte by1=-100;

        FuzzerUtils.init(iArr1, 14);

        iArr1[(-173 >>> 1) % N] *= i12;
        for (i13 = 291; i13 > 10; i13 -= 3) {
            for (i15 = i13; i15 < 17; i15++) {
                switch ((i15 % 8) + 109) {
                case 109:
                    i14 += (((i15 * i12) + s) - i15);
                    i17 = 1;
                    do {
                        i14 <<= Test.byFld;
                        s += (short)i16;
                    } while (++i17 < 1);
                    break;
                case 110:
                    Test.instanceCount = by1;
                    i12 = s;
                    i16 = i12;
                case 111:
                    i12 += i13;
                    break;
                case 112:
                    i12 = i16;
                    break;
                case 113:
                    Test.fFld += Test.instanceCount;
                    iArr1[i15] /= (int)(Test.instanceCount | 1);
                    break;
                case 114:
                    i16 = i15;
                case 115:
                    i12 -= -45035;
                    break;
                case 116:
                    i14 >>= (int)179L;
                    break;
                default:
                    i12 %= (int)((long)(Test.fFld) | 1);
                }
            }
        }
        vMeth1_check_sum += i12 + i13 + i14 + i15 + i16 + s + i17 + by1 + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth() {

        int i6=21765, i7=-13, i8=-52746, i9=128, i10=1, i11=8;
        float f2=-66.815F;
        double d1=0.49921;

        for (i6 = 23; 386 > i6; ++i6) {
            for (i8 = 1; i8 < 5; i8++) {
                i9 = Test.byFld;
                i7 = (int)(((-1.82086 - f2) + (Test.instanceCount * i7)) - (8064735068145115687L * (d1 + f2)));
                i7 *= -7;
                i9 += i8;
                i7 = (int)d1;
                for (i10 = 1; i10 < 2; i10++) {
                    if (i11 != 0) {
                        vMeth_check_sum += i6 + i7 + i8 + i9 + Float.floatToIntBits(f2) + Double.doubleToLongBits(d1) +
                            i10 + i11;
                        return;
                    }
                    vMeth1(i8);
                    Test.instanceCount >>= i8;
                    i7 = (int)Test.instanceCount;
                    i7 = (int)Test.instanceCount;
                }
                i7 = i8;
                i9 -= (int)1.93641;
            }
        }
        vMeth_check_sum += i6 + i7 + i8 + i9 + Float.floatToIntBits(f2) + Double.doubleToLongBits(d1) + i10 + i11;
    }

    public static int iMeth(double d, int i1, int i2) {

        float f1=0.1013F;
        int i4=-41317, i5=-3862, i18=114, i19=216, i20=46, iArr[]=new int[N];
        double d2=-46.71675;
        short s1=13597;
        boolean b=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 3956998841L);
        FuzzerUtils.init(iArr, -13);

        i1 = (int)dMeth(f1);
        lArr[(i1 >>> 1) % N] += (long)Float.intBitsToFloat((int)(Test.byFld - (1.241F * iArr[(i1 >>> 1) % N])));
        for (i4 = 9; i4 < 175; i4++) {
            i5 = (--i1);
            Test.instanceCount = (--iArr[i4]);
        }
        vMeth();
        for (d2 = 5; d2 < 277; d2++) {
            switch ((((10506 >>> 1) % 4) * 5) + 118) {
            case 125:
                s1 += (short)(d2 * d2);
                iArr[(int)(d2 - 1)] *= (int)Test.instanceCount;
                for (i19 = 6; i19 > 1; i19--) {
                    i18 = (int)Test.instanceCount;
                    if (b) {
                        Test.fFld -= i19;
                        iArr = iArr;
                    }
                }
                break;
            case 126:
                i18 = (int)-2.500F;
            case 120:
                if (i1 != 0) {
                }
                break;
            case 123:
                Test.instanceCount += (long)(d2 * i2);
                break;
            }
        }
        long meth_res = Double.doubleToLongBits(d) + i1 + i2 + Float.floatToIntBits(f1) + i4 + i5 +
            Double.doubleToLongBits(d2) + i18 + s1 + i19 + i20 + (b ? 1 : 0) + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=156, i21=-13, i22=47994, i23=-44, i24=-11834, i25=13579, i26=14565, i27=58958;
        double d3=-19.2869, dArr[]=new double[N];
        long l=7122400721160674982L, l1=31L, lArr1[]=new long[N];
        boolean b1=false;
        short s2=-11780;
        float f3=0.852F;

        FuzzerUtils.init(dArr, -41.14740);
        FuzzerUtils.init(lArr1, -45L);

        Test.instanceCount -= i;
        iMeth(d3, i, i);
        sArrFld[(2 >>> 1) % N] *= Test.byFld;
        iArrFld[(i >>> 1) % N] = (int)Test.fFld;
        if (b1) {
            if (b1) {
                for (i21 = 8; 214 > i21; i21++) {
                    i22 += -207;
                }
                iArrFld[(i >>> 1) % N] <<= (int)l;
            }
            switch (((i >>> 1) % 4) + 16) {
            case 16:
                i = i21;
                for (i23 = 9; i23 < 247; ++i23) {
                    for (l1 = i23; l1 < 106; ++l1) {
                        i22 += (int)l1;
                        for (i26 = 1; 1 > i26; ++i26) {
                            iArrFld[i23 - 1] *= i24;
                            i27 *= i22;
                            switch ((((0 >>> 1) % 8) * 5) + 97) {
                            case 123:
                                i22 -= (int)2.96407;
                            case 113:
                                i24 += (int)Test.fFld;
                                i += i25;
                                switch (((i26 % 9) * 5) + 31) {
                                case 71:
                                    iArrFld[(int)(l1 + 1)] += (int)d3;
                                    s2 *= (short)Test.fFld;
                                    i27 = i21;
                                    i25 <<= i25;
                                    break;
                                case 62:
                                    dFld -= i24;
                                    dFld = -81;
                                    s2 -= (short)i;
                                    i22 += i27;
                                    break;
                                case 57:
                                    iArrFld[(int)(l1)] ^= 3;
                                case 60:
                                    i24 += (i26 * l);
                                case 69:
                                    i25 <<= (int)Test.instanceCount;
                                    break;
                                case 64:
                                    i24 = i26;
                                    break;
                                case 42:
                                    i24 += i26;
                                    break;
                                case 44:
                                    i25 = (int)75L;
                                    break;
                                case 73:
                                    lArr1[i26] = (long)dFld;
                                    break;
                                }
                                break;
                            case 111:
                                iArrFld[i26] -= i24;
                            case 117:
                                if (b1) continue;
                            case 98:
                                d3 *= i22;
                            case 110:
                                i22 += (((i26 * Test.byFld) + i24) - f3);
                                break;
                            case 120:
                                byArrFld[i26 - 1] = (byte)i;
                            case 133:
                                i24 -= s2;
                                break;
                            }
                        }
                    }
                }
                break;
            case 17:
                i22 -= i21;
                break;
            case 18:
                i *= (int)Test.instanceCount;
                break;
            case 19:
                Test.fFld -= 233;
                break;
            default:
                i25 += i22;
            }
        } else if (b1) {
            iArrFld[(i22 >>> 1) % N] = Test.byFld;
        } else {
            i27 >>= i23;
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}