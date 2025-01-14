package tests.javafuzzer2798;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 20:19:17 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-213L;
    public static double dFld=0.61357;
    public static float fFld=0.218F;
    public static byte byFld=-88;
    public volatile int iFld=-151;
    public static int iArrFld[]=new int[N];
    public double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -225);
    }

    public static long iMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        int i6=-20318, i7=5, i8=15244, i9=24593, i10=4767;
        long l1=8841609096048716036L;
        float f=1.275F, f1=104.945F;
        boolean b=false;
        byte by=96;

        Test.dFld = i6;
        i6 -= i6;
        for (l1 = 8; l1 < 228; l1++) {
            f = 1;
            do {
                switch ((int)((l1 % 8) + 55)) {
                case 55:
                    i6 += i7;
                    i7 += (int)(f + l1);
                    break;
                case 56:
                    i8 = 1;
                    do {
                        Test.dFld *= 52;
                        if (b) continue;
                        Test.dFld = i6;
                        Test.instanceCount += i8;
                    } while (++i8 < 1);
                    for (i9 = 1; i9 < 1; ++i9) {
                        f1 -= i7;
                        i10 += (i9 | i10);
                    }
                    break;
                case 57:
                    try {
                        i10 = (2110762723 % i9);
                        i6 = (-102 / i6);
                        Test.iArrFld[(int)(l1)] = (i10 % i7);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 58:
                    Test.instanceCount = -188L;
                    break;
                case 59:
                    i6 = 39954;
                case 60:
                    b = b;
                    break;
                case 61:
                    if (b) break;
                    break;
                case 62:
                    Test.iArrFld[(int)(f)] = (int)1896332694386742866L;
                    break;
                default:
                    by <<= (byte)i10;
                }
            } while (++f < 7);
        }
        vMeth_check_sum += i6 + l1 + i7 + Float.floatToIntBits(f) + i8 + (b ? 1 : 0) + i9 + i10 +
            Float.floatToIntBits(f1) + by;
    }

    public static float fMeth(int i2, long l, int i3) {

        int i4=-38, i5=6, i11=-14, iArr1[]=new int[N];
        double d=0.113285;
        boolean b1=false, bArr[]=new boolean[N];
        long l2=-16856L, lArr[]=new long[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -84.314F);
        FuzzerUtils.init(lArr, -6L);
        FuzzerUtils.init(iArr1, -206);
        FuzzerUtils.init(bArr, false);

        for (i4 = 9; 333 > i4; i4++) {
            i2 += (((i4 * Test.instanceCount) + i3) - i4);
            d -= (fArr[i4]++);
            lArr[i4 - 1] = (iArr1[i4] - Integer.reverseBytes((int)(i3 - Test.instanceCount)));
            vMeth();
            i5 = (int)Test.fFld;
        }
        i2 = (int)Test.instanceCount;
        i3 <<= i4;
        bArr[(i11 >>> 1) % N] = b1;
        Test.instanceCount = i3;
        l2 = 1;
        while (++l2 < 369) {
            Test.dFld = i2;
            Test.instanceCount = i3;
            fArr[(int)(l2)] = l2;
            fArr[(int)(l2 + 1)] += i5;
        }
        long meth_res = i2 + l + i3 + i4 + i5 + Double.doubleToLongBits(d) + i11 + (b1 ? 1 : 0) + l2 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(bArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static int iMeth(int i1) {

        short s=-1909, sArr[]=new short[N];
        int i12=-8, i13=11, i14=7, i15=-9, i16=-8, i17=162;
        boolean b2=false;
        long l3=-4814093469766411738L, lArr1[]=new long[N];
        float fArr1[]=new float[N];

        FuzzerUtils.init(fArr1, -3.10F);
        FuzzerUtils.init(lArr1, 12L);
        FuzzerUtils.init(sArr, (short)-18886);

        fMeth(i1, Test.instanceCount, i1);
        s = (short)-14;
        fArr1[(i1 >>> 1) % N] -= s;
        for (i12 = 2; i12 < 140; i12++) {
            b2 = b2;
            l3 <<= Test.instanceCount;
            for (i14 = 1; i14 < 11; i14++) {
                for (i16 = 1; i16 < 2; i16++) {
                    Test.instanceCount += i14;
                    i15 += (59 + (i16 * i16));
                    i17 = i15;
                    lArr1[i14 - 1] -= 21;
                    sArr[i12] -= s;
                }
                if (b2) break;
                i13 >>= Test.byFld;
            }
        }
        long meth_res = i1 + s + i12 + i13 + (b2 ? 1 : 0) + l3 + i14 + i15 + i16 + i17 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + FuzzerUtils.checkSum(lArr1) +
            FuzzerUtils.checkSum(sArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=254, i18=14, i19=-253, i20=-40413, i21=209, i22=244, i23=224, i24=-4, i25=14, iArr[]=new int[N];
        short s1=-7057;
        long lArr2[]=new long[N];

        FuzzerUtils.init(iArr, 8591);
        FuzzerUtils.init(lArr2, -5082291724697293063L);

        iArr[(i >>> 1) % N] <<= Integer.reverseBytes((++iArr[(i >>> 1) % N]) * (i - i));
        i = (i--);
        Test.instanceCount += Math.min((i + i) - iMeth(-40194), i);
        iArr = iArr;
        Test.iArrFld[(-850 >>> 1) % N] += (int)-49262L;
        for (i18 = 5; i18 < 184; ++i18) {
            i20 = 1;
            while (++i20 < 140) {
                dArrFld[i18] /= ((long)(Test.fFld) | 1);
                i19 *= i18;
            }
            for (i21 = 8; i21 < 140; i21 += 3) {
                lArr2[i18] = Test.byFld;
                Test.instanceCount += i21;
                i22 += (((i21 * i) + i22) - s1);
                i = i18;
                Test.fFld = i21;
                Test.instanceCount = i;
            }
            for (i23 = 2; 140 > i23; i23 += 2) {
                Test.iArrFld[i23 + 1] -= i19;
                switch (((i18 % 2) * 5) + 121) {
                case 130:
                    iFld <<= 59016;
                    break;
                case 122:
                    Test.instanceCount -= i21;
                    Test.instanceCount -= i18;
                    i25 = 1;
                    do {
                        i19 >>= i22;
                        i19 -= i22;
                        iArr[i18 + 1] = (int)Test.instanceCount;
                        i19 += (i25 ^ Test.byFld);
                        Test.dFld += 2612050724L;
                        Test.iArrFld = iArr;
                    } while (++i25 < 3);
                    Test.iArrFld[i23 + 1] -= i25;
                    break;
                default:
                    i22 += (((i23 * Test.instanceCount) + i23) - i);
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
//DEBUG  fMeth ->  fMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
