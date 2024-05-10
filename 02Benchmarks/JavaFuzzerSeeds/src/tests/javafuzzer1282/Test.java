package tests.javafuzzer1282;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 17:40:12 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-9908L;
    public byte byFld=-103;
    public static double dFld=-2.6467;
    public static boolean bFld=false;
    public static short sFld=-12739;
    public int iFld=-61368;
    public static float fFld=0.691F;
    public int iFld1=13;
    public static byte byArrFld[]=new byte[N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)93);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l1, int i3) {

        int i4=13, i5=-45744, i6=-7, i7=233, i8=23343, i9=-10, iArr[]=new int[N];
        float f1=-2.488F;

        FuzzerUtils.init(iArr, -12);

        for (i4 = 18; i4 < 329; ++i4) {
            for (i6 = 1; i6 < 5; i6++) {
                i5 = (int)Test.dFld;
                i3 = i6;
                Test.dFld += f1;
                iArr[i6 - 1] -= i5;
                Test.bFld = Test.bFld;
                for (i8 = i4; i8 < 2; ++i8) {
                    i7 <<= i8;
                    iArr[i8 - 1] *= i9;
                    f1 += (i8 * i8);
                    i7 = (int)f1;
                    i7 += (int)f1;
                    i5 += i8;
                    try {
                        iArr[i8 - 1] = (i7 / i6);
                        i3 = (-14345 % i4);
                        i3 = (-54332 % i8);
                    } catch (ArithmeticException a_e) {}
                }
            }
        }
        vMeth1_check_sum += l1 + i3 + i4 + i5 + i6 + i7 + Float.floatToIntBits(f1) + i8 + i9 +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i, long l, int i1) {

        int i2=-6, i10=9, i11=12, iArr1[]=new int[N];
        float f2=1.170F;
        long l2=54574L;
        short s=29507;

        FuzzerUtils.init(iArr1, -14);

        i1 -= i1;
        i2 = 1;
        do {
            float f=-118.938F;
            i1 = (((i1 + -121) + (i1 * i2)) + Math.abs(Math.min(i2, i2)));
            f += (i2 * i);
            vMeth1(Test.instanceCount, i);
            l -= i1;
        } while (++i2 < 263);
        for (i10 = 13; i10 < 242; i10++) {
            i = i11;
            f2 = f2;
            i += (i10 - l);
            l2 += s;
            l2 <<= i2;
        }
        for (int i13 : iArr1) {
            Test.byArrFld[(11 >>> 1) % N] = (byte)5;
        }
        i1 = (int)-7888322967730498091L;
        vMeth_check_sum += i + l + i1 + i2 + i10 + i11 + Float.floatToIntBits(f2) + l2 + s +
            FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth() {

        int i14=-28825, i15=62944, i16=9, i17=228, iArr2[]=new int[N], iArr3[]=new int[N];
        long l3=12L, l4=-25146L, l5=3L, lArr[]=new long[N];
        float f3=0.853F;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -1.17823);
        FuzzerUtils.init(iArr2, 52732);
        FuzzerUtils.init(iArr3, -13);
        FuzzerUtils.init(lArr, 592585610636158671L);

        vMeth(i14, Test.instanceCount, 35017);
        for (double d1 : dArr) {
            i14 += (int)7228659772320718115L;
            for (i15 = 1; i15 < 4; ++i15) {
                switch (((i14 >>> 1) % 8) + 8) {
                case 8:
                    l3 = i14;
                    if (Test.bFld) continue;
                    i16 *= (int)l4;
                    Test.sFld -= (short)i15;
                    break;
                case 9:
                    for (l5 = 1; l5 < 2; ++l5) {
                        i17 += i15;
                        iArr2[i15 - 1] *= (int)Test.instanceCount;
                        i16 += (int)f3;
                        if (i15 != 0) {
                        }
                        l4 = l5;
                    }
                    break;
                case 10:
                    i17 += i15;
                    break;
                case 11:
                    i16 -= i17;
                    break;
                case 12:
                    i16 += (i15 ^ l3);
                    break;
                case 13:
                    if (Test.bFld) continue;
                case 14:
                    iArr3[i15] = (int)l5;
                    break;
                case 15:
                    lArr[i15 + 1] = l5;
                    break;
                }
            }
        }
        long meth_res = i14 + i15 + i16 + l3 + l4 + l5 + i17 + Float.floatToIntBits(f3) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr2) +
            FuzzerUtils.checkSum(iArr3) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d=-91.87454;
        float f4=0.427F;
        int i18=-158, i19=-50, i20=-13;

        d = 1;
        do {
            byFld = (byte)Long.reverseBytes(iMeth() - iFld);
            for (f4 = 74; f4 > d; --f4) {
                for (i19 = 1; i19 > 1; i19 -= 3) {
                    Test.instanceCount &= iFld;
                    iFld = i18;
                    Test.instanceCount = i19;
                    i20 |= (int)Test.instanceCount;
                    iFld >>= i18;
                    iArrFld[i19] += (int)132L;
                    if (Test.bFld) break;
                    i18 |= iFld;
                    switch ((int)(((f4 % 3) * 5) + 61)) {
                    case 69:
                        i18 += (i19 - i19);
                        iFld /= (int)(i20 | 1);
                        Test.fFld += (((i19 * i18) + i19) - i18);
                        Test.bFld = Test.bFld;
                    case 65:
                        Test.instanceCount += (i19 * i19);
                        iFld -= (int)1.311F;
                        if (Test.bFld) break;
                        break;
                    case 64:
                        iArrFld[(int)(f4 + 1)] = (int)Test.instanceCount;
                        i18 >>>= (int)Test.instanceCount;
                        if (Test.bFld) continue;
                        break;
                    default:
                        i20 -= (int)Test.instanceCount;
                        iArrFld[(int)(d - 1)] = (int)Test.instanceCount;
                    }
                }
                iFld1 = byFld;
                i20 += iFld;
                Test.instanceCount += (long)((long)f4 ^ i18);
                i20 = 13;
                iFld *= i19;
            }
        } while (++d < 341);



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
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}