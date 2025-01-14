package tests.javafuzzer1941;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 06:17:43 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-10L;
    public static byte byFld=-35;
    public static int iFld=8;
    public static short sFld=24379;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];
    public int iArrFld1[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 0);
        FuzzerUtils.init(Test.lArrFld, -1282245134067826889L);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i2, int i3, int i4) {

        boolean b=false;
        float f=53.930F, fArr[]=new float[N];
        int i5=215, i6=56839, iArr[]=new int[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 1.124111);
        FuzzerUtils.init(fArr, -78.706F);
        FuzzerUtils.init(iArr, -1);

        for (double d : dArr) {
            short s=-10446;
            b = b;
            i4 <<= Test.byFld;
            i3 = (int)f;
            f += i2;
            i5 = 1;
            do {
                Test.instanceCount -= i4;
            } while (++i5 < 4);
            switch ((((i5 >>> 1) % 1) * 5) + 38) {
            case 41:
                switch ((((i5 >>> 1) % 1) * 5) + 48) {
                case 53:
                    i3 >>= i2;
                    iArr[(i5 >>> 1) % N] = 6;
                    i6 = 1;
                    while (++i6 < 4) {
                        Test.byFld >>= (byte)i4;
                    }
                    try {
                        i4 = (63778 / i3);
                        i2 = (iArr[(i5 >>> 1) % N] / i2);
                        i4 = (-511943040 % i4);
                    } catch (ArithmeticException a_e) {}
                    break;
                default:
                    Test.instanceCount = -9;
                }
                break;
            default:
                s <<= (short)i6;
            }
        }
        vMeth1_check_sum += i2 + i3 + i4 + (b ? 1 : 0) + Float.floatToIntBits(f) + i5 + i6 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(long l) {

        int i7=-56148, i8=-63309, i9=145, i10=-57313, i11=-41138, i12=49087, iArr1[]=new int[N];
        float f2=-49.591F;

        FuzzerUtils.init(iArr1, 1);

        vMeth1(i7, i7, i7);
        for (i8 = 5; i8 < 368; ++i8) {
            Test.byFld &= (byte)l;
        }
        i7 |= (int)l;
        for (i10 = 2; i10 < 319; ++i10) {
            for (f2 = 5; f2 > 1; f2 -= 2) {
                i11 >>= i8;
                if (true) break;
                i11 += (int)(((f2 * i12) + i12) - i9);
                Test.iFld = 55;
            }
            iArr1[i10 + 1] *= (int)f2;
            Test.instanceCount *= i7;
            iArr1[i10] >>>= Test.iFld;
            i9 = 0;
            i11 += (int)(-23977L + (i10 * i10));
        }
        long meth_res = l + i7 + i8 + i9 + i10 + i11 + Float.floatToIntBits(f2) + i12 + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth(int i, int i1) {

        float f3=-2.658F;
        int i13=-7, i14=-72, i15=-97, i16=-73, i17=13599, i18=-64830, i19=207;
        short s1=-26281;
        double d1=1.87039;

        i1 >>= iMeth(Test.instanceCount);
        f3 -= i;
        for (i13 = 7; i13 < 162; i13++) {
            s1 += s1;
            Test.byFld = (byte)Test.instanceCount;
            for (i15 = 10; i15 > 1; --i15) {
                Test.iArrFld[i13 + 1] = (int)Test.instanceCount;
                f3 += Test.instanceCount;
                i1 = (int)Test.instanceCount;
            }
            i1 += (int)f3;
            Test.iFld = (int)d1;
        }
        for (i17 = 13; 215 > i17; i17++) {
            Test.instanceCount = i16;
            try {
                Test.iArrFld[i17 + 1] = (Test.iArrFld[i17] % i17);
                i1 = (i18 % i13);
                Test.iArrFld[i17] = (i19 % i16);
            } catch (ArithmeticException a_e) {}
        }
        Test.lArrFld[(i15 >>> 1) % N] = i18;
        vMeth_check_sum += i + i1 + Float.floatToIntBits(f3) + i13 + i14 + s1 + i15 + i16 + Double.doubleToLongBits(d1)
            + i17 + i18 + i19;
    }

    public void mainTest(String[] strArr1) {

        int i21=-48746, i22=12, i23=22201, i24=176, i25=-23741, i26=13, i27=33096, i28=-12, iArr2[]=new int[N];
        double d2=0.121759;
        long l1=-64513L;
        float f4=3.604F, fArr1[]=new float[N];

        FuzzerUtils.init(fArr1, -2.584F);
        FuzzerUtils.init(iArr2, 224);

        vMeth(Test.iFld, Test.iFld);
        for (i21 = 4; i21 < 304; i21++) {
            i22 /= (int)(i21 | 1);
            d2 -= 29;
            l1 = 1;
            while ((l1 += 3) < 84) {
                iArrFld1 = iArrFld1;
                Test.sFld = (short)i22;
                for (i23 = 1; i23 < 3; i23++) {
                    fArr1[i21] -= Test.instanceCount;
                    f4 = (float)d2;
                    i22 <<= i22;
                }
                i22 = Test.iFld;
                Test.instanceCount <<= Test.iFld;
                i24 >>>= i24;
                for (i25 = 1; i25 < 3; i25++) {
                    Test.iFld += (i25 - f4);
                }
                Test.lArrFld[i21 + 1] -= 56676;
            }
            i22 = (int)d2;
            for (i27 = 4; 84 > i27; i27++) {
                Test.iFld >>= i23;
            }
            Test.iFld += i28;
            iArr2[i21 - 1] *= (int)d2;
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
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
