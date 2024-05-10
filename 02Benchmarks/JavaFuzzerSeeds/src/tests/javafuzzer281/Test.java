package tests.javafuzzer281;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 01:09:39 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-7198L;
    public float fFld=55.119F;
    public static volatile byte byFld=-50;
    public static long lArrFld[]=new long[N];
    public static volatile int iArrFld[]=new int[N];
    public volatile short sArrFld[]=new short[N];
    public static volatile float fArrFld[]=new float[N];
    public byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 1168320836164353447L);
        FuzzerUtils.init(Test.iArrFld, 60676);
        FuzzerUtils.init(Test.fArrFld, 35.25F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {


        Test.lArrFld = Test.lArrFld;
        long meth_res = 0;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(boolean b) {

        int i1=54695, i2=7998, i3=14, i4=-208, iArr[]=new int[N];
        double d=4.102005;
        float f=-99.214F;

        FuzzerUtils.init(iArr, 11);

        Test.instanceCount *= -71;
        for (int i : iArr) {
            for (i1 = 1; 4 > i1; ++i1) {
                if (b) {
                    b = ((--i) != i);
                    for (i3 = i1; i3 < 2; ++i3) {
                        i *= (int)(d - iMeth());
                        i += (int)Test.instanceCount;
                    }
                    try {
                        i2 = (22269 % iArr[i1 - 1]);
                        i = (-202 % i1);
                        i2 = (iArr[i1] / 43681);
                    } catch (ArithmeticException a_e) {}
                    vMeth1_check_sum += (b ? 1 : 0) + i1 + i2 + i3 + i4 + Double.doubleToLongBits(d) +
                        Float.floatToIntBits(f) + FuzzerUtils.checkSum(iArr);
                    return;
                } else if (b) {
                    iArr[i1 - 1] /= (int)((long)(f) | 1);
                    f = (float)d;
                    d = d;
                    iArr[i1] = i2;
                } else {
                    f += i2;
                }
                i = -28093;
            }
        }
        vMeth1_check_sum += (b ? 1 : 0) + i1 + i2 + i3 + i4 + Double.doubleToLongBits(d) + Float.floatToIntBits(f) +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth() {

        boolean b1=true;
        int i5=54558, i6=-4, i7=176, iArr1[]=new int[N];
        float f1=1.542F;
        byte by=122;

        FuzzerUtils.init(iArr1, 38);

        vMeth1(b1);
        for (i5 = 4; i5 < 201; i5++) {
            i6 -= i6;
            i6 -= i7;
            f1 += i7;
            i6 += (int)f1;
            by -= (byte)87;
            iArr1[(3 >>> 1) % N] += 8;
        }
        i7 &= 56;
        vMeth_check_sum += (b1 ? 1 : 0) + i5 + i6 + i7 + Float.floatToIntBits(f1) + by + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i8=60725, i9=-2492, i10=65173, i11=-57216, i12=-2, i13=2;
        boolean b2=false;
        short s=3384;
        double d1=-52.94065;

        vMeth();
        i8 += i8;
        for (i9 = 2; i9 < 122; i9++) {
            if (b2) break;
            Test.instanceCount += (i9 * i9);
            for (i11 = 8; i11 < 209; ++i11) {
                if (b2) {
                    Test.iArrFld = Test.iArrFld;
                    i10 += (i11 - i10);
                    fFld %= (i8 | 1);
                    i13 = 1;
                    do {
                        i12 += i10;
                        switch (((i9 % 8) * 5) + 62) {
                        case 95:
                            i12 += i10;
                            i12 += (((i13 * Test.instanceCount) + i9) - i12);
                            i8 = i11;
                            s = (short)i13;
                            break;
                        case 82:
                            fFld = Test.instanceCount;
                            i10 = Test.byFld;
                        case 100:
                            i10 -= (int)Test.instanceCount;
                            i8 += (((i13 * Test.instanceCount) + Test.instanceCount) - i13);
                            i8 >>= (int)Test.instanceCount;
                            d1 = 123;
                            break;
                        case 73:
                            i10 += (int)Test.instanceCount;
                            i10 += (i13 * i9);
                            switch (((i9 % 2) * 5) + 12) {
                            case 16:
                                switch (((i11 % 10) * 5) + 46) {
                                case 59:
                                    i10 <<= 29435;
                                    Test.instanceCount <<= i8;
                                    i8 = i13;
                                    break;
                                case 64:
                                    i12 += (((i13 * i9) + i9) - Test.instanceCount);
                                case 54:
                                    Test.iArrFld[i11] = i8;
                                    break;
                                case 47:
                                    sArrFld[i9 - 1] = (short)i8;
                                    break;
                                case 56:
                                    Test.fArrFld[i13] = i8;
                                    break;
                                case 60:
                                    i8 |= (int)-6531704323135329434L;
                                    break;
                                case 89:
                                    i12 = (int)Test.instanceCount;
                                    break;
                                case 94:
                                    i10 = (int)Test.instanceCount;
                                    break;
                                case 73:
                                    i10 -= -40804;
                                    break;
                                case 93:
                                    Test.iArrFld[i13] = i12;
                                default:
                                }
                                break;
                            case 17:
                                i12 -= i8;
                                break;
                            default:
                                i12 = (int)1L;
                            }
                            break;
                        case 64:
                            i8 += (int)Test.instanceCount;
                            break;
                        case 85:
                            i10 = (int)d1;
                            break;
                        case 87:
                            Test.lArrFld[i13] = i12;
                            break;
                        case 92:
                            byArrFld[i9 - 1] = (byte)Test.instanceCount;
                            break;
                        }
                    } while ((i13 += 3) < 2);
                } else {
                    i8 = i13;
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
