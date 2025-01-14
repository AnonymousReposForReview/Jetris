package tests.javafuzzer3228;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 04:22:27 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=27875L;
    public int iFld=8;
    public static boolean bFld=false;
    public float fFld=1.368F;
    public static volatile int iArrFld[][]=new int[N][N];
    public static short sArrFld[][]=new short[N][N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 34100);
        FuzzerUtils.init(Test.sArrFld, (short)-30530);
        FuzzerUtils.init(Test.lArrFld, -208712685L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long byMeth_check_sum = 0;

    public static byte byMeth(int i3) {

        float f=-29.615F;
        double d1=-2.21882;
        int i4=8, i5=-250;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -1437215003221654420L);

        lArr = lArr;
        f *= (float)d1;
        i4 = 1;
        do {
            i3 += i4;
            i5 += i3;
            lArr[i4] -= i3;
        } while (++i4 < 181);
        lArr[(i5 >>> 1) % N] = (long)d1;
        long meth_res = i3 + Float.floatToIntBits(f) + Double.doubleToLongBits(d1) + i4 + i5 +
            FuzzerUtils.checkSum(lArr);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public static void vMeth1(double d, int i1, int i2) {

        int i6=1, i7=-245, i8=-31, i9=-30429;
        float f1=-122.918F, fArr[][]=new float[N][N];
        short sArr[]=new short[N];

        FuzzerUtils.init(fArr, -122.451F);
        FuzzerUtils.init(sArr, (short)2952);

        i2 = (-byMeth(i1));
        i6 = 1;
        while (++i6 < 166) {
            i7 = 1;
            do {
                i8 = 1;
                while (--i8 > 0) {
                    i1 = i8;
                    switch ((i6 % 2) + 107) {
                    case 107:
                        fArr[i7][i7 + 1] -= Test.instanceCount;
                        sArr[i6] = (short)-13;
                        i1 *= (int)Test.instanceCount;
                        break;
                    case 108:
                        f1 += (i8 * i8);
                        d -= Test.instanceCount;
                        Test.iArrFld[i7][i8 + 1] <<= (int)Test.instanceCount;
                        break;
                    default:
                        Test.sArrFld = Test.sArrFld;
                        i2 += (((i8 * f1) + i8) - i1);
                        i1 += (((i8 * f1) + Test.instanceCount) - i9);
                    }
                }
            } while (++i7 < 10);
        }
        vMeth1_check_sum += Double.doubleToLongBits(d) + i1 + i2 + i6 + i7 + i8 + Float.floatToIntBits(f1) + i9 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(sArr);
    }

    public void vMeth(int i) {

        double d2=47.40654;
        int i10=-1, i11=-159, i12=-6, i13=24, i14=40964;
        float f2=2.768F;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, false);

        vMeth1(d2, 24239, i);
        i = i10;
        Test.lArrFld[(iFld >>> 1) % N] <<= -3;
        switch (((iFld >>> 1) % 5) + 99) {
        case 99:
            Test.lArrFld[(iFld >>> 1) % N] = i;
            i11 = 1;
            while (++i11 < 187) {
                i10 = i11;
                iFld += (-6 + (i11 * i11));
                iFld *= (int)Test.instanceCount;
                if (i != 0) {
                    vMeth_check_sum += i + Double.doubleToLongBits(d2) + i10 + i11 + Float.floatToIntBits(f2) + i12 +
                        i13 + i14 + FuzzerUtils.checkSum(bArr);
                    return;
                }
                d2 *= f2;
            }
            i12 = 303;
            while ((i12 -= 2) > 0) {
                for (i13 = 1; 10 > i13; ++i13) {
                    i10 *= (int)f2;
                    bArr[i12] = Test.bFld;
                }
            }
            break;
        case 100:
            i14 *= i14;
            break;
        case 101:
            f2 = Test.instanceCount;
            break;
        case 102:
            i14 = iFld;
            break;
        case 103:
            iFld |= iFld;
        default:
            i += (int)f2;
        }
        vMeth_check_sum += i + Double.doubleToLongBits(d2) + i10 + i11 + Float.floatToIntBits(f2) + i12 + i13 + i14 +
            FuzzerUtils.checkSum(bArr);
    }

    public void mainTest(String[] strArr1) {

        int i15=1, i16=47853, i17=-230, i18=7, i19=-80, iArr[]=new int[N];
        double d3=-2.40835;
        byte by=33;
        short s=-15518;

        FuzzerUtils.init(iArr, -247);

        iArr = FuzzerUtils.int1array(N, (int)4);
        vMeth(iFld);
        iFld = 4;
        iFld = -42;
        for (i15 = 153; i15 > 9; i15--) {
            for (i17 = i15; i17 < 174; i17 += 2) {
                i18 = iFld;
                i16 %= (int)((long)(d3) | 1);
                iFld += (int)d3;
                if (Test.bFld) {
                    iFld += i16;
                }
                fFld = i17;
                by = (byte)fFld;
                iFld += (int)d3;
                Test.iArrFld[i15 + 1][i15] ^= i18;
                switch ((i17 % 4) + 44) {
                case 44:
                    Test.instanceCount *= i15;
                    Test.iArrFld[i15 + 1][i17 - 1] = (int)Test.instanceCount;
                    Test.iArrFld[i17][i17] = -52;
                    break;
                case 45:
                    i18 = s;
                    Test.instanceCount = i15;
                    i19 = 1;
                    do {
                        if (Test.bFld) break;
                        i18 += (i19 | iFld);
                        iArr = iArr;
                        i18 += (i19 * i19);
                        try {
                            i18 = (iArr[i15] / -64405);
                            Test.iArrFld[i19][i17 + 1] = (i18 / i18);
                            iArr[i17 + 1] = (i15 % -20);
                        } catch (ArithmeticException a_e) {}
                    } while (++i19 < 1);
                    break;
                case 46:
                    fFld *= i16;
                    Test.iArrFld[i17 - 1][i15 - 1] &= 1;
                    fFld *= (float)d3;
                    break;
                case 47:
                default:
                    d3 *= i19;
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  byMeth ->  byMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
