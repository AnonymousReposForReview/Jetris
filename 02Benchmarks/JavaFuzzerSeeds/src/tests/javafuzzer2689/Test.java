package tests.javafuzzer2689;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 18:46:46 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-220058998L;
    public static short sFld=-27049;
    public static volatile byte byFld=13;
    public int iFld=54815;
    public static float fFld=-2.191F;
    public static float fArrFld[]=new float[N];
    public byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 2.190F);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(short s) {

        int i7=43779, i8=154, i9=51696, i10=-54029, iArr1[]=new int[N];
        double d1=47.105815, d2=53.33065;
        float f1=-13.673F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -1302233865L);
        FuzzerUtils.init(iArr1, 136);

        for (i7 = 5; i7 < 327; i7++) {
            lArr[i7] -= Test.instanceCount;
            i8 >>>= i8;
            Test.instanceCount = i8;
            d1 = Test.instanceCount;
            d1 += Test.instanceCount;
            i8 += (((i7 * s) + f1) - Test.instanceCount);
            f1 += (6630 + (i7 * i7));
            Test.instanceCount *= 190;
            f1 += Test.instanceCount;
            i8 *= (int)f1;
        }
        for (i9 = 278; i9 > 14; --i9) {
            d2 = 1;
            while (++d2 < 6) {
                iArr1[(int)(d2 + 1)] = -3;
            }
            iArr1[i9] = i7;
        }
        long meth_res = s + i7 + i8 + Double.doubleToLongBits(d1) + Float.floatToIntBits(f1) + i9 + i10 +
            Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth(int i1, int i2, float f) {

        int i3=-21486, i4=35623, i5=-13, i6=0, i11=41778, i12=-13, i13=58604, iArr[]=new int[N];
        double d=-71.90203, d3=0.80141;
        boolean b=true, bArr[]=new boolean[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(iArr, -230);
        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(byArr, (byte)-3);

        for (i3 = 4; i3 < 121; i3++) {
            switch ((((i3 * i2) >>> 1) % 7) + 21) {
            case 21:
                i5 = 1;
                do {
                    iArr[i3] = (int)((Math.max(i3, i6) + (i6 -= (int)-187L)) + ((++Test.instanceCount) /
                        (((long)(-76.841F - (19996 - (i2--)))) | 1)));
                } while (++i5 < 13);
                break;
            case 22:
                i1 += (i3 | (long)f);
                d = ((i2--) - (d + lMeth(Test.sFld)));
                break;
            case 23:
                Test.fArrFld[i3 + 1] = Test.instanceCount;
                d3 = Test.instanceCount;
                f -= i6;
                i11 *= i11;
                break;
            case 24:
                for (i12 = 13; i12 > 1; i12 -= 3) {
                    i11 = i12;
                    bArr[i12 - 1] = true;
                    i11 -= 36;
                    b = false;
                }
                break;
            case 25:
                i2 += (((i3 * Test.sFld) + Test.instanceCount) - i13);
            case 26:
                byArr[i3] -= (byte)f;
                break;
            case 27:
                i6 += i1;
                break;
            default:
                bArr[i3 - 1] = b;
            }
        }
        long meth_res = i1 + i2 + Float.floatToIntBits(f) + i3 + i4 + i5 + i6 + Double.doubleToLongBits(d) +
            Double.doubleToLongBits(d3) + i11 + i12 + i13 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(byArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i) {

        int i14=-24, i15=-48365, i16=-172, i17=-22, i18=-60588, i19=26623, i20=23672, iArr2[]=new int[N];
        double d4=-2.19926;
        long l=-610150491253738127L;

        FuzzerUtils.init(iArr2, 62516);

        i += iMeth(i, i, -1.961F);
        for (i14 = 5; i14 < 352; i14++) {
            i15 *= i14;
            i15 += (i14 ^ i14);
        }
        for (d4 = 10; d4 < 278; d4++) {
            for (i17 = 1; i17 < 6; i17++) {
                i16 = Test.sFld;
                if (i16 != 0) {
                    vMeth_check_sum += i + i14 + i15 + Double.doubleToLongBits(d4) + i16 + i17 + i18 + i19 + i20 + l +
                        FuzzerUtils.checkSum(iArr2);
                    return;
                }
                for (i19 = 1; i19 < 2; ++i19) {
                    i *= i19;
                    i18 <<= (int)l;
                    switch ((i19 % 2) + 54) {
                    case 54:
                        Test.byFld >>>= (byte)i16;
                        iArr2[(int)(d4 - 1)] -= 127;
                        i16 += (i19 * i19);
                        break;
                    case 55:
                        i20 = (int)d4;
                        break;
                    }
                }
            }
        }
        vMeth_check_sum += i + i14 + i15 + Double.doubleToLongBits(d4) + i16 + i17 + i18 + i19 + i20 + l +
            FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i21=243, i22=-45213, i23=6, i24=85, i25=10, i26=1, iArr3[]=new int[N];
        float f2=91.177F;
        double d5=0.12037;

        FuzzerUtils.init(iArr3, -72);

        vMeth(iFld);
        for (i21 = 319; 18 < i21; i21--) {
            for (i23 = 3; i23 < 84; ++i23) {
                iFld = (int)528L;
                byArrFld[i21] = (byte)iFld;
                i24 = (int)Test.fFld;
                try {
                    iArr3[i23 + 1] = (iArr3[i21 - 1] / -1326375561);
                    i22 = (123 % i21);
                    i22 = (iArr3[i21 + 1] % -54270);
                } catch (ArithmeticException a_e) {}
            }
            i22 += i22;
            Test.fFld -= 22807;
            Test.fFld -= i21;
            i24 *= iFld;
            Test.fFld = Test.instanceCount;
            f2 = 1;
            do {
                iFld += (int)f2;
                Test.instanceCount += (long)((long)f2 | iFld);
                Test.instanceCount += 229;
                i22 += iFld;
                iFld = (int)Test.instanceCount;
                i24 += (int)((long)f2 ^ (long)Test.fFld);
            } while (++f2 < 84);
            d5 = 1;
            while (++d5 < 84) {
                iFld += i22;
                for (i25 = 1; i25 < 1; i25++) {
                    Test.fFld = iFld;
                    i24 = Test.sFld;
                    Test.instanceCount += i25;
                    i24 += i25;
                    i22 ^= (int)Test.instanceCount;
                    byArrFld[i25] = (byte)-6419L;
                    iFld += (int)Test.instanceCount;
                    i24 -= (int)86.56134;
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  lMeth ->  lMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
