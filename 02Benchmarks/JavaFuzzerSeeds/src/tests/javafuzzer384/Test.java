package tests.javafuzzer384;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 03:09:24 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=65L;
    public static volatile float fFld=-2.938F;
    public byte byFld=-72;
    public static int iArrFld[]=new int[N];
    public float fArrFld[]=new float[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 51807);
        FuzzerUtils.init(Test.lArrFld, 129L);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i15, long l1) {

        short s=15977;
        int i16=-154, i17=29953, i18=-16670;
        boolean bArr1[]=new boolean[N];
        float fArr[][]=new float[N][N];

        FuzzerUtils.init(bArr1, false);
        FuzzerUtils.init(fArr, -69.114F);

        Test.fFld -= s;
        for (i16 = 195; i16 > 10; i16--) {
            bArr1 = bArr1;
            i15 = i17;
            i17 += (i16 + Test.fFld);
            Test.iArrFld = Test.iArrFld;
        }
        i17 -= (int)Test.instanceCount;
        i15 += (int)1091969766L;
        fArr[(i16 >>> 1) % N][(i17 >>> 1) % N] += Test.fFld;
        Test.iArrFld[(3 >>> 1) % N] = 42061;
        i15 = -218;
        i18 = 1;
        while (++i18 < 197) {
            i17 *= i15;
            i15 = i17;
            Test.iArrFld[i18] = (int)Test.instanceCount;
        }
        long meth_res = i15 + l1 + s + i16 + i17 + i18 + FuzzerUtils.checkSum(bArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        long l=26327L;
        int i13=-22827, i19=-3, i20=141, i21=49236;
        short s1=15864;
        boolean b=false;

        for (l = 1; l < 299; ++l) {
            i13 >>= ((i13 * iMeth1(0, -6L)) - s1);
            switch (((-14078 >>> 1) % 1) + 76) {
            case 76:
                i13 += (-12 + (l * l));
                break;
            }
        }
        i13 = (int)l;
        i19 += 11855;
        b = b;
        i20 = 175;
        do {
            i13 = i13;
            i13 *= i20;
            if (b) {
                i21 = 1;
                while (++i21 < 9) {
                    i13 = i13;
                    i19 -= i19;
                    i13 += i13;
                }
            } else {
                i13 = i20;
            }
        } while (--i20 > 0);
        long meth_res = l + i13 + s1 + i19 + (b ? 1 : 0) + i20 + i21;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth(int i2, int i3, int i4) {

        int i5=20225, i6=45810, i7=-198, i8=70, i9=-5, i10=-29239, i11=-194, i12=31541;
        byte by=38;
        boolean b1=false, bArr[][]=new boolean[N][N];
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)12695);
        FuzzerUtils.init(bArr, false);

        for (i5 = 5; i5 < 389; i5++) {
            i4 = Math.min((int)(Test.instanceCount - (i4 * -8842300394868331171L)), i5);
        }
        for (i7 = 20; i7 < 320; i7++) {
            by = (byte)sArr[i7 + 1];
            i8 = (int)Test.instanceCount;
        }
        for (i9 = 3; i9 < 320; ++i9) {
            i8 ^= (i3 * -8);
            if (bArr[i9 + 1][i9 - 1]) continue;
            if (b1) {
                for (i11 = 1; i11 < 5; ++i11) {
                    Test.iArrFld[i11 - 1] |= (int)(((--i6) - (Test.instanceCount - -8867341116968419824L)) - iMeth());
                    Test.instanceCount *= i5;
                    if (b1) continue;
                    i8 -= (int)Test.instanceCount;
                }
            }
            i4 -= i3;
        }
        vMeth_check_sum += i2 + i3 + i4 + i5 + i6 + i7 + i8 + by + i9 + i10 + i11 + i12 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(bArr);
    }

    public void mainTest(String[] strArr1) {

        int i=10, i1=-33, i22=67, i23=-66, i24=-10, i25=29255, i26=25984, i28=171, i29=13, i30=13;
        boolean b2=true;
        short s2=-30692;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -63.54423);

        for (i = 2; 149 > i; ++i) {
            vMeth(i, i1, i1);
            for (i22 = i; 171 > i22; ++i22) {
                dArr[i + 1] += i;
                i24 = 1;
                do {
                    i23 += (((i24 * i22) + Test.instanceCount) - i24);
                    i23 += (i24 | i23);
                    i1 = i1;
                } while (++i24 < 1);
                switch (((i22 % 2) * 5) + 95) {
                case 97:
                    for (i25 = 1; 1 > i25; ++i25) {
                        int i27=-42355;
                        i26 *= (int)Test.instanceCount;
                        try {
                            i23 = (i27 % i25);
                            i26 = (i25 / -209);
                            i23 = (258197647 / i27);
                        } catch (ArithmeticException a_e) {}
                        b2 = b2;
                        i23 += (((i25 * i1) + i25) - i24);
                    }
                    break;
                case 101:
                    i28 <<= -2;
                    break;
                default:
                    Test.instanceCount = 9831;
                    for (i29 = 1; i29 > 1; i29 -= 3) {
                        switch ((i29 % 2) + 29) {
                        case 29:
                            s2 <<= (short)-56622;
                            Test.iArrFld = Test.iArrFld;
                            Test.instanceCount = i26;
                            fArrFld[i + 1] *= i30;
                            break;
                        case 30:
                            i30 *= (int)Test.instanceCount;
                            Test.fFld *= i;
                            break;
                        }
                        i30 = i23;
                        i30 += (((i29 * Test.fFld) + Test.fFld) - byFld);
                        Test.lArrFld[i22 + 1] = i28;
                        try {
                            i28 = (i23 / Test.iArrFld[i]);
                            Test.iArrFld[i22 + 1] = (59838 % Test.iArrFld[i - 1]);
                            Test.iArrFld[i] = (i1 % -30907);
                        } catch (ArithmeticException a_e) {}
                        i23 += (i29 * i30);
                    }
                    Test.instanceCount += (long)53.18276;
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
