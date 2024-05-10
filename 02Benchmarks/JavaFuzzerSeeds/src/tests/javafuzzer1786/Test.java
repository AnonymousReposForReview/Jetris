package tests.javafuzzer1786;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 03:20:22 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=7108675707148648689L;
    public static double dFld=29.57134;
    public volatile byte byFld=-122;
    public static long lArrFld[]=new long[N];
    public boolean bArrFld[]=new boolean[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 52L);
        FuzzerUtils.init(Test.iArrFld, 62487);
    }

    public static long vMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(int i8) {

        int i9=-158, i10=-13, i12=221, i13=70, i14=-12, iArr[]=new int[N];
        byte by=-87;
        float f=-21.68F;
        double d1=0.7219;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 33L);
        FuzzerUtils.init(iArr, 27111);

        for (i9 = 1; i9 < 370; ++i9) {
            int i11=-9;
            i11 &= i8;
            by += (byte)(i9 | i11);
            for (i12 = 1; i12 < 5; ++i12) {
                float f1=1.671F;
                Test.instanceCount += (i12 + Test.instanceCount);
                i10 += (int)(-51506L + (i12 * i12));
                for (f = 1; f < 2; f++) {
                    lArr = lArr;
                    d1 *= i11;
                    try {
                        i13 = (i8 / i9);
                        i13 = (i14 / iArr[i9]);
                        i14 = (-105 % i9);
                    } catch (ArithmeticException a_e) {}
                    i8 = i13;
                    i13 |= i12;
                }
                d1 -= i10;
                i11 = i12;
                f1 += (i12 * i10);
            }
        }
        long meth_res = i8 + i9 + i10 + by + i12 + i13 + Float.floatToIntBits(f) + i14 + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static boolean bMeth() {

        int i7=62496;

        i7 += (int)Float.intBitsToFloat((int)(fMeth(i7) + i7));
        Test.dFld += 409710175L;
        Test.lArrFld[(i7 >>> 1) % N] = i7;
        i7 = i7;
        i7 <<= i7;
        long meth_res = i7;
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void vMeth(int i, int i1, double d) {

        int i2=1437, i3=-5, i4=44317, i5=55, i6=227, iArr1[]=new int[N], iArr2[]=new int[N];
        boolean b=true;
        short s=-19240;

        FuzzerUtils.init(iArr1, -24721);
        FuzzerUtils.init(iArr2, -24);

        for (i2 = 218; i2 > 10; --i2) {
            switch (((i2 % 4) * 5) + 89) {
            case 104:
                i4 = 1;
                while (++i4 < 8) {
                    i3 *= (int)(i + Long.reverseBytes(i4 - i3));
                    d = (-Integer.reverseBytes((int)(99 >>> (i2 + 4112356939L))));
                    for (i5 = 1; i5 > 1; --i5) {
                        b = bMeth();
                        if (b) continue;
                        iArr1 = iArr2;
                        try {
                            iArr2[i5 - 1] = (-47073 / i1);
                            i3 = (73 % i4);
                            i6 = (iArr2[i5] % iArr2[i5 - 1]);
                        } catch (ArithmeticException a_e) {}
                        iArr2[i2] = i4;
                        i <<= i2;
                        i3 >>= s;
                        Test.instanceCount = s;
                    }
                    i1 += 54278;
                }
                break;
            case 96:
                Test.instanceCount += (i2 + i4);
                break;
            case 99:
                i3 = s;
                break;
            case 100:
                i3 = i6;
                break;
            }
        }
        vMeth_check_sum += i + i1 + Double.doubleToLongBits(d) + i2 + i3 + i4 + i5 + i6 + (b ? 1 : 0) + s +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i15=103, i16=-11, i17=-3732, i18=-48963, i19=19, i20=25069, i21=-18163, i22=-13, i23=21;
        short s1=10094;
        float f2=2.7F;
        boolean b1=true;

        vMeth(i15, -11, -24.40381);
        s1 += (short)i15;
        i15 = i15;
        i15 -= 69;
        i15 = 786;
        byFld *= (byte)i15;
        for (i16 = 15; i16 < 262; i16++) {
            i15 = 44651;
            f2 += (i16 + i15);
            for (i18 = 5; i18 < 102; ++i18) {
                f2 *= -13;
                Test.dFld = i18;
                i17 += i18;
                i20 = 1;
                do {
                    Test.instanceCount = i16;
                    Test.instanceCount -= i18;
                    bArrFld[i16] = b1;
                    i17 += (int)Test.dFld;
                    i15 = (int)Test.instanceCount;
                    Test.lArrFld[i16 - 1] ^= byFld;
                } while (++i20 < 2);
                for (i21 = 1; i21 < 2; ++i21) {
                    i22 <<= -235;
                    i19 = i22;
                    Test.iArrFld = Test.iArrFld;
                    Test.iArrFld = Test.iArrFld;
                    i19 += i16;
                    i19 *= i21;
                    Test.iArrFld[i16 + 1] >>>= (int)Test.instanceCount;
                    i23 += i17;
                }
                i22 = (int)Test.instanceCount;
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
//DEBUG  bMeth ->  bMeth vMeth mainTest
//DEBUG  fMeth ->  fMeth bMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}