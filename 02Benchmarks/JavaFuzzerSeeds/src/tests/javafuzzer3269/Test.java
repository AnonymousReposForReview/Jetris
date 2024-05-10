package tests.javafuzzer3269;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 05:22:48 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-7L;
    public volatile double dFld=0.88190;
    public float fFld=0.329F;
    public byte byFld1=-47;
    public static boolean bArrFld[]=new boolean[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.bArrFld, false);
        FuzzerUtils.init(Test.iArrFld, -12);
    }

    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;
    public static long vMeth3_check_sum = 0;

    public static void vMeth3(int i6, double d, int i7) {

        int i8=-3, i9=9793, i10=-4, i11=11, i12=-8;
        boolean b=false;
        float f=122.571F;

        i6 = i6;
        i7 >>= -5598;
        for (i8 = 8; i8 < 384; i8++) {
            i7 = 225;
            i7 += (int)14L;
            i10 = 1;
            while (++i10 < 4) {
                for (i11 = 1; i11 < 1; i11++) {
                    i7 += i11;
                    i12 += (i11 * i8);
                    Test.instanceCount = i6;
                    Test.bArrFld[i11] = b;
                    Test.iArrFld[i10 + 1] *= (int)f;
                    i9 *= i6;
                    if (b) continue;
                    if (b) continue;
                }
            }
        }
        vMeth3_check_sum += i6 + Double.doubleToLongBits(d) + i7 + i8 + i9 + i10 + i11 + i12 + (b ? 1 : 0) +
            Float.floatToIntBits(f);
    }

    public static void vMeth2() {

        int i5=-4, i13=-12, i14=30, i15=90;
        boolean b1=false, b2=true;
        float f1=-43.575F;
        double d2=123.67999, dArr[]=new double[N];

        FuzzerUtils.init(dArr, 36.41865);

        i5 = 1;
        while (++i5 < 202) {
            double d1=0.84642;
            vMeth3(i5, d1, i5);
            if (b2) {
                for (i13 = 1; i13 < 8; ++i13) {
                    i14 -= i13;
                    b1 = true;
                    i14 -= (int)Test.instanceCount;
                    switch ((i5 % 3) + 44) {
                    case 44:
                        f1 *= -190;
                        for (d2 = 1; d2 < 2; ++d2) {
                            i14 -= i5;
                            switch ((i13 % 9) + 118) {
                            case 118:
                                d1 = i14;
                                break;
                            case 119:
                                Test.instanceCount += (long)d2;
                                b1 = b2;
                                break;
                            case 120:
                                i14 += (int)d2;
                                break;
                            case 121:
                                Test.instanceCount += (long)d2;
                                break;
                            case 122:
                                f1 += (-43 + (d2 * d2));
                            case 123:
                                i14 += (int)(((d2 * i14) + i15) - Test.instanceCount);
                            case 124:
                                i14 -= i13;
                            case 125:
                                f1 += (float)d2;
                                break;
                            case 126:
                                i14 += (int)d2;
                                break;
                            }
                        }
                        break;
                    case 45:
                        Test.instanceCount = i15;
                    case 46:
                        dArr[i5] += i15;
                        break;
                    }
                }
            }
        }
        vMeth2_check_sum += i5 + i13 + i14 + (b1 ? 1 : 0) + Float.floatToIntBits(f1) + Double.doubleToLongBits(d2) +
            i15 + (b2 ? 1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth1(long l, int i4) {

        double d3=0.21903;

        vMeth2();
        i4 = (int)d3;
        i4 <<= (int)l;
        vMeth1_check_sum += l + i4 + Double.doubleToLongBits(d3);
    }

    public void mainTest(String[] strArr3) {

        int i16=5, i17=108, i18=-75, i19=20653, i20=-65, i21=4, i22=-25, i23=8, i24=237, i25=-13;
        float f2=31.235F, f3=-1.801F, fArr[]=new float[N];
        byte byArr[][]=new byte[N][N];

        FuzzerUtils.init(fArr, 0.787F);
        FuzzerUtils.init(byArr, (byte)-14);

        vMeth1(Test.instanceCount, i16);
        Test.instanceCount = Test.instanceCount;
        fArr = FuzzerUtils.float1array(N, (float)75.635F);
        i16 += (int)dFld;
        for (i17 = 5; 140 > i17; ++i17) {
            for (i19 = i17; i19 < 186; i19++) {
                Test.instanceCount += (i19 * i19);
                Test.instanceCount <<= i17;
                i16 = i18;
                i16 -= (int)dFld;
            }
            for (f2 = 7; f2 < 186; ++f2) {
                Test.iArrFld[(int)(f2)] >>>= i20;
                Test.iArrFld[i17 - 1] *= (int)f2;
                Test.instanceCount += (long)(f2 * f2);
                i21 >>= i16;
                for (i22 = (int)(f2); i22 < 2; ++i22) {
                    byArr[i22 + 1][(int)(f2 + 1)] = (byte)Test.instanceCount;
                    Test.instanceCount += i22;
                    Test.instanceCount *= Test.instanceCount;
                    fFld -= i21;
                }
                Test.instanceCount += (-11645 + (f2 * f2));
                i21 *= -110;
                Test.instanceCount *= i20;
            }
            f3 = 186;
            while (--f3 > 0) {
                Test.instanceCount += (long)(((f3 * i22) + byFld1) - i23);
            }
            switch (((-5 >>> 1) % 10) + 126) {
            case 126:
                for (i24 = 5; i24 < 186; i24++) {
                    i25 += (-1 + (i24 * i24));
                    i16 = i20;
                    i20 = (int)Test.instanceCount;
                }
                break;
            case 127:
                i16 += i17;
                break;
            case 128:
                if (true) break;
                break;
            case 129:
                Test.instanceCount >>= i24;
                break;
            case 130:
                fArr[i17 - 1] = 251L;
                break;
            case 131:
                i16 = i20;
            case 132:
                fArr[(i17 >>> 1) % N] -= -9829;
                break;
            case 133:
                i16 = (int)fFld;
                break;
            case 134:
                i16 = (int)dFld;
                break;
            case 135:
                i21 = i23;
                break;
            }
        }

    }
    public static void main(String[] strArr2) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr2);
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
//DEBUG  vMeth1 ->  vMeth1 mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 mainTest
//DEBUG  vMeth3 ->  vMeth3 vMeth2 vMeth1 mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}