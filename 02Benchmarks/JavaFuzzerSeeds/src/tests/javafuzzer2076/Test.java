package tests.javafuzzer2076;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 08:38:00 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=37268L;
    public float fFld=2.435F;
    public static volatile float fFld1=-112.313F;
    public boolean bFld=false;
    public static float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 106.452F);
        FuzzerUtils.init(Test.iArrFld, -49296);
        FuzzerUtils.init(Test.lArrFld, -3190852905479631550L);
    }

    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(long l, byte by1, int i8) {

        int i10=-8114, i11=-39223, i12=-31888;
        double d=2.71126, dArr[]=new double[N];

        FuzzerUtils.init(dArr, -1.121984);

        dArr = FuzzerUtils.double1array(N, (double)2.22450);
        for (int i9 : Test.iArrFld) {
            i10 = 4;
            while (--i10 > 0) {
                short s1=-24298;
                i11 *= (int)d;
                i9 += (int)l;
                i8 += (((i10 * s1) + i11) - i9);
                i12 = 1;
                do {
                    i9 -= i12;
                    l -= (long)120.948F;
                    i9 += i12;
                    Test.instanceCount += 236;
                    Test.instanceCount -= s1;
                    Test.fFld1 += i8;
                    i9 >>>= (int)l;
                } while (++i12 < 1);
                l %= (s1 | 1);
            }
        }
        vMeth_check_sum += l + by1 + i8 + i10 + i11 + Double.doubleToLongBits(d) + i12 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static int iMeth(int i4, int i5) {

        short s=-19873, sArr[]=new short[N];
        int i6=50696, i7=5, i13=75, i14=-40616, i15=29, i16=0, i17=13, i18=-3382, iArr[][]=new int[N][N];
        byte by2=-114, byArr[]=new byte[N];

        FuzzerUtils.init(sArr, (short)609);
        FuzzerUtils.init(iArr, -2);
        FuzzerUtils.init(byArr, (byte)-31);

        Test.instanceCount -= (((--sArr[(6 >>> 1) % N]) * (s - i4)) - (Math.min(Test.instanceCount,
            -768025963024390440L) * (++iArr[(i5 >>> 1) % N][(-7 >>> 1) % N])));
        for (i6 = 1; i6 < 345; i6++) {
            vMeth(Test.instanceCount, by2, i7);
            for (i13 = 1; i13 < 5; ++i13) {
                i5 = i5;
                i5 += by2;
                byArr[i6 - 1] = (byte)i13;
                by2 = (byte)i13;
            }
            Test.lArrFld[i6 - 1] <<= 4L;
            i7 -= i7;
            for (i15 = 1; i15 < 5; ++i15) {
                for (i17 = 2; i17 > 1; --i17) {
                    Test.fFld1 -= i17;
                }
                if (false) continue;
                i18 += (i15 * i15);
            }
        }
        long meth_res = i4 + i5 + s + i6 + i7 + by2 + i13 + i14 + i15 + i16 + i17 + i18 + FuzzerUtils.checkSum(sArr) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(byArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(int i2, int i3) {

        byte by=-69;

        by = (byte)iMeth(i3, i3);
        long meth_res = i2 + i3 + by;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-21, i1=8, i20=-7025, i21=174, i22=5, i23=37427, i24=168, i25=56, i26=41172;
        short s2=7678;
        double d1=-120.426;

        for (i = 3; i < 264; ++i) {
            fFld += (-((i - 12806) / ((-(--Test.instanceCount)) | 1)));
            Test.fArrFld[i] += ((--i1) + lMeth(i, i1));
            i1 = (int)fFld;
            try {
                i1 = (i % Test.iArrFld[i - 1]);
                i1 = (i % i1);
                i1 = (Test.iArrFld[i] / -13740);
            } catch (ArithmeticException a_e) {}
            i1 >>>= i1;
            if (false) continue;
            for (i20 = 96; i20 > 4; i20 -= 2) {
                i22 = 1;
                while (++i22 < 3) {
                    if (bFld) continue;
                    Test.lArrFld[i20 + 1] += i22;
                    Test.iArrFld[i22] -= (int)Test.instanceCount;
                    Test.lArrFld[i] >>>= 3;
                    i21 += -120;
                    Test.instanceCount = s2;
                    i1 += (int)Test.instanceCount;
                    bFld = bFld;
                    i21 = 14;
                    i1 += 4;
                }
            }
        }
        i1 = i21;
        for (i23 = 1; 199 > i23; ++i23) {
            d1 = 1;
            while (++d1 < 127) {
                try {
                    Test.iArrFld[i23 + 1] = (i / i20);
                    i21 = (i22 % i22);
                    i24 = (i23 / 110);
                } catch (ArithmeticException a_e) {}
                Test.iArrFld[(int)(d1)] ^= i21;
                Test.fFld1 += (float)d1;
                Test.iArrFld[(int)(d1)] = i21;
                i24 = (int)fFld;
                for (i25 = 1; i25 < 1; i25++) {
                    i1 *= (int)Test.instanceCount;
                    i1 = i23;
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}