package tests.javafuzzer2043;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 07:54:15 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-13L;
    public static int iFld=11;
    public static byte byFld=41;
    public boolean bFld=true;
    public static float fFld=2.402F;
    public static long lArrFld[]=new long[N];
    public byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 5412909504822871565L);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(float f1) {

        short s=27586;
        int i3=11, i4=-9, i5=-9, iArr2[][]=new int[N][N];
        long l=7507L;

        FuzzerUtils.init(iArr2, -2);

        try {
            Test.iFld = Test.iFld;
        }
        catch (NullPointerException exc1) {
            s ^= (short)Test.instanceCount;
            i3 = 1;
            do {
                l /= (i3 | 1);
                Test.instanceCount = -313;
                iArr2 = iArr2;
                switch (((i3 % 2) * 5) + 101) {
                case 110:
                    Test.iFld -= (int)-113.129F;
                    Test.iFld += (i3 | i3);
                    for (i4 = 1; i4 < 10; ++i4) {
                        i5 -= i4;
                        f1 -= (float)-92.90155;
                        Test.iFld += (i4 * i4);
                    }
                    l %= (i3 | 1);
                    break;
                case 102:
                    i5 ^= (int)Test.instanceCount;
                }
            } while (++i3 < 153);
        }
        vMeth_check_sum += Float.floatToIntBits(f1) + s + i3 + l + i4 + i5 + FuzzerUtils.checkSum(iArr2);
    }

    public static int iMeth1() {

        float f2=1.991F;
        double d=0.89516;
        int i6=22588, i7=123;
        short s1=25364;

        vMeth(f2);
        Test.instanceCount = -132;
        Test.iFld = (int)d;
        Test.iFld -= 4;
        Test.instanceCount = Test.byFld;
        Test.iFld += (int)Test.instanceCount;
        i6 = 1;
        while (++i6 < 331) {
            f2 = i6;
            Test.iFld = (int)Test.instanceCount;
            Test.byFld -= (byte)Test.instanceCount;
            Test.lArrFld[i6] += Test.iFld;
            i7 = 1;
            while (++i7 < 5) {
                s1 -= (short)i6;
                Test.iFld = -64547;
            }
        }
        Test.instanceCount *= -17864;
        long meth_res = Float.floatToIntBits(f2) + Double.doubleToLongBits(d) + i6 + i7 + s1;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth() {

        float f=-1.381F;
        int i1=91, i8=-105, i9=-236, i10=-13, i11=202, iArr1[]=new int[N];
        long lArr[][]=new long[N][N];
        double dArr[]=new double[N];

        FuzzerUtils.init(lArr, -103L);
        FuzzerUtils.init(iArr1, 10);
        FuzzerUtils.init(dArr, 93.70936);

        Test.instanceCount |= (long)(((60.82759 + (Test.instanceCount << Test.iFld)) / ((-11 + (Test.instanceCount *
            172)) | 1)) * Test.iFld);
        Test.instanceCount >>= (long)((-(++f)) + (--lArr[(Test.iFld >>> 1) % N][(-20 >>> 1) % N]));
        i1 = 1;
        while (++i1 < 132) {
            f = (++Test.iFld);
            Test.iFld = (-((Test.iFld * i1) + (Test.iFld * i1)));
            Test.iFld += (((i1 - Test.iFld) + iMeth1()) * -6);
            dArr[i1] -= Test.byFld;
            Test.iFld += (i1 | (long)f);
            for (i8 = 12; i8 > 1; i8--) {
                Test.iFld = (int)f;
                i9 -= Test.iFld;
                Test.iFld = i8;
                for (i10 = i1; i10 < 2; ++i10) {
                    f *= -2;
                    f -= i1;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f) + i1 + i8 + i9 + i10 + i11 + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-35614, i12=100, i13=-169, i14=30, i15=1, i16=24923, i17=11, i18=0, i20=-26965, i21=-7, i22=5,
            iArr[][]=new int[N][N];
        double d1=-1.12287;
        short s2=-1233;
        float f3=-46.892F, fArr[]=new float[N];

        FuzzerUtils.init(iArr, -32501);
        FuzzerUtils.init(fArr, -67.178F);

        if (bFld) {
            iArr[(-63 >>> 1) % N][(i >>> 1) % N] |= iMeth();
            i &= Test.iFld;
        }
        for (i12 = 9; i12 < 310; i12++) {
            i13 -= i12;
            iArr[i12][i12 - 1] -= i13;
            switch (((i12 % 6) * 5) + 89) {
            case 97:
                for (i14 = 84; i14 > 1; i14--) {
                    Test.lArrFld[i12 - 1] = Test.instanceCount;
                    byArrFld[i14] *= (byte)i13;
                }
                if (bFld) break;
                Test.lArrFld[i12] *= i15;
                break;
            case 101:
                for (d1 = 3; d1 < 84; d1++) {
                    for (i17 = 1; 2 > i17; i17++) {
                        int i19=10;
                        iArr[i12][i12] = i16;
                        i13 += (i17 + i18);
                        Test.fFld -= i19;
                        s2 = Test.byFld;
                        i15 = (int)-117.372F;
                        Test.fFld = i16;
                    }
                    i13 += i14;
                    i18 >>= i;
                    Test.instanceCount = i17;
                    Test.instanceCount = (long)d1;
                    for (f3 = 1; f3 < 2; ++f3) {
                        i13 += (int)1.123F;
                        iArr[i12 + 1] = iArr[(int)(d1 - 1)];
                    }
                    for (i21 = 2; i12 < i21; i21 -= 2) {
                        i += (i21 - Test.instanceCount);
                        Test.lArrFld[(int)(d1 - 1)] >>= i12;
                    }
                }
            case 99:
                fArr[(i14 >>> 1) % N] = Test.instanceCount;
                break;
            case 113:
            case 117:
                Test.fFld = 0L;
            case 100:
                Test.fFld += i12;
                break;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
