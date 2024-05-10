package tests.javafuzzer2866;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 21:53:49 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=8362461730453269305L;
    public static double dFld=70.7007;
    public static boolean bFld=false;
    public short sFld=27702;
    public static volatile long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 8L);
    }

    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i6, int i7, int i8) {

        int i9=-35741, i10=-13, i11=2, iArr2[]=new int[N];
        short s=10207;
        float f1=-1.608F;

        FuzzerUtils.init(iArr2, 27263);

        i9 = 1;
        do {
            try {
                i6 = (i7 / i6);
                i6 = (-24902 % iArr2[i9]);
                i7 = (i7 % 60967);
            } catch (ArithmeticException a_e) {}
            Test.dFld = 0.753F;
            i7 += 36314;
            Test.instanceCount = i6;
            i7 &= i8;
            Test.lArrFld[i9] = s;
            if (Test.bFld) {
                f1 -= f1;
                f1 = i6;
                i6 <<= i8;
                for (i10 = 1; i10 < 10; i10 += 3) {
                    i7 += i8;
                    i7 = i7;
                    i6 = (int)Test.instanceCount;
                }
            } else {
                Test.dFld = i11;
            }
        } while (++i9 < 164);
        long meth_res = i6 + i7 + i8 + i9 + s + Float.floatToIntBits(f1) + i10 + i11 + FuzzerUtils.checkSum(iArr2);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth() {

        int i3=26, i4=-20914, i5=27844, i12=232, i13=184, i14=51001, i15=-10, i16=-39, iArr1[]=new int[N];
        float f2=0.983F;

        FuzzerUtils.init(iArr1, 69);

        i3 = 1;
        while (++i3 < 373) {
            if (((i3 * i3) == Math.min(--iArr1[i3], i5 * 170)) && ((iArr1[i3]--) != Test.instanceCount)) {
                i4 += (((i3 * i4) + i3) - i5);
                i5 = (int)Test.lArrFld[i3 + 1];
                i5 >>>= (iArr1[i3 - 1]++);
            } else {
                Test.instanceCount -= (long)((iMeth1(i4, i5, i5) * -28316L) - f2);
                for (i12 = 1; i12 < 5; ++i12) {
                    i4 += (((i12 * i3) + Test.instanceCount) - Test.instanceCount);
                    for (i14 = 1; i14 < 2; ++i14) {
                        i16 -= (int)-1L;
                        i16 += (-9 + (i14 * i14));
                        i5 -= i4;
                        i4 = i13;
                        Test.instanceCount = i4;
                    }
                    i15 += i12;
                }
            }
        }
        long meth_res = i3 + i4 + i5 + Float.floatToIntBits(f2) + i12 + i13 + i14 + i15 + i16 +
            FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth() {

        int i1=-12, i2=12, i17=1220, i18=12;
        float f=8.816F;
        byte by=-19;

        for (i1 = 5; i1 < 316; ++i1) {
            f = (Test.instanceCount++);
            lMeth();
            i2 += (((i1 * i1) + f) - Test.instanceCount);
            i2 -= (int)6L;
            for (i17 = 1; i17 < 5; i17++) {
                by += (byte)i1;
            }
        }
        long meth_res = i1 + i2 + Float.floatToIntBits(f) + i17 + i18 + by;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=20, iArr[]=new int[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr, 14);
        FuzzerUtils.init(dArr, 67.117346);

        iArr[(i >>> 1) % N] *= (int)dArr[(-1 >>> 1) % N];
        i /= (int)(iMeth() | 1);
        sFld = (short)i;
        sFld -= (short)i;
        Test.dFld = i;


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
//DEBUG  lMeth ->  lMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 lMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}