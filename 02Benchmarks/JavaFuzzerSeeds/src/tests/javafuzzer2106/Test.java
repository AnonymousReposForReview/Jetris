package tests.javafuzzer2106;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 09:08:08 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-14L;
    public static boolean bFld=false;
    public volatile float fFld=-102.690F;
    public volatile int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 164043125L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i5) {

        int i6=-4, i7=-9, iArr1[][]=new int[N][N];
        short s=390;
        double d1=2.59359;
        float f=0.279F;
        boolean b=true, bArr[]=new boolean[N];
        long lArr1[][]=new long[N][N];

        FuzzerUtils.init(lArr1, -2870115735L);
        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(iArr1, -61890);

        i6 = 1;
        while (++i6 < 238) {
            s %= (short)-130;
            d1 += i5;
            i5 = (int)Test.instanceCount;
            i5 += (((i6 * Test.instanceCount) + f) - Test.instanceCount);
            i7 = 7;
            while ((i7 -= 3) > 0) {
                b = b;
                lArr1[i6 - 1][i6 - 1] += i6;
                i5 += (9 + (i7 * i7));
                bArr[i6 - 1] = true;
                if (b) {
                    i5 = i5;
                } else if (b) {
                    iArr1[i7 - 1][i6 + 1] = (int)f;
                    i5 >>= i5;
                    i5 >>= i6;
                } else if (b) {
                    d1 = i6;
                } else {
                    i5 = (int)76.642;
                }
            }
        }
        vMeth1_check_sum += i5 + i6 + s + Double.doubleToLongBits(d1) + Float.floatToIntBits(f) + i7 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i2, int i3, long l) {

        int i4=64, iArr[]=new int[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -124L);
        FuzzerUtils.init(iArr, -179);

        lArr[(i3 >>> 1) % N] -= ((i3 % ((-(-(i4 - Test.instanceCount))) | 1)) + (iArr[(i4 >>> 1) % N] - (-lArr[(i4 >>>
            1) % N])));
        vMeth1(i2);
        vMeth_check_sum += i2 + i3 + l + i4 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(int i1) {

        int i8=-32681, i9=147, i10=25, i11=227;
        byte by=18;
        float f1=10.146F;
        short s1=-30009;

        vMeth(124, i1, Test.instanceCount);
        i8 = 1;
        while (++i8 < 390) {
            for (i9 = 1; i9 < 4; ++i9) {
                i10 += (((i9 * i8) + i9) - i9);
                i11 = 2;
                do {
                    Test.instanceCount += (((i11 * i10) + Test.instanceCount) - by);
                    if (i9 != 0) {
                    }
                    i10 %= (int)(i9 | 1);
                    i10 = i9;
                    i10 *= (int)f1;
                    switch ((i8 % 1) + 13) {
                    case 13:
                        i10 = (int)Test.instanceCount;
                        i10 %= (int)(i8 | 1);
                        break;
                    default:
                        f1 += s1;
                        i10 <<= i9;
                    }
                } while ((i11 -= 3) > 0);
            }
        }
        long meth_res = i1 + i8 + i9 + i10 + i11 + by + Float.floatToIntBits(f1) + s1;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-14544, i12=10, i13=-12, i14=-6, i15=-11, i16=-4, i17=-10, i18=-41;
        long l1=2476352651L;
        double d2=90.114822, dArr[]=new double[N];

        FuzzerUtils.init(dArr, 33.12440);

        for (double d : dArr) {
            iArrFld[(i >>> 1) % N] >>= (89 + ((--i) - (i--)));
            iMeth(i);
            switch ((((i >>> 1) % 3) * 5) + 98) {
            case 113:
                for (l1 = 3; l1 < 63; ++l1) {
                    d -= Test.instanceCount;
                    iArrFld[(int)(l1 - 1)] <<= 35;
                    Test.instanceCount += l1;
                    i13 = 2;
                    while ((i13 -= 2) > 0) {
                        Test.instanceCount -= i12;
                        i = (int)Test.instanceCount;
                        Test.bFld = Test.bFld;
                        Test.lArrFld[(int)(l1 - 1)] -= 6;
                    }
                    i12 += (int)l1;
                    i12 -= (int)1.63096;
                    Test.instanceCount = i12;
                }
                if (Test.bFld) continue;
                i = i13;
                break;
            case 108:
                i -= i;
                break;
            case 111:
                for (d2 = 3; d2 < 63; d2++) {
                    Test.instanceCount = (long)d;
                    for (i15 = (int)(d2); i15 < 2; i15++) {
                        i &= i14;
                        i12 += i15;
                        try {
                            iArrFld[(int)(d2 + 1)] = (i16 % iArrFld[i15]);
                            i = (iArrFld[(int)(d2 - 1)] % i13);
                            i16 = (-15435 / iArrFld[(int)(d2 + 1)]);
                        } catch (ArithmeticException a_e) {}
                    }
                }
            }
            switch ((((-24588 >>> 1) % 2) * 5) + 2) {
            case 11:
                i = i15;
                break;
            case 10:
                for (i17 = 1; 63 > i17; i17++) {
                    iArrFld[i17 + 1] *= (int)fFld;
                    i18 -= i16;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
