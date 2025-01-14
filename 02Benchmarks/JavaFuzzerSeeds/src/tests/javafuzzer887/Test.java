package tests.javafuzzer887;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 11:18:38 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3927901339L;
    public static volatile double dFld=-125.83506;
    public byte byFld=118;
    public byte byFld1=12;
    public static float fArrFld[]=new float[N];
    public static long lArrFld[]=new long[N];
    public volatile int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 2.856F);
        FuzzerUtils.init(Test.lArrFld, 13L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1() {

        int i13=12, i14=3, i15=34551, i16=21, i17=-23467, i18=40475;
        long l2=-2203912407L;
        float f1=91.374F;

        for (i13 = 139; 5 < i13; i13 -= 2) {
            i14 = i14;
            Test.instanceCount = i13;
            for (i15 = 1; i15 < 23; i15++) {
                l2 ^= i16;
                for (i17 = 1; i17 < 2; i17++) {
                    i16 += (i17 * i17);
                    switch ((i15 % 7) + 65) {
                    case 65:
                        i18 += 144;
                        if (false) continue;
                        Test.lArrFld[i15 - 1] ^= i16;
                    case 66:
                        i18 -= (int)l2;
                        i18 = 55423;
                        break;
                    case 67:
                        f1 += 10;
                        Test.instanceCount -= Test.instanceCount;
                    case 68:
                        i16 = i13;
                        break;
                    case 69:
                        Test.dFld -= i14;
                        break;
                    case 70:
                        i14 += i17;
                        break;
                    case 71:
                        Test.lArrFld[i13 + 1] = i17;
                        break;
                    default:
                        i18 |= (int)3L;
                    }
                }
            }
        }
        long meth_res = i13 + i14 + i15 + i16 + l2 + i17 + i18 + Float.floatToIntBits(f1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i3, int i4, boolean b) {

        int i5=58966, i6=-1, i7=-36, i8=59514, i9=31, i10=-42, i11=10, i12=-155;
        byte by=0, by1=-112;
        float f2=2.491F;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 1.120046);

        i4 *= (int)Math.max((i4 *= i4) / ((i4 * i4) | 1), (-(i3 = 26795)) + (i4++));
        for (i5 = 1; i5 < 277; i5++) {
            for (i7 = 1; i7 < 6; ++i7) {
                Test.instanceCount += i7;
            }
            for (i9 = i5; i9 < 6; i9++) {
                for (i11 = 1; i11 < 1; i11++) {
                    i10 *= (int)Long.reverseBytes(Test.instanceCount--);
                    i4 = ((iMeth1() - i7) * -11);
                }
                Test.instanceCount -= by;
                Test.instanceCount <<= i11;
                by1 += (byte)i9;
                i8 = (int)Test.dFld;
            }
            f2 = i10;
            dArr[i5 + 1] = i5;
            i8 += i4;
        }
        vMeth_check_sum += i3 + i4 + (b ? 1 : 0) + i5 + i6 + i7 + i8 + i9 + i10 + i11 + i12 + by + by1 +
            Float.floatToIntBits(f2) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public int iMeth(long l) {

        int i=817, i1=6722, i2=162;
        float f=-118.229F;

        Test.lArrFld[(i >>> 1) % N] -= (long)-2.107861;
        for (long l1 : Test.lArrFld) {
            f = (float)(++Test.dFld);
            l1 = Math.abs(--i);
            i1 = 1;
            do {
                i2 = 1;
                do {
                    switch (((i2 % 4) * 5) + 90) {
                    case 109:
                        Test.fArrFld[i2 - 1] -= (i - (i--));
                        break;
                    case 99:
                        i = iArrFld[i2 - 1];
                        Test.instanceCount >>= ((l1--) + Test.lArrFld[i2]);
                        byFld += (byte)i1;
                        break;
                    case 93:
                        Test.instanceCount >>>= (long)(Test.instanceCount - (-(-(1 + (f++)))));
                        Test.lArrFld[i1 - 1] = -55633L;
                        i += (int)(((i2 + 42227) + (l1 - l)) + (-i));
                        break;
                    case 95:
                        vMeth(i1, i, true);
                    default:
                        i -= (int)f;
                    }
                } while (++i2 < 1);
            } while (++i1 < 4);
        }
        long meth_res = l + i + Float.floatToIntBits(f) + i1 + i2;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i19=85, i20=-16, i21=8647, i22=-10341, i23=-47031, i24=5, i25=-52320, i26=-11829, i27=1, i28=30412;
        double d=0.70200, d1=113.94178;
        float f3=2.347F;

        Test.fArrFld[(-127 >>> 1) % N] += Test.instanceCount;
        iMeth(Test.instanceCount);
        i19 = 1;
        do {
            i20 = 1;
            while (++i20 < 148) {
                i21 <<= i21;
            }
            for (d = 2; d < 148; d += 2) {
                i22 *= i20;
                i21 += (int)f3;
                for (i23 = 3; i23 > 1; i23--) {
                    short s=15476;
                    Test.instanceCount = byFld;
                    i24 += (((i23 * Test.instanceCount) + Test.instanceCount) - Test.instanceCount);
                    try {
                        i22 = (i19 / 186);
                        i22 = (i21 / iArrFld[i19 - 1]);
                        i24 = (-43937 / i19);
                    } catch (ArithmeticException a_e) {}
                    Test.instanceCount = i24;
                    Test.lArrFld[i19 - 1] = -25592;
                    i21 = s;
                    i24 *= (int)Test.instanceCount;
                }
                for (i25 = 1; i25 < 3; i25++) {
                    f3 = f3;
                    i24 = (int)f3;
                    byFld1 -= (byte)f3;
                    i22 = i26;
                }
                i26 *= (int)Test.dFld;
                Test.lArrFld[(int)(d - 1)] = 108L;
                iArrFld[(int)(d)] -= i26;
                Test.instanceCount += -6;
            }
            d1 = 1;
            while (++d1 < 148) {
                switch ((int)(((d1 % 2) * 5) + 1)) {
                case 7:
                    for (i27 = i19; i27 < 1; i27 += 2) {
                        i28 += (((i27 * i25) + i28) - Test.instanceCount);
                        i22 += i21;
                    }
                    break;
                case 2:
                    i26 *= i23;
                    break;
                }
            }
        } while (++i19 < 169);



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
