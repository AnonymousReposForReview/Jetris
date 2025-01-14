package tests.javafuzzer1923;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 05:56:10 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-6L;
    public static short sFld=1195;
    public static double dFld=-1.40444;
    public static byte byArrFld[]=new byte[N];
    public static volatile boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)29);
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i3) {

        int i4=-42624, i5=6, i6=-4, iArr[]=new int[N];
        float f1=0.972F;
        boolean b=false;

        FuzzerUtils.init(iArr, 42162);

        i3 *= i3;
        for (i4 = 11; i4 < 198; i4++) {
            if (i5 != 0) {
                vMeth1_check_sum += i3 + i4 + i5 + Float.floatToIntBits(f1) + i6 + (b ? 1 : 0) +
                    FuzzerUtils.checkSum(iArr);
                return;
            }
            Test.byArrFld[i4 - 1] = (byte)f1;
            i6 = 1;
            do {
                i5 = Test.sFld;
                f1 -= -2.65F;
                b = true;
                f1 = i4;
                switch ((i6 % 2) + 105) {
                case 105:
                case 106:
                    i3 = i3;
                    iArr[i6 - 1] >>>= i3;
                default:
                    Test.instanceCount += (((i6 * i3) + Test.instanceCount) - i4);
                    i5 <<= (int)Test.instanceCount;
                    Test.dFld = 55675;
                }
            } while (++i6 < 9);
        }
        vMeth1_check_sum += i3 + i4 + i5 + Float.floatToIntBits(f1) + i6 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(long l1, float f) {

        int i7=11, i8=-13, i9=-152, i10=18;
        long l2=-1295444455L;
        boolean b1=true;
        byte by1=-83;

        vMeth1(i7);
        l2 = i7;
        for (i8 = 3; i8 < 197; ++i8) {
            byte by=106;
            i7 /= (int)(i9 | 1);
            i7 *= (int)-5L;
            if (b1) break;
            by = (byte)l2;
            i9 = i9;
            b1 = b1;
            Test.dFld -= i7;
            i7 += (((i8 * l2) + Test.instanceCount) - i8);
        }
        Test.instanceCount = (long)f;
        i10 = 1;
        while (++i10 < 159) {
            i7 += by1;
            i7 += (int)(69.367F + (i10 * i10));
        }
        long meth_res = l1 + Float.floatToIntBits(f) + i7 + l2 + i8 + i9 + (b1 ? 1 : 0) + i10 + by1;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i, long l, int i1) {

        double d=-115.35895;
        int i2=163, i11=-50528, i12=0, i13=5, iArr1[]=new int[N];
        float f2=0.435F;

        FuzzerUtils.init(iArr1, -5);

        for (d = 313; d > 18; d -= 3) {
            iMeth(128L, f2);
            i11 = 1;
            do {
                for (i12 = 1; i12 < 1; ++i12) {
                    iArr1[i12 - 1] = i;
                    i13 <<= -79;
                    i1 >>>= Test.sFld;
                    i2 += i11;
                    Test.dFld = i1;
                    i13 -= (int)l;
                    iArr1[i11] += (int)d;
                }
                Test.instanceCount += (long)2.107905;
                i2 = 239;
                f2 += (((i11 * f2) + i) - l);
                Test.byArrFld[i11] -= (byte)l;
            } while (++i11 < 16);
        }
        vMeth_check_sum += i + l + i1 + Double.doubleToLongBits(d) + i2 + Float.floatToIntBits(f2) + i11 + i12 + i13 +
            FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i14=-1, i15=143, i16=84, i17=-234, i18=39953, i19=148, i20=7, i21=-1, i22=-14, i23=-37491, iArr2[]=new
            int[N];
        long l3=-41883L;
        float f3=102.688F;

        FuzzerUtils.init(iArr2, -10);

        vMeth(i14, Test.instanceCount, i14);
        for (i15 = 8; i15 < 241; i15++) {
            for (i17 = 3; 108 > i17; i17++) {
                iArr2[i17 + 1] = i15;
                for (l3 = 1; l3 < 2; ++l3) {
                    iArr2[i17] >>= i18;
                    i18 += i18;
                    i16 -= i14;
                    switch ((((i14 >>> 1) % 1) * 5) + 31) {
                    case 33:
                        iArr2[i15 - 1] = i19;
                        Test.instanceCount |= i18;
                        break;
                    }
                    Test.instanceCount *= (long)Test.dFld;
                    i19 = i18;
                    i14 = (int)Test.instanceCount;
                    i16 = i15;
                }
                i18 += (i17 | i18);
            }
            i19 >>>= i18;
            i16 -= i14;
            i18 += (i15 - i16);
            f3 = i16;
            for (i20 = 4; i20 < 108; ++i20) {
                boolean b2=true;
                i19 %= (int)((long)(f3) | 1);
                f3 = Test.sFld;
                if (b2) break;
                f3 += i15;
                f3 = i18;
                for (i22 = i15; i22 < 2; ++i22) {
                    iArr2[i15 + 1] = i19;
                    Test.bArrFld[i15 - 1] = b2;
                    if (true) continue;
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
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
