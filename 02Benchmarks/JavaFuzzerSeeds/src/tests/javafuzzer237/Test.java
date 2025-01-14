package tests.javafuzzer237;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 00:41:54 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-160L;
    public static short sFld=-6576;
    public static byte byFld=-22;
    public static boolean bFld=true;
    public float fFld=0.273F;
    public float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -64369);
        FuzzerUtils.init(Test.dArrFld, 0.42578);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public void vMeth1(double d) {

        int i7=-12, i8=2391, i9=50875, i10=15808, iArr[]=new int[N];
        float f1=25.38F;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -73.61295);
        FuzzerUtils.init(iArr, -2);

        for (i7 = 20; i7 < 343; ++i7) {
            i8 <<= (int)Test.instanceCount;
            Test.sFld += (short)Test.instanceCount;
            i9 = 1;
            do {
                i8 = -4;
                i8 += (i9 + i8);
                dArr[i9] = i9;
                i10 = 1;
                do {
                    Test.instanceCount *= i9;
                    Test.instanceCount >>>= i7;
                    iArr[i10] = i10;
                    i8 += i8;
                    f1 = -11;
                    iArr = Test.iArrFld;
                    i8 += i10;
                } while (++i10 < 1);
            } while (++i9 < 5);
        }
        vMeth1_check_sum += Double.doubleToLongBits(d) + i7 + i8 + i9 + i10 + Float.floatToIntBits(f1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr);
    }

    public long lMeth() {

        double d1=0.74225;
        int i11=0, i12=-31486, i13=6, i14=-10, i15=-4, i16=9040;
        boolean b=true;
        float f2=2.998F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 3035363252194733136L);

        vMeth1(d1);
        for (i11 = 140; 5 < i11; --i11) {
            switch ((((i11 >>> 1) % 6) * 5) + 126) {
            case 139:
                if (i11 != 0) {
                }
                break;
            case 145:
                i12 -= i11;
                switch ((((i12 >>> 1) % 6) * 5) + 84) {
                case 113:
                    if (b) break;
                    break;
                case 92:
                case 95:
                    if (b) continue;
                    f2 = Test.byFld;
                case 97:
                    Test.dArrFld[i11 + 1] += i12;
                    for (i13 = 1; i13 < 12; ++i13) {
                        f2 += (float)d1;
                    }
                    for (i15 = 1; 12 > i15; ++i15) {
                        i14 += (i15 - i11);
                        if (b) break;
                    }
                    break;
                case 85:
                    Test.byFld /= (byte)((long)(d1) | 1);
                case 96:
                    i14 = i16;
                default:
                    Test.iArrFld[i11 - 1] += i13;
                }
            case 140:
                i14 += i13;
                break;
            case 127:
                Test.byFld += (byte)(((i11 * f2) + i11) - Test.byFld);
                break;
            case 138:
            case 129:
                i12 += (((i11 * Test.instanceCount) + i12) - i12);
            default:
                i12 += (i11 * i11);
            }
        }
        long meth_res = Double.doubleToLongBits(d1) + i11 + i12 + (b ? 1 : 0) + Float.floatToIntBits(f2) + i13 + i14 +
            i15 + i16 + FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void vMeth(int i2, int i3, int i4) {

        int i5=197, i6=154, i17=5, i18=1, i19=56634, i20=-230;
        double d2=-118.10240;

        for (float f : fArrFld) {
            byte by=-98;
            by = (byte)(i4 + i3);
            i4 &= (i2++);
            for (i5 = 1; 4 > i5; ++i5) {
                Test.iArrFld[i5 + 1] = (int)lMeth();
                lArrFld[i5 - 1] <<= -2708455012057271626L;
            }
            i3 = i4;
            for (i17 = 4; i17 > 1; i17--) {
                for (i19 = 1; i19 < 2; ++i19) {
                    i20 -= (int)Test.instanceCount;
                    Test.instanceCount <<= i6;
                    i6 = i19;
                    i20 >>= i4;
                }
                i20 = (int)1.194F;
                d2 *= -23;
            }
        }
        vMeth_check_sum += i2 + i3 + i4 + i5 + i6 + i17 + i18 + i19 + i20 + Double.doubleToLongBits(d2);
    }

    public void mainTest(String[] strArr1) {

        int i=-4, i1=55, i21=14, i22=-200, i23=230, i24=-8, i25=13870, i26=-11, i27=2, i28=-2, iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, -3);

        for (i = 14; 397 > i; ++i) {
            double d3=-1.36527;
            i1 = Integer.reverseBytes(-9);
            if (true) {
                vMeth(-9, -2, i1);
                i1 <<= i;
            } else {
                d3 -= i1;
            }
            Test.byFld += (byte)(i + i1);
            i21 = 1;
            do {
                fArrFld = fArrFld;
                Test.instanceCount |= 16274L;
                if (Test.bFld) continue;
                Test.iArrFld = iArr1;
                i1 = i1;
                for (i22 = 1; i22 < 1; i22++) {
                    switch ((i % 2) + 67) {
                    case 67:
                        Test.iArrFld[i + 1] -= 15830;
                        break;
                    case 68:
                        fArrFld[i21] = i1;
                        Test.bFld = Test.bFld;
                    }
                    d3 -= d3;
                }
                fFld -= i22;
            } while (++i21 < 66);
        }
        fFld += i24;
        for (i25 = 204; i25 > 7; i25 -= 2) {
            double d4=-2.104706;
            Test.instanceCount = (long)d4;
            iArr1[i25] = i;
            Test.iArrFld[(i >>> 1) % N] *= i22;
            for (i27 = 256; i27 > i25; i27--) {
                lArrFld[i27 + 1] <<= Test.instanceCount;
                Test.sFld <<= (short)Test.instanceCount;
            }
            fFld *= fFld;
            Test.iArrFld[i25 - 1] >>>= i27;
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
