package tests.javafuzzer3003;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 00:44:02 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-78L;
    public static int iFld=-5;
    public static short sFld=5348;
    public static volatile byte byFld=-117;
    public static boolean bFld=true;
    public long lArrFld[]=new long[N];
    public static volatile float fArrFld[]=new float[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.fArrFld, -4.803F);
        FuzzerUtils.init(Test.dArrFld, 11.49000);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static void vSmallMeth(int i) {


        i |= (-i);
        i ^= i;
        vSmallMeth_check_sum += i;
    }

    public static float fMeth(boolean b, int i6, long l1) {

        float f2=6.720F, fArr[]=new float[N];
        int i7=-138, i8=-3, i9=-12248, iArr1[]=new int[N];
        long l2=-59690L;

        FuzzerUtils.init(iArr1, 11);
        FuzzerUtils.init(fArr, -48.496F);

        for (f2 = 338; f2 > 21; --f2) {
            double d1=40.10631;
            Test.byFld *= (byte)-16037;
            l2 = 1;
            while (++l2 < 5) {
                i7 += (int)l2;
                Test.instanceCount = i7;
                i7 += (int)(l2 ^ i6);
                b = false;
                for (i8 = 1; i8 < 1; ++i8) {
                    iArr1 = FuzzerUtils.int1array(N, (int)-21056);
                    i9 += (int)l1;
                }
            }
            d1 = d1;
            iArr1[(int)(f2 + 1)] &= (int)Test.instanceCount;
            l1 >>= l2;
        }
        i6 = i7;
        l1 >>= Test.instanceCount;
        long meth_res = (b ? 1 : 0) + i6 + l1 + Float.floatToIntBits(f2) + i7 + l2 + i8 + i9 +
            FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static double dMeth(int i2, long l, int i3) {

        int i4=4, i5=-7, i10=-32, i11=-65, iArr[]=new int[N];

        FuzzerUtils.init(iArr, -3);

        iArr[(41905 >>> 1) % N] *= (i2 + Integer.reverseBytes(i2));
        for (i4 = 9; i4 < 369; i4++) {
            fMeth(Test.bFld, i2, l);
            i5 -= (int)Test.instanceCount;
            iArr[i4] += Test.iFld;
            Test.bFld = Test.bFld;
            i2 = i5;
        }
        for (i10 = 10; i10 < 380; i10++) {
            i2 = i2;
            Test.fArrFld[i10] += i10;
            i3 = Test.byFld;
            i11 += (((i10 * l) + i10) - Test.iFld);
        }
        iArr[(i5 >>> 1) % N] >>>= i10;
        Test.instanceCount = i11;
        i2 += (int)Test.instanceCount;
        long meth_res = i2 + l + i3 + i4 + i5 + i10 + i11 + FuzzerUtils.checkSum(iArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static int iMeth(byte by, float f1, int i1) {

        int i12=0, i13=6, i14=77, i15=63445, i16=127, i17=6;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -2876035947L);

        if (Test.bFld) {
            Test.iFld = (int)((f1--) * dMeth(i1, Test.instanceCount, -11));
        } else {
            for (i12 = 16; i12 < 380; i12++) {
                Test.instanceCount += Test.instanceCount;
                for (i14 = 1; i14 < 5; i14++) {
                    for (i16 = 1; i16 < 2; ++i16) {
                        Test.dArrFld[i12 - 1] = i17;
                        Test.iFld = (int)f1;
                    }
                    i1 = i13;
                    if (i13 != 0) {
                    }
                    lArr[i14] += -7052;
                    Test.instanceCount ^= Test.instanceCount;
                    Test.instanceCount = i15;
                }
                i17 += i12;
            }
            Test.iFld <<= (int)Test.instanceCount;
        }
        long meth_res = by + Float.floatToIntBits(f1) + i1 + i12 + i13 + i14 + i15 + i16 + i17 +
            FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d=65.105296;
        float f=-53.219F;
        int i18=-31219, i19=31, i20=-176, i21=6, i22=-7, i23=-5, i24=-5049, i25=-40898, iArr2[]=new int[N];
        short sArr[]=new short[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(sArr, (short)-12453);
        FuzzerUtils.init(iArr2, -241);
        FuzzerUtils.init(bArr, false);

        Test.instanceCount += (long)d;
        Test.iFld += Test.iFld;
        Test.iFld = (int)(Short.reverseBytes(Test.sFld) - (-(Test.iFld * Test.instanceCount)));
        Test.iFld >>= (++Test.iFld);
        for (int smallinvoc=0; smallinvoc<117; smallinvoc++) vSmallMeth((int)(((Test.iFld - Test.iFld) + 14) + (++f)));
        lArrFld[(Test.iFld >>> 1) % N] *= iMeth(Test.byFld, f, Test.iFld);
        for (short s : sArr) {
            Test.instanceCount = Test.iFld;
            if (Test.bFld) {
                Test.iFld = Test.iFld;
                Test.iFld >>= Test.iFld;
                iArr2[(Test.iFld >>> 1) % N] >>= Test.iFld;
                for (i18 = 3; 63 > i18; i18++) {
                    iArr2[i18 + 1] = Test.sFld;
                    Test.instanceCount = Test.instanceCount;
                    iArr2[i18 - 1] = (int)Test.instanceCount;
                    i19 = i18;
                    Test.iFld -= Test.iFld;
                    sArr[i18 + 1] <<= (short)Test.iFld;
                }
            } else if (Test.bFld) {
                Test.iFld = -9;
                Test.iFld = -61360;
                for (i20 = 1; 63 > i20; ++i20) {
                    bArr[i20] = true;
                    if (Test.bFld) break;
                    i21 >>= i19;
                }
            } else {
                for (i22 = 2; i22 < 63; ++i22) {
                    if (Test.bFld) {
                        for (i24 = i22; 2 > i24; ++i24) {
                            iArr2[i24 - 1] += i19;
                            Test.byFld >>= (byte)Test.instanceCount;
                        }
                    } else if (Test.bFld) {
                        Test.fArrFld = Test.fArrFld;
                    } else {
                        iArr2 = iArr2;
                    }
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  dMeth ->  dMeth iMeth mainTest
//DEBUG  fMeth ->  fMeth dMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}