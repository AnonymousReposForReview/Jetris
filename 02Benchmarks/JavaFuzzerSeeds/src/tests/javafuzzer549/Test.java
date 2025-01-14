package tests.javafuzzer549;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 05:31:49 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=0L;
    public static int iFld1=-206;
    public static boolean bFld=true;
    public static float fFld=2.473F;
    public static short sFld=-19471;
    public static volatile byte byFld=61;
    public static byte byFld1=107;
    public double dFld=19.65941;
    public static int iArrFld[]=new int[N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -23787);
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(float f) {

        double d1=32.126107;
        int i4=1, i5=0, i6=0, i7=-17, i8=65085, iArr[]=new int[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 187);
        FuzzerUtils.init(lArr, -10291L);

        iArr[(-41 >>> 1) % N] *= (int)Test.instanceCount;
        Test.bFld = Test.bFld;
        try {
            for (d1 = 11 - 400; d1 < 289; ++d1) {
                for (i5 = 1 - 400; i5 < 4; i5++) {
                    for (i7 = 1; i7 > i5; --i7) {
                        i8 = i5;
                        Test.bFld = Test.bFld;
                        lArr[(int)(d1)] *= i5;
                        i6 = (int)f;
                        if (Test.iFld1 != 0) {
                        }
                        iArr[i5] += 192;
                    }
                    i4 = i8;
                }
                i8 >>= i6;
                iArr = iArr;
            }
        }
        catch (ArrayIndexOutOfBoundsException exc1) {
            f = i6;
        }
        finally {
            f = Test.iFld1;
        }
        long meth_res = Float.floatToIntBits(f) + Double.doubleToLongBits(d1) + i4 + i5 + i6 + i7 + i8 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i1, double d, long l) {

        int i2=109, i3=-9, i9=-45031, i10=-21841, i11=64171;

        for (i2 = 12; i2 < 250; ++i2) {
            Test.iFld1 = iMeth1(Test.fFld);
            Test.instanceCount = i1;
            i1 += (i2 * i2);
            switch (((i1 >>> 1) % 6) + 93) {
            case 93:
                i9 = 1;
                do {
                    Test.iFld1 |= (int)l;
                    i10 = 1;
                    do {
                        i3 += (i10 * i10);
                        Test.iArrFld[i2 + 1] = i2;
                        Test.instanceCount += i3;
                        l %= 14399;
                        i3 = 75;
                        Test.iFld1 += (((i10 * i9) + i10) - i3);
                    } while (++i10 < 1);
                    Test.iArrFld[i2 + 1] = 3;
                } while (++i9 < 7);
                break;
            case 94:
                i3 ^= -121;
                break;
            case 95:
                i1 -= (int)d;
                break;
            case 96:
                Test.bArrFld[i2 - 1] = Test.bFld;
                break;
            case 97:
                i11 += (-7586 + (i2 * i2));
                break;
            case 98:
                Test.sFld <<= (short)i2;
            default:
                i1 -= (int)l;
            }
        }
        long meth_res = i1 + Double.doubleToLongBits(d) + l + i2 + i3 + i9 + i10 + i11;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i=-18884, i12=27759, i13=-8, i14=11800, i15=-12;
        double d2=45.19345;
        short s1=-18071, sArr[]=new short[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -3532527189L);
        FuzzerUtils.init(sArr, (short)10726);

        i = 1;
        do {
            Test.iFld1 = (iMeth(i, d2, Test.instanceCount) / 74);
            lArr1[i - 1] >>>= Test.instanceCount;
            Test.iArrFld[i] = s1;
            lArr1[i + 1] /= ((long)(Test.fFld) | 1);
            for (i12 = 1; i12 < 5; ++i12) {
                d2 = i13;
                i13 = -69;
                sArr[i12 + 1] >>= (short)Test.instanceCount;
                i13 = i12;
                for (i14 = 1; 2 > i14; ++i14) {
                    Test.iFld1 -= (int)Test.fFld;
                    i13 |= i;
                    Test.iArrFld[i14 + 1] = (int)1.170F;
                    Test.iFld1 = (int)Test.fFld;
                }
            }
        } while (++i < 330);
        vMeth_check_sum += i + Double.doubleToLongBits(d2) + s1 + i12 + i13 + i14 + i15 + FuzzerUtils.checkSum(lArr1) +
            FuzzerUtils.checkSum(sArr);
    }

    public void mainTest(String[] strArr3) {

        int i16=64830, i17=-2, i18=2, i19=-6;
        double d3=-1.115024;
        long lArr2[]=new long[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(lArr2, -7288290704685542536L);
        FuzzerUtils.init(fArr, 9.204F);

        vMeth();
        Test.fFld = Test.iFld1;
        Test.byFld = Test.byFld1;
        dFld *= Test.iFld1;
        for (i16 = 9; i16 < 279; ++i16) {
            lArr2[i16 + 1] = i17;
            i18 = 1;
            while (++i18 < 93) {
                for (d3 = 1; d3 > 1; --d3) {
                    switch (((201 >>> 1) % 1) + 124) {
                    case 124:
                        Test.iArrFld = Test.iArrFld;
                        Test.fFld = Test.instanceCount;
                        Test.fFld += i16;
                        i17 *= (int)Test.fFld;
                        break;
                    }
                    Test.bFld = Test.bFld;
                    Test.fFld += (float)(((d3 * Test.fFld) + Test.sFld) - Test.iFld1);
                    dFld = Test.iFld1;
                    Test.fFld -= i19;
                }
                switch ((((i19 >>> 1) % 6) * 5) + 80) {
                case 92:
                    dFld = Test.instanceCount;
                    break;
                case 82:
                    Test.iArrFld = FuzzerUtils.int1array(N, (int)-18949);
                    break;
                case 95:
                    i17 += (i18 + Test.iFld1);
                    Test.instanceCount *= i17;
                    break;
                case 108:
                    Test.fFld -= Test.instanceCount;
                    lArr2 = FuzzerUtils.long1array(N, (long)13L);
                    Test.instanceCount = Test.sFld;
                    lArr2[i16 + 1] = i17;
                    break;
                case 93:
                    i17 += i18;
                    i17 += Test.iFld1;
                    break;
                case 81:
                    fArr[i16] = i17;
                    break;
                default:
                    if (Test.bFld) continue;
                }
            }
        }



    }
    public static void main(String[] strArr2) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr2);
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
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
