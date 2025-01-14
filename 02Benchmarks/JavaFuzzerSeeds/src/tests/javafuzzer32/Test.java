package tests.javafuzzer32;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 21:25:56 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-4183754940890997339L;
    public static double dFld=124.39932;
    public static boolean bFld=false;
    public short sFld=-30798;
    public static byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)106);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i3) {

        float f1=33.492F, f2=118.575F;
        int i4=46, i5=225, i6=-1, i7=0, i8=168, iArr[][]=new int[N][N];

        FuzzerUtils.init(iArr, -10);

        Test.instanceCount >>= i3;
        Test.byArrFld[(i3 >>> 1) % N] += (byte)-3068066407L;
        f1 = i3;
        f1 -= i3;
        Test.instanceCount = 119;
        for (i4 = 19; i4 < 341; ++i4) {
            i3 += (((i4 * i5) + Test.instanceCount) - Test.instanceCount);
            for (f2 = 1; 5 > f2; f2++) {
                i3 += (int)(f2 * i4);
                for (i7 = 1; i7 < 2; ++i7) {
                    i5 = (int)Test.instanceCount;
                }
                iArr[(int)(f2 - 1)][(int)(f2 - 1)] <<= i7;
                Test.dFld %= (i3 | 1);
                Test.instanceCount = Test.instanceCount;
                Test.instanceCount = i7;
            }
        }
        long meth_res = i3 + Float.floatToIntBits(f1) + i4 + i5 + Float.floatToIntBits(f2) + i6 + i7 + i8 +
            FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i1, int i2) {

        double d1=-64.20082;
        int i9=2364, i10=6152, i11=-138, i12=-27630, i13=232, iArr1[]=new int[N];
        long l=-2157209261310491518L;
        float f3=-101.310F;

        FuzzerUtils.init(iArr1, 10);

        if (Test.bFld) {
            Test.instanceCount <<= Math.abs((int)((Test.instanceCount * i2) + iMeth(i1)));
            vMeth_check_sum += i1 + i2 + Double.doubleToLongBits(d1) + i9 + i10 + i11 + i12 + l + i13 +
                Float.floatToIntBits(f3) + FuzzerUtils.checkSum(iArr1);
            return;
        } else if (Test.bFld) {
            Test.dFld = 5523;
            for (d1 = 300; d1 > 6; d1--) {
                i1 = (int)75.65207;
                Test.dFld %= (i9 | 1);
                i2 = (int)-1L;
                Test.instanceCount = (long)Test.dFld;
            }
            i10 = 1;
            do {
                for (i11 = 1; 6 > i11; ++i11) {
                    try {
                        i1 = (iArr1[i11 + 1] / i9);
                        i2 = (-245 / i11);
                        i12 = (i10 / i9);
                    } catch (ArithmeticException a_e) {}
                    i9 = (int)Test.instanceCount;
                    for (l = 2; l > i10; l -= 2) {
                        f3 += (l * l);
                        if (Test.bFld) break;
                    }
                }
            } while (++i10 < 285);
        } else if (Test.bFld) {
            Test.instanceCount -= i13;
        } else {
            i1 -= (int)-18.95592;
        }
        vMeth_check_sum += i1 + i2 + Double.doubleToLongBits(d1) + i9 + i10 + i11 + i12 + l + i13 +
            Float.floatToIntBits(f3) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vSmallMeth(double d, float f) {

        int i14=-103;
        byte by=121;

        vMeth(i14, i14);
        i14 += by;
        vSmallMeth_check_sum += Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i14 + by;
    }

    public void mainTest(String[] strArr1) {

        int i=-2, i15=161, i16=-48, i17=13, i18=-54817, i19=-181, i20=13, iArr2[]=new int[N];
        float f4=-91.812F;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(iArr2, -47144);
        FuzzerUtils.init(bArr, false);

        i = 6;
        for (int smallinvoc=0; smallinvoc<219; smallinvoc++) vSmallMeth(Test.dFld, f4);
        for (i15 = 4; i15 < 292; i15++) {
            i16 <<= i16;
            iArr2[i15 + 1] >>= i15;
            for (i17 = 1; i17 < 87; ++i17) {
                for (i19 = 1; i19 < 2; ++i19) {
                    sFld = (short)i20;
                    Test.instanceCount += (-62 + (i19 * i19));
                    Test.dFld += i;
                    i18 = i17;
                    i18 <<= 144;
                    i20 = (int)f4;
                    i20 >>= i19;
                    i16 = i19;
                    switch (((i15 % 2) * 5) + 44) {
                    case 45:
                        i &= i17;
                        Test.instanceCount = Test.instanceCount;
                        if (false) break;
                        i20 >>= i20;
                        break;
                    case 52:
                        Test.instanceCount += 2;
                        break;
                    default:
                        i18 <<= i18;
                        i16 += (i19 | Test.instanceCount);
                        iArr2[i17] = i18;
                        switch ((i17 % 1) + 92) {
                        case 92:
                            i18 += (i19 - i19);
                            break;
                        }
                    }
                    Test.instanceCount += (long)Test.dFld;
                }
                bArr[i17] = Test.bFld;
                i20 += i17;
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  iMeth ->  iMeth vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
