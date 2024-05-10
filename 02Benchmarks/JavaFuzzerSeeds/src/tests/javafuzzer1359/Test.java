package tests.javafuzzer1359;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 18:39:07 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3503L;
    public static boolean bFld=false;
    public int iArrFld[]=new int[N];

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1() {

        float f1=78.715F;
        int i6=13, i7=1228, i8=39, i9=-36504, i10=-98, i11=-152, iArr1[]=new int[N];
        double d=0.89866, d1=1.20942;
        short s=26101;

        FuzzerUtils.init(iArr1, -31010);

        f1 -= i6;
        iArr1 = iArr1;
        i6 = (int)Test.instanceCount;
        d = 1;
        do {
            iArr1 = iArr1;
            f1 /= 200;
            try {
                i6 = (i6 / -136);
                i6 = (iArr1[(int)(d)] % i6);
                i6 = (135174242 % iArr1[(int)(d - 1)]);
            } catch (ArithmeticException a_e) {}
            for (i7 = (int)(d); i7 < 13; i7++) {
                for (i9 = 1; i9 > 1; i9--) {
                    if (Test.bFld) break;
                    s += (short)(i9 | i8);
                    Test.instanceCount += i8;
                }
                i10 = i11;
                i11 *= i11;
                d1 += i7;
            }
        } while (++d < 121);
        long meth_res = Float.floatToIntBits(f1) + i6 + Double.doubleToLongBits(d) + i7 + i8 + i9 + i10 + s + i11 +
            Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(long l1, long l2) {

        int i3=-147, i4=135, i5=-14469, i12=-14, i13=-172, iArr[]=new int[N];
        float f=-2.78F;
        double d2=123.2564;
        short s1=-8147;

        FuzzerUtils.init(iArr, 27489);

        for (i3 = 5; i3 < 254; ++i3) {
            iArr[i3 - 1] &= (i4--);
            i4 |= Math.abs(i3);
            for (f = 1; f < 7; ++f) {
                i5 >>= iMeth1();
                switch ((int)(((f % 2) * 5) + 57)) {
                case 65:
                    i5 += i4;
                    d2 -= l2;
                    break;
                case 58:
                default:
                    for (i12 = 1; 2 > i12; ++i12) {
                        i13 -= i5;
                        i4 += (((i12 * f) + i5) - Test.instanceCount);
                        s1 *= (short)i3;
                    }
                    i4 = i5;
                }
                i5 *= i13;
            }
            i4 -= i13;
        }
        long meth_res = l1 + l2 + i3 + i4 + Float.floatToIntBits(f) + i5 + Double.doubleToLongBits(d2) + i12 + i13 + s1
            + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(long l) {

        int i=13, i1=219, i2=-58156, i14=30;
        float f2=-2.163F, f3=0.547F;
        short s2=-14523;
        double d3=0.122756, dArr[]=new double[N];
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, 5123871374569341702L);
        FuzzerUtils.init(dArr, 88.126477);

        for (i = 2; 385 > i; ++i) {
            i2 = 1;
            do {
                i1 ^= (int)(Test.instanceCount + ((-(--Test.instanceCount)) - i));
                i1 = (int)((-(i - i2)) - lArr[i][i - 1]);
                i1 = (int)((5474481204159397321L % (iMeth(Test.instanceCount, Test.instanceCount) | 1)) -
                    Test.instanceCount);
            } while (++i2 < 4);
            if (Test.bFld) break;
        }
        for (f2 = 2; f2 < 259; f2++) {
            i14 *= s2;
            lArr[(int)(f2)] = lArr[(int)(f2)];
            f3 += i2;
        }
        i1 <<= i;
        i14 += i14;
        dArr[(i14 >>> 1) % N] = -144;
        i14 <<= i2;
        d3 -= i2;
        vMeth_check_sum += l + i + i1 + i2 + Float.floatToIntBits(f2) + i14 + s2 + Float.floatToIntBits(f3) +
            Double.doubleToLongBits(d3) + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i15=-43, i16=43322, i17=-62890, i18=41693, i19=106, i20=243, i21=-200, i22=56;
        double d4=24.16080, dArr1[]=new double[N];
        float f4=23.719F, fArr[][]=new float[N][N];
        byte by=42;
        long lArr1[]=new long[N];

        FuzzerUtils.init(fArr, -20.274F);
        FuzzerUtils.init(dArr1, 23.67272);
        FuzzerUtils.init(lArr1, 3453419482L);

        vMeth(Test.instanceCount);
        Test.instanceCount -= i15;
        for (i16 = 5; i16 < 311; i16++) {
            i15 = (int)8645600110124800112L;
            for (i18 = 3; i18 < 82; i18++) {
                Test.instanceCount = 9L;
                i20 = 1;
                do {
                    Test.instanceCount = Test.instanceCount;
                    Test.instanceCount = i19;
                    i17 >>= i16;
                    i17 *= (int)d4;
                    iArrFld[i18] &= i16;
                } while (++i20 < 2);
                Test.instanceCount = -23128;
                i15 = -7;
                fArr[i16 - 1][(i20 >>> 1) % N] -= i15;
                i17 += i18;
                switch ((i18 % 1) + 52) {
                case 52:
                    iArrFld[i16 - 1] = i20;
                    Test.instanceCount -= (long)f4;
                    Test.bFld = Test.bFld;
                    break;
                }
                switch (((i18 % 1) * 5) + 124) {
                case 129:
                    dArr1[i16 - 1] *= i18;
                    if (Test.bFld) break;
                    for (i21 = 2; i21 > 1; i21 -= 3) {
                        Test.instanceCount += (i21 ^ Test.instanceCount);
                        i19 *= i16;
                        Test.instanceCount += i20;
                        by -= (byte)-129;
                        i19 -= by;
                        i19 += (int)(0.403F + (i21 * i21));
                    }
                    break;
                default:
                    lArr1[i16 + 1] ^= i16;
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