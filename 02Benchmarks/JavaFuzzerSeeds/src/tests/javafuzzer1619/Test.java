package tests.javafuzzer1619;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 00:12:03 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-62246591L;
    public static short sFld=-4525;
    public static int iFld=-975;
    public static boolean bFld=false;
    public static double dFld=-123.104844;
    public static int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 110);
        FuzzerUtils.init(Test.dArrFld, 0.113915);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i7, short s) {

        int i8=-14, i9=10, i10=5, i11=223;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -20588L);

        for (i8 = 1; i8 < 282; i8++) {
            if (i9 != 0) {
                vMeth2_check_sum += i7 + s + i8 + i9 + i10 + i11 + FuzzerUtils.checkSum(lArr);
                return;
            }
            i7 = (int)Test.instanceCount;
            i7 -= i9;
        }
        Test.iArrFld[(i9 >>> 1) % N] |= (int)Test.instanceCount;
        Test.iArrFld[(i8 >>> 1) % N] += -10;
        for (long l : lArr) {
            i7 >>>= i8;
            i9 >>= i8;
        }
        i7 = i8;
        i7 = i7;
        lArr[(i8 >>> 1) % N] += Test.instanceCount;
        for (i10 = 7; i10 < 161; ++i10) {
            Test.iArrFld[i10] &= (int)Test.instanceCount;
            i9 = (int)50.822F;
        }
        vMeth2_check_sum += i7 + s + i8 + i9 + i10 + i11 + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(int i2) {

        int i3=177, i4=-51256, i5=133, i6=-2, i12=5384, i13=-169, i14=-49878, iArr[]=new int[N];

        FuzzerUtils.init(iArr, -28516);

        for (i3 = 287; i3 > 17; --i3) {
            if (i2 != 0) {
                vMeth1_check_sum += i2 + i3 + i4 + i5 + i6 + i12 + i13 + i14 + FuzzerUtils.checkSum(iArr);
                return;
            }
            Test.instanceCount += (long)((-87.89382 * (i2 * i4)) + ((Test.instanceCount - Test.instanceCount) +
                (iArr[i3]++)));
            for (i5 = 1; i5 < 6; i5++) {
                vMeth2(i5, Test.sFld);
            }
            Test.instanceCount |= Test.sFld;
        }
        i6 = -5;
        i4 += 9;
        i12 = 1;
        while (++i12 < 396) {
            i4 = i2;
            i4 = -152;
        }
        i2 += (int)Test.instanceCount;
        for (i13 = 4; i13 < 196; i13++) {
            Test.instanceCount = i4;
            if (i5 != 0) {
                vMeth1_check_sum += i2 + i3 + i4 + i5 + i6 + i12 + i13 + i14 + FuzzerUtils.checkSum(iArr);
                return;
            }
        }
        vMeth1_check_sum += i2 + i3 + i4 + i5 + i6 + i12 + i13 + i14 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth() {

        int i=8, i1=-23506;

        for (i = 262; i > 13; i -= 2) {
            vMeth1(i1);
            i1 -= 8;
            i1 = i1;
            Test.instanceCount <<= Test.iFld;
        }
        vMeth_check_sum += i + i1;
    }

    public void mainTest(String[] strArr1) {

        int i15=-5, i16=-1, i17=-7247, i18=-247, i19=185, i20=-59732, i21=-26797, i22=12192, i23=9, i24=142;
        float f=-2.867F, fArr[]=new float[N];
        byte by=51, byArr[]=new byte[N];
        boolean bArr[]=new boolean[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(byArr, (byte)69);
        FuzzerUtils.init(lArr1, 13L);
        FuzzerUtils.init(fArr, 0.819F);

        vMeth();
        for (i15 = 4; i15 < 185; i15++) {
            boolean b=true;
            bArr[i15 + 1] = b;
            byArr[i15] >>= (byte)60143;
            Test.iArrFld[i15] *= i17;
            Test.instanceCount = i17;
            Test.dArrFld = FuzzerUtils.double1array(N, (double)2.97623);
            lArr1[i15] = i16;
        }
        Test.instanceCount = -12;
        f *= i17;
        i17 += i17;
        Test.instanceCount = i16;
        Test.bFld = Test.bFld;
        i18 = 1;
        while (++i18 < 141) {
            try {
                i17 = (Test.iArrFld[i18 - 1] % i17);
                i17 = (i18 % 1599930937);
                Test.iArrFld[i18] = (i17 / 97);
            } catch (ArithmeticException a_e) {}
            switch ((i18 % 2) + 118) {
            case 118:
                for (i19 = 178; i19 > 9; i19 -= 3) {
                    f = f;
                    f += (i19 * f);
                    lArr1 = lArr1;
                }
                Test.instanceCount = i20;
                try {
                    Test.iArrFld[i18] = (29554 % i19);
                    Test.iFld = (i20 % -7340);
                    i16 = (i18 / i16);
                } catch (ArithmeticException a_e) {}
                break;
            case 119:
                for (i21 = 2; i21 < 178; i21++) {
                    lArr1[i21 - 1] += by;
                    Test.iFld = (int)Test.dFld;
                    for (i23 = i18; i23 < 2; i23++) {
                        fArr[i23] *= i24;
                        i22 += (i23 | i20);
                        Test.dFld = i24;
                        i20 -= (int)Test.instanceCount;
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}