package tests.javafuzzer2299;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 11:42:18 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-4129138117L;
    public static int iFld=-10;
    public static float fFld=2.814F;
    public static boolean bFld=false;
    public static volatile int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];
    public double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 103);
        FuzzerUtils.init(Test.lArrFld, -95L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;
    public static long vMeth3_check_sum = 0;

    public static void vMeth1() {

        int i7=5398;

        Test.iArrFld[(i7 >>> 1) % N] = (int)(92 - (++Test.instanceCount));
        i7 *= (i7--);
        vMeth1_check_sum += i7;
    }

    public static void vMeth3() {

        int i9=8, i10=77, i11=-35010, i12=0;
        double d1=0.60443;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -63806L);

        Test.iFld = (int)Test.fFld;
        for (i9 = 2; i9 < 251; ++i9) {
            i10 = i11;
            Test.iFld = (int)d1;
            i12 = 7;
            while ((i12 -= 2) > 0) {
                Test.iFld += (int)Test.instanceCount;
                lArr[i9 - 1] *= i10;
                Test.instanceCount -= Test.iFld;
                if (false) {
                    Test.iFld += i12;
                    switch ((((i12 >>> 1) % 8) * 5) + 39) {
                    case 43:
                    case 59:
                        Test.fFld -= Test.fFld;
                        break;
                    case 58:
                        Test.iFld += (i12 + i11);
                        d1 -= Test.fFld;
                        if (Test.bFld) continue;
                        break;
                    case 50:
                        Test.instanceCount += i12;
                    case 69:
                        i11 <<= Test.iFld;
                        break;
                    case 72:
                        Test.bFld = Test.bFld;
                        break;
                    case 75:
                        Test.iArrFld[i12 + 1] ^= i11;
                        break;
                    case 73:
                        if (Test.bFld) break;
                    default:
                        Test.iFld += i12;
                    }
                    vMeth3_check_sum += i9 + i10 + i11 + Double.doubleToLongBits(d1) + i12 + FuzzerUtils.checkSum(lArr);
                    return;
                } else if (Test.bFld) {
                    i11 += (i12 * i12);
                    vMeth3_check_sum += i9 + i10 + i11 + Double.doubleToLongBits(d1) + i12 + FuzzerUtils.checkSum(lArr);
                    return;
                }
            }
        }
        vMeth3_check_sum += i9 + i10 + i11 + Double.doubleToLongBits(d1) + i12 + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth2() {

        int i13=81, i14=21, i15=1794, i16=-169, i17=54, i18=0, i19=5;
        short s=21209;

        vMeth3();
        Test.instanceCount -= (long)Test.fFld;
        if (Test.bFld) {
            for (i13 = 10; i13 < 310; ++i13) {
                i15 = 1;
                while (++i15 < 6) {
                    Test.lArrFld[i13 + 1] -= Test.iFld;
                    i14 = i14;
                    for (i16 = 1; i16 < 1; i16++) {
                        i14 <<= -31389;
                        i17 *= (int)Test.instanceCount;
                    }
                    i14 /= (int)(i13 | 1);
                    if (Test.bFld) continue;
                    for (i18 = 1; 1 > i18; i18 += 3) {
                        i17 >>= i14;
                        i14 -= Test.iFld;
                    }
                }
            }
        } else if (Test.bFld) {
            i14 += (int)Test.instanceCount;
        } else if (Test.bFld) {
            s += (short)-58336;
        }
        vMeth2_check_sum += i13 + i14 + i15 + i16 + i17 + i18 + i19 + s;
    }

    public static void vMeth(byte by, int i4, long l) {

        int i5=2, i6=-2, i8=40220, i20=48832, i21=245, i22=-58;
        double d=-2.68411;
        short s1=990;
        float f=2.693F;

        for (i5 = 369; 6 < i5; i5--) {
            vMeth1();
            for (d = i5; d < 5; d++) {
                switch ((((i6 + i8) >>> 1) % 7) + 18) {
                case 18:
                    vMeth2();
                    Test.fFld -= s1;
                    if (false) continue;
                    for (i20 = 1; i20 < 1; ++i20) {
                        i4 += (((i20 * Test.instanceCount) + i6) - i4);
                        Test.instanceCount = l;
                        i21 = s1;
                    }
                    break;
                case 19:
                    for (f = 1; f > 1; --f) {
                        Test.instanceCount += (long)f;
                        i4 *= (int)Test.instanceCount;
                        i22 = -24204;
                    }
                    break;
                case 20:
                    if (Test.iFld != 0) {
                        vMeth_check_sum += by + i4 + l + i5 + i6 + Double.doubleToLongBits(d) + i8 + s1 + i20 + i21 +
                            Float.floatToIntBits(f) + i22;
                        return;
                    }
                    break;
                case 21:
                    i22 = s1;
                case 22:
                    Test.iArrFld[i5 + 1] &= (int)Test.instanceCount;
                    break;
                case 23:
                    i8 = (int)Test.instanceCount;
                    break;
                case 24:
                    i4 = -122;
                    break;
                }
            }
        }
        vMeth_check_sum += by + i4 + l + i5 + i6 + Double.doubleToLongBits(d) + i8 + s1 + i20 + i21 +
            Float.floatToIntBits(f) + i22;
    }

    public void mainTest(String[] strArr1) {

        int i=-35466, i1=-63281, i2=-64203, i3=34818, i23=-250, i24=-162, i25=0, i26=6;
        byte by1=115;
        double d2=-44.111915;
        long l1=-2693623323L;
        short s2=26551;
        float f1=-2.331F;

        for (i = 169; i > 9; i--) {
            if (Test.bFld) {
                for (i2 = 6; i2 < 157; i2++) {
                    Test.instanceCount = i3;
                    vMeth(by1, i3, Test.instanceCount);
                    Test.iFld = (int)d2;
                    by1 = (byte)10;
                    Test.instanceCount += 117;
                    i1 += 195;
                    i23 = 1;
                    do {
                        by1 >>= (byte)i23;
                        Test.fFld += (((i23 * i) + Test.instanceCount) - i);
                    } while (++i23 < 2);
                }
                if (Test.bFld) {
                    for (l1 = i; l1 < 157; l1++) {
                        Test.instanceCount = i;
                        Test.instanceCount += i24;
                        dArrFld = dArrFld;
                        Test.fFld -= -11;
                    }
                    Test.lArrFld[i - 1] = Test.instanceCount;
                    Test.iFld += (int)-1884255132L;
                } else {
                    s2 ^= (short)i23;
                    i3 = i3;
                }
                Test.bFld = Test.bFld;
            } else {
                i25 = 1;
                do {
                    Test.instanceCount *= i;
                    Test.instanceCount += (((i25 * Test.fFld) + Test.fFld) - i25);
                    for (f1 = 1; 1 > f1; ++f1) {
                        s2 >>= (short)i1;
                    }
                    i26 += i25;
                    i3 = i2;
                } while (++i25 < 157);
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
//DEBUG  vMeth2 ->  vMeth2 vMeth mainTest
//DEBUG  vMeth3 ->  vMeth3 vMeth2 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
