package tests.javafuzzer599;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 06:20:47 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=25234L;
    public static int iFld=-18993;
    public static int iFld1=-198;
    public static boolean bFld=false;
    public double dFld=95.64922;
    public static volatile byte byFld=-7;
    public static volatile float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 16.148F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i2, long l, float f1) {

        int i3=-51954, i4=77, iArr[]=new int[N];
        boolean b=true;
        double d=39.102850;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -4);
        FuzzerUtils.init(lArr, 14L);

        Test.iFld /= (int)(Test.instanceCount | 1);
        if (Test.bFld) {
            for (i3 = 128; 4 < i3; --i3) {
                if (b) {
                    i4 = i4;
                    Test.iFld *= (int)1.1021F;
                    Test.instanceCount += (i3 + i2);
                    Test.iFld += i3;
                } else {
                    iArr[i3] += (int)d;
                    try {
                        i2 = (Test.iFld / i3);
                        Test.iFld = (i3 % Test.iFld);
                        Test.iFld = (i2 / 103);
                    } catch (ArithmeticException a_e) {}
                }
                lArr[i3 - 1] = i4;
                i2 *= (int)Test.instanceCount;
                i2 = i3;
            }
            iArr[(Test.iFld1 >>> 1) % N] -= i3;
        } else if (b) {
            Test.iFld *= i3;
        } else if (b) {
            l *= -29496;
        } else {
            d *= l;
        }
        vMeth2_check_sum += i2 + l + Float.floatToIntBits(f1) + i3 + i4 + (b ? 1 : 0) + Double.doubleToLongBits(d) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1() {

        int i=-70, i1=9463, i5=-20, i6=5, i7=-188, i8=36888, iArr1[]=new int[N];
        float f2=-2.532F;
        byte by=-69;
        short s=-15141;

        FuzzerUtils.init(iArr1, -19650);

        for (i = 10; i < 162; i += 3) {
            vMeth2(Test.iFld1, Test.instanceCount, f2);
            for (i5 = 1; i5 < 31; i5++) {
                by -= (byte)f2;
                for (i7 = i; i7 < 2; i7++) {
                    Test.instanceCount = s;
                    Test.iFld1 = (int)f2;
                    i6 *= -2;
                    i8 = (int)Test.instanceCount;
                }
                Test.instanceCount += Test.instanceCount;
                i6 += i;
            }
            try {
                i8 = (i5 % -1175799507);
                i8 = (i8 / -1270908514);
                i8 = (i5 % iArr1[i + 1]);
            } catch (ArithmeticException a_e) {}
        }
        i6 %= (int)(i1 | 1);
        iArr1[(i1 >>> 1) % N] = (int)Test.instanceCount;
        Test.iFld -= s;
        vMeth1_check_sum += i + i1 + Float.floatToIntBits(f2) + i5 + i6 + by + i7 + i8 + s +
            FuzzerUtils.checkSum(iArr1);
    }

    public void vMeth() {


        Test.iFld -= (int)(--Test.instanceCount);
        vMeth1();
        Test.iFld1 &= Test.iFld1;
        vMeth_check_sum += 0;
    }

    public void mainTest(String[] strArr1) {

        int i9=-32, i10=0, iArr2[]=new int[N];
        float f3=77.152F;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 80L);
        FuzzerUtils.init(iArr2, -22309);

        for (float f : Test.fArrFld) {
            vMeth();
            Test.iFld1 = (int)dFld;
            for (i9 = 3; i9 < 63; ++i9) {
                f3 = 1;
                do {
                    short s1=-29994;
                    switch ((int)(((f3 % 7) * 5) + 62)) {
                    case 77:
                        s1 >>= (short)i9;
                        i10 <<= (int)Test.instanceCount;
                        Test.iFld = i10;
                        Test.iFld -= i9;
                        break;
                    case 78:
                        Test.iFld -= (int)393259821062256070L;
                        lArr1[(int)(f3 + 1)] = Test.iFld;
                    case 65:
                    case 88:
                        iArr2[(int)(f3)] += i9;
                        break;
                    case 84:
                        Test.byFld += (byte)(-21154 + (f3 * f3));
                        Test.iFld += (int)(f3 + i9);
                        break;
                    case 79:
                        Test.iFld += 12;
                        break;
                    case 64:
                        Test.iFld = (int)Test.instanceCount;
                        break;
                    default:
                        Test.bFld = Test.bFld;
                        if (Test.bFld) continue;
                        if (Test.bFld) break;
                    }
                    Test.instanceCount = s1;
                    Test.iFld1 -= i9;
                    i10 += (int)dFld;
                    switch ((i9 % 5) + 3) {
                    case 3:
                        Test.iFld1 += Test.byFld;
                        Test.iFld -= (int)dFld;
                        Test.iFld1 += (int)f3;
                        Test.iFld1 += (int)(f3 * f3);
                        break;
                    case 4:
                        Test.instanceCount += (long)f3;
                        break;
                    case 5:
                        Test.iFld += (int)(-7653L + (f3 * f3));
                    case 6:
                        Test.byFld = (byte)Test.instanceCount;
                        break;
                    case 7:
                        Test.iFld1 += (int)(((f3 * f) + Test.instanceCount) - i10);
                        break;
                    }
                } while ((f3 += 3) < 2);
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