package tests.javafuzzer1497;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 21:27:59 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-149628810L;
    public static short sFld=25824;
    public boolean bFld=false;
    public static float fFld=94.565F;
    public int iArrFld[][]=new int[N][N];
    public static int iArrFld1[]=new int[N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld1, 9);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(long l1) {

        int i6=0, i7=186, i8=-1;
        float f=-2.832F;
        boolean b=true;

        for (i6 = 5; i6 < 230; ++i6) {
            i8 = 1;
            while (++i8 < 7) {
                f += i6;
            }
            i7 *= (int)14L;
            Test.instanceCount += (i6 * i6);
            i7 >>= (int)Test.instanceCount;
            if (b) break;
            Test.instanceCount = -6157780734265772564L;
            i7 += (61 + (i6 * i6));
            b = b;
        }
        long meth_res = l1 + i6 + i7 + i8 + Float.floatToIntBits(f) + (b ? 1 : 0);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(long l) {

        float f1=0.264F;
        double d=38.47290, dArr[]=new double[N];
        int i10=-47371, i11=-6, i12=230, i13=-92, iArr[]=new int[N];

        FuzzerUtils.init(iArr, 36153);
        FuzzerUtils.init(dArr, -2.81422);

        Test.instanceCount <<= lMeth(-8L);
        for (int i9 : iArr) {
            i9 = i9;
            f1 = f1;
            iArr[(i9 >>> 1) % N] += (int)d;
            for (i10 = 1; i10 < 4; ++i10) {
                i9 *= (int)0L;
                switch (((i10 % 2) * 5) + 62) {
                case 63:
                    f1 += i10;
                    break;
                case 65:
                }
                iArr[i10] = i9;
                for (i12 = 2; i12 > i10; i12 -= 3) {
                    f1 -= i13;
                    l += (long)f1;
                    i9 = (int)Test.instanceCount;
                    dArr[i12 + 1] *= d;
                }
            }
        }
        vMeth_check_sum += l + Float.floatToIntBits(f1) + Double.doubleToLongBits(d) + i10 + i11 + i12 + i13 +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static int iMeth(int i3, int i4, int i5) {

        boolean b1=true;
        int i14=5, i15=145, i16=-1, i17=156;
        float fArr[][]=new float[N][N];

        FuzzerUtils.init(fArr, 65.507F);

        i3 += i5;
        i4 += (int)(((-Integer.reverseBytes(i3)) - 115.64853) + (i5++));
        vMeth(Test.instanceCount);
        i5 <<= i5;
        if (b1) {
            Test.iArrFld1[(i4 >>> 1) % N] += (int)-240L;
        } else {
            fArr[(i3 >>> 1) % N][(i4 >>> 1) % N] = i5;
            i14 = 1;
            while (++i14 < 173) {
                i4 = i5;
                for (i15 = 9; i15 > i14; i15 -= 2) {
                    i5 -= i16;
                    i17 = 1;
                    while (++i17 < 1) {
                        i3 = i17;
                        i5 += i17;
                        Test.sFld ^= (short)i3;
                    }
                }
            }
        }
        long meth_res = i3 + i4 + i5 + (b1 ? 1 : 0) + i14 + i15 + i16 + i17 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=3, i1=13, i2=-57, i18=161, i19=-5, i20=-43, i21=209, i22=-34598;
        long l2=7503000034503871596L;
        double d1=-1.110047;

        i -= (++i);
        for (i1 = 6; i1 < 124; i1++) {
            if (bFld) {
                i2 = (int)(++Test.instanceCount);
                try {
                    i = (iArrFld[i1][i1 - 1] % i2);
                    i = (i2 % 46085);
                    i2 = (i1 / -33870);
                } catch (ArithmeticException a_e) {}
            } else if (true) {
                i &= (int)(((-(-Test.instanceCount)) + iMeth(i2, i1, i)) - 25155);
            } else {
                for (i18 = 4; i18 < 212; ++i18) {
                    i2 -= i1;
                    Test.instanceCount = i2;
                    i <<= 208;
                    Test.fFld *= -118.980F;
                    Test.instanceCount <<= i19;
                    Test.fFld = i18;
                    if (bFld) continue;
                }
                i20 |= i18;
            }
            l2 = 1;
            do {
                i20 -= i20;
                i20 = i2;
                i20 += (int)d1;
                for (i21 = 1; 1 > i21; i21++) {
                    short s=-18443;
                    i22 += (i21 + Test.instanceCount);
                    Test.iArrFld1[(int)(l2)] += -176;
                    i2 += i;
                    switch ((i1 % 2) + 62) {
                    case 62:
                    case 63:
                        i2 += i21;
                        i2 = i21;
                        i22 += i19;
                        i20 <<= (int)l2;
                        break;
                    default:
                        lArrFld[i21 + 1] += s;
                        i20 = i;
                    }
                }
            } while (++l2 < 212);
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
