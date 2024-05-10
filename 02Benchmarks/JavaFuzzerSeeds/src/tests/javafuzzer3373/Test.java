package tests.javafuzzer3373;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 06:52:34 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=44L;
    public static boolean bFld=true;
    public static byte byFld=-16;
    public double dFld=-2.30887;
    public static int iArrFld[]=new int[N];
    public static volatile float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -11);
        FuzzerUtils.init(Test.fArrFld, -1.265F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(long l, int i6) {

        int i7=-82, i8=-174, i9=10, i10=-12, i11=-85, i12=-43;
        float f2=-1.24F;
        double d1=-1.88955;

        for (i7 = 7; i7 < 187; i7++) {
            Test.instanceCount = Test.instanceCount;
            i6 = (int)Test.instanceCount;
            f2 += i7;
            i6 >>= i6;
            f2 -= i8;
            i6 /= (int)(i7 | 1);
            l = l;
            for (i9 = 1; i9 < 9; ++i9) {
                l /= (Test.instanceCount | 1);
                for (i11 = i7; 2 > i11; ++i11) {
                    Test.instanceCount = i9;
                    d1 += l;
                    i10 -= (int)l;
                    i6 += (((i11 * i9) + l) - l);
                }
            }
        }
        long meth_res = l + i6 + i7 + i8 + Float.floatToIntBits(f2) + i9 + i10 + i11 + i12 +
            Double.doubleToLongBits(d1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1(int i4, int i5, float f1) {

        double d=45.101059;
        int i13=-2, i14=-32227;

        Test.iArrFld[(i5 >>> 1) % N] >>= (int)(--Test.instanceCount);
        d *= ((i4 += Math.min(i4, -4)) + lMeth(Test.instanceCount, i4));
        for (i13 = 11; i13 < 244; ++i13) {
            f1 += (i13 * Test.instanceCount);
            Test.instanceCount *= i4;
        }
        i14 &= i13;
        i4 = i13;
        i5 -= (int)f1;
        f1 += (float)d;
        Test.instanceCount = 53544;
        vMeth1_check_sum += i4 + i5 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d) + i13 + i14;
    }

    public static void vMeth() {

        int i=-48, i1=-121, i2=7, i3=7, i15=-1009, i16=54980, iArr[][]=new int[N][N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(iArr, 2);
        FuzzerUtils.init(bArr, false);

        for (i = 15; i < 246; ++i) {
            float f=2.702F;
            f += i;
            if (Test.bFld) {
                iArr[i + 1] = (iArr[i - 1] = (iArr[i + 1] = (iArr[i - 1] = iArr[i])));
                Test.instanceCount -= i1;
                try {
                    i1 = (i % 201);
                    i1 = (i % i);
                    i1 = (30904 % i);
                } catch (ArithmeticException a_e) {}
                Test.instanceCount <<= -13;
            } else if (Test.bFld) {
                for (i2 = 1; i2 < 7; ++i2) {
                    vMeth1(-13, 12149, f);
                    for (i15 = 1; 2 > i15; i15++) {
                        Test.instanceCount += i15;
                        Test.bFld = Test.bFld;
                        Test.instanceCount -= i1;
                        i3 += (int)f;
                    }
                    bArr[i] = false;
                }
                vMeth_check_sum += i + i1 + i2 + i3 + i15 + i16 + FuzzerUtils.checkSum(iArr) +
                    FuzzerUtils.checkSum(bArr);
                return;
            } else if (Test.bFld) {
                i3 += i16;
            } else {
                Test.byFld %= (byte)(i1 | 1);
                vMeth_check_sum += i + i1 + i2 + i3 + i15 + i16 + FuzzerUtils.checkSum(iArr) +
                    FuzzerUtils.checkSum(bArr);
                return;
            }
        }
        vMeth_check_sum += i + i1 + i2 + i3 + i15 + i16 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(bArr);
    }

    public void mainTest(String[] strArr1) {

        int i17=153, i18=4, i19=-3, i21=11319, i22=51888, i23=62, i24=-2, i25=25;
        float f3=0.233F;
        double d2=119.114185;
        short s=5943;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -8086789637065805619L);

        vMeth();
        for (i17 = 2; i17 < 205; ++i17) {
            dFld *= dFld;
        }
        i19 = 1;
        while ((i19 += 2) < 382) {
            i18 &= (int)Test.instanceCount;
            f3 *= Test.instanceCount;
            Test.bFld = Test.bFld;
            Test.fArrFld[i19 - 1] = i19;
            if (true) continue;
            if (Test.bFld) {
                for (d2 = 131; d2 > 5; d2 -= 2) {
                    s -= (short)i19;
                    for (i22 = 3; d2 < i22; i22--) {
                        Test.instanceCount = -123;
                        lArr[i19 + 1] /= (Test.instanceCount | 1);
                    }
                    Test.instanceCount += (-13856 + (d2 * d2));
                    if (Test.bFld) {
                        i23 -= i17;
                        for (i24 = i19; 3 > i24; i24++) {
                            Test.instanceCount += (((i24 * i18) + i23) - i23);
                            Test.iArrFld[i24] = i22;
                            i18 <<= i22;
                            switch (((i23 >>> 1) % 7) + 121) {
                            case 121:
                                Test.instanceCount = i23;
                            case 122:
                                Test.instanceCount = i25;
                                i23 = s;
                                Test.instanceCount *= i18;
                                break;
                            case 123:
                                dFld *= Test.instanceCount;
                                Test.iArrFld = Test.iArrFld;
                            case 124:
                                i18 = i25;
                                break;
                            case 125:
                                Test.byFld += (byte)f3;
                                break;
                            case 126:
                                s = (short)i17;
                                break;
                            case 127:
                                try {
                                    i25 = (i17 / i17);
                                    i18 = (i18 % 64506);
                                    i25 = (156 % i24);
                                } catch (ArithmeticException a_e) {}
                                break;
                            default:
                                i25 = (int)f3;
                            }
                        }
                    } else if (false) {
                        i23 = -811;
                    }
                }
            } else if (Test.bFld) {
                i25 += (int)Test.instanceCount;
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}