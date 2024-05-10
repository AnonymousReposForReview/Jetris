package tests.javafuzzer899;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 11:25:01 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=22L;
    public static int iFld=44317;
    public static volatile byte byFld=101;
    public short sFld=18265;
    public static int iArrFld[]=new int[N];
    public static volatile short sArrFld[]=new short[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 53451);
        FuzzerUtils.init(Test.sArrFld, (short)-2639);
        FuzzerUtils.init(Test.lArrFld, 3L);
    }

    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i5, int i6, long l) {

        int i7=-170, i8=188, i9=11, i10=-38;
        byte byArr[]=new byte[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(byArr, (byte)52);
        FuzzerUtils.init(lArr, 29L);

        for (i7 = 17; i7 < 364; ++i7) {
            i5 >>>= (int)Test.instanceCount;
            l += (((i7 * Test.iFld) + l) - l);
            i8 -= (int)Test.instanceCount;
            i6 += (i7 * i7);
            i5 -= (int)l;
            i6 = i7;
        }
        byArr[(16003 >>> 1) % N] = (byte)Test.instanceCount;
        for (i9 = 15; i9 < 380; i9++) {
            l = i8;
            i10 -= i6;
            lArr[i9 - 1] = i6;
            Test.instanceCount += (i9 | i6);
        }
        Test.iArrFld[(-11 >>> 1) % N] |= i6;
        Test.sArrFld[(33974 >>> 1) % N] = (short)40;
        long meth_res = i5 + i6 + l + i7 + i8 + i9 + i10 + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(lArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(boolean b) {

        int i11=-10, i12=-11, i13=5, i14=-96, i15=-80, i16=-47087, iArr[]=new int[N];
        double d1=0.128258;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(iArr, -13);

        Test.iFld *= iMeth1(i11, i11, Test.instanceCount);
        i12 = 1;
        do {
            Test.iFld += (i12 * i12);
            Test.iFld *= (int)-199L;
            for (i13 = 1; i13 < 5; ++i13) {
                switch ((i13 % 1) + 21) {
                case 21:
                    d1 = i11;
                    break;
                }
                bArr[i12 - 1] = b;
                Test.instanceCount += 32752;
                for (i15 = 1; i15 < 2; i15++) {
                    Test.iArrFld[i13 - 1] &= 52779;
                    iArr[(i15 >>> 1) % N] %= (int)((long)(d1) | 1);
                    Test.iFld += (i15 * i15);
                    i14 += (i15 + Test.byFld);
                    i16 <<= i14;
                }
            }
        } while (++i12 < 366);
        long meth_res = (b ? 1 : 0) + i11 + i12 + i13 + i14 + Double.doubleToLongBits(d1) + i15 + i16 +
            FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(int i, int i1, int i2) {

        int i3=9, i4=-1, i17=0, i18=11565, i19=-165, i20=-19310, i21=47872;
        double d=5.51306;
        boolean b1=true;
        long l1=150L;

        for (i3 = 5; i3 < 238; ++i3) {
            Test.instanceCount = (long)((d = iMeth(b1)) - 4830455811448349440L);
            Test.instanceCount >>= 5023969745535668234L;
            i1 -= 42;
            for (l1 = 1; l1 < 7; ++l1) {
                i1 = i3;
                try {
                    i17 = (i17 % -78);
                    i2 = (i1 % Test.iFld);
                    Test.iFld = (-1406743598 % i2);
                } catch (ArithmeticException a_e) {}
            }
            i1 += i4;
            for (i18 = i3; 7 > i18; ++i18) {
                Test.instanceCount = -5L;
                for (i20 = 1; 1 < i20; --i20) {
                    Test.iArrFld[i18 - 1] >>>= (int)l1;
                }
                Test.iFld = i;
                d = -7820597204133838170L;
                Test.instanceCount = l1;
            }
        }
        long meth_res = i + i1 + i2 + i3 + i4 + Double.doubleToLongBits(d) + (b1 ? 1 : 0) + l1 + i17 + i18 + i19 + i20
            + i21;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i22=3, i23=-215, i24=145, i25=42474;
        float f=0.85F, fArr[]=new float[N];
        long l2=-5054012288795786596L;
        boolean b2=false;
        double d2=-2.56475, dArr[]=new double[N];

        FuzzerUtils.init(fArr, 37.845F);
        FuzzerUtils.init(dArr, 2.47062);

        Test.iFld = Test.iFld;
        lMeth(Test.iFld, Test.iFld, Test.iFld);
        Test.iArrFld[(Test.iFld >>> 1) % N] |= 2;
        Test.iArrFld[(-14 >>> 1) % N] = Test.iFld;
        i22 = 1;
        while ((i22 += 2) < 128) {
            Test.instanceCount -= Test.instanceCount;
            try {
                Test.iFld = (Test.iFld % -100);
                Test.iFld = (-1163452259 / i22);
                Test.iArrFld[i22 - 1] = (i22 / i22);
            } catch (ArithmeticException a_e) {}
            switch (((i22 >>> 1) % 7) + 121) {
            case 121:
                fArr[i22 + 1] = Test.iFld;
                Test.instanceCount <<= Test.instanceCount;
                f -= i22;
            case 122:
                Test.iArrFld[i22 - 1] = i22;
                dArr[i22 - 1] = i22;
                break;
            case 123:
                switch (((i22 >>> 1) % 2) + 26) {
                case 26:
                    Test.lArrFld = Test.lArrFld;
                    Test.instanceCount *= Test.instanceCount;
                    break;
                case 27:
                    Test.instanceCount += (((i22 * Test.instanceCount) + Test.instanceCount) - Test.iFld);
                    Test.iFld += (i22 | Test.byFld);
                    break;
                }
                for (i23 = 24; i23 < 391; i23++) {
                    Test.instanceCount = i24;
                    Test.iFld -= 4842;
                    Test.byFld *= (byte)Test.instanceCount;
                    i24 += -12210;
                    fArr[i22 - 1] = -2655842165810696795L;
                    Test.iFld = i23;
                    for (l2 = 1; 2 > l2; ++l2) {
                        i24 -= i25;
                        i24 *= i23;
                    }
                    Test.iFld = i22;
                    if (b2) break;
                }
                break;
            case 124:
            case 125:
                f = i22;
                break;
            case 126:
                if (true) continue;
                break;
            case 127:
                d2 += i23;
                break;
            default:
                sFld = (short)8;
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}