package tests.javafuzzer133;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 22:51:23 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=5729498563896554115L;
    public static boolean bFld=false;
    public static short sFld=-4644;
    public static long lFld=93L;
    public int iArrFld[]=new int[N];

    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i4, int i5, int i6) {

        int i7=-214, i8=-12, i9=-58328, i10=-2, i11=-121, i12=-5, i13=52116, i14=5, i15=-53, i16=30617, iArr[]=new
            int[N];
        double d=0.79285;

        FuzzerUtils.init(iArr, -4);

        for (i7 = 13; i7 < 242; ++i7) {
            for (i9 = 7; i9 > 1; i9 -= 2) {
                float f1=0.730F;
                f1 -= i9;
                f1 += i8;
                iArr[i9 + 1] -= i4;
            }
            i10 <<= (int)-9L;
            for (i11 = 1; i11 < 7; ++i11) {
                i8 += (int)d;
                i6 = (int)1.98796;
            }
            iArr[i7 - 1] *= i8;
            i4 = i7;
            for (i13 = 7; i13 > 1; i13--) {
                for (i15 = 1; i15 < 2; i15++) {
                    i16 *= -32523;
                    if (i7 != 0) {
                    }
                }
            }
        }
        long meth_res = i4 + i5 + i6 + i7 + i8 + i9 + i10 + i11 + i12 + Double.doubleToLongBits(d) + i13 + i14 + i15 +
            i16 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public float fMeth(int i1) {

        int i2=93, i3=11, i17=1, i18=-72, iArr1[]=new int[N];
        float f=79.901F, f2=76.52F;
        byte by=-23;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr1, -64444);
        FuzzerUtils.init(lArr1, -14L);

        for (i2 = 13; i2 < 225; ++i2) {
            i3 = (int)(((i1 - f) - i2) + iMeth(i1, i2, -164));
            f2 = 1;
            while (++f2 < 8) {
                try {
                    i1 = (-134 / i2);
                    i1 = (-101 % i2);
                    iArr1[i2 + 1] = (i1 % -4592);
                } catch (ArithmeticException a_e) {}
                i1 += i3;
                lArr1[(int)(f2 - 1)] += i1;
                i1 = i3;
                for (i17 = 1; i17 > i2; i17--) {
                    iArr1[i17] = i17;
                    lArr1[i17 + 1] ^= -536;
                    switch ((((i1 >>> 1) % 5) * 5) + 52) {
                    case 76:
                        by = (byte)i1;
                    case 55:
                        i1 += (int)-13.301F;
                        break;
                    case 66:
                        if (Test.bFld) continue;
                        i1 >>= 10121;
                    case 71:
                        i1 += (((i17 * i3) + Test.sFld) - i1);
                    case 62:
                        i18 *= (int)Test.instanceCount;
                    }
                }
            }
        }
        long meth_res = i1 + i2 + i3 + Float.floatToIntBits(f) + Float.floatToIntBits(f2) + i17 + i18 + by +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void vMeth(int i) {

        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 107L);

        i >>= (int)((--lArr[(i >>> 1) % N]) * ((4631012217300903723L - fMeth(i)) % (i | 1)));
        vMeth_check_sum += i + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i19=126, i20=-10, i21=-10, i22=2, i23=155, i24=32821;
        float f3=-2.712F;
        long l=-1208394499886188463L;

        vMeth(i19);
        for (i20 = 7; i20 < 239; i20++) {
            i21 -= i20;
            i21 += (i20 + Test.instanceCount);
            Test.instanceCount = Test.instanceCount;
            i22 = 1;
            while ((i22 += 2) < 108) {
                for (i23 = 1; i23 < 2; ++i23) {
                    i19 *= (int)Test.instanceCount;
                    i21 += (9995 + (i23 * i23));
                    Test.instanceCount = i19;
                    iArrFld[i23] += (int)-4L;
                    Test.instanceCount *= Test.instanceCount;
                    switch ((i22 % 1) + 2) {
                    case 2:
                        iArrFld[i22] -= i23;
                        f3 += i23;
                        i24 = i24;
                        switch (i20 % 2) {
                        case 0:
                            i21 += (((i23 * i22) + i19) - i23);
                            i24 += i23;
                            i24 += (((i23 * Test.sFld) + i23) - i19);
                            f3 -= l;
                            break;
                        case 1:
                            i21 = i21;
                            i19 &= i20;
                            break;
                        default:
                            switch ((i22 % 1) + 4) {
                            case 4:
                                switch (((i23 % 2) * 5) + 71) {
                                case 76:
                                    i21 += (i23 - i21);
                                    Test.lFld += -4;
                                    Test.sFld += (short)i21;
                                case 72:
                                default:
                                    iArrFld[i22] = i23;
                                    i21 -= i21;
                                }
                                break;
                            }
                        }
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
//DEBUG  fMeth ->  fMeth vMeth mainTest
//DEBUG  iMeth ->  iMeth fMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
