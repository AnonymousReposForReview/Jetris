package tests.javafuzzer3347;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 06:31:14 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-9L;
    public static long lFld=-3861742636L;
    public static short sFld=-31581;
    public static float fArrFld[]=new float[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 1.1005F);
        FuzzerUtils.init(Test.lArrFld, -719502227L);
    }

    public static long iMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i4, int i5, int i6) {

        int i7=-232, i8=-10, i9=121, i10=-42, i11=5421;
        short s1=-11623;
        double d2=2.5723;
        float f1=-1.997F;

        i6 ^= i6;
        for (i7 = 17; 311 > i7; ++i7) {
            s1 += (short)(i7 * i7);
            Test.instanceCount -= i9;
            d2 = 1;
            while (++d2 < 6) {
                i6 += (int)d2;
                i9 *= i8;
                for (i10 = 1; i10 < 1; ++i10) {
                    f1 += (2953790169229792287L + (i10 * i10));
                    f1 -= Test.lFld;
                    i4 += (i10 * i10);
                    i8 += i9;
                    Test.lArrFld[(int)(d2)] = Test.instanceCount;
                    i11 >>= (int)-240784513L;
                    Test.lFld = i11;
                }
            }
        }
        vMeth_check_sum += i4 + i5 + i6 + i7 + i8 + s1 + i9 + Double.doubleToLongBits(d2) + i10 + i11 +
            Float.floatToIntBits(f1);
    }

    public static double dMeth(long l, int i3, double d1) {


        Test.fArrFld = Test.fArrFld;
        Test.instanceCount += (i3++);
        vMeth(i3, i3, i3);
        Test.sFld += (short)i3;
        long meth_res = l + i3 + Double.doubleToLongBits(d1);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static int iMeth(float f) {

        int i=0, i1=202, i2=-44, i12=232, i13=-13, i14=-25, i15=-1, iArr[][]=new int[N][N];
        short s=28818;
        boolean b=true;
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr, 99);
        FuzzerUtils.init(dArr, 17.111174);

        i = (int)(((29592 % (s | 1)) * (i << Test.instanceCount)) + (i + (Test.instanceCount + i)));
        for (i1 = 3; 132 > i1; i1++) {
            double d=81.98687;
            i2 -= (-(-15 * (i--)));
            Test.instanceCount = (long)((d + (Test.instanceCount * i2)) - (i2 >>= (i1 + i2)));
            d = dMeth(Test.instanceCount, i1, d);
            i2 <<= i;
            if (b) break;
            for (i12 = 1; i12 < 12; i12++) {
                for (i14 = 1; i14 < 2; i14++) {
                    i15 = i14;
                    iArr[i14][i1 + 1] -= (int)Test.instanceCount;
                    Test.instanceCount += (i14 * i14);
                }
                Test.lFld += (long)f;
                i2 = i;
                dArr[i12 + 1] -= i12;
            }
        }
        long meth_res = Float.floatToIntBits(f) + i + s + i1 + i2 + (b ? 1 : 0) + i12 + i13 + i14 + i15 +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr3) {

        float f2=63.209F;
        int i16=2615, i18=23550, i19=13, i20=-14, i21=-18828, i22=-98, iArr1[]=new int[N];
        boolean b1=true;
        long l1=55L;
        byte by=-94;
        double d3=-14.67695, dArr1[]=new double[N];

        FuzzerUtils.init(iArr1, -34515);
        FuzzerUtils.init(dArr1, -1.17783);

        iMeth(f2);
        if (true) {
            i16 = -14;
        } else {
            Test.lArrFld[(i16 >>> 1) % N] = -42;
            for (int i17 : iArr1) {
                if (b1) {
                    dArr1 = FuzzerUtils.double1array(N, (double)1.40592);
                    Test.instanceCount &= i17;
                    i17 <<= i17;
                } else {
                    i17 <<= i17;
                }
                for (l1 = 3; l1 < 63; ++l1) {
                    by += (byte)1.816F;
                    Test.instanceCount >>= i16;
                    for (i19 = 1; i19 < 2; i19++) {
                        Test.lFld = i19;
                    }
                    iArr1[(int)(l1)] = i18;
                    for (i21 = (int)(l1); i21 < 2; ++i21) {
                        i16 *= i21;
                        i16 = i16;
                        switch (((i21 % 2) * 5) + 64) {
                        case 69:
                            f2 *= i19;
                            break;
                        case 74:
                        }
                        i20 += (i21 * i21);
                        Test.lFld = i21;
                        by += (byte)i21;
                    }
                    Test.lArrFld[(int)(l1 - 1)] *= Test.lFld;
                }
            }
            i20 = (int)Test.lFld;
            i18 -= -3;
        }
        Test.instanceCount <<= Test.instanceCount;
        f2 = (float)d3;
        i18 = i19;


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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  dMeth ->  dMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth dMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
