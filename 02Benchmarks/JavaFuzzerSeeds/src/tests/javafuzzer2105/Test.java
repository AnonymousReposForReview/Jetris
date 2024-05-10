package tests.javafuzzer2105;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 09:08:06 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2507496372L;
    public static boolean bFld=true;
    public static byte byFld=47;
    public static volatile float fFld=0.84F;
    public short sFld=3769;
    public volatile int iFld=-9;

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1() {

        int i4=-19870, i5=45192, i6=-210, i7=-5105, i8=2599;
        double d=2.99064, d1=0.69223;
        short s=-32079;

        for (i4 = 18; i4 < 344; ++i4) {
            i5 += (i4 * i4);
            d += -9066284636213798969L;
            d = s;
            i5 += i4;
            i5 = (int)Test.instanceCount;
            i5 += i4;
            for (d1 = 5; d1 > 1; d1--) {
                for (i7 = i4; i7 < 2; ++i7) {
                    if (Test.bFld) continue;
                    i5 -= i7;
                    Test.instanceCount += 4452L;
                    Test.instanceCount += -29326;
                    d *= Test.instanceCount;
                    i6 = i5;
                }
            }
        }
        long meth_res = i4 + i5 + Double.doubleToLongBits(d) + s + Double.doubleToLongBits(d1) + i6 + i7 + i8;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i, int i1) {

        int i2=2, i3=21961, i9=-11, i10=0, i11=-31926, i12=6;
        float f=1.36F;
        double d2=0.26466;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, 62923L);

        for (i2 = 11; i2 < 392; ++i2) {
            i *= (int)(((i2 + i2) - f) + (iMeth1() * -48341));
            if (false) break;
        }
        for (i9 = 4; 149 > i9; i9++) {
            short s1=6041;
            if (i2 != 0) {
            }
            i3 >>= i1;
            i10 *= (int)d2;
            if (Test.bFld) break;
            if (Test.bFld) {
                for (i11 = 1; i11 < 11; i11++) {
                    f = i1;
                    if (i2 != 0) {
                    }
                    lArr[i11 + 1][i11] = (long)f;
                    i3 += (i11 ^ i9);
                    Test.instanceCount = i3;
                }
            } else if (Test.bFld) {
                f += i3;
            } else if (Test.bFld) {
                d2 += s1;
            } else {
                i12 += (-3014 + (i9 * i9));
            }
        }
        long meth_res = i + i1 + i2 + i3 + Float.floatToIntBits(f) + i9 + i10 + Double.doubleToLongBits(d2) + i11 + i12
            + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(long l) {

        int i13=21066, i14=-60808, i15=-57539, i16=-26308, i17=-188, i18=-973, i19=-57, i20=0, iArr[]=new int[N];
        double d3=124.11003;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr, 208);
        FuzzerUtils.init(lArr1, -7233623961447672344L);

        Test.instanceCount &= Math.max(iMeth(i13, i13), i13);
        l += Test.byFld;
        iArr[(i13 >>> 1) % N] = i13;
        for (i14 = 13; i14 < 375; i14++) {
            for (i16 = i14; i16 < 5; i16++) {
                lArr1[i14 + 1] += i16;
            }
            d3 *= 11700;
            i18 = 5;
            do {
                Test.bFld = false;
                for (i19 = 1; 2 > i19; ++i19) {
                    i15 += Test.byFld;
                    i15 *= i16;
                }
            } while ((i18 -= 2) > 0);
            Test.fFld *= i16;
            i13 *= (int)l;
            d3 += -22439;
        }
        vMeth_check_sum += l + i13 + i14 + i15 + i16 + i17 + Double.doubleToLongBits(d3) + i18 + i19 + i20 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr1);
    }

    public void mainTest(String[] strArr1) {

        double d4=-16.49900, d5=80.96342;
        int i21=179, i22=65457, i23=-46733, i24=2, i25=-107, i26=1875, i27=10, i28=0, iArr1[][]=new int[N][N];
        long lArr2[]=new long[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr1, -6633);
        FuzzerUtils.init(lArr2, -419757183243176899L);
        FuzzerUtils.init(fArr, 2.192F);

        vMeth(-27707L);
        Test.fFld = sFld;
        iFld -= (int)Test.instanceCount;
        if (Test.bFld) {
            for (d4 = 2; d4 < 232; ++d4) {
                try {
                    iFld = (652 % iFld);
                    i21 = (iFld / iFld);
                    i21 = (122265258 % iArr1[(int)(d4)][(int)(d4)]);
                } catch (ArithmeticException a_e) {}
                Test.instanceCount += (long)(((d4 * iFld) + Test.instanceCount) - i21);
                Test.fFld += (float)(((d4 * iFld) + Test.instanceCount) - Test.fFld);
                i22 = 109;
                do {
                    lArr2[i22 - 1] += Test.byFld;
                    Test.instanceCount += (long)2.786F;
                    try {
                        iArr1[i22][i22] = (53316 % iArr1[i22 - 1][(int)(d4)]);
                        i21 = (iFld % iFld);
                        iFld = (i21 / iFld);
                    } catch (ArithmeticException a_e) {}
                    Test.instanceCount += i22;
                    iArr1[i22][i22 + 1] = Test.byFld;
                } while (--i22 > 0);
                Test.instanceCount -= iFld;
                fArr[(int)(d4)] *= -10L;
                iFld += iFld;
                Test.instanceCount = (long)Test.fFld;
            }
            d5 /= (i21 | 1);
            for (i23 = 6; i23 < 199; i23++) {
                if (Test.bFld) {
                    i21 += (i23 + Test.instanceCount);
                    for (i25 = 3; i25 < 130; i25++) {
                        Test.instanceCount = i25;
                        for (i27 = 1; i27 < 2; ++i27) {
                            if (Test.bFld) {
                                Test.fFld += (((i27 * Test.fFld) + iFld) - Test.fFld);
                                i26 += i23;
                            } else {
                                Test.instanceCount += (i27 | i24);
                                fArr = FuzzerUtils.float1array(N, (float)-42.41F);
                            }
                        }
                    }
                } else {
                    iArr1[i23 - 1][i23 - 1] = (int)Test.instanceCount;
                }
            }
        } else if (Test.bFld) {
            iArr1 = FuzzerUtils.int2array(N, (int)-211);
        } else {
            d5 -= i22;
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
