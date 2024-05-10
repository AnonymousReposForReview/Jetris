package tests.javafuzzer986;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 12:27:36 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-4L;
    public static float fFld=0.148F;
    public byte byFld=-36;
    public static volatile double dFld=9.35185;
    public long lArrFld[]=new long[N];
    public static long lArrFld1[]=new long[N];
    public static float fArrFld[]=new float[N];
    public static short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.lArrFld1, 5L);
        FuzzerUtils.init(Test.fArrFld, -39.486F);
        FuzzerUtils.init(Test.sArrFld, (short)-1722);
    }

    public static long byMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(long l3, int i15) {

        int i16=0, i17=20613, i18=959, i19=-44429, i20=-32, i21=3, i22=190, iArr1[]=new int[N];
        float f=0.645F;
        short s=13475;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 7.130692);
        FuzzerUtils.init(iArr1, 48158);

        for (i16 = 12; 362 > i16; i16++) {
            for (i18 = 1; i18 < 5; ++i18) {
                i20 = 1;
                do {
                    i17 += (int)(-10863L + (i20 * i20));
                    l3 += i18;
                    i19 -= (int)f;
                } while (++i20 < 2);
                for (i21 = 2; i21 > 1; i21 -= 3) {
                    switch (((i18 % 7) * 5) + 118) {
                    case 133:
                        Test.lArrFld1[i21] -= i22;
                        i19 = i18;
                        break;
                    case 136:
                        Test.fArrFld[i16 + 1] = i20;
                        i22 *= -35978;
                        iArr1[i21] *= (int)-1544962544L;
                        break;
                    case 127:
                        iArr1[i21] >>= (int)l3;
                        l3 += (i21 | Test.instanceCount);
                        break;
                    case 134:
                        s |= (short)42;
                        break;
                    case 135:
                        i22 = i19;
                        break;
                    case 147:
                        Test.sArrFld[i18] -= (short)i22;
                    case 124:
                        i15 *= i22;
                        break;
                    }
                }
            }
        }
        long meth_res = l3 + i15 + i16 + i17 + i18 + i19 + i20 + Float.floatToIntBits(f) + i21 + i22 + s +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(long l1) {

        int i9=-21, i10=-97, i11=6, i12=41, i13=8, i14=-45643, i23=-8, iArr[]=new int[N];
        double d1=1.68219;
        boolean b=true;
        long lArr[]=new long[N];
        short sArr[][]=new short[N][N];

        FuzzerUtils.init(iArr, 14514);
        FuzzerUtils.init(lArr, 8684028347590570674L);
        FuzzerUtils.init(sArr, (short)-19545);

        i9 = 1;
        while (++i9 < 395) {
            l1 += (((i9 * i9) + i9) - i9);
            i10 *= (int)(Test.instanceCount++);
            for (i11 = 4; i11 > i9; --i11) {
                iArr[i11 - 1] += (-28356 - (i10++));
            }
            if (b) {
                switch (((((i10++) >>> 1) % 2) * 5) + 30) {
                case 36:
                    i12 >>= ((++iArr[i9 + 1]) + (sArr[i9][i9 + 1]++));
                    for (i13 = 4; i13 > 1; i13--) {
                        i14 = (iMeth(Test.instanceCount, i12) % (i13 | 1));
                        i23 = 1;
                        do {
                            Test.instanceCount += -18838;
                            i12 *= i23;
                            d1 = Test.instanceCount;
                            l1 = i9;
                        } while (++i23 < 2);
                    }
                case 33:
                    i12 *= i13;
                    break;
                default:
                    Test.fArrFld[i9 - 1] *= Test.fFld;
                }
            }
        }
        vMeth_check_sum += l1 + i9 + i10 + i11 + i12 + i13 + i14 + i23 + Double.doubleToLongBits(d1) + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(sArr);
    }

    public static byte byMeth(int i, int i1, int i2) {

        int i3=-9, i4=33261, i5=-12, i6=-13, i7=34118, i8=6, iArr2[]=new int[N];
        long l=-7L;
        short s1=15345;
        double d2=0.56053;
        byte by=108;

        FuzzerUtils.init(iArr2, 40);

        for (i3 = 144; i3 > 6; i3 -= 3) {
            i2 += (((i3 * i2) + l) - i);
            for (i5 = 33; i5 > 1; i5--) {
                switch ((i5 % 1) + 70) {
                case 70:
                    for (i7 = 1; i7 < 2; i7++) {
                        vMeth(Test.instanceCount);
                        i8 += (i7 * i7);
                        s1 *= (short)219;
                        switch (((-234 >>> 1) % 4) + 91) {
                        case 91:
                            iArr2[i3 + 1] = (int)l;
                            i8 += (((i7 * Test.instanceCount) + Test.fFld) - i3);
                            s1 -= (short)Test.instanceCount;
                            break;
                        case 92:
                            d2 -= by;
                            i4 = (int)l;
                            i8 = i4;
                            break;
                        case 93:
                            i4 -= i8;
                            break;
                        case 94:
                            i4 = (int)d2;
                            break;
                        default:
                            i4 += (((i7 * i7) + i5) - i4);
                        }
                    }
                    break;
                }
            }
        }
        long meth_res = i + i1 + i2 + i3 + i4 + l + i5 + i6 + i7 + i8 + s1 + Double.doubleToLongBits(d2) + by +
            FuzzerUtils.checkSum(iArr2);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i24=-57027, i25=-46450, i26=77, i27=207, iArr3[]=new int[N];
        short s2=-1012;
        boolean b2=true;

        FuzzerUtils.init(iArr3, 12563);

        lArrFld = (lArrFld = (lArrFld = lArrFld));
        byMeth(i24, i24, -19580);
        for (long l4 : lArrFld) {
            if (b2) {
                for (i25 = 2; 63 > i25; ++i25) {
                    Test.instanceCount = 51553;
                    i27 = 2;
                    while (--i27 > 0) {
                        boolean b1=false;
                        if (b1) break;
                        if (false) {
                            i24 = byFld;
                        } else if (true) {
                            i26 -= (int)Test.dFld;
                            if (b1) break;
                            Test.instanceCount += (i27 * i27);
                            switch (((i25 % 7) * 5) + 76) {
                            case 104:
                                Test.fFld += i27;
                                if (b1) break;
                                l4 += i27;
                                switch (((i25 % 7) * 5) + 113) {
                                case 139:
                                    Test.fFld *= i27;
                                    iArr3[i25] += (int)l4;
                                    Test.dFld += -14;
                                    l4 += i27;
                                    break;
                                case 140:
                                    switch ((i27 % 2) + 124) {
                                    case 124:
                                        l4 = i27;
                                        Test.fFld += (float)Test.dFld;
                                        break;
                                    case 125:
                                        i26 = (int)Test.instanceCount;
                                        try {
                                            i26 = (i26 / 1911915310);
                                            i26 = (i24 / iArr3[i25]);
                                            i26 = (54231 / i24);
                                        } catch (ArithmeticException a_e) {}
                                        break;
                                    }
                                    i24 = 39856;
                                    break;
                                case 128:
                                    iArr3[(i24 >>> 1) % N] -= (int)1.128132;
                                    i26 += (i27 - byFld);
                                    break;
                                case 115:
                                    iArr3[i25] *= i26;
                                    break;
                                case 125:
                                    Test.instanceCount >>= s2;
                                    break;
                                case 146:
                                case 137:
                                    Test.dFld = i27;
                                    break;
                                default:
                                    try {
                                        iArr3[i27] = (i27 % -219);
                                        i24 = (i26 % 94);
                                        i24 = (i27 % i25);
                                    } catch (ArithmeticException a_e) {}
                                }
                                break;
                            case 84:
                                i26 = i25;
                            case 99:
                                Test.instanceCount |= l4;
                            case 101:
                                i26 += (912 + (i27 * i27));
                            case 82:
                                i24 *= (int)Test.fFld;
                                break;
                            case 96:
                                l4 += (long)(-2.563F + (i27 * i27));
                                break;
                            case 90:
                                i24 += (((i27 * i24) + i26) - Test.instanceCount);
                                break;
                            }
                        } else if (b1) {
                            l4 = (long)Test.fFld;
                        } else {
                            i24 = i27;
                        }
                    }
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
//DEBUG  byMeth ->  byMeth mainTest
//DEBUG  vMeth ->  vMeth byMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth byMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}