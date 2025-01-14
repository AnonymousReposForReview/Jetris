package tests.javafuzzer2120;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 09:12:55 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=30740L;
    public static int iFld=-17;
    public static int iFld1=-166;
    public static byte byFld=68;
    public static double dArrFld[]=new double[N];
    public static short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 0.119552);
        FuzzerUtils.init(Test.sArrFld, (short)2851);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(byte by, byte by1) {

        int i2=-133, i3=-192, i4=-136;
        long l1=39940L, lArr[]=new long[N];
        float f1=-21.184F;

        FuzzerUtils.init(lArr, -4035403219553071668L);

        i2 = 245;
        do {
            i3 = by1;
            i3 += i2;
            for (l1 = 1; l1 < 7; l1++) {
                f1 += (l1 + i3);
                i3 *= i4;
                i4 -= -6;
                i4 -= i4;
                f1 += i3;
                if (true) continue;
                i3 = i2;
                i4 *= 15405;
                lArr[i2] = (long)f1;
                i3 *= i4;
            }
            i3 -= i4;
        } while (--i2 > 0);
        vMeth2_check_sum += by + by1 + i2 + i3 + l1 + i4 + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(long l) {

        byte by2=43;
        int iArr[]=new int[N];

        FuzzerUtils.init(iArr, -27011);

        vMeth2(by2, by2);
        iArr[(Test.iFld >>> 1) % N] /= (int)(Test.iFld1 | 1);
        vMeth1_check_sum += l + by2 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(float f) {

        int i=-36304, i1=10, i5=14, i6=47593, i7=6, i8=-2748;
        double d=0.122194;
        short s=23032;
        boolean b=false;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-2);

        byArr[(i >>> 1) % N] = (byte)i;
        i1 = 1;
        do {
            vMeth1(Test.instanceCount);
        } while (++i1 < 384);
        for (i5 = 1; i5 < 153; i5++) {
            f = -46436L;
            i6 *= (int)f;
            Test.dArrFld[i5] -= d;
            i = Test.byFld;
            Test.sArrFld[i5 + 1] = (short)Test.instanceCount;
            for (i7 = 1; i7 < 10; ++i7) {
                if (b) {
                    s ^= (short)i5;
                    Test.instanceCount = -12;
                    Test.iFld += (i7 ^ Test.iFld1);
                    i6 += (((i7 * Test.instanceCount) + Test.instanceCount) - i6);
                }
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i + i1 + i5 + i6 + Double.doubleToLongBits(d) + i7 + i8 + s + (b ?
            1 : 0) + FuzzerUtils.checkSum(byArr);
    }

    public void mainTest(String[] strArr1) {

        float f2=-67.985F, fArr[]=new float[N];
        int i9=15815, i10=5, i11=2, i12=-53372, i13=-40088, i14=1, i15=-81, i16=-102, i17=14, i18=-21092, i19=-1,
            i20=140, iArr1[]=new int[N];
        long l2=4125013590384275825L;
        double d1=-18.81278;
        short s1=1409;

        FuzzerUtils.init(iArr1, 11);
        FuzzerUtils.init(fArr, 1.505F);

        vMeth(f2);
        Test.iFld = (int)Test.instanceCount;
        for (i9 = 13; i9 < 210; ++i9) {
            iArr1[i9] = Test.byFld;
            switch (((i9 >>> 1) % 2) + 106) {
            case 106:
                for (i11 = 7; i11 < 127; ++i11) {
                    Test.instanceCount -= Test.instanceCount;
                    for (i13 = 2; i13 > 1; --i13) {
                        Test.iFld = i11;
                        Test.iFld += 12314;
                        i12 = Test.iFld;
                        f2 = (float)-40.52591;
                        fArr[i9 + 1] -= -250;
                        iArr1 = iArr1;
                    }
                }
                iArr1[i9 + 1] *= i13;
                break;
            case 107:
                for (l2 = 4; l2 < 127; ++l2) {
                    d1 = i11;
                    f2 += l2;
                    Test.iFld += Test.iFld1;
                    if (false) continue;
                    i10 *= i11;
                    s1 -= (short)i10;
                    i12 += 246;
                }
            default:
                Test.iFld1 *= (int)f2;
                i12 *= s1;
                for (i16 = 5; i16 < 127; ++i16) {
                    for (i18 = 1; i18 < 2; i18++) {
                        Test.instanceCount *= -125688218L;
                        i20 <<= Test.iFld1;
                        fArr[i9] += l2;
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
