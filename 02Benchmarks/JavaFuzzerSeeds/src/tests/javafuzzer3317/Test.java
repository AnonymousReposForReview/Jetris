package tests.javafuzzer3317;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 05:52:14 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2617078769L;
    public float fFld=0.430F;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[][]=new int[N][N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -17674L);
        FuzzerUtils.init(Test.iArrFld, -146);
        FuzzerUtils.init(Test.fArrFld, -15.305F);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f1, long l1) {

        int i7=-29919, i8=39728, i9=-14002, i10=-2, i11=25;
        double d1=-38.98052, dArr[]=new double[N];
        short s=11723;

        FuzzerUtils.init(dArr, -1.121554);

        for (i7 = 17; i7 < 336; i7++) {
            f1 -= (float)d1;
            l1 ^= i7;
            for (i9 = 1; i9 < 5; ++i9) {
                i11 = 1;
                do {
                    i8 <<= i10;
                    i10 += (int)d1;
                    d1 = i9;
                    i8 += (int)l1;
                    i10 = s;
                    i8 = -61;
                    dArr[i7 - 1] += s;
                } while (++i11 < 2);
            }
            d1 *= i9;
            if (false) continue;
            i8 -= (int)-2240969465L;
        }
        vMeth1_check_sum += Float.floatToIntBits(f1) + l1 + i7 + i8 + Double.doubleToLongBits(d1) + i9 + i10 + i11 + s
            + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static int iMeth(long l, int i4) {

        int i5=49282, i6=-48868, i12=-7, i13=-9, i14=-102, i15=-167;
        long l2=1338003816L;
        boolean b=true, b1=false;
        byte by1=-28;
        double d2=-52.95580;
        short s1=13913;

        for (i5 = 342; i5 > 5; i5--) {
            float f=0.227F;
            f -= (i6--);
            i4 |= ((i4 * (i4 += 169)) + i6);
            if (b1) {
                vMeth1(f, 12L);
                for (i12 = i5; 5 > i12; ++i12) {
                    if (b) {
                        i4 &= (int)l2;
                        Test.iArrFld[i12 + 1][i5 + 1] = 38;
                        i13 += i13;
                    } else {
                        for (i14 = 1; 1 > i14; i14 += 3) {
                            i6 *= (int)l;
                            by1 *= (byte)i13;
                            f += (i14 * i14);
                            Test.lArrFld = FuzzerUtils.long1array(N, (long)126L);
                        }
                    }
                }
            } else if (b) {
                i13 *= (int)d2;
            } else if (b1) {
                i15 = i5;
            } else {
                i4 *= s1;
            }
        }
        long meth_res = l + i4 + i5 + i6 + i12 + i13 + l2 + (b ? 1 : 0) + i14 + i15 + by1 + Double.doubleToLongBits(d2)
            + (b1 ? 1 : 0) + s1;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i3=-78, i16=51566, i17=-204, i18=17561, i19=-7;
        byte by2=-57;
        double d3=0.6673;
        float f2=-1.517F;
        short s2=-29088, sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-12096);

        i3 += (int)(Test.instanceCount *= ((++i3) * Math.min(-21447L, Test.instanceCount)));
        Test.instanceCount >>>= (++i3);
        Test.fArrFld[(i3 >>> 1) % N] *= ((iMeth(8L, i3) - by2) % (i3 | 1));
        i3 = (int)d3;
        d3 = f2;
        for (float f3 : Test.fArrFld) {
            s2 = (short)d3;
            for (i16 = 1; i16 < 4; i16++) {
                i3 -= i17;
                sArr[i16] += (short)i16;
                Test.instanceCount = i3;
                i17 = i17;
                for (i18 = 1; i18 < 2; i18++) {
                    Test.iArrFld[i16][i16 - 1] <<= i18;
                    i17 = i16;
                }
            }
        }
        vMeth_check_sum += i3 + by2 + Double.doubleToLongBits(d3) + Float.floatToIntBits(f2) + s2 + i16 + i17 + i18 +
            i19 + FuzzerUtils.checkSum(sArr);
    }

    public void mainTest(String[] strArr1) {

        int i=55781, i1=10, i2=-41363;
        byte by=-27;

        i = (int)(Test.instanceCount++);
        for (i1 = 9; i1 < 320; i1 += 2) {
            double d=-14.98224;
            Test.lArrFld[i1 - 1] <<= (long)(i1 + ((by + d) * (-121 - (Test.iArrFld[i1 + 1][i1 + 1]--))));
            i = (int)Test.instanceCount;
            Test.instanceCount <<= i2;
            fFld -= (Test.iArrFld[i1][i1 - 1]--);
        }
        vMeth();


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
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
