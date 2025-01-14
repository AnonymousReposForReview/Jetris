package tests.javafuzzer1373;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 19:08:59 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=2658462224L;

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static void vSmallMeth(long l) {

        boolean b=true;
        int i=-37313, iArr[]=new int[N];

        FuzzerUtils.init(iArr, -221);

        b = (((Test.instanceCount++) != Math.abs(i)) && ((iArr[(i >>> 1) % N]++) != Math.max(Test.instanceCount,
            -36832L)));
        vSmallMeth_check_sum += l + (b ? 1 : 0) + i + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(int i8, int i9, double d1) {

        int i10=-113, i11=-55246, i12=11, i13=34442, i14=94, i15=-10, i16=34047, i17=-14, i18=-225, i19=182,
            iArr1[]=new int[N];
        double d2=0.128062;

        FuzzerUtils.init(iArr1, 209);

        vSmallMeth(5044116596842685810L);
        for (i10 = 153; i10 > 1; --i10) {
            i11 += (((i10 * i9) + Test.instanceCount) - Test.instanceCount);
        }
        for (i12 = 123; i12 > 7; --i12) {
            for (i14 = 1; i14 < 13; ++i14) {
                iArr1[i14 + 1] = -53;
                i8 = i15;
            }
        }
        for (i16 = 14; 272 > i16; i16++) {
            iArr1[i16] *= (int)-2L;
            switch (((i16 % 3) * 5) + 73) {
            case 75:
                for (i18 = 1; 6 > i18; ++i18) {
                    byte by=88;
                    iArr1[i18 - 1] *= i18;
                    by >>= (byte)i15;
                    if (i13 != 0) {
                    }
                    i13 = i9;
                }
            case 74:
                d2 = i13;
                break;
            case 76:
                i19 += i16;
            }
        }
        long meth_res = i8 + i9 + Double.doubleToLongBits(d1) + i10 + i11 + i12 + i13 + i14 + i15 + i16 + i17 + i18 +
            i19 + Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(float f, int i1, double d) {

        int i2=-75, i3=-41396, i4=-2832, i5=-6, i6=-25803, i7=4, i20=-10, i21=-6343, iArr2[]=new int[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -935016190L);
        FuzzerUtils.init(iArr2, -1);

        for (i2 = 6; i2 < 231; i2++) {
            for (i4 = 1; i4 < 7; ++i4) {
                Test.instanceCount += i4;
                for (i6 = 1; i6 < 2; i6++) {
                    i5 += (i6 - i7);
                    i3 = (int)lArr[i6 + 1];
                    i5 += i6;
                    i1 *= (int)((i3++) - (++Test.instanceCount));
                }
                i1 >>= (Math.abs((int)(d * i6)) * 193);
                i1 = (iMeth(i6, i5, 0.106820) >>> i4);
                d = i7;
                i3 &= (int)Test.instanceCount;
                for (i20 = 1; i20 < 2; i20 += 3) {
                    iArr2[i4 - 1] *= i2;
                    i1 -= -52306;
                }
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i1 + Double.doubleToLongBits(d) + i2 + i3 + i4 + i5 + i6 + i7 +
            i20 + i21 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i22=0;
        double d3=108.24406;

        for (int smallinvoc=0; smallinvoc<706; smallinvoc++) vSmallMeth(--Test.instanceCount);
        vMeth(-97.353F, i22, d3);
        i22 -= (int)Test.instanceCount;



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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test iMeth vMeth
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
