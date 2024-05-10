package tests.javafuzzer2872;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 21:58:48 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=8627L;
    public short sFld=21584;
    public static byte byFld=127;
    public static volatile double dFld=0.118145;
    public static float fFld=0.508F;
    public long lArrFld[]=new long[N];

    public static long dMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        int i13=-50, i14=-254, i15=-244, iArr[]=new int[N];
        float f2=-1.747F;

        FuzzerUtils.init(iArr, 8);

        for (i13 = 362; i13 > 15; --i13) {
            try {
                i14 = (iArr[i13 - 1] / i14);
                i14 = (38759 / iArr[i13 - 1]);
                i14 = (iArr[i13 - 1] % i13);
            } catch (ArithmeticException a_e) {}
            Test.fFld += (((i13 * i14) + i14) - i14);
            i14 = (int)Test.instanceCount;
            f2 = 1;
            do {
                i15 = 1;
                do {
                    i14 ^= i14;
                    Test.instanceCount -= (long)Test.fFld;
                    i14 *= i14;
                    Test.fFld += i15;
                    i14 <<= -9;
                } while (++i15 < 1);
                i14 += i15;
                iArr[i13] = (int)-6295408684563201968L;
                Test.instanceCount = Test.instanceCount;
                Test.instanceCount *= (long)Test.dFld;
            } while (++f2 < 5);
        }
        vMeth_check_sum += i13 + i14 + Float.floatToIntBits(f2) + i15 + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(long l, double d1, int i12) {

        double d2=-1.55449, dArr[]=new double[N];
        int i16=-18, i17=-136, i18=6, iArr1[]=new int[N];
        boolean b=false;

        FuzzerUtils.init(dArr, -2.124429);
        FuzzerUtils.init(iArr1, 13);

        vMeth();
        Test.instanceCount += -31L;
        for (d2 = 11; d2 < 227; ++d2) {
            i16 -= (int)Test.fFld;
            i12 *= (int)l;
            dArr[(int)(d2)] = i12;
            i12 >>>= i12;
            for (i17 = 1; i17 < 7; ++i17) {
                Test.fFld = i18;
                Test.instanceCount <<= -60671;
                i16 += (((i17 * i12) + i12) - i17);
                i12 += -215;
                if (b) break;
                iArr1[i17] += (int)Test.instanceCount;
                i18 <<= i16;
            }
        }
        long meth_res = l + Double.doubleToLongBits(d1) + i12 + Double.doubleToLongBits(d2) + i16 + i17 + i18 + (b ? 1
            : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static double dMeth(int i8, int i9, float f1) {

        int i10=13, i11=-233, i19=-16357, i20=7630, iArr2[]=new int[N];
        double d3=-1.49105;
        boolean b1=true;
        short s=13279;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -2399123976L);
        FuzzerUtils.init(iArr2, 1);

        for (i10 = 2; i10 < 203; i10++) {
            if ((lArr[i10 + 1] -= (long)((i9 * Test.byFld) + (Test.dFld - i10))) <= iMeth(Test.instanceCount, d3, -6))
                break;
            switch (((i10 % 2) * 5) + 26) {
            case 31:
                if (i11 != 0) {
                }
                break;
            case 35:
                Test.instanceCount += i11;
                i9 = i10;
                b1 = b1;
                break;
            default:
                Test.instanceCount += (((i10 * i11) + i8) - i9);
                i9 += (((i10 * s) + Test.instanceCount) - Test.instanceCount);
            }
        }
        for (i19 = 2; 315 > i19; i19++) {
            i20 -= (int)Test.instanceCount;
            iArr2[i19 + 1] <<= 9421;
            i9 = (int)Test.instanceCount;
            i8 += s;
            i20 -= i10;
        }
        long meth_res = i8 + i9 + Float.floatToIntBits(f1) + i10 + i11 + Double.doubleToLongBits(d3) + (b1 ? 1 : 0) + s
            + i19 + i20 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr2);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-12, i1=-186, i2=9504, i3=46, i4=-5313, i5=-9, i6=-153, i7=-41, i21=25027, i22=605, i23=-25761, i24=165,
            i25=62983, iArr3[]=new int[N];
        double d=-38.92112;
        float f=113.868F;
        boolean b2=false;

        FuzzerUtils.init(iArr3, -6);

        for (i = 3; i < 156; ++i) {
            for (i2 = 1; i2 < 164; ++i2) {
                i3 += (++sFld);
            }
            for (i4 = 8; i4 < 164; ++i4) {
                for (i6 = 1; 2 > i6; i6++) {
                    i5 += (int)((i4 + Test.instanceCount) - d);
                    Test.byFld += (byte)(41770 + (i6 * i6));
                    f = (Test.instanceCount &= ((Test.instanceCount + Test.instanceCount) * (--lArrFld[i6])));
                    i5 *= (int)78.624F;
                }
                i1 = (int)((dMeth(i2, i7, Test.fFld) * Test.instanceCount) * i1);
                i5 = (int)Test.dFld;
                for (i21 = 1; 2 > i21; ++i21) {
                    i7 = 9;
                    Test.fFld += (-17516L + (i21 * i21));
                    i7 += (i21 * i21);
                    iArr3[i21 + 1] *= i1;
                    i1 += i;
                    Test.instanceCount += i7;
                    i1 >>>= -42206;
                    i3 = (int)Test.instanceCount;
                    lArrFld[i4] |= -754767631L;
                    iArr3[i] = i3;
                }
            }
            i22 >>= i22;
            for (i23 = 2; i23 < 164; i23++) {
                Test.instanceCount = i23;
                i22 = (int)-3179798063L;
                i25 = 2;
                do {
                    i5 += (i25 + Test.instanceCount);
                } while (--i25 > 0);
                i24 &= (int)Test.instanceCount;
                b2 = b2;
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
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  iMeth ->  iMeth dMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
