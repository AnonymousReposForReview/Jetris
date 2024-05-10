package tests.javafuzzer1490;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 21:18:39 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3L;
    public static boolean bFld=true;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -118);
    }

    public static long sMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public void vMeth1(float f, int i5) {

        int i6=-10, i7=30550, i8=-20932, i9=0, i10=-25411, i11=6;
        boolean b1=true;
        double d2=-23.101013;
        long lArr[]=new long[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(lArr, 24141L);
        FuzzerUtils.init(sArr, (short)-2201);

        i5 -= i5;
        for (i6 = 5; i6 < 244; ++i6) {
            lArr[i6] = i7;
            Test.instanceCount += i5;
            f += (i6 - Test.instanceCount);
            if (b1) break;
        }
        Test.iArrFld[(i7 >>> 1) % N] = 21190;
        Test.iArrFld[(10 >>> 1) % N] -= i5;
        try {
            Test.instanceCount = Test.instanceCount;
            for (i8 = 10; i8 < (337 + 400); i8++) {
                switch ((i8 % 2) + 112) {
                case 112:
                    for (i10 = 4 + 400; i10 > i8; i10 -= 3) {
                        i7 = i11;
                        i5 += i11;
                    }
                    break;
                case 113:
                    sArr[i8] <<= (short)Test.instanceCount;
                    break;
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException exc1) {
            i7 = 39204;
        }
        finally {
            d2 -= i6;
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + i5 + i6 + i7 + (b1 ? 1 : 0) + i8 + i9 + i10 + i11 +
            Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(sArr);
    }

    public void vMeth(int i4) {

        int i12=53722, i13=-51254, i14=6, i15=56722, i16=-1, i17=112;
        double d3=24.13100;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -4329698331553915936L);

        vMeth1(0.514F, i4);
        i4 += i4;
        for (i12 = 8; i12 < 180; i12++) {
            for (i14 = 1; i14 < 9; i14++) {
                float f1=0.395F;
                f1 -= Test.instanceCount;
                i4 += (int)(-51L + (i14 * i14));
                i4 += i12;
                for (i16 = 2; i16 > i14; i16 -= 3) {
                    lArr1[i16 - 1] |= Test.instanceCount;
                    if (Test.bFld) continue;
                    i4 >>= i17;
                    f1 += (((i16 * i15) + Test.instanceCount) - i4);
                    i15 *= (int)Test.instanceCount;
                    d3 = d3;
                    i13 <<= i13;
                }
            }
        }
        vMeth_check_sum += i4 + i12 + i13 + i14 + i15 + i16 + i17 + Double.doubleToLongBits(d3) +
            FuzzerUtils.checkSum(lArr1);
    }

    public short sMeth(double d, double d1, boolean b) {

        int i18=-5, i19=16, i20=-119, i21=178, i22=24974, i23=3, i24=55035, i25=-217;
        byte by=-124;
        long lArr2[]=new long[N];

        FuzzerUtils.init(lArr2, -17396L);

        vMeth(i18);
        for (i19 = 11; i19 < 315; i19++) {
            if (i20 != 0) {
            }
        }
        by *= (byte)195;
        i18 = i19;
        i21 = 1;
        do {
            for (i22 = 1; i22 < 9; ++i22) {
                switch ((i22 % 8) + 62) {
                case 62:
                    Test.instanceCount += (i22 - i20);
                    for (i24 = 2; i24 > i21; --i24) {
                        i23 = i19;
                        Test.instanceCount = -15846L;
                        i25 = i21;
                        Test.instanceCount += i21;
                        i23 += i24;
                    }
                    break;
                case 63:
                    i23 += (-2 + (i22 * i22));
                    break;
                case 64:
                    i23 <<= 117;
                    break;
                case 65:
                    lArr2[i22] &= Test.instanceCount;
                    break;
                case 66:
                    i20 = i21;
                    break;
                case 67:
                    if (i21 != 0) {
                    }
                    break;
                case 68:
                    i25 += i18;
                    break;
                case 69:
                }
            }
        } while (++i21 < 174);
        long meth_res = Double.doubleToLongBits(d) + Double.doubleToLongBits(d1) + (b ? 1 : 0) + i18 + i19 + i20 + by +
            i21 + i22 + i23 + i24 + i25 + FuzzerUtils.checkSum(lArr2);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-28814, i1=13, i2=2, i3=2, i26=8, i27=7, i28=30, i29=252, i30=-57201, i31=-79;
        double d4=-5.65770;
        float f2=1.644F, fArr[]=new float[N];
        byte by1=10;
        long lArr3[]=new long[N];

        FuzzerUtils.init(fArr, 0.739F);
        FuzzerUtils.init(lArr3, -117L);

        for (i = 9; i < 320; i++) {
            for (i2 = i; i2 < 81; ++i2) {
                i1 = sMeth(d4, 44.120418, Test.bFld);
                fArr[i2 + 1] += -201;
                i3 += (int)(7780710171866850194L + (i2 * i2));
                lArr3[i2] = 6;
            }
            f2 += i;
            for (i26 = 2; i26 < 81; i26++) {
                Test.iArrFld[i26 - 1] /= (int)(i27 | 1);
                i1 += (i26 + i2);
            }
            Test.instanceCount += (-4 + (i * i));
            for (i28 = 4; i28 < 81; ++i28) {
                for (i30 = 1; i30 < 2; ++i30) {
                    Test.instanceCount = i3;
                    Test.instanceCount = -11348;
                    if (Test.bFld) break;
                    i29 += (((i30 * Test.instanceCount) + i27) - Test.instanceCount);
                    Test.iArrFld[i28 + 1] += 31750;
                    i31 -= by1;
                    Test.iArrFld[i + 1] = (int)f2;
                    Test.instanceCount = i29;
                    i31 = (int)d4;
                }
                Test.instanceCount += i29;
                i27 *= i29;
                i31 += (((i28 * i28) + f2) - Test.instanceCount);
                i1 *= (int)Test.instanceCount;
            }
            Test.iArrFld[i] = i3;
            i29 += 20518;
            d4 = i;
            Test.instanceCount += (((i * f2) + f2) - Test.instanceCount);
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
