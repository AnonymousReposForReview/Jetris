package tests.javafuzzer1195;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 16:22:07 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=63425L;
    public int iFld=12;
    public static short sFld=-4978;
    public static int iFld1=-8781;
    public static volatile float fFld=2.961F;
    public static boolean bFld=false;
    public static int iFld2=-10;
    public static double dFld=-2.60063;
    public static volatile int iArrFld[]=new int[N];
    public volatile double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -19840);
    }

    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(long l2) {

        double d3=-1.6030;
        byte by=77;

        Test.iArrFld[(-128 >>> 1) % N] <<= (int)Test.instanceCount;
        Test.iArrFld[(-28 >>> 1) % N] <<= Test.iFld1;
        Test.iArrFld[(Test.iFld1 >>> 1) % N] = Test.iFld1;
        Test.iArrFld[(Test.iFld1 >>> 1) % N] = Test.iFld1;
        for (int i8 : Test.iArrFld) {
            Test.iArrFld[(i8 >>> 1) % N] >>= -4369;
            l2 *= (long)d3;
            by = (byte)Test.iFld1;
            Test.iFld1 = (int)Test.instanceCount;
            try {
                i8 = (Test.iFld1 % 137);
                Test.iFld1 = (Test.iFld1 % Test.iFld1);
                i8 = (81 % Test.iFld1);
            } catch (ArithmeticException a_e) {}
        }
        Test.iArrFld[(Test.iFld1 >>> 1) % N] *= Test.iFld1;
        Test.iFld1 -= (int)-58.10394;
        Test.fFld += Test.fFld;
        vMeth_check_sum += l2 + Double.doubleToLongBits(d3) + by;
    }

    public static long lMeth(int i5) {

        int i6=172, i7=11, i10=43089, i11=46493, i12=-14, i13=1, i14=-24260, i15=13;

        for (i6 = 1; i6 < 338; i6++) {
            vMeth(Test.instanceCount);
            i7 <<= i5;
            Test.iFld1 += (i6 * Test.iFld1);
            Test.sFld &= (short)-5;
            if (Test.bFld) break;
            for (i10 = i6; 5 > i10; ++i10) {
                i5 *= Test.iFld1;
                i11 += (i10 ^ Test.iFld2);
                for (i12 = 1; i12 < 1; i12++) {
                    i5 += (i12 * i12);
                }
                for (i14 = 1; i14 < 1; i14++) {
                    i11 += (int)Test.dFld;
                    Test.dFld += i15;
                    i13 += (i14 ^ i13);
                }
            }
        }
        long meth_res = i5 + i6 + i7 + i10 + i11 + i12 + i13 + i14 + i15;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public int iMeth(long l, float f) {

        double d1=-15.8659, d2=83.71724;
        long l1=-47800109886854662L;
        int i2=-11, i3=14, i4=13;
        boolean b=false;
        byte by1=15;

        iFld = ((Integer.reverseBytes(iFld) + (Test.sFld * iFld)) + (-(14 + iFld)));
        switch ((((((int)(-57067 + (d1 * -86))) >>> 1) % 6) * 5) + 91) {
        case 116:
            l1 = 1;
            do {
                iFld <<= (int)(Long.reverseBytes(l++) - -221L);
                for (i2 = 1; i2 < 8; ++i2) {
                    iFld = i3;
                    f += (-11 + (i2 * i2));
                    i3 += iFld;
                    for (d2 = 2; d2 > 1; --d2) {
                        b = (i2 != (i4++));
                        Test.instanceCount = (long)((--iFld) - ((f - i3) - i3));
                        switch ((int)((d2 % 1) + 117)) {
                        case 117:
                            i4 *= 6;
                            break;
                        default:
                            if (b = true) continue;
                            i3 -= Math.abs(iFld -= i3);
                        }
                    }
                }
            } while (++l1 < 193);
            break;
        case 115:
            f -= ((iFld--) * (Math.abs(Test.iFld1) << lMeth(i3)));
            break;
        case 97:
            i3 *= i3;
        case 108:
        case 92:
            by1 &= (byte)iFld;
            break;
        case 106:
            Test.iFld1 = iFld;
            break;
        default:
            dArrFld[(i3 >>> 1) % N] += d2;
        }
        long meth_res = l + Float.floatToIntBits(f) + Double.doubleToLongBits(d1) + l1 + i2 + i3 +
            Double.doubleToLongBits(d2) + i4 + (b ? 1 : 0) + by1;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-3, i16=14, i17=-53, i18=7, i19=-177, i20=56, i21=-46812, i22=3, i23=48807, i24=16179, i25=3705;
        double d=0.108005;
        boolean b1=false;
        long l3=-1055L, lArr[]=new long[N];

        FuzzerUtils.init(lArr, -340040343962219494L);

        i = (int)(d * ((i++) - (i * -46)));
        for (int i1 : Test.iArrFld) {
            i = (i1++);
            iMeth(-3850161184431945952L, Test.fFld);
            i16 = 1;
            do {
                Test.fFld = Test.iFld2;
                i *= (int)Test.fFld;
                iFld >>= Test.iFld2;
                Test.iArrFld[i16] -= Test.iFld1;
                lArr[i16] = -35247L;
                for (i17 = 1; i17 < 1; i17++) {
                    Test.fFld = Test.sFld;
                    Test.iArrFld[i16 - 1] -= Test.iFld1;
                    Test.bFld = b1;
                    iFld = Test.iFld2;
                    Test.iFld1 *= i18;
                    Test.instanceCount += (i17 * i17);
                    iFld -= (int)Test.instanceCount;
                    Test.sFld = (short)Test.iFld2;
                    Test.instanceCount += (-42 + (i17 * i17));
                }
            } while (++i16 < 63);
            Test.sFld >>= (short)Test.instanceCount;
            Test.iFld2 = Test.iFld2;
            for (i19 = 2; i19 < 63; i19++) {
                if (Test.bFld) break;
            }
            for (i21 = 3; i21 < 63; ++i21) {
                Test.instanceCount -= (long)Test.fFld;
            }
            for (l3 = 3; 63 > l3; l3++) {
                for (i24 = (int)(l3); i24 < 2; ++i24) {
                    i20 += i24;
                    b1 = true;
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
//DEBUG  lMeth ->  lMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
