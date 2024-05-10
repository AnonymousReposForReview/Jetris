package tests.javafuzzer243;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 00:54:43 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-231L;
    public static int iFld=5;
    public static double dFld=69.61651;
    public static volatile short sFld=-24763;
    public static volatile byte byFld=76;
    public static boolean bFld=true;
    public volatile int iFld1=12;
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 0.120057);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(boolean b) {

        int i2=10, i3=-185, i4=7, i5=14, i6=-63756, i7=-4, i8=10, i9=1189, iArr[]=new int[N];
        float f1=-1.381F;
        byte byArr[]=new byte[N];
        long lArr[]=new long[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(byArr, (byte)68);
        FuzzerUtils.init(lArr, 48348L);
        FuzzerUtils.init(iArr, 61082);
        FuzzerUtils.init(dArr, -22.103776);

        Test.iFld += (int)Test.instanceCount;
        Test.iFld = Test.iFld;
        for (i2 = 2; i2 < 176; ++i2) {
            byte by=93;
            i3 += (i2 - f1);
            switch ((i2 % 8) + 28) {
            case 28:
                i3 = -248;
                switch (((i2 % 7) * 5) + 6) {
                case 38:
                    for (i4 = 1; i4 < 9; i4++) {
                        for (i6 = 1; i6 < 2; i6++) {
                            i7 += (-3 + (i6 * i6));
                            i7 = (int)Test.instanceCount;
                            i7 += (int)(-2L + (i6 * i6));
                            Test.instanceCount <<= i4;
                            f1 -= i3;
                            b = b;
                        }
                    }
                    break;
                case 30:
                    by = (byte)1.130247;
                case 18:
                    byArr[i2 + 1] = (byte)i6;
                    break;
                case 41:
                    Test.dFld -= Test.instanceCount;
                    break;
                case 34:
                    if (i8 != 0) {
                    }
                    break;
                case 13:
                    lArr = lArr;
                    break;
                case 24:
                    iArr[i2 - 1] = i6;
                    break;
                }
                break;
            case 29:
                by = (byte)i7;
                break;
            case 30:
                i5 += i8;
            case 31:
                i7 += (i2 * i2);
                break;
            case 32:
                Test.instanceCount += (((i2 * i9) + Test.instanceCount) - i5);
                break;
            case 33:
                Test.iFld = i2;
                break;
            case 34:
                Test.instanceCount += 0;
                break;
            case 35:
                byArr[(i6 >>> 1) % N] = (byte)Test.dFld;
                break;
            }
        }
        long meth_res = (b ? 1 : 0) + i2 + i3 + Float.floatToIntBits(f1) + i4 + i5 + i6 + i7 + i8 + i9 +
            FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i, int i1) {

        float f=109.285F;
        boolean b1=true;
        int i11=-43541, i12=42986, i13=122, i14=43044, i15=-60, i16=-23469, iArr1[]=new int[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-1234);
        FuzzerUtils.init(iArr1, -2);

        Test.instanceCount = (long)f;
        Test.instanceCount += (long)((i - 2842244135746082373L) - ((-iMeth(b1)) - 0.802F));
        f -= Test.iFld;
        for (i11 = 9; i11 < 237; i11++) {
            switch ((i11 % 4) + 3) {
            case 3:
                f += i11;
                if (b1) continue;
                f -= i;
            case 4:
            case 5:
                sArr[i11 + 1] >>>= (short)Test.instanceCount;
                i += (((i11 * i) + f) - i1);
                for (i13 = 1; i13 < 7; ++i13) {
                    for (i15 = 1; i15 < 2; i15++) {
                        f *= Test.instanceCount;
                        try {
                            Test.iFld = (-113 / i15);
                            i16 = (-1011 % iArr1[i11 - 1]);
                            i1 = (i1 % 250);
                        } catch (ArithmeticException a_e) {}
                        Test.sFld += (short)i16;
                    }
                }
                break;
            case 6:
                i12 = i;
            }
        }
        vMeth_check_sum += i + i1 + Float.floatToIntBits(f) + (b1 ? 1 : 0) + i11 + i12 + i13 + i14 + i15 + i16 +
            FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vSmallMeth() {

        float f2=0.96F;

        vMeth(Test.iFld, 42596);
        f2 = Test.iFld;
        vSmallMeth_check_sum += Float.floatToIntBits(f2);
    }

    public void mainTest(String[] strArr1) {

        int i17=-12, i18=-5, i19=-103, i20=-13, i21=18, i22=211, i23=44, iArr2[]=new int[N];
        float f3=-34.560F;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr2, -57150);
        FuzzerUtils.init(lArr1, 5728695444084352140L);

        for (int smallinvoc=0; smallinvoc<364; smallinvoc++) vSmallMeth();
        switch (((Test.iFld >>> 1) % 1) + 53) {
        case 53:
            for (i17 = 12; i17 < 193; ++i17) {
                i18 = Test.iFld;
                i19 = 139;
                while ((i19 -= 3) > 0) {
                    i18 -= i17;
                    Test.instanceCount += (i19 * i17);
                    Test.byFld -= (byte)i19;
                    iArr2 = iArr2;
                    f3 = i18;
                    switch (((i17 % 10) * 5) + 7) {
                    case 28:
                        f3 = Test.instanceCount;
                        if (Test.bFld) continue;
                        break;
                    case 33:
                        lArr1[i17 + 1] *= i19;
                        Test.sFld |= (short)Test.iFld;
                        for (i20 = i19; i20 < 3; i20 += 3) {
                            Test.iFld -= (int)Test.instanceCount;
                            iArr2[i20 - 1] += i21;
                            i21 += i19;
                            i18 -= (int)Test.dFld;
                            Test.iFld += i19;
                            Test.instanceCount *= 14;
                            iFld1 = (int)-5L;
                            iArr2[i19] = (int)f3;
                            Test.iFld *= i17;
                            iFld1 += (int)f3;
                        }
                        i21 -= iFld1;
                        break;
                    case 30:
                        for (i22 = 1; 3 > i22; ++i22) {
                            Test.instanceCount += i22;
                            iFld1 = (int)10L;
                        }
                        break;
                    case 21:
                        i21 = i22;
                        break;
                    case 37:
                        Test.dFld = Test.instanceCount;
                    case 53:
                        Test.instanceCount += i19;
                        break;
                    case 42:
                        i18 = i17;
                        break;
                    case 16:
                        i18 += (-642 + (i19 * i19));
                        break;
                    case 57:
                        lArr1[i17 + 1] -= 14720;
                        break;
                    case 14:
                        iFld1 -= iFld1;
                    default:
                        i18 = (int)Test.instanceCount;
                    }
                }
            }
            break;
        default:
            iArr2[(10 >>> 1) % N] -= Test.sFld;
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  iMeth ->  iMeth vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}