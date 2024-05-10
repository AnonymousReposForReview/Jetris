package tests.javafuzzer2803;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 20:34:26 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1L;
    public static volatile boolean bFld=true;
    public static short sFld=2712;
    public static float fFld=0.96F;
    public static int iFld=-8;
    public static long lFld=2257702424L;
    public static int iArrFld[]=new int[N];
    public double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -55678);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i5=0, i6=-31535, i7=21, i8=153, i9=54450, i10=-18087, i11=-49386;
        float f=2.516F, fArr[]=new float[N];

        FuzzerUtils.init(fArr, 75.968F);

        i5 -= (int)2.848F;
        i5 *= (int)Test.instanceCount;
        for (i6 = 9; 214 > i6; i6++) {
            Test.instanceCount -= Test.instanceCount;
            i5 >>= 26150;
        }
        i5 ^= i7;
        Test.iArrFld[(i5 >>> 1) % N] = i6;
        for (i8 = 10; 235 > i8; ++i8) {
            for (i10 = 1; i10 < 7; ++i10) {
                Test.instanceCount += (((i10 * i6) + i8) - i11);
                fArr = fArr;
                fArr[i10 - 1] += f;
            }
            i5 = i10;
            i9 ^= (int)-3499539060L;
            try {
                i9 = (-49412 % i5);
                i11 = (-16664 % i11);
                i9 = (i10 % -16050);
            } catch (ArithmeticException a_e) {}
        }
        long meth_res = i5 + i6 + i7 + i8 + i9 + i10 + i11 + Float.floatToIntBits(f) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(boolean b) {

        int i2=62421, i3=3, i4=0, i12=-143;
        double d=-34.437;

        for (i2 = 13; i2 < 308; i2++) {
            try {
                i3 = (i3 / 29433);
                i3 = (Test.iArrFld[i2 + 1] / i3);
                i3 = (i2 / 154);
            } catch (ArithmeticException a_e) {}
            i4 = 6;
            do {
                if (b) {
                    Test.instanceCount -= (long)(iMeth() + 20.968F);
                    i3 = (int)Test.instanceCount;
                } else {
                    for (d = 1; d < 1; d++) {
                        i3 += (int)d;
                        try {
                            i3 = (-47296 / i3);
                            Test.iArrFld[i4 + 1] = (i12 % -1002721177);
                            i12 = (i4 % i2);
                        } catch (ArithmeticException a_e) {}
                        i12 = i2;
                        i12 ^= i4;
                        i3 -= i2;
                        i3 ^= i12;
                        Test.instanceCount *= -224;
                        Test.instanceCount *= i4;
                    }
                }
            } while (--i4 > 0);
        }
        vMeth1_check_sum += (b ? 1 : 0) + i2 + i3 + i4 + Double.doubleToLongBits(d) + i12;
    }

    public static void vMeth(long l, int i, int i1) {

        long l1=8L;
        int i13=145, i14=-23, i15=-15422, i16=-39613;
        double d1=-87.57246, d2=0.89242;
        byte by=-3;
        float fArr1[]=new float[N];

        FuzzerUtils.init(fArr1, -28.85F);

        vMeth1(Test.bFld);
        for (l1 = 277; l1 > 2; l1 -= 3) {
            i13 = (int)Test.instanceCount;
            d1 = 1;
            while (++d1 < 17) {
                Test.sFld += (short)i;
                for (i14 = 1; i14 < 1; i14++) {
                    Test.iArrFld[i14 - 1] <<= 200;
                    i1 += by;
                }
                for (d2 = 1; d2 < 1; ++d2) {
                    i15 = i16;
                    i15 *= i14;
                    i1 += (int)797617830L;
                    fArr1[(int)(d1)] += (float)d1;
                    Test.iArrFld[(int)(d1)] = (int)Test.fFld;
                }
                l += l1;
            }
        }
        vMeth_check_sum += l + i + i1 + l1 + i13 + Double.doubleToLongBits(d1) + i14 + i15 + by +
            Double.doubleToLongBits(d2) + i16 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public void mainTest(String[] strArr1) {

        int i17=5, i18=93, i19=-162, i20=-30146, i21=34, i22=-26843, i23=7, i24=-51772, i25=-147, i26=-54, i27=-223,
            i28=11;
        double d3=0.115407;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 10L);

        vMeth(Test.instanceCount, Test.iFld, Test.iFld);
        if (Test.bFld) {
            i17 = 282;
            while (--i17 > 0) {
                for (i18 = 5; i18 < 89; i18++) {
                    Test.bFld = Test.bFld;
                    switch (((i18 % 6) * 5) + 83) {
                    case 104:
                        Test.iFld += (i18 | Test.iFld);
                        lArr[i18 + 1] >>>= i17;
                        break;
                    case 106:
                        Test.sFld = (short)0;
                        break;
                    case 92:
                        for (i20 = 1; 2 > i20; i20++) {
                            if (Test.bFld) {
                                Test.fFld *= i21;
                                i19 += i20;
                                Test.instanceCount = Test.iFld;
                                lArr[i18] = 6L;
                            }
                            dArrFld[i17 + 1] -= i19;
                        }
                        for (i22 = 1; 2 > i22; i22++) {
                            Test.iArrFld[i17] -= i20;
                            Test.fFld *= Test.instanceCount;
                        }
                        break;
                    case 89:
                    case 87:
                        for (i24 = 1; i24 < 2; ++i24) {
                            Test.instanceCount = 55747;
                            Test.iArrFld[i17 - 1] *= i20;
                            i23 = i18;
                        }
                        i25 += (((i18 * Test.instanceCount) + Test.lFld) - i26);
                    case 110:
                        i26 >>= -3;
                        Test.lFld = Test.lFld;
                        for (i27 = 1; i27 < 2; ++i27) {
                            byte by1=20;
                            d3 /= (by1 | 1);
                            i28 = (int)-8L;
                        }
                        break;
                    }
                    i26 %= (int)(Test.instanceCount | 1);
                }
            }
        } else {
            i21 >>>= Test.iFld;
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
