package tests.javafuzzer1356;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 18:38:50 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-8756172540024839262L;
    public static boolean bFld=true;
    public static float fFld=-49.401F;
    public volatile double dFld=-15.50202;
    public static int iArrFld[][]=new int[N][N];
    public static byte byArrFld[]=new byte[N];
    public static volatile boolean bArrFld[]=new boolean[N];
    public int iArrFld1[]=new int[N];
    public long lArrFld[][]=new long[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 7);
        FuzzerUtils.init(Test.byArrFld, (byte)36);
        FuzzerUtils.init(Test.bArrFld, true);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i2, long l) {

        int i3=-15310, i4=14, i5=9, i6=113, i7=-9;
        float f=-113.223F;
        byte by1=-107;

        for (i3 = 161; i3 > 2; i3 -= 3) {
            Test.byArrFld[i3] = (byte)49;
            i5 = 1;
            while (++i5 < 29) {
                i6 += i6;
                if (Test.bFld) {
                    for (f = 1; f < 1; ++f) {
                        if (i4 != 0) {
                            vMeth_check_sum += i2 + l + i3 + i4 + i5 + i6 + Float.floatToIntBits(f) + i7 + by1;
                            return;
                        }
                        i2 = -54;
                        i6 += (int)(f + Test.instanceCount);
                        i6 &= (int)Test.instanceCount;
                        l = Test.instanceCount;
                    }
                    if (true) continue;
                } else if (true) {
                    Test.byArrFld[i3] = (byte)i3;
                    i2 += i3;
                    by1 = (byte)i4;
                }
            }
        }
        vMeth_check_sum += i2 + l + i3 + i4 + i5 + i6 + Float.floatToIntBits(f) + i7 + by1;
    }

    public static int iMeth1(int i1) {

        int i8=-7, i9=0, i10=-29803, i11=222, i12=5;
        short s=17629;

        Test.iArrFld[(i1 >>> 1) % N][(i1 >>> 1) % N] = (int)(Float.intBitsToFloat(i1) + (--i1));
        vMeth(i1, Test.instanceCount);
        for (i8 = 7; i8 < 136; ++i8) {
            Test.bArrFld[i8 - 1] = Test.bFld;
            i9 -= i1;
            for (i10 = 1; i10 < 12; i10++) {
                if (true) {
                    s = (short)1.774F;
                    if (Test.bFld) continue;
                    Test.iArrFld[i8 + 1][i10 + 1] += i9;
                } else if (true) {
                    if (i9 != 0) {
                    }
                } else if (Test.bFld) {
                    i12 += i10;
                } else {
                    i11 *= i12;
                }
                Test.instanceCount += i11;
                i12 += (((i10 * Test.instanceCount) + i1) - i11);
            }
        }
        long meth_res = i1 + i8 + i9 + i10 + i11 + s + i12;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(byte by) {

        int i13=-45109, i14=246, i15=24309, i16=-60353, i17=6, i18=145;
        double d=0.96329;

        Test.instanceCount += iMeth1(-9);
        for (i13 = 6; i13 < 255; i13++) {
            d *= i13;
            i14 += i13;
            Test.fFld = (float)d;
            switch ((i13 % 1) + 107) {
            case 107:
                i15 = 1;
                while (++i15 < 7) {
                    Test.iArrFld[i13][i15] -= (int)d;
                    for (i16 = i15; i16 < 1; ++i16) {
                        i14 <<= i17;
                        Test.fFld *= i16;
                        Test.instanceCount *= i18;
                    }
                    i18 -= i17;
                    i18 |= i18;
                    i18 = (int)Test.instanceCount;
                }
                break;
            default:
                Test.instanceCount = i14;
            }
        }
        long meth_res = by + i13 + i14 + Double.doubleToLongBits(d) + i15 + i16 + i17 + i18;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=5, i19=14, i20=-33466, i21=-64532, i22=-7, i23=4167, i24=7086, i25=-11;
        byte by2=-99;
        long l1=-158L;
        float f1=97.720F, fArr[]=new float[N];
        short s1=13836;

        FuzzerUtils.init(fArr, 1.813F);

        Test.iArrFld[(i >>> 1) % N][(i >>> 1) % N] -= iMeth(by2);
        for (i19 = 381; 10 < i19; i19 -= 3) {
            for (l1 = 7; l1 < 204; ++l1) {
                for (i22 = 1; i22 < 2; i22++) {
                    Test.bArrFld[i19 - 1] = Test.bFld;
                    Test.instanceCount = i19;
                    Test.instanceCount = i;
                    i23 = (int)Test.fFld;
                    if (Test.bFld) continue;
                    dFld *= i19;
                    i21 += (i22 * i22);
                    i23 &= i19;
                }
            }
            i21 <<= i19;
            fArr = fArr;
            for (f1 = 10; f1 < 204; ++f1) {
                i25 = 1;
                while (++i25 < 2) {
                    i24 -= i21;
                    dFld = i;
                    Test.instanceCount = i21;
                    i23 = (int)-30.95F;
                    by2 += (byte)s1;
                    dFld *= l1;
                    i24 += (i25 + i19);
                    iArrFld1[i19 - 1] = i20;
                }
                Test.fFld /= (float)2.108293;
                i21 += (int)(f1 * f1);
                i24 <<= (int)Test.instanceCount;
            }
            i21 = (int)Test.instanceCount;
            lArrFld[i19][i19] = l1;
            i24 += (int)Test.instanceCount;
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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
