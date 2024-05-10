package tests.javafuzzer2615;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 17:30:39 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2L;
    public static boolean bFld=false;
    public volatile short sFld=-16969;
    public static volatile float fFld=-1.469F;
    public static double dFld=-1.24585;
    public static int iArrFld[]=new int[N];
    public float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 9);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i9) {

        int i12=-204, i13=0, i14=232, iArr1[]=new int[N];
        boolean b=true;
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr1, -224);
        FuzzerUtils.init(fArr, 0.392F);

        for (int i10 : iArr1) {
            i10 *= (int)Test.instanceCount;
            iArr1[(i9 >>> 1) % N] &= i10;
            fArr[(i10 >>> 1) % N] += i9;
            i9 = i9;
            for (i12 = 1; i12 < 4; ++i12) {
                if (b) {
                    i13 = (int)104.77480;
                    if (b) continue;
                    i10 = i13;
                    i13 = i10;
                } else {
                    if (true) break;
                    i14 = 2;
                    while (--i14 > 0) {
                        iArr1[i12] >>= i13;
                        Test.instanceCount = i12;
                    }
                }
            }
        }
        vMeth_check_sum += i9 + i12 + i13 + (b ? 1 : 0) + i14 + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth1(int i6, double d1, float f1) {

        int i7=51, i8=7, i15=64, i16=0, iArr2[]=new int[N];
        float f2=-2.393F;
        byte by=7;
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr2, 14610);
        FuzzerUtils.init(sArr, (short)-23985);

        for (i7 = 230; i7 > 2; i7--) {
            vMeth(i7);
            i6 <<= 108;
            switch ((i7 % 6) + 36) {
            case 36:
                Test.instanceCount += (i7 + i8);
                iArr2[i7 + 1] = (int)Test.instanceCount;
                Test.bFld = Test.bFld;
                iArr2[i7 - 1] *= i6;
                break;
            case 37:
                f2 = 1;
                while (++f2 < 7) {
                    for (i15 = (int)(f2); i15 < 1; i15++) {
                        i8 *= (int)Test.instanceCount;
                        Test.instanceCount = i16;
                        i6 += (((i15 * f2) + i8) - i15);
                        i6 = i15;
                        by = (byte)Test.instanceCount;
                    }
                }
            case 38:
                iArr2[(i6 >>> 1) % N] ^= i6;
                break;
            case 39:
                i8 += (((i7 * Test.instanceCount) + f2) - Test.instanceCount);
                break;
            case 40:
                i8 += (((i7 * i16) + i7) - Test.instanceCount);
                break;
            case 41:
            }
        }
        long meth_res = i6 + Double.doubleToLongBits(d1) + Float.floatToIntBits(f1) + i7 + i8 +
            Float.floatToIntBits(f2) + i15 + i16 + by + FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(sArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(long l, int i2, long l1) {

        int i3=-21366, i4=14, i5=5, i18=-5;
        float f=32.841F, fArr1[][]=new float[N][N];
        double d=-70.46696, d2=101.16707;

        FuzzerUtils.init(fArr1, 1.433F);

        i2 = (int)l1;
        i2 = i2;
        for (i3 = 21; i3 < 393; i3++) {
            for (f = 5; f > 1; --f) {
                int i17=-1;
                d += iMeth1(i17, d2, f);
                i5 = i4;
                i18 = 2;
                do {
                    i2 = i2;
                    l += (((i18 * i17) + l1) - f);
                    i2 += (((i18 * i4) + l1) - i17);
                    l1 += i17;
                    if (Test.bFld) {
                        fArr1[(int)(f)][i18 + 1] -= i18;
                        Test.iArrFld[(int)(f)] >>= 12;
                    } else if (Test.bFld) {
                        i5 = i5;
                    } else {
                        i2 = 36160;
                    }
                } while ((i18 -= 2) > 0);
            }
        }
        long meth_res = l + i2 + l1 + i3 + i4 + Float.floatToIntBits(f) + i5 + Double.doubleToLongBits(d) +
            Double.doubleToLongBits(d2) + i18 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=195, i1=-226, i19=3, iArr[]=new int[N];
        double d3=98.14023;
        float f3=1.75F;
        long l2=-3149586998L, lArr[]=new long[N];
        byte by1=-52;
        short s1=-29934;

        FuzzerUtils.init(iArr, 2);
        FuzzerUtils.init(lArr, -7L);

        for (i = 1; i < 250; i++) {
            try {
                iArr[i] = (-205 % i1);
                i1 = (-2098549294 % i1);
                i1 = (i % i1);
            } catch (ArithmeticException a_e) {}
            switch (((i % 7) * 5) + 31) {
            case 60:
                i1 >>>= (((i1 <<= -12) + (i & 165)) - (iMeth(Test.instanceCount, i, Test.instanceCount) % (i1 | 1)));
            case 32:
                sFld += (short)(i * i);
                Test.fFld += Test.instanceCount;
                lArr = lArr;
                Test.instanceCount = Test.instanceCount;
                break;
            case 65:
                try {
                    i1 = (i / i);
                    iArr[i] = (-109 / i1);
                    i1 = (Test.iArrFld[i + 1] % i1);
                } catch (ArithmeticException a_e) {}
                break;
            case 57:
                i1 = i1;
                for (d3 = i; d3 < 101; ++d3) {
                    i1 -= i1;
                    i19 *= (int)Test.instanceCount;
                    f3 = 1;
                    while (++f3 < 1) {
                        i1 = -29110;
                        Test.bFld = Test.bFld;
                        switch (((i % 10) * 5) + 19) {
                        case 55:
                            i1 += i1;
                            Test.iArrFld[(int)(f3 - 1)] += (int)f3;
                        case 49:
                            if (Test.bFld) continue;
                            Test.iArrFld[(int)(f3)] -= (int)d3;
                            Test.dFld += Test.dFld;
                            break;
                        case 56:
                        case 22:
                            Test.iArrFld[i] = (int)-1.324F;
                            break;
                        case 28:
                            Test.dFld *= f3;
                            try {
                                i19 = (-31506 % i19);
                                i19 = (i / i);
                                i1 = (i / i19);
                            } catch (ArithmeticException a_e) {}
                            lArr[(int)(d3 + 1)] += i;
                            break;
                        case 36:
                            fArrFld[(int)(f3)] *= 34444;
                        case 34:
                            l2 ^= by1;
                            Test.instanceCount -= i1;
                            Test.bFld = Test.bFld;
                            break;
                        case 48:
                            i1 = i;
                            break;
                        case 41:
                            s1 /= (short)1.862F;
                            break;
                        case 33:
                            i19 *= i19;
                            break;
                        }
                    }
                }
                break;
            case 45:
                i19 += (((i * i1) + l2) - i);
                break;
            case 44:
                i19 = i;
                break;
            case 66:
                Test.instanceCount += (((i * Test.instanceCount) + i) - by1);
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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}