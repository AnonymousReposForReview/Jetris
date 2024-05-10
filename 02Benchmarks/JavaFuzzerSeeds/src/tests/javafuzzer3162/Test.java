package tests.javafuzzer3162;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 03:07:33 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-3799071317067337950L;
    public int iFld=4;
    public static byte byFld=88;
    public static short sFld=-28698;
    public static volatile float fFld=-1.945F;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 4131039106L);
    }

    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i8=-166, i9=145, i10=-215, i11=-8, i12=127, i13=11, iArr2[]=new int[N];
        boolean b=false;
        long l=1814385791L;
        double d1=2.55004;

        FuzzerUtils.init(iArr2, -14);

        i8 = 1;
        while (++i8 < 130) {
            i9 *= (int)9077309123132087730L;
            i9 *= Test.byFld;
            for (i10 = 1; i10 < 12; ++i10) {
                float f2=-2.245F;
                if (b) {
                    iArr2 = FuzzerUtils.int1array(N, (int)55638);
                }
                i9 += (((i10 * i8) + f2) - i8);
                if (b) break;
                i9 = i9;
                for (i12 = 1; 2 > i12; ++i12) {
                    i13 = i9;
                    Test.byFld >>= (byte)i9;
                    i11 = -146;
                    l = i13;
                    d1 = f2;
                }
            }
        }
        long meth_res = i8 + i9 + i10 + i11 + (b ? 1 : 0) + i12 + i13 + l + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(float f1) {

        int i4=-2, i5=-14519, i6=-152, i7=-1, iArr1[]=new int[N];
        double d=-62.2734;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr1, 123);
        FuzzerUtils.init(lArr, 4L);

        for (i4 = 12; 233 > i4; i4 += 3) {
            for (i6 = i4; i6 < 21; ++i6) {
                if (true) {
                    iArr1[i6] += i4;
                    i5 = (int)(Test.byFld - ((Test.byFld + Test.instanceCount) - (++i7)));
                } else {
                    i5 += (i5--);
                    d -= (--i5);
                    vMeth_check_sum += Float.floatToIntBits(f1) + i4 + i5 + i6 + i7 + Double.doubleToLongBits(d) +
                        FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
                    return;
                }
                i7 = (int)((Test.instanceCount--) - lArr[i4]);
                f1 += (((i6 * Test.byFld) + i7) - i7);
                i7 += (int)((++i7) - (iMeth() + Test.instanceCount));
                i5 += (((i6 * f1) + Test.instanceCount) - i7);
                i7 = i4;
                i7 &= (int)Test.instanceCount;
                Test.byFld += (byte)(((i6 * i7) + Test.sFld) - Test.instanceCount);
            }
            i7 += (i4 | Test.sFld);
        }
        vMeth_check_sum += Float.floatToIntBits(f1) + i4 + i5 + i6 + i7 + Double.doubleToLongBits(d) +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
    }

    public static double dMeth(int i, int i1) {

        int i2=-2, i3=8, iArr3[]=new int[N];
        double d2=2.76821;
        float f3=-2.843F;
        boolean b1=false;

        FuzzerUtils.init(iArr3, -10);

        i += i1;
        for (i2 = 7; 255 > i2; ++i2) {
            vMeth(-1.480F);
            iArr3[i2] -= -15941;
            d2 *= i;
            i3 += i2;
            f3 += i2;
            f3 -= Test.instanceCount;
            iArr3[i2 - 1] *= i3;
        }
        i3 -= (int)Test.instanceCount;
        i3 -= (int)Test.instanceCount;
        b1 = b1;
        Test.lArrFld = Test.lArrFld;
        Test.lArrFld[(i3 >>> 1) % N] = (long)f3;
        Test.instanceCount &= i3;
        long meth_res = i + i1 + i2 + i3 + Double.doubleToLongBits(d2) + Float.floatToIntBits(f3) + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr3);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i14=-14, i15=45052, i16=13, i17=-37621, i18=12, i19=9167, i20=37359, iArr[]=new int[N];
        double d3=-114.45402;
        boolean b3=false;
        float fArr[]=new float[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr, -247);
        FuzzerUtils.init(fArr, -2.409F);
        FuzzerUtils.init(sArr, (short)28688);

        iFld = (int)(iArr[(iFld >>> 1) % N] += (int)((++iFld) * (Test.instanceCount - iFld)));
        Test.instanceCount = -52;
        for (float f : fArr) {
            fArr[(iFld >>> 1) % N] += (float)dMeth(iFld, iFld);
            iFld >>= 4;
            if (true) break;
        }
        sArr[(iFld >>> 1) % N] *= (short)iFld;
        for (i14 = 9; i14 < 200; ++i14) {
            Test.fFld += ((long)i14 ^ (long)i15);
            Test.instanceCount = iFld;
            i15 >>>= (int)Test.instanceCount;
            i15 = (int)Test.instanceCount;
        }
        iFld -= i14;
        i15 += i14;
        i15 += i15;
        for (i16 = 168; 6 < i16; --i16) {
            iArr[i16 - 1] = -13;
            if (b3) {
                Test.instanceCount -= (long)d3;
                iArr[i16 + 1] <<= i17;
                iFld += (i16 - i17);
            } else if (b3) {
                i18 = 1;
                while (++i18 < 155) {
                    iArr[i18] >>= i14;
                    Test.instanceCount -= i18;
                    i17 &= i14;
                    for (i19 = 1; i19 < 1; i19++) {
                        boolean b2=true;
                        i17 = (int)Test.fFld;
                        Test.fFld -= Test.instanceCount;
                        if (b2) break;
                        iFld >>>= -123;
                    }
                }
            } else {
                Test.sFld = (short)-20533;
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
//DEBUG  vMeth ->  vMeth dMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
