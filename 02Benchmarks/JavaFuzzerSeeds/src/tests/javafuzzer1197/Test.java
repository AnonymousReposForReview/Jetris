package tests.javafuzzer1197;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 16:22:10 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-16351L;
    public static long lFld=81L;
    public static double dFld=2.95494;
    public static byte byFld=-48;
    public short sFld=-21441;
    public static short sArrFld[]=new short[N];
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)16244);
        FuzzerUtils.init(Test.lArrFld, 2132782703L);
        FuzzerUtils.init(Test.iArrFld, 128);
    }

    public static long vMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i13, int i14, boolean b) {

        float f2=2.316F;
        long l2=18492L;
        int i16=-11, i17=9, i18=19, iArr[]=new int[N];
        boolean b1=false;

        FuzzerUtils.init(iArr, -223);

        for (long l1 : Test.lArrFld) {
            Test.lArrFld[(i14 >>> 1) % N] = i14;
            switch (((i14 >>> 1) % 2) + 51) {
            case 51:
                iArr[(i13 >>> 1) % N] = i13;
            case 52:
                i14 += 2;
                i13 += (int)f2;
                i13 <<= i13;
                for (l2 = 1; l2 < 4; l2++) {
                    l1 = i13;
                }
            default:
                b = b;
                for (i17 = 1; i17 < 4; i17++) {
                    Test.sArrFld[i17 + 1] >>>= (short)i18;
                    i18 += 7;
                    f2 *= f2;
                    if (b1) continue;
                }
            }
        }
        long meth_res = i13 + i14 + (b ? 1 : 0) + Float.floatToIntBits(f2) + l2 + i16 + i17 + i18 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static boolean bMeth(int i6) {

        int i7=-37832, i8=234, i9=252, i10=-13, i11=95, i12=-242, i19=-3, i20=4;
        short s=-15069;
        double d=0.3579;
        boolean b2=false;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 30.57F);

        for (i7 = 294; i7 > 7; i7--) {
            for (i9 = 1; i9 < 6; i9++) {
                float f1=1.664F;
                i10 = (int)(f1++);
            }
            if (i6 != 0) {
                return ((int)(i6 + i7 + i8 + i9 + i10 + i11 + i12 + s + Double.doubleToLongBits(d) + (b2 ? 1 : 0) + i19
                    + i20 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)))) % 2 > 0;
            }
            i6 += (((i7 * i7) + Test.instanceCount) - i10);
            for (i11 = 1; 6 > i11; i11++) {
                i12 *= (int)(fArr[i11]++);
                i8 += (i11 * i11);
                Test.sArrFld[i7 + 1] = (short)(--s);
                i10 >>= (int)(((i8 = (int)d) + (i6 = i8)) + Math.max(iMeth(i10, i8, b2), i8));
            }
            Test.instanceCount += (48 + (i7 * i7));
            Test.lArrFld[i7 - 1] += Test.instanceCount;
        }
        for (i19 = 5; i19 < 130; ++i19) {
            i6 += (i19 * i19);
            i8 = s;
        }
        long meth_res = i6 + i7 + i8 + i9 + i10 + i11 + i12 + s + Double.doubleToLongBits(d) + (b2 ? 1 : 0) + i19 + i20
            + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static void vMeth(int i, float f, int i1) {

        int i2=-11771, i3=7519, i4=0, i5=-84, i21=-228, i22=-4, i23=4, iArr1[]=new int[N];
        long l=8323940588664418042L;
        boolean b3=false;

        FuzzerUtils.init(iArr1, -13);

        for (i2 = 13; i2 < 390; i2 += 2) {
            f -= (((-Test.instanceCount) + (-14L | i2)) + ((--i) >>> (Test.instanceCount * l)));
            for (i4 = 1; i4 < 8; ++i4) {
                if (bMeth(i1)) break;
                for (i21 = 1; 2 > i21; i21++) {
                    Test.instanceCount = i22;
                    f = -4;
                    i22 += i21;
                    if (b3) {
                        iArr1[i4 + 1] >>= (int)Test.lFld;
                    } else {
                        iArr1[i4] += (int)Test.lFld;
                    }
                    Test.instanceCount *= (long)1.62388;
                }
                iArr1 = iArr1;
                i23 = (int)7L;
                i23 += (i4 | i5);
            }
        }
        vMeth_check_sum += i + Float.floatToIntBits(f) + i1 + i2 + i3 + l + i4 + i5 + i21 + i22 + (b3 ? 1 : 0) + i23 +
            FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i24=25304, i25=9, i26=182, i27=-251, i28=-148, i29=253, i30=-2;
        boolean b4=false;
        float f3=109.208F, fArr1[]=new float[N];
        double d1=-37.124581;

        FuzzerUtils.init(fArr1, 0.148F);

        if (b4) {
            vMeth(i24, 0.677F, i24);
            if (b4) {
                Test.lFld = i24;
            } else if (b4) {
                Test.dFld = Test.dFld;
            } else {
                i25 = 1;
                do {
                    f3 -= -2.385F;
                } while (++i25 < 387);
                for (d1 = 2; d1 < 198; d1++) {
                    Test.dFld += d1;
                    fArr1[(int)(d1)] += (float)d1;
                    Test.byFld = (byte)6355;
                    f3 -= i24;
                }
            }
            Test.dFld = f3;
            for (i27 = 10; 195 > i27; ++i27) {
                switch ((((0 >>> 1) % 7) * 5) + 113) {
                case 141:
                    f3 *= i26;
                    break;
                case 148:
                    i26 += i26;
                    Test.iArrFld[i27 + 1] = (int)Test.instanceCount;
                    break;
                case 126:
                    i26 += i25;
                    b4 = b4;
                    break;
                case 116:
                    for (i29 = i27; i29 < 136; ++i29) {
                        i30 -= i26;
                        switch (((-23 >>> 1) % 8) + 69) {
                        case 69:
                            Test.lFld = i30;
                            Test.sArrFld[i29 + 1] -= (short)115;
                            i28 -= (int)-81L;
                            f3 *= Test.lFld;
                        case 70:
                            i28 = i26;
                            Test.lFld += (i29 - i24);
                            Test.instanceCount |= Test.instanceCount;
                            break;
                        case 71:
                            Test.sArrFld[i27] -= sFld;
                            break;
                        case 72:
                            i30 = (int)-7681416438500869114L;
                        case 73:
                            f3 += 54200;
                            break;
                        case 74:
                            sFld -= (short)i27;
                        case 75:
                            i24 = (int)Test.instanceCount;
                        case 76:
                            Test.iArrFld[i27 - 1] = i28;
                            break;
                        default:
                            f3 = i29;
                        }
                    }
                    break;
                case 122:
                    Test.lFld = i27;
                    break;
                case 146:
                    if (b4) continue;
                    break;
                case 127:
                    Test.iArrFld[i27] = i27;
                    break;
                default:
                    i24 = (int)Test.dFld;
                }
            }
        } else if (b4) {
            Test.byFld = (byte)i30;
        } else if (b4) {
            Test.instanceCount *= i30;
        } else {
            Test.lArrFld[(i26 >>> 1) % N] -= Test.instanceCount;
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
//DEBUG  bMeth ->  bMeth vMeth mainTest
//DEBUG  iMeth ->  iMeth bMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}