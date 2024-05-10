package tests.javafuzzer3327;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 06:16:14 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1605608840L;
    public static int iFld=-54237;
    public static double dFld=126.120711;
    public static byte byFld=-127;
    public short sFld=14509;
    public float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 169);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;

    public static boolean bMeth() {

        long l=-6L, l1=19056L;
        int i8=11, i9=-247;
        float f2=0.847F;

        for (l = 4; l < 154; ++l) {
            Test.instanceCount += (long)Test.dFld;
        }
        i9 = 1;
        while (++i9 < 272) {
            i8 *= Test.iFld;
            Test.iFld += (((i9 * Test.instanceCount) + Test.byFld) - Test.iFld);
            Test.iFld *= i8;
            Test.iFld += Test.iFld;
            i8 -= Test.iFld;
            i8 = (int)l;
            l1 = 1;
            while (++l1 < 6) {
                Test.iFld <<= i8;
                i8 <<= Test.iFld;
                i8 += (int)l1;
                Test.dFld = f2;
                Test.instanceCount += i8;
            }
        }
        long meth_res = l + i8 + i9 + l1 + Float.floatToIntBits(f2);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static void vMeth(int i2, int i3, float f1) {

        int i4=-1, i5=-11, i6=-127, i7=4461, iArr[]=new int[N];
        boolean b=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 4547310486686161411L);
        FuzzerUtils.init(iArr, 26740);

        i4 = 1;
        while (++i4 < 194) {
            if (b) {
                switch (((i4 % 10) * 5) + 12) {
                case 27:
                    i3 = (int)Test.instanceCount;
                    lArr[i4 + 1] = (--Test.instanceCount);
                    i5 = 8;
                    do {
                        for (i6 = i4; 1 > i6; ++i6) {
                            Test.iFld += (((i6 * Test.instanceCount) + i6) - i7);
                            f1 += (((Test.instanceCount = (long)f1) - (26253 * (i7 += i2))) - i3);
                            iArr[i5 - 1] = (int)(Test.instanceCount--);
                            Test.instanceCount *= ((Math.min(75, i2) << (long)(Test.dFld - 137)) - ((i3 + 3) -
                                (Test.iFld + Test.instanceCount)));
                            if (bMeth()) continue;
                            iArr[i5] = (int)Test.instanceCount;
                            Test.instanceCount *= Test.instanceCount;
                            if (i7 != 0) {
                                vMeth_check_sum += i2 + i3 + Float.floatToIntBits(f1) + i4 + i5 + i6 + i7 + (b ? 1 : 0)
                                    + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
                                return;
                            }
                        }
                    } while (--i5 > 0);
                case 16:
                    Test.iFld += -51027;
                    break;
                case 22:
                    Test.dFld = Test.iFld;
                    break;
                case 29:
                    i7 -= i3;
                    break;
                case 50:
                    lArr[i4 - 1] -= i6;
                case 53:
                    Test.byFld += (byte)(-13 + (i4 * i4));
                    break;
                case 49:
                    Test.instanceCount -= (long)f1;
                    break;
                case 56:
                    f1 += i4;
                    break;
                case 51:
                    Test.iFld = i6;
                case 57:
                    Test.instanceCount >>= i3;
                default:
                    b = b;
                }
            } else if (b) {
                lArr[i4 + 1] -= (long)f1;
            }
        }
        vMeth_check_sum += i2 + i3 + Float.floatToIntBits(f1) + i4 + i5 + i6 + i7 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth() {

        float f=2.616F;
        short s=-10706;
        byte by=54;
        int i10=12, i11=1, i12=14, i13=10829, i14=49806, i15=10;
        boolean b1=false;

        Test.iFld = (int)(f--);
        vMeth(Test.iFld, Test.iFld, f);
        s = by;
        for (i10 = 11; i10 < 347; ++i10) {
            for (i12 = 1; i12 < 5; ++i12) {
                Test.instanceCount += (-6 + (i12 * i12));
                i13 = i12;
                Test.instanceCount += Test.iFld;
                for (i14 = 1; i14 < 2; i14++) {
                    int i16=39;
                    i16 += (11678 + (i14 * i14));
                    if (b1) continue;
                    Test.instanceCount = 2895586671L;
                    Test.iFld -= Test.byFld;
                    i11 <<= i11;
                }
                i15 += (int)(0.843F + (i12 * i12));
            }
        }
        long meth_res = Float.floatToIntBits(f) + s + by + i10 + i11 + i12 + i13 + i14 + i15 + (b1 ? 1 : 0);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=5, i1=65106, i17=-61, i18=-26789, i19=4, i20=29, i21=-202, i22=12, i23=10, i24=11, i25=-21784;
        float f3=13.296F;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-22);

        i += -54625;
        i1 = 1;
        while (++i1 < 237) {
            iMeth();
        }
        Test.dFld /= 3;
        Test.iFld |= i;
        i17 = 1;
        while (++i17 < 256) {
            Test.iFld >>= i1;
            for (i18 = 4; 98 > i18; i18++) {
                f3 += i1;
            }
            f3 += i19;
            for (i20 = i17; i20 < 98; i20++) {
                fArrFld[i20] = i;
                switch ((i17 % 1) + 109) {
                case 109:
                    Test.instanceCount &= -1700713494038602214L;
                default:
                    Test.iArrFld[i17 + 1] = 11;
                    i19 = -25428;
                    Test.instanceCount += i17;
                    f3 += (((i20 * i19) + Test.iFld) - f3);
                }
                i19 >>>= i;
            }
            for (i22 = 2; i22 < 98; ++i22) {
                byArr[i22 + 1] -= (byte)i17;
                i23 -= i22;
            }
            i -= i18;
            Test.instanceCount -= Test.byFld;
            f3 -= i18;
            for (i24 = 5; i24 < 98; i24++) {
                Test.instanceCount += i25;
                i21 += i21;
                Test.iArrFld[i17 - 1] = sFld;
                i19 += (int)f3;
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
//DEBUG  bMeth ->  bMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
