package tests.javafuzzer2538;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 16:26:16 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-55920L;
    public volatile int iFld=-144;
    public static double dFld=-54.54266;
    public static float fFld=-26.681F;
    public static volatile int iFld1=6147;
    public boolean bFld=false;
    public static int iArrFld[]=new int[N];
    public boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 48915);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i1, int i2, long l) {

        int i3=25146, i4=15991, i5=-15817, i6=10, i7=-5378, i8=-11552, iArr1[]=new int[N];
        byte by=-98;

        FuzzerUtils.init(iArr1, -9193);

        for (i3 = 5; i3 < 209; ++i3) {
            Test.dFld *= i3;
            i2 -= i3;
            if (true) {
                i2 += i3;
                iArr1[i3] = 11;
                for (i5 = 8; i5 > 1; i5--) {
                    switch (((i3 % 7) * 5) + 49) {
                    case 71:
                        iArr1 = FuzzerUtils.int1array(N, (int)-66);
                        i6 -= i5;
                    case 53:
                        for (i7 = i3; i7 < 2; i7++) {
                            Test.fFld -= Test.fFld;
                            i4 += (((i7 * i6) + i5) - Test.fFld);
                            i1 += i7;
                            by *= (byte)Test.dFld;
                        }
                        break;
                    case 74:
                        iArr1[i3] *= i7;
                    case 80:
                    case 50:
                        i8 += (((i5 * l) + l) - i4);
                    case 81:
                        iArr1[i5 + 1] -= i6;
                        break;
                    case 52:
                        i8 = i4;
                        break;
                    default:
                        Test.instanceCount += (i5 - i2);
                    }
                }
            } else {
                i2 += (i3 * i3);
            }
        }
        vMeth1_check_sum += i1 + i2 + l + i3 + i4 + i5 + i6 + i7 + i8 + by + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i) {

        int i9=-7, i10=-37340, iArr[]=new int[N];
        double d=33.47275;
        float fArr[]=new float[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 10);
        FuzzerUtils.init(fArr, -22.95F);
        FuzzerUtils.init(lArr, -2723224341724934195L);

        i *= (iArr[(i >>> 1) % N] + -28);
        vMeth1(i, i, Test.instanceCount);
        i = (int)-1.955F;
        for (i9 = 10; i9 < 259; ++i9) {
            i += i;
            switch ((i9 % 5) + 82) {
            case 82:
                i10 *= (int)d;
                Test.instanceCount += Test.instanceCount;
                fArr[i9 + 1] -= 8;
                lArr[i9 - 1] = i;
                break;
            case 83:
                i10 += (int)Test.instanceCount;
            case 84:
                Test.fFld = -3012705180400642595L;
                break;
            case 85:
                Test.fFld = i10;
                Test.fFld += i9;
                i10 += 7;
                break;
            case 86:
                iArr[i9 + 1] *= (int)Test.instanceCount;
                break;
            default:
                if (false) break;
            }
        }
        vMeth_check_sum += i + i9 + i10 + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth() {

        int i11=-1930, i12=-25128, i13=24360, i14=-220;
        float f=1.645F;
        long l1=1083504542L;
        boolean b=true;
        short s=6483;

        vMeth(219);
        for (i11 = 10; 352 > i11; i11++) {
            if (b) {
                for (f = 5; f > 1; f--) {
                    Test.instanceCount = i13;
                    Test.dFld -= i11;
                }
            } else if (false) {
                i12 = i13;
                switch (((i11 % 2) * 5) + 43) {
                case 52:
                    for (l1 = i11; 5 > l1; ++l1) {
                        i14 <<= Test.iFld1;
                        if (b) continue;
                        Test.dFld -= Test.iFld1;
                        if (i13 != 0) {
                        }
                        s = (short)l1;
                        Test.instanceCount += Test.instanceCount;
                    }
                    break;
                case 53:
                    s = (short)1.126757;
                    break;
                }
            } else if (true) {
                i13 = (int)Test.dFld;
            } else {
                i12 <<= i12;
            }
        }
        long meth_res = i11 + i12 + Float.floatToIntBits(f) + i13 + l1 + i14 + (b ? 1 : 0) + s;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i15=-58985, i16=-129, i17=-79, i18=-1375, i19=-13;
        float fArr1[]=new float[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(fArr1, 14.902F);
        FuzzerUtils.init(lArr1, -18577L);

        iFld = iMeth();
        Test.dFld = iFld;
        i15 = 1;
        do {
            for (i16 = 4; i16 < 73; i16++) {
                Test.iArrFld[i15 + 1] >>= iFld;
                for (i18 = i16; i18 < 2; i18++) {
                    boolean b1=true;
                    try {
                        i17 = (243 / Test.iArrFld[i15 - 1]);
                        i19 = (44679 % i17);
                        Test.iFld1 = (128 / Test.iArrFld[(Test.iFld1 >>> 1) % N]);
                    } catch (ArithmeticException a_e) {}
                    Test.instanceCount -= i16;
                    i17 <<= (int)-1359888931737084648L;
                    iFld <<= i16;
                    Test.iArrFld[i15 - 1] -= i18;
                    if (b1) break;
                    try {
                        i17 = (21 % i15);
                        i17 = (i17 / i15);
                        Test.iFld1 = (-82 / i16);
                    } catch (ArithmeticException a_e) {}
                    Test.iArrFld[i15] <<= (int)Test.instanceCount;
                    i17 = -19;
                }
                Test.fFld += i16;
                bFld = false;
            }
            Test.instanceCount += (i15 * i15);
            bArrFld[i15 - 1] = bFld;
            fArr1[i15] *= 102;
            Test.dFld -= Test.dFld;
            i17 *= (int)Test.instanceCount;
        } while (++i15 < 344);
        iFld -= i18;
        lArr1[(i18 >>> 1) % N] = 23082;
        Test.iFld1 *= (int)Test.instanceCount;
        Test.instanceCount += (long)1.678F;
        Test.iFld1 ^= i19;
        i17 *= iFld;
        iFld += iFld;
        Test.fFld -= iFld;


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
