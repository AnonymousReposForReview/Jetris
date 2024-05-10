package tests.javafuzzer2905;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 22:43:50 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-88L;
    public short sFld=9885;
    public static float fFld=-18.676F;
    public volatile byte byFld=70;
    public static float fArrFld[][]=new float[N][N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 38.126F);
        FuzzerUtils.init(Test.dArrFld, -103.20218);
    }

    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l3, int i9) {

        double d=-1.90044;
        int i10=3, i11=-141, i12=3, i13=28966, i14=-147, i15=-21492, i16=48726;

        for (d = 7; d < 347; d++) {
            Test.instanceCount += i10;
            i10 += (int)d;
            for (i11 = 1; i11 < 5; i11++) {
                i9 = i9;
                l3 = i9;
                i12 -= 97;
                if (i10 != 0) {
                    vMeth1_check_sum += l3 + i9 + Double.doubleToLongBits(d) + i10 + i11 + i12 + i13 + i14 + i15 + i16;
                    return;
                }
                i9 = i10;
                i9 = i9;
                Test.fArrFld[(int)(d)][i11] += i12;
            }
            for (i13 = 5; 1 < i13; --i13) {
                for (i15 = 2; i15 > 1; --i15) {
                    i9 -= (int)d;
                    i12 ^= (int)l3;
                }
            }
        }
        vMeth1_check_sum += l3 + i9 + Double.doubleToLongBits(d) + i10 + i11 + i12 + i13 + i14 + i15 + i16;
    }

    public static void vMeth(long l1, long l2) {

        int i7=207, i8=52363, i17=-23546, i18=-14, i19=-11, i20=-8;
        short s=-31304;
        boolean b=false;

        for (i7 = 19; i7 < 358; i7++) {
            vMeth1(l1, i7);
            i8 >>= i7;
        }
        Test.dArrFld[(i8 >>> 1) % N] *= s;
        i8 = i8;
        for (i17 = 4; i17 < 236; i17++) {
            if (true) {
                if (b) {
                    i18 *= s;
                    i18 += (i17 + i8);
                    i8 += 23981;
                    Test.fArrFld[i17 + 1] = FuzzerUtils.float1array(N, (float)33.19F);
                } else {
                    for (i19 = 1; i19 < 7; ++i19) {
                        i20 *= i8;
                        i20 += (i19 * i19);
                    }
                }
            } else {
                i20 = i7;
            }
        }
        vMeth_check_sum += l1 + l2 + i7 + i8 + s + i17 + i18 + (b ? 1 : 0) + i19 + i20;
    }

    public static float fMeth(long l, int i5, int i6) {

        int i21=94, i22=49, i23=-3, i24=-215, iArr1[]=new int[N];
        short s1=18443, sArr[]=new short[N];
        long l4=-212190160921817835L, lArr[]=new long[N];
        double d1=-2.74135;

        FuzzerUtils.init(sArr, (short)2607);
        FuzzerUtils.init(lArr, -8065495179122892623L);
        FuzzerUtils.init(iArr1, -47681);

        switch ((((Math.abs(i5) >>> 1) % 1) * 5) + 84) {
        case 86:
            vMeth(Test.instanceCount, l);
            i6 = (int)Test.fFld;
            break;
        }
        i21 = 1;
        while (++i21 < 175) {
            Test.fFld = l;
        }
        s1 = (short)i6;
        for (i22 = 8; i22 < 375; i22++) {
            Test.fFld += (((i22 * i5) + i22) - i21);
            sArr = sArr;
            for (l4 = 1; l4 < 5; ++l4) {
                lArr[i22] -= (long)d1;
                lArr[(i23 >>> 1) % N] <<= i21;
                i24 += i22;
                l -= i6;
                iArr1 = FuzzerUtils.int1array(N, (int)11);
            }
        }
        long meth_res = l + i5 + i6 + i21 + s1 + i22 + i23 + l4 + i24 + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-3, i1=-56405, i2=97, i3=2, i4=-1, iArr[]=new int[N];
        boolean b1=false, bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(iArr, 53);

        for (i = 15; i < 306; i++) {
            i1 -= (int)(++Test.instanceCount);
            i2 = 1;
            do {
                for (i3 = 1; 1 > i3; ++i3) {
                    switch (((i4 >>> 1) % 1) + 121) {
                    case 121:
                        sFld = (short)(((++i1) % ((i2 + -830023993L) | 1)) - (--i4));
                        switch ((i2 % 6) + 35) {
                        case 35:
                            switch ((((i4--) >>> 1) % 10) + 103) {
                            case 103:
                            case 104:
                                bArr[i2 + 1] = (((--Test.fFld) == (Test.fFld - i3)) & (7 < (Test.instanceCount - -11)));
                                try {
                                    i4 = (i3 / 132);
                                    iArr[(i1 >>> 1) % N] = (i2 / -1147587890);
                                    i4 = (i3 / i2);
                                } catch (ArithmeticException a_e) {}
                                Test.instanceCount += (i3 ^ Test.instanceCount);
                                break;
                            case 105:
                                iArr[i2 + 1] = (int)((i4 - 230) - fMeth(Test.instanceCount, i4, i2));
                                i4 -= i3;
                                Test.instanceCount = Test.instanceCount;
                            case 106:
                                i1 &= i4;
                                if (b1) {
                                    if (true) continue;
                                    i1 /= (int)((long)(Test.fFld) | 1);
                                    i4 -= i;
                                    i4 += (int)(-52.150F + (i3 * i3));
                                } else if (false) {
                                    i1 = (int)Test.instanceCount;
                                } else {
                                    i4 -= -1;
                                    Test.instanceCount |= i;
                                }
                                try {
                                    i4 = (iArr[i] % 210);
                                    iArr[i3] = (-85851732 / i3);
                                    i1 = (i / i2);
                                } catch (ArithmeticException a_e) {}
                                break;
                            case 107:
                                switch (((i2 % 3) * 5) + 42) {
                                case 48:
                                    i1 = -138;
                                    switch ((((i4 >>> 1) % 3) * 5) + 62) {
                                    case 67:
                                        Test.instanceCount *= 12L;
                                        i1 <<= 64782;
                                        Test.instanceCount += i3;
                                        break;
                                    case 69:
                                        Test.fFld = -212L;
                                        break;
                                    case 65:
                                        i4 += i1;
                                        break;
                                    }
                                    break;
                                case 56:
                                    i4 = (int)Test.instanceCount;
                                    break;
                                case 57:
                                    if (b1) break;
                                    break;
                                }
                                break;
                            case 108:
                                if (b1) break;
                                break;
                            case 109:
                                sFld += (short)(((i3 * i1) + i2) - i4);
                                break;
                            case 110:
                                i1 += (i3 * sFld);
                                break;
                            case 111:
                                try {
                                    iArr[i3 + 1] = (iArr[i + 1] % 1532150441);
                                    iArr[i + 1] = (i2 / 109);
                                    iArr[i3] = (38 / iArr[i3 + 1]);
                                } catch (ArithmeticException a_e) {}
                            case 112:
                                byFld += (byte)(i3 ^ i4);
                                break;
                            default:
                                if (b1) continue;
                            }
                            break;
                        case 36:
                            i4 += (i3 | i3);
                            break;
                        case 37:
                            i1 += (((i3 * Test.instanceCount) + i2) - i3);
                        case 38:
                            i1 <<= byFld;
                            break;
                        case 39:
                            Test.dArrFld[i] += i1;
                        case 40:
                            Test.instanceCount = Test.instanceCount;
                            break;
                        }
                        break;
                    default:
                        if (b1) continue;
                    }
                }
            } while (++i2 < 86);
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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}