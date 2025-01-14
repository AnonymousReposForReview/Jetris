package tests.javafuzzer1671;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 01:18:19 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2615956915L;
    public static double dFld=-2.51988;
    public long lArrFld[]=new long[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i8, long l) {

        int i9=-9, i10=3, i11=-207, i12=-1, i13=-11, iArr[]=new int[N];
        double d=-2.107707, d1=36.68866;
        long l1=32L;
        float f1=-115.173F;

        FuzzerUtils.init(iArr, 19583);

        l = i8;
        i8 = 43;
        for (i9 = 207; i9 > 5; --i9) {
            i8 *= (int)l;
        }
        i11 = 1;
        do {
            for (d = 4; d > i11; d -= 2) {
                for (l1 = 1; l1 < 1; l1++) {
                    byte by=7;
                    short s=-24391;
                    by = (byte)-30280L;
                    Test.instanceCount += i13;
                    switch ((int)((l1 % 2) + 82)) {
                    case 82:
                        d1 /= (l1 | 1);
                        if (i10 != 0) {
                        }
                        iArr[(int)(d - 1)] *= i11;
                        break;
                    case 83:
                        iArr[(int)(d + 1)] -= (int)f1;
                        i12 = s;
                    }
                }
            }
        } while (++i11 < 393);
        long meth_res = i8 + l + i9 + i10 + i11 + Double.doubleToLongBits(d) + i12 + l1 + i13 +
            Double.doubleToLongBits(d1) + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i7) {

        long l2=-216L;
        int i14=-2, i15=-3, i16=-49263, i17=192;
        float f2=125.754F;
        byte by1=-94;
        boolean b1=true;
        double d2=-2.121588;

        iMeth(i7, Test.instanceCount);
        for (l2 = 17; l2 < 363; ++l2) {
            Test.instanceCount += (l2 * f2);
            i7 <<= i14;
            for (i15 = 1; i15 < 5; ++i15) {
                i17 = 1;
                while (++i17 < 2) {
                    by1 *= (byte)29089;
                    b1 = b1;
                    i14 += (i17 * by1);
                    i16 -= i15;
                    if (true) continue;
                    i16 += (i17 * i17);
                }
                i7 = (int)f2;
                d2 += f2;
                i7 -= i7;
            }
        }
        vMeth1_check_sum += i7 + l2 + i14 + Float.floatToIntBits(f2) + i15 + i16 + i17 + by1 + (b1 ? 1 : 0) +
            Double.doubleToLongBits(d2);
    }

    public static void vMeth(int i) {

        int i1=-59, i2=-10263, i3=56042, i4=1, i5=180, i6=-54299, iArr1[][]=new int[N][N];
        float f=84.981F;
        boolean b=false;

        FuzzerUtils.init(iArr1, 1);

        for (i1 = 2; i1 < 287; ++i1) {
            Test.instanceCount += (((i1 * f) + Test.instanceCount) - Test.instanceCount);
            for (i3 = i1; i3 < 6; i3++) {
                Test.instanceCount = ((i3 * Test.instanceCount) + Test.instanceCount);
                b = b;
                for (i5 = 1; 1 > i5; i5++) {
                    vMeth1(i3);
                    f *= i4;
                    Test.instanceCount += 133;
                    i6 >>>= (int)Test.instanceCount;
                    iArr1[i1 + 1][i1] = i5;
                    f += (i5 - i1);
                    Test.dFld *= i5;
                }
                i6 = (int)f;
                i2 = 14;
            }
        }
        vMeth_check_sum += i + i1 + i2 + Float.floatToIntBits(f) + i3 + i4 + (b ? 1 : 0) + i5 + i6 +
            FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i18=-125, i19=53670, i20=17309, i21=3, i22=351, iArr2[][]=new int[N][N];
        float f3=89.57F, f4=-107.197F, fArr[][]=new float[N][N];
        double d3=108.6848, dArr[]=new double[N];
        short s1=32103;
        long l3=7080548092951151660L;
        boolean b2=false;
        byte by2=-10;

        FuzzerUtils.init(fArr, -9.882F);
        FuzzerUtils.init(iArr2, -42772);
        FuzzerUtils.init(dArr, -1.9612);

        vMeth(20004);
        for (i18 = 13; i18 < 299; ++i18) {
            i19 += (int)f3;
        }
        switch ((((61 >>> 1) % 4) * 5) + 113) {
        case 120:
            for (i20 = 2; i20 < 242; ++i20) {
                i19 = i19;
                f3 = i21;
            }
        case 118:
            for (d3 = 321; 17 < d3; d3--) {
                switch ((int)((d3 % 7) + 23)) {
                case 23:
                    fArr[(int)(d3 + 1)][(int)(d3)] += s1;
                    Test.instanceCount *= i22;
                    break;
                case 24:
                    iArr2[(int)(d3)] = FuzzerUtils.int1array(N, (int)-133);
                    l3 = 1;
                    while (++l3 < 83) {
                        f3 = (float)Test.dFld;
                        iArr2[(int)(l3)][(int)(l3 + 1)] -= i18;
                        f3 *= i19;
                        iArr2[(int)(l3 - 1)][(int)(d3 + 1)] -= (int)f3;
                        f4 = 1;
                        while (++f4 < 1) {
                            iArr2[(int)(l3)][(int)(d3)] ^= (int)Test.instanceCount;
                            Test.dFld = -12;
                            i22 += (int)f4;
                            if (b2) {
                                b2 = b2;
                                dArr = dArr;
                            } else if (b2) {
                                f3 += (f4 * i22);
                            } else {
                                i21 = i20;
                                dArr[(int)(d3)] += i21;
                                lArrFld = FuzzerUtils.long1array(N, (long)2062058234L);
                            }
                            i22 = i18;
                            try {
                                i21 = (-177 / iArr2[(int)(d3 + 1)][(int)(f4 - 1)]);
                                i21 = (i21 / iArr2[(int)(d3)][(int)(d3)]);
                                i22 = (i19 / i21);
                            } catch (ArithmeticException a_e) {}
                        }
                    }
                    break;
                case 25:
                    Test.instanceCount = (long)Test.dFld;
                    break;
                case 26:
                    Test.instanceCount -= 1805714165L;
                case 27:
                    i19 = -94;
                    break;
                case 28:
                    i21 *= (int)l3;
                case 29:
                    Test.dFld += by2;
                    break;
                default:
                    i21 += (int)(((d3 * i19) + i20) - i19);
                }
            }
        case 130:
            Test.instanceCount -= (long)f4;
            break;
        case 131:
            i19 &= i19;
            break;
        default:
            Test.instanceCount /= (Test.instanceCount | 1);
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
