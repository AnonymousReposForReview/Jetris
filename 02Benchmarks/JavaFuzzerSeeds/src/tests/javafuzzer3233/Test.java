package tests.javafuzzer3233;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 04:23:14 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3847654167L;
    public static int iFld=20731;
    public static volatile boolean bFld=true;
    public static int iFld1=-10172;
    public static int iFld2=-41839;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -4736262566619902271L);
    }

    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i3, int i4) {

        float f=-46.490F;

        i3 >>= i3;
        f = Test.instanceCount;
        vMeth_check_sum += i3 + i4 + Float.floatToIntBits(f);
    }

    public static int iMeth(int i1) {

        int i2=-58530, i5=-64065, i6=-235, i7=-26441, i8=-195, iArr[]=new int[N];
        float f1=-2.773F;
        double d1=28.73589;
        short sArr[]=new short[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 161);
        FuzzerUtils.init(sArr, (short)-7805);
        FuzzerUtils.init(lArr, 62L);

        i2 = 188;
        while ((i2 -= 3) > 0) {
            vMeth(i1, Test.iFld);
            i5 = 24;
            do {
                iArr[i5] = (int)Test.instanceCount;
                Test.instanceCount += i5;
            } while (--i5 > 0);
            Test.bFld = Test.bFld;
            for (i6 = 1; i6 < 24; i6++) {
                i8 = 1;
                while (++i8 < 2) {
                    if (Test.bFld) break;
                    Test.iFld = i2;
                }
                f1 = 1;
                do {
                    d1 *= Test.iFld;
                    iArr[i6] >>= i5;
                } while (++f1 < 2);
            }
        }
        sArr[(i8 >>> 1) % N] *= (short)f1;
        lArr[(Test.iFld >>> 1) % N] -= i6;
        long meth_res = i1 + i2 + i5 + i6 + i7 + i8 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(int i, double d) {

        int i9=31236, i10=-127, i11=-10, i12=-17117, i13=4, i14=2, i15=10235;
        float f2=0.750F;
        short s=25036;
        long l=2L;

        i -= (Math.abs(iMeth(i)) + i);
        for (i9 = 7; 130 > i9; ++i9) {
            f2 = 1;
        }
        if (Test.bFld) {
            Test.instanceCount = Test.iFld;
            Test.bFld = Test.bFld;
        } else {
            for (i11 = 18; i11 < 346; ++i11) {
                Test.instanceCount >>= i;
                for (i13 = i11; i13 < 5; i13++) {
                    i12 *= s;
                    for (l = i11; l < 1; l++) {
                        Test.iFld = (int)f2;
                        i10 *= i;
                        Test.instanceCount = -16934;
                        Test.instanceCount <<= i9;
                    }
                }
            }
        }
        long meth_res = i + Double.doubleToLongBits(d) + i9 + i10 + Float.floatToIntBits(f2) + i11 + i12 + i13 + i14 +
            s + l + i15;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d2=1.50938;
        short s1=-16326;
        int i16=95, i17=91, i19=39122, i20=-65, i21=84, i22=37689, i23=1, iArr1[]=new int[N];
        float f3=-1.159F;
        byte by=-58;

        FuzzerUtils.init(iArr1, -2);

        switch ((((Test.iFld - Test.iFld) >>> 1) % 9) + 105) {
        case 105:
            Test.iFld -= (int)(lMeth(Test.iFld, d2) * Test.instanceCount);
            s1 = (short)3;
            for (i16 = 17; i16 < 299; i16++) {
                Test.iFld += (int)f3;
                Test.iFld -= 5091;
                Test.bFld = true;
                i17 = i17;
                f3 *= 212;
                for (i19 = 5; i19 < 89; ++i19) {
                    Test.instanceCount += i16;
                    Test.iFld += (((i19 * Test.iFld) + i16) - Test.instanceCount);
                    i17 |= 1;
                    for (i21 = i16; 2 > i21; i21 += 3) {
                        i20 = (int)Test.instanceCount;
                        Test.instanceCount += i16;
                        Test.iFld -= (int)d2;
                        switch ((i21 % 6) + 107) {
                        case 107:
                            i20 += s1;
                            i17 = (int)Test.instanceCount;
                            switch ((i19 % 2) + 122) {
                            case 122:
                                by = (byte)i22;
                                Test.iFld *= i22;
                                Test.iFld1 <<= i21;
                                Test.lArrFld[i16] >>= i19;
                                break;
                            case 123:
                                Test.iFld1 <<= (int)Test.instanceCount;
                                Test.iFld1 <<= (int)Test.instanceCount;
                                if (Test.bFld) break;
                                break;
                            }
                            break;
                        case 108:
                            Test.iFld1 *= i21;
                        case 109:
                            iArr1[i16] = i21;
                        case 110:
                            Test.iFld *= i19;
                            break;
                        case 111:
                            Test.iFld1 = i16;
                            break;
                        case 112:
                            i23 >>= i19;
                            break;
                        default:
                            Test.iFld1 >>>= (int)Test.instanceCount;
                        }
                    }
                }
            }
        case 106:
            d2 = Test.instanceCount;
        case 107:
            Test.iFld += (int)4915L;
            break;
        case 108:
            d2 -= i19;
            break;
        case 109:
            Test.iFld2 = Test.iFld1;
        case 110:
        case 111:
            Test.instanceCount ^= i19;
            break;
        case 112:
            Test.iFld2 = (int)d2;
        case 113:
            i23 ^= Test.iFld;
            break;
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
