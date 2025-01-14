package tests.javafuzzer1471;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 21:11:41 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-8L;
    public static double dFld=2.98850;
    public static long lArrFld[]=new long[N];
    public volatile int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];
    public double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 3537081653223158840L);
        FuzzerUtils.init(Test.fArrFld, 1.573F);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l, int i4, long l1) {

        float f1=-2.705F;
        int i5=-1, i6=-29898, i7=118, iArr[]=new int[N];
        short s=21722;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 13);
        FuzzerUtils.init(lArr, 2923797060873673465L);

        iArr[(i4 >>> 1) % N] <<= (int)l;
        for (f1 = 11; f1 < 397; f1++) {
            for (i6 = 1; i6 < 4; i6++) {
                iArr[i6] = (int)l1;
                iArr[(int)(f1)] = s;
                i7 += 22;
                i4 -= i6;
            }
        }
        lArr[(i5 >>> 1) % N] -= Test.instanceCount;
        i7 += i7;
        iArr[(i5 >>> 1) % N] >>= (int)-525298006L;
        vMeth1_check_sum += l + i4 + l1 + Float.floatToIntBits(f1) + i5 + i6 + i7 + s + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth() {

        int i8=-43, i9=52, i10=69, i11=140, i12=-11, i13=45942, iArr1[]=new int[N];
        boolean b1=true;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 72.30382);
        FuzzerUtils.init(iArr1, -7);

        vMeth1(Test.instanceCount, i8, Test.instanceCount);
        for (i9 = 10; i9 < 184; ++i9) {
            float f2=-106.742F;
            f2 += i8;
            if (b1) break;
            i11 = 1;
            while (++i11 < 9) {
                i10 = i11;
                i8 = i10;
                dArr[i11 + 1] = i9;
                i8 += i11;
                i10 += i11;
                i8 += (((i11 * Test.instanceCount) + i10) - f2);
                Test.instanceCount = i8;
                for (i12 = 1; i12 > 1; i12--) {
                    iArr1[i9 - 1] += i13;
                    i8 += i11;
                }
            }
        }
        long meth_res = i8 + i9 + i10 + (b1 ? 1 : 0) + i11 + i12 + i13 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(boolean b, int i) {

        int i1=7, i2=161, i3=4, i14=7, i15=-80, i16=-13, i17=-47576, i18=13, i19=26034, iArr2[]=new int[N];
        float f=-28.11F;

        FuzzerUtils.init(iArr2, -12);

        i1 = 1;
        while (++i1 < 335) {
            for (i2 = 1; i2 < 5; ++i2) {
                f += (((i2 * i2) + i1) - i3);
                iMeth();
                i3 += (i2 * i2);
            }
            i3 >>= (int)-1829577792429329053L;
        }
        for (i14 = 10; 207 > i14; i14++) {
            iArr2 = iArr2;
            for (i16 = 8; i16 > 1; i16--) {
                Test.instanceCount = 0;
                iArr2[i14] -= i1;
                switch ((i16 % 6) + 114) {
                case 114:
                    for (i18 = 2; 1 < i18; i18--) {
                        Test.dFld = i17;
                        i19 += (i18 - f);
                    }
                case 115:
                case 116:
                    i15 += (i16 * Test.instanceCount);
                case 117:
                    iArr2[i16] = (int)Test.instanceCount;
                    break;
                case 118:
                    Test.dFld += f;
                    break;
                case 119:
                    try {
                        i17 = (i3 / -2020272499);
                        i15 = (i16 / i15);
                        i19 = (iArr2[i14 - 1] % i17);
                    } catch (ArithmeticException a_e) {}
                }
            }
        }
        vMeth_check_sum += (b ? 1 : 0) + i + i1 + i2 + i3 + Float.floatToIntBits(f) + i14 + i15 + i16 + i17 + i18 + i19
            + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i20=-1, i21=10, i22=26, i23=-243, i24=-253, i25=55777, i26=-67, i27=-4572, i28=-42927, i29=50346, i30=14;
        long l2=-3071888600L;
        float f3=24.637F, f4=-20.415F;

        vMeth(false, i20);
        Test.instanceCount *= l2;
        for (i21 = 7; i21 < 321; i21++) {
            f3 += (11 + (i21 * i21));
        }
        for (i23 = 14; i23 < 368; ++i23) {
            short s1=6706;
            s1 += (short)i23;
            for (i25 = 4; i25 < 71; i25 += 3) {
                i22 = i25;
                i26 = (int)l2;
                for (i27 = 1; i27 < 4; i27++) {
                    Test.dFld = Test.instanceCount;
                    Test.lArrFld[i23 - 1] += l2;
                    f4 += i28;
                    switch ((i27 % 2) + 35) {
                    case 35:
                        i26 >>= i23;
                        iArrFld[i27] -= (int)l2;
                        i20 = i21;
                    case 36:
                        i22 = (int)1L;
                        i22 *= i22;
                        i26 = (int)89L;
                    default:
                        Test.dFld %= -1.127098;
                        iArrFld[i25 + 1] &= i24;
                    }
                    Test.dFld *= f4;
                }
            }
            i24 >>= (int)Test.instanceCount;
            f3 += i25;
            Test.fArrFld[i23 - 1] -= s1;
            i28 >>= i25;
            for (i29 = 3; i29 < 71; i29++) {
                iArrFld = FuzzerUtils.int1array(N, (int)1);
                dArrFld[i23 + 1] *= i28;
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
