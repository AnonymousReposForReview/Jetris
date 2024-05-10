package tests.javafuzzer1931;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 06:12:02 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-10L;
    public static double dFld=106.26940;
    public short sFld=26396;
    public static volatile float fFld=-32.43F;
    public byte byFld=20;
    public static volatile int iFld=-87;
    public int iArrFld[]=new int[N];

    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i=-14, i1=4, i2=-2, i3=22808, i4=-30335, i5=-116;
        double d=75.3553;
        boolean b=false;
        float f=-109.38F, fArr[]=new float[N];

        FuzzerUtils.init(fArr, -109.910F);

        i = i;
        fArr[(53074 >>> 1) % N] = i;
        i = i;
        i += (int)Test.instanceCount;
        Test.dFld -= i;
        for (d = 1; 372 > d; ++d) {
            for (i2 = 5; i2 > 1; i2--) {
                Test.instanceCount = i3;
                if (b) break;
                for (i4 = 1; i4 < 2; i4++) {
                    f = i5;
                    switch (((i >>> 1) % 1) + 54) {
                    case 54:
                        i5 += (i4 * i3);
                        i5 |= -56;
                        Test.instanceCount += (i4 - f);
                    }
                }
            }
        }
        vMeth1_check_sum += i + Double.doubleToLongBits(d) + i1 + i2 + i3 + (b ? 1 : 0) + i4 + i5 +
            Float.floatToIntBits(f) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static float fMeth(long l1, long l2) {

        int i6=115, i7=58114, i8=3, i9=128, i10=14;
        long l3=-3437891865848801647L, lArr[]=new long[N];
        float f1=-1.185F;

        FuzzerUtils.init(lArr, 1525748005L);

        vMeth1();
        i6 += (int)Test.instanceCount;
        for (i7 = 9; i7 < 343; ++i7) {
            for (l3 = 1; 5 > l3; ++l3) {
                i6 += -12995;
                i8 -= i8;
                f1 += (((l3 * i9) + i8) - l3);
                switch ((int)((l3 % 2) + 16)) {
                case 16:
                    lArr = lArr;
                    break;
                case 17:
                    switch (((i7 % 2) * 5) + 77) {
                    case 83:
                        l1 -= Test.instanceCount;
                        i9 += (int)(((l3 * i8) + f1) - i7);
                        i10 = 1;
                        do {
                            i6 = i7;
                            i6 += (int)Test.dFld;
                        } while (++i10 < 2);
                        break;
                    case 81:
                        i9 *= 122;
                        break;
                    default:
                        l1 *= l3;
                    }
                    break;
                }
            }
        }
        long meth_res = l1 + l2 + i6 + i7 + i8 + l3 + i9 + Float.floatToIntBits(f1) + i10 + FuzzerUtils.checkSum(lArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void vMeth(long l) {

        int i11=-12, i12=7, i13=37203, i14=17709, i15=64071, iArr[]=new int[N];
        float f2=-45.819F;
        long l4=8640523947516147460L;
        byte by=0;
        boolean b1=false;

        FuzzerUtils.init(iArr, 5);

        l -= (long)fMeth(l, Test.instanceCount);
        for (i11 = 2; i11 < 214; i11++) {
            if (i11 != 0) {
                vMeth_check_sum += l + i11 + i12 + Float.floatToIntBits(f2) + l4 + i13 + i14 + i15 + by + (b1 ? 1 : 0)
                    + FuzzerUtils.checkSum(iArr);
                return;
            }
            f2 = i11;
            for (l4 = 1; l4 < 8; ++l4) {
                iArr[(int)(l4)] = -28363;
                iArr[i11 - 1] -= (int)Test.dFld;
                l += (l4 * l4);
                for (i14 = (int)(l4); i14 < 2; i14++) {
                    i12 = sFld;
                    Test.dFld -= by;
                    i13 += i11;
                    l -= by;
                    iArr[i14 - 1] *= i13;
                    b1 = false;
                }
            }
        }
        vMeth_check_sum += l + i11 + i12 + Float.floatToIntBits(f2) + l4 + i13 + i14 + i15 + by + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i16=-10, i17=-72, i18=7, i19=14, i20=-3678, i21=-7, i22=-13;
        boolean b2=true;
        double d1=0.11898;

        vMeth(Test.instanceCount);
        Test.fFld *= i16;
        for (i17 = 6; i17 < 132; ++i17) {
            try {
                i16 = (i16 % -9151);
                i19 = (i16 % 6518);
                i19 = (293360679 / i19);
            } catch (ArithmeticException a_e) {}
            byFld += (byte)(((i17 * i19) + i17) - Test.iFld);
            Test.instanceCount = Test.instanceCount;
            switch ((i17 % 1) + 12) {
            case 12:
                sFld += (short)i17;
                iArrFld[(10 >>> 1) % N] -= i17;
                iArrFld[i17] = (int)1.275F;
                iArrFld[i17 - 1] |= i18;
                break;
            }
            for (i20 = i17; 199 > i20; ++i20) {
                i22 = 1;
                do {
                    if (b2) break;
                    Test.fFld /= (i20 | 1);
                    switch ((i20 % 3) + 114) {
                    case 114:
                        d1 -= 183;
                        i21 -= i22;
                        sFld += (short)(-63692 + (i22 * i22));
                    case 115:
                        b2 = b2;
                    case 116:
                        i21 += i22;
                        i18 += (i22 + i17);
                        Test.instanceCount += (((i22 * i16) + i22) - i22);
                        iArrFld[i17] *= i22;
                        break;
                    default:
                        if (b2) continue;
                    }
                    b2 = b2;
                    Test.instanceCount -= 17711;
                } while (++i22 < 1);
            }
            Test.fFld -= Test.iFld;
            i18 -= (int)d1;
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
//DEBUG  fMeth ->  fMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 fMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}