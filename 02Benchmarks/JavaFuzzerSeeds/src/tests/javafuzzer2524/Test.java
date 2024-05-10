package tests.javafuzzer2524;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 16:13:55 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2935599596L;
    public static volatile byte byFld=7;
    public static volatile boolean bFld=true;
    public volatile float fFld=64.463F;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 198);
        FuzzerUtils.init(Test.lArrFld, -23434L);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i3) {

        int i4=57640, i5=-5314, i6=13, i7=-1, i8=10, i9=13;
        float f2=-33.734F;

        for (i4 = 247; i4 > 11; i4--) {
            f2 = Test.instanceCount;
            if (Test.bFld) {
                Test.iArrFld[i4 + 1] %= (int)-2101695811L;
            } else {
                f2 += i4;
                if (i5 != 0) {
                    vMeth1_check_sum += i3 + i4 + i5 + Float.floatToIntBits(f2) + i6 + i7 + i8 + i9;
                    return;
                }
                i3 *= (int)f2;
            }
            for (i6 = 1; 7 > i6; i6++) {
                for (i8 = 1; i8 < 2; ++i8) {
                    i3 += i8;
                    Test.instanceCount = i9;
                    switch (((i6 % 1) * 5) + 118) {
                    case 119:
                        Test.instanceCount += (i8 * i8);
                        break;
                    default:
                        i9 = i5;
                        f2 = i8;
                    }
                }
            }
        }
        vMeth1_check_sum += i3 + i4 + i5 + Float.floatToIntBits(f2) + i6 + i7 + i8 + i9;
    }

    public static int iMeth(int i2, float f1, long l) {

        double d=0.111483;
        int i10=-57561, i11=-21656, i12=-39096, i13=-211;
        short s=-8483, sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-3717);

        d = 199;
        i2 *= (int)l;
        vMeth1(i2);
        if (Test.bFld) {
            d -= i2;
            for (i10 = 6; i10 < 271; ++i10) {
                i2 -= Test.byFld;
                i11 += i11;
                sArr[i10 - 1] = Test.byFld;
                for (i12 = 1; 6 > i12; ++i12) {
                    if (true) {
                        i11 = (int)d;
                        i13 <<= i12;
                        i2 += (i12 * i12);
                        i11 = s;
                    } else if (Test.bFld) {
                        i13 -= (int)Test.instanceCount;
                    } else {
                        Test.instanceCount = i10;
                    }
                }
            }
        }
        long meth_res = i2 + Float.floatToIntBits(f1) + l + Double.doubleToLongBits(d) + i10 + i11 + i12 + i13 + s +
            FuzzerUtils.checkSum(sArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(float f) {

        int i1=-11930, i14=-194, i15=-11;
        double d1=-1.112646;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 61525L);

        Test.iArrFld[(i1 >>> 1) % N] += (-Math.min(Test.byFld + i1, i1 - 9693));
        f *= Test.iArrFld[(i1 >>> 1) % N];
        i1 -= (int)(-Float.intBitsToFloat(iMeth(-13, f, Test.instanceCount)));
        i1 = i1;
        d1 = d1;
        i14 = 343;
        do {
            long l1=164L;
            i1 = -2;
            i1 += (((i14 * i14) + i14) - i1);
            f += (i14 * i14);
            Test.iArrFld[i14 + 1] = i1;
            lArr[i14] = Test.byFld;
            l1 = i1;
            i15 = 1;
            while (++i15 < 5) {
                l1 += (i15 * i15);
                d1 = i14;
            }
        } while (--i14 > 0);
        vMeth_check_sum += Float.floatToIntBits(f) + i1 + Double.doubleToLongBits(d1) + i14 + i15 +
            FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        short s1=3846;
        int i16=133, i17=44074, i18=8, i19=110, i20=214, i21=12, i22=27721, i23=-65343, i24=-10, i26=44446, i27=50,
            i28=-18847, iArr[]=new int[N];
        double d2=27.79654, d3=-2.80818, dArr[]=new double[N];

        FuzzerUtils.init(iArr, -108);
        FuzzerUtils.init(dArr, 1.74092);

        for (int i : iArr) {
            vMeth(fFld);
            i >>>= -48438;
            i = s1;
            i = (int)Test.instanceCount;
            for (i16 = 2; i16 < 63; i16 += 2) {
                Test.iArrFld[i16 - 1] <<= i;
                i |= i;
            }
            Test.instanceCount >>= Test.instanceCount;
            i >>= i;
            i18 = 1;
            while (++i18 < 63) {
                i *= (int)d2;
                for (i19 = 1; 1 > i19; i19++) {
                    i20 = Test.byFld;
                    Test.lArrFld[i18 + 1] = i16;
                }
                Test.byFld = (byte)251L;
                iArr[i18] >>>= i16;
                i = -1813;
                dArr[i18 + 1] -= 11;
            }
            i20 += i19;
            i17 ^= -36239;
        }
        for (i21 = 11; 275 > i21; i21++) {
            Test.iArrFld[i21 + 1] = i20;
        }
        for (i23 = 4; i23 < 233; i23++) {
            i24 *= i19;
            fFld += i22;
            for (d3 = i23; d3 < 110; ++d3) {
                for (i27 = 1; i27 < 1; ++i27) {
                    d2 -= i22;
                    d2 = Test.instanceCount;
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
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}