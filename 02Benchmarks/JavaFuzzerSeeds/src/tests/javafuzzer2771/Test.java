package tests.javafuzzer2771;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 19:57:17 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=0L;
    public static short sFld=-852;
    public static volatile double dFld=74.68061;
    public static float fFld=2.378F;
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 6.908F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i3, long l, float f) {

        int i4=-19, i5=-20110, i6=215, i7=-254, i8=144, i9=-1, i10=47, iArr[]=new int[N];
        short s=21258, sArr[]=new short[N];
        boolean b=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(sArr, (short)5466);
        FuzzerUtils.init(lArr, -2270392227867402530L);
        FuzzerUtils.init(iArr, 46914);

        for (i4 = 1; i4 < 158; i4 += 3) {
            if (b) {
                Test.instanceCount = (long)65.56F;
                i3 *= i4;
                i6 = 1;
                while (++i6 < 29) {
                    s += (short)(i6 * i6);
                    sArr = sArr;
                    l += (4403 + (i6 * i6));
                    lArr[i4] = -14275;
                }
            } else {
                i3 &= i4;
                for (i7 = i4; i7 < 29; ++i7) {
                    iArr[i4 - 1] = i5;
                    i9 = 1;
                    do {
                        Test.instanceCount = i9;
                        i10 >>= 5;
                    } while (++i9 < 1);
                }
            }
        }
        vMeth2_check_sum += i3 + l + Float.floatToIntBits(f) + i4 + i5 + i6 + s + (b ? 1 : 0) + i7 + i8 + i9 + i10 +
            FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1() {

        int i=-6, i1=9082, i2=10, i11=-44554, i12=-3, i13=-21888, iArr1[]=new int[N];
        float f1=-1.961F;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr1, 13299);
        FuzzerUtils.init(lArr1, 6098521298714900523L);

        Test.instanceCount = (i--);
        for (i1 = 384; i1 > 15; i1 -= 2) {
            vMeth2(-11, Test.instanceCount, 0.639F);
            i11 = 1;
            do {
                i >>= i1;
                for (i12 = i1; i12 < 1; ++i12) {
                    i13 -= (int)Test.instanceCount;
                    Test.instanceCount += (long)f1;
                    i2 += i2;
                    f1 = Test.sFld;
                    iArr1[i1] *= i11;
                    lArr1[i12 + 1] >>= i11;
                    i2 += (int)-72.97683;
                }
                Test.instanceCount += Test.instanceCount;
                Test.dFld = i12;
            } while (++i11 < 9);
        }
        vMeth1_check_sum += i + i1 + i2 + i11 + i12 + i13 + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(lArr1);
    }

    public static void vMeth() {

        int i14=6, i15=-57186, i16=-33741, i17=-68, iArr2[]=new int[N];
        byte by=51;
        long lArr2[][]=new long[N][N];

        FuzzerUtils.init(lArr2, -8L);
        FuzzerUtils.init(iArr2, -2);

        vMeth1();
        i14 = by;
        lArr2[(i14 >>> 1) % N][(i14 >>> 1) % N] <<= i14;
        i15 = 1;
        do {
            Test.dFld += i15;
            Test.instanceCount *= Test.instanceCount;
            i14 = i14;
            Test.instanceCount += (((i15 * Test.instanceCount) + Test.fFld) - Test.fFld);
            Test.fFld += Test.instanceCount;
            i14 = by;
            iArr2[i15 - 1] = i15;
            for (i16 = 8; i16 > 1; i16--) {
                i14 = i14;
                iArr2[i15 - 1] >>= i16;
                i14 += 25176;
            }
        } while (++i15 < 206);
        vMeth_check_sum += i14 + by + i15 + i16 + i17 + FuzzerUtils.checkSum(lArr2) + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i18=-13, i19=12, i20=-19942, i21=148, i22=-13, i23=-3576, i24=45, iArr3[]=new int[N];
        boolean b1=false;
        long l1=-8023695571776751911L, lArr3[]=new long[N];
        byte by1=25;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 1.105567);
        FuzzerUtils.init(lArr3, 59098L);
        FuzzerUtils.init(iArr3, -36432);

        vMeth();
        Test.dFld += -2.30290;
        i18 = 1;
        do {
            i19 -= (int)Test.instanceCount;
            switch (((i18 % 8) * 5) + 27) {
            case 41:
                i19 = (int)Test.instanceCount;
                b1 = b1;
                Test.instanceCount += (((i18 * i19) + Test.instanceCount) - i18);
                break;
            case 30:
            case 39:
                i19 = i19;
                dArr[i18 - 1] -= 44;
                Test.instanceCount += i19;
                break;
            case 56:
                Test.fFld -= 6112586247655275905L;
                Test.instanceCount |= i19;
                lArr3[i18] -= Test.sFld;
                break;
            case 50:
                for (i20 = i18; i20 < 76; i20++) {
                    iArr3 = iArr3;
                    i21 = i19;
                    for (l1 = 1; i20 < l1; l1--) {
                        i19 += (int)(l1 ^ i21);
                        i22 >>= by1;
                    }
                    if (b1) {
                        lArr3[i20 + 1] += i22;
                        for (i23 = 1; i23 > 1; --i23) {
                            i19 = i21;
                            Test.fArrFld[i20] += l1;
                            i24 += (4 + (i23 * i23));
                            i19 = i22;
                            i21 += (((i23 * i23) + l1) - i22);
                        }
                    }
                    by1 += (byte)(i20 - i22);
                    Test.fFld += (i20 * i22);
                }
                break;
            case 55:
                i24 -= i23;
                break;
            case 40:
                i22 -= (int)Test.instanceCount;
                break;
            case 51:
                iArr3[i18 + 1] = (int)-51.363F;
            default:
                try {
                    iArr3[i18 + 1] = (i22 % i18);
                    i19 = (iArr3[i18] % 1264372244);
                    iArr3[i18] = (i21 / 45);
                } catch (ArithmeticException a_e) {}
            }
        } while (++i18 < 330);


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
