package tests.javafuzzer1527;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 22:10:39 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=254L;
    public static volatile double dFld=0.53822;
    public static byte byFld=8;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -59885L);
        FuzzerUtils.init(Test.iArrFld, -9);
    }

    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        short s=-12610;
        int i3=37548, i4=19151, i5=63, i6=63019, i7=8518, i8=-1, i9=2;
        double d=-1.1607;
        float f1=-1.640F;

        Test.instanceCount -= s;
        for (i3 = 324; 10 < i3; i3--) {
            i4 <<= (int)Test.instanceCount;
            for (i5 = 1; i5 < 5; i5 += 2) {
                for (i7 = 1; i7 < 3; ++i7) {
                    i8 += (int)1679516441L;
                }
                for (d = i3; d < 3; ++d) {
                    i6 *= i7;
                    switch ((i5 % 2) + 124) {
                    case 124:
                        i9 += i5;
                        i4 <<= 109;
                        Test.lArrFld[i3 + 1] >>= i8;
                        break;
                    case 125:
                        i9 = 164;
                        f1 = i5;
                        i4 += (int)Test.instanceCount;
                    }
                }
            }
        }
        vMeth1_check_sum += s + i3 + i4 + i5 + i6 + i7 + i8 + Double.doubleToLongBits(d) + i9 +
            Float.floatToIntBits(f1);
    }

    public static double dMeth(int i1, int i2) {

        int i10=43, i11=-83, i12=6, i13=140, i14=-151, i15=169, i16=-36282;
        byte by=8;
        short s1=-29738;
        float f2=-2.314F;

        vMeth1();
        i1 >>= i1;
        i10 = 1;
        while (++i10 < 135) {
            for (i11 = 12; i11 > 1; --i11) {
                Test.instanceCount = i12;
                Test.iArrFld[i10 - 1] <<= (int)Test.instanceCount;
                i12 += (((i11 * by) + Test.instanceCount) - s1);
                Test.instanceCount = i11;
                i12 += i10;
                for (i13 = 1; i13 < 2; ++i13) {
                    i1 = 122;
                }
                f2 += (float)Test.dFld;
            }
        }
        for (i15 = 5; i15 < 121; ++i15) {
            Test.instanceCount = i11;
            Test.instanceCount += (((i15 * i16) + Test.instanceCount) - i2);
        }
        long meth_res = i1 + i2 + i10 + i11 + i12 + by + s1 + i13 + i14 + Float.floatToIntBits(f2) + i15 + i16;
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth(long l, long l1, long l2) {

        int i17=10153, i18=14, i19=6742, i20=8, i21=0, i22=-19666, i23=-12;
        float f3=-2.518F;

        dMeth(i17, i17);
        for (i18 = 2; 290 > i18; i18++) {
            Test.iArrFld[i18 - 1] &= i19;
            i19 = (int)f3;
            for (i20 = i18; i20 < 6; i20++) {
                i19 <<= i20;
                l2 += (i20 * i20);
                i19 >>= i21;
                l1 += i20;
                for (i22 = 1; 1 > i22; ++i22) {
                    i21 <<= Test.byFld;
                    l2 = i19;
                    l1 >>= i19;
                    Test.iArrFld[i18 + 1] = i18;
                    f3 += f3;
                }
            }
        }
        vMeth_check_sum += l + l1 + l2 + i17 + i18 + i19 + Float.floatToIntBits(f3) + i20 + i21 + i22 + i23;
    }

    public void mainTest(String[] strArr1) {

        int i=39355;
        float f=0.229F;

        i <<= (int)(i - ((long)(Test.dFld * f) ^ -5));
        vMeth(Test.instanceCount, Test.instanceCount, Test.instanceCount);


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
//DEBUG  dMeth ->  dMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 dMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
