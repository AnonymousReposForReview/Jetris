package tests.javafuzzer3291;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 05:40:09 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=722505709L;
    public static int iFld=202;
    public static short sFld=-2116;
    public static volatile double dArrFld[]=new double[N];
    public long lArrFld[]=new long[N];
    public long lArrFld1[][]=new long[N][N];

    static {
        FuzzerUtils.init(Test.dArrFld, 62.115124);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i9, int i10) {

        int i11=4, i12=5, i13=17099, i14=-123, i15=46085, i16=14452, iArr2[]=new int[N];
        float f1=20.626F, fArr[]=new float[N];
        double d2=43.67666;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(iArr2, 127);
        FuzzerUtils.init(lArr, -1536653458L);
        FuzzerUtils.init(fArr, -68.594F);

        for (i11 = 2; i11 < 149; i11++) {
            int i17=211, i18=-31718;
            iArr2[i11 + 1] = i12;
            switch ((i11 % 10) + 105) {
            case 105:
            case 106:
                lArr = lArr;
                iArr2[i11 - 1] >>= Test.iFld;
                for (i13 = 1; 11 > i13; i13++) {
                    iArr2[i11] += i14;
                    f1 += Test.instanceCount;
                    iArr2[i11 - 1] = i13;
                    d2 = d2;
                    Test.instanceCount += (i13 * i13);
                    for (i15 = 1; i15 < 2; ++i15) {
                        i14 = i15;
                        i10 = 244;
                        i16 += (((i15 * i14) + i9) - i15);
                    }
                }
            case 107:
                f1 = Test.sFld;
                break;
            case 108:
                d2 = i12;
            case 109:
                Test.iFld += i17;
                break;
            case 110:
                Test.instanceCount = i16;
                break;
            case 111:
                iArr2 = FuzzerUtils.int1array(N, (int)-232);
                break;
            case 112:
                i12 = 26398;
                break;
            case 113:
                fArr[i11 - 1] += i16;
                break;
            case 114:
                i18 = -9522;
            }
        }
        vMeth_check_sum += i9 + i10 + i11 + i12 + i13 + i14 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d2) +
            i15 + i16 + FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth1(int i4, double d1) {

        int i5=-10212, i6=-232, i7=-20, i8=-7, i19=8, i20=-41115, i21=-172, iArr3[]=new int[N];
        boolean b=true;

        FuzzerUtils.init(iArr3, 63414);

        for (i5 = 20; 373 > i5; i5++) {
            for (i7 = 5; i5 < i7; i7 -= 3) {
                vMeth(-57, i19);
                if (Test.iFld != 0) {
                }
                i8 = i6;
                for (i20 = 1; i20 < 1; i20++) {
                    float f2=-75.995F;
                    switch ((((i21 >>> 1) % 4) * 5) + 91) {
                    case 100:
                        if (b) break;
                        break;
                    case 101:
                        if (Test.iFld != 0) {
                        }
                        i6 = (int)-187L;
                    case 93:
                        i4 += (((i20 * i8) + i8) - Test.instanceCount);
                        i19 += (i20 * i20);
                        Test.dArrFld[i5 - 1] = i8;
                        break;
                    case 105:
                        iArr3[(i7 >>> 1) % N] += (int)d1;
                        i6 = i6;
                    default:
                        Test.sFld = (short)f2;
                    }
                }
            }
        }
        long meth_res = i4 + Double.doubleToLongBits(d1) + i5 + i6 + i7 + i8 + i19 + i20 + i21 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr3);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(double d, short s1, float f) {

        int i=12, i1=-121, i2=-9445, i3=-9742, iArr1[]=new int[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr1, -7441);
        FuzzerUtils.init(lArr1, -4278224415349024996L);

        for (i = 1; i < 175; i++) {
            for (i2 = 1; i2 < 9; ++i2) {
                if (i2 != 0) {
                }
                iArr1[i2] += (int)((Test.instanceCount++) - (Test.instanceCount++));
                iArr1[i2 + 1] |= iMeth1(i, d);
                iArr1[i + 1] |= (int)Test.instanceCount;
                Test.instanceCount <<= Test.instanceCount;
            }
            switch ((((Test.iFld >>> 1) % 9) * 5) + 119) {
            case 122:
                i3 ^= (int)Test.instanceCount;
                Test.instanceCount = 131;
                f += Test.instanceCount;
                Test.instanceCount -= i;
                break;
            case 128:
                i3 = i3;
                f += i3;
                break;
            case 164:
                Test.instanceCount *= Test.instanceCount;
            case 134:
                Test.iFld |= i3;
            case 141:
                f -= f;
                break;
            case 152:
                i3 *= (int)d;
            case 161:
                i1 -= (int)Test.instanceCount;
            case 133:
                i1 += (((i * i1) + i1) - i2);
            case 148:
                i1 = i3;
                break;
            default:
                lArr1[i] = i3;
            }
        }
        long meth_res = Double.doubleToLongBits(d) + s1 + Float.floatToIntBits(f) + i + i1 + i2 + i3 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        short s=-26352, sArr[]=new short[N];
        double d3=66.83666;
        float f3=56.234F, f4=0.791F, fArr1[]=new float[N];
        int i22=-234, i23=64, i24=176, i25=-14354, iArr[]=new int[N];
        byte by=-71, byArr[]=new byte[N], byArr1[][]=new byte[N][N];
        boolean b1=false;

        FuzzerUtils.init(iArr, -8);
        FuzzerUtils.init(byArr, (byte)-51);
        FuzzerUtils.init(sArr, (short)-24788);
        FuzzerUtils.init(fArr1, 37.1019F);
        FuzzerUtils.init(byArr1, (byte)-40);

        iArr[(12 >>> 1) % N] += (int)(((178 * (s & Test.instanceCount)) - (Test.iFld * Test.iFld)) * iMeth(d3,
            Test.sFld, f3));
        iArr[(Test.iFld >>> 1) % N] ^= (int)Test.instanceCount;
        f4 = 1;
        do {
            for (i22 = (int)(f4); i22 < 76; i22++) {
                switch ((i22 % 2) + 117) {
                case 117:
                    s = (short)Test.iFld;
                    lArrFld[(int)(f4 - 1)] += 163;
                    Test.iFld = -52826;
                    break;
                case 118:
                    i23 = i23;
                    iArr = iArr;
                    for (i24 = i22; i24 < 1; i24++) {
                        Test.sFld -= (short)i25;
                        switch (((Test.iFld >>> 1) % 6) + 86) {
                        case 86:
                            Test.instanceCount += (i24 * Test.sFld);
                            iArr[(int)(f4 + 1)] <<= -38;
                            byArr = byArr;
                            by -= (byte)i24;
                        case 87:
                            switch ((i22 % 9) + 42) {
                            case 42:
                                if (b1) break;
                                i23 += i24;
                                Test.iFld >>= by;
                                break;
                            case 43:
                                sArr[i24 + 1] = (short)-617309440232491951L;
                                Test.iFld = (int)f3;
                                switch ((int)((f4 % 10) + 54)) {
                                case 54:
                                    iArr[i22] = 70;
                                    Test.iFld = (int)Test.instanceCount;
                                    Test.iFld = 52961;
                                    break;
                                case 55:
                                    i23 &= (int)Test.instanceCount;
                                    i23 -= i23;
                                case 56:
                                    iArr[(int)(f4 - 1)] += 38095;
                                case 57:
                                    i25 = (int)17875L;
                                case 58:
                                    fArr1[i22] += -13450;
                                    break;
                                case 59:
                                    d3 -= -63.969F;
                                    break;
                                case 60:
                                    Test.instanceCount += (((i24 * i23) + i24) - i25);
                                    break;
                                case 61:
                                    Test.dArrFld = Test.dArrFld;
                                case 62:
                                    byArr1 = byArr1;
                                case 63:
                                    i25 >>= by;
                                default:
                                    Test.instanceCount += (214 + (i24 * i24));
                                }
                            case 44:
                                Test.instanceCount += (((i24 * i22) + Test.instanceCount) - i24);
                            case 45:
                                b1 = b1;
                                break;
                            case 46:
                                Test.iFld -= 0;
                            case 47:
                            case 48:
                                i25 += i24;
                                break;
                            case 49:
                                i23 *= (int)-1072188486367855931L;
                                break;
                            case 50:
                                Test.instanceCount = Test.instanceCount;
                                break;
                            default:
                                Test.sFld -= (short)i23;
                            }
                            break;
                        case 88:
                            lArrFld1 = lArrFld1;
                            break;
                        case 89:
                            i23 *= i22;
                            break;
                        case 90:
                            i23 = i24;
                            break;
                        case 91:
                            Test.instanceCount = i22;
                            break;
                        default:
                            i23 += Test.iFld;
                        }
                    }
                    break;
                default:
                    b1 = b1;
                }
            }
        } while (++f4 < 331);

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
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
