package tests.javafuzzer180;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 23:25:26 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-44L;
    public static short sFld=-7801;
    public int iFld=92;
    public boolean bFld=true;
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 0.423F);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i4, long l1, long l2) {

        int i5=14, i6=-859, i7=-12, i8=-1, i9=-7;
        double d=2.77765;
        float f1=121.999F, fArr[]=new float[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -4630308362876403313L);
        FuzzerUtils.init(fArr, 1.372F);

        for (i5 = 22; i5 < 382; i5 += 3) {
            i4 ^= i6;
            for (i7 = i5; 13 > i7; ++i7) {
                if (i4 != 0) {
                    vMeth1_check_sum += i4 + l1 + l2 + i5 + i6 + i7 + i8 + i9 + Double.doubleToLongBits(d) +
                        Float.floatToIntBits(f1) + FuzzerUtils.checkSum(lArr) +
                        Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                    return;
                }
                i8 = -14;
                i4 = i4;
                i4 -= 88;
                i9 -= (int)l1;
                l2 = i9;
                d %= -2.56376;
                i6 -= i4;
                i8 |= i8;
            }
            lArr[i5] *= i4;
            fArr[i5] = f1;
            d *= 4L;
        }
        vMeth1_check_sum += i4 + l1 + l2 + i5 + i6 + i7 + i8 + i9 + Double.doubleToLongBits(d) +
            Float.floatToIntBits(f1) + FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(int i2, int i3) {

        int i10=16147, i11=138, i12=-13497, i13=48195, iArr[]=new int[N];
        float f2=-1.1012F, fArr1[]=new float[N];
        short s=6302;
        boolean b=false, bArr[][]=new boolean[N][N];

        FuzzerUtils.init(iArr, -63937);
        FuzzerUtils.init(fArr1, 87.666F);
        FuzzerUtils.init(bArr, false);

        vMeth1(i2, Test.instanceCount, Test.instanceCount);
        iArr[(i2 >>> 1) % N] <<= i3;
        if (b) {
            for (i10 = 9; i10 < 245; ++i10) {
                f2 += (i10 * i10);
                i11 += (((i10 * i2) + Test.instanceCount) - f2);
                switch ((i10 % 7) + 59) {
                case 59:
                    f2 = f2;
                    i11 = -136;
                    for (i12 = 1; i12 < 7; i12++) {
                        Test.instanceCount |= 33757;
                    }
                    break;
                case 60:
                    switch (((i3 >>> 1) % 2) + 86) {
                    case 86:
                        i3 -= (int)f2;
                        s >>= (short)i3;
                        fArr1[i10 + 1] -= i10;
                        break;
                    case 87:
                        i2 = (int)Test.instanceCount;
                        break;
                    }
                    break;
                case 61:
                    i11 = 0;
                    break;
                case 62:
                    i2 += i12;
                    break;
                case 63:
                    bArr[i10 + 1][i10] = b;
                    break;
                case 64:
                    f2 += (i10 * i10);
                case 65:
                    i3 &= i2;
                    break;
                }
            }
        } else if (b) {
            iArr[(i11 >>> 1) % N] <<= i2;
        } else if (true) {
            i3 = i12;
        } else {
            i3 = 57383;
        }
        vMeth_check_sum += i2 + i3 + i10 + i11 + Float.floatToIntBits(f2) + i12 + i13 + s + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) +
            FuzzerUtils.checkSum(bArr);
    }

    public static int iMeth(int i1, float f, long l) {

        int i14=3, i15=43214, i16=14, i17=-13, i18=14;
        double d1=1.34613;
        boolean b1=false;
        byte by=-111;

        i1 += i1;
        vMeth(i1, -9);
        i1 >>= 24;
        for (i14 = 10; i14 < 220; ++i14) {
            i1 = i14;
            for (d1 = 1; d1 < 8; d1++) {
                Test.instanceCount += (long)(((d1 * l) + i16) - i14);
                switch ((int)((d1 % 8) + 11)) {
                case 11:
                case 12:
                    b1 = b1;
                    f = f;
                    break;
                case 13:
                    by = (byte)i1;
                    i16 += (int)d1;
                    break;
                case 14:
                    for (i17 = 1; i17 < 2; ++i17) {
                        i16 -= i17;
                        if (true) break;
                    }
                    break;
                case 15:
                    i1 *= (int)218L;
                case 16:
                    i1 = 212;
                    break;
                case 17:
                    i18 <<= i17;
                case 18:
                    Test.instanceCount += 188;
                default:
                    f += i17;
                }
            }
        }
        long meth_res = i1 + Float.floatToIntBits(f) + l + i14 + i15 + Double.doubleToLongBits(d1) + i16 + (b1 ? 1 : 0)
            + by + i17 + i18;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=0, i19=-56627, i20=-12, i21=1, i22=-14, i23=0, i24=-53986, iArr1[]=new int[N];
        float f3=113.90F;
        double d3=0.1883;
        long lArr1[]=new long[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(iArr1, -11);
        FuzzerUtils.init(lArr1, -1565535016L);
        FuzzerUtils.init(byArr, (byte)75);

        Test.instanceCount -= (i + iMeth(i, f3, 39581L));
        i -= i;
        iArr1[(i >>> 1) % N] -= i;
        lArr1[(47420 >>> 1) % N] = (long)1.93F;
        i19 = 1;
        while (++i19 < 290) {
            double d2=22.31724;
            Test.instanceCount = Test.instanceCount;
            Test.sFld = (short)d2;
            i *= 4;
        }
        Test.instanceCount = i19;
        Test.sFld |= (short)i19;
        i -= (int)f3;
        i = (int)f3;
        i20 = 1;
        while (++i20 < 173) {
            i += (((i20 * i20) + i19) - f3);
            iFld >>= i19;
            iFld = -54654;
            for (i21 = 3; 145 > i21; i21++) {
                i &= i22;
                switch ((i21 % 2) + 100) {
                case 100:
                    i23 -= iFld;
                    iFld += i23;
                    switch ((i20 % 8) * 5) {
                    case 21:
                        for (d3 = 2; 1 < d3; d3--) {
                            bFld = bFld;
                            f3 += (float)d3;
                            i -= (int)-1.394F;
                            i22 += -1;
                            iFld <<= i24;
                            Test.instanceCount += (long)(((d3 * i) + i22) - i23);
                            Test.fArrFld[(int)(d3 + 1)] *= 80;
                        }
                        break;
                    case 38:
                        byArr[i21 + 1] >>= (byte)i23;
                        break;
                    case 28:
                        Test.instanceCount = -106;
                        break;
                    case 36:
                        iFld <<= i22;
                    case 29:
                        if (bFld) continue;
                    case 30:
                        i = i23;
                        break;
                    case 37:
                        Test.instanceCount >>= i22;
                    case 4:
                        Test.instanceCount += (i21 * Test.instanceCount);
                    }
                case 101:
                    i += (i21 * i21);
                    break;
                default:
                    i = Test.sFld;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}