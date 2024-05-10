package tests.javafuzzer1270;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 17:34:27 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2220659978L;
    public int iFld=-16623;
    public static volatile float fFld=-2.553F;
    public static short sFld=6985;
    public static double dFld=31.23325;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 8482670128793809427L);
        FuzzerUtils.init(Test.iArrFld, 7);
    }

    public static long lMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(long l, long l1) {

        int i5=10, i6=151, i7=28105, iArr[]=new int[N];

        FuzzerUtils.init(iArr, -34248);

        i5 = i5;
        iArr[(i5 >>> 1) % N] += i5;
        i5 -= (int)14L;
        Test.fFld = i5;
        Test.sFld = (short)l;
        Test.fFld = i5;
        for (i6 = 21; i6 < 398; i6++) {
            iArr[i6 + 1] -= i7;
            i7 += (i6 ^ i6);
            Test.fFld = i7;
            i5 = (int)l1;
            Test.fFld -= l;
        }
        Test.lArrFld[(i5 >>> 1) % N] += (long)Test.fFld;
        i5 = i5;
        i7 += -13;
        vMeth_check_sum += l + l1 + i5 + i6 + i7 + FuzzerUtils.checkSum(iArr);
    }

    public static long lMeth1(float f2, int i2) {

        int i3=-1, i4=-192, i8=-3, i9=14, i10=184, i11=-12, iArr1[]=new int[N];
        short sArr[]=new short[N];
        double dArr[]=new double[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(sArr, (short)-31245);
        FuzzerUtils.init(dArr, -2.101683);
        FuzzerUtils.init(fArr, -78.179F);
        FuzzerUtils.init(iArr1, 3);

        for (i3 = 15; 252 > i3; i3 += 3) {
            i4 += (int)(5L + (i3 * i3));
            vMeth(Test.instanceCount, Test.instanceCount);
            Test.instanceCount += i3;
            Test.fFld *= Test.fFld;
            for (i8 = 1; i8 < 19; i8++) {
                sArr[i8 - 1] += (short)i9;
                dArr = dArr;
                i9 += -177;
                Test.instanceCount = i4;
            }
            Test.sFld += (short)(i3 + i9);
            Test.dFld = i2;
        }
        for (i10 = 1; i10 < 158; ++i10) {
            fArr = fArr;
            try {
                i2 = (11426 / i10);
                i11 = (i9 / -93);
                iArr1[i10 - 1] = (-236 / i10);
            } catch (ArithmeticException a_e) {}
        }
        long meth_res = Float.floatToIntBits(f2) + i2 + i3 + i4 + i8 + i9 + i10 + i11 + FuzzerUtils.checkSum(sArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(iArr1);
        lMeth1_check_sum += meth_res;
        return (long)meth_res;
    }

    public static long lMeth(int i, int i1, float f1) {

        int i12=49, i13=-16969, i14=-54353, i15=-3;

        i1 += (i++);
        Test.lArrFld[(i >>> 1) % N] -= (i = (int)((i1 >>>= (int)Test.instanceCount) >> (i + -2)));
        lMeth1(f1, i);
        i12 = 1;
        while (++i12 < 196) {
            i += (i12 * i12);
            Test.lArrFld = Test.lArrFld;
            Test.iArrFld[i12 + 1] += 20866;
            i1 += 7359;
            switch ((((-177 >>> 1) % 2) * 5) + 101) {
            case 105:
                for (i13 = 1; 8 > i13; ++i13) {
                    Test.iArrFld[i13] /= (int)(i | 1);
                    Test.iArrFld[i13] *= (int)Test.dFld;
                    Test.lArrFld[i12] %= (Test.instanceCount | 1);
                }
                f1 = i1;
                Test.iArrFld[(i15 >>> 1) % N] -= (int)Test.instanceCount;
                break;
            case 102:
                Test.iArrFld[i12 + 1] -= (int)91.96869;
                break;
            default:
                Test.sFld &= (short)Test.instanceCount;
            }
        }
        long meth_res = i + i1 + Float.floatToIntBits(f1) + i12 + i13 + i14 + i15;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f=-2.1008F;
        int i16=45563, i17=189, i18=7, i19=20596, i20=-30673, i21=-10, i22=136, i23=7, i24=13, i25=-13;
        boolean b=true;
        short sArr1[]=new short[N];

        FuzzerUtils.init(sArr1, (short)-12565);

        iFld += (int)f;
        lMeth(56097, iFld, Test.fFld);
        i16 = 1;
        do {
            iFld += i16;
        } while (++i16 < 291);
        for (i17 = 6; i17 < 167; ++i17) {
            for (i19 = 4; i19 < 156; i19++) {
                iFld |= i18;
                for (i21 = 1; i21 < 2; ++i21) {
                    Test.iArrFld[(-2 >>> 1) % N] -= iFld;
                }
                if (b) break;
                switch ((i19 % 2) + 92) {
                case 92:
                    i20 = iFld;
                case 93:
                    if (true) {
                        i23 = 1;
                        while (++i23 < 2) {
                            byte by=13;
                            i20 &= 6;
                            i22 = (int)Test.instanceCount;
                            sArr1[i23 - 1] *= (short)84;
                            i20 = 4;
                            Test.iArrFld[i23] = 13912;
                            by += (byte)-227;
                            Test.instanceCount += iFld;
                            Test.instanceCount -= (long)f;
                            i18 -= i21;
                        }
                        for (i24 = i19; i24 < 2; ++i24) {
                            Test.dFld += iFld;
                        }
                        b = b;
                    }
                    Test.instanceCount *= i16;
                    Test.fFld += i19;
                default:
                    if (b) continue;
                }
                iFld = i25;
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
//DEBUG  lMeth1 ->  lMeth1 lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth1 lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}