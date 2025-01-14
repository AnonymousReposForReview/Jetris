package tests.javafuzzer1870;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 05:01:10 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-59948L;
    public static double dFld=-6.116872;
    public byte byFld=39;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 246);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i4, long l1) {

        int i5=-2687, i6=-7, i7=168, i8=-9, i9=-156, i10=1, iArr[]=new int[N];
        double d=-68.100475, dArr[]=new double[N];
        boolean b1=true;
        float fArr1[]=new float[N];
        long lArr[][]=new long[N][N];
        short sArr[]=new short[N];

        FuzzerUtils.init(fArr1, 0.860F);
        FuzzerUtils.init(lArr, -5132974195672662171L);
        FuzzerUtils.init(sArr, (short)-21963);
        FuzzerUtils.init(iArr, -7);
        FuzzerUtils.init(dArr, 0.48148);

        i4 |= 12;
        for (i5 = 8; i5 < 147; i5++) {
            boolean b=true;
            if (b) break;
            fArr1[i5 - 1] *= -37.705F;
            if (b) break;
            lArr[i5 - 1] = lArr[i5];
        }
        lArr[(i4 >>> 1) % N][(i5 >>> 1) % N] = (long)d;
        sArr[(-2 >>> 1) % N] += (short)81;
        iArr[(i5 >>> 1) % N] += i4;
        for (i7 = 7; i7 < 134; ++i7) {
            if (b1) continue;
            l1 += (i7 * i7);
        }
        for (i9 = 6; 200 > i9; ++i9) {
            dArr[i9] += d;
            i6 -= 220;
        }
        long meth_res = i4 + l1 + i5 + i6 + Double.doubleToLongBits(d) + i7 + i8 + (b1 ? 1 : 0) + i9 + i10 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i2, long l, int i3) {

        float fArr[][]=new float[N][N];
        long lArr1[][]=new long[N][N];
        short sArr1[]=new short[N];

        FuzzerUtils.init(fArr, 117.849F);
        FuzzerUtils.init(lArr1, -1L);
        FuzzerUtils.init(sArr1, (short)5477);

        i3 = (int)((Test.instanceCount << i3) + (fArr[(i2 >>> 1) % N][(i2 >>> 1) % N] + iMeth1(i2,
            Test.instanceCount)));
        lArr1[(i2 >>> 1) % N][(i3 >>> 1) % N] = l;
        lArr1[(i3 >>> 1) % N][(i3 >>> 1) % N] >>>= i2;
        for (short s : sArr1) {
            Test.instanceCount += i3;
            lArr1[(i2 >>> 1) % N][(i2 >>> 1) % N] -= (long)-60.25996;
        }
        long meth_res = i2 + l + i3 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr1)
            + FuzzerUtils.checkSum(sArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i, int i1) {

        int i11=-2, i12=-4, i13=7, i14=-1, i15=387, i16=26688, i17=7;
        boolean b2=false;
        float f=0.653F;

        i = iMeth(i1, Test.instanceCount, i1);
        i11 = 178;
        do {
            i1 += i;
            Test.instanceCount = Test.instanceCount;
        } while ((i11 -= 2) > 0);
        Test.dFld -= i11;
        for (i12 = 2; i12 < 147; i12++) {
            Test.instanceCount += i12;
        }
        for (i14 = 11; i14 < 260; i14++) {
            Test.instanceCount = i13;
            if (b2) continue;
            i16 = 7;
            while ((i16 -= 2) > 0) {
                for (f = i14; 2 > f; f += 3) {
                    i13 <<= (int)Test.instanceCount;
                    b2 = b2;
                    Test.instanceCount += (long)f;
                }
            }
        }
        vMeth_check_sum += i + i1 + i11 + i12 + i13 + i14 + i15 + (b2 ? 1 : 0) + i16 + Float.floatToIntBits(f) + i17;
    }

    public void mainTest(String[] strArr1) {

        int i18=49, i19=11, i20=12, i21=113, i22=22605;
        double d1=0.8205;
        float f1=-37.74F;
        short s1=18852;
        boolean b3=true;

        vMeth(i18, i18);
        for (i19 = 15; i19 < 261; ++i19) {
            i18 += (i19 - i18);
            d1 = 1;
            while (++d1 < 102) {
                i20 += (int)f1;
                i21 = 1;
                while (++i21 < 1) {
                    i20 += (i21 * i21);
                    f1 += i19;
                    f1 = i20;
                    i20 >>= i21;
                    i18 &= i18;
                    Test.iArrFld[i19 + 1] ^= i18;
                    i18 /= (int)(byFld | 1);
                    i18 += i22;
                    i18 += (((i21 * i22) + i19) - i20);
                    i18 = -102;
                }
                Test.iArrFld = FuzzerUtils.int1array(N, (int)-81);
                s1 -= (short)i18;
                i22 = (int)d1;
                Test.instanceCount = -3;
                if (b3) break;
                i18 += (int)(((d1 * i22) + i21) - i18);
                s1 <<= (short)9L;
                f1 -= i22;
            }
            Test.iArrFld[i19 + 1] = i18;
            i22 += (i19 * i19);
        }
        for (int i23 : Test.iArrFld) {
            if (b3) break;
            Test.dFld /= 59365;
            i22 -= i20;
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
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
