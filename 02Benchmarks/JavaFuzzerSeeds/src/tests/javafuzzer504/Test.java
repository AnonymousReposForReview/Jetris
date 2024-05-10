package tests.javafuzzer504;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 04:46:49 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-73L;
    public double dFld=1.100533;
    public static int iArrFld[]=new int[N];
    public static float fArrFld[][]=new float[N][N];
    public double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 52);
        FuzzerUtils.init(Test.fArrFld, 0.469F);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;

    public static boolean bMeth(long l1) {

        int i2=-11, i3=-164;
        byte by=-81;
        short s1=32241;
        float f=-56.515F, fArr[]=new float[N];
        double d1=-1.50209, d2=2.129784;
        boolean b1=false;

        FuzzerUtils.init(fArr, -98.331F);

        for (i2 = 343; i2 > 21; i2 -= 3) {
            by = (byte)-142L;
            s1 = (short)i2;
            f -= i3;
            f = i3;
            d1 += Test.instanceCount;
            d2 = 1;
            while (++d2 < 15) {
                b1 = b1;
                d1 %= 7075;
                Test.iArrFld[(int)(d2)] = i2;
                Test.instanceCount *= (long)f;
                try {
                    i3 = (-1311153340 % i2);
                    i3 = (i3 / i2);
                    i3 = (-117 / i3);
                } catch (ArithmeticException a_e) {}
                i3 <<= i2;
                fArr[(int)(d2)] *= f;
                i3 <<= (int)-6L;
            }
        }
        long meth_res = l1 + i2 + i3 + by + s1 + Float.floatToIntBits(f) + Double.doubleToLongBits(d1) +
            Double.doubleToLongBits(d2) + (b1 ? 1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static int iMeth(short s, int i1, double d) {

        int i4=16410, i5=-9, i6=83, i7=2, i8=-157, i9=-27304;
        long l2=8539049895372172452L;
        float f1=117.499F;
        boolean b2=true, bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, false);

        bArr[(i1 >>> 1) % N] = bMeth(Test.instanceCount);
        if (b2) {
            Test.instanceCount >>>= i1;
        } else if (b2) {
            i4 = 1;
            do {
                if (b2) {
                    for (i5 = 1; i5 < 5; ++i5) {
                        for (l2 = 1; l2 < 2; ++l2) {
                            Test.instanceCount <<= -2709535753L;
                            i7 <<= i1;
                            i7 -= i4;
                            f1 -= f1;
                        }
                        for (i8 = 1; i8 < 2; ++i8) {
                            Test.instanceCount += (((i8 * f1) + i6) - f1);
                        }
                        Test.fArrFld[i4 - 1][i5] += f1;
                        Test.iArrFld[i4] <<= i5;
                    }
                } else if (b2) {
                    Test.instanceCount *= (long)f1;
                } else if (true) {
                    i1 = i5;
                } else {
                    i6 = (int)Test.instanceCount;
                }
            } while (++i4 < 345);
        }
        long meth_res = s + i1 + Double.doubleToLongBits(d) + i4 + i5 + i6 + l2 + i7 + Float.floatToIntBits(f1) + i8 +
            i9 + (b2 ? 1 : 0) + FuzzerUtils.checkSum(bArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i, boolean b, long l) {

        short s2=-6210;

        Test.iArrFld[(i >>> 1) % N] -= (i = iMeth(s2, i, -9.100037));
        vMeth_check_sum += i + (b ? 1 : 0) + l + s2;
    }

    public void mainTest(String[] strArr1) {

        int i10=235, i11=-5, i12=-35, i13=-6, i14=59337, i15=-139, i16=-57860, i17=-192, i18=-122;
        float f2=113.792F;
        byte by1=-63;
        boolean b3=true, bArr1[]=new boolean[N];
        double d3=2.28991;

        FuzzerUtils.init(bArr1, false);

        vMeth(-223, false, Test.instanceCount);
        Test.instanceCount -= (long)dFld;
        for (i10 = 14; i10 < 294; ++i10) {
            f2 = f2;
            i12 = 90;
            while ((i12 -= 3) > 0) {
                Test.iArrFld[i12 + 1] = i11;
                i13 = 1;
                while (++i13 < 3) {
                    f2 = i12;
                    switch ((i12 % 2) + 127) {
                    case 127:
                        i11 *= (int)Test.instanceCount;
                        dArrFld[i13 - 1] += 81.26003;
                        f2 += (20077 + (i13 * i13));
                        break;
                    case 128:
                        Test.iArrFld[i10 - 1] += (int)Test.instanceCount;
                        Test.instanceCount ^= 0;
                        f2 += i13;
                        i11 += i13;
                        break;
                    }
                    i11 = i13;
                }
                i11 += by1;
                Test.iArrFld[i10 + 1] = i10;
                Test.iArrFld = Test.iArrFld;
                for (i14 = i10; i14 < 3; ++i14) {
                    bArr1[i12 + 1] = b3;
                    i11 = i14;
                }
                Test.instanceCount += -203;
                for (d3 = 1; d3 < 3; d3++) {
                    i15 += (int)d3;
                }
            }
            for (i17 = 90; i17 > 1; --i17) {
                i16 += i17;
                Test.iArrFld[i10 - 1] = -3;
                if (b3) break;
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
//DEBUG  bMeth ->  bMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}