package tests.javafuzzer376;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 03:01:06 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=5098L;
    public static int iFld=-12;
    public static byte byFld=-98;
    public int iFld1=-14;
    public static long lFld=30L;
    public static boolean bFld=true;
    public short sFld=4805;
    public static float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.fArrFld, -5.282F);
        FuzzerUtils.init(Test.iArrFld, -26);
        FuzzerUtils.init(Test.lArrFld, 12L);
    }

    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f2) {

        short s=30462;
        byte by1=97;
        float f3=19.956F;
        int i6=249, i7=-11801, i8=-223, i9=-47030, iArr1[]=new int[N];
        double d=0.14258;
        boolean b=false;

        FuzzerUtils.init(iArr1, 173);

        Test.iFld >>= (int)Test.instanceCount;
        Test.iFld += s;
        Test.iFld = Test.iFld;
        Test.instanceCount += Test.instanceCount;
        f2 *= by1;
        for (f3 = 9; f3 < 178; ++f3) {
            i7 = 1;
            while ((i7 += 2) < 9) {
                Test.fArrFld = Test.fArrFld;
                i6 *= (int)d;
            }
            b = b;
            iArr1[(int)(f3)] >>= i7;
            for (i8 = 1; i8 < 9; i8++) {
                iArr1[(int)(f3)] *= by1;
                iArr1[i8] = i9;
                Test.instanceCount += i8;
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f2) + s + by1 + Float.floatToIntBits(f3) + i6 + i7 +
            Double.doubleToLongBits(d) + (b ? 1 : 0) + i8 + i9 + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i5, float f1) {

        int i10=-149, i11=12992, i12=-15876, i13=7;
        double d1=-116.16664, d2=-1.8863;
        byte by2=-117;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -8804381154622132472L);

        vMeth1(f1);
        Test.instanceCount = i5;
        f1 *= i5;
        lArr[(Test.iFld >>> 1) % N] >>= Test.iFld;
        Test.instanceCount = Test.instanceCount;
        i10 = 1;
        while (++i10 < 386) {
            d1 -= Test.iFld;
            for (d2 = 1; d2 < 4; d2++) {
                Test.instanceCount += Test.iFld;
                Test.instanceCount -= 9;
                for (i12 = 1; 2 > i12; ++i12) {
                    Test.instanceCount <<= by2;
                    i13 += (((i12 * Test.instanceCount) + i5) - i10);
                    i11 += i12;
                    i13 >>= i10;
                }
            }
        }
        vMeth_check_sum += i5 + Float.floatToIntBits(f1) + i10 + Double.doubleToLongBits(d1) +
            Double.doubleToLongBits(d2) + i11 + i12 + i13 + by2 + FuzzerUtils.checkSum(lArr);
    }

    public static double dMeth(int i3, int i4, long l) {

        int i14=36321, i15=-86, i16=8;
        float f4=-59.89F;
        boolean b1=false;
        double d3=-27.41862;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 511932774L);

        vMeth(Test.iFld, 18.71F);
        Test.iFld = (int)Test.instanceCount;
        for (i14 = 4; i14 < 226; i14++) {
            switch (((2 >>> 1) % 2) + 61) {
            case 61:
                switch (((i14 % 2) * 5) + 88) {
                case 97:
                    f4 = Test.instanceCount;
                    switch (((49700 >>> 1) % 2) + 1) {
                    case 1:
                        Test.iFld *= -36553;
                        Test.iArrFld[i14 + 1] *= (int)f4;
                        switch (((i14 % 3) * 5) + 85) {
                        case 90:
                            i16 = 7;
                            do {
                                b1 = b1;
                                d3 += i15;
                                f4 += i14;
                                f4 = Test.byFld;
                            } while (--i16 > 0);
                            break;
                        case 94:
                            d3 -= Test.byFld;
                            break;
                        case 96:
                            i15 += 119;
                            break;
                        }
                    case 2:
                        i3 <<= (int)7L;
                        break;
                    }
                case 96:
                    i15 >>= i4;
                    break;
                }
            case 62:
                lArr1[i14] <<= i3;
                break;
            default:
                i3 += (((i14 * i14) + i4) - f4);
            }
        }
        long meth_res = i3 + i4 + l + i14 + i15 + Float.floatToIntBits(f4) + i16 + (b1 ? 1 : 0) +
            Double.doubleToLongBits(d3) + FuzzerUtils.checkSum(lArr1);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f=2.705F;
        int i=-30879, i1=-13, i2=42331, i17=-9174, i18=13, i19=-40657, i20=-102, i21=-220, i22=-12181, i23=48,
            iArr[][]=new int[N][N];
        boolean bArr[]=new boolean[N];
        long lArr2[][]=new long[N][N];

        FuzzerUtils.init(iArr, 59583);
        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(lArr2, 6133482974255145947L);

        f += (iArr[(42950 >>> 1) % N][(i >>> 1) % N] >> -6L);
        bArr[(i >>> 1) % N] = ((i++) >= ((i * f) - (++i)));
        for (i1 = 8; i1 < 232; i1++) {
            byte by=-3;
            i2 = (int)(Math.abs(++f) * (--by));
            f = (float)(((Test.iFld / (Test.instanceCount | 1)) + dMeth(i2, i2, Test.instanceCount)) - -2294665058L);
            iArr[i1][i1] -= (int)Test.instanceCount;
            for (i17 = 5; 112 > i17; i17++) {
                Test.iFld = -1;
                i2 *= i17;
                Test.lArrFld[i1] -= Test.byFld;
                for (i19 = 1; i19 < 2; ++i19) {
                    iArr[i1][i1 - 1] = (int)f;
                    iFld1 <<= 6;
                    i2 >>= (int)Test.lFld;
                    Test.bFld = Test.bFld;
                    lArr2 = lArr2;
                    i18 += (0 + (i19 * i19));
                    Test.instanceCount = i19;
                }
                i21 = 1;
                do {
                    i18 *= -13;
                    iArr[i21 + 1] = iArr[i17 + 1];
                    iArr[i21 + 1][i21] += i18;
                    i2 += (((i21 * sFld) + i2) - i1);
                    Test.iFld += (i21 ^ (long)f);
                    Test.lFld -= 237L;
                    Test.lFld += i21;
                    Test.fArrFld[i17 + 1] += f;
                } while (++i21 < 2);
                for (i22 = i17; 2 > i22; i22++) {
                    i20 = i1;
                    i2 += i22;
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
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  vMeth ->  vMeth dMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
