package tests.javafuzzer193;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 23:49:14 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=5144442149432081018L;
    public static boolean bFld=true;
    public static byte byFld=28;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 2);
    }

    public static long vMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i9) {

        int i10=-35786, i11=-40814, i12=-20634, i13=220, iArr1[]=new int[N];
        long l=-8648424902174346912L;
        float f1=-67.525F;

        FuzzerUtils.init(iArr1, -13683);

        i10 = 1;
        while (++i10 < 203) {
            i9 = i9;
            for (i11 = 1; i11 < 8; ++i11) {
                iArr1[i10] *= 10;
                i13 = 1;
                while (++i13 < 2) {
                    Test.bFld = Test.bFld;
                }
                if (Test.bFld) {
                    l = 1;
                    do {
                        i9 -= (int)Test.instanceCount;
                        i9 %= -11;
                        i9 += (int)l;
                        Test.instanceCount = l;
                        Test.instanceCount = i11;
                    } while (++l < 2);
                    Test.instanceCount *= Test.instanceCount;
                    iArr1[i10 + 1] *= 44376;
                } else if (Test.bFld) {
                    f1 += (i11 * i11);
                } else {
                    i9 = i10;
                }
            }
        }
        vMeth1_check_sum += i9 + i10 + i11 + i12 + i13 + l + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr1);
    }

    public static boolean bMeth() {

        int i14=-5;
        float f2=-1.179F;

        vMeth1(i14);
        i14 -= Test.byFld;
        i14 *= i14;
        Test.instanceCount += (long)f2;
        i14 >>= (int)Test.instanceCount;
        long meth_res = i14 + Float.floatToIntBits(f2);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void vMeth(float f, int i2) {

        int i3=17027, i4=211, i5=-11, i6=57037, i7=103, i8=14, i15=46, iArr[]=new int[N];
        short s=27698;
        double d=127.43790;

        FuzzerUtils.init(iArr, 42);

        for (i3 = 6; i3 < 133; i3++) {
            s += (short)(i4 += Math.min((int)(Test.instanceCount + f), iArr[i3 + 1]));
            for (i5 = 12; i5 > 1; --i5) {
                for (i7 = 1; i7 < 2; i7++) {
                    if (iArr[i3 + 1] != Integer.reverseBytes(i2--)) break;
                    iArr[(i5 >>> 1) % N] <<= (int)Test.instanceCount;
                    iArr = iArr;
                    i6 += -59;
                }
                if (Test.bFld = bMeth()) break;
                try {
                    iArr[i5 - 1] = (41521 % i6);
                    i8 = (i8 % 127);
                    i8 = (10682 % i6);
                } catch (ArithmeticException a_e) {}
                for (d = i3; d < 2; ++d) {
                    Test.instanceCount = i6;
                    Test.bFld = Test.bFld;
                    i4 -= i15;
                    f += (float)(((d * Test.instanceCount) + i2) - Test.instanceCount);
                }
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i2 + i3 + i4 + s + i5 + i6 + i7 + i8 + Double.doubleToLongBits(d)
            + i15 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i=3, i1=-52361, i16=10, i17=-33393, i18=-158, i19=10, i20=-159, i21=14, i22=-9;
        float f3=37.182F;
        double d2=0.15683;
        short s1=-13426;

        for (i = 10; i < 209; ++i) {
            vMeth(38.89F, i);
        }
        i16 = 1;
        while (++i16 < 242) {
            for (i17 = 104; i17 > 3; i17--) {
                double d1=-27.85356;
                if (Test.bFld) {
                    Test.instanceCount -= i17;
                    d1 -= i;
                } else if (Test.bFld) {
                    i1 += (92 + (i17 * i17));
                } else {
                    for (i19 = 1; i19 < 2; ++i19) {
                        i20 = i16;
                        f3 += i;
                        Test.instanceCount &= Test.instanceCount;
                        i1 += (int)-3L;
                        f3 += (((i19 * i18) + i16) - i18);
                        i18 += i19;
                        d2 *= i17;
                    }
                    i21 = (int)Test.instanceCount;
                    i20 = (int)Test.instanceCount;
                    Test.instanceCount = i19;
                }
                i22 = 2;
                do {
                    Test.iArrFld[i16] >>>= -168;
                    if (Test.bFld) {
                        s1 = (short)i17;
                        f3 -= f3;
                        i1 = (int)Test.instanceCount;
                    } else {
                        i20 &= 9309;
                    }
                    i1 = i;
                    i1 -= (int)Test.instanceCount;
                } while (--i22 > 0);
            }
            i20 = -7;
            Test.instanceCount += i16;
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
//DEBUG  bMeth ->  bMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 bMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
