package tests.javafuzzer337;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 02:10:45 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3839960205195377888L;
    public static boolean bFld=false;
    public static volatile float fFld=-1.257F;
    public volatile byte byFld=-73;

    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(long l1) {

        int i11=10, i12=-11, i13=16, i14=1, i15=-25450, iArr[]=new int[N];
        float f1=-2.875F;
        double d1=2.58842, dArr[]=new double[N];
        long l2=-36L;

        FuzzerUtils.init(iArr, 14);
        FuzzerUtils.init(dArr, -117.91289);

        for (i11 = 8; i11 < 172; ++i11) {
            i12 <<= 65;
            f1 = l1;
            iArr[i11 + 1] = i12;
            i12 += (i11 - Test.instanceCount);
            i12 = i11;
            i12 += (int)d1;
            Test.bFld = Test.bFld;
            iArr[i11 + 1] -= (int)d1;
        }
        for (i13 = 239; i13 > 5; i13 -= 2) {
            i12 ^= -4;
            iArr = iArr;
        }
        for (l2 = 217; l2 > 10; l2 -= 3) {
            if (Test.bFld) break;
            dArr[(int)(l2 + 1)] += d1;
        }
        long meth_res = l1 + i11 + i12 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d1) + i13 + i14 + l2 + i15
            + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static double dMeth(int i9, float f, int i10) {

        double d=76.43307;

        i10 = (int)((long)((i10 - i10) + (i9 * d)) >>> iMeth(Test.instanceCount));
        d += i10;
        long meth_res = i9 + Float.floatToIntBits(f) + i10 + Double.doubleToLongBits(d);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth(long l, int i2, int i3) {

        int i4=0, i5=-41498, i6=-13, i7=-5, i8=-65, i16=-32452, i17=-40445;
        float f2=-109.772F;
        short s=5977;
        byte by=35;
        double d2=2.79080;

        i4 = 1;
        while (++i4 < 136) {
            for (i5 = 1; i5 < 12; i5++) {
                switch ((i5 % 6) + 127) {
                case 127:
                case 128:
                    for (i7 = 1; 2 > i7; i7++) {
                        i8 -= (int)(dMeth(i5, -90.390F, -55538) - i3);
                        f2 -= i8;
                        s >>= (short)i7;
                        by -= (byte)i8;
                        i6 += (i7 * l);
                        by <<= (byte)i6;
                    }
                    for (i16 = 1; 2 > i16; i16++) {
                        Test.instanceCount = (long)d2;
                        i2 *= (int)l;
                        by = (byte)Test.instanceCount;
                        Test.instanceCount *= i3;
                    }
                    break;
                case 129:
                    Test.instanceCount += Test.instanceCount;
                case 130:
                    by += (byte)(((i5 * Test.instanceCount) + i17) - i16);
                    break;
                case 131:
                    f2 += (((i5 * s) + l) - i2);
                case 132:
                    i17 = i8;
                    break;
                default:
                    i3 -= i4;
                }
            }
        }
        vMeth_check_sum += l + i2 + i3 + i4 + i5 + i6 + i7 + i8 + Float.floatToIntBits(f2) + s + by + i16 + i17 +
            Double.doubleToLongBits(d2);
    }

    public void mainTest(String[] strArr1) {

        int i=-192, i1=0, i18=-49859, i19=-73, i20=-226, i21=51918, i22=-34544;
        double d3=108.9511;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, 1L);

        for (i = 9; i < 181; i++) {
            vMeth(6857315392131977559L, i1, i1);
            i1 += (i * i);
            i1 += i;
            i1 >>= i1;
        }
        i1 = (int)Test.fFld;
        i18 = 1;
        while (++i18 < 288) {
            for (i19 = 5; i19 < 87; ++i19) {
                short s1=-24968;
                Test.instanceCount = 2382;
                Test.fFld = 1;
                switch (((i >>> 1) % 5) + 85) {
                case 85:
                    Test.fFld = -218;
                    Test.fFld -= i1;
                    byFld += (byte)(((i19 * Test.fFld) + i) - Test.fFld);
                    break;
                case 86:
                    byFld -= (byte)i18;
                    Test.instanceCount = 61898;
                    break;
                case 87:
                    i20 += i19;
                case 88:
                    Test.instanceCount += (i19 - s1);
                    if (Test.bFld) break;
                    break;
                case 89:
                    i1 <<= s1;
                    i20 *= (int)Test.fFld;
                    for (i21 = 2; i21 > 1; i21 -= 2) {
                        lArr[i21 + 1] = lArr[i19];
                        i20 = (int)Test.fFld;
                        i22 += (i21 * Test.instanceCount);
                        Test.instanceCount >>>= i18;
                        i20 = i18;
                        i22 = i19;
                        Test.fFld += i21;
                        i20 *= (int)d3;
                    }
                    break;
                default:
                    i22 = i;
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
//DEBUG  dMeth ->  dMeth vMeth mainTest
//DEBUG  iMeth ->  iMeth dMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}