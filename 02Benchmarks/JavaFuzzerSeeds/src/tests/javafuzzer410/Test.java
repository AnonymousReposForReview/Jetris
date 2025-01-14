package tests.javafuzzer410;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 03:19:25 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3742992252L;
    public static boolean bFld=false;
    public int iFld=194;
    public static float fFld=-1.985F;
    public static byte byArrFld[][]=new byte[N][N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)34);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        int i2=18028;

        i2 = i2;
        vMeth_check_sum += i2;
    }

    public static int iMeth(float f) {

        int i1=45270, i4=4, i5=240, iArr1[][]=new int[N][N], iArr2[]=new int[N];
        double d=0.15667;
        boolean b=false;

        FuzzerUtils.init(iArr1, 32606);
        FuzzerUtils.init(iArr2, -95);

        i1 %= (int)((-(iArr1[(i1 >>> 1) % N][(i1 >>> 1) % N] + (i1 * -14))) | 1);
        vMeth();
        Test.instanceCount *= i1;
        iArr1[(i1 >>> 1) % N][(-183 >>> 1) % N] = i1;
        Test.instanceCount ^= 227L;
        for (int i3 : iArr2) {
            i1 = i3;
            d = 1;
            do {
                i1 += (int)d;
                for (i4 = 1; i4 > d; i4--) {
                    i5 >>= 60891;
                    if (b) {
                        i3 += (i4 - i1);
                        Test.instanceCount <<= -2982253997L;
                        iArr2[i4] += i1;
                    }
                }
            } while (++d < 4);
        }
        long meth_res = Float.floatToIntBits(f) + i1 + Double.doubleToLongBits(d) + i4 + i5 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vSmallMeth(long l, byte by) {

        int i=-1, iArr[]=new int[N];
        float f1=43.643F;

        FuzzerUtils.init(iArr, 2663);

        iArr[(i >>> 1) % N] %= (int)(((Test.byArrFld[(i >>> 1) % N][(i >>> 1) % N]--) * (iMeth(f1) * -10989)) | 1);
        i = -240;
        vSmallMeth_check_sum += l + by + i + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i6=30, i7=-211, i8=6, i9=14, i10=-4, i11=-29132, i12=61530, i13=48459, i14=116;
        boolean b1=false, b2=true;
        float f2=0.544F;
        double d1=29.19685;

        for (int smallinvoc=0; smallinvoc<805; smallinvoc++) vSmallMeth(Test.instanceCount, (byte)(17));
        for (i6 = 323; i6 > 13; --i6) {
            i7 += i6;
            i7 *= i6;
            iArrFld[i6 - 1] += i7;
            try {
                i7 = (32 / iArrFld[i6]);
                i7 = (i7 / 1727198619);
                i7 = (i6 / i7);
            } catch (ArithmeticException a_e) {}
        }
        b1 = b2;
        b1 = Test.bFld;
        iArrFld[(i6 >>> 1) % N] = i6;
        for (i8 = 16; 341 > i8; i8++) {
            byte by1=-126;
            i9 -= i7;
            if (true) {
                b2 = Test.bFld;
            } else if (Test.bFld) {
                Test.instanceCount += (-42979L + (i8 * i8));
                i9 = i8;
            } else if (b2) {
                for (i10 = 3; 77 > i10; ++i10) {
                    try {
                        iArrFld[i10] = (i9 / -63007);
                        iArrFld[i8 + 1] = (42 % i6);
                        iFld = (-34 / i10);
                    } catch (ArithmeticException a_e) {}
                    Test.instanceCount = (long)Test.fFld;
                    iFld += i10;
                    Test.fFld -= i11;
                    for (i12 = 1; 2 > i12; ++i12) {
                        i9 += (i12 * i12);
                    }
                    i9 = iFld;
                }
                by1 >>>= (byte)Test.instanceCount;
            } else {
                i13 <<= (int)1502664919L;
                Test.instanceCount &= i9;
                for (f2 = 1; 77 > f2; f2++) {
                    Test.instanceCount = i8;
                    d1 += Test.instanceCount;
                    i11 *= i9;
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  iMeth ->  iMeth vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth iMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
