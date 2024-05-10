package tests.javafuzzer1024;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 12:55:34 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-8808948665514433912L;
    public static float fFld=1.255F;
    public static short sFld=15152;
    public static boolean bFld=false;
    public byte byFld=118;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[][]=new long[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, -47);
        FuzzerUtils.init(Test.lArrFld, -52L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l1) {

        int i4=-149, i5=62, i6=147, i7=10, i8=55647, iArr[]=new int[N];
        float f=0.275F;
        short s=-8825;
        boolean b=false;
        double d=0.78061, d1=-1.86134;

        FuzzerUtils.init(iArr, -48437);

        for (i4 = 13; i4 < 324; ++i4) {
            switch (((i4 % 1) * 5) + 122) {
            case 127:
                f -= l1;
            }
            iArr[i4] -= i4;
            s &= (short)l1;
            i5 += (((i4 * i4) + Test.instanceCount) - f);
            i5 >>= -2;
            for (i6 = i4; i6 < 5; ++i6) {
                s *= (short)-29002;
                b = b;
            }
        }
        for (d = 12; d < 375; ++d) {
            i7 += (int)d;
            Test.instanceCount >>= i6;
            i5 = -75;
        }
        d1 *= -13;
        vMeth2_check_sum += l1 + i4 + i5 + Float.floatToIntBits(f) + s + i6 + i7 + (b ? 1 : 0) +
            Double.doubleToLongBits(d) + i8 + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(long l) {

        int i3=14279;

        i3 <<= i3;
        vMeth2(l);
        vMeth1_check_sum += l + i3;
    }

    public static void vMeth(int i) {

        int i1=-5, i2=-4, i9=-3, i10=48126, i11=-22514, i12=-29;
        byte by=93;
        short s1=-2367;
        double d2=30.71112, dArr[]=new double[N];

        FuzzerUtils.init(dArr, 120.20551);

        for (i1 = 14; i1 < 350; ++i1) {
            switch ((i1 % 9) + 67) {
            case 67:
            case 68:
            case 69:
                vMeth1(Test.instanceCount);
            case 70:
                i2 -= i1;
                for (i9 = 1; 5 > i9; ++i9) {
                    dArr[i9 - 1] += i;
                    Test.fFld += i9;
                    Test.instanceCount += by;
                    i2 = (int)Test.instanceCount;
                    for (i11 = i1; i11 < 2; i11++) {
                        i = i;
                        Test.instanceCount <<= -172;
                        s1 = (short)i9;
                        i12 %= (int)((long)(Test.fFld) | 1);
                        Test.iArrFld[i11 + 1] = by;
                    }
                }
                break;
            case 71:
                Test.instanceCount *= i;
                break;
            case 72:
                Test.instanceCount = Test.instanceCount;
                break;
            case 73:
                i12 -= (int)d2;
                break;
            case 74:
                d2 *= i;
                break;
            case 75:
                by = by;
                break;
            default:
                Test.lArrFld[i1 + 1][i1] = Test.instanceCount;
            }
        }
        vMeth_check_sum += i + i1 + i2 + i9 + i10 + by + i11 + i12 + s1 + Double.doubleToLongBits(d2) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i13=2, i14=0, i15=-93, i16=-2, i17=-8, i18=6846, iArr1[][]=new int[N][N];
        float f1=15.186F, fArr[][]=new float[N][N];
        double d4=121.22434;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(fArr, 1.756F);
        FuzzerUtils.init(iArr1, -44924);
        FuzzerUtils.init(bArr, true);

        vMeth(-2);
        Test.instanceCount = Test.instanceCount;
        i13 *= i13;
        Test.lArrFld[(i14 >>> 1) % N][(i13 >>> 1) % N] = i14;
        if (Test.bFld) {
            i15 = 1;
            while (++i15 < 259) {
                switch ((i15 % 2) + 9) {
                case 9:
                    i14 = i13;
                case 10:
                    switch (((i14 >>> 1) % 7) + 31) {
                    case 31:
                        Test.iArrFld = Test.iArrFld;
                        i14 >>= 160;
                        Test.lArrFld[i15 - 1][i15 + 1] -= i14;
                        for (i16 = 3; i16 < 97; i16++) {
                            Test.fFld %= 14;
                            i17 += (int)-66.29119;
                            i18 = 1;
                            while (++i18 < 2) {
                                double d3=1.63076;
                                switch ((((i16 >>> 1) % 4) * 5) + 49) {
                                case 68:
                                case 59:
                                    Test.sFld = (short)3304L;
                                    switch (i15 + 81) {
                                    case 81:
                                        Test.instanceCount <<= -64235;
                                        i13 -= -14118;
                                        Test.fFld *= Test.instanceCount;
                                        i17 += (((i18 * i13) + i16) - Test.instanceCount);
                                    case 82:
                                        Test.iArrFld[i15 - 1] -= i16;
                                        break;
                                    case 83:
                                        i17 *= Test.sFld;
                                        Test.sFld <<= (short)Test.instanceCount;
                                        Test.fFld -= i18;
                                        i17 = (int)Test.fFld;
                                    case 84:
                                        if (Test.bFld) continue;
                                        Test.lArrFld[i18][i18] += (long)d3;
                                        break;
                                    case 85:
                                        i14 += (i18 * i18);
                                        break;
                                    case 86:
                                        Test.fFld = -214392312L;
                                        break;
                                    case 87:
                                        fArr[i15 + 1] = fArr[i16 - 1];
                                    case 88:
                                        Test.fFld = i14;
                                        break;
                                    case 89:
                                        i17 -= (int)Test.instanceCount;
                                    case 90:
                                        Test.instanceCount <<= i18;
                                        break;
                                    case 91:
                                        Test.instanceCount += i18;
                                        break;
                                    case 92:
                                        i14 -= i16;
                                        break;
                                    case 93:
                                        d3 = 1868491954L;
                                        break;
                                    case 94:
                                        Test.fFld += i16;
                                        break;
                                    case 95:
                                        if (Test.bFld) break;
                                    case 96:
                                        i14 = (int)Test.instanceCount;
                                        break;
                                    case 97:
                                        i13 = i13;
                                        break;
                                    case 98:
                                        Test.sFld = (short)Test.instanceCount;
                                    case 99:
                                    case 100:
                                        i14 += (((i18 * i15) + Test.instanceCount) - i17);
                                        break;
                                    case 101:
                                        Test.instanceCount = i16;
                                    case 102:
                                        Test.instanceCount += (2966027407180236390L + (i18 * i18));
                                        break;
                                    case 103:
                                        Test.instanceCount *= Test.instanceCount;
                                        break;
                                    case 104:
                                        i14 = (int)Test.instanceCount;
                                        break;
                                    case 105:
                                        Test.iArrFld[i16 + 1] -= i13;
                                        break;
                                    case 106:
                                        Test.fFld *= i13;
                                        break;
                                    case 107:
                                        i13 ^= byFld;
                                    case 108:
                                        i13 <<= i13;
                                        break;
                                    case 109:
                                        f1 += Test.fFld;
                                        break;
                                    case 110:
                                        Test.fFld = Test.sFld;
                                        break;
                                    case 111:
                                        Test.instanceCount += (i18 * i15);
                                        break;
                                    case 112:
                                        i17 = (int)d3;
                                        break;
                                    case 113:
                                        i14 = (int)Test.instanceCount;
                                        break;
                                    case 114:
                                        i13 >>>= (int)Test.instanceCount;
                                        break;
                                    case 115:
                                        Test.iArrFld = Test.iArrFld;
                                    case 116:
                                        i13 *= i14;
                                    case 117:
                                        Test.instanceCount = Test.instanceCount;
                                        break;
                                    case 118:
                                        Test.sFld += (short)(i18 + Test.fFld);
                                        break;
                                    case 119:
                                        f1 += i18;
                                        break;
                                    case 120:
                                        Test.iArrFld[i15 - 1] = i13;
                                        break;
                                    case 121:
                                        Test.iArrFld = Test.iArrFld;
                                        break;
                                    case 122:
                                        iArr1 = iArr1;
                                    case 123:
                                    case 124:
                                        byFld = (byte)i14;
                                        break;
                                    case 125:
                                    case 126:
                                        i14 <<= (int)Test.instanceCount;
                                    case 127:
                                        i17 = -80;
                                        break;
                                    case 128:
                                        i14 = (int)Test.instanceCount;
                                        break;
                                    case 129:
                                        i13 -= (int)Test.instanceCount;
                                        break;
                                    case 130:
                                        i13 += i14;
                                    case 131:
                                        if (Test.bFld) break;
                                    case 132:
                                        i14 = (int)33635L;
                                    case 133:
                                        iArr1[i16 + 1][i16] = (int)1206885926906421723L;
                                        break;
                                    case 134:
                                        i13 = (int)Test.instanceCount;
                                        break;
                                    case 135:
                                        Test.instanceCount += i16;
                                        break;
                                    case 136:
                                        i14 &= i18;
                                    case 137:
                                        if (Test.bFld) continue;
                                        break;
                                    case 138:
                                        i17 = -8112;
                                    case 139:
                                        i13 = (int)Test.instanceCount;
                                        break;
                                    case 140:
                                        i13 += i18;
                                        break;
                                    case 141:
                                        i14 += (((i18 * i15) + i14) - i18);
                                    case 142:
                                        byFld += (byte)i18;
                                        break;
                                    case 143:
                                    case 144:
                                        if (true) break;
                                    case 145:
                                        if (Test.bFld) break;
                                    case 146:
                                        if (Test.bFld) break;
                                        break;
                                    case 147:
                                        i17 *= i18;
                                        break;
                                    case 148:
                                        i14 *= (int)Test.fFld;
                                        break;
                                    case 149:
                                        i13 = 129;
                                        break;
                                    case 150:
                                        bArr[i15] = Test.bFld;
                                        break;
                                    default:
                                        i14 += i18;
                                    }
                                    break;
                                case 69:
                                    iArr1[(184 >>> 1) % N][i16 + 1] <<= i16;
                                    break;
                                case 64:
                                    Test.iArrFld[i15 + 1] = (int)Test.instanceCount;
                                    break;
                                }
                            }
                        }
                        break;
                    case 32:
                        i14 = -3;
                        break;
                    case 33:
                        Test.lArrFld[i15 + 1][i15 - 1] += i16;
                        break;
                    case 34:
                        i13 = (int)Test.instanceCount;
                        break;
                    case 35:
                        f1 += i16;
                        break;
                    case 36:
                        i17 >>= i18;
                        break;
                    case 37:
                        Test.bFld = Test.bFld;
                        break;
                    }
                }
            }
        } else if (Test.bFld) {
            i13 -= (int)d4;
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
