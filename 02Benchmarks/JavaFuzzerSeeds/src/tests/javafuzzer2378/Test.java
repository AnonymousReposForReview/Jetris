package tests.javafuzzer2378;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 13:47:31 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-2741187533L;
    public static volatile short sFld=-13248;
    public static int iFld1=214;
    public static byte byFld=-63;
    public double dFld=-14.110545;
    public static int iArrFld1[]=new int[N];
    public static long lArrFld1[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld1, -38037);
        FuzzerUtils.init(Test.lArrFld1, 3306389257L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1() {

        int i6=-40994, i7=-43467, i8=4, i9=-105, i10=-5;
        float f2=0.875F;

        i6 = 358;
        while ((i6 -= 3) > 0) {
            for (i7 = 13; i7 > i6; i7 -= 3) {
                i8 += Test.sFld;
                Test.iArrFld1[i6 + 1] += (int)-13.970F;
                for (i9 = 1; i9 < 1; i9++) {
                    Test.instanceCount *= i9;
                    if (false) break;
                    i8 = i8;
                }
                if (true) break;
                i10 += (i7 ^ (long)f2);
                i10 *= i8;
                Test.sFld += (short)57916;
                f2 = -10;
                i10 = (int)f2;
                i8 = i10;
            }
        }
        long meth_res = i6 + i7 + i8 + i9 + i10 + Float.floatToIntBits(f2);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i4, int i5) {

        int i11=-20109, i12=2, i13=-176, i14=58589, i15=1, i16=-3, i17=-8, i18=248, i19=-2, iArr[]=new int[N];
        double d=79.42494;
        float f3=8.945F, fArr[]=new float[N];

        FuzzerUtils.init(iArr, 4);
        FuzzerUtils.init(fArr, -98.749F);

        i5 = ((iArr[(-241 >>> 1) % N] = (-31751 + iMeth1())) * 164);
        fArr[(i5 >>> 1) % N] = Test.instanceCount;
        i4 = (int)Test.instanceCount;
        for (i11 = 1; i11 < 261; ++i11) {
            for (i13 = 1; i13 < 6; i13++) {
                for (i15 = i13; i15 < 2; ++i15) {
                    d = i17;
                    if (false) continue;
                    iArr[i11 - 1] -= (int)Test.instanceCount;
                }
                f3 *= Test.sFld;
            }
            Test.lArrFld1[i11 - 1] = i14;
            fArr[i11 + 1] -= i5;
            for (i18 = i11; i18 < 6; i18++) {
                i4 = (int)Test.instanceCount;
                i4 = i16;
            }
        }
        vMeth_check_sum += i4 + i5 + i11 + i12 + i13 + i14 + i15 + i16 + Double.doubleToLongBits(d) + i17 +
            Float.floatToIntBits(f3) + i18 + i19 + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth() {

        int i2=3, i3=38, i20=-32836, i21=30279;
        float f1=4.396F;
        long l=-3364440059L;
        byte by=97;

        for (i2 = 11; i2 < 342; i2++) {
            f1 += (i2 * i2);
            i3 += ((i3++) + ((-50 * i2) - (-13 - (-(i3 * i3)))));
            l = 1;
            do {
                vMeth(i3, -19039);
                for (i20 = 1; 1 > i20; i20 += 2) {
                    i21 = i20;
                    i21 <<= i2;
                    by -= (byte)i2;
                    i21 -= (int)f1;
                    Test.instanceCount = Test.instanceCount;
                    i3 += (((i20 * i2) + i3) - l);
                    i21 *= i3;
                    i3 = i2;
                    f1 -= 248;
                }
            } while (++l < 5);
        }
        long meth_res = i2 + i3 + Float.floatToIntBits(f1) + l + i20 + i21 + by;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr5) {

        int i1=57012, i22=67, i23=-244, i24=-86, i25=-36208, i26=-4, i27=-12, i28=12128, i29=106, i30=12, i31=-191;
        float f4=40.856F;
        boolean b=true;

        i1 = (iMeth() - i1);
        for (i22 = 4; i22 < 244; i22++) {
            i1 = i1;
            for (i24 = 5; 105 > i24; i24++) {
                i26 = 1;
                while (++i26 < 2) {
                    i1 = Test.iFld1;
                    Test.instanceCount >>>= Test.instanceCount;
                    Test.instanceCount += (i26 * i26);
                }
                i27 = 1;
                do {
                    i1 += (i27 * i27);
                    Test.iFld1 = i27;
                    Test.instanceCount += 4;
                    Test.iFld1 = Test.byFld;
                } while (++i27 < 2);
                if (b) {
                    for (i28 = 1; i28 < 2; ++i28) {
                        f4 += (i28 - Test.iFld1);
                        i25 -= (int)dFld;
                        i25 = i28;
                        Test.byFld = (byte)Test.instanceCount;
                        i1 = i23;
                        f4 += (i28 * i28);
                        i1 >>= i22;
                        i23 = (int)f4;
                    }
                    for (i30 = 1; 2 > i30; ++i30) {
                        Test.iArrFld1[i30 + 1] = i1;
                        f4 += i30;
                        i1 += i30;
                        i29 = (int)Test.instanceCount;
                        if (b) break;
                    }
                    Test.iFld1 -= i25;
                } else {
                    Test.iArrFld1[i22 + 1] = -11;
                }
            }
        }



    }
    public static void main(String[] strArr4) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr4);
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
//DEBUG  iMeth1 ->  iMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
