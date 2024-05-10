package tests.javafuzzer586;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 06:14:32 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=4458417352371933613L;
    public static boolean bFld=false;
    public static volatile double dFld=-114.85392;
    public static int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, -12);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(long l1, float f, long l2) {

        double d=-89.94707;
        int i7=9, i8=-64, i9=240, i10=-4, i11=-75, iArr[]=new int[N], iArr1[]=new int[N];
        byte by=-86;

        FuzzerUtils.init(iArr, -2);
        FuzzerUtils.init(iArr1, 51869);

        Test.instanceCount -= (long)d;
        iArr[(i7 >>> 1) % N] = (int)l2;
        i7 = i7;
        Test.bFld = Test.bFld;
        i8 = 1;
        do {
            i7 += i7;
            l1 *= (long)f;
            i9 = 1;
            while (++i9 < 7) {
                for (i10 = 1; i10 > i9; i10 -= 2) {
                    by *= (byte)i8;
                    iArr[i8 + 1] ^= (int)l2;
                    iArr1[i8] -= i9;
                }
                l2 *= i9;
                if (Test.bFld) continue;
                i7 = -39376;
            }
        } while (++i8 < 232);
        long meth_res = l1 + Float.floatToIntBits(f) + l2 + Double.doubleToLongBits(d) + i7 + i8 + i9 + i10 + i11 + by
            + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1(long l) {

        int i6=-223, i12=-2, i13=6349, i14=-153, i15=41885, i16=11, i17=0, i18=-133;
        float f1=-1.481F;
        byte byArr[]=new byte[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(byArr, (byte)22);
        FuzzerUtils.init(dArr, -2.205);

        i6 >>= (int)(lMeth(Test.instanceCount, f1, l) - i6);
        for (byte by1 : byArr) {
            Test.iArrFld[(i6 >>> 1) % N][(i6 >>> 1) % N] *= i6;
            i6 -= 2;
            i6 += i6;
            i6 += (int)Test.instanceCount;
            dArr[(i6 >>> 1) % N] -= Test.instanceCount;
            Test.bFld = Test.bFld;
        }
        for (i12 = 1; i12 < 295; ++i12) {
            for (i14 = 6; i14 > 1; --i14) {
                i15 += i16;
                Test.instanceCount -= -3;
                for (i17 = 1; i17 < 2; ++i17) {
                    i18 *= -19;
                    try {
                        i6 = (i13 % -152);
                        i16 = (i17 % i14);
                        Test.iArrFld[i17][i12] = (i18 % i13);
                    } catch (ArithmeticException a_e) {}
                }
            }
        }
        vMeth1_check_sum += l + i6 + Float.floatToIntBits(f1) + i12 + i13 + i14 + i15 + i16 + i17 + i18 +
            FuzzerUtils.checkSum(byArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth(int i, int i1) {

        int i2=27962, i3=228, i4=-92, i5=-57974, i19=6, i20=-13, i21=132, iArr2[]=new int[N];
        double d1=0.49449, d2=0.17837;
        float f2=-76.825F;

        FuzzerUtils.init(iArr2, 0);

        for (i2 = 9; i2 < 298; i2++) {
            for (i4 = 1; i4 < 6; i4++) {
                vMeth1(Test.instanceCount);
            }
            Test.instanceCount -= i;
            if (Test.bFld) {
                iArr2[i2] += (int)Test.instanceCount;
            } else {
                i5 += i;
                for (d1 = 1; d1 < 6; d1++) {
                    f2 += (float)1.72711;
                    switch ((int)((d1 % 1) + 110)) {
                    case 110:
                        for (i20 = 1; i20 < 2; ++i20) {
                            i += i20;
                            i21 = -6;
                            d2 /= -7063618905244350217L;
                            Test.iArrFld[(int)(d1)][i2] = -51;
                        }
                    }
                }
            }
        }
        vMeth_check_sum += i + i1 + i2 + i3 + i4 + i5 + Double.doubleToLongBits(d1) + i19 + Float.floatToIntBits(f2) +
            i20 + i21 + Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i22=-4, i23=237, i25=-86, i26=-43740, i27=112, i28=35157, iArr3[]=new int[N];
        short s=-14793;

        FuzzerUtils.init(iArr3, -2);

        if (Test.bFld) {
            vMeth(i22, i22);
            Test.dFld -= Test.dFld;
        }
        i22 = i22;
        i22 *= 242;
        i23 = 291;
        while ((i23 -= 3) > 0) {
            if (Test.bFld) continue;
            Test.bFld = Test.bFld;
            Test.instanceCount *= i22;
            Test.instanceCount = i22;
            i22 += (((i23 * i22) + Test.instanceCount) - s);
            if (Test.bFld) {
                iArr3[i23] = i22;
                for (i25 = 15; i25 < 258; ++i25) {
                    i26 *= (int)Test.instanceCount;
                    Test.instanceCount <<= Test.instanceCount;
                    Test.dFld = i22;
                    if (Test.bFld) break;
                    i26 += i25;
                    i22 += (((i25 * i25) + i22) - i22);
                    for (i27 = 1; 2 > i27; ++i27) {
                        switch (((i25 % 5) * 5) + 59) {
                        case 70:
                            Test.instanceCount -= (long)Test.dFld;
                            i26 = s;
                            try {
                                Test.iArrFld[i27][i25 - 1] = (2089036096 % i26);
                                i22 = (1696628919 / i22);
                                i28 = (-183 / i28);
                            } catch (ArithmeticException a_e) {}
                            Test.instanceCount -= -44597;
                            break;
                        case 64:
                            i22 = 219;
                            break;
                        case 63:
                        case 62:
                            i22 >>= i25;
                            Test.instanceCount = i26;
                        case 74:
                            Test.iArrFld[i27 - 1][i27] *= i25;
                            break;
                        }
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
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
