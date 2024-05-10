package tests.javafuzzer1593;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 23:27:05 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=12L;
    public static double dFld=-2.119202;
    public static byte byFld=79;
    public static volatile boolean bFld=false;
    public static int iArrFld[]=new int[N];
    public short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 10);
    }

    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;

    public static short sMeth() {

        int i5=30687, i6=7, i7=102, i8=126, i9=-19086;
        long l=13L;
        float f=0.449F;
        short s=26636;
        boolean b=true;

        Test.iArrFld[(i5 >>> 1) % N] *= Test.byFld;
        for (l = 18; l < 396; l++) {
            Test.iArrFld[(int)(l - 1)] *= i5;
            i7 = 1;
            do {
                i5 += (((i7 * i6) + Test.instanceCount) - f);
            } while (++i7 < 4);
            i5 = i5;
            s += (short)l;
            for (i8 = 1; i8 < 4; i8 += 3) {
                i6 >>= i8;
                i6 = i5;
                s = (short)i6;
                i6 -= i7;
                if (b) continue;
                Test.instanceCount ^= 110;
            }
        }
        Test.instanceCount = i6;
        long meth_res = i5 + l + i6 + i7 + Float.floatToIntBits(f) + s + i8 + i9 + (b ? 1 : 0);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static void vMeth(int i1) {

        int i2=-2, i3=-5, i4=-8, i10=3, i11=12;
        boolean b1=true;
        double dArr[]=new double[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(dArr, -1.105065);
        FuzzerUtils.init(fArr, 0.526F);

        Test.byFld |= (byte)i1;
        for (i2 = 12; i2 < 323; i2++) {
            i3 = (int)(((i2 - Test.instanceCount) + (Test.instanceCount += i3)) * Test.instanceCount);
            i4 = 1;
            do {
                dArr[i2 + 1] = Test.iArrFld[i4 - 1];
                i3 <<= i2;
                Test.iArrFld[i2] |= (++i1);
                i1 -= (i3 = sMeth());
                i1 <<= i3;
            } while (++i4 < 5);
            fArr[i2] = i4;
            Test.instanceCount += i2;
            if (b1) {
                for (i10 = 1; i10 < 5; i10++) {
                    i1 = (int)Test.instanceCount;
                    i1 *= i2;
                }
            } else if (Test.bFld) {
                i3 = (int)Test.instanceCount;
            } else if (Test.bFld) {
                i1 += i1;
                vMeth_check_sum += i1 + i2 + i3 + i4 + i10 + i11 + (b1 ? 1 : 0) +
                    Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
                    Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                return;
            }
        }
        vMeth_check_sum += i1 + i2 + i3 + i4 + i10 + i11 + (b1 ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static float fMeth(double d) {

        int i12=-4, i13=-12, i14=35404;
        long l1=-501533957L;
        float f1=-2.16F;

        vMeth(i12);
        l1 = 1;
        do {
            i12 &= i12;
            i12 += (int)l1;
            i13 = 1;
            while (++i13 < 4) {
                i14 = 1;
                do {
                    i12 = Test.byFld;
                    i12 = i12;
                    Test.iArrFld[i14 + 1] += i12;
                } while (++i14 < 1);
            }
            i12 -= (int)l1;
            switch ((int)((l1 % 1) + 107)) {
            case 107:
                if (i14 != 0) {
                }
                i12 %= (int)((long)(f1) | 1);
                if (Test.bFld) break;
                break;
            }
            f1 = f1;
        } while (++l1 < 378);
        long meth_res = Double.doubleToLongBits(d) + i12 + l1 + i13 + i14 + Float.floatToIntBits(f1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=7, i16=-39, i17=-241, i18=33, i19=-78, i20=-10, i21=-7, i22=-23878, i23=-147;
        float f2=1.232F, fArr1[]=new float[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(fArr1, 90.590F);
        FuzzerUtils.init(lArr, -3002268359L);

        Test.iArrFld[(i >>> 1) % N] *= (int)(((-1.494F - Test.instanceCount) + (Test.dFld / (i | 1))) - -49255);
        i += (((87 - Test.iArrFld[(104 >>> 1) % N]) + (187 + (-(i--)))) >>> i);
        sArrFld[(i >>> 1) % N] += (short)fMeth(-1.111142);
        i = -2;
        for (i16 = 6; i16 < 188; i16++) {
            i = (int)Test.instanceCount;
            f2 /= (i16 | 1);
            Test.instanceCount -= i16;
            for (i18 = i16; i18 < 138; i18++) {
                switch ((((i19 >>> 1) % 2) * 5) + 20) {
                case 24:
                    fArr1[i18 - 1] -= i17;
                    for (i20 = 1; i20 < 1; ++i20) {
                        i19 = (int)f2;
                        f2 += f2;
                        i19 = (int)Test.instanceCount;
                        Test.instanceCount = -18;
                        i17 = (int)Test.instanceCount;
                        Test.instanceCount += i16;
                        if (Test.bFld) continue;
                        i += (i20 * f2);
                        Test.iArrFld[i16 - 1] ^= i21;
                    }
                    for (i22 = 1; i22 < 1; i22++) {
                        Test.instanceCount += (i22 - i21);
                        i17 = -20171;
                        Test.bFld = true;
                        if (Test.bFld) {
                            if (Test.bFld) break;
                            lArr[i18 - 1] <<= i22;
                        } else if (Test.bFld) {
                            i += i19;
                            i23 += (((i22 * Test.instanceCount) + Test.instanceCount) - Test.instanceCount);
                        } else {
                            Test.instanceCount *= -937287725L;
                        }
                    }
                    break;
                case 26:
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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  sMeth ->  sMeth vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
