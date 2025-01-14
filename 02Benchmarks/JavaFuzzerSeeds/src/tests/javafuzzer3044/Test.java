package tests.javafuzzer3044;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 01:13:53 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=5929916310240722484L;
    public static volatile boolean bFld=false;
    public static volatile double dFld=56.38767;
    public byte byFld=-114;
    public static int iArrFld[]=new int[N];
    public float fArrFld[]=new float[N];
    public static volatile double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 22);
        FuzzerUtils.init(Test.dArrFld, 0.50678);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static double dMeth(int i1) {

        float f=113.301F;
        int i2=-118, i3=-11, i4=192, i5=-5, i6=-10231;
        long l1=185L;
        double d1=-19.27588;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)23618);

        for (f = 214; f > 3; f--) {
            short s=17287;
            switch ((((i2 >>> 1) % 7) * 5) + 8) {
            case 27:
                Test.instanceCount += i2;
                Test.instanceCount = -1;
                i2 += 131;
                break;
            case 37:
                if (Test.bFld) continue;
                i3 += (int)(f - Test.instanceCount);
                i2 = (int)f;
                for (l1 = 1; l1 < 8; l1++) {
                    i2 = (int)f;
                }
                break;
            case 43:
                s = (short)f;
                for (i5 = 8; i5 > 1; i5--) {
                    i4 = i3;
                    Test.instanceCount += (i5 + i3);
                    i6 = (int)l1;
                }
                break;
            case 22:
                i2 >>= i6;
                break;
            case 15:
                i4 += (int)((long)f ^ i3);
            case 36:
                d1 -= l1;
            case 28:
                sArr[(int)(f + 1)] &= (short)i6;
                break;
            }
        }
        long meth_res = i1 + Float.floatToIntBits(f) + i2 + i3 + l1 + i4 + i5 + i6 + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(sArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth1(int i) {

        double d=1.127731;
        int i7=-245, i8=-14, i9=40773, i10=10, i11=-10, i12=-238;
        long l2=213L;

        i <<= (int)(((++Test.instanceCount) % ((-53232 * (i--)) | 1)) * (d = (i - i)));
        i -= (int)(-106.7012 - dMeth(i));
        for (i7 = 2; 140 > i7; ++i7) {
            if (Test.bFld) {
                for (i9 = i7; i9 < 11; i9++) {
                    Test.iArrFld[i9 + 1] = i9;
                    Test.iArrFld[i7] += (int)Test.instanceCount;
                    i10 *= i;
                    i8 += (int)l2;
                    for (i11 = i9; i11 < 1; i11++) {
                        Test.instanceCount = i11;
                        i12 = i8;
                        Test.iArrFld[i9] = i8;
                        i10 += (int)d;
                        if (Test.bFld) break;
                    }
                }
            } else if (Test.bFld) {
                Test.iArrFld[i7] = (int)2255863019L;
            } else {
                i12 += (int)Test.instanceCount;
            }
        }
        vMeth1_check_sum += i + Double.doubleToLongBits(d) + i7 + i8 + i9 + i10 + l2 + i11 + i12;
    }

    public void vMeth(long l) {

        int i13=-13, i14=-5, i15=247, i16=-37, i17=12, i18=12;
        long l3=228L, lArr[]=new long[N];
        float f1=-1.204F;

        FuzzerUtils.init(lArr, -253L);

        vMeth1(i13);
        fArrFld[(i13 >>> 1) % N] += l;
        i13 <<= (int)l;
        for (i14 = 13; i14 < 337; ++i14) {
            Test.dFld *= i13;
            lArr[i14 + 1] = i15;
            switch (((i14 % 10) * 5) + 69) {
            case 71:
                l *= l3;
            case 93:
                for (i16 = 1; i16 < 5; ++i16) {
                    switch (((i16 % 1) * 5) + 4) {
                    case 5:
                        Test.dFld = i17;
                        Test.iArrFld[i14] -= i14;
                        break;
                    }
                    Test.iArrFld[i14] = i15;
                    i15 = (int)-5832020218934070601L;
                    Test.dFld = i15;
                }
                break;
            case 115:
                i15 -= i18;
                break;
            case 85:
                l3 += (i14 * i15);
            case 99:
            case 114:
                Test.dFld -= i15;
                break;
            case 87:
                i13 = i14;
            case 113:
                if (Test.bFld) break;
                break;
            case 77:
                f1 *= i18;
            case 116:
                Test.dFld = Test.instanceCount;
                break;
            }
        }
        vMeth_check_sum += l + i13 + i14 + i15 + l3 + i16 + i17 + i18 + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        long l4=-7L, lArr1[]=new long[N];
        int i19=223, i20=18, i21=-1, i22=46, i23=190, i24=244, i25=-11936, i26=-19306, i27=4349, i28=233;
        short s1=-4661;
        float f2=50.112F;

        FuzzerUtils.init(lArr1, -8741459709701235133L);

        vMeth(l4);
        for (i19 = 4; 195 > i19; i19++) {
            switch (((i19 >>> 1) % 2) + 105) {
            case 105:
                i20 += (i19 * i19);
                for (i21 = 7; 131 > i21; i21++) {
                    l4 -= s1;
                    for (i23 = i21; i23 < 2; i23++) {
                        i20 -= i20;
                        try {
                            i22 = (-180736267 / i23);
                            i22 = (Test.iArrFld[i23] % 1209205920);
                            i22 = (i19 / 132);
                        } catch (ArithmeticException a_e) {}
                    }
                    Test.bFld = Test.bFld;
                }
            case 106:
                for (i25 = 8; 131 > i25; ++i25) {
                    for (i27 = 1; i27 < 2; ++i27) {
                        if (Test.bFld) {
                            f2 += (i27 * i27);
                            i20 = (int)Test.instanceCount;
                            switch ((((-1370 >>> 1) % 8) * 5) + 94) {
                            case 116:
                                i24 -= i28;
                                lArr1[i25] -= -1162282846L;
                                Test.dFld = i25;
                                try {
                                    i26 = (-8 % i19);
                                    i22 = (Test.iArrFld[i19] % -59888);
                                    Test.iArrFld[i25 + 1] = (180 / i20);
                                } catch (ArithmeticException a_e) {}
                                break;
                            case 126:
                                Test.iArrFld[i19] -= (int)-4219512830L;
                                Test.dArrFld[i27] += byFld;
                                i20 %= (int)(i26 | 1);
                                break;
                            case 107:
                                switch (((i21 >>> 1) % 2) + 117) {
                                case 117:
                                    i24 += i20;
                                    i20 = (int)Test.instanceCount;
                                    break;
                                case 118:
                                    l4 *= Test.instanceCount;
                                    Test.bFld = Test.bFld;
                                    l4 = i23;
                                }
                                i20 <<= (int)l4;
                                break;
                            case 109:
                                Test.instanceCount += i27;
                            case 122:
                                Test.iArrFld[i19 - 1] = i22;
                                break;
                            case 103:
                                i26 = i19;
                            case 124:
                                i26 = (int)Test.instanceCount;
                            case 112:
                                i26 += i19;
                            }
                        } else {
                            Test.dFld = i23;
                        }
                    }
                }
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  dMeth ->  dMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
