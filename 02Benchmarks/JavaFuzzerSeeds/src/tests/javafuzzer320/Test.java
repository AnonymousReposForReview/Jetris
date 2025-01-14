package tests.javafuzzer320;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 01:49:53 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-11L;
    public static int iFld=-168;
    public static volatile int iFld1=-49402;
    public boolean bFld=false;
    public int iFld2=123;
    public static volatile short sFld=30877;
    public long lArrFld[]=new long[N];

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(byte by) {

        float f1=27.129F;
        int i2=-172, i3=-72, i4=4, i5=55984, i6=-4, i7=0, i8=252, i9=42874, iArr[]=new int[N];

        FuzzerUtils.init(iArr, 13);

        Test.iFld -= -24;
        f1 -= 19;
        for (i2 = 22; 367 > i2; i2 += 3) {
            iArr[i2] = i2;
            Test.instanceCount -= i2;
            for (i4 = 1; i4 < 14; ++i4) {
                Test.instanceCount -= Test.iFld;
            }
            f1 -= Test.iFld1;
            by += (byte)i2;
            for (i6 = 1; i6 < 14; i6++) {
                i7 = (int)-2.85F;
                Test.instanceCount += i6;
                for (i8 = 1; i8 < 2; ++i8) {
                    double d=0.51312;
                    try {
                        i9 = (-57822 % i5);
                        i5 = (i6 / -37059);
                        i9 = (-255 % i5);
                    } catch (ArithmeticException a_e) {}
                    d += i9;
                }
            }
        }
        long meth_res = by + Float.floatToIntBits(f1) + i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9 +
            FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i, float f, int i1) {

        byte by1=22;

        f -= iMeth1(by1);
        vMeth_check_sum += i + Float.floatToIntBits(f) + i1 + by1;
    }

    public static int iMeth() {

        float f2=-53.576F;
        byte by2=118;
        int i10=66, i11=-238, i12=-18972, i13=-7, iArr1[]=new int[N];
        double d1=-26.84690;
        boolean b=false;

        FuzzerUtils.init(iArr1, -3);

        vMeth(-1, f2, Test.iFld);
        iArr1[(9 >>> 1) % N] >>>= by2;
        Test.iFld = Test.iFld1;
        Test.iFld -= -68;
        for (i10 = 1; i10 < 323; i10++) {
            f2 *= (float)d1;
            Test.instanceCount = -9L;
        }
        Test.iFld >>= (int)Test.instanceCount;
        i12 = 193;
        while ((i12 -= 3) > 0) {
            f2 *= -146;
            if (true) {
                d1 += Test.instanceCount;
                i13 = 1;
                do {
                    Test.instanceCount = Test.instanceCount;
                    i11 &= (int)Test.instanceCount;
                } while (++i13 < 24);
            } else if (b) {
                i11 >>= Test.iFld;
            } else if (true) {
                Test.instanceCount *= Test.instanceCount;
            } else {
                iArr1[i12 - 1] -= (int)Test.instanceCount;
            }
        }
        long meth_res = Float.floatToIntBits(f2) + by2 + i10 + i11 + Double.doubleToLongBits(d1) + i12 + i13 + (b ? 1 :
            0) + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i14=-142, i15=252, i16=3, i17=-196, i18=-10, i19=-224, i20=-11, iArr2[]=new int[N], iArr3[]=new int[N];
        float f3=0.1003F;
        double d2=0.35959, d3=-1.101216;
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr2, -13371);
        FuzzerUtils.init(iArr3, 13);
        FuzzerUtils.init(sArr, (short)-30987);

        Test.iFld = iMeth();
        for (i14 = 3; i14 < 334; ++i14) {
            i15 += (((i14 * i14) + Test.iFld1) - f3);
            f3 += Test.iFld1;
            for (i16 = i14; i16 < 76; ++i16) {
                i17 -= (int)f3;
                try {
                    Test.iFld = (174207533 % Test.iFld1);
                    Test.iFld1 = (Test.iFld % 1754606504);
                    iArr2[i14] = (i15 / i17);
                } catch (ArithmeticException a_e) {}
                lArrFld[i16 - 1] -= Test.iFld;
            }
            Test.iFld -= 3549;
            for (d2 = 76; d2 > 4; d2--) {
                Test.iFld1 = (int)78.766F;
                if (bFld) continue;
                i17 += (int)(d2 - Test.instanceCount);
                iArr3[(int)(d2)] = Test.iFld1;
                i15 += i18;
                if (bFld) {
                    iArr3[i14 - 1] += -47830;
                } else if (bFld) {
                    iArr3[i14 - 1] <<= i15;
                    f3 = Test.instanceCount;
                    for (i19 = 1; 2 > i19; ++i19) {
                        Test.iFld1 += (((i19 * i14) + Test.instanceCount) - i19);
                        i20 -= iFld2;
                        switch ((i14 % 10) + 40) {
                        case 40:
                            i15 *= i16;
                            i18 += i19;
                            if (bFld) {
                                bFld = bFld;
                            } else if (bFld) {
                                sArr[(int)(d2)] >>>= (short)3;
                            } else {
                                i18 += iFld2;
                                i20 = (int)3428145161L;
                            }
                            break;
                        case 41:
                            i18 -= i19;
                        case 42:
                            Test.sFld += (short)i19;
                            break;
                        case 43:
                            bFld = bFld;
                            break;
                        case 44:
                            i18 += (i19 | i16);
                            break;
                        case 45:
                            d3 = i14;
                            break;
                        case 46:
                            iArr3[(int)(d2 - 1)] = Test.iFld;
                        case 47:
                            i20 += (((i19 * i20) + i17) - Test.instanceCount);
                        case 48:
                            i20 = -5;
                            break;
                        case 49:
                            f3 -= Test.instanceCount;
                            break;
                        }
                    }
                } else if (bFld) {
                    d3 += i14;
                } else {
                    lArrFld[(int)(d2)] = -3;
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
