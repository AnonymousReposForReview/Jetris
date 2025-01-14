package tests.javafuzzer201;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 00:08:45 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=4043144630L;
    public static int iFld=-13;
    public float fFld=-1.435F;
    public static int iFld1=2398;
    public static volatile boolean bFld=true;
    public volatile int iArrFld[]=new int[N];
    public static volatile long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -9L);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i2, int i3, int i4) {

        long l1=-632010119L, lArr[]=new long[N];
        int i5=47275, i6=9, i7=9, i8=7, i9=-7, iArr[]=new int[N];
        float f1=0.350F;
        double d=115.119889;
        byte by1=-90;

        FuzzerUtils.init(lArr, -4736820378775360831L);
        FuzzerUtils.init(iArr, 112);

        i4 = i3;
        for (l1 = 6; l1 < 168; l1++) {
            for (i6 = 1; i6 < 10; ++i6) {
                byte by=-54;
                boolean b=true;
                f1 = Test.instanceCount;
                lArr[(int)(l1)] = i2;
                i7 += (int)d;
                for (i8 = 1; i8 < 2; i8++) {
                    Test.instanceCount += (i8 | i6);
                }
                by += (byte)f1;
                if (b) break;
                d += -391154204L;
            }
            iArr[(int)(l1 - 1)] %= (int)-8018999921976501219L;
            f1 -= -97;
        }
        i4 = by1;
        Test.instanceCount *= i5;
        vMeth1_check_sum += i2 + i3 + i4 + l1 + i5 + i6 + i7 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d) +
            i8 + i9 + by1 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(long l) {

        float f=-2.39F;
        int i10=-120, i11=-22, i12=-14, i13=112, i14=2, iArr1[]=new int[N];
        boolean b1=false;
        short s1=-2585, sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-7101);
        FuzzerUtils.init(iArr1, -28073);

        sArr[(Test.iFld >>> 1) % N] = (short)f;
        vMeth1(24155, Test.iFld, Test.iFld);
        i10 = 1;
        while (++i10 < 187) {
            l += (i10 ^ Test.iFld);
            if (b1) {
                iArr1[i10 - 1] ^= i10;
            } else {
                f -= Test.iFld;
                for (i11 = 1; i11 < 9; i11++) {
                    for (i13 = 1; i13 < 2; i13++) {
                        iArr1[i11 - 1] = i11;
                        Test.instanceCount = -13;
                    }
                    Test.iFld >>>= i14;
                    s1 <<= (short)12;
                    if (b1) continue;
                }
            }
        }
        long meth_res = l + Float.floatToIntBits(f) + i10 + (b1 ? 1 : 0) + i11 + i12 + i13 + i14 + s1 +
            FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(short s) {

        int i=0, i1=19350;

        for (i = 148; i > 1; i -= 2) {
            iMeth(244L);
            i1 = i1;
        }
        vMeth_check_sum += s + i + i1;
    }

    public void mainTest(String[] strArr1) {

        short s2=16440;
        int i15=37823, i16=-20360, i18=-528, i19=97, i20=-144, i21=24352, i22=-58, i23=35, i24=62652, iArr2[][]=new
            int[N][N];
        byte by2=69;
        double d1=0.93108;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(iArr2, -173);

        vMeth(s2);
        Test.instanceCount = 6;
        for (i15 = 7; i15 < 285; ++i15) {
            iArrFld[i15] -= i16;
            fFld += 14;
            Test.iFld = 36549;
            for (i18 = 90; 2 < i18; i18--) {
                by2 = (byte)Test.instanceCount;
            }
            for (i20 = 5; i20 < 90; ++i20) {
                i21 += (31594 + (i20 * i20));
                for (i22 = 1; i22 < 2; i22++) {
                    Test.iFld1 += (i22 - s2);
                    i16 += (i22 * i22);
                    Test.lArrFld[i22 + 1] += Test.instanceCount;
                    i21 += i22;
                    switch (((i15 % 2) * 5) + 8) {
                    case 15:
                        iArrFld[i15] -= Test.iFld1;
                        i16 -= Test.iFld;
                        fFld -= i22;
                        try {
                            i19 = (Test.iFld1 % Test.iFld1);
                            i23 = (-46 % iArrFld[i15 + 1]);
                            i19 = (iArrFld[i15 + 1] % i19);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 11:
                        Test.instanceCount += i22;
                        break;
                    }
                    bArr[i15] = Test.bFld;
                    i21 >>>= Test.iFld;
                }
                iArr2[i20][i20] = -233;
                i19 -= (int)-1165770476290528852L;
                for (d1 = 1; d1 < 2; d1++) {
                    s2 += (short)fFld;
                    Test.iFld1 *= (int)Test.instanceCount;
                    i21 += (int)(((d1 * Test.iFld1) + i23) - Test.instanceCount);
                    i24 *= by2;
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
