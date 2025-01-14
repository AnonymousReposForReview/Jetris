package tests.javafuzzer529;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 05:17:57 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-6L;
    public static float fFld=1.615F;
    public static int iArrFld[]=new int[N];
    public static short sArrFld[]=new short[N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -183);
        FuzzerUtils.init(Test.sArrFld, (short)32169);
        FuzzerUtils.init(Test.bArrFld, true);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i9, int i10) {

        int i11=-69, i12=-7, i14=171, i15=-13;
        double d1=-1.76156;
        long l=1543L;

        Test.iArrFld = Test.iArrFld;
        for (i11 = 3; i11 < 262; i11++) {
            int i13=-34658;
            switch (((i12 >>> 1) % 5) + 92) {
            case 92:
                Test.instanceCount += (((i11 * Test.instanceCount) + i12) - Test.fFld);
                try {
                    i12 = (Test.iArrFld[i11] / 45872);
                    i9 = (-59087 / i10);
                    i9 = (i11 % i11);
                } catch (ArithmeticException a_e) {}
                i10 += (int)d1;
                break;
            case 93:
                d1 = i12;
                break;
            case 94:
                Test.instanceCount = (long)d1;
                i9 += (((i11 * i13) + i12) - i13);
                i14 = 6;
                do {
                    i10 = (int)Test.instanceCount;
                    for (l = 1; l < 3; ++l) {
                        i15 = (int)d1;
                        d1 -= -60;
                        Test.fFld = i11;
                    }
                } while ((i14 -= 3) > 0);
                break;
            case 95:
                i13 = (int)l;
                break;
            case 96:
                i13 += (i11 ^ i11);
            }
        }
        vMeth1_check_sum += i9 + i10 + i11 + i12 + Double.doubleToLongBits(d1) + i14 + l + i15;
    }

    public static void vMeth() {

        int i8=-62, i16=12, i17=213, i18=14;
        long l1=-3L, lArr[]=new long[N];
        short s2=1145;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -1.727F);
        FuzzerUtils.init(lArr, 49432L);

        Test.instanceCount += (-(++i8));
        vMeth1(-2, i8);
        fArr[(i8 >>> 1) % N] += l1;
        Test.instanceCount <<= i8;
        i16 = 1;
        while (++i16 < 288) {
            boolean b=false;
            Test.iArrFld[i16 + 1] >>>= -182;
            Test.iArrFld[i16 - 1] *= -3223;
            if (b) {
                for (i17 = i16; i17 < 6; ++i17) {
                    i18 ^= i18;
                    Test.iArrFld = Test.iArrFld;
                    s2 = (short)11;
                    Test.iArrFld[i16 + 1] *= (int)l1;
                    Test.iArrFld[i17] -= i8;
                    Test.fFld += i17;
                }
            } else if (b) {
                lArr[(i16 >>> 1) % N] >>= i17;
            } else {
                i8 = (int)Test.fFld;
            }
        }
        vMeth_check_sum += i8 + l1 + i16 + i17 + i18 + s2 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth(double d, float f) {

        short s1=-15364;
        int i6=-59956, i7=21, i19=-7, i20=-9, i21=13;
        boolean b1=true;

        Test.iArrFld = (Test.iArrFld = Test.iArrFld);
        for (int i5 : Test.iArrFld) {
            switch ((((i5 >>> 1) % 1) * 5) + 117) {
            case 119:
                s1 = (short)(--f);
                Test.instanceCount = (long)(f++);
                for (i6 = 1; 4 > i6; i6++) {
                    vMeth();
                    Test.sArrFld[i6 - 1] = (short)i6;
                    for (i19 = 2; i19 > 1; --i19) {
                        d *= i21;
                        if (b1) continue;
                        Test.bArrFld[i6 - 1] = b1;
                        b1 = b1;
                        i7 += (-13 + (i19 * i19));
                        Test.instanceCount = i19;
                    }
                }
            default:
                Test.iArrFld[(i20 >>> 1) % N] = s1;
            }
        }
        long meth_res = Double.doubleToLongBits(d) + Float.floatToIntBits(f) + s1 + i6 + i7 + i19 + i20 + i21 + (b1 ? 1
            : 0);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-2, i1=43, i2=-64393, i3=12, i4=0, i22=62782, i23=-191, i24=-48670, i25=-4, i26=-6316, i27=-110;
        short s=5211;
        double d2=0.41964;

        Test.instanceCount = (Test.instanceCount += ((++i) + (s + i)));
        for (i1 = 351; i1 > 17; i1 -= 2) {
            for (i3 = 7; i3 < 150; ++i3) {
                Test.instanceCount += iMeth(d2, Test.fFld);
                Test.iArrFld[i3] += i2;
                i += (i3 * i4);
                i4 += (i3 + i2);
                for (i22 = 1; i22 < 2; ++i22) {
                    i23 = i3;
                    i %= (int)(s | 1);
                    Test.fFld += i3;
                    try {
                        i4 = (41279 / i24);
                        i2 = (i3 / 225);
                        i4 = (Test.iArrFld[i22] / i24);
                    } catch (ArithmeticException a_e) {}
                    Test.fFld = i23;
                    try {
                        i23 = (Test.iArrFld[i3 + 1] % 41799);
                        i23 = (i24 % -162);
                        i24 = (i3 % -53661);
                    } catch (ArithmeticException a_e) {}
                    i2 *= (int)d2;
                }
                switch ((((i >>> 1) % 7) * 5) + 127) {
                case 161:
                    Test.fFld = i24;
                    break;
                case 131:
                    Test.instanceCount += i3;
                    Test.instanceCount += (i3 | i4);
                    Test.instanceCount = (long)Test.fFld;
                case 143:
                    i25 = 1;
                    do {
                        Test.instanceCount += (5 + (i25 * i25));
                        i2 += (int)d2;
                        try {
                            i = (i1 / i24);
                            i4 = (-26 / i4);
                            Test.iArrFld[i1] = (i3 % -52987);
                        } catch (ArithmeticException a_e) {}
                        s = (short)i3;
                        Test.instanceCount *= -249;
                        Test.instanceCount += i25;
                    } while (++i25 < 2);
                    for (i26 = 1; i26 < 2; i26++) {
                        i2 -= i27;
                        i -= (int)8L;
                    }
                    break;
                case 159:
                    i24 += i3;
                    break;
                case 141:
                case 155:
                    Test.iArrFld[i3] = -12962;
                case 148:
                    i24 += i23;
                    break;
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
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
