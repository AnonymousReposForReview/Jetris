package tests.javafuzzer2373;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 13:47:06 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-9188043734772002227L;
    public static boolean bFld=true;
    public static int iFld=-3;
    public static double dFld=79.75518;
    public static int iFld1=161;
    public short sFld=-11773;
    public static byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)-11);
    }

    public static long iMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static float fMeth(long l) {

        double d=-1.86726;
        int i1=-173;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)4);

        d *= i1;
        i1 <<= (byArr[(-8 >>> 1) % N]--);
        long meth_res = l + Double.doubleToLongBits(d) + i1 + FuzzerUtils.checkSum(byArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static int iMeth1(float f) {

        double d1=0.93109;
        int i5=43067;

        d1 += -2;
        i5 -= (int)f;
        long meth_res = Float.floatToIntBits(f) + Double.doubleToLongBits(d1) + i5;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static short sMeth(int i2, int i3) {

        int i4=250, i6=45662, i7=12;
        float f2=-2.1011F;
        short s=-4024;
        byte by=-125;
        double d2=-1.130740, dArr[]=new double[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(dArr, 100.13541);

        i4 = 1;
        while (++i4 < 192) {
            float f1=-1.335F;
            i3 = (int)(((i3 * Test.instanceCount) * iMeth1(f1)) + f1);
            for (i6 = 1; i6 < 8; ++i6) {
                i7 -= 33;
                i2 += (int)(-5L + (i6 * i6));
                f2 = 1;
                while (++f2 < 2) {
                    i2 = s;
                    switch ((int)(((f2 % 2) * 5) + 82)) {
                    case 90:
                        bArr[(int)(f2 + 1)] = Test.bFld;
                        Test.byArrFld[(int)(f2)] = by;
                        break;
                    case 83:
                        if (true) {
                            s %= (short)(Test.instanceCount | 1);
                            dArr[i4 - 1] *= i6;
                            Test.instanceCount = (long)d2;
                        } else if (Test.bFld) {
                            i7 += (59 + (f2 * f2));
                        } else if (Test.bFld) {
                            i7 += (int)Test.instanceCount;
                        } else {
                            i3 = by;
                        }
                        break;
                    }
                }
            }
        }
        long meth_res = i2 + i3 + i4 + i6 + i7 + Float.floatToIntBits(f2) + s + by + Double.doubleToLongBits(d2) +
            FuzzerUtils.checkSum(bArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static int iMeth() {

        int i=6, i8=3, i9=-33209, i10=-10, i11=-5350;
        float f3=92.661F, f4=-1.624F;
        short s1=-20748;

        i |= (int)(fMeth(Test.instanceCount) - sMeth(i, Test.iFld));
        i += i;
        Test.instanceCount = i;
        i += (int)f3;
        for (i8 = 1; i8 < 155; ++i8) {
            for (i10 = 1; i10 < 10; ++i10) {
                s1 = (short)i10;
                Test.instanceCount += (i10 * Test.iFld);
                Test.dFld *= i8;
                f4 = 1;
                do {
                    i = i11;
                    Test.iFld += (int)(f4 - i8);
                } while (++f4 < 2);
                Test.bFld = Test.bFld;
                Test.instanceCount = Test.instanceCount;
            }
            f3 = i10;
        }
        long meth_res = i + Float.floatToIntBits(f3) + i8 + i9 + i10 + i11 + s1 + Float.floatToIntBits(f4);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i12=-54428, i13=4682, i14=204, i15=0, i16=-178, i17=-63, iArr[]=new int[N];
        float f5=-12.817F;
        byte by1=-29;

        FuzzerUtils.init(iArr, -1558);

        iMeth();
        for (i12 = 9; 171 > i12; i12++) {
            i14 = 1;
            do {
                Test.instanceCount += (((i14 * i14) + i13) - Test.instanceCount);
                switch (((i14 % 4) * 5) + 89) {
                case 101:
                    Test.instanceCount = Test.instanceCount;
                    i15 = 1;
                    while (++i15 < 1) {
                        iArr[i15 + 1] = (int)f5;
                        Test.instanceCount = i13;
                        i13 += (((i15 * by1) + i12) - i13);
                    }
                    i13 += i14;
                    iArr[i12] += i13;
                    break;
                case 103:
                    for (i16 = 1; i16 < 1; i16++) {
                        i13 += (int)Test.instanceCount;
                        i17 <<= i16;
                        Test.iFld &= -8;
                        switch (((i15 >>> 1) % 2) + 97) {
                        case 97:
                            Test.instanceCount = 64615;
                            f5 -= Test.instanceCount;
                        case 98:
                            i17 = i13;
                            f5 *= -22570;
                            break;
                        }
                        switch ((i12 % 5) + 56) {
                        case 56:
                            i13 += (((i16 * Test.instanceCount) + i17) - Test.iFld);
                        case 57:
                            Test.instanceCount += (((i16 * Test.instanceCount) + i13) - i12);
                            break;
                        case 58:
                            Test.iFld1 = i13;
                            Test.instanceCount %= (Test.instanceCount | 1);
                            Test.iFld1 += (i16 - i15);
                            break;
                        case 59:
                            Test.iFld1 += i16;
                            Test.instanceCount <<= -28143;
                            Test.iFld = i15;
                        case 60:
                            f5 += (float)-7.46898;
                            break;
                        }
                    }
                    break;
                case 96:
                    iArr[i12] = 95;
                    break;
                case 93:
                    Test.instanceCount *= sFld;
                    break;
                }
            } while (++i14 < 155);
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  fMeth ->  fMeth iMeth mainTest
//DEBUG  sMeth ->  sMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 sMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
