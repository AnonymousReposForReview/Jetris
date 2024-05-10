package tests.javafuzzer2409;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 14:21:21 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2L;
    public static double dFld=-93.74773;
    public static short sFld=-28540;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -230);
    }

    public static long vMeth_check_sum = 0;
    public static long byMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i5, long l1) {

        int i6=-190, i7=96, i8=49, i9=49158, i10=1297;
        double d1=-124.60327, d2=0.88252;
        float f1=1.202F;
        short s2=-6325;

        for (i6 = 10; 387 > i6; ++i6) {
            d1 += f1;
            l1 = Test.instanceCount;
            i5 <<= (int)Test.instanceCount;
            l1 += (i6 + s2);
            i7 -= i5;
        }
        l1 = Test.instanceCount;
        i8 = 1;
        while (++i8 < 337) {
            d2 = 1;
            while (++d2 < 5) {
                f1 -= 2.726F;
                for (i9 = i8; i9 < 1; i9++) {
                    i7 += (int)Test.instanceCount;
                    Test.iArrFld[i8] = (int)Test.instanceCount;
                    f1 -= -58L;
                    Test.iArrFld[i8] ^= (int)Test.instanceCount;
                }
            }
        }
        long meth_res = i5 + l1 + i6 + i7 + Double.doubleToLongBits(d1) + Float.floatToIntBits(f1) + s2 + i8 +
            Double.doubleToLongBits(d2) + i9 + i10;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static byte byMeth(short s, short s1, int i1) {

        int i2=2, i3=-18046, i4=-31364;
        float f=102.134F;
        double d=-83.70486;
        byte by=53;
        boolean b=false;

        i1 += (--i1);
        for (i2 = 3; i2 < 246; i2++) {
            f += (((i2 * i1) + Test.instanceCount) - Test.instanceCount);
            for (d = 1; d < 7; d += 2) {
                Test.instanceCount = (i3 << iMeth(i4, Test.instanceCount));
                by += (byte)i3;
                Test.iArrFld = FuzzerUtils.int1array(N, (int)-213);
                i4 -= (int)-31408L;
                if (b) {
                    Test.instanceCount = i1;
                    s = (short)203;
                } else if (b) {
                    Test.instanceCount = i1;
                } else {
                    i4 = i4;
                    i3 = 8;
                    f -= Test.instanceCount;
                }
            }
        }
        long meth_res = s + s1 + i1 + i2 + i3 + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i4 + by + (b ? 1
            : 0);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public static void vMeth(long l, int i) {

        short s3=-1067;
        int i11=-61451, i12=-144, i13=-28634, i14=28380, i15=-4;
        byte by1=-6;
        long l2=67L, lArr[]=new long[N];
        float f3=111.605F;
        boolean b1=false;

        FuzzerUtils.init(lArr, 5731148334107836004L);

        byMeth(s3, s3, i);
        i += i;
        Test.dFld -= i;
        if (b1) {
            switch (((i11 >>> 1) % 8) + 111) {
            case 111:
                try {
                    i12 = 385;
                    while (--i12 > 0) {
                        float f2=125.252F;
                        i += s3;
                        f2 += (i12 - f2);
                        by1 -= (byte)i11;
                        i11 = i;
                        for (l2 = 1; l2 < 4; l2++) {
                            for (i14 = 1; i14 < 2; ++i14) {
                                i += i15;
                                i13 *= (int)l2;
                            }
                        }
                    }
                }
                catch (NegativeArraySizeException exc3) {
                    i15 >>= by1;
                }
                finally {
                    f3 = 0.555F;
                }
                break;
            case 112:
                i11 = 55882;
            case 113:
                i15 *= (int)Test.instanceCount;
                break;
            case 114:
                lArr[(i14 >>> 1) % N] = 97;
                break;
            case 115:
                Test.instanceCount += l2;
                break;
            case 116:
                Test.instanceCount &= by1;
                break;
            case 117:
                i += i11;
                break;
            case 118:
            }
            vMeth_check_sum += l + i + s3 + i11 + i12 + by1 + l2 + i13 + i14 + i15 + Float.floatToIntBits(f3) + (b1 ? 1
                : 0) + FuzzerUtils.checkSum(lArr);
            return;
        }
        vMeth_check_sum += l + i + s3 + i11 + i12 + by1 + l2 + i13 + i14 + i15 + Float.floatToIntBits(f3) + (b1 ? 1 :
            0) + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i16=8, i17=-26090, i18=6646, i19=241, i20=37105, i21=-11, i22=-5;
        short s4=-9631;
        float f4=-2.877F, fArr[]=new float[N];
        byte by2=124;
        boolean b2=false;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 49050L);
        FuzzerUtils.init(fArr, 2.406F);

        vMeth(Test.instanceCount, i16);
        s4 = (short)Test.instanceCount;
        for (i17 = 23; i17 < 393; ++i17) {
            switch ((i17 % 5) + 98) {
            case 98:
                i18 = s4;
                for (i19 = 1; i19 < 68; ++i19) {
                    i18 |= i17;
                    i20 += (((i19 * i16) + i20) - Test.instanceCount);
                }
                f4 -= -40674;
                i21 = 1;
                while (++i21 < 68) {
                    s4 >>>= (short)i17;
                    Test.instanceCount += (((i21 * i20) + i19) - Test.instanceCount);
                    switch ((((i20 >>> 1) % 4) * 5) + 79) {
                    case 84:
                        i20 >>= -39820;
                        i20 += by2;
                        i16 >>= i21;
                        Test.iArrFld[i21] = (int)f4;
                        break;
                    case 81:
                        i20 = i16;
                        s4 += (short)(i21 * i21);
                        break;
                    case 89:
                        i22 = 1;
                        do {
                            f4 = f4;
                            lArr1[i22] = 5L;
                            switch ((i17 % 7) + 30) {
                            case 30:
                                i16 = s4;
                                switch ((i17 % 5) + 9) {
                                case 9:
                                    if (b2) continue;
                                    i20 = i18;
                                    i20 += i16;
                                    break;
                                case 10:
                                    f4 = -2847L;
                                    f4 += Test.instanceCount;
                                    break;
                                case 11:
                                    i20 += (1 + (i22 * i22));
                                    break;
                                case 12:
                                    i18 += (int)Test.instanceCount;
                                    break;
                                case 13:
                                    by2 += (byte)(i22 - i18);
                                default:
                                    Test.instanceCount = i18;
                                }
                                break;
                            case 31:
                                f4 += (i22 + i20);
                                break;
                            case 32:
                                i20 += (((i22 * i18) + Test.sFld) - i16);
                                break;
                            case 33:
                                i18 += (int)-6408L;
                                break;
                            case 34:
                                Test.iArrFld[i22] /= (int)(i20 | 1);
                                break;
                            case 35:
                                fArr = fArr;
                                break;
                            case 36:
                                i16 -= 32301;
                                break;
                            }
                        } while (++i22 < 1);
                        break;
                    case 86:
                        i18 *= Test.sFld;
                        break;
                    default:
                        i18 = 3695;
                    }
                }
            case 99:
                try {
                    i18 = (Test.iArrFld[i17] % i18);
                    i16 = (-151 % i20);
                    i16 = (Test.iArrFld[i17 - 1] / 40549);
                } catch (ArithmeticException a_e) {}
                break;
            case 100:
                Test.instanceCount += (i17 | Test.instanceCount);
                break;
            case 101:
                f4 += i17;
                break;
            case 102:
                i20 += (i17 * i17);
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
//DEBUG  byMeth ->  byMeth vMeth mainTest
//DEBUG  iMeth ->  iMeth byMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}