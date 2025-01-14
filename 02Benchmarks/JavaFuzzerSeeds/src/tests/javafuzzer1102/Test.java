package tests.javafuzzer1102;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 14:32:03 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-158L;
    public static boolean bFld=true;
    public static byte byFld=80;
    public volatile short sFld=5247;
    public double dFld=-2.73349;
    public volatile float fArrFld[]=new float[N];
    public static long lArrFld[][]=new long[N][N];
    public volatile double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 171L);
    }

    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public int iMeth1(int i11) {

        int i12=43, i13=-19345, i14=42;
        short s1=21854;
        double d1=2.82033;

        i11 = i11;
        i12 = 1;
        while (++i12 < 383) {
            for (i13 = 1; i13 < 4; ++i13) {
                if (Test.bFld) continue;
                i14 += (i13 | Test.instanceCount);
                i11 -= (int)Test.instanceCount;
                i11 -= i13;
                i11 = s1;
                i14 = i11;
                i14 += i14;
            }
            i11 += (((i12 * i12) + s1) - Test.instanceCount);
            i14 += i12;
            i11 = i11;
            d1 += s1;
            Test.instanceCount = i11;
        }
        long meth_res = i11 + i12 + i13 + i14 + s1 + Double.doubleToLongBits(d1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public long lMeth(float f) {

        int i8=46785, i9=14850, i10=21813, i15=-4, iArr1[]=new int[N];
        float f1=2.384F;
        double d2=1.63728;

        FuzzerUtils.init(iArr1, -118);

        i8 = 1;
        do {
            for (i9 = 1; i9 < 5; ++i9) {
                i10 = (iMeth1(i8) >> i10);
            }
        } while (++i8 < 305);
        Test.byFld += (byte)Test.instanceCount;
        if (Test.bFld) {
            for (f1 = 16; f1 < 306; ++f1) {
                d2 -= Test.instanceCount;
                fArrFld[(int)(f1 - 1)] += Test.instanceCount;
                switch (((i9 >>> 1) % 8) + 54) {
                case 54:
                    fArrFld[(int)(f1 - 1)] /= (i8 | 1);
                    i15 >>= i9;
                    i10 += (int)(-983342703L + (f1 * f1));
                    break;
                case 55:
                    sFld *= (short)Test.instanceCount;
                    break;
                case 56:
                case 57:
                    i15 -= i10;
                    d2 -= i15;
                case 58:
                    Test.lArrFld[(int)(f1 + 1)][(i9 >>> 1) % N] -= i8;
                    break;
                case 59:
                    iArr1[(int)(f1 + 1)] <<= (int)-182L;
                    break;
                case 60:
                case 61:
                    i15 = (int)Test.instanceCount;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f) + i8 + i9 + i10 + Float.floatToIntBits(f1) + i15 +
            Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public int iMeth() {

        short s=291;
        int i2=121, i3=213, i4=-12, i5=6, i6=-11544, i7=-16, iArr[]=new int[N];
        double d=1.1823, d3=-122.117317;
        float f2=2.746F;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -39);
        FuzzerUtils.init(lArr, -7L);

        s = (short)(--iArr[(i2 >>> 1) % N]);
        for (i3 = 9; i3 < 158; i3++) {
            Test.instanceCount += i3;
            for (d = 1; d < 11; ++d) {
                for (i6 = 1; 2 > i6; ++i6) {
                    switch ((int)(((d % 4) * 5) + 10)) {
                    case 14:
                        i4 >>= (int)(Test.instanceCount + (i7--));
                        Test.bFld = (Test.bFld = Test.bFld);
                        lArr[(int)(d)] >>>= (Math.min((long)(d + i3), (long)(d - -11)) - lMeth(f2));
                        break;
                    case 26:
                        i2 += (-226 + (i6 * i6));
                        d3 -= Test.instanceCount;
                        i7 *= i3;
                        iArr[(int)(d + 1)] += (int)Test.instanceCount;
                    case 15:
                        i5 = (int)Test.instanceCount;
                        break;
                    case 21:
                        f2 *= i7;
                    default:
                        Test.instanceCount &= -55;
                    }
                }
            }
        }
        long meth_res = s + i2 + i3 + i4 + Double.doubleToLongBits(d) + i5 + i6 + i7 + Float.floatToIntBits(f2) +
            Double.doubleToLongBits(d3) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-36, i1=217, i16=12759, i17=-4, i18=129, i19=-207, i20=-14, i21=74, i22=2661, iArr2[]=new int[N];
        boolean b=true;
        float f3=-1.22F;
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr2, -49);
        FuzzerUtils.init(sArr, (short)-24743);

        i = 1;
        while (++i < 388) {
            i1 = ((-93 + iMeth()) + i1);
            Test.instanceCount -= (long)dFld;
            Test.lArrFld[i][i] -= Test.byFld;
            for (i16 = 3; 65 > i16; i16 += 3) {
                if (Test.bFld) break;
                dArrFld[i16] = i17;
                if (false) {
                    i1 *= -33694;
                    iArr2[i + 1] |= 99;
                    Test.instanceCount += (long)dFld;
                    i1 >>= i17;
                }
                i17 = i1;
                dArrFld = dArrFld;
                Test.instanceCount = i;
                if (b) continue;
            }
            f3 *= Test.instanceCount;
        }
        dFld -= i17;
        Test.instanceCount <<= Test.instanceCount;
        i17 = i17;
        dFld -= Test.instanceCount;
        sArr[(i1 >>> 1) % N] += (short)226;
        i18 = 302;
        do {
            for (i19 = 83; i19 > 2; i19--) {
                for (i21 = 1; i21 < 2; ++i21) {
                    Test.instanceCount = i18;
                    iArr2[i19 + 1] += i16;
                    dFld = i16;
                    i1 *= Test.byFld;
                    i20 = i17;
                }
            }
        } while (--i18 > 0);


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
//DEBUG  lMeth ->  lMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 lMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
