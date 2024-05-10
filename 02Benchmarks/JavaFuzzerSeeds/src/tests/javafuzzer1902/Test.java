package tests.javafuzzer1902;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 05:28:01 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-11L;
    public int iFld=11;
    public float fFld=-50.64F;
    public volatile double dFld=-102.45737;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -13L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i4) {

        int i5=60351, i6=6154, i7=26, i8=241, iArr1[]=new int[N];
        float f=-125.571F, fArr[]=new float[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(fArr, 23.211F);
        FuzzerUtils.init(dArr, 2.24294);
        FuzzerUtils.init(iArr1, 14605);

        i4 += i4;
        i4 = i4;
        i4 -= (int)Test.instanceCount;
        i5 = 1;
        while ((i5 += 2) < 276) {
            fArr[i5] += i5;
            i6 = 1;
            while (++i6 < 11) {
                Test.lArrFld = Test.lArrFld;
                dArr[i5 + 1] = -7;
                i4 += (i6 * i6);
                i7 = 1;
                do {
                    Test.instanceCount += (i7 | i6);
                    f += f;
                    i4 = -7;
                    try {
                        iArr1[i7 - 1] = (i7 / i6);
                        i8 = (iArr1[i6 + 1] / -28118);
                        i4 = (i8 % 11);
                    } catch (ArithmeticException a_e) {}
                    i4 = i6;
                } while (++i7 < 1);
            }
        }
        vMeth1_check_sum += i4 + i5 + i6 + i7 + Float.floatToIntBits(f) + i8 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(boolean b, short s) {

        int i2=-80, i3=7918, i9=-7, i10=-129, i11=-1, iArr2[]=new int[N];
        float f1=0.289F, f2=81.508F;
        double d=-91.26659;
        byte by=38;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -4503830700154488412L);
        FuzzerUtils.init(iArr2, -26681);

        for (long l1 : lArr) {
            for (i2 = 1; i2 < 4; i2++) {
                i3 = (int)(((--Test.instanceCount) - -42546) * -60);
                vMeth1(3);
                for (f1 = 1; f1 < 2; ++f1) {
                    i9 = i3;
                    iArr2[i2 + 1] = i2;
                    switch (((i3 >>> 1) % 7) + 58) {
                    case 58:
                        switch ((((i3 >>> 1) % 7) * 5) + 97) {
                        case 101:
                            i9 += i9;
                            break;
                        case 120:
                            i3 = (int)Test.instanceCount;
                            break;
                        case 116:
                            lArr[i2] = i2;
                            i9 = (int)d;
                            f2 += i9;
                            iArr2[(int)(f1 - 1)] += i2;
                        case 122:
                            s += (short)f1;
                        case 105:
                            i10 = i2;
                            break;
                        case 104:
                            i10 = (int)l1;
                            break;
                        case 112:
                            i3 = i10;
                            break;
                        default:
                            i11 = i9;
                        }
                        break;
                    case 59:
                        if (i2 != 0) {
                            vMeth_check_sum += (b ? 1 : 0) + s + i2 + i3 + Float.floatToIntBits(f1) + i9 +
                                Double.doubleToLongBits(d) + Float.floatToIntBits(f2) + i10 + i11 + by +
                                FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr2);
                            return;
                        }
                        break;
                    case 60:
                        i9 |= 14;
                    case 61:
                        b = b;
                    case 62:
                        i11 = by;
                        break;
                    case 63:
                        l1 += (-95 + (f1 * f1));
                        break;
                    case 64:
                        i9 &= i10;
                    default:
                        i3 += (int)(f1 - i11);
                    }
                }
            }
        }
        vMeth_check_sum += (b ? 1 : 0) + s + i2 + i3 + Float.floatToIntBits(f1) + i9 + Double.doubleToLongBits(d) +
            Float.floatToIntBits(f2) + i10 + i11 + by + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr2);
    }

    public int iMeth(long l) {

        short s1=4393;
        int i12=-4, i13=168, i14=-6, i15=-121, i16=-7, i17=-241, i18=0, iArr[]=new int[N];
        byte by1=76;
        boolean b1=true;

        FuzzerUtils.init(iArr, -129);

        iFld *= iArr[(22635 >>> 1) % N];
        vMeth(false, s1);
        Test.instanceCount >>= iFld;
        i12 = 1;
        while (++i12 < 181) {
            Test.instanceCount = (long)fFld;
        }
        iFld = (int)dFld;
        for (i13 = 125; i13 > 5; i13--) {
            switch ((i13 % 8) + 52) {
            case 52:
                i14 = (int)dFld;
                for (i15 = 1; i15 < 13; ++i15) {
                    for (i17 = 1; i17 < 2; ++i17) {
                        switch (((i15 >>> 1) % 6) + 9) {
                        case 9:
                            i14 -= -11;
                            l += iFld;
                            Test.instanceCount /= (iFld | 1);
                            break;
                        case 10:
                            l = (long)15.296F;
                            break;
                        case 11:
                            iFld -= -25158;
                            break;
                        case 12:
                            i16 = iFld;
                        case 13:
                            if (i18 != 0) {
                            }
                        case 14:
                            by1 *= (byte)fFld;
                        default:
                            Test.instanceCount = (long)dFld;
                        }
                    }
                }
            case 53:
                if (b1) continue;
            case 54:
                i14 = 38985;
                break;
            case 55:
                iArr[i13 + 1] *= iFld;
                break;
            case 56:
                Test.instanceCount += i16;
            case 57:
                iFld -= i15;
                break;
            case 58:
                i16 *= i16;
                break;
            case 59:
                iArr[i13 + 1] /= 3;
                break;
            default:
                i14 = i17;
            }
        }
        long meth_res = l + s1 + i12 + i13 + i14 + i15 + i16 + i17 + i18 + by1 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-7117, i1=1, i19=5, i20=4, i21=52280, i22=14, i23=-26198, i24=-57965, i25=2, iArr3[]=new int[N];
        long l2=-4124084742L;
        byte by2=-110;
        float f3=-2.271F, fArr1[]=new float[N];

        FuzzerUtils.init(fArr1, -1.623F);
        FuzzerUtils.init(iArr3, -46351);

        for (i = 10; i < 320; i++) {
            i1 = iMeth(Test.instanceCount);
            dFld += i;
            i1 += (((i * Test.instanceCount) + i) - i1);
            fArr1[i] = 2309;
            iFld -= i;
        }
        Test.instanceCount += iFld;
        for (i19 = 179; i19 > 1; i19--) {
            iArr3[i19] += (int)Test.instanceCount;
            i20 += i19;
            iFld = iFld;
            for (i21 = i19; i21 < 141; ++i21) {
                for (i23 = i19; i23 < 1; i23++) {
                    i24 <<= i21;
                    l2 *= Test.instanceCount;
                    iFld *= i21;
                    by2 = (byte)l2;
                    l2 *= i1;
                }
                switch ((i21 % 4) + 75) {
                case 75:
                    iArr3[i21 + 1] = (int)l2;
                    dFld += 1.75530;
                    i20 *= (int)l2;
                    break;
                case 76:
                    iArr3[i19 + 1] -= (int)l2;
                    dFld += i21;
                    break;
                case 77:
                    i22 = 13;
                    i22 >>>= i22;
                    for (f3 = 1; f3 > 1; --f3) {
                        i1 *= (int)l2;
                        i20 += (-3327 + (f3 * f3));
                    }
                    iArr3[i21 - 1] *= i23;
                    break;
                case 78:
                default:
                    Test.instanceCount += i21;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
