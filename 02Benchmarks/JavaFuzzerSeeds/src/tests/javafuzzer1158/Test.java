package tests.javafuzzer1158;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 15:55:32 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=2L;
    public static int iFld=-214;
    public float fFld=0.202F;
    public static volatile boolean bFld=false;
    public int iArrFld[]=new int[N];

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;

    public static long lMeth1(boolean b) {


        Test.iFld = (int)Test.instanceCount;
        long meth_res = (b ? 1 : 0);
        lMeth1_check_sum += meth_res;
        return (long)meth_res;
    }

    public static long lMeth() {

        int i1=-187, i2=-14, i3=6, i4=75, i5=-23073, i6=-220, iArr[]=new int[N];
        boolean b1=false;
        float f=-30.938F;

        FuzzerUtils.init(iArr, -162);

        for (i1 = 1; i1 < 305; i1++) {
            for (i3 = 1; 5 > i3; ++i3) {
                i2 = (int)(((-lMeth1(b1)) - 2.100100) + f);
                if (b1) {
                    for (i5 = 1; 2 > i5; ++i5) {
                        int i7=2;
                        iArr[i5 - 1] -= (int)Test.instanceCount;
                        Test.iFld = -48082;
                        Test.iFld <<= i5;
                        i2 *= i5;
                        i7 += i4;
                        iArr[i3 + 1] += i7;
                        Test.iFld = Test.iFld;
                        Test.iFld += i5;
                        Test.instanceCount += 195;
                    }
                    i2 &= -16612;
                } else {
                    i4 += i3;
                }
            }
        }
        long meth_res = i1 + i2 + i3 + i4 + (b1 ? 1 : 0) + Float.floatToIntBits(f) + i5 + i6 +
            FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void vMeth(byte by, int i) {

        int i8=-57749, i9=0;
        double dArr[]=new double[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(dArr, 2.72212);
        FuzzerUtils.init(sArr, (short)-19240);

        iArrFld[(i >>> 1) % N] >>= (int)lMeth();
        for (i8 = 3; i8 < 171; i8++) {
            i *= by;
            by += (byte)i8;
            i9 = -12;
            Test.instanceCount += (i8 * i8);
            iArrFld[i8 + 1] = i9;
            Test.instanceCount = i;
        }
        Test.iFld /= (int)(Test.instanceCount | 1);
        i9 *= i;
        fFld *= -95;
        Test.instanceCount = Test.instanceCount;
        dArr[(6352 >>> 1) % N] = -35.538F;
        Test.iFld += Test.iFld;
        sArr[(i8 >>> 1) % N] += (short)-58152;
        vMeth_check_sum += by + i + i8 + i9 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            FuzzerUtils.checkSum(sArr);
    }

    public void mainTest(String[] strArr1) {

        byte by1=-59;
        int i10=-99, i11=202, i12=-6, i13=35096, i14=243, i15=101, i16=-13, i17=-230;
        double d=2.26530, d1=0.117022;
        short s=20731;
        float fArr[]=new float[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(fArr, 0.1020F);
        FuzzerUtils.init(lArr, -125L);

        vMeth(by1, Test.iFld);
        for (i10 = 12; i10 < 332; ++i10) {
            fArr[i10] += -151;
            Test.instanceCount %= (by1 | 1);
            for (d = i10; d < 79; d++) {
                lArr[(int)(d)] = (long)fFld;
                Test.bFld = Test.bFld;
                i12 -= (int)-197L;
            }
            for (i13 = 2; i13 < 79; ++i13) {
                if (Test.bFld) break;
            }
            i11 += Test.iFld;
            if (Test.bFld) {
                Test.instanceCount += (i10 * i10);
                d1 = 70;
            }
        }
        i15 = 1;
        do {
            i11 -= s;
            if (Test.bFld) continue;
            if (Test.bFld) {
                iArrFld[i15] += -12417;
                iArrFld[i15] *= i14;
                for (i16 = 113; i16 > 6; i16--) {
                    i14 -= (int)-31.52637;
                    Test.iFld += (int)Test.instanceCount;
                    d1 -= Test.instanceCount;
                    lArr[i16 - 1] += (long)d;
                    i14 = (int)d1;
                    Test.instanceCount *= (long)fFld;
                    iArrFld[i16] -= i13;
                }
            }
            iArrFld[i15 - 1] |= i14;
            i12 -= -24480;
        } while (++i15 < 223);


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
//DEBUG  lMeth1 ->  lMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
