package tests.javafuzzer313;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 01:40:14 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=45496L;
    public static short sFld=30937;
    public byte byFld=2;
    public static int iFld=-11;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -12);
        FuzzerUtils.init(Test.lArrFld, -4159408319L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i2) {

        int i3=6, i4=-5, i5=-12, i6=5, i7=18364, i8=-117, i9=-204, i10=-50106;

        i2 = -9686;
        for (i3 = 10; 316 > i3; i3++) {
            i2 += (i3 * i4);
            Test.instanceCount += (i3 + Test.instanceCount);
            Test.iArrFld[i3] = i2;
            i2 *= i4;
        }
        Test.instanceCount *= i2;
        for (i5 = 137; i5 > 1; i5--) {
            i2 = i6;
            i6 -= i2;
        }
        for (i7 = 10; i7 < 228; i7++) {
            for (i9 = 1; i9 < 7; i9++) {
                i6 = i10;
                i10 += i9;
            }
            Test.instanceCount = Test.instanceCount;
        }
        vMeth1_check_sum += i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9 + i10;
    }

    public static void vMeth(float f) {

        int i11=-27, i12=-16, i13=14, i14=-107, i15=10009, i16=24621, i17=7, i18=-62961, i19=-33;

        vMeth1(i11);
        Test.sFld += (short)Test.instanceCount;
        i12 = 1;
        do {
            i11 += (i12 * i12);
            Test.iArrFld[i12 - 1] = (int)Test.instanceCount;
        } while (++i12 < 314);
        for (i13 = 2; i13 < 390; i13++) {
            i15 = 1;
            do {
                Test.instanceCount *= 1223;
            } while (++i15 < 4);
            Test.instanceCount = Test.instanceCount;
            for (i16 = 1; i16 < 4; i16++) {
                for (i18 = 1; 2 > i18; i18++) {
                    i14 ^= -12;
                    i19 = (int)Test.instanceCount;
                    f += i19;
                    i19 = (int)Test.instanceCount;
                }
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i11 + i12 + i13 + i14 + i15 + i16 + i17 + i18 + i19;
    }

    public int iMeth(double d, int i1) {

        float f1=-73.626F, f2=2.422F;
        int i20=13, i21=-30, i22=117, i23=7, i24=-30865, i25=38952, i26=20;

        i1 -= ((++i1) * i1);
        i1 += i1;
        vMeth(f1);
        for (i20 = 13; 358 > i20; ++i20) {
            boolean b=true;
            if (b) {
                d -= 528912242L;
            }
            if (b) break;
        }
        for (i22 = 21; i22 < 355; i22++) {
            i21 += Test.sFld;
            for (i24 = 1; i24 < 5; i24++) {
                byFld = (byte)d;
                f2 = 1;
                do {
                    Test.instanceCount = (long)f1;
                    i26 += (int)f2;
                    Test.lArrFld[(int)(f2 + 1)] >>>= Test.instanceCount;
                } while (++f2 < 2);
            }
        }
        long meth_res = Double.doubleToLongBits(d) + i1 + Float.floatToIntBits(f1) + i20 + i21 + i22 + i23 + i24 + i25
            + Float.floatToIntBits(f2) + i26;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-17880, i27=-14, i28=61804, i29=3, i30=-64206, i31=-236, i32=-179, i33=-11, i34=-2, i35=222, i36=-141,
            i37=4442, i38=26194, i39=-43673, i40=1;
        double d1=-80.29789;
        boolean b1=true;
        float f3=0.645F;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)63);

        i += Math.abs((int)(iMeth(d1, i) + Test.instanceCount));
        i27 = 272;
        do {
            i -= i;
        } while ((i27 -= 2) > 0);
        for (i28 = 17; 283 > i28; i28++) {
            if (b1) continue;
            i30 = 1;
            while (++i30 < 94) {
                i31 += i30;
                for (i32 = 1; i32 > 1; i32 -= 3) {
                    byArr[i32] >>= (byte)i;
                    f3 += i28;
                }
                i += (int)46.531F;
                byFld = (byte)i;
                for (i34 = 1; i34 < 1; ++i34) {
                    i35 += (i34 * Test.instanceCount);
                    Test.iArrFld[i28 - 1] *= i29;
                }
                i = (int)Test.instanceCount;
                i31 = i27;
                i35 = i27;
            }
            byFld = (byte)i;
        }
        f3 -= 43942L;
        Test.iArrFld[(65106 >>> 1) % N] <<= Test.iFld;
        for (i36 = 2; i36 < 303; ++i36) {
            i31 = i;
            i37 -= i31;
        }
        Test.instanceCount = byFld;
        for (i38 = 4; i38 < 317; ++i38) {
            i35 >>= i33;
            i40 = 1;
            while (++i40 < 80) {
                Test.iFld += (i40 - i34);
                Test.iArrFld[i38 + 1] >>= i29;
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
