package tests.javafuzzer3015;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 00:46:14 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-407172289L;
    public boolean bFld=true;
    public double dFld=-70.34838;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[][]=new long[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 65214);
        FuzzerUtils.init(Test.lArrFld, 3378288101L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i9=6, i10=9, i11=-14, i12=-15491, i13=-13369, i14=6;
        float f=0.368F;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -4L);

        for (i9 = 10; i9 < 219; ++i9) {
            lArr1[i9 - 1] = i10;
            i10 = (int)1L;
            for (i11 = 1; i11 < 8; i11++) {
                f = i10;
                for (i13 = 1; i13 < 2; i13 += 3) {
                    switch (((i11 >>> 1) % 2) + 93) {
                    case 93:
                        lArr1[i11 + 1] = i10;
                        break;
                    case 94:
                        i12 += i14;
                        f = i14;
                        i12 += 45373;
                        f = 0L;
                        break;
                    }
                    i12 = i14;
                    Test.instanceCount <<= i9;
                    i10 += (((i13 * i12) + f) - f);
                }
            }
        }
        vMeth1_check_sum += i9 + i10 + i11 + i12 + Float.floatToIntBits(f) + i13 + i14 + FuzzerUtils.checkSum(lArr1);
    }

    public static void vMeth(long l) {

        int i6=-38887, i7=-162, i8=-63874;
        boolean b=true, bArr[]=new boolean[N];
        float f1=-96.304F;
        byte by=22;
        double d=1.20008;

        FuzzerUtils.init(bArr, false);

        i6 = 1;
        while (++i6 < 204) {
            for (i7 = 8; 1 < i7; i7 -= 2) {
                if (b = (bArr[i6 - 1] && (bArr[i7] = (b && b)))) break;
                i8 += (i7 + l);
                vMeth1();
                if (i8 != 0) {
                    vMeth_check_sum += l + i6 + i7 + i8 + (b ? 1 : 0) + Float.floatToIntBits(f1) + by +
                        Double.doubleToLongBits(d) + FuzzerUtils.checkSum(bArr);
                    return;
                }
                f1 += i7;
                l -= i6;
                switch ((i6 % 8) + 107) {
                case 107:
                    i8 += i8;
                case 108:
                    if (false) {
                        i8 -= (int)Test.instanceCount;
                    } else {
                        Test.lArrFld[i6 + 1][i6] >>= by;
                        f1 = i7;
                    }
                    i8 += (int)d;
                    break;
                case 109:
                    i8 = i7;
                    break;
                case 110:
                    Test.iArrFld[i7 - 1] = (int)Test.instanceCount;
                case 111:
                    l -= i8;
                    break;
                case 112:
                    Test.iArrFld[(i8 >>> 1) % N] = (int)l;
                    break;
                case 113:
                    Test.instanceCount += by;
                    break;
                case 114:
                default:
                    f1 = Test.instanceCount;
                }
            }
        }
        vMeth_check_sum += l + i6 + i7 + i8 + (b ? 1 : 0) + Float.floatToIntBits(f1) + by + Double.doubleToLongBits(d)
            + FuzzerUtils.checkSum(bArr);
    }

    public static int iMeth() {

        int i1=25833, i2=213, i3=7, i4=19182, i5=-112, i15=2690, i16=198;
        long lArr[]=new long[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(lArr, -3698094452L);
        FuzzerUtils.init(dArr, -45.105206);

        for (int i : Test.iArrFld) {
            i = (int)((lArr[(i >>> 1) % N] = i) * (i--));
            i += (Integer.reverseBytes((int)(i * Test.instanceCount)) + (i--));
            for (i1 = 1; 4 > i1; i1++) {
                for (i3 = 1; 2 > i3; ++i3) {
                    dArr[i1] = (-((i + i5) - i5));
                }
                vMeth(Test.instanceCount);
                Test.iArrFld = Test.iArrFld;
                for (i15 = i1; i15 < 2; ++i15) {
                    Test.lArrFld[i1 - 1][i15] += 160;
                    Test.iArrFld[(i15 >>> 1) % N] <<= i;
                    i16 >>= i16;
                    i5 = 166;
                    Test.instanceCount += Test.instanceCount;
                }
                i16 += (i1 ^ i2);
            }
        }
        long meth_res = i1 + i2 + i3 + i4 + i5 + i15 + i16 + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i17=-47353, i18=64157, i19=-12, i20=-184, i21=0, i22=29099, i23=10, i24=-13, i25=-23534, i26=10, i27=-14,
            i28=10, i29=17949;
        long l1=-4424293667299424430L;
        short s=11203, sArr[]=new short[N];
        float f2=2.625F;

        FuzzerUtils.init(sArr, (short)-25660);

        iMeth();
        Test.instanceCount >>= i17;
        for (i18 = 6; i18 < 295; ++i18) {
            i19 &= 12;
        }
        for (i20 = 14; i20 < 297; i20++) {
            for (l1 = 3; l1 < 89; ++l1) {
                Test.instanceCount -= i21;
                Test.instanceCount = i20;
                i17 += (int)(l1 - i18);
            }
            i23 = 1;
            do {
                try {
                    i21 = (Test.iArrFld[i20] % i17);
                    i19 = (i22 % -23426);
                    i17 = (-350974118 % i21);
                } catch (ArithmeticException a_e) {}
                try {
                    i19 = (i20 % 20442);
                    i19 = (i17 / 15556);
                    i19 = (-223 % Test.iArrFld[i23 - 1]);
                } catch (ArithmeticException a_e) {}
                bFld = bFld;
            } while (++i23 < 89);
            switch ((i20 >>> 1) % 7) {
            case 0:
                i21 = i21;
                Test.instanceCount += l1;
                break;
            case 1:
                i24 = 1;
                do {
                    for (i25 = i24; 1 > i25; i25 += 3) {
                        sArr = FuzzerUtils.short1array(N, (short)12686);
                        s += (short)(((i25 * i26) + Test.instanceCount) - l1);
                        i26 += (int)-21514L;
                    }
                    i22 = i27;
                } while (++i24 < 89);
                Test.instanceCount -= i26;
                i19 += i17;
            case 2:
                f2 += (-20658 + (i20 * i20));
                if (bFld) break;
                for (i28 = 1; i28 < 89; i28++) {
                    byte by1=-37;
                    i27 += (i28 + i21);
                    i27 += (i28 * i24);
                    by1 = (byte)-12;
                }
            case 3:
                Test.lArrFld[i20 - 1][i20] = Test.instanceCount;
                break;
            case 4:
                f2 *= -2;
                break;
            case 5:
                dFld = l1;
                break;
            case 6:
                s += (short)Test.instanceCount;
                break;
            default:
                if (bFld) continue;
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
