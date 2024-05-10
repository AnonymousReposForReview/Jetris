package tests.javafuzzer1530;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 22:10:44 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-6L;
    public static double dFld=2.110579;
    public static short sFld=-13181;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 73);
    }

    public static long bMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i13, int i14) {

        int i15=19, i16=45574, i17=-8198, i18=87, iArr2[][]=new int[N][N];
        boolean b2=false;
        double d=1.80792;
        float f2=21.533F;

        FuzzerUtils.init(iArr2, -24346);

        Test.instanceCount <<= i13;
        for (i15 = 1; i15 < 182; i15++) {
            if (b2) break;
            switch (((i15 >>> 1) % 2) + 81) {
            case 81:
                i13 += (((i15 * Test.instanceCount) + i15) - Test.instanceCount);
            case 82:
                b2 = b2;
                break;
            }
            Test.dFld = -2L;
            i17 = 1;
            do {
                Test.instanceCount -= i16;
                Test.iArrFld[i17] = i15;
                Test.dFld *= Test.instanceCount;
                for (d = 1; d < 1; d++) {
                    Test.sFld = (short)i15;
                    f2 += (float)(d * d);
                    iArr2 = iArr2;
                }
            } while (++i17 < 9);
        }
        vMeth1_check_sum += i13 + i14 + i15 + i16 + (b2 ? 1 : 0) + i17 + Double.doubleToLongBits(d) + i18 +
            Float.floatToIntBits(f2) + FuzzerUtils.checkSum(iArr2);
    }

    public static void vMeth(int i9, int i10) {

        float f1=-1.841F;
        int i11=-55, i12=51632, i19=-50699, i20=-55179;
        boolean b1=false;
        byte by1=28;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -1.113178);

        dArr[(16878 >>> 1) % N] %= (Test.sFld | 1);
        i10 -= (-Math.min(i10, (int)(i10 - f1)));
        for (i11 = 305; i11 > 6; i11 -= 2) {
            if (b1 ^ (Math.min((int)(Test.iArrFld[i11] -= (int)f1), --i12) < (-12 + (f1 + 7)))) continue;
            by1 <<= (byte)(--Test.iArrFld[i11 - 1]);
            i12 -= (--i12);
            vMeth1(i10, i12);
        }
        i10 -= i10;
        for (i19 = 3; i19 < 216; ++i19) {
            i9 += 101;
            i9 <<= (int)-63123L;
            i12 -= Test.sFld;
        }
        by1 = (byte)i9;
        i12 += (int)f1;
        i12 = (int)Test.dFld;
        vMeth_check_sum += i9 + i10 + Float.floatToIntBits(f1) + i11 + i12 + (b1 ? 1 : 0) + by1 + i19 + i20 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public boolean bMeth(int i6) {

        int i7=-38802, i8=-28, i21=92, i22=-37676;
        float f3=92.1004F, fArr1[][]=new float[N][N];
        byte by2=-53;
        long lArr[][]=new long[N][N];
        short sArr[]=new short[N];

        FuzzerUtils.init(lArr, -12L);
        FuzzerUtils.init(sArr, (short)6715);
        FuzzerUtils.init(fArr1, 75.116F);

        for (i7 = 159; i7 > 7; i7 -= 3) {
            vMeth(i6, 0);
            f3 += (((i7 * i8) + i6) - i6);
            i8 += (i7 + i8);
            for (i21 = 1; i21 < 31; ++i21) {
                lArr[i21 + 1] = lArr[i21 - 1];
                i8 <<= i21;
                if (false) break;
                sArr[i7 - 1] += (short)i7;
                i8 += (((i21 * i22) + i7) - i7);
                i8 += (i21 | Test.instanceCount);
                fArr1[i7][i21 - 1] -= by2;
                i22 >>>= -6456;
                i6 = (int)Test.instanceCount;
            }
            i22 &= (int)Test.instanceCount;
        }
        long meth_res = i6 + i7 + i8 + Float.floatToIntBits(f3) + i21 + i22 + by2 + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(sArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void mainTest(String[] strArr1) {

        int i=-14, i1=6931, i2=-59298, i3=11, i4=-5, i5=25708, iArr[]=new int[N], iArr1[][]=new int[N][N];
        float f=21.754F, fArr[]=new float[N];
        byte by=20;
        boolean b=true;

        FuzzerUtils.init(fArr, -92.514F);
        FuzzerUtils.init(iArr, 19729);
        FuzzerUtils.init(iArr1, -14);

        for (i = 382; 2 < i; --i) {
            switch ((i % 5) + 109) {
            case 109:
                i1 = (int)(fArr[i]--);
                iArr[i] *= (int)Test.instanceCount;
                break;
            case 110:
                f += i;
                i1 = (i1++);
                for (i2 = 3; i2 < 66; i2++) {
                    i3 -= (++i1);
                    switch ((((iArr1[i2][i2 + 1] >>> 1) % 1) * 5) + 98) {
                    case 102:
                        for (i4 = 1; i4 < 2; i4++) {
                            switch ((i2 % 4) + 127) {
                            case 127:
                                i3 = (int)(((++iArr[i2 - 1]) + by) + (++Test.dFld));
                                Test.instanceCount += i4;
                                break;
                            case 128:
                                b = bMeth(i);
                                Test.instanceCount += Test.instanceCount;
                                Test.sFld &= by;
                                break;
                            case 129:
                                f += (8659391959749337895L + (i4 * i4));
                                i3 -= i1;
                                i5 -= (int)-8L;
                                i1 -= (int)94.156F;
                            case 130:
                                Test.instanceCount = -151;
                                iArr1[i4 + 1][i2 + 1] >>= (int)Test.instanceCount;
                                switch (((i % 10) * 5) + 80) {
                                case 124:
                                    Test.sFld += (short)(((i4 * i) + i1) - i3);
                                    i1 = (int)f;
                                    if (b) {
                                        Test.instanceCount -= by;
                                        i1 += (i4 * i4);
                                        i1 *= i3;
                                    } else if (b) {
                                        f = -6;
                                    }
                                    break;
                                case 127:
                                    i5 = i5;
                                    break;
                                case 100:
                                    iArr1[i2][i] = -32;
                                    break;
                                case 122:
                                    if (b) break;
                                    break;
                                case 83:
                                    i5 = i1;
                                case 120:
                                    i5 = i4;
                                case 129:
                                    i3 = (int)Test.instanceCount;
                                    break;
                                case 103:
                                    i1 = i4;
                                case 109:
                                    f -= f;
                                    break;
                                case 128:
                                    iArr1[i + 1][i] <<= i;
                                default:
                                    i5 += (0 + (i4 * i4));
                                }
                            }
                        }
                    default:
                        i5 += (((i2 * i1) + f) - f);
                    }
                }
            case 111:
                i3 = i5;
                break;
            case 112:
                iArr1[i - 1][i + 1] *= i4;
            case 113:
                Test.dFld += Test.instanceCount;
            default:
                f += (196 + (i * i));
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
//DEBUG  bMeth ->  bMeth mainTest
//DEBUG  vMeth ->  vMeth bMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth bMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}