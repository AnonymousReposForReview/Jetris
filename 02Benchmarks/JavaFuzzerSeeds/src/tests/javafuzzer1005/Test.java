package tests.javafuzzer1005;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 12:48:56 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=558316461033217936L;
    public static float fFld=56.975F;
    public byte byFld=56;
    public static int iFld=107;
    public int iArrFld[]=new int[N];

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i15, int i16) {

        int i17=22397, i18=-141, i19=33522, i20=-248;
        float f1=1.950F;
        double d=-103.3194;
        boolean b=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 0L);

        i17 = 1;
        while (++i17 < 202) {
            i16 = (int)Test.instanceCount;
            for (i18 = 1; i18 < 8; i18++) {
                i20 = 2;
                while (--i20 > 0) {
                    f1 -= Test.instanceCount;
                    i19 = (int)d;
                    switch (((i20 % 5) * 5) + 46) {
                    case 49:
                        i15 += i20;
                    case 52:
                        Test.instanceCount += i17;
                        lArr[i17 - 1] ^= i19;
                        break;
                    case 69:
                        i19 = i15;
                        break;
                    case 60:
                        i19 -= (int)d;
                        Test.instanceCount *= Test.instanceCount;
                        break;
                    case 58:
                        i15 -= 1719;
                    default:
                        if (b) continue;
                    }
                }
            }
        }
        vMeth1_check_sum += i15 + i16 + i17 + i18 + i19 + i20 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d) +
            (b ? 1 : 0) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(byte by, int i10) {

        int i11=215, i12=13215, i13=-8, i14=0, i21=58909, i22=-12;
        long l=-7L;
        short s=18902;
        double d1=55.27021;

        for (i11 = 12; i11 < 249; i11++) {
            for (i13 = 1; i13 < 7; ++i13) {
                vMeth1(13, i12);
                for (i21 = i13; i21 < 2; i21++) {
                    Test.instanceCount = Test.instanceCount;
                    Test.fFld -= i14;
                    i10 -= i14;
                    i22 += (i21 ^ Test.instanceCount);
                    i10 = i12;
                    i12 += 66;
                    i14 = (int)l;
                    s = (short)d1;
                    Test.instanceCount = i12;
                    i10 += (i21 ^ i21);
                }
                l *= l;
            }
        }
        vMeth_check_sum += by + i10 + i11 + i12 + i13 + i14 + i21 + i22 + l + s + Double.doubleToLongBits(d1);
    }

    public static int iMeth() {

        int i2=3, i3=14, i4=-3, i5=-4, i6=-147, i7=14027, i8=6, i9=12, iArr[][]=new int[N][N], iArr1[]=new int[N];
        float f=-11.897F;
        byte by1=-36;

        FuzzerUtils.init(iArr, -61062);
        FuzzerUtils.init(iArr1, 33422);

        for (i2 = 3; i2 < 344; ++i2) {
            switch (((i2 % 10) * 5) + 51) {
            case 82:
                i3 += (((i2 * i2) + i3) - i2);
                for (i4 = 1; i4 < 5; ++i4) {
                    iArr[i2][i2 - 1] <<= (int)(i2 + (Math.abs(i3) - (f + i5)));
                }
                i3 = (int)((Test.instanceCount++) + iArr1[i2 - 1]);
                for (i6 = 1; 5 > i6; ++i6) {
                    iArr[i6][i2 + 1] -= (int)((-(i5 + i3)) * (i2 - (33575 - (~(Test.instanceCount++)))));
                    iArr[i2 - 1][i6 - 1] -= (i3 += i4);
                    i7 += (i6 | i7);
                    for (i8 = 2; 1 < i8; i8 -= 2) {
                        vMeth(by1, i6);
                        i5 = (int)f;
                        try {
                            i3 = (1040926312 % i5);
                            iArr1[i8] = (iArr1[i2 - 1] / -1450225098);
                            i5 = (8 / iArr[i6 + 1][i8]);
                        } catch (ArithmeticException a_e) {}
                        i7 = i8;
                    }
                }
            case 56:
                Test.instanceCount += (i2 ^ Test.instanceCount);
                break;
            case 59:
                iArr1[i2] >>>= i7;
            case 90:
                i5 = (int)121.460F;
                break;
            case 81:
                i3 = i8;
                break;
            case 71:
                i3 += (int)-1998671153220328364L;
                break;
            case 52:
                Test.instanceCount |= i7;
                break;
            case 65:
                try {
                    iArr1[i2 - 1] = (i6 % i2);
                    iArr1[i2 + 1] = (i6 / i7);
                    i3 = (-8528 / iArr1[i2 - 1]);
                } catch (ArithmeticException a_e) {}
                break;
            case 78:
                Test.instanceCount -= i2;
                break;
            case 74:
                iArr1[i2] -= (int)Test.instanceCount;
                break;
            default:
                i3 = i2;
            }
        }
        long meth_res = i2 + i3 + i4 + i5 + Float.floatToIntBits(f) + i6 + i7 + i8 + i9 + by1 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-56035, i1=183, i23=119, i24=9, i25=-12, i26=4, i27=-29197, i28=45061, i29=-32243, i30=26;
        long l1=-4668646833869416660L;

        for (i = 314; 10 < i; i -= 3) {
            Test.instanceCount >>= iMeth();
            if (true) continue;
            i1 -= (int)-5037440775130875952L;
            for (i23 = 2; i23 < 248; ++i23) {
                Test.instanceCount = i24;
                i24 += (i23 - Test.fFld);
                i1 = i;
            }
            i25 = 248;
            while ((i25 -= 3) > 0) {
                iArrFld[i - 1] = byFld;
                i1 = 13473;
                Test.instanceCount *= i23;
            }
            switch ((i % 5) + 48) {
            case 48:
                i24 |= i24;
                break;
            case 49:
                for (l1 = 15; l1 < 248; l1++) {
                    i24 = i23;
                    Test.iFld += (int)(((l1 * Test.instanceCount) + i23) - byFld);
                    Test.fFld *= l1;
                    for (i27 = (int)(l1); i27 < 2; i27++) {
                        i24 += (int)(2.60F + (i27 * i27));
                        Test.instanceCount >>>= Test.instanceCount;
                    }
                    Test.iFld = i25;
                    Test.iFld += (int)Test.fFld;
                    i1 += (int)(((l1 * Test.instanceCount) + byFld) - i1);
                }
                iArrFld[i - 1] = (int)Test.fFld;
                Test.instanceCount -= (long)Test.fFld;
                break;
            case 50:
                Test.fFld *= Test.iFld;
                for (i29 = 4; i29 < 248; i29 += 3) {
                    i24 /= (int)(i25 | 1);
                    i26 = i27;
                }
                break;
            case 51:
                iArrFld[i + 1] = i29;
                break;
            case 52:
                Test.iFld = i27;
                break;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
