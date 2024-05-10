package tests.javafuzzer430;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 03:43:04 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1382584383L;
    public static int iFld=31648;
    public static boolean bFld=false;
    public static short sFld=27019;
    public static double dFld=1.72651;
    public static long lFld=2810L;
    public byte byFld=-19;
    public static short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)5021);
    }

    public static long byMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i12) {

        int i13=-9, i14=10, i15=1, i16=-5, i17=9, i18=-7, i19=12, i20=114, iArr1[]=new int[N];
        double d=107.111666;
        float f2=2.534F, fArr[]=new float[N];
        byte by=-84;

        FuzzerUtils.init(iArr1, -2);
        FuzzerUtils.init(fArr, 2.51F);

        for (i13 = 6; i13 < 148; i13 += 2) {
            switch ((i13 % 10) + 124) {
            case 124:
                iArr1[i13] += i13;
                for (i15 = i13; i15 < 22; i15++) {
                    Test.bFld = Test.bFld;
                    Test.instanceCount -= (long)d;
                    Test.iFld -= i15;
                    i17 = 1;
                    do {
                        float f1=-69.95F;
                        i12 += (((i17 * f1) + i15) - Test.instanceCount);
                    } while (++i17 < 1);
                    fArr[i13 + 1] *= f2;
                    by = by;
                }
            case 125:
                i12 = i17;
                for (i18 = 1; i18 < 22; ++i18) {
                    iArr1[i13] >>= 32208;
                    f2 %= ((long)(f2) | 1);
                }
                break;
            case 126:
                Test.instanceCount += (i13 * i13);
                break;
            case 127:
                i14 = i12;
                break;
            case 128:
                i20 -= Test.sFld;
                break;
            case 129:
                Test.iFld = (int)Test.instanceCount;
            case 130:
                fArr[i13] = f2;
                break;
            case 131:
                i12 ^= i19;
            case 132:
                i20 -= i18;
                break;
            case 133:
                i12 += i17;
                break;
            }
        }
        vMeth1_check_sum += i12 + i13 + i14 + i15 + i16 + Double.doubleToLongBits(d) + i17 + Float.floatToIntBits(f2) +
            by + i18 + i19 + i20 + FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(int i4, int i5, int i6) {

        int i7=-14, i8=162, i10=-41280, i11=7, i21=7, iArr[]=new int[N];
        double d1=0.94754;
        float f3=0.268F;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr, 18567);
        FuzzerUtils.init(lArr1, -871702837444590310L);

        for (i7 = 4; i7 < 138; ++i7) {
            Test.instanceCount -= (i7 - (Test.instanceCount - Test.iFld));
            for (i10 = 1; i10 < 12; ++i10) {
                Test.instanceCount = iArr[i10 - 1];
                i11 = (int)(lArr1[i7 + 1]--);
                try {
                    Test.iFld = (-6500 / Test.iFld);
                    i5 = (-126 / i5);
                    i11 = (i6 % i4);
                } catch (ArithmeticException a_e) {}
                vMeth1(i6);
            }
            i11 += (-78 + (i7 * i7));
            Test.sFld -= (short)d1;
            i21 = 12;
            do {
                i4 *= (int)Test.instanceCount;
                i6 = (int)f3;
                lArr1[i7 - 1] = i10;
                iArr[i7 - 1] *= (int)d1;
                Test.iFld += i10;
            } while ((i21 -= 3) > 0);
        }
        vMeth_check_sum += i4 + i5 + i6 + i7 + i8 + i10 + i11 + Double.doubleToLongBits(d1) + i21 +
            Float.floatToIntBits(f3) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr1);
    }

    public static byte byMeth(long l, int i, int i1) {

        int i2=139, i3=14945, i22=-4897, i23=-58583, iArr2[]=new int[N];
        boolean b=true;
        long lArr2[][]=new long[N][N];
        float fArr1[]=new float[N];

        FuzzerUtils.init(lArr2, -10L);
        FuzzerUtils.init(fArr1, -2.127F);
        FuzzerUtils.init(iArr2, -98);

        for (i2 = 238; i2 > 5; i2 -= 2) {
            i3 *= (--i1);
            if (b = (b = ((-i1) > (-24924L - i)))) continue;
            vMeth(36148, Test.iFld, Test.iFld);
            Test.sArrFld[i2] = (short)i2;
            for (i22 = 1; i22 < 13; ++i22) {
                i &= i3;
                lArr2[i2 + 1][i2] = Test.sFld;
                fArr1 = fArr1;
                i *= (int)l;
                switch (((35450 >>> 1) % 2) + 62) {
                case 62:
                    Test.iFld += (6353 + (i22 * i22));
                    break;
                case 63:
                    iArr2[i22] += i;
                default:
                    iArr2 = FuzzerUtils.int1array(N, (int)127);
                    Test.dFld = i22;
                }
            }
        }
        long meth_res = l + i + i1 + i2 + i3 + (b ? 1 : 0) + i22 + i23 + FuzzerUtils.checkSum(lArr2) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + FuzzerUtils.checkSum(iArr2);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f=-1.6F;
        long l1=-54401L, l2=-31517L, lArr[]=new long[N];
        int i24=26018, i25=-17261, i26=107, i27=-5373, i28=18031, i29=8, i30=2721, i31=44537, iArr3[][]=new int[N][N];
        double d2=2.61782, dArr[]=new double[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(lArr, 9L);
        FuzzerUtils.init(iArr3, 0);
        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(dArr, 0.113701);

        Test.instanceCount = Test.instanceCount;
        lArr[(Test.iFld >>> 1) % N] >>>= (Math.min(-(Test.iFld - Test.iFld), (long)(f * Test.iFld)) + (byMeth(155L,
            Test.iFld, 152) * Test.iFld));
        Test.instanceCount <<= Test.iFld;
        for (l1 = 9; l1 < 189; l1++) {
            if (Test.bFld) {
                i24 += (int)(((l1 * Test.iFld) + i24) - Test.iFld);
                Test.instanceCount = 2610872763L;
                Test.iFld = i25;
                Test.lFld += (((l1 * l1) + Test.iFld) - Test.lFld);
            } else {
                for (d2 = 2; d2 < 139; d2++) {
                    iArr3[(int)(l1 + 1)][(int)(l1 - 1)] = i25;
                    i25 -= (int)-2.381F;
                }
                Test.lFld -= i26;
                for (l2 = 1; l2 < 139; ++l2) {
                    lArr[(int)(l2 - 1)] -= -8;
                    i24 ^= i26;
                    for (i28 = 1; 2 > i28; i28++) {
                        i27 = Test.sFld;
                    }
                    lArr[(int)(l1 - 1)] += i27;
                    Test.iFld += -14;
                    switch ((int)(((l1 % 2) * 5) + 15)) {
                    case 19:
                        bArr[(int)(l1 + 1)] = Test.bFld;
                        for (i30 = 1; i30 < 2; i30++) {
                            iArr3[i30 + 1][(int)(l2 - 1)] = (int)Test.instanceCount;
                            byFld += (byte)i30;
                        }
                        Test.iFld += (int)l2;
                        break;
                    case 16:
                        iArr3[(int)(l2)][(int)(l1)] -= (int)Test.instanceCount;
                        Test.lFld = i26;
                        break;
                    default:
                        dArr[(int)(l1 - 1)] -= i28;
                        Test.iFld = i26;
                    }
                }
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
//DEBUG  byMeth ->  byMeth mainTest
//DEBUG  vMeth ->  vMeth byMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth byMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
