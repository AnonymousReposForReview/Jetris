package tests.javafuzzer2961;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 23:52:11 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-7L;
    public static int iFld=6;
    public static volatile double dFld=31.41197;
    public static volatile byte byFld=85;
    public static float fFld=98.52F;
    public static byte byArrFld[]=new byte[N];
    public static double dArrFld[]=new double[N];
    public static short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)76);
        FuzzerUtils.init(Test.dArrFld, 2.11179);
        FuzzerUtils.init(Test.sArrFld, (short)-11666);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l, int i9) {

        int i10=48028, i11=-239, i12=2, i13=-56636, iArr1[]=new int[N];
        float f2=58.111F;
        double d=-2.68878;
        boolean b=false;

        FuzzerUtils.init(iArr1, 5);

        for (i10 = 230; i10 > 10; --i10) {
            for (i12 = 1; i12 < 7; i12++) {
                Test.iFld -= (int)f2;
                d = Test.iFld;
                l = Test.iFld;
                i9 -= (int)Test.instanceCount;
                if (b) continue;
            }
            i9 += (-54560 + (i10 * i10));
            try {
                i11 = (214063686 / i9);
                i13 = (-16610308 / iArr1[i10 + 1]);
                i11 = (i13 % -44240);
            } catch (ArithmeticException a_e) {}
            Test.instanceCount %= (i13 | 1);
            i13 *= Test.iFld;
            i11 = i9;
        }
        Test.iFld %= (int)(i12 | 1);
        iArr1[(i10 >>> 1) % N] ^= Test.iFld;
        Test.byArrFld[(i9 >>> 1) % N] = (byte)-70;
        vMeth2_check_sum += l + i9 + i10 + i11 + i12 + i13 + Float.floatToIntBits(f2) + Double.doubleToLongBits(d) + (b
            ? 1 : 0) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth1(int i4) {

        int i5=76, i6=4, i7=-13214, i8=-133, i14=-1, i15=-9, i16=-22, iArr2[][]=new int[N][N];
        double d1=101.89827, dArr[]=new double[N];
        long l1=314995716L, lArr1[]=new long[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(dArr, -107.89666);
        FuzzerUtils.init(iArr2, 42299);
        FuzzerUtils.init(lArr1, -8012970212574947428L);
        FuzzerUtils.init(fArr, 101.514F);

        for (i5 = 7; i5 < 216; i5++) {
            dArr[i5] = (i6--);
            Test.instanceCount -= (--i4);
            for (i7 = i5; i7 < 8; ++i7) {
                vMeth2(Test.instanceCount, Test.iFld);
                try {
                    iArr2[i7 + 1][i5 - 1] = (iArr2[i5 + 1][i7 - 1] % i7);
                    i6 = (i8 % i6);
                    i8 = (i4 % 336420048);
                } catch (ArithmeticException a_e) {}
                for (i14 = 1; i14 < 1; i14++) {
                    lArr1[i7 + 1] += -42;
                    fArr[i5] = (float)d1;
                    Test.instanceCount += -23405;
                }
                i15 += (8 + (i7 * i7));
                i15 *= Test.iFld;
                for (l1 = i7; l1 < 1; l1++) {
                    if (true) break;
                    i16 = -62685;
                }
            }
        }
        vMeth1_check_sum += i4 + i5 + i6 + i7 + i8 + i14 + i15 + Double.doubleToLongBits(d1) + l1 + i16 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr2) +
            FuzzerUtils.checkSum(lArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth() {

        float f=-65.185F;
        int i1=-43315, i3=242, i17=71, i18=-12, iArr[]=new int[N];
        double d2=1.21204;
        boolean b1=true;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, -1592593822L);
        FuzzerUtils.init(iArr, 29869);

        Test.iFld -= ((--Test.iFld) * Test.iFld);
        for (f = 260; 13 < f; f--) {
            float f1=2.873F;
            Test.iFld *= (int)Math.min(--Test.instanceCount, lArr[(int)(f)][(int)(f)]);
            Test.iFld -= (int)(((Test.iFld - Test.iFld) + (Test.instanceCount |= Test.instanceCount)) - (-(-10L -
                (Test.iFld - i1))));
            Test.instanceCount <<= (Test.iFld + (++Test.iFld));
            f1 -= Test.iFld;
            Test.instanceCount += (long)(f * f);
        }
        for (int i2 : iArr) {
            switch ((((Test.iFld - i3) >>> 1) % 8) + 32) {
            case 32:
                vMeth1(-232);
                for (d2 = 4; d2 > 1; d2 -= 2) {
                    Test.instanceCount = Test.instanceCount;
                    Test.iFld = Test.iFld;
                    Test.dFld += Test.byFld;
                    b1 = b1;
                }
            case 33:
                Test.byFld &= (byte)9;
                break;
            case 34:
                Test.iFld = i2;
                break;
            case 35:
                Test.dArrFld[(i2 >>> 1) % N] += 205L;
                break;
            case 36:
                Test.dFld -= i3;
                break;
            case 37:
                i3 = i18;
                break;
            case 38:
                Test.dArrFld = Test.dArrFld;
            case 39:
                Test.iFld = Test.iFld;
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i1 + i3 + Double.doubleToLongBits(d2) + i17 + (b1 ? 1 : 0) + i18 +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i=0, i19=46, i20=5, i21=-17503, i22=243, i23=15562, i24=8807, i25=-9774, i26=134;
        short s=15474, sArr[]=new short[N];
        boolean b2=true;
        long l2=147L, lArr2[]=new long[N];
        float fArr1[]=new float[N];

        FuzzerUtils.init(sArr, (short)-14006);
        FuzzerUtils.init(fArr1, 2.446F);
        FuzzerUtils.init(lArr2, 10L);

        Test.instanceCount = i;
        vMeth();
        for (i19 = 381; i19 > 16; i19 -= 3) {
            Test.instanceCount += (((i19 * Test.instanceCount) + i20) - i19);
            Test.iFld += (int)Test.instanceCount;
            sArr[i19] *= s;
        }
        Test.byArrFld[(i >>> 1) % N] *= (byte)Test.instanceCount;
        s += (short)Test.iFld;
        i21 = 1;
        while ((i21 += 3) < 210) {
            for (i22 = 358; i22 > 6; i22--) {
                switch ((i21 % 5) + 28) {
                case 28:
                    for (i24 = 1; i24 < 2; ++i24) {
                        Test.instanceCount = i23;
                        i += i;
                        Test.instanceCount += (((i24 * i19) + i24) - i19);
                    }
                    Test.sArrFld[i22 + 1] -= (short)i21;
                case 29:
                    i += (i22 * i22);
                    i += (int)Test.dFld;
                case 30:
                    if (b2) continue;
                    i25 *= (int)Test.instanceCount;
                    for (l2 = 1; 2 > l2; ++l2) {
                        b2 = false;
                        Test.byArrFld[(int)(l2 + 1)] -= (byte)-136;
                        if (true) break;
                        Test.instanceCount -= Test.instanceCount;
                    }
                    break;
                case 31:
                    fArr1[i22 + 1] += i25;
                    switch (((i20 >>> 1) % 7) + 56) {
                    case 56:
                        if (b2) break;
                        i23 = i23;
                        i25 += (27596 + (i22 * i22));
                        break;
                    case 57:
                        Test.iFld += i22;
                        break;
                    case 58:
                        lArr2[i21 + 1] -= i22;
                    case 59:
                        Test.fFld += Test.fFld;
                        break;
                    case 60:
                        Test.iFld = (int)Test.instanceCount;
                    case 61:
                        i23 -= (int)Test.fFld;
                        break;
                    case 62:
                        i25 = i22;
                    }
                    break;
                case 32:
                    i = i25;
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}