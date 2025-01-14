package tests.javafuzzer992;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 12:38:21 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-6L;
    public static short sFld=27833;
    public boolean bFld=true;
    public static int iFld=9;
    public volatile float fFld=0.357F;
    public int iFld1=-32363;
    public static long lArrFld[]=new long[N];
    public static float fArrFld[][]=new float[N][N];
    public static volatile int iArrFld[]=new int[N];
    public double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -60021L);
        FuzzerUtils.init(Test.fArrFld, -1.570F);
        FuzzerUtils.init(Test.iArrFld, 6);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(byte by) {

        int i3=228, i4=60685, i5=-3149, i6=-12;
        float f=-29.191F;
        boolean b=false;
        double d=-1.79884;

        for (i3 = 363; i3 > 5; i3--) {
            i4 ^= i3;
            for (i5 = 1; i5 < 5; i5++) {
                Test.instanceCount += (((i5 * i4) + f) - i6);
                i4 *= i3;
                switch (((i3 % 2) * 5) + 89) {
                case 93:
                    i4 += (-29473 + (i5 * i5));
                    i4 -= -119;
                    break;
                case 96:
                    i6 += (i5 ^ (long)f);
                }
                i4 += (i5 * i5);
                i4 *= -102;
            }
            if (b) break;
            f += (((i3 * Test.instanceCount) + Test.instanceCount) - f);
            Test.lArrFld[i3 + 1] += (long)d;
            i6 += (int)65368821L;
        }
        vMeth2_check_sum += by + i3 + i4 + i5 + i6 + Float.floatToIntBits(f) + (b ? 1 : 0) + Double.doubleToLongBits(d);
    }

    public void vMeth1() {

        float f1=-1.607F;
        int i7=3650, i8=53567, i9=23931, i10=-11, i11=-55444, i12=-7, iArr[]=new int[N];
        double d1=0.119749;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(iArr, 14);
        FuzzerUtils.init(bArr, false);

        vMeth2((byte)(9));
        for (f1 = 2; f1 < 231; ++f1) {
            for (i8 = (int)(f1); i8 < 7; i8++) {
                for (i10 = 1; 1 > i10; ++i10) {
                    byte by1=-72;
                    iArr[(int)(f1 + 1)] *= (int)Test.instanceCount;
                    Test.instanceCount /= (i7 | 1);
                    i9 += (i10 | i7);
                    bArr[i10 + 1] = true;
                    Test.instanceCount = (long)d1;
                    by1 >>= (byte)Test.instanceCount;
                    i7 += i9;
                }
                i12 = 1;
                while (++i12 < 1) {
                    Test.instanceCount *= i10;
                    Test.instanceCount = -2;
                    Test.fArrFld[i8 - 1][(int)(f1 + 1)] = i11;
                }
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f1) + i7 + i8 + i9 + i10 + i11 + Double.doubleToLongBits(d1) + i12 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(bArr);
    }

    public void vMeth(long l, int i) {

        int i1=-9182, i2=-53353, i13=-14, i14=-132, i15=0;
        float f2=-107.548F, f3=112.830F;
        double d2=-1.69678;

        for (i1 = 14; i1 < 247; ++i1) {
            vMeth1();
            f2 = i2;
            Test.lArrFld[i1 + 1] = Test.instanceCount;
            for (i13 = 1; i13 < 7; ++i13) {
                for (f3 = i1; f3 < 2; ++f3) {
                    Test.iArrFld[i13 + 1] = (int)Test.instanceCount;
                    i2 = i14;
                    i2 = i1;
                    f2 *= i14;
                    f2 += (f3 * i15);
                    l += (long)(((f3 * i) + i1) - i2);
                    Test.instanceCount += (long)86.980F;
                    l += (long)d2;
                    i2 <<= i14;
                }
            }
        }
        vMeth_check_sum += l + i + i1 + i2 + Float.floatToIntBits(f2) + i13 + i14 + Float.floatToIntBits(f3) + i15 +
            Double.doubleToLongBits(d2);
    }

    public void mainTest(String[] strArr1) {

        int i16=-10, i17=48932, i18=-155, i19=-31, i20=-45524, i21=-242, i22=-5, i23=-244, i24=-29;
        double d4=75.34412;

        vMeth(Test.instanceCount, i16);
        for (i17 = 16; 292 > i17; i17 += 2) {
            i16 -= i16;
            Test.iArrFld[i17 + 1] *= i17;
            switch ((i17 % 2) + 87) {
            case 87:
                Test.sFld += (short)(98 + (i17 * i17));
            case 88:
                Test.lArrFld[i17 + 1] += i16;
                i18 = (int)Test.instanceCount;
                i19 = 1;
                while (++i19 < 182) {
                    i16 = 11760;
                    Test.iArrFld[i19 - 1] -= i18;
                }
                i16 = i18;
                break;
            }
            for (i20 = 9; i20 < 182; i20++) {
                switch (((i20 % 1) * 5) + 30) {
                case 35:
                    if (bFld) break;
                    Test.instanceCount -= -125;
                    break;
                default:
                    i21 = i19;
                    i16 = Test.iFld;
                    for (i22 = 1; i22 < 2; i22++) {
                        i16 -= i23;
                        i23 -= (int)fFld;
                        Test.fArrFld[i17][i20 - 1] += (float)d4;
                        Test.iFld = (int)fFld;
                    }
                    Test.instanceCount &= iFld1;
                }
                i24 = 1;
                while (++i24 < 2) {
                    if (bFld) break;
                    Test.sFld += (short)(((i24 * i17) + Test.instanceCount) - i23);
                    i18 >>= (int)Test.instanceCount;
                }
                Test.instanceCount += Test.instanceCount;
                Test.sFld += (short)13;
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
