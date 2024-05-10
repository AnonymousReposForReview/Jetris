package tests.javafuzzer2044;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 07:54:20 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-415L;
    public int iFld=-51137;
    public static float fFld=0.630F;
    public static short sArrFld[]=new short[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)-8045);
        FuzzerUtils.init(Test.iArrFld, -213);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l, int i2, int i3) {

        double d=2.114791, d1=-119.73220;
        int i4=-60935, i5=12, i6=28918, i7=-21956, i8=-183;
        byte by=-53;

        i2 <<= i3;
        i3 -= -117;
        Test.sArrFld[(i2 >>> 1) % N] += (short)Test.instanceCount;
        for (d = 22; d < 370; d++) {
            i2 *= i2;
            for (i5 = (int)(d); i5 < 5; i5++) {
                for (i7 = 1; i7 < 1; i7++) {
                    i6 -= by;
                    d1 *= i3;
                    i6 = i3;
                    Test.fFld = i8;
                    d1 -= Test.fFld;
                    i6 = i3;
                }
                i3 = 0;
                i2 += -41358;
            }
        }
        vMeth1_check_sum += l + i2 + i3 + Double.doubleToLongBits(d) + i4 + i5 + i6 + i7 + i8 + by +
            Double.doubleToLongBits(d1);
    }

    public static void vMeth() {

        int i9=-246, i10=-13642, i11=43, i12=-79, i13=-245;
        double d2=0.75981;
        byte by1=-95;
        boolean b=false;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -87.62F);

        vMeth1(-153L, i9, i9);
        for (float f : fArr) {
            Test.instanceCount *= 5;
            i9 = 145;
            for (i10 = 1; i10 < 4; ++i10) {
                for (i12 = 1; i12 < 2; ++i12) {
                    d2 += Test.instanceCount;
                    f -= i9;
                    by1 &= (byte)i12;
                    i11 = i10;
                    i13 = (int)Test.instanceCount;
                    b = b;
                    f += i12;
                    Test.instanceCount += (((i12 * i10) + i10) - i12);
                }
                i13 += (int)Test.instanceCount;
            }
        }
        vMeth_check_sum += i9 + i10 + i11 + i12 + i13 + Double.doubleToLongBits(d2) + by1 + (b ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static long lMeth(int i, int i1) {

        short s=-7303;
        int i14=8, i15=-64354, i16=-124, i17=3, iArr[]=new int[N];
        boolean b1=false;
        byte by2=-109;

        FuzzerUtils.init(iArr, -51);

        vMeth();
        i1 += (int)-26L;
        i1 = s;
        iArr[(14 >>> 1) % N] >>= i1;
        for (i14 = 13; i14 < 223; i14++) {
            for (i16 = 1; i16 < 8; ++i16) {
                if (true) {
                    Test.instanceCount |= Test.instanceCount;
                    iArr[i16] = i;
                    if (b1) {
                        i17 += -11;
                        i += (int)Test.instanceCount;
                        Test.fFld += (i16 - i1);
                    } else {
                        i += i16;
                        i1 = i1;
                    }
                } else {
                    by2 >>= (byte)Test.instanceCount;
                }
            }
        }
        long meth_res = i + i1 + s + i14 + i15 + i16 + i17 + (b1 ? 1 : 0) + by2 + FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i19=3, i20=180, i21=-32443, i22=-7, i23=10951, i24=37596, iArr1[][]=new int[N][N];
        long l1=-5L;
        boolean b2=true;

        FuzzerUtils.init(iArr1, -7);

        iFld -= (int)(lMeth(iFld, 170) + -63357L);
        iArr1[(iFld >>> 1) % N][(iFld >>> 1) % N] <<= iFld;
        iFld <<= iFld;
        for (int i18 : Test.iArrFld) {
            for (i19 = 63; 1 < i19; --i19) {
                i20 += (i19 + iFld);
                iFld = (int)Test.instanceCount;
                iFld *= iFld;
                Test.instanceCount = (long)Test.fFld;
                i20 = i18;
                l1 = 1;
                do {
                    i18 -= i19;
                    Test.instanceCount = i18;
                    Test.fFld += (((l1 * i18) + i19) - i19);
                    i18 *= i18;
                    if (true) continue;
                    Test.iArrFld[(int)(l1)] = (int)Test.fFld;
                    iFld = 2;
                    Test.iArrFld[(int)(l1)] <<= iFld;
                    Test.instanceCount >>= 3346174299L;
                    if (b2) break;
                } while (++l1 < 2);
                i18 &= iFld;
            }
            for (i21 = 1; i21 < 63; i21++) {
                for (i23 = 1; i23 < 2; i23++) {
                    i20 = (int)Test.instanceCount;
                    Test.instanceCount += i21;
                    i22 = i22;
                    i20 >>= (int)l1;
                    Test.instanceCount = -126;
                    iArr1[i21 - 1][i21 - 1] += -6;
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}