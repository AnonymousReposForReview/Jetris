package tests.javafuzzer1381;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 19:14:38 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-102L;
    public static boolean bFld=true;
    public static int iFld=5;
    public static double dFld=-78.118208;
    public static volatile byte byFld=-10;
    public float fFld=-102.35F;
    public static int iFld1=2;
    public int iFld2=-36739;
    public static float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];
    public boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 0.337F);
        FuzzerUtils.init(Test.iArrFld, 107);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i3, int i4) {

        int i5=0, i6=164, i7=29, i8=-2, i9=-25862, iArr[]=new int[N];
        byte by=78;
        double d=1.17358, dArr[]=new double[N];
        float f=-45.335F;
        short s=23739;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -55139L);
        FuzzerUtils.init(iArr, -109);
        FuzzerUtils.init(dArr, -2.265);

        i4 -= (int)Test.instanceCount;
        for (i5 = 5; i5 < 182; i5 += 2) {
            lArr[i5 + 1] *= by;
            i3 = (int)-7L;
            i7 = 1;
            while (++i7 < 18) {
                i3 = (int)d;
                f += ((long)i7 | (long)i6);
                for (i8 = 1; i8 > i7; --i8) {
                    i3 += i8;
                    iArr[i5] -= (int)-2.36F;
                    switch (((i5 % 10) * 5) + 27) {
                    case 68:
                        i6 += (((i8 * i5) + i5) - i4);
                        iArr[i7 + 1] *= i8;
                        i9 += i9;
                        s -= s;
                        break;
                    case 57:
                        i9 += (i8 * i8);
                        break;
                    case 53:
                        dArr = FuzzerUtils.double1array(N, (double)0.123659);
                        break;
                    case 38:
                    case 40:
                        i4 -= i9;
                        break;
                    case 73:
                        i4 += (((i8 * i9) + s) - by);
                    case 65:
                        lArr = lArr;
                        break;
                    case 66:
                        Test.instanceCount = i4;
                    case 59:
                    case 35:
                    }
                }
            }
        }
        vMeth2_check_sum += i3 + i4 + i5 + i6 + by + i7 + Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i8 +
            i9 + s + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth1() {

        int i10=62973, i11=34560, i12=-6, i13=-83, i14=-8468, i15=3, iArr1[][]=new int[N][N];
        float f1=-2.151F;
        byte by1=119, byArr[][]=new byte[N][N];
        long l=-48624L;

        FuzzerUtils.init(iArr1, -14);
        FuzzerUtils.init(byArr, (byte)116);

        vMeth2(i10, i10);
        iArr1[(i10 >>> 1) % N][(-60699 >>> 1) % N] = (int)f1;
        for (i11 = 7; i11 < 183; ++i11) {
            i10 += (((i11 * i11) + Test.instanceCount) - by1);
            for (l = 1; l < 9; ++l) {
                i10 += (int)(l * l);
                Test.fArrFld[(int)(l)] += i11;
                i13 += (int)(((l * l) + i11) - i11);
                for (i14 = (int)(l); i14 < 2; i14++) {
                    if (Test.bFld) break;
                    byArr[i14 + 1][(int)(l - 1)] = (byte)Test.iFld;
                    if (false) {
                        Test.instanceCount -= (long)Test.dFld;
                        Test.instanceCount += Test.instanceCount;
                        i15 = i15;
                    } else {
                        i10 += (((i14 * Test.iFld) + f1) - i13);
                        vMeth1_check_sum += i10 + Float.floatToIntBits(f1) + i11 + i12 + by1 + l + i13 + i14 + i15 +
                            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(byArr);
                        return;
                    }
                }
            }
        }
        vMeth1_check_sum += i10 + Float.floatToIntBits(f1) + i11 + i12 + by1 + l + i13 + i14 + i15 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(byArr);
    }

    public static void vMeth() {

        float f2=77.127F;
        int i16=44, i17=56, i19=2403, i20=-192, i21=12, i22=-5, i23=4, i24=15938, iArr2[]=new int[N];
        short s1=19878;

        FuzzerUtils.init(iArr2, -39494);

        if (Test.bFld) {
            vMeth1();
            f2 *= 65237;
            for (i16 = 13; i16 < 328; i16++) {
                for (i19 = 5; i19 > 1; --i19) {
                    if (i17 != 0) {
                        vMeth_check_sum += Float.floatToIntBits(f2) + i16 + i17 + i19 + i20 + i21 + i22 + s1 + i23 +
                            i24 + FuzzerUtils.checkSum(iArr2);
                        return;
                    }
                    i17 += (i19 ^ Test.iFld);
                    for (i21 = 1; i21 < 2; i21++) {
                        i22 ^= s1;
                        i20 += (int)f2;
                        Test.instanceCount += (i21 + i16);
                    }
                    for (i23 = 1; i23 < 2; ++i23) {
                        if (true) break;
                        Test.iFld += 10660;
                        Test.instanceCount >>= i21;
                    }
                }
            }
        } else {
            Test.instanceCount = i17;
        }
        vMeth_check_sum += Float.floatToIntBits(f2) + i16 + i17 + i19 + i20 + i21 + i22 + s1 + i23 + i24 +
            FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i=-48, i1=8950, i2=234, i25=240, i26=212, i27=121, i28=1, i29=6, i30=-7, i31=58988, i32=0;
        byte by2=-16;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 240L);

        i *= (i--);
        for (i1 = 15; 390 > i1; i1++) {
            i += (i1 * i);
            i2 += (i1 ^ i1);
            vMeth();
            i += i2;
            i += (i1 - i1);
            Test.iArrFld[i1 + 1] -= i2;
            Test.iFld += (i1 * Test.byFld);
            switch ((i1 % 4) + 57) {
            case 57:
                for (i25 = 1; i25 < 67; ++i25) {
                    Test.iArrFld[i1] = (int)1.42242;
                }
                for (i27 = 2; i27 < 67; i27++) {
                    for (i29 = 1; i29 < 2; ++i29) {
                        i28 >>= (int)Test.instanceCount;
                        fFld = i26;
                        Test.dFld += Test.instanceCount;
                        i26 >>= i1;
                        i28 ^= i30;
                        Test.instanceCount += (((i29 * Test.byFld) + i1) - fFld);
                        lArr1[i29] = Test.instanceCount;
                        Test.bFld = Test.bFld;
                        i28 += (((i29 * i29) + i28) - Test.iFld1);
                        i2 += i29;
                    }
                }
                Test.iArrFld[i1 - 1] = i1;
                for (i31 = 1; 67 > i31; i31++) {
                    bArrFld[i31 + 1] = Test.bFld;
                    iFld2 -= by2;
                    i += -32155;
                    Test.iArrFld[i1 - 1] = (int)Test.instanceCount;
                }
            case 58:
                Test.iArrFld[i1 - 1] <<= (int)2200575005L;
            case 59:
                by2 >>>= (byte)i27;
                break;
            case 60:
                Test.instanceCount += (long)1.661F;
                break;
            default:
                if (Test.bFld) continue;
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
