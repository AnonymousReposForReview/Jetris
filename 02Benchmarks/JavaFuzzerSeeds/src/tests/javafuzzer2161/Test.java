package tests.javafuzzer2161;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 09:42:50 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2067697610783520322L;
    public static int iFld=-208;
    public static byte byFld=-86;
    public short sFld=-30726;
    public static float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 1.465F);
        FuzzerUtils.init(Test.iArrFld, -76);
    }

    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(float f1, double d) {

        int i3=28665, i4=54, i5=-160, i6=-62322, i7=-4, i8=-1, i9=-2, i10=14, i11=0;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 48L);

        for (i3 = 11; 212 > i3; i3 += 2) {
            Test.instanceCount -= Test.iFld;
            i4 += (int)Test.instanceCount;
        }
        lArr1[(i5 >>> 1) % N] |= Test.instanceCount;
        for (i6 = 1; 213 > i6; i6++) {
            Test.instanceCount >>= Test.instanceCount;
            for (i8 = 1; i8 < 8; ++i8) {
                i9 = i4;
                for (i10 = 1; i10 < 2; i10++) {
                    i11 += (i10 | (long)f1);
                    Test.instanceCount ^= i8;
                    Test.iArrFld[i10] -= (int)-2.872F;
                    d += 201;
                }
                i9 *= -13;
                Test.iFld = i8;
            }
        }
        long meth_res = Float.floatToIntBits(f1) + Double.doubleToLongBits(d) + i3 + i4 + i5 + i6 + i7 + i8 + i9 + i10
            + i11 + FuzzerUtils.checkSum(lArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(short s, float f) {

        double d1=104.56318;
        int i12=0, i13=-205, i14=53758, i15=55258, iArr1[]=new int[N];
        boolean b=true;
        float f2=0.470F;

        FuzzerUtils.init(iArr1, -9);

        iArr1[(Test.iFld >>> 1) % N] &= iMeth1(f, d1);
        for (i12 = 6; i12 < 293; i12 += 3) {
            i13 *= (int)Test.instanceCount;
            f += (i12 + Test.iFld);
            Test.instanceCount -= Test.iFld;
            Test.iFld = (int)26271L;
            i14 = 1;
            while (++i14 < 16) {
                i13 >>>= (int)Test.instanceCount;
                i13 += (int)1.741F;
            }
        }
        if (b) {
            Test.iFld += -42311;
        } else if (b) {
            f += Test.instanceCount;
        } else if (b) {
            i13 = 6;
        }
        Test.byFld &= (byte)i15;
        Test.instanceCount += (long)f2;
        long meth_res = s + Float.floatToIntBits(f) + Double.doubleToLongBits(d1) + i12 + i13 + i14 + (b ? 1 : 0) + i15
            + Float.floatToIntBits(f2) + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(int i, int i1, int i2) {

        byte by=70;
        short s1=-19498;
        float f3=29.688F;
        int i16=6, i17=7476, iArr[]=new int[N];
        double d2=-2.28760;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 11856L);
        FuzzerUtils.init(iArr, -13048);

        Test.instanceCount = (long)Test.fArrFld[(i1 >>> 1) % N];
        i += (--Test.iFld);
        for (long l : lArr) {
            by |= (byte)(Math.abs(-(i2 - i1)) - (Test.iFld++));
            i1 = (int)(iArr[(i >>> 1) % N] <<= (int)l);
            if (true) {
                iMeth(s1, f3);
                if (i1 != 0) {
                }
            }
            for (i16 = 4; i16 > 1; i16 -= 2) {
                iArr[i16 + 1] = (int)-104.466F;
                Test.byFld += (byte)i16;
                l <<= i;
                i2 *= i;
                d2 = 5;
                Test.iFld *= (int)f3;
            }
        }
        long meth_res = i + i1 + i2 + by + s1 + Float.floatToIntBits(f3) + i16 + i17 + Double.doubleToLongBits(d2) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i18=248, i19=-32, i20=-12, i21=9, i22=-243, i23=-32421;
        float f4=-2.146F;
        boolean b1=false;
        byte byArr[]=new byte[N];
        double dArr[]=new double[N];
        long lArr2[]=new long[N];

        FuzzerUtils.init(byArr, (byte)-112);
        FuzzerUtils.init(dArr, 102.105740);
        FuzzerUtils.init(lArr2, -138L);

        Test.iFld %= (int)(Math.max((long)(lMeth(Test.iFld, Test.iFld, Test.iFld) + -2.82375), Test.instanceCount) | 1);
        for (i18 = 294; 9 < i18; i18 -= 2) {
            for (i20 = 177; i18 < i20; i20--) {
                for (i22 = 1; i22 > 1; --i22) {
                    i19 += (i22 + i20);
                    i19 = (int)Test.instanceCount;
                    i21 ^= i23;
                    Test.instanceCount -= (long)f4;
                    byArr[i22 + 1] = (byte)i20;
                    Test.instanceCount >>= 8305180228830394691L;
                    i23 = 12;
                    i23 -= -18859;
                    if (b1) {
                        if (b1) {
                            Test.byFld <<= (byte)42;
                            byArr[i20 - 1] -= (byte)i22;
                            i21 -= (int)1121581828L;
                        }
                    } else if (b1) {
                        if (b1) break;
                        Test.iFld += (((i22 * Test.iFld) + Test.byFld) - Test.instanceCount);
                        i21 = (int)87.102F;
                        Test.iArrFld[i22] <<= Test.iFld;
                    } else if (b1) {
                        f4 *= i20;
                        try {
                            i23 = (Test.iFld / i23);
                            Test.iFld = (i21 % 1314549989);
                            Test.iArrFld[i20 - 1] = (Test.iFld % 1414254999);
                        } catch (ArithmeticException a_e) {}
                        i21 = i19;
                        dArr[i18] *= i20;
                    }
                    i19 *= 39741;
                }
                Test.iArrFld[i20 - 1] = sFld;
                Test.iFld += (i20 * i20);
                try {
                    i21 = (i20 / 59042);
                    i19 = (Test.iFld % i22);
                    i21 = (-48 / Test.iArrFld[i18 + 1]);
                } catch (ArithmeticException a_e) {}
                lArr2[i18] = -9;
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
//DEBUG  iMeth1 ->  iMeth1 iMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
