package tests.javafuzzer1083;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 14:15:40 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-4023995207L;
    public static boolean bFld=true;
    public static byte byFld=-108;
    public static long lFld=183L;
    public static float fFld=0.892F;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[][]=new int[N][N];
    public byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 64462L);
        FuzzerUtils.init(Test.iArrFld, -210);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i8, int i9) {

        int i10=0, i11=66, i12=203, i13=-55049, i14=-18, i15=148;
        long l1=-2399L;
        float f4=1.99F;
        double d1=-108.117902;

        i8 -= (int)Test.instanceCount;
        i10 = 1;
        while (++i10 < 297) {
            i8 -= i10;
        }
        Test.iArrFld[(-19 >>> 1) % N][(i10 >>> 1) % N] = i8;
        for (l1 = 4; l1 < 207; l1++) {
            f4 += (75 + (l1 * l1));
        }
        for (i12 = 9; i12 < 259; ++i12) {
            Test.iArrFld[i12] = Test.iArrFld[i12];
            f4 *= 162;
            Test.byFld = (byte)l1;
            for (i14 = i12; i14 < 7; i14++) {
                switch (((i12 >>> 1) % 2) + 82) {
                case 82:
                    i9 >>>= (int)Test.instanceCount;
                    i13 -= (int)-178L;
                    d1 += -66.27411;
                    break;
                case 83:
                    i15 += i14;
                    break;
                }
            }
        }
        long meth_res = i8 + i9 + i10 + l1 + i11 + Float.floatToIntBits(f4) + i12 + i13 + i14 + i15 +
            Double.doubleToLongBits(d1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(float f2, int i3, int i4) {

        float f3=-117.529F;
        int i5=7, i6=24500, i7=36174, i16=-95, i17=11;
        short s=16541;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, true);

        for (f3 = 10; f3 < 275; f3++) {
            for (i6 = 6; i6 > 1; --i6) {
                f2 -= Math.max(-iMeth1(i4, i3), i6);
                Test.lFld -= -253;
                Test.iArrFld[(int)(f3)][i6 + 1] = i5;
                switch ((int)((f3 % 4) + 114)) {
                case 114:
                    i5 = (int)Test.lFld;
                case 115:
                    for (i16 = 1; i16 < 2; ++i16) {
                        Test.lArrFld = FuzzerUtils.long1array(N, (long)14L);
                        i7 = s;
                        i3 += i3;
                        i7 = 40009;
                        bArr[i6 - 1] = Test.bFld;
                        Test.fFld = 10165;
                        i7 >>= i5;
                    }
                    break;
                case 116:
                    i4 += i6;
                    break;
                case 117:
                    i17 *= 17581;
                    break;
                }
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f2) + i3 + i4 + Float.floatToIntBits(f3) + i5 + i6 + i7 + i16 + i17 + s
            + FuzzerUtils.checkSum(bArr);
    }

    public static int iMeth(long l, float f) {

        int i=13, i1=-10, i2=6;
        float f1=-80.698F;
        short s1=16642;

        Test.bFld = Test.bFld;
        i = 1;
        while (++i < 356) {
            Test.lArrFld[i - 1] *= (long)(((l + f) - (i << i)) * (-9.777F * (l * i)));
            f1 = 1;
            do {
                i1 = (Test.iArrFld[i][i + 1]++);
                i2 = 1;
                do {
                    switch ((i2 % 4) + 73) {
                    case 73:
                        vMeth(Test.fFld, i1, i1);
                        Test.lFld += (i2 * i2);
                        i1 -= (int)f;
                    case 74:
                        Test.bFld = Test.bFld;
                        s1 &= (short)i;
                        i1 = -33;
                        Test.byFld <<= (byte)i2;
                    case 75:
                        i1 = i1;
                        break;
                    case 76:
                        Test.instanceCount += l;
                        break;
                    default:
                        i1 += i;
                    }
                } while ((i2 -= 3) > 0);
            } while (++f1 < 5);
        }
        long meth_res = l + Float.floatToIntBits(f) + i + Float.floatToIntBits(f1) + i1 + i2 + s1;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d=2.84065, dArr[]=new double[N];
        int i18=-53760, i19=1, i20=118, i21=-231, i22=37564, i23=-5, i24=12, i25=-40731;
        short s2=20157;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 16.839F);
        FuzzerUtils.init(dArr, 0.17144);

        d -= (iMeth(Test.lFld, Test.fFld) + Test.fFld);
        Test.iArrFld[(1 >>> 1) % N][(i18 >>> 1) % N] = i18;
        i19 = 1;
        while (++i19 < 375) {
            Test.iArrFld[i19][i19] *= i18;
            i20 = 1;
            do {
                byArrFld = byArrFld;
            } while (++i20 < 67);
            i21 = 67;
            do {
                if (Test.bFld) continue;
                i18 *= (int)Test.lFld;
            } while ((i21 -= 3) > 0);
            i18 += (24892 + (i19 * i19));
            d *= d;
            for (i22 = 2; 67 > i22; i22++) {
                Test.fFld += (i22 + Test.byFld);
                d = d;
                Test.iArrFld[i19 + 1][i19 - 1] >>= i22;
                for (i24 = 1; 2 > i24; ++i24) {
                    if (Test.bFld) {
                        i23 = -124;
                    } else {
                        Test.fFld += i24;
                        Test.instanceCount += 127;
                        fArr[i22 - 1] -= Test.instanceCount;
                    }
                    Test.lFld /= (Test.lFld | 1);
                    i25 = i23;
                    dArr = dArr;
                    Test.instanceCount <<= 10;
                    Test.lArrFld[i24] = Test.lFld;
                    i25 >>>= i22;
                    Test.lFld -= s2;
                    i23 %= (int)(i20 | 1);
                    i18 += i24;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}