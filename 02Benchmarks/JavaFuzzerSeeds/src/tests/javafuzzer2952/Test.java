package tests.javafuzzer2952;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 23:41:16 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3598548680L;
    public static long lFld=-14L;
    public double dFld=-1.16491;
    public volatile long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 12);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i6, float f1, int i7) {

        boolean b=false;
        byte by=-121;
        int i8=-73, i9=8, i10=-20862, i11=24, i12=10, i13=48488;
        double d1=32.13954;

        b = b;
        by <<= (byte)37670;
        i6 ^= (int)-4267467817L;
        i7 = i6;
        for (i8 = 3; 149 > i8; ++i8) {
            for (i10 = 1; i10 < 11; ++i10) {
                i7 = i6;
                Test.instanceCount = -33809L;
                for (i12 = 1; i12 < 2; i12++) {
                    i7 += (i12 * i12);
                    i11 = i6;
                    d1 %= (Test.instanceCount | 1);
                    i9 += i12;
                    Test.instanceCount += i11;
                    i11 = i9;
                }
            }
        }
        vMeth1_check_sum += i6 + Float.floatToIntBits(f1) + i7 + (b ? 1 : 0) + by + i8 + i9 + i10 + i11 + i12 + i13 +
            Double.doubleToLongBits(d1);
    }

    public static long lMeth(float f, double d) {

        int i5=-83, i14=-130, i15=-130, i16=29, i17=-35926, i18=65308;
        byte by1=-111;
        float f2=-81.979F;
        double dArr[][]=new double[N][N];

        FuzzerUtils.init(dArr, 61.72929);

        i5 -= (int)d;
        vMeth1(i5, 0.715F, i5);
        d = Test.instanceCount;
        for (i14 = 9; 396 > i14; ++i14) {
            short s1=-23737;
            i15 <<= s1;
            i5 = i5;
            for (i16 = i14; 4 > i16; ++i16) {
                i5 = i16;
                i15 += (((i16 * by1) + Test.instanceCount) - f);
                i18 = 1;
                do {
                    f2 -= Test.instanceCount;
                    Test.instanceCount += (7 + (i18 * i18));
                    d += f;
                    dArr[i18] = FuzzerUtils.double1array(N, (double)-99.33899);
                    Test.instanceCount *= i18;
                } while (++i18 < 1);
            }
        }
        long meth_res = Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i5 + i14 + i15 + i16 + i17 + by1 + i18 +
            Float.floatToIntBits(f2) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i4) {

        short s=2883;
        float f3=0.884F, fArr[]=new float[N];
        double d2=111.13801;
        int i19=-14, iArr[]=new int[N], iArr1[][]=new int[N][N];
        byte by2=-86;
        boolean b1=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -9);
        FuzzerUtils.init(lArr, -7L);
        FuzzerUtils.init(fArr, -2.105F);
        FuzzerUtils.init(iArr1, 0);

        s = (short)Math.max(lMeth(f3, d2), Test.instanceCount);
        i4 |= i4;
        i19 = 1;
        while (++i19 < 303) {
            f3 += (((i19 * i4) + i19) - Test.instanceCount);
            switch ((i19 % 1) + 55) {
            case 55:
                iArr[i19 - 1] <<= by2;
                i4 ^= i4;
                if (b1) continue;
                switch (((i19 % 10) * 5) + 86) {
                case 124:
                    i4 %= (int)(Test.instanceCount | 1);
                    Test.instanceCount = i19;
                    break;
                case 90:
                    iArr = iArr;
                    break;
                case 136:
                    Test.instanceCount *= 32444;
                    lArr[i19 - 1] += Test.instanceCount;
                    break;
                case 88:
                    i4 *= (int)Test.instanceCount;
                    break;
                case 92:
                    i4 = (int)Test.lFld;
                    break;
                case 126:
                    fArr[i19 + 1] += i19;
                    break;
                case 134:
                    i4 += (((i19 * i4) + i4) - Test.instanceCount);
                    break;
                case 101:
                    Test.instanceCount += (((i19 * Test.lFld) + i19) - Test.instanceCount);
                    break;
                case 122:
                    i4 += i19;
                    break;
                case 119:
                    i4 = i19;
                    break;
                }
                break;
            default:
                iArr1 = iArr1;
            }
        }
        vMeth_check_sum += i4 + s + Float.floatToIntBits(f3) + Double.doubleToLongBits(d2) + i19 + by2 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=-8508, i1=218, i2=-8, i3=31122, i20=-6, i21=50250, i22=49167, i23=185, i24=46389, i25=-25943, i26=19378,
            i27=13817, i28=-18, i29=-13;
        short s2=-30200;
        boolean b2=false;
        float f5=-38.182F;
        byte by3=-119;
        double dArr1[]=new double[N];

        FuzzerUtils.init(dArr1, 1.118905);

        for (i = 18; i < 295; i++) {
            for (i2 = i; i2 < 91; ++i2) {
                float f4=1.87F;
                vMeth(162);
                f4 = -2;
                f4 += s2;
                for (i20 = 1; i20 < 1; i20 += 2) {
                    Test.instanceCount *= i3;
                }
                for (i22 = 1; i22 < 1; i22++) {
                    b2 = b2;
                }
                dFld = i20;
                f4 += f4;
            }
            lArrFld = lArrFld;
            Test.iArrFld[i] -= (int)dFld;
            if (false) {
                for (i24 = i; i24 < 91; ++i24) {
                    i21 >>= i3;
                    i23 *= 33849;
                    i1 *= (int)dFld;
                    i1 *= i2;
                }
                i1 = (int)Test.instanceCount;
                i21 = (int)-15.478F;
                i1 = i23;
            } else {
                Test.iArrFld[i - 1] &= i;
            }
        }
        for (i26 = 10; i26 < 279; i26 += 3) {
            dArr1[i26] = Test.lFld;
            for (i28 = 2; i28 < 281; i28++) {
                f5 += i28;
                i25 = (int)dFld;
                lArrFld[i28 - 1] += (long)f5;
                by3 += (byte)i3;
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
