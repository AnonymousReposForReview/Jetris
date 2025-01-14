package tests.javafuzzer3404;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 07:31:05 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-687448994559290607L;
    public static double dFld=-21.50705;
    public byte byFld=102;
    public static int iArrFld[]=new int[N];
    public static volatile double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -21117);
        FuzzerUtils.init(Test.dArrFld, -12.1499);
    }

    public static long fMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long fMeth1_check_sum = 0;

    public static float fMeth1(int i7) {

        float f=-32.232F;
        boolean b=false;

        i7 -= 0;
        i7 -= 110;
        Test.iArrFld[(i7 >>> 1) % N] -= i7;
        Test.dFld -= i7;
        i7 = i7;
        f = f;
        b = b;
        Test.dFld -= i7;
        f = i7;
        Test.iArrFld[(i7 >>> 1) % N] = i7;
        Test.dArrFld[(13 >>> 1) % N] = 1;
        f += (float)Test.dFld;
        Test.instanceCount >>= i7;
        f = i7;
        long meth_res = i7 + Float.floatToIntBits(f) + (b ? 1 : 0);
        fMeth1_check_sum += meth_res;
        return (float)meth_res;
    }

    public static int iMeth(int i2, long l, int i3) {

        int i4=-14118, i5=16852, i8=-10, i9=4, i10=-33914, i11=-2, i12=-40203;
        short s=-30583;
        float f1=0.582F;

        Test.iArrFld[(i3 >>> 1) % N] = (++i3);
        for (i4 = 6; i4 < 157; ++i4) {
            int i6=2;
            i3 <<= (int)(s * ((i3 - -151L) + (Test.instanceCount * i2)));
            try {
                i3 = (-20931 / i3);
                i6 = (i2 % Test.iArrFld[i4]);
                i6 = (i4 / 193);
            } catch (ArithmeticException a_e) {}
            i6 -= (int)(fMeth1(31) * 245);
            i6 = (int)f1;
            i5 >>= (int)l;
        }
        for (i8 = 10; i8 < 349; i8++) {
            i10 = 1;
            while (++i10 < 5) {
                for (i11 = 1; i11 < 1; i11++) {
                    if (false) break;
                    Test.iArrFld[i11] = (int)1.32482;
                    Test.iArrFld[i10 + 1] /= (int)((long)(f1) | 1);
                    i3 += i11;
                    i2 += (i11 * i11);
                }
            }
        }
        long meth_res = i2 + l + i3 + i4 + i5 + s + Float.floatToIntBits(f1) + i8 + i9 + i10 + i11 + i12;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static float fMeth(byte by, byte by1) {

        int i=-182, i1=50337, i13=3, i14=-43011;
        double d=98.20197;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -9L);

        for (i = 14; 295 > i; i++) {
            lArr[i] -= (long)d;
            Test.iArrFld[i + 1] <<= iMeth(i1, Test.instanceCount, i);
            i1 -= i;
            i1 += (i + i1);
            i1 &= (int)Test.instanceCount;
            Test.iArrFld[i] += -21832;
            for (i13 = 6; i < i13; i13--) {
                float f2=2.248F;
                Test.instanceCount >>= i13;
                by += (byte)f2;
                Test.instanceCount = i14;
                Test.instanceCount *= i;
                i1 -= i;
                Test.instanceCount = 2334952598204271384L;
            }
            by -= (byte)30594;
        }
        long meth_res = by + by1 + i + i1 + Double.doubleToLongBits(d) + i13 + i14 + FuzzerUtils.checkSum(lArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i15=4, i16=111, i17=-49, i18=-2704, i19=-11, i20=-42805, i21=-187, i22=77, i23=17153;
        float f3=-2.279F, f4=-69.349F;
        boolean b1=true;
        long l1=7477593859534931072L;

        Test.instanceCount = (long)fMeth(byFld, byFld);
        for (i15 = 234; i15 > 11; i15--) {
            Test.instanceCount += (long)-92.225F;
        }
        i16 ^= (int)Test.instanceCount;
        i17 = 1;
        do {
            short s1=2870;
            i16 += (((i17 * i15) + f3) - i15);
            i16 = i17;
            Test.instanceCount += i17;
            i16 = i15;
            switch (((i17 >>> 1) % 5) + 105) {
            case 105:
                i16 += (i17 | s1);
                i16 = 44108;
                Test.dFld = i15;
                s1 += (short)(i17 + i15);
                break;
            case 106:
                i16 = i17;
            case 107:
                f3 += (((i17 * f3) + i17) - i17);
                i16 = i16;
                Test.instanceCount = -62659;
                for (i18 = 368; i18 > 8; --i18) {
                    i19 = (int)Test.instanceCount;
                    byFld += (byte)(0L + (i18 * i18));
                    i16 -= i18;
                    switch ((i17 % 3) + 50) {
                    case 50:
                    case 51:
                        i16 = (int)Test.instanceCount;
                        for (f4 = 1; f4 < 2; ++f4) {
                            b1 = b1;
                            i16 = i19;
                        }
                        for (l1 = 1; l1 < 2; ++l1) {
                            try {
                                i19 = (i19 / Test.iArrFld[i18 - 1]);
                                i16 = (i16 % i16);
                                i21 = (i17 % 19);
                            } catch (ArithmeticException a_e) {}
                            i22 += (int)(((l1 * i23) + i17) - i23);
                        }
                        break;
                    case 52:
                        f3 *= 11;
                    }
                }
                break;
            case 108:
                b1 = b1;
                break;
            case 109:
                Test.iArrFld[i17 + 1] <<= i19;
                break;
            default:
                i16 += (i17 * i17);
            }
        } while ((i17 += 2) < 136);


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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  iMeth ->  iMeth fMeth mainTest
//DEBUG  fMeth1 ->  fMeth1 iMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
