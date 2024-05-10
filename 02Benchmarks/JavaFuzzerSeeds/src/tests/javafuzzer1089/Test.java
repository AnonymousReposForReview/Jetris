package tests.javafuzzer1089;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 14:16:31 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3588485863758129304L;
    public static short sFld=18078;
    public static float fFld=-2.512F;
    public volatile int iFld=7419;
    public static int iFld1=-2;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -5977955091454514528L);
        FuzzerUtils.init(Test.iArrFld, 62969);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l1) {

        double d1=-23.24631;
        int i4=-7, i5=14, i6=-196, i7=-6, iArr[][]=new int[N][N];
        float f=0.162F, f1=-109.897F;
        boolean b1=true;

        FuzzerUtils.init(iArr, 14);

        for (d1 = 2; d1 < 122; ++d1) {
            for (i5 = 1; i5 < 13; ++i5) {
                l1 = i5;
            }
            l1 += (long)(((d1 * i5) + f) - i5);
            l1 += l1;
            iArr[(int)(d1 + 1)][(int)(d1 + 1)] *= (int)Test.instanceCount;
            try {
                i4 = (-23714 % i4);
                i4 = (-2069124896 % iArr[(int)(d1 - 1)][(int)(d1 - 1)]);
                i6 = (i6 % 12485);
            } catch (ArithmeticException a_e) {}
            for (f1 = 1; f1 < 13; ++f1) {
                Test.lArrFld[(int)(d1 + 1)] *= i5;
                i7 += (int)(f1 * f1);
                i4 += (int)f1;
                if (b1) break;
            }
            i7 = Test.sFld;
        }
        i7 *= i7;
        f %= 12;
        vMeth2_check_sum += l1 + Double.doubleToLongBits(d1) + i4 + i5 + i6 + Float.floatToIntBits(f) +
            Float.floatToIntBits(f1) + i7 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(double d, int i2, boolean b) {

        short s=25225;
        int i3=224, i8=-14, i9=152, iArr1[]=new int[N];
        float f2=-50.183F;

        FuzzerUtils.init(iArr1, 14);

        d = (s--);
        i3 -= (int)(++Test.instanceCount);
        vMeth2(Test.instanceCount);
        f2 = Test.instanceCount;
        i2 -= (int)f2;
        for (i8 = 5; 123 > i8; ++i8) {
            i2 = Test.sFld;
            Test.instanceCount = 59022;
        }
        i9 += i9;
        Test.instanceCount = i8;
        iArr1[(227 >>> 1) % N] -= (int)837514787031403492L;
        i2 >>= i3;
        vMeth1_check_sum += Double.doubleToLongBits(d) + i2 + (b ? 1 : 0) + s + i3 + Float.floatToIntBits(f2) + i8 + i9
            + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i, int i1, long l) {

        double d2=-2.31377;
        int i10=-252, i11=-4017, i12=10, i13=-139, i14=55, i15=-10, i16=-80;
        boolean b2=false;
        byte by=89;

        vMeth1(d2, i10, b2);
        Test.lArrFld[(8 >>> 1) % N] = Test.sFld;
        l = Test.instanceCount;
        for (i11 = 9; i11 < 168; ++i11) {
            if (b2) {
                i1 = Test.sFld;
                for (i13 = 1; i13 < 10; ++i13) {
                    for (i15 = 1; i15 < 2; ++i15) {
                        i16 += i15;
                        i16 += (i15 - i14);
                        Test.fFld += (-8 + (i15 * i15));
                        d2 %= (by | 1);
                        i12 *= i1;
                        Test.fFld += i11;
                    }
                    l -= i;
                }
            }
        }
        vMeth_check_sum += i + i1 + l + Double.doubleToLongBits(d2) + i10 + (b2 ? 1 : 0) + i11 + i12 + i13 + i14 + i15
            + i16 + by;
    }

    public void mainTest(String[] strArr1) {

        int i17=-7135, i18=-167, i19=60220, i20=-4, i21=-83, i22=13, i23=-14, i24=-183, i25=-196, i26=-7;
        double d3=0.81775, dArr[]=new double[N];
        byte by1=-122;

        FuzzerUtils.init(dArr, 12.19158);

        vMeth(iFld, iFld, Test.instanceCount);
        Test.instanceCount >>= 6;
        Test.instanceCount <<= iFld;
        for (i17 = 15; i17 < 304; i17++) {
            for (i19 = i17; i19 < 87; ++i19) {
                Test.lArrFld[i17] -= (long)d3;
                Test.instanceCount -= iFld;
                by1 -= (byte)i18;
                i18 = (int)Test.instanceCount;
                i18 = (int)-1.784F;
            }
            i20 += i20;
            Test.iArrFld[i17 + 1] += (int)Test.fFld;
            i20 = i18;
            i20 -= i17;
            i20 >>= i18;
        }
        for (i21 = 19; i21 < 320; i21++) {
            Test.sFld += (short)Test.instanceCount;
            i22 = (int)d3;
            Test.instanceCount >>= Test.instanceCount;
            Test.fFld += (((i21 * iFld) + Test.iFld1) - Test.instanceCount);
            for (i23 = 3; 84 > i23; i23++) {
                Test.sFld = (short)i20;
                i22 += i19;
                dArr[i23 + 1] = 2.541F;
                i22 = i19;
                if (true) break;
                i24 += (4 + (i23 * i23));
            }
        }
        for (i25 = 364; i25 > 3; --i25) {
            i20 = i22;
            dArr[i25 + 1] -= i21;
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
