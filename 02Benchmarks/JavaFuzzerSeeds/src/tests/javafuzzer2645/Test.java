package tests.javafuzzer2645;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 17:58:14 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-821687867L;
    public double dFld=0.94312;
    public static float fFld=11.234F;
    public boolean bFld=false;
    public volatile short sFld=-29197;
    public static long lArrFld[]=new long[N];
    public static volatile double dArrFld[]=new double[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -5925128092976197661L);
        FuzzerUtils.init(Test.dArrFld, -16.73712);
        FuzzerUtils.init(Test.iArrFld, -8);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1() {

        long l=-4L;
        int i5=-61311, i6=-35673, i7=-9597, i8=5959, i9=6;
        double d=-2.20020;
        short s=25690;
        byte by=22;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, true);

        Test.dArrFld = Test.dArrFld;
        for (l = 7; l < 198; ++l) {
            d -= Test.fFld;
            bArr[(int)(l + 1)] = false;
            Test.instanceCount += s;
            for (i6 = 8; i6 > l; --i6) {
                Test.iArrFld[i6 - 1] &= i7;
                i7 <<= by;
                i7 = s;
                Test.fFld = 1121359997L;
                try {
                    i5 = (i5 / 202);
                    i7 = (i5 / i7);
                    i7 = (-1724949076 / Test.iArrFld[i6]);
                } catch (ArithmeticException a_e) {}
                for (i8 = i6; i8 < 1; i8++) {
                    i9 += 9;
                    Test.instanceCount = l;
                    i5 = i9;
                }
            }
        }
        long meth_res = l + i5 + Double.doubleToLongBits(d) + s + i6 + i7 + by + i8 + i9 + FuzzerUtils.checkSum(bArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(boolean b) {

        int i10=252, i11=21194, i12=12, i13=-243, i14=-10;
        short s1=26265, sArr[]=new short[N];
        double d1=2.70447;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 0.755F);
        FuzzerUtils.init(sArr, (short)-5648);

        Test.fFld = iMeth1();
        i10 -= -31;
        Test.iArrFld = Test.iArrFld;
        i10 = (int)Test.instanceCount;
        i10 >>>= i10;
        for (i11 = 3; i11 < 160; ++i11) {
            for (i13 = 10; i13 > 1; i13--) {
                i12 += (i13 * i13);
                i14 = i14;
            }
            fArr[i11] = -2;
            switch (((-1 >>> 1) % 4) + 41) {
            case 41:
                switch (((99 >>> 1) % 5) + 121) {
                case 121:
                    i14 += i10;
                    if (true) continue;
                    i12 += (int)Test.fFld;
                    break;
                case 122:
                    sArr = sArr;
                    break;
                case 123:
                    b = b;
                    break;
                case 124:
                    try {
                        i10 = (i12 % i11);
                        i10 = (-19532 / i12);
                        Test.iArrFld[i11] = (-9533 % i14);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 125:
                    s1 = (short)i12;
                    break;
                }
                break;
            case 42:
                d1 = s1;
                break;
            case 43:
                i14 <<= i10;
                break;
            case 44:
                Test.iArrFld[i11] &= i11;
            default:
                try {
                    i14 = (i13 / i14);
                    i10 = (18641 / i14);
                    i12 = (i11 % i14);
                } catch (ArithmeticException a_e) {}
            }
        }
        long meth_res = (b ? 1 : 0) + i10 + i11 + i12 + i13 + i14 + s1 + Double.doubleToLongBits(d1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(sArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i4=23883, i15=0, i16=-2, i17=-101, i18=56654;
        boolean b1=false;
        float f=-97.287F;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)113);

        i4 *= iMeth(b1);
        i4 -= (int)Test.instanceCount;
        i4 += i4;
        i4 = (int)3253862034L;
        i4 >>= i4;
        Test.instanceCount = i4;
        byArr[(i4 >>> 1) % N] = (byte)i4;
        for (f = 5; f < 349; f++) {
            for (i16 = (int)(f); i16 < 5; ++i16) {
                i4 >>= i15;
                i15 <<= i16;
                i18 = 1;
                do {
                    Test.lArrFld[i18] = Test.instanceCount;
                } while (++i18 < 1);
                i4 = i18;
                i15 <<= i17;
            }
        }
        vMeth_check_sum += i4 + (b1 ? 1 : 0) + Float.floatToIntBits(f) + i15 + i16 + i17 + i18 +
            FuzzerUtils.checkSum(byArr);
    }

    public void mainTest(String[] strArr1) {

        int i=5, i1=-3, i2=40460, i3=231, i19=-1, i20=0, i21=-27814, i22=-10496, i23=-7, i24=122, i25=56494, iArr[]=new
            int[N];

        FuzzerUtils.init(iArr, 252);

        switch ((((++iArr[(i >>> 1) % N]) >>> 1) % 10) + 10) {
        case 10:
            for (i1 = 15; i1 < 395; ++i1) {
                Test.lArrFld[i1 - 1] += (long)(((--dFld) - (Test.instanceCount++)) - (Test.instanceCount = (i2 >> i3)));
                vMeth();
                i3 += (-6932 + (i1 * i1));
                if (bFld) continue;
                Test.instanceCount += (i1 * i1);
                dFld = i3;
                switch ((((i2 >>> 1) % 2) * 5) + 63) {
                case 64:
                    if (bFld) continue;
                    for (i19 = 2; i19 < 66; i19 += 2) {
                        i2 >>>= i3;
                    }
                    break;
                case 68:
                    switch (((i20 >>> 1) % 2) + 64) {
                    case 64:
                        Test.lArrFld[i1] = -103L;
                        break;
                    case 65:
                        dFld += Test.instanceCount;
                        if (bFld) {
                            if (false) break;
                            i3 += 12907;
                            Test.instanceCount += 4353196740855660936L;
                        }
                        i3 -= 219;
                        i2 = i19;
                        break;
                    default:
                        Test.fFld += (i1 * i1);
                        for (i21 = 3; i21 < 66; ++i21) {
                            i20 += (i21 ^ i23);
                            for (i24 = 1; i24 < 2; ++i24) {
                                i3 += i;
                                dFld = 5L;
                                sFld = (short)-14;
                                Test.fFld -= Test.instanceCount;
                                Test.fFld += i24;
                            }
                        }
                    }
                    break;
                }
            }
            break;
        case 11:
            Test.instanceCount = i2;
            break;
        case 12:
            Test.instanceCount *= (long)Test.fFld;
            break;
        case 13:
            Test.iArrFld[(i23 >>> 1) % N] += i25;
        case 14:
        case 15:
            i23 = i22;
            break;
        case 16:
            Test.instanceCount = Test.instanceCount;
            break;
        case 17:
            i22 = (int)Test.instanceCount;
            break;
        case 18:
            bFld = bFld;
        case 19:
            Test.lArrFld[(i23 >>> 1) % N] = -46;
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
