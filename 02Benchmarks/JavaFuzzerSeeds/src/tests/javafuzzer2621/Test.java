package tests.javafuzzer2621;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 17:36:55 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=10L;
    public static long lFld=206L;
    public static float fFld=-119.643F;
    public volatile long lFld1=-3534984568875391357L;
    public static byte byFld=-86;
    public volatile int iArrFld[]=new int[N];

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;

    public void vMeth() {

        long l=1695242332258274823L;
        int i=0;

        for (l = 8; l < 332; ++l) {
            if (i != 0) {
                vMeth_check_sum += l + i;
                return;
            }
        }
        vMeth_check_sum += l + i;
    }

    public static int iMeth2() {

        int i14=1, i15=16953, i16=-24656, i17=9, i18=43, iArr1[]=new int[N], iArr2[]=new int[N];
        float f=2.866F;
        double d2=23.86896, d3=105.107435;
        boolean b1=false;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr1, 14);
        FuzzerUtils.init(lArr1, -1650263731L);
        FuzzerUtils.init(iArr2, -68);

        for (i14 = 2; i14 < 202; ++i14) {
            i15 *= (int)f;
            for (i16 = 1; 8 > i16; i16++) {
                i17 -= i16;
                d2 = i17;
                iArr1[i14 - 1] = i15;
            }
            i17 += (((i14 * i15) + i15) - i17);
            if (b1) {
                for (d3 = i14; d3 < 8; ++d3) {
                    lArr1[(int)(d3 + 1)] <<= 8091390900921041712L;
                    iArr2[i14 + 1] *= (int)Test.instanceCount;
                    i18 = (int)-4L;
                    i18 += (int)d2;
                    Test.lFld *= i15;
                    i15 += (int)d3;
                }
            } else if (b1) {
                i18 ^= i16;
            } else if (b1) {
                f = Test.lFld;
            } else {
                i18 = (int)9216075251323863864L;
            }
        }
        long meth_res = i14 + i15 + Float.floatToIntBits(f) + i16 + i17 + Double.doubleToLongBits(d2) +
            Double.doubleToLongBits(d3) + i18 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr2);
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth1(double d1, int i12, int i13) {

        int i19=-10, i20=-7, i21=-21101, i22=-13, iArr3[]=new int[N];

        FuzzerUtils.init(iArr3, -38096);

        i13 <<= iMeth2();
        i19 = 1;
        do {
            for (i20 = 1; i20 < 12; i20++) {
                i13 += (int)Test.fFld;
                i21 >>>= (int)Test.lFld;
                Test.fFld -= -14;
                iArr3 = FuzzerUtils.int1array(N, (int)-8);
                i22 = 1;
                do {
                    i13 = (int)Test.instanceCount;
                } while ((i22 += 2) < 2);
                i21 -= 228;
                Test.lFld += (long)(1.903F + (i20 * i20));
            }
            Test.fFld = Test.instanceCount;
        } while ((i19 += 3) < 397);
        i12 >>>= 27;
        iArr3[(i19 >>> 1) % N] = i20;
        iArr3[(i19 >>> 1) % N] *= (int)d1;
        long meth_res = Double.doubleToLongBits(d1) + i12 + i13 + i19 + i20 + i21 + i22 + FuzzerUtils.checkSum(iArr3);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        int i3=-44452, i4=-4, i5=50, i6=-163, i7=-10928, i8=-12828, i9=-172, i10=8646, i11=-55868, iArr[][]=new
            int[N][N];
        double d=0.8167;
        long lArr[]=new long[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(lArr, 1099418377L);
        FuzzerUtils.init(sArr, (short)-22000);
        FuzzerUtils.init(iArr, 14);

        i3 ^= (int)(Test.instanceCount = Test.instanceCount);
        switch (((i3 >>> 1) % 2) + 51) {
        case 51:
            for (i4 = 17; 333 > i4; i4++) {
                for (i6 = 1; i6 < 5; i6++) {
                    boolean b=true;
                    lArr[i6 + 1] = Test.instanceCount;
                    if (b = (((long)(0.127646 * (--iArr[i4][i6 + 1])) << iMeth1(2.122014, i6, i6)) < 50178)) {
                        i5 = Math.min((i6 - i4) - sArr[i6 + 1], i5 = (++iArr[i4 + 1][i4]));
                        for (i8 = 1; i8 < 2; ++i8) {
                            i3 = (int)(++Test.instanceCount);
                            i9 += (i8 + Test.instanceCount);
                            i9 = (int)(Test.instanceCount + (--i5));
                            d += (i3 + (i8 * (--Test.instanceCount)));
                        }
                        for (i10 = 2; 1 < i10; --i10) {
                            i3 = (--i9);
                            i7 >>>= (int)Test.instanceCount;
                        }
                    } else {
                        if (i5 != 0) {
                        }
                    }
                }
            }
        case 52:
            Test.lFld *= i4;
            break;
        }
        long meth_res = i3 + i4 + i5 + i6 + i7 + i8 + i9 + Double.doubleToLongBits(d) + i10 + i11 +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i1=-26638, i2=-23623, i24=56693, i25=147;
        boolean b2=false, bArr[]=new boolean[N];
        long l1=2340533954L, l2=-10L;
        double dArr[]=new double[N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(dArr, 53.63034);

        vMeth();
        for (i1 = 10; i1 < 323; i1 += 3) {
            i2 >>>= (int)(iMeth() - Test.instanceCount);
            switch (((-6 >>> 1) % 2) + 99) {
            case 99:
                i2 = (int)7515620872103814311L;
                i2 += i2;
                for (i24 = 14; i24 < 241; i24++) {
                    Test.instanceCount += (i24 | i2);
                    bArr[i24] = true;
                    switch (((i1 % 2) * 5) + 26) {
                    case 29:
                        i2 += (int)Test.instanceCount;
                        i2 += (int)Test.fFld;
                    case 35:
                        bArr[i24 - 1] = b2;
                        i25 -= i1;
                    default:
                        l1 = 1;
                        do {
                            lFld1 -= i24;
                            if (b2) {
                                dArr[i24] /= (i25 | 1);
                                i2 = (int)l2;
                                b2 = b2;
                                iArrFld[(int)(l1 - 1)] = i1;
                            } else if (b2) {
                                if (b2) continue;
                                i2 >>>= -45042;
                                switch (((i1 % 8) * 5) + 105) {
                                case 120:
                                    try {
                                        i2 = (iArrFld[i24 - 1] / iArrFld[i24]);
                                        i2 = (219 % i25);
                                        i25 = (-46463 / iArrFld[i24 - 1]);
                                    } catch (ArithmeticException a_e) {}
                                    Test.fFld += i24;
                                    Test.byFld += (byte)i2;
                                    break;
                                case 110:
                                case 125:
                                    i2 = i25;
                                case 117:
                                    lFld1 = Test.instanceCount;
                                    i25 += (int)l1;
                                    break;
                                case 118:
                                    i2 += (int)(((l1 * i2) + i24) - Test.byFld);
                                case 106:
                                    b2 = b2;
                                    break;
                                case 128:
                                    i2 >>>= (int)Test.lFld;
                                case 107:
                                    Test.instanceCount = i24;
                                    break;
                                }
                            } else if (b2) {
                                i25 += (int)(((l1 * l2) + Test.fFld) - i1);
                            } else {
                                iArrFld[(int)(l1)] = 2039;
                            }
                        } while (++l1 < 2);
                    }
                }
                break;
            case 100:
                Test.fFld *= Test.lFld;
                break;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  iMeth2 ->  iMeth2 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
