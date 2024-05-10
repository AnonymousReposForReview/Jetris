package tests.javafuzzer732;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 08:43:06 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=8011481267077533181L;
    public volatile int iFld=-56645;
    public static boolean bFld=true;
    public static volatile double dFld=119.71144;
    public long lFld=3581481999L;
    public static int iFld1=95;
    public static int iArrFld[]=new int[N];
    public static volatile double dArrFld[]=new double[N];
    public static byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 8509);
        FuzzerUtils.init(Test.dArrFld, 0.45949);
        FuzzerUtils.init(Test.byArrFld, (byte)124);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i3) {

        int i4=5625, i5=27862, i6=-21595, i7=-40773;
        boolean b=false;
        float f=-1.788F, f1=2.279F;
        double d1=-1.113382;
        short s=-2409;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)86);

        i4 = 1;
        do {
            for (i5 = i4; i5 < 7; ++i5) {
                if (b) continue;
                i6 += i5;
                for (f = i4; f < 1; f++) {
                    Test.iArrFld[i5] -= i6;
                    Test.instanceCount ^= Test.instanceCount;
                    Test.iArrFld[i4] = 5;
                    Test.instanceCount += (long)(((f * i3) + i5) - Test.instanceCount);
                    if (b) {
                        byArr[(int)(f)] += (byte)d1;
                        s += (short)((long)f | i6);
                        Test.iArrFld[i5] += i6;
                        f1 -= i6;
                    } else {
                        Test.iArrFld[i5 - 1] -= (int)Test.instanceCount;
                    }
                }
            }
        } while (++i4 < 222);
        vMeth_check_sum += i3 + i4 + i5 + i6 + (b ? 1 : 0) + Float.floatToIntBits(f) + i7 + Double.doubleToLongBits(d1)
            + s + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(byArr);
    }

    public static int iMeth1(int i1) {

        int i8=67, i9=-120, i10=34274, iArr[]=new int[N];
        short s1=-28634;
        byte by=73;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -3);
        FuzzerUtils.init(lArr, -56775L);

        for (int i2 : iArr) {
            vMeth(i1);
            if (Test.bFld) continue;
            lArr[(3 >>> 1) % N] *= i1;
            for (i8 = 1; 4 > i8; i8++) {
                Test.instanceCount += i1;
                i2 += i8;
                i10 = 1;
                while (++i10 < 2) {
                    i2 -= (int)Test.instanceCount;
                }
                i2 += i9;
                i1 += (((i8 * i8) + Test.instanceCount) - i1);
                s1 = by;
            }
            i9 = (int)Test.dFld;
            i1 -= (int)Test.dFld;
            Test.dArrFld[(i1 >>> 1) % N] = by;
        }
        long meth_res = i1 + i8 + i9 + i10 + s1 + by + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i) {

        float f2=-1.725F;

        i = iMeth1(i);
        i += (int)Test.instanceCount;
        f2 += i;
        Test.byArrFld = Test.byArrFld;
        i = (int)Test.instanceCount;
        f2 *= (float)Test.dFld;
        i += i;
        long meth_res = i + Float.floatToIntBits(f2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d=-92.79648;
        int i11=14, i12=-61858, i13=-5, i14=63315, i15=50490, i16=-24375, i17=-45623, i18=-12, i19=-169, i20=-203,
            i21=108;
        byte by1=34;
        float f3=0.79F, f4=-57.499F, fArr[]=new float[N];
        long lArr1[][]=new long[N][N];

        FuzzerUtils.init(fArr, -1.306F);
        FuzzerUtils.init(lArr1, -980855734L);

        d -= (--iFld);
        fArr[(7 >>> 1) % N] += Math.max((int)(iFld + (iFld - d)), (int)(iFld += (int)Test.instanceCount));
        iFld >>= -33;
        iFld %= (int)(Integer.reverseBytes((int)((iFld - d) * (--iFld))) | 1);
        iFld -= iMeth(iFld);
        iFld = (int)-7076836638000801835L;
        lArr1[(iFld >>> 1) % N][(-13 >>> 1) % N] = Test.instanceCount;
        i11 = 1;
        while (++i11 < 384) {
            lFld = i11;
            for (i12 = i11; i12 < 66; i12 += 2) {
                by1 += (byte)(i12 ^ i11);
                iFld >>= i13;
                f3 = -2.537F;
            }
            Test.iArrFld[i11 - 1] += (int)Test.instanceCount;
            by1 = (byte)179L;
            lArr1[i11][i11 - 1] += iFld;
            i14 = 1;
            while (++i14 < 66) {
                for (i15 = 1; 1 > i15; i15++) {
                    iFld += -149;
                }
            }
            Test.dFld *= i13;
        }
        for (i17 = 8; i17 < 335; i17++) {
            for (f4 = 1; f4 < 77; f4++) {
                fArr[(int)(f4 - 1)] = Test.iFld1;
                try {
                    i20 = (244 / i13);
                    Test.iArrFld[i17] = (Test.iArrFld[i17] / 14998);
                    i20 = (Test.iFld1 % Test.iArrFld[(int)(f4 + 1)]);
                } catch (ArithmeticException a_e) {}
                i13 += (-50113 + (f4 * f4));
                lFld += (long)(f4 * i15);
                i19 += (2 + (f4 * f4));
                i21 = 1;
                do {
                    i18 += i17;
                    Test.iArrFld[i21 - 1] -= (int)f3;
                } while (++i21 < 2);
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}