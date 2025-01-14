package tests.javafuzzer919;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 11:32:03 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=47553L;
    public static short sFld=-17882;
    public static int iFld=-4497;
    public static double dFld=1.25660;
    public static byte byFld=78;
    public static float fFld=-2.892F;
    public double dArrFld[]=new double[N];
    public long lArrFld[]=new long[N];
    public static short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)6569);
    }

    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long fMeth1_check_sum = 0;

    public float fMeth1() {

        float f=118.145F;
        int i3=-12, i4=3, iArr[][]=new int[N][N];

        FuzzerUtils.init(iArr, 68);

        Test.sFld = (short)Test.iFld;
        f = 1;
        do {
            Test.dFld = Test.iFld;
        } while (++f < 225);
        i3 = 1;
        while (++i3 < 313) {
            if (Test.iFld != 0) {
            }
            iArr[i3][i3 + 1] += i3;
            Test.instanceCount = Test.instanceCount;
            Test.iFld += (((i3 * i3) + i3) - Test.byFld);
            Test.iFld = (int)Test.instanceCount;
            iArr[i3][i3 + 1] |= i3;
            Test.iFld += i3;
            Test.instanceCount += (long)-94.64324;
        }
        i4 = 1;
        do {
            Test.instanceCount += (i4 | Test.instanceCount);
            Test.iFld *= i4;
        } while (++i4 < 245);
        long meth_res = Float.floatToIntBits(f) + i3 + i4 + FuzzerUtils.checkSum(iArr);
        fMeth1_check_sum += meth_res;
        return (float)meth_res;
    }

    public float fMeth(int i2) {

        int i5=-209, i6=-174, i7=34114, i8=124, i9=1, i10=-36086, iArr1[]=new int[N];
        float f1=110.121F;

        FuzzerUtils.init(iArr1, -230);

        fMeth1();
        for (i5 = 14; i5 < 337; ++i5) {
            iArr1[i5 + 1] -= i6;
            f1 /= (i5 | 1);
            iArr1[i5 + 1] = i7;
            i6 >>= (int)Test.instanceCount;
            i8 = 1;
            while (++i8 < 5) {
                f1 += Test.instanceCount;
                i6 += (int)Test.instanceCount;
                dArrFld[i8] = i6;
                for (i9 = 1; i9 > 1; i9 -= 2) {
                    i7 = i10;
                    i6 = (int)f1;
                }
                Test.instanceCount += i8;
                Test.instanceCount = (long)Test.dFld;
            }
        }
        long meth_res = i2 + i5 + i6 + Float.floatToIntBits(f1) + i7 + i8 + i9 + i10 + FuzzerUtils.checkSum(iArr1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void vMeth(long l) {

        int i=157, i1=-16906, i11=-5, i12=2, i13=-143, i14=-9, iArr2[]=new int[N];
        long l1=0L, lArr[]=new long[N];
        boolean b=false;

        FuzzerUtils.init(iArr2, -3);
        FuzzerUtils.init(lArr, -192L);

        for (i = 18; i < 355; i++) {
            if (b) {
                i1 = (int)((l1--) * fMeth(Test.iFld));
                if (b) {
                    for (i11 = 5; i11 > 1; i11--) {
                        for (i13 = 1; i13 < 2; i13++) {
                            if (false) break;
                            Test.byFld = (byte)l1;
                            iArr2[i + 1] -= i11;
                            iArr2[i11 + 1] <<= Test.iFld;
                            switch ((i11 % 10) + 31) {
                            case 31:
                                iArr2[i13 + 1] = 7;
                                lArr[i13] = i;
                                l1 *= Test.iFld;
                                break;
                            case 32:
                                Test.instanceCount >>>= Test.sFld;
                                break;
                            case 33:
                                l1 += i12;
                                break;
                            case 34:
                                i12 = 156;
                            case 35:
                                i1 = i13;
                                break;
                            case 36:
                                Test.instanceCount >>= Test.iFld;
                                break;
                            case 37:
                                i1 -= (int)Test.fFld;
                                break;
                            case 38:
                                dArrFld[i - 1] *= l;
                                break;
                            case 39:
                                Test.fFld = l1;
                                break;
                            case 40:
                                i14 = i14;
                            }
                        }
                    }
                } else if (b) {
                    Test.instanceCount += l1;
                } else {
                    Test.instanceCount = Test.instanceCount;
                }
            } else if (b) {
                Test.iFld -= i14;
            } else {
                l >>= 23933L;
            }
        }
        vMeth_check_sum += l + i + i1 + l1 + i11 + i12 + i13 + i14 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr2) +
            FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i15=27063, i16=30243, i17=52206, i18=-10, i19=44740, i20=-13, i21=-24308, iArr3[]=new int[N];
        boolean b1=false;
        byte by=6, byArr[]=new byte[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(byArr, (byte)-29);
        FuzzerUtils.init(iArr3, 181);
        FuzzerUtils.init(fArr, 0.76F);

        vMeth(-11L);
        Test.iFld *= Test.iFld;
        Test.sFld = Test.byFld;
        for (i15 = 7; i15 < 138; i15 += 3) {
            Test.iFld *= (int)-39.9909;
            if (b1) break;
            lArrFld[i15] -= (long)Test.fFld;
            by <<= (byte)6L;
            switch ((i15 % 2) + 32) {
            case 32:
                byArr[i15 - 1] += (byte)i16;
                Test.iFld += (((i15 * i15) + i16) - Test.sFld);
            case 33:
                Test.iFld >>>= i16;
                i17 = 1;
                while (++i17 < 395) {
                    iArr3[i17 + 1] += (int)Test.instanceCount;
                    iArr3[i17] >>= (int)Test.instanceCount;
                    for (i18 = 1; 2 > i18; i18++) {
                        iArr3[i15 - 1] -= i17;
                        Test.sArrFld[i17 + 1] = (short)i16;
                        b1 = b1;
                    }
                    fArr[i17 + 1] += Test.iFld;
                    Test.fFld = Test.fFld;
                    i16 = -19860;
                    Test.instanceCount -= i18;
                    iArr3[i15 + 1] = (int)Test.instanceCount;
                    Test.instanceCount += i17;
                    for (i20 = 1; 2 > i20; i20 += 2) {
                        Test.sFld += (short)(i20 - Test.iFld);
                        Test.instanceCount *= i21;
                        Test.instanceCount >>= Test.sFld;
                    }
                }
                i19 -= Test.iFld;
                break;
            default:
                i16 += by;
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
//DEBUG  fMeth ->  fMeth vMeth mainTest
//DEBUG  fMeth1 ->  fMeth1 fMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
