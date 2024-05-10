package tests.javafuzzer1159;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 15:55:33 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-5L;
    public static double dFld=0.24543;
    public static long lArrFld[][]=new long[N][N];
    public static int iArrFld[][]=new int[N][N];
    public static int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 26677L);
        FuzzerUtils.init(Test.iArrFld, 6);
        FuzzerUtils.init(Test.iArrFld1, 97);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(double d2, int i3) {

        int i4=-205, i5=12, i6=8, i7=109;
        byte by=57;
        float f2=-1.695F;

        for (i4 = 18; i4 < 294; i4++) {
            i3 >>= i4;
        }
        for (i6 = 16; i6 < 279; i6++) {
            short s=-10883;
            by += (byte)(((i6 * i7) + f2) - f2);
            i3 = i4;
            i7 += i4;
            s = (short)Test.instanceCount;
            f2 += Test.instanceCount;
            i3 += i4;
            i3 += (i6 * i6);
            i3 += i7;
            if (false) continue;
            Test.instanceCount = -2629521038L;
        }
        Test.lArrFld[(i4 >>> 1) % N][(i7 >>> 1) % N] = i4;
        Test.instanceCount >>= 6;
        vMeth1_check_sum += Double.doubleToLongBits(d2) + i3 + i4 + i5 + i6 + i7 + by + Float.floatToIntBits(f2);
    }

    public static void vMeth(long l) {

        int i2=41442, i8=32610, i9=9, i10=6362, i12=-22788, i13=55;
        double d1=-1.72749;
        float f1=-2.936F, fArr[]=new float[N];
        boolean b=false;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)62);
        FuzzerUtils.init(fArr, -63.774F);

        byArr[(i2 >>> 1) % N] = (byte)Math.abs((int)(d1 + (f1 - i2)));
        vMeth1(d1, i2);
        f1 *= i2;
        for (i8 = 6; i8 < 311; i8++) {
            try {
                i9 = (i9 % -36421);
                i2 = (16922 % i9);
                Test.iArrFld[i8 - 1][i8] = (i9 % i10);
            } catch (ArithmeticException a_e) {}
            f1 = i2;
        }
        i9 = (int)2.518F;
        for (int i11 : Test.iArrFld1) {
            for (i12 = 1; i12 < 4; ++i12) {
                i9 /= (int)(i11 | 1);
                i2 += i11;
                fArr = fArr;
                b = b;
                i2 = 133;
                Test.lArrFld[i12][i12] >>= i2;
            }
        }
        vMeth_check_sum += l + i2 + Double.doubleToLongBits(d1) + Float.floatToIntBits(f1) + i8 + i9 + i10 + i12 + i13
            + (b ? 1 : 0) + FuzzerUtils.checkSum(byArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static long lMeth(double d) {

        int i14=-25710, i15=-52986, i16=7, i17=35390, i18=-124, i19=-39778;
        long l1=1612498575L;
        float f3=1.762F;

        try {
            vMeth(235L);
            i14 += 31;
            Test.iArrFld[(i14 >>> 1) % N] = Test.iArrFld1;
            for (i15 = 191; 9 < i15; --i15) {
                for (i17 = 1; i17 < 9; ++i17) {
                    i19 = 1;
                    do {
                        l1 &= l1;
                        i18 += (((i19 * i19) + i16) - f3);
                        i14 = (int)f3;
                    } while (++i19 < 2);
                    i16 *= (int)l1;
                    i16 += (int)Test.instanceCount;
                    i18 = (int)-1.234F;
                    Test.iArrFld1[i15 - 1] += i18;
                    d = Test.instanceCount;
                }
            }
        }
        catch (ArithmeticException exc2) {
            Test.instanceCount >>= i19;
        }
        catch (NullPointerException exc3) {
            l1 = -324177742L;
        }
        long meth_res = Double.doubleToLongBits(d) + i14 + i15 + i16 + i17 + i18 + i19 + l1 + Float.floatToIntBits(f3);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=13059, i1=2636;
        float f=47.910F;

        for (i = 17; i < 363; i++) {
            f += (7737 + (i * i));
        }
        f %= (Math.abs(lMeth(Test.dFld)) | 1);
        Test.lArrFld[(i >>> 1) % N][(i1 >>> 1) % N] -= Test.instanceCount;


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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
