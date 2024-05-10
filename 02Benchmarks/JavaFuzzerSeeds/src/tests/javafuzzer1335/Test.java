package tests.javafuzzer1335;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 18:29:32 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-4659824308396144478L;
    public static volatile short sFld=9175;
    public static int iArrFld[]=new int[N];
    public short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -17406);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i4) {

        int i5=34553, i6=-38999, i7=14574, i8=80, i9=-11;
        double d=21.95923;
        long l1=-4003174764143559149L, lArr[]=new long[N];
        short s=-19863;
        float f=2.944F, fArr[]=new float[N];
        boolean b1=false;

        FuzzerUtils.init(lArr, 101L);
        FuzzerUtils.init(fArr, -51.265F);

        for (i5 = 13; i5 < 280; i5++) {
            d = i4;
            for (l1 = 1; l1 < 6; l1++) {
                for (i8 = 2; i8 > 1; i8 -= 2) {
                    s = (short)-124;
                    i6 -= (int)-64284L;
                    i6 += i8;
                    i7 ^= i6;
                    switch ((int)((l1 % 9) + 16)) {
                    case 16:
                        Test.instanceCount = (long)f;
                        i9 += (int)f;
                        f += -8;
                        Test.iArrFld[(int)(l1 - 1)] = 0;
                        break;
                    case 17:
                        lArr[i5 + 1] = i9;
                        f += (-238 + (i8 * i8));
                        break;
                    case 18:
                        fArr[i8] = i8;
                    case 19:
                        if (true) break;
                        break;
                    case 20:
                        i4 = i8;
                    case 21:
                        i7 = (int)Test.instanceCount;
                        break;
                    case 22:
                        i7 += i8;
                        break;
                    case 23:
                        i6 = i4;
                        break;
                    case 24:
                        if (b1) continue;
                        break;
                    default:
                        i7 *= i6;
                    }
                }
            }
        }
        long meth_res = i4 + i5 + i6 + Double.doubleToLongBits(d) + l1 + i7 + i8 + i9 + s + Float.floatToIntBits(f) +
            (b1 ? 1 : 0) + FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i3) {

        int i10=-57401, i11=-7, i12=-26427, i13=-10, i14=-5, i15=-10, i16=220, i17=-107, i18=159, i19=-13754;
        float f1=0.842F;
        short s1=-12549;
        byte by=-126, byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)19);

        i3 -= (--byArr[(i3 >>> 1) % N]);
        iMeth(i3);
        for (i10 = 1; i10 < 141; ++i10) {
            i11 += -137;
        }
        i11 *= i10;
        i11 -= i11;
        for (i12 = 4; i12 < 380; ++i12) {
            Test.instanceCount -= (long)f1;
            i13 = i11;
            for (i14 = 1; i14 < 4; ++i14) {
                for (i16 = 1; i16 < 2; i16++) {
                    i13 += (-73 + (i16 * i16));
                }
                for (i18 = i14; i18 < 2; ++i18) {
                    s1 = by;
                    i13 += i10;
                }
            }
        }
        vMeth1_check_sum += i3 + i10 + i11 + i12 + i13 + Float.floatToIntBits(f1) + i14 + i15 + i16 + i17 + i18 + i19 +
            s1 + by + FuzzerUtils.checkSum(byArr);
    }

    public void vMeth(int i2, boolean b, long l) {

        int i20=-8702, i21=-233, i22=-7, i23=241;
        float f2=125.334F;
        double d1=-2.38597;

        vMeth1(-247);
        i20 = 1;
        while (++i20 < 291) {
            sArrFld[i20 - 1] = (short)i2;
            switch (((i20 >>> 1) % 8) + 53) {
            case 53:
                i2 += i20;
                l = i20;
                i2 += (int)l;
                i2 += i2;
            case 54:
                f2 -= f2;
                i21 = 1;
                while (++i21 < 6) {
                    i2 *= 33711;
                }
                Test.instanceCount = i21;
                break;
            case 55:
                for (i22 = 1; i22 < 6; ++i22) {
                    i23 = -4;
                    if (b) continue;
                }
                break;
            case 56:
                Test.iArrFld[i20] >>= 190;
                break;
            case 57:
                if (i2 != 0) {
                    vMeth_check_sum += i2 + (b ? 1 : 0) + l + i20 + Float.floatToIntBits(f2) + i21 + i22 + i23 +
                        Double.doubleToLongBits(d1);
                    return;
                }
                break;
            case 58:
            case 59:
                i2 += i22;
            case 60:
                d1 = Test.sFld;
                break;
            }
        }
        vMeth_check_sum += i2 + (b ? 1 : 0) + l + i20 + Float.floatToIntBits(f2) + i21 + i22 + i23 +
            Double.doubleToLongBits(d1);
    }

    public void mainTest(String[] strArr1) {

        int i=6, i1=-57027, i24=-40659, i25=-3, i26=115, i27=8, i28=-1688, i29=5799, i31=31474, i32=-4, i33=-23;
        float f4=1.110F;
        boolean b2=false;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -537027494507576465L);

        for (i = 12; 270 > i; ++i) {
            vMeth(i1, true, Test.instanceCount);
            for (i24 = 1; i24 < 97; i24++) {
                float f3=-59.116F;
                f3 *= 7;
                i1 <<= (int)Test.instanceCount;
                Test.instanceCount <<= i1;
                Test.sFld = (short)i1;
                i1 += i25;
                Test.iArrFld[i - 1] = i;
                for (i26 = 1; i26 < 2; i26++) {
                    Test.instanceCount += i27;
                    Test.iArrFld[i26 + 1] = i26;
                    i27 += (i26 + i27);
                    Test.iArrFld[i] |= i1;
                    f3 = 1.240F;
                    i25 += (i26 * i26);
                    i25 += i26;
                    i25 += i1;
                }
            }
            f4 += i;
        }
        for (i28 = 13; i28 < 215; i28++) {
            if (b2) continue;
            lArr1[i28] += (long)f4;
            Test.iArrFld[i28] += i25;
            if (b2) {
                i31 = 1;
                while (++i31 < 124) {
                    for (i32 = 1; i32 < 1; ++i32) {
                        lArr1[i32 + 1] *= i24;
                        f4 = i31;
                        Test.instanceCount >>= i33;
                        lArr1[i28] += -10;
                    }
                }
            } else if (b2) {
                i25 += (((i28 * i27) + Test.instanceCount) - i29);
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
