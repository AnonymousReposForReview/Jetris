package tests.javafuzzer474;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 04:26:31 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=280444985L;
    public static int iFld=-3740;
    public static double dFld=0.51525;
    public static boolean bFld=true;
    public static float fFld=1.152F;
    public static double dArrFld[][]=new double[N][N];
    public volatile int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.dArrFld, -121.70141);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vSmallMeth(int i, boolean b, short s) {

        float f=0.684F;

        Test.instanceCount = (long)(-((f + i) - (i - Test.instanceCount)));
        vSmallMeth_check_sum += i + (b ? 1 : 0) + s + Float.floatToIntBits(f);
    }

    public static void vMeth(long l) {

        float f2=50.845F;

        f2 = 11483;
        vMeth_check_sum += l + Float.floatToIntBits(f2);
    }

    public static float fMeth(int i3, int i4, int i5) {

        float f1=-63.76F, f3=0.924F;
        int i6=3, i7=165, i8=-110, i9=-13, iArr[]=new int[N];

        FuzzerUtils.init(iArr, -55433);

        for (f1 = 7; 331 > f1; f1++) {
            vMeth(Test.instanceCount);
            iArr[(int)(f1 + 1)] -= 54861;
            switch ((int)(((f1 % 8) * 5) + 11)) {
            case 41:
                i4 &= 60096;
                if (Test.bFld) {
                    i7 = 1;
                    do {
                        Test.instanceCount &= 89;
                        for (i8 = 1; i8 < 1; ++i8) {
                            try {
                                i9 = (i3 % i9);
                                iArr[(int)(f1 + 1)] = (58393 / iArr[i8 + 1]);
                                i3 = (iArr[(int)(f1 + 1)] % -26855);
                            } catch (ArithmeticException a_e) {}
                            Test.iFld -= Test.iFld;
                            iArr[i7 + 1] += i5;
                            Test.iFld = Test.iFld;
                            i3 += (int)f1;
                        }
                        iArr[i7 - 1] = (int)-2.157F;
                    } while (++i7 < 5);
                } else {
                    f3 += i5;
                }
                break;
            case 42:
                i9 += i6;
            case 26:
                i9 = i4;
                break;
            case 37:
                Test.dArrFld[(int)(f1)] = FuzzerUtils.double1array(N, (double)0.78993);
                break;
            case 16:
                i6 <<= i4;
                break;
            case 47:
                f3 -= (float)Test.dFld;
                break;
            case 51:
                i9 += (int)(f1 - i6);
                break;
            case 49:
                i6 += (int)f3;
            }
        }
        long meth_res = i3 + i4 + i5 + Float.floatToIntBits(f1) + i6 + i7 + i8 + i9 + Float.floatToIntBits(f3) +
            FuzzerUtils.checkSum(iArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static long lMeth() {

        int i2=-3, i10=57222, i11=-56, i12=-6, iArr1[]=new int[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -2407989344L);
        FuzzerUtils.init(iArr1, 12);

        lArr[(Test.iFld >>> 1) % N] = (Test.iFld * 53913);
        i2 = 1;
        while (++i2 < 289) {
            Test.dFld = ((++Test.instanceCount) - fMeth(i2, Test.iFld, i2));
            for (i10 = 1; i10 < 6; i10++) {
                i12 = 2;
                while (--i12 > 0) {
                    Test.instanceCount %= (Test.iFld | 1);
                    i11 += (i12 * i12);
                    Test.dArrFld[i12][i12] = -1.1013F;
                }
                Test.iFld += (int)Test.fFld;
                Test.iFld *= (int)Test.instanceCount;
                Test.iFld += i11;
            }
            switch ((i2 % 8) + 66) {
            case 66:
                i11 -= i10;
                Test.instanceCount += i2;
                if (Test.bFld) continue;
            case 67:
                i11 += (i2 + i2);
                break;
            case 68:
                i11 = (int)Test.instanceCount;
            case 69:
                Test.bFld = Test.bFld;
                break;
            case 70:
                Test.bFld = Test.bFld;
            case 71:
                Test.dFld += i2;
                break;
            case 72:
                lArr[i2] -= -12;
                break;
            case 73:
                Test.bFld = Test.bFld;
                break;
            default:
                Test.fFld = Test.instanceCount;
            }
        }
        long meth_res = i2 + i10 + i11 + i12 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i1=0, i14=-5827, i15=-8, i16=4771, i17=157, i18=-5, i19=-61;
        short s1=20712, sArr[]=new short[N];
        boolean b1=true;
        float fArr[][]=new float[N][N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(fArr, -64.673F);
        FuzzerUtils.init(sArr, (short)-7791);
        FuzzerUtils.init(lArr1, -211L);

        for (int smallinvoc=0; smallinvoc<444; smallinvoc++) vSmallMeth(Integer.reverseBytes((int)((-97 << (-11L +
            (Test.instanceCount - i1))) - lMeth())), Test.bFld, s1);
        if (Test.bFld) {
            i1 += 45;
            i1 = -11;
            b1 = b1;
            Test.instanceCount <<= i1;
        } else {
            for (i14 = 4; i14 < 249; i14++) {
                i16 = 1;
                do {
                    i17 = 1;
                    do {
                        i15 = i16;
                        Test.iFld = (int)Test.instanceCount;
                        Test.instanceCount *= Test.instanceCount;
                        fArr[i17][i17 - 1] = i17;
                        i15 -= (int)Test.fFld;
                    } while (++i17 < 1);
                    i15 += (int)(-1.774F + (i16 * i16));
                    i1 += i16;
                    switch ((i16 % 1) + 74) {
                    case 74:
                        sArr[i14] >>>= (short)i14;
                        if (Test.bFld) continue;
                        i15 += (int)Test.dFld;
                        break;
                    default:
                        i15 += (int)Test.instanceCount;
                    }
                    i15 *= (int)Test.instanceCount;
                    Test.instanceCount ^= Test.instanceCount;
                    for (i18 = i14; i18 < 1; i18 += 2) {
                        iArrFld[i14] >>= i14;
                        i1 <<= (int)Test.instanceCount;
                        Test.instanceCount <<= Test.iFld;
                        Test.fFld *= i16;
                        Test.iFld += (int)-25.301F;
                    }
                } while (++i16 < 103);
                lArr1[i14 - 1] += i1;
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  fMeth ->  fMeth lMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
