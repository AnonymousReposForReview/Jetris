package tests.javafuzzer303;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 01:34:48 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=1878504360L;
    public static volatile byte byFld=-101;
    public static boolean bFld=true;
    public static short sFld=-28145;
    public static volatile int iFld=-190;
    public static volatile float fFld=-2.803F;
    public float fArrFld[]=new float[N];

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f, long l, int i1) {

        int i2=-30992, i3=55608, i4=8, i5=233, i6=57945;
        boolean b=false;

        f %= (i1 | 1);
        i1 = i1;
        i2 = 1;
        do {
            for (i3 = 1; i3 < 5; i3++) {
                f -= i1;
                i5 = (int)l;
                if (i3 != 0) {
                    vMeth1_check_sum += Float.floatToIntBits(f) + l + i1 + i2 + i3 + i4 + i5 + i6 + (b ? 1 : 0);
                    return;
                }
                i5 -= i3;
                i6 = 1;
                do {
                    i1 += i6;
                    i4 |= (int)Test.instanceCount;
                    i5 += (((i6 * i3) + Test.instanceCount) - i6);
                } while (++i6 < 2);
                i4 += i5;
                if (b) break;
                i5 += (i3 * i3);
            }
        } while (++i2 < 362);
        vMeth1_check_sum += Float.floatToIntBits(f) + l + i1 + i2 + i3 + i4 + i5 + i6 + (b ? 1 : 0);
    }

    public static int iMeth(int i) {

        int i7=-23097, i8=7576, i9=-11, i10=13, iArr[]=new int[N];
        float f1=0.157F;

        FuzzerUtils.init(iArr, -7);

        vMeth1(1.978F, Test.instanceCount, i);
        for (i7 = 141; i7 > 6; i7 -= 2) {
            if (i8 != 0) {
            }
            for (i9 = 23; 1 < i9; i9 -= 2) {
                i10 /= 41316;
                switch (((i7 % 2) * 5) + 66) {
                case 67:
                    i8 *= i10;
                case 69:
                    i8 ^= i7;
                    i += (((i9 * Test.instanceCount) + i10) - i);
                    f1 += (((i9 * i8) + Test.instanceCount) - Test.instanceCount);
                    if (Test.bFld) break;
                }
                iArr[i7] += Test.sFld;
                i += (i9 * i9);
                i10 *= (int)Test.instanceCount;
            }
            i10 += (i7 - i7);
        }
        long meth_res = i + i7 + i8 + i9 + i10 + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(short s) {

        int i11=-1309, i12=-26289, i13=-17, i14=-4, i15=84, i16=186, i17=-49082, i18=-67, i19=48005, i20=131,
            iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, 36821);

        Test.byFld >>= (byte)iMeth(i11);
        Test.instanceCount += i11;
        for (i12 = 11; i12 < 325; i12++) {
            iArr1[i12 + 1] = i13;
            i11 += (-5 + (i12 * i12));
            iArr1[i12 + 1] -= (int)Test.instanceCount;
            for (i14 = 1; i14 < 5; ++i14) {
                Test.sFld += (short)(((i14 * i15) + Test.instanceCount) - i12);
            }
            Test.bFld = Test.bFld;
        }
        for (i16 = 10; i16 < 309; ++i16) {
            for (i18 = 6; i18 > 1; --i18) {
                i13 += i18;
                i20 += (i18 * i16);
                Test.bFld = Test.bFld;
                try {
                    i17 = (i16 / -9219);
                    i11 = (-1402307154 % iArr1[i18 - 1]);
                    i11 = (27045 / i11);
                } catch (ArithmeticException a_e) {}
            }
        }
        vMeth_check_sum += s + i11 + i12 + i13 + i14 + i15 + i16 + i17 + i18 + i19 + i20 + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i21=-4, i22=-2, i23=-3, i24=0, i25=-230, i26=-142, iArr2[][]=new int[N][N];
        double d=0.116818, d1=107.129282;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr2, 219);
        FuzzerUtils.init(lArr, -3716148422L);

        vMeth((short)(-16618));
        Test.byFld += (byte)-62309;
        i21 = 1;
        while (++i21 < 170) {
            Test.iFld += (i21 * i21);
        }
        iArr2[(Test.iFld >>> 1) % N][(i21 >>> 1) % N] = i21;
        lArr[(i21 >>> 1) % N] = i21;
        Test.byFld = (byte)i21;
        for (i22 = 18; i22 < 320; i22++) {
            for (i24 = 4; i24 < 83; ++i24) {
                iArr2[i22 - 1][i24 + 1] <<= i25;
                i23 += i24;
                i25 += (int)(2445240131898490786L + (i24 * i24));
                i25 = 7;
                fArrFld[i24 + 1] -= i25;
                i25 = Test.iFld;
                i23 += i23;
                lArr[i24] -= -15053L;
                for (d = 1; d < 2; d++) {
                    Test.fFld -= 14;
                    Test.bFld = Test.bFld;
                    i25 = i22;
                    switch (((i26 >>> 1) % 2) + 100) {
                    case 100:
                        Test.iFld = i24;
                    case 101:
                        i23 -= (int)-184L;
                        Test.fFld = (float)d;
                        Test.instanceCount += (long)d;
                        break;
                    }
                    i25 <<= (int)170L;
                    if (Test.bFld) continue;
                }
            }
            i23 -= (int)39.954F;
            d1 = -133712595201700645L;
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
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
