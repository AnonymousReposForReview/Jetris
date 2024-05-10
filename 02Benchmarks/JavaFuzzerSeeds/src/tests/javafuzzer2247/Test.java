package tests.javafuzzer2247;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 10:57:22 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=6L;
    public static boolean bFld=false;
    public static volatile short sFld=22024;
    public volatile double dFld=102.50386;
    public static float fFld=-124.445F;
    public static int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 14169);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l, float f, short s) {

        int i3=-59358, i4=-14, i5=0, i6=87, i7=53869, i8=-5184;
        long lArr[]=new long[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(lArr, 39139L);
        FuzzerUtils.init(bArr, true);

        Test.instanceCount = l;
        i3 += i3;
        i4 = 1;
        while (++i4 < 218) {
            Test.iArrFld[i4 + 1][i4] = s;
            for (i5 = 7; i5 > 1; i5 -= 2) {
                f *= 2493216923884874105L;
                i6 += (i5 + i5);
                i7 = 3;
                while ((i7 -= 3) > 0) {
                    s += (short)i8;
                    Test.iArrFld[i7][(i6 >>> 1) % N] >>= s;
                    lArr = lArr;
                    l += i7;
                    i6 += i7;
                    i3 = i3;
                    bArr[i5 - 1] = Test.bFld;
                }
            }
        }
        vMeth1_check_sum += l + Float.floatToIntBits(f) + s + i3 + i4 + i5 + i6 + i7 + i8 + FuzzerUtils.checkSum(lArr)
            + FuzzerUtils.checkSum(bArr);
    }

    public static int iMeth(int i1, int i2) {

        float f1=0.871F;

        vMeth1(Test.instanceCount, f1, Test.sFld);
        long meth_res = i1 + i2 + Float.floatToIntBits(f1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth() {

        int i9=-12, i10=-9, i11=-184, i12=-219, i13=7368, i14=31913;
        float f2=-12.783F;

        Test.instanceCount -= iMeth(i9, i9);
        Test.iArrFld[(i9 >>> 1) % N][(i9 >>> 1) % N] &= (int)Test.instanceCount;
        f2 = i9;
        Test.bFld = Test.bFld;
        for (i10 = 7; 262 > i10; i10++) {
            for (i12 = 1; i12 < 6; i12++) {
                i14 = 2;
                while (--i14 > 0) {
                    i13 = (int)-58L;
                    Test.instanceCount <<= i14;
                    i13 += i14;
                    if (Test.bFld) continue;
                    i11 <<= (int)Test.instanceCount;
                    f2 *= Test.instanceCount;
                }
                if (i12 != 0) {
                    vMeth_check_sum += i9 + Float.floatToIntBits(f2) + i10 + i11 + i12 + i13 + i14;
                    return;
                }
                i9 >>= (int)Test.instanceCount;
            }
        }
        vMeth_check_sum += i9 + Float.floatToIntBits(f2) + i10 + i11 + i12 + i13 + i14;
    }

    public void mainTest(String[] strArr1) {

        int i=-64273, i15=-7, i16=-59, i17=-105, i18=13, i19=5, i20=18;
        double dArr[]=new double[N];
        long lArr1[]=new long[N];
        boolean bArr1[]=new boolean[N];

        FuzzerUtils.init(dArr, 0.71274);
        FuzzerUtils.init(lArr1, 8501442104649394078L);
        FuzzerUtils.init(bArr1, false);

        dArr[(i >>> 1) % N] -= Test.instanceCount;
        vMeth();
        for (i15 = 9; i15 < 287; i15++) {
            for (i17 = 90; 4 < i17; i17 -= 2) {
                Test.iArrFld[i15 - 1][i17 - 1] *= (int)dFld;
                i = i16;
                for (i19 = 1; 3 > i19; i19++) {
                    i18 += i19;
                    Test.instanceCount += i16;
                    if (Test.bFld) continue;
                    switch ((i17 % 2) + 93) {
                    case 93:
                        i18 -= i20;
                        lArr1[i15] = i15;
                        bArr1[i17] = Test.bFld;
                        i18 = (int)Test.instanceCount;
                        break;
                    case 94:
                    default:
                    }
                    i18 = 1;
                    switch (((i18 >>> 1) % 5) + 115) {
                    case 115:
                        i18 >>= i20;
                        i18 += i19;
                        break;
                    case 116:
                        i16 = i19;
                        i18 += 2;
                        i20 <<= i20;
                        Test.instanceCount += (i19 * i18);
                        break;
                    case 117:
                        Test.fFld += (((i19 * Test.instanceCount) + Test.fFld) - i);
                        switch ((i17 % 2) + 13) {
                        case 13:
                            dFld = Test.fFld;
                            i18 = i;
                        case 14:
                            if (Test.bFld) {
                                Test.instanceCount += i19;
                                i <<= i17;
                            } else {
                                Test.instanceCount -= i19;
                            }
                            break;
                        default:
                            i16 += (i19 * i19);
                        }
                        break;
                    case 118:
                        Test.fFld += 11;
                        break;
                    case 119:
                        Test.iArrFld[i15][i15 + 1] += i17;
                    default:
                        i16 = -14;
                    }
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}