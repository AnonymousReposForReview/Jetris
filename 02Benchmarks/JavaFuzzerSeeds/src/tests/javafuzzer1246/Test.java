package tests.javafuzzer1246;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 17:07:39 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-4827748514857515870L;
    public static byte byFld=-57;
    public long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -6);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static double dMeth(long l1, int i13) {

        int i14=-57907, i15=231, i16=-11, i17=-13561, i18=-6, i19=-176, i20=25541;
        double d=98.74994;
        float f3=17.629F;

        Test.iArrFld[(i13 >>> 1) % N] += (int)12L;
        for (i14 = 13; i14 < 296; i14++) {
            Test.byFld *= (byte)-182;
            i13 = (int)l1;
            d = -39781;
        }
        for (i16 = 9; i16 < 269; i16++) {
            short s=9229;
            s += (short)(((i16 * i14) + f3) - i13);
            Test.iArrFld[i16 - 1] *= s;
            i18 = 1;
            while (++i18 < 6) {
                Test.instanceCount += (i18 * i18);
                d = s;
                i17 |= 39010;
                for (i19 = 1; i19 < 1; ++i19) {
                    i20 += i19;
                    l1 -= -24L;
                }
            }
        }
        long meth_res = l1 + i13 + i14 + i15 + Double.doubleToLongBits(d) + i16 + i17 + Float.floatToIntBits(f3) + i18
            + i19 + i20;
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static int iMeth1() {

        int i12=-12194;
        short sArr[]=new short[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(sArr, (short)-3098);
        FuzzerUtils.init(fArr, 0.585F);

        i12 += (int)(((--sArr[(i12 >>> 1) % N]) * Test.instanceCount) - 0.836F);
        Test.instanceCount *= (long)dMeth(-7L, i12);
        fArr[(i12 >>> 1) % N] = i12;
        long meth_res = i12 + FuzzerUtils.checkSum(sArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i7, int i8, float f1) {

        int i9=-16, i10=-4, i11=5623, i21=11, i22=10, iArr1[][]=new int[N][N];
        float f2=-52.129F;
        double d1=-117.62927, dArr[]=new double[N];

        FuzzerUtils.init(dArr, 96.127092);
        FuzzerUtils.init(iArr1, 14);

        for (i9 = 327; i9 > 3; i9--) {
            for (f2 = 5; f2 > i9; f2--) {
                Test.byFld -= (byte)(((++i11) + (f2 + 39394)) + ((++f1) - (i7 * -2.853F)));
                i7 <<= iMeth1();
                dArr[(i8 >>> 1) % N] += i8;
                i11 += (int)f2;
                for (i21 = 1; i21 < 1; ++i21) {
                    switch (((33896 >>> 1) % 5) + 113) {
                    case 113:
                        i7 = i21;
                        Test.instanceCount = i8;
                        f1 *= i10;
                        Test.instanceCount += (i21 - i7);
                        break;
                    case 114:
                        Test.iArrFld[(int)(f2)] *= (int)Test.instanceCount;
                        i11 += (i21 * i21);
                        Test.instanceCount = i8;
                        break;
                    case 115:
                        iArr1 = iArr1;
                        break;
                    case 116:
                        i22 >>= (int)Test.instanceCount;
                        break;
                    case 117:
                        Test.instanceCount >>= Test.instanceCount;
                        break;
                    default:
                        Test.instanceCount -= (long)d1;
                    }
                }
            }
        }
        long meth_res = i7 + i8 + Float.floatToIntBits(f1) + i9 + i10 + Float.floatToIntBits(f2) + i11 + i21 + i22 +
            Double.doubleToLongBits(d1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=49081, i1=-31264, i2=2, i3=0, i4=94, i5=-56, i6=0, iArr[]=new int[N];
        float f=8.574F;
        long l=27L;
        double d2=1.41746;
        short s1=-19239;

        FuzzerUtils.init(iArr, 8);

        i = 1;
        do {
            f += i;
            for (i1 = 77; i1 > 1; i1--) {
                for (i3 = i; i3 < 2; ++i3) {
                    Test.instanceCount += (i3 | i3);
                    lArrFld[i1] = (((i2 + 12) + (i3 - i4)) + Test.instanceCount);
                    iArr[i1 - 1] -= (-((i4 - i1) * (i4 *= i3)));
                }
                l = 2;
                do {
                    try {
                        i2 = (-34954 / i);
                        i4 = (-1550398162 % i);
                        iArr[(int)(l)] = (-47819 / i4);
                    } catch (ArithmeticException a_e) {}
                    iArr = FuzzerUtils.int1array(N, (int)140);
                } while ((l -= 2) > 0);
                Test.instanceCount <<= (--lArrFld[i + 1]);
                for (i5 = 2; i5 > 1; --i5) {
                    if ((i4++) == (iMeth(-7, i1, -110.685F) - -166)) break;
                    i6 = i4;
                    i4 >>= i2;
                    Test.instanceCount += l;
                    iArr[i5] += 12;
                    i6 -= (int)f;
                    switch (((i5 % 2) * 5) + 55) {
                    case 64:
                        d2 += i2;
                        i4 /= (int)(s1 | 1);
                        Test.instanceCount >>>= i;
                        if (false) {
                            Test.iArrFld[i5 - 1] = 7;
                            lArrFld[i5 - 1] -= l;
                            d2 *= Test.instanceCount;
                        }
                        break;
                    case 57:
                        i6 -= (int)l;
                        f %= 91;
                        Test.iArrFld[i5] = i3;
                        i2 += -53296;
                        break;
                    default:
                        i6 = i1;
                    }
                }
            }
        } while (++i < 325);


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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  dMeth ->  dMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}