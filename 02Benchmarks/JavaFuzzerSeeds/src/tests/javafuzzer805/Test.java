package tests.javafuzzer805;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 10:20:24 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=7054L;
    public static byte byFld=126;
    public static volatile long lFld=-9005851897293146459L;
    public static float fFld=-1.252F;
    public static volatile int iFld=-5;
    public volatile short sFld=-14020;
    public boolean bFld=true;
    public int iArrFld[]=new int[N];
    public long lArrFld[]=new long[N];

    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i1, int i2) {

        double d1=2.83057;
        int i3=-13, i4=229, i5=26874, i6=205, i7=49168;
        short s=-20861;
        boolean b=true;
        float f1=-63.478F;

        d1 = i1;
        i3 = 1;
        do {
            s += (short)(i3 + Test.instanceCount);
            for (i4 = i3; 9 > i4; ++i4) {
                i1 *= (int)Test.instanceCount;
                for (i6 = i4; i6 < 1; ++i6) {
                    i1 += i7;
                    b = false;
                    i5 -= i3;
                    i7 = Test.byFld;
                    f1 += -2.620F;
                    s = (short)i5;
                    i5 = i4;
                    s += (short)i6;
                }
                if (i6 != 0) {
                }
            }
        } while (++i3 < 175);
        long meth_res = i1 + i2 + Double.doubleToLongBits(d1) + i3 + s + i4 + i5 + i6 + i7 + (b ? 1 : 0) +
            Float.floatToIntBits(f1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static double dMeth(float f, long l1, int i) {

        double d=1.71039, d2=0.57047;
        int i8=8, i9=-254, i10=-23, i11=-92, i12=64753, iArr[]=new int[N];
        long l2=-22L, l3=199L;
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr, -12);
        FuzzerUtils.init(fArr, 94.867F);

        i = (int)d;
        i = (int)(((i % (i | 1)) + (i - Test.instanceCount)) * (iMeth(225, i) + Test.instanceCount));
        switch ((((i >>> 1) % 1) * 5) + 45) {
        case 49:
            for (i8 = 5; i8 < 275; i8++) {
                i9 += (i8 ^ (long)f);
                i10 = 1;
                do {
                    i9 = i;
                    i9 -= (int)d;
                } while (++i10 < 6);
                for (d2 = 1; d2 < 6; d2++) {
                    iArr[(int)(d2 + 1)] *= Test.byFld;
                    Test.lFld += (long)((long)d2 ^ i11);
                    for (l2 = 1; l2 < 2; l2++) {
                        fArr = FuzzerUtils.float1array(N, (float)-74.647F);
                        i = (int)l3;
                    }
                }
                i9 += (i8 * i8);
            }
            break;
        }
        long meth_res = Float.floatToIntBits(f) + l1 + i + Double.doubleToLongBits(d) + i8 + i9 + i10 +
            Double.doubleToLongBits(d2) + i11 + l2 + i12 + l3 + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth(long l) {

        int i13=0, i14=39618, i15=9, i16=139, i17=3, i18=5, i19=-103, i20=-13, i21=-58;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, 11L);

        Test.instanceCount &= (long)(Math.max(Test.instanceCount * Test.instanceCount, Test.instanceCount) *
            dMeth(103.237F, Test.lFld, i13));
        i13 = i13;
        for (i14 = 9; i14 < 334; i14++) {
            i13 += (i14 - i13);
            for (i16 = 5; i14 < i16; --i16) {
                i15 = i17;
                Test.fFld = Test.instanceCount;
                for (i18 = 1; i18 < 1; ++i18) {
                    lArr[i14 + 1][i16 + 1] = i13;
                }
                Test.instanceCount += (((i16 * Test.fFld) + i17) - i14);
                for (i20 = 1; i20 < 1; ++i20) {
                    i21 = (int)Test.fFld;
                    Test.fFld += (i20 + i19);
                }
                i15 -= -4;
                i21 += (((i16 * l) + i15) - i20);
            }
        }
        vMeth_check_sum += l + i13 + i14 + i15 + i16 + i17 + i18 + i19 + i20 + i21 + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i22=-7, i23=39772, i24=12, i25=-138, i26=-164, i27=-58571, i28=-63623, i29=-55971, i30=-7, i31=-7,
            i32=-27447;
        double d3=-60.19264;
        byte by=126;

        vMeth(-3364721066902093848L);
        iArrFld[(Test.iFld >>> 1) % N] = Test.iFld;
        for (i22 = 20; 342 > i22; ++i22) {
            for (i24 = i22; i24 < 78; ++i24) {
                Test.instanceCount = i25;
            }
        }
        for (i26 = 227; i26 > 8; --i26) {
            sFld = (short)i22;
            i28 = 1;
            do {
                for (i29 = 1; 1 > i29; i29++) {
                    i30 = 254;
                    i27 += (((i29 * i28) + Test.byFld) - i22);
                    Test.fFld = Test.lFld;
                    i30 = -60974;
                    lArrFld[i28 + 1] *= (long)d3;
                    i23 = i30;
                    Test.lFld = by;
                }
                if (bFld) continue;
                Test.iFld = (int)Test.lFld;
                i27 += i28;
                i25 *= (int)Test.lFld;
                Test.lFld ^= i23;
            } while (++i28 < 115);
            i30 += i26;
            Test.fFld = Test.instanceCount;
            Test.iFld -= (int)Test.lFld;
        }
        Test.instanceCount -= (long)d3;
        for (i31 = 321; i31 > 15; i31 -= 2) {
            i30 -= i29;
            Test.iFld += i25;
            i27 = i30;
            i25 = i28;
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
//DEBUG  dMeth ->  dMeth vMeth mainTest
//DEBUG  iMeth ->  iMeth dMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}