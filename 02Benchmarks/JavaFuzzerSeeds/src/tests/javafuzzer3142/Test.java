package tests.javafuzzer3142;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 02:39:11 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-2L;
    public static boolean bFld=false;
    public int iFld=-6;
    public int iFld1=23;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 181);
        FuzzerUtils.init(Test.lArrFld, 4L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i2) {

        int iArr[]=new int[N];

        FuzzerUtils.init(iArr, 3307);

        iArr[(-8432 >>> 1) % N] -= i2;
        long meth_res = i2 + FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(short s) {

        int i1=228, i3=33, i4=-6;
        float f=0.476F, fArr[]=new float[N];
        double d=-82.124383;

        FuzzerUtils.init(fArr, -1.498F);

        i1 = 1;
        do {
            iMeth1(i1);
        } while (++i1 < 129);
        switch ((((i1 >>> 1) % 1) * 5) + 78) {
        case 81:
            fArr[(i1 >>> 1) % N] = 859703411L;
            break;
        default:
            Test.iArrFld = FuzzerUtils.int1array(N, (int)44437);
        }
        i3 = 1;
        do {
            f *= 56;
            for (d = 8; d > 1; d--) {
                try {
                    i4 = (768648268 % i3);
                    Test.iArrFld[(int)(d)] = (i4 / i1);
                    Test.iArrFld[(int)(d - 1)] = (-6 / i3);
                } catch (ArithmeticException a_e) {}
                i4 += (-113 + (d * d));
                Test.bFld = Test.bFld;
                f *= i1;
                if (Test.bFld) {
                    Test.instanceCount = i3;
                    vMeth_check_sum += s + i1 + i3 + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i4 +
                        Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                    return;
                } else {
                    i4 %= (int)(i1 | 1);
                }
            }
        } while (++i3 < 205);
        vMeth_check_sum += s + i1 + i3 + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i4 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth(int i, long l) {

        short s1=30671;
        int i5=-64686, i6=30, i7=-170, i8=-49;

        vMeth(s1);
        for (i5 = 8; i5 < 237; ++i5) {
            i = i6;
            l += i5;
            for (i7 = 1; 7 > i7; ++i7) {
                float f1=-21.541F;
                Test.instanceCount += (((i7 * i7) + Test.instanceCount) - i7);
                Test.lArrFld[i7] = i7;
                if (Test.bFld) break;
                Test.iArrFld[i7 + 1] *= (int)Test.instanceCount;
                switch (((i7 >>> 1) % 6) + 21) {
                case 21:
                    Test.lArrFld[i5 - 1] = (long)f1;
                    i >>>= (int)-243L;
                    i8 <<= i6;
                    if (i != 0) {
                    }
                    break;
                case 22:
                    Test.lArrFld[i5 - 1] <<= 1;
                    break;
                case 23:
                    f1 = l;
                    break;
                case 24:
                    i -= (int)Test.instanceCount;
                    break;
                case 25:
                    i8 += (i7 * i7);
                    break;
                case 26:
                    i = -186;
                    break;
                default:
                    Test.instanceCount = l;
                }
            }
        }
        long meth_res = i + l + s1 + i5 + i6 + i7 + i8;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        byte by=97;
        float f2=-1.130F;
        int i9=0, i10=-53, i11=-239, i12=8, i13=38, i14=14, i15=-52734, i16=8;
        double d1=-2.77571;
        short s2=-18441;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 5L);

        lArr[(-225 >>> 1) % N] /= -48289;
        by = (byte)(iMeth(-34305, Test.instanceCount) + f2);
        Test.instanceCount -= i9;
        by = (byte)Test.instanceCount;
        i10 = 1;
        do {
            if (Test.bFld) continue;
            Test.iArrFld[i10] = (int)10075L;
            f2 = i10;
            Test.iArrFld[i10 + 1] = i9;
            d1 = iFld;
        } while (++i10 < 210);
        i9 -= -178;
        for (i11 = 391; i11 > 20; i11--) {
            d1 += iFld;
            switch ((i11 % 7) + 1) {
            case 1:
                f2 += (i11 - by);
                i13 = 1;
                while (++i13 < 68) {
                    f2 += Test.instanceCount;
                }
                break;
            case 2:
                d1 -= i13;
                switch (((i11 % 7) * 5) + 14) {
                case 39:
                    Test.iArrFld[i11 + 1] = i11;
                    for (i14 = 3; 68 > i14; i14++) {
                        i12 = s2;
                        i12 = (int)Test.instanceCount;
                        i12 += (((i14 * i12) + i11) - i14);
                        Test.iArrFld = Test.iArrFld;
                        Test.instanceCount = Test.instanceCount;
                        i16 = 1;
                        do {
                            Test.iArrFld[i16 + 1] *= (int)Test.instanceCount;
                            iFld *= i15;
                            Test.bFld = true;
                        } while (++i16 < 2);
                    }
                    break;
                case 19:
                    Test.iArrFld[i11] -= i9;
                    break;
                case 36:
                    d1 += iFld1;
                    break;
                case 22:
                    Test.instanceCount &= Test.instanceCount;
                case 49:
                    i9 |= 2;
                    break;
                case 26:
                    i9 += (((i11 * i11) + i16) - Test.instanceCount);
                case 21:
                    i12 <<= i9;
                    break;
                }
                break;
            case 3:
                Test.instanceCount += (i11 * i11);
            case 4:
                i12 |= i11;
                break;
            case 5:
                f2 = i15;
                break;
            case 6:
                Test.iArrFld[i11] |= 13;
                break;
            case 7:
                iFld += iFld1;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
