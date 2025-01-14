package tests.javafuzzer3422;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 08:00:31 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=0L;
    public static byte byFld=-21;
    public double dFld=-67.96111;
    public static short sArrFld[]=new short[N];
    public int iArrFld[]=new int[N];
    public double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)-6847);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(long l, int i3, float f1) {

        int i4=126, i5=4, i6=-23572, i7=1;
        boolean b=false;
        double d=1.58940;

        i4 = 1;
        do {
            i5 = 1;
            do {
                for (i6 = 1; i6 > 1; i6 -= 2) {
                    if (b) {
                        if (false) continue;
                        i7 += (i6 + f1);
                    } else if (b) {
                        l -= i3;
                    } else {
                        i7 *= (int)Test.instanceCount;
                    }
                    Test.sArrFld[i4 - 1] = (short)i6;
                    l |= i4;
                }
            } while (++i5 < 10);
            i7 <<= i5;
            switch (((34561 >>> 1) % 2) + 42) {
            case 42:
                Test.instanceCount = (long)d;
                d = l;
                l >>= -17573;
                break;
            case 43:
                i3 += (((i4 * f1) + f1) - i4);
                break;
            }
        } while (++i4 < 162);
        long meth_res = l + i3 + Float.floatToIntBits(f1) + i4 + i5 + i6 + i7 + (b ? 1 : 0) +
            Double.doubleToLongBits(d);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i2) {

        float f2=-2.229F;
        int i8=-135, i9=-17248, i10=-16728, i11=11, i12=61617, i13=2, iArr[]=new int[N];
        byte by=54;
        double d1=-16.18959;
        long l1=8742634798828204782L;
        boolean b1=false, b2=true;
        short s=25545;

        FuzzerUtils.init(iArr, 219);

        lMeth(-246L, 159, f2);
        for (i8 = 359; i8 > 6; i8 -= 2) {
            for (i10 = 1; i10 < 9; i10++) {
                for (i12 = i8; i12 < 2; ++i12) {
                    Test.instanceCount = Test.instanceCount;
                    switch ((i8 % 10) + 56) {
                    case 56:
                        switch ((i10 % 2) + 63) {
                        case 63:
                            switch (((i8 % 10) * 5) + 2) {
                            case 37:
                            case 21:
                                i13 += i11;
                                break;
                            case 24:
                                iArr[i12] -= i13;
                                by >>= (byte)Test.instanceCount;
                                i11 = i10;
                                break;
                            case 10:
                                d1 *= l1;
                                Test.instanceCount >>= l1;
                                if (i12 != 0) {
                                    vMeth_check_sum += i2 + Float.floatToIntBits(f2) + i8 + i9 + i10 + i11 + i12 + i13
                                        + by + Double.doubleToLongBits(d1) + l1 + (b1 ? 1 : 0) + (b2 ? 1 : 0) + s +
                                        FuzzerUtils.checkSum(iArr);
                                    return;
                                }
                                break;
                            case 20:
                                i2 += (i12 - i9);
                                break;
                            case 33:
                                Test.instanceCount >>>= by;
                                break;
                            case 40:
                                Test.instanceCount = i13;
                                break;
                            case 46:
                                Test.sArrFld[i12 + 1] -= (short)d1;
                                break;
                            case 5:
                                i13 = by;
                                break;
                            case 23:
                                i2 += (((i12 * i10) + i11) - f2);
                                break;
                            default:
                                b1 = b2;
                            }
                            break;
                        case 64:
                            d1 = s;
                            break;
                        }
                    case 57:
                        i11 += i12;
                        break;
                    case 58:
                        l1 -= i12;
                    case 59:
                        f2 /= -16031;
                    case 60:
                        i9 += (int)l1;
                        break;
                    case 61:
                        iArr[i10 - 1] += i9;
                        break;
                    case 62:
                        i2 = (int)Test.instanceCount;
                        break;
                    case 63:
                        iArr[i8] = i2;
                        break;
                    case 64:
                        f2 += (i12 * i8);
                        break;
                    case 65:
                        f2 = i11;
                        break;
                    default:
                        b2 = b2;
                    }
                }
            }
        }
        vMeth_check_sum += i2 + Float.floatToIntBits(f2) + i8 + i9 + i10 + i11 + i12 + i13 + by +
            Double.doubleToLongBits(d1) + l1 + (b1 ? 1 : 0) + (b2 ? 1 : 0) + s + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth() {

        int i14=-34259, i15=8034, i16=-27543, i17=-4611, i18=-21, i19=64, i20=33834, iArr1[]=new int[N];
        float f3=0.443F, fArr[]=new float[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -3062692496L);
        FuzzerUtils.init(iArr1, -65106);
        FuzzerUtils.init(fArr, 0.56F);

        vMeth(i14);
        i14 <<= i14;
        lArr[(i14 >>> 1) % N] |= i14;
        for (i15 = 6; i15 < 283; ++i15) {
            for (i17 = 1; i17 < 6; ++i17) {
                f3 *= i18;
                iArr1[i15 - 1] = (int)Test.instanceCount;
                iArr1[i17] -= (int)Test.instanceCount;
                i14 += (i17 * i17);
                i14 >>= i16;
            }
            fArr = fArr;
        }
        for (i19 = 10; i19 < 218; i19++) {
            i20 *= -51;
            i20 = i18;
            Test.instanceCount *= i18;
        }
        long meth_res = i14 + i15 + i16 + i17 + i18 + Float.floatToIntBits(f3) + i19 + i20 + FuzzerUtils.checkSum(lArr)
            + FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-3, i1=112, i22=-188, i23=-85, i24=49620, i25=-130, i26=35486;
        float f=2.103F, fArr1[]=new float[N];
        short s1=-30179;
        boolean b3=true;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 4039132275707614624L);
        FuzzerUtils.init(fArr1, 0.622F);

        for (i = 4; i < 199; i += 3) {
            f *= ((-iMeth()) - i);
            s1 >>= (short)-129;
            iArrFld[i + 1] = s1;
            for (i22 = 13; i22 < 385; i22++) {
                i23 += (((i22 * i) + Test.instanceCount) - Test.instanceCount);
                i24 = 2;
                do {
                    Test.sArrFld[i22 + 1] <<= (short)i1;
                    dArrFld[i22] = Test.instanceCount;
                    Test.byFld += (byte)(((i24 * s1) + Test.instanceCount) - f);
                    i23 = (int)f;
                    f %= (Test.instanceCount | 1);
                    i1 <<= (int)-5849081739179626272L;
                    lArr1[i22] -= i;
                    i23 -= i24;
                } while ((i24 -= 3) > 0);
                Test.instanceCount += Test.byFld;
                f = f;
                for (i25 = i22; i25 < 2; ++i25) {
                    Test.instanceCount = Test.byFld;
                    i1 += (int)(9L + (i25 * i25));
                    i23 = (int)dFld;
                    Test.byFld += (byte)i24;
                    i23 <<= i26;
                    Test.instanceCount <<= Test.byFld;
                    fArr1[i22 - 1] /= (Test.instanceCount | 1);
                    if (b3) continue;
                }
                i1 = (int)f;
                i23 = i24;
                Test.instanceCount += (i22 * i22);
                iArrFld[(56527 >>> 1) % N] |= (int)Test.instanceCount;
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
//DEBUG  lMeth ->  lMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
