package tests.javafuzzer3209;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 03:55:12 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-46527L;
    public static int iFld=0;
    public static float fFld=0.684F;
    public byte byFld=-69;
    public double dFld=13.88865;
    public int iFld1=12;
    public int iArrFld[]=new int[N];

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long byMeth_check_sum = 0;

    public static byte byMeth(float f, long l2) {

        short s=15208;
        double d=60.20127;
        int i7=3, i8=59862, i9=13472, i10=-152, i11=43345, i12=11071, i13=0;
        boolean b1=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -83L);

        s -= (short)Test.iFld;
        d = Test.iFld;
        for (i7 = 6; i7 < 151; i7++) {
            Test.iFld >>>= i8;
            f += ((long)i7 | (long)i9);
            lArr[i7] -= (long)f;
        }
        d = i8;
        Test.instanceCount = Test.instanceCount;
        for (i10 = 6; i10 < 142; ++i10) {
            Test.iFld = (int)l2;
            Test.iFld = (int)Test.instanceCount;
            for (i12 = 1; i12 < 12; i12++) {
                if (b1) break;
                if (i8 != 0) {
                }
            }
            Test.instanceCount *= Test.instanceCount;
        }
        long meth_res = Float.floatToIntBits(f) + l2 + s + Double.doubleToLongBits(d) + i7 + i8 + i9 + i10 + i11 + i12
            + i13 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(lArr);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public static void vMeth(int i2) {

        int i3=96, i4=0, i5=-8305, i6=-14, i14=2;
        float f1=2.194F;
        short s1=11628;
        double dArr[][]=new double[N][N];

        FuzzerUtils.init(dArr, 1.81684);

        dArr[(i2 >>> 1) % N][(-18 >>> 1) % N] += (-(Test.iFld &= (int)Test.instanceCount));
        for (i3 = 4; i3 < 250; ++i3) {
            for (i5 = 1; 7 > i5; i5++) {
                Test.instanceCount -= byMeth(Test.fFld, Test.instanceCount);
                i6 += (int)Test.instanceCount;
                i6 -= Test.iFld;
                Test.fFld *= Test.iFld;
                for (f1 = 1; f1 < 2; ++f1) {
                    s1 = (short)Test.instanceCount;
                    Test.instanceCount = Test.instanceCount;
                    Test.instanceCount += (long)(((f1 * i5) + i2) - Test.iFld);
                    if (i4 != 0) {
                        vMeth_check_sum += i2 + i3 + i4 + i5 + i6 + Float.floatToIntBits(f1) + i14 + s1 +
                            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                        return;
                    }
                    Test.instanceCount += (long)(((f1 * i4) + f1) - i4);
                    Test.instanceCount = Test.instanceCount;
                    Test.instanceCount += i6;
                }
            }
        }
        vMeth_check_sum += i2 + i3 + i4 + i5 + i6 + Float.floatToIntBits(f1) + i14 + s1 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static int iMeth(long l, long l1) {

        boolean b=true, bArr[]=new boolean[N];
        int i15=-193, i16=-13814, i17=-125, i18=45060, i19=-44600, i20=-64169, iArr[]=new int[N];
        short s2=-9430;
        long lArr1[]=new long[N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(iArr, -14);
        FuzzerUtils.init(lArr1, -131L);

        switch ((((--Test.iFld) >>> 1) % 2) + 77) {
        case 77:
            b = bArr[(Test.iFld >>> 1) % N];
            break;
        case 78:
            vMeth(Test.iFld);
        default:
            for (i15 = 2; i15 < 143; i15++) {
                s2 += (short)i15;
                i16 *= i15;
                Test.iFld += 9;
                Test.iFld += (int)Test.fFld;
                iArr[i15] = 219;
                iArr[i15] = i16;
                for (i17 = 1; i17 < 11; ++i17) {
                    for (i19 = 1; 2 > i19; i19 += 2) {
                        i16 -= i16;
                        lArr1[i19 - 1] -= l;
                    }
                    Test.iFld += (i17 * i17);
                }
            }
        }
        long meth_res = l + l1 + (b ? 1 : 0) + i15 + i16 + s2 + i17 + i18 + i19 + i20 + FuzzerUtils.checkSum(bArr) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=36586, i1=66, i21=-3, i22=109, i23=-101, i24=-9, i25=243;
        short s3=25945;
        boolean b2=true, bArr1[]=new boolean[N];
        long lArr2[]=new long[N];
        float fArr[]=new float[N];
        double dArr1[]=new double[N];

        FuzzerUtils.init(lArr2, 62L);
        FuzzerUtils.init(fArr, 21.53F);
        FuzzerUtils.init(dArr1, 30.84442);
        FuzzerUtils.init(bArr1, false);

        i = 1;
        do {
            i1 -= (int)(((-176L + (54572 % (iArrFld[i + 1] | 1))) - (-25262 + iMeth(Test.instanceCount,
                Test.instanceCount))) + -57.37346);
            Test.iFld += i;
            for (i21 = i; 107 > i21; i21++) {
                i22 = -44;
                switch (i + 54) {
                case 54:
                    Test.instanceCount = i1;
                    i22 *= i22;
                    Test.instanceCount += i22;
                    Test.instanceCount = 198;
                    break;
                case 55:
                    i23 = 1;
                    while (++i23 < 1) {
                        Test.iFld += i23;
                        s3 += (short)(((i23 * Test.instanceCount) + i23) - i1);
                    }
                    Test.fFld -= -3774671963173458691L;
                    for (i24 = 1; i24 < 1; i24 += 2) {
                        Test.fFld += Test.instanceCount;
                        i22 += i24;
                        if (false) {
                            Test.fFld -= Test.instanceCount;
                        } else {
                            switch ((i % 1) + 109) {
                            case 109:
                                i22 += (((i24 * i22) + Test.iFld) - Test.instanceCount);
                            default:
                                switch (((i21 % 10) * 5) + 15) {
                                case 25:
                                    if (true) {
                                        byFld = (byte)-18487;
                                        i1 += (i24 * i24);
                                        switch (((i21 >>> 1) % 4) + 50) {
                                        case 50:
                                            if (b2) {
                                                dFld += Test.iFld;
                                                i22 -= i25;
                                            }
                                            Test.instanceCount = Test.instanceCount;
                                            break;
                                        case 51:
                                            i1 = i;
                                            break;
                                        case 52:
                                            Test.fFld += Test.fFld;
                                            break;
                                        case 53:
                                            i25 = i21;
                                        }
                                    } else if (true) {
                                        Test.instanceCount = 0;
                                    } else if (b2) {
                                        if (b2) break;
                                    }
                                    break;
                                case 16:
                                    i22 -= 48932;
                                    break;
                                case 37:
                                case 51:
                                    iArrFld[i21] %= (int)(byFld | 1);
                                    break;
                                case 61:
                                    Test.instanceCount = i21;
                                    break;
                                case 57:
                                    iArrFld[i24] <<= byFld;
                                    break;
                                case 41:
                                    Test.fFld -= Test.instanceCount;
                                    break;
                                case 42:
                                case 26:
                                    Test.fFld %= ((long)(Test.fFld) | 1);
                                    break;
                                case 39:
                                    Test.instanceCount += (long)1.931F;
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case 56:
                    Test.iFld >>= 4596;
                case 57:
                    s3 >>= (short)Test.iFld;
                    break;
                case 58:
                case 59:
                    Test.iFld += (((i21 * Test.instanceCount) + Test.instanceCount) - Test.fFld);
                    break;
                case 60:
                    Test.instanceCount += i21;
                    break;
                case 61:
                    iArrFld[i21] = (int)Test.fFld;
                    break;
                case 62:
                    i22 = (int)Test.instanceCount;
                    break;
                case 63:
                    b2 = true;
                    break;
                case 64:
                    i1 = i21;
                    break;
                case 65:
                    Test.instanceCount += (i21 ^ iFld1);
                    break;
                case 66:
                    lArr2 = lArr2;
                    break;
                case 67:
                    s3 = (short)i25;
                case 68:
                    lArr2[i21 - 1] = iFld1;
                    break;
                case 69:
                    byFld += (byte)(i21 | Test.iFld);
                    break;
                case 70:
                    i25 += (i21 ^ i1);
                    break;
                case 71:
                    Test.instanceCount = -4;
                    break;
                case 72:
                    byFld += (byte)i25;
                    break;
                case 73:
                    Test.instanceCount += (i21 * Test.instanceCount);
                case 74:
                    Test.iFld -= (int)dFld;
                case 75:
                    Test.fFld += Test.instanceCount;
                    break;
                case 76:
                    if (b2) break;
                case 77:
                    iArrFld[i21] -= Test.iFld;
                case 78:
                    Test.instanceCount += Test.instanceCount;
                    break;
                case 79:
                    lArr2[i21 + 1] = iFld1;
                    break;
                case 80:
                    Test.instanceCount %= 51114;
                case 81:
                    iFld1 -= i1;
                case 82:
                    i22 <<= 11;
                    break;
                case 83:
                    iArrFld[i] = (int)1.674F;
                    break;
                case 84:
                    fArr[i] = -14;
                    break;
                case 85:
                    byFld += (byte)(((i21 * s3) + i23) - i22);
                    break;
                case 86:
                    i25 += iFld1;
                    break;
                case 87:
                    lArr2[i] -= i;
                    break;
                case 88:
                case 89:
                    i22 = i24;
                    break;
                case 90:
                    i22 = i22;
                    break;
                case 91:
                    Test.instanceCount %= (i23 | 1);
                case 92:
                    Test.fFld = -10984L;
                    break;
                case 93:
                    Test.iFld = (int)Test.instanceCount;
                    break;
                case 94:
                    Test.iFld = (int)-62L;
                    break;
                case 95:
                    Test.instanceCount += (i21 ^ i22);
                case 96:
                    Test.iFld += (i21 * i21);
                    break;
                case 97:
                    i25 *= (int)Test.instanceCount;
                case 98:
                    i25 = (int)Test.instanceCount;
                    break;
                case 99:
                    i25 += -62523;
                    break;
                case 100:
                    Test.fFld += i21;
                    break;
                case 101:
                    dArr1[i21 - 1] = Test.iFld;
                    break;
                case 102:
                    Test.instanceCount -= i25;
                case 103:
                    byFld <<= byFld;
                    break;
                case 104:
                    lArr2[i + 1] = Test.instanceCount;
                case 105:
                case 106:
                    iFld1 = i22;
                case 107:
                    if (b2) continue;
                    break;
                case 108:
                    fArr[i] -= i24;
                    break;
                case 109:
                    Test.fFld += Test.instanceCount;
                    break;
                case 110:
                    Test.instanceCount += i21;
                case 111:
                case 112:
                    if (b2) continue;
                    break;
                case 113:
                    dFld -= i21;
                case 114:
                    Test.instanceCount >>= iFld1;
                    break;
                case 115:
                    byFld = (byte)dFld;
                case 116:
                    bArr1[i] = b2;
                    break;
                case 117:
                    if (b2) continue;
                    break;
                case 118:
                    i22 = (int)Test.fFld;
                case 119:
                    i25 += (((i21 * Test.fFld) + i) - i25);
                    break;
                case 120:
                    Test.fFld -= Test.instanceCount;
                    break;
                case 121:
                    i1 = i;
                    break;
                case 122:
                    Test.fFld *= -64503;
                case 123:
                    iFld1 >>= i23;
                    break;
                }
            }
        } while (++i < 234);



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
//DEBUG  byMeth ->  byMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
