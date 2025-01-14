package tests.javafuzzer1926;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 06:01:47 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-122L;
    public static byte byFld=114;
    public static volatile float fFld=-1.481F;
    public static volatile boolean bFld=false;
    public static volatile short sFld=-26964;
    public int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 0.451F);
    }

    public static long byMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(double d1) {

        int i6=-6582, i7=-151, i8=-48155, i9=-7, i10=175, i12=45469, i13=-22218, iArr[]=new int[N];
        float fArr1[]=new float[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(iArr, 14311);
        FuzzerUtils.init(fArr1, -2.688F);
        FuzzerUtils.init(byArr, (byte)-45);

        i6 *= (int)Test.instanceCount;
        for (i7 = 346; 20 < i7; i7 -= 3) {
            if (false) break;
            for (i9 = 14; i9 > 1; i9 -= 3) {
                i10 >>= i9;
                d1 -= i9;
            }
            Test.byFld += (byte)i7;
            for (i12 = 1; 14 > i12; ++i12) {
                i6 = i10;
                Test.fFld *= i8;
                i13 = i13;
                d1 += Test.byFld;
                if (true) {
                    Test.instanceCount = 3652367586312143626L;
                    i8 = (int)Test.instanceCount;
                } else if (Test.bFld) {
                    fArr1[i12 + 1] = i12;
                } else {
                    byArr[i7 + 1] <<= (byte)i6;
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d1) + i6 + i7 + i8 + i9 + i10 + i12 + i13 + FuzzerUtils.checkSum(iArr)
            + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + FuzzerUtils.checkSum(byArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        double d=-1.13771;
        int i2=-53910, i3=-29058, i4=-1, i5=50641, iArr1[]=new int[N];
        float fArr[]=new float[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(fArr, 13.782F);
        FuzzerUtils.init(lArr, 7379609863069985930L);
        FuzzerUtils.init(iArr1, 11);

        d %= ((-i2) | 1);
        for (i3 = 4; i3 < 218; i3 += 2) {
            if (true) {
                i4 += i3;
                i4 = (Math.min(i2, (int)(i4 + Test.instanceCount)) * i4);
                i5 = 1;
                while (++i5 < 15) {
                    if (i3 != 0) {
                    }
                    fArr[i3] -= ((iMeth1(d) + Test.byFld) * i5);
                    if (Test.bFld) continue;
                    Test.instanceCount += (i5 * i5);
                    if (true) {
                        lArr[i3 + 1] = Test.instanceCount;
                        iArr1[i3] *= i3;
                    }
                    Test.fFld *= i3;
                    i2 = (int)Test.instanceCount;
                }
            } else {
                i2 += (27 + (i3 * i3));
            }
        }
        long meth_res = Double.doubleToLongBits(d) + i2 + i3 + i4 + i5 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static byte byMeth() {

        int i1=56542, i14=2, i15=7, i16=-42899, i17=205, iArr2[]=new int[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-23873);
        FuzzerUtils.init(iArr2, -15845);

        i1 = iMeth();
        i1 += (int)Test.instanceCount;
        i14 = 1;
        while (++i14 < 178) {
            i15 = 1;
            do {
                sArr[i14 + 1] >>= (short)Test.instanceCount;
                switch ((i15 % 3) + 105) {
                case 105:
                    Test.instanceCount += 0;
                    i1 = (int)Test.instanceCount;
                    break;
                case 106:
                    Test.instanceCount = Test.sFld;
                    for (i16 = 1; 1 > i16; i16++) {
                        i1 *= i14;
                        i1 <<= -14;
                        i1 -= (int)Test.fFld;
                        i17 *= (int)179L;
                        iArr2[i16 + 1] += (int)Test.instanceCount;
                    }
                    break;
                case 107:
                    Test.instanceCount += (i15 | (long)Test.fFld);
                    break;
                default:
                    if (i14 != 0) {
                    }
                }
            } while (++i15 < 9);
        }
        long meth_res = i1 + i14 + i15 + i16 + i17 + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr2);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-140, i18=-2, i19=14, i20=17409, i21=49377, i22=-51, i23=14373, i24=-186, i25=223;
        double d2=-1.77130;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -14L);

        i += i;
        i -= byMeth();
        i18 = 1;
        while (++i18 < 394) {
            Test.instanceCount -= i;
            for (i19 = 1; 64 > i19; ++i19) {
                for (i21 = 1; i21 < 2; i21++) {
                    i20 >>= Test.sFld;
                    try {
                        i22 = (i21 / i19);
                        i20 = (307182938 / i19);
                        i22 = (i21 % i19);
                    } catch (ArithmeticException a_e) {}
                    lArr1[i19 - 1] -= (long)d2;
                    Test.fFld += i21;
                    Test.fFld += i19;
                    i <<= i21;
                    iArrFld[i19 - 1] += (int)d2;
                    i -= Test.sFld;
                    Test.fArrFld = Test.fArrFld;
                    Test.instanceCount += (i21 * i21);
                }
                for (i23 = 2; i23 > 1; i23 -= 2) {
                    Test.instanceCount += (i23 | Test.instanceCount);
                    i20 |= i19;
                    i22 *= i21;
                    i20 += (((i23 * Test.instanceCount) + i) - i);
                    i24 += (int)Test.instanceCount;
                    i24 += i19;
                    Test.fFld -= -236;
                    i22 = i22;
                }
                d2 -= -42563;
            }
            i25 = 1;
            while (++i25 < 64) {
                i24 *= i19;
                Test.fFld *= 49583;
                d2 = i25;
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
//DEBUG  byMeth ->  byMeth mainTest
//DEBUG  iMeth ->  iMeth byMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth byMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
