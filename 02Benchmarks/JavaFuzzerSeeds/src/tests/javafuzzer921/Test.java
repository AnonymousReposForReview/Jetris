package tests.javafuzzer921;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 11:32:07 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-504168993L;
    public static double dFld=88.36002;
    public static float fFld=-2.714F;
    public byte byFld=66;
    public static volatile byte byArrFld[]=new byte[N];
    public static int iArrFld[]=new int[N];
    public float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)-21);
        FuzzerUtils.init(Test.iArrFld, 1);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(int i16) {

        int i17=-2, i18=-34437, i19=109, i20=196, i21=39210;

        Test.dFld *= i16;
        Test.iArrFld = FuzzerUtils.int1array(N, (int)-14823);
        i16 *= (int)Test.instanceCount;
        i17 = 1;
        do {
            i16 >>= i16;
            for (i18 = 7; i18 > 1; i18--) {
                try {
                    i16 = (19486 / i16);
                    i16 = (-22006 % i17);
                    i16 = (37750 % i17);
                } catch (ArithmeticException a_e) {}
                i19 = i19;
                i16 = i18;
                Test.iArrFld[i17 + 1] = i18;
                i16 *= i16;
                i19 -= i19;
                for (i20 = 2; i20 > 1; i20 -= 3) {
                    i21 = (int)Test.instanceCount;
                    i16 = i21;
                }
            }
        } while (++i17 < 226);
        long meth_res = i16 + i17 + i18 + i19 + i20 + i21;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth() {

        int i14=-12, i15=-58825, i22=15, i23=183, i24=-119, i25=-160, i26=10, i27=-158;
        boolean b=false, bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, false);

        i14 -= Math.abs((int)(Test.byArrFld[(10 >>> 1) % N] + (i14 - Test.dFld)));
        Test.instanceCount = (long)(i15 * fMeth(i14));
        for (i22 = 12; i22 < 269; i22++) {
            Test.dFld = i15;
            i23 -= (int)1.691F;
        }
        for (i24 = 11; 325 > i24; i24++) {
            bArr[i24 + 1] = b;
            if (false) break;
            for (i26 = 1; 5 > i26; ++i26) {
                i27 = (int)6737L;
                i25 += (((i26 * Test.instanceCount) + i27) - i15);
                Test.instanceCount *= Test.instanceCount;
                Test.fFld = Test.fFld;
                Test.instanceCount += i26;
                Test.iArrFld[i24 - 1] *= -771;
            }
        }
        vMeth_check_sum += i14 + i15 + i22 + i23 + i24 + i25 + (b ? 1 : 0) + i26 + i27 + FuzzerUtils.checkSum(bArr);
    }

    public static long lMeth(long l, int i4, int i5) {

        int i6=-2, i7=34739, i8=-36210, i9=2, i10=194, i11=31497, i12=250, i13=19557, iArr[]=new int[N];
        float f=0.615F, fArr[][]=new float[N][N];
        short s=-22855;
        boolean b1=true;
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr, 100);
        FuzzerUtils.init(fArr, -43.628F);
        FuzzerUtils.init(dArr, -53.85626);

        for (i6 = 3; i6 < 201; ++i6) {
            Test.dFld += i4;
            Test.dFld = iArr[i6];
            Test.dFld -= (++l);
            for (i8 = 8; i6 < i8; i8 -= 2) {
                f -= ((l + (s << i6)) + i9);
                l |= (--i7);
            }
            fArr = (fArr = (fArr = (fArr = fArr)));
            i4 += (-((i7 - i5) * iArr[i6 - 1]));
            for (i10 = 8; i10 > 1; --i10) {
                switch (((((int)(-13 + (33352L * (11 - (i9 - i9))))) >>> 1) % 5) + 73) {
                case 73:
                    for (i12 = 2; 1 < i12; --i12) {
                        vMeth();
                        Test.instanceCount -= l;
                        if (b1) continue;
                    }
                    break;
                case 74:
                    i5 = i13;
                    break;
                case 75:
                    i9 += (((i10 * l) + i9) - i7);
                    break;
                case 76:
                    s += (short)(i10 ^ l);
                    break;
                case 77:
                    dArr[i10 - 1] += 111;
                    break;
                default:
                    f = i4;
                }
            }
        }
        long meth_res = l + i4 + i5 + i6 + i7 + i8 + i9 + Float.floatToIntBits(f) + s + i10 + i11 + i12 + i13 + (b1 ? 1
            : 0) + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-33346, i1=-78, i2=-1, i3=-53014, i28=0, i29=-8006, i30=142, i31=35, i32=-16235, i33=-6, i34=225,
            i35=-57394;
        long l1=7320183847380728705L;

        for (i = 17; 278 > i; ++i) {
            i1 += (((i * i1) + i1) - i1);
            for (i2 = 5; i2 < 96; ++i2) {
                i1 += i2;
            }
            lMeth(Test.instanceCount, i3, i1);
            Test.instanceCount ^= i2;
            i1 >>= i2;
            i28 = 96;
            while (--i28 > 0) {
                Test.fFld = Test.instanceCount;
                i1 += (((i28 * i3) + i28) - i2);
                for (i29 = 1; i29 < 1; ++i29) {
                    i1 &= (int)-13L;
                    Test.iArrFld[i28] += 3;
                    Test.iArrFld = FuzzerUtils.int1array(N, (int)9919);
                }
            }
            i30 = -22;
            i30 |= (int)2369745768L;
        }
        Test.fFld *= i3;
        for (float f1 : fArrFld) {
            Test.iArrFld[(33736 >>> 1) % N] += i29;
            for (l1 = 1; l1 < 63; l1++) {
                for (i32 = 2; i32 > 1; --i32) {
                    fArrFld[(int)(l1 - 1)] -= l1;
                    i3 >>= (int)l1;
                }
            }
            i33 = (int)Test.instanceCount;
            i30 += (int)Test.fFld;
            i31 = i28;
        }
        for (float f2 : fArrFld) {
            for (i34 = 63; i34 > 1; i34 -= 3) {
                byFld = (byte)l1;
            }
            Test.iArrFld = Test.iArrFld;
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
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  fMeth ->  fMeth vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
