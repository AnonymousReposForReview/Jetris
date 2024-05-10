package tests.javafuzzer990;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 12:38:09 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1769330304474895726L;
    public static short sFld=10345;
    public static int iFld=60991;
    public static boolean bFld=true;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -44118);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(int i2, int i3) {

        int i4=42, i5=-58765, i6=7012, i7=-9592, i8=95, iArr[]=new int[N];
        double d2=126.79506;
        boolean b=true;
        float f=11.707F;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 10);
        FuzzerUtils.init(lArr, 6L);

        for (i4 = 4; i4 < 381; i4++) {
            i2 *= i3;
            if (b) {
                i3 += (int)d2;
            } else {
                Test.instanceCount <<= -21732;
                iArr = iArr;
                Test.instanceCount += (((i4 * i5) + i5) - Test.sFld);
            }
            lArr[i4 - 1] = i3;
            i6 = 1;
            while (++i6 < 4) {
                for (i7 = 1; 1 > i7; i7++) {
                    i5 += (((i7 * i2) + i4) - Test.sFld);
                    f *= f;
                    i8 += (((i7 * i8) + Test.instanceCount) - i3);
                    i8 &= i4;
                    i3 >>= (int)Test.instanceCount;
                }
            }
        }
        long meth_res = i2 + i3 + i4 + i5 + Double.doubleToLongBits(d2) + (b ? 1 : 0) + i6 + i7 + i8 +
            Float.floatToIntBits(f) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth(double d1) {

        int i9=76, i10=53677, i11=155, i12=-61913;
        byte by=-15;
        float f1=0.821F;
        double dArr[]=new double[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(dArr, -25.101215);
        FuzzerUtils.init(bArr, false);

        fMeth(Test.iFld, Test.iFld);
        for (double d3 : dArr) {
            Test.iFld -= (int)-802081164L;
            for (i9 = 1; i9 < 4; ++i9) {
                for (i11 = 1; i11 < 2; ++i11) {
                    by += (byte)(((i11 * Test.iFld) + i12) - i9);
                    bArr[i9 + 1] = Test.bFld;
                }
                i10 = i12;
                by += (byte)i9;
                i12 = -6;
                i12 *= (int)f1;
                i12 = (int)Test.instanceCount;
                by >>>= (byte)Test.instanceCount;
                i10 = -119;
                Test.iFld -= i11;
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d1) + i9 + i10 + i11 + i12 + by + Float.floatToIntBits(f1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(bArr);
    }

    public static int iMeth() {

        double d4=0.55840;
        int i13=-114, i14=-3, i15=-11, i16=-23567, i17=-163, i18=-21265, iArr1[][]=new int[N][N];
        boolean b1=false;
        float fArr[]=new float[N];
        long lArr1[]=new long[N], lArr2[]=new long[N];

        FuzzerUtils.init(fArr, 104.407F);
        FuzzerUtils.init(iArr1, -40965);
        FuzzerUtils.init(lArr1, 3883313665L);
        FuzzerUtils.init(lArr2, -12L);

        vMeth(d4);
        for (i13 = 2; i13 < 133; i13++) {
            Test.sFld += (short)(i13 * i13);
        }
        for (float f2 : fArr) {
            iArr1[(i14 >>> 1) % N] = iArr1[(i14 >>> 1) % N];
            iArr1[(i13 >>> 1) % N][(i13 >>> 1) % N] += i13;
            lArr1[(i15 >>> 1) % N] >>>= i15;
            for (i16 = 1; i16 < 4; ++i16) {
                i14 -= (int)f2;
            }
            i15 = Test.sFld;
        }
        i18 = 1;
        do {
            b1 = false;
            Test.instanceCount = i16;
            lArr2 = lArr1;
            i14 = Test.sFld;
        } while (++i18 < 374);
        long meth_res = Double.doubleToLongBits(d4) + i13 + i14 + i15 + i16 + i17 + i18 + (b1 ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(lArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=57439, i1=50671, i19=-146, i20=5, i21=9, i22=-229, i23=-10075, i24=156, i25=1, i26=-3, i27=129,
            i28=34937, i29=-6, i30=31193;
        double d=80.69014, dArr1[]=new double[N];
        float f3=12.815F;
        long lArr3[]=new long[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(lArr3, -3052404485582829979L);
        FuzzerUtils.init(dArr1, 1.26486);
        FuzzerUtils.init(sArr, (short)-20179);

        for (i = 11; i < 368; i++) {
            d *= iMeth();
            i1 -= Test.sFld;
            if (Test.bFld) continue;
            for (i19 = 4; i19 < 71; i19++) {
                try {
                    i20 = (i20 % -43498);
                    Test.iArrFld[i19] = (Test.iArrFld[i19] % 244);
                    i1 = (-145 % i);
                } catch (ArithmeticException a_e) {}
                for (i21 = i19; i21 < 2; i21++) {
                    if (Test.bFld) break;
                    Test.iArrFld[i] = (int)Test.instanceCount;
                }
                i20 = i22;
                i1 *= i20;
                lArr3[i19 - 1] = (long)f3;
            }
        }
        i20 -= i21;
        dArr1[(i >>> 1) % N] = i21;
        for (short s : sArr) {
            for (i23 = 2; 63 > i23; ++i23) {
                i22 += i23;
                i24 = i20;
                Test.instanceCount = i1;
                Test.instanceCount += i23;
                for (i25 = 1; i25 < 2; i25++) {
                    d *= i1;
                }
                d = i1;
            }
            i26 -= i1;
            for (i27 = 63; i27 > 1; --i27) {
                Test.iFld = (int)Test.instanceCount;
                Test.iArrFld[i27] <<= (int)Test.instanceCount;
                for (i29 = 1; 2 > i29; i29++) {
                    Test.instanceCount += i22;
                }
                Test.instanceCount += Test.iFld;
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  fMeth ->  fMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
