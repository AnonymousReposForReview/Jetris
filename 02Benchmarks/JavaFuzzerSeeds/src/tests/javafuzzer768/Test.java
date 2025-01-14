package tests.javafuzzer768;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 09:16:05 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=12L;
    public short sFld=-25913;
    public static short sFld1=25175;
    public static double dFld=-11.130608;
    public long lArrFld[]=new long[N];

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static void vMeth(int i1, long l, double d) {

        int iArr[]=new int[N], iArr1[]=new int[N];

        FuzzerUtils.init(iArr, -152);
        FuzzerUtils.init(iArr1, 585);

        l *= (((l - i1) + (-(i1 |= Test.sFld1))) - iArr[(i1 >>> 1) % N]);
        iArr1[(i1 >>> 1) % N] -= (int)9L;
        vMeth_check_sum += i1 + l + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth1(long l2) {

        double d2=1.1955;
        int i3=-1971, i4=-44220, i5=-144, i6=5, iArr3[]=new int[N];
        byte by1=123, byArr[]=new byte[N];
        float f=-124.884F;

        FuzzerUtils.init(byArr, (byte)-35);
        FuzzerUtils.init(iArr3, -72);

        d2 = 1;
        do {
            for (i3 = 1; 5 > i3; ++i3) {
                i4 ^= i3;
                vMeth(i3, l2, 3.64065);
                by1 += (byte)i3;
                i4 *= i3;
                for (i5 = 1; 2 > i5; ++i5) {
                    by1 += (byte)(-9129 + (i5 * i5));
                    Test.instanceCount += (i5 - i3);
                    byArr[i5] <<= (byte)i3;
                }
                iArr3[i3] -= (int)Test.instanceCount;
                iArr3[i3 - 1] = i5;
                iArr3 = iArr3;
                f /= ((long)(d2) | 1);
                f = -6.413F;
            }
        } while (++d2 < 350);
        long meth_res = l2 + Double.doubleToLongBits(d2) + i3 + i4 + by1 + i5 + i6 + Float.floatToIntBits(f) +
            FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr3);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(long l1) {

        int i2=-63813, i7=8, i8=-8, iArr2[][]=new int[N][N];
        double d1=-50.32405;
        byte by=-25;
        float f1=-86.891F, f2=-1.781F;
        boolean b=true;

        FuzzerUtils.init(iArr2, -40190);

        iArr2[(i2 >>> 1) % N][(-14 >>> 1) % N] += (int)d1;
        by += (byte)(iMeth1(l1) - d1);
        Test.instanceCount -= i2;
        for (i7 = 4; 160 > i7; ++i7) {
            by += (byte)(((i7 * i2) + i2) - i8);
            Test.instanceCount = (long)f1;
        }
        iArr2[(i2 >>> 1) % N] = FuzzerUtils.int1array(N, (int)-10);
        l1 += (long)d1;
        f2 = 1;
        do {
            i2 = -45572;
            i8 = i7;
            if (b) {
                Test.sFld1 += (short)(((f2 * by) + by) - i7);
                i2 += (11343 + (f2 * f2));
                i2 -= i2;
            }
        } while (++f2 < 293);
        long meth_res = l1 + i2 + Double.doubleToLongBits(d1) + by + i7 + i8 + Float.floatToIntBits(f1) +
            Float.floatToIntBits(f2) + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=4, i9=13, i10=1, i11=-4, i12=-186, i13=13, i14=-113, i15=14, iArr4[]=new int[N];
        float f3=0.717F, f4=0.226F;
        long l3=-87961429L;
        byte by2=1;
        boolean b1=false;

        FuzzerUtils.init(iArr4, 18627);

        i = (sFld + (i++));
        vMeth((int)((Test.instanceCount + (i * i)) * iMeth(Test.instanceCount)), Test.instanceCount, Test.dFld);
        for (f3 = 9; f3 < 271; f3++) {
            Test.instanceCount += (long)(f3 * i9);
            iArr4[(int)(f3 - 1)] >>= i9;
            for (i10 = 4; i10 < 96; i10 += 2) {
                i %= (int)(i10 | 1);
                iArr4[(int)(f3 - 1)] -= i11;
            }
            i -= i10;
            Test.instanceCount -= i;
            l3 = 1;
            do {
                for (i12 = 1; i12 < 1; i12++) {
                    i = sFld;
                    i11 |= (int)Test.instanceCount;
                    Test.instanceCount <<= -20890;
                    Test.sFld1 -= (short)i11;
                    i11 += Test.sFld1;
                    try {
                        iArr4[(int)(l3)] = (iArr4[i12 - 1] % -22422);
                        i11 = (iArr4[i12 + 1] / 31);
                        i = (i10 / 57832);
                    } catch (ArithmeticException a_e) {}
                    try {
                        i9 = (-21246 % i12);
                        i13 = (i / -107);
                        i13 = (i13 / i10);
                    } catch (ArithmeticException a_e) {}
                    f4 -= i10;
                    if (true) break;
                    i += (((i12 * by2) + l3) - i12);
                }
            } while (++l3 < 96);
        }
        f4 -= (float)Test.dFld;
        if (b1) {
            lArrFld[(i13 >>> 1) % N] = i12;
        } else {
            lArrFld[(i13 >>> 1) % N] += i9;
            for (i14 = 2; i14 < 215; i14++) {
                Test.instanceCount += i14;
                Test.instanceCount += (i14 * Test.sFld1);
                i13 += (i14 * i14);
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
//DEBUG  vMeth ->  vMeth mainTest iMeth1 iMeth
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
