package tests.javafuzzer886;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 11:18:36 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1772498566L;
    public static float fFld=85.492F;
    public static byte byFld=62;
    public double dFld=0.100908;
    public static short sFld=-30219;
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 50.110F);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static double dMeth(float f) {

        int i4=1, i5=252, i6=19, i7=204, i8=-1, i9=6, iArr[][]=new int[N][N];
        boolean b=true;

        FuzzerUtils.init(iArr, 190);

        for (i4 = 5; i4 < 139; ++i4) {
            Test.fFld -= i5;
            i5 = i4;
            Test.instanceCount = i5;
            iArr[i4 + 1][i4 + 1] <<= i4;
            for (i6 = 1; i6 < 12; ++i6) {
                i7 = i7;
                for (i8 = i4; i8 < 2; ++i8) {
                    f = i6;
                    Test.byFld += (byte)(68 + (i8 * i8));
                    if (b) break;
                    switch (((i9 >>> 1) % 5) + 72) {
                    case 72:
                    case 73:
                        if (i5 != 0) {
                        }
                        break;
                    case 74:
                        i7 = -121;
                        if (i7 != 0) {
                        }
                        break;
                    case 75:
                        i9 += (((i8 * i9) + Test.instanceCount) - Test.instanceCount);
                    case 76:
                        Test.instanceCount = -13;
                        break;
                    default:
                        Test.fFld *= Test.byFld;
                    }
                }
            }
        }
        long meth_res = Float.floatToIntBits(f) + i4 + i5 + i6 + i7 + i8 + i9 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public int iMeth1(int i3) {

        int i10=97, i11=-75, i12=3, i13=200, i14=-250, i15=25301, iArr1[]=new int[N];
        short s=26845;
        float f1=2.945F;
        boolean b1=false;

        FuzzerUtils.init(iArr1, -5);

        i3 = (int)(((i3 + -7L) - dMeth(0.261F)) + i3);
        for (i10 = 10; i10 < 163; ++i10) {
            for (i12 = 1; i12 < 10; i12++) {
                dFld = i10;
                iArr1[i10] <<= s;
                Test.fFld = i3;
                f1 += (i12 * i12);
                if (i3 != 0) {
                }
                for (i14 = 1; i14 < 2; ++i14) {
                    i13 |= i15;
                    Test.instanceCount >>= i14;
                    f1 += (float)1.38966;
                    b1 = b1;
                }
                s = (short)dFld;
            }
            b1 = true;
        }
        long meth_res = i3 + i10 + i11 + i12 + i13 + s + Float.floatToIntBits(f1) + i14 + i15 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth(int i1, int i2) {


        iMeth1(i1);
        long meth_res = i1 + i2;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=233, i16=-7680, i17=62659, i18=-23172, i19=38203, i20=-33135, i21=-4, i22=53950, i23=-33132, iArr2[]=new
            int[N], iArr3[]=new int[N];
        double d=1.68397, dArr[]=new double[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(dArr, 73.60954);
        FuzzerUtils.init(iArr2, -1);
        FuzzerUtils.init(iArr3, -11);
        FuzzerUtils.init(lArr, 2544325478L);

        i += (int)Test.instanceCount;
        Test.fFld -= (iMeth(i, i) + i);
        d = 1;
        do {
            for (i16 = 3; i16 < 134; ++i16) {
                Test.fArrFld[(int)(d - 1)] *= Test.sFld;
                dArr[i16 - 1] += i;
            }
            i <<= i17;
            i -= (int)Test.instanceCount;
            i17 += i;
            for (i18 = (int)(d); 134 > i18; ++i18) {
                Test.fFld += Test.instanceCount;
                iArr2[i18] += -19498;
                switch ((int)((d % 1) + 38)) {
                case 38:
                }
            }
            Test.instanceCount = i18;
            i17 *= (int)Test.fFld;
            iArr3[(int)(d)] += i18;
        } while (++d < 187);
        for (i20 = 5; i20 < 303; ++i20) {
            i += -25617;
        }
        Test.fFld += 16;
        Test.instanceCount >>= Test.instanceCount;
        for (i22 = 2; i22 < 340; i22++) {
            Test.instanceCount += Test.instanceCount;
            i19 -= 16315;
            lArr = lArr;
            Test.fFld = i22;
            i21 = 38040;
            Test.instanceCount = 9181;
        }
        i /= -13;
        iArr2[(i18 >>> 1) % N] = (int)3399787723L;
        i17 >>= i23;


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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  dMeth ->  dMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}