package tests.javafuzzer1714;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 02:24:40 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=3953799503L;
    public static double dFld=90.33851;
    public int iFld=-158;
    public static float fFld=2.814F;
    public byte byFld=-92;
    public static boolean bFld=false;
    public short sFld=-31892;
    public static float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 62.989F);
        FuzzerUtils.init(Test.iArrFld, -49);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(long l, int i6, double d) {

        int i7=-9, i8=-9, i9=119, i10=-17182, iArr[]=new int[N];
        boolean b1=true;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr, 221);
        FuzzerUtils.init(lArr1, 215L);

        for (i7 = 3; i7 < 313; ++i7) {
            b1 = b1;
            i6 += (((i7 * i6) + i6) - i6);
            for (i9 = 1; i9 < 5; ++i9) {
                switch (((i9 % 6) * 5) + 98) {
                case 121:
                    l >>= i7;
                    break;
                case 107:
                    iArr[i9 - 1] *= (int)9.18713;
                    break;
                case 128:
                    if (i7 != 0) {
                    }
                    i6 = i7;
                    if (b1) continue;
                    lArr1[i7 + 1] -= i9;
                    break;
                case 105:
                    Test.instanceCount += -227;
                    Test.instanceCount |= 19991;
                    i10 -= (int)d;
                case 116:
                    l += (long)Test.fFld;
                    break;
                case 106:
                    Test.fFld *= -800534283L;
                default:
                    i6 -= -9;
                }
            }
        }
        long meth_res = l + i6 + Double.doubleToLongBits(d) + i7 + i8 + (b1 ? 1 : 0) + i9 + i10 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth1(int i2, int i3, boolean b) {

        int i4=30829, i5=-240, i11=126, i12=-224;
        long lArr2[]=new long[N];

        FuzzerUtils.init(lArr2, -11587L);

        for (i4 = 5; 155 > i4; i4++) {
            i2 -= -243;
            i2 -= (Short.reverseBytes((short)(Test.dFld * iFld)) + (iMeth(Test.instanceCount, i5, 0.50426) + i4));
            Test.instanceCount *= i4;
            i5 = (int)Test.fFld;
            i5 = i4;
            for (i11 = 11; i11 > 1; i11--) {
                short s1=16050;
                lArr2[i11 - 1] *= (long)Test.fFld;
                i5 >>= i12;
                Test.instanceCount -= (long)Test.fFld;
                byFld <<= (byte)s1;
                Test.iArrFld[i11] += (int)Test.fFld;
                Test.iArrFld[i11] = i4;
            }
        }
        b = b;
        Test.iArrFld[(-235 >>> 1) % N] = i5;
        vMeth1_check_sum += i2 + i3 + (b ? 1 : 0) + i4 + i5 + i11 + i12 + FuzzerUtils.checkSum(lArr2);
    }

    public void vMeth() {

        int i1=-56888, i13=0, i14=-57709, i15=60680, i16=-11705, i17=-10, i18=11;
        short s=32280;
        boolean b2=true;

        Test.fArrFld[(i1 >>> 1) % N] *= (++s);
        vMeth1(iFld, i1, b2);
        Test.instanceCount -= Test.instanceCount;
        for (i13 = 10; 262 > i13; i13 += 2) {
            for (i15 = 1; i15 < 12; ++i15) {
                for (i17 = i15; i17 < 2; i17++) {
                    byFld /= (byte)98.766F;
                    i18 += (((i17 * Test.instanceCount) + i17) - Test.instanceCount);
                    byFld = (byte)iFld;
                }
                Test.instanceCount &= Test.instanceCount;
                i16 = -54;
                switch (((i14 >>> 1) % 5) + 14) {
                case 14:
                    Test.dFld -= s;
                    break;
                case 15:
                    iFld += i15;
                case 16:
                    i18 = (int)Test.dFld;
                    break;
                case 17:
                    i16 |= (int)Test.instanceCount;
                    break;
                case 18:
                    i16 += (((i15 * s) + Test.instanceCount) - i18);
                    break;
                default:
                }
            }
        }
        vMeth_check_sum += i1 + s + (b2 ? 1 : 0) + i13 + i14 + i15 + i16 + i17 + i18;
    }

    public void mainTest(String[] strArr1) {

        int i=-1675, i19=6173, i20=-13494, i21=63193, i22=6, i23=-14387, i24=64791, i25=2060, i26=8, i27=-237,
            i28=-30736, i29=52767, i30=-13;
        float f=1.53F, f1=-57.950F;
        long lArr[]=new long[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(lArr, 101L);
        FuzzerUtils.init(sArr, (short)13064);

        Test.dFld *= lArr[(i >>> 1) % N];
        vMeth();
        for (i19 = 14; i19 < 229; ++i19) {
            for (i21 = i19; i21 < 117; ++i21) {
                if (Test.bFld) break;
                Test.iArrFld[i21 - 1] = i19;
                i22 += i21;
            }
            sArr = sArr;
            i20 = (int)Test.instanceCount;
            Test.instanceCount += (i19 - i19);
            i += (i19 - i);
            i += (i19 ^ i20);
            for (i23 = 4; 117 > i23; ++i23) {
                i = -8;
            }
            sFld <<= (short)i24;
            i25 = 1;
            do {
                iFld += (i25 ^ i22);
                f += i20;
                for (i26 = 1; i26 < 1; i26++) {
                    Test.iArrFld[i19] = (int)-1410592778424189079L;
                    sFld = (short)i27;
                }
                iFld <<= i23;
            } while (++i25 < 117);
        }
        i27 = (int)Test.instanceCount;
        for (f1 = 8; f1 < 359; f1++) {
            for (i29 = 3; i29 < 72; i29++) {
                i >>= i21;
                Test.iArrFld[(int)(f1 + 1)] = 4;
                i22 += -12;
                byFld += (byte)i29;
                if (Test.bFld) break;
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
