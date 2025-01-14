package tests.javafuzzer2155;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 09:34:21 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=202L;
    public volatile double dFld=2.122390;
    public static int iFld=10;
    public volatile short sFld=24025;
    public float fFld=-44.971F;
    public static float fArrFld[]=new float[N];
    public byte byArrFld[]=new byte[N];
    public static int iArrFld[]=new int[N];
    public boolean bArrFld[][]=new boolean[N][N];

    static {
        FuzzerUtils.init(Test.fArrFld, -2.647F);
        FuzzerUtils.init(Test.iArrFld, -7);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public void vMeth2(int i2) {

        int i3=-6, i4=2, iArr[][]=new int[N][N];
        float f1=1.130F;
        boolean b1=true;

        FuzzerUtils.init(iArr, 137);

        Test.instanceCount >>= i2;
        Test.fArrFld[(i2 >>> 1) % N] += i2;
        for (i3 = 10; i3 < 248; i3++) {
            try {
                i4 = (i3 / i4);
                i4 = (iArr[i3 + 1][i3 + 1] / i2);
                i2 = (i2 / 64940);
            } catch (ArithmeticException a_e) {}
            i2 = 13491;
            switch (((i2 >>> 1) % 3) + 50) {
            case 50:
                i2 = i4;
                i2 = i3;
                break;
            case 51:
                iArr = FuzzerUtils.int2array(N, (int)215);
            case 52:
                Test.instanceCount += (long)f1;
            default:
                i2 >>= i2;
                Test.instanceCount += (long)dFld;
                Test.instanceCount += (i3 - Test.instanceCount);
            }
            b1 = b1;
            Test.instanceCount = i3;
        }
        vMeth2_check_sum += i2 + i3 + i4 + Float.floatToIntBits(f1) + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr);
    }

    public void vMeth1(float f) {

        int i5=-154, i6=-52205, i7=189, iArr1[]=new int[N];
        long l=55L;

        FuzzerUtils.init(iArr1, -50663);

        vMeth2(Test.iFld);
        Test.iFld = sFld;
        Test.iFld >>>= Test.iFld;
        for (i5 = 20; i5 < 354; i5++) {
            i6 ^= -30517;
            f += (((i5 * i7) + f) - i5);
            i6 = 0;
        }
        Test.instanceCount ^= i5;
        i6 += -9;
        l = 1;
        while (++l < 165) {
            iArr1[(int)(l)] += (int)dFld;
            try {
                i6 = (iArr1[(int)(l)] / Test.iFld);
                i6 = (iArr1[(int)(l - 1)] % 198748791);
                iArr1[(int)(l - 1)] = (-743133802 / Test.iFld);
            } catch (ArithmeticException a_e) {}
            dFld += i5;
            Test.instanceCount = -23070;
            sFld = (short)i7;
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + i5 + i6 + i7 + l + FuzzerUtils.checkSum(iArr1);
    }

    public void vMeth(int i, boolean b, int i1) {

        int i8=3, i9=-7;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -452206186L);

        vMeth1(fFld);
        for (i8 = 305; i8 > 2; i8--) {
            i9 *= i1;
            Test.iFld = -4;
            Test.iFld += (((i8 * fFld) + Test.iFld) - Test.iFld);
            i1 -= -30907;
        }
        try {
            byArrFld = byArrFld;
            Test.iArrFld[(i8 >>> 1) % N] -= sFld;
            Test.iFld = -10;
            Test.iArrFld = new int[Test.iFld];
            Test.iFld -= i9;
            fFld = i1;
            i1 += (int)Test.instanceCount;
        }
        catch (NegativeArraySizeException exc1) {
            lArr[(Test.iFld >>> 1) % N] *= Test.iFld;
            i9 ^= sFld;
        }
        finally {
            Test.iArrFld[(i9 >>> 1) % N] += (int)Test.instanceCount;
        }
        vMeth_check_sum += i + (b ? 1 : 0) + i1 + i8 + i9 + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        boolean b2=false;
        int i11=7, i12=3, i13=-64125, i14=110, i15=116, i16=13, i17=3, i18=-64861;
        byte by1=0;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -1.127626);

        vMeth(230, b2, Test.iFld);
        if (b2) {
            for (i11 = 8; 389 > i11; ++i11) {
                for (i13 = 4; i13 < 66; ++i13) {
                    for (i15 = 1; i15 < 2; i15++) {
                        i14 += (-11972 + (i15 * i15));
                        dFld -= Test.instanceCount;
                        Test.iArrFld[i11] += (int)fFld;
                        i16 <<= (int)Test.instanceCount;
                        Test.iFld += Test.iFld;
                        Test.fArrFld[i15 + 1] += (float)dFld;
                        Test.fArrFld = FuzzerUtils.float1array(N, (float)53.422F);
                        fFld += i15;
                        Test.iArrFld[i15 - 1] -= i11;
                        switch (((i15 % 2) * 5) + 89) {
                        case 97:
                            Test.instanceCount += (i15 ^ i15);
                            Test.iFld += (i15 + i11);
                            break;
                        case 91:
                        default:
                            by1 += (byte)(i15 | (long)fFld);
                            if (false) continue;
                        }
                    }
                    b2 = b2;
                    Test.instanceCount -= i15;
                    Test.iFld += Test.iFld;
                    Test.instanceCount -= Test.instanceCount;
                    for (i17 = 1; 2 > i17; ++i17) {
                        bArrFld[i11 + 1][i13] = b2;
                        i12 >>= (int)Test.instanceCount;
                        i18 += i13;
                        i14 += (int)Test.instanceCount;
                        Test.iFld <<= Test.iFld;
                    }
                }
                Test.iFld = i11;
            }
        } else {
            dArr[(38688 >>> 1) % N] *= i13;
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
