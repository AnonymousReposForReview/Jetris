package tests.javafuzzer3368;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 06:45:46 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=14963L;
    public static short sFld=-19618;
    public static byte byFld=-88;
    public volatile float fFld=0.814F;
    public boolean bFld=true;
    public static volatile int iArrFld[]=new int[N];
    public float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 0);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vSmallMeth(int i) {

        double d=70.123723;
        int iArr[]=new int[N];

        FuzzerUtils.init(iArr, 8446);

        i -= (int)(++d);
        iArr[(i >>> 1) % N] *= i;
        vSmallMeth_check_sum += i + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(float f, short s, int i5) {

        boolean b=false;
        int i6=3847, i7=2, i9=123, i10=-21478, i11=40271;
        long l2=23L;
        double d1=-1.64018;
        byte by1=-117;

        try {
            i5 = (int)Test.instanceCount;
            b = b;
        }
        catch (NullPointerException exc1) {
            for (i6 = 7; i6 < 340; i6++) {
                if (b) {
                    Test.instanceCount = i6;
                } else if (b) {
                    Test.iArrFld = Test.iArrFld;
                    i7 -= (int)Test.instanceCount;
                    for (l2 = i6; l2 < 5; ++l2) {
                        for (i10 = 1; 1 > i10; i10++) {
                            i7 %= (int)((long)(d1) | 1);
                            Test.instanceCount = -8;
                            i9 += i10;
                            if (true) continue;
                            by1 += (byte)(((i10 * i7) + f) - i10);
                        }
                    }
                } else if (b) {
                    i11 *= i6;
                    vMeth_check_sum += Float.floatToIntBits(f) + s + i5 + (b ? 1 : 0) + i6 + i7 + l2 + i9 + i10 + i11 +
                        Double.doubleToLongBits(d1) + by1;
                    return;
                } else {
                    i11 += i6;
                }
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + s + i5 + (b ? 1 : 0) + i6 + i7 + l2 + i9 + i10 + i11 +
            Double.doubleToLongBits(d1) + by1;
    }

    public static int iMeth1(long l1) {

        float f1=0.113F;
        int i12=-24330, i13=186, i14=-105, i15=48897, i16=-4, i17=36629, i18=-188;
        byte by2=21;
        boolean b1=false, bArr[]=new boolean[N];
        double d2=68.87692;

        FuzzerUtils.init(bArr, true);

        vMeth(f1, Test.sFld, i12);
        for (i13 = 17; 386 > i13; i13++) {
            Test.iArrFld[i13 - 1] >>>= 11;
            by2 -= (byte)l1;
            Test.iArrFld[i13] = Test.sFld;
            for (i15 = i13; 5 > i15; i15++) {
                l1 >>= -26917L;
                b1 = true;
                switch (((i13 % 3) * 5) + 45) {
                case 52:
                    for (i17 = i13; i17 < 1; i17++) {
                        i16 = (int)l1;
                        i12 += i16;
                    }
                    break;
                case 51:
                    f1 -= i16;
                    d2 -= l1;
                    bArr[i13] = b1;
                    break;
                case 58:
                    Test.iArrFld[i13 + 1] /= (int)(Test.instanceCount | 1);
                default:
                    i16 += i15;
                }
            }
        }
        long meth_res = l1 + Float.floatToIntBits(f1) + i12 + i13 + i14 + by2 + i15 + i16 + (b1 ? 1 : 0) + i17 + i18 +
            Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(bArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(long l, byte by) {

        int i2=42601, i3=-36925, i4=-9, i19=49464, i20=-208, i21=67, i22=24939;
        float f2=118.818F;

        i2 += (int)(Test.instanceCount -= (by--));
        for (i3 = 18; 369 > i3; ++i3) {
            vSmallMeth((int)(iMeth1(l) - -253081603L));
            for (i19 = 1; i19 < 5; ++i19) {
                boolean b2=false;
                Test.iArrFld[i3 - 1] *= i2;
                i4 = -32750;
                for (i21 = 1; i21 < 2; ++i21) {
                    i22 += (((i21 * f2) + i4) - f2);
                    i2 ^= i4;
                    Test.instanceCount += (i21 - f2);
                    by += (byte)i21;
                    f2 = i21;
                }
                f2 -= l;
                if (b2) continue;
                i4 = (int)f2;
            }
        }
        long meth_res = l + by + i2 + i3 + i4 + i19 + i20 + i21 + i22 + Float.floatToIntBits(f2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i1=-3, i23=-65345, i24=18010, i25=0, i26=84, i27=-58627, i28=-39941, i29=158, i30=154;
        double dArr[]=new double[N];
        boolean bArr1[][]=new boolean[N][N];

        FuzzerUtils.init(dArr, 0.81716);
        FuzzerUtils.init(bArr1, true);

        for (int smallinvoc=0; smallinvoc<519; smallinvoc++) vSmallMeth(i1);
        i1 = (int)(((i1 - i1) - iMeth(Test.instanceCount, Test.byFld)) + 57.273F);
        i1 >>>= 24856;
        if (bFld) {
            for (i23 = 8; i23 < 130; ++i23) {
                Test.instanceCount += (i23 + Test.instanceCount);
                dArr[i23 + 1] = i1;
                for (i25 = 12; 205 > i25; ++i25) {
                    fFld += i25;
                    for (i27 = 1; i27 < 2; i27++) {
                        fArrFld[i27 + 1] *= 45;
                    }
                    if (bFld) {
                        fFld -= i26;
                    } else {
                        i28 += (((i25 * Test.instanceCount) + fFld) - i23);
                    }
                    if (bFld) break;
                    if (bFld) continue;
                    for (i29 = 1; i29 < 2; ++i29) {
                        i28 += i29;
                        Test.iArrFld[i23] = 0;
                        i28 = (int)fFld;
                        Test.iArrFld[i23 + 1] += (int)-106L;
                        Test.instanceCount = i24;
                        if (bFld) break;
                        i26 = i27;
                        Test.iArrFld[i23] += i23;
                        switch ((((-27 >>> 1) % 2) * 5) + 108) {
                        case 110:
                            switch ((((i25 >>> 1) % 2) * 5) + 81) {
                            case 88:
                                if (bFld) {
                                    i1 += (i29 - Test.instanceCount);
                                } else if (bFld) {
                                    i30 *= (int)-1.24450;
                                }
                                break;
                            case 90:
                                Test.instanceCount += i23;
                                break;
                            default:
                                bArr1[i23 + 1][i23] = bFld;
                            }
                        case 109:
                            i28 -= 11;
                            break;
                        }
                    }
                }
            }
        } else {
            fFld += i29;
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test iMeth
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
