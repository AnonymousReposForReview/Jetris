package tests.javafuzzer1104;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 14:32:07 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-6228663756209770461L;
    public static int iFld=-3;
    public static boolean bFld=false;
    public short sFld=-21296;
    public static byte byArrFld[]=new byte[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)126);
        FuzzerUtils.init(Test.fArrFld, -1.303F);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;

    public static int iMeth2() {

        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -1.26156);

        for (double d3 : dArr) {
            Test.iFld = (int)Test.instanceCount;
        }
        Test.iFld |= (int)Test.instanceCount;
        long meth_res = Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth1(long l, double d) {

        double d1=-69.27274, d2=97.4139;
        int i1=3, i2=13, i3=14, iArr[]=new int[N];
        byte by=-79;
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr, 7);
        FuzzerUtils.init(sArr, (short)29317);

        for (d1 = 315; 1 < d1; --d1) {
            d2 = 1;
            do {
                for (i2 = 1; i2 > d2; i2--) {
                    Test.instanceCount = l;
                    i3 = iMeth2();
                    i3 = (int)Test.instanceCount;
                    iArr[(int)(d1)] += (int)l;
                    i3 = Test.iFld;
                    l += i2;
                    Test.iFld -= i3;
                    if (Test.bFld) {
                        by += (byte)(-53809 + (i2 * i2));
                        i3 += i2;
                        l += i2;
                    } else if (Test.bFld) {
                        l = Test.instanceCount;
                    } else if (Test.bFld) {
                        sArr[(int)(d1)] >>>= (short)i1;
                    }
                }
            } while (++d2 < 5);
        }
        long meth_res = l + Double.doubleToLongBits(d) + Double.doubleToLongBits(d1) + i1 + Double.doubleToLongBits(d2)
            + i2 + i3 + by + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(sArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        int i=19, i4=121, i5=-6720, i6=12449, i7=-214, i8=34161, i9=-60119, i10=0, i11=-2, iArr1[]=new int[N];
        double d4=1.12639;
        short s=31414;

        FuzzerUtils.init(iArr1, 52068);

        i &= (int)((iMeth1(Test.instanceCount, d4) - Test.instanceCount) + 35024);
        Test.bFld = Test.bFld;
        iArr1[(i >>> 1) % N] >>= -57167;
        i4 = 1;
        while (++i4 < 377) {
            for (i5 = 4; i5 > 1; i5 -= 2) {
                Test.byArrFld[i5 - 1] -= (byte)Test.instanceCount;
                s += (short)i5;
                i = i5;
                i6 += i5;
            }
            try {
                i6 = (iArr1[i4] % i6);
                Test.iFld = (-138 / Test.iFld);
                i6 = (i % Test.iFld);
            } catch (ArithmeticException a_e) {}
            switch ((i4 % 2) + 88) {
            case 88:
                for (i7 = 1; i7 < 4; ++i7) {
                    for (i9 = i7; i9 < 2; i9++) {
                        i6 += (-106 + (i9 * i9));
                        iArr1[i4 - 1] -= (int)d4;
                    }
                }
                break;
            case 89:
                i = i11;
            }
        }
        long meth_res = i + Double.doubleToLongBits(d4) + i4 + i5 + i6 + s + i7 + i8 + i9 + i10 + i11 +
            FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i12=5213, i13=-27038, i14=-68, i15=-12, i16=8760, i17=-6, i18=-12, i19=31202, i20=-14, i21=-8, iArr2[]=new
            int[N];
        double d5=-2.18030, d6=2.117028;
        long l1=1554834615L, lArr[]=new long[N];
        byte by1=102;

        FuzzerUtils.init(iArr2, 237);
        FuzzerUtils.init(lArr, 19485L);

        iMeth();
        for (i12 = 1; i12 < 128; i12++) {
            d5 += Test.instanceCount;
            switch ((i12 % 1) + 74) {
            case 74:
                iArr2 = iArr2;
                Test.iFld += i12;
                break;
            }
        }
        iArr2[(47181 >>> 1) % N] += i12;
        i14 = 1;
        do {
            Test.iFld = (int)-3309776128L;
            Test.fArrFld[i14] += i12;
            Test.instanceCount -= 64453;
            for (d6 = 190; d6 > 8; --d6) {
                d5 = -14;
            }
            i15 += (((i14 * sFld) + Test.instanceCount) - i12);
            i13 = i13;
        } while (++i14 < 132);
        i16 = 1;
        do {
            i15 += i16;
            for (i17 = 4; i17 < 190; i17++) {
                float f1=75.608F;
                i18 *= i18;
                iArr2[i16] = (int)f1;
                i18 += (((i17 * i15) + i13) - l1);
            }
            l1 += (((i16 * i16) + i18) - i18);
            by1 = (byte)-14300;
            Test.bFld = Test.bFld;
            lArr[i16 + 1] -= i16;
            for (i19 = 3; i19 < 190; i19++) {
                i18 >>= (int)l1;
                Test.iFld += (((i19 * i19) + sFld) - Test.instanceCount);
                i21 += (i19 * i19);
                i18 = -32;
            }
        } while (++i16 < 132);


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
//DEBUG  iMeth2 ->  iMeth2 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}