package tests.javafuzzer3411;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 07:37:10 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=48139L;
    public int iFld=5;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 2L);
        FuzzerUtils.init(Test.iArrFld, -13);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i9, long l) {

        int i10=-163, i11=17716, i12=-37737, i13=2161, i14=244;
        double d=1.50679, d1=-1.90030;
        float f1=-2.573F;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, true);

        Test.iArrFld[(i9 >>> 1) % N] = 195;
        for (i10 = 10; 257 > i10; i10++) {
            i11 += (int)Test.instanceCount;
            d *= 1.169F;
            i9 = i10;
            i11 += (i10 * i10);
            for (d1 = i10; d1 < 7; ++d1) {
                i9 = i10;
                i11 *= (int)114.861F;
                try {
                    i12 = (i12 % i9);
                    Test.iArrFld[(int)(d1 + 1)] = (i10 % Test.iArrFld[(int)(d1 - 1)]);
                    Test.iArrFld[i10] = (56706 % Test.iArrFld[i10 + 1]);
                } catch (ArithmeticException a_e) {}
                i9 -= (int)f1;
                try {
                    Test.iArrFld[i10 + 1] = (i12 % -60);
                    i11 = (-36888 % i12);
                    i12 = (i10 / 13);
                } catch (ArithmeticException a_e) {}
                for (i13 = 1; i13 < 1; i13++) {
                    f1 -= 223L;
                    bArr[(int)(d1 + 1)] = false;
                }
            }
        }
        long meth_res = i9 + l + i10 + i11 + Double.doubleToLongBits(d) + Double.doubleToLongBits(d1) + i12 +
            Float.floatToIntBits(f1) + i13 + i14 + FuzzerUtils.checkSum(bArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(short s) {

        int i8=159;
        boolean b=true;

        Test.instanceCount = (Test.instanceCount /= (i8 | 1));
        if (b) {
            i8 *= (int)(iMeth1(10, -2L) + Test.instanceCount);
        }
        long meth_res = s + i8 + (b ? 1 : 0);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i6, int i7) {

        float f=1.331F;
        short s1=14971;
        int i15=33662, i16=-40323, i17=65515, i18=229, i19=13;
        boolean b1=false;
        byte by=-59;

        f = ((i6--) - iMeth(s1));
        for (i15 = 2; i15 < 140; i15++) {
            i17 = 1;
            while (++i17 < 11) {
                double d2=-1.96777;
                i7 += (i17 * i17);
                switch ((i17 % 7) + 11) {
                case 11:
                    i16 -= (int)f;
                    i7 = i17;
                    break;
                case 12:
                    Test.instanceCount *= (long)d2;
                    for (i18 = 1; 1 > i18; ++i18) {
                        i16 *= i7;
                        i16 *= 11798;
                        i7 >>= i18;
                        b1 = b1;
                        Test.iArrFld = Test.iArrFld;
                        i19 = i7;
                    }
                    break;
                case 13:
                    Test.iArrFld[i17] -= 0;
                    break;
                case 14:
                    by >>= (byte)i19;
                    break;
                case 15:
                    Test.instanceCount = (long)f;
                case 16:
                    Test.instanceCount = i18;
                case 17:
                    Test.iArrFld[(i6 >>> 1) % N] >>= i16;
                    break;
                default:
                    i19 -= i17;
                }
            }
        }
        vMeth_check_sum += i6 + i7 + Float.floatToIntBits(f) + s1 + i15 + i16 + i17 + i18 + i19 + (b1 ? 1 : 0) + by;
    }

    public void mainTest(String[] strArr1) {

        int i=10519, i1=185, i2=154, i3=-162, i4=-171, i5=40117, i20=136, i21=52489;
        double d3=-2.20279, dArr[]=new double[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(dArr, 104.117024);
        FuzzerUtils.init(byArr, (byte)-3);

        for (i = 1; i < 178; ++i) {
            for (i2 = i; i2 < 142; i2++) {
                i1 -= (int)Test.lArrFld[i + 1];
                i3 -= i1;
                for (i4 = 1; i4 > 1; --i4) {
                    Test.lArrFld[(0 >>> 1) % N] += (long)(dArr[i2 - 1]++);
                    switch ((i2 % 2) + 21) {
                    case 21:
                        i3 += (i4 * Test.instanceCount);
                        break;
                    case 22:
                        Test.instanceCount /= -12;
                        i3 += (i4 + Test.instanceCount);
                        break;
                    }
                    Test.instanceCount *= (((i3 - i3) - i3) * ((++i1) * (Test.instanceCount * i2)));
                    i3 *= i3;
                    byArr[i - 1] -= (byte)Test.instanceCount;
                    i3 *= (++i3);
                    vMeth(i3, i1);
                    i1 -= i3;
                }
                i3 -= 116;
                i3 = (int)d3;
                i3 += (i2 * i2);
                for (i20 = 1; 1 > i20; ++i20) {
                    switch ((i2 % 10) + 49) {
                    case 49:
                        i21 += i20;
                        dArr[i2 + 1] = i21;
                        break;
                    case 50:
                        i21 += i20;
                        dArr[i20] += -28816;
                        i21 += (int)Test.instanceCount;
                        i3 += i2;
                        break;
                    case 51:
                        i21 += (int)Test.instanceCount;
                        i21 = i1;
                    case 52:
                        i5 = (int)Test.instanceCount;
                    case 53:
                        i1 = (int)Test.instanceCount;
                        break;
                    case 54:
                    case 55:
                        Test.iArrFld[i20 - 1] -= (int)Test.instanceCount;
                        break;
                    case 56:
                        i21 -= i1;
                        break;
                    case 57:
                        i5 ^= iFld;
                    case 58:
                        iFld = i21;
                        break;
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
