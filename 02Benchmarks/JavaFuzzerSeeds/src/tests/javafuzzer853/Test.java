package tests.javafuzzer853;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 10:55:11 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=6L;
    public boolean bFld=false;
    public static volatile double dFld=-9.57372;
    public short sFld=-13839;

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i11, int i12, short s) {

        double d=68.40086;
        int i13=-7, i14=5262, i15=-19904, i16=-2, i17=65113;
        float f=-23.212F;
        boolean b1=false;

        for (d = 5; 142 > d; d++) {
            for (i14 = 11; i14 > 1; i14--) {
                Test.instanceCount += (long)f;
                Test.instanceCount += (i14 * i14);
                if (b1) continue;
                i11 += (((i14 * Test.instanceCount) + i13) - i14);
                i12 += (i14 * i15);
                i12 = i15;
                Test.instanceCount += Test.instanceCount;
                Test.instanceCount = i13;
                if (b1) continue;
            }
            for (i16 = 1; i16 < 11; ++i16) {
                if (i14 != 0) {
                    vMeth1_check_sum += i11 + i12 + s + Double.doubleToLongBits(d) + i13 + i14 + i15 +
                        Float.floatToIntBits(f) + (b1 ? 1 : 0) + i16 + i17;
                    return;
                }
                i12 = (int)d;
            }
            Test.instanceCount >>= i11;
        }
        vMeth1_check_sum += i11 + i12 + s + Double.doubleToLongBits(d) + i13 + i14 + i15 + Float.floatToIntBits(f) +
            (b1 ? 1 : 0) + i16 + i17;
    }

    public static int iMeth(int i9, int i10, byte by1) {

        short s1=-7264;
        float f1=2.418F, f2=-2.392F;
        int i18=-166, i19=-51099, i20=29856, i21=8, i22=39873, i23=39582, i24=218, i25=-47727, i27=0, iArr1[]=new
            int[N];
        long l=182L;

        FuzzerUtils.init(iArr1, 13);

        vMeth1(i9, i10, s1);
        for (f1 = 8; f1 < 266; ++f1) {
            f2 -= i9;
            switch ((int)((f1 % 7) + 60)) {
            case 60:
            case 61:
                for (l = 6; l > 1; l -= 3) {
                    for (i20 = 1; i20 < 6; ++i20) {
                        Test.instanceCount += (-106 + (i20 * i20));
                        i18 += (((i20 * f1) + i9) - i21);
                        Test.instanceCount += i20;
                    }
                    Test.instanceCount = 111;
                    i19 = i18;
                }
                for (i22 = 1; 6 > i22; ++i22) {
                    for (i24 = 1; i24 < 2; i24 += 2) {
                        double d1=-98.70261;
                        d1 -= i25;
                        Test.instanceCount = -1;
                    }
                }
                break;
            case 62:
                Test.instanceCount *= i18;
                break;
            case 63:
                i9 -= i18;
                break;
            case 64:
                by1 = (byte)i10;
                break;
            case 65:
                f2 -= 65304;
                break;
            case 66:
                i27 *= i19;
                break;
            }
        }
        long meth_res = i9 + i10 + by1 + s1 + Float.floatToIntBits(f1) + i18 + Float.floatToIntBits(f2) + l + i19 + i20
            + i21 + i22 + i23 + i24 + i25 + i27 + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(byte by, boolean b) {

        int i1=25720, i2=77, i3=-61691, i4=17, i5=-9, i6=10, i7=9593, i8=-22933, i28=-75, i29=4, iArr[]=new int[N];
        float f3=0.491F;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 0);
        FuzzerUtils.init(lArr, -175L);

        for (i1 = 14; i1 < 357; i1++) {
            iArr[i1 + 1] = 100;
        }
        for (i3 = 16; i3 < 302; ++i3) {
            for (i5 = 1; i5 < 6; i5++) {
                Test.instanceCount *= (Integer.reverseBytes(iArr[i3 + 1] -= i6) + (iArr[i5]++));
                try {
                    i2 = (iArr[i3] % 43927);
                    i2 = (-223 / i6);
                    iArr[i5] = (i4 % i5);
                } catch (ArithmeticException a_e) {}
            }
            lArr[i3] *= (i6--);
            for (i7 = 1; 6 > i7; i7++) {
                if (iMeth(i5, 215, by) >= i1) continue;
                for (i28 = 1; i28 < 2; i28++) {
                    i6 /= (int)(i7 | 1);
                    i29 <<= i7;
                }
                i4 = i4;
                iArr[i7 + 1] -= i4;
                f3 /= (i5 | 1);
            }
        }
        vMeth_check_sum += by + (b ? 1 : 0) + i1 + i2 + i3 + i4 + i5 + i6 + i7 + i8 + i28 + i29 +
            Float.floatToIntBits(f3) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr3) {

        byte by2=-105;
        float f4=-76.824F, f5=-1.699F, fArr[]=new float[N];
        int i30=-146, i31=-11, i32=-4238, i33=-3, i34=-18974, i35=-49004, i36=-11286, i37=11, iArr2[][]=new int[N][N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr2, -12);
        FuzzerUtils.init(lArr1, 4182607344L);
        FuzzerUtils.init(fArr, 0.460F);

        vMeth(by2, bFld);
        Test.instanceCount *= (long)f4;
        i30 = 1;
        do {
            Test.dFld = Test.instanceCount;
            for (i31 = i30; i31 < 179; ++i31) {
                iArr2[i30][i31 + 1] = (int)18061L;
                i32 = (int)28922L;
            }
            iArr2[i30 + 1] = iArr2[i30];
            try {
                i32 = (-1627261578 % i30);
                i32 = (iArr2[i30 - 1][i30 + 1] % i32);
                i32 = (i30 % -65);
            } catch (ArithmeticException a_e) {}
            switch ((i30 % 10) + 10) {
            case 10:
                Test.instanceCount = i32;
                lArr1[i30 - 1] += i30;
            case 11:
                i32 -= i32;
                break;
            case 12:
            case 13:
                bFld = bFld;
                i32 += 9;
                i32 = (int)f4;
                break;
            case 14:
                sFld <<= by2;
                i32 += (int)Test.dFld;
                bFld = bFld;
                for (i33 = i30; i33 < 179; i33++) {
                    iArr2[i33 - 1][i30 + 1] += i34;
                    for (i35 = 1; i35 < 1; i35++) {
                        iArr2[i33][i30 + 1] = 66;
                    }
                    for (f5 = 1; f5 > 1; --f5) {
                        fArr[i30] = i32;
                        if (false) {
                            i32 += (int)((long)f5 | i30);
                            Test.dFld -= Test.instanceCount;
                        } else if (bFld) {
                            i32 *= -13;
                        }
                        Test.dFld += Test.instanceCount;
                    }
                }
                break;
            case 15:
                Test.instanceCount >>>= i34;
            case 16:
                f4 += i31;
            case 17:
                i34 = (int)Test.instanceCount;
                break;
            case 18:
                bFld = bFld;
                break;
            case 19:
                i34 += i37;
            default:
                sFld = (short)i36;
            }
        } while ((i30 += 2) < 281);


    }
    public static void main(String[] strArr2) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr2);
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}