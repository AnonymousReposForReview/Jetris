package tests.javafuzzer1588;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 23:24:00 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-5513405482941854510L;
    public static float fFld=0.807F;
    public static boolean bFld=true;
    public static volatile int iFld=-9;
    public long lFld=-246L;
    public long lFld1=-21162L;
    public static int iArrFld[]=new int[N];
    public static volatile int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -17845);
        FuzzerUtils.init(Test.iArrFld1, -42791);
    }

    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long dMeth1_check_sum = 0;

    public static double dMeth1(int i7, int i8) {

        int i9=18150, i10=-182, i11=4, i12=-8, i13=61973, i14=10, i15=63831, i16=63966, iArr1[]=new int[N];
        float f=-49.209F;

        FuzzerUtils.init(iArr1, -1);

        i9 = 122;
        while (--i9 > 0) {
            iArr1[i9] ^= (int)Test.instanceCount;
            f *= Test.instanceCount;
            f = -1;
            Test.instanceCount += (long)(2.13F + (i9 * i9));
            i10 = 1;
            do {
                i8 *= i10;
            } while ((i10 += 2) < 13);
            i7 -= (int)f;
            for (i11 = 1; i11 < 13; i11++) {
                i8 = i12;
                Test.instanceCount -= 12400;
            }
        }
        i13 = 1;
        do {
            for (i14 = 1; i14 < 6; i14++) {
                i7 = i16;
                i7 += (int)Test.instanceCount;
            }
        } while (++i13 < 285);
        long meth_res = i7 + i8 + i9 + Float.floatToIntBits(f) + i10 + i11 + i12 + i13 + i14 + i15 + i16 +
            FuzzerUtils.checkSum(iArr1);
        dMeth1_check_sum += meth_res;
        return (double)meth_res;
    }

    public static double dMeth(int i6) {

        double d=-97.3224;
        byte by=101;
        int i17=-3, i18=84, i19=129, i20=-1, i21=55143, iArr2[]=new int[N];
        float f1=127.828F;

        FuzzerUtils.init(iArr2, -61578);

        d += ((Test.instanceCount - (i6 - by)) + dMeth1(i6, i6));
        i6 -= -25457;
        for (i17 = 6; i17 < 208; i17++) {
            d = i17;
            iArr2[i17] *= by;
            for (i19 = 1; i19 < 8; ++i19) {
                i20 = (int)Test.instanceCount;
                try {
                    i6 = (iArr2[i19 + 1] / i19);
                    iArr2[(i6 >>> 1) % N] = (iArr2[i17] % -246);
                    iArr2[i19 + 1] = (i20 % -5);
                } catch (ArithmeticException a_e) {}
                Test.iArrFld[i19 - 1] = 31327;
                i20 += i19;
                i6 |= (int)Test.instanceCount;
                i21 = 2;
                while (--i21 > 0) {
                    i18 = 1;
                    f1 += (10 + (i21 * i21));
                    Test.iArrFld[i19 + 1] *= i17;
                }
            }
        }
        long meth_res = i6 + Double.doubleToLongBits(d) + by + i17 + i18 + i19 + i20 + i21 + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(iArr2);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth(int i, int i1) {

        int i2=-11, i3=-9, i4=37719, i5=52341, i22=-59483, i23=-45670, iArr[]=new int[N];
        short s=7668;
        byte by1=-127;

        FuzzerUtils.init(iArr, -207);

        try {
            for (i2 = 15; i2 < 342; ++i2) {
                for (i4 = 1; i4 < 5; ++i4) {
                    switch (((i2 % 2) * 5) + 35) {
                    case 45:
                        if (Test.bFld) {
                            switch (((i2 % 6) * 5) + 40) {
                            case 41:
                                i1 = iArr[i4 - 1];
                                break;
                            case 56:
                                iArr[i2 + 1] = (int)(s * dMeth(i2));
                                i1 *= i3;
                                break;
                            case 67:
                                Test.fFld -= 2172;
                                for (i22 = i2; i22 < 2; i22++) {
                                    i <<= 11;
                                    by1 = (byte)i;
                                }
                                if (i2 != 0) {
                                    vMeth_check_sum += i + i1 + i2 + i3 + i4 + i5 + s + i22 + i23 + by1 +
                                        FuzzerUtils.checkSum(iArr);
                                    return;
                                }
                                i3 += i4;
                            case 58:
                                Test.instanceCount += (i4 + i23);
                                break;
                            case 47:
                                i3 = (int)Test.instanceCount;
                                break;
                            case 48:
                                Test.iArrFld1[i4 + 1] <<= (int)2058775637806029053L;
                                break;
                            }
                        } else {
                            i23 = i4;
                            vMeth_check_sum += i + i1 + i2 + i3 + i4 + i5 + s + i22 + i23 + by1 +
                                FuzzerUtils.checkSum(iArr);
                            return;
                        }
                        break;
                    case 41:
                        i = i3;
                        break;
                    }
                }
            }
        }
        catch (NullPointerException exc1) {
            Test.fFld *= Test.fFld;
        }
        vMeth_check_sum += i + i1 + i2 + i3 + i4 + i5 + s + i22 + i23 + by1 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i24=18918, i25=14431, i26=-180, i27=-9, i28=-20290, i29=11, i30=-121, i31=-5;
        double d1=1.72011;
        short s1=24386;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -92L);

        vMeth(Test.iFld, Test.iFld);
        lArr[(Test.iFld >>> 1) % N] = Test.instanceCount;
        Test.fFld -= lFld;
        i24 = 1;
        do {
            for (i25 = 146; i25 > i24; i25--) {
                Test.fFld = Test.instanceCount;
                if (Test.bFld) continue;
                for (i27 = 1; i27 < 1; i27 += 2) {
                    i26 -= (int)Test.fFld;
                    d1 = -15244;
                    switch ((i27 % 1) + 59) {
                    case 59:
                        Test.iFld += 9;
                    }
                }
                Test.iFld *= (int)d1;
                i26 = (int)lFld;
                if (Test.bFld) break;
                lFld1 -= -13734;
                lFld = i28;
                for (i29 = 1; i29 < 1; i29++) {
                    byte by2=127;
                    lFld = i27;
                    i28 += (int)8321755349039347483L;
                    Test.fFld += -22;
                    i30 += (int)Test.fFld;
                    i26 = 12;
                    s1 |= (short)-49185;
                    i26 += by2;
                    lFld += 19063;
                    i31 += (((i29 * Test.instanceCount) + i31) - i29);
                }
                try {
                    Test.iArrFld1[i25] = (i31 % Test.iArrFld[i24]);
                    Test.iArrFld[i25 + 1] = (i30 % 885);
                    i31 = (i30 % -18922);
                } catch (ArithmeticException a_e) {}
            }
            Test.instanceCount = -252;
            i31 += (int)8181434894940056855L;
        } while (++i24 < 172);


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
//DEBUG  dMeth ->  dMeth vMeth mainTest
//DEBUG  dMeth1 ->  dMeth1 dMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
