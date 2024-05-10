package tests.javafuzzer2121;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 09:12:56 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2885021262L;
    public static byte byFld=-18;
    public static long lFld=-219L;
    public float fFld=-99.304F;
    public static boolean bFld=false;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -2026024028L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i3, long l2) {


        i3 ^= 55365;
        vMeth2_check_sum += i3 + l2;
    }

    public static void vMeth1(int i1, int i2) {

        int i4=3, i5=-180, i6=14, i7=63742, i8=-115, i9=0, iArr[]=new int[N];
        float f=2.946F;
        double d=-12.60106;
        boolean b=true;

        FuzzerUtils.init(iArr, -60056);

        vMeth2(i2, Test.instanceCount);
        for (i4 = 6; i4 < 139; i4++) {
            Test.instanceCount *= Test.byFld;
            f = -13;
        }
        i2 -= Test.byFld;
        iArr[(i5 >>> 1) % N] -= i4;
        for (i6 = 4; i6 < 189; i6++) {
            d -= Test.instanceCount;
            if (b) {
                for (i8 = 1; i8 < 9; i8++) {
                    Test.instanceCount = i2;
                    if (i8 != 0) {
                        vMeth1_check_sum += i1 + i2 + i4 + i5 + Float.floatToIntBits(f) + i6 + i7 +
                            Double.doubleToLongBits(d) + i8 + i9 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr);
                        return;
                    }
                }
                f += (((i6 * Test.instanceCount) + i2) - Test.instanceCount);
                Test.instanceCount = i2;
            }
            Test.instanceCount += (long)f;
        }
        vMeth1_check_sum += i1 + i2 + i4 + i5 + Float.floatToIntBits(f) + i6 + i7 + Double.doubleToLongBits(d) + i8 +
            i9 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(long l, long l1) {

        int i=-48, i10=13, i11=14, i12=11, i13=11, i14=21337, i15=-14, iArr1[]=new int[N];
        float f1=74.917F, f2=-16.670F, f3=-42.640F;
        double d1=1.73577;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr1, 4);
        FuzzerUtils.init(lArr, 42344L);

        i = (i++);
        vMeth1(i, i);
        for (i10 = 16; i10 < 325; i10++) {
            Test.lFld = i11;
            i11 += (i10 * i11);
            for (f1 = 1; f1 < 5; f1++) {
                try {
                    iArr1[(int)(f1 + 1)] = (-52863 % iArr1[i10]);
                    i12 = (iArr1[(int)(f1 - 1)] % i11);
                    i = (-167 % i10);
                } catch (ArithmeticException a_e) {}
                d1 += Test.byFld;
                i -= i11;
                iArr1[i10] = i10;
                f2 *= -32;
            }
            for (f3 = 1; 5 > f3; f3++) {
                for (i14 = i10; i14 < 2; ++i14) {
                    i *= i15;
                    lArr[i10] &= i12;
                }
            }
        }
        vMeth_check_sum += l + l1 + i + i10 + i11 + Float.floatToIntBits(f1) + i12 + Double.doubleToLongBits(d1) +
            Float.floatToIntBits(f2) + Float.floatToIntBits(f3) + i13 + i14 + i15 + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i16=4, i17=23499, i18=-87, i19=-4, i20=134, i21=13190, iArr2[][]=new int[N][N];
        short s=24530;

        FuzzerUtils.init(iArr2, -60258);

        vMeth(Test.instanceCount, Test.lFld);
        i16 -= i16;
        i16 = -27867;
        for (i17 = 13; i17 < 213; i17++) {
            switch (((i17 % 1) * 5) + 35) {
            case 39:
                i19 = 1;
                while (++i19 < 126) {
                    i18 += i19;
                    i18 = i17;
                    iArr2[i17][i19] += Test.byFld;
                    for (i20 = 1; i20 < 1; ++i20) {
                        boolean b1=true;
                        i16 += (i20 | i18);
                        Test.instanceCount = Test.byFld;
                        iArr2[i19][i19] *= 4;
                        Test.lFld = s;
                        i21 <<= (int)50L;
                        switch (((-16137 >>> 1) % 3) + 88) {
                        case 88:
                            i21 += (i20 | Test.instanceCount);
                            break;
                        case 89:
                            iArr2[i20][i20 - 1] >>= -30027;
                            Test.lFld *= i19;
                            Test.lArrFld = Test.lArrFld;
                            break;
                        case 90:
                            if (Test.bFld) {
                                fFld -= 36965;
                            } else {
                                i21 <<= i19;
                            }
                            Test.lArrFld = Test.lArrFld;
                            break;
                        }
                        i18 -= i17;
                        switch (((i17 % 2) * 5) + 90) {
                        case 99:
                            switch (((i20 % 2) * 5) + 98) {
                            case 99:
                                i16 -= i20;
                                Test.lFld -= Test.instanceCount;
                                break;
                            case 100:
                                if (b1) break;
                            default:
                                if (b1) break;
                            }
                            break;
                        case 96:
                            i16 += i16;
                            break;
                        default:
                            s *= (short)i16;
                        }
                    }
                }
                break;
            default:
                i21 &= (int)Test.instanceCount;
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
