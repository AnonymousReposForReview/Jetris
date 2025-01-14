package tests.javafuzzer1269;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 17:34:25 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3148277239L;
    public static boolean bFld=true;
    public static float fFld=54.303F;
    public static double dFld=1.103685;
    public static double dArrFld[]=new double[N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 2.66820);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l1, long l2, int i2) {

        byte by=121;
        short s=-32687;

        i2 = by;
        i2 = s;
        vMeth2_check_sum += l1 + l2 + i2 + by + s;
    }

    public static void vMeth1() {

        int i3=1, i4=22589, i5=44, i6=-46823, i7=0, i8=-2, i9=-5, iArr[][]=new int[N][N];
        float f1=-110.664F;
        byte by1=-120;
        double d1=-2.5695;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(iArr, -17830);

        vMeth2(Test.instanceCount, Test.instanceCount, i3);
        for (i4 = 3; 138 > i4; i4++) {
            for (i6 = 12; i6 > i4; i6 -= 2) {
                f1 = by1;
            }
            i7 += (((i4 * i7) + i4) - i3);
            i3 -= i4;
            for (i8 = 1; i8 < 12; ++i8) {
                Test.instanceCount = Test.instanceCount;
                bArr[i8] = Test.bFld;
                i3 += (int)d1;
                i7 = i6;
            }
        }
        i9 >>= i9;
        iArr[(28 >>> 1) % N][(-29 >>> 1) % N] *= (int)-46.562F;
        iArr[(i6 >>> 1) % N][(i8 >>> 1) % N] %= (int)(Test.instanceCount | 1);
        i3 &= i8;
        vMeth1_check_sum += i3 + i4 + i5 + i6 + i7 + Float.floatToIntBits(f1) + by1 + i8 + i9 +
            Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(boolean b, long l, double d) {

        int i=248, i1=-62725, i10=-54455, i11=42271, i12=-28231;
        float f2=6.498F;

        for (i = 2; i < 140; i++) {
            float f=2.767F;
            i1 *= (int)((--f) + l);
            i1 = i;
        }
        b = b;
        vMeth1();
        i1 = -49519;
        for (f2 = 222; f2 > 6; f2--) {
            i1 <<= i10;
            for (i11 = 7; i11 > 1; i11 -= 2) {
                if (b) continue;
                i12 |= i10;
                i12 = (int)l;
                i10 <<= i10;
                if (Test.bFld) break;
            }
            Test.fFld += Test.fFld;
        }
        vMeth_check_sum += (b ? 1 : 0) + l + Double.doubleToLongBits(d) + i + i1 + Float.floatToIntBits(f2) + i10 + i11
            + i12;
    }

    public void mainTest(String[] strArr1) {

        int i13=4, i14=195, i15=191, i16=3939, i17=1, i18=6318, i19=-196, i20=-58711, i21=-192;
        long l3=-954015780355290368L, lArr[]=new long[N];
        byte by2=-6;

        FuzzerUtils.init(lArr, -42252L);

        vMeth(Test.bFld, Test.instanceCount, Test.dFld);
        i13 = i13;
        Test.instanceCount += (long)Test.fFld;
        for (i14 = 2; i14 < 272; ++i14) {
            i13 += i14;
            i13 += (int)Test.fFld;
            Test.dArrFld[i14 + 1] = Test.instanceCount;
            for (i16 = 3; i16 < 93; i16++) {
                Test.instanceCount = 2;
                i13 >>= i16;
                lArr[i16 + 1] ^= i17;
                if (true) continue;
            }
            Test.fFld = i17;
            Test.dFld = 1.512F;
            i13 -= i16;
            Test.instanceCount = i14;
            iArrFld[i14 - 1] = i17;
            i18 = 1;
            while (++i18 < 93) {
                i15 += (int)-1.49715;
                i17 += i18;
                i17 += i18;
                Test.bFld = true;
            }
        }
        for (i19 = 7; i19 < 291; ++i19) {
            i20 = 8;
            switch (((i19 % 10) * 5) + 27) {
            case 52:
                for (l3 = 1; l3 < 89; l3++) {
                    Test.instanceCount -= Test.instanceCount;
                    i15 = -24;
                    i17 += (int)l3;
                    i17 >>>= i15;
                }
            case 43:
                i15 += (-146 + (i19 * i19));
                break;
            case 50:
                Test.instanceCount = i13;
                break;
            case 49:
                i13 = i19;
                break;
            case 35:
                lArr[(-145 >>> 1) % N] /= (i21 | 1);
                break;
            case 56:
            case 62:
                Test.fFld -= Test.instanceCount;
                break;
            case 44:
                i15 *= by2;
                break;
            case 67:
                Test.instanceCount <<= i16;
                break;
            case 42:
                i17 <<= 4;
                break;
            default:
                Test.dFld -= Test.instanceCount;
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
