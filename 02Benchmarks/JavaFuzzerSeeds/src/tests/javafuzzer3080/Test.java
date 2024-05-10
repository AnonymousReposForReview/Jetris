package tests.javafuzzer3080;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 01:32:45 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-66L;
    public int iFld=14;
    public static byte byFld=-93;
    public static boolean bFld=true;
    public int iFld1=-166;
    public static int iFld2=-1;
    public double dFld=110.83509;
    public static float fArrFld[]=new float[N];
    public static long lArrFld[]=new long[N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, -2.223F);
        FuzzerUtils.init(Test.lArrFld, -8163148374140824946L);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i9, long l, long l1) {

        int i10=62619, i11=57246, i12=2, i13=231;
        boolean b=true;
        double d1=0.26541;
        float f3=-71.202F;

        for (i10 = 1; i10 < 150; ++i10) {
            Test.byFld += (byte)(i10 ^ i10);
            for (i12 = 1; i12 < 11; i12++) {
                i9 = 52622;
                if (b) break;
                d1 += Test.instanceCount;
                l = l1;
                switch ((i12 % 2) + 56) {
                case 56:
                    i13 = i11;
                    f3 += (((i12 * i9) + i9) - i11);
                    l1 = -28895;
                    break;
                case 57:
                    if (b) {
                        d1 -= i10;
                    }
                    if (b) break;
                    i13 = -55142;
                    break;
                }
            }
        }
        vMeth_check_sum += i9 + l + l1 + i10 + i11 + i12 + i13 + (b ? 1 : 0) + Double.doubleToLongBits(d1) +
            Float.floatToIntBits(f3);
    }

    public static int iMeth1(double d, short s1, int i8) {

        float f2=2.828F;
        double d2=-24.37917, d3=78.79219;
        int i14=-456, i15=-132, i16=-200, i17=-4, i18=5, i19=10179, iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, -8);

        f2 *= (Test.fArrFld[(i8 >>> 1) % N]++);
        vMeth(i8, Test.instanceCount, Test.instanceCount);
        for (d2 = 11; d2 < 374; ++d2) {
            i8 -= 41;
            if (Test.bFld) break;
            Test.fArrFld[(int)(d2)] -= f2;
            if (i14 != 0) {
            }
            Test.instanceCount += (65 + (d2 * d2));
        }
        for (i15 = 2; i15 < 226; ++i15) {
            for (d3 = i15; 7 > d3; d3++) {
                for (i18 = 1; i18 < 1; i18++) {
                    i16 += i19;
                }
                i17 += (int)(d3 * Test.instanceCount);
                Test.lArrFld[(int)(d3 - 1)] ^= i17;
            }
            iArr1[i15 - 1] += (int)Test.instanceCount;
        }
        long meth_res = Double.doubleToLongBits(d) + s1 + i8 + Float.floatToIntBits(f2) + Double.doubleToLongBits(d2) +
            i14 + i15 + i16 + Double.doubleToLongBits(d3) + i17 + i18 + i19 + FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(float f, int i) {

        int i1=13, i2=9, i3=-10, i4=7, i5=38050, i6=209, i7=57232, iArr[]=new int[N], iArr2[][]=new int[N][N];
        float f1=1.67F, fArr[]=new float[N];
        short s=-20019;
        double d4=-88.64940;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 6);
        FuzzerUtils.init(fArr, -80.1008F);
        FuzzerUtils.init(lArr, 202L);
        FuzzerUtils.init(iArr2, 25);

        Test.byFld = (byte)i;
        Test.instanceCount = (Test.byFld++);
        for (i1 = 2; i1 < 185; ++i1) {
            for (f1 = 1; f1 < 9; f1++) {
                i2 += (int)(-243L + (f1 * f1));
                i = i2;
                iArr[i1 + 1] = (int)Test.instanceCount;
                i = (int)(((-i4) * (i4 - Test.instanceCount)) + Math.abs((int)(Test.instanceCount * i1)));
                for (i5 = 1; 2 > i5; ++i5) {
                    i >>>= (i5 - ((++i) + (i5 + 56486)));
                    fArr[(int)(f1)] = (((i2 * s) - lArr[i1]) * (-(f1 + i7)));
                    i2 += (int)f;
                    f += i1;
                    i6 >>= (((i5 - 79) - Math.abs(5)) * (-99 - iMeth1(d4, s, i)));
                }
                iArr2 = iArr2;
            }
        }
        long meth_res = Float.floatToIntBits(f) + i + i1 + i2 + Float.floatToIntBits(f1) + i3 + i4 + i5 + i6 + s + i7 +
            Double.doubleToLongBits(d4) + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f4=117.347F;
        short s2=-6567;
        int i20=-23550, i21=-17739, i22=1, i23=-10, i24=-12, i25=-104, i26=-10, i27=98;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-85);

        iFld %= (int)((++iFld) | 1);
        iFld = (int)Test.instanceCount;
        iMeth(f4, 23491);
        f4 %= (s2 | 1);
        iFld = iFld;
        for (i20 = 7; i20 < 125; i20++) {
            Test.instanceCount = iFld;
            i21 <<= Test.byFld;
            for (i22 = 11; i22 < 212; ++i22) {
                switch (((i22 % 7) * 5) + 35) {
                case 47:
                    i21 += (((i22 * f4) + i20) - Test.instanceCount);
                    iFld = -73;
                    iFld += iFld;
                    iArrFld[i20] += (int)Test.instanceCount;
                    break;
                case 54:
                    s2 = s2;
                    i23 -= i23;
                    i24 = 1;
                    do {
                        iFld1 += i21;
                        iFld += (int)Test.instanceCount;
                        i21 = 7438;
                        i25 *= -195;
                        iArrFld[i24 + 1] -= i23;
                        iFld1 = Test.iFld2;
                        i21 += (i24 | iFld1);
                    } while (++i24 < 2);
                    for (i26 = 1; i26 < 2; i26++) {
                        Test.instanceCount = i23;
                        f4 += (((i26 * f4) + Test.instanceCount) - i20);
                        iArrFld[i20] -= i26;
                        Test.fArrFld[i22 + 1] += iFld1;
                        i21 *= i27;
                    }
                    break;
                case 64:
                    Test.instanceCount = (long)dFld;
                    break;
                case 61:
                    Test.lArrFld[i22] = -124;
                case 67:
                    try {
                        i27 = (i23 / i24);
                        iFld1 = (1370549203 % iArrFld[i22 + 1]);
                        iFld = (i23 / 19295);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 45:
                    Test.instanceCount += i22;
                    break;
                case 52:
                    byArr = byArr;
                    break;
                default:
                    s2 = (short)i22;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}