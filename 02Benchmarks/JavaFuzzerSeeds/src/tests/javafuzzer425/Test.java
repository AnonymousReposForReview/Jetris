package tests.javafuzzer425;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 03:33:30 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-47597L;
    public static boolean bFld=false;

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(float f2) {

        int i7=26657, i8=-52097, i9=-8, i10=202, iArr[]=new int[N];
        byte by=-86;
        double d1=-30.2579;

        FuzzerUtils.init(iArr, 220);

        if (Test.bFld) {
            i7 = 1;
            while (++i7 < 281) {
                Test.instanceCount = Test.instanceCount;
                for (i8 = 1; i8 < 6; ++i8) {
                    i10 = 1;
                    while (++i10 < 2) {
                        double d=-69.114765;
                        i9 = (int)f2;
                        Test.instanceCount += (i10 * i10);
                        iArr[i8] >>= i8;
                        i9 <<= (int)-245L;
                        Test.instanceCount = (long)d;
                        switch ((i7 % 1) + 47) {
                        case 47:
                            d *= 2710967762L;
                            break;
                        default:
                            if (Test.bFld) continue;
                        }
                        Test.instanceCount -= by;
                        f2 += i9;
                    }
                }
            }
        } else if (Test.bFld) {
            d1 = i9;
        } else if (Test.bFld) {
            i9 = i7;
        }
        long meth_res = Float.floatToIntBits(f2) + i7 + i8 + i9 + i10 + by + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i3, float f1, int i4) {

        int i5=0, i6=12, i11=45, i12=29946, i13=4, i14=-6, i15=164;
        double d2=1.50887, dArr[]=new double[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(dArr, -2.82216);
        FuzzerUtils.init(lArr, 30L);

        for (i5 = 11; i5 < 353; i5++) {
            i4 += (-7186 + (i5 * i5));
        }
        i3 = (iMeth1(f1) / (i4 | 1));
        i6 = (int)Test.instanceCount;
        Test.instanceCount /= (i3 | 1);
        for (i11 = 6; i11 < 179; i11 += 2) {
            i13 = 18;
            do {
                i4 -= i11;
                for (i14 = 1; i14 < 1; ++i14) {
                    if (Test.bFld) continue;
                    dArr[i14] *= Test.instanceCount;
                    lArr[i14] = i12;
                    if (i11 != 0) {
                        vMeth_check_sum += i3 + Float.floatToIntBits(f1) + i4 + i5 + i6 + i11 + i12 + i13 + i14 + i15 +
                            Double.doubleToLongBits(d2) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
                            FuzzerUtils.checkSum(lArr);
                        return;
                    }
                    d2 = d2;
                    i3 += (((i14 * f1) + Test.instanceCount) - Test.instanceCount);
                }
            } while (--i13 > 0);
        }
        vMeth_check_sum += i3 + Float.floatToIntBits(f1) + i4 + i5 + i6 + i11 + i12 + i13 + i14 + i15 +
            Double.doubleToLongBits(d2) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth(int i1, int i2) {

        float f3=-1.620F;
        int i16=102, i17=36091, i18=4, i19=14, i20=-33882, i21=-4;
        byte by1=-105;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -73L);

        vMeth(i1, f3, i1);
        for (i16 = 7; i16 < 129; ++i16) {
            by1 = (byte)i2;
            i18 = 1;
            while (++i18 < 13) {
                for (i19 = i18; i19 < 1; ++i19) {
                    by1 += (byte)(i19 * i19);
                }
                i21 = 1;
                do {
                    if (i20 != 0) {
                    }
                    i1 -= (int)Test.instanceCount;
                    i2 += (i21 ^ i16);
                    lArr1[i21] = -14L;
                } while (++i21 < 1);
                i17 = i19;
                Test.instanceCount = i19;
            }
        }
        i17 <<= i17;
        i17 ^= i1;
        long meth_res = i1 + i2 + Float.floatToIntBits(f3) + i16 + i17 + by1 + i18 + i19 + i20 + i21 +
            FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-63352, i22=49, i23=-12, i24=-8392, i25=-4998, i26=-141, i27=152, i28=8, iArr1[][]=new int[N][N];
        boolean b=true, bArr[]=new boolean[N];
        float f=48.889F;
        byte by2=112;
        double d3=-1.14224, d4=-15.107118, dArr1[]=new double[N];
        short s=2837;
        long lArr2[]=new long[N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(lArr2, 1L);
        FuzzerUtils.init(iArr1, 113);
        FuzzerUtils.init(dArr1, 1.74524);

        bArr[(i >>> 1) % N] = (b || ((i + f) > iMeth(i, -117)));
        for (long l : lArr2) {
            for (i22 = 2; i22 < 63; i22++) {
                Test.instanceCount = -2;
                i24 = 1;
                while (++i24 < 2) {
                    b = Test.bFld;
                    i += (5 + (i24 * i24));
                    try {
                        i23 = (iArr1[i22][i22] % i24);
                        i = (i22 / -898228530);
                        i = (i22 / i23);
                    } catch (ArithmeticException a_e) {}
                    i23 &= (int)Test.instanceCount;
                    i = by2;
                    d3 = 104;
                    i ^= (int)Test.instanceCount;
                }
                i |= 227;
                iArr1[i22][i22 + 1] -= (int)-3513400388L;
                if (Test.bFld) continue;
            }
            d3 -= i23;
            s += (short)i24;
            i -= 43;
            for (d4 = 63; d4 > 2; d4 -= 2) {
                i25 -= i24;
                d3 = i;
                Test.instanceCount = Test.instanceCount;
                l += (long)(((d4 * i23) + f) - f);
            }
            l += i23;
            switch (((i25 >>> 1) % 2) + 20) {
            case 20:
                for (i26 = 3; 63 > i26; i26++) {
                    i28 = 1;
                    do {
                        i25 &= i28;
                        try {
                            i = (i23 / 60461);
                            i27 = (i26 % 237);
                            i27 = (121 / i26);
                        } catch (ArithmeticException a_e) {}
                        i += (-13 + (i28 * i28));
                    } while (++i28 < 2);
                }
                break;
            case 21:
                dArr1[(56897 >>> 1) % N] -= -67;
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
