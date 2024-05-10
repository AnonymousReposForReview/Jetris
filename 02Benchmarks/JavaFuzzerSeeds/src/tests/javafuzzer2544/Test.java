package tests.javafuzzer2544;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 16:26:41 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-47254L;
    public static float fFld=-1.969F;
    public static int iFld=43554;
    public static short sFld=-17816;
    public static short sArrFld[][]=new short[N][N];
    public static double dArrFld[][]=new double[N][N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)-2806);
        FuzzerUtils.init(Test.dArrFld, 31.55675);
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(double d1, int i6, int i7) {

        long l=-6L, l1=-2591291843L;
        int i8=208, i9=-21757, i10=-62485, i11=51085;

        for (l = 1; l < 207; l++) {
            i7 += (int)l;
            Test.sArrFld[(int)(l + 1)][(int)(l + 1)] -= (short)-111;
            Test.instanceCount *= Test.instanceCount;
            for (i9 = (int)(l); i9 < 8; i9++) {
                Test.fFld += Test.instanceCount;
            }
            i10 += (int)(((l * i6) + l) - i8);
            i11 = 1;
            do {
                switch (((-16478 >>> 1) % 4) + 55) {
                case 55:
                    l1 = 1;
                    do {
                        i8 = (int)l;
                        Test.instanceCount += (((l1 * i11) + l) - i8);
                        Test.instanceCount = l;
                        i7 += (int)(l1 ^ i7);
                        i7 += (int)(l1 ^ i9);
                    } while (++l1 < 1);
                    break;
                case 56:
                    i10 += i11;
                case 57:
                    Test.instanceCount = l1;
                    break;
                case 58:
                    i10 = i10;
                    break;
                }
            } while (++i11 < 8);
        }
        vMeth2_check_sum += Double.doubleToLongBits(d1) + i6 + i7 + l + i8 + i9 + i10 + i11 + l1;
    }

    public static void vMeth1() {

        int i=-22123, i1=-239, i2=-7, i3=-29727, i4=44, i5=-37545;
        byte by=-91;
        double d=-2.20000;
        short s=24826;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -65.887F);

        for (i = 16; i < 259; ++i) {
            by *= by;
            d += Math.abs(Test.instanceCount);
            for (i2 = 7; i2 > i; --i2) {
                for (i4 = 1; i4 < 1; i4++) {
                    i3 += (int)((++i5) * ((++Test.instanceCount) + (i3 + 133L)));
                    vMeth2(d, i1, i);
                    i5 += (i4 * s);
                    i5 -= i2;
                    by *= (byte)i5;
                    Test.instanceCount += (i4 | i);
                    by += (byte)-50054;
                    if (i2 != 0) {
                        vMeth1_check_sum += i + i1 + by + Double.doubleToLongBits(d) + i2 + i3 + i4 + i5 + s +
                            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                        return;
                    }
                    Test.instanceCount = Test.iFld;
                }
                fArr[i2] = 0.55F;
            }
        }
        vMeth1_check_sum += i + i1 + by + Double.doubleToLongBits(d) + i2 + i3 + i4 + i5 + s +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void vMeth() {

        int i12=-26805, i13=-9, i14=5, i15=-7, i16=-26519, iArr[]=new int[N];
        byte by1=-56;

        FuzzerUtils.init(iArr, -104);

        vMeth1();
        for (i12 = 4; i12 < 224; i12++) {
            Test.iFld <<= Test.iFld;
            switch (((i12 % 2) * 5) + 119) {
            case 123:
                Test.iFld += 247;
                break;
            case 128:
                i13 -= (int)Test.instanceCount;
                i13 %= (int)(i13 | 1);
                for (i14 = 1; i14 < 7; ++i14) {
                    i16 = 1;
                    while (++i16 < 2) {
                        iArr[i16] += by1;
                        i15 = i16;
                        Test.fFld *= 13;
                        Test.instanceCount += i16;
                    }
                    Test.dArrFld[i14][i14 - 1] += 44;
                    i15 = i13;
                }
                break;
            default:
                Test.instanceCount = i12;
            }
        }
        vMeth_check_sum += i12 + i13 + i14 + i15 + i16 + by1 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i17=-42, i18=-166, i19=-114, i20=32, i21=203, iArr1[]=new int[N];
        boolean b=false;
        float f=-127.314F, fArr1[]=new float[N];

        FuzzerUtils.init(iArr1, 13);
        FuzzerUtils.init(fArr1, 0.241F);

        vMeth();
        iArr1[(Test.iFld >>> 1) % N] += Test.iFld;
        iArr1[(-10 >>> 1) % N] = Test.iFld;
        for (i17 = 2; i17 < 171; i17++) {
            i18 = -36552;
            for (i19 = 6; i19 < 148; i19++) {
                if (b) break;
                f = 1;
                do {
                    Test.sFld += (short)Test.instanceCount;
                    Test.instanceCount += (long)(f + i17);
                    if (b) continue;
                    b = b;
                    switch ((int)(((f % 5) * 5) + 80)) {
                    case 88:
                        Test.fFld += f;
                        i20 *= i19;
                    case 102:
                        Test.iFld = i17;
                        i18 = i19;
                        break;
                    case 100:
                        i20 += (int)(2L + (f * f));
                        iArr1[i17] >>= (int)Test.instanceCount;
                        iArr1[(int)(f + 1)] = i17;
                        Test.iFld += (int)f;
                        break;
                    case 99:
                        Test.instanceCount += i20;
                        i18 = Test.sFld;
                        Test.bArrFld[(i19 >>> 1) % N] = b;
                    case 103:
                        iArr1[i17 + 1] += i18;
                        fArr1[(int)(f + 1)] = i18;
                        i21 -= i21;
                    }
                    i18 += (int)(f * f);
                    if (b) break;
                } while (++f < 2);
                i21 -= (int)Test.instanceCount;
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
