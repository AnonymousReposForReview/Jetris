package tests.javafuzzer2135;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 09:20:34 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-220L;
    public static volatile float fFld=9.37F;
    public static boolean bFld=true;
    public static double dFld=1.83399;
    public static int iFld=-6150;
    public static volatile int iArrFld[]=new int[N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 83);
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i10) {

        byte by=33;
        int i11=23132, i12=-123, i13=-26, i14=-11154, i15=-630;
        float f=58.379F;
        boolean b=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 5566977979150991123L);

        by ^= (byte)i10;
        for (i11 = 14; i11 < 279; ++i11) {
            if (b) {
                i12 = (int)Test.instanceCount;
                f = i11;
                i13 = 1;
                do {
                    f += i10;
                    Test.instanceCount -= -19649;
                    i12 <<= i12;
                    Test.instanceCount += (((i13 * i10) + Test.instanceCount) - i10);
                    if (b) break;
                    lArr[i13] <<= i11;
                    for (i14 = 1; 1 > i14; i14++) {
                        f *= Test.instanceCount;
                        if (i13 != 0) {
                            vMeth1_check_sum += i10 + by + i11 + i12 + Float.floatToIntBits(f) + i13 + (b ? 1 : 0) +
                                i14 + i15 + FuzzerUtils.checkSum(lArr);
                            return;
                        }
                    }
                } while (++i13 < 6);
            } else if (false) {
                if (true) continue;
            } else {
                Test.instanceCount += i11;
            }
        }
        vMeth1_check_sum += i10 + by + i11 + i12 + Float.floatToIntBits(f) + i13 + (b ? 1 : 0) + i14 + i15 +
            FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i7, int i8, int i9) {

        int i17=-22255, i18=-2521, i19=9, i20=-8052;
        short s=19157;
        float f1=-1.258F;
        double d=-42.68246;

        vMeth1(i7);
        for (int i16 : Test.iArrFld) {
            i8 = i8;
            for (i17 = 1; i17 < 4; i17++) {
                switch ((i17 % 2) + 19) {
                case 19:
                    i16 -= -62576;
                    s = (short)Test.instanceCount;
                    i7 = (int)Test.instanceCount;
                case 20:
                    for (i19 = 1; 2 > i19; ++i19) {
                        i7 += (((i19 * f1) + i8) - i8);
                        Test.iArrFld[i17] &= i7;
                        i20 += (((i19 * i16) + i7) - i18);
                        Test.instanceCount >>>= -28L;
                        d = Test.instanceCount;
                        i20 = i7;
                    }
                }
            }
        }
        vMeth_check_sum += i7 + i8 + i9 + i17 + i18 + s + i19 + i20 + Float.floatToIntBits(f1) +
            Double.doubleToLongBits(d);
    }

    public static int iMeth(long l, int i1, int i2) {

        int i3=-10, i4=10, i5=45731, i6=-11, i21=-30740, i22=-213;
        double d1=1.24222;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -150L);

        for (i3 = 2; i3 < 151; i3++) {
            for (i5 = 1; i5 < 11; i5++) {
                vMeth(-226, i6, i3);
                for (i21 = 1; i21 < 2; ++i21) {
                    Test.fFld *= i3;
                    switch ((((i1 >>> 1) % 7) * 5) + 34) {
                    case 37:
                        i6 += i21;
                        break;
                    case 47:
                        d1 += i2;
                        break;
                    case 63:
                        if (Test.bFld) {
                            lArr1[i3 - 1] *= (long)d1;
                            i2 += (int)(-1.351F + (i21 * i21));
                            Test.iArrFld[i3 + 1] >>= i3;
                            Test.fFld -= i22;
                        } else {
                            i22 *= -12;
                        }
                        i2 += -60;
                        break;
                    case 46:
                        i4 += (((i21 * i4) + l) - Test.fFld);
                        break;
                    case 49:
                        d1 *= i6;
                        break;
                    case 58:
                        i6 ^= i3;
                    case 57:
                        l -= -18434;
                        break;
                    default:
                        Test.fFld = Test.instanceCount;
                    }
                }
            }
        }
        long meth_res = l + i1 + i2 + i3 + i4 + i5 + i6 + i21 + i22 + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=24410, i23=216, i24=-18243, i25=-9, i26=-14, i27=-175, i28=47;
        byte by1=54, byArr[]=new byte[N];
        short s1=25761;
        long lArr2[]=new long[N];

        FuzzerUtils.init(lArr2, -11L);
        FuzzerUtils.init(byArr, (byte)34);

        Test.instanceCount += (long)((-(36.20998 % ((Test.instanceCount - i) | 1))) * ((i - 2.3F) -
            Long.reverseBytes(Test.instanceCount)));
        iMeth(Test.instanceCount, 29607, i);
        for (i23 = 2; i23 < 135; ++i23) {
            if (Test.bFld) {
                lArr2[i23] += Test.instanceCount;
                Test.instanceCount -= i23;
                i += (i23 * i23);
            } else {
                Test.bArrFld[i23 + 1] = Test.bFld;
                Test.instanceCount -= -3470596106230206313L;
                Test.fFld *= (float)Test.dFld;
                for (i25 = 3; i25 < 188; ++i25) {
                    for (i27 = 1; i27 < 2; i27++) {
                        Test.instanceCount *= Test.instanceCount;
                        i = i28;
                        i28 = (int)Test.fFld;
                        byArr[i23] >>= (byte)i23;
                        by1 = (byte)i23;
                        i28 += (int)(73.1018F + (i27 * i27));
                        Test.instanceCount *= -58;
                        Test.instanceCount = s1;
                        Test.dFld = i24;
                        if (Test.bFld) break;
                    }
                    i = Test.iFld;
                    Test.dFld = 0;
                    Test.instanceCount += (i25 + i27);
                    Test.dFld -= i23;
                }
            }
            if (Test.bFld) break;
            Test.iArrFld[i23 + 1] = (int)Test.instanceCount;
            by1 = (byte)Test.iFld;
            i24 += (int)Test.instanceCount;
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
