package tests.javafuzzer924;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 11:45:31 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=71411515419306389L;
    public static float fFld=-20.498F;
    public static short sFld=-29229;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 4L);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f, double d) {

        int i9=1, i10=-12, i11=-90, i12=-9880, i13=-28641, iArr[]=new int[N];
        short s1=-19695;
        boolean b=false;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 0.13149);
        FuzzerUtils.init(iArr, 129);

        dArr[(-64 >>> 1) % N] += -71.347F;
        i9 |= i9;
        iArr[(i9 >>> 1) % N] -= i9;
        Test.instanceCount &= s1;
        i9 |= (int)Test.instanceCount;
        for (i10 = 14; 291 > i10; ++i10) {
            for (i12 = 1; 6 > i12; i12 += 2) {
                iArr[i12 + 1] = s1;
                Test.instanceCount = i9;
                if (b) {
                    if (i13 != 0) {
                        vMeth1_check_sum += Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i9 + s1 + i10 + i11
                            + i12 + i13 + (b ? 1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
                            FuzzerUtils.checkSum(iArr);
                        return;
                    }
                    i11 += (i12 + f);
                    i11 += i12;
                } else if (b) {
                    Test.instanceCount = Test.instanceCount;
                } else if (false) {
                    i9 <<= i9;
                }
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i9 + s1 + i10 + i11 + i12 + i13 + (b
            ? 1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(int i7, int i8) {

        int i14=0, i15=-51157, i16=-29472, i17=1370, i18=139, i19=123, i20=-12, iArr1[]=new int[N];
        double d1=0.1514;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 0.858F);
        FuzzerUtils.init(iArr1, 1);

        Test.instanceCount = (long)((i8 - 0.2130) - 10024);
        vMeth1(Test.fFld, 0.85782);
        i8 += i8;
        for (i14 = 3; i14 < 259; i14++) {
            fArr[i14] += i7;
            i15 = (int)d1;
            iArr1[i14 - 1] = (int)Test.instanceCount;
        }
        i7 >>= (int)Test.instanceCount;
        i16 = 1;
        do {
            i7 = (int)Test.instanceCount;
            for (i17 = 5; i17 > 1; i17 -= 3) {
                for (i19 = 5; i19 > 1; i19 -= 3) {
                    Test.instanceCount = Test.sFld;
                    i20 += (((i19 * i16) + i7) - Test.fFld);
                    Test.fFld += ((long)i19 | (long)Test.instanceCount);
                }
            }
        } while (++i16 < 343);
        long meth_res = i7 + i8 + i14 + i15 + Double.doubleToLongBits(d1) + i16 + i17 + i18 + i19 + i20 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i1, int i2) {

        int i3=-51, i4=-11, i5=567, i6=-9, i21=-4, i22=-64017, i23=7, i24=-8, i25=206;
        short s=13828;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -7L);

        lArr[(i2 >>> 1) % N] <<= (((i2 + -14L) + (i1 - -59528)) + (i1--));
        for (i3 = 7; i3 < 227; i3++) {
            for (i5 = 1; i5 < 7; i5++) {
                s = (short)iMeth(i2, i5);
                Test.instanceCount += 21591;
            }
            for (i21 = 1; 7 > i21; i21++) {
                i22 += i6;
                Test.instanceCount -= 124;
                i1 += i21;
            }
            Test.instanceCount >>= 6;
            i23 = 1;
            while (++i23 < 7) {
                i2 *= -26371;
                for (i24 = 1; i24 < 1; i24++) {
                    i6 *= (int)3263756220L;
                    Test.fFld += -1;
                }
            }
        }
        vMeth_check_sum += i1 + i2 + i3 + i4 + i5 + i6 + s + i21 + i22 + i23 + i24 + i25 + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i=43339, i26=5362, i27=14189, i28=12, i29=-40645, iArr2[]=new int[N];
        double d2=-45.76535, d3=-93.47430;

        FuzzerUtils.init(iArr2, -230);

        i = 1;
        do {
            switch ((i % 2) + 18) {
            case 18:
                vMeth(i, 207);
                for (i26 = i; i26 < 84; i26 += 2) {
                    Test.instanceCount = i27;
                    Test.fFld = -1348868607L;
                    i27 += (int)(-4398389673016425537L + (i26 * i26));
                    i27 *= (int)d2;
                }
                break;
            case 19:
                for (i28 = 5; i28 < 84; i28++) {
                    i27 *= i29;
                    Test.fFld = Test.instanceCount;
                    Test.instanceCount += (i28 * i28);
                    iArr2[i28] *= (int)Test.instanceCount;
                    iArr2[i28 + 1] &= i26;
                    Test.fFld += (i28 * i28);
                    i29 <<= i28;
                    d3 = 1;
                    while (++d3 < 2) {
                        i29 -= i26;
                        switch ((i % 1) + 84) {
                        case 84:
                            i29 = (int)d2;
                            Test.lArrFld[(int)(d3 + 1)] >>= i28;
                            i27 += (int)(d3 + i);
                            i27 += (int)(((d3 * Test.fFld) + Test.instanceCount) - Test.instanceCount);
                            break;
                        default:
                            Test.sFld = (short)i27;
                            switch (((158 >>> 1) % 2) + 1) {
                            case 1:
                                Test.lArrFld[(int)(d3)] = i;
                                d2 *= Test.instanceCount;
                                Test.fFld = i26;
                                i29 += -235;
                                break;
                            case 2:
                                i29 <<= i;
                            default:
                                Test.lArrFld[(int)(d3)] *= i27;
                            }
                        }
                    }
                }
                break;
            }
        } while (++i < 300);



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
