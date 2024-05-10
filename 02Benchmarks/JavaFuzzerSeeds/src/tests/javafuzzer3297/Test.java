package tests.javafuzzer3297;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 05:40:25 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=269322952L;
    public static boolean bFld=false;
    public static float fFld=-2.894F;

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i10, float f, long l1) {


        i10 = i10;
        vMeth_check_sum += i10 + Float.floatToIntBits(f) + l1;
    }

    public static int iMeth1(long l, int i6, int i7) {

        int i8=227, i9=135, i11=-3249, i12=-7, i13=-82, iArr1[]=new int[N];
        float f1=-29.325F;
        byte by=39;

        FuzzerUtils.init(iArr1, 6);

        i7 += (i6++);
        i8 = 1;
        while (++i8 < 233) {
            i9 = 1;
            while (++i9 < 7) {
                i7 = i7;
                vMeth(i7, f1, l);
                i6 += (int)Test.instanceCount;
                for (i11 = 1; i11 < 1; ++i11) {
                    i6 = 22013;
                }
                by += (byte)i9;
                i13 = 1;
                do {
                    i7 += (((i13 * l) + i7) - Test.instanceCount);
                    iArr1[i9] -= i8;
                    l += i13;
                    l = i9;
                    i7 |= (int)7L;
                } while (++i13 < 1);
            }
        }
        long meth_res = l + i6 + i7 + i8 + i9 + Float.floatToIntBits(f1) + i11 + i12 + by + i13 +
            FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i3) {

        int i4=-52, i5=-193, i14=-22627, i15=-9, i16=34949, iArr2[][]=new int[N][N];
        float f2=2.149F;

        FuzzerUtils.init(iArr2, -14);

        for (i4 = 6; 276 > i4; i4++) {
            i3 >>= iMeth1(Test.instanceCount, i4, 6);
            for (i14 = 1; 6 > i14; i14++) {
                i16 = 1;
                while (++i16 < 2) {
                    iArr2[i4][i4] = (int)-13L;
                    i5 <<= (int)Test.instanceCount;
                    switch ((i14 % 2) + 23) {
                    case 23:
                        i3 = i5;
                        f2 -= i15;
                        break;
                    case 24:
                        iArr2[i4][i14] = (int)Test.instanceCount;
                        Test.instanceCount += (i16 + f2);
                        iArr2[i16 + 1][i14] <<= -140;
                        i5 |= -1;
                        break;
                    }
                }
                i3 -= (int)-11L;
                iArr2[i4 + 1] = iArr2[i14];
            }
        }
        long meth_res = i3 + i4 + i5 + i14 + i15 + i16 + Float.floatToIntBits(f2) + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=9334, i1=19955, i2=-37497, i17=50746, i18=-1, i19=-36, i20=-99, i21=-87, i22=26, iArr[]=new int[N];
        double d=0.32126;
        short sArr[]=new short[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -47277);
        FuzzerUtils.init(sArr, (short)-29000);
        FuzzerUtils.init(lArr, -9079L);

        i = (int)(((++i) - (iArr[(i >>> 1) % N] = (int)1.60192)) - (-(i + Test.instanceCount)));
        i -= 206;
        for (i1 = 191; i1 > 11; --i1) {
            Test.instanceCount &= iArr[i1];
            Test.instanceCount = iMeth(i2);
            iArr[(i1 >>> 1) % N] -= i1;
            i2 <<= 20503;
        }
        i17 = 264;
        while (--i17 > 0) {
            if (Test.bFld) break;
            i = (int)Test.instanceCount;
        }
        i >>= i1;
        for (i18 = 12; i18 < 243; i18++) {
            i >>= (int)Test.instanceCount;
            d += Test.instanceCount;
            i19 += i1;
            i19 -= (int)-233L;
            Test.instanceCount += Test.instanceCount;
            sArr[i18] *= (short)i;
            for (i20 = 4; i20 < 109; ++i20) {
                i21 += (((i20 * Test.instanceCount) + Test.fFld) - Test.fFld);
                lArr[i20 + 1] += Test.instanceCount;
                i2 += i20;
                Test.instanceCount *= i21;
            }
            Test.bFld = Test.bFld;
        }
        i22 = 1;
        do {
            i19 = (int)Test.fFld;
            i19 = i2;
            i21 += i17;
            iArr[i22 + 1] += -10930;
        } while (++i22 < 394);
        Test.fFld += i2;


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