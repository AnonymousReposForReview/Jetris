package tests.javafuzzer573;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 06:06:36 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=5542169940021440030L;
    public static short sFld=-19885;
    public static volatile byte byFld=17;
    public int iFld=242;
    public static boolean bFld=true;
    public static float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, -61.861F);
        FuzzerUtils.init(Test.iArrFld, -24964);
    }

    public static long iMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth() {

        float f=-74.593F, f1=84.222F;
        int i3=-47, i4=254, i5=108, i6=-24920, i7=-90, i8=0, iArr1[]=new int[N];
        double d=1.48581;
        boolean b1=true;
        byte by=-108;

        FuzzerUtils.init(iArr1, -31892);

        f += i3;
        for (i4 = 7; i4 < 153; i4++) {
            for (i6 = 1; i6 < 11; ++i6) {
                switch ((i6 % 3) + 23) {
                case 23:
                    Test.sFld += (short)Test.instanceCount;
                    i5 += i6;
                    break;
                case 24:
                    i5 += i6;
                    d -= -11;
                    break;
                case 25:
                    i8 = 1;
                    while (++i8 < 2) {
                        b1 = b1;
                    }
                    d = d;
                    iArr1[i6] = i6;
                    break;
                }
                f1 = 1;
                do {
                    if (b1) break;
                    i7 %= (int)(by | 1);
                } while (++f1 < 2);
            }
        }
        long meth_res = Float.floatToIntBits(f) + i3 + i4 + i5 + i6 + i7 + Double.doubleToLongBits(d) + i8 + (b1 ? 1 :
            0) + Float.floatToIntBits(f1) + by + FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static float fMeth(boolean b, int i1) {

        long l=-3434784807426745746L;
        int i2=213, i9=12372, i10=-34819, i11=-43003, i12=2, iArr[]=new int[N];
        float f2=2.907F;

        FuzzerUtils.init(iArr, 60500);

        iArr[(i1 >>> 1) % N] = (int)(Test.instanceCount++);
        for (l = 21; l < 355; l++) {
            i1 >>= (int)(((Test.sFld + i1) * lMeth()) + i1);
            i9 = 1;
            while (++i9 < 5) {
                Test.byFld -= (byte)4;
                f2 = i1;
            }
            Test.instanceCount = Test.instanceCount;
            switch ((int)(((l % 10) * 5) + 110)) {
            case 153:
                for (i10 = 1; i10 < 5; ++i10) {
                    Test.instanceCount += (((i10 * i9) + i11) - i12);
                }
                i12 += (int)-41957L;
                i1 = i1;
                i2 += (int)l;
                break;
            case 126:
            case 116:
                Test.fArrFld[(int)(l + 1)] += i1;
                Test.instanceCount = 60;
            case 147:
                if (b) continue;
                break;
            case 158:
                i1 = i2;
                break;
            case 159:
                Test.instanceCount *= i1;
                break;
            case 137:
                b = b;
                break;
            case 114:
                i2 = i11;
                break;
            case 141:
                if (b) break;
            case 133:
                Test.instanceCount += (l | i10);
                break;
            default:
                i1 <<= i9;
            }
        }
        long meth_res = (b ? 1 : 0) + i1 + l + i2 + i9 + Float.floatToIntBits(f2) + i10 + i11 + i12 +
            FuzzerUtils.checkSum(iArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static int iMeth(int i) {

        boolean b2=true;
        double d1=-19.94989;
        int i13=-12, i14=-1, i16=163, i17=101;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)8317);

        i += (int)fMeth(true, i);
        b2 = b2;
        i = i;
        d1 = Test.instanceCount;
        for (i13 = 5; i13 < 270; i13++) {
            i = Test.sFld;
            i14 = i14;
            for (i16 = 1; i16 < 6; i16++) {
                i17 = (int)6529060892695782984L;
                switch (((i13 >>> 1) % 1) + 67) {
                case 67:
                    sArr[i16 - 1] >>>= Test.byFld;
                    i17 += (8 + (i16 * i16));
                    i17 /= (int)(i14 | 1);
                    Test.instanceCount ^= i17;
                    break;
                }
                i17 >>= i17;
            }
        }
        long meth_res = i + (b2 ? 1 : 0) + Double.doubleToLongBits(d1) + i13 + i14 + i16 + i17 +
            FuzzerUtils.checkSum(sArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d2=-80.111616, d3=-28.19474;
        int i18=-5, i19=-11, i20=50, i21=-21090, i22=-38706, i23=43472, i24=-2, i25=250;
        float f3=-120.815F;
        boolean b3=true;

        iMeth(iFld);
        d2 = 1;
        do {
            iFld += (int)d2;
            for (i18 = 5; i18 < 131; i18++) {
                if (true) break;
                for (i20 = 1; i20 < 2; ++i20) {
                    i21 >>>= i21;
                    i19 += (i20 * i20);
                    Test.instanceCount += (((i20 * Test.instanceCount) + i18) - iFld);
                    d3 = Test.sFld;
                    Test.sFld >>= (short)Test.instanceCount;
                }
                f3 -= i21;
                Test.instanceCount += iFld;
                Test.iArrFld[(int)(d2 - 1)] *= 0;
            }
            try {
                iFld = (i21 / iFld);
                Test.iArrFld[(int)(d2)] = (71 % i20);
                i21 = (i21 / 217);
            } catch (ArithmeticException a_e) {}
        } while (++d2 < 192);
        i21 -= -64489;
        iFld += i20;
        for (i22 = 272; i22 > 1; --i22) {
            try {
                i21 = (Test.iArrFld[i22 + 1] / i21);
                iFld = (Test.iArrFld[i22 + 1] % -51);
                i23 = (-23947 / i20);
            } catch (ArithmeticException a_e) {}
            iFld += -21888;
            if (Test.bFld) {
                Test.instanceCount += i19;
                Test.byFld += (byte)d2;
                i19 /= (int)97.539F;
            } else if (Test.bFld) {
                switch (((i22 % 9) * 5) + 64) {
                case 87:
                    b3 = b3;
                    i19 += i22;
                    for (i24 = 5; i24 < 93; i24++) {
                        i21 = 41142;
                        Test.instanceCount = i22;
                    }
                case 90:
                    Test.byFld = (byte)iFld;
                    break;
                case 88:
                    iFld += (((i22 * f3) + i23) - Test.instanceCount);
                    break;
                case 91:
                    if (b3) continue;
                    break;
                case 72:
                case 104:
                    i21 = -7806;
                    break;
                case 103:
                    Test.instanceCount += (i22 * i19);
                    break;
                case 69:
                    Test.fArrFld[i22] += Test.instanceCount;
                    break;
                case 105:
                    d3 *= i18;
                    break;
                }
            } else if (b3) {
                Test.instanceCount -= Test.instanceCount;
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
//DEBUG  fMeth ->  fMeth iMeth mainTest
//DEBUG  lMeth ->  lMeth fMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}