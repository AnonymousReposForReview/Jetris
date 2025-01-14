package tests.javafuzzer1107;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 14:32:11 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-137L;
    public static byte byFld=-74;
    public static boolean bFld=false;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 3818722825174536705L);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(long l1, int i9, boolean b) {

        float f3=-1.749F;
        int i10=4571, i11=58116, i12=27, i13=55947, i14=-146;

        i9 *= i9;
        f3 += -2298;
        for (i10 = 6; i10 < 339; ++i10) {
            i9 = (int)l1;
        }
        l1 = i10;
        for (i12 = 7; i12 < 256; ++i12) {
            i14 = 1;
            do {
                Test.instanceCount += (i14 * i14);
                l1 *= l1;
                i9 >>= i13;
                Test.instanceCount ^= i12;
                i11 *= i11;
                f3 += 245;
                i9 -= (int)l1;
            } while (++i14 < 7);
            i9 += (i12 ^ i11);
        }
        long meth_res = l1 + i9 + (b ? 1 : 0) + Float.floatToIntBits(f3) + i10 + i11 + i12 + i13 + i14;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(float f2, int i3, int i4) {

        int i5=106, i6=146, i7=-14, i8=-219, i15=1, i16=-1, iArr[]=new int[N];
        boolean b1=true;
        double d=35.106793, dArr[][]=new double[N][N];
        byte by=118;

        FuzzerUtils.init(dArr, 0.120669);
        FuzzerUtils.init(iArr, -27257);

        for (i5 = 258; i5 > 6; --i5) {
            for (i7 = 1; i7 < 6; ++i7) {
                i8 = Math.min((int)(iMeth1(Test.instanceCount, i3, b1) + Test.instanceCount), i8);
                Test.lArrFld[i7 - 1] ^= Test.instanceCount;
                if (i5 != 0) {
                }
                i8 <<= (int)Test.instanceCount;
                Test.instanceCount -= 44;
                for (i15 = i5; i15 < 2; i15++) {
                    switch (((i5 >>> 1) % 9) + 81) {
                    case 81:
                        dArr[i5][i15 + 1] += i3;
                        break;
                    case 82:
                        i16 += (((i15 * Test.instanceCount) + f2) - i8);
                    case 83:
                        i4 = -165;
                        i6 -= i8;
                        d -= f2;
                    case 84:
                        f2 = Test.instanceCount;
                        break;
                    case 85:
                        by += (byte)i15;
                        break;
                    case 86:
                        i8 = i15;
                        break;
                    case 87:
                        try {
                            iArr[i15] = (i16 / 60667);
                            i3 = (i5 % 16035);
                            i6 = (i5 % i6);
                        } catch (ArithmeticException a_e) {}
                    case 88:
                    case 89:
                    }
                }
            }
        }
        long meth_res = Float.floatToIntBits(f2) + i3 + i4 + i5 + i6 + i7 + i8 + (b1 ? 1 : 0) + i15 + i16 +
            Double.doubleToLongBits(d) + by + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(float f, float f1, long l) {

        int i2=-10, i17=201, i18=-88, i20=-252, i21=19, iArr1[]=new int[N];
        short s=8643;
        boolean b2=false;
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr1, -19074);
        FuzzerUtils.init(fArr, -1.887F);

        i2 = (int)((-7 - (l++)) * iMeth(f, i2, 194));
        iArr1[(i2 >>> 1) % N] = i2;
        i2 = (int)Test.instanceCount;
        i2 += i2;
        for (i17 = 9; i17 < 176; ++i17) {
            Test.byFld = (byte)i17;
            for (i20 = 9; i17 < i20; i20--) {
                Test.instanceCount = i20;
                iArr1[i17] = (int)Test.instanceCount;
                switch ((i17 % 2) + 58) {
                case 58:
                    Test.instanceCount += i20;
                    break;
                case 59:
                    fArr[i20] -= f1;
                    f1 += i20;
                    Test.instanceCount <<= s;
                    b2 = true;
                    break;
                default:
                    i21 -= i17;
                }
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + Float.floatToIntBits(f1) + l + i2 + i17 + i18 + i20 + i21 + s +
            (b2 ? 1 : 0) + FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i=-52174, i1=-21996, i22=-47527, i23=97, i24=-5, i25=-27072, iArr2[]=new int[N];
        float f4=0.658F, f5=12.601F, f6=-32.882F;
        double d1=58.127432, dArr1[]=new double[N];
        short s1=17459;

        FuzzerUtils.init(iArr2, -4);
        FuzzerUtils.init(dArr1, 0.18353);

        for (i = 11; 177 > i; ++i) {
            i1 = (++i1);
        }
        vMeth(f4, f4, Test.instanceCount);
        f4 += 8372377611465036773L;
        Test.instanceCount = (long)f4;
        i22 = 1;
        while (++i22 < 163) {
            i1 = Test.byFld;
            Test.instanceCount += i22;
            iArr2[i22 + 1] -= (int)Test.instanceCount;
            iArr2[i22 + 1] *= i22;
            f4 -= i23;
        }
        d1 += 2532677912L;
        i23 = i1;
        i24 = 1;
        while (++i24 < 281) {
            Test.lArrFld[i24 - 1] <<= i;
            Test.instanceCount *= i24;
            i1 -= i1;
            switch ((((i1 >>> 1) % 8) * 5) + 115) {
            case 138:
                for (f5 = i24; f5 < 89; ++f5) {
                    s1 -= (short)i1;
                }
                break;
            case 120:
                switch ((i24 % 5) + 13) {
                case 13:
                    Test.instanceCount -= (long)d1;
                    break;
                case 14:
                    if (Test.bFld) break;
                    dArr1[i24] += i22;
                    iArr2[i24 - 1] *= s1;
                    i1 += (i24 - i22);
                    break;
                case 15:
                    f6 = 1;
                    do {
                        i1 += (int)f6;
                        Test.instanceCount %= (i1 | 1);
                        iArr2[(int)(f6)] = i1;
                    } while (++f6 < 89);
                    break;
                case 16:
                    i1 = i22;
                case 17:
                    iArr2[i24 + 1] = 50381;
                default:
                    i1 = i;
                }
                break;
            case 155:
                i1 += (i24 | i25);
                break;
            case 125:
                Test.instanceCount &= i1;
                break;
            case 148:
                i25 = i22;
                break;
            case 147:
            case 143:
                i1 = i25;
                break;
            case 133:
                iArr2[i24 - 1] >>>= i;
                break;
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
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
