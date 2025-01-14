package tests.javafuzzer1313;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 18:05:32 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2653069547891403464L;
    public static int iFld=64;
    public static byte byFld=17;
    public boolean bFld=true;
    public double dFld=-83.33609;
    public int iArrFld[]=new int[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i5, long l, double d) {

        float f=-1.248F, f2=2.727F;
        int i6=1, i7=61428, iArr[]=new int[N];
        byte by=37;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)10013);
        FuzzerUtils.init(iArr, 0);

        for (short s : sArr) {
            for (f = 1; f < 4; ++f) {
                float f1=2.547F;
                iArr[(int)(f)] = (int)d;
                l *= s;
                f1 = 3720950179L;
                i5 *= -1846;
                s += (short)0L;
            }
            d *= i6;
            sArr[(i5 >>> 1) % N] = (short)-14583;
            Test.iFld += i5;
            i6 += by;
            i7 = 1;
            while (++i7 < 4) {
                f2 += s;
                l += i5;
                d += -31550;
            }
        }
        vMeth2_check_sum += i5 + l + Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i6 + by + i7 +
            Float.floatToIntBits(f2) + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(int i4) {

        double d1=0.122203, dArr[]=new double[N];
        int i8=-9, i9=6, i10=-213;
        float f3=127.241F;
        byte by1=23;
        boolean b=false;

        FuzzerUtils.init(dArr, -11.119326);

        vMeth2(i4, 183L, d1);
        i8 = 1;
        while (++i8 < 367) {
            i4 -= Test.iFld;
            if (b) {
                i4 += (216 + (i8 * i8));
                f3 -= Test.iFld;
                f3 = Test.instanceCount;
                f3 *= by1;
                vMeth1_check_sum += i4 + Double.doubleToLongBits(d1) + i8 + Float.floatToIntBits(f3) + by1 + (b ? 1 :
                    0) + i9 + i10 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                return;
            }
            i4 <<= Test.iFld;
            Test.iFld += i8;
            by1 = (byte)Test.instanceCount;
            for (i9 = 5; 1 < i9; i9--) {
                Test.instanceCount += (i9 | i10);
                i4 -= i10;
                dArr[i8 + 1] += Test.instanceCount;
            }
        }
        vMeth1_check_sum += i4 + Double.doubleToLongBits(d1) + i8 + Float.floatToIntBits(f3) + by1 + (b ? 1 : 0) + i9 +
            i10 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth(int i, int i1) {

        int i2=-13, i3=113, i11=-243, i12=-3, iArr1[]=new int[N];
        float f4=64.629F, fArr[]=new float[N];
        short s1=-24799;
        boolean b1=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr1, 15140);
        FuzzerUtils.init(lArr, -3450304853L);
        FuzzerUtils.init(fArr, 116.934F);

        for (i2 = 390; i2 > 16; i2 -= 3) {
            vMeth1(i2);
            Test.instanceCount -= (long)f4;
            iArr1[i2 + 1] *= Test.iFld;
            lArr[i2] += Test.byFld;
            Test.byFld -= (byte)i;
            Test.iFld -= i1;
            i ^= s1;
            i = 5;
            i = Test.iFld;
            if (b1) break;
        }
        fArr[(Test.iFld >>> 1) % N] = i;
        for (i11 = 16; 276 > i11; ++i11) {
            Test.instanceCount += i11;
            Test.iFld += (int)f4;
        }
        vMeth_check_sum += i + i1 + i2 + i3 + Float.floatToIntBits(f4) + s1 + (b1 ? 1 : 0) + i11 + i12 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        float f5=48.536F;
        int i13=29529, i14=31, i15=-111, i16=-14;

        vMeth(Test.iFld, 32738);
        f5 = Test.iFld;
        Test.iFld = Test.iFld;
        for (i13 = 8; i13 < 155; ++i13) {
            i14 -= Test.iFld;
            i14 -= 3;
            if (bFld) break;
            i14 += (((i13 * Test.iFld) + i14) - i14);
            Test.instanceCount += Test.instanceCount;
            Test.iFld += (((i13 * Test.iFld) + Test.instanceCount) - Test.instanceCount);
            iArrFld = iArrFld;
            for (i15 = 10; 171 > i15; i15++) {
                Test.instanceCount -= i15;
            }
            f5 += (float)dFld;
        }
        f5 = Test.iFld;


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
