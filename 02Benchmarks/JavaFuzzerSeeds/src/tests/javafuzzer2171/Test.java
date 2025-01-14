package tests.javafuzzer2171;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 09:44:06 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-2112L;
    public static byte byFld=-83;
    public int iFld=-52125;
    public boolean bFld=true;
    public volatile int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.fArrFld, -1.668F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l, boolean b) {

        int i3=6596, i4=-13, i5=35886, i6=-29339, i7=0, i8=-4, iArr1[]=new int[N];
        double d1=0.78127, d2=-26.128964;
        float fArr[]=new float[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr1, 14894);
        FuzzerUtils.init(fArr, 0.960F);
        FuzzerUtils.init(lArr, 22002L);

        l = i3;
        iArr1[(i3 >>> 1) % N] |= i3;
        fArr[(i3 >>> 1) % N] -= i3;
        for (d1 = 9; 164 > d1; d1++) {
            iArr1[(int)(d1 + 1)] *= i4;
            for (i5 = 1; i5 < 10; i5++) {
                i3 |= i3;
                if (b) break;
            }
            i6 >>= i4;
            for (i7 = 1; i7 < 10; i7++) {
                d2 = -845536111189633959L;
                i4 += (int)-3732483210L;
                if (b) {
                    iArr1[(int)(d1)] = i8;
                } else {
                    lArr[(int)(d1 - 1)] += l;
                }
            }
        }
        vMeth2_check_sum += l + (b ? 1 : 0) + i3 + Double.doubleToLongBits(d1) + i4 + i5 + i6 + i7 + i8 +
            Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(int i1, int i2) {

        float f=0.571F;
        boolean b1=false;
        int i9=-24, i10=-8, i11=-29062, i12=-53947, iArr2[][]=new int[N][N];
        short s=-15040;

        FuzzerUtils.init(iArr2, -26);

        f = (i1--);
        vMeth2(7L, b1);
        for (i9 = 9; i9 < 396; i9++) {
            for (i11 = 1; i11 < 4; i11++) {
                switch (((i9 % 7) * 5) + 59) {
                case 68:
                    iArr2 = iArr2;
                    break;
                case 94:
                case 88:
                    iArr2[i9 + 1][i9 - 1] = i10;
                    i1 -= i2;
                    switch ((((43230 >>> 1) % 6) * 5) + 65) {
                    case 92:
                        i10 ^= i11;
                        i12 += (int)-125.123F;
                        s = (short)i9;
                        i12 = i1;
                    case 68:
                        if (i11 != 0) {
                            vMeth1_check_sum += i1 + i2 + Float.floatToIntBits(f) + (b1 ? 1 : 0) + i9 + i10 + i11 + i12
                                + s + FuzzerUtils.checkSum(iArr2);
                            return;
                        }
                        Test.byFld += (byte)(i11 * i11);
                        break;
                    case 88:
                        i1 += -47;
                        break;
                    case 71:
                        try {
                            i2 = (-1322247664 % i12);
                            i10 = (1068067852 % i9);
                            i12 = (i9 / -160);
                        } catch (ArithmeticException a_e) {}
                    case 66:
                        try {
                            i2 = (163 / i11);
                            iArr2[i9][i9 - 1] = (i11 % 26228);
                            i1 = (iArr2[i11 - 1][i11] % -93);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 90:
                        s = (short)-43705L;
                        break;
                    }
                    break;
                case 81:
                    i12 += (i11 + i1);
                case 72:
                    i12 -= -57962;
                    break;
                case 65:
                    i12 = 39214;
                    break;
                case 64:
                    Test.byFld ^= (byte)-230;
                }
            }
        }
        vMeth1_check_sum += i1 + i2 + Float.floatToIntBits(f) + (b1 ? 1 : 0) + i9 + i10 + i11 + i12 + s +
            FuzzerUtils.checkSum(iArr2);
    }

    public static void vMeth(double d) {

        int i=-1, iArr[]=new int[N];

        FuzzerUtils.init(iArr, 14);

        iArr[(i >>> 1) % N] |= (int)((-Test.instanceCount) - (iArr[(i >>> 1) % N] += (++iArr[(i >>> 1) % N])));
        vMeth1(-14844, -142);
        vMeth_check_sum += Double.doubleToLongBits(d) + i + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        double d3=1.40746;
        long l1=129L, lArr1[][]=new long[N][N];
        int i13=-179, i14=125, i15=-47210, i16=-50672, i17=25317, iArr3[]=new int[N];
        float f1=110.41F, f2=-2.15F;
        short s1=6134;

        FuzzerUtils.init(lArr1, -49383L);
        FuzzerUtils.init(iArr3, 14);

        vMeth(d3);
        l1 = 384;
        do {
            Test.instanceCount += iFld;
            iFld = iFld;
            Test.instanceCount -= iFld;
            iArrFld[(int)(l1)] = iFld;
            iFld *= -11;
        } while (--l1 > 0);
        iFld -= iFld;
        i13 = 190;
        do {
            i14 = 1;
            while (++i14 < 132) {
                for (i15 = 1; i15 < 1; ++i15) {
                    iFld += iFld;
                    try {
                        i16 = (79 % iFld);
                        iArrFld[i13 + 1] = (i14 / -53815);
                        iFld = (i16 / i16);
                    } catch (ArithmeticException a_e) {}
                    bFld = bFld;
                    lArr1[i15 - 1] = FuzzerUtils.long1array(N, (long)-4175331781845485443L);
                    Test.instanceCount |= iFld;
                    Test.byFld -= Test.byFld;
                }
                switch (((i16 >>> 1) % 8) + 25) {
                case 25:
                    for (f1 = i14; f1 < 1; ++f1) {
                        i16 >>= i15;
                        iArrFld[i13 + 1] /= (int)(iFld | 1);
                        s1 += (short)f1;
                        Test.instanceCount >>>= i16;
                        f2 = f2;
                        Test.fArrFld[(int)(f1 + 1)] = l1;
                        i16 += (int)(-1.766F + (f1 * f1));
                    }
                    i17 = -71;
                    iArr3[(iFld >>> 1) % N] -= iFld;
                    i16 = (int)l1;
                    break;
                case 26:
                    i16 += i14;
                    break;
                case 27:
                    f2 = f2;
                    break;
                case 28:
                    Test.instanceCount = 3;
                    break;
                case 29:
                    i17 *= i17;
                case 30:
                    iFld -= i13;
                    break;
                case 31:
                    i17 = iFld;
                    break;
                case 32:
                    iFld += (int)l1;
                    break;
                default:
                    iFld += i14;
                }
            }
        } while (--i13 > 0);

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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
