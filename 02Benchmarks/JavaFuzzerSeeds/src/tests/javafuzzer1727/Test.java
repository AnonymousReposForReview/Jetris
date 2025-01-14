package tests.javafuzzer1727;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 02:37:57 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-75L;
    public static volatile float fFld=-2.83F;
    public boolean bFld=true;
    public static boolean bFld1=true;
    public int iFld=13;
    public static long lArrFld[]=new long[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 6L);
        FuzzerUtils.init(Test.fArrFld, 33.501F);
    }

    public static long bMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        int i10=-56041, i11=-165;

        for (i10 = 10; i10 < 330; i10++) {
            i11 += i10;
        }
        vMeth_check_sum += i10 + i11;
    }

    public static long lMeth(double d, int i7) {

        int i8=207, i9=27113, i12=242, i13=-181, i14=-21356, i15=-128, iArr[]=new int[N];
        byte by=106;

        FuzzerUtils.init(iArr, -191);

        Test.instanceCount = i7;
        for (i8 = 6; i8 < 147; i8++) {
            vMeth();
            for (i12 = 11; 1 < i12; i12--) {
                iArr[i8 - 1] *= i7;
                Test.instanceCount >>= i13;
                i7 -= i13;
                for (i14 = 2; i14 > i8; --i14) {
                    i15 += (i14 - i15);
                    Test.lArrFld = Test.lArrFld;
                    i7 = (int)Test.fFld;
                    Test.fFld = Test.instanceCount;
                    try {
                        iArr[i12] = (iArr[i14] / -263011763);
                        iArr[i8 + 1] = (26981 % i13);
                        i7 = (40752 / i9);
                    } catch (ArithmeticException a_e) {}
                    Test.fFld -= i15;
                    by |= (byte)-7296;
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d) + i7 + i8 + i9 + i12 + i13 + i14 + i15 + by +
            FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static boolean bMeth(long l, boolean b) {

        int i2=104, i3=31682, i4=-181, i5=-76, i6=-7, iArr1[]=new int[N];
        double d1=-111.95005;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)61);
        FuzzerUtils.init(iArr1, -8);

        i2 = 182;
        do {
            for (i3 = 1; i3 < 9; i3++) {
                i4 -= (int)(++l);
            }
            for (i5 = 9; i5 > 1; --i5) {
                i6 = (int)((++byArr[i5]) + (lMeth(d1, i6) - i6));
                i6 += (((i5 * i6) + i4) - Test.fFld);
                i4 -= i4;
                i4 += i5;
                b = b;
                iArr1[i2] = i3;
            }
        } while (--i2 > 0);
        for (int i16 : iArr1) {
            i16 <<= 6;
        }
        i6 -= (int)d1;
        l += i4;
        i6 += (int)1.416F;
        long meth_res = l + (b ? 1 : 0) + i2 + i3 + i4 + i5 + i6 + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr1);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void mainTest(String[] strArr1) {

        int i=32, i1=0, i17=29712, i18=250, i19=-38, i20=7, i21=-20169, iArr2[][]=new int[N][N];
        short s=-22479;
        double d2=0.17361;
        byte by1=-82;

        FuzzerUtils.init(iArr2, 0);

        for (i = 3; i < 212; i += 3) {
            switch (((i >>> 1) % 5) + 3) {
            case 3:
                i1 = (int)(-((i1++) - (6358636194070395075L - (i1 * i))));
                i1 += i;
                bMeth(Test.instanceCount, bFld);
                if (bFld) break;
                break;
            case 4:
                s -= (short)i;
                Test.instanceCount += (i * i);
                iArr2[i + 1][i] >>= i1;
                break;
            case 5:
                for (i17 = i; i17 < 363; ++i17) {
                    for (i19 = 1; 1 > i19; i19++) {
                        switch (((i1 >>> 1) % 5) + 95) {
                        case 95:
                            Test.fFld -= 149;
                            break;
                        case 96:
                            Test.lArrFld[i17 - 1] <<= Test.instanceCount;
                            break;
                        case 97:
                            i18 -= (int)14L;
                            if (bFld) continue;
                            Test.bFld1 = bFld;
                            break;
                        case 98:
                            iArr2[i19 + 1][i] = i;
                            i1 >>= (int)Test.instanceCount;
                            switch (i17 + 79) {
                            case 79:
                                i1 += -2;
                                i18 += (i19 + i19);
                                i1 = i17;
                                break;
                            case 80:
                                Test.instanceCount += i19;
                                iArr2[i19][i19] = -34961;
                                Test.lArrFld = Test.lArrFld;
                                break;
                            case 81:
                                i1 += (i19 * i19);
                                Test.instanceCount += (i19 + i20);
                                break;
                            case 82:
                                i20 += (i19 + Test.fFld);
                                break;
                            case 83:
                                i1 *= s;
                                break;
                            case 84:
                                if (Test.bFld1) break;
                            case 85:
                            case 86:
                                iArr2[i17] = FuzzerUtils.int1array(N, (int)50);
                                break;
                            case 87:
                                s <<= (short)i1;
                                break;
                            case 88:
                                iArr2[i][i17] = i18;
                                break;
                            case 89:
                                Test.lArrFld[i] = i17;
                                break;
                            case 90:
                                d2 += i18;
                                break;
                            case 91:
                                Test.instanceCount -= i17;
                                break;
                            case 92:
                            case 93:
                            case 94:
                                Test.instanceCount = (long)d2;
                            case 95:
                                i20 += (i19 * i19);
                            case 96:
                                i18 <<= 26731;
                                break;
                            case 97:
                                i18 = -9;
                                break;
                            case 98:
                                Test.fFld = i1;
                                break;
                            case 99:
                                i20 -= (int)Test.instanceCount;
                                break;
                            case 100:
                                iArr2[i19 - 1][i] = (int)Test.fFld;
                                break;
                            case 101:
                                Test.instanceCount *= i;
                            case 102:
                                if (bFld) break;
                                break;
                            case 103:
                                Test.instanceCount += (i19 ^ i);
                            case 104:
                                i18 = (int)Test.fFld;
                                break;
                            case 105:
                                i18 -= (int)d2;
                                break;
                            case 106:
                                i1 += (i19 | Test.instanceCount);
                                break;
                            case 107:
                            case 108:
                                by1 >>= (byte)-12;
                                break;
                            case 109:
                                i18 >>>= s;
                            case 110:
                                by1 = (byte)i;
                                break;
                            case 111:
                                i20 += i1;
                            case 112:
                                Test.instanceCount += (long)53.546F;
                                break;
                            case 113:
                            case 114:
                                by1 = (byte)i;
                                break;
                            case 115:
                                d2 = Test.instanceCount;
                            case 116:
                                iFld &= i19;
                            case 117:
                                i20 <<= i1;
                            case 118:
                            case 119:
                                i20 += (i19 | Test.instanceCount);
                            case 120:
                                s = (short)Test.instanceCount;
                                break;
                            case 121:
                                Test.fFld *= Test.instanceCount;
                                break;
                            case 122:
                                iFld += (int)(56242L + (i19 * i19));
                                break;
                            case 123:
                                iFld = i;
                                break;
                            case 124:
                                i1 += (i19 + i);
                                break;
                            case 125:
                                i20 >>= i19;
                                break;
                            case 126:
                                i20 = i18;
                                break;
                            case 127:
                                iFld >>= (int)Test.instanceCount;
                                break;
                            case 128:
                            case 129:
                                iFld = 14;
                            case 130:
                                iArr2[i19][i17 + 1] = i21;
                                break;
                            case 131:
                                by1 = (byte)i18;
                            case 132:
                                iFld = iFld;
                                break;
                            case 133:
                                i20 += i19;
                                break;
                            case 134:
                                Test.instanceCount = i20;
                                break;
                            case 135:
                                i18 += (i19 * i19);
                                break;
                            case 136:
                                i20 += (i19 * iFld);
                            case 137:
                                Test.instanceCount += i;
                                break;
                            case 138:
                                i1 = by1;
                                break;
                            case 139:
                                Test.instanceCount *= Test.instanceCount;
                                break;
                            case 140:
                                s += (short)i19;
                                break;
                            case 141:
                                Test.fFld += i19;
                            case 142:
                                i1 *= i17;
                            case 143:
                                i20 = (int)d2;
                                break;
                            case 144:
                                i1 += i19;
                                break;
                            case 145:
                                Test.fArrFld[i19 + 1] -= i17;
                                break;
                            case 146:
                                i21 -= (int)Test.instanceCount;
                                break;
                            case 147:
                                i1 = -249;
                            case 148:
                                i21 += (i19 - Test.instanceCount);
                            default:
                                i18 = (int)d2;
                            }
                        case 99:
                            i1 *= iFld;
                        default:
                            Test.lArrFld[i17] = i1;
                        }
                    }
                }
                break;
            case 6:
                iArr2[i + 1][i] = i19;
                break;
            case 7:
                iArr2[i + 1] = iArr2[i];
                break;
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
//DEBUG  bMeth ->  bMeth mainTest
//DEBUG  lMeth ->  lMeth bMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth bMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
