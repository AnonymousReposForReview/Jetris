package tests.javafuzzer2696;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 18:49:27 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-3280801288L;
    public static boolean bFld=true;
    public static float fFld=1.872F;
    public static double dFld=15.116935;
    public static volatile float fArrFld[]=new float[N];
    public static byte byArrFld[]=new byte[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, -2.179F);
        FuzzerUtils.init(Test.byArrFld, (byte)82);
        FuzzerUtils.init(Test.iArrFld, -180);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1() {

        int i5=7, i6=9, i7=82, i8=-2, i9=9868, iArr[]=new int[N];
        double d1=-21.57391;
        float f1=0.316F, fArr[]=new float[N];

        FuzzerUtils.init(iArr, -4);
        FuzzerUtils.init(fArr, 81.630F);

        for (i5 = 7; 350 > i5; ++i5) {
            for (i7 = 1; i7 < 5; i7 += 3) {
                Test.bFld = Test.bFld;
                iArr[i5] %= (int)(i8 | 1);
                Test.bFld = Test.bFld;
                Test.instanceCount += -3906802411L;
                switch (((i7 % 2) * 5) + 43) {
                case 46:
                    i6 += (i7 * i7);
                    fArr[i5] -= i8;
                    Test.instanceCount -= 12;
                    break;
                case 48:
                    for (d1 = 1; d1 < 5; d1++) {
                        f1 += Test.instanceCount;
                        i6 += (int)(d1 * d1);
                        Test.instanceCount = i5;
                        i6 *= (int)d1;
                    }
                    break;
                }
            }
        }
        long meth_res = i5 + i6 + i7 + i8 + Double.doubleToLongBits(d1) + i9 + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(long l, double d) {

        int i3=49616, i4=-12, i10=52063, i11=37896, i12=9, i13=-119, i14=127, iArr1[]=new int[N];
        short s=2500;

        FuzzerUtils.init(iArr1, -23261);

        for (i3 = 8; 133 > i3; i3++) {
            l -= Integer.reverseBytes(iMeth1() - i4);
            i4 *= i4;
            Test.instanceCount ^= i4;
        }
        Test.instanceCount = (long)d;
        i10 = 138;
        do {
            for (i11 = 1; i11 < 11; ++i11) {
                i4 += i4;
                if (Test.bFld) {
                    for (i13 = 1; 2 > i13; ++i13) {
                        Test.fFld += i3;
                        i14 = i14;
                        i14 += (14 + (i13 * i13));
                        s *= (short)i12;
                        Test.instanceCount += (((i13 * i13) + i13) - Test.instanceCount);
                    }
                } else if (Test.bFld) {
                    try {
                        iArr1[i11 + 1] = (i12 % iArr1[i10 - 1]);
                        iArr1[i10] = (i3 % iArr1[i11]);
                        i4 = (i11 % 69);
                    } catch (ArithmeticException a_e) {}
                }
            }
        } while (--i10 > 0);
        long meth_res = l + Double.doubleToLongBits(d) + i3 + i4 + i10 + i11 + i12 + i13 + i14 + s +
            FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i1, float f) {

        int i2=-81, i15=-1, i16=-1400, i17=-5, i18=1395, iArr2[]=new int[N];
        byte by=-53;
        short s1=25248;

        FuzzerUtils.init(iArr2, -140);

        i2 = ((iMeth(Test.instanceCount, Test.dFld) - i1) % (i1 | 1));
        i1 = (int)Test.instanceCount;
        by += (byte)i1;
        i1 = (int)Test.instanceCount;
        Test.dFld -= f;
        i2 -= i2;
        i1 += (int)f;
        for (i15 = 5; i15 < 370; ++i15) {
            iArr2[i15] = (int)Test.dFld;
            i1 -= i2;
            Test.instanceCount += (long)Test.dFld;
            Test.fArrFld[i15 - 1] = s1;
            for (i17 = 1; 5 > i17; ++i17) {
                s1 += (short)i17;
                Test.instanceCount = -8;
            }
        }
        vMeth_check_sum += i1 + Float.floatToIntBits(f) + i2 + by + i15 + i16 + s1 + i17 + i18 +
            FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i=217, i19=13713, i20=229, i21=14, i22=-8328, i23=14;
        double d2=0.92609, dArr[]=new double[N];
        short s2=-474;
        byte by1=111;

        FuzzerUtils.init(dArr, -2.10533);

        Test.instanceCount += (i >> (++i));
        vMeth(i, Test.fFld);
        for (i19 = 2; 151 > i19; ++i19) {
            switch ((i19 % 9) + 47) {
            case 47:
                Test.byArrFld[i19] -= (byte)i;
                switch ((i19 % 1) + 50) {
                case 50:
                    i -= i19;
                    Test.fFld *= i;
                    try {
                        i20 = (i / i19);
                        i = (-105 / i);
                        i20 = (i / -62683);
                    } catch (ArithmeticException a_e) {}
                    i = i20;
                    break;
                default:
                    Test.instanceCount += i20;
                }
                break;
            case 48:
                i21 = 168;
                while (--i21 > 0) {
                    Test.iArrFld[i19 + 1] -= (int)Test.instanceCount;
                    i20 += (i21 - Test.instanceCount);
                    i20 += (int)Test.dFld;
                    i20 = i20;
                }
                break;
            case 49:
                for (d2 = 6; d2 < 168; d2 += 3) {
                    i23 = 4;
                    while (--i23 > 0) {
                        Test.fFld += i;
                    }
                    s2 += (short)i;
                    switch ((i19 % 3) + 91) {
                    case 91:
                        switch ((int)((d2 % 2) + 93)) {
                        case 93:
                            dArr[(int)(d2)] += -97;
                            by1 -= (byte)i21;
                            Test.instanceCount = -34065;
                        case 94:
                            s2 = (short)i23;
                            i20 = (int)Test.instanceCount;
                            break;
                        default:
                            i = (int)Test.instanceCount;
                            if (Test.bFld) continue;
                        }
                        i22 >>= i;
                        break;
                    case 92:
                        Test.fFld += (float)(d2 * d2);
                        break;
                    case 93:
                    default:
                        Test.iArrFld[i19] += 39499;
                    }
                }
                break;
            case 50:
                Test.instanceCount += (-31956 + (i19 * i19));
                break;
            case 51:
                try {
                    i22 = (Test.iArrFld[i19] / i23);
                    Test.iArrFld[i19 - 1] = (Test.iArrFld[i19] % i22);
                    i22 = (123 / i19);
                } catch (ArithmeticException a_e) {}
                break;
            case 52:
                Test.iArrFld[i19 - 1] += (int)Test.instanceCount;
                break;
            case 53:
                Test.instanceCount = i22;
                break;
            case 54:
                i += (i19 ^ i21);
                break;
            case 55:
                i20 = 125;
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
