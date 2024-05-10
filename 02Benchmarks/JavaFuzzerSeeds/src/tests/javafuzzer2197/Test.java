package tests.javafuzzer2197;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 10:07:39 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=26370L;
    public static int iFld=59668;
    public boolean bFld=false;
    public byte byFld=55;
    public static short sFld=-8751;
    public double dFld=0.106492;
    public static volatile int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];
    public static volatile double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -63974);
        FuzzerUtils.init(Test.lArrFld, 3251333980L);
        FuzzerUtils.init(Test.dArrFld, -83.89098);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static int iMeth() {

        int iArr[]=new int[N];

        FuzzerUtils.init(iArr, -56332);

        Test.iFld ^= (iArr[(-112 >>> 1) % N]--);
        long meth_res = FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1() {

        int i14=-4, i15=-14, i16=-58780, i17=-28173, i18=20107, i19=-21159;
        float f1=16.60F;
        short s1=13884;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -247L);

        for (i14 = 19; i14 < 322; i14++) {
            for (i16 = 1; 5 > i16; i16++) {
                for (i18 = 1; i18 < 2; i18++) {
                    try {
                        i15 = (-3 % i16);
                        i17 = (i17 % i19);
                        i17 = (60691 % i17);
                    } catch (ArithmeticException a_e) {}
                    i17 += (((i18 * f1) + Test.iFld) - Test.iFld);
                    i19 <<= s1;
                    Test.iFld = i16;
                    Test.instanceCount >>= 9;
                    lArr[i14 - 1] *= Test.instanceCount;
                    Test.iArrFld[i18] -= (int)Test.instanceCount;
                    Test.instanceCount ^= i16;
                    s1 += (short)(i18 * i18);
                }
            }
            Test.instanceCount *= i19;
            Test.instanceCount = 24;
            Test.iArrFld[i14] *= (int)Test.instanceCount;
        }
        vMeth1_check_sum += i14 + i15 + i16 + i17 + i18 + i19 + Float.floatToIntBits(f1) + s1 +
            FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i9, byte by1) {

        int i10=-1, i11=-1, i12=254, i13=4, i20=36529, i21=-181;
        boolean b=false, bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, false);

        for (i10 = 5; i10 < 124; ++i10) {
            if (bArr[i10 - 1]) break;
            for (i12 = i10; i12 < 13; ++i12) {
                Test.iFld += (i12 | by1);
                vMeth1();
                i11 += i9;
                for (i20 = 1; 1 < i20; --i20) {
                    Test.lArrFld[i20 - 1] &= -5860;
                }
                switch ((((35 >>> 1) % 10) * 5) + 87) {
                case 102:
                    try {
                        i13 = (-94 % i10);
                        Test.iArrFld[i12] = (i20 / i12);
                        i21 = (i20 % 64431);
                    } catch (ArithmeticException a_e) {}
                case 134:
                    i11 *= 0;
                case 127:
                    i21 = -47550;
                    i11 = (int)Test.instanceCount;
                    Test.iFld <<= i11;
                    if (b) break;
                    break;
                case 118:
                    Test.iFld = -27253;
                    break;
                case 119:
                    Test.instanceCount -= -204;
                    break;
                case 107:
                    Test.lArrFld[(i10 >>> 1) % N] >>= i13;
                    break;
                case 130:
                    Test.instanceCount = i11;
                case 113:
                    i9 /= (int)(i13 | 1);
                    break;
                case 91:
                case 100:
                    if (b) continue;
                    break;
                default:
                    by1 += (byte)i21;
                }
            }
        }
        vMeth_check_sum += i9 + by1 + i10 + i11 + i12 + i13 + i20 + i21 + (b ? 1 : 0) + FuzzerUtils.checkSum(bArr);
    }

    public int iMeth1(short s, int i7, int i8) {

        int i22=64097, i23=-33492, i24=-38, i25=-11;
        double d=-31.115316;

        Test.iArrFld[(Test.iFld >>> 1) % N] ^= 220;
        vMeth(i7, byFld);
        for (i22 = 1; i22 < 261; i22++) {
            Test.iArrFld = Test.iArrFld;
            Test.instanceCount = 26818;
            d -= i8;
            for (i24 = 1; i24 < 6; i24++) {
                i8 += (i24 + Test.instanceCount);
                i7 -= (int)d;
                i23 -= Test.iFld;
                i25 >>= byFld;
                if (bFld) {
                    i25 += (((i24 * i8) + Test.instanceCount) - i8);
                    Test.instanceCount = Test.iFld;
                } else if (bFld) {
                    if (false) break;
                }
            }
        }
        long meth_res = s + i7 + i8 + i22 + i23 + Double.doubleToLongBits(d) + i24 + i25;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-97, i1=115, i2=-1, i3=4, i4=-6, i5=156, i6=-1, i26=215, i27=-207, i28=211, i29=-19020;
        float f=2.174F, f2=-1.986F;
        byte by=-50;
        long l=6L;

        for (i = 9; 182 > i; ++i) {
            i1 += iMeth();
        }
        for (i2 = 7; i2 < 138; ++i2) {
            for (f = 4; f < 191; f++) {
                for (i5 = 1; i5 < 2; i5++) {
                    if (bFld) break;
                    i6 += (i5 | i5);
                    i4 %= (int)(((++Test.instanceCount) - (++Test.instanceCount)) | 1);
                    if (bFld) {
                        by += (byte)(iMeth() - (Test.iFld--));
                        i6 >>= ((iMeth1((short)(-13339), i2, i1) - i2) % (i1 | 1));
                        i6 = i5;
                        Test.iArrFld[i5] = Test.iFld;
                    } else if (bFld) {
                        i6 = by;
                    } else if (bFld) {
                        Test.instanceCount += i5;
                        i1 <<= 3;
                    }
                    if (true) continue;
                }
                f2 += (f - i3);
                switch ((i2 % 10) + 11) {
                case 11:
                    Test.iFld *= Test.sFld;
                case 12:
                    i4 -= (int)dFld;
                    i1 <<= (int)Test.instanceCount;
                    i26 = 1;
                    while (++i26 < 2) {
                        Test.instanceCount = 187L;
                    }
                    i1 = i3;
                    break;
                case 13:
                    for (i27 = 1; i27 < 2; i27++) {
                        Test.instanceCount = i26;
                    }
                    break;
                case 14:
                    for (l = 1; l < 2; ++l) {
                        i28 = i4;
                        Test.iArrFld[(int)(f + 1)] = (int)dFld;
                    }
                    break;
                case 15:
                    Test.instanceCount += 3437888631L;
                    break;
                case 16:
                    Test.iArrFld[i2] *= Test.iFld;
                    break;
                case 17:
                    Test.instanceCount *= 169;
                    break;
                case 18:
                    Test.dArrFld[i2] = l;
                    break;
                case 19:
                    byFld -= (byte)i2;
                case 20:
                    Test.iArrFld[(i2 >>> 1) % N] -= i5;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 mainTest
//DEBUG  vMeth ->  vMeth iMeth1 mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth1 mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
