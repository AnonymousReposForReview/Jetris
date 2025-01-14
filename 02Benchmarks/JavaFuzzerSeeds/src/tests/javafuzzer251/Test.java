package tests.javafuzzer251;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 00:55:50 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-5L;
    public static float fFld=-27.472F;
    public static short sFld=6624;
    public static float fFld1=0.31F;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 12);
        FuzzerUtils.init(Test.lArrFld, 2L);
    }

    public static long sMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        long l2=45903L;
        int i1=0, i2=9, i3=46449, i4=-254, i5=-63666, i6=8, i7=19911;
        double d=0.30786;
        float f1=-62.313F;
        byte by=8;

        for (l2 = 329; l2 > 15; l2 -= 3) {
            d *= 151;
        }
        i1 -= (int)0L;
        i1 += i1;
        i1 -= i1;
        for (i2 = 4; i2 < 281; i2++) {
            for (i4 = 1; 6 > i4; i4++) {
                Test.instanceCount += i4;
                i1 = i2;
                Test.instanceCount -= 11849;
                Test.instanceCount = l2;
            }
            f1 *= by;
            for (i6 = 1; i6 < 6; i6++) {
                i1 = (int)l2;
                Test.iArrFld[i6 + 1] = -100;
            }
        }
        vMeth1_check_sum += l2 + i1 + Double.doubleToLongBits(d) + i2 + i3 + i4 + i5 + Float.floatToIntBits(f1) + by +
            i6 + i7;
    }

    public static void vMeth() {

        int i8=-4588, i9=-14, i10=9;
        double d1=0.121443;
        byte by1=5;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, -35L);

        vMeth1();
        for (i8 = 131; i8 > 6; i8--) {
            i9 <<= (int)Test.instanceCount;
            lArr = lArr;
            lArr[i8 + 1][i8] = i8;
            for (d1 = i8; d1 < 13; d1++) {
                if (true) break;
                Test.instanceCount *= by1;
                switch ((int)((d1 % 4) + 105)) {
                case 105:
                    Test.iArrFld[(int)(d1)] %= (int)(i10 | 1);
                    break;
                case 106:
                    i9 = i9;
                    i9 *= (int)d1;
                    Test.instanceCount += i9;
                case 107:
                    Test.instanceCount += (long)(d1 - Test.fFld);
                    Test.iArrFld[(int)(d1 + 1)] = i10;
                    break;
                case 108:
                    lArr[(int)(d1)][(int)(d1 - 1)] >>>= Test.instanceCount;
                    break;
                }
            }
        }
        vMeth_check_sum += i8 + i9 + Double.doubleToLongBits(d1) + i10 + by1 + FuzzerUtils.checkSum(lArr);
    }

    public static short sMeth(float f, long l, long l1) {

        long l3=173L;
        int i11=10635, i12=-12718, i13=-11, i14=-236;
        double d2=90.58805;
        boolean b=true;
        byte byArr[]=new byte[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(byArr, (byte)102);
        FuzzerUtils.init(fArr, 0.525F);

        vMeth();
        for (l3 = 20; l3 < 398; l3++) {
            i11 = i11;
            Test.lArrFld[(int)(l3)] += -16829;
            l1 = i11;
            byArr[(int)(l3)] >>= (byte)i11;
            fArr[(int)(l3 + 1)] = i11;
            for (d2 = 1; d2 < 4; ++d2) {
                i11 -= -241;
            }
            if (b) continue;
            for (i13 = 1; 4 > i13; ++i13) {
                i11 = Test.sFld;
                if (b) continue;
                l1 = i11;
                Test.iArrFld[(int)(l3 - 1)] = (int)f;
            }
        }
        long meth_res = Float.floatToIntBits(f) + l + l1 + l3 + i11 + Double.doubleToLongBits(d2) + i12 + (b ? 1 : 0) +
            i13 + i14 + FuzzerUtils.checkSum(byArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-25604, i15=12012, i16=55937, i17=1900, i18=3, i19=-5, i20=4;
        byte by2=9;
        boolean b1=true;
        double d3=-114.128693;
        long l4=107L;
        float fArr1[]=new float[N];

        FuzzerUtils.init(fArr1, -76.105F);

        Test.instanceCount -= (((--i) + sMeth(1.558F, 1977873836312455704L, 3L)) + by2);
        Test.iArrFld[(i >>> 1) % N] -= i;
        for (i15 = 4; i15 < 269; i15++) {
            for (i17 = i15; i17 < 95; ++i17) {
                i18 += i15;
                if (false) break;
                i16 = 45;
                for (i19 = 1; i19 < 1; i19++) {
                    switch ((((i15 >>> 1) % 9) * 5) + 127) {
                    case 160:
                        Test.fFld += i19;
                        break;
                    case 165:
                        i = i19;
                        Test.sFld *= (short)-5823L;
                        fArr1[i17 - 1] += i17;
                        Test.sFld = (short)i15;
                        break;
                    case 149:
                        if (b1) {
                            Test.iArrFld = Test.iArrFld;
                            if (b1) continue;
                            i16 >>= by2;
                            d3 = i;
                        } else {
                            Test.fFld *= i18;
                            d3 += 67;
                            Test.lArrFld[i17 + 1] = i18;
                            i18 += (i19 | i15);
                        }
                        break;
                    case 172:
                        Test.lArrFld = Test.lArrFld;
                        b1 = b1;
                        Test.instanceCount -= Test.sFld;
                        if (false) {
                            i20 += (i19 * i19);
                            i18 ^= i16;
                            b1 = true;
                        } else {
                            i18 -= (int)Test.fFld1;
                        }
                        break;
                    case 158:
                        i20 += (i19 * l4);
                    case 145:
                        if (false) break;
                        break;
                    case 168:
                        i20 = (int)Test.fFld;
                        break;
                    case 157:
                    case 133:
                        i20 += i16;
                        break;
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
//DEBUG  sMeth ->  sMeth mainTest
//DEBUG  vMeth ->  vMeth sMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth sMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
