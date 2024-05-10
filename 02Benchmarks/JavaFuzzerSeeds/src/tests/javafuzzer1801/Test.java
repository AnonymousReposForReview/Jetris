package tests.javafuzzer1801;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 03:26:16 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2428934629242381660L;
    public static short sFld=7943;
    public static volatile float fFld=0.629F;
    public static int iFld=4;
    public static boolean bFld=false;
    public static double dFld=-27.4780;
    public byte byFld=-37;
    public int iArrFld[]=new int[N];

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(long l1, int i7, long l2) {

        int i8=-137, i9=120, i10=11839, i11=-140;
        boolean b=false, bArr[]=new boolean[N];
        byte by1=101;
        float f=-2.737F;
        double d2=0.84315;

        FuzzerUtils.init(bArr, true);

        for (i8 = 4; i8 < 223; i8++) {
            double d1=88.88580;
            l1 += (i8 * i8);
            i7 += (-21 + (i8 * i8));
            bArr[i8 - 1] = b;
            l2 = by1;
            i7 += (int)1.341F;
            d1 *= Test.instanceCount;
        }
        i7 >>= (int)l1;
        for (i10 = 276; i10 > 1; i10--) {
            if (b) break;
            b = b;
        }
        f = i11;
        i9 += i11;
        Test.instanceCount *= (long)f;
        d2 = i10;
        long meth_res = l1 + i7 + l2 + i8 + i9 + (b ? 1 : 0) + by1 + i10 + i11 + Float.floatToIntBits(f) +
            Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(bArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i, int i1, double d) {

        int i2=-1626, i3=-45, i4=-133, i5=10, i6=-9, i12=-5, i13=39702, i14=-230;
        long lArr[]=new long[N];
        float fArr[]=new float[N];
        double dArr[][]=new double[N][N];

        FuzzerUtils.init(lArr, -1427548448795750745L);
        FuzzerUtils.init(fArr, -89.807F);
        FuzzerUtils.init(dArr, 102.115297);

        i2 = 1;
        while (++i2 < 398) {
            Test.instanceCount = (long)(Math.max(--i, i + Test.sFld) - ((d * -115L) - i));
            lArr[i2 + 1] = (-(i++));
        }
        for (i3 = 1; i3 < 135; i3++) {
            for (i5 = 1; i5 < 12; i5 += 2) {
                fArr[i3 + 1] *= (--i1);
                i1 <<= (iMeth1(Test.instanceCount, i6, Test.instanceCount) * i6);
            }
            i12 = 1;
            do {
                Test.fFld -= i2;
                i4 -= i6;
            } while ((i12 += 3) < 12);
            Test.sFld = (short)Test.fFld;
            for (i13 = 1; i13 < 12; ++i13) {
                Test.instanceCount -= 44000;
                dArr[i13 + 1][i13 - 1] -= 2.347F;
            }
            Test.instanceCount += (i3 + i1);
        }
        long meth_res = i + i1 + Double.doubleToLongBits(d) + i2 + i3 + i4 + i5 + i6 + i12 + i13 + i14 +
            FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        byte by=7;
        double d3=0.3707;
        int i15=-14969, i16=181, i17=151, i18=-182, i19=-86, iArr[]=new int[N];

        FuzzerUtils.init(iArr, -189);

        Test.instanceCount += ((by--) + (-iMeth(Test.iFld, Test.iFld, d3)));
        i15 = 1;
        while (++i15 < 333) {
            Test.iFld <<= 12;
            for (i16 = i15; 5 > i16; ++i16) {
                for (i18 = 1; i18 > 1; i18 -= 3) {
                    Test.instanceCount = Test.iFld;
                    Test.instanceCount <<= 165;
                    i17 = 19002;
                    iArr[i18] = i16;
                    Test.instanceCount /= (Test.instanceCount | 1);
                }
                Test.iFld += i15;
                try {
                    i19 = (i18 / 845301532);
                    i19 = (i16 % i17);
                    i19 = (-49 % i19);
                } catch (ArithmeticException a_e) {}
                Test.bFld = true;
                i17 = Test.iFld;
                Test.fFld += (((i16 * Test.iFld) + i19) - Test.iFld);
            }
        }
        vMeth_check_sum += by + Double.doubleToLongBits(d3) + i15 + i16 + i17 + i18 + i19 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i20=53090, i21=41368, i22=83, i23=-22431, i24=252, iArr1[]=new int[N];
        double d4=-2.38405;
        float fArr1[]=new float[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(iArr1, 2);
        FuzzerUtils.init(fArr1, 1.269F);
        FuzzerUtils.init(byArr, (byte)103);

        if (Test.bFld) {
            vMeth();
            i20 = 1;
            do {
                Test.iFld += i20;
                Test.iFld += (i20 - i20);
                d4 = 72;
                while ((d4 -= 2) > 0) {
                    Test.iFld *= (int)2.102174;
                }
                Test.iFld += (i20 - Test.instanceCount);
            } while (++i20 < 348);
            for (i21 = 3; i21 < 139; i21++) {
                i22 += (int)Test.fFld;
                i22 = -11544;
                i22 += (i21 | i21);
                if (Test.bFld) break;
            }
        } else if (Test.bFld) {
            i22 += Test.sFld;
        } else {
            Test.instanceCount -= (long)d4;
            Test.dFld -= 12;
            i23 = 1;
            do {
                byFld += (byte)i21;
                i24 = 1;
                while (++i24 < 77) {
                    Test.instanceCount += -6L;
                    try {
                        iArrFld[i24 + 1] = (10900 % i24);
                        i22 = (i20 / -217);
                        i22 = (iArrFld[i23] / Test.iFld);
                    } catch (ArithmeticException a_e) {}
                    switch ((i24 % 6) + 59) {
                    case 59:
                        Test.instanceCount += 63607;
                        Test.instanceCount += (i24 ^ (long)Test.fFld);
                        break;
                    case 60:
                        if (Test.bFld) break;
                        Test.instanceCount = -7629;
                        try {
                            iArr1[i24 - 1] = (74 / iArrFld[i24]);
                            iArr1[i23 - 1] = (i23 % -110);
                            Test.iFld = (i24 % 199);
                        } catch (ArithmeticException a_e) {}
                        fArr1 = fArr1;
                        break;
                    case 61:
                        i22 = i23;
                        Test.sFld -= (short)Test.fFld;
                    case 62:
                        iArr1[i24 - 1] -= i23;
                        break;
                    case 63:
                        byArr = byArr;
                        break;
                    case 64:
                        i22 += i21;
                        break;
                    default:
                        Test.iFld = i20;
                    }
                }
            } while (++i23 < 328);
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
