package tests.javafuzzer1878;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 05:12:36 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=9L;
    public static short sFld=496;
    public static boolean bFld=true;
    public static int iFld=-5;
    public volatile float fFld=0.327F;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -169L);
        FuzzerUtils.init(Test.iArrFld, 12);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(byte by) {

        int i4=12, i5=23290, i6=113, i7=25556, i8=-218, i9=-84, i10=-143;
        long l1=-132L;
        double d=-2.118761;

        i4 = 1;
        while (++i4 < 157) {
            for (i5 = 1; i5 < 10; ++i5) {
                Test.instanceCount += i5;
                i6 <<= -119;
                i6 <<= i5;
            }
        }
        for (i7 = 8; 395 > i7; i7 += 3) {
            Test.iArrFld = Test.iArrFld;
        }
        i8 = i5;
        Test.instanceCount = 0L;
        for (i9 = 315; i9 > 3; i9 -= 3) {
            i8 += i9;
            l1 = 1;
            do {
                i6 *= i7;
                d -= i6;
                i8 *= 71;
            } while (++l1 < 15);
        }
        vMeth2_check_sum += by + i4 + i5 + i6 + i7 + i8 + i9 + i10 + l1 + Double.doubleToLongBits(d);
    }

    public static void vMeth1(int i1, int i2, int i3) {

        byte by1=-29;
        long l2=-1L;
        int i11=9, i12=-11, i13=41424, i14=-11;
        double d1=115.12164;
        boolean b1=false;
        float f=25.731F;

        i2 += (int)(Math.sqrt(i3 + i3) * (Math.max(i1, i3) - Math.abs(2.892F)));
        Test.lArrFld[(-13 >>> 1) % N] -= (Math.max(i3 - i1, 0 + (--Test.sFld)) + -19843);
        vMeth2(by1);
        for (l2 = 3; 176 > l2; l2 += 3) {
            d1 -= by1;
            i12 = 1;
            do {
                i11 += i3;
                for (i13 = 1; 1 > i13; i13++) {
                    Test.instanceCount <<= -4376952201068442961L;
                    Test.lArrFld = Test.lArrFld;
                    i14 /= (int)(Test.sFld | 1);
                    Test.instanceCount += (i13 - l2);
                    i3 >>= (int)Test.instanceCount;
                    if (b1) break;
                    f += ((long)i13 | (long)Test.instanceCount);
                }
            } while (++i12 < 27);
        }
        vMeth1_check_sum += i1 + i2 + i3 + by1 + l2 + i11 + Double.doubleToLongBits(d1) + i12 + i13 + i14 + (b1 ? 1 :
            0) + Float.floatToIntBits(f);
    }

    public static void vMeth(long l, boolean b, int i) {


        vMeth1(i, i, i);
        i -= i;
        vMeth_check_sum += l + (b ? 1 : 0) + i;
    }

    public void mainTest(String[] strArr1) {

        long l3=531550380L;
        float f1=-1.149F;
        int i15=36, i16=158, i17=225, i18=94, i19=229;
        boolean b2=false;
        double d2=2.42357;

        vMeth(l3, Test.bFld, Test.iFld);
        Test.iFld += (int)fFld;
        for (f1 = 12; f1 < 388; ++f1) {
            switch ((int)(((f1 % 2) * 5) + 117)) {
            case 122:
                Test.iArrFld = Test.iArrFld;
                for (i16 = 3; 67 > i16; ++i16) {
                    for (i18 = 1; i18 < 2; i18++) {
                        if (b2) break;
                        Test.instanceCount += i16;
                        switch ((((i15 >>> 1) % 5) * 5) + 67) {
                        case 88:
                            i15 += 7;
                            switch (((i16 % 1) * 5) + 84) {
                            case 87:
                                d2 = i18;
                                Test.iArrFld = Test.iArrFld;
                                break;
                            default:
                                Test.sFld += (short)i18;
                                fFld += (i18 * i18);
                                Test.iArrFld[i18 + 1] |= Test.sFld;
                                i17 += Test.iFld;
                            }
                            i17 += i16;
                            break;
                        case 76:
                            i15 -= Test.sFld;
                            l3 -= i19;
                            i19 = 50720;
                            break;
                        case 87:
                            i19 = (int)l3;
                            i15 >>= Test.iFld;
                            b2 = b2;
                        case 86:
                        case 68:
                            i19 *= i15;
                            Test.iArrFld[(int)(f1 - 1)] = Test.iFld;
                            Test.iFld -= i15;
                            break;
                        default:
                            i15 += i18;
                        }
                        if (b2) continue;
                    }
                }
            case 119:
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
