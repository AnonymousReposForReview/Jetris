package tests.javafuzzer2295;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 11:38:19 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-12L;
    public double dFld=91.33938;
    public static volatile float fFld=2.837F;
    public static boolean bFld=true;
    public short sFld=-29045;
    public static byte byFld=-76;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 9);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;

    public static boolean bMeth(int i8, int i9, byte by) {

        long l1=4272992811L;
        int i10=-4, i11=1032, i12=-76, iArr1[][]=new int[N][N];
        double d=-33.103706, d1=1.46995;
        short s=21608;

        FuzzerUtils.init(iArr1, -160);

        for (l1 = 6; l1 < 283; l1++) {
            iArr1[(i8 >>> 1) % N][(int)(l1)] += i8;
            for (d = 1; d < 6; ++d) {
                i8 >>>= s;
                for (d1 = d; d1 < 2; d1++) {
                    i8 = i10;
                    i10 += i12;
                    i10 -= i11;
                    Test.instanceCount >>= s;
                    i12 += s;
                    Test.fFld = l1;
                    i9 += s;
                    Test.instanceCount *= (long)d1;
                    iArr1[(int)(l1)][(int)(d)] += i8;
                    Test.instanceCount += (long)(d1 * d1);
                }
            }
        }
        long meth_res = i8 + i9 + by + l1 + i10 + Double.doubleToLongBits(d) + i11 + s + Double.doubleToLongBits(d1) +
            i12 + FuzzerUtils.checkSum(iArr1);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static void vMeth(long l) {

        int i4=-4, i5=14, i6=863, i7=0, i13=26, i14=-61258, i15=36822, i16=0, i17=-13;
        byte by1=-48;
        double d2=1.104156;

        for (i4 = 4; i4 < 284; i4++) {
            for (i6 = 1; i6 < 6; i6++) {
                Test.bFld = bMeth(-25179, i7, by1);
                if (i5 != 0) {
                    vMeth_check_sum += l + i4 + i5 + i6 + i7 + by1 + i13 + i14 + i15 + i16 + i17 +
                        Double.doubleToLongBits(d2);
                    return;
                }
                for (i13 = 2; i13 > 1; --i13) {
                    if (Test.bFld) break;
                }
                Test.bFld = Test.bFld;
                i14 += (((i6 * Test.fFld) + i4) - i6);
                l += (long)Test.fFld;
            }
            Test.iArrFld[i4] -= -16926;
            i15 = 6;
            do {
                i14 = (int)Test.instanceCount;
                for (i16 = 1; i16 < 1; i16++) {
                    d2 *= Test.instanceCount;
                    i7 |= -12;
                }
            } while (--i15 > 0);
        }
        vMeth_check_sum += l + i4 + i5 + i6 + i7 + by1 + i13 + i14 + i15 + i16 + i17 + Double.doubleToLongBits(d2);
    }

    public static int iMeth(int i3, boolean b) {

        int i18=-44637, i19=-62694, i20=-32751;

        vMeth(Test.instanceCount);
        Test.fFld += 0.531F;
        i3 += (int)Test.instanceCount;
        i18 = 1;
        do {
            switch (((i18 % 2) * 5) + 122) {
            case 123:
                for (i19 = 1; i19 < 10; ++i19) {
                    i3 >>= (int)Test.instanceCount;
                    Test.iArrFld[i18 - 1] -= i19;
                    Test.instanceCount <<= i18;
                    Test.fFld = i18;
                    i20 <<= i18;
                    i3 *= 12;
                    i3 = -14;
                    i20 = i19;
                }
                Test.instanceCount = -7;
                break;
            case 130:
                i3 = 6;
            default:
                Test.bFld = false;
            }
        } while (++i18 < 166);
        long meth_res = i3 + (b ? 1 : 0) + i18 + i19 + i20;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-110, i1=-40, i2=-199, i21=-1572, i22=6, i23=0, i24=155, i25=6, iArr[][]=new int[N][N];
        long lArr[]=new long[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr, -56329);
        FuzzerUtils.init(lArr, -4039326454009499624L);
        FuzzerUtils.init(fArr, 86.803F);

        for (i = 7; i < 209; i++) {
            dFld -= (-((i1++) | 6));
            i2 = (int)((Math.max(-61404, -119) + (iArr[i][i]++)) + ((i / ((long)(dFld) | 1)) + (Test.instanceCount -
                i)));
            try {
                iArr[i][i] = (iArr[i][i] / i1);
                i2 = (i % -112);
                i2 = (-126 % i2);
            } catch (ArithmeticException a_e) {}
            Test.instanceCount -= (((--i1) << (long)(Test.fFld * Test.instanceCount)) + iMeth(i, Test.bFld));
            i1 = i2;
            for (i21 = 1; i21 < 124; ++i21) {
                i1 = i2;
                i2 = i1;
                i23 = 1;
                while (++i23 < 2) {
                    i1 *= -5133;
                    i1 += (((i23 * Test.instanceCount) + i21) - Test.instanceCount);
                    Test.instanceCount = i;
                    Test.instanceCount <<= -50811;
                    i1 += (i23 + sFld);
                    lArr[i - 1] = Test.instanceCount;
                }
                i1 += (int)(17150L + (i21 * i21));
                if (Test.bFld) continue;
                Test.instanceCount = (long)2.16F;
                lArr[i21] = i2;
            }
            sFld = (short)i1;
            i22 -= 21356;
            i1 >>= Test.byFld;
        }
        Test.instanceCount = i2;
        for (i24 = 4; i24 < 220; ++i24) {
            i22 <<= i1;
            switch ((((222 >>> 1) % 8) * 5) + 66) {
            case 100:
                i22 = (int)-2.335F;
                Test.iArrFld[i24 - 1] <<= sFld;
                if (false) continue;
            case 101:
                i2 += i24;
                break;
            case 86:
                Test.fFld += Test.fFld;
                break;
            case 96:
                try {
                    i1 = (-29 % iArr[i24][i24]);
                    i25 = (-6932 % i1);
                    i22 = (i22 / -204);
                } catch (ArithmeticException a_e) {}
                break;
            case 79:
                fArr[i24 - 1] += 2.925F;
                break;
            case 72:
                i22 >>= i;
            case 105:
                lArr[i24 + 1] = Test.instanceCount;
                break;
            case 98:
            default:
                Test.instanceCount = Test.instanceCount;
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  bMeth ->  bMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}