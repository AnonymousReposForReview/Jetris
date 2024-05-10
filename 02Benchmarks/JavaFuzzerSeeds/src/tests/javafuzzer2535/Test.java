package tests.javafuzzer2535;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 16:25:01 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=196L;
    public static byte byFld=68;
    public static double dFld=1.127290;
    public volatile boolean bFld=false;
    public static int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];
    public static volatile double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -43538);
        FuzzerUtils.init(Test.fArrFld, -111.863F);
        FuzzerUtils.init(Test.dArrFld, 1.6788);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i9=30564, i10=-2, i11=-11, i12=14, i13=5, i14=21, i15=-209, iArr1[]=new int[N];
        boolean b=false;
        float f3=2.428F;
        short s=-25630;
        long lArr2[]=new long[N];

        FuzzerUtils.init(iArr1, -163);
        FuzzerUtils.init(lArr2, -6L);

        for (i9 = 20; 338 > i9; ++i9) {
            iArr1[i9 + 1] *= i9;
            for (i11 = 5; 1 < i11; i11--) {
                if (b) continue;
                for (i13 = 1; i13 < 2; ++i13) {
                    iArr1[i13 - 1] %= (int)(i13 | 1);
                    switch (((i9 % 2) * 5) + 57) {
                    case 67:
                        i10 += (((i13 * i12) + i10) - Test.byFld);
                        switch ((((-47957 >>> 1) % 4) * 5) + 105) {
                        case 121:
                            f3 -= -15605;
                            switch ((i9 % 7) + 47) {
                            case 47:
                                lArr2[i9 - 1] *= 16115;
                                i10 += s;
                                i10 += (int)Test.instanceCount;
                                Test.dFld *= i11;
                            case 48:
                                i14 += (i13 * i13);
                                break;
                            case 49:
                                iArr1[i11 + 1] -= i9;
                            case 50:
                                iArr1[i9] = i11;
                                break;
                            case 51:
                                i15 += i13;
                                break;
                            case 52:
                                i15 += i13;
                                break;
                            case 53:
                                i14 += (int)Test.instanceCount;
                            default:
                                i14 -= i12;
                            }
                            break;
                        case 106:
                            i15 >>>= i12;
                            break;
                        case 112:
                            i10 += Test.byFld;
                            break;
                        case 111:
                            Test.byFld += (byte)i11;
                            break;
                        default:
                            lArr2[i9] += (long)-63.36493;
                        }
                        break;
                    case 63:
                        Test.instanceCount = i12;
                        break;
                    default:
                        i12 += 32088;
                    }
                }
            }
        }
        vMeth2_check_sum += i9 + i10 + i11 + i12 + (b ? 1 : 0) + i13 + i14 + Float.floatToIntBits(f3) + s + i15 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr2);
    }

    public static void vMeth1(int i6) {

        int i7=5, i8=-45984, i16=167, i17=0, i18=-253, i19=41094;
        boolean b1=true;
        long lArr1[]=new long[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(lArr1, -199L);
        FuzzerUtils.init(sArr, (short)-5960);

        for (long l : lArr1) {
            if (true) continue;
            if (b1) {
                for (i7 = 4; i7 > 1; --i7) {
                    vMeth2();
                    i6 = i6;
                    for (i16 = 1; i16 < 2; i16++) {
                        i8 += i16;
                        i8 += i16;
                    }
                    Test.byFld = (byte)i6;
                    for (i18 = 1; 2 > i18; ++i18) {
                        i19 *= -56276;
                        sArr[i18] = (short)-3009590290L;
                        Test.iArrFld[i7] += i19;
                        i8 <<= (int)Test.instanceCount;
                    }
                }
            } else if (b1) {
                Test.iArrFld[(i7 >>> 1) % N] += i17;
            } else {
                i8 += 59;
            }
        }
        vMeth1_check_sum += i6 + i7 + i8 + i16 + i17 + i18 + i19 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(lArr1) +
            FuzzerUtils.checkSum(sArr);
    }

    public static void vMeth(int i1) {

        int i2=5, i3=14, i4=-41902, i5=-24589, i20=-237, iArr[]=new int[N];
        float f2=0.578F;
        boolean b2=false, bArr[]=new boolean[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -10);
        FuzzerUtils.init(lArr, 17960L);
        FuzzerUtils.init(bArr, true);

        for (i2 = 18; i2 < 347; i2++) {
            f2 += (((i2 * i2) + i1) - i3);
            iArr[i2] += (int)(lArr[i2]++);
            for (i4 = 1; i4 < 5; i4++) {
                vMeth1(i3);
                i1 += (int)f2;
                i20 = 1;
                do {
                    bArr[(i3 >>> 1) % N] = b2;
                    Test.byFld -= (byte)i3;
                    Test.instanceCount -= (long)f2;
                    i1 >>= Test.byFld;
                    Test.instanceCount *= (long)112.112446;
                    i3 /= -28936;
                    Test.instanceCount -= Test.byFld;
                } while (++i20 < 2);
                i3 += (i4 + i5);
            }
        }
        vMeth_check_sum += i1 + i2 + i3 + Float.floatToIntBits(f2) + i4 + i5 + i20 + (b2 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(bArr);
    }

    public void mainTest(String[] strArr1) {

        float f=0.620F, f1=-10.411F;
        int i=-41932, i21=56, i22=-56819, i23=12, i24=61, i25=12, i26=-16121, i27=-10;
        short s1=-11347;
        boolean b3=false, bArr1[]=new boolean[N];

        FuzzerUtils.init(bArr1, true);

        for (f = 8; 283 > f; ++f) {
            Test.instanceCount = (long)(-(++f1));
            vMeth(i);
            i += (int)f;
        }
        for (i21 = 4; i21 < 395; i21++) {
            Test.instanceCount >>= Test.instanceCount;
            for (i23 = 1; i23 < 64; ++i23) {
                if (bFld) {
                    i24 = (int)f1;
                    Test.fArrFld[i21 + 1] *= 49549L;
                    i22 = (int)Test.instanceCount;
                } else if (bFld) {
                    try {
                        i22 = (i24 / 1451818321);
                        i = (i22 / i21);
                        i = (i23 / 50087);
                    } catch (ArithmeticException a_e) {}
                    i22 *= (int)-127.37410;
                } else if (bFld) {
                    i &= i24;
                } else {
                    Test.instanceCount += i21;
                    for (i25 = 1; i25 < 2; i25 += 2) {
                        Test.dArrFld[i23 + 1] %= 81;
                        Test.iArrFld[i21] -= (int)Test.instanceCount;
                        bArr1[i23 - 1] = bFld;
                    }
                }
                i ^= i23;
                Test.dArrFld[i21 + 1] += i24;
                Test.dArrFld[i23] -= -14;
            }
            i26 = s1;
        }
        i27 = 1;
        while (++i27 < 371) {
            Test.dFld = i22;
            i24 ^= i26;
            i *= i24;
            if (b3) {
                i26 = i;
                i -= (int)f1;
            } else {
                i26 -= 173;
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
