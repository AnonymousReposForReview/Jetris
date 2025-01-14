package tests.javafuzzer746;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 08:58:42 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-73494773L;
    public static short sFld=528;
    public static int iFld=-61;
    public static byte byFld=-13;
    public static boolean bFld=true;
    public static float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 2.256F);
        FuzzerUtils.init(Test.iArrFld, -179);
        FuzzerUtils.init(Test.dArrFld, -72.64436);
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static int iMeth(long l1, int i4, int i5) {

        float f=-1.836F;
        int i6=43;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -7922754466990052942L);

        for (f = 15; f < 321; ++f) {
            float f2=62.4F;
            f2 = (((Test.instanceCount = 227) << (--lArr[(int)(f)])) + (Math.min(l1, l1) * (++f2)));
        }
        i4 = -24555;
        long meth_res = l1 + i4 + i5 + Float.floatToIntBits(f) + i6 + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth2(int i9, long l2, byte by1) {

        int i10=-64089, i11=-205, i12=25976, i13=-2;
        float f3=-2.910F;
        long l3=13L;

        i10 = 1;
        do {
            i9 += (((i10 * i10) + Test.instanceCount) - i10);
            i9 += (((i10 * f3) + l2) - f3);
            i9 += i9;
            Test.instanceCount = i9;
            i9 |= i10;
            for (i11 = 1; i11 < 11; i11++) {
                l2 = i11;
                for (l3 = 1; l3 < 2; l3++) {
                    i9 += (int)(l3 + f3);
                    try {
                        i12 = (i9 / -190);
                        i12 = (86201791 / Test.iArrFld[i10]);
                        i12 = (i11 / 190);
                    } catch (ArithmeticException a_e) {}
                    i9 = i12;
                    i13 = 140;
                }
                Test.iArrFld[i11 + 1] -= Test.sFld;
                i12 += i11;
            }
        } while (++i10 < 140);
        vMeth2_check_sum += i9 + l2 + by1 + i10 + Float.floatToIntBits(f3) + i11 + i12 + l3 + i13;
    }

    public static void vMeth1(double d, int i7, int i8) {

        byte by2=65;
        int i14=250, i15=-36181, i16=99, i17=14, i18=-9, i19=-7, i20=-43, i21=-83, i22=-1417;
        boolean b=false;

        vMeth2(i7, Test.instanceCount, by2);
        Test.sFld += (short)Test.instanceCount;
        for (i14 = 1; i14 < 297; ++i14) {
            for (i16 = 1; i16 < 6; ++i16) {
                i18 = (int)3L;
                i18 -= i7;
                b = b;
            }
            Test.iArrFld[i14 - 1] = i7;
            for (i19 = 1; 6 > i19; i19++) {
                i21 *= i19;
                if (b) break;
                i15 = i22;
                d -= i21;
                i21 -= (int)Test.instanceCount;
                i7 >>= 41197;
            }
        }
        vMeth1_check_sum += Double.doubleToLongBits(d) + i7 + i8 + by2 + i14 + i15 + i16 + i17 + i18 + (b ? 1 : 0) +
            i19 + i20 + i21 + i22;
    }

    public void vMeth(long l) {

        int i=11, i1=-36810, i2=133, i3=-178, i23=169, i24=-4, i25=-7, i26=-207, i27=10;
        byte by=81;
        float f4=-2.284F;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 0.34398);

        for (i = 8; i < 359; ++i) {
            for (i2 = 1; 5 > i2; i2++) {
                Test.instanceCount = ((iMeth(l, i3, i3) % ((Test.instanceCount * i3) | 1)) + by);
                vMeth1(59.104165, i1, i);
                i23 = 1;
                do {
                    i1 += i23;
                    l -= (long)f4;
                    i1 += (i23 * i23);
                    f4 *= i;
                    dArr[i] += i1;
                    i3 |= i3;
                } while (++i23 < 2);
            }
        }
        for (i24 = 5; i24 < 195; ++i24) {
            for (i26 = 1; i26 < 8; ++i26) {
                i3 = -6;
                Test.iArrFld[i26 - 1] = by;
            }
        }
        vMeth_check_sum += l + i + i1 + i2 + i3 + by + i23 + Float.floatToIntBits(f4) + i24 + i25 + i26 + i27 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        float f5=-61.688F, f6=2.262F, f7=41.373F;
        int i28=76, i29=-23044, i30=27297, i31=42007, i32=-48121, i33=7, i34=41360, i35=-179, iArr[][]=new int[N][N];
        double d1=100.122600;

        FuzzerUtils.init(iArr, 10);

        vMeth(Test.instanceCount);
        f5 += f5;
        i28 = 1;
        do {
            Test.iFld = Test.byFld;
            for (i29 = 116; i29 > i28; --i29) {
                iArr = FuzzerUtils.int2array(N, (int)-187);
                i31 = Test.iFld;
                i31 <<= (int)2L;
                Test.iFld = (int)Test.instanceCount;
                Test.iArrFld[i28 - 1] += i30;
                Test.iFld >>= i29;
            }
            for (i32 = 6; i32 < 116; i32 += 3) {
                switch (((i32 % 9) * 5) + 127) {
                case 133:
                    i33 -= (int)Test.instanceCount;
                    break;
                case 136:
                    Test.instanceCount = Test.instanceCount;
                    Test.iFld += (-39555 + (i32 * i32));
                    i30 /= (int)(i31 | 1);
                    break;
                case 147:
                    Test.byFld %= (byte)(i31 | 1);
                    for (f6 = 1; f6 < 4; f6++) {
                        i33 += (int)(((f6 * i30) + i33) - i31);
                        Test.dArrFld[i32] += Test.instanceCount;
                        i30 -= (int)f5;
                        Test.iFld <<= 10;
                    }
                    for (f7 = i32; f7 < 4; f7++) {
                        Test.instanceCount = -12;
                        i35 += (12 + (f7 * f7));
                        Test.bArrFld[(int)(f7)] = Test.bFld;
                        Test.iFld += -12;
                    }
                    break;
                case 150:
                    Test.byFld -= (byte)i29;
                    break;
                case 142:
                    try {
                        i33 = (1848138752 % i29);
                        i30 = (Test.iFld / -246);
                        Test.iArrFld[i32] = (i35 / -35);
                    } catch (ArithmeticException a_e) {}
                case 141:
                    i33 = i34;
                case 144:
                    Test.iFld += i32;
                    break;
                case 151:
                    d1 *= i28;
                    break;
                case 143:
                default:
                    Test.sFld = (short)-2699L;
                }
            }
        } while (++i28 < 217);


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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
