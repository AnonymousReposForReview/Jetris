package tests.javafuzzer1844;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 04:25:17 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3564808509L;
    public static volatile float fFld=-91.458F;
    public static short sFld=21314;
    public static int iFld=-10;
    public double dFld=-1.126097;
    public byte byFld=-86;
    public static int iArrFld[]=new int[N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 64679);
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l2, float f1) {

        int i6=55560, i7=-119, i8=2771, i9=10, i10=-20310, i11=-12, i12=-80, iArr1[]=new int[N];
        double d=26.88769;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(iArr1, 193);
        FuzzerUtils.init(byArr, (byte)14);

        iArr1[(-11 >>> 1) % N] <<= i6;
        for (i7 = 154; i7 > 5; i7 -= 2) {
            i6 += i7;
            for (i9 = 1; i9 < 21; i9++) {
                for (i11 = 1; i11 < 2; i11++) {
                    i8 |= i9;
                    switch (((i9 % 9) * 5) + 83) {
                    case 109:
                        i6 += (i11 * i11);
                        byArr[i11 + 1] = (byte)l2;
                        i8 -= (int)d;
                        break;
                    case 105:
                        Test.instanceCount += (long)f1;
                        break;
                    case 118:
                        i6 <<= (int)l2;
                        break;
                    case 90:
                        i8 += i11;
                        l2 = i9;
                        break;
                    case 85:
                    case 100:
                        i10 += (int)d;
                        break;
                    case 127:
                        i6 = 0;
                        break;
                    case 112:
                        i12 -= i12;
                        break;
                    case 121:
                        i12 = i6;
                    default:
                        l2 -= i8;
                    }
                }
            }
        }
        vMeth1_check_sum += l2 + Float.floatToIntBits(f1) + i6 + i7 + i8 + i9 + i10 + i11 + i12 +
            Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(byArr);
    }

    public static void vMeth(int i4, int i5, long l1) {

        boolean b=true;
        int i13=48511, i14=242, i15=-38, i16=180;

        vMeth1(Test.instanceCount, Test.fFld);
        Test.iArrFld[(i5 >>> 1) % N] += (int)Test.instanceCount;
        switch (((i5 >>> 1) % 6) + 82) {
        case 82:
            i4 = i4;
            i4 = Test.sFld;
        case 83:
            Test.bArrFld[(i4 >>> 1) % N] = b;
            switch (((i5 >>> 1) % 5) + 101) {
            case 101:
                for (i13 = 8; i13 < 281; i13++) {
                    if (b) continue;
                    Test.iArrFld[i13] = (int)Test.instanceCount;
                    i14 += (int)Test.instanceCount;
                    for (i15 = 1; 6 > i15; ++i15) {
                        Test.fFld = i14;
                        i14 -= -7;
                        i16 *= i14;
                    }
                }
            case 102:
                i5 %= (int)(i13 | 1);
            case 103:
                i5 += i15;
                break;
            case 104:
                i16 >>= i15;
                break;
            case 105:
                Test.instanceCount %= (i15 | 1);
                break;
            }
            break;
        case 84:
            Test.instanceCount = i16;
        case 85:
            Test.iArrFld[(-27561 >>> 1) % N] *= i14;
            break;
        case 86:
            Test.sFld = (short)i14;
            break;
        case 87:
            Test.instanceCount = 8240L;
            break;
        default:
            Test.bArrFld = Test.bArrFld;
        }
        vMeth_check_sum += i4 + i5 + l1 + (b ? 1 : 0) + i13 + i14 + i15 + i16;
    }

    public static int iMeth(long l, int i2) {

        float f=-24.181F;
        int i3=187, i19=52352, i20=10, iArr[]=new int[N];
        boolean b1=true;
        byte by=84;

        FuzzerUtils.init(iArr, -15532);

        iArr[(i2 >>> 1) % N] /= (int)(((long)((-(f - i2)) * -3319479163965802976L)) | 1);
        l += i2;
        i3 = 1;
        do {
            vMeth(i3, i2, l);
            b1 = b1;
            Test.fFld -= l;
            i19 = 5;
            while ((i19 -= 3) > 0) {
                iArr = iArr;
                i2 -= (int)f;
            }
            i2 = i3;
            i20 = 1;
            do {
                i2 = 62;
                l = Test.iFld;
                i2 = 79;
                by += (byte)i2;
            } while (++i20 < 5);
        } while (++i3 < 323);
        long meth_res = l + i2 + Float.floatToIntBits(f) + i3 + (b1 ? 1 : 0) + i19 + i20 + by +
            FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=8, i1=203, i21=-5, i22=215, i23=6, iArr2[][]=new int[N][N];
        boolean b2=false;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)18503);
        FuzzerUtils.init(iArr2, -3);

        for (i = 11; i < 396; i += 3) {
            i1 += i;
            sArr[i + 1] -= (short)(iMeth(Test.instanceCount, i1) + i1);
            if (b2) {
                i21 = 196;
                do {
                    if (b2) {
                        switch (((0 >>> 1) % 4) + 93) {
                        case 93:
                            Test.iFld += (i21 ^ i1);
                            break;
                        case 94:
                            dFld -= 52372;
                            b2 = b2;
                            Test.iArrFld[i21 + 1] = i1;
                            break;
                        case 95:
                            Test.iFld -= Test.iFld;
                            Test.iFld *= (int)Test.fFld;
                            i1 -= (int)dFld;
                            i1 >>>= Test.iFld;
                            break;
                        case 96:
                            for (i22 = 1; i22 < 1; ++i22) {
                                switch ((i21 % 4) + 65) {
                                case 65:
                                    if (b2) continue;
                                    iArr2 = iArr2;
                                    Test.instanceCount += (i22 - Test.instanceCount);
                                    i23 = (int)Test.instanceCount;
                                    break;
                                case 66:
                                    Test.bArrFld[i] = b2;
                                    i1 *= -10;
                                    Test.fFld *= i23;
                                    switch ((((13 >>> 1) % 9) * 5) + 20) {
                                    case 44:
                                        dFld += Test.iFld;
                                        iArr2[i22 + 1][i - 1] *= Test.sFld;
                                        break;
                                    case 32:
                                        Test.iFld = (int)dFld;
                                        dFld -= i21;
                                        break;
                                    case 23:
                                        Test.iFld += (i22 - i23);
                                        break;
                                    case 35:
                                    case 34:
                                        dFld += Test.instanceCount;
                                        break;
                                    case 47:
                                        sArr[i] += (short)dFld;
                                    case 46:
                                    case 26:
                                        Test.instanceCount += (i22 * i22);
                                    case 27:
                                        i23 += (int)Test.instanceCount;
                                        break;
                                    default:
                                        Test.instanceCount += i22;
                                    }
                                    break;
                                case 67:
                                    Test.iFld += (i22 + i1);
                                    break;
                                case 68:
                                    byFld = (byte)12;
                                    break;
                                }
                            }
                            break;
                        default:
                            Test.iFld = Test.sFld;
                        }
                    } else if (b2) {
                        Test.iArrFld[i21] >>= i1;
                    }
                } while (--i21 > 0);
            } else if (b2) {
                i23 += (i * i);
            } else {
                if (b2) continue;
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
