package tests.javafuzzer2034;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 07:43:57 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=4104482556L;
    public static byte byFld=-49;
    public double dFld=0.21326;
    public static float fFld=-37.564F;
    public short sFld=-14194;
    public volatile int iFld=-252;
    public static double dArrFld[]=new double[N];
    public long lArrFld[]=new long[N];
    public float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 1.126274);
    }

    public static long iMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static double dMeth(int i2, int i3) {

        int iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, -12);

        i2 = iArr1[(i2 >>> 1) % N];
        i2 += (int)Math.min((--i3) - i2, ++Test.instanceCount);
        long meth_res = i2 + i3 + FuzzerUtils.checkSum(iArr1);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public int iMeth1(long l) {

        int i4=0, i5=3, i6=-8, i7=25542, i8=63560, i9=50763, iArr3[]=new int[N];
        double d1=-105.104708;
        boolean b1=false;

        FuzzerUtils.init(iArr3, -5);

        for (i4 = 4; i4 < 245; i4++) {
            dMeth(-1, i5);
            i5 += (i4 * l);
            iArr3[i4] /= (int)(i4 | 1);
        }
        d1 = 1;
        while (++d1 < 397) {
            i5 *= i4;
            dFld = Test.byFld;
            for (i6 = 1; i6 < 4; i6++) {
                l = (long)2.954;
                i7 |= (int)l;
                if (b1) continue;
                for (i8 = 2; i8 > 1; i8--) {
                    Test.fFld += (i8 * i8);
                    i9 *= -125;
                    iArr3[i6 + 1] <<= i5;
                }
            }
        }
        long meth_res = l + i4 + i5 + Double.doubleToLongBits(d1) + i6 + i7 + (b1 ? 1 : 0) + i8 + i9 +
            FuzzerUtils.checkSum(iArr3);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth(int i1, float f, boolean b) {

        short s=2296;
        long l1=-40176L;
        double d2=-2.75512;
        int i10=-46973, i11=-247, iArr2[]=new int[N];

        FuzzerUtils.init(iArr2, -43490);

        lArrFld[(i1 >>> 1) % N] = (i1 *= -183);
        i1 *= (int)(Math.abs(dMeth(i1, i1)) - (Test.byFld += (byte)(0.649F - (Test.instanceCount + i1))));
        dMeth(-1, iArr2[(23 >>> 1) % N]);
        fArrFld[(-12 >>> 1) % N] = (iMeth1(Test.instanceCount) - i1);
        i1 -= (int)Test.instanceCount;
        s *= Test.byFld;
        l1 = 172;
        do {
            for (d2 = 1; d2 < 9; d2++) {
                i1 <<= (int)l1;
                Test.instanceCount -= 223;
                i10 -= i1;
                s = (short)i1;
                i1 -= (int)Test.fFld;
                i10 = i10;
                try {
                    i11 = (iArr2[(int)(d2 - 1)] / i1);
                    i10 = (iArr2[(int)(l1)] % i1);
                    i11 = (i1 / i11);
                } catch (ArithmeticException a_e) {}
            }
        } while (--l1 > 0);
        long meth_res = i1 + Float.floatToIntBits(f) + (b ? 1 : 0) + s + l1 + Double.doubleToLongBits(d2) + i10 + i11 +
            FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=173, i12=-51942, i13=-168, i14=-38251, i15=253, i16=-26300, iArr[]=new int[N];
        double d=45.49555;
        boolean b2=true;
        long l2=1L;
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr, 14);
        FuzzerUtils.init(sArr, (short)17376);

        iArr[(i >>> 1) % N] = (int)((-91 - Test.dArrFld[(4 >>> 1) % N]) + (-(d - i)));
        if (b2) {
            Test.instanceCount ^= ((iArr[(i >>> 1) % N] - iMeth(i, Test.fFld, b2)) + sFld);
            for (i12 = 145; i12 > 5; i12--) {
                d -= Test.instanceCount;
                i14 = 179;
                while (--i14 > 0) {
                    i += (int)l2;
                }
                i15 = 1;
                while (++i15 < 179) {
                    i13 += i14;
                    i16 = 1;
                    do {
                        switch ((((i12 >>> 1) % 7) * 5) + 87) {
                        case 94:
                            if (b2) continue;
                            b2 = true;
                        case 116:
                            lArrFld[i15 + 1] = i14;
                            iFld -= (int)7107154044266444484L;
                        case 88:
                            l2 >>= 3L;
                            iFld += (int)(3718039075L + (i16 * i16));
                            Test.instanceCount += (long)d;
                            break;
                        case 118:
                            switch (((32870 >>> 1) % 3) + 42) {
                            case 42:
                                i13 -= i15;
                                break;
                            case 43:
                                i %= (int)((long)(d) | 1);
                                Test.dArrFld[i16] -= i16;
                            case 44:
                                Test.instanceCount = i15;
                                break;
                            default:
                                l2 += (i16 ^ i);
                            }
                            switch ((i16 % 6) + 8) {
                            case 8:
                                sArr[i15 - 1] += (short)i13;
                                break;
                            case 9:
                                Test.fFld = i16;
                                break;
                            case 10:
                                Test.instanceCount -= (long)107.126674;
                                iFld >>>= i15;
                                break;
                            case 11:
                                i += (((i16 * i16) + l2) - i13);
                                break;
                            case 12:
                            case 13:
                                Test.instanceCount -= (long)dFld;
                                break;
                            }
                            break;
                        case 110:
                            i13 = i;
                            break;
                        case 111:
                            dFld = i16;
                            break;
                        case 117:
                            i13 = i12;
                        }
                    } while (--i16 > 0);
                }
            }
        } else if (b2) {
            b2 = b2;
        } else {
            sFld = (short)l2;
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
//DEBUG  dMeth ->  dMeth iMeth mainTest iMeth1
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
