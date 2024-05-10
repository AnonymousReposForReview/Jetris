package tests.javafuzzer1663;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 01:03:24 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=24L;
    public static volatile int iFld=-167;
    public static float fFld=1.83F;
    public byte byFld=27;
    public int iFld1=54958;
    public static long lArrFld[][]=new long[N][N];
    public static long lArrFld1[]=new long[N];
    public volatile int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.lArrFld, -2862775450L);
        FuzzerUtils.init(Test.lArrFld1, -56198L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i6) {

        int i7=0, i8=4156, i9=7, iArr[]=new int[N];
        double d1=119.42184;

        FuzzerUtils.init(iArr, 6);

        i6 = -9882;
        i7 = 1;
        while (++i7 < 153) {
            float f1=13.784F;
            f1 += 2.661F;
            for (i8 = 10; i8 > 1; i8 -= 2) {
                iArr[i7] = i9;
                i9 += i9;
            }
            d1 -= 4;
            f1 = i8;
            i9 += (i7 * i7);
        }
        Test.lArrFld[(i9 >>> 1) % N][(i9 >>> 1) % N] -= (long)d1;
        long meth_res = i6 + i7 + i8 + i9 + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i4, long l, int i5) {

        int i10=-88, i11=127, i12=2, i13=2, i14=71, iArr1[]=new int[N];
        float f2=-100.579F;
        long l1=98L;
        boolean b=true;
        byte by=54;

        FuzzerUtils.init(iArr1, 210);

        i4 = ((--i4) / (iMeth(i5) | 1));
        for (i10 = 5; i10 < 190; i10++) {
            i11 += (i10 | i11);
            iArr1 = iArr1;
            i11 *= (int)l;
            f2 *= i10;
            for (i12 = i10; i12 < 9; ++i12) {
                for (l1 = i10; l1 < 1; l1++) {
                    i13 = i14;
                }
                if (b) break;
                Test.iFld <<= i13;
                iArr1[i10 - 1] = i12;
                Test.instanceCount *= (long)122.49343;
                by = (byte)2.794F;
                i14 = (int)-7L;
            }
        }
        vMeth1_check_sum += i4 + l + i5 + i10 + i11 + Float.floatToIntBits(f2) + i12 + i13 + l1 + i14 + (b ? 1 : 0) +
            by + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth() {

        int i=-22820, i1=-55081, i2=72, i3=-142, i15=52593, i16=39910;
        double d=-113.10407;
        short s=13367;
        boolean b1=true;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, 70L);

        for (i = 380; i > 14; i--) {
            for (i2 = 5; i2 > 1; i2 -= 2) {
                float f=0.542F;
                i1 = (int)(Math.abs(d) * lArr[i - 1][i2]);
                f += i2;
                vMeth1(i1, Test.instanceCount, i);
                s += (short)i1;
                for (i15 = 3; i15 > 1; --i15) {
                    i3 = i1;
                }
                Test.iFld = i15;
                Test.instanceCount <<= 8;
                Test.iFld = s;
                if (false) continue;
                if (b1) continue;
            }
            Test.lArrFld1 = Test.lArrFld1;
            Test.instanceCount += (long)Test.fFld;
        }
        vMeth_check_sum += i + i1 + i2 + i3 + Double.doubleToLongBits(d) + s + i15 + i16 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i17=6, i18=-26495, i19=-56122, i20=-9, i21=55629, iArr2[]=new int[N];
        boolean b2=false;
        short s1=26492;

        FuzzerUtils.init(iArr2, 180);

        vMeth();
        Test.instanceCount -= Test.iFld;
        for (i17 = 358; i17 > 10; i17 -= 2) {
            b2 = b2;
            Test.fFld = 8012462010031230583L;
            if (b2) continue;
            Test.iFld += (int)(1.442F + (i17 * i17));
            Test.iFld *= 49021;
            i18 += byFld;
            for (i19 = 144; i17 < i19; i19--) {
                Test.fFld += -7;
                i20 += i19;
                i21 = 1;
                while (++i21 < 1) {
                    Test.iFld = (int)Test.instanceCount;
                    if (b2) {
                        i20 <<= i17;
                        Test.iFld += (int)(47097L + (i21 * i21));
                        byFld += (byte)Test.fFld;
                        iArr2[i17 - 1] >>= i18;
                    } else if (b2) {
                        i20 >>= iFld1;
                        Test.lArrFld[i19 - 1] = Test.lArrFld[i21 - 1];
                        i20 += i21;
                    }
                    Test.instanceCount -= (long)Test.fFld;
                    s1 = (short)i19;
                    i20 -= (int)117.701F;
                    iArrFld = iArrFld;
                    iFld1 = (int)Test.fFld;
                }
                i18 += (int)-63.84462;
                try {
                    Test.iFld = (iArrFld[i17][i19] / 64593);
                    iArrFld[i19][i19] = (1253671994 / iArr2[i17 - 1]);
                    iFld1 = (Test.iFld % -43582);
                } catch (ArithmeticException a_e) {}
            }
            Test.instanceCount |= iFld1;
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