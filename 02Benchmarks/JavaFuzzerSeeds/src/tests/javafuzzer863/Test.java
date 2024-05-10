package tests.javafuzzer863;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 10:56:00 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=13L;
    public static int iFld=11;
    public static boolean bFld=false;
    public static volatile int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 38373);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(byte by1, double d1, int i6) {

        int i8=-35, i9=-13, i10=187, iArr[]=new int[N];
        float f=-80.897F;
        boolean b1=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 11);
        FuzzerUtils.init(lArr, -245L);

        i6 *= i6;
        for (int i7 : iArr) {
            switch ((((i7 >>> 1) % 8) * 5) + 23) {
            case 57:
                i8 = 1;
                do {
                    lArr[i8] -= (long)f;
                    i6 = (int)f;
                    i7 = i6;
                    for (i9 = 1; 1 > i9; ++i9) {
                        i6 = -204;
                        i7 <<= (int)Test.instanceCount;
                        i7 = (int)Test.instanceCount;
                    }
                    i7 += (int)Test.instanceCount;
                    i6 += (((i8 * i10) + i10) - Test.instanceCount);
                    Test.instanceCount += i8;
                } while (++i8 < 4);
                i6 *= i10;
                break;
            case 41:
                Test.instanceCount %= (i9 | 1);
                break;
            case 54:
                i7 *= i6;
                break;
            case 46:
                if (i10 != 0) {
                    vMeth2_check_sum += by1 + Double.doubleToLongBits(d1) + i6 + i8 + Float.floatToIntBits(f) + i9 +
                        i10 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
                    return;
                }
                break;
            case 44:
                i10 *= (int)f;
                break;
            case 24:
                if (b1) break;
                break;
            case 43:
            case 52:
                f += i10;
                break;
            }
        }
        vMeth2_check_sum += by1 + Double.doubleToLongBits(d1) + i6 + i8 + Float.floatToIntBits(f) + i9 + i10 + (b1 ? 1
            : 0) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(int i1) {

        double d=-115.78363, d2=3.101662;
        int i2=56577, i3=-63914, i4=131, i5=23, i11=171;
        byte by2=87;
        float f1=-108.399F;
        short s=-3402;
        boolean b2=true;

        d = (++i1);
        for (i2 = 4; 314 > i2; ++i2) {
            for (i4 = 1; i4 < 5; ++i4) {
                i3 <<= i4;
                vMeth2((byte)(-17), d, i3);
                for (d2 = 1; d2 < 2; d2++) {
                    d *= Test.instanceCount;
                    by2 -= (byte)Test.instanceCount;
                    f1 += (float)(((d2 * Test.instanceCount) + s) - i3);
                    Test.iArrFld[i2] += (int)Test.instanceCount;
                    Test.iArrFld[i2 - 1] = (int)-36L;
                    if (b2) continue;
                    Test.instanceCount += (long)((long)d2 ^ (long)f1);
                }
                if (true) break;
            }
            f1 = Test.instanceCount;
        }
        vMeth1_check_sum += i1 + Double.doubleToLongBits(d) + i2 + i3 + i4 + i5 + Double.doubleToLongBits(d2) + i11 +
            by2 + Float.floatToIntBits(f1) + s + (b2 ? 1 : 0);
    }

    public static void vMeth(byte by, int i, boolean b) {


        vMeth1(i);
        Test.instanceCount += i;
        i = i;
        vMeth_check_sum += by + i + (b ? 1 : 0);
    }

    public void mainTest(String[] strArr1) {

        byte by3=-36;
        int i12=-39150, i13=11, i14=-201, i15=50908, i16=47, i17=-40644, i18=-9, i19=24, i20=-54994, i21=-12;
        double d3=0.43048;
        float f2=2.663F, fArr[]=new float[N];
        short s1=-28398;

        FuzzerUtils.init(fArr, 2.236F);

        vMeth(by3, Test.iFld, Test.bFld);
        i12 = 230;
        while (--i12 > 0) {
            d3 = -55629;
            for (i13 = 109; i13 > i12; i13 -= 3) {
                Test.iFld *= i12;
                Test.bFld = false;
                Test.iArrFld[i13] %= (int)(Test.iFld | 1);
                Test.instanceCount = (long)f2;
                Test.instanceCount += (((i13 * i12) + s1) - by3);
                Test.iArrFld[i12 - 1] += -50641;
                if (Test.bFld) break;
            }
        }
        for (i15 = 2; i15 < 199; ++i15) {
            Test.iFld = (int)Test.instanceCount;
            d3 -= i16;
            Test.instanceCount += (i15 + i14);
            for (i17 = i15; 127 > i17; i17++) {
                i14 -= Test.iFld;
                i19 = 1;
                do {
                    i14 *= (int)Test.instanceCount;
                    Test.instanceCount = i14;
                    Test.iArrFld[i15] >>= i17;
                } while (++i19 < 1);
                i16 <<= by3;
                i16 = i12;
                i14 = i18;
                i16 += -28720;
                fArr[i17 + 1] -= (float)d3;
            }
            for (i20 = 5; i20 < 127; ++i20) {
                i18 *= i17;
            }
            Test.instanceCount -= -5;
            i14 += i17;
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
