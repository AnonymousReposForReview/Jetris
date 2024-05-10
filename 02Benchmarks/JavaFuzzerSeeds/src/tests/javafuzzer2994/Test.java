package tests.javafuzzer2994;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 00:30:54 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3295117546L;
    public static volatile boolean bFld=true;
    public byte byFld=-114;
    public static float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];
    public long lArrFld[][]=new long[N][N];

    static {
        FuzzerUtils.init(Test.fArrFld, -23.468F);
        FuzzerUtils.init(Test.iArrFld, 65446);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(long l1) {

        int i6=213, i7=133, i8=-8, i9=211, i10=-94, i11=23955, i12=10, i13=58785, iArr[][]=new int[N][N];
        float f=2.347F;
        double d1=54.63686;
        boolean b=true;

        FuzzerUtils.init(iArr, 245);

        i6 |= i6;
        i6 += (int)Test.instanceCount;
        for (i7 = 9; i7 < 383; ++i7) {
            f -= 227;
        }
        l1 += Test.instanceCount;
        d1 = 1;
        while ((d1 += 3) < 266) {
            for (i9 = 18; i9 > 1; i9 -= 3) {
                i11 = 1;
                do {
                    iArr[i9][i9 - 1] = (int)l1;
                    b = b;
                    i8 -= i6;
                } while (++i11 < 4);
                for (i12 = 1; i12 < 4; i12++) {
                    iArr[i9 - 1][(int)(d1 + 1)] = 11;
                    Test.instanceCount >>= l1;
                    i10 += (i12 ^ i13);
                }
            }
        }
        long meth_res = l1 + i6 + i7 + i8 + Float.floatToIntBits(f) + Double.doubleToLongBits(d1) + i9 + i10 + i11 + (b
            ? 1 : 0) + i12 + i13 + FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1(byte by, int i3, long l) {

        int i4=178, i5=12, i14=29, i15=79, i16=-12, i17=-160, i18=-203, i19=-6, i20=-11;
        short s=10380;

        for (i4 = 205; i4 > 11; --i4) {
            i5 &= 79;
            Test.fArrFld[i4] = Math.abs((int)(lMeth(1134573473493254620L) - i14));
        }
        i5 = i4;
        i5 += (int)l;
        Test.instanceCount = i4;
        Test.iArrFld[(i14 >>> 1) % N] = 9810;
        i14 -= (int)Test.instanceCount;
        s -= (short)i4;
        for (i15 = 13; i15 < 274; ++i15) {
            l += (i15 + i14);
            for (i17 = 1; i17 < 6; ++i17) {
                for (i19 = 1; i19 < 2; ++i19) {
                    if (Test.bFld) break;
                    i20 /= (int)(i3 | 1);
                }
            }
        }
        vMeth1_check_sum += by + i3 + l + i4 + i5 + i14 + s + i15 + i16 + i17 + i18 + i19 + i20;
    }

    public void vMeth(int i1, int i2) {

        int i21=-1, i22=-186, i23=2, i24=-55746, i25=-10, i26=63269, i27=35390, i28=-6, i29=-14, i30=46, i31=118;

        vMeth1(byFld, i1, Test.instanceCount);
        for (i21 = 4; 206 > i21; ++i21) {
            for (i23 = 1; i23 < 8; i23++) {
                Test.instanceCount *= i24;
            }
            for (i25 = 1; 8 > i25; i25++) {
                i26 = (int)-3L;
                Test.iArrFld[i21 + 1] *= 69;
                i27 = 1;
                while (++i27 < 2) {
                    i1 += i1;
                }
            }
            for (i28 = 8; 1 < i28; i28--) {
                for (i30 = 1; 2 > i30; i30++) {
                    Test.iArrFld[i21] <<= i24;
                    Test.fArrFld[i28] -= -14;
                    i22 -= (int)Test.instanceCount;
                    Test.instanceCount = byFld;
                }
            }
        }
        vMeth_check_sum += i1 + i2 + i21 + i22 + i23 + i24 + i25 + i26 + i27 + i28 + i29 + i30 + i31;
    }

    public void mainTest(String[] strArr1) {

        int i=11193, i32=-60767, i33=87, i34=2, i35=77, i36=14, i37=211, i38=109, i39=-8, i40=-2, i41=-14, i42=24;
        double d=-1.44861;
        boolean b1=true;
        float f1=-83.913F;
        long l2=-14L;

        i = i;
        d *= (--Test.instanceCount);
        vMeth(i, i);
        Test.iArrFld[(i >>> 1) % N] = (int)Test.instanceCount;
        for (i32 = 17; i32 < 366; i32++) {
            i33 += i33;
            i -= i32;
            d = 1.734F;
            i33 &= 6829;
            for (i34 = 2; i34 < 72; ++i34) {
                lArrFld[i32] = lArrFld[i32];
            }
            Test.instanceCount <<= i35;
            for (i36 = 72; i36 > 4; --i36) {
                i += i36;
                i = (int)Test.instanceCount;
            }
            Test.iArrFld[i32] >>>= i37;
            for (i38 = i32; i38 < 72; i38++) {
                Test.instanceCount ^= 1868674884L;
                Test.iArrFld[i32 - 1] += (int)d;
                if (b1) {
                    b1 = b1;
                    i37 += (int)(10.644F + (i38 * i38));
                    for (i40 = 1; i40 < 1; ++i40) {
                        f1 += (i40 * f1);
                        d -= Test.instanceCount;
                        d += i38;
                        i42 |= i36;
                        i41 <<= (int)l2;
                        i39 *= i34;
                        i33 -= i38;
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
