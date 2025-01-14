package tests.javafuzzer3013;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 00:46:02 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2943814324489402732L;
    public static int iFld=4;
    public static short sFld=-6546;
    public static volatile byte byFld=-45;
    public static float fFld=78.28F;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 10);
    }

    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static long lMeth() {

        double d1=-39.124292;
        byte by=-10;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -5L);

        Test.iFld = 19;
        d1 += Test.iFld;
        Test.iFld = Test.iFld;
        Test.iFld += (int)(lArr[(Test.iFld >>> 1) % N] - ((by--) << Test.instanceCount));
        long meth_res = Double.doubleToLongBits(d1) + by + FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1(float f1, float f2) {

        int i8=-12, i9=10376;
        long l1=5L;
        double d2=55.71626;
        boolean b=false;

        for (i8 = 386; i8 > 5; --i8) {
            Test.instanceCount = Test.instanceCount;
            i9 = (int)Test.instanceCount;
            if (true) {
                i9 += (((i8 * Test.iFld) + i8) - i8);
                if (b) {
                    Test.iFld = (int)Test.instanceCount;
                    f1 += 0;
                } else if (b) {
                    l1 = 1;
                    while (++l1 < 4) {
                        Test.iArrFld[(int)(l1)] = Test.sFld;
                        try {
                            Test.iArrFld[(int)(l1)] = (Test.iFld / Test.iFld);
                            Test.iArrFld[i8] = (i8 % i9);
                            Test.iArrFld[i8 - 1] = (i9 / -79);
                        } catch (ArithmeticException a_e) {}
                        i9 = i9;
                        Test.iFld -= Test.iFld;
                    }
                    i9 = 11;
                    Test.iFld = (int)d2;
                } else {
                    Test.instanceCount += (i8 + i8);
                    vMeth1_check_sum += Float.floatToIntBits(f1) + Float.floatToIntBits(f2) + i8 + i9 + l1 +
                        Double.doubleToLongBits(d2) + (b ? 1 : 0);
                    return;
                }
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f1) + Float.floatToIntBits(f2) + i8 + i9 + l1 +
            Double.doubleToLongBits(d2) + (b ? 1 : 0);
    }

    public static void vMeth() {

        int i6=15004, i7=44343, i10=-7844, i11=-60924, i12=-47685, i13=61438, i14=10, i15=-9, i16=18172, i17=6;
        float f3=28.593F;
        double d3=-1.62888;
        boolean b1=false;
        byte by1=114;

        for (i6 = 231; 2 < i6; i6 -= 3) {
            vMeth1(f3, f3);
        }
        f3 = Test.instanceCount;
        Test.iArrFld[(i7 >>> 1) % N] += (int)d3;
        for (i10 = 6; i10 < 177; i10++) {
            Test.iArrFld[i10] += i6;
            Test.instanceCount += i10;
        }
        for (i12 = 5; i12 < 134; ++i12) {
            i13 = i6;
            for (i14 = i12; i14 < 12; ++i14) {
                if (b1) continue;
                for (i16 = 1; i16 < 1; i16++) {
                    i7 = (int)Test.instanceCount;
                    Test.iFld = (int)Test.instanceCount;
                    by1 >>= (byte)i17;
                }
            }
        }
        vMeth_check_sum += i6 + i7 + Float.floatToIntBits(f3) + Double.doubleToLongBits(d3) + i10 + i11 + i12 + i13 +
            i14 + i15 + (b1 ? 1 : 0) + i16 + i17 + by1;
    }

    public static int iMeth(long l, float f) {

        int i5=-10, i18=18912, i19=-13, i20=-10, i21=-2, i22=67, i23=21293;
        byte by2=-55;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-9297);

        i5 <<= (int)lMeth();
        vMeth();
        by2 += (byte)i5;
        for (i18 = 1; 304 > i18; i18++) {
            i19 = i5;
            for (i20 = 5; i20 > i18; i20--) {
                l += (((i20 * i18) + i20) - i20);
                Test.iArrFld[i20] = i20;
                i19 <<= (int)Test.instanceCount;
                i21 *= Test.iFld;
                Test.byFld += (byte)i5;
                for (i22 = 1; i22 < 1; i22++) {
                    i21 = i23;
                    sArr[i18] >>= (short)i20;
                }
                i5 += (int)l;
            }
        }
        long meth_res = l + Float.floatToIntBits(f) + i5 + by2 + i18 + i19 + i20 + i21 + i22 + i23 +
            FuzzerUtils.checkSum(sArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-131, i1=13, i2=-37712, i3=-27838, i4=-23869, i24=209, i25=81, iArr[]=new int[N];
        double d=105.42307, d4=42.123644;
        short s=-6613;
        long lArr1[]=new long[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr, -27004);
        FuzzerUtils.init(lArr1, -11686L);
        FuzzerUtils.init(fArr, -28.447F);

        i = (int)(((i--) - (++Test.instanceCount)) * d);
        Test.instanceCount <<= i;
        d = Test.instanceCount;
        s += (short)(i--);
        Test.instanceCount -= (long)(d * (i++));
        i = i;
        for (i1 = 11; i1 < 176; ++i1) {
            for (i3 = 5; i3 < 152; i3++) {
                try {
                    i = (21719 % i4);
                    i4 = (-12937 % i1);
                    iArr[(i >>> 1) % N] = (iArr[i1 + 1] % i);
                } catch (ArithmeticException a_e) {}
                iMeth(66L, Test.fFld);
                i24 = 2;
                while ((i24 -= 2) > 0) {
                    Test.instanceCount = Test.iFld;
                    Test.iFld += (int)-75.41564;
                    Test.sFld = (short)i;
                    lArr1[i24 - 1] += Test.instanceCount;
                    fArr[i3 + 1] = i;
                    Test.fFld *= Test.instanceCount;
                    Test.iFld *= (int)Test.instanceCount;
                }
                Test.instanceCount %= ((long)(d) | 1);
            }
            Test.iFld *= 15;
            for (d4 = 6; 152 > d4; d4 += 2) {
                i4 -= i4;
                Test.instanceCount += (long)-1.912F;
                i += (int)(d4 * d4);
            }
            i2 -= i25;
            i = -46090;
            Test.fFld += i2;
            Test.fFld -= i3;
            Test.iFld <<= (int)Test.instanceCount;
        }
        Test.fFld += Test.fFld;


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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
