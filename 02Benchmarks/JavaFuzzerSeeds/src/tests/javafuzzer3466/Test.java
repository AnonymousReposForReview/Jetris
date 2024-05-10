package tests.javafuzzer3466;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 08:49:36 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=6L;
    public static boolean bFld=false;
    public static double dFld=1.77726;
    public float fFld=-2.256F;
    public static volatile int iArrFld[]=new int[N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -21739);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i8) {

        int i9=25, i10=7, i11=6, i12=-59284, i13=-12, i14=202, i15=-26340;
        float fArr[]=new float[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(fArr, -2.336F);
        FuzzerUtils.init(byArr, (byte)107);

        i8 -= 16284;
        Test.instanceCount -= i8;
        for (i9 = 7; i9 < 254; ++i9) {
            i10 &= i10;
            for (i11 = 1; i11 < 7; i11++) {
                for (i13 = 1; i13 < 2; ++i13) {
                    i8 += (i13 * i13);
                    i10 -= i13;
                    fArr[i11 - 1] *= i8;
                    byArr[i13 + 1] -= (byte)i8;
                }
                Test.bFld = Test.bFld;
                i15 = 1;
                do {
                    i10 += (int)Test.instanceCount;
                    if (i10 != 0) {
                    }
                    Test.instanceCount >>= 214;
                } while (++i15 < 2);
            }
        }
        long meth_res = i8 + i9 + i10 + i11 + i12 + i13 + i14 + i15 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(byArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(long l, int i2, int i3) {

        int i4=-9, i5=195, i6=-28937, i7=-22, i16=-11, i17=18690, i18=-35558, i19=-21, iArr[]=new int[N];
        boolean b1=true;
        float f=-2.774F;
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr, 80);
        FuzzerUtils.init(sArr, (short)-19149);

        i3 = -61;
        for (i4 = 6; i4 < 313; ++i4) {
            i5 += (i4 * i4);
            for (i6 = i4; i6 < 5; ++i6) {
                if (b1 = (iMeth1(i5) <= Test.dFld)) continue;
                f *= l;
                if (b1) continue;
            }
            iArr[i4 + 1] -= 11;
            for (i16 = 1; i16 < 5; ++i16) {
                i17 -= (int)Test.dFld;
                for (i18 = 1; i18 < 2; i18++) {
                    l <<= l;
                    i5 = (int)Test.instanceCount;
                    i5 *= (int)Test.instanceCount;
                    sArr[i4 + 1] += (short)Test.instanceCount;
                }
            }
        }
        long meth_res = l + i2 + i3 + i4 + i5 + i6 + i7 + (b1 ? 1 : 0) + Float.floatToIntBits(f) + i16 + i17 + i18 +
            i19 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(sArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i, int i1, boolean b) {

        double d=113.21923;
        long l1=-26381L;
        byte by=116;

        Test.iArrFld = (Test.iArrFld = Test.iArrFld);
        Test.instanceCount += (((i1--) * (i1--)) - (-(i1 * 33908)));
        i1 = i;
        i1 += (int)(d -= iMeth(l1, i1, i1));
        Test.iArrFld[(-18378 >>> 1) % N] >>= by;
        vMeth_check_sum += i + i1 + (b ? 1 : 0) + Double.doubleToLongBits(d) + l1 + by;
    }

    public void mainTest(String[] strArr1) {

        int i20=89, i21=205, i22=-18290, i23=-3, i24=-63508, i25=6, i26=-1, i27=62, i28=-32038, i29=11225, i30=57903,
            i31=180, i32=-53129, i33=26315;
        byte by1=-72;
        float f1=116.474F;

        vMeth(i20, -11, false);
        Test.instanceCount >>= i20;
        for (i21 = 5; 132 > i21; i21++) {
            for (i23 = 11; i23 < 197; i23++) {
                short s=13008;
                i24 = i20;
                Test.instanceCount += i21;
                for (i25 = 1; i25 < 2; i25++) {
                    i26 <<= by1;
                }
                Test.instanceCount = s;
                switch ((i23 % 2) + 15) {
                case 15:
                    if (Test.bFld) continue;
                    for (f1 = 1; f1 < 2; f1++) {
                        s -= (short)i25;
                    }
                    Test.dFld += f1;
                    for (i28 = 1; i28 < 2; ++i28) {
                        i27 ^= (int)5357934788367790328L;
                        Test.iArrFld[i28] = i24;
                        lArrFld[i21] += -111;
                        Test.dFld = i28;
                        fFld += (i28 + fFld);
                        Test.dFld *= fFld;
                    }
                    break;
                case 16:
                    i20 <<= i22;
                    break;
                }
            }
            for (i30 = i21; i30 < 197; ++i30) {
                for (i32 = 1; 1 > i32; ++i32) {
                    i33 -= (int)Test.dFld;
                    i24 >>= i23;
                    switch ((i21 % 2) + 87) {
                    case 87:
                        i26 >>= i21;
                        Test.instanceCount += i33;
                        break;
                    case 88:
                        i26 *= (int)-95.79720;
                        break;
                    }
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
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
