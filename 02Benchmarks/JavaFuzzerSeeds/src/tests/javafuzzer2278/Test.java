package tests.javafuzzer2278;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 11:17:44 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=9L;
    public static boolean bFld=false;
    public static float fFld=-65.816F;
    public static short sArrFld[]=new short[N];
    public static volatile double dArrFld[]=new double[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)13362);
        FuzzerUtils.init(Test.dArrFld, -12.128071);
        FuzzerUtils.init(Test.iArrFld, -41576);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f1, int i3) {

        int i4=24, i5=99, i6=-55142, i7=-1, i8=-3, i9=59437, i10=4, i11=-106, i12=-6;
        boolean b=false;
        byte by=-85;
        double d=-1.62037;

        Test.sArrFld[(i3 >>> 1) % N] = (short)13;
        for (i4 = 389; i4 > 8; i4--) {
            Test.dArrFld[i4 + 1] -= Test.instanceCount;
            for (i6 = i4; i6 < 4; i6++) {
                if (b) continue;
                i3 += (15943 + (i6 * i6));
            }
            Test.instanceCount *= Test.instanceCount;
        }
        for (i8 = 4; i8 < 283; ++i8) {
            i10 = 1;
            while (++i10 < 6) {
                Test.instanceCount <<= i4;
                by += (byte)Test.instanceCount;
                by = (byte)Test.instanceCount;
                for (i11 = 1; 1 > i11; ++i11) {
                    i12 = i10;
                    d *= i4;
                }
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f1) + i3 + i4 + i5 + i6 + i7 + (b ? 1 : 0) + i8 + i9 + i10 + by + i11
            + i12 + Double.doubleToLongBits(d);
    }

    public static int iMeth(int i2) {

        long l=-148L, lArr1[]=new long[N];
        boolean b1=true, bArr[]=new boolean[N];
        int i13=-128, i14=7, i15=76, i16=71, i17=-188;
        float f2=-2.28F;
        short s=9125;

        FuzzerUtils.init(lArr1, -8L);
        FuzzerUtils.init(bArr, false);

        lArr1[(i2 >>> 1) % N] = (-(-(i2 + i2)));
        l = 1;
        do {
            vMeth1(1.93F, i2);
            i2 = (int)Test.instanceCount;
            if (i2 != 0) {
            }
            b1 = b1;
            i2 = i2;
            for (i13 = 1; 11 > i13; ++i13) {
                f2 = i14;
            }
            i2 -= (int)l;
            for (i15 = 1; i15 < 11; ++i15) {
                switch (((i15 >>> 1) % 6) + 55) {
                case 55:
                    f2 += i16;
                    i14 = (int)f2;
                    bArr[(int)(l)] = b1;
                    break;
                case 56:
                    Test.instanceCount -= -8;
                    break;
                case 57:
                    s >>= (short)3208725732L;
                    break;
                case 58:
                    i2 -= i17;
                    break;
                case 59:
                    Test.instanceCount %= -5;
                    break;
                case 60:
                    i17 += i15;
                    break;
                default:
                    i17 = (int)-3.978F;
                }
            }
        } while (++l < 143);
        long meth_res = i2 + l + (b1 ? 1 : 0) + i13 + i14 + Float.floatToIntBits(f2) + i15 + i16 + s + i17 +
            FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(bArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(float f, int i1) {

        short s1=-11874;
        double d1=-2.16462;
        int i18=-226, i19=165, i20=-47605, i21=-64;
        boolean b2=false;
        long lArr[]=new long[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(lArr, 253L);
        FuzzerUtils.init(fArr, 1.825F);

        lArr[(i1 >>> 1) % N] = (--i1);
        switch ((((iMeth(2) >>> 1) % 4) * 5) + 80) {
        case 83:
            i1 = s1;
            if (Test.bFld) {
                fArr[(i1 >>> 1) % N] = i1;
                if (false) {
                    d1 -= Test.instanceCount;
                    for (i18 = 16; i18 < 284; i18++) {
                        Test.iArrFld[i18 + 1] = (int)1.127095;
                        for (i20 = i18; i20 < 6; i20++) {
                            lArr = lArr;
                            Test.instanceCount <<= 14;
                            Test.instanceCount = i1;
                            try {
                                i21 = (Test.iArrFld[i18] % Test.iArrFld[i20 - 1]);
                                i1 = (i18 % i20);
                                i1 = (Test.iArrFld[i18 - 1] / 48396);
                            } catch (ArithmeticException a_e) {}
                            Test.instanceCount *= i18;
                        }
                    }
                } else if (false) {
                    Test.bFld = b2;
                } else {
                    Test.instanceCount |= Test.instanceCount;
                }
            }
        case 95:
            lArr[(i21 >>> 1) % N] -= (long)f;
            break;
        case 91:
            f = i19;
            break;
        case 98:
            s1 |= (short)i18;
            break;
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i1 + s1 + Double.doubleToLongBits(d1) + i18 + i19 + i20 + i21 +
            (b2 ? 1 : 0) + FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i=31, i22=-189, i23=-3;
        byte by1=-91;

        i = 1;
        do {
            vMeth(Test.fFld, i);
            Test.iArrFld[i - 1] = (int)Test.instanceCount;
        } while (++i < 156);
        for (i22 = 2; 370 > i22; i22++) {
            Test.sArrFld[i22 + 1] *= (short)i;
            Test.instanceCount <<= -213L;
        }
        i23 >>= i;
        i23 += by1;


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
