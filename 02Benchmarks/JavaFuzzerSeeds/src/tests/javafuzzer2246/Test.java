package tests.javafuzzer2246;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 10:57:20 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3607398095L;
    public float fFld=0.919F;
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 47.500F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i9) {

        int i10=-177, i11=-77, i12=178, i13=-123, i14=196, i15=10;
        byte by=115;
        float f1=2.550F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -57773L);

        i10 = 1;
        while (++i10 < 353) {
            switch ((i10 % 9) + 40) {
            case 40:
                Test.instanceCount = i9;
                break;
            case 41:
                i11 -= i11;
                for (i12 = 1; 5 > i12; i12++) {
                    i11 >>= -184;
                }
                i13 -= (int)Test.instanceCount;
                break;
            case 42:
                lArr[i10 - 1] -= -14;
                Test.instanceCount += (i10 - i9);
                Test.instanceCount <<= by;
                break;
            case 43:
                i9 >>>= by;
            case 44:
                for (i14 = 1; i14 < 5; i14++) {
                    Test.instanceCount *= (long)f1;
                    i13 += (((i14 * Test.instanceCount) + f1) - Test.instanceCount);
                    if (i15 != 0) {
                    }
                }
            case 45:
                if (i13 != 0) {
                }
                break;
            case 46:
                Test.instanceCount += 22878;
                break;
            case 47:
            case 48:
                lArr[i10] = i10;
                break;
            default:
                lArr[i10 + 1] = 2578578523474371021L;
            }
        }
        long meth_res = i9 + i10 + i11 + i12 + i13 + by + i14 + i15 + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1(float f, int i7, long l) {

        int i8=-25, i16=7, i17=11, iArr1[]=new int[N];
        long l1=-3960169661824279190L, lArr1[]=new long[N];
        boolean b=true;

        FuzzerUtils.init(iArr1, 1544);
        FuzzerUtils.init(lArr1, 50L);

        i8 = 232;
        do {
            iArr1[i8] -= (int)(f - (-26294 - lMeth(-148)));
            i16 = 1;
            do {
                for (l1 = 1; l1 < 1; l1++) {
                    iArr1[(int)(l1)] += i16;
                    i17 += (int)(((l1 * i8) + i17) - i16);
                    i7 -= (int)84.1013F;
                    f = Test.instanceCount;
                    f = -5384;
                    l += (long)f;
                    i17 >>>= i16;
                    if (b) {
                        lArr1[(int)(l1 - 1)] = i7;
                        Test.instanceCount -= (long)f;
                        iArr1[i8] += (int)l1;
                    } else if (b) {
                        i17 += (int)l1;
                    } else {
                        i17 += (int)(((l1 * i7) + l1) - i16);
                    }
                }
            } while (++i16 < 7);
        } while (--i8 > 0);
        vMeth1_check_sum += Float.floatToIntBits(f) + i7 + l + i8 + i16 + l1 + i17 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr1);
    }

    public void vMeth(int i3, int i4) {

        int i5=171, i6=5018;

        Test.fArrFld = (Test.fArrFld = (Test.fArrFld = (Test.fArrFld = Test.fArrFld)));
        for (i5 = 4; 215 > i5; ++i5) {
            vMeth1(fFld, i5, -2178992895L);
        }
        fFld += i4;
        vMeth_check_sum += i3 + i4 + i5 + i6;
    }

    public void mainTest(String[] strArr1) {

        int i=59, i1=12, i2=-1557, i18=-8, i19=13414, i20=183, iArr[]=new int[N];
        long l2=-49533L;
        byte by1=35;
        boolean b1=false;
        double d=-24.63197, dArr[]=new double[N];

        FuzzerUtils.init(dArr, 0.29268);
        FuzzerUtils.init(iArr, 57149);

        dArr[(i >>> 1) % N] = ((--Test.instanceCount) * (--iArr[(i >>> 1) % N]));
        for (i1 = 294; i1 > 6; --i1) {
            if (b1) {
                vMeth(i2, i2);
                i18 = 1;
                do {
                    i >>= i1;
                    for (l2 = i1; l2 < 1; l2++) {
                        i2 += (int)l2;
                        i += (int)(((l2 * i19) + i1) - i2);
                        i2 -= 3;
                        try {
                            i2 = (-147 % i);
                            iArr[i1 - 1] = (i2 / 217);
                            i2 = (i18 / i1);
                        } catch (ArithmeticException a_e) {}
                        i2 += (int)(l2 | l2);
                        i -= (int)l2;
                        i2 += i2;
                        i += (-1 + (l2 * l2));
                        i += (int)(l2 * by1);
                        i2 <<= i2;
                    }
                    if (b1) break;
                    fFld += i;
                    if (b1) break;
                    i += i18;
                    fFld += ((long)i18 ^ (long)fFld);
                    if (b1) {
                        by1 *= by1;
                        Test.instanceCount += i18;
                        i19 = (int)Test.instanceCount;
                        iArr[i1] = (int)1.622F;
                    }
                    for (d = 1; 1 > d; d++) {
                        i -= -11;
                        i2 += i20;
                    }
                } while (++i18 < 87);
            } else {
                i19 = i1;
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}