package tests.javafuzzer604;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 06:28:51 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-7342571L;
    public static short sFld=-31984;
    public static volatile byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)103);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(long l1, int i3, int i4) {

        int i5=-5825, i6=4, i7=-18747, i8=-25, i9=195, i10=7, i11=-75, i12=-14, iArr[]=new int[N];
        boolean b=true;
        float f=103.737F;
        double d2=3.4292, dArr[]=new double[N];

        FuzzerUtils.init(iArr, 1);
        FuzzerUtils.init(dArr, 1.42773);

        for (i5 = 4; i5 < 177; i5++) {
            if (b) break;
            for (i7 = 9; i7 > 1; i7 -= 3) {
                i3 += i7;
                i3 = Test.sFld;
                switch (((i8 >>> 1) % 3) + 13) {
                case 13:
                    for (i9 = 1; i9 < 5; i9++) {
                        l1 -= l1;
                        i4 -= (int)f;
                        i6 = (int)d2;
                        try {
                            i3 = (i10 % 1342149010);
                            i10 = (26461 / i9);
                            iArr[i9 + 1] = (i9 % i6);
                        } catch (ArithmeticException a_e) {}
                    }
                    for (i11 = 1; 5 > i11; i11++) {
                        l1 >>= l1;
                        f = i10;
                        i6 ^= Test.sFld;
                    }
                    break;
                case 14:
                    d2 -= i8;
                    break;
                case 15:
                    Test.sFld -= (short)1.144F;
                    break;
                default:
                    dArr = dArr;
                }
            }
        }
        long meth_res = l1 + i3 + i4 + i5 + i6 + (b ? 1 : 0) + i7 + i8 + i9 + i10 + Float.floatToIntBits(f) +
            Double.doubleToLongBits(d2) + i11 + i12 + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(double d, int i, int i1) {

        double d1=-24.54808;
        int i2=12, i13=9, i14=93, iArr1[]=new int[N];
        float f1=-1.588F;
        long l2=-2178906958L, lArr[]=new long[N];
        byte by=0;

        FuzzerUtils.init(lArr, 3L);
        FuzzerUtils.init(iArr1, 44);

        i = (i1++);
        for (d1 = 6; d1 < 214; ++d1) {
            i2 = (int)((iMeth(Test.instanceCount, i1, i) - i1) * d1);
            for (f1 = 1; f1 < 8; ++f1) {
                for (l2 = 2; l2 > 1; l2--) {
                    i14 = i14;
                    by -= (byte)i;
                    iArr1[(int)(l2 - 1)] = i;
                    iArr1 = iArr1;
                    i1 -= (int)l2;
                    i13 = Test.sFld;
                    i >>= 184;
                    i1 += (int)(l2 * i2);
                }
                by = (byte)d;
                Test.instanceCount += (long)f1;
            }
        }
        vMeth1_check_sum += Double.doubleToLongBits(d) + i + i1 + Double.doubleToLongBits(d1) + i2 +
            Float.floatToIntBits(f1) + i13 + l2 + i14 + by + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth() {

        double d3=0.87280;
        int i15=166, i16=-17659, i17=225, i18=-9, i19=-4, i20=2, i21=12, i22=-176;
        boolean b1=false;
        long lArr1[][]=new long[N][N];

        FuzzerUtils.init(lArr1, 8535900862934783307L);

        vMeth1(d3, 13142, -44457);
        i15 = 1;
        do {
            Test.sFld += (short)(55.51F + (i15 * i15));
            switch (((i15 % 2) * 5) + 7) {
            case 17:
                for (i16 = i15; 6 > i16; i16++) {
                    i17 -= 40520;
                    if (b1) continue;
                    lArr1[i15][i16 - 1] >>>= i17;
                    for (i18 = 1; i18 < 1; ++i18) {
                        i20 += i18;
                        Test.instanceCount /= (i17 | 1);
                    }
                }
                for (i21 = 1; i21 < 6; i21++) {
                    Test.instanceCount = i19;
                    i17 -= (int)1.215F;
                    i19 *= (int)11L;
                }
                break;
            case 9:
                i22 = i21;
                break;
            }
        } while (++i15 < 273);
        vMeth_check_sum += Double.doubleToLongBits(d3) + i15 + i16 + i17 + (b1 ? 1 : 0) + i18 + i19 + i20 + i21 + i22 +
            FuzzerUtils.checkSum(lArr1);
    }

    public void mainTest(String[] strArr1) {

        int i23=-11, i24=-59671, i25=-198, i26=47, i27=-54901, i29=-54, i30=5, i31=-222, i32=-1818, i33=47, i34=90,
            i35=-38649, i36=33180, iArr2[]=new int[N];
        float f2=-1.865F;
        double d4=1.6854;
        boolean b2=true;

        FuzzerUtils.init(iArr2, 1);

        vMeth();
        for (i23 = 4; 250 > i23; ++i23) {
            i24 /= (int)(Test.instanceCount | 1);
            i25 = 1;
            do {
                for (i26 = i25; i26 < 1; i26++) {
                    i24 += i26;
                    iArr2 = FuzzerUtils.int1array(N, (int)8);
                    Test.instanceCount = 42689;
                }
                f2 = i24;
                i27 = i27;
                i27 = (int)f2;
            } while (++i25 < 102);
            iArr2[i23 + 1] |= i24;
            f2 += (float)d4;
        }
        for (i29 = 204; i29 > 7; --i29) {
            for (i31 = 2; 127 > i31; i31++) {
                if (b2) continue;
            }
            for (i33 = 3; i33 < 127; i33++) {
                for (i35 = 2; 1 < i35; i35 -= 3) {
                    byte by1=86;
                    i36 >>>= (int)3887521275L;
                    Test.byArrFld[i35] = (byte)i23;
                    by1 += (byte)(-21895 + (i35 * i35));
                    i34 += 209;
                    d4 += i33;
                    d4 += d4;
                    try {
                        i24 = (i30 / i35);
                        i32 = (iArr2[i33] % iArr2[i29 + 1]);
                        i30 = (iArr2[i33 + 1] / iArr2[i33 + 1]);
                    } catch (ArithmeticException a_e) {}
                }
                i30 -= (int)f2;
                i27 += i35;
                iArr2[i33 + 1] -= i33;
                i24 *= i27;
            }
            i27 -= (int)f2;
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
