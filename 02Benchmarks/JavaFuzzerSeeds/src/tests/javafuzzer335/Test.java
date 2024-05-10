package tests.javafuzzer335;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 02:05:58 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-243L;
    public static boolean bFld=false;
    public static volatile int iFld=14;
    public short sFld=-14684;
    public static volatile int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -2);
        FuzzerUtils.init(Test.lArrFld, -5429326203038640088L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(boolean b, int i3) {

        int i4=216, i5=-12, i6=3012, i7=181;
        short s1=2589;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 88.96373);

        i3 = 2972;
        i3 = i3;
        for (double d : dArr) {
            for (i4 = 1; 4 > i4; ++i4) {
                i3 = i4;
                Test.iArrFld = Test.iArrFld;
                for (i6 = 1; i6 < 2; i6++) {
                    Test.instanceCount += (i6 ^ i5);
                    Test.iArrFld[i4] -= (int)Test.instanceCount;
                    s1 = (short)i5;
                    b = b;
                    i5 <<= i7;
                }
                i5 += (int)Test.instanceCount;
                i3 = i6;
                if (b) break;
            }
        }
        long meth_res = (b ? 1 : 0) + i3 + i4 + i5 + i6 + i7 + s1 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i2) {

        boolean b1=false;
        int i8=-35252, i9=135, i10=-119, i11=-7, i12=-62768, i13=4, i14=54967, i15=3;
        byte by=73;
        short s2=9322;
        float f=-8.916F;
        double dArr1[]=new double[N];

        FuzzerUtils.init(dArr1, 51.18558);

        Test.iArrFld[(i2 >>> 1) % N] *= ((-iMeth1(b1, i2)) + i8);
        i9 = 1;
        while (++i9 < 364) {
            switch (((i9 % 2) * 5) + 25) {
            case 28:
            case 29:
                dArr1[i9 + 1] = i2;
                for (i10 = i9; 5 > i10; i10++) {
                    for (i12 = 1; i12 < 1; ++i12) {
                        i8 >>>= (int)Test.instanceCount;
                    }
                    i13 += (((i10 * i8) + by) - s2);
                    for (i14 = 1; 1 > i14; i14++) {
                        i8 &= i10;
                        i13 += i12;
                        i11 += (i14 * i14);
                        i8 -= (int)f;
                        by /= (byte)1.107986;
                        f -= i9;
                    }
                }
                break;
            }
        }
        vMeth_check_sum += i2 + (b1 ? 1 : 0) + i8 + i9 + i10 + i11 + i12 + i13 + by + s2 + i14 + i15 +
            Float.floatToIntBits(f) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
    }

    public static int iMeth(int i, short s) {

        int i1=-12, i16=-210, i17=-7795, i18=7607, i19=-13109, i20=42908;
        double d1=0.2686;
        float f1=4.354F;

        i1 = 1;
        while (++i1 < 176) {
            vMeth(i1);
        }
        for (i16 = 5; i16 < 308; i16++) {
            d1 *= i16;
            Test.iArrFld[i16] *= (int)f1;
            f1 += Test.instanceCount;
            i18 = 1;
            while (++i18 < 5) {
                i17 += (i18 ^ i16);
            }
            for (i19 = i16; i19 < 5; ++i19) {
                i20 += (i19 * i19);
                i17 <<= i20;
                if (Test.bFld) {
                    i = 212;
                } else {
                }
                i20 += (int)(-123.245F + (i19 * i19));
                i |= i19;
            }
        }
        long meth_res = i + s + i1 + i16 + i17 + Double.doubleToLongBits(d1) + Float.floatToIntBits(f1) + i18 + i19 +
            i20;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i21=63335, i22=-67, i23=37757, i24=62464, i25=-10, i26=-21637, iArr[][]=new int[N][N];
        byte by1=-45;
        long l=42392770812683781L;
        double dArr2[]=new double[N];

        FuzzerUtils.init(dArr2, 93.98813);
        FuzzerUtils.init(iArr, 32993);

        Test.instanceCount *= iMeth(Test.iFld, sFld);
        Test.iFld -= 103;
        for (i21 = 3; i21 < 340; ++i21) {
            Test.lArrFld[i21] <<= 28849;
            if (false) {
                Test.iFld = i22;
                dArr2 = dArr2;
                for (i23 = 3; i23 < 75; ++i23) {
                    Test.iFld = i23;
                    Test.iArrFld[i21] = i23;
                    dArr2[i21] += 9911;
                    Test.iFld += (i23 * i23);
                    i24 += (i23 * i23);
                    i24 = i23;
                    i25 = 1;
                    while (++i25 < 2) {
                        i22 = Test.iFld;
                    }
                    Test.instanceCount += (i23 | i24);
                    Test.instanceCount += by1;
                    Test.iArrFld[i21 - 1] *= -28911;
                }
                Test.instanceCount >>>= Test.instanceCount;
            } else if (Test.bFld) {
                i22 += (int)Test.instanceCount;
                Test.instanceCount -= i24;
                i22 += (i21 ^ i23);
                Test.iArrFld[i21 + 1] *= i25;
            } else {
                iArr = iArr;
                for (l = 75; l > 4; l--) {
                    if (Test.bFld) {
                        i26 >>>= 37761;
                    } else if (false) {
                        Test.instanceCount >>= i21;
                        Test.iArrFld[i21] >>= Test.iFld;
                    } else {
                        Test.instanceCount += i25;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}