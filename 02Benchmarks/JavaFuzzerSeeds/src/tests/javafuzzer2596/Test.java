package tests.javafuzzer2596;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 16:59:40 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=1975945333L;
    public static short sFld=-30593;
    public static int iFld=14;
    public boolean bFld=false;
    public volatile long lArrFld[]=new long[N];
    public byte byArrFld[]=new byte[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l, int i5, float f) {

        int i6=-99, i7=-125, i8=8, i9=4, i10=68, i11=-185;
        byte by=-43;

        for (i6 = 5; 207 > i6; i6++) {
            i7 -= i6;
            for (i8 = 1; i8 < 8; i8++) {
                i5 -= (int)Test.instanceCount;
                switch ((i8 % 6) + 6) {
                case 6:
                    Test.instanceCount = i6;
                    for (i10 = 1; i10 < 2; i10++) {
                        f = i11;
                        f -= f;
                        i7 += (8 + (i10 * i10));
                        i5 >>= (int)l;
                        i9 += (17442 + (i10 * i10));
                        Test.instanceCount = i10;
                        l = 3373685428745687449L;
                    }
                    break;
                case 7:
                    i7 -= 232;
                case 8:
                    i7 >>>= (int)Test.instanceCount;
                    break;
                case 9:
                    i11 ^= -223;
                    break;
                case 10:
                    i5 += (int)l;
                    break;
                case 11:
                    by >>>= (byte)i5;
                    break;
                }
            }
        }
        vMeth2_check_sum += l + i5 + Float.floatToIntBits(f) + i6 + i7 + i8 + i9 + i10 + i11 + by;
    }

    public static void vMeth1() {

        int i12=-20729, i13=-9, i14=9, i16=-62438, i17=-52348, i18=11, i19=16946, i20=-8, iArr[]=new int[N];
        float f1=-2.864F;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -2.122905);
        FuzzerUtils.init(iArr, -42719);

        vMeth2(Test.instanceCount, i12, f1);
        dArr[(132 >>> 1) % N] *= f1;
        try {
            i12 >>= (int)-3551687733L;
            i12 += (int)f1;
        }
        catch (NullPointerException exc1) {
            for (i13 = 7; i13 < 188; ++i13) {
                for (i16 = 9; i16 > i13; i16 -= 3) {
                    for (i18 = 1; i18 < 1; ++i18) {
                        i12 -= i13;
                        i17 >>= i18;
                        i17 -= 33;
                        Test.instanceCount -= -194;
                        iArr[i16] -= (int)Test.instanceCount;
                        i14 += i18;
                        i12 = i16;
                    }
                }
            }
        }
        finally {
            i20 <<= -3;
        }
        vMeth1_check_sum += i12 + Float.floatToIntBits(f1) + i13 + i14 + i16 + i17 + i18 + i19 + i20 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(double d, int i2) {

        int i3=-6, i4=202, i21=-249, i22=-33237, i23=84, i24=103, iArr1[]=new int[N];
        float f3=0.708F, fArr[]=new float[N];

        FuzzerUtils.init(fArr, 2.3F);
        FuzzerUtils.init(iArr1, 50914);

        for (i3 = 2; i3 < 138; i3++) {
            vMeth1();
            d = d;
            i2 -= i3;
            Test.instanceCount >>= i3;
            i2 += (((i3 * i4) + i2) - i3);
        }
        for (i21 = 2; i21 < 190; ++i21) {
            Test.instanceCount += (i21 * Test.instanceCount);
            switch ((i21 % 1) + 123) {
            case 123:
                for (i23 = 1; 8 > i23; i23++) {
                    d = f3;
                    f3 -= Test.instanceCount;
                    Test.sFld = (short)12;
                    iArr1[i23 + 1] = i23;
                    i24 -= (int)Test.instanceCount;
                }
                break;
            default:
                iArr1[i21 - 1] += Test.iFld;
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i2 + i3 + i4 + i21 + i22 + i23 + i24 + Float.floatToIntBits(f3)
            + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=-3, i1=25117, i25=-12667, i26=-50033, i27=-29684, i28=9, i29=-25, i30=1, i31=-28, i32=32974, i33=12,
            iArr2[]=new int[N];
        double d1=0.1234;
        float f4=18.867F, fArr1[]=new float[N];
        long l1=-9L;

        FuzzerUtils.init(iArr2, 90);
        FuzzerUtils.init(fArr1, 2.449F);

        for (i = 7; i < 247; i++) {
            vMeth(d1, i1);
            try {
                Test.iFld = (i1 % 27487);
                iArr2[i + 1] = (Test.iFld / i);
                Test.iFld = (96 % i);
            } catch (ArithmeticException a_e) {}
        }
        lArrFld[(i >>> 1) % N] = -11;
        iArr2[(Test.iFld >>> 1) % N] = i1;
        Test.iFld -= (int)f4;
        if (bFld) {
            for (i25 = 300; i25 > 12; --i25) {
                Test.instanceCount -= (long)f4;
                if (bFld) continue;
                Test.iFld += (int)46253L;
                for (i27 = 2; i27 < 87; ++i27) {
                    i26 >>= i26;
                    for (i29 = 1; i29 < 2; i29++) {
                        i31 += i32;
                    }
                    Test.instanceCount = Test.instanceCount;
                    i28 *= i32;
                    i28 = i1;
                }
                i32 += (int)Test.instanceCount;
                i28 -= 161;
                i33 = i28;
                byArrFld[i25 - 1] = (byte)i1;
                l1 = 87;
                while (--l1 > 0) {
                    i26 *= -54202;
                    i33 = (int)l1;
                    i33 += (int)(l1 * i25);
                    i33 += (int)(l1 ^ i27);
                    i33 += i25;
                    fArr1[i25 + 1] = i27;
                }
                Test.instanceCount = -1944655324L;
            }
        } else if (bFld) {
            i30 = i25;
        } else {
            i26 %= (int)(i | 1);
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