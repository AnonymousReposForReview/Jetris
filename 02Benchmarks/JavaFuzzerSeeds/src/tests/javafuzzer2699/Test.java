package tests.javafuzzer2699;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 18:49:34 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=127L;
    public static volatile double dFld=-2.122317;
    public static float fFld=-2.766F;
    public static volatile short sFld=5846;
    public static boolean bFld=true;
    public static volatile boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.bArrFld, true);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static void vMeth(int i3) {

        float f=-31.141F, fArr[]=new float[N];
        int i4=24695, i5=-12, i6=-174, i7=12, i8=21311, i9=-37870, iArr[]=new int[N];
        short s=29907;
        byte by=64;
        boolean b=false, bArr[]=new boolean[N];
        double dArr1[][]=new double[N][N];

        FuzzerUtils.init(iArr, -1);
        FuzzerUtils.init(fArr, -33.387F);
        FuzzerUtils.init(dArr1, 39.65105);
        FuzzerUtils.init(bArr, true);

        f = ((i3 * (f + i3)) + ((i3 - f) + (i3 * i4)));
        for (i5 = 147; 9 < i5; i5--) {
            i3 += i5;
            if (bArr[i5]) {
                i6 += (i5 + Test.instanceCount);
            } else if (!(((-Test.instanceCount) / (((long)(i4 + 93.81470)) | 1)) < (i7 + Test.instanceCount))) {
                for (i7 = 1; 11 > i7; ++i7) {
                    iArr[i5 + 1] = (--s);
                    Test.instanceCount >>>= i8;
                    i9 = 1;
                    while (++i9 < 2) {
                        i3 >>>= (int)((Float.intBitsToFloat(i4) + by) * ((Test.instanceCount * i3) *
                            (--Test.instanceCount)));
                        iArr[(i4 >>> 1) % N] -= -65520;
                        i3 -= (int)(((fArr[i5 + 1]--) + (i6 *= i4)) * ((i4--) << (i5 << i5)));
                        Test.instanceCount *= -31;
                        b = (b = (b = b));
                        dArr1[i5 + 1][i7 + 1] -= 14L;
                    }
                }
            }
        }
        vMeth_check_sum += i3 + Float.floatToIntBits(f) + i4 + i5 + i6 + i7 + i8 + s + i9 + by + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)) + FuzzerUtils.checkSum(bArr);
    }

    public static void vSmallMeth(int i1, int i2) {


        vMeth((int)(((Test.dFld + Test.instanceCount) + (-i1)) * (--i2)));
        vMeth(i1--);
        vSmallMeth_check_sum += i1 + i2;
    }

    public static int iMeth(int i15, int i16, int i17) {

        int i18=63517, i19=-44311, i20=3, i21=-45384, i22=6, iArr3[]=new int[N];
        boolean b1=true, bArr1[]=new boolean[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(bArr1, false);
        FuzzerUtils.init(byArr, (byte)-77);
        FuzzerUtils.init(iArr3, 111);

        vMeth(i16);
        for (i18 = 391; i18 > 23; i18 -= 2) {
            bArr1[i18 - 1] = b1;
            if (i15 != 0) {
            }
        }
        i20 = 1;
        do {
            i17 <<= (int)Test.instanceCount;
            Test.instanceCount += (254 + (i20 * i20));
            i16 += -7222;
            Test.dFld = i17;
            Test.fFld *= i17;
            if (i16 != 0) {
            }
            for (i21 = 1; i21 < 7; ++i21) {
                Test.fFld -= i17;
                byArr[i20 + 1] += (byte)Test.instanceCount;
                iArr3[i21] >>= (int)Test.instanceCount;
            }
        } while (++i20 < 215);
        long meth_res = i15 + i16 + i17 + i18 + i19 + (b1 ? 1 : 0) + i20 + i21 + i22 + FuzzerUtils.checkSum(bArr1) +
            FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr3);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static float fMeth() {

        int i10=-4317, i11=10, i12=-55097, i13=31213, i14=1, i23=204, i24=56541, iArr2[]=new int[N];
        float f1=-1.279F;

        FuzzerUtils.init(iArr2, 0);

        iArr2[(i10 >>> 1) % N] -= (int)(-((f1 - i10) * (i10 - i10)));
        for (i11 = 2; 124 > i11; i11++) {
            for (i13 = 1; i13 < 13; ++i13) {
                iArr2[i13 + 1] *= (int)Test.instanceCount;
                i12 += ((i12 % (iMeth(i10, i11, i11) | 1)) * i12);
                for (i23 = 2; i23 > 1; i23--) {
                    switch ((i23 % 2) + 8) {
                    case 8:
                        Test.instanceCount += (((i23 * i23) + i12) - Test.fFld);
                        i24 += (((i23 * i10) + i14) - Test.instanceCount);
                        i12 += i12;
                        break;
                    case 9:
                        iArr2[i13] >>>= -117;
                        i12 = i12;
                        i10 += i23;
                        break;
                    }
                    iArr2[i23 + 1] -= i23;
                    Test.instanceCount += i10;
                }
            }
        }
        long meth_res = i10 + Float.floatToIntBits(f1) + i11 + i12 + i13 + i14 + i23 + i24 +
            FuzzerUtils.checkSum(iArr2);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=117, i25=23120, i26=48567, i27=-41265, i28=14, iArr1[][]=new int[N][N];
        long l=3L;
        byte by1=-6;
        float f2=54.383F;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 0.121020);
        FuzzerUtils.init(iArr1, 55583);

        i = (int)(((++i) ^ (i++)) + dArr[(1 >>> 1) % N]);
        for (int smallinvoc=0; smallinvoc<807; smallinvoc++) vSmallMeth(iArr1[(i >>> 1) % N][(i >>> 1) % N], i--);
        i -= i;
        if (false) {
            i += (int)fMeth();
            Test.dFld -= 965;
        } else {
            Test.sFld = (short)i;
            for (l = 3; l < 168; ++l) {
                switch ((int)((l % 3) + 123)) {
                case 123:
                    for (i26 = 7; i26 < 152; i26++) {
                        switch ((i26 % 5) + 18) {
                        case 18:
                            i25 = by1;
                            switch (((i26 % 2) * 5) + 59) {
                            case 69:
                                iArr1[(int)(l)][i26] *= -17420;
                            case 61:
                                Test.bArrFld[(int)(l + 1)] = Test.bFld;
                                break;
                            default:
                            }
                            i = -2;
                            Test.instanceCount &= -11L;
                            break;
                        case 19:
                            i27 -= (int)Test.instanceCount;
                            i27 = (int)Test.dFld;
                            break;
                        case 20:
                            Test.instanceCount = (long)Test.dFld;
                            f2 = 1;
                            while (++f2 < 2) {
                                i27 += i26;
                                i += i25;
                                Test.dFld *= i26;
                                i25 *= (int)Test.instanceCount;
                                i28 = (int)Test.fFld;
                                i += (int)(f2 * f2);
                            }
                        case 21:
                            i27 += i26;
                            i25 += (i26 * i26);
                        case 22:
                        }
                        i |= i27;
                    }
                    break;
                case 124:
                    Test.instanceCount += (((l * Test.sFld) + f2) - f2);
                    break;
                case 125:
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test iMeth fMeth
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  iMeth ->  iMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
