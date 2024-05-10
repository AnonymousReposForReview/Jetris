package tests.javafuzzer1876;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 05:11:45 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-59L;
    public static long lFld=20661L;
    public static float fFld=2.862F;
    public static float fArrFld[]=new float[N];
    public static int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.fArrFld, 0.962F);
        FuzzerUtils.init(Test.iArrFld, -35);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long bMeth_check_sum = 0;
    public static long iMeth2_check_sum = 0;

    public static void vMeth(long l) {

        int i2=-18256, i3=-50924, i4=175, i5=64, i6=-167, i7=23764, iArr1[]=new int[N];
        double d1=-1.6649, d2=0.54208;
        short s=-27713;
        float f1=-2.354F, fArr[]=new float[N];
        byte by=36;
        boolean b=false, bArr[]=new boolean[N];

        FuzzerUtils.init(iArr1, -8);
        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(fArr, 0.403F);

        iArr1[(i2 >>> 1) % N] += (int)(++d1);
        try {
            bArr[(-4 >>> 1) % N] = true;
            for (i3 = 332; i3 > 8; i3 -= 2) {
                i2 = (int)(Math.max((int)(i2 - l), iArr1[(23 >>> 1) % N]) - (fArr[i3] * (i3 + s)));
                i2 += (((i3 * i4) + i3) - i3);
                i4 = (int)(((i4 = i4) - (-(i3 << i3))) - ((-217 - s) * (l - i2)));
                f1 += ((long)i3 ^ (long)i3);
                for (d2 = 1; 10 > d2; d2 += 2) {
                    for (i6 = 1; i6 < 3; i6 += 2) {
                        i5 -= 3;
                        i7 %= (int)((i7 + (-5 - (i2 - l))) | 1);
                        i2 += (int)((--f1) + (i2 += iArr1[i3 - 1]));
                    }
                    i5 += (int)(d2 - by);
                }
            }
        }
        catch (UserDefinedExceptionTest exc1) {
            b = (b = (b & bArr[(6 >>> 1) % N]));
        }
        vMeth_check_sum += l + i2 + Double.doubleToLongBits(d1) + i3 + i4 + s + Float.floatToIntBits(f1) +
            Double.doubleToLongBits(d2) + i5 + i6 + i7 + by + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(bArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth1(boolean b1, long l2) {

        int i8=-51157, iArr2[][]=new int[N][N];
        float f2=2.425F;

        FuzzerUtils.init(iArr2, 35951);

        i8 = (int)((l2 - (Test.lFld -= Test.instanceCount)) + ((++i8) - Test.fArrFld[(i8 >>> 1) % N]));
        f2 += (i8 * (~(-(l2 - i8))));
        f2 = l2;
        l2 = (iArr2[(i8 >>> 1) % N][(i8 >>> 1) % N]--);
        iArr2[(-40571 >>> 1) % N][(i8 >>> 1) % N] += i8;
        long meth_res = (b1 ? 1 : 0) + l2 + i8 + Float.floatToIntBits(f2) + FuzzerUtils.checkSum(iArr2);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth2(long l5) {

        int i13=-72, i14=-27591, i15=-7489, i16=139;
        double d3=37.18553;
        boolean b2=false;
        short s1=7262;

        Test.iArrFld[(i13 >>> 1) % N][(-43586 >>> 1) % N] = (int)l5;
        i14 = 1;
        while (++i14 < 269) {
            i15 = 1;
            do {
                Test.iArrFld[i15 - 1][i15 + 1] *= (int)d3;
                b2 = false;
                if (i14 != 0) {
                }
                i13 /= (int)(i13 | 1);
                Test.iArrFld[i15] = Test.iArrFld[i15 - 1];
                i16 = 1;
                while (++i16 < 1) {
                    float f3=2.686F;
                    switch ((((i15 >>> 1) % 10) * 5) + 107) {
                    case 112:
                    case 114:
                        Test.lFld <<= i14;
                    case 148:
                        l5 = s1;
                    case 138:
                        s1 = (short)i14;
                        i13 += (((i16 * f3) + i16) - i14);
                        Test.instanceCount >>= i16;
                        break;
                    case 144:
                        i13 >>= (int)0L;
                        break;
                    case 140:
                        Test.lFld = i16;
                        break;
                    case 142:
                        i13 = (int)Test.lFld;
                        break;
                    case 150:
                    case 121:
                    case 131:
                        i13 *= i14;
                    }
                }
            } while (++i15 < 6);
        }
        long meth_res = l5 + i13 + i14 + i15 + Double.doubleToLongBits(d3) + (b2 ? 1 : 0) + i16 + s1;
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public static boolean bMeth() {

        int i12=10988, i17=-40, i18=27, i19=44787, i20=-64560, i21=-137;
        byte by2=68;
        short sArr[]=new short[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(sArr, (short)-6653);
        FuzzerUtils.init(dArr, -1.25595);

        i12 += (++Test.iArrFld[(i12 >>> 1) % N][(i12 >>> 1) % N]);
        i12 <<= iMeth2(Test.instanceCount);
        i12 |= i12;
        i17 = 1;
        while (++i17 < 321) {
            Test.iArrFld[i17][i17] = -35228;
            sArr[i17] /= (short)(Test.instanceCount | 1);
            dArr[i17] += Test.instanceCount;
            for (i18 = 1; i18 < 5; ++i18) {
                for (i20 = 1; 2 > i20; i20++) {
                    by2 = (byte)-5773038546536449822L;
                    Test.iArrFld[i17 - 1][i17 + 1] ^= -236;
                    i19 >>= -52;
                    Test.instanceCount -= (long)Test.fFld;
                }
                Test.lFld += (-43L + (i18 * i18));
                i21 |= i20;
            }
        }
        long meth_res = i12 + i17 + i18 + i19 + i20 + i21 + by2 + FuzzerUtils.checkSum(sArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static int iMeth(float f) {

        int i=251, i1=-185, i9=1, i10=-21967, i11=60354, iArr[][]=new int[N][N];
        double d=-2.88608;
        long l1=11L, l3=-116964426L, l4=57488L;
        byte by1=-48;
        float fArr1[]=new float[N];

        FuzzerUtils.init(iArr, 197);
        FuzzerUtils.init(fArr1, -61.155F);

        i = 1;
        while (++i < 181) {
            i1 >>= Math.min(i1, i1);
            Test.instanceCount = (long)((--d) * ((-(iArr[i + 1][i + 1]++)) * 9));
            Test.instanceCount += i;
            i1 *= (i1--);
            vMeth(Test.instanceCount);
        }
        f = (-l1);
        fArr1[(i1 >>> 1) % N] = (iArr[(i1 >>> 1) % N][(i >>> 1) % N] + i1);
        by1 |= (byte)(i1 += (int)(f--));
        vMeth(-iMeth1(i >= 8, l3));
        l1 = (((i - i) + (i / 201)) - i);
        for (i9 = 1; i9 < 185; i9++) {
            for (l4 = 1; l4 < 9; ++l4) {
                d -= (i1 -= (int)l4);
                l1 -= (iMeth1(bMeth(), Test.lFld) + i9);
            }
        }
        long meth_res = Float.floatToIntBits(f) + i + i1 + Double.doubleToLongBits(d) + l1 + by1 + l3 + i9 + i10 + l4 +
            i11 + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        byte by3=-50;
        int i22=-11, i23=-51222, i24=47795, i25=-54725, i26=7, i27=-3, i28=0, i29=954;
        boolean b3=true;
        double d4=1.23234;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -106L);

        iMeth(Test.fFld);
        Test.iArrFld = Test.iArrFld;
        by3 = (byte)i22;
        i23 = 1;
        while (++i23 < 203) {
            if (b3) {
                i22 += i22;
                for (i24 = 1; i24 < 124; i24++) {
                    if (b3) {
                        i22 *= (int)Test.fFld;
                        Test.iArrFld[i23][i23 + 1] = i22;
                    } else {
                        switch (((i23 % 3) * 5) + 105) {
                        case 111:
                            by3 = (byte)i22;
                            d4 += 40.58222;
                            for (i26 = 1; i26 < 2; ++i26) {
                                i22 *= (int)Test.lFld;
                                i25 *= i22;
                                d4 += -57865L;
                                if (b3) break;
                                Test.iArrFld[i26][i24] = i27;
                                lArr[i24] = i23;
                            }
                            break;
                        case 114:
                            try {
                                i25 = (-30 / i23);
                                i22 = (0 % Test.iArrFld[i24 - 1][i23 + 1]);
                                i25 = (i22 % 134);
                            } catch (ArithmeticException a_e) {}
                            i25 += -37;
                            d4 = -1.77678;
                        case 115:
                            for (i28 = 1; 2 > i28; ++i28) {
                                i29 = (int)Test.lFld;
                                switch (((i23 % 4) * 5) + 111) {
                                case 130:
                                    if (b3) break;
                                    Test.fArrFld[i23] += by3;
                                    Test.instanceCount = -22;
                                    Test.instanceCount += (i28 ^ i28);
                                    break;
                                case 117:
                                    Test.iArrFld[i24 + 1][i28 - 1] <<= -237;
                                    break;
                                case 118:
                                    Test.instanceCount = i28;
                                    break;
                                case 113:
                                    i27 += (i28 | i28);
                                    break;
                                default:
                                    i25 += (i28 * i29);
                                }
                            }
                            break;
                        }
                    }
                }
            } else if (b3) {
                i22 += i23;
            } else if (b3) {
                if (b3) break;
            } else {
                i25 = -177;
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
class UserDefinedExceptionTest extends RuntimeException {
    public int field;
}

//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  bMeth ->  bMeth iMeth mainTest
//DEBUG  iMeth2 ->  iMeth2 bMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
