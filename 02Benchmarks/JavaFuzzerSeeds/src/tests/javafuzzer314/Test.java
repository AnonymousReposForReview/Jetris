package tests.javafuzzer314;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 01:40:15 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-13L;
    public static boolean bFld=false;
    public static int iFld=-44724;
    public static double dArrFld[]=new double[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 38.34882);
        FuzzerUtils.init(Test.lArrFld, 1067962702L);
    }

    public static long sMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static short sMeth(float f1, int i7) {

        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -248L);

        i7 >>>= (int)lArr[(i7 >>> 1) % N];
        long meth_res = Float.floatToIntBits(f1) + i7 + FuzzerUtils.checkSum(lArr);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static void vMeth1(int i13, int i14) {

        int i15=-95, i16=-184, i17=41208, i18=-49473, i19=7, i20=64384, i21=-111;
        float f2=1.244F;
        byte by=-49;
        double d1=32.124496;

        i15 = 1;
        do {
            i14 <<= i14;
            for (i16 = 1; i16 < 8; i16++) {
                Test.instanceCount += (long)(2.323F + (i16 * i16));
                Test.instanceCount = (long)f2;
                i13 <<= i13;
                i14 = (int)Test.instanceCount;
                for (i18 = 1; i18 < 2; ++i18) {
                    i17 = by;
                    if (Test.bFld) continue;
                    d1 += f2;
                }
                for (i20 = 1; i20 < 2; i20++) {
                    int i22=-9;
                    Test.instanceCount -= i16;
                    i19 += (i20 * i19);
                    i22 *= (int)Test.instanceCount;
                }
            }
        } while (++i15 < 214);
        vMeth1_check_sum += i13 + i14 + i15 + i16 + i17 + Float.floatToIntBits(f2) + i18 + i19 + by +
            Double.doubleToLongBits(d1) + i20 + i21;
    }

    public static long lMeth() {


        vMeth1(Test.iFld, Test.iFld);
        long meth_res = 0;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i8, double d, int i9) {

        short s1=27446, sArr[]=new short[N];
        int i11=26182, i12=-61997, i23=-159, i24=231, iArr1[]=new int[N];
        float f3=68.156F;

        FuzzerUtils.init(sArr, (short)-22923);
        FuzzerUtils.init(iArr1, 13);

        sArr[(i8 >>> 1) % N] <<= (short)(i9 + i8);
        iArr1[(12 >>> 1) % N] *= i8;
        for (int i10 : iArr1) {
            switch (((((17 & (s1 + i10)) >>> 1) % 7) * 5) + 54) {
            case 84:
                i8 -= i8;
                for (i11 = 1; 4 > i11; i11++) {
                    Test.instanceCount = Math.abs(lMeth());
                    Test.instanceCount = (long)f3;
                    s1 = (short)89;
                    for (i23 = 1; i23 < 2; ++i23) {
                        Test.dArrFld[i11] += f3;
                        switch (((i23 % 9) * 5) + 74) {
                        case 116:
                            if (Test.bFld) {
                                Test.iFld += i23;
                                i8 = (int)Test.instanceCount;
                            }
                        case 86:
                        case 76:
                            i12 += (int)Test.instanceCount;
                        case 119:
                            i8 = i24;
                            break;
                        case 83:
                            d = i9;
                            break;
                        case 103:
                            f3 += Test.instanceCount;
                            break;
                        case 109:
                            Test.iFld = i24;
                        case 77:
                            try {
                                i9 = (Test.iFld / iArr1[i11]);
                                i9 = (-60035 % i23);
                                i10 = (i8 % 87);
                            } catch (ArithmeticException a_e) {}
                            break;
                        case 106:
                            Test.instanceCount += i11;
                            break;
                        }
                    }
                }
            case 72:
                if (i10 != 0) {
                    vMeth_check_sum += i8 + Double.doubleToLongBits(d) + i9 + s1 + i11 + i12 + Float.floatToIntBits(f3)
                        + i23 + i24 + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr1);
                    return;
                }
            case 73:
                iArr1[(i8 >>> 1) % N] = i10;
            case 79:
                i24 *= i12;
                break;
            case 65:
                f3 -= i9;
            case 55:
                i9 += i12;
                break;
            case 80:
            }
        }
        vMeth_check_sum += i8 + Double.doubleToLongBits(d) + i9 + s1 + i11 + i12 + Float.floatToIntBits(f3) + i23 + i24
            + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=122, i1=30053, i2=10, i3=-8, i4=10, i5=65409, i6=-90, i25=4871, i26=-150, iArr[]=new int[N];
        float f=1.786F;
        short s=6925;
        double d2=-87.28050;
        byte by1=48;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(iArr, 4);
        FuzzerUtils.init(bArr, true);

        for (i = 7; i < 322; i++) {
            i2 = 1;
            while (++i2 < 80) {
                switch ((i2 % 7) + 111) {
                case 111:
                    i1 = (int)(((-(Test.instanceCount += 45)) * 119) * ((i1 - i1) * (i2 - i1)));
                    break;
                case 112:
                    for (i3 = i2; i3 < 1; ++i3) {
                        Test.instanceCount ^= -6;
                        iArr[i3 - 1] = (int)(Test.instanceCount++);
                    }
                    for (i5 = 1; i5 < 1; ++i5) {
                        iArr = (iArr = FuzzerUtils.int1array(N, (int)57638));
                        bArr[i2 + 1] = ((i - (0.713F + (++i6))) > f);
                        i1 -= (int)(sMeth(i1 + Test.instanceCount, i1 - i4) * ((f - i6) - (i3 - Test.instanceCount)));
                        Test.instanceCount -= (i4++);
                        f += (i5 * i5);
                    }
                    break;
                case 113:
                    i6 = ((-(++i6)) ^ ((i5 - i6) * i1));
                    i6 += i2;
                    i6 += (((i2 * i6) + f) - f);
                case 114:
                    i1 -= s;
                    vMeth(i6, d2, 134);
                    for (i25 = 1; i25 > 1; --i25) {
                        Test.instanceCount += 12;
                        iArr[i - 1] -= by1;
                        i1 <<= (int)1727464896L;
                        Test.instanceCount -= (long)f;
                        Test.lArrFld = Test.lArrFld;
                        Test.instanceCount += Test.instanceCount;
                    }
                case 115:
                    if (Test.bFld) break;
                case 116:
                    i26 += (((i2 * Test.instanceCount) + i6) - i);
                    break;
                case 117:
                    i1 += (((i2 * i1) + s) - i3);
                    Test.instanceCount = i1;
                    by1 = (byte)i2;
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
//DEBUG  sMeth ->  sMeth mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
