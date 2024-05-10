package tests.javafuzzer3172;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 03:08:16 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=4939687068379231074L;
    public static int iFld=-5;
    public static boolean bFld=true;
    public static short sFld=-26371;
    public byte byFld=-57;
    public static boolean bArrFld[]=new boolean[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.bArrFld, true);
        FuzzerUtils.init(Test.iArrFld, 5);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l, int i4, long l1) {

        byte by=5;
        int i5=213, i6=50, i7=5, i8=-10, i9=-36913, iArr1[]=new int[N];
        double d=-89.15652;
        float f=7.981F;
        short s1=-22397;

        FuzzerUtils.init(iArr1, -4);

        by >>>= (byte)Test.iFld;
        i5 = 1;
        while ((i5 += 2) < 358) {
            for (d = 1; d < 9; d++) {
                i6 *= (int)d;
                Test.instanceCount /= (i4 | 1);
                if (Test.bFld) break;
            }
            i6 = 11614;
            if (Test.bFld) {
                i6 = i4;
                i7 = 1;
                while (++i7 < 9) {
                    iArr1[i5] *= (int)f;
                    l = i6;
                    for (i8 = 1; i8 < 1; i8++) {
                        i9 += i8;
                        Test.sFld &= s1;
                    }
                }
            } else {
                Test.bArrFld = Test.bArrFld;
            }
        }
        vMeth2_check_sum += l + i4 + l1 + by + i5 + Double.doubleToLongBits(d) + i6 + i7 + Float.floatToIntBits(f) + i8
            + i9 + s1 + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth1(int i2, short s) {

        int i3=203, i10=244, i11=-35, i12=60842, i13=9, i14=32192, iArr2[]=new int[N];
        double d1=-1.126139;
        long l2=24934L;
        float f1=-2.945F;

        FuzzerUtils.init(iArr2, -49886);

        i3 = 1;
        while (++i3 < 174) {
            vMeth2(8L, 53963, 49L);
            iArr2[i3] += (int)Test.instanceCount;
            Test.iFld %= (int)((long)(d1) | 1);
        }
        for (i10 = 3; i10 < 336; i10++) {
            Test.bArrFld[i10 - 1] = Test.bFld;
            Test.iFld = s;
            i2 = (int)Test.instanceCount;
            Test.iFld += i3;
            iArr2[i10 + 1] += (int)d1;
            for (i12 = 1; i12 < 5; ++i12) {
                for (l2 = 1; 2 > l2; l2 += 2) {
                    d1 -= -3668580152L;
                    f1 += (l2 * l2);
                    i11 += (int)Test.instanceCount;
                }
            }
        }
        vMeth1_check_sum += i2 + s + i3 + Double.doubleToLongBits(d1) + i10 + i11 + i12 + i13 + l2 + i14 +
            Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr2);
    }

    public static void vMeth() {

        int i=12442, i1=-18, i15=17, i16=24, i17=-36, iArr[][]=new int[N][N];
        byte by1=-49;
        float f2=82.238F;

        FuzzerUtils.init(iArr, 1);

        iArr[(Test.iFld >>> 1) % N][(Test.iFld >>> 1) % N] >>>= (iArr[(Test.iFld >>> 1) % N][(Test.iFld >>> 1) % N]--);
        for (i = 253; i > 1; --i) {
            iArr[i - 1][i] *= ((~(i * i)) + (i1--));
            vMeth1(Test.iFld, Test.sFld);
            Test.iFld <<= i1;
            i1 >>= Test.sFld;
            if (Test.bFld) continue;
            i1 += i;
            Test.iFld = 4670;
            switch (((i % 10) * 5) + 58) {
            case 64:
                i15 = 6;
                while (--i15 > 0) {
                    i1 += (i15 * i15);
                    for (i16 = 1; i16 < 1; ++i16) {
                        i17 = (int)Test.instanceCount;
                        i1 += (((i16 * i17) + i1) - i15);
                    }
                }
                break;
            case 97:
                i17 ^= Test.sFld;
                break;
            case 91:
                i1 -= i1;
            case 65:
                try {
                    i1 = (iArr[i][i] % Test.iFld);
                    iArr[i + 1][i] = (-9714 / i17);
                    i17 = (i15 % -6018);
                } catch (ArithmeticException a_e) {}
            case 94:
                by1 = (byte)Test.instanceCount;
                break;
            case 87:
                i17 += (i * i);
                break;
            case 99:
                Test.instanceCount >>>= Test.instanceCount;
                break;
            case 74:
                Test.iFld = (int)72.106195;
                break;
            case 101:
                Test.iFld *= i17;
            case 96:
                Test.iFld &= i17;
                break;
            default:
                i1 += (((i * f2) + Test.iFld) - Test.iFld);
            }
        }
        vMeth_check_sum += i + i1 + i15 + i16 + i17 + by1 + Float.floatToIntBits(f2) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i18=180, i19=-10, i20=42571, i21=203, i22=-20728, i23=-47961, i24=3889, i25=77, i26=-182, i27=-12;
        float f3=2.700F, f4=0.624F;
        double d2=0.78392;
        byte byArr[][]=new byte[N][N];
        long lArr[]=new long[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(byArr, (byte)75);
        FuzzerUtils.init(lArr, -39966L);
        FuzzerUtils.init(sArr, (short)-20032);

        vMeth();
        if (Test.bFld) {
            for (i18 = 209; 8 < i18; --i18) {
                byFld += (byte)(i18 + i19);
                if (true) continue;
                i19 >>>= i19;
                f3 += i18;
                i19 += i18;
                Test.iFld = 0;
                i19 = (int)Test.instanceCount;
                Test.iFld += 29392;
            }
            for (i20 = 4; i20 < 204; ++i20) {
                i19 = byFld;
                for (i22 = 126; i22 > i20; i22 -= 2) {
                    i23 = -5203;
                    try {
                        i19 = (i20 / -1567120834);
                        i21 = (15114 / i18);
                        i23 = (i21 / -202);
                    } catch (ArithmeticException a_e) {}
                }
                Test.iArrFld = FuzzerUtils.int1array(N, (int)-1);
                f4 = 1;
                while (++f4 < 126) {
                    for (i24 = i20; 1 > i24; ++i24) {
                        f3 += i25;
                        Test.iFld += i19;
                        d2 -= -40759L;
                        Test.instanceCount = i18;
                        f3 += (0.168F + (i24 * i24));
                    }
                    byArr[i20 + 1][(int)(f4)] >>>= (byte)i25;
                    switch ((i20 % 2) + 125) {
                    case 125:
                        lArr[i20 + 1] += Test.instanceCount;
                        for (i26 = 1; i26 < 1; i26++) {
                            sArr[(int)(f4 - 1)] = (short)-2.590F;
                        }
                        i21 *= i18;
                        break;
                    case 126:
                        i27 = i21;
                    default:
                        i23 -= Test.iFld;
                    }
                }
            }
        } else if (Test.bFld) {
            lArr[(-17852 >>> 1) % N] = -12;
        } else {
            i23 *= i22;
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