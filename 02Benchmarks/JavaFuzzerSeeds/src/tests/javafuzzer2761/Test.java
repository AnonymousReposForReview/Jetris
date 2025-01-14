package tests.javafuzzer2761;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 19:50:22 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-2997595044L;
    public static double dFld=0.88224;
    public long lArrFld[]=new long[N];
    public int iArrFld[]=new int[N];

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i6, int i7) {

        int i8=-25264, i9=-63019, i10=38073, i11=52420, i12=159;
        byte by1=-116;
        long l1=46L;
        boolean b=false;
        float f1=-1.470F;

        if (true) {
            for (i8 = 1; i8 < 377; ++i8) {
                for (i10 = 1; i10 < 4; ++i10) {
                    short s=-4518;
                    by1 <<= (byte)i10;
                    i6 *= (int)Test.instanceCount;
                    if (b) {
                        i7 += i8;
                        i6 += (((i10 * i8) + by1) - i10);
                        for (l1 = 1; l1 < 2; ++l1) {
                            i9 -= 198;
                        }
                        i12 += i7;
                    } else {
                        f1 += i11;
                        Test.dFld += -4;
                        Test.dFld -= f1;
                        s += (short)i11;
                    }
                }
            }
        }
        vMeth1_check_sum += i6 + i7 + i8 + i9 + i10 + i11 + by1 + l1 + i12 + (b ? 1 : 0) + Float.floatToIntBits(f1);
    }

    public static void vMeth(int i4, long l) {

        int i5=9, i13=3, i14=-14, i15=63541, i16=11, iArr1[]=new int[N];
        byte by=-65;
        float f=-2.672F;
        boolean b1=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -102L);
        FuzzerUtils.init(iArr1, 137);

        i5 = 1;
        while (++i5 < 150) {
            short s1=483;
            lArr[i5 - 1] -= (long)(((by + l) << l) + ((i4 - i4) - (f--)));
            vMeth1(i4, i5);
            iArr1[i5] = (int)l;
            Test.instanceCount = l;
            if (b1) {
                if (i4 != 0) {
                    vMeth_check_sum += i4 + l + i5 + by + Float.floatToIntBits(f) + i13 + i14 + i15 + i16 + (b1 ? 1 :
                        0) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
                    return;
                }
                for (i13 = 11; i13 > 1; i13 -= 3) {
                    switch ((i13 % 3) + 17) {
                    case 17:
                        if (i13 != 0) {
                            vMeth_check_sum += i4 + l + i5 + by + Float.floatToIntBits(f) + i13 + i14 + i15 + i16 + (b1
                                ? 1 : 0) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
                            return;
                        }
                        i14 *= (int)-4201534593L;
                        f += (((i13 * i13) + Test.instanceCount) - l);
                        break;
                    case 18:
                        for (i15 = 4; i15 > i5; --i15) {
                            iArr1[i5] += -36463;
                            i14 += i15;
                        }
                    case 19:
                        f += (i13 + i13);
                    default:
                        Test.instanceCount *= by;
                    }
                }
            } else if (b1) {
                s1 += (short)(23.286F + (i5 * i5));
            } else {
                iArr1[i5 + 1] += i4;
            }
        }
        vMeth_check_sum += i4 + l + i5 + by + Float.floatToIntBits(f) + i13 + i14 + i15 + i16 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vSmallMeth(int i, int i1, int i2) {

        float f2=2.243F;
        int iArr[]=new int[N];

        FuzzerUtils.init(iArr, -11);

        vMeth(202, Test.instanceCount);
        f2 -= i2;
        vSmallMeth_check_sum += i + i1 + i2 + Float.floatToIntBits(f2) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i17=-3, i18=14, i19=-85, i20=3605, i21=-405, i22=-140, i23=224, i25=-37562, i26=41150, i27=-129, i28=-8,
            i29=0;
        short s2=-2018;
        float f3=-52.273F, fArr[]=new float[N];
        byte by2=-64;
        double dArr[]=new double[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(fArr, -2.620F);
        FuzzerUtils.init(dArr, -44.43831);
        FuzzerUtils.init(bArr, true);

        if (true) {
            for (int smallinvoc=0; smallinvoc<521; smallinvoc++) vSmallMeth(i17, i17, -43);
            for (i18 = 9; i18 < 254; ++i18) {
                i19 += (i18 ^ i17);
                for (i20 = 2; i20 < 103; ++i20) {
                    s2 = (short)Test.instanceCount;
                    Test.instanceCount += Test.instanceCount;
                    fArr[i20 - 1] *= i18;
                    Test.instanceCount += (((i20 * i20) + f3) - i21);
                    i19 <<= i18;
                    for (i22 = 2; i22 > 1; i22 -= 3) {
                        i19 -= (int)Test.dFld;
                        Test.dFld *= Test.instanceCount;
                        lArrFld[i18 - 1] = i23;
                        i21 = 14;
                        Test.instanceCount ^= s2;
                        dArr[i18] = f3;
                        Test.dFld *= 4;
                        i19 += s2;
                    }
                    i17 |= i18;
                }
                bArr = bArr;
                i17 &= (int)34920L;
                i19 -= -81;
                i25 = 252;
                i17 = by2;
                try {
                    i21 = (1976306122 / i20);
                    i19 = (i17 % -34577);
                    iArrFld[i18] = (i23 / i21);
                } catch (ArithmeticException a_e) {}
                for (i26 = 4; i26 < 103; i26++) {
                    for (i28 = 1; i28 < 2; i28++) {
                        Test.instanceCount += (i28 * f3);
                        if (false) break;
                    }
                }
            }
        } else if (false) {
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  vMeth1 ->  vMeth1 vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
