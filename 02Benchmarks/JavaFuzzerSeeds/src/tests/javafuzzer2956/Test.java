package tests.javafuzzer2956;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 23:49:49 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=8939180585832731020L;
    public static volatile float fFld=1.390F;
    public static int iFld=227;
    public boolean bFld=false;
    public static long lArrFld[]=new long[N];
    public static volatile double dArrFld[]=new double[N];
    public static volatile int iArrFld[]=new int[N];
    public float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 8043662500465606047L);
        FuzzerUtils.init(Test.dArrFld, -94.19645);
        FuzzerUtils.init(Test.iArrFld, 91);
    }

    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i8, boolean b1, double d) {

        long l=-2038879413L;
        int i9=-56956, i10=-13, i11=-49824;
        short s=3706;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-8);

        l = 1;
        do {
            if (b1) continue;
            try {
                i8 = (i8 / i8);
                i8 = (i8 % -40);
                i8 = (i8 / 175);
            } catch (ArithmeticException a_e) {}
            switch ((int)((l % 3) + 56)) {
            case 56:
                Test.fFld += (l * Test.instanceCount);
                i8 >>= i8;
                i8 -= i8;
                byArr[(int)(l + 1)] = (byte)i8;
            case 57:
                i9 = 1;
                while (++i9 < 11) {
                    for (i10 = 1; i10 < 1; i10++) {
                        Test.instanceCount += (i10 * i10);
                        s = (short)i10;
                        i8 += i9;
                        i11 = (int)9L;
                    }
                    Test.instanceCount = Test.instanceCount;
                }
                break;
            case 58:
                b1 = b1;
                break;
            }
        } while (++l < 145);
        long meth_res = i8 + (b1 ? 1 : 0) + Double.doubleToLongBits(d) + l + i9 + i10 + i11 + s +
            FuzzerUtils.checkSum(byArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static float fMeth(int i3) {

        int i4=-9, i5=-58371, i6=-2, i7=176, i12=-13, i13=-9, iArr[]=new int[N];
        double d1=40.117186;

        FuzzerUtils.init(iArr, 140);

        for (i4 = 12; i4 < 252; i4++) {
            for (i6 = i4; i6 < 7; ++i6) {
                iArr[i6 + 1] = (~iMeth(i5, true, d1));
                i7 -= -1298;
                i3 = i7;
                for (i12 = i4; i12 < 1; ++i12) {
                    i13 = i13;
                    d1 *= d1;
                    i13 += i12;
                    iArr[i6] = -162;
                    i5 *= i12;
                }
                Test.lArrFld[i6 + 1] /= (i3 | 1);
                i3 >>= i6;
                Test.instanceCount <<= 67L;
                try {
                    i13 = (917874552 / i6);
                    i7 = (198 % i3);
                    i5 = (i7 / i4);
                } catch (ArithmeticException a_e) {}
            }
        }
        long meth_res = i3 + i4 + i5 + i6 + i7 + Double.doubleToLongBits(d1) + i12 + i13 + FuzzerUtils.checkSum(iArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void vMeth(int i, boolean b, int i1) {

        int i2=0, i14=232, i15=216;

        i2 = 1;
        do {
            Test.instanceCount += i2;
            Test.instanceCount += (long)fMeth(i);
            i1 = i;
            if (b) {
                if (i != 0) {
                    vMeth_check_sum += i + (b ? 1 : 0) + i1 + i2 + i14 + i15;
                    return;
                }
                i14 = 5;
                while (--i14 > 0) {
                    switch (((176 >>> 1) % 9) + 61) {
                    case 61:
                        Test.instanceCount |= i1;
                        i1 >>= -63313;
                        break;
                    case 62:
                        i1 += (62864 + (i14 * i14));
                        Test.fFld += i14;
                        i15 = 1;
                        while (++i15 < 1) {
                            Test.instanceCount <<= -38083;
                        }
                        break;
                    case 63:
                        Test.instanceCount = -22;
                        break;
                    case 64:
                        i = (int)Test.instanceCount;
                        break;
                    case 65:
                        if (b) break;
                        break;
                    case 66:
                        i1 *= i2;
                        break;
                    case 67:
                        if (b) continue;
                    case 68:
                        Test.fFld += i14;
                        break;
                    case 69:
                        Test.dArrFld[i14] = -2L;
                    default:
                        i1 += i2;
                    }
                }
            } else {
                Test.iArrFld = Test.iArrFld;
            }
        } while (++i2 < 327);
        vMeth_check_sum += i + (b ? 1 : 0) + i1 + i2 + i14 + i15;
    }

    public void mainTest(String[] strArr1) {

        byte by=58;
        int i16=-179, i17=-6, i18=94, i19=2, i20=-9, i21=-34, i22=-61434, i23=108, i24=7260, i25=-27069, i26=61224,
            i27=-117;
        short s1=-15752;
        long l1=3530805421L;

        vMeth(Test.iFld, bFld, Test.iFld);
        Test.iFld += by;
        Test.iFld = -78;
        switch (((Test.iFld >>> 1) % 5) + 81) {
        case 81:
        case 82:
            i16 = 1;
            do {
                Test.iFld *= -5;
                for (i17 = 5; i17 < 82; i17++) {
                    Test.instanceCount = Test.instanceCount;
                    Test.fFld = 0.1020F;
                    i18 -= (int)Test.instanceCount;
                    fArrFld[i16] *= Test.iFld;
                    Test.iArrFld[i17 + 1] = (int)-51309L;
                    Test.iArrFld[i17] = Test.iFld;
                }
                i19 = 1;
                do {
                    for (i20 = i16; i20 < 1; ++i20) {
                        Test.iFld >>= (int)Test.instanceCount;
                        s1 -= (short)i18;
                        if (bFld) continue;
                    }
                    i21 = 5810;
                } while (++i19 < 82);
                for (i22 = 5; i22 < 82; ++i22) {
                    for (i24 = 1; i24 < 2; ++i24) {
                        Test.iFld *= i22;
                        i18 >>= i19;
                        i21 += (int)(-1250974543211334688L + (i24 * i24));
                    }
                    l1 /= (l1 | 1);
                }
                Test.fFld = i20;
            } while (++i16 < 306);
            break;
        case 83:
            l1 *= i20;
            for (i26 = 8; 155 > i26; i26++) {
                i18 = (int)Test.fFld;
                Test.iArrFld[i26] = i22;
            }
            break;
        case 84:
        case 85:
            Test.lArrFld[(i20 >>> 1) % N] *= i20;
            break;
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
//DEBUG  fMeth ->  fMeth vMeth mainTest
//DEBUG  iMeth ->  iMeth fMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}