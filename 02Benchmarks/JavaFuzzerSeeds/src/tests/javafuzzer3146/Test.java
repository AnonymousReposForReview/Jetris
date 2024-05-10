package tests.javafuzzer3146;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 02:44:54 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-74L;
    public short sFld=2507;
    public static double dFld=-1.94502;
    public static int iFld=0;
    public static float fFld=2.154F;
    public static short sArrFld[]=new short[N];
    public static volatile int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];
    public int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)26153);
        FuzzerUtils.init(Test.iArrFld, -9);
        FuzzerUtils.init(Test.lArrFld, -6676619074949315212L);
    }

    public static long iMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static double dMeth(int i3, long l) {

        float f=2.680F;

        Test.dFld = (Test.instanceCount *= (long)f);
        long meth_res = i3 + l + Float.floatToIntBits(f);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static float fMeth() {

        int i8=158, i9=3, i10=35, i11=216, i12=-8, iArr1[]=new int[N];
        long l1=-2469586003L;
        byte by1=-63, byArr[]=new byte[N];

        FuzzerUtils.init(iArr1, -9);
        FuzzerUtils.init(byArr, (byte)-29);

        for (i8 = 4; i8 < 184; ++i8) {
            for (l1 = 1; l1 < 9; l1++) {
                Test.iFld >>= i8;
                switch (((i8 % 2) * 5) + 57) {
                case 63:
                    iArr1[(i10 >>> 1) % N] = Test.iFld;
                    for (i11 = i8; 2 > i11; ++i11) {
                        short s1=18252;
                        i12 &= by1;
                        s1 = (short)i12;
                        Test.instanceCount += (long)Test.fFld;
                        Test.instanceCount = i9;
                        s1 = (short)i11;
                        iArr1[i11] /= (int)(i9 | 1);
                        i12 += (i11 * i9);
                        i9 *= (int)-54.359F;
                    }
                    byArr[i8 - 1] -= (byte)i11;
                case 66:
                    Test.sArrFld[(int)(l1 - 1)] = (short)i11;
                    break;
                default:
                    i12 = -20220;
                }
            }
        }
        long meth_res = i8 + i9 + l1 + i10 + i11 + i12 + by1 + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(byArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth(boolean b) {

        int i4=-78, i5=-60, i6=-5, i7=98, i14=45;
        float f2=23.233F, f3=2.948F, fArr[]=new float[N];
        byte by2=49;

        FuzzerUtils.init(fArr, -106.689F);

        i4 = 1;
        do {
            Test.iFld = (int)(-14L + (Integer.reverseBytes(i4) * (--Test.iFld)));
        } while (++i4 < 334);
        i5 = 312;
        while (--i5 > 0) {
            for (i6 = 5; 1 < i6; --i6) {
                Test.dFld = f2;
                Test.iFld += (int)(-78.857F + (i6 * i6));
                f2 += fMeth();
                i7 = Test.iFld;
            }
            by2 += (byte)Test.instanceCount;
            Test.iArrFld[i5 + 1] = i6;
        }
        for (f3 = 2; f3 < 398; ++f3) {
            i14 = i5;
            Test.dFld = -5831;
            fArr[(int)(f3 - 1)] = Test.iFld;
            fArr[(int)(f3)] += i6;
        }
        vMeth_check_sum += (b ? 1 : 0) + i4 + i5 + i6 + i7 + Float.floatToIntBits(f2) + by2 + Float.floatToIntBits(f3)
            + i14 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth(short s, int i2) {

        byte by=-86;
        float f1=0.902F;
        boolean b1=false;
        int iArr[]=new int[N];
        double dArr[]=new double[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -44130);
        FuzzerUtils.init(dArr, 1.56054);
        FuzzerUtils.init(lArr, -3835307302270232084L);

        i2 -= (int)((dMeth(128, Test.instanceCount) * Test.instanceCount) - (--iArr[(i2 >>> 1) % N]));
        iArr[(i2 >>> 1) % N] *= (int)(Math.min(Test.iFld, (int)(by - -678796824083763834L)) * (Test.instanceCount--));
        dArr[(Test.iFld >>> 1) % N] = (Test.instanceCount = (-lArr[(i2 >>> 1) % N]));
        by -= (byte)Test.sArrFld[(Test.iFld >>> 1) % N];
        Test.iFld |= (int)(((s + f1) + (-4965 - (-(++iArr[(i2 >>> 1) % N])))) - Test.iFld);
        vMeth(b1);
        long meth_res = s + i2 + by + Float.floatToIntBits(f1) + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-26514, i1=-12, i15=-4, i16=-121, i17=-25667, i18=1235, i19=-10, i20=-77, i21=166, i22=5, i23=-10;

        for (i = 2; i < 209; ++i) {
            i1 *= (int)((sFld = (short)(-100.445F - iMeth(sFld, 18917))) - Test.instanceCount);
            for (i15 = 3; i15 < 121; ++i15) {
                if (true) break;
                i1 += (i15 + i15);
                for (i17 = 2; i17 > 1; --i17) {
                    Test.instanceCount += Test.instanceCount;
                    Test.iFld += (int)(-12L + (i17 * i17));
                    Test.lArrFld[i - 1] *= -44;
                    Test.iArrFld[i + 1] += i18;
                }
                switch (((i15 % 1) * 5) + 118) {
                case 121:
                    Test.fFld += (-46 + (i15 * i15));
                    for (i19 = i; i19 < 2; ++i19) {
                        i18 = (int)6L;
                    }
                    for (i21 = 2; 1 < i21; i21 -= 2) {
                        Test.fFld *= Test.instanceCount;
                        Test.instanceCount -= Test.instanceCount;
                        i20 -= (int)1.72613;
                        Test.instanceCount -= i16;
                        Test.lArrFld[i + 1] += i21;
                    }
                    break;
                }
                Test.iFld = i;
                Test.iArrFld[i] = i16;
                Test.instanceCount *= Test.instanceCount;
            }
            i23 = 1;
            do {
                Test.iArrFld[i23] = (int)Test.instanceCount;
                Test.fFld += Test.iFld;
            } while ((i23 += 3) < 121);
            i1 -= i17;
            Test.iArrFld[i] <<= i19;
            iArrFld1[i - 1] = (int)Test.instanceCount;
            i1 += i;
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
//DEBUG  dMeth ->  dMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  fMeth ->  fMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
