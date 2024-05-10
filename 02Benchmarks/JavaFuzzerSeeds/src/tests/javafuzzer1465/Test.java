package tests.javafuzzer1465;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 21:11:15 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-49335L;
    public static float fFld=-64.498F;
    public static boolean bFld=false;
    public static volatile boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i2, long l) {

        int i3=14, i4=3, i5=173, i6=-14, i7=59, i8=-161, iArr[]=new int[N];
        byte by=-86;
        float f=1.684F, fArr[]=new float[N];

        FuzzerUtils.init(fArr, 44.863F);
        FuzzerUtils.init(iArr, 248);

        for (i3 = 14; i3 < 262; ++i3) {
            for (i5 = 1; i5 < 7; ++i5) {
                fArr[i3] = i2;
            }
            l += (((i3 * Test.fFld) + i3) - i4);
            i6 >>= i5;
            i4 = i3;
            i2 -= i5;
            iArr[i3] -= i4;
            i2 = by;
            iArr[i3 + 1] += i4;
        }
        i7 = 1;
        do {
            i2 >>= i4;
            for (f = 5; f > 1; f--) {
                iArr[(int)(f)] &= i3;
            }
            Test.instanceCount >>>= i3;
        } while (++i7 < 364);
        vMeth1_check_sum += i2 + l + i3 + i4 + i5 + i6 + by + i7 + Float.floatToIntBits(f) + i8 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth() {

        int i10=-11, i11=-1, i12=-34, iArr1[]=new int[N];
        byte by1=85;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr1, -41431);
        FuzzerUtils.init(lArr, 275763782L);

        vMeth1(i10, -22133L);
        i10 *= 45768;
        i10 >>>= i10;
        iArr1[(i10 >>> 1) % N] = i10;
        i10 = (int)Test.instanceCount;
        i10 = by1;
        i10 -= (int)35.167F;
        Test.fFld = -11668;
        for (i11 = 17; i11 < 318; ++i11) {
            i10 += i11;
            Test.instanceCount *= by1;
            i10 += i11;
        }
        lArr[(i12 >>> 1) % N] -= i10;
        vMeth_check_sum += i10 + by1 + i11 + i12 + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth(int i1) {

        int i13=-166, i14=-13, i15=10, i16=40781, i17=8, i18=27772, i20=18946, iArr2[]=new int[N];
        boolean b1=true;

        FuzzerUtils.init(iArr2, 0);

        vMeth();
        for (i13 = 13; i13 < 258; ++i13) {
            iArr2[(i1 >>> 1) % N] <<= -13;
            iArr2[i13] ^= (int)Test.instanceCount;
            switch ((i13 % 2) + 96) {
            case 96:
                i1 -= (int)Test.instanceCount;
                i14 += (i13 + i1);
                break;
            case 97:
                for (i15 = 7; i15 > 1; i15 -= 3) {
                    for (i17 = 1; 4 > i17; ++i17) {
                        boolean b=false;
                        int i19=54222;
                        if (b) {
                            if (b) {
                                if (b) break;
                                Test.bArrFld[i13] = b;
                                i14 = i18;
                            } else if (b) {
                                iArr2[i15] = -11;
                            } else if (b) {
                                i18 += (((i17 * Test.instanceCount) + i19) - i16);
                            } else {
                                i18 = i1;
                            }
                        } else if (b) {
                            i20 = -159;
                        }
                    }
                }
                break;
            default:
                b1 = b1;
            }
        }
        long meth_res = i1 + i13 + i14 + i15 + i16 + i17 + i18 + i20 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=157, i21=14, i22=-48936, i23=3, i24=8, i25=-56977, i26=-191, i27=26, i28=-11, iArr3[]=new int[N];
        double d=47.79179;
        byte by2=107;
        float fArr1[]=new float[N];

        FuzzerUtils.init(fArr1, 115.470F);
        FuzzerUtils.init(iArr3, -30524);

        Test.fFld += Test.instanceCount;
        i = ((i++) + iMeth(i));
        for (i21 = 2; i21 < 259; i21++) {
            d = Test.instanceCount;
            i += (int)1.95018;
            Test.instanceCount = (long)84.933F;
            i += -7;
            i += (-226 + (i21 * i21));
            Test.instanceCount += (i21 * i22);
        }
        i23 = 1;
        while (++i23 < 363) {
            fArr1[i23 - 1] += Test.fFld;
            try {
                i = (iArr3[i23] % 29);
                i22 = (i23 % -1716155574);
                i = (iArr3[i23 - 1] % i);
            } catch (ArithmeticException a_e) {}
            i22 += (12 + (i23 * i23));
            if (Test.bFld) {
                Test.instanceCount += i23;
                i24 = 1;
                do {
                    i22 <<= by2;
                    i22 += i24;
                    try {
                        i = (i / i23);
                        i = (i22 / 1347275264);
                        i = (i22 % i);
                    } catch (ArithmeticException a_e) {}
                    for (i25 = 1; 1 > i25; ++i25) {
                        Test.instanceCount = i;
                        i += i25;
                        i = (int)d;
                        i26 -= (int)Test.fFld;
                    }
                    for (i27 = 1; i27 < 1; i27++) {
                        iArr3[i24] >>>= i23;
                        switch ((i27 % 5) + 42) {
                        case 42:
                            Test.fFld -= Test.instanceCount;
                            break;
                        case 43:
                            i26 += i27;
                            break;
                        case 44:
                            i28 *= i25;
                            break;
                        case 45:
                            i22 += (713 + (i27 * i27));
                            break;
                        case 46:
                            try {
                                iArr3[i23 + 1] = (1919563345 / i);
                                i28 = (1189409202 % i26);
                                i26 = (i22 % i22);
                            } catch (ArithmeticException a_e) {}
                            break;
                        default:
                            i22 += (i27 * i27);
                        }
                    }
                } while (++i24 < 69);
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