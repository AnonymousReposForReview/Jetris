package tests.javafuzzer170;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 23:13:55 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=32L;
    public static float fFld=0.34F;
    public static byte byFld=-46;

    public static long iMeth_check_sum = 0;
    public static long byMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i6) {

        int i8=0, i9=-60455, i10=203, i11=-113, i12=64505, iArr1[]=new int[N];
        float f2=-26.317F, f3=0.900F;
        long lArr[]=new long[N];
        double dArr1[][]=new double[N][N];

        FuzzerUtils.init(iArr1, -46);
        FuzzerUtils.init(lArr, -36L);
        FuzzerUtils.init(dArr1, 0.78707);

        for (int i7 : iArr1) {
            boolean b=true;
            for (i8 = 4; i8 > 1; i8--) {
                for (i10 = 1; i10 < 2; i10++) {
                    i6 = i10;
                }
                i6 &= i11;
                f2 += i8;
                i6 += (i8 * i8);
            }
            if (b) {
                iArr1[(i6 >>> 1) % N] -= i9;
                for (f3 = 4; f3 > 1; f3--) {
                    switch ((int)((f3 % 10) + 101)) {
                    case 101:
                        i12 += (int)(f3 * f3);
                        iArr1[(int)(f3)] >>= -7;
                        i11 += (int)(f3 - i6);
                        Test.instanceCount += (-8 + (f3 * f3));
                    case 102:
                        Test.instanceCount += (long)(((f3 * Test.instanceCount) + i8) - i12);
                        break;
                    case 103:
                        i12 += (int)(((f3 * i12) + i9) - i9);
                        break;
                    case 104:
                        i6 = (int)f2;
                        break;
                    case 105:
                        f2 = -58231;
                        break;
                    case 106:
                        lArr[(int)(f3 - 1)] -= Test.instanceCount;
                        break;
                    case 107:
                        i6 = (int)Test.instanceCount;
                    case 108:
                        i12 *= i6;
                    case 109:
                        i7 = (int)f3;
                        break;
                    case 110:
                        dArr1 = FuzzerUtils.double2array(N, (double)12.113496);
                    default:
                        i11 += (int)f3;
                    }
                }
            } else {
                lArr[(i9 >>> 1) % N] >>= i11;
            }
        }
        vMeth_check_sum += i6 + i8 + i9 + i10 + i11 + Float.floatToIntBits(f2) + Float.floatToIntBits(f3) + i12 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
    }

    public static byte byMeth(long l1, int i5) {

        float f1=-88.904F;
        int i13=4, i14=51449, i15=-18, i16=-56, i17=-14;
        double d1=5.95670, d2=-51.122761;
        boolean b1=true;
        short s=10929;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -919686881594325847L);

        f1 *= 17365;
        vMeth(58907);
        i5 = (int)l1;
        for (i13 = 16; i13 < 260; i13 += 2) {
            switch (((i13 % 5) * 5) + 45) {
            case 64:
                lArr1 = lArr1;
                i14 = (int)d1;
                f1 += i13;
                for (i15 = 1; i15 < 13; ++i15) {
                    i16 >>>= (int)l1;
                    i5 += (i15 * i15);
                    if (i15 != 0) {
                    }
                }
                break;
            case 48:
                for (d2 = i13; d2 < 13; d2++) {
                    l1 = l1;
                    i16 = (int)Test.instanceCount;
                }
                break;
            case 51:
                if (i13 != 0) {
                }
            case 67:
                if (b1) break;
                break;
            case 66:
                s -= (short)i15;
                break;
            }
        }
        long meth_res = l1 + i5 + Float.floatToIntBits(f1) + i13 + i14 + Double.doubleToLongBits(d1) + i15 + i16 +
            Double.doubleToLongBits(d2) + i17 + (b1 ? 1 : 0) + s + FuzzerUtils.checkSum(lArr1);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public static int iMeth(double d, float f, long l) {

        int i3=-115, i18=0, i19=-30, iArr[]=new int[N];
        byte by=8;
        float f4=0.821F;

        FuzzerUtils.init(iArr, -79);

        d = (l += (i3--));
        i3 = (int)(((i3++) * Math.sqrt(d)) - (by >>= (byte)-31230L));
        for (int i4 : iArr) {
            l *= ((--i3) >> (byMeth(l, i3) + i3));
        }
        i18 = (int)245L;
        d -= d;
        i18 -= i3;
        for (f4 = 8; 357 > f4; ++f4) {
            i19 += (int)(142L + (f4 * f4));
            iArr[(i18 >>> 1) % N] = (int)d;
            i19 += (int)(((f4 * i3) + i3) - i19);
            f = (float)d;
            by += (byte)i19;
            l <<= i18;
            i18 += (int)f4;
        }
        long meth_res = Double.doubleToLongBits(d) + Float.floatToIntBits(f) + l + i3 + by + i18 +
            Float.floatToIntBits(f4) + i19 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-11, i1=-20742, i2=13, i20=-6098, i21=18771, i22=-206, i23=-10893, i24=-51581, i25=-60802, i26=37760,
            i27=1, iArr2[]=new int[N];
        double d3=1.26285, dArr[]=new double[N];
        short s1=-9891;
        boolean b2=false;
        float fArr[]=new float[N];
        long lArr2[]=new long[N];

        FuzzerUtils.init(dArr, -2.104382);
        FuzzerUtils.init(fArr, -2.73F);
        FuzzerUtils.init(iArr2, -8);
        FuzzerUtils.init(lArr2, -24L);

        i = i;
        for (i1 = 8; i1 < 374; ++i1) {
            dArr[i1 - 1] = (iMeth(d3, Test.fFld, Test.instanceCount) - i1);
            if (true) break;
            Test.byFld += (byte)i1;
            i2 = -42340;
            i2 += i2;
            if (b2) {
                Test.fFld = Test.fFld;
                i2 += (int)204848910L;
                fArr[i1] += s1;
                switch ((((i20 >>> 1) % 2) * 5) + 1) {
                case 10:
                    i20 %= (int)(i2 | 1);
                    i21 = 1;
                    while (++i21 < 69) {
                        Test.instanceCount *= i2;
                        i += (i21 + i20);
                        i20 += (54572 + (i21 * i21));
                        Test.instanceCount >>= i;
                        i += i2;
                    }
                case 9:
                    iArr2[(i2 >>> 1) % N] += i1;
                    lArr2[i1 + 1] <<= Test.instanceCount;
                    break;
                default:
                    i2 = i21;
                    for (i22 = 1; i22 < 69; ++i22) {
                        i -= 38;
                    }
                    i20 <<= 5;
                }
            } else if (true) {
                for (i24 = 1; i24 < 69; ++i24) {
                    for (i26 = 2; i26 > 1; --i26) {
                        Test.instanceCount += (i26 * i26);
                        i2 = i22;
                        Test.instanceCount *= i26;
                    }
                }
            } else {
                Test.byFld -= (byte)26.79758;
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
//DEBUG  byMeth ->  byMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth byMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
