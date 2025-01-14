package tests.javafuzzer142;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 23:01:54 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-17146L;
    public static short sFld=-8587;
    public static float fFld=1.194F;
    public static byte byFld=-102;
    public static double dFld=2.24548;
    public static double dFld1=33.23780;
    public static boolean bFld=true;
    public static int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];
    public float fArrFld[]=new float[N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -1);
        FuzzerUtils.init(Test.dArrFld, 1.50527);
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i5=4, i6=-64227, i7=-1, i8=-12, i9=-32151, i10=-250, iArr1[]=new int[N];
        double d1=90.103951;
        byte byArr[]=new byte[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(byArr, (byte)12);
        FuzzerUtils.init(fArr, -29.95F);
        FuzzerUtils.init(iArr1, 46463);

        i5 = i5;
        for (i6 = 9; i6 < 183; i6++) {
            i7 += (((i6 * i7) + i6) - Test.instanceCount);
            byArr = byArr;
            i7 *= i6;
            Test.instanceCount += (((i6 * Test.sFld) + i7) - i7);
            Test.fFld += 45361L;
        }
        for (i8 = 311; i8 > 10; --i8) {
            Test.byFld = (byte)5021401037051364015L;
            for (d1 = 1; d1 < 5; ++d1) {
                Test.byFld = (byte)i6;
                switch ((int)(((d1 % 8) * 5) + 2)) {
                case 38:
                    fArr[(int)(d1 - 1)] -= i6;
                    i5 += (220 + (d1 * d1));
                    break;
                case 40:
                    Test.sFld += (short)(((d1 * i9) + i9) - i5);
                case 30:
                    i7 -= 11;
                case 11:
                    i7 >>>= (int)-11L;
                    break;
                case 12:
                    Test.sFld -= (short)14500;
                    break;
                case 29:
                    i10 = i6;
                case 6:
                    i7 = (int)Test.instanceCount;
                    break;
                case 34:
                    iArr1[(int)(d1 + 1)] >>= i5;
                    break;
                }
            }
        }
        vMeth2_check_sum += i5 + i6 + i7 + i8 + i9 + Double.doubleToLongBits(d1) + i10 + FuzzerUtils.checkSum(byArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth1(byte by, double d, int i1) {

        long l=18997L, lArr1[]=new long[N];
        int i2=-219, i3=-48637, i4=114, i11=-140, iArr2[]=new int[N];
        boolean b=false;

        FuzzerUtils.init(iArr2, 18297);
        FuzzerUtils.init(lArr1, 64368L);

        for (l = 7; l < 271; l++) {
            i2 = (int)(by * ((l + i2) - i1));
            i1 += i1;
        }
        for (i3 = 3; i3 < 147; i3++) {
            vMeth2();
            i2 |= i2;
            i11 = 11;
            do {
                if (b) continue;
                Test.fFld += (((i11 * i3) + i1) - Test.fFld);
                i2 *= (int)l;
                iArr2[i3 + 1] >>= i1;
                i2 = (int)Test.instanceCount;
                iArr2[i11 + 1] *= (int)l;
                lArr1[i11 + 1] += (long)1.111858;
                b = b;
            } while (--i11 > 0);
        }
        vMeth1_check_sum += by + Double.doubleToLongBits(d) + i1 + l + i2 + i3 + i4 + i11 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(lArr1);
    }

    public static void vMeth() {

        int i12=250, i13=6, i14=-9;
        double d2=-2.24334;
        float f=-1.163F;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)6713);

        vMeth1((byte)(-69), Test.dFld, i12);
        try {
            d2 = 1;
            while (++d2 < 149) {
                for (i13 = 1; i13 < (11 + 400); ++i13) {
                    i12 += (i13 + Test.instanceCount);
                    i12 = -8979;
                    sArr[i13 - 1] = (short)i12;
                }
                Test.instanceCount += i12;
                switch ((int)(((d2 % 10) * 5) + 23)) {
                case 31:
                    i14 &= i13;
                    i14 = (int)-67L;
                    try {
                        i14 = (i13 / 219);
                        i14 = (i13 % i14);
                        i14 = (-270 / Test.iArrFld[(int)(d2 - 1)]);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 69:
                    i12 = (int)Test.instanceCount;
                    Test.fFld -= (float)Test.dFld1;
                    sArr[(int)(d2)] = (short)i14;
                case 40:
                    i12 >>= i12;
                    break;
                case 44:
                    i12 += (int)f;
                    break;
                case 30:
                    i14 -= (int)f;
                    break;
                case 29:
                    if (Test.bFld) break;
                    break;
                case 57:
                    i14 -= 13;
                    break;
                case 39:
                    i14 = i12;
                    break;
                case 52:
                    Test.dArrFld[(int)(d2)] -= Test.fFld;
                    break;
                case 32:
                    Test.instanceCount >>>= i12;
                    break;
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException exc1) {
            Test.dFld1 = Test.instanceCount;
        }
        vMeth_check_sum += i12 + Double.doubleToLongBits(d2) + i13 + i14 + Float.floatToIntBits(f) +
            FuzzerUtils.checkSum(sArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-2, i16=17744, i17=-226, i18=4, i19=189, i20=1654, i21=-170, i22=-158, iArr[]=new int[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 30);
        FuzzerUtils.init(lArr, 1332845662L);

        iArr = iArr;
        Test.instanceCount &= (-(lArr[(i >>> 1) % N]++));
        vMeth();
        i16 &= i16;
        i = i16;
        i = i;
        Test.sFld = (short)i;
        for (i17 = 211; i17 > 6; i17--) {
            i16 = i16;
            i18 += (i17 - Test.fFld);
            Test.instanceCount *= i17;
            i19 = 1;
            do {
                switch ((i19 % 3) + 104) {
                case 104:
                    i += (i19 * i16);
                    for (i20 = 1; i20 < 1; i20 += 2) {
                        fArrFld[i17 + 1] += i;
                        Test.instanceCount <<= i22;
                        if (Test.bFld) {
                            i += i19;
                            Test.instanceCount = i19;
                            i21 <<= i21;
                        }
                        Test.instanceCount += i18;
                        i18 += i22;
                        switch ((((i16 >>> 1) % 3) * 5) + 48) {
                        case 54:
                            lArr[i17 - 1] = i21;
                            i += (i20 * i20);
                        case 49:
                            i22 >>= Test.sFld;
                            i21 |= i17;
                            Test.bArrFld[i20] = false;
                            break;
                        case 52:
                            i16 *= i20;
                            break;
                        }
                    }
                    break;
                case 105:
                    Test.instanceCount = Test.instanceCount;
                    break;
                case 106:
                    Test.instanceCount = Test.instanceCount;
                    break;
                }
            } while (++i19 < 122);
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
