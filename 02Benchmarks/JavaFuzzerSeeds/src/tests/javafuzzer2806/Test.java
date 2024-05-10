package tests.javafuzzer2806;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 20:40:36 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=37599L;
    public static int iFld=-121;
    public static double dFld=0.27693;
    public static short sFld=-2992;
    public static float fFld=22.57F;
    public static volatile byte byFld=-81;
    public boolean bFld=true;

    public static long byMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i1) {

        int i2=54652, i3=-21604, i4=-38236, i5=-4, i6=-59269, i7=-17697;
        float f=90.371F;

        Test.iFld = Test.iFld;
        Test.instanceCount = Test.iFld;
        for (i2 = 13; i2 < 306; ++i2) {
            i4 = 1;
            do {
                Test.iFld = i4;
                Test.dFld -= i4;
                Test.instanceCount ^= i1;
            } while (++i4 < 6);
            Test.instanceCount += Test.iFld;
            i5 += (int)Test.instanceCount;
            for (i6 = 1; i6 < 6; ++i6) {
                i1 = -10;
                i3 -= (int)f;
                Test.iFld <<= i6;
                i5 = (int)Test.instanceCount;
                i1 += i6;
            }
        }
        long meth_res = i1 + i2 + i3 + i4 + i5 + i6 + i7 + Float.floatToIntBits(f);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth() {

        int i8=-120, i9=7, i10=-26332, i11=-170, i12=17993, i13=-9;
        float f1=-1.345F;
        boolean b=false;
        short sArr1[]=new short[N];

        FuzzerUtils.init(sArr1, (short)21142);

        Test.instanceCount += (Test.instanceCount - lMeth(Test.iFld));
        for (i8 = 332; i8 > 11; i8 -= 2) {
            Test.iFld >>= (int)4260514613688098922L;
            Test.dFld = Test.instanceCount;
            f1 += (((i8 * i8) + Test.instanceCount) - Test.instanceCount);
            b = b;
            if (b) {
            } else {
                i9 -= (int)Test.instanceCount;
                i9 += (i8 * i8);
                vMeth_check_sum += i8 + i9 + Float.floatToIntBits(f1) + (b ? 1 : 0) + i10 + i11 + i12 + i13 +
                    FuzzerUtils.checkSum(sArr1);
                return;
            }
            for (i10 = 1; i10 < 10; i10++) {
                Test.iFld += (((i10 * i10) + f1) - Test.sFld);
                i9 += 11;
                for (i12 = i10; i12 < 2; i12++) {
                    sArr1[i8 + 1] = (short)Test.dFld;
                    Test.instanceCount += (i12 | i12);
                }
            }
        }
        vMeth_check_sum += i8 + i9 + Float.floatToIntBits(f1) + (b ? 1 : 0) + i10 + i11 + i12 + i13 +
            FuzzerUtils.checkSum(sArr1);
    }

    public static byte byMeth(long l, double d1, long l1) {

        int i14=-209, i15=51695, i16=16994, i17=97, i18=2;
        boolean b1=false;
        float f2=5.290F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -7L);

        vMeth();
        i14 = 1;
        while (++i14 < 151) {
            for (i15 = 1; i15 < 10; ++i15) {
                l1 = -24607;
                for (i17 = 2; i17 > 1; i17 -= 2) {
                    i16 = (int)Test.instanceCount;
                    switch (((i15 % 6) * 5) + 50) {
                    case 65:
                        if (b1) {
                            Test.instanceCount += l;
                        } else {
                            l &= l1;
                            Test.iFld |= i15;
                            Test.sFld = (short)i14;
                        }
                        f2 = Test.instanceCount;
                        if (b1) continue;
                        break;
                    case 74:
                        d1 *= Test.iFld;
                        break;
                    case 78:
                    case 57:
                        lArr[i15] = i18;
                        break;
                    case 80:
                        Test.iFld -= i15;
                        break;
                    case 77:
                        i18 = i17;
                    }
                }
            }
        }
        long meth_res = l + Double.doubleToLongBits(d1) + l1 + i14 + i15 + i16 + i17 + i18 + (b1 ? 1 : 0) +
            Float.floatToIntBits(f2) + FuzzerUtils.checkSum(lArr);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d=6.28404;
        int i19=43480, i20=-18443, i21=-45122, i22=240, i23=-1, i24=-18, iArr[]=new int[N];
        short sArr[]=new short[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr, 194);
        FuzzerUtils.init(sArr, (short)-1066);
        FuzzerUtils.init(fArr, 11.674F);

        iArr[(Test.iFld >>> 1) % N] = (int)(d - Test.iFld);
        Test.iFld <<= (Test.iFld + iArr[(Test.iFld >>> 1) % N]);
        for (int i : iArr) {
            sArr[(i >>> 1) % N] = (short)(byMeth(Test.instanceCount, Test.dFld, Test.instanceCount) - Test.iFld);
        }
        for (i19 = 1; i19 < 364; ++i19) {
            switch (((i19 % 7) * 5) + 5) {
            case 24:
                for (i21 = 69; i19 < i21; --i21) {
                    if (bFld) {
                        Test.iFld -= (int)d;
                    } else if (bFld) {
                        for (i23 = 1; i23 < 1; ++i23) {
                            i24 += i22;
                            i22 = i22;
                            Test.instanceCount += 2493767528L;
                            Test.fFld *= i19;
                            iArr[i21] &= Test.iFld;
                            switch (((12 >>> 1) % 9) + 106) {
                            case 106:
                                i24 += i23;
                                i24 += i21;
                                break;
                            case 107:
                                Test.instanceCount = (long)Test.fFld;
                            case 108:
                                Test.iFld = i21;
                                i20 >>>= (int)Test.instanceCount;
                                Test.instanceCount = Test.sFld;
                                break;
                            case 109:
                                fArr[i19 - 1] += -2;
                                switch (((i21 % 2) * 5) + 58) {
                                case 62:
                                    Test.instanceCount += Test.iFld;
                                    Test.iFld = i24;
                                    break;
                                case 63:
                                    Test.fFld += (i23 * i23);
                                    i22 += (((i23 * Test.instanceCount) + Test.iFld) - Test.sFld);
                                    Test.iFld = i21;
                                    break;
                                }
                                iArr[i23 + 1] |= (int)Test.instanceCount;
                                break;
                            case 110:
                                Test.instanceCount = Test.instanceCount;
                                break;
                            case 111:
                                Test.sFld -= (short)Test.instanceCount;
                            case 112:
                                d *= i21;
                                break;
                            case 113:
                                Test.instanceCount *= (long)2.518F;
                                break;
                            case 114:
                                i20 = Test.byFld;
                                break;
                            }
                        }
                    } else if (bFld) {
                        iArr[i19 + 1] += (int)Test.fFld;
                    } else {
                        Test.instanceCount <<= Test.instanceCount;
                    }
                }
            case 21:
                Test.iFld += (((i19 * i23) + i23) - i22);
                break;
            case 33:
                i22 -= Test.byFld;
                break;
            case 17:
                iArr = iArr;
                break;
            case 26:
                Test.instanceCount *= i21;
                break;
            case 34:
                i22 = i20;
                break;
            case 36:
                try {
                    i22 = (i20 % 156);
                    iArr[i19 + 1] = (-56 % i21);
                    iArr[i19 - 1] = (iArr[i19] / 32142);
                } catch (ArithmeticException a_e) {}
                break;
            default:
                Test.iFld += (((i19 * Test.byFld) + i24) - i21);
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
//DEBUG  byMeth ->  byMeth mainTest
//DEBUG  vMeth ->  vMeth byMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth byMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
