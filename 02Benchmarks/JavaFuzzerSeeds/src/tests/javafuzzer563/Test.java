package tests.javafuzzer563;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 05:57:34 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=768L;
    public double dFld=102.106357;
    public static int iFld=46927;
    public static int iFld1=72;
    public static float fFld=-1.656F;
    public static volatile boolean bFld=true;
    public static int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -247);
        FuzzerUtils.init(Test.fArrFld, 83.813F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i8, int i9, float f) {

        int i10=0, i11=-191, i12=-47834, i13=-194, i14=8;
        byte by1=-63;
        short s2=-2497;
        boolean b=true;
        double d1=75.41099;

        i8 *= i8;
        for (i10 = 125; i10 > 6; --i10) {
            i12 = 1;
            do {
                Test.instanceCount = by1;
                switch ((i12 % 1) + 75) {
                case 75:
                    i9 += (i12 * s2);
                    break;
                }
                i11 &= s2;
                Test.iFld = s2;
                Test.instanceCount = i8;
                for (i13 = 1; i13 > 1; i13 -= 2) {
                    if (b) break;
                    i9 = i12;
                }
            } while (++i12 < 13);
            Test.iArrFld = Test.iArrFld;
            Test.fArrFld[i10] = (float)d1;
            Test.iFld += 184;
        }
        vMeth2_check_sum += i8 + i9 + Float.floatToIntBits(f) + i10 + i11 + i12 + by1 + s2 + i13 + i14 + (b ? 1 : 0) +
            Double.doubleToLongBits(d1);
    }

    public static void vMeth1(long l, long l1, short s1) {

        int i6=-11005, i7=-64620, i15=7, i16=15, i17=-14;
        double d2=103.91495;
        long lArr[]=new long[N];
        boolean bArr[][]=new boolean[N][N];

        FuzzerUtils.init(lArr, -7463698328160973263L);
        FuzzerUtils.init(bArr, true);

        for (i6 = 132; i6 > 3; i6--) {
            vMeth2(Test.iFld1, i7, Test.fFld);
            Test.iFld1 += (((i6 * i6) + i7) - i6);
            for (i15 = 1; i15 < 12; ++i15) {
                Test.iFld1 += (((i15 * Test.iFld1) + i6) - i15);
                l = i16;
                i7 = Test.iFld1;
            }
        }
        Test.iArrFld[(Test.iFld1 >>> 1) % N] = 4;
        i17 = 1;
        do {
            Test.iArrFld[i17] = (int)Test.fFld;
            d2 += d2;
            switch ((i17 % 6) + 103) {
            case 103:
                i7 = (int)l;
                break;
            case 104:
                Test.iFld = i17;
                Test.iArrFld[i17 + 1] -= (int)Test.fFld;
                break;
            case 105:
                lArr[i17] = i15;
                break;
            case 106:
                i16 += i15;
                break;
            case 107:
                i7 += (((i17 * Test.iFld1) + Test.iFld1) - Test.iFld1);
            case 108:
                Test.iFld1 += (i17 - l1);
                break;
            default:
                bArr[i17 - 1] = bArr[i17 - 1];
            }
        } while (++i17 < 200);
        vMeth1_check_sum += l + l1 + s1 + i6 + i7 + i15 + i16 + i17 + Double.doubleToLongBits(d2) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(bArr);
    }

    public static void vMeth(double d) {

        int i3=-39338, i4=-29277, i5=110;
        short s3=-25645;
        byte by2=8;
        float f1=-22.153F;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -7333L);

        i3 = 1;
        while (++i3 < 218) {
            Test.instanceCount += (++Test.iFld);
        }
        for (i4 = 7; i4 < 174; i4++) {
            switch (((i4 % 7) * 5) + 17) {
            case 42:
                vMeth1(111L, Test.instanceCount, s3);
                Test.iFld += i4;
                lArr1[i4 - 1] -= Test.iFld1;
                Test.iFld *= by2;
            case 30:
                Test.instanceCount -= 5269;
                if (Test.bFld) {
                    i5 = Test.iFld;
                    Test.fArrFld[i4] *= 12366;
                }
                f1 = 1;
                while (++f1 < 9) {
                    Test.instanceCount *= Test.instanceCount;
                    Test.iFld1 = i4;
                }
                break;
            case 21:
                Test.iFld = (int)Test.instanceCount;
                break;
            case 36:
                Test.iFld -= (int)Test.instanceCount;
                break;
            case 48:
                Test.fFld = Test.fFld;
                break;
            case 47:
                Test.iArrFld[i4] = -183;
                break;
            case 44:
                if (Test.bFld) continue;
                break;
            default:
                lArr1[i4 + 1] = Test.iFld;
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i3 + i4 + i5 + s3 + by2 + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(lArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=156, i1=-10, i2=5315, i19=13, i20=7, i21=218, i22=57, i23=6, i24=-253;
        short s=20447;
        byte by=-110;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -10.26574);

        for (i = 4; i < 289; i++) {
            i2 = 1;
            do {
                i1 += (i2 * Test.instanceCount);
                i1 = (int)Test.instanceCount;
                if (s < i1) continue;
                i1 += (((i2 * s) + by) - Test.instanceCount);
                if (i2 >= 60149) continue;
                i1 += (int)(((i1 - i2) * (dFld + 3L)) % (((i1++) - (Test.iArrFld[i2]--)) | 1));
                i1 += (int)(((i1 = s) - (++Test.iArrFld[i - 1])) * ((++Test.instanceCount) - (Test.instanceCount +
                    Test.instanceCount)));
                Test.instanceCount <<= (i1++);
            } while (++i2 < 88);
            vMeth(dFld);
            for (i19 = 3; i19 < 88; ++i19) {
                Test.iArrFld[i - 1] += (int)Test.instanceCount;
                Test.instanceCount *= 5;
                Test.instanceCount += (((i19 * Test.instanceCount) + i19) - Test.instanceCount);
                if (Test.bFld) {
                    for (i21 = 2; i21 > i; --i21) {
                        dArr[i21 - 1] = Test.instanceCount;
                    }
                    Test.fArrFld = Test.fArrFld;
                    Test.iFld1 = s;
                    for (i23 = 1; i23 < 2; i23++) {
                        Test.instanceCount += i22;
                        Test.iArrFld[i23] -= i22;
                        i1 = i22;
                        i22 = i;
                        i1 -= (int)Test.fFld;
                        Test.fFld = -32431;
                        Test.fFld += 47L;
                        i1 = i22;
                    }
                }
                i20 += (i19 * i19);
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}