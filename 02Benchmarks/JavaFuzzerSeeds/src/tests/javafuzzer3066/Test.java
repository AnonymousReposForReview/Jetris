package tests.javafuzzer3066;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 01:23:02 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-173L;
    public static float fFld=-6.394F;
    public volatile double dFld=0.42728;
    public static int iFld=-4;
    public static int iFld1=156;
    public static short sFld=30791;
    public static volatile int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 5030);
        FuzzerUtils.init(Test.fArrFld, 2.330F);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i14=-59982, i15=235, i16=-59, i17=-13, i18=59326, i19=-13, iArr2[]=new int[N];
        byte by=116;
        boolean b1=true;
        long l=-2002479419L, l2=30027L, lArr2[]=new long[N];

        FuzzerUtils.init(lArr2, 2652098080L);
        FuzzerUtils.init(iArr2, 2148);

        for (i14 = 13; 302 > i14; ++i14) {
            by += (byte)(i14 | i15);
        }
        Test.iFld = 13;
        Test.iFld1 = 0;
        b1 = b1;
        for (i16 = 7; i16 < 157; i16++) {
            Test.iFld >>= -246;
        }
        for (l = 3; l < 206; l++) {
            double d1=0.35976;
            Test.instanceCount += l;
            switch ((int)((l % 6) + 56)) {
            case 56:
                Test.iFld1 += (int)d1;
                for (l2 = 8; 1 < l2; l2--) {
                    i19 -= i15;
                    Test.iFld1 = i15;
                }
                break;
            case 57:
                i18 |= i15;
                break;
            case 58:
                i18 += (int)(l ^ i17);
                break;
            case 59:
                Test.iFld += (int)(l - i18);
                break;
            case 60:
                Test.instanceCount += (((l * Test.iFld1) + Test.iFld) - l2);
                break;
            case 61:
                iArr2[(int)(l + 1)] = i19;
                break;
            default:
                i17 = (int)-2.595F;
            }
        }
        long meth_res = i14 + i15 + by + (b1 ? 1 : 0) + i16 + i17 + l + i18 + l2 + i19 + FuzzerUtils.checkSum(lArr2) +
            FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i9) {

        int i10=10856, i11=159, i12=33, i13=-52380, iArr1[][]=new int[N][N];
        boolean b2=true;
        byte by1=41;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 4284L);
        FuzzerUtils.init(iArr1, -5484);

        i9 >>>= Test.iFld;
        for (i10 = 5; 178 > i10; i10++) {
            i11 += (i10 - Test.instanceCount);
            lArr1[i10] <<= (long)((Test.fFld--) * i10);
            for (i12 = 1; i12 < 9; i12++) {
                iArr1[i10 - 1][i10] = ((iMeth() >>> i11) * i12);
                if (b2) continue;
                i9 += by1;
                Test.iFld1 = i9;
                Test.fFld *= Test.fFld;
                Test.sFld = (short)Test.instanceCount;
            }
            switch (((i11 >>> 1) % 2) + 13) {
            case 13:
                Test.sFld *= (short)11L;
                Test.instanceCount += (((i10 * i12) + Test.instanceCount) - Test.instanceCount);
                break;
            case 14:
                i13 = (int)Test.fFld;
                break;
            default:
                Test.iArrFld[i10] = i9;
            }
        }
        vMeth_check_sum += i9 + i10 + i11 + i12 + i13 + (b2 ? 1 : 0) + by1 + FuzzerUtils.checkSum(lArr1) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static long lMeth(double d, int i8) {


        vMeth(55);
        Test.fArrFld[(i8 >>> 1) % N] = Test.instanceCount;
        Test.iArrFld[(Test.iFld >>> 1) % N] ^= i8;
        long meth_res = Double.doubleToLongBits(d) + i8;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-12, i1=55966, i2=85, i3=8421, i4=-7, i5=-151, i6=-232, i7=25303, i20=-4, i21=32985, iArr[]=new int[N];
        boolean b=false;
        long lArr[][]=new long[N][N];
        double dArr[][]=new double[N][N];

        FuzzerUtils.init(iArr, 4);
        FuzzerUtils.init(lArr, -240L);
        FuzzerUtils.init(dArr, 0.75519);

        for (i = 14; i < 257; i += 3) {
            Test.fFld += (i + i1);
        }
        i1 *= (int)dFld;
        for (i2 = 10; i2 < 195; i2++) {
            Test.instanceCount += i2;
            i1 -= iArr[i2 + 1];
            switch (((i2 % 2) * 5) + 107) {
            case 112:
                Test.instanceCount *= (Test.instanceCount = 9);
                for (i4 = i2; i4 < 136; i4++) {
                    iArr = (iArr = (iArr = (iArr = iArr)));
                    try {
                        iArr[i4 - 1] = (i5 % iArr[i2 - 1]);
                        i1 = (-224 / iArr[i4]);
                        iArr[i2 + 1] = (-14698 / i2);
                    } catch (ArithmeticException a_e) {}
                    iArr[i4] <<= i2;
                    b = (28555 < (i1--));
                    Test.instanceCount -= (Test.iFld--);
                    switch ((i2 % 7) + 18) {
                    case 18:
                        lArr[i2 + 1][i2] >>= (--i1);
                        dFld *= (lArr[i2][i2 + 1] *= i2);
                        for (i6 = 1; 1 > i6; i6++) {
                            dArr[i6 + 1][i4 - 1] = -13;
                        }
                        break;
                    case 19:
                        iArr[i4 + 1] -= (int)(i1 = (int)lMeth(dFld, 63811));
                    case 20:
                        for (i20 = 1; i20 > 1; i20 -= 2) {
                            lArr[i20][i2] >>= Test.instanceCount;
                            Test.instanceCount += i20;
                            Test.fFld *= 27955;
                            Test.instanceCount += (i20 + i20);
                            i5 -= i2;
                        }
                        Test.fFld *= i2;
                        Test.instanceCount += (long)91.101624;
                        Test.iFld += i4;
                        break;
                    case 21:
                        if (true) continue;
                        break;
                    case 22:
                        Test.instanceCount %= (Test.instanceCount | 1);
                        break;
                    case 23:
                        lArr[i4][i2] -= i;
                        break;
                    case 24:
                        Test.iFld = i5;
                    default:
                        Test.iFld *= Test.sFld;
                    }
                }
                break;
            case 115:
                Test.iArrFld[i2 - 1] = (int)Test.instanceCount;
            default:
                i1 += (int)Test.fFld;
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
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}