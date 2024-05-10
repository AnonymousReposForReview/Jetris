package tests.javafuzzer945;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 11:51:27 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=979268292355781236L;
    public static short sFld=11373;
    public static byte byFld=-75;
    public boolean bFld=false;
    public double dFld=-2.23721;
    public static double dArrFld[]=new double[N];
    public int iArrFld[]=new int[N];
    public float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 96.128235);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i5, int i6, int i7) {

        double d=-2.7394, d1=-2.118284;
        int i8=8654, i9=3, i10=-135, i11=-4401, i12=38204, iArr1[]=new int[N], iArr2[][]=new int[N][N], iArr3[]=new
            int[N];
        byte by=-9;
        boolean b=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr1, -248);
        FuzzerUtils.init(iArr2, 6);
        FuzzerUtils.init(iArr3, 117);
        FuzzerUtils.init(lArr, 45777L);

        for (d = 7; d < 261; ++d) {
            for (i9 = 1; i9 < 6; ++i9) {
                Test.sFld = (short)i7;
                for (i11 = i9; i11 < 2; ++i11) {
                    try {
                        iArr1[(int)(d - 1)] = (i5 % i7);
                        i5 = (-23537 % i10);
                        i6 = (iArr2[(int)(d - 1)][(int)(d)] / 2656);
                    } catch (ArithmeticException a_e) {}
                    iArr1[i9 + 1] -= by;
                    if (b) {
                        by = (byte)i9;
                    } else {
                        d1 = Test.instanceCount;
                        Test.dArrFld[i9 + 1] -= i5;
                    }
                    try {
                        iArr1[(int)(d - 1)] = (iArr3[(int)(d)] / iArr3[i9 - 1]);
                        iArr2[(int)(d)][i9 - 1] = (i12 % iArr1[i11 + 1]);
                        i10 = (-145 / i11);
                    } catch (ArithmeticException a_e) {}
                    Test.instanceCount <<= i6;
                }
                i8 += (int)Test.instanceCount;
                Test.instanceCount -= -14519;
                lArr[(int)(d - 1)] -= i5;
            }
        }
        vMeth1_check_sum += i5 + i6 + i7 + Double.doubleToLongBits(d) + i8 + i9 + i10 + i11 + i12 + by + (b ? 1 : 0) +
            Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(iArr2) +
            FuzzerUtils.checkSum(iArr3) + FuzzerUtils.checkSum(lArr);
    }

    public static long lMeth(float f, int i2) {

        int i3=-5688, i4=-22685, i13=10, i14=-50082, i15=7, i16=10, i17=10, i18=-5, i19=-5, iArr4[]=new int[N];
        byte by1=-9, byArr[]=new byte[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -1350189009701603653L);
        FuzzerUtils.init(byArr, (byte)-62);
        FuzzerUtils.init(iArr4, -218);

        for (i3 = 3; i3 < 190; i3++) {
            vMeth1(i4, i3, i4);
            lArr1[i3 + 1] -= i4;
            for (i13 = 1; i13 < 9; i13++) {
                for (i15 = 1; i15 < 2; i15++) {
                    i4 <<= i13;
                }
                lArr1[i13] = i4;
                for (i17 = 1; 2 > i17; i17++) {
                    i14 += (int)f;
                }
                i14 ^= i15;
                i16 += (i13 | i17);
                byArr[i13 + 1] = (byte)10L;
            }
            Test.instanceCount &= by1;
            iArr4[i3 + 1] = i2;
            i19 += i3;
        }
        long meth_res = Float.floatToIntBits(f) + i2 + i3 + i4 + i13 + i14 + i15 + i16 + i17 + i18 + by1 + i19 +
            FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr4);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i, int i1) {

        float f1=-1.415F;
        int i20=-139, i21=109, iArr[]=new int[N];
        boolean b1=false;
        long lArr2[]=new long[N];

        FuzzerUtils.init(iArr, -23552);
        FuzzerUtils.init(lArr2, 36L);

        iArr[(i1 >>> 1) % N] -= (int)(lMeth(f1, i) * 12);
        for (i20 = 24; i20 < 389; i20++) {
            switch ((i20 % 1) + 76) {
            case 76:
                Test.instanceCount += (i20 | Test.instanceCount);
                iArr[i20 + 1] = i1;
            }
            if (i1 != 0) {
                vMeth_check_sum += i + i1 + Float.floatToIntBits(f1) + i20 + i21 + (b1 ? 1 : 0) +
                    FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr2);
                return;
            }
            i += i21;
            i1 += (-79 + (i20 * i20));
            if (b1) continue;
            Test.instanceCount += i20;
            i -= i;
            if (b1) {
                i1 += (i20 + i20);
                vMeth_check_sum += i + i1 + Float.floatToIntBits(f1) + i20 + i21 + (b1 ? 1 : 0) +
                    FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr2);
                return;
            } else {
                lArr2[i20 - 1] = i20;
                Test.instanceCount -= i1;
            }
        }
        vMeth_check_sum += i + i1 + Float.floatToIntBits(f1) + i20 + i21 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(lArr2);
    }

    public void mainTest(String[] strArr1) {

        int i23=5, i24=68, i25=-50439, i26=11, i27=10, i28=-26, i29=-66, i30=-124, i31=-33126;
        float f2=-9.211F;
        long lArr3[][]=new long[N][N];

        FuzzerUtils.init(lArr3, 10918L);

        vMeth(298, i23);
        lArr3[(i23 >>> 1) % N][(i23 >>> 1) % N] += i23;
        for (i24 = 17; i24 < 293; i24 += 3) {
            float f3=2.170F;
            if (bFld) {
                for (i26 = 1; 272 > i26; i26++) {
                    i23 += (i26 + Test.instanceCount);
                    i25 -= Test.byFld;
                    i25 = i24;
                    Test.instanceCount -= Test.instanceCount;
                    i25 >>= i25;
                    Test.instanceCount += (i26 + Test.instanceCount);
                    lArr3[i26 + 1][i24 - 1] += -12593;
                    if (bFld) continue;
                    for (i28 = 2; i28 > 1; --i28) {
                        iArrFld[i24 - 1] = i25;
                        i23 = i28;
                    }
                    for (f2 = 1; f2 < 2; ++f2) {
                        Test.dArrFld = Test.dArrFld;
                        fArrFld[i24] += Test.instanceCount;
                        i27 += (int)((long)f2 ^ i23);
                        i29 = (int)f2;
                        dFld -= i29;
                        i23 -= i31;
                        Test.instanceCount -= i30;
                    }
                }
                Test.byFld >>>= (byte)-244;
                i30 = (int)Test.instanceCount;
                i30 = (int)Test.instanceCount;
            } else if (bFld) {
                f3 += -191;
                f3 *= i24;
                iArrFld = iArrFld;
            } else {
                bFld = bFld;
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
