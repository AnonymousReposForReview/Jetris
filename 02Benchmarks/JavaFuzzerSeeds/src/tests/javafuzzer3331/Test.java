package tests.javafuzzer3331;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 06:16:20 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-45317L;
    public static int iFld=2;
    public static double dFld=-2.127552;
    public static volatile short sFld=31936;
    public boolean bFld=true;
    public byte byFld=108;
    public static volatile int iArrFld[]=new int[N];
    public static long lArrFld[][]=new long[N][N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 166);
        FuzzerUtils.init(Test.lArrFld, 3936174864426158475L);
        FuzzerUtils.init(Test.fArrFld, 87.461F);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(boolean b) {

        int i2=-4, i3=148, i4=-1, i5=9584;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 0.757F);

        for (float f2 : fArr) {
            f2 = Test.instanceCount;
            for (i2 = 1; i2 < 4; i2++) {
                i3 <<= (int)Test.instanceCount;
                if (b) {
                    for (i4 = 1; 2 > i4; i4++) {
                        Test.iArrFld = Test.iArrFld;
                        i5 = (int)Test.dFld;
                        i3 |= i2;
                        i3 -= (int)Test.instanceCount;
                        Test.instanceCount -= Test.instanceCount;
                        Test.iArrFld[i2 + 1] = (int)Test.instanceCount;
                        Test.iFld += (int)Test.instanceCount;
                        i5 = (int)Test.instanceCount;
                    }
                    vMeth1_check_sum += (b ? 1 : 0) + i2 + i3 + i4 + i5 +
                        Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                    return;
                } else if (b) {
                    f2 -= Test.instanceCount;
                    vMeth1_check_sum += (b ? 1 : 0) + i2 + i3 + i4 + i5 +
                        Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                    return;
                } else if (b) {
                    i3 += i2;
                } else {
                    if (b) break;
                }
            }
        }
        vMeth1_check_sum += (b ? 1 : 0) + i2 + i3 + i4 + i5 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static long lMeth(short s) {

        float f1=36.989F;
        boolean b1=false;
        int i7=5930, i8=-199;

        Test.iFld -= (int)((--Test.instanceCount) + Math.abs(Test.iFld++));
        Test.iFld <<= Math.max(Test.iFld, -Math.abs(Test.iFld));
        Test.instanceCount += (long)(-135 - Test.dFld);
        f1 += (float)((Integer.reverseBytes(Test.iFld) * (-54L - (-13 + (Test.dFld * Test.iFld)))) % ((++Test.iFld) |
            1));
        vMeth1(b1);
        for (int i6 : Test.iArrFld) {
            for (i7 = 1; i7 < 4; ++i7) {
                switch (((i8 >>> 1) % 1) + 26) {
                case 26:
                }
                b1 = b1;
                if (b1) break;
                Test.iArrFld[i7] = Test.iFld;
                i6 = i8;
                Test.instanceCount = 26;
                Test.iFld += (((i7 * i8) + i7) - Test.instanceCount);
                Test.instanceCount += i7;
            }
        }
        long meth_res = s + Float.floatToIntBits(f1) + (b1 ? 1 : 0) + i7 + i8;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth() {

        int i=-14, i1=70, i9=-159, i10=-21, i11=-56131;
        float f=80.51F;

        for (i = 8; 168 > i; i++) {
            f += (((i + 96) + i1) + (-(++i1)));
            lMeth(Test.sFld);
            Test.lArrFld[i][i - 1] -= Test.instanceCount;
            for (i9 = 10; i9 > i; i9 -= 2) {
                Test.fArrFld[i - 1] = i1;
                Test.iArrFld[i] += i9;
                Test.iFld >>= i11;
                Test.instanceCount += i10;
                Test.iFld *= (int)Test.instanceCount;
                f += (1.825F + (i9 * i9));
                i10 += (((i9 * Test.iFld) + i1) - i9);
                Test.iFld <<= (int)Test.instanceCount;
                i11 -= (int)Test.instanceCount;
            }
        }
        Test.iFld >>= Test.iFld;
        vMeth_check_sum += i + i1 + Float.floatToIntBits(f) + i9 + i10 + i11;
    }

    public void mainTest(String[] strArr1) {

        int i12=-1105, i13=11, i14=41338, i15=-47791, i16=-34262;
        float f3=0.661F, f4=125.456F, f5=25.213F;

        vMeth();
        i12 = 273;
        while (--i12 > 0) {
            for (i13 = 1; 92 > i13; ++i13) {
                Test.iFld = -2;
                Test.sFld += (short)i12;
                switch ((i12 % 5) + 12) {
                case 12:
                    for (f3 = 2; f3 > 1; f3 -= 3) {
                        i15 += (int)Test.instanceCount;
                        Test.iFld = i15;
                        Test.iFld -= i13;
                        i14 += (int)f3;
                        Test.instanceCount *= Test.iFld;
                        i15 = (int)Test.instanceCount;
                        Test.iArrFld[(int)(f3 + 1)] -= i12;
                        Test.iArrFld[i13] /= -51615;
                    }
                    for (f4 = 1; f4 < 2; ++f4) {
                        switch (((i13 % 1) * 5) + 38) {
                        case 39:
                            switch ((i12 % 10) + 110) {
                            case 110:
                            case 111:
                                i15 = i12;
                                Test.iFld += (int)(((f4 * Test.instanceCount) + i15) - Test.instanceCount);
                                break;
                            case 112:
                                Test.instanceCount += (long)f4;
                                Test.iFld += (int)f4;
                                bFld = bFld;
                                Test.iFld >>>= Test.iFld;
                                break;
                            case 113:
                                f5 += (((f4 * i13) + i12) - Test.instanceCount);
                                Test.iFld -= 2;
                                break;
                            case 114:
                                switch ((i12 % 2) + 123) {
                                case 123:
                                    i16 += (int)(((f4 * Test.instanceCount) + i14) - i15);
                                    if (bFld) continue;
                                case 124:
                                    Test.iFld = i15;
                                default:
                                    Test.iFld *= i12;
                                }
                            case 115:
                                if (bFld) continue;
                                break;
                            case 116:
                                i16 += (int)f5;
                                break;
                            case 117:
                                Test.instanceCount >>>= i13;
                                break;
                            case 118:
                                byFld *= (byte)i13;
                                break;
                            case 119:
                                f5 *= -26296;
                                break;
                            }
                            break;
                        default:
                            Test.instanceCount = i16;
                        }
                    }
                    break;
                case 13:
                    i15 -= (int)Test.dFld;
                case 14:
                    i14 = i13;
                    break;
                case 15:
                    bFld = bFld;
                    break;
                case 16:
                    i14 = (int)-2075138390L;
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
