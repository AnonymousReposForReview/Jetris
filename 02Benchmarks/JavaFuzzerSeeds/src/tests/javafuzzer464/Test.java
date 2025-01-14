package tests.javafuzzer464;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 04:13:08 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2583879752L;
    public static double dFld=1.41936;
    public static long lFld=-3089546869L;
    public static boolean bFld=false;
    public static short sFld=16708;
    public static float fFld=57.997F;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 1480642616983498024L);
        FuzzerUtils.init(Test.iArrFld, 11539);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i2, int i3, float f) {

        int i4=31823, i5=-9, i6=-5, i7=-31, iArr[]=new int[N];
        byte by=0;

        FuzzerUtils.init(iArr, -3265);

        Test.lFld -= Test.instanceCount;
        i2 -= i3;
        for (i4 = 6; i4 < 329; ++i4) {
            i6 = 1;
            while (++i6 < 5) {
                switch ((i6 % 2) + 67) {
                case 67:
                    iArr[i4 - 1] >>= i6;
                    break;
                case 68:
                    by += (byte)i5;
                    Test.lArrFld[i6 - 1] <<= -3;
                    Test.instanceCount = i2;
                    iArr[i4 + 1] *= (int)Test.lFld;
                    break;
                }
                i7 = 1;
                while (--i7 > 0) {
                    try {
                        iArr[i7 + 1] = (41 % i4);
                        i5 = (55056 / i7);
                        i5 = (-13478 / iArr[i6 + 1]);
                    } catch (ArithmeticException a_e) {}
                    Test.lArrFld[i7 - 1] = Test.lFld;
                    i2 = i7;
                    Test.bFld = Test.bFld;
                }
            }
        }
        vMeth1_check_sum += i2 + i3 + Float.floatToIntBits(f) + i4 + i5 + i6 + by + i7 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(long l, long l1) {

        int i8=13, i9=43984, i10=26473, i11=-2, iArr1[]=new int[N];
        float f1=-103.712F;
        byte by1=-28;

        FuzzerUtils.init(iArr1, -1);

        vMeth1(i8, i8, f1);
        i8 = i8;
        for (i9 = 8; 267 > i9; ++i9) {
            i10 += i9;
            Test.bFld = Test.bFld;
            switch ((i9 % 1) + 95) {
            case 95:
                i8 = (int)l1;
            default:
                i11 = 1;
                while (++i11 < 6) {
                    iArr1[i11] *= (int)l1;
                    Test.lArrFld[i11] = i8;
                }
            }
            i8 = (int)l;
        }
        i10 = i11;
        i8 &= i9;
        by1 >>>= (byte)i10;
        i8 = (int)Test.instanceCount;
        vMeth_check_sum += l + l1 + i8 + Float.floatToIntBits(f1) + i9 + i10 + i11 + by1 + FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth() {

        int i=-1, i1=14, i12=12, i13=51, i14=-37573, iArr2[]=new int[N];
        float f2=-104.497F, fArr[][]=new float[N][N];

        FuzzerUtils.init(fArr, 0.254F);
        FuzzerUtils.init(iArr2, -11);

        switch (((i >>> 1) % 2) + 74) {
        case 74:
            i -= (int)Test.instanceCount;
            Test.lArrFld[(i >>> 1) % N] += (long)((--fArr[(i >>> 1) % N][(i >>> 1) % N]) - ((-Test.instanceCount) + (i
                * i)));
            break;
        case 75:
            i1 = 1;
            while (++i1 < 239) {
                i -= (int)((Test.instanceCount--) - ((Test.instanceCount + Test.dFld) + (-Test.instanceCount)));
                vMeth(Test.instanceCount, Test.lFld);
                if (Test.bFld) {
                    f2 += (((i1 * Test.sFld) + i) - i1);
                    i12 += (int)Test.lFld;
                } else {
                    for (i13 = 1; i13 < 7; ++i13) {
                        f2 += (float)-105.45734;
                        i12 -= (int)Test.lFld;
                        Test.lFld += (i13 * i13);
                        iArr2[i1 + 1] -= i14;
                        Test.sFld >>= (short)Test.lFld;
                    }
                }
            }
            break;
        default:
            i14 = (int)-4538660006990787114L;
        }
        long meth_res = i + i1 + Float.floatToIntBits(f2) + i12 + i13 + i14 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i15=28083, i16=-1, i17=-22, i18=-3, i19=-4, i20=238, i21=-11;
        long l2=0L;
        float fArr1[]=new float[N];

        FuzzerUtils.init(fArr1, 1.216F);

        Test.dFld *= ((iMeth() + Test.lFld) % ((long)(Test.dFld) | 1));
        for (i15 = 14; i15 < 271; i15 += 3) {
            i16 -= i15;
            for (i17 = 295; i17 > 7; --i17) {
                for (i19 = 1; 2 > i19; i19++) {
                    Test.fFld += ((long)i19 ^ (long)Test.instanceCount);
                    i16 += i20;
                    i16 = i19;
                    Test.fFld += (((i19 * Test.instanceCount) + l2) - Test.lFld);
                    i20 += (int)Test.lFld;
                    switch (((i15 % 7) * 5) + 115) {
                    case 140:
                        i16 -= (int)-9L;
                        i21 *= i15;
                        break;
                    case 137:
                        fArr1[i19] = (float)Test.dFld;
                    case 146:
                        Test.fFld += (((i19 * i21) + i21) - i17);
                        Test.iArrFld[i15] -= (int)Test.instanceCount;
                        Test.iArrFld[i15] = i21;
                        i20 += (i19 ^ i17);
                    case 132:
                        l2 /= ((long)(Test.fFld) | 1);
                        fArr1[i17] *= l2;
                        i16 += (i19 * i19);
                        break;
                    case 143:
                        switch ((i17 % 7) + 102) {
                        case 102:
                            l2 -= i21;
                            i21 += i16;
                            Test.iArrFld = Test.iArrFld;
                            break;
                        case 103:
                            Test.lFld += -19299L;
                            i16 = i21;
                            Test.iArrFld = FuzzerUtils.int1array(N, (int)97);
                            Test.lFld += (i19 | Test.instanceCount);
                            break;
                        case 104:
                            i21 -= (int)l2;
                            break;
                        case 105:
                            Test.fFld = i15;
                            break;
                        case 106:
                            Test.fFld += Test.lFld;
                            break;
                        case 107:
                            l2 += (((i19 * i21) + i21) - i17);
                            break;
                        case 108:
                            i16 += (((i19 * i18) + Test.fFld) - i18);
                            break;
                        default:
                            i21 *= (int)Test.lFld;
                        }
                        break;
                    case 116:
                        i18 = i20;
                        break;
                    case 126:
                        l2 += (((i19 * Test.instanceCount) + i18) - i21);
                        break;
                    default:
                        i18 += (((i19 * i20) + i20) - Test.lFld);
                    }
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
