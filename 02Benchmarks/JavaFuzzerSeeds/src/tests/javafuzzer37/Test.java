package tests.javafuzzer37;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 21:26:32 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=4L;
    public static float fFld=-49.182F;
    public static volatile double dFld=12.108101;
    public static boolean bFld=false;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];
    public static short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 59);
        FuzzerUtils.init(Test.lArrFld, 2628337112L);
        FuzzerUtils.init(Test.sArrFld, (short)22382);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i3=14, i4=-7, i5=204, i6=41, i7=-184, i8=13, i9=5, i10=-14, i11=-2, i12=25378, i13=65016, i14=10;
        short s=20049;

        i3 = i3;
        for (i4 = 9; 224 > i4; i4++) {
            switch (((i3 >>> 1) % 3) + 2) {
            case 2:
                for (i6 = 1; i6 < 7; i6++) {
                    for (i8 = 1; i8 < 2; i8++) {
                        try {
                            i5 = (26572 % Test.iArrFld[i8]);
                            i9 = (i3 / -35420);
                            i10 = (163 % i8);
                        } catch (ArithmeticException a_e) {}
                    }
                }
                s = (short)Test.instanceCount;
                break;
            case 3:
                for (i11 = i4; 7 > i11; ++i11) {
                    i13 = 1;
                    while (--i13 > 0) {
                        i10 = (int)Test.instanceCount;
                        i5 <<= i11;
                        Test.dFld = i14;
                        Test.iArrFld[i11 - 1] = 77;
                        i5 = 34524;
                        i5 = i14;
                    }
                }
                break;
            case 4:
                Test.lArrFld[i4] += i11;
                break;
            }
        }
        vMeth1_check_sum += i3 + i4 + i5 + i6 + i7 + i8 + i9 + i10 + s + i11 + i12 + i13 + i14;
    }

    public static int iMeth(long l) {

        int i15=-49103, i16=-64069, i17=124, i18=-35108, i19=16465;
        boolean b=true;

        vMeth1();
        if (b) {
            i15 -= i15;
        } else if (b) {
            Test.fFld -= 6;
        } else {
            Test.instanceCount = i15;
        }
        Test.iArrFld = Test.iArrFld;
        for (i16 = 4; i16 < 327; i16++) {
            switch ((i16 % 8) + 32) {
            case 32:
                i17 = (int)l;
                Test.fFld = Test.fFld;
                for (i18 = 1; i18 < 5; ++i18) {
                    Test.iArrFld[i16 - 1] &= i17;
                }
                i15 = i19;
            case 33:
                i19 = (int)l;
                i17 *= i19;
            case 34:
                i17 += i16;
            case 35:
                i15 = (int)Test.fFld;
                break;
            case 36:
                i17 *= i17;
                break;
            case 37:
                Test.iArrFld[i16 - 1] += (int)Test.instanceCount;
                break;
            case 38:
                i19 <<= (int)-3523382730575404849L;
                break;
            case 39:
                Test.fFld = i15;
                break;
            }
        }
        long meth_res = l + i15 + (b ? 1 : 0) + i16 + i17 + i18 + i19;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i2=-159, i20=27219, i21=-31, i22=13, i23=-57888, i24=-31555;
        float f=-33.50F;
        short s1=25661;

        i2 -= iMeth(Test.instanceCount);
        for (i20 = 16; i20 < 259; ++i20) {
            Test.instanceCount *= i2;
            i22 = 7;
            while (--i22 > 0) {
                i2 >>= -58709;
            }
            f = 1;
            do {
                Test.iArrFld = Test.iArrFld;
                i21 += (int)(((f * Test.instanceCount) + Test.instanceCount) - Test.instanceCount);
                switch ((i20 % 6) + 111) {
                case 111:
                    Test.fFld = 1908;
                    break;
                case 112:
                    for (i23 = 1; i23 < 1; i23++) {
                        i24 -= (int)Test.dFld;
                        i24 /= (int)(i24 | 1);
                        s1 /= (short)(i2 | 1);
                        i2 += i23;
                    }
                    break;
                case 113:
                    Test.iArrFld[(int)(f - 1)] -= i20;
                    break;
                case 114:
                    Test.dFld = Test.instanceCount;
                    break;
                case 115:
                    i21 = i24;
                    break;
                case 116:
                    i2 &= (int)34883L;
                }
            } while (++f < 7);
        }
        vMeth_check_sum += i2 + i20 + i21 + i22 + Float.floatToIntBits(f) + i23 + i24 + s1;
    }

    public void mainTest(String[] strArr1) {

        int i=215, i1=-56096, i25=30536, i26=-2, i27=32049, i28=-9, i29=-19423, iArr[]=new int[N];
        short s2=17710;
        byte by=42;
        double dArr[][]=new double[N][N];

        FuzzerUtils.init(iArr, 36211);
        FuzzerUtils.init(dArr, 0.26690);

        for (i = 4; i < 321; i++) {
            if (Test.bFld) {
                Test.fFld += (2 + (i * i));
                if (Test.bFld) {
                    Test.dFld *= ((i + (--i1)) + (iArr[i + 1] + (i - i)));
                    switch (((i % 8) * 5) + 36) {
                    case 48:
                        i1 = -78;
                        break;
                    case 72:
                        iArr = (iArr = (iArr = (iArr = iArr)));
                        vMeth();
                        for (i25 = i; 79 > i25; ++i25) {
                            dArr[i25 - 1][i - 1] += Test.instanceCount;
                            Test.fFld += (53450 + (i25 * i25));
                            Test.instanceCount += (i25 * i25);
                            for (i27 = 1; i27 < 1; i27++) {
                                Test.instanceCount += (i27 | i);
                                Test.instanceCount = Test.instanceCount;
                                Test.instanceCount -= s2;
                                i28 += (i27 - i1);
                                Test.instanceCount = Test.instanceCount;
                                i1 = i26;
                                if (Test.bFld) continue;
                            }
                            i1 += (int)3667204852L;
                            by += (byte)(i25 * i26);
                            s2 = (short)Test.instanceCount;
                            i26 = i28;
                            i26 = (int)Test.instanceCount;
                            Test.fFld += (i25 * i25);
                        }
                        i28 >>>= i26;
                        break;
                    case 52:
                        i29 += (i | (long)Test.fFld);
                        Test.dFld += -4283053501L;
                        break;
                    case 41:
                        iArr[i + 1] -= (int)Test.fFld;
                    case 69:
                        Test.fFld -= i27;
                    case 56:
                        iArr[i + 1] <<= (int)Test.instanceCount;
                        break;
                    case 50:
                        Test.sArrFld[i - 1] -= (short)i29;
                    case 66:
                        i1 >>= -52431;
                        break;
                    default:
                        i26 = i;
                    }
                } else {
                    Test.iArrFld[i + 1] = i1;
                }
            } else if (Test.bFld) {
                Test.bFld = Test.bFld;
            } else {
                Test.instanceCount = -40008;
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}