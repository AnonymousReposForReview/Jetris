package tests.javafuzzer80;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 22:02:19 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-249L;
    public int iFld=-5;
    public static short sArrFld[][]=new short[N][N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)7148);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i6=15, i7=5, i8=-7, i9=-6, i10=-228, iArr1[]=new int[N];
        float f1=2.677F;
        long l1=-8254L;
        short s=29245;

        FuzzerUtils.init(iArr1, 46834);

        for (i6 = 10; i6 < 313; ++i6) {
            switch (((i6 % 4) * 5) + 4) {
            case 18:
                i7 += (i6 | i7);
                Test.instanceCount *= (long)f1;
                i7 = i6;
                break;
            case 17:
                i7 ^= i7;
                break;
            case 23:
                Test.instanceCount = i7;
                Test.instanceCount += 10;
                for (l1 = 1; 5 > l1; ++l1) {
                    i7 += (int)(l1 * l1);
                    for (i9 = 1; i9 < 2; i9 += 2) {
                        iArr1 = iArr1;
                    }
                    s |= (short)i8;
                }
                i8 -= 0;
            case 10:
                iArr1[i6] = (int)l1;
                break;
            }
        }
        vMeth2_check_sum += i6 + i7 + Float.floatToIntBits(f1) + l1 + i8 + i9 + i10 + s + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth1(float f, int i3) {

        int i4=2, i5=63, i11=-3, i12=14, iArr2[]=new int[N];
        boolean b=true;
        long lArr[][]=new long[N][N];
        double dArr[]=new double[N];

        FuzzerUtils.init(lArr, 1109764457391136900L);
        FuzzerUtils.init(dArr, 24.90996);
        FuzzerUtils.init(iArr2, 7);

        for (i4 = 7; i4 < 147; ++i4) {
            vMeth2();
            i3 += (i4 + i5);
            i3 >>= (int)Test.instanceCount;
            i5 += (i4 * i4);
            if (b) break;
            Test.instanceCount += (long)f;
            lArr[i4][i4] += i5;
            dArr[i4 + 1] = i4;
            for (i11 = 1; 11 > i11; i11++) {
                i3 -= i5;
                lArr[i11] = lArr[i4 - 1];
                Test.instanceCount -= i11;
                iArr2[i4] |= (int)Test.instanceCount;
                i3 += i11;
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + i3 + i4 + i5 + (b ? 1 : 0) + i11 + i12 +
            FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            FuzzerUtils.checkSum(iArr2);
    }

    public static void vMeth(int i1, int i2, long l) {

        float f2=20.167F, fArr[]=new float[N];

        FuzzerUtils.init(fArr, -118.50F);

        vMeth1(f2, -11);
        i1 = i2;
        fArr[(i2 >>> 1) % N] = 204;
        i2 <<= i2;
        vMeth_check_sum += i1 + i2 + l + Float.floatToIntBits(f2) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i=-12, i13=169, i14=-69, i15=11, i16=-123, i17=-36057, iArr[]=new int[N];
        double d=-2.111612, d1=0.37486;
        short s1=-25125;
        byte by=18;
        boolean b1=true;
        float f3=-1.527F, fArr1[]=new float[N];
        long lArr1[][]=new long[N][N];

        FuzzerUtils.init(iArr, -11);
        FuzzerUtils.init(fArr1, 1.781F);
        FuzzerUtils.init(lArr1, -35558L);

        iArr[(-161 >>> 1) % N] = iArr[(56 >>> 1) % N];
        iFld ^= (iFld++);
        i = 1;
        while (++i < 157) {
            if (b1) {
                try {
                    iArr[i - 1] = (i / i);
                    iFld = (i / iArr[i]);
                    iFld = (189 / iFld);
                } catch (ArithmeticException a_e) {}
                if (b1) {
                    vMeth(-251, iFld, Test.instanceCount);
                    for (i13 = 2; 160 > i13; i13++) {
                        iFld += (int)d;
                        s1 = by;
                        Test.sArrFld[i][i + 1] += (short)i13;
                        iFld = 5;
                        try {
                            iFld = (-129 % i);
                            iFld = (i / i13);
                            iArr[i - 1] = (i13 / i);
                        } catch (ArithmeticException a_e) {}
                        switch (((-8 >>> 1) % 7) + 66) {
                        case 66:
                            Test.instanceCount *= -5;
                            fArr1 = FuzzerUtils.float1array(N, (float)-1.697F);
                            Test.instanceCount -= i;
                            break;
                        case 67:
                            if (b1) break;
                            by += (byte)i13;
                            break;
                        case 68:
                            Test.instanceCount -= i14;
                            iFld = (int)Test.instanceCount;
                            break;
                        case 69:
                            i14 += i13;
                            i14 += (((i13 * i13) + i13) - Test.instanceCount);
                            break;
                        case 70:
                            for (i15 = 1; i15 < 2; i15++) {
                                i16 = (int)Test.instanceCount;
                            }
                        case 71:
                            iFld += (int)(-86.107F + (i13 * i13));
                            for (d1 = 1; d1 < 2; d1++) {
                                iFld += (int)(d1 * d1);
                                f3 += (-7595 + (d1 * d1));
                                try {
                                    iArr[(int)(d1 + 1)] = (i / i16);
                                    i16 = (iArr[i] / iArr[(int)(d1)]);
                                    iArr[i13 - 1] = (-211 / iArr[i13]);
                                } catch (ArithmeticException a_e) {}
                            }
                            break;
                        case 72:
                            iArr[i] -= i14;
                            break;
                        default:
                            lArr1[i - 1][i] -= i16;
                        }
                    }
                } else {
                    by += (byte)(((i * i13) + i) - iFld);
                }
            } else {
                i17 += (i * i);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
