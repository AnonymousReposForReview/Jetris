package tests.javafuzzer1440;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 20:44:04 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=56648L;
    public static volatile boolean bFld=true;
    public static double dFld=-1.78091;
    public static int iFld=20;
    public static short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)-26599);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(short s1, int i4, int i5) {

        int i6=-21, i7=215, i8=90, i9=4, iArr1[]=new int[N];
        double d1=0.102105;
        long l2=-3396365044L, lArr[]=new long[N];
        float f2=0.933F;

        FuzzerUtils.init(iArr1, 13);
        FuzzerUtils.init(lArr, 583440389323851427L);

        i6 = 1;
        do {
            iArr1[i6 - 1] -= 64168;
            d1 = 113;
            for (l2 = i6; l2 < 5; l2++) {
                if (Test.bFld) {
                    i5 *= i4;
                    i8 = 1;
                    while (++i8 < 1) {
                        boolean b=true;
                        try {
                            i7 = (-8944 / i8);
                            i4 = (iArr1[i8] % -55);
                            i4 = (i6 / -422397980);
                        } catch (ArithmeticException a_e) {}
                        if (b) break;
                        i4 >>= i6;
                        f2 += i5;
                    }
                    Test.instanceCount = i8;
                } else {
                    i9 = 1;
                    while (++i9 < 1) {
                        i4 += (i9 * i9);
                        i5 = i6;
                    }
                }
            }
        } while (++i6 < 360);
        long meth_res = s1 + i4 + i5 + i6 + Double.doubleToLongBits(d1) + l2 + i7 + i8 + Float.floatToIntBits(f2) + i9
            + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(long l, short s, int i1) {

        int i2=-157, i3=-228, i10=-26104, i11=-13;
        double d=48.117248;
        float f1=-83.855F;
        byte by=-103;

        i2 = 1;
        do {
            for (d = 1; d < 4; ++d) {
                f1 *= iMeth1(s, i2, i3);
                for (i10 = 1; i10 < 2; i10++) {
                    i3 -= (int)Test.instanceCount;
                    i1 = s;
                    i11 = i2;
                    l -= i10;
                    i1 += i10;
                    i11 -= i10;
                }
                i1 += (int)(((d * l) + i1) - i10);
                Test.dFld -= 44176;
            }
            if (Test.bFld) {
                l = by;
                by += (byte)i10;
            }
        } while (++i2 < 390);
        long meth_res = l + s + i1 + i2 + Double.doubleToLongBits(d) + i3 + Float.floatToIntBits(f1) + i10 + i11 + by;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i, float f) {

        short s2=25409;
        float f3=14.460F;
        int i12=54051, i13=-11, i14=-10, i15=-11, iArr[]=new int[N];
        byte by1=-55;
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr, -9);
        FuzzerUtils.init(dArr, 0.95138);

        i = (-iArr[(i >>> 1) % N]);
        iMeth(Test.instanceCount, s2, i);
        Test.bFld = Test.bFld;
        f3 = 1;
        while (++f3 < 383) {
            for (i12 = 1; i12 < 4; ++i12) {
                i += (int)(-96.536F + (i12 * i12));
                for (i14 = 1; 2 > i14; i14++) {
                    dArr[(int)(f3)] += i13;
                    i -= (int)-1.588F;
                    i13 += i14;
                    i15 = i14;
                }
            }
            Test.sArrFld[(int)(f3 + 1)] = (short)i14;
            by1 = (byte)Test.instanceCount;
            i13 += (int)(((f3 * i12) + Test.instanceCount) - Test.instanceCount);
            i15 = i12;
        }
        vMeth_check_sum += i + Float.floatToIntBits(f) + s2 + Float.floatToIntBits(f3) + i12 + i13 + i14 + i15 + by1 +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i17=12, i18=12, i19=-3370, i21=-232, i22=-2, i23=-10491, i24=12, i25=-10, i26=-38288, iArr2[]=new int[N];
        float f4=101.343F;
        byte by2=0;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -2386726734L);
        FuzzerUtils.init(iArr2, 8470);

        vMeth(i17, f4);
        f4 = i17;
        Test.instanceCount += (long)f4;
        f4 -= i17;
        i17 = (int)56680L;
        lArr1[(0 >>> 1) % N] *= i17;
        for (i18 = 17; 320 > i18; i18++) {
            for (i21 = 4; 83 > i21; i21++) {
                iArr2[i21 - 1] ^= by2;
                i17 += (int)(-12L + (i21 * i21));
                i19 *= (int)f4;
                Test.dFld += i21;
                Test.instanceCount >>= i18;
                i22 += i21;
                i19 = i19;
                i19 -= (int)8L;
                i17 += (((i21 * Test.instanceCount) + i19) - i22);
                i22 += i17;
            }
            i17 = i17;
            for (i23 = 2; i23 < 83; i23++) {
                for (i25 = 1; i25 < 2; ++i25) {
                    i19 -= -9761;
                    if (Test.bFld) {
                        iArr2 = iArr2;
                        i22 >>>= -28;
                        i17 -= i17;
                    }
                    i24 >>>= i17;
                    Test.instanceCount += (((i25 * Test.iFld) + i26) - i19);
                    Test.instanceCount = i24;
                    Test.iFld += (14 + (i25 * i25));
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}