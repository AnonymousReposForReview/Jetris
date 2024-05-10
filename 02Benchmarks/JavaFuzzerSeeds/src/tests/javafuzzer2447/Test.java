package tests.javafuzzer2447;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 14:49:23 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2034254433746057502L;
    public static short sFld=19347;
    public int iFld=65409;
    public boolean bFld=true;
    public float fFld=-2.65F;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];
    public float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 6);
        FuzzerUtils.init(Test.lArrFld, 43483L);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f, long l) {

        int i2=223, i3=-26024, i4=-13;
        double d1=-56.81316, d2=0.1093;
        boolean b=true;
        long l1=156L, lArr[]=new long[N];

        FuzzerUtils.init(lArr, -7209247817759258141L);

        i2 = 1;
        while (++i2 < 150) {
            d1 = 1.835F;
            f = i2;
            i3 = (int)Test.instanceCount;
            b = b;
            for (d2 = 1; d2 < 11; d2++) {
                i4 *= (int)Test.instanceCount;
                l = (long)f;
                Test.iArrFld[(int)(d2 + 1)] += (int)Test.instanceCount;
                l1 = l;
                switch ((int)(((d2 % 7) * 5) + 109)) {
                case 132:
                    Test.sFld += (short)(d2 * d2);
                    f -= i3;
                case 130:
                    try {
                        i3 = (311559150 / i2);
                        i4 = (i2 / Test.iArrFld[i2 - 1]);
                        i4 = (44927 / i3);
                    } catch (ArithmeticException a_e) {}
                    i3 *= i4;
                    break;
                case 125:
                    lArr[(int)(d2)] = (long)d2;
                    break;
                case 133:
                    i4 = (int)d1;
                    break;
                case 122:
                    Test.iArrFld[(int)(d2)] = (int)-1702889129L;
                    break;
                case 140:
                    Test.instanceCount -= -173082860L;
                case 131:
                    i4 += (int)(d2 * d2);
                }
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + l + i2 + Double.doubleToLongBits(d1) + i3 + (b ? 1 : 0) +
            Double.doubleToLongBits(d2) + i4 + l1 + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i, double d, int i1) {

        float f1=-123.248F;

        vMeth1(f1, 2209344786L);
        Test.lArrFld[(i >>> 1) % N] -= Test.instanceCount;
        Test.sFld *= (short)i1;
        vMeth_check_sum += i + Double.doubleToLongBits(d) + i1 + Float.floatToIntBits(f1);
    }

    public static void vSmallMeth() {

        int i5=32840;

        Test.instanceCount = 13;
        vMeth(i5, 1.71055, i5);
        vSmallMeth_check_sum += i5;
    }

    public void mainTest(String[] strArr1) {

        int i6=221, i7=110, i8=-54, i9=7, i10=6, i11=11, i12=-3, i13=79, i14=-6, i15=-196;
        byte by=106, byArr[][]=new byte[N][N];
        double d3=-1.83693;

        FuzzerUtils.init(byArr, (byte)47);

        Test.sFld += (short)(iFld++);
        for (int smallinvoc=0; smallinvoc<530; smallinvoc++) vSmallMeth();
        for (i6 = 4; i6 < 205; i6++) {
            for (i8 = i6; i8 < 125; ++i8) {
                iFld += (((i8 * Test.instanceCount) + Test.instanceCount) - by);
                fArrFld[i6 + 1] *= i8;
                byArr[i6][i6] *= (byte)i8;
                iFld = -4;
                i7 += i8;
                i10 = 1;
                while (++i10 < 1) {
                    iFld += (i10 * i9);
                    iFld -= i10;
                    bFld = bFld;
                    i7 = i7;
                }
                fFld += i6;
                i9 += (i8 * i11);
                i11 >>= -6831;
            }
            switch ((i6 % 3) + 44) {
            case 44:
                i9 = i11;
            case 45:
                fFld -= i7;
                fArrFld[i6 + 1] = Test.instanceCount;
                i11 *= (int)Test.instanceCount;
                break;
            case 46:
                for (i12 = 3; i12 < 125; i12++) {
                    i7 -= Test.sFld;
                    i9 += i13;
                    Test.iArrFld[i12] -= (int)-5L;
                    Test.iArrFld[i6 + 1] = (int)-4L;
                    for (i14 = 1; 2 > i14; ++i14) {
                        d3 -= i9;
                        if (bFld) continue;
                    }
                }
                break;
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  vMeth1 ->  vMeth1 vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
