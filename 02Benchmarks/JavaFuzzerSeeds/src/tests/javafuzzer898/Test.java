package tests.javafuzzer898;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 11:25:00 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-7023056500596668248L;
    public static double dFld=-42.114013;
    public static long lFld=-2152875444L;
    public static float fFld=-47.681F;
    public static volatile long lArrFld[][]=new long[N][N];

    static {
        FuzzerUtils.init(Test.lArrFld, 2527788627L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(boolean b1, double d1, int i6) {

        int i8=-2, i9=13, iArr1[]=new int[N];
        float f=-17.595F;
        short s1=-14376;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr1, 2);
        FuzzerUtils.init(lArr, 55L);

        for (int i7 : iArr1) {
            i6 -= (int)4L;
            iArr1[(i7 >>> 1) % N] += (int)Test.instanceCount;
            i6 -= i6;
            if (false) continue;
            try {
                i7 = (iArr1[(i6 >>> 1) % N] / -964);
                i6 = (i7 % 753337424);
                i6 = (i7 / -54283);
            } catch (ArithmeticException a_e) {}
        }
        for (i8 = 3; i8 < 207; i8++) {
            i6 += (int)f;
            i9 += (i8 * i8);
            lArr[i8] |= i6;
            f += i8;
        }
        i9 *= (int)97.125F;
        d1 -= i6;
        s1 -= (short)i9;
        Test.instanceCount = i6;
        vMeth1_check_sum += (b1 ? 1 : 0) + Double.doubleToLongBits(d1) + i6 + i8 + i9 + Float.floatToIntBits(f) + s1 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(boolean b, int i5) {


        vMeth1(b, Test.dFld, i5);
        vMeth_check_sum += (b ? 1 : 0) + i5;
    }

    public static int iMeth(int i2, long l, int i3) {

        int i4=-44, i10=-5, i11=28, i12=-149;
        float f1=113.414F;

        i4 = 1;
        do {
            vMeth(false, i2);
            i10 = 6;
            do {
                for (i11 = 1; i11 < 1; ++i11) {
                    i2 += (int)Test.instanceCount;
                    i3 -= (int)f1;
                    i2 -= (int)f1;
                    i3 += (((i11 * i11) + i3) - i12);
                    i3 ^= i2;
                    Test.dFld = 4;
                    Test.dFld += i11;
                    i12 += (i11 ^ i3);
                }
                Test.dFld = i3;
                i2 = i11;
                i12 >>>= -14;
            } while (--i10 > 0);
        } while (++i4 < 263);
        long meth_res = i2 + l + i3 + i4 + i10 + i11 + i12 + Float.floatToIntBits(f1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr3) {

        double d=0.55379, d2=2.100328;
        int i13=35201, i14=-49534, i15=-11, i16=0, i17=10, i18=48860, i19=137, i20=28740, i21=-7227, iArr2[]=new int[N];
        byte by=35;
        boolean b2=false;
        short s2=-5551;

        FuzzerUtils.init(iArr2, 143);

        d += ((iMeth(i13, 55101L, i13) - i13) - -13);
        for (i14 = 209; i14 > 11; i14 -= 3) {
            for (i16 = 15; 379 > i16; i16++) {
                i13 >>>= i13;
                i15 -= 12784;
                for (i18 = 2; 1 < i18; --i18) {
                    by <<= (byte)i19;
                    if (b2) continue;
                    Test.instanceCount = by;
                    i15 -= i18;
                    Test.instanceCount += (((i18 * i13) + Test.instanceCount) - Test.instanceCount);
                    Test.instanceCount = i13;
                    switch (((i18 % 1) * 5) + 30) {
                    case 32:
                    default:
                        i15 += (i18 + i15);
                        Test.dFld = by;
                    }
                    iArr2[i16 - 1] += i14;
                    Test.instanceCount ^= -7493;
                    i17 = i17;
                }
                i15 += i19;
            }
            Test.lArrFld[i14 - 1][i14] |= Test.lFld;
        }
        Test.fFld *= i17;
        d2 = 1;
        while (++d2 < 208) {
            i20 = 121;
            do {
                s2 += (short)i20;
                iArr2[(int)(d2)] -= (int)d;
                i13 = i16;
            } while ((i20 -= 3) > 0);
        }
        i21 = 1;
        while (++i21 < 178) {
            i15 -= i16;
            iArr2[i21] /= (int)(i16 | 1);
            i19 = s2;
        }


    }
    public static void main(String[] strArr2) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr2);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}