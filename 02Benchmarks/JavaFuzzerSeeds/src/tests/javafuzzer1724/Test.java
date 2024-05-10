package tests.javafuzzer1724;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 02:32:42 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=5L;
    public static boolean bFld=true;
    public static volatile int iFld=-1;
    public short sFld=17564;
    public static int iFld1=13;

    public static long bMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i2, int i3, double d) {

        int i4=-28545, i5=-53558, i6=46753, i7=14, i8=18758, iArr[]=new int[N];
        float f=56.726F;
        byte by3=22;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -49736);
        FuzzerUtils.init(lArr, 19720L);

        i4 = 1;
        while (++i4 < 227) {
            for (i5 = 7; i5 > i4; i5--) {
                byte by2=-7;
                by2 &= (byte)Test.instanceCount;
                if (Test.bFld) continue;
                Test.instanceCount = Test.instanceCount;
                iArr = iArr;
            }
            i3 *= i2;
            i6 >>= 212;
        }
        for (i7 = 217; i7 > 6; --i7) {
            i8 /= (int)(Test.instanceCount | 1);
            Test.bFld = Test.bFld;
            i6 += (int)f;
            i6 = by3;
            lArr[i7 + 1] |= i5;
            i8 = -62;
        }
        vMeth1_check_sum += i2 + i3 + Double.doubleToLongBits(d) + i4 + i5 + i6 + i7 + i8 + Float.floatToIntBits(f) +
            by3 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(byte by, byte by1, int i1) {

        int i10=-5, iArr1[]=new int[N], iArr2[]=new int[N];

        FuzzerUtils.init(iArr1, 194);
        FuzzerUtils.init(iArr2, 63715);

        vMeth1(i1, i1, 6.44560);
        for (int i9 : iArr1) {
            iArr1[(25803 >>> 1) % N] -= i9;
            iArr2[(i9 >>> 1) % N] *= i1;
            i10 = 1;
            while (++i10 < 4) {
                switch ((((i1 >>> 1) % 2) * 5) + 111) {
                case 112:
                    iArr2[i10 + 1] <<= i1;
                    i9 += i9;
                    break;
                case 121:
                    if (Test.bFld) {
                        if (Test.bFld) continue;
                        if (false) {
                            i9 <<= i9;
                            iArr1[i10] *= i1;
                            i9 = (int)-200L;
                            vMeth_check_sum += by + by1 + i1 + i10 + FuzzerUtils.checkSum(iArr1) +
                                FuzzerUtils.checkSum(iArr2);
                            return;
                        } else if (true) {
                            i1 = i9;
                        } else {
                            Test.instanceCount += (((i10 * i1) + i9) - i1);
                            vMeth_check_sum += by + by1 + i1 + i10 + FuzzerUtils.checkSum(iArr1) +
                                FuzzerUtils.checkSum(iArr2);
                            return;
                        }
                    }
                    break;
                default:
                    if (Test.bFld) continue;
                }
            }
        }
        vMeth_check_sum += by + by1 + i1 + i10 + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(iArr2);
    }

    public static boolean bMeth(int i, long l) {

        byte by4=-58;
        int i11=3, i12=25465, i13=174, i14=14;
        double d1=0.100383;

        vMeth((byte)(-76), by4, i);
        for (i11 = 1; i11 < 337; ++i11) {
            i12 = 12;
            i -= (int)Test.instanceCount;
            for (i13 = 5; i13 > 1; i13--) {
                try {
                    i = (i % 114);
                    i12 = (1100112136 % i11);
                    i14 = (i11 % i);
                } catch (ArithmeticException a_e) {}
                d1 = -33.76118;
            }
        }
        long meth_res = i + l + by4 + i11 + i12 + i13 + i14 + Double.doubleToLongBits(d1);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void mainTest(String[] strArr1) {

        int i15=-8, i16=12382, i17=8, i18=-11, i19=165, i20=5, iArr3[]=new int[N];
        float f1=86.401F;

        FuzzerUtils.init(iArr3, 216);

        Test.bFld = (Test.bFld != bMeth(i15, Test.instanceCount));
        i15 += Test.iFld;
        for (i16 = 241; i16 > 5; i16--) {
            try {
                Test.iFld = (i15 % -238);
                i15 = (-133 % i15);
                Test.iFld = (-5215 % iArr3[i16]);
            } catch (ArithmeticException a_e) {}
            Test.iFld >>= i16;
            try {
                Test.iFld = (i15 / Test.iFld);
                i15 = (Test.iFld % 4353352);
                i15 = (i16 / 51);
            } catch (ArithmeticException a_e) {}
            i15 -= Test.iFld;
            Test.instanceCount &= i15;
            iArr3[i16 - 1] -= sFld;
            iArr3[i16] -= 69;
            Test.iFld -= Test.iFld1;
            for (i18 = 2; i18 < 106; i18++) {
                i20 = 1;
                while (++i20 < 2) {
                    iArr3 = iArr3;
                    iArr3[i20 - 1] += i16;
                    Test.instanceCount *= -93;
                    if (Test.bFld) break;
                    if (Test.bFld) continue;
                    iArr3[i20] -= i17;
                    i15 -= Test.iFld1;
                    i17 = 5;
                    if (true) {
                        Test.iFld1 += (29693 + (i20 * i20));
                        iArr3[(i18 >>> 1) % N] = i20;
                        i17 += (((i20 * Test.iFld) + Test.iFld1) - Test.instanceCount);
                    } else if (Test.bFld) {
                        f1 -= -61431;
                        i19 += sFld;
                        if (Test.bFld) break;
                    } else {
                        iArr3[i18 + 1] *= i15;
                        iArr3[i16 + 1] += i16;
                    }
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
//DEBUG  bMeth ->  bMeth mainTest
//DEBUG  vMeth ->  vMeth bMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth bMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
