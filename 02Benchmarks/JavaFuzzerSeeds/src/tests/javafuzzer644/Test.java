package tests.javafuzzer644;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 07:19:57 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-795018328L;
    public volatile boolean bFld=true;
    public static volatile int iArrFld[][]=new int[N][N];
    public float fArrFld[]=new float[N];
    public boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 246);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1() {

        int i5=-30, i6=-181, i7=-7, i8=-4, i9=-5, i10=2, i11=74, iArr[][]=new int[N][N];
        float f=0.56F, fArr[]=new float[N];
        long l1=118L, lArr[]=new long[N];
        short s=-18390;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)114);
        FuzzerUtils.init(fArr, -48.734F);
        FuzzerUtils.init(lArr, 11L);
        FuzzerUtils.init(iArr, -77);

        Test.instanceCount += Test.instanceCount;
        for (i5 = 4; i5 < 172; ++i5) {
            i6 = i6;
            byArr[i5 - 1] = (byte)i5;
            for (i7 = 1; 9 > i7; i7++) {
                f += i7;
            }
            for (i9 = 1; i9 < 9; i9++) {
                for (l1 = 1; l1 < 2; ++l1) {
                    if (i9 != 0) {
                    }
                    fArr[i5 + 1] += i11;
                    lArr[(int)(l1 + 1)] += Test.instanceCount;
                    Test.instanceCount = i8;
                    iArr[i9][i9 + 1] = (int)Test.instanceCount;
                    i11 = s;
                    iArr[i5 - 1][i5 + 1] = (int)Test.instanceCount;
                }
            }
        }
        long meth_res = i5 + i6 + i7 + i8 + Float.floatToIntBits(f) + i9 + i10 + l1 + i11 + s +
            FuzzerUtils.checkSum(byArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i3, int i4) {

        double d=0.63478;
        int i12=-7, i13=-27753, i14=-251, i15=6, i16=-14, i17=-8, iArr1[]=new int[N];
        byte by=-13, by1=-42;

        FuzzerUtils.init(iArr1, -13);

        Test.instanceCount *= iMeth1();
        for (d = 5; 129 > d; ++d) {
            Test.instanceCount >>= 4005268043L;
            for (i13 = 1; i13 < 13; ++i13) {
                i4 += (i13 * i13);
                i4 -= i3;
                i14 <<= i14;
            }
            by = (byte)i12;
            i14 &= i3;
            try {
                i3 = (i13 % iArr1[(int)(d)]);
                i15 = (i14 / iArr1[(int)(d + 1)]);
                i3 = (iArr1[(int)(d + 1)] % i13);
            } catch (ArithmeticException a_e) {}
            iArr1[(int)(d)] += i13;
            i4 += i13;
            for (i16 = 13; i16 > 1; i16 -= 2) {
                i14 += (i16 | by1);
                Test.instanceCount *= i13;
            }
        }
        vMeth_check_sum += i3 + i4 + Double.doubleToLongBits(d) + i12 + i13 + i14 + by + i15 + i16 + i17 + by1 +
            FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth(long l, int i1, int i2) {

        int i18=-13, i19=-11, i20=49048, i21=-11953, i22=-38464;
        boolean b=true;

        vMeth(-50824, i1);
        i18 = 1;
        do {
            for (i19 = 1; i19 < 7; i19++) {
                for (i21 = i19; 2 > i21; i21 += 2) {
                    short s1=30984;
                    i20 = i1;
                    if (b) continue;
                    i20 = s1;
                    i2 <<= -217;
                    Test.instanceCount = 60058;
                    Test.iArrFld[i21 - 1][i18 - 1] *= i19;
                    i20 >>= s1;
                    switch ((((i18 >>> 1) % 9) * 5) + 83) {
                    case 119:
                        Test.instanceCount = -105898594789751426L;
                        Test.iArrFld[i21][i21] = i19;
                        Test.iArrFld[i18 - 1][i21 + 1] = i18;
                        break;
                    case 97:
                        i22 += (((i21 * i2) + i20) - i20);
                    case 89:
                        i22 = i19;
                    case 126:
                        if (b) break;
                        break;
                    case 109:
                        i22 = 7;
                        break;
                    case 100:
                        i22 >>= i18;
                        break;
                    case 124:
                        i2 = 104;
                        break;
                    case 99:
                        Test.instanceCount = i18;
                        break;
                    case 117:
                        l = i2;
                        break;
                    }
                }
            }
        } while (++i18 < 222);
        long meth_res = l + i1 + i2 + i18 + i19 + i20 + i21 + i22 + (b ? 1 : 0);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=111, i23=2, i24=-61573, i25=36290, i26=21889, i27=-7842, i28=22595, i29=48, i30=-45736;
        float f1=-1.259F;
        double d1=68.45200;
        byte by2=4;
        short s2=-6050;

        i = iMeth(175L, i, i);
        Test.iArrFld[(i >>> 1) % N][(i >>> 1) % N] -= (int)f1;
        d1 = 7;
        for (i23 = 5; i23 < 251; i23++) {
            i24 *= i23;
        }
        if (bFld) {
            for (i25 = 7; 136 > i25; ++i25) {
                f1 *= Test.instanceCount;
            }
            fArrFld[(i24 >>> 1) % N] -= i26;
            i26 = -152;
            i26 *= by2;
        }
        for (i27 = 11; i27 < 261; ++i27) {
            d1 += 190L;
            i = -52;
            for (i29 = 3; i29 < 101; ++i29) {
                d1 = Test.instanceCount;
                i24 = i29;
                switch ((i27 % 5) + 127) {
                case 127:
                    i += i29;
                    i28 += (((i29 * i28) + i24) - i25);
                case 128:
                case 129:
                    Test.iArrFld[i29 - 1][i29] = (int)f1;
                    if (false) {
                        Test.iArrFld[i29 + 1][i29] *= i27;
                        s2 = (short)Test.instanceCount;
                        Test.iArrFld[i29][i29] ^= i;
                        Test.instanceCount += i29;
                    } else {
                        Test.instanceCount -= i30;
                        bArrFld[i27 + 1] = bFld;
                        i28 = i30;
                        i26 = i30;
                    }
                    break;
                case 130:
                    Test.iArrFld[i29][i27 + 1] -= i26;
                case 131:
                    i30 -= (int)Test.instanceCount;
                    break;
                default:
                    if (bFld) break;
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
//DEBUG  iMeth1 ->  iMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}