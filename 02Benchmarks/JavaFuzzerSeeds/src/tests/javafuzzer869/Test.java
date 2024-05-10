package tests.javafuzzer869;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 10:56:47 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=230L;
    public static double dFld=36.111328;
    public static volatile boolean bFld=false;
    public static float fFld=0.697F;
    public short sFld=10823;
    public volatile byte byFld=44;
    public static volatile int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 0);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;

    public static void vSmallMeth(int i1, long l, int i2) {


        i2 %= (int)(((long)((Test.iArrFld[(-12654 >>> 1) % N][(i2 >>> 1) % N] * (i2 - i1)) - Test.dFld)) | 1);
        vSmallMeth_check_sum += i1 + l + i2;
    }

    public static int iMeth2(int i5) {

        int i6=13, i7=51019, i8=-7689, i9=-22292;
        byte by1=12, by2=21;
        float f=107.339F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 7293718981033678898L);

        for (i6 = 5; i6 < 145; i6++) {
            switch ((i6 % 9) + 29) {
            case 29:
                if (false) continue;
                break;
            case 30:
                Test.instanceCount = i6;
                Test.instanceCount = by1;
                for (i8 = 1; i8 < 11; i8++) {
                    i5 += i8;
                }
                break;
            case 31:
                if (Test.bFld) break;
                i5 |= i5;
                i7 += i6;
                i9 += (i6 + Test.instanceCount);
                break;
            case 32:
                Test.dFld = i5;
                Test.iArrFld[i6][i6 - 1] -= by2;
                break;
            case 33:
                Test.instanceCount += i9;
                f += (i6 * i6);
                break;
            case 34:
                if (Test.bFld) continue;
                break;
            case 35:
                i5 *= (int)Test.instanceCount;
            case 36:
                i5 = (int)3494299830L;
                break;
            case 37:
                lArr = lArr;
                break;
            }
        }
        long meth_res = i5 + i6 + i7 + by1 + i8 + i9 + by2 + Float.floatToIntBits(f) + FuzzerUtils.checkSum(lArr);
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth1(double d, int i4) {

        double d1=-2.129129;
        int i10=141, i11=111, i12=200, i13=7, i14=-28, i15=-14;
        float f1=-46.822F;

        iMeth2(1);
        i4 += i4;
        d1 = 1;
        while (++d1 < 368) {
            Test.instanceCount <<= i4;
            for (i10 = 5; i10 > d1; --i10) {
                for (i12 = i10; i12 < 1; ++i12) {
                    i4 += (i12 | i10);
                    Test.dFld = -6796359694602358413L;
                    i4 = (int)Test.instanceCount;
                }
                for (i14 = 1; 1 > i14; ++i14) {
                    f1 = i13;
                    i15 += i12;
                    Test.iArrFld[i10][i14 - 1] += i13;
                    i11 = -62328;
                    f1 = i14;
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d) + i4 + Double.doubleToLongBits(d1) + i10 + i11 + i12 + i13 + i14 +
            i15 + Float.floatToIntBits(f1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i3) {

        byte by=13;

        vSmallMeth((int)(((i3 * by) * iMeth1(Test.dFld, i3)) + Test.fFld), Test.instanceCount, i3);
        i3 >>= (int)5941105918631495733L;
        long meth_res = i3 + by;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=58225, i16=12, i17=55254, i18=-30, i19=-15394;
        long l1=3368465782L;
        float f2=-62.903F, fArr[]=new float[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(fArr, -127.440F);
        FuzzerUtils.init(bArr, false);

        i = 1;
        while (++i < 225) {
            int i20=-82;
            for (int smallinvoc=0; smallinvoc<62; smallinvoc++) vSmallMeth(Test.iArrFld[i][i]++,
                (long)(((Test.instanceCount - Test.instanceCount) - (-27758L + (fArr[i]--))) + (iMeth(3) - i)), 60850);
            i16 = 144;
            if (Test.bFld) {
                i16 = i;
                i16 = i;
                switch ((i % 7) + 87) {
                case 87:
                    for (i17 = 7; i17 < 112; i17++) {
                        Test.fFld -= 30558;
                        i16 = i16;
                        bArr[i - 1] = true;
                        Test.instanceCount *= i16;
                        i16 += (int)Test.instanceCount;
                        Test.iArrFld = Test.iArrFld;
                        try {
                            i16 = (-172 % Test.iArrFld[i17 + 1][i]);
                            i18 = (i / 176);
                            Test.iArrFld[i17 - 1][i + 1] = (Test.iArrFld[i17][i + 1] / 43);
                        } catch (ArithmeticException a_e) {}
                        Test.instanceCount >>>= i16;
                        i18 += i17;
                    }
                    if (Test.bFld) continue;
                    l1 = 112;
                    do {
                        Test.iArrFld[i - 1][i - 1] = 139;
                        Test.iArrFld[i - 1][(int)(l1)] += (int)l1;
                        sFld += (short)(((l1 * i18) + Test.fFld) - l1);
                    } while (--l1 > 0);
                case 88:
                    i18 = i17;
                    i18 *= byFld;
                    Test.instanceCount += l1;
                    break;
                case 89:
                    i18 += (int)Test.dFld;
                    for (f2 = 112; f2 > 6; f2--) {
                        i19 = i17;
                        i16 <<= i19;
                        i18 = (int)Test.instanceCount;
                    }
                    break;
                case 90:
                    i19 >>= 7;
                    break;
                case 91:
                    Test.instanceCount = i19;
                case 92:
                    Test.fFld += i;
                    break;
                case 93:
                    Test.instanceCount = i17;
                    break;
                }
            } else if (false) {
                i20 &= (int)Test.instanceCount;
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test iMeth
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  iMeth2 ->  iMeth2 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}