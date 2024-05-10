package tests.javafuzzer2931;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 23:20:10 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=0L;
    public static volatile boolean bFld=false;
    public static double dFld=-49.56986;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        long l1=-6L;
        int i7=-11937, i8=-3, i9=-49087, i10=-33954;
        float f=-47.415F, fArr[]=new float[N];
        double d2=-26.43201;
        short s=10427;
        byte by=-2;

        FuzzerUtils.init(fArr, 15.657F);

        for (l1 = 4; l1 < 124; l1++) {
            f = 1;
            while ((f += 2) < 13) {
                d2 += i7;
                i8 = 1;
                while (++i8 < 3) {
                    i7 -= s;
                    d2 -= i8;
                    by -= (byte)i7;
                }
                if (i8 != 0) {
                }
                i7 -= -149;
                for (i9 = (int)(l1); 3 > i9; i9++) {
                    d2 = f;
                    i10 = i8;
                    i10 = i7;
                    i10 >>= i10;
                    fArr = FuzzerUtils.float1array(N, (float)-84.108F);
                }
            }
        }
        long meth_res = l1 + i7 + Float.floatToIntBits(f) + Double.doubleToLongBits(d2) + i8 + s + by + i9 + i10 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i3, int i4, int i5) {

        double d1=-115.6688;
        int i6=14, i11=-168, i12=-55076, i13=-40452, i14=138, iArr[]=new int[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 13822);
        FuzzerUtils.init(lArr, 7114457778361482771L);

        if (Test.bFld) {
            i5 += (--iArr[(i5 >>> 1) % N]);
            for (d1 = 5; d1 < 220; d1++) {
                if (iMeth() != 17.113678) break;
                iArr[(int)(d1 + 1)] <<= i3;
                i5 >>>= (int)Test.instanceCount;
                i3 *= 45084;
                for (i11 = 1; i11 < 7; ++i11) {
                    i5 >>= i3;
                    for (i13 = 1; i13 < 2; i13++) {
                        float f1=67.986F;
                        i14 = -239;
                        f1 *= -125;
                        iArr[(int)(d1)] = (int)Test.instanceCount;
                        i6 += (int)(-39L + (i13 * i13));
                        Test.instanceCount += (((i13 * i13) + Test.instanceCount) - i13);
                    }
                }
            }
        } else if (Test.bFld) {
            lArr[(i6 >>> 1) % N] -= i3;
        }
        vMeth1_check_sum += i3 + i4 + i5 + Double.doubleToLongBits(d1) + i6 + i11 + i12 + i13 + i14 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i, double d, long l) {

        int i1=49080, i2=38094, i15=-160, i16=26169, i17=-25712, iArr1[]=new int[N];
        float f2=-2.236F, fArr1[]=new float[N];
        long l2=-21808L;
        boolean bArr[]=new boolean[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(iArr1, 79);
        FuzzerUtils.init(fArr1, 117.51F);
        FuzzerUtils.init(dArr, -119.59281);

        for (i1 = 5; i1 < 182; i1++) {
            vMeth1(i1, i2, i);
            switch ((i1 % 8) + 18) {
            case 18:
            case 19:
                i = (int)154L;
                break;
            case 20:
                bArr[i1 + 1] = Test.bFld;
                break;
            case 21:
                i15 = 1;
                while (++i15 < 9) {
                    f2 -= i2;
                    i += (3 + (i15 * i15));
                    iArr1[i1 - 1] = i;
                    iArr1[i15 - 1] = i1;
                    for (i16 = 1; i16 < 1; i16++) {
                        fArr1[i15] -= -97;
                        l -= i15;
                        i <<= (int)Test.instanceCount;
                        i2 *= 13;
                    }
                }
                break;
            case 22:
                dArr[i1 - 1] -= -2;
            case 23:
                i2 ^= (int)Test.instanceCount;
                break;
            case 24:
                l2 += i15;
                break;
            case 25:
                i *= i17;
                break;
            }
        }
        vMeth_check_sum += i + Double.doubleToLongBits(d) + l + i1 + i2 + i15 + Float.floatToIntBits(f2) + i16 + i17 +
            l2 + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i18=170, i19=3, i20=-50660, i21=-59872, i22=6207, i23=132, i24=2, i25=74, i27=-8, iArr2[]=new int[N];
        float f3=78.906F;
        long l3=6915964553674811685L, lArr1[][]=new long[N][N];

        FuzzerUtils.init(iArr2, 152);
        FuzzerUtils.init(lArr1, -5L);

        vMeth(-6, Test.dFld, Test.instanceCount);
        if (Test.bFld) {
            for (i18 = 12; i18 < 218; i18++) {
                i19 |= i18;
                i20 = 1;
                do {
                    i19 = i19;
                    iArr2[i18 - 1] = (int)f3;
                    i21 = 1;
                    do {
                        f3 -= i18;
                    } while (++i21 < 1);
                    for (i22 = 1; i22 < 1; i22++) {
                        i19 += i22;
                        lArr1[i22 + 1][i20 - 1] = Test.instanceCount;
                        f3 = i19;
                        i23 /= (int)(Test.instanceCount | 1);
                    }
                    i23 = (int)l3;
                    iArr2[i20 + 1] -= i22;
                } while (++i20 < 122);
                i19 >>= i19;
                iArr2[i18 + 1] *= 181;
                for (i24 = i18; i24 < 122; i24++) {
                    int i26=12;
                    Test.instanceCount += (i24 * i26);
                    i23 -= i21;
                    i25 = i21;
                    f3 -= 39283;
                }
                l3 >>= i25;
                i25 += (i18 * i18);
                i25 += (((i18 * l3) + i21) - Test.instanceCount);
                i25 += (i18 * i18);
            }
        } else if (false) {
            f3 %= (Test.instanceCount | 1);
            i25 = 13;
            iArr2 = iArr2;
        } else if (Test.bFld) {
            i19 = (int)Test.instanceCount;
        } else {
            i27 *= i22;
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