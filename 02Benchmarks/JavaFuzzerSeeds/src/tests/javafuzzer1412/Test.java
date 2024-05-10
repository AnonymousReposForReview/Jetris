package tests.javafuzzer1412;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 19:55:16 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-18085L;
    public static int iFld=11;
    public static double dFld=0.91244;
    public static boolean bFld=false;
    public static byte byArrFld[]=new byte[N];
    public static long lArrFld[]=new long[N];
    public static volatile int iArrFld[][]=new int[N][N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)44);
        FuzzerUtils.init(Test.lArrFld, -289619392L);
        FuzzerUtils.init(Test.iArrFld, -162);
        FuzzerUtils.init(Test.dArrFld, 0.82828);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;

    public static void vSmallMeth() {

        byte by=-43;

        Test.iFld = (by++);
        vSmallMeth_check_sum += by;
    }

    public static short sMeth(int i7) {

        int i9=211, i10=-9, i11=3, iArr[]=new int[N];
        byte by1=66;

        FuzzerUtils.init(iArr, 26415);

        for (int i8 : iArr) {
            for (i9 = 1; i9 < 4; ++i9) {
                try {
                    i10 = (Test.iFld % -25583);
                    Test.iArrFld[i9][i9] = (-18958 / Test.iFld);
                    i8 = (i7 % iArr[i9 - 1]);
                } catch (ArithmeticException a_e) {}
                if (i8 != 0) {
                }
                i8 += i9;
                i11 = 1;
                do {
                    Test.iArrFld[i9 - 1][i11] *= i9;
                    i8 = i10;
                    i7 <<= 12671;
                } while (++i11 < 2);
                Test.byArrFld = Test.byArrFld;
                i7 -= Test.iFld;
                Test.iFld >>= i8;
                by1 += (byte)i9;
                Test.iFld *= -58645;
                Test.iFld = i7;
            }
        }
        long meth_res = i7 + i9 + i10 + i11 + by1 + FuzzerUtils.checkSum(iArr);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static int iMeth(int i4, long l1) {

        int i5=-4, i6=7, i12=14, i13=42055;
        boolean b=true;
        float f=1.881F;
        short sArr[][]=new short[N][N];

        FuzzerUtils.init(sArr, (short)-10630);

        for (i5 = 2; i5 < 157; ++i5) {
            Test.iFld -= (((++i4) + (i4++)) - ((i4 -= Test.iFld) + (i4--)));
            l1 -= (((i4 >> -165) - i4) - ((-3 - (++Test.iArrFld[i5 + 1][i5])) - Test.iArrFld[i5 + 1][i5]));
            Test.iArrFld[i5 - 1][i5 - 1] *= ((sMeth(63681) + Test.iFld) - i5);
            b = b;
            sArr[i5 + 1][i5 - 1] = (short)Test.instanceCount;
            for (i12 = 1; i12 < 10; ++i12) {
                Test.iFld += i4;
                f += (i12 * i12);
                Test.iFld += 13;
                Test.iFld = i12;
                i13 -= (int)f;
                Test.iArrFld[i5 + 1] = Test.iArrFld[i12];
                f -= (float)Test.dFld;
                i6 *= -5;
            }
        }
        long meth_res = i4 + l1 + i5 + i6 + (b ? 1 : 0) + i12 + i13 + Float.floatToIntBits(f) +
            FuzzerUtils.checkSum(sArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i, int i1) {

        long l=3100931891L;
        int i2=61282, i3=53552, i14=54968, i15=29056, i16=-64976;
        double d=2.80615;
        float f1=23.64F;
        byte by2=82;

        l = 1;
        do {
            for (i2 = (int)(l); i2 < 10; ++i2) {
                Test.instanceCount *= (Test.lArrFld[(int)(l)]--);
                i1 = (int)(Math.abs(Test.dFld) - (--i));
                i1 = iMeth(Test.iFld, Test.instanceCount);
                d -= i;
            }
            if (Test.bFld) {
                f1 -= (float)Test.dFld;
                vMeth_check_sum += i + i1 + l + i2 + i3 + Double.doubleToLongBits(d) + Float.floatToIntBits(f1) + i14 +
                    i15 + i16 + by2;
                return;
            }
            i14 = 1;
            do {
                for (i15 = 1; 1 > i15; i15++) {
                    int i17=-37647;
                    Test.iFld >>= i15;
                    i1 <<= i2;
                    i17 = by2;
                    Test.dArrFld[(int)(l)] += d;
                    Test.iArrFld[i15 - 1][i15 + 1] *= i15;
                }
            } while (++i14 < 10);
        } while (++l < 157);
        vMeth_check_sum += i + i1 + l + i2 + i3 + Double.doubleToLongBits(d) + Float.floatToIntBits(f1) + i14 + i15 +
            i16 + by2;
    }

    public void mainTest(String[] strArr1) {


        for (int smallinvoc=0; smallinvoc<879; smallinvoc++) vSmallMeth();
        Test.byArrFld[(45000 >>> 1) % N] = (byte)(((Test.iFld + 28665) - (Test.iFld & Test.iFld)) + Test.instanceCount);
        vMeth(Test.iFld, Test.iFld);
        Test.iFld -= Test.iFld;


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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  sMeth ->  sMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
