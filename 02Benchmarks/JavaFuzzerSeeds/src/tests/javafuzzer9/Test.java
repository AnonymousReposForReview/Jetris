package tests.javafuzzer9;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 20:59:42 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2492062148913809160L;
    public float fFld=0.959F;
    public double dFld=-81.12594;
    public static boolean bFld=true;
    public static byte byFld=82;
    public static volatile short sFld=-28353;
    public static double dFld1=-90.74256;
    public static volatile byte byArrFld[]=new byte[N];
    public static volatile int iArrFld[]=new int[N];
    public static short sArrFld[][]=new short[N][N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)77);
        FuzzerUtils.init(Test.iArrFld, -87);
        FuzzerUtils.init(Test.sArrFld, (short)-18891);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;
    public static long iMeth3_check_sum = 0;

    public static int iMeth1(int i3, int i4) {

        int i5=7, i6=-252, i7=9, i8=-3, iArr1[]=new int[N];
        float f=2.1016F;
        short s=-13756;
        byte by1=-26;
        long l3=4L, lArr[]=new long[N];

        FuzzerUtils.init(iArr1, -14);
        FuzzerUtils.init(lArr, -3726423746726386448L);

        i3 <<= i3;
        for (i5 = 5; i5 < 237; i5++) {
            switch (((i5 % 1) * 5) + 21) {
            case 23:
                iArr1[i5 - 1] -= iArr1[i5];
                for (i7 = 1; i7 < 7; i7++) {
                    f += f;
                    i8 -= (i3 -= ((-(s * i3)) + iArr1[i5]));
                    switch (((i5 % 6) * 5) + 14) {
                    case 18:
                        i8 -= (--i8);
                        break;
                    case 26:
                        i6 += (i7 * i4);
                        i8 += (((i7 * Test.instanceCount) + f) - i3);
                    case 16:
                    case 33:
                        switch ((((((int)(Test.instanceCount + by1)) >>> 1) % 2) * 5) + 47) {
                        case 54:
                            iArr1 = (iArr1 = (iArr1 = (iArr1 = iArr1)));
                            Test.byArrFld[i5] *= (byte)(++lArr[i7]);
                            l3 += (i7 + i6);
                            break;
                        case 49:
                            Test.instanceCount = (-((i8 - i4) + (79 + (-8 | (i8 % 57)))));
                            break;
                        }
                    case 22:
                        lArr[i7] = 52528;
                    case 39:
                        i3 = 88;
                        break;
                    }
                }
            default:
                iArr1[i5] *= ((i8 /= (int)((--iArr1[i5 - 1]) | 1)) - by1);
            }
        }
        long meth_res = i3 + i4 + i5 + i6 + i7 + i8 + Float.floatToIntBits(f) + s + by1 + l3 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth3(int i11) {

        byte by2=14;
        int i12=0, i13=5, i14=-12, i15=134, i16=5, i17=-23;
        double d=0.60068;

        Test.iArrFld[(i11 >>> 1) % N] = by2;
        Test.instanceCount -= i11;
        Test.bFld = Test.bFld;
        for (i12 = 20; i12 < 327; ++i12) {
            d = i13;
            i11 += (i12 - i13);
            try {
                i11 = (174 / Test.iArrFld[i12]);
                i13 = (187 / i12);
                Test.iArrFld[i12 - 1] = (-656515055 % i11);
            } catch (ArithmeticException a_e) {}
            for (i14 = 1; i14 < 5; ++i14) {
                i13 += (((i14 * i13) + i12) - i14);
                i13 -= i14;
            }
            i15 *= (int)Test.instanceCount;
            for (i16 = 5; i16 > 1; --i16) {
                if (Test.bFld) continue;
                Test.instanceCount -= i12;
            }
            Test.iArrFld = Test.iArrFld;
        }
        long meth_res = i11 + by2 + i12 + i13 + Double.doubleToLongBits(d) + i14 + i15 + i16 + i17;
        iMeth3_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth2(int i10) {

        short s1=253;
        int i18=-33, i19=6912, i20=-59266, i21=162, i22=27410, i23=8, i24=-33, i25=-38684;
        byte by3=71;

        s1 <<= (short)i10;
        i10 *= (iMeth3(i10) - i10);
        for (i18 = 2; i18 < 348; i18++) {
            Test.sArrFld[i18 + 1][i18 + 1] <<= (short)i19;
            for (i20 = 1; i20 < 5; i20++) {
                Test.instanceCount += i19;
                i21 += i10;
                i10 = i19;
                for (i22 = 1; i22 < 2; i22++) {
                    i19 -= -4272;
                    i10 = (int)Test.instanceCount;
                }
            }
            for (i24 = 1; i24 < 5; i24++) {
                i10 -= by3;
                if (i21 != 0) {
                }
                i23 += i10;
            }
        }
        long meth_res = i10 + s1 + i18 + i19 + i20 + i21 + i22 + i23 + i24 + i25 + by3;
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(long l1, boolean b1, long l2) {

        int i9=-2, i26=-39743, i27=0, i28=-171, i29=81, i30=-221, i31=-59969;
        long l4=10L;

        iMeth1((int)(Test.iArrFld[(i9 >>> 1) % N] %= (int)(Math.abs(i9 - -124) | 1)), iMeth2(i9));
        i26 = 1;
        do {
            Test.iArrFld[i26 - 1] = -46;
        } while (++i26 < 126);
        i9 = (int)Test.instanceCount;
        i9 = (int)l1;
        l1 -= Test.instanceCount;
        for (l4 = 3; l4 < 237; ++l4) {
            l2 = l1;
            for (i28 = 1; i28 < 7; i28 += 2) {
                l1 *= Test.byFld;
            }
            Test.instanceCount = Test.sFld;
            for (i30 = 1; i30 < 7; ++i30) {
                Test.dFld1 -= i29;
                i27 -= i26;
                Test.instanceCount ^= i29;
            }
        }
        long meth_res = l1 + (b1 ? 1 : 0) + l2 + i9 + i26 + l4 + i27 + i28 + i29 + i30 + i31;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=174, i1=3, i2=-3, i32=10, i33=-12877, i34=-2, iArr[]=new int[N];
        long l=4650979102006440268L, lArr1[]=new long[N];
        boolean b=false;
        byte by=19;
        double d1=-1.128410;

        FuzzerUtils.init(iArr, 46743);
        FuzzerUtils.init(lArr1, -250L);

        i = 1;
        do {
            fFld = (++Test.instanceCount);
            fFld += i;
            for (l = i; l < 162; l++) {
                i2 = 1;
                while ((i2 -= 3) > 0) {
                    if (b) break;
                    by += (byte)((iArr[(i1 >>> 1) % N] + (dFld + i2)) + iMeth(Test.instanceCount, Test.bFld, 6L));
                    Test.instanceCount += (11 + (i2 * i2));
                    fFld -= Test.instanceCount;
                }
            }
            Test.iArrFld[i] = i;
            i1 = i1;
            for (i32 = 5; i32 < 162; ++i32) {
                i33 += -228;
                i1 += (i32 * i32);
                switch ((i32 % 5) + 124) {
                case 124:
                case 125:
                    i1 |= i1;
                    break;
                case 126:
                    iArr[i - 1] -= i;
                    Test.sFld += (short)i32;
                case 127:
                    Test.instanceCount += i32;
                    for (d1 = i32; d1 < 2; ++d1) {
                        i33 += (int)(d1 * d1);
                        i1 = i32;
                        i34 -= i;
                        i1 -= i32;
                        i34 += i;
                        i33 >>= i2;
                        lArr1 = lArr1;
                        i33 = i34;
                        i34 -= i33;
                    }
                    by = (byte)Test.instanceCount;
                    break;
                case 128:
                    iArr[i32 + 1] = i2;
                default:
                    if (b) continue;
                }
            }
        } while (++i < 155);


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
//DEBUG  iMeth2 ->  iMeth2 iMeth mainTest
//DEBUG  iMeth3 ->  iMeth3 iMeth2 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
