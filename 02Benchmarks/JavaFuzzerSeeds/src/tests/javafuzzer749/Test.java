package tests.javafuzzer749;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 09:04:38 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=12L;
    public static short sFld=16946;
    public static boolean bFld=true;
    public float fFld=2.295F;
    public static short sArrFld[][]=new short[N][N];
    public boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)-29789);
    }

    public static long fMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(short s1, short s2) {

        int i11=8, i12=-219, i13=-53740, i14=-9, i15=7, i16=10, i17=7, iArr1[]=new int[N];
        byte by=-36;
        double d1=22.91350, d2=-115.54183;
        boolean b=true;

        FuzzerUtils.init(iArr1, 26);

        Test.instanceCount = i11;
        Test.instanceCount -= by;
        for (d1 = 3; d1 < 239; d1++) {
            i12 += (int)Test.instanceCount;
        }
        for (d2 = 11; d2 < 329; d2++) {
            for (i14 = 5; i14 > 1; i14--) {
                i13 <<= (int)Test.instanceCount;
                Test.instanceCount *= (long)1.862F;
                if (true) break;
                iArr1 = FuzzerUtils.int1array(N, (int)59);
                Test.instanceCount += i12;
                for (i16 = 1; 2 > i16; ++i16) {
                    i15 -= (int)-1.163F;
                    b = b;
                    try {
                        iArr1[i14 - 1] = (i13 / 11231);
                        i13 = (iArr1[(i14 >>> 1) % N] % -38310);
                        i12 = (i14 / 10087);
                    } catch (ArithmeticException a_e) {}
                }
            }
        }
        vMeth_check_sum += s1 + s2 + i11 + by + Double.doubleToLongBits(d1) + i12 + Double.doubleToLongBits(d2) + i13 +
            i14 + i15 + i16 + i17 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth(short s, long l1, long l2) {


        vMeth(Test.sFld, s);
        long meth_res = s + l1 + l2;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static float fMeth(int i5, float f, long l) {

        int i6=-57, i7=-4, i8=3, i9=-14, i10=9, i18=2, i19=247, i20=-239, i21=-54848, iArr2[]=new int[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr2, 173);
        FuzzerUtils.init(sArr, (short)-1134);

        i5 >>= (-(i5--));
        i6 = 1;
        while (++i6 < 394) {
            for (i7 = i6; i7 < 4; i7++) {
                i8 /= (int)((l++) | 1);
                for (i9 = i6; i9 < 1; i9 += 2) {
                    iMeth(Test.sFld, l, Test.instanceCount);
                    iArr2[i9 - 1] *= (int)l;
                    iArr2[i7] = i10;
                }
                i10 = (int)Test.instanceCount;
            }
            try {
                i10 = (iArr2[i6 - 1] % i7);
                i8 = (-357313616 % iArr2[i6]);
                i8 = (iArr2[i6 + 1] / 217);
            } catch (ArithmeticException a_e) {}
            i8 -= i6;
            for (i18 = 1; 4 > i18; i18 += 3) {
                for (i20 = 1; i20 < 4; i20++) {
                    sArr[i6] -= (short)i8;
                    if (Test.bFld) continue;
                }
            }
        }
        long meth_res = i5 + Float.floatToIntBits(f) + l + i6 + i7 + i8 + i9 + i10 + i18 + i19 + i20 + i21 +
            FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(sArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=59740, i1=-18006, i2=-156, i3=8709, i4=-4, i22=62, i23=1, i24=-30092, iArr[]=new int[N];
        double d3=-2.2931;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 132);
        FuzzerUtils.init(lArr, 246L);

        for (i = 9; i < 213; i++) {
            for (i2 = 1; 123 > i2; i2++) {
                i4 = 1;
                do {
                    double d=-2.89345;
                    i1 *= (int)(-((i2 >> Test.instanceCount) - (Test.instanceCount * Test.sFld)));
                    iArr = (iArr = (iArr = (iArr = iArr)));
                    d += i3;
                    if (!(fMeth(-251, fFld, Test.instanceCount) != i4)) break;
                    Test.sFld += (short)i4;
                    Test.instanceCount -= i1;
                } while (++i4 < 2);
                switch ((((96 >>> 1) % 2) * 5) + 111) {
                case 118:
                    i3 >>>= (int)Test.instanceCount;
                    i1 += 35;
                    i1 = i;
                    break;
                case 120:
                    i3 = i1;
                    i3 = (int)Test.instanceCount;
                    i1 = i2;
                    for (i22 = i; i22 < 2; i22++) {
                        i23 = i22;
                    }
                }
                switch (((i % 7) * 5) + 14) {
                case 31:
                    i23 *= i22;
                    break;
                case 16:
                    i24 = 1;
                    while (++i24 < 2) {
                        iArr[i2 + 1] -= i22;
                        Test.instanceCount += i24;
                        Test.sFld += (short)-1706689175L;
                        lArr[i - 1] -= Test.instanceCount;
                        Test.instanceCount = i3;
                        i1 += i2;
                        Test.sArrFld[i2 - 1][i - 1] ^= (short)i3;
                    }
                    Test.instanceCount += i22;
                    try {
                        i3 = (-100 / i1);
                        i1 = (214 % iArr[i]);
                        iArr[i2 + 1] = (-38487 / i4);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 47:
                    iArr[i2 + 1] <<= i3;
                    break;
                case 15:
                    bArrFld[i2 + 1] = Test.bFld;
                    break;
                case 22:
                    lArr[i2] >>>= i22;
                    break;
                case 41:
                    i3 += i1;
                    break;
                case 37:
                    d3 -= d3;
                    break;
                default:
                    if (Test.bFld) break;
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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  iMeth ->  iMeth fMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}