package tests.javafuzzer2309;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 12:02:49 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-74L;
    public static volatile float fFld=-15.149F;
    public static double dFld=1.118275;
    public static short sFld=-31580;
    public static int iArrFld[]=new int[N];
    public static volatile long lArrFld[]=new long[N];
    public static float fArrFld[]=new float[N];
    public static byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 194);
        FuzzerUtils.init(Test.lArrFld, -8818537951152580089L);
        FuzzerUtils.init(Test.fArrFld, 1.323F);
        FuzzerUtils.init(Test.byArrFld, (byte)45);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i3) {

        int i4=-61466, i5=-13, i6=206, i7=13;
        float f=2.870F;
        short sArr[]=new short[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(sArr, (short)-9153);
        FuzzerUtils.init(lArr, 0L);

        for (short s : sArr) {
            try {
                i3 = (43 / i3);
                Test.iArrFld[(58268 >>> 1) % N] = (i3 % i3);
                i3 = (i3 / 698774845);
            } catch (ArithmeticException a_e) {}
            for (i4 = 1; i4 < 4; i4++) {
                i3 += (i4 + i3);
                i5 += i4;
            }
            for (i6 = 1; i6 < 4; i6++) {
                f -= s;
                i5 = i4;
                i7 >>>= i5;
                Test.iArrFld[i6] |= i5;
                Test.iArrFld[i6] <<= i6;
                switch (((i6 % 2) * 5) + 97) {
                case 104:
                    i3 *= i5;
                    Test.instanceCount = i7;
                    i3 ^= i3;
                    break;
                case 102:
                    lArr[i6 - 1] = Test.instanceCount;
                }
            }
        }
        long meth_res = i3 + i4 + i5 + i6 + i7 + Float.floatToIntBits(f) + FuzzerUtils.checkSum(sArr) +
            FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1() {

        int i2=11, i8=-1680, i9=-234, i10=1, i11=2, i12=-10;
        double d=19.99319;
        short s1=1013;

        i2 -= (int)lMeth(i2);
        i2 += (int)Test.instanceCount;
        d = 1;
        do {
            for (i8 = 1; 9 > i8; i8++) {
                Test.iArrFld = Test.iArrFld;
                Test.fFld = i9;
                Test.lArrFld = Test.lArrFld;
                for (i10 = 1; i10 < 2; ++i10) {
                    i11 = i11;
                    Test.instanceCount ^= s1;
                    i2 += (i10 * s1);
                    i2 = -71;
                    Test.instanceCount >>>= i8;
                    i12 += i10;
                    Test.fFld = -79;
                }
            }
        } while (++d < 187);
        vMeth1_check_sum += i2 + Double.doubleToLongBits(d) + i8 + i9 + i10 + i11 + s1 + i12;
    }

    public static void vMeth(int i, int i1) {

        byte by=-109;
        int i13=-29162, i14=44060, iArr[]=new int[N];

        FuzzerUtils.init(iArr, -7);

        iArr[(i1 >>> 1) % N] += (iArr[(i1 >>> 1) % N] + ((i = i) + (-i)));
        vMeth1();
        by -= (byte)Test.dFld;
        i1 = i;
        i13 = 1;
        while (++i13 < 392) {
            i14 = 1;
            while (++i14 < 4) {
                i = 27345;
                i += i13;
                Test.fArrFld[i14 - 1] -= Test.fFld;
                i1 *= i1;
                switch ((i14 % 9) + 36) {
                case 36:
                    i1 += (int)Test.fFld;
                    Test.sFld = (short)8;
                    try {
                        i1 = (i13 / -31515);
                        i1 = (214 / i1);
                        i = (i13 % 685354745);
                    } catch (ArithmeticException a_e) {}
                    Test.instanceCount *= 98;
                case 37:
                    i1 += i1;
                case 38:
                case 39:
                    i += (-215 + (i14 * i14));
                    break;
                case 40:
                    i += (i14 * i14);
                    break;
                case 41:
                    if (i != 0) {
                        vMeth_check_sum += i + i1 + by + i13 + i14 + FuzzerUtils.checkSum(iArr);
                        return;
                    }
                    break;
                case 42:
                    Test.byArrFld[i13 - 1] = by;
                    break;
                case 43:
                    i1 %= -139;
                    break;
                case 44:
                    Test.dFld = i13;
                    break;
                }
            }
        }
        vMeth_check_sum += i + i1 + by + i13 + i14 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i15=11, i16=-24393, i17=-7, i18=57, i19=8932, i20=9, i21=231, i22=-160, i23=-85, i24=38628;
        float f1=-87.756F;
        boolean b=false;
        byte by1=92;

        vMeth(i15, i15);
        for (f1 = 7; f1 < 245; ++f1) {
            Test.instanceCount += (long)(f1 * f1);
            for (i17 = 5; i17 < 106; i17++) {
                i19 = 1;
                while (++i19 < 2) {
                    i16 += i18;
                    Test.instanceCount += i16;
                    Test.iArrFld[i19 - 1] = (int)-58699L;
                    i15 = i17;
                    b = false;
                    Test.lArrFld[i17] = i20;
                    i16 = 13916;
                    Test.instanceCount += (i19 + i17);
                    Test.iArrFld[i17] -= i15;
                    Test.sFld += (short)Test.fFld;
                }
                i18 += (i17 * i17);
                switch ((int)(((f1 % 3) * 5) + 121)) {
                case 131:
                    for (i21 = 1; i21 < 2; ++i21) {
                        i22 += i21;
                    }
                    switch ((int)(((f1 % 1) * 5) + 58)) {
                    case 60:
                        Test.iArrFld[(int)(f1 + 1)] = (int)Test.instanceCount;
                        i15 += (int)73.6798;
                        Test.lArrFld[i17 + 1] += 31234;
                        Test.sFld += (short)(i17 * i17);
                        break;
                    default:
                        for (i23 = 2; i23 > 1; --i23) {
                            Test.iArrFld[i17 - 1] = i21;
                            Test.instanceCount *= i16;
                            Test.fFld -= i21;
                            i18 *= 144;
                            i20 *= i17;
                        }
                    }
                    break;
                case 132:
                    i18 = 128;
                    break;
                case 122:
                    by1 >>= (byte)Test.instanceCount;
                    break;
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