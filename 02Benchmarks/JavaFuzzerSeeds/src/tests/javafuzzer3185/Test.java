package tests.javafuzzer3185;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 03:29:42 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=4275540258666349321L;
    public static int iFld=124;
    public static double dFld=1.31396;
    public static boolean bFld=false;
    public byte byFld=-88;
    public static long lArrFld[]=new long[N];
    public int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.lArrFld, -5275145981186550944L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l1, long l2, int i5) {

        int i6=-163, iArr1[]=new int[N];
        float f1=-100.856F;

        FuzzerUtils.init(iArr1, -7);

        i6 = 1;
        while (++i6 < 309) {
            Test.iFld += i6;
            l2 = (long)f1;
            iArr1[i6] &= Test.iFld;
            i5 *= 4231;
            Test.iFld = (int)Test.dFld;
            l2 -= Test.instanceCount;
            Test.iFld -= i6;
            iArr1[i6 + 1] >>= -111;
            Test.lArrFld[i6 - 1] *= (long)-1.526F;
            Test.instanceCount += Test.iFld;
        }
        Test.bFld = Test.bFld;
        i5 = -25643;
        iArr1 = iArr1;
        i5 *= (int)f1;
        vMeth2_check_sum += l1 + l2 + i5 + i6 + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth1(long l) {

        byte by1=71;

        vMeth2(-42845L, Test.instanceCount, -41098);
        by1 += (byte)-51927;
        Test.instanceCount *= Test.iFld;
        vMeth1_check_sum += l + by1;
    }

    public static void vMeth() {

        int i=-1, i1=55263, i2=-39026, i3=-62635, i4=-1, iArr[]=new int[N];
        boolean b=true, b1=true, bArr[]=new boolean[N];
        float f=-115.917F;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 0);
        FuzzerUtils.init(lArr, -1114874528974323115L);
        FuzzerUtils.init(bArr, false);

        Test.iFld = Math.min(Test.iFld++, --Test.iFld);
        Test.dFld -= ((iArr[(Test.iFld >>> 1) % N] += Test.iFld) * (lArr[(Test.iFld >>> 1) % N] <<=
            Integer.reverseBytes(190)));
        for (i = 7; i < 336; i++) {
            i2 = 1;
            while (++i2 < 5) {
                byte by=0;
                by >>= (byte)(0L - i1);
                switch (((((--iArr[i2 - 1]) >>> 1) % 8) * 5) + 92) {
                case 116:
                    i3 = 1;
                    while (++i3 < 1) {
                        Test.dFld -= Math.abs(0.568F);
                        iArr[i3 + 1] -= Integer.reverseBytes(-Math.max(36219, Test.iFld));
                    }
                    Test.instanceCount = (Test.instanceCount++);
                    Test.dFld -= ((Integer.reverseBytes(i1) - (i2 - i2)) + Double.longBitsToDouble(-(i2 + i1)));
                    break;
                case 104:
                    iArr[i - 1] >>= i1;
                    if (b1) {
                        bArr[i2] = (b = ((Test.dFld - Test.instanceCount) >= i3));
                        iArr = (iArr = (iArr = (iArr = iArr)));
                    } else {
                        i1 += (--Test.iFld);
                    }
                case 123:
                    f -= Test.instanceCount;
                    break;
                case 109:
                    Test.dFld *= i4;
                case 120:
                    Test.instanceCount >>= (++i1);
                    break;
                case 110:
                    Test.iFld = (int)((iArr[i - 1] * (i + i)) - 31089L);
                    break;
                case 102:
                    vMeth1(Test.instanceCount);
                    break;
                case 103:
                    try {
                        i4 = (-18120 / iArr[i2 - 1]);
                        i4 = (i1 / i2);
                        i1 = (i2 % -21350);
                    } catch (ArithmeticException a_e) {}
                }
            }
        }
        vMeth_check_sum += i + i1 + i2 + i3 + (b ? 1 : 0) + (b1 ? 1 : 0) + Float.floatToIntBits(f) + i4 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(bArr);
    }

    public void mainTest(String[] strArr1) {

        int i7=-118, i8=1, i9=-9, i10=-45, i11=-38757;
        float f3=-72.560F;
        short s=-19783;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 1.106117);

        vMeth();
        iArrFld[(11 >>> 1) % N][(Test.iFld >>> 1) % N] -= Test.iFld;
        for (i7 = 2; i7 < 201; ++i7) {
            float f2=50.959F;
            Test.iFld += i7;
            f2 *= Test.instanceCount;
            for (i9 = 126; i9 > 6; i9--) {
                f3 = 1;
                do {
                    int i12=-2;
                    Test.iFld *= (int)Test.instanceCount;
                    switch ((int)(((f3 % 10) * 5) + 120)) {
                    case 130:
                        i11 *= -27267;
                        i11 += i12;
                        break;
                    case 139:
                        Test.instanceCount = -23102;
                        i8 <<= i8;
                        break;
                    case 169:
                        iArrFld[i7 - 1] = iArrFld[(int)(f3)];
                        switch ((int)((f3 % 3) + 41)) {
                        case 41:
                            i11 -= i10;
                            break;
                        case 42:
                            byFld = (byte)i8;
                            Test.instanceCount = Test.instanceCount;
                            i11 &= i10;
                            f2 -= Test.instanceCount;
                            break;
                        case 43:
                            i12 = (int)Test.instanceCount;
                            i12 *= i7;
                            Test.instanceCount -= Test.instanceCount;
                            break;
                        }
                        dArr[i7 + 1] *= i8;
                        i10 *= (int)Test.instanceCount;
                        break;
                    case 154:
                        i11 *= i11;
                        Test.instanceCount >>= i9;
                        i11 = i7;
                        break;
                    case 152:
                        dArr[i9] -= Test.iFld;
                        break;
                    case 121:
                        Test.lArrFld[i7 - 1] = i7;
                        break;
                    case 167:
                        dArr[(int)(f3 + 1)] = -2276;
                        break;
                    case 166:
                        Test.dFld += i9;
                        break;
                    case 132:
                        s <<= (short)Test.iFld;
                    case 165:
                        f2 = i12;
                        break;
                    default:
                        i10 -= (int)Test.instanceCount;
                    }
                } while (++f3 < 2);
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
