package tests.javafuzzer2045;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 07:54:22 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=0L;
    public static float fFld=58.654F;
    public short sFld=22857;
    public static volatile int iArrFld[]=new int[N];
    public float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -14);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l, int i6, int i7) {

        int i8=3117, i9=39760, i10=-91, i11=108, i12=110, i13=-118, i14=60473, i15=16911;
        double d1=71.6239;
        short s=13660;
        float f1=28.374F;

        for (i8 = 7; i8 < 183; ++i8) {
            i7 += i8;
        }
        for (i10 = 232; i10 > 5; i10 -= 3) {
            for (i12 = 1; i12 < 21; ++i12) {
                i13 -= i6;
                i11 -= i7;
                switch (((i12 % 10) * 5) + 75) {
                case 111:
                    for (i14 = 1; 2 > i14; ++i14) {
                        i7 -= (int)l;
                        switch (((i14 % 1) * 5) + 80) {
                        case 84:
                            i15 *= (int)d1;
                            i11 += i14;
                            s -= (short)d1;
                            d1 *= l;
                            break;
                        default:
                            i11 += (i14 - s);
                        }
                    }
                    break;
                case 94:
                    i11 >>>= 3;
                    break;
                case 122:
                    f1 = f1;
                case 96:
                    i6 += i15;
                    break;
                case 114:
                    i15 >>>= i9;
                    break;
                case 110:
                    Test.instanceCount /= (Test.instanceCount | 1);
                    break;
                case 81:
                    i7 += (i12 - Test.instanceCount);
                    break;
                case 76:
                    i11 <<= i8;
                    break;
                case 125:
                    i9 >>= s;
                    break;
                case 100:
                    d1 = f1;
                    break;
                }
            }
        }
        vMeth1_check_sum += l + i6 + i7 + i8 + i9 + i10 + i11 + i12 + i13 + i14 + i15 + Double.doubleToLongBits(d1) + s
            + Float.floatToIntBits(f1);
    }

    public static int iMeth() {

        int i4=44313, i5=-241, i16=40;
        double d2=104.20802;
        boolean b1=false;

        for (i4 = 8; 324 > i4; ++i4) {
            vMeth1(Test.instanceCount, i4, 53648);
            i5 *= i5;
            switch (((i4 % 3) * 5) + 44) {
            case 52:
                Test.instanceCount = i5;
                Test.iArrFld[i4 + 1] += (int)Test.fFld;
                break;
            case 53:
                i5 += i4;
            case 55:
                i5 = (int)Test.fFld;
                i16 -= i4;
                i5 = i16;
            }
        }
        i16 -= (int)d2;
        Test.instanceCount = Test.instanceCount;
        for (int i17 : Test.iArrFld) {
            b1 = b1;
            if (b1) break;
        }
        long meth_res = i4 + i5 + i16 + Double.doubleToLongBits(d2) + (b1 ? 1 : 0);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i, int i1, double d) {

        boolean b=true, bArr[]=new boolean[N];
        int i2=205, i3=-14, iArr[]=new int[N];
        float f=117.600F;

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(iArr, 14);

        i = (i1 * -60004);
        bArr[(i >>> 1) % N] = b;
        for (i2 = 1; i2 < 246; ++i2) {
            f *= i1;
        }
        iArr[(-53825 >>> 1) % N] = iMeth();
        vMeth_check_sum += i + i1 + Double.doubleToLongBits(d) + (b ? 1 : 0) + i2 + i3 + Float.floatToIntBits(f) +
            FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i18=-54, i19=-1964, i20=-121, i21=0, i22=-13718, i23=13, i24=8, i25=1, i26=-54751, i27=3092, i28=-6359,
            i29=-8, i30=0;
        boolean b2=true;
        double d3=0.23571;

        vMeth(i18, i18, -2.57743);
        for (i19 = 11; i19 < 230; ++i19) {
            for (i21 = 4; i21 < 115; ++i21) {
                Test.fFld += i20;
            }
        }
        i20 += (int)1.41537;
        i20 <<= i20;
        i20 = 0;
        for (i23 = 1; i23 < 221; i23++) {
            Test.instanceCount >>= i23;
            Test.fFld = 41;
            i22 = i18;
            i18 >>= i19;
            i25 = 1;
            while (++i25 < 114) {
                for (i26 = i25; i26 < 1; i26++) {
                    i24 = (int)Test.instanceCount;
                }
                for (i28 = 1; 1 > i28; i28++) {
                    i27 = i21;
                    i20 = (int)Test.instanceCount;
                    i18 <<= i19;
                }
                i18 *= i21;
                Test.iArrFld[i25] -= (int)Test.instanceCount;
                i30 = 1;
                do {
                    byte by=26;
                    i18 -= (int)Test.instanceCount;
                    if (b2) continue;
                    sFld += (short)d3;
                    switch ((i23 % 10) + 1) {
                    case 1:
                    case 2:
                        switch ((i25 % 5) * 5) {
                        case 13:
                            Test.iArrFld[i25 - 1] = (int)d3;
                            sFld -= (short)i18;
                            Test.fFld += (-169L + (i30 * i30));
                            break;
                        case 16:
                            Test.iArrFld[(i24 >>> 1) % N] -= i20;
                        case 20:
                            i24 = (int)Test.fFld;
                            break;
                        case 11:
                            i24 -= i26;
                            break;
                        case 12:
                            i29 -= -55;
                            break;
                        }
                        break;
                    case 3:
                        Test.instanceCount &= Test.instanceCount;
                        break;
                    case 4:
                        fArrFld = FuzzerUtils.float1array(N, (float)-20.461F);
                        break;
                    case 5:
                        i22 = i24;
                        break;
                    case 6:
                        Test.fFld -= i28;
                        break;
                    case 7:
                        Test.iArrFld = Test.iArrFld;
                        break;
                    case 8:
                        try {
                            i24 = (i25 % -460510782);
                            Test.iArrFld[i30] = (Test.iArrFld[i23 - 1] / i27);
                            Test.iArrFld[(i26 >>> 1) % N] = (i23 % 3793);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 9:
                        i22 += (((i30 * by) + Test.instanceCount) - Test.instanceCount);
                        break;
                    case 10:
                        i18 += i26;
                    }
                } while (++i30 < 1);
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
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
