package tests.javafuzzer3110;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 01:55:03 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-5742520869990855046L;
    public static double dFld=1.57322;
    public static volatile boolean bFld=true;
    public static byte byFld=96;
    public static volatile short sFld=-26684;
    public int iFld=20576;
    public static int iArrFld[]=new int[N];
    public double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -2);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i3, int i4) {

        int i5=109, i6=4, i7=35897, i8=3, i9=7, i10=5, i11=4;
        long l=-28053L, lArr[]=new long[N];
        boolean b=true;
        short s1=-3286;

        FuzzerUtils.init(lArr, 56518L);

        i3 *= (int)42220L;
        for (i5 = 12; i5 < 277; ++i5) {
            i6 <<= i6;
        }
        for (l = 7; l < 122; l++) {
            i6 = i7;
            lArr = lArr;
            for (i8 = 1; 14 > i8; i8++) {
                lArr = lArr;
            }
            for (i10 = 1; i10 < 14; i10++) {
                i11 = i6;
                b = b;
            }
            s1 += (short)(l | Test.instanceCount);
            i4 = (int)l;
            Test.dFld += l;
            Test.instanceCount += 222;
        }
        vMeth2_check_sum += i3 + i4 + i5 + i6 + l + i7 + i8 + i9 + i10 + i11 + (b ? 1 : 0) + s1 +
            FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(int i1, int i2) {

        short s=32481;
        int i13=241, i14=26152, i15=-2;

        s = (short)i2;
        vMeth2(i2, i2);
        Test.bFld = false;
        for (int i12 : Test.iArrFld) {
            if (false) {
                i12 = i12;
                for (i13 = 1; i13 < 4; ++i13) {
                    Test.byFld += (byte)Test.dFld;
                    switch ((i13 % 3) + 57) {
                    case 57:
                        i15 = 1;
                        do {
                            s += (short)i15;
                            i1 = (int)Test.instanceCount;
                            i1 = i1;
                            Test.byFld = (byte)Test.instanceCount;
                            Test.iArrFld[i15] -= i13;
                        } while (++i15 < 2);
                        break;
                    case 58:
                        i14 += (int)-4084498430482760324L;
                        break;
                    case 59:
                        i2 -= (int)Test.instanceCount;
                        break;
                    }
                }
            } else {
                Test.iArrFld[(i14 >>> 1) % N] = i14;
            }
        }
        vMeth1_check_sum += i1 + i2 + s + i13 + i14 + i15;
    }

    public static void vMeth(int i, byte by) {

        int i16=-2, i17=-82, i18=-93, i19=-234, i20=0;
        long l1=212L;
        float f=121.97F, fArr[]=new float[N];

        FuzzerUtils.init(fArr, -105.822F);

        vMeth1(i, i);
        i = 15;
        i += i;
        for (i16 = 2; 308 > i16; ++i16) {
            for (i18 = i16; 5 > i18; i18++) {
                for (l1 = 1; 1 < l1; --l1) {
                    i19 += i17;
                    f = Test.sFld;
                    i += (int)Test.dFld;
                    Test.bFld = Test.bFld;
                    if (false) continue;
                    i17 *= i18;
                }
                Test.bFld = Test.bFld;
                fArr[i16 - 1] += i17;
                i17 *= i19;
            }
        }
        vMeth_check_sum += i + by + i16 + i17 + i18 + i19 + l1 + i20 + Float.floatToIntBits(f) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        float f1=1.979F;
        int i22=-2, i23=3, i24=-126, i25=-38623, i26=177, i27=-12898, i28=2, i29=239, i30=-40800, i31=-64560;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 2L);

        vMeth(iFld, (byte)(-29));
        f1 -= (float)Test.dFld;
        dArrFld = dArrFld;
        for (int i21 : Test.iArrFld) {
            for (i22 = 2; i22 < 63; i22++) {
                Test.sFld -= (short)iFld;
            }
            f1 += i23;
            Test.instanceCount = (long)Test.dFld;
            if (Test.bFld) break;
        }
        try {
            f1 -= i23;
            for (i24 = 3; i24 < 123; i24++) {
                switch ((i24 % 10) + 111) {
                case 111:
                    for (i26 = i24; i26 < 209; i26++) {
                        Test.instanceCount >>= -166;
                        for (i28 = i24; i28 < 1; ++i28) {
                            f1 += (i28 * i25);
                            f1 -= i28;
                            iFld *= i23;
                            dArrFld[i28 - 1] = i23;
                            Test.iArrFld[i24 - 1] = 13;
                            if (Test.bFld) {
                                if (false) continue;
                                try {
                                    i29 = (i23 / i26);
                                    iFld = (i26 / i26);
                                    Test.iArrFld[i24] = (Test.iArrFld[i24] / -110);
                                } catch (ArithmeticException a_e) {}
                                i23 = i26;
                            } else if (true) {
                                f1 += (((i28 * i29) + i23) - i22);
                                Test.instanceCount += i28;
                            }
                        }
                        for (i30 = 1; i30 < 1; ++i30) {
                            Test.iArrFld[i24] -= i28;
                            Test.instanceCount -= Test.sFld;
                        }
                    }
                    break;
                case 112:
                    Test.instanceCount |= Test.instanceCount;
                case 113:
                    Test.dFld = i22;
                    break;
                case 114:
                    Test.iArrFld = FuzzerUtils.int1array(N, (int)-38111);
                    break;
                case 115:
                    i25 -= (int)Test.dFld;
                    break;
                case 116:
                    i25 += (i24 + f1);
                    break;
                case 117:
                case 118:
                    Test.byFld = (byte)Test.instanceCount;
                    break;
                case 119:
                    iFld += (i24 | Test.instanceCount);
                    break;
                case 120:
                    lArr1[i24 - 1] = i24;
                    break;
                default:
                    Test.instanceCount = i25;
                }
            }
        }
        catch (NegativeArraySizeException exc1) {
            i27 |= (int)Test.instanceCount;
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