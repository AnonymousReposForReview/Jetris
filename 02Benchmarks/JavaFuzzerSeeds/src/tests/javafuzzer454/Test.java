package tests.javafuzzer454;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 04:05:56 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-605863328L;
    public static double dFld=0.119139;
    public static int iFld=-1290;
    public static short sFld=-29094;
    public static float fFld=1.158F;
    public byte byFld=-54;
    public static int iArrFld[]=new int[N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 9);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vSmallMeth(int i) {

        short s=-22987;

        i >>= (int)(i + ((Test.dFld + i) + (Test.instanceCount + s)));
        vSmallMeth_check_sum += i + s;
    }

    public static void vMeth1() {

        boolean b=false;
        int i3=0, i4=-7, i5=-173, i6=63920, i7=1758, i8=214, iArr[]=new int[N];
        float f1=0.759F;
        byte by=38;

        FuzzerUtils.init(iArr, 9);

        b = b;
        Test.instanceCount &= Test.iFld;
        Test.iFld = 14;
        for (i3 = 20; i3 < 396; i3++) {
            i4 += -45;
            Test.dFld += Test.instanceCount;
            f1 += (((i3 * i3) + i4) - i3);
            if (i4 != 0) {
                vMeth1_check_sum += (b ? 1 : 0) + i3 + i4 + Float.floatToIntBits(f1) + i5 + i6 + by + i7 + i8 +
                    FuzzerUtils.checkSum(iArr);
                return;
            }
            for (i5 = 1; i5 < 4; i5++) {
                Test.iFld = by;
            }
            iArr[i3] <<= i4;
            iArr[i3 - 1] |= Test.iFld;
            for (i7 = 1; 4 > i7; ++i7) {
                i8 >>>= i5;
                i8 += (((i7 * i7) + Test.instanceCount) - i6);
            }
        }
        vMeth1_check_sum += (b ? 1 : 0) + i3 + i4 + Float.floatToIntBits(f1) + i5 + i6 + by + i7 + i8 +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i1, int i2, float f) {

        int i9=-26889, i10=-11, i11=1, i12=-93, iArr1[][]=new int[N][N];
        boolean b1=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 218L);
        FuzzerUtils.init(iArr1, -4373);

        vMeth1();
        Test.iFld *= (int)Test.instanceCount;
        for (i9 = 16; i9 < 262; i9++) {
            i10 *= Test.iFld;
            f -= Test.instanceCount;
            i1 += (int)Test.dFld;
            switch (((11 >>> 1) % 9) + 113) {
            case 113:
                lArr[i9] <<= Test.iFld;
                for (i11 = 1; 7 > i11; i11++) {
                    iArr1[(i10 >>> 1) % N][i9 - 1] <<= (int)Test.instanceCount;
                    Test.dFld = -10;
                    if (b1) break;
                    Test.dFld += Test.instanceCount;
                    Test.instanceCount += (i11 + Test.sFld);
                }
                i2 += Test.iFld;
                break;
            case 114:
                i10 -= 6042;
                break;
            case 115:
                Test.instanceCount += (i9 + i1);
                break;
            case 116:
                i12 = (int)Test.instanceCount;
            case 117:
                Test.instanceCount += (i9 * i9);
            case 118:
                Test.sFld |= (short)26559L;
                break;
            case 119:
                lArr[i9 - 1] >>= Test.sFld;
            case 120:
                Test.dFld -= Test.instanceCount;
                break;
            case 121:
                i1 += (((i9 * Test.sFld) + i1) - i9);
                break;
            }
        }
        vMeth_check_sum += i1 + i2 + Float.floatToIntBits(f) + i9 + i10 + i11 + i12 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth() {

        float f2=99.444F;
        int i13=55516, i14=4, i15=-43;
        byte by1=-8;
        boolean b2=false;
        long lArr1[][]=new long[N][N];

        FuzzerUtils.init(lArr1, 1508514112752665156L);

        vMeth(Test.iFld, Test.iFld, Test.fFld);
        for (f2 = 6; f2 < 121; ++f2) {
            Test.iFld >>>= Test.iFld;
            for (i14 = (int)(f2); i14 < 14; i14++) {
                Test.sFld = (short)48606;
                Test.iFld *= i15;
                if (b2) {
                    by1 += (byte)Test.iFld;
                    Test.fFld += i14;
                    lArr1[i14 + 1][i14 + 1] = 33410;
                } else if (false) {
                    Test.fFld -= i14;
                } else if (false) {
                    Test.iArrFld[i14 + 1] = (int)Test.instanceCount;
                    Test.iArrFld[i14] >>= Test.iFld;
                } else {
                    if (b2) continue;
                    i15 *= (int)-2.57915;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f2) + i13 + i14 + i15 + by1 + (b2 ? 1 : 0) + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i16=53, i17=12, i18=-46781, i19=-8, i20=-9, i21=-243, i22=12, i23=4, i24=-7562, i25=59511;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -2.16820);

        for (int smallinvoc=0; smallinvoc<228; smallinvoc++) vSmallMeth(Integer.reverseBytes(Test.iFld + iMeth()));
        Test.sFld >>= byFld;
        Test.fFld *= Test.iFld;
        i16 = 1;
        while (++i16 < 364) {
            Test.dFld = Test.instanceCount;
            for (i17 = 2; i17 < 69; ++i17) {
                int i26=-1;
                Test.iFld -= i18;
                for (i19 = 1; i19 < 2; i19++) {
                    i18 += (i19 + Test.instanceCount);
                }
                switch (((i20 >>> 1) % 4) + 44) {
                case 44:
                    switch ((i16 % 9) + 7) {
                    case 7:
                        byFld += (byte)57143;
                        break;
                    case 8:
                        i20 = (int)Test.instanceCount;
                        for (i21 = i16; i21 < 2; ++i21) {
                            byFld *= (byte)Test.dFld;
                        }
                    case 9:
                        Test.fFld -= i20;
                        Test.fFld += (i17 * i17);
                        Test.fFld *= -28;
                    case 10:
                        Test.iArrFld[i17 + 1] = (int)Test.fFld;
                        Test.iFld -= (int)Test.instanceCount;
                        i23 = 1;
                        while (++i23 < 2) {
                            Test.instanceCount += (((i23 * Test.iFld) + i17) - Test.iFld);
                            Test.iFld += Test.iFld;
                            i22 = i22;
                            i18 += (((i23 * i21) + i19) - i19);
                        }
                        break;
                    case 11:
                        switch (((i16 % 3) * 5) + 113) {
                        case 124:
                            for (i24 = 2; i24 > 1; i24--) {
                                Test.iFld = (int)-8L;
                                Test.fFld += i24;
                                i22 <<= Test.iFld;
                            }
                        case 126:
                            Test.iArrFld[i16] |= (int)58757L;
                        case 115:
                            lArrFld[i17] *= -55169;
                            break;
                        default:
                            i25 |= -14;
                        }
                        break;
                    case 12:
                        Test.iArrFld[i17 - 1] = i16;
                        break;
                    case 13:
                        try {
                            i18 = (i23 % -61411);
                            Test.iFld = (-42925 % i26);
                            i20 = (i23 / 151);
                        } catch (ArithmeticException a_e) {}
                    case 14:
                        i26 /= (int)(i16 | 1);
                        break;
                    case 15:
                        lArrFld[i16 + 1] = i19;
                        break;
                    default:
                        i26 += (((i17 * i25) + i23) - i16);
                    }
                    break;
                case 45:
                    Test.instanceCount += i26;
                case 46:
                    dArr[i16] *= i18;
                    break;
                case 47:
                    i20 += (int)Test.instanceCount;
                    break;
                }
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}