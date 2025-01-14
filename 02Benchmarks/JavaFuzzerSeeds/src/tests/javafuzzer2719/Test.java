package tests.javafuzzer2719;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 19:18:19 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=1164730244L;
    public static int iFld=-20979;
    public short sFld=6015;
    public double dFld=-4.51762;
    public static int iFld1=3;
    public int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];
    public static volatile long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.dArrFld, -18.87109);
        FuzzerUtils.init(Test.lArrFld, -1321008474L);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(double d) {

        int i=10, i1=64542, i2=56695, i4=-12, i5=45856, i6=935, i7=-5462, iArr[]=new int[N];

        FuzzerUtils.init(iArr, -14);

        Test.iFld <<= Test.iFld;
        for (i = 382; i > 11; i -= 2) {
            Test.iFld += i1;
        }
        i2 = 1;
        do {
            for (i4 = 1; i4 < 5; ++i4) {
                iArr[i4 + 1] = -4501;
                Test.iFld = -5;
                i1 += (int)(0.1018F + (i4 * i4));
                Test.iFld += i4;
                Test.iFld *= (int)3776143147L;
                if (false) break;
                for (i6 = 1; i6 < 2; ++i6) {
                    i7 += i4;
                    Test.instanceCount ^= 0;
                    Test.iFld += i6;
                }
            }
        } while (++i2 < 315);
        vMeth_check_sum += Double.doubleToLongBits(d) + i + i1 + i2 + i4 + i5 + i6 + i7 + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth1() {

        double d1=-83.79450, dArr[][]=new double[N][N];
        float f1=105.261F;
        int i8=12, i9=-1, i10=-12, i11=47712, i12=172, i13=-1, iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, 226);
        FuzzerUtils.init(dArr, 2.42986);

        vMeth(d1);
        iArr1[(Test.iFld >>> 1) % N] -= (int)56.722F;
        f1 += f1;
        for (i8 = 1; i8 < 258; i8++) {
            Test.iFld *= (int)f1;
            Test.iFld = (int)Test.instanceCount;
        }
        for (i10 = 19; 344 > i10; ++i10) {
            for (i12 = 5; i12 > 1; i12 -= 2) {
                switch ((i12 % 3) * 5) {
                case 15:
                    f1 += 10L;
                    dArr[i10] = FuzzerUtils.double1array(N, (double)2.103396);
                    i9 *= i10;
                    break;
                case 13:
                    Test.iFld += (i12 * i12);
                    break;
                case 1:
                    Test.instanceCount = (long)f1;
                    i11 += i12;
                    break;
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d1) + Float.floatToIntBits(f1) + i8 + i9 + i10 + i11 + i12 + i13 +
            FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        float f=-2.297F;
        byte by=50;
        short s=14653;
        int i14=3, i15=-239, iArr2[]=new int[N];
        boolean b=false;

        FuzzerUtils.init(iArr2, -69);

        f += iMeth1();
        Test.iFld <<= Test.iFld;
        by -= (byte)1.793F;
        Test.iFld ^= (int)Test.instanceCount;
        Test.dArrFld = Test.dArrFld;
        s = (short)Test.iFld;
        for (i14 = 4; i14 < 337; i14++) {
            Test.lArrFld[i14 - 1] = 45051L;
        }
        i15 -= i15;
        iArr2[(-5803 >>> 1) % N] = Test.iFld;
        if (b) {
            iArr2[(Test.iFld >>> 1) % N] |= (int)9L;
            i15 = i14;
            b = b;
            i15 += (int)Test.instanceCount;
        } else {
            Test.iFld -= (int)-3211468802496159708L;
        }
        long meth_res = Float.floatToIntBits(f) + by + s + i14 + i15 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i16=79, i17=-36594, i18=-11, i19=64344, i20=96, i21=-49969, i22=33, i23=3, i24=-59436, i25=3;
        float f2=9.385F, fArr[]=new float[N];
        boolean b1=false;

        FuzzerUtils.init(fArr, 45.149F);

        fArr[(Test.iFld >>> 1) % N] -= (++sFld);
        iArrFld[(Test.iFld >>> 1) % N] >>= iMeth();
        for (i16 = 11; i16 < 212; ++i16) {
            Test.iFld += i17;
            i17 = 8;
            Test.instanceCount ^= Test.iFld;
        }
        i18 = 163;
        while ((i18 -= 2) > 0) {
            Test.iFld *= (int)dFld;
            i17 += (i18 ^ i19);
            for (i20 = 5; i20 < 305; i20++) {
                i22 += (i20 * i20);
                i17 *= i22;
                i19 <<= sFld;
                i21 *= i21;
                for (i23 = 1; i23 < 2; i23++) {
                    f2 = i16;
                    b1 = b1;
                    i25 = (int)Test.instanceCount;
                    i19 = -8555;
                    f2 *= Test.iFld;
                    f2 = 7;
                    i24 += (((i23 * Test.instanceCount) + i18) - Test.instanceCount);
                    i25 -= i24;
                    i22 = i18;
                    i22 = -7;
                }
            }
            fArr[i18] = 31496;
            Test.iFld1 *= (int)Test.instanceCount;
            i25 *= -21059;
        }
        iArrFld[(i18 >>> 1) % N] = (int)Test.instanceCount;
        i19 = i21;


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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
