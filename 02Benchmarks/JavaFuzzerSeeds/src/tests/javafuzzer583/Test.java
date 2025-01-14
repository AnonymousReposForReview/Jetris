package tests.javafuzzer583;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 06:14:25 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=240L;
    public static float fFld=66.265F;
    public static volatile double dFld=95.58264;
    public int iFld=20121;

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static int iMeth(float f, int i) {


        i = (i = 105);
        long meth_res = Float.floatToIntBits(f) + i;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i3, long l) {

        int i4=-57649, i5=-2, i6=26, i7=-14, i8=41, i9=57037, iArr[]=new int[N];
        float f1=0.797F;
        boolean b=false;

        FuzzerUtils.init(iArr, -7);

        for (i4 = 1; i4 < 310; i4 += 2) {
            if (i4 != 0) {
                vMeth1_check_sum += i3 + l + i4 + i5 + i6 + i7 + Float.floatToIntBits(f1) + i8 + i9 + (b ? 1 : 0) +
                    FuzzerUtils.checkSum(iArr);
                return;
            }
            i3 += (i4 * i4);
            i3 = i4;
            for (i6 = 1; i6 < 10; i6++) {
                iArr[i4] = i4;
                switch (((i7 >>> 1) % 2) + 76) {
                case 76:
                    iArr[i6] = (int)l;
                    l += i6;
                    f1 -= i6;
                    try {
                        i5 = (i3 / i5);
                        i3 = (i4 % i5);
                        i7 = (i6 % -165);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 77:
                    f1 *= 25;
                    for (i8 = 1; i8 < 2; i8++) {
                        i3 = i4;
                        if (b) break;
                    }
                    break;
                default:
                    Test.instanceCount >>= i7;
                }
            }
        }
        vMeth1_check_sum += i3 + l + i4 + i5 + i6 + i7 + Float.floatToIntBits(f1) + i8 + i9 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i1) {

        int i2=9, i10=223, i11=-41366, i12=36, i13=-24605, iArr1[]=new int[N];
        double d=-2.116274;
        float fArr[]=new float[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(iArr1, 35058);
        FuzzerUtils.init(fArr, 0.883F);
        FuzzerUtils.init(byArr, (byte)-37);

        i2 = 1;
        while (++i2 < 384) {
            boolean b1=true;
            vMeth1(i1, Test.instanceCount);
            iArr1[i2 + 1] = i1;
            if (i2 != 0) {
                vMeth_check_sum += i1 + i2 + Double.doubleToLongBits(d) + i10 + i11 + i12 + i13 +
                    FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
                    FuzzerUtils.checkSum(byArr);
                return;
            }
            i1 += (i2 * i2);
            fArr[(i1 >>> 1) % N] = Test.instanceCount;
            d += 242;
            if (b1) {
                for (i10 = i2; 4 > i10; ++i10) {
                    i1 = i1;
                }
                for (i12 = 1; i12 < 4; i12++) {
                    i11 -= i12;
                    byArr[i12 - 1] -= (byte)i1;
                    i11 = i1;
                    fArr[i2] = i10;
                }
            } else if (true) {
                Test.instanceCount &= i2;
            }
        }
        vMeth_check_sum += i1 + i2 + Double.doubleToLongBits(d) + i10 + i11 + i12 + i13 + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(byArr);
    }

    public static int iMeth1() {

        int i14=-12, i15=875, i16=64804, i17=0, i18=-196, i20=-110, i21=3, iArr2[]=new int[N];
        float fArr1[][]=new float[N][N];

        FuzzerUtils.init(iArr2, 39043);
        FuzzerUtils.init(fArr1, -88.15F);

        vMeth(198);
        for (i14 = 15; i14 < 338; i14++) {
            Test.fFld -= Test.fFld;
            Test.instanceCount -= Test.instanceCount;
            for (i16 = i14; 5 > i16; ++i16) {
                iArr2[i14 - 1] >>>= i14;
                iArr2 = iArr2;
            }
            i18 = 1;
            do {
                fArr1[i14 + 1][i14 + 1] -= -7L;
                Test.instanceCount *= 2;
            } while (++i18 < 5);
            Test.instanceCount = -206;
            i17 += (i14 * i14);
            for (i20 = 5; i20 > 1; i20 -= 2) {
                i17 += i16;
                i21 = i16;
            }
        }
        long meth_res = i14 + i15 + i16 + i17 + i18 + i20 + i21 + FuzzerUtils.checkSum(iArr2) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i22=7, i23=15139, i24=245, i25=-64384, i26=-116, i27=2, i29=6, i30=-131, i31=-17207, iArr3[]=new int[N];
        short s=-13126;
        boolean b2=false;
        long l1=-54425L;

        FuzzerUtils.init(iArr3, -58878);

        iMeth(39.356F, -iMeth1());
        for (i22 = 308; i22 > 8; i22--) {
            switch ((i22 % 6) + 115) {
            case 115:
                Test.dFld += i23;
                i23 += (((i22 * s) + Test.instanceCount) - Test.fFld);
                b2 = b2;
                i23 += (i22 * i22);
                break;
            case 116:
                i23 %= (int)(i23 | 1);
                for (i24 = 3; i24 < 84; i24++) {
                    Test.fFld += (((i24 * i25) + Test.fFld) - Test.instanceCount);
                    Test.instanceCount = (long)Test.fFld;
                }
                if (b2) {
                    i25 += (((i22 * i22) + i23) - Test.instanceCount);
                    iArr3[i22] = i24;
                    i25 += (((i22 * Test.instanceCount) + Test.fFld) - Test.fFld);
                    i25 = i23;
                }
                break;
            case 117:
                switch ((i22 % 2) + 102) {
                case 102:
                    for (i26 = 2; i26 < 84; i26++) {
                        s >>= (short)i24;
                        i25 += (int)Test.instanceCount;
                    }
                    break;
                case 103:
                    i27 += iFld;
                }
                iFld += i22;
                iFld = i27;
                i25 = -99;
                break;
            case 118:
                i27 -= i25;
                for (l1 = 84; 4 < l1; l1--) {
                    i30 = 2;
                    while ((i30 -= 2) > 0) {
                        i31 *= i29;
                        i31 ^= i25;
                        i31 = i22;
                    }
                }
                break;
            case 119:
                i23 <<= -252;
                break;
            case 120:
                i27 %= (int)(i31 | 1);
            default:
                i23 -= (int)1.776F;
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
//DEBUG  iMeth1 ->  iMeth1 mainTest
//DEBUG  vMeth ->  vMeth iMeth1 mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth1 mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
