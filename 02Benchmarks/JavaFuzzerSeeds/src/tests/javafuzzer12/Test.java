package tests.javafuzzer12;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 20:59:48 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-25951L;
    public static volatile int iFld=-2;
    public static short sFld=-16400;
    public static int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 3);
        FuzzerUtils.init(Test.dArrFld, 91.111711);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(long l1, short s1, float f) {

        int i1=-7, i2=187, i3=6, i4=-32, i5=-4, iArr[]=new int[N];
        byte by=49;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -68);
        FuzzerUtils.init(lArr, -1L);

        i1 = 1;
        while (++i1 < 335) {
            Test.instanceCount <<= i1;
            i2 += i1;
            i3 = 1;
            do {
                if (i2 != 0) {
                    vMeth_check_sum += l1 + s1 + Float.floatToIntBits(f) + i1 + i2 + i3 + by + i4 + i5 +
                        FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
                    return;
                }
                Test.instanceCount = -104;
                switch (((i3 % 5) * 5) + 29) {
                case 43:
                    i2 |= (int)Test.instanceCount;
                    break;
                case 40:
                case 35:
                    i2 = by;
                    f *= l1;
                    i2 += i3;
                    break;
                case 44:
                    for (i4 = 1; i4 < 1; i4++) {
                        if (i4 != 0) {
                            vMeth_check_sum += l1 + s1 + Float.floatToIntBits(f) + i1 + i2 + i3 + by + i4 + i5 +
                                FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
                            return;
                        }
                        i2 = (int)Test.instanceCount;
                        iArr = iArr;
                    }
                    break;
                case 32:
                    f = Test.instanceCount;
                    break;
                default:
                    lArr[i1 - 1] = i3;
                }
            } while (++i3 < 5);
        }
        vMeth_check_sum += l1 + s1 + Float.floatToIntBits(f) + i1 + i2 + i3 + by + i4 + i5 + FuzzerUtils.checkSum(iArr)
            + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth() {

        short s2=-30559;

        vMeth(Test.instanceCount, s2, -67.214F);
        long meth_res = s2;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vSmallMeth(int i, long l) {

        short s=-12731;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -6.789F);

        s = (short)(((i * s) + (i++)) + ((Test.instanceCount + 40) + iMeth()));
        fArr[(-52218 >>> 1) % N] = i;
        vSmallMeth_check_sum += i + l + s + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        float f1=-30.235F;
        int i6=15839, i7=-3, i8=14, i9=144, i10=-134;
        double d=1.68939;
        long l2=-1424283777L, lArr1[]=new long[N];
        boolean b=false;

        FuzzerUtils.init(lArr1, -1979406403L);

        for (int smallinvoc=0; smallinvoc<384; smallinvoc++) vSmallMeth(Test.iFld, Test.instanceCount);
        f1 /= (Test.iFld | 1);
        for (i6 = 7; i6 < 173; i6++) {
            d = -1;
            switch ((i6 % 6) + 89) {
            case 89:
                lArr1[i6 + 1] += 2657953921L;
                if (b) {
                    Test.sFld += (short)(3L + (i6 * i6));
                    d -= Test.iFld;
                    Test.iFld = 2;
                } else if (b) {
                    i7 *= Test.iFld;
                } else if (b) {
                    l2 = 1;
                    while (++l2 < 151) {
                        if (b) {
                            d -= l2;
                            for (i8 = 1; i8 < 1; i8++) {
                                Test.iArrFld[(int)(l2)] += (int)1.451F;
                                Test.iFld += (-43 + (i8 * i8));
                                i7 >>= i9;
                                Test.iFld += i8;
                                Test.dArrFld[(int)(l2 - 1)] -= i9;
                                i9 = i7;
                            }
                            i7 += (-8491 + (l2 * l2));
                        } else {
                            i7 *= i7;
                            Test.iArrFld[i6 - 1] |= (int)Test.instanceCount;
                            i10 = 1;
                            do {
                                i7 = (int)101.497F;
                                Test.iFld = 160;
                                lArr1[i6] = l2;
                                f1 = 24859;
                                Test.iFld >>= i7;
                            } while (++i10 < 1);
                        }
                    }
                } else {
                    i9 = 69;
                }
            case 90:
                Test.iFld += (int)f1;
                break;
            case 91:
                i7 += i6;
                break;
            case 92:
                lArr1[i6 + 1] -= l2;
            case 93:
            case 94:
                try {
                    Test.iFld = (45820 % i6);
                    i9 = (i6 / 50969);
                    i9 = (Test.iFld / i9);
                } catch (ArithmeticException a_e) {}
                break;
            default:
                f1 -= i10;
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
//DEBUG  iMeth ->  iMeth vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth iMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
