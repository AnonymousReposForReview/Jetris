package tests.javafuzzer1129;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 15:06:06 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3376465977L;
    public static boolean bFld=false;
    public static float fFld=0.880F;
    public short sFld=23928;
    public static double dFld=2.27387;
    public long lArrFld[]=new long[N];
    public int iArrFld[]=new int[N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.bArrFld, true);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i4, int i5) {

        double d1=-114.62008, d2=-2.74176;
        int i6=9, i7=29054, i8=3, i9=230, iArr1[]=new int[N];
        long l=-2101050357L;
        byte by1=61;
        boolean bArr[]=new boolean[N];
        float fArr[][]=new float[N][N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(iArr1, -24199);
        FuzzerUtils.init(fArr, -114.321F);

        Test.instanceCount += Test.instanceCount;
        d1 += Test.instanceCount;
        try {
            i5 >>>= i5;
            Test.instanceCount <<= Test.instanceCount;
        }
        catch (UserDefinedExceptionTest exc1) {
            for (d2 = 7; d2 < 151; ++d2) {
                boolean b1=true;
                if (b1) {
                    for (l = 1; 11 > l; ++l) {
                        if (i5 != 0) {
                        }
                    }
                    for (i8 = 11; i8 > 1; i8--) {
                        boolean b=false;
                        d1 = i8;
                        bArr[(int)(d2)] = b;
                        i5 = i5;
                        iArr1[i8] = by1;
                        i7 += (((i8 * i8) + i5) - i9);
                    }
                } else {
                    Test.instanceCount *= i5;
                }
            }
        }
        finally {
            fArr[(i6 >>> 1) % N][(i5 >>> 1) % N] -= 45.414F;
        }
        long meth_res = i4 + i5 + Double.doubleToLongBits(d1) + Double.doubleToLongBits(d2) + i6 + l + i7 + i8 + i9 +
            by1 + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i1, float f1) {

        int i2=-72, i3=-196, i10=34192, i11=-23278, i12=-25, i13=-46174, i14=-116, i15=-4, iArr2[]=new int[N];
        boolean b2=false;

        FuzzerUtils.init(iArr2, 44492);

        for (i2 = 5; 263 > i2; i2++) {
            i3 = (int)(Test.instanceCount -= iMeth1(-32, i1));
            iArr2[i2] <<= -112;
            Test.instanceCount -= i3;
            f1 -= 1.97F;
            i1 &= (int)Test.instanceCount;
            i3 = (int)f1;
        }
        for (i10 = 7; 220 > i10; i10++) {
            for (i12 = i10; i12 < 8; i12++) {
                if (b2) continue;
                i11 += (i12 - i13);
                i11 += i10;
                for (i14 = 1; i14 < 1; i14++) {
                    double d3=-2.41674;
                    Test.instanceCount /= ((long)(f1) | 1);
                    d3 += Test.instanceCount;
                }
            }
        }
        long meth_res = i1 + Float.floatToIntBits(f1) + i2 + i3 + i10 + i11 + i12 + i13 + (b2 ? 1 : 0) + i14 + i15 +
            FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(float f, int i) {

        byte by=-116;
        double d=0.46355;
        int i16=-54807, i17=14, i18=4, iArr[]=new int[N];
        float fArr1[]=new float[N];

        FuzzerUtils.init(iArr, 160);
        FuzzerUtils.init(fArr1, 0.601F);

        i -= (i - i);
        iArr[(i >>> 1) % N] -= (int)(i - ((by * d) + (i = 4)));
        iMeth(i, f);
        i = (int)Test.instanceCount;
        Test.instanceCount *= Test.instanceCount;
        if (Test.bFld) {
            iArr[(i >>> 1) % N] = (int)f;
            i16 = 223;
            do {
                i = i16;
                i |= (int)Test.instanceCount;
                Test.instanceCount -= i16;
                fArr1[i16 + 1] += (float)d;
            } while (--i16 > 0);
        } else if (Test.bFld) {
            for (i17 = 15; i17 < 338; i17++) {
                if (i18 != 0) {
                    vMeth_check_sum += Float.floatToIntBits(f) + i + by + Double.doubleToLongBits(d) + i16 + i17 + i18
                        + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
                    return;
                }
                i -= (int)-54.163F;
            }
        } else if (Test.bFld) {
            Test.instanceCount += by;
        } else {
            Test.instanceCount += Test.instanceCount;
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i + by + Double.doubleToLongBits(d) + i16 + i17 + i18 +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public void mainTest(String[] strArr1) {

        int i19=-37515, i20=151, i21=5, i22=223, i23=-3455, i24=-19533, i25=-12433;
        long l1=-325109973L;
        byte by2=-14;

        vMeth(Test.fFld, i19);
        lArrFld[(i19 >>> 1) % N] = i19;
        for (i20 = 228; i20 > 11; --i20) {
            for (l1 = 4; l1 < 116; l1++) {
                sFld += (short)i20;
                i21 += (int)(l1 * l1);
                Test.fFld -= i19;
                Test.instanceCount = i23;
                lArrFld[(int)(l1)] = i20;
                for (i24 = i20; i24 < 2; i24++) {
                    iArrFld[(int)(l1 - 1)] = by2;
                    i21 += (i24 + i24);
                    Test.dFld = i20;
                    Test.dFld -= Test.dFld;
                    i19 *= i20;
                    i23 &= i19;
                    switch ((int)((l1 % 7) + 59)) {
                    case 59:
                        switch (((i19 >>> 1) % 1) + 56) {
                        case 56:
                            i19 = -167;
                            break;
                        default:
                            Test.bArrFld[i20 + 1] = true;
                        }
                        i23 = (int)l1;
                    case 60:
                        switch ((int)(((l1 % 1) * 5) + 71)) {
                        case 72:
                            switch ((i24 % 4) + 55) {
                            case 55:
                                Test.instanceCount -= 26930;
                                Test.fFld -= Test.fFld;
                                Test.fFld = -11572;
                                break;
                            case 56:
                                i22 = -12;
                                Test.dFld = i22;
                                break;
                            case 57:
                                i22 -= i21;
                                i19 += i24;
                                break;
                            case 58:
                                Test.instanceCount %= ((long)(Test.dFld) | 1);
                                break;
                            default:
                                i25 = 128;
                            }
                            break;
                        }
                        break;
                    case 61:
                        i22 -= i21;
                        break;
                    case 62:
                        i25 += (((i24 * Test.fFld) + Test.instanceCount) - i24);
                        break;
                    case 63:
                        i22 -= i19;
                        break;
                    case 64:
                        i25 *= (int)Test.dFld;
                    case 65:
                        Test.instanceCount >>= Test.instanceCount;
                        break;
                    default:
                        Test.instanceCount += (((i24 * i25) + i19) - i21);
                    }
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
class UserDefinedExceptionTest extends RuntimeException {
    public int field;
}

//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
