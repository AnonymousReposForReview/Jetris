package tests.javafuzzer1873;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 05:01:28 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3714001469L;
    public static double dFld=0.5961;
    public static volatile int iFld=-204;
    public byte byFld=80;
    public static long lArrFld[]=new long[N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -11L);
    }

    public static long bMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i2) {

        int i3=4, i4=3457, i5=14, i6=-58480, iArr[]=new int[N];
        boolean b=false;
        double d=2.82679;
        byte by=120;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, 4430579378565893051L);
        FuzzerUtils.init(iArr, 0);

        i2 += i2;
        lArr[(i2 >>> 1) % N][(i2 >>> 1) % N] = i2;
        i2 -= -44;
        i2 *= i2;
        i2 = 28127;
        i2 *= (int)Test.dFld;
        iArr[(i2 >>> 1) % N] >>= i2;
        for (i3 = 4; 189 > i3; i3++) {
            if (b) continue;
            i5 = 1;
            do {
                for (d = 1; d > 1; d -= 2) {
                    if (i4 != 0) {
                        vMeth1_check_sum += i2 + i3 + i4 + (b ? 1 : 0) + i5 + Double.doubleToLongBits(d) + i6 + by +
                            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
                        return;
                    }
                    iArr[(int)(d)] = (int)Test.instanceCount;
                    Test.instanceCount = by;
                    i2 -= (int)Test.instanceCount;
                }
            } while (++i5 < 9);
        }
        vMeth1_check_sum += i2 + i3 + i4 + (b ? 1 : 0) + i5 + Double.doubleToLongBits(d) + i6 + by +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(long l, int i1, long l1) {

        int i7=12515, i8=-13, i9=10, i10=-3, i11=222, i12=38080, i13=-44305, iArr1[]=new int[N];
        short s=8126;
        float f1=92.588F;
        boolean b1=true;

        FuzzerUtils.init(iArr1, 27052);

        vMeth1(i1);
        i1 = i1;
        for (i7 = 8; i7 < 192; ++i7) {
            for (i9 = 1; i9 < 9; i9++) {
                iArr1[i9 + 1] -= i1;
                Test.instanceCount += (((i9 * s) + i8) - i10);
                for (i11 = 1; i11 < 2; i11++) {
                    f1 = f1;
                    try {
                        i12 = (i12 % i11);
                        i10 = (i11 / i11);
                        i10 = (i10 % Test.iFld);
                    } catch (ArithmeticException a_e) {}
                    i1 <<= Test.iFld;
                    i13 = Test.iFld;
                }
            }
            Test.dFld = Test.instanceCount;
            Test.lArrFld[i7] += Test.iFld;
            f1 += (-47364 + (i7 * i7));
            b1 = b1;
        }
        vMeth_check_sum += l + i1 + l1 + i7 + i8 + i9 + i10 + s + i11 + i12 + Float.floatToIntBits(f1) + i13 + (b1 ? 1
            : 0) + FuzzerUtils.checkSum(iArr1);
    }

    public static boolean bMeth() {

        int i14=104, i15=62704, i16=7, i17=7, i18=-54403, i19=-47969, iArr2[]=new int[N];
        float f2=1.988F;
        boolean b2=false;
        byte by1=-35;

        FuzzerUtils.init(iArr2, 237);

        vMeth(Test.instanceCount, -5, Test.instanceCount);
        for (i14 = 4; i14 < 344; i14++) {
            for (i16 = 1; i16 < 5; i16++) {
                i15 -= Test.iFld;
                Test.instanceCount *= (long)f2;
                i15 += i14;
                Test.iFld += (int)Test.dFld;
                iArr2[i16 - 1] = i14;
                for (i18 = 2; 1 < i18; --i18) {
                    i15 |= -35466;
                    i15 += 13;
                    i15 += (i18 * i18);
                    i17 = (int)Test.dFld;
                    b2 = b2;
                    by1 += (byte)i15;
                }
            }
        }
        long meth_res = i14 + i15 + i16 + i17 + Float.floatToIntBits(f2) + i18 + i19 + (b2 ? 1 : 0) + by1 +
            FuzzerUtils.checkSum(iArr2);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void mainTest(String[] strArr1) {

        float f=0.647F, f3=1.887F, fArr[]=new float[N];
        int i=171, i20=65262, i21=-2, i22=10, i23=-3, i24=0, i25=-61034, i26=-6, i27=3, i28=0, i29=1;
        short s1=16694;
        boolean b3=false;

        FuzzerUtils.init(fArr, -56.168F);

        for (f = 9; f < 151; f++) {
            if (bMeth()) continue;
            switch (((Test.iFld >>> 1) % 10) + 42) {
            case 42:
                for (i20 = 4; i20 < 177; ++i20) {
                    f3 += (i20 * i20);
                    i22 = i;
                    f3 = f;
                }
            case 43:
                for (i23 = 177; i23 > f; i23--) {
                    i22 += i23;
                    i22 += (((i23 * f) + i22) - i24);
                    Test.iFld -= (int)1.487F;
                    iArrFld[(int)(f)] <<= Test.iFld;
                }
                Test.lArrFld[(int)(f)] = i;
                Test.instanceCount &= Test.instanceCount;
                f3 -= Test.instanceCount;
                break;
            case 44:
                i24 = 63;
                fArr[(int)(f - 1)] *= Test.instanceCount;
                i21 += (int)(((f * i24) + i24) - i22);
                break;
            case 45:
                i24 |= (int)Test.instanceCount;
                try {
                    i24 = (i23 / 78);
                    i24 = (iArrFld[(int)(f - 1)] / 52901);
                    i21 = (i23 / i21);
                } catch (ArithmeticException a_e) {}
                byFld += (byte)(((f * i22) + Test.instanceCount) - i);
                Test.instanceCount += (long)f;
                break;
            case 46:
                Test.iFld = i22;
                s1 = (short)i24;
            case 47:
                Test.instanceCount = i24;
                for (i25 = (int)(f); i25 < 177; i25 += 3) {
                    for (i27 = 1; i27 < 1; ++i27) {
                        Test.iFld += i27;
                        f3 += Test.instanceCount;
                        i21 += (i27 | i21);
                    }
                }
                break;
            case 48:
                i22 *= i22;
            case 49:
                Test.iFld >>= i29;
                break;
            case 50:
                if (b3) continue;
                break;
            case 51:
                Test.instanceCount = (long)Test.dFld;
                break;
            default:
                f3 += (f * f);
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
//DEBUG  bMeth ->  bMeth mainTest
//DEBUG  vMeth ->  vMeth bMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth bMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
