package tests.javafuzzer1510;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 21:56:08 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2310003862L;
    public static byte byFld=-98;
    public static volatile double dArrFld[]=new double[N];
    public int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.dArrFld, 91.11069);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i9=-6;
        double d=-37.86481;

        i9 = (int)Test.instanceCount;
        d = i9;
        long meth_res = i9 + Double.doubleToLongBits(d);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(long l3) {

        int i3=-6, i4=6, i5=11, i6=8, i7=47922, i8=95;
        boolean b=true;
        float f=-121.568F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 1085591765L);

        for (i3 = 11; i3 < 202; ++i3) {
            b = b;
            for (i5 = 1; i5 < 8; ++i5) {
                for (i7 = 2; i7 > 1; i7--) {
                    i6 = (-iMeth());
                    i8 += (((i7 * i8) + i8) - i6);
                    i8 <<= Test.byFld;
                    Test.instanceCount >>>= i5;
                    switch ((((i4 >>> 1) % 3) * 5) + 124) {
                    case 132:
                        Test.instanceCount *= l3;
                        lArr[i3 + 1] <<= -8626;
                        b = b;
                        Test.instanceCount += Test.byFld;
                        break;
                    case 126:
                        f = l3;
                        Test.byFld = (byte)i4;
                        break;
                    case 130:
                        i6 >>= 48208;
                        break;
                    }
                }
            }
        }
        long meth_res = l3 + i3 + i4 + (b ? 1 : 0) + i5 + i6 + i7 + i8 + Float.floatToIntBits(f) +
            FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(long l1, long l2) {

        int i1=80, i2=-2, i10=-25587, iArr[]=new int[N];
        boolean b1=false;
        float f1=-124.406F, fArr[]=new float[N];
        short s=18533;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(iArr, 63);
        FuzzerUtils.init(byArr, (byte)98);
        FuzzerUtils.init(fArr, -1.470F);

        for (i1 = 8; i1 < 217; i1++) {
            Test.dArrFld[i1 - 1] %= ((Test.instanceCount++) | 1);
            i2 -= ((iArr[i1]++) + ((i2 + -53714) + Math.min(i2, i2)));
            i2 >>= (int)Math.min(--Test.instanceCount, lMeth(l2));
            switch (((i2 >>> 1) % 4) + 56) {
            case 56:
                if (b1) break;
                f1 += 2.840F;
                i10 = 1;
                while (++i10 < 8) {
                    i2 = -15307;
                    l1 = i1;
                    Test.instanceCount += (22800 + (i10 * i10));
                    Test.instanceCount += i1;
                    s = (short)i2;
                    byArr[i1 - 1] -= (byte)Test.instanceCount;
                    if (i1 != 0) {
                        vMeth_check_sum += l1 + l2 + i1 + i2 + (b1 ? 1 : 0) + Float.floatToIntBits(f1) + i10 + s +
                            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(byArr) +
                            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                        return;
                    }
                }
            case 57:
                i2 = (int)95.675F;
            case 58:
                fArr[i1 - 1] -= i10;
            case 59:
                Test.byFld = (byte)i2;
                break;
            default:
                i2 = i10;
            }
        }
        vMeth_check_sum += l1 + l2 + i1 + i2 + (b1 ? 1 : 0) + Float.floatToIntBits(f1) + i10 + s +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(byArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i=-17316, i11=-65, i12=46405, i13=53221, i14=16, i15=-2, i16=-63712;
        long l4=7591813252176872851L, l5=-3594613638936242903L, lArr1[][]=new long[N][N];
        float f2=110.148F;
        double d1=49.98662;
        short sArr[]=new short[N];

        FuzzerUtils.init(lArr1, -17724L);
        FuzzerUtils.init(sArr, (short)32147);

        i = 1;
        do {
            long l=-11L;
            l -= i;
        } while (++i < 225);
        vMeth(-1992403725623725482L, Test.instanceCount);
        l4 = 1;
        do {
            i11 += (int)-72.1371;
            for (i12 = 5; i12 < 167; ++i12) {
                i13 += 2;
                l5 = 1;
                while ((l5 += 3) < 2) {
                    iArrFld[(int)(l5)][(int)(l5 - 1)] = (int)l4;
                    lArr1[(int)(l4)][(int)(l5 - 1)] <<= i11;
                    switch ((int)(((l4 % 1) * 5) + 111)) {
                    case 115:
                        sArr = sArr;
                        i13 = Test.byFld;
                        break;
                    }
                    f2 *= i11;
                    i13 |= (int)-8515042200297694458L;
                    Test.byFld |= (byte)i13;
                    iArrFld[(int)(l5)][(int)(l5 - 1)] *= (int)d1;
                }
            }
            f2 += i;
            i11 -= (int)f2;
            i14 = 1;
            while (++i14 < 167) {
                for (i15 = 1; i15 < 1; ++i15) {
                    i16 += i15;
                    lArr1[i14 - 1][(int)(l4)] = i13;
                    i11 += i14;
                    Test.instanceCount = 7;
                    i11 += (((i15 * i13) + i14) - l5);
                    switch ((i14 % 9) + 105) {
                    case 105:
                        iArrFld[i15][(int)(l4 - 1)] = (int)l4;
                        i16 <<= i11;
                        i13 += i15;
                    case 106:
                        i13 -= i12;
                    case 107:
                        i16 >>= i11;
                        break;
                    case 108:
                        i11 *= i13;
                        break;
                    case 109:
                        lArr1[i15][i14 - 1] *= i13;
                        break;
                    case 110:
                    case 111:
                        Test.instanceCount += i12;
                        break;
                    case 112:
                        i16 <<= i13;
                        break;
                    case 113:
                        i13 += i15;
                        break;
                    }
                }
            }
        } while (++l4 < 150);



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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
