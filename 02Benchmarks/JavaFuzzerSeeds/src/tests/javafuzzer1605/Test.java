package tests.javafuzzer1605;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 23:54:16 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3L;
    public static float fFld=2.177F;
    public static short sFld=-18317;
    public int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 1.38F);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth(long l, float f, byte by) {

        int i1=11;
        short sArr[][]=new short[N][N];

        FuzzerUtils.init(sArr, (short)18428);

        sArr[(i1 >>> 1) % N][(i1 >>> 1) % N] ^= (short)(l++);
        vMeth_check_sum += l + Float.floatToIntBits(f) + by + i1 + FuzzerUtils.checkSum(sArr);
    }

    public static void vMeth1(int i8, int i9, int i10) {

        int i11=11, i12=43187, i13=8, i14=85, i15=-14, iArr1[]=new int[N];
        short s=313;
        long lArr2[]=new long[N];

        FuzzerUtils.init(iArr1, -191);
        FuzzerUtils.init(lArr2, -12L);

        i8 = i8;
        iArr1[(i8 >>> 1) % N] += i8;
        i9 &= (int)Test.instanceCount;
        for (i11 = 5; i11 < 301; ++i11) {
            lArr2[i11 - 1] = 7;
            for (i13 = 1; i13 < 6; ++i13) {
                try {
                    i14 = (1070661534 / i12);
                    iArr1[i13] = (i9 / iArr1[i13 - 1]);
                    i14 = (i10 % -90);
                } catch (ArithmeticException a_e) {}
                i15 = 1;
                do {
                    Test.fFld += s;
                    i8 *= (int)Test.instanceCount;
                    Test.instanceCount = i12;
                    i10 = i8;
                } while (++i15 < 2);
                i9 ^= i15;
            }
            i12 += -16245;
            i10 += (10 + (i11 * i11));
        }
        vMeth1_check_sum += i8 + i9 + i10 + i11 + i12 + i13 + i14 + i15 + s + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(lArr2);
    }

    public static int iMeth1() {

        int i16=-58, i17=167, i18=275, i19=-1, iArr2[]=new int[N];
        double d2=-1.53541;

        FuzzerUtils.init(iArr2, -54553);

        vMeth1(i16, i16, i16);
        for (d2 = 5; d2 < 269; ++d2) {
            Test.instanceCount += (long)d2;
            switch (((i17 >>> 1) % 3) + 61) {
            case 61:
                i17 %= (int)(i17 | 1);
                Test.fArrFld[(int)(d2)] += (float)21.25551;
                break;
            case 62:
                i18 = 1;
                do {
                    i16 = i16;
                    i19 = 1;
                    while (++i19 < 1) {
                        Test.fFld = i16;
                        if (i16 != 0) {
                        }
                        try {
                            i16 = (i19 / i17);
                            i16 = (i17 % iArr2[i18 - 1]);
                            iArr2[i19 - 1] = (i16 / 184);
                        } catch (ArithmeticException a_e) {}
                        Test.instanceCount += i19;
                        i17 -= i19;
                    }
                    i17 = (int)Test.instanceCount;
                } while (++i18 < 6);
            case 63:
                i17 -= i18;
                break;
            default:
                i17 = i17;
            }
        }
        long meth_res = i16 + Double.doubleToLongBits(d2) + i17 + i18 + i19 + FuzzerUtils.checkSum(iArr2);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i2, int i3) {

        byte by1=-79;
        double d1=28.3090;
        int i4=-109, i5=-54, i6=25220, i7=-3, iArr[]=new int[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr, -450);
        FuzzerUtils.init(lArr1, -4601723368646542194L);

        vMeth((long)(((i2 + Test.instanceCount) + (i3 + 8884)) * (++Test.fArrFld[(i3 >>> 1) % N])), Test.fFld,
            (byte)(--by1));
        by1 = (byte)i3;
        d1 = 1;
        while (++d1 < 398) {
            i2 *= i3;
            i4 = 1;
            while (++i4 < 4) {
                iArr[(i4 >>> 1) % N] = ((--i2) * (-(-(i4 + i3))));
            }
        }
        for (i5 = 11; i5 < 201; ++i5) {
            vMeth(Math.abs(lArr1[i5 - 1]), Test.fFld, by1);
        }
        i2 |= (int)lArr1[(i2 >>> 1) % N];
        i7 = 1;
        while (++i7 < 309) {
            vMeth((--Test.instanceCount) - ((9 - i2) - (i7 - -62)), (++by1) - Integer.reverseBytes((int)(d1 * 21346)),
                (byte)((Math.abs(0) + (d1 - i4)) + (Test.instanceCount + (Test.instanceCount + i2))));
            Test.instanceCount = i6;
            i3 += (int)-1.50116;
            i3 += (i7 - Test.fFld);
            iMeth1();
        }
        long meth_res = i2 + i3 + by1 + Double.doubleToLongBits(d1) + i4 + i5 + i6 + i7 + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=21543, i21=-30644, i22=15649, i23=-9, i24=186, i25=-5, i26=44983, i27=-219, i28=-187;
        double d=31.56979;
        byte by2=51;
        boolean b=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -2006506389L);

        i = iArrFld[(i >>> 1) % N];
        i = (int)(Test.fFld + (i | -6793));
        vMeth(lArr[(i >>> 1) % N] = -146, Test.fFld, (byte)(((-45295L - (d++)) + Math.min(i, i)) * iMeth(i, i)));
        Test.sFld *= (short)i;
        for (int i20 : iArrFld) {
            Test.fFld += Test.instanceCount;
            i21 = 1;
            do {
                Test.fFld -= 13L;
                i -= 171;
                Test.instanceCount += i21;
                i20 = i20;
            } while (++i21 < 63);
            switch (((i20 >>> 1) % 3) + 32) {
            case 32:
                switch ((((i21 >>> 1) % 10) * 5) + 78) {
                case 97:
                    if (b) {
                        switch ((i21 >>> 1) % 3) {
                        case 0:
                            i20 *= (int)4134632726782395999L;
                            Test.instanceCount = by2;
                            i = (int)20.631F;
                            break;
                        case 1:
                            iArrFld[(i21 >>> 1) % N] -= (int)d;
                            for (i22 = 1; i22 < 63; ++i22) {
                                for (i24 = 1; i24 < 2; ++i24) {
                                    i |= (int)Test.instanceCount;
                                    Test.instanceCount += 6;
                                    iArrFld[i24 - 1] >>>= i25;
                                    if (true) break;
                                    Test.instanceCount += (i24 + i25);
                                }
                                for (i26 = 1; i26 < 2; i26++) {
                                    Test.instanceCount = 53228;
                                    try {
                                        i = (i25 % i26);
                                        i = (i26 / 25);
                                        i25 = (i21 / 1014796846);
                                    } catch (ArithmeticException a_e) {}
                                }
                                iArrFld[i22 + 1] |= i20;
                            }
                            break;
                        case 2:
                            i27 += (int)-4050908093091119110L;
                            break;
                        }
                    }
                    break;
                case 113:
                    try {
                        i = (i21 / -1431152434);
                        i27 = (i26 / i25);
                        i27 = (-231 / iArrFld[(i >>> 1) % N]);
                    } catch (ArithmeticException a_e) {}
                case 116:
                    i27 *= i26;
                    break;
                case 93:
                    Test.fFld += Test.sFld;
                    break;
                case 95:
                    Test.instanceCount |= i23;
                    break;
                case 114:
                    iArrFld[(i21 >>> 1) % N] = i26;
                    break;
                case 86:
                    try {
                        iArrFld[(i24 >>> 1) % N] = (iArrFld[(i >>> 1) % N] / iArrFld[(i25 >>> 1) % N]);
                        iArrFld[(36699 >>> 1) % N] = (1290288439 % i25);
                        i25 = (i / 44);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 83:
                    i23 += Test.sFld;
                    break;
                case 84:
                    iArrFld[(i21 >>> 1) % N] = i27;
                    break;
                case 82:
                    i25 <<= (int)Test.instanceCount;
                    break;
                default:
                    d += Test.instanceCount;
                }
                break;
            case 33:
                i20 = i23;
                break;
            case 34:
                i28 *= i26;
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
//DEBUG  vMeth ->  vMeth mainTest iMeth
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
