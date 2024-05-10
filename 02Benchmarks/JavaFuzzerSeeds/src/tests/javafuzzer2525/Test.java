package tests.javafuzzer2525;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 16:13:57 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3078966056L;
    public int iFld=13;
    public volatile float fFld=23.661F;
    public static double dFld=1.28503;
    public static short sFld=21784;
    public static boolean bFld=true;
    public static byte byFld=-21;
    public static short sArrFld[]=new short[N];
    public static byte byArrFld[]=new byte[N];
    public static float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];
    public static int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)-25868);
        FuzzerUtils.init(Test.byArrFld, (byte)-107);
        FuzzerUtils.init(Test.fArrFld, -115.744F);
        FuzzerUtils.init(Test.iArrFld, 2);
        FuzzerUtils.init(Test.iArrFld1, 46541);
    }

    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i9, byte by1, int i10) {

        int i11=-243, i12=-7, i13=2461, i14=-50527, i15=13, i16=47773, iArr[][]=new int[N][N];
        double d1=23.95129;

        FuzzerUtils.init(iArr, -10);

        for (i11 = 23; i11 < 379; ++i11) {
            Test.sFld -= (short)Test.instanceCount;
            Test.instanceCount = i9;
        }
        Test.instanceCount -= i10;
        for (i13 = 15; i13 < 305; ++i13) {
            d1 = 6;
            while ((d1 -= 3) > 0) {
                if (Test.bFld) break;
                for (i15 = 1; i15 < 3; i15++) {
                    Test.byArrFld[i15 - 1] = (byte)Test.instanceCount;
                    i16 += i11;
                    i12 *= i12;
                    iArr[i15][i15] = (int)Test.instanceCount;
                    i10 += Test.sFld;
                    i14 = (int)Test.instanceCount;
                    i14 >>= i14;
                }
            }
        }
        vMeth1_check_sum += i9 + by1 + i10 + i11 + i12 + i13 + i14 + Double.doubleToLongBits(d1) + i15 + i16 +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth() {

        int i7=-33958, i8=-5, i17=14, i18=-48790, i19=-167, i20=-14, iArr1[][]=new int[N][N];
        float f1=1.463F;
        boolean b=true, bArr[]=new boolean[N];
        double d2=61.108363, dArr[]=new double[N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(dArr, -1.128735);
        FuzzerUtils.init(iArr1, 5);

        if (Test.bFld) {
            for (i7 = 2; 121 > i7; i7++) {
                f1 += (float)Test.dFld;
                bArr[i7] = (((b ^ b) != (b = b)) != b);
                vMeth1(13648, Test.byFld, i8);
                Test.fArrFld[i7 - 1] -= i8;
                i8 = -786;
            }
            for (i17 = 5; i17 < 232; ++i17) {
                for (d2 = 1; d2 < 7; d2 += 2) {
                    dArr[(int)(d2 - 1)] += f1;
                    iArr1 = FuzzerUtils.int2array(N, (int)-1);
                    Test.byFld -= (byte)i8;
                }
                iArr1[i17][i17] *= Test.sFld;
                i20 += i17;
                i8 &= -76;
            }
        } else if (Test.bFld) {
            i18 -= -216;
        }
        vMeth_check_sum += i7 + i8 + Float.floatToIntBits(f1) + (b ? 1 : 0) + i17 + i18 + Double.doubleToLongBits(d2) +
            i19 + i20 + FuzzerUtils.checkSum(bArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            FuzzerUtils.checkSum(iArr1);
    }

    public float fMeth(int i6) {

        double d3=-2.71376;
        int i21=-20668, i22=-33207, i23=166;

        iFld >>= (int)(((-(Test.instanceCount + Test.instanceCount)) - (iFld + fFld)) - ((++Test.instanceCount) - (i6 +
            fFld)));
        iFld = Test.sArrFld[(iFld >>> 1) % N];
        vMeth();
        for (d3 = 16; d3 < 378; d3++) {
            i21 -= iFld;
            iFld = i21;
            fFld = i21;
            i6 += i21;
            i6 += (int)(((d3 * i6) + fFld) - i6);
            for (i22 = (int)(d3); i22 < 5; i22++) {
                i23 ^= 0;
                if (true) {
                    Test.instanceCount >>>= i21;
                    Test.iArrFld = Test.iArrFld;
                } else if (Test.bFld) {
                    Test.bFld = Test.bFld;
                }
            }
        }
        long meth_res = i6 + Double.doubleToLongBits(d3) + i21 + i22 + i23;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        byte by=90;
        int i=-55, i1=-165, i2=-3, i3=3, i4=-37205, i5=-51885;
        double d=0.1468;
        float f=-75.904F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 33L);

        by = (byte)(lArr[(iFld >>> 1) % N]--);
        for (i = 125; 5 < i; i--) {
            for (i2 = 3; i2 < 209; i2++) {
                switch (((i % 4) * 5) + 59) {
                case 68:
                    i3 += (((i2 * i1) + Test.instanceCount) - i3);
                    break;
                case 77:
                    d -= (((i1 & i2) << (-i)) * f);
                    break;
                case 73:
                    i3 += i2;
                    i4 = 1;
                    do {
                        d *= fMeth(i2);
                        fFld = Test.instanceCount;
                        try {
                            i5 = (i2 / -28053);
                            i3 = (65166 % Test.iArrFld[i - 1]);
                            i5 = (372380322 % i1);
                        } catch (ArithmeticException a_e) {}
                        Test.iArrFld[i2 - 1] = (int)f;
                        i1 >>= iFld;
                        i1 = i3;
                        switch (((i4 >>> 1) % 6) + 115) {
                        case 115:
                        case 116:
                            i3 = (int)Test.instanceCount;
                            i3 *= (int)Test.dFld;
                        case 117:
                            Test.iArrFld1[i2 + 1] = 13;
                            fFld *= -9L;
                            i1 >>>= i;
                            break;
                        case 118:
                            i3 = i3;
                            switch (i % 9) {
                            case 0:
                                Test.fArrFld[i - 1] = i2;
                            case 1:
                                Test.sFld += (short)i5;
                                Test.dFld -= i4;
                            case 2:
                                i1 = i3;
                                i3 -= i4;
                            case 3:
                                Test.dFld += Test.instanceCount;
                                i1 = iFld;
                                Test.bFld = Test.bFld;
                                break;
                            case 4:
                                iFld += 6;
                                break;
                            case 5:
                                Test.iArrFld1[i] += i2;
                                break;
                            case 6:
                                Test.iArrFld[i2] >>= (int)Test.instanceCount;
                                break;
                            case 7:
                                Test.iArrFld[i2 - 1] += iFld;
                            case 8:
                                iFld = (int)Test.instanceCount;
                                break;
                            }
                            break;
                        case 119:
                            f = Test.instanceCount;
                            break;
                        case 120:
                            try {
                                i5 = (i5 / -115);
                                iFld = (-67 % i1);
                                i5 = (i3 / i2);
                            } catch (ArithmeticException a_e) {}
                        default:
                            iFld += (i4 + i);
                        }
                    } while (++i4 < 2);
                    break;
                case 60:
                    i1 += i2;
                    break;
                default:
                    iFld *= i1;
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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}