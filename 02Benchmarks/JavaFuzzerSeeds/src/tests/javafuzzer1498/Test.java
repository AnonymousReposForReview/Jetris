package tests.javafuzzer1498;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 21:28:11 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=0L;
    public static float fFld=0.709F;
    public static boolean bFld=false;
    public static int iArrFld[][]=new int[N][N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 155);
        FuzzerUtils.init(Test.fArrFld, -92.821F);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i12, float f2) {

        int i13=55793, i14=-11, i15=-425, i16=217, i17=-12, i18=-39253, iArr1[]=new int[N];
        long l2=1346162364L;
        double d2=-58.32821;

        FuzzerUtils.init(iArr1, -20277);

        for (i13 = 5; i13 < 157; ++i13) {
            switch (((i13 % 8) * 5) + 89) {
            case 123:
                i14 *= i14;
                for (i15 = 1; i15 < 10; i15 += 2) {
                    for (i17 = 1; 3 > i17; i17++) {
                        Test.iArrFld[i13 + 1] = iArr1;
                        Test.iArrFld[i17][i17] = i16;
                        l2 = i16;
                        i14 += (i17 * i17);
                        i16 += i17;
                        i18 += i18;
                        d2 = i17;
                        l2 ^= l2;
                    }
                    f2 -= -2567;
                    i14 += (i15 * i15);
                }
                break;
            case 126:
                i16 <<= (int)Test.instanceCount;
                break;
            case 95:
                l2 = (long)1.752F;
                break;
            case 105:
                f2 += (((i13 * l2) + i14) - Test.instanceCount);
            case 91:
                i16 += (i13 - i12);
                break;
            case 128:
                i18 <<= i16;
            case 94:
                i12 = i14;
                break;
            case 107:
                iArr1[i13] -= (int)l2;
                break;
            default:
                i18 >>= i18;
            }
        }
        vMeth1_check_sum += i12 + Float.floatToIntBits(f2) + i13 + i14 + i15 + i16 + i17 + i18 + l2 +
            Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth(int i7, int i8) {

        short s=12753;
        float f1=-61.44F;
        int i9=-142, i10=-3623, i11=0, i19=-12, i20=7282, iArr[]=new int[N];
        double dArr1[]=new double[N];

        FuzzerUtils.init(iArr, -30020);
        FuzzerUtils.init(dArr1, 13.99086);

        iArr[(i8 >>> 1) % N] <<= (int)(s + ((i8 + i8) - (f1 + i8)));
        for (i9 = 213; i9 > 9; i9 -= 3) {
            i10 -= (int)Test.instanceCount;
            i7 += 81;
            i11 = 1;
            while (++i11 < 23) {
                vMeth1(i8, f1);
                for (i19 = 1; 1 > i19; i19++) {
                    Test.fFld += (((i19 * Test.instanceCount) + i7) - i19);
                    i20 = 6;
                    Test.instanceCount = i19;
                    i20 >>= 250;
                    i7 += (int)(-1663122774L + (i19 * i19));
                    dArr1[i19 + 1] -= 128;
                    Test.bFld = Test.bFld;
                }
            }
            i7 *= i11;
        }
        long meth_res = i7 + i8 + s + Float.floatToIntBits(f1) + i9 + i10 + i11 + i19 + i20 +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(long l, float f, int i2) {

        int i3=65465, i4=-51759, i5=67, i6=-86, i21=4159, i22=-7;
        double d=2.104940, d1=-110.117030, dArr[]=new double[N];
        long l1=189L;
        byte by=-124;
        short sArr[]=new short[N];

        FuzzerUtils.init(dArr, 0.58195);
        FuzzerUtils.init(sArr, (short)28120);

        for (i3 = 338; i3 > 13; i3 -= 2) {
            i2 -= (int)(Math.abs((int)(Test.instanceCount + d)) - (d++));
        }
        for (l1 = 21; l1 < 372; ++l1) {
            for (d1 = l1; d1 < 5; ++d1) {
                dArr[(int)(l1)] += (sArr[(int)(d1)]++);
                iMeth(i2, 59458);
                i2 = i2;
                i5 += (int)Test.fFld;
                switch ((int)((d1 % 1) + 85)) {
                case 85:
                    switch ((int)(((l1 % 2) * 5) + 32)) {
                    case 34:
                        Test.instanceCount += i6;
                        i5 += i2;
                        for (i21 = 1; i21 < 1; i21++) {
                            Test.fFld += i2;
                            i22 += (((i21 * i21) + i2) - l1);
                        }
                        break;
                    case 36:
                        by *= (byte)f;
                        break;
                    }
                    break;
                default:
                    i2 *= i4;
                }
            }
        }
        vMeth_check_sum += l + Float.floatToIntBits(f) + i2 + i3 + i4 + Double.doubleToLongBits(d) + l1 + i5 +
            Double.doubleToLongBits(d1) + i6 + i21 + i22 + by + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            FuzzerUtils.checkSum(sArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-60572, i1=15088, i24=-35, i25=44, i26=3, iArr2[]=new int[N];
        float f3=39.173F;
        short s1=2595, s2=-14929;
        double d3=0.93299, dArr2[]=new double[N];
        byte by1=28, by2=-57;

        FuzzerUtils.init(iArr2, 38613);
        FuzzerUtils.init(dArr2, 2.61732);

        for (i = 7; i < 161; ++i) {
            Test.instanceCount += (-12330 + (i * i));
            vMeth(Test.instanceCount, Test.fFld, i);
            i1 += i;
            i1 += (int)2.185F;
            Test.instanceCount += (((i * i) + i1) - Test.instanceCount);
            i1 += (i * i);
            i24 = 1;
            while (++i24 < 163) {
                Test.instanceCount += (i24 * i24);
                for (f3 = 1; f3 < 1; f3++) {
                    i1 *= i;
                    i25 = (int)f3;
                    i1 += (int)((long)f3 | i25);
                    i1 += i25;
                    i25 = 10;
                    s1 <<= (short)4L;
                    Test.bFld = false;
                    i25 ^= 6;
                    switch ((int)((f3 % 5) + 40)) {
                    case 40:
                        dArr2 = dArr2;
                        switch (((i25 >>> 1) % 9) + 106) {
                        case 106:
                            switch ((int)((f3 % 7) + 49)) {
                            case 49:
                                switch (((i24 % 7) * 5) + 30) {
                                case 36:
                                    d3 = d3;
                                    Test.fArrFld[i] *= i25;
                                    by1 = (byte)i1;
                                    break;
                                case 61:
                                    i1 -= (int)Test.instanceCount;
                                    if (Test.bFld) {
                                        i25 = i1;
                                    } else if (Test.bFld) {
                                        i25 += -7;
                                    }
                                    break;
                                case 42:
                                    Test.instanceCount -= 1;
                                    break;
                                case 54:
                                    i25 >>>= i1;
                                case 58:
                                    Test.fFld -= Test.instanceCount;
                                    break;
                                case 44:
                                    Test.instanceCount >>= 7879809447021268599L;
                                    break;
                                case 53:
                                }
                                break;
                            case 50:
                                i1 |= i24;
                                break;
                            case 51:
                                i1 >>>= s1;
                            case 52:
                                Test.instanceCount -= (long)f3;
                                break;
                            case 53:
                                i1 -= (int)d3;
                                break;
                            case 54:
                                Test.instanceCount >>>= i;
                                break;
                            case 55:
                                i26 *= i;
                            default:
                                i25 += (int)(f3 * i26);
                            }
                        case 107:
                            by1 >>= (byte)s2;
                            break;
                        case 108:
                            Test.fFld += (f3 - Test.instanceCount);
                            break;
                        case 109:
                            if (true) break;
                        case 110:
                            i25 *= 3;
                        case 111:
                            i1 -= 3;
                            break;
                        case 112:
                            iArr2[i24 + 1] = by2;
                            break;
                        case 113:
                            i1 += i1;
                            break;
                        case 114:
                        }
                        break;
                    case 41:
                        Test.instanceCount += i;
                        break;
                    case 42:
                        Test.fFld = f3;
                        break;
                    case 43:
                        Test.iArrFld[i - 1][i24] += i26;
                        break;
                    case 44:
                        i1 += (int)f3;
                        break;
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}