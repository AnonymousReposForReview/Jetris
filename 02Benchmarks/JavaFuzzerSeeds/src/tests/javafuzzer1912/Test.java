package tests.javafuzzer1912;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 05:47:16 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-231L;
    public volatile int iFld=4;
    public static boolean bFld=true;
    public static int iFld1=46924;
    public float fFld=-55.303F;
    public static byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)103);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i, int i1, int i2) {

        boolean b=true;
        int i3=-125, i4=49542, i5=-40089, i6=-99, i7=-35, iArr[]=new int[N];
        double d1=1.107619;
        float f=-58.663F;
        byte by2=-37;

        FuzzerUtils.init(iArr, -254);

        i2 -= (int)Test.instanceCount;
        b = true;
        i3 = 1;
        do {
            if (b) {
                i -= (int)d1;
                switch ((i3 % 7) + 48) {
                case 48:
                    try {
                        i2 = (41 / iArr[i3 - 1]);
                        i2 = (22 % i3);
                        i = (i3 / iArr[i3 + 1]);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 49:
                    for (i4 = 1; i4 < 5; ++i4) {
                        byte by1=56;
                        by1 += (byte)i3;
                        i5 -= -3;
                        Test.instanceCount = i2;
                    }
                    for (i6 = 5; i6 > 1; i6 -= 2) {
                        i += i6;
                        f -= Test.instanceCount;
                        Test.instanceCount = i;
                    }
                    break;
                case 50:
                case 51:
                    if (b) continue;
                    break;
                case 52:
                    by2 <<= (byte)i;
                case 53:
                    f += i3;
                    break;
                case 54:
                    if (b) break;
                    break;
                }
            } else {
                if (b) continue;
            }
        } while (++i3 < 374);
        vMeth1_check_sum += i + i1 + i2 + (b ? 1 : 0) + i3 + Double.doubleToLongBits(d1) + i4 + i5 + i6 + i7 +
            Float.floatToIntBits(f) + by2 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth() {

        int i8=72, i9=-79, i10=-14650, i11=248;
        double d2=1.115257;
        float f1=-84.131F;
        byte by3=-55;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 6L);

        vMeth1(39248, 217, -20597);
        i8 = (int)Test.instanceCount;
        i8 &= (int)Test.instanceCount;
        for (long l : lArr) {
            for (d2 = 1; d2 < 4; ++d2) {
                f1 += (float)(d2 + i8);
                i8 >>>= by3;
                for (i10 = 1; 2 > i10; i10++) {
                    Test.instanceCount += (i10 + i11);
                    i9 = -8;
                    Test.bFld = Test.bFld;
                    Test.instanceCount += i11;
                    i8 -= -191;
                    l -= i10;
                    i11 = (int)l;
                }
            }
        }
        vMeth_check_sum += i8 + Double.doubleToLongBits(d2) + i9 + Float.floatToIntBits(f1) + by3 + i10 + i11 +
            FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth() {

        float f2=38.710F, f3=1.526F;
        double d3=-44.3027;
        byte by4=-124;
        int i12=63123, i14=36630, i15=53179, iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, 61976);

        vMeth();
        Test.byArrFld[(Test.iFld1 >>> 1) % N] *= (byte)Test.iFld1;
        Test.instanceCount /= ((long)(f2) | 1);
        Test.iFld1 += Test.iFld1;
        Test.iFld1 = Test.iFld1;
        d3 *= by4;
        Test.iFld1 *= (int)Test.instanceCount;
        for (f3 = 7; f3 < 232; ++f3) {
            for (i14 = 1; i14 < 7; ++i14) {
                switch ((((i12 >>> 1) % 1) * 5) + 31) {
                case 33:
                    switch ((((i14 >>> 1) % 2) * 5) + 88) {
                    case 95:
                        Test.instanceCount += i14;
                        Test.iFld1 += (int)Test.instanceCount;
                        Test.instanceCount = Test.instanceCount;
                        if (i15 != 0) {
                        }
                    case 96:
                        Test.iFld1 = by4;
                        break;
                    default:
                        i12 += i14;
                    }
                    break;
                default:
                    Test.instanceCount = i14;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f2) + Double.doubleToLongBits(d3) + by4 + Float.floatToIntBits(f3) + i12 +
            i14 + i15 + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        byte by=-31;
        short s=7020;
        double d=2.120300, dArr[]=new double[N];
        int i16=-9373, i17=-24281, i18=-198, i19=173, i20=13, i21=-104, i22=-44214, iArr2[]=new int[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 2153817382L);
        FuzzerUtils.init(dArr, -45.105454);
        FuzzerUtils.init(iArr2, 24118);

        by >>= (byte)(((iFld - s) - (iFld--)) - iFld);
        d += (iMeth() + Test.iFld1);
        iFld -= iFld;
        Test.iFld1 += (int)d;
        s = s;
        i16 = 1;
        do {
            Test.instanceCount = 11731L;
            for (i17 = i16; i17 < 184; i17++) {
                lArr1[i17 - 1] = Test.iFld1;
                dArr[i16] += Test.instanceCount;
                i19 = (int)fFld;
            }
            switch ((i16 % 1) + 50) {
            case 50:
                d = i16;
                iFld <<= (int)Test.instanceCount;
                for (i20 = i16; i20 < 184; ++i20) {
                    Test.iFld1 -= (int)Test.instanceCount;
                    i22 = 1;
                    while (++i22 < 1) {
                        i18 = s;
                        iFld += i20;
                        i18 = (int)Test.instanceCount;
                        lArr1[i22] = iFld;
                        iArr2[i16] = 2289;
                        Test.iFld1 >>= (int)Test.instanceCount;
                        iFld = i17;
                        try {
                            i19 = (Test.iFld1 / -4);
                            i21 = (164 / i17);
                            iArr2[i16] = (i21 / iArr2[i22 + 1]);
                        } catch (ArithmeticException a_e) {}
                        i21 += (i22 | i19);
                        i19 += (i22 + Test.instanceCount);
                    }
                    i19 &= i20;
                    iFld += (int)(-12258L + (i20 * i20));
                    Test.instanceCount += i20;
                }
                break;
            }
        } while (++i16 < 136);


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
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
