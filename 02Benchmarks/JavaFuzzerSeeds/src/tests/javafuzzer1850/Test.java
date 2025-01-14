package tests.javafuzzer1850;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 04:27:25 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-4161857538L;
    public static double dFld=-1.129825;
    public short sFld=-18195;
    public float fFld=1.300F;
    public byte byFld=87;
    public static float fArrFld[]=new float[N];
    public static volatile long lArrFld[][]=new long[N][N];
    public static double dArrFld[]=new double[N];
    public static int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.fArrFld, -34.247F);
        FuzzerUtils.init(Test.lArrFld, 2683480374L);
        FuzzerUtils.init(Test.dArrFld, 2.88222);
        FuzzerUtils.init(Test.iArrFld, 4);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long byMeth_check_sum = 0;

    public static byte byMeth(float f3, byte by1, int i13) {

        int i14=7, i15=-192, i16=-42880, i18=-7, i19=-50023, iArr2[]=new int[N];
        boolean b1=false;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-3588);
        FuzzerUtils.init(iArr2, 241);

        for (i14 = 5; i14 < 164; ++i14) {
            i13 += i14;
            Test.instanceCount = i14;
            i16 -= i15;
            i13 = by1;
            if (b1) break;
            if (i16 != 0) {
            }
            Test.dFld = i14;
        }
        sArr[(186 >>> 1) % N] >>= (short)Test.instanceCount;
        for (int i17 : iArr2) {
            iArr2[(141 >>> 1) % N] |= i15;
            i15 = i15;
            for (i18 = 1; i18 < 4; i18++) {
                i16 = (int)Test.instanceCount;
                Test.fArrFld[i18] -= i17;
            }
        }
        long meth_res = Float.floatToIntBits(f3) + by1 + i13 + i14 + i15 + i16 + (b1 ? 1 : 0) + i18 + i19 +
            FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr2);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public static int iMeth1(float f2, int i10, int i11) {

        boolean b=false;
        long l=-33597L, lArr[]=new long[N];
        int i20=4, i21=7, i22=131, i23=7, i24=211, iArr1[]=new int[N];
        short s=346;

        FuzzerUtils.init(iArr1, 7906);
        FuzzerUtils.init(lArr, -3493506749L);

        for (int i12 : iArr1) {
            byte by=-38;
            b = true;
            l >>= (by - (byMeth(f2, by, i12) * l));
        }
        for (i20 = 3; i20 < 238; i20++) {
            Test.dFld += Test.dFld;
            i11 += (i20 + l);
            for (i22 = 1; i22 < 7; i22++) {
                s += (short)Test.instanceCount;
                b = b;
                i11 += 123;
                lArr[i22] = Test.instanceCount;
                i24 = 2;
                do {
                    i10 += (int)Test.dFld;
                    Test.instanceCount = i10;
                    Test.instanceCount += (((i24 * i24) + l) - i11);
                } while (--i24 > 0);
            }
        }
        long meth_res = Float.floatToIntBits(f2) + i10 + i11 + (b ? 1 : 0) + l + i20 + i21 + i22 + i23 + s + i24 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth(int i8, int i9) {

        float f1=63.319F;
        byte by2=7;
        int i25=153;
        long lArr1[][]=new long[N][N];

        FuzzerUtils.init(lArr1, -7L);

        f1 *= ((f1 = iMeth1(f1, i8, i9)) * f1);
        lArr1[(i9 >>> 1) % N][(i8 >>> 1) % N] <<= Test.instanceCount;
        i9 += i9;
        i8 = i9;
        by2 *= (byte)i25;
        Test.instanceCount = (long)f1;
        long meth_res = i8 + i9 + Float.floatToIntBits(f1) + by2 + i25 + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-12, i1=11, i2=4, i3=-30565, i4=-171, i5=13, i6=6, i7=53231, i26=-5, iArr[]=new int[N];
        double d=0.24647, d1=-112.45153;
        float f=124.783F;
        boolean b2=true;
        long l1=4226575997L;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(iArr, -58707);
        FuzzerUtils.init(byArr, (byte)107);

        iArr[(i >>> 1) % N] = (int)Math.abs(d);
        i >>= (i -= byArr[(36322 >>> 1) % N]);
        for (d1 = 17; d1 < 342; d1++) {
            for (i2 = (int)(d1); i2 < 77; ++i2) {
                for (i4 = 1; i4 < 1; ++i4) {
                    f += (i4 - i4);
                }
                for (i6 = 1; 1 > i6; ++i6) {
                    switch ((i2 % 4) + 106) {
                    case 106:
                        Test.instanceCount = iMeth(i, i4);
                        if (b2) continue;
                        switch ((((i >>> 1) % 8) * 5) + 124) {
                        case 139:
                            f += (i6 - i6);
                            i1 -= (int)Test.instanceCount;
                            if (true) continue;
                            break;
                        case 129:
                            i5 = -32104;
                            break;
                        case 138:
                            if (true) continue;
                            i = 58929;
                        case 128:
                            i5 -= 24;
                            i7 -= (int)Test.instanceCount;
                            if (b2) {
                                Test.instanceCount &= -5;
                                switch (i2 + 35) {
                                case 35:
                                    i7 = i2;
                                    break;
                                case 36:
                                    f = f;
                                case 37:
                                    i5 = -2;
                                    sFld = (short)d;
                                    i <<= -216;
                                    break;
                                case 38:
                                    Test.instanceCount = sFld;
                                    i1 = (int)Test.instanceCount;
                                    b2 = b2;
                                case 39:
                                    i7 = i;
                                    break;
                                case 40:
                                    f -= Test.instanceCount;
                                    break;
                                case 41:
                                    i = (int)Test.instanceCount;
                                    break;
                                case 42:
                                    i1 -= (int)30484L;
                                    break;
                                case 43:
                                case 44:
                                    Test.instanceCount = i3;
                                    break;
                                case 45:
                                case 46:
                                    sFld = (short)-118;
                                case 47:
                                    i <<= i3;
                                    break;
                                case 48:
                                    i3 *= 3;
                                case 49:
                                    i5 <<= i5;
                                    break;
                                case 50:
                                    i1 -= i4;
                                    break;
                                case 51:
                                    i7 = (int)f;
                                    break;
                                case 52:
                                    b2 = b2;
                                case 53:
                                    sFld = (short)i4;
                                case 54:
                                    Test.lArrFld[(int)(d1 - 1)][i2] = Test.instanceCount;
                                    break;
                                case 55:
                                    fFld = -110;
                                case 56:
                                    Test.dArrFld[i2 - 1] *= i2;
                                    break;
                                case 57:
                                    i3 -= -1;
                                    break;
                                case 58:
                                    i3 <<= (int)Test.instanceCount;
                                    break;
                                case 59:
                                    Test.dArrFld[i2] *= i3;
                                    break;
                                case 60:
                                    i3 += (i6 * i6);
                                case 61:
                                    i1 -= 12;
                                case 62:
                                    i %= (int)(i2 | 1);
                                    break;
                                case 63:
                                    i5 += (((i6 * i7) + i6) - i4);
                                    break;
                                case 64:
                                    Test.instanceCount += (i6 * i6);
                                case 65:
                                    sFld += (short)(((i6 * i1) + Test.instanceCount) - i6);
                                    break;
                                case 66:
                                    i = i1;
                                    break;
                                case 67:
                                    Test.instanceCount -= Test.instanceCount;
                                    break;
                                case 68:
                                    i += 159;
                                    break;
                                case 69:
                                    i7 -= i7;
                                    break;
                                case 70:
                                case 71:
                                    Test.instanceCount -= Test.instanceCount;
                                    break;
                                case 72:
                                    iArr[i6] = (int)Test.instanceCount;
                                    break;
                                case 73:
                                    Test.iArrFld = Test.iArrFld;
                                    break;
                                case 74:
                                    Test.iArrFld[(int)(d1)][(0 >>> 1) % N] = i6;
                                case 75:
                                    try {
                                        iArr[(int)(d1)] = (Test.iArrFld[i2 + 1][i2] / 15161);
                                        i1 = (44531 / i7);
                                        i7 = (i6 / 26669);
                                    } catch (ArithmeticException a_e) {}
                                    break;
                                case 76:
                                    Test.instanceCount *= i1;
                                    break;
                                case 77:
                                    f -= Test.instanceCount;
                                    break;
                                case 78:
                                    i3 -= 0;
                                    break;
                                case 79:
                                    i1 += (((i6 * i4) + i) - f);
                                case 80:
                                    Test.iArrFld[i2 + 1][i6] += i7;
                                case 81:
                                    i += (int)-41L;
                                case 82:
                                    f -= i7;
                                    break;
                                case 83:
                                    Test.fArrFld[i2 + 1] = fFld;
                                    break;
                                case 84:
                                    i -= (int)12L;
                                    break;
                                case 85:
                                    i >>= -1924;
                                    break;
                                case 86:
                                    i26 >>= 112;
                                    break;
                                case 87:
                                    Test.lArrFld[(int)(d1 + 1)] = Test.lArrFld[i6];
                                case 88:
                                case 89:
                                    byFld += (byte)i3;
                                case 90:
                                    iArr[i2] *= (int)Test.instanceCount;
                                    break;
                                case 91:
                                    if (b2) continue;
                                case 92:
                                    i3 += i2;
                                    break;
                                case 93:
                                    Test.instanceCount += (i6 * i6);
                                    break;
                                case 94:
                                    i1 = (int)Test.instanceCount;
                                    break;
                                case 95:
                                    sFld += (short)(i6 * i6);
                                    break;
                                case 96:
                                    d += 1.759F;
                                case 97:
                                    i7 += (i6 - i7);
                                case 98:
                                    Test.instanceCount = i4;
                                case 99:
                                    sFld |= (short)-49L;
                                    break;
                                case 100:
                                    Test.instanceCount = 3;
                                    break;
                                case 101:
                                    Test.instanceCount = i7;
                                    break;
                                case 102:
                                    f *= 36153;
                                case 103:
                                    i += i6;
                                    break;
                                case 104:
                                    l1 = i1;
                                    break;
                                }
                            } else {
                                i3 += (i6 + i4);
                            }
                        case 140:
                            i5 = i7;
                        case 131:
                            i7 = i6;
                        case 159:
                            i5 -= i4;
                        case 132:
                            Test.iArrFld[i6][i6 - 1] -= i4;
                            break;
                        }
                        break;
                    case 107:
                    case 108:
                        b2 = b2;
                        break;
                    case 109:
                        Test.iArrFld[(int)(d1)][i6 + 1] = (int)f;
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
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  byMeth ->  byMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
