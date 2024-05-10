package tests.javafuzzer1805;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 03:32:09 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=4123020679L;
    public static float fFld=-2.411F;
    public static byte byFld=16;
    public static volatile byte byFld1=-102;
    public double dFld=-2.68099;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 2);
    }

    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(boolean b, int i9, int i10) {

        int i11=-184, i12=50, i13=238, i14=224, i15=-38540;
        double d1=-14.7830;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 11L);

        Test.fFld -= i10;
        for (i11 = 3; i11 < 251; ++i11) {
            short s1=-16240;
            Test.byFld += (byte)(((i11 * Test.instanceCount) + i11) - i11);
            switch ((((i9 >>> 1) % 7) * 5) + 30) {
            case 48:
                Test.instanceCount += i11;
                lArr[i11 - 1] <<= i9;
                Test.iArrFld[i11] /= (int)(Test.instanceCount | 1);
                i9 += (((i11 * i9) + i12) - i9);
                break;
            case 38:
                for (d1 = i11; d1 < 7; d1++) {
                    for (i14 = 1; 1 > i14; i14 += 2) {
                        Test.instanceCount = Test.instanceCount;
                        if (b) break;
                        i10 = i10;
                        if (b) continue;
                        i10 = (int)Test.instanceCount;
                    }
                }
                break;
            case 51:
                i12 = (int)2.745F;
                break;
            case 53:
                i15 += (((i11 * Test.instanceCount) + i14) - i10);
            case 60:
                i12 += i11;
                break;
            case 34:
                i13 >>= s1;
                break;
            case 35:
                i10 -= -31;
                break;
            default:
                Test.instanceCount = Test.instanceCount;
            }
        }
        vMeth1_check_sum += (b ? 1 : 0) + i9 + i10 + i11 + i12 + Double.doubleToLongBits(d1) + i13 + i14 + i15 +
            FuzzerUtils.checkSum(lArr);
    }

    public static float fMeth(int i7, int i8) {

        int i16=45061, i17=29002, i18=186, i19=10;
        double d2=54.50189;
        boolean b1=true;
        float fArr[]=new float[N];
        byte byArr[][]=new byte[N][N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(fArr, 2.280F);
        FuzzerUtils.init(byArr, (byte)84);
        FuzzerUtils.init(lArr1, -2067111361L);

        vMeth1(true, i8, i7);
        i7 >>= i7;
        for (i16 = 10; i16 < 271; ++i16) {
            d2 = Test.fFld;
            i17 <<= -11;
            fArr[i16 + 1] += Test.instanceCount;
            byArr[i16] = byArr[i16];
            d2 += 5;
            i7 -= (int)Test.instanceCount;
            for (i18 = 1; i18 < 6; i18++) {
                if (b1) continue;
                i7 = i7;
                lArr1[i16] = i7;
                if (false) break;
                i8 /= (int)(Test.byFld | 1);
            }
        }
        long meth_res = i7 + i8 + i16 + i17 + Double.doubleToLongBits(d2) + i18 + i19 + (b1 ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(byArr) +
            FuzzerUtils.checkSum(lArr1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth(int i) {

        int i1=43120, i2=2, i3=9, i4=4, i5=-3, i6=-57769, iArr[]=new int[N];
        double d=-1.61568;
        short s=21899;

        FuzzerUtils.init(iArr, -7);

        for (i1 = 4; i1 < 127; i1 += 3) {
            d = 37;
            while ((d -= 2) > 0) {
                s = (short)(iArr[i1 + 1] + i);
                iArr[i1 + 1] = (++i2);
            }
            for (i3 = 2; 37 > i3; i3++) {
                s = (short)(-(++i4));
                for (i5 = 1; 2 > i5; i5++) {
                    if (i5 != 0) {
                        vMeth_check_sum += i + i1 + i2 + Double.doubleToLongBits(d) + s + i3 + i4 + i5 + i6 +
                            FuzzerUtils.checkSum(iArr);
                        return;
                    }
                    Test.fFld -= (i3 * ((-106 * (Test.byFld + -13)) + (i++)));
                    i4 = iArr[i5];
                    iArr[i3] -= (int)(Test.fFld--);
                    Test.byFld -= (byte)fMeth(i5, i4);
                    Test.instanceCount += Test.byFld;
                    s = (short)d;
                }
                i2 += (i3 ^ i2);
            }
        }
        vMeth_check_sum += i + i1 + i2 + Double.doubleToLongBits(d) + s + i3 + i4 + i5 + i6 +
            FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i20=52566, i21=7, i22=13310, i23=33089, i24=43317, i25=27327, i26=140, i27=-35477, i28=112, i29=-168,
            i31=-144, i32=-6;
        boolean b2=true;
        float f=55.950F;
        long lArr2[][]=new long[N][N];

        FuzzerUtils.init(lArr2, 26815L);

        vMeth(i20);
        b2 = false;
        i20 &= i20;
        for (i21 = 206; i21 > 7; i21 -= 3) {
            Test.byFld >>= Test.byFld1;
            Test.fFld -= Test.instanceCount;
            for (i23 = i21; i23 < 379; i23++) {
                i20 = i22;
                for (i25 = 1; i25 > 1; --i25) {
                    i27 *= (int)225L;
                    i27 += (i25 * i25);
                    Test.instanceCount = i25;
                }
                Test.instanceCount = i23;
                lArr2[i23][i21 - 1] >>= i20;
                for (i28 = 1; i28 < 1; i28++) {
                    int i30=253;
                    i29 = -194;
                    Test.instanceCount = i26;
                    i20 += (i28 * Test.instanceCount);
                    i27 >>= -52568;
                    Test.fFld *= i23;
                    i22 >>= i25;
                    b2 = b2;
                    Test.iArrFld[i23 + 1] = i27;
                    switch ((i28 % 2) + 68) {
                    case 68:
                    case 69:
                        i30 += (i28 - i29);
                        Test.iArrFld[i23 - 1] += (int)Test.instanceCount;
                        i30 += (i28 * i28);
                        break;
                    }
                }
            }
            for (f = 8; 379 > f; ++f) {
                Test.iArrFld[i21] = (int)dFld;
                i32 = i21;
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
//DEBUG  fMeth ->  fMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 fMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}