package tests.javafuzzer3238;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 04:23:33 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2310377944L;
    public static float fFld=-2.227F;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -9);
    }

    public static long lMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i6, float f, int i7) {

        int i8=-53, i9=-15148, i10=163, i11=-57081, iArr[]=new int[N];
        double d=2.113715, dArr[]=new double[N];
        short s=-10035;
        byte by1=56;
        boolean b1=true;

        FuzzerUtils.init(iArr, 25700);
        FuzzerUtils.init(dArr, 0.83875);

        if (b1) {
            for (i8 = 7; i8 < 280; i8++) {
                for (i10 = 1; i10 < 6; i10++) {
                    Test.instanceCount *= (long)d;
                }
                switch (((i8 % 6) * 5) + 101) {
                case 119:
                    iArr[i8 + 1] += s;
                    break;
                case 114:
                    i7 %= (int)((long)(f) | 1);
                    break;
                case 117:
                    i6 += (((i8 * i8) + Test.instanceCount) - Test.instanceCount);
                    i6 += (((i8 * i8) + Test.instanceCount) - i7);
                    by1 += (byte)i8;
                    break;
                case 131:
                    iArr[i8] = i10;
                    i9 = i8;
                    Test.instanceCount = i8;
                case 125:
                    i6 += i8;
                    f += i8;
                case 115:
                    i9 += (int)Test.instanceCount;
                default:
                    i11 /= (int)(i11 | 1);
                }
            }
        } else if (b1) {
            i7 = 7646;
        }
        vMeth_check_sum += i6 + Float.floatToIntBits(f) + i7 + i8 + i9 + i10 + i11 + Double.doubleToLongBits(d) + s +
            by1 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static long lMeth1(boolean b, int i4, int i5) {

        int i12=18071, i13=251, i14=237, i15=-35093, i16=-7, iArr1[]=new int[N];
        float f1=-115.129F, f2=2.366F, fArr[]=new float[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -3710391134L);
        FuzzerUtils.init(fArr, 2.846F);
        FuzzerUtils.init(iArr1, -1);

        vMeth(i4, 98.407F, -6);
        lArr = lArr;
        for (i12 = 9; i12 < 258; i12++) {
            byte by2=25;
            by2 *= (byte)i12;
            if (i4 != 0) {
            }
            i5 /= (int)(i5 | 1);
            for (f1 = 1; f1 < 7; f1++) {
                f2 -= i5;
                for (i15 = i12; 2 > i15; ++i15) {
                    fArr[i12 + 1] = -27427;
                    i4 += (i15 * i4);
                    iArr1[i12] = i5;
                    i14 <<= i14;
                }
                Test.instanceCount = -3L;
                i14 += i15;
            }
        }
        long meth_res = (b ? 1 : 0) + i4 + i5 + i12 + i13 + Float.floatToIntBits(f1) + i14 + Float.floatToIntBits(f2) +
            i15 + i16 + FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(iArr1);
        lMeth1_check_sum += meth_res;
        return (long)meth_res;
    }

    public static long lMeth(int i3, byte by) {

        boolean b2=true;
        int i17=-40533, i18=86, i19=-2, i20=-6100, i21=-45169, i22=-14;
        float f3=2.391F;
        double d2=-59.58814;

        lMeth1(b2, 10, i3);
        i17 *= (int)Test.instanceCount;
        i18 = 1;
        do {
            i3 -= -85;
            i3 += i3;
            for (i19 = 1; i19 < 8; i19 += 3) {
                i20 += (i19 | i18);
                switch (((i20 >>> 1) % 7) + 125) {
                case 125:
                    Test.iArrFld[i19 - 1] = i17;
                    i17 = (int)f3;
                    for (i21 = 1; i21 < 4; i21++) {
                        i3 >>>= by;
                        if (b2) break;
                    }
                    break;
                case 126:
                    Test.iArrFld[i19 + 1] <<= i22;
                    Test.instanceCount = Test.instanceCount;
                case 127:
                    b2 = b2;
                    break;
                case 128:
                    d2 = f3;
                    break;
                case 129:
                    i22 -= i20;
                case 130:
                    Test.instanceCount -= i3;
                    break;
                case 131:
                    Test.iArrFld[i18] -= (int)Test.instanceCount;
                default:
                    if (b2) break;
                }
            }
        } while (++i18 < 205);
        long meth_res = i3 + by + (b2 ? 1 : 0) + i17 + i18 + i19 + i20 + Float.floatToIntBits(f3) + i21 + i22 +
            Double.doubleToLongBits(d2);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-102, i1=7, i2=5, i23=-155, i24=-242, i25=166, i26=1;
        byte by3=98;
        short s1=-24767;
        boolean b3=false;

        for (i = 5; i < 204; i++) {
            i2 = 1;
            do {
                i1 -= (int)(lMeth(i, by3) * Test.instanceCount);
                i1 += (i2 * i2);
                for (i23 = 1; i23 < 1; i23 += 2) {
                    Test.iArrFld[i23] = 8;
                    Test.instanceCount *= i23;
                    i24 = (int)Test.instanceCount;
                    i24 *= i23;
                }
                i24 = -61;
                switch ((i % 2) + 61) {
                case 61:
                    Test.fFld = s1;
                    Test.instanceCount *= i23;
                    break;
                case 62:
                    i1 <<= i24;
                    b3 = b3;
                    break;
                }
                try {
                    i1 = (Test.iArrFld[i2] % Test.iArrFld[i]);
                    i1 = (-164 % Test.iArrFld[i2 + 1]);
                    i1 = (190 % i23);
                } catch (ArithmeticException a_e) {}
                Test.instanceCount += i2;
                for (i25 = 1; 1 > i25; ++i25) {
                    Test.iArrFld[i25 - 1] -= i;
                    Test.iArrFld[i] *= 75;
                    i26 += (i25 * i25);
                    Test.fFld += (((i25 * by3) + s1) - by3);
                    switch (((i2 % 6) * 5) + 117) {
                    case 119:
                        i1 += (((i25 * i) + i) - i);
                        break;
                    case 128:
                        Test.instanceCount -= Test.instanceCount;
                        i26 |= i;
                        i26 = 0;
                        break;
                    case 146:
                        i26 = i24;
                        Test.instanceCount = i2;
                        break;
                    case 144:
                    case 123:
                        i24 += (((i25 * Test.instanceCount) + Test.instanceCount) - Test.fFld);
                        break;
                    case 139:
                        Test.iArrFld[i25 - 1] = (int)-125.429F;
                        break;
                    default:
                        s1 = (short)i1;
                    }
                }
            } while (++i2 < 126);
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  lMeth1 ->  lMeth1 lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth1 lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}