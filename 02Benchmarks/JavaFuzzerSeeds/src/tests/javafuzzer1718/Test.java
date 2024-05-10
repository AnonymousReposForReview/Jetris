package tests.javafuzzer1718;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 02:30:00 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2482757058L;
    public double dFld=-97.101747;
    public static boolean bFld=false;
    public byte byFld=-12;
    public boolean bArrFld[]=new boolean[N];
    public static int iArrFld[][]=new int[N][N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -10);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i7=11, i8=183, i9=-4, i10=229, i11=-8;
        short s1=-22114;
        float f2=-108.702F;
        byte by=17;

        for (i7 = 23; i7 < 369; ++i7) {
            s1 = (short)-6;
            i8 += i7;
            for (i9 = 1; i9 < 5; ++i9) {
                i11 = 1;
                do {
                    Test.instanceCount += (((i11 * f2) + i8) - i10);
                    Test.instanceCount -= i7;
                    i10 += by;
                    i10 -= (int)Test.instanceCount;
                    switch ((i9 % 2) + 122) {
                    case 122:
                        i8 = (int)Test.instanceCount;
                        i10 = by;
                    case 123:
                        Test.instanceCount |= i10;
                        i10 += -9434;
                        s1 = (short)Test.instanceCount;
                        break;
                    }
                } while (++i11 < 2);
            }
        }
        vMeth1_check_sum += i7 + i8 + s1 + i9 + i10 + i11 + Float.floatToIntBits(f2) + by;
    }

    public static void vMeth(int i6, long l) {

        short s=-13436;
        float f1=1.405F, f3=0.751F;
        int i12=-173, i13=-12, i14=17252, i15=-154, i16=61559, i17=245, iArr[]=new int[N];

        FuzzerUtils.init(iArr, 8);

        l = (++s);
        s -= (short)Math.max(i6, (int)((Test.instanceCount + i6) - f1));
        vMeth1();
        for (i12 = 1; i12 < 384; i12++) {
            i14 = 4;
            while ((i14 -= 3) > 0) {
                i6 <<= i6;
                iArr[i12 + 1] = (int)Test.instanceCount;
                for (f3 = 1; f3 < 2; ++f3) {
                    i13 += (int)47.127933;
                    if (Test.bFld) continue;
                    i6 = i14;
                    i13 += (int)(((f3 * i13) + i14) - i13);
                }
                for (i16 = 1; i16 < 2; ++i16) {
                    try {
                        i13 = (-122 / i15);
                        i15 = (i12 % -58711);
                        iArr[i12 + 1] = (i15 / -51705);
                    } catch (ArithmeticException a_e) {}
                    Test.instanceCount += (17L + (i16 * i16));
                }
            }
        }
        vMeth_check_sum += i6 + l + s + Float.floatToIntBits(f1) + i12 + i13 + i14 + Float.floatToIntBits(f3) + i15 +
            i16 + i17 + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(int i4, int i5) {


        vMeth(-2, Test.instanceCount);
        long meth_res = i4 + i5;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-198, i1=-12, i2=168, i3=-125, i18=9, i19=5, i20=-13, i21=187, i22=5, i23=-64;
        float f=-2.964F, fArr[]=new float[N];
        boolean b=false;
        short sArr[][]=new short[N][N];

        FuzzerUtils.init(fArr, -1.979F);
        FuzzerUtils.init(sArr, (short)1043);

        for (i = 1; 133 > i; ++i) {
            short s2=4563;
            for (i2 = 190; i2 > 1; i2--) {
                Test.instanceCount -= (long)f;
                bArrFld[i2] = (bArrFld[i2] = (b = (12 < (dFld++))));
                i3 = (int)(((f * dFld) * iMeth(i2, i)) + 11);
            }
            i18 = 1;
            while (++i18 < 190) {
                byFld += (byte)(((i18 * f) + Test.instanceCount) - Test.instanceCount);
            }
            switch (i + 63) {
            case 63:
                i19 = 1;
                do {
                    i3 <<= i1;
                    for (i20 = 1; 1 > i20; i20++) {
                        Test.iArrFld[i20 + 1][i] |= i3;
                        Test.instanceCount += i20;
                    }
                    i22 = 1;
                    do {
                        if (b) continue;
                        i3 >>= (int)Test.instanceCount;
                        f -= i;
                        Test.instanceCount *= i1;
                        i1 = 12;
                        Test.instanceCount -= i19;
                        i1 += -14;
                        Test.iArrFld = Test.iArrFld;
                    } while (++i22 < 1);
                    i1 = i2;
                    Test.iArrFld[i19 - 1][i19 - 1] = (int)f;
                    byFld %= (byte)(i20 | 1);
                    fArr[i] = f;
                } while (++i19 < 190);
                Test.instanceCount = i1;
                s2 = (short)Test.instanceCount;
                Test.iArrFld[i - 1][i - 1] += i21;
            case 64:
                i21 = i3;
                break;
            case 65:
                i3 -= (int)Test.instanceCount;
                break;
            case 66:
                i21 >>= (int)Test.instanceCount;
                break;
            case 67:
                Test.iArrFld[i][i + 1] = (int)Test.instanceCount;
            case 68:
                i21 += (int)(-947111024801285852L + (i * i));
                break;
            case 69:
                try {
                    i1 = (i19 % 1746046108);
                    i1 = (i21 % i18);
                    i21 = (i1 % -52687);
                } catch (ArithmeticException a_e) {}
                break;
            case 70:
                i23 <<= s2;
                break;
            case 71:
                Test.iArrFld[i + 1][i - 1] = i1;
                break;
            case 72:
                i21 = 21941;
                break;
            case 73:
                i1 += (i - i1);
                break;
            case 74:
                i1 = 0;
            case 75:
                i23 += (int)78.966F;
            case 76:
                i3 += byFld;
            case 77:
                i23 -= (int)Test.instanceCount;
                break;
            case 78:
                i23 -= i21;
                break;
            case 79:
                i3 *= (int)Test.instanceCount;
                break;
            case 80:
                i1 |= (int)Test.instanceCount;
                break;
            case 81:
                i21 = (int)Test.instanceCount;
                break;
            case 82:
                Test.instanceCount <<= i23;
                break;
            case 83:
                i3 = (int)-122L;
                break;
            case 84:
                i1 *= i21;
                break;
            case 85:
                if (Test.bFld) break;
            case 86:
                if (Test.bFld) continue;
                break;
            case 87:
                i21 -= -3;
            case 88:
                if (Test.bFld) break;
                break;
            case 89:
                dFld = byFld;
                break;
            case 90:
                Test.instanceCount += (i - byFld);
                break;
            case 91:
                i23 += (((i * i23) + f) - s2);
                break;
            case 92:
                f += 3L;
            case 93:
                i21 += i;
            case 94:
                Test.instanceCount *= i18;
                break;
            case 95:
                f += 0.157F;
                break;
            case 96:
                Test.instanceCount += i;
                break;
            case 97:
                i23 += (((i * i) + Test.instanceCount) - i20);
            case 98:
                sArr[i][i - 1] = (short)Test.instanceCount;
                break;
            case 99:
                s2 |= (short)-76;
            case 100:
                Test.iArrFld[i + 1][i + 1] *= (int)f;
                break;
            case 101:
                i3 = s2;
            case 102:
                i1 -= i3;
                break;
            case 103:
                Test.instanceCount = i20;
                break;
            case 104:
                f += ((long)i ^ (long)Test.instanceCount);
                break;
            case 105:
                i23 += (i * i);
                break;
            case 106:
            case 107:
                if (b) continue;
                break;
            case 108:
                i23 += (i | (long)f);
                break;
            case 109:
                dFld = i18;
                break;
            case 110:
                i3 += (12417 + (i * i));
            case 111:
                i3 -= -20885;
            case 112:
                i3 += (0 + (i * i));
                break;
            case 113:
            case 114:
                i3 *= byFld;
                break;
            case 115:
                i23 -= s2;
                break;
            case 116:
                i3 <<= i21;
                break;
            case 117:
                i3 += i;
            case 118:
                Test.bFld = Test.bFld;
                break;
            case 119:
                sArr[i + 1][i + 1] *= (short)-52L;
                break;
            case 120:
                i23 = 100;
            case 121:
                byFld += (byte)i;
                break;
            case 122:
                i3 += (i * i);
                break;
            case 123:
            case 124:
                bArrFld[i + 1] = Test.bFld;
                break;
            case 125:
                i3 += 23479;
                break;
            case 126:
                i23 = i;
                break;
            case 127:
                i3 += i;
                break;
            case 128:
                i23 = i22;
            case 129:
                lArrFld[i + 1] = i1;
                break;
            case 130:
                f += Test.instanceCount;
                break;
            case 131:
                Test.instanceCount += (long)f;
                break;
            case 132:
                i21 += (i | i20);
                break;
            default:
                Test.instanceCount += -13;
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