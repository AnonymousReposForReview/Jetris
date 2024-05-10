package tests.javafuzzer1958;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 06:30:38 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=366702682L;
    public static int iFld=12;
    public static byte byFld=101;
    public static boolean bFld=false;
    public static volatile int iArrFld[]=new int[N];
    public static volatile float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 2);
        FuzzerUtils.init(Test.fArrFld, 1.415F);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(double d) {

        int i3=12, i4=15868;
        long l1=227201219L;

        Test.iFld = Test.iFld;
        Test.iFld /= (int)(Test.iFld | 1);
        for (i3 = 17; i3 < 277; i3++) {
            l1 |= i3;
            Test.iFld -= Test.byFld;
            i4 %= (int)(Test.iFld | 1);
        }
        i4 += i3;
        vMeth_check_sum += Double.doubleToLongBits(d) + i3 + i4 + l1;
    }

    public static int iMeth1(int i, int i1, int i2) {

        double d1=-2.72337;

        i <<= (int)(((Test.instanceCount * i1) * (i - i)) - ((i--) + (i = i1)));
        vMeth(d1);
        Test.iFld >>= (int)Test.instanceCount;
        Test.instanceCount = i2;
        Test.iArrFld[(10 >>> 1) % N] -= i1;
        long meth_res = i + i1 + i2 + Double.doubleToLongBits(d1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(long l, float f) {

        double d2=57.108561;
        int i6=16852, i7=-10692, i8=-225;

        l += (((-iMeth1(-12, 183, Test.iFld)) * Test.iFld) + Test.iFld);
        Test.iFld *= (int)d2;
        Test.iFld = Test.iFld;
        Test.iArrFld[(Test.iFld >>> 1) % N] = (int)f;
        Test.fArrFld = Test.fArrFld;
        Test.byFld &= (byte)Test.iFld;
        for (int i5 : Test.iArrFld) {
            for (i6 = 4; i6 > 1; i6 -= 3) {
                if (false) break;
                i7 += (i6 ^ Test.instanceCount);
                switch ((((i6 >>> 1) % 1) * 5) + 126) {
                case 129:
                    i8 += -8;
                    break;
                default:
                    i5 ^= 211;
                    i5 = Test.iFld;
                }
                Test.iFld += (((i6 * i5) + i5) - Test.iFld);
            }
        }
        long meth_res = l + Float.floatToIntBits(f) + Double.doubleToLongBits(d2) + i6 + i7 + i8;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f1=-1.668F, f2=-2.858F;
        int i9=-4, i10=40792, i11=38884, i12=-38640, i13=21384, i14=-18862, i15=-2;
        double d3=1.76590;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 503293512514434972L);

        Test.instanceCount = (long)((Test.instanceCount * iMeth(Test.instanceCount, f1)) * f1);
        Test.instanceCount = 235;
        if (Test.bFld) {
            Test.iFld ^= Test.iFld;
            for (i9 = 14; i9 < 228; i9++) {
                for (i11 = 6; i11 < 117; ++i11) {
                    f1 += Test.instanceCount;
                    Test.iArrFld[i11] = (int)Test.instanceCount;
                    i13 = 1;
                    while (++i13 < 2) {
                        Test.instanceCount += i13;
                        i12 += (-49456 + (i13 * i13));
                    }
                    i12 *= (int)Test.instanceCount;
                    i14 = 1;
                    do {
                        d3 = 35.454F;
                        Test.iFld = i12;
                        lArr[i14] >>= 3142941087L;
                        Test.bFld = Test.bFld;
                        Test.instanceCount += (-227 + (i14 * i14));
                        Test.fArrFld[i14 - 1] -= -20917;
                        i10 = i15;
                        switch (((i14 % 10) * 5) + 73) {
                        case 92:
                            switch (((i11 % 1) * 5) + 108) {
                            case 111:
                            }
                            try {
                                i12 = (i13 % -31413);
                                Test.iFld = (i13 / 243);
                                i15 = (i14 / 74);
                            } catch (ArithmeticException a_e) {}
                            Test.iArrFld[i14 - 1] = Test.byFld;
                            i15 = 8590;
                            break;
                        case 113:
                            Test.instanceCount = Test.instanceCount;
                            Test.byFld += (byte)i14;
                            f1 += (i14 - i15);
                            i15 = (int)f1;
                            break;
                        case 102:
                            i12 >>>= i12;
                            break;
                        case 104:
                            i15 += Test.byFld;
                            break;
                        case 103:
                            i15 += i11;
                        case 78:
                            if (false) break;
                            break;
                        case 107:
                            lArr[i9] = Test.iFld;
                            break;
                        case 95:
                            i15 += Test.byFld;
                        case 120:
                            f2 -= i11;
                            break;
                        case 123:
                            if (true) continue;
                            break;
                        }
                    } while (++i14 < 2);
                }
            }
        } else if (true) {
            i15 = 61644;
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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
