package tests.javafuzzer2133;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 09:20:27 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3174855082994711833L;
    public static int iFld=-2;
    public static boolean bFld=true;
    public static float fFld=-2.935F;
    public static short sFld=6924;
    public static double dFld=1.22731;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 3091172939L);
        FuzzerUtils.init(Test.iArrFld, -223);
    }

    public static long iMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth() {

        float f2=2.554F;
        int i=-7, i1=-40037, i2=-44091, i3=153, iArr[]=new int[N];
        double d=-1.19957;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)22737);
        FuzzerUtils.init(iArr, 162);

        Test.iFld *= Test.iFld;
        if (false) {
            for (f2 = 2; f2 < 339; f2++) {
                sArr[(int)(f2)] ^= (short)Test.iFld;
                switch ((((Test.iFld >>> 1) % 3) * 5) + 112) {
                case 125:
                    Test.instanceCount <<= i;
                    switch ((((i >>> 1) % 3) * 5) + 11) {
                    case 19:
                        for (i1 = 5; 1 < i1; i1--) {
                            i2 = -217;
                            Test.instanceCount += (((i1 * i1) + Test.instanceCount) - i2);
                            switch ((((i1 >>> 1) % 3) * 5) + 26) {
                            case 32:
                            case 34:
                                Test.bFld = Test.bFld;
                            case 41:
                                Test.lArrFld[(int)(f2 - 1)] -= (long)d;
                                iArr[(int)(f2 - 1)] <<= i1;
                                break;
                            }
                            Test.fFld = i;
                        }
                        break;
                    case 13:
                        Test.fFld = Test.iFld;
                        break;
                    case 20:
                        i3 += (int)Test.instanceCount;
                    }
                    break;
                case 118:
                    Test.iFld += (int)Test.instanceCount;
                    break;
                case 119:
                    Test.iFld -= (int)Test.instanceCount;
                    break;
                default:
                    i = i1;
                }
            }
        } else if (Test.bFld) {
            d -= -80;
        } else {
            iArr[(Test.iFld >>> 1) % N] += i2;
        }
        long meth_res = Float.floatToIntBits(f2) + i + i1 + i2 + Double.doubleToLongBits(d) + i3 +
            FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static double dMeth() {

        float f1=75.349F, f3=98.339F;
        int i4=-237, i5=71, i6=8439, i7=-1675, i8=-203, i9=3, i10=-159, iArr1[]=new int[N];
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, 15859L);
        FuzzerUtils.init(iArr1, 27017);

        f1 = ((lArr[(Test.iFld >>> 1) % N][(Test.iFld >>> 1) % N]++) - lMeth());
        for (f3 = 8; f3 < 383; ++f3) {
            if (i4 != 0) {
            }
        }
        for (i5 = 9; 157 > i5; i5++) {
            Test.instanceCount |= Test.instanceCount;
            for (i7 = 1; i7 < 11; ++i7) {
                Test.instanceCount = Test.sFld;
                Test.fFld *= Test.instanceCount;
                iArr1[i7 - 1] = (int)Test.fFld;
                switch ((i5 % 1) + 20) {
                case 20:
                    lArr[i5][i7] -= i4;
                    for (i9 = 1; i9 < 2; i9++) {
                        i8 &= i9;
                        i6 += Test.iFld;
                        Test.instanceCount = i4;
                    }
                }
            }
        }
        long meth_res = Float.floatToIntBits(f1) + Float.floatToIntBits(f3) + i4 + i5 + i6 + i7 + i8 + i9 + i10 +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static int iMeth(float f, long l) {

        float f4=-2.361F;
        int i11=-1856, i12=-7, i13=57361, i14=12, i15=60952, i16=-21171;

        f += (float)((dMeth() - Test.iFld) / ((long)(f4) | 1));
        Test.iFld += -252;
        Test.iFld >>= Test.iFld;
        for (i11 = 3; i11 < 219; i11++) {
            for (i13 = 1; i13 < 7; ++i13) {
                Test.iArrFld[(Test.iFld >>> 1) % N] <<= -6;
                Test.bFld = Test.bFld;
                Test.dFld = 0.41437;
                Test.lArrFld[i11 + 1] *= i14;
                Test.instanceCount |= Test.sFld;
                Test.iFld = (int)Test.dFld;
                for (i15 = 1; i15 < 2; i15++) {
                    Test.iFld = (int)Test.instanceCount;
                    Test.iArrFld[i13 - 1] = i15;
                    i14 = i16;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f) + l + Float.floatToIntBits(f4) + i11 + i12 + i13 + i14 + i15 + i16;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        long l1=-14746L;
        int i17=215, i18=64169, i19=-8, i20=16, i21=7, i22=-75, i23=-4, i24=-151;

        iMeth(Test.fFld, Test.instanceCount);
        l1 = (long)2.736F;
        Test.iFld *= Test.iFld;
        i17 -= Test.iFld;
        for (i18 = 2; 292 > i18; ++i18) {
            float f5=31.280F;
            i19 = i19;
            Test.iFld += (int)Test.instanceCount;
            switch ((i18 % 1) + 65) {
            case 65:
                Test.sFld = (short)Test.instanceCount;
                for (i20 = 2; i20 < 87; i20++) {
                    Test.lArrFld[i20 + 1] = Test.sFld;
                    Test.iArrFld[i20 - 1] *= (int)Test.fFld;
                    i17 = (int)Test.instanceCount;
                    i21 >>= 225;
                    Test.dFld /= (Test.iFld | 1);
                    Test.fFld += (-38.401F + (i20 * i20));
                    Test.iArrFld = Test.iArrFld;
                    for (i22 = 1; 2 > i22; ++i22) {
                        i17 += i20;
                        Test.iFld += i22;
                    }
                }
                break;
            }
            Test.dFld -= i22;
            Test.fFld = i23;
            Test.fFld += (i18 + Test.sFld);
            if (Test.bFld) {
                if (Test.bFld) break;
                i21 = i19;
            } else if (Test.bFld) {
                if (Test.bFld) {
                    i17 >>= 112;
                    i21 *= (int)-177115058L;
                } else if (Test.bFld) {
                    f5 -= i21;
                } else {
                    Test.dFld *= i24;
                }
            } else {
                i24 <<= (int)l1;
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
//DEBUG  dMeth ->  dMeth iMeth mainTest
//DEBUG  lMeth ->  lMeth dMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
