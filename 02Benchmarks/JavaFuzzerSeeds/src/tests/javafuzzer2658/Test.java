package tests.javafuzzer2658;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 18:05:59 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-14L;
    public static double dFld=1.78736;
    public static long lFld=99L;
    public static boolean bFld=false;
    public static volatile short sFld=-26245;
    public static int iArrFld[]=new int[N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -48601);
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i9) {

        float f2=0.727F;

        f2 -= 50572;
        i9 *= i9;
        vMeth1_check_sum += i9 + Float.floatToIntBits(f2);
    }

    public static int iMeth() {

        int i6=43043, i7=5645, i8=78, i10=-5, i11=8234, i12=207, i13=167;
        float f1=27.527F, fArr[][]=new float[N][N];
        boolean b1=true;
        short sArr[]=new short[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(fArr, -2.678F);
        FuzzerUtils.init(sArr, (short)24512);
        FuzzerUtils.init(dArr, 111.16757);

        Test.instanceCount -= ((i6++) * ((i6 - Test.instanceCount) - (-(i6 * 8))));
        fArr[(i6 >>> 1) % N][(-4179 >>> 1) % N] = (Test.iArrFld[(i6 >>> 1) % N] | -1253124756L);
        f1 -= i6;
        sArr[(i6 >>> 1) % N] += (short)Test.dFld;
        for (i7 = 3; i7 < 328; i7++) {
            vMeth1(i7);
            if (b1) {
                i6 -= (int)699645470203202121L;
                for (i10 = 1; i10 < 5; ++i10) {
                    i6 += (((i10 * i7) + i7) - i6);
                    for (i12 = i7; i12 < 2; i12++) {
                        if (i11 != 0) {
                        }
                        Test.iArrFld[i10] = (int)Test.instanceCount;
                        i11 = i10;
                        Test.iArrFld[i7 + 1] = 18;
                    }
                }
            } else if (b1) {
                Test.lFld -= (long)Test.dFld;
            } else {
                Test.iArrFld = Test.iArrFld;
            }
        }
        long meth_res = i6 + Float.floatToIntBits(f1) + i7 + i8 + i10 + i11 + i12 + i13 + (b1 ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(sArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth() {

        int i2=10, i3=-15410, i4=-13, i5=-45628, i14=-242;
        boolean b=true, bArr[][]=new boolean[N][N];
        float f=2.314F;
        double d1=125.68370;
        short s=-26891;
        long l=-54L, lArr[]=new long[N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(lArr, -199L);

        for (int i1 : Test.iArrFld) {
            i2 = 1;
            do {
                b = bArr[i2][i2];
                for (i3 = 1; i3 < 1; ++i3) {
                    i5 += (i5--);
                    Test.instanceCount = (Test.iArrFld[i2] = (int)((f++) * iMeth()));
                    f -= i4;
                }
                i4 += (((i2 * i4) + i3) - Test.instanceCount);
                i1 |= -59745;
                for (d1 = 1; i2 < d1; d1--) {
                    i5 = (int)Test.lFld;
                    i1 += (int)d1;
                    lArr[i2 + 1] -= -9L;
                    i4 = s;
                    l = i14;
                }
            } while (++i2 < 4);
        }
        vMeth_check_sum += i2 + (b ? 1 : 0) + i3 + i4 + i5 + Float.floatToIntBits(f) + Double.doubleToLongBits(d1) +
            i14 + s + l + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i=11, i15=244, i16=-53084, i17=-2, i18=-32857, i19=-10, i20=-35061, i21=55919, i22=42;
        float f3=102.867F;
        byte by=-46;
        short sArr1[]=new short[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(sArr1, (short)461);
        FuzzerUtils.init(lArr1, 2009135942L);

        i = 1;
        do {
            Test.instanceCount += i;
            vMeth();
            for (i15 = 2; i15 < 89; ++i15) {
                Test.iArrFld[i] = 6;
                f3 = Test.instanceCount;
                Test.bArrFld[i] = Test.bFld;
                i16 = (int)Test.instanceCount;
                Test.bFld = true;
                i16 >>= i16;
                i16 = i16;
                if (true) {
                    sArr1[i] = (short)i15;
                    i16 = i15;
                }
            }
            Test.dFld = i;
            for (i17 = 2; i17 < 89; i17++) {
                Test.lFld -= -3L;
                for (i19 = 2; 1 < i19; --i19) {
                    i16 += (((i19 * i18) + i19) - f3);
                    Test.instanceCount -= (long)f3;
                }
                Test.sFld += (short)(((i17 * i20) + Test.instanceCount) - i20);
                i18 -= by;
                Test.iArrFld[i] = i;
                for (i21 = 1; i21 < 2; ++i21) {
                    Test.bArrFld[i] = Test.bFld;
                    i20 += (i21 ^ Test.sFld);
                    lArr1[i17 - 1] = i22;
                    Test.dFld += i;
                    f3 *= Test.sFld;
                    f3 = i;
                }
            }
        } while (++i < 283);



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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
