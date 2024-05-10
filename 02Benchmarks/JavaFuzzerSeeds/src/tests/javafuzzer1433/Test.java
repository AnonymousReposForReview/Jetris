package tests.javafuzzer1433;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 20:24:54 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=0L;
    public static int iFld=0;
    public float fFld=2.891F;
    public byte byFld=52;
    public int iFld1=-6;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -3);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i2=-30, i3=-6, i4=-33872, i5=-7, i6=-7, i7=200, iArr[]=new int[N];
        short s=2510;
        long l=2007031237L;

        FuzzerUtils.init(iArr, 21659);

        iArr[(Test.iFld >>> 1) % N] ^= Test.iFld;
        Test.iFld >>>= (int)Test.instanceCount;
        for (i2 = 1; i2 < 132; i2++) {
            Test.instanceCount = 2L;
            s <<= (short)l;
            i4 = 1;
            while (++i4 < 12) {
                l = i2;
                Test.iFld += i3;
            }
            i5 = 1;
            do {
                for (i6 = i2; i6 < 1; i6++) {
                    Test.iFld *= i6;
                    Test.iFld = (int)Test.instanceCount;
                    i3 += i6;
                }
                i7 = (int)1713890121L;
                i3 >>>= i3;
            } while (++i5 < 12);
        }
        long meth_res = i2 + i3 + s + l + i4 + i5 + i6 + i7 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1() {

        float f=-20.282F;
        double d=2.4154;
        int i8=-9739;
        byte by=25;

        Test.iFld >>= (iMeth() * Test.iFld);
        f -= -100.838F;
        Test.instanceCount -= (long)d;
        i8 = 336;
        while (--i8 > 0) {
            Test.iFld -= by;
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i8 + by;
    }

    public static void vMeth(int i, int i1) {

        int i9=-1, i10=115, i12=60195, i13=-26871, iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, 54804);

        vMeth1();
        for (i9 = 7; i9 < 298; i9++) {
            i = Test.iFld;
            switch ((i9 % 4) + 37) {
            case 37:
                i10 >>= Test.iFld;
                i10 /= (int)(Test.instanceCount | 1);
                Test.iFld += (int)39.104524;
                for (i12 = i9; i12 < 6; i12++) {
                    try {
                        i10 = (i13 % -242);
                        i10 = (-50820 % Test.iFld);
                        i1 = (Test.iFld / -35);
                    } catch (ArithmeticException a_e) {}
                    Test.instanceCount += (i12 * i9);
                }
                break;
            case 38:
                i += i1;
            case 39:
                i10 >>= (int)2948271647094304108L;
                Test.iFld /= (int)(i9 | 1);
                i10 += (i9 ^ Test.instanceCount);
                break;
            case 40:
                Test.instanceCount -= i1;
                break;
            }
        }
        vMeth_check_sum += i + i1 + i9 + i10 + i12 + i13 + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        double d1=2.25500;
        int i14=8, i15=235, i16=-22172, i17=-63541, i18=-33531, i19=-5, i20=-13;
        long l1=-53224L, lArr[]=new long[N];
        short s1=22467;
        float f1=1.503F;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-63);
        FuzzerUtils.init(lArr, -3500797996L);

        Test.instanceCount *= (long)(((Test.instanceCount *= 6) * Test.iFld) - fFld);
        vMeth(Test.iFld, Test.iFld);
        Test.iArrFld[(Test.iFld >>> 1) % N] = (int)d1;
        for (i14 = 6; 253 > i14; ++i14) {
            for (l1 = 1; l1 < 102; ++l1) {
                Test.iFld += (int)l1;
                i15 <<= Test.iFld;
                i16 += (int)(l1 + i15);
                s1 *= (short)fFld;
                i16 <<= byFld;
                Test.instanceCount += (((l1 * Test.iFld) + i16) - i14);
                i15 += iFld1;
            }
        }
        for (byte by1 : byArr) {
            for (f1 = 2; f1 < 63; ++f1) {
                i18 = 2;
                do {
                    fFld += i18;
                } while (--i18 > 0);
                iFld1 = i15;
                for (i19 = 1; i19 < 2; ++i19) {
                    i16 = (int)-871158876L;
                    Test.instanceCount += (((i19 * i15) + i14) - i15);
                    i20 -= (int)-4984L;
                    fFld *= i14;
                    i15 += i17;
                    i16 = i18;
                    fFld %= (Test.instanceCount | 1);
                    i20 += i19;
                    Test.iFld = -213;
                }
                fFld -= i18;
                i15 += (int)f1;
                lArr[(int)(f1 + 1)] = by1;
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}