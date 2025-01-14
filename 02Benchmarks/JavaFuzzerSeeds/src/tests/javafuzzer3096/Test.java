package tests.javafuzzer3096;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 01:35:18 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-142L;
    public static float fFld=24.718F;
    public static short sFld=11714;
    public static boolean bFld=false;
    public static double dFld=1.85032;
    public static volatile byte byFld=25;
    public static boolean bFld1=false;
    public static int iArrFld[]=new int[N];
    public static volatile long lArrFld[][]=new long[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 0);
        FuzzerUtils.init(Test.lArrFld, 43L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static void vMeth1() {

        int i1=8, i2=6, iArr[]=new int[N];

        FuzzerUtils.init(iArr, -6263);

        for (i1 = 3; i1 < 334; i1++) {
            i2 += (((i1 * i2) + i2) - Test.fFld);
            iArr[i1 + 1] = (int)(((Test.sFld = (short)i2) - (i2 - Test.instanceCount)) & i2);
            Test.fFld %= (((long)(i1 + Test.fFld)) | 1);
        }
        vMeth1_check_sum += i1 + i2 + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth() {

        int i3=29, i4=7, i6=-132, i7=74, iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, 4687);

        for (i3 = 6; 124 > i3; ++i3) {
            Test.instanceCount = (++iArr1[i3 + 1]);
        }
        for (int i5 : iArr1) {
            Test.instanceCount += i5;
            i4 = (iArr1[(i5 >>> 1) % N] += iArr1[(i3 >>> 1) % N]);
            vMeth1();
            if (i5 != 0) {
            }
            i4 = 46525;
            iArr1[(204 >>> 1) % N] = (int)Test.instanceCount;
            for (i6 = 1; 4 > i6; ++i6) {
                double d=23.24994;
                Test.fFld -= i5;
                switch (((i6 % 5) * 5) + 121) {
                case 133:
                    d += i7;
                    i5 += (int)Test.instanceCount;
                    Test.bFld = Test.bFld;
                    break;
                case 144:
                    Test.instanceCount += (long)Test.fFld;
                case 142:
                    i7 = i3;
                    break;
                case 130:
                    iArr1[i6 - 1] = (int)Test.instanceCount;
                case 137:
                }
            }
        }
        long meth_res = i3 + i4 + i6 + i7 + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(long l, int i) {

        int i8=35, i9=14, i10=48672, i11=-18499, i12=1465, i13=-9;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 58.951F);

        vMeth1();
        switch (((iMeth() >>> 1) % 5) + 38) {
        case 38:
            Test.instanceCount -= (long)Test.fFld;
            break;
        case 39:
            Test.iArrFld[(i >>> 1) % N] = i;
            for (i8 = 210; 7 < i8; i8--) {
                Test.dFld -= i8;
                for (i10 = 1; i10 < 8; i10 += 3) {
                    fArr[i8] -= (float)Test.dFld;
                    Test.fFld = i10;
                    Test.fFld += i10;
                    Test.iArrFld[i10 + 1] >>= (int)l;
                    for (i12 = 1; i12 < 4; i12++) {
                        Test.lArrFld[i12 + 1][i10] += (long)Test.fFld;
                        i = i11;
                        Test.bFld = Test.bFld;
                    }
                }
            }
        case 40:
            i13 >>= (int)l;
            break;
        case 41:
            l /= -2;
        case 42:
            i11 <<= i;
            break;
        }
        vMeth_check_sum += l + i + i8 + i9 + i10 + i11 + i12 + i13 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        float f=2.323F;
        int i15=38504, i16=0, i17=213, i18=6411, i19=-39525, i20=51979, i21=53585, i22=12, i23=-159, i24=39477,
            i25=-24113, i26=0, i27=3;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 1.16854);

        vMeth(Test.instanceCount, -88);
        try {
            for (f = 2; (192 + 400) > f; ++f) {
                for (i16 = 63; i16 > 3; i16 -= 3) {
                    i17 -= i17;
                    Test.lArrFld[(int)(f - 1)][(int)(f + 1)] <<= 163;
                    i17 = i15;
                    i15 -= i15;
                    for (i18 = 1; i18 < (4 + 400); i18++) {
                        dArr[i18] %= -1255;
                    }
                    i15 -= i15;
                    i19 += i17;
                    i19 *= i15;
                    for (i20 = 4 + 400; i20 > f; i20 -= 3) {
                        Test.byFld += (byte)(i20 ^ Test.instanceCount);
                        Test.bFld1 = Test.bFld;
                        Test.instanceCount /= (i22 | 1);
                    }
                    Test.lArrFld[(int)(f)][(i15 >>> 1) % N] = i18;
                }
                i15 = 11017;
                Test.iArrFld[(int)(f + 1)] += i21;
                for (i23 = 1; i23 < (63 + 400); i23++) {
                    i22 += (7 + (i23 * i23));
                    i19 += (int)47596L;
                    i15 = i18;
                    switch (((i23 % 3) * 5) + 32) {
                    case 44:
                        i15 = i24;
                        break;
                    case 35:
                        for (i25 = (int)(f); i25 < (1 + 400); i25++) {
                            Test.instanceCount = i24;
                            Test.lArrFld[i25 - 1][i25 + 1] = i18;
                            Test.instanceCount = i26;
                        }
                    case 38:
                        i26 -= i26;
                        break;
                    default:
                        i19 += i27;
                    }
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException exc1) {
            i24 -= 0;
        }
        finally {
            i26 >>= i22;
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest iMeth
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
