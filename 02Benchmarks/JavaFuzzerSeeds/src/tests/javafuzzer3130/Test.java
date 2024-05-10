package tests.javafuzzer3130;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 02:27:49 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=53495L;
    public static float fFld=-108.999F;
    public static short sFld=-3543;

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i3=48970, i4=-127, i5=0, i6=3, i7=7, i8=5, iArr[]=new int[N];
        float f1=-62.149F;
        long l=26523L;
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr, -170);
        FuzzerUtils.init(dArr, 2.74477);

        iArr[(i3 >>> 1) % N] *= (int)Test.fFld;
        for (i4 = 9; i4 < 179; i4++) {
            if (i4 != 0) {
                vMeth1_check_sum += i3 + i4 + i5 + Float.floatToIntBits(f1) + i6 + i7 + i8 + l +
                    FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                return;
            }
            for (f1 = 9; f1 > 1; f1--) {
                i5 = i6;
                for (i7 = 1; i7 < 2; i7++) {
                    l += (((i7 * i4) + Test.sFld) - Test.fFld);
                    switch ((int)(((f1 % 3) * 5) + 125)) {
                    case 135:
                        i5 += i7;
                    case 126:
                        Test.fFld += i7;
                        i5 += (int)-83.175F;
                        dArr[i7] -= l;
                        break;
                    case 127:
                        i5 <<= i5;
                        l = i4;
                        break;
                    }
                    i3 += 64291;
                }
            }
        }
        vMeth1_check_sum += i3 + i4 + i5 + Float.floatToIntBits(f1) + i6 + i7 + i8 + l + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static int iMeth(int i2) {


        vMeth1();
        long meth_res = i2;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(float f) {

        boolean b=true;
        int i=-14, i1=11, i9=101, iArr1[][]=new int[N][N];
        short s=12317;

        FuzzerUtils.init(iArr1, -26467);

        b = b;
        i = 130;
        do {
            i1 += iMeth(211);
            i1 -= (int)Test.instanceCount;
            iArr1[i][i - 1] <<= -136;
            try {
                i1 = (i1 / i);
                i1 = (-13121 / i);
                iArr1[i + 1][i] = (-835688090 / i1);
            } catch (ArithmeticException a_e) {}
            if (b) {
                i9 = 1;
                do {
                    i1 = i9;
                    Test.instanceCount = i1;
                    Test.sFld += (short)i9;
                    f *= i1;
                    s += (short)(i9 * i9);
                    i1 += i9;
                } while (++i9 < 12);
                iArr1[i][i + 1] >>= i9;
            } else {
                i1 += (i | i);
            }
        } while (--i > 0);
        vMeth_check_sum += Float.floatToIntBits(f) + (b ? 1 : 0) + i + i1 + i9 + s + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i10=-70, i11=46711, i12=0, i13=218, i14=-14, i15=12047, i16=1, i17=-33690, i18=254, iArr2[]=new int[N];
        double d=-2.99056;
        boolean b1=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr2, 250);
        FuzzerUtils.init(lArr, 1696681803982605405L);

        vMeth(-46.321F);
        iArr2[(i10 >>> 1) % N] = i10;
        Test.fFld -= -69.31F;
        for (i11 = 395; i11 > 11; --i11) {
            i10 += i12;
            Test.instanceCount = i12;
            Test.instanceCount = i10;
            Test.instanceCount += i11;
        }
        Test.sFld = (short)i11;
        for (i13 = 12; i13 < 318; i13++) {
            iArr2[i13 + 1] = i13;
            Test.fFld *= i12;
            Test.fFld += Test.instanceCount;
            i15 = 1;
            do {
                i10 = i14;
                i16 = 1;
                do {
                    lArr[i16 + 1] = i13;
                    Test.instanceCount -= -63;
                    Test.fFld += i16;
                    i14 >>= i12;
                    d *= Test.sFld;
                } while (++i16 < 1);
                i10 += i15;
                for (i17 = 1; i17 < 1; i17++) {
                    i10 >>= i13;
                    i10 += i16;
                    b1 = true;
                    i14 %= (int)(i11 | 1);
                    b1 = true;
                    iArr2[i13 - 1] = 77;
                    i18 <<= i10;
                }
            } while (++i15 < 82);
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
