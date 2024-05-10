package tests.javafuzzer2693;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 18:47:08 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-154L;
    public static float fFld=-121.874F;
    public double dFld=-2.73148;
    public static int iArrFld[]=new int[N];
    public static volatile long lArrFld[]=new long[N];
    public volatile float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -55);
        FuzzerUtils.init(Test.lArrFld, -90L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(byte by1, int i8, int i9) {

        int i10=11, i11=138, i12=-53012, i13=0, i14=38798;
        float f=-20.243F;
        boolean b=true;
        long l=52179L;
        double d=-60.82226;

        for (i10 = 2; i10 < 368; i10++) {
            for (i12 = i10; 5 > i12; i12++) {
                i11 *= (int)Test.instanceCount;
                f -= 21287;
                if (b) break;
            }
            i9 += by1;
            if (b) {
                f *= Test.instanceCount;
            } else if (b) {
                for (l = i10; 5 > l; l++) {
                    f += i10;
                    f = f;
                    f = i11;
                    by1 *= (byte)i9;
                    i11 += (int)(l | i13);
                    d = 2310833118165497535L;
                }
            } else {
                Test.iArrFld[i10] |= i8;
            }
        }
        vMeth2_check_sum += by1 + i8 + i9 + i10 + i11 + i12 + i13 + Float.floatToIntBits(f) + (b ? 1 : 0) + l + i14 +
            Double.doubleToLongBits(d);
    }

    public static void vMeth1() {

        int i6=14, i7=1470, i15=57, i16=10, i17=8404, i18=105, i19=164, i20=-12;
        byte by=41, byArr[]=new byte[N];
        short s=3445;
        boolean b1=false, bArr[]=new boolean[N];
        float f1=-1.224F;
        long lArr[]=new long[N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(lArr, 11073L);
        FuzzerUtils.init(byArr, (byte)14);

        for (i6 = 1; i6 < 238; i6++) {
            i7 -= (int)(i7 += (int)((-36301 * i7) - (Test.instanceCount >> by)));
            vMeth2(by, i7, i6);
            Test.instanceCount |= i6;
            s -= (short)i7;
        }
        i15 = 1;
        while (++i15 < 387) {
            for (i16 = 1; i16 < 4; ++i16) {
                for (i18 = i16; 2 > i18; i18++) {
                    bArr[i18 - 1] = b1;
                    switch (((i16 % 7) * 5) + 13) {
                    case 17:
                        if (b1) continue;
                        Test.instanceCount &= Test.instanceCount;
                        lArr[i16 - 1] <<= i16;
                        byArr[i15 - 1] >>= (byte)i15;
                        break;
                    case 36:
                        f1 += i16;
                    case 30:
                        s *= (short)i20;
                        break;
                    case 41:
                        Test.iArrFld[i16 - 1] = -224;
                        break;
                    case 40:
                        i7 -= i17;
                    case 43:
                        if (i7 != 0) {
                            vMeth1_check_sum += i6 + i7 + by + s + i15 + i16 + i17 + i18 + i19 + (b1 ? 1 : 0) +
                                Float.floatToIntBits(f1) + i20 + FuzzerUtils.checkSum(bArr) +
                                FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(byArr);
                            return;
                        }
                        break;
                    case 44:
                        Test.instanceCount = i20;
                        break;
                    default:
                        Test.iArrFld[i18 - 1] = 9821;
                    }
                }
            }
        }
        vMeth1_check_sum += i6 + i7 + by + s + i15 + i16 + i17 + i18 + i19 + (b1 ? 1 : 0) + Float.floatToIntBits(f1) +
            i20 + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(byArr);
    }

    public static void vMeth(int i1, int i2, int i3) {

        int i4=8369, i5=-45929, i21=-65, i22=60756;
        float f2=0.747F;
        boolean b2=false;

        i2 = (int)((Math.max(i2, i3) * (++Test.instanceCount)) << (Test.iArrFld[(i1 >>> 1) % N]--));
        for (i4 = 3; i4 < 164; ++i4) {
            vMeth1();
            Test.fFld -= Test.fFld;
            i21 = 1;
            do {
                i1 += i21;
                for (f2 = 1; 1 > f2; ++f2) {
                    if (b2) {
                        i5 += (int)f2;
                        i3 = i1;
                    } else if (b2) {
                        Test.instanceCount += (long)(((f2 * i22) + i21) - i5);
                        vMeth_check_sum += i1 + i2 + i3 + i4 + i5 + i21 + Float.floatToIntBits(f2) + i22 + (b2 ? 1 : 0);
                        return;
                    } else {
                        i2 = (int)Test.instanceCount;
                        Test.instanceCount -= -30052;
                        Test.iArrFld = Test.iArrFld;
                        vMeth_check_sum += i1 + i2 + i3 + i4 + i5 + i21 + Float.floatToIntBits(f2) + i22 + (b2 ? 1 : 0);
                        return;
                    }
                    i1 *= i4;
                }
            } while (++i21 < 10);
        }
        vMeth_check_sum += i1 + i2 + i3 + i4 + i5 + i21 + Float.floatToIntBits(f2) + i22 + (b2 ? 1 : 0);
    }

    public void mainTest(String[] strArr1) {

        int i=44243, i23=31, i24=198, i25=-230, i26=-16, i27=-43, i28=22906, i29=116, i30=-13, i31=5, i32=-31257;
        short s1=9733, sArr[]=new short[N];
        boolean b3=true;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 1.65561);
        FuzzerUtils.init(sArr, (short)-25629);

        i += ((i--) + Math.min(Test.iArrFld[(i >>> 1) % N], i - -38372));
        vMeth(i, i, i);
        Test.fFld = i;
        for (i23 = 327; 12 < i23; --i23) {
            for (i25 = 5; i25 < 80; i25++) {
                Test.instanceCount *= (long)dFld;
                Test.instanceCount += -1883;
                for (i27 = 2; i27 > 1; i27--) {
                    i = i26;
                    Test.instanceCount -= i26;
                    i28 -= i25;
                    i = (int)Test.instanceCount;
                    i26 += (i27 - s1);
                    i26 += i25;
                }
                Test.fFld += i25;
                i += (((i25 * i27) + i25) - Test.instanceCount);
            }
            Test.lArrFld[i23] = 12L;
            i26 = 4;
            Test.instanceCount += (long)dFld;
            fArrFld = fArrFld;
            for (i29 = 3; i29 < 80; ++i29) {
                Test.instanceCount += i29;
                switch ((i29 % 6) + 69) {
                case 69:
                    for (i31 = 1; i31 < 2; ++i31) {
                        dArr[i29] -= 25217;
                        i24 = i23;
                        s1 = (short)Test.fFld;
                        Test.instanceCount = (long)-75.61325;
                        if (b3) continue;
                        sArr[i29] += (short)Test.fFld;
                    }
                case 70:
                    Test.instanceCount >>= s1;
                    break;
                case 71:
                    Test.instanceCount |= 41;
                    break;
                case 72:
                    i30 %= (int)(i | 1);
                case 73:
                    Test.instanceCount >>= i27;
                case 74:
                    i = i25;
                    break;
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}