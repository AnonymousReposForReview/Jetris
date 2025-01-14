package tests.javafuzzer2877;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 22:06:50 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-561952232L;
    public boolean bFld=false;

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i4, float f, int i5) {

        int i6=-12, i7=-4, i8=-150, i9=42051, i10=-28425, iArr[]=new int[N];
        byte by=89;
        boolean b=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 1639853453L);
        FuzzerUtils.init(iArr, 100);

        lArr[(i4 >>> 1) % N] -= 60758L;
        lArr[(i4 >>> 1) % N] = i4;
        for (i6 = 6; 192 > i6; ++i6) {
            Test.instanceCount *= 41;
            if (b) {
                iArr[i6 - 1] |= i7;
                i5 /= (int)(i5 | 1);
                for (i8 = 9; i8 > i6; i8 -= 3) {
                    i9 += by;
                    i9 <<= i4;
                    try {
                        i5 = (i5 / -137);
                        i7 = (i4 % i9);
                        i7 = (i6 % i4);
                    } catch (ArithmeticException a_e) {}
                    i10 = 1;
                    do {
                        i9 -= 58952;
                        i4 += (i10 * i10);
                        if (false) break;
                    } while ((i10 += 3) < 1);
                }
            } else {
                by += (byte)(((i6 * i9) + Test.instanceCount) - i8);
            }
        }
        vMeth1_check_sum += i4 + Float.floatToIntBits(f) + i5 + i6 + i7 + i8 + i9 + by + i10 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(int i2) {

        int i3=60083;

        i2 >>= i2;
        i3 = 1;
        while (++i3 < 300) {
            vMeth1(i3, 2.392F, i2);
        }
        Test.instanceCount *= i3;
        long meth_res = i2 + i3;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(long l, int i, int i1) {

        float f1=-1.284F;
        int iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, 75);

        i += (int)((iMeth(i) + i1) - f1);
        l *= i1;
        iArr1[(-13076 >>> 1) % N] = i;
        i1 -= i;
        vMeth_check_sum += l + i + i1 + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i11=-4, i12=-58072, i13=53, i14=-87, i15=2, i16=-64035, i17=14, iArr2[]=new int[N];
        float f2=1.130F;
        double d=2.56337, dArr[][]=new double[N][N];

        FuzzerUtils.init(iArr2, -204);
        FuzzerUtils.init(dArr, 1.120596);

        vMeth(Test.instanceCount, i11, 254);
        i11 += i11;
        i12 = 293;
        do {
            i11 = i11;
            i11 |= i12;
            i11 <<= i12;
            Test.instanceCount += (long)f2;
            bFld = bFld;
            i11 = (int)f2;
            for (i13 = 1; 86 > i13; ++i13) {
                iArr2[i13 - 1] = 42911;
                i11 += (i13 | Test.instanceCount);
                if (bFld) {
                    try {
                        iArr2[i12] = (i14 / -1740571333);
                        iArr2[i12 + 1] = (iArr2[i13] / -32499);
                        i14 = (iArr2[i12] % -54059);
                    } catch (ArithmeticException a_e) {}
                } else {
                    for (i15 = 1; i15 < 2; ++i15) {
                        switch ((i13 % 1) + 29) {
                        case 29:
                            Test.instanceCount = i13;
                            i14 = i13;
                            d += i16;
                            i16 >>= -9;
                            break;
                        default:
                            Test.instanceCount = i15;
                            d += d;
                            i17 ^= 8;
                        }
                        i11 %= (int)(Test.instanceCount | 1);
                        Test.instanceCount = i15;
                        i17 += 201;
                        dArr[i15 - 1][i13] *= Test.instanceCount;
                        f2 = i17;
                    }
                    i11 *= (int)0L;
                    Test.instanceCount = i14;
                }
            }
        } while (--i12 > 0);


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
