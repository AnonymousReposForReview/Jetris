package tests.javafuzzer553;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 05:32:49 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=253L;
    public static int iFld=252;
    public static int iFld1=-21;
    public static short sFld=27088;
    public long lArrFld[]=new long[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l1) {

        int i2=188, i3=-49631, i4=52944, i5=32287, i6=-29327, i7=-8, i8=196, i9=-180, i10=13, i11=64549, i13=-124,
            iArr1[]=new int[N];
        double d2=3.89651;
        boolean b1=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr1, 94);
        FuzzerUtils.init(lArr, -2156309609111246168L);

        for (i2 = 2; i2 < 167; i2++) {
            for (i4 = 10; i4 > 1; i4--) {
                l1 = -24;
                i3 += (((i4 * Test.iFld1) + Test.instanceCount) - Test.iFld1);
                Test.iFld1 <<= 12225;
            }
        }
        iArr1[(i4 >>> 1) % N] += i4;
        iArr1[(Test.iFld1 >>> 1) % N] = i4;
        for (i6 = 10; i6 < 330; i6++) {
            lArr[i6] = (long)d2;
            for (i8 = 1; i8 < 5; ++i8) {
                l1 = l1;
                for (i10 = 1; i10 < 2; i10++) {
                    int i12=2;
                    try {
                        iArr1[i10 - 1] = (-51185 % i12);
                        i9 = (i4 / i3);
                        i9 = (i13 / -24786);
                    } catch (ArithmeticException a_e) {}
                    b1 = b1;
                    Test.sFld -= (short)i6;
                }
            }
        }
        vMeth2_check_sum += l1 + i2 + i3 + i4 + i5 + i6 + i7 + Double.doubleToLongBits(d2) + i8 + i9 + i10 + i11 + i13
            + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1() {

        byte by=-81;
        double d1=-24.29142;
        int iArr[]=new int[N];

        FuzzerUtils.init(iArr, 15250);

        Test.iFld -= (int)((iArr[(Test.iFld >>> 1) % N] = (Test.iFld1 + by)) - d1);
        vMeth2(-50192L);
        Test.sFld <<= (short)Test.iFld;
        vMeth1_check_sum += by + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(double d, long l, boolean b) {

        float f=1.704F;
        int i14=-46483, i15=48749, i16=59305, i17=2, iArr2[]=new int[N];
        long l2=3097891786L, lArr1[]=new long[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)47);
        FuzzerUtils.init(iArr2, -7);
        FuzzerUtils.init(lArr1, -34L);

        Test.iFld *= (int)(Test.instanceCount -= ((Test.iFld - Test.iFld) * (Test.iFld * Test.iFld)));
        vMeth1();
        Test.iFld -= (int)l;
        Test.iFld += (int)f;
        Test.iFld = Test.iFld1;
        for (i14 = 7; i14 < 225; i14 += 3) {
            Test.iFld = i15;
            Test.iFld -= 161;
            Test.iFld = (int)f;
            byArr[i14 - 1] += (byte)Test.instanceCount;
        }
        for (l2 = 3; l2 < 187; l2 += 3) {
            switch (((176 >>> 1) % 7) + 125) {
            case 125:
                try {
                    Test.iFld = (105 % iArr2[(int)(l2)]);
                    iArr2[(int)(l2 - 1)] = (i16 / i17);
                    i16 = (Test.iFld / i17);
                } catch (ArithmeticException a_e) {}
                i17 -= (int)-10L;
                if (b) break;
                break;
            case 126:
                lArr1[(int)(l2 - 1)] = Test.instanceCount;
                break;
            case 127:
                i17 = (int)l;
                break;
            case 128:
                try {
                    Test.iFld1 = (-38 % i17);
                    iArr2[(int)(l2 - 1)] = (Test.iFld1 / 39484);
                    iArr2[(int)(l2)] = (i17 % Test.iFld);
                } catch (ArithmeticException a_e) {}
            case 129:
                Test.instanceCount += i16;
                break;
            case 130:
                lArr1[(int)(l2 + 1)] *= (long)f;
                break;
            case 131:
                i17 += (int)l2;
                break;
            default:
                lArr1[(int)(l2 - 1)] >>= Test.iFld1;
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + l + (b ? 1 : 0) + Float.floatToIntBits(f) + i14 + i15 + l2 +
            i16 + i17 + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(lArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=53, i1=13, i19=-11, i20=-110, i21=-70, i22=-4, i23=24362, i24=13;
        double d3=1.75470;
        boolean b2=true;
        float f1=2.377F;
        byte by1=114, byArr1[]=new byte[N];

        FuzzerUtils.init(byArr1, (byte)-114);

        for (i = 4; i < 121; i++) {
            vMeth(d3, Test.instanceCount, b2);
            i1 *= (int)d3;
            Test.sFld += (short)Test.instanceCount;
            for (i19 = 214; i19 > 4; i19--) {
                byArr1 = byArr1;
                d3 = 13;
                i20 *= (int)f1;
                Test.iFld -= by1;
                lArrFld[i19 - 1] -= (long)d3;
            }
            i21 = 1;
            do {
                if (b2) break;
                switch (((i % 5) * 5) + 61) {
                case 65:
                case 66:
                    for (i22 = 1; 1 < i22; --i22) {
                        i20 += (int)d3;
                        d3 -= 55;
                        i1 += i22;
                        Test.iFld1 += (i22 + i23);
                        Test.instanceCount += (long)d3;
                        d3 = Test.instanceCount;
                        Test.iFld = i22;
                        Test.instanceCount >>= Test.iFld;
                    }
                    i24 = 1;
                    while (++i24 < 1) {
                        Test.iFld1 += i;
                        Test.iFld1 >>>= Test.iFld1;
                        i23 <<= i22;
                    }
                    Test.instanceCount = i22;
                    break;
                case 73:
                    i1 += (int)Test.instanceCount;
                    b2 = b2;
                    break;
                case 74:
                    i20 += (((i21 * i19) + Test.instanceCount) - i);
                case 64:
                    b2 = b2;
                    break;
                default:
                    i23 = i20;
                }
            } while (++i21 < 214);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}