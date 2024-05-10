package tests.javafuzzer440;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 03:51:43 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3900382613L;
    public static double dFld=-23.6765;
    public static volatile byte byArrFld[]=new byte[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)-114);
        FuzzerUtils.init(Test.iArrFld, 146);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i4=-47170, i5=13847, i6=98;
        float f=-2.107F, fArr[][]=new float[N][N];
        byte by=11;

        FuzzerUtils.init(fArr, -40.814F);

        Test.instanceCount = i4;
        for (i5 = 20; i5 < 379; ++i5) {
            fArr[i5 + 1][i5] = 3461448018L;
            f += i4;
            i4 += (i5 * i5);
            f = by;
        }
        Test.iArrFld[(i5 >>> 1) % N] = i4;
        vMeth1_check_sum += i4 + i5 + i6 + Float.floatToIntBits(f) + by +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(boolean b) {

        int i3=0, i7=63441, i8=-38209, iArr[][]=new int[N][N];
        float f1=0.573F;

        FuzzerUtils.init(iArr, -7510);

        switch (((((i3 - i3) >>> 1) % 1) * 5) + 107) {
        case 111:
            Test.byArrFld[(i3 >>> 1) % N] <<= (byte)(Test.instanceCount >>>= iArr[(57620 >>> 1) % N][(i3 >>> 1) % N]);
            if (b) {
                vMeth1();
                i7 = 1;
                do {
                    i3 = (int)Test.instanceCount;
                    i3 += (int)Test.dFld;
                    Test.iArrFld = iArr[i7 + 1];
                    Test.instanceCount -= i7;
                    f1 = f1;
                } while (++i7 < 360);
            } else if (b) {
                Test.instanceCount *= i3;
                i3 |= i3;
            } else {
                i8 = 1;
                do {
                    if (i3 != 0) {
                        vMeth_check_sum += (b ? 1 : 0) + i3 + i7 + Float.floatToIntBits(f1) + i8 +
                            FuzzerUtils.checkSum(iArr);
                        return;
                    }
                    i3 <<= i8;
                } while (++i8 < 208);
                vMeth_check_sum += (b ? 1 : 0) + i3 + i7 + Float.floatToIntBits(f1) + i8 + FuzzerUtils.checkSum(iArr);
                return;
            }
            break;
        default:
            b = b;
        }
        vMeth_check_sum += (b ? 1 : 0) + i3 + i7 + Float.floatToIntBits(f1) + i8 + FuzzerUtils.checkSum(iArr);
    }

    public static void vSmallMeth(int i2, long l) {

        boolean b1=false;

        vMeth(b1);
        i2 = i2;
        vSmallMeth_check_sum += i2 + l + (b1 ? 1 : 0);
    }

    public void mainTest(String[] strArr1) {

        int i=37321, i1=208, i9=2, i10=11003, i11=117, i12=-4, i13=199;
        float f2=-2.357F, fArr1[]=new float[N];
        byte by1=43;
        boolean b2=false;
        short s=-5524;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 2.80750);
        FuzzerUtils.init(fArr1, 0.685F);

        for (i = 282; 17 < i; i--) {
            for (int smallinvoc=0; smallinvoc<62; smallinvoc++) vSmallMeth(i, Test.instanceCount);
            f2 /= (i1 | 1);
            f2 *= Test.instanceCount;
            by1 -= (byte)i1;
            i1 -= i1;
            i9 = 95;
            while (--i9 > 0) {
                if (b2) {
                    if (false) continue;
                    i1 *= -46;
                } else {
                    fArr1[i9] += 50.671F;
                    Test.instanceCount = (long)Test.dFld;
                    Test.iArrFld[i - 1] = 10482;
                    i1 = (int)Test.instanceCount;
                }
                Test.iArrFld[i9 + 1] = (int)f2;
                i1 += (((i9 * by1) + i10) - i10);
                Test.iArrFld[i9 - 1] = 12;
                f2 += (182 + (i9 * i9));
                for (i11 = 1; i11 < 1; i11++) {
                    i10 = i1;
                    if (b2) {
                        i1 = i11;
                        i1 = i1;
                        i10 += i9;
                    } else {
                        i12 -= i13;
                        s -= (short)i12;
                        if (b2) continue;
                        Test.dFld += by1;
                    }
                    i13 += i11;
                    if (false) break;
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  vMeth1 ->  vMeth1 vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
