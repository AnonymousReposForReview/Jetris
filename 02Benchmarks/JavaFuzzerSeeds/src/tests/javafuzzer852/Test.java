package tests.javafuzzer852;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 10:55:09 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2812872821L;
    public static float fFld=-72.442F;
    public byte byFld=71;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -9097);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vSmallMeth(int i) {


        i <<= (int)(Test.instanceCount--);
        vSmallMeth_check_sum += i;
    }

    public static void vMeth1(int i6, int i7) {

        short s=31990;
        int i8=-151, i9=0, i10=60109, i11=45254, i12=-35356, i13=64604, i14=11;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 0.261F);

        i7 += (++s);
        vSmallMeth(i7);
        for (i8 = 181; i8 > 11; i8--) {
            for (i10 = 1; 9 > i10; i10++) {
                Test.iArrFld[i8 - 1] >>= i11;
            }
            for (i12 = 1; i12 < 9; i12++) {
                Test.iArrFld[i8 - 1] -= i7;
            }
            i7 -= (int)Test.instanceCount;
            i6 = (int)1.92836;
            fArr[i8 - 1] -= s;
            i9 = i11;
        }
        i14 = 158;
        do {
            i7 |= i12;
        } while (--i14 > 0);
        i11 = i7;
        vMeth1_check_sum += i6 + i7 + s + i8 + i9 + i10 + i11 + i12 + i13 + i14 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(int i3, float f) {

        int i4=1, i5=-104, i15=-5944, i16=5, i17=-8975, i18=9413, i19=-31069;
        short s1=17280;
        boolean b=true;

        Test.fFld += (((-i3) + (Test.instanceCount + i3)) + (i3++));
        for (i4 = 18; i4 < 343; ++i4) {
            vMeth1(i3, i4);
            Test.instanceCount = 56035;
            i3 += i4;
            i5 += -42854;
            i5 += (i4 | i5);
            for (i15 = 1; 5 > i15; ++i15) {
                i3 += i15;
            }
            i17 = 1;
            while (++i17 < 5) {
                i5 = i15;
                i5 = (int)f;
                for (i18 = 1; i18 > 1; i18--) {
                    s1 >>= (short)Test.instanceCount;
                    b = b;
                }
            }
        }
        vMeth_check_sum += i3 + Float.floatToIntBits(f) + i4 + i5 + i15 + i16 + i17 + i18 + i19 + s1 + (b ? 1 : 0);
    }

    public void mainTest(String[] strArr1) {

        int i1=13, i2=13, i20=-69, i21=47807, i22=-93, i23=0, i24=-134, i25=-42;
        short s2=26728;
        double d=3.102150;
        boolean b1=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 2301160848L);

        for (int smallinvoc=0; smallinvoc<462; smallinvoc++) vSmallMeth(-98);
        for (i1 = 1; i1 < 286; i1++) {
            Test.iArrFld[i1] >>= (int)(((-Test.fFld) - i2) % (((Test.instanceCount + Test.instanceCount) * (i2 * i2)) |
                1));
            if (b1) {
                vSmallMeth(-i2);
                Test.iArrFld[i1] = (i2 <<= i1);
                vMeth(i1, 2.429F);
            } else if (b1) {
                Test.instanceCount &= i2;
                for (i20 = 5; i20 < 88; i20++) {
                    i21 += (((i20 * i2) + Test.instanceCount) - s2);
                    i2 *= 9;
                    Test.iArrFld[i1 - 1] = 12;
                    i21 = (int)-1258158346250481926L;
                    Test.instanceCount += (long)d;
                    for (i22 = 1; i22 < 2; i22++) {
                        i2 -= (int)1.72141;
                        i2 = i20;
                        byFld += (byte)Test.instanceCount;
                        i23 *= (int)Test.instanceCount;
                        i23 >>= i23;
                        i23 = i20;
                        i23 += i2;
                    }
                    Test.instanceCount = i2;
                    i23 -= i23;
                    Test.instanceCount = i21;
                }
                Test.instanceCount += (((i1 * i20) + i2) - Test.fFld);
            } else {
                for (i24 = 1; i24 < 88; i24++) {
                    if (b1) continue;
                    Test.iArrFld[i24 - 1] = i2;
                    lArr[i1] >>= i22;
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test vMeth1 vMeth
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}