package tests.javafuzzer1467;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 21:11:20 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=4L;
    public static volatile boolean bFld=false;
    public static long lFld=-937L;
    public static short sFld=-7313;
    public static int iFld=-4;
    public static float fFld=0.288F;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 64870);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i8, double d, float f1) {

        int i9=-37267, i10=0, i11=-63375, iArr[]=new int[N];
        double d1=82.13752;
        long l1=-1357573421L, l2=-1L;
        byte by=11;

        FuzzerUtils.init(iArr, -9);

        i8 += i8;
        iArr[(i8 >>> 1) % N] += (int)-1.808F;
        i8 = (int)Test.lFld;
        i8 *= i8;
        for (i9 = 9; i9 < 312; i9++) {
            i10 -= i9;
            i8 = (int)-93.480F;
            i10 = (int)d1;
            d1 -= Test.instanceCount;
            Test.sFld &= (short)Test.iFld;
            for (l1 = 1; l1 < 5; ++l1) {
                if (i9 != 0) {
                }
                i11 *= i9;
                by -= (byte)i11;
                Test.instanceCount |= l2;
            }
        }
        long meth_res = i8 + Double.doubleToLongBits(d) + Float.floatToIntBits(f1) + i9 + i10 +
            Double.doubleToLongBits(d1) + l1 + i11 + by + l2 + FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(long l) {

        int i4=-185, i5=-151, i6=-32938, i7=8, i12=-3, i13=58495, i14=-13, i15=-214;
        double d2=-2.111769;

        for (i4 = 9; i4 < 172; ++i4) {
            for (i6 = 10; i6 > i4; --i6) {
                if (Test.bFld & (iMeth1(Test.iFld, d2, Test.fFld) < i7)) break;
                for (i12 = 1; i12 < 1; i12++) {
                    Test.fFld *= Test.instanceCount;
                }
            }
            Test.iArrFld[i4 - 1] *= (int)d2;
            for (i14 = 1; i14 < 10; i14 += 3) {
                Test.iArrFld = Test.iArrFld;
                i13 = i6;
                i15 >>= Test.iFld;
                Test.instanceCount = i6;
                Test.instanceCount += (i14 ^ Test.sFld);
                Test.iArrFld[i4 + 1] >>>= 13103;
                i7 <<= Test.sFld;
            }
            i13 -= i6;
        }
        vMeth_check_sum += l + i4 + i5 + i6 + i7 + Double.doubleToLongBits(d2) + i12 + i13 + i14 + i15;
    }

    public static int iMeth() {

        int i2=-3, i3=-40929, i16=-5, i17=88, i18=-26987;
        float f=-108.473F, fArr[][]=new float[N][N];
        boolean b=true;
        double d3=21.53995;

        FuzzerUtils.init(fArr, 87.146F);

        for (i2 = 10; 242 > i2; i2++) {
            Test.instanceCount <<= (i3++);
            if (((f *= (i2 - i2)) != i3) && b) continue;
            switch ((i2 % 9) + 90) {
            case 90:
                if (b) break;
                vMeth(Test.lFld);
                i16 = 1;
                do {
                    for (i17 = 1; i17 < 1; ++i17) {
                        byte by1=-72;
                        Test.iArrFld[i2 + 1] = i16;
                        f = (float)d3;
                        i18 = (int)d3;
                        Test.instanceCount = by1;
                        Test.iFld += i17;
                        if (i18 != 0) {
                        }
                        if (Test.bFld) continue;
                    }
                } while (++i16 < 7);
                break;
            case 91:
                d3 += d3;
                break;
            case 92:
            case 93:
                Test.lFld = 56L;
            case 94:
                fArr[i2] = fArr[i2 + 1];
            case 95:
            case 96:
                Test.instanceCount = Test.iFld;
                break;
            case 97:
                if (false) break;
                break;
            case 98:
                Test.iFld += (i2 * i2);
                break;
            }
        }
        long meth_res = i2 + i3 + Float.floatToIntBits(f) + (b ? 1 : 0) + i16 + i17 + i18 + Double.doubleToLongBits(d3)
            + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=24062, i1=-2, i19=9, i20=9, i21=8, i22=0, i23=-60777, i24=-55773, i25=78, i26=-31121, i27=197;
        double d4=2.89512;

        i = 1;
        do {
            i1 *= (int)Test.instanceCount;
            switch ((i % 4) + 75) {
            case 75:
                i1 += iMeth();
                for (i19 = 2; 86 > i19; ++i19) {
                    Test.fFld += Test.iFld;
                }
                for (i21 = 1; 86 > i21; ++i21) {
                    if (Test.bFld) {
                        i22 += (i21 ^ i22);
                    } else if (true) {
                        switch (((i21 % 2) * 5) + 50) {
                        case 53:
                        case 52:
                            Test.lFld -= i1;
                            for (i23 = 1; i23 < 2; i23++) {
                                Test.lFld = (long)-2.82435;
                                i20 = Test.sFld;
                                i22 <<= i23;
                                i20 += i23;
                                i24 = -221;
                                i24 >>>= 15460;
                            }
                            break;
                        default:
                            i1 -= (int)Test.instanceCount;
                            Test.fFld *= i22;
                            Test.fFld = i19;
                            Test.iArrFld[i21 - 1] -= (int)Test.instanceCount;
                        }
                        i25 = i24;
                        i25 = i25;
                        i22 += (i21 * i21);
                    } else if (Test.bFld) {
                        Test.iArrFld = FuzzerUtils.int1array(N, (int)20535);
                        for (i26 = 1; i26 < 2; ++i26) {
                            if (Test.bFld) break;
                        }
                        Test.iFld += i21;
                    } else {
                        i1 = i22;
                    }
                }
                break;
            case 76:
                if (Test.bFld) break;
                break;
            case 77:
                i1 = (int)d4;
                break;
            case 78:
                Test.iArrFld[i - 1] += i25;
                break;
            }
        } while (++i < 294);



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
