package tests.javafuzzer1920;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 05:54:24 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=110L;
    public static short sFld=-20480;
    public static boolean bFld=true;
    public static volatile float fFld=-77.229F;
    public static double dFld=0.79386;
    public int iFld=5;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 3504);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l1) {

        int i9=-4, i10=-211, i11=-1, i12=-5, iArr1[]=new int[N];
        byte by1=95;
        double d2=1.42298;
        boolean bArr[]=new boolean[N];
        float fArr1[]=new float[N];

        FuzzerUtils.init(iArr1, 53791);
        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(fArr1, 41.882F);

        i9 &= i9;
        i9 -= i9;
        i10 = 1;
        while (++i10 < 124) {
            Test.instanceCount += (((i10 * i9) + i9) - l1);
            i9 += Test.sFld;
            Test.instanceCount *= 11;
            iArr1[i10] >>>= i10;
            by1 *= (byte)l1;
            bArr[i10] = Test.bFld;
            for (i11 = 1; 13 > i11; ++i11) {
                i12 /= (int)((long)(d2) | 1);
            }
            iArr1[i10] = (int)l1;
        }
        iArr1[(i9 >>> 1) % N] += -41107;
        fArr1[(i11 >>> 1) % N] = by1;
        i9 = (int)-239L;
        vMeth1_check_sum += l1 + i9 + i10 + by1 + i11 + i12 + Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(iArr1)
            + FuzzerUtils.checkSum(bArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public static int iMeth(int i8) {

        double d1=-2.6257;
        short s=-28987;
        float f=-2.45F, fArr2[]=new float[N];
        int i13=-12, i14=-32, i15=-204, i16=-18;

        FuzzerUtils.init(fArr2, 2.416F);

        Test.instanceCount += Math.abs((long)(d1 - s));
        vMeth1(Test.instanceCount);
        Test.instanceCount = Test.instanceCount;
        fArr2[(i8 >>> 1) % N] *= i8;
        for (f = 6; f < 368; ++f) {
            Test.iArrFld = Test.iArrFld;
            Test.iArrFld[(int)(f)] = i13;
            i14 = 1;
            do {
                fArr2[i14 - 1] += Test.instanceCount;
                Test.iArrFld[i14 - 1] = -1;
                Test.instanceCount = i8;
                for (i15 = (int)(f); i15 < 1; i15++) {
                    i13 += (i15 * i15);
                    Test.fFld += i15;
                    Test.instanceCount = -24262;
                }
            } while (++i14 < 5);
        }
        long meth_res = i8 + Double.doubleToLongBits(d1) + s + Float.floatToIntBits(f) + i13 + i14 + i15 + i16 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr2));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i2, long l) {

        int i3=-12, i4=63811, i5=12, i6=12, i7=-2, i17=8, i18=-175, iArr[]=new int[N];
        double d=1.89269;
        byte by2=-31;
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr, -11831);
        FuzzerUtils.init(fArr, -89.987F);

        for (i3 = 7; i3 < 155; i3++) {
            i5 = 1;
            do {
                for (i6 = 1; 3 > i6; i6++) {
                    i7 = 6;
                    d = ((--l) + iArr[i5]);
                }
                fArr[i5] = ((l *= (Test.instanceCount - l)) + iMeth(i7));
                i4 = -40;
                if (Test.bFld) {
                    for (i17 = 3; i17 > 1; i17 -= 3) {
                        Test.instanceCount -= Test.sFld;
                        i2 *= -9056;
                        i7 -= i6;
                    }
                } else {
                    i18 += (i5 * i5);
                    by2 = (byte)i3;
                    try {
                        i2 = (-1301960543 / iArr[i3]);
                        i18 = (-50314 / i2);
                        i7 = (i6 % -24620);
                    } catch (ArithmeticException a_e) {}
                }
            } while ((i5 += 2) < 11);
        }
        vMeth_check_sum += i2 + l + i3 + i4 + i5 + i6 + i7 + Double.doubleToLongBits(d) + i17 + i18 + by2 +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i=13, i1=-3, i19=161, i20=9276, i21=108, i22=-4, i23=-156, i24=9586, i25=13, i26=56958, i27=-61774, i28=12,
            i29=40260;
        byte by=-74;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 5434764355102646525L);

        for (i = 6; i < 259; i++) {
            Test.instanceCount += (((i * by) + Test.instanceCount) - i);
            vMeth(i, Test.instanceCount);
            i1 -= i1;
            Test.dFld = i1;
            for (i19 = 5; i19 < 99; ++i19) {
                lArr[i + 1] <<= by;
            }
            i21 = 1;
            while (++i21 < 99) {
                i1 += i20;
                lArr[i21] -= 6;
                i20 <<= (int)4114577725L;
                for (i22 = 1; 1 > i22; i22++) {
                    Test.instanceCount <<= i1;
                    i23 >>= (int)Test.instanceCount;
                }
            }
            Test.iArrFld[i - 1] = -37054;
            Test.iArrFld[i - 1] = i20;
        }
        i24 = 1;
        while (++i24 < 367) {
            i20 += i;
        }
        for (i25 = 6; 351 > i25; ++i25) {
            i23 = iFld;
            Test.instanceCount *= i25;
            if (Test.bFld) break;
            for (i27 = 3; 73 > i27; i27++) {
                i29 = 1;
                do {
                    iFld = (int)Test.instanceCount;
                    Test.bFld = Test.bFld;
                    i20 += (int)Test.instanceCount;
                    iFld += 185;
                    i28 += (int)-77.182F;
                    Test.fFld -= Test.instanceCount;
                } while (++i29 < 2);
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
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
