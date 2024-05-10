package tests.javafuzzer1633;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 00:32:55 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-22L;
    public volatile long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];
    public static volatile short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 18156);
        FuzzerUtils.init(Test.sArrFld, (short)13940);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i4=-230, i5=-6404, i6=-14;
        double d1=1.128180;
        float f=1.298F;
        short s1=-8411;

        i4 = 1;
        do {
            for (d1 = 1; d1 < 6; ++d1) {
                f *= f;
                i5 -= (int)Test.instanceCount;
                f *= i5;
                Test.instanceCount *= 8;
                i5 = i4;
                i5 = (int)d1;
                i6 = 1;
                do {
                    boolean b=true;
                    Test.instanceCount <<= i5;
                    if (b) {
                        f *= s1;
                        i5 += (int)Test.instanceCount;
                        Test.instanceCount = i4;
                        if (i6 != 0) {
                            vMeth1_check_sum += i4 + Double.doubleToLongBits(d1) + i5 + Float.floatToIntBits(f) + i6 +
                                s1;
                            return;
                        }
                    } else if (b) {
                        i5 >>= -45604;
                    }
                } while (++i6 < 2);
            }
        } while (++i4 < 253);
        vMeth1_check_sum += i4 + Double.doubleToLongBits(d1) + i5 + Float.floatToIntBits(f) + i6 + s1;
    }

    public static void vMeth(int i1, long l, double d) {

        byte by=99, byArr1[]=new byte[N];
        int i2=40206, i3=-25011, i7=-14, i8=42347, i9=-14323;
        long l1=-14L;
        float f1=112.588F;

        FuzzerUtils.init(byArr1, (byte)-6);

        by += (byte)(Test.iArrFld[(i1 >>> 1) % N] *= (--i1));
        for (i2 = 9; i2 < 191; ++i2) {
            i3 <<= (int)(20502 + (d * (-187L * (i3--))));
            vMeth1();
            Test.instanceCount = by;
            i3 *= i1;
            for (l1 = 1; 9 > l1; ++l1) {
                Test.iArrFld[i2 + 1] *= -4;
                byArr1 = byArr1;
            }
            i3 *= i3;
        }
        f1 -= i7;
        for (i8 = 13; i8 < 320; i8++) {
            Test.instanceCount <<= 132;
            f1 += i8;
            i7 += (((i8 * by) + i3) - i9);
        }
        vMeth_check_sum += i1 + l + Double.doubleToLongBits(d) + by + i2 + i3 + l1 + i7 + Float.floatToIntBits(f1) + i8
            + i9 + FuzzerUtils.checkSum(byArr1);
    }

    public static int iMeth() {

        int i10=-48488, i11=39555, i12=-4, i13=13, i14=40145, i15=1692, i16=76;
        boolean b1=true, bArr[]=new boolean[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 0.562F);
        FuzzerUtils.init(bArr, true);

        vMeth(i10, 3802960793347449193L, 1.8921);
        i10 <<= i10;
        for (i11 = 14; i11 < 256; ++i11) {
            Test.instanceCount = i11;
            fArr[i11] = Test.instanceCount;
            for (i13 = 1; i13 < 7; i13++) {
                bArr[i13] = b1;
                for (i15 = 1; i15 < 2; ++i15) {
                    Test.iArrFld[i11] = i12;
                    Test.instanceCount += (((i15 * i11) + i13) - i11);
                    if (b1) continue;
                    Test.instanceCount >>= Test.instanceCount;
                    if (i13 != 0) {
                    }
                    i14 = i14;
                    i16 = 85;
                }
            }
        }
        long meth_res = i10 + i11 + i12 + i13 + i14 + (b1 ? 1 : 0) + i15 + i16 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(bArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-5;
        short s=25154;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-85);

        i += s;
        byArr[(0 >>> 1) % N] <<= (byte)(((Test.instanceCount++) * (-(s + Test.instanceCount))) - ((lArrFld[(i >>> 1) %
            N]++) + iMeth()));
        Test.instanceCount += i;
        Test.sArrFld[(i >>> 1) % N] += (short)i;
        i += i;
        Test.iArrFld[(i >>> 1) % N] += 10;
        s += (short)i;



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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}