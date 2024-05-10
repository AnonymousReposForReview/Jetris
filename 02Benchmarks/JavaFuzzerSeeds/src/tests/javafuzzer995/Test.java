package tests.javafuzzer995;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 12:43:26 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=6018675703460906827L;
    public static float fFld=2.171F;
    public static volatile double dFld=0.119009;
    public static boolean bFld=true;
    public volatile short sFld=-20821;
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 3.24291);
    }

    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i9, int i10, int i11) {

        int i12=13, i13=-183, i14=-8, i15=5, i16=8, iArr2[]=new int[N];

        FuzzerUtils.init(iArr2, -9);

        for (i12 = 9; i12 < 202; i12++) {
            i14 = 1;
            while (++i14 < 8) {
                Test.instanceCount = 0L;
                i15 = 1;
                do {
                    i11 *= (int)Test.fFld;
                } while (++i15 < 1);
                Test.instanceCount <<= Test.instanceCount;
                iArr2[i14 - 1] += i10;
                i11 = -12;
                i16 = 1;
                while (++i16 < 1) {
                    i10 += i16;
                    switch ((i12 % 1) + 98) {
                    case 98:
                        Test.fFld += (float)Test.dFld;
                        Test.bFld = Test.bFld;
                        Test.fFld += i16;
                        Test.instanceCount = i11;
                        break;
                    default:
                        if (Test.bFld) break;
                    }
                }
            }
        }
        long meth_res = i9 + i10 + i11 + i12 + i13 + i14 + i15 + i16 + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static float fMeth(int i1, int i2, short s) {

        int i3=95, i4=-48129, i5=-4, i6=-116, i7=16480, i8=18, i17=-146, iArr1[]=new int[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -3636722327590434370L);
        FuzzerUtils.init(iArr1, -227);

        for (i3 = 4; i3 < 196; ++i3) {
            for (i5 = 1; i5 < 8; i5++) {
                for (i7 = i5; 2 > i7; i7 += 3) {
                    i1 += (((i7 * i4) + i3) - i1);
                    lArr[i7 - 1] -= 235;
                    i2 = (int)(Test.instanceCount + ((i3 + i2) - (++Test.instanceCount)));
                    iArr1[(i3 >>> 1) % N] <<= ((i1++) * (++i2));
                }
                Test.instanceCount <<= iMeth(i17, i7, i5);
                i4 += (188 + (i5 * i5));
                i17 >>>= i8;
                Test.fFld -= i17;
            }
            if (Test.bFld) continue;
            iArr1[i3 + 1] = i3;
            i4 = i5;
            i4 -= i1;
        }
        long meth_res = i1 + i2 + s + i3 + i4 + i5 + i6 + i7 + i8 + i17 + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth() {

        int i=-2232, i18=72, i19=135, i20=14, iArr[]=new int[N];
        short s1=1347;
        boolean b=false, bArr[]=new boolean[N];

        FuzzerUtils.init(iArr, 36079);
        FuzzerUtils.init(bArr, false);

        i = (int)(Math.min(iArr[(i >>> 1) % N], (int)(Test.instanceCount - 15029)) + fMeth(i, i, s1));
        if (b) {
            i -= i;
            Test.instanceCount -= (long)Test.dFld;
            vMeth_check_sum += i + s1 + i18 + i19 + i20 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr) +
                FuzzerUtils.checkSum(bArr);
            return;
        } else if (true) {
            for (i18 = 7; i18 < 297; ++i18) {
                i = (int)Test.fFld;
                i20 = 1;
                while (++i20 < 6) {
                    if (i != 0) {
                        vMeth_check_sum += i + s1 + i18 + i19 + i20 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr) +
                            FuzzerUtils.checkSum(bArr);
                        return;
                    }
                    i += (i20 * i20);
                    if (Test.bFld) {
                        i = i19;
                        iArr[i18 - 1] /= (int)(i | 1);
                        i19 = -11;
                    } else if (Test.bFld) {
                        bArr[i18 + 1] = true;
                        Test.fFld += (i20 * i20);
                        vMeth_check_sum += i + s1 + i18 + i19 + i20 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr) +
                            FuzzerUtils.checkSum(bArr);
                        return;
                    } else if (b) {
                        i19 *= i18;
                    }
                }
            }
        }
        vMeth_check_sum += i + s1 + i18 + i19 + i20 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(bArr);
    }

    public void mainTest(String[] strArr1) {

        int i21=-21, i22=-5, i23=136, i24=7, i25=196, i26=127, i27=7, iArr3[]=new int[N];
        byte by=18;
        long l1=-6796428301749490545L, lArr1[]=new long[N];
        boolean bArr1[]=new boolean[N];

        FuzzerUtils.init(bArr1, true);
        FuzzerUtils.init(iArr3, -13);
        FuzzerUtils.init(lArr1, -3655815831111368936L);

        vMeth();
        i21 = 1;
        do {
            if (Test.bFld) continue;
            for (i22 = 3; i22 < 68; ++i22) {
                i23 = i22;
                for (i24 = 1; i24 < 2; i24++) {
                    Test.instanceCount <<= 87;
                    i23 += sFld;
                    Test.dFld += i25;
                    Test.instanceCount = i23;
                    i23 = 23282;
                }
                for (i26 = i21; 2 > i26; ++i26) {
                    i27 -= (int)Test.instanceCount;
                    bArr1[i26] = false;
                    i25 <<= i24;
                    iArr3[i21 - 1] <<= (int)Test.instanceCount;
                    Test.fFld %= (by | 1);
                    Test.instanceCount -= (long)Test.fFld;
                    switch ((i26 % 2) + 76) {
                    case 76:
                        i25 += (((i26 * i26) + i24) - Test.instanceCount);
                        break;
                    case 77:
                        i25 *= (int)Test.fFld;
                        Test.fFld = i21;
                        if (Test.bFld) {
                            i25 = (int)138L;
                            iArr3[i26] = i25;
                            Test.fFld += ((long)i26 ^ (long)l1);
                        }
                        lArr1[i22] ^= i24;
                        break;
                    default:
                        i23 += (i26 * i22);
                        lArr1[i26] *= l1;
                        i23 = (int)Test.instanceCount;
                    }
                }
            }
        } while (++i21 < 370);

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
//DEBUG  fMeth ->  fMeth vMeth mainTest
//DEBUG  iMeth ->  iMeth fMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}