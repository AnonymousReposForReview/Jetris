package tests.javafuzzer2153;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 09:32:51 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-3959316861L;
    public static int iFld=50564;
    public static boolean bFld=false;
    public float fFld=-88.573F;
    public static double dArrFld[]=new double[N];
    public volatile byte byArrFld[]=new byte[N];
    public static int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 13.54660);
        FuzzerUtils.init(Test.iArrFld, -11);
        FuzzerUtils.init(Test.fArrFld, 119.367F);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static double dMeth() {

        int i8=-207, i9=-5, i10=86, i11=10, i12=60788, iArr1[]=new int[N];
        byte by1=-113;
        float f2=1.422F, fArr[]=new float[N];
        double d=104.48303;
        long lArr[]=new long[N], lArr1[][]=new long[N][N];

        FuzzerUtils.init(iArr1, -52827);
        FuzzerUtils.init(fArr, -1.217F);
        FuzzerUtils.init(lArr, -183L);
        FuzzerUtils.init(lArr1, 1L);

        switch (((Test.iFld >>> 1) % 3) + 121) {
        case 121:
            iArr1[(-7 >>> 1) % N] += Test.iFld;
            for (i8 = 5; i8 < 393; i8++) {
                for (i10 = 1; i10 < 4; ++i10) {
                    fArr[i8 + 1] -= i10;
                    i11 ^= i11;
                    if (Test.iFld != 0) {
                    }
                }
                iArr1[i8 - 1] = by1;
                f2 -= (float)d;
                Test.bFld = Test.bFld;
                i12 = 1;
                do {
                    if (i10 != 0) {
                    }
                    lArr[i12 + 1] = i12;
                    i11 ^= i11;
                    i9 = -3478;
                } while (++i12 < 4);
            }
        case 122:
            lArr1 = lArr1;
        case 123:
            Test.instanceCount &= i8;
            break;
        default:
            iArr1[(54273 >>> 1) % N] <<= i12;
        }
        long meth_res = i8 + i9 + i10 + i11 + by1 + Float.floatToIntBits(f2) + Double.doubleToLongBits(d) + i12 +
            FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(lArr1);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static int iMeth(int i6, int i7, float f1) {


        i7 -= (int)(Math.min(-i7, Test.instanceCount) - dMeth());
        long meth_res = i6 + i7 + Float.floatToIntBits(f1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i, int i1) {

        int i2=-2, i3=-232, i4=-69, i5=-12427, iArr[]=new int[N];
        float f=2.270F, fArr1[]=new float[N];
        byte by=-49, byArr[]=new byte[N];
        short s=20686;
        long lArr2[][]=new long[N][N];

        FuzzerUtils.init(iArr, -2423);
        FuzzerUtils.init(byArr, (byte)103);
        FuzzerUtils.init(fArr1, 2.559F);
        FuzzerUtils.init(lArr2, -157L);

        for (i2 = 12; i2 < 193; ++i2) {
            i3 -= (int)(((Test.instanceCount++) * (f - i1)) * (++Test.dArrFld[i2]));
            by = (byte)Math.abs(i3++);
            Test.instanceCount += (((i2 * i2) + Test.instanceCount) - Test.instanceCount);
            for (i4 = 1; i4 < 9; ++i4) {
                by -= (byte)((Test.instanceCount - iArr[i2 - 1]) - (iMeth(Test.iFld, i5, f) + i2));
                Test.instanceCount += i1;
                byArr[i2] >>>= (byte)Test.iFld;
                i3 = (int)Test.instanceCount;
            }
        }
        i3 += i;
        if (Test.bFld) {
            iArr[(-13 >>> 1) % N] -= i1;
        } else {
            i = -41767;
            f *= s;
            vMeth_check_sum += i + i1 + i2 + i3 + Float.floatToIntBits(f) + by + i4 + i5 + s +
                FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(byArr) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + FuzzerUtils.checkSum(lArr2);
            return;
        }
        lArr2 = FuzzerUtils.long2array(N, (long)-831445186583290109L);
        vMeth_check_sum += i + i1 + i2 + i3 + Float.floatToIntBits(f) + by + i4 + i5 + s + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(byArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) +
            FuzzerUtils.checkSum(lArr2);
    }

    public void mainTest(String[] strArr1) {

        int i13=-26667, i14=2, i15=54909, i16=9098, i17=66, i18=126, i19=30799, i20=3, i21=-5;
        byte by2=64;
        long l=-5583505604672536467L;
        short s1=-18482;
        double d1=2.127322;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, false);

        vMeth(Test.iFld, Test.iFld);
        byArrFld[(-11 >>> 1) % N] += (byte)Test.iFld;
        for (i13 = 3; i13 < 258; ++i13) {
            by2 += (byte)31918;
        }
        fFld -= Test.iFld;
        for (l = 18; l < 356; ++l) {
            i15 = (int)Test.instanceCount;
            i15 = Test.iFld;
            i16 = 74;
            while (--i16 > 0) {
                Test.iArrFld = Test.iArrFld;
            }
            Test.instanceCount += (l ^ i13);
            s1 += (short)(l ^ by2);
            Test.iArrFld[(int)(l - 1)] = i17;
            bArr[(int)(l + 1)] = Test.bFld;
            Test.iArrFld[(int)(l + 1)] = i13;
            i14 = (int)d1;
        }
        Test.iFld <<= i17;
        for (i18 = 12; i18 < 228; i18++) {
            Test.instanceCount += i18;
            if (Test.bFld) continue;
            if (false) {
                for (i20 = 3; i20 < 116; i20++) {
                    if (Test.bFld) {
                        Test.fArrFld[i18 - 1] = i13;
                    } else {
                        i21 += (((i20 * Test.instanceCount) + i19) - Test.iFld);
                        i15 += (171 + (i20 * i20));
                        Test.iArrFld = Test.iArrFld;
                        Test.instanceCount ^= i14;
                    }
                    byArrFld[i18] += (byte)Test.instanceCount;
                    Test.instanceCount = i14;
                }
            } else {
                Test.instanceCount += (i18 * i18);
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
//DEBUG  dMeth ->  dMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
