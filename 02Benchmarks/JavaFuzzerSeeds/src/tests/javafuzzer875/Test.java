package tests.javafuzzer875;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 11:07:02 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2593448657L;
    public static boolean bFld=true;
    public static boolean bFld1=true;
    public float fFld=0.985F;
    public static volatile short sFld=21451;
    public int iFld1=94;
    public byte byArrFld[]=new byte[N];
    public float fArrFld[]=new float[N];
    public volatile int iArrFld[][]=new int[N][N];

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(short s1, int i9, float f) {

        int i10=64075, i11=190, i12=237, i13=34721, iArr1[]=new int[N];
        boolean b=false, bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(iArr1, -214);

        i9 = (int)Test.instanceCount;
        i9 = (int)-128L;
        i9 >>= 51086;
        i9 = (int)-58262L;
        for (i10 = 13; i10 < 214; i10++) {
            if (Test.bFld) {
                for (i12 = 1; i12 < 8; ++i12) {
                    bArr[i10] = true;
                }
            }
            i13 += (int)(6699489644124234115L + (i10 * i10));
        }
        Test.bFld = b;
        Test.instanceCount >>= i12;
        for (int i14 : iArr1) {
            iArr1 = iArr1;
            i11 *= (int)Test.instanceCount;
            Test.bFld1 = b;
        }
        vMeth1_check_sum += s1 + i9 + Float.floatToIntBits(f) + i10 + i11 + i12 + i13 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i3, int i4) {

        int i5=-49189, i6=60893, i7=-225, i8=0, i15=-9, i16=34724, i17=93;
        byte by=-100;
        short s2=-21812;
        float f1=-2.373F;
        long l1=3964098990L;
        double d=0.79911;

        i5 = 1;
        while (++i5 < 187) {
            for (i6 = i5; i6 < 9; ++i6) {
                i8 &= (by = (byte)i3);
                vMeth1(s2, i8, f1);
                i8 = (int)f1;
            }
            s2 += (short)i5;
        }
        for (l1 = 11; l1 < 353; l1++) {
            i15 += (int)(((l1 * i4) + i5) - i3);
            s2 -= (short)-130;
            d += f1;
            Test.instanceCount = Test.instanceCount;
            for (i16 = 1; i16 < 5; i16++) {
                i3 -= i17;
                i8 -= (int)Test.instanceCount;
                i7 += (i16 - l1);
            }
        }
        vMeth_check_sum += i3 + i4 + i5 + i6 + i7 + i8 + by + s2 + Float.floatToIntBits(f1) + l1 + i15 +
            Double.doubleToLongBits(d) + i16 + i17;
    }

    public static void vSmallMeth(long l, int i1, int i2) {

        double d1=-37.58779;

        vMeth(-127, i2);
        i2 += (int)d1;
        vSmallMeth_check_sum += l + i1 + i2 + Double.doubleToLongBits(d1);
    }

    public void mainTest(String[] strArr3) {

        int i=-3222, i18=75, i19=-7, i20=12, i21=-7;
        double d2=-56.69307, d3=26.7662;

        i = (--i);
        for (int smallinvoc=0; smallinvoc<895; smallinvoc++) vSmallMeth(Test.instanceCount, i, 40596);
        for (byte by1 : byArrFld) {
            i = i;
            Test.instanceCount -= i;
            d2 -= Test.instanceCount;
            switch (((i >>> 1) % 6) + 56) {
            case 56:
                switch (((-21182 >>> 1) % 3) + 70) {
                case 70:
                    i18 = 1;
                    do {
                        Test.instanceCount += i;
                        switch ((((i18 >>> 1) % 3) * 5) + 106) {
                        case 109:
                            i += (i18 * i18);
                            i += (i18 - i18);
                            break;
                        case 115:
                        case 121:
                            i %= 11149;
                            i += (i18 | (long)fFld);
                            break;
                        default:
                            switch (((i18 % 9) * 5) + 93) {
                            case 128:
                                i = i;
                                Test.instanceCount -= i;
                                i += (int)Test.instanceCount;
                                fFld += i;
                                break;
                            case 118:
                                i += i18;
                                i -= (int)Test.instanceCount;
                                i19 = 1;
                                do {
                                    i = i;
                                    fFld += i19;
                                    fArrFld = fArrFld;
                                } while (--i19 > 0);
                            case 127:
                                if (Test.bFld1) break;
                                for (d3 = 1; d3 < 1; ++d3) {
                                    fFld = Test.sFld;
                                    if (Test.bFld) break;
                                }
                                break;
                            case 119:
                                i = i19;
                            case 130:
                            case 131:
                                i -= i18;
                                break;
                            case 126:
                                d2 -= 1110;
                            case 102:
                                Test.instanceCount *= Test.instanceCount;
                                break;
                            case 137:
                                i20 = i19;
                                break;
                            }
                        }
                    } while (++i18 < 63);
                    break;
                case 71:
                    i20 >>= i21;
                    break;
                case 72:
                    i20 /= (int)(i18 | 1);
                    break;
                default:
                    fFld = -142;
                }
                break;
            case 57:
                i21 += i;
                break;
            case 58:
                i20 |= i19;
                break;
            case 59:
                if (false) break;
                break;
            case 60:
                i20 *= iFld1;
                break;
            case 61:
                try {
                    i21 = (-158 % iArrFld[(i21 >>> 1) % N][(i19 >>> 1) % N]);
                    i = (i18 / i21);
                    i20 = (iArrFld[(i18 >>> 1) % N][(i19 >>> 1) % N] / -46827);
                } catch (ArithmeticException a_e) {}
            default:
                i -= (int)Test.instanceCount;
            }
        }


    }
    public static void main(String[] strArr2) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr2);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}