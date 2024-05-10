package tests.javafuzzer844;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 10:53:14 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=47830L;
    public static int iFld=56069;
    public boolean bFld=false;
    public static long lFld=12065L;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -40107);
        FuzzerUtils.init(Test.lArrFld, 2L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i1, double d1) {

        int i2=5, i3=-233, i4=0, i5=-49253, i6=28751, i7=11, i8=-12, i9=-47942, i10=-11, i11=171, i12=83, i13=-22051;
        float f1=-1.74F, fArr[]=new float[N];
        short s=-13199;
        long lArr[]=new long[N];

        FuzzerUtils.init(fArr, 108.498F);
        FuzzerUtils.init(lArr, 0L);

        for (i2 = 2; i2 < 308; i2 += 2) {
            for (i4 = 10; i4 > i2; i4 -= 3) {
                Test.iArrFld[i2 + 1] -= (int)Test.instanceCount;
                for (i6 = 1; i6 < 1; i6++) {
                    i3 += (((i6 * i7) + f1) - Test.instanceCount);
                    Test.instanceCount += i2;
                    fArr[i2] += (float)d1;
                    i7 = 26468;
                }
            }
        }
        Test.iFld ^= Test.iFld;
        lArr[(i3 >>> 1) % N] -= s;
        for (i8 = 10; i8 < 258; i8++) {
            for (i10 = 1; i10 < 7; ++i10) {
                for (i12 = 2; i12 > 1; i12--) {
                    i7 -= i9;
                    f1 -= f1;
                }
            }
        }
        vMeth1_check_sum += i1 + Double.doubleToLongBits(d1) + i2 + i3 + i4 + i5 + i6 + i7 + Float.floatToIntBits(f1) +
            s + i8 + i9 + i10 + i11 + i12 + i13 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(long l, boolean b, double d) {

        float f2=2.680F;
        int i14=51, i15=14, i16=-1, i17=209, i18=2, i19=-13248;
        byte by=4;
        long lArr1[][]=new long[N][N];

        FuzzerUtils.init(lArr1, -11L);

        vMeth1(-9, d);
        Test.iArrFld[(-128 >>> 1) % N] += (int)f2;
        for (i14 = 7; i14 < 252; ++i14) {
            i15 += (((i14 * Test.iFld) + Test.iFld) - i15);
            b = b;
            Test.instanceCount = (long)d;
            Test.instanceCount = 195;
            for (i16 = 7; i16 > 1; i16 -= 2) {
                i15 <<= (int)3062346417L;
                i15 = i17;
                Test.lFld *= (long)d;
                by -= (byte)i14;
            }
            for (i18 = 1; i18 < 7; ++i18) {
                if (b) continue;
                lArr1 = lArr1;
            }
        }
        vMeth_check_sum += l + (b ? 1 : 0) + Double.doubleToLongBits(d) + Float.floatToIntBits(f2) + i14 + i15 + i16 +
            i17 + by + i18 + i19 + FuzzerUtils.checkSum(lArr1);
    }

    public int iMeth(int i) {

        double d2=-15.113518;
        short s1=29304;
        int i20=-9, i21=-7, i22=-6, i23=-157, i24=248;
        long l1=-2527420135907820827L;

        vMeth(Test.instanceCount, true, d2);
        Test.lArrFld[(i >>> 1) % N] *= 81L;
        s1 = (short)i;
        Test.lFld &= 1;
        for (i20 = 9; i20 < 149; ++i20) {
            i21 += (0 + (i20 * i20));
            for (l1 = 1; 11 > l1; l1++) {
                i21 += (int)(l1 + s1);
                for (i23 = 1; 2 > i23; i23++) {
                    Test.iFld += (i23 ^ Test.lFld);
                    if (bFld) continue;
                    i21 += (int)27.551F;
                    Test.lFld += (i23 * i23);
                    Test.iFld = i23;
                    i21 += (int)3512097622L;
                }
            }
        }
        long meth_res = i + Double.doubleToLongBits(d2) + s1 + i20 + i21 + l1 + i22 + i23 + i24;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f=-8.284F, fArr1[][]=new float[N][N];
        int i25=11, i26=-65355;

        FuzzerUtils.init(fArr1, 1.711F);

        if (bFld) {
            Test.iFld = (Test.iFld--);
        } else {
            f *= iMeth(53908);
            Test.iArrFld[(Test.iFld >>> 1) % N] ^= (int)-11591L;
            Test.iFld >>= Test.iFld;
        }
        for (i25 = 17; i25 < 367; i25++) {
            Test.iFld += i25;
        }
        i26 &= (int)Test.instanceCount;
        fArr1 = FuzzerUtils.float2array(N, (float)56.523F);


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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
