package tests.javafuzzer350;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 02:37:17 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-56222L;
    public static float fFld=0.784F;
    public static volatile byte byFld=-41;
    public static double dFld=-39.121008;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -113);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i1, int i2) {

        double d=1.19709;
        short s=-12350;
        int i3=-13, i4=-134, i5=58036, i6=51323, i7=-1;
        float f1=0.221F;
        byte by=1;

        d -= Test.instanceCount;
        s >>>= (short)Test.instanceCount;
        i3 = 1;
        do {
            if (i2 != 0) {
            }
            for (i4 = 1; 10 > i4; ++i4) {
                i6 = 1;
                do {
                    Test.iArrFld[i3] = i6;
                    i5 += (((i6 * i4) + i1) - i6);
                    s += (short)(i6 + Test.instanceCount);
                    i5 -= (int)f1;
                    Test.instanceCount -= Test.instanceCount;
                    if (i7 != 0) {
                    }
                    i1 += i7;
                } while (++i6 < 2);
                d *= 0.388F;
                by += (byte)-65184;
            }
        } while (++i3 < 163);
        long meth_res = i1 + i2 + Double.doubleToLongBits(d) + s + i3 + i4 + i5 + i6 + Float.floatToIntBits(f1) + i7 +
            by;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i) {

        int i8=-23816, i9=38335, i10=-219;
        short s1=-10135;

        lMeth(-4, -181);
        i = i8;
        i9 = 1;
        while (++i9 < 125) {
            s1 = (short)i8;
            Test.fFld = 101;
            Test.byFld += (byte)(i9 + i9);
            i ^= (int)-63892L;
            i += i9;
        }
        i10 = 1;
        do {
            Test.instanceCount += (i10 * i10);
            i = (int)22978L;
            i8 >>>= -13781;
            Test.iArrFld = Test.iArrFld;
            i8 += (i10 * i10);
            Test.iArrFld[i10 + 1] -= 10;
        } while (++i10 < 347);
        vMeth_check_sum += i + i8 + i9 + s1 + i10;
    }

    public static void vSmallMeth(long l, long l1, float f) {


        vMeth(-228);
        vSmallMeth_check_sum += l + l1 + Float.floatToIntBits(f);
    }

    public void mainTest(String[] strArr1) {

        int i11=-60288, i12=229, i13=-14, i14=-244, i15=60603, i16=40356, i17=-52159, i18=130, i19=1236, i20=39;
        boolean b=false;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 2.3557);

        for (int smallinvoc=0; smallinvoc<291; smallinvoc++) vSmallMeth(-6983803900554717790L, Test.instanceCount,
            Test.fFld);
        try {
            for (i11 = 1; i11 < 151; i11++) {
                i12 |= (int)Test.instanceCount;
                i12 <<= i11;
                i12 += (((i11 * i11) + Test.fFld) - i11);
                Test.fFld -= Test.instanceCount;
                for (i13 = 1; i13 < 167; i13 += 2) {
                    i14 = (int)Test.instanceCount;
                    i12 = i11;
                }
            }
        }
        catch (ArithmeticException exc1) {
            for (i15 = 11; i15 < 307; i15 += 3) {
                i12 >>>= i14;
                for (i17 = i15; i17 < 256; ++i17) {
                    Test.iArrFld[i17] /= (int)(i12 | 1);
                    i14 >>= i13;
                    i14 = i16;
                    Test.dFld -= i18;
                }
                i12 += (i15 + i11);
                Test.instanceCount += 8;
                i16 -= i11;
                if (b) break;
            }
            i12 *= i18;
            i19 = 1;
            do {
                b = b;
                Test.iArrFld[i19 + 1] -= i14;
                Test.instanceCount *= i18;
                Test.iArrFld[i19] = i11;
                i20 = 133;
                while ((i20 -= 3) > 0) {
                    dArr[i19] = i17;
                    Test.fFld *= i17;
                }
            } while (++i19 < 188);
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
//DEBUG  lMeth ->  lMeth vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
