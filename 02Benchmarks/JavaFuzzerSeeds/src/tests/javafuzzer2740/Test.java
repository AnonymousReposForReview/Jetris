package tests.javafuzzer2740;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 19:41:45 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-52L;
    public byte byFld=-18;
    public static volatile long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 3441861686L);
        FuzzerUtils.init(Test.iArrFld, 10);
        FuzzerUtils.init(Test.dArrFld, -1.11278);
    }

    public static long lMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i3) {

        double d=-52.106137, d1=-2.109896, dArr[]=new double[N];
        int i4=4, i5=33, i6=9, i7=2188, iArr1[]=new int[N];
        float f=-56.61F;
        long l2=-86L, lArr[]=new long[N];
        byte by=38;

        FuzzerUtils.init(dArr, -119.86605);
        FuzzerUtils.init(iArr1, -194);
        FuzzerUtils.init(lArr, -4384843957397275872L);

        for (d = 6; d < 219; d++) {
            dArr[(int)(d - 1)] -= Test.instanceCount;
            try {
                i4 = (i3 % i4);
                iArr1[(int)(d - 1)] = (iArr1[(int)(d - 1)] % 81);
                i4 = (181 % i3);
            } catch (ArithmeticException a_e) {}
            lArr[(int)(d + 1)] ^= i4;
        }
        Test.instanceCount *= Test.instanceCount;
        for (f = 1; 205 > f; ++f) {
            Test.instanceCount += -6;
            i3 -= i5;
            l2 = 1;
            do {
                for (i6 = 1; i6 < 1; i6++) {
                    if (i4 != 0) {
                    }
                    iArr1[(int)(l2 - 1)] = i7;
                    Test.instanceCount = i7;
                    by *= (byte)i5;
                    d1 -= -19506;
                }
            } while (++l2 < 8);
        }
        long meth_res = i3 + Double.doubleToLongBits(d) + i4 + Float.floatToIntBits(f) + i5 + l2 + i6 + i7 + by +
            Double.doubleToLongBits(d1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public float fMeth(int i2, long l, long l1) {

        int i8=33353, i9=29, i10=-53136, i11=1, i12=-52574, iArr[][]=new int[N][N];
        float f1=-1.500F;
        double d2=0.11429;
        long lArr1[][]=new long[N][N];

        FuzzerUtils.init(iArr, 20019);
        FuzzerUtils.init(lArr1, 3452604673L);

        iArr[(i2 >>> 1) % N][(i2 >>> 1) % N] -= (int)(byFld * ((l = -3) ^ iMeth(2)));
        i8 = 1;
        while (++i8 < 392) {
            if (false) continue;
            for (i9 = 1; i9 < 4; ++i9) {
                short s=13752;
                byFld += (byte)Test.instanceCount;
                for (i11 = 1; i11 < 2; i11 += 3) {
                    i10 = i11;
                    l1 += i11;
                    l1 += (((i11 * f1) + l) - f1);
                    d2 += Test.instanceCount;
                }
                s += (short)(70 + (i9 * i9));
                i2 += i10;
                lArr1[i9 + 1][i9 - 1] = i12;
                d2 %= ((long)(f1) | 1);
                lArr1[i9 + 1][(-122 >>> 1) % N] &= s;
            }
        }
        long meth_res = i2 + l + l1 + i8 + i9 + i10 + i11 + i12 + Float.floatToIntBits(f1) +
            Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public long lMeth() {

        int i=9, i1=-9092, i13=2, i14=-25292, i15=9, i16=23508, iArr2[]=new int[N];
        double d3=-65.86695, dArr1[]=new double[N];
        float f2=122.32F;

        FuzzerUtils.init(dArr1, -111.94046);
        FuzzerUtils.init(iArr2, 18);

        i = 1;
        do {
            i1 -= (int)fMeth(45753, Test.instanceCount, Test.instanceCount);
            Test.instanceCount += (i * i);
            i1 += i;
            Test.instanceCount /= ((long)(d3) | 1);
            dArr1[i - 1] = -2.448F;
            iArr2[i + 1] += (int)Test.instanceCount;
            i1 <<= i1;
            Test.lArrFld[i + 1] /= -162L;
            i13 = 1;
            while (++i13 < 12) {
                i1 = i14;
                f2 = 144L;
                for (i15 = i13; 1 > i15; ++i15) {
                    i1 = i;
                    if (i != 0) {
                    }
                }
            }
        } while (++i < 128);
        long meth_res = i + i1 + Double.doubleToLongBits(d3) + i13 + i14 + Float.floatToIntBits(f2) + i15 + i16 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)) + FuzzerUtils.checkSum(iArr2);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i17=-173, i18=-2, i20=34, i21=140, i22=16246, i23=10, i24=13, i25=-5;
        float f3=24.267F;

        Test.instanceCount = (long)-32.5706;
        lMeth();
        i17 = 1;
        do {
            i18 += i18;
            i18 = (int)Test.instanceCount;
            byFld += (byte)(i17 * i17);
            Test.instanceCount ^= i18;
        } while (++i17 < 254);
        Test.instanceCount = Test.instanceCount;
        i18 = i18;
        for (int i19 : Test.iArrFld) {
            for (f3 = 3; f3 < 63; f3++) {
                byFld += (byte)f3;
                for (i21 = 2; i21 > 1; --i21) {
                    i19 <<= i19;
                    Test.instanceCount += (i21 * i21);
                }
                switch ((int)(((f3 % 2) * 5) + 42)) {
                case 50:
                    Test.instanceCount += (long)((long)f3 | Test.instanceCount);
                    Test.iArrFld[(int)(f3)] >>= i17;
                    break;
                case 49:
                    for (i23 = 1; i23 < 2; i23 += 2) {
                        i18 -= i24;
                        i22 += (i23 + i24);
                    }
                    break;
                default:
                    byFld += (byte)i19;
                    i25 = 1;
                    do {
                        Test.dArrFld[i25 + 1] = i25;
                        try {
                            i18 = (-136 % Test.iArrFld[(int)(f3 + 1)]);
                            i19 = (i21 % -154);
                            i19 = (Test.iArrFld[i25 - 1] % i17);
                        } catch (ArithmeticException a_e) {}
                        Test.instanceCount += (((i25 * i24) + i21) - i17);
                        byFld = (byte)-44904;
                        Test.instanceCount = 6;
                        Test.instanceCount += i22;
                        i20 = i18;
                    } while ((i25 += 2) < 2);
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  fMeth ->  fMeth lMeth mainTest
//DEBUG  iMeth ->  iMeth fMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
