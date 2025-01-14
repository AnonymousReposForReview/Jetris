package tests.javafuzzer2885;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 22:17:05 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=198L;
    public volatile float fFld=-2.792F;
    public static double dFld=-3.53353;
    public volatile short sFld=589;
    public static volatile boolean bFld=false;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -7);
        FuzzerUtils.init(Test.lArrFld, 2221127425763079472L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f) {

        int i1=-12768, i2=13669, i3=-212, i4=4, i5=-33031, i6=79, i7=13;
        boolean b=true;
        float f1=1.508F;

        i1 *= i1;
        i1 = i1;
        Test.dFld *= i1;
        for (i2 = 6; i2 < 223; ++i2) {
            Test.iArrFld[i2 - 1] += -79;
            i3 -= i1;
            Test.instanceCount = i2;
            for (i4 = 1; i4 < 7; i4++) {
                i1 += (((i4 * i5) + i2) - Test.instanceCount);
                for (i6 = 1; 2 > i6; ++i6) {
                    b = false;
                    f1 -= i4;
                    f1 += (float)Test.dFld;
                    i1 -= i2;
                    try {
                        i5 = (i6 / i1);
                        i7 = (-128 % Test.iArrFld[i2]);
                        i5 = (497134641 / Test.iArrFld[i4]);
                    } catch (ArithmeticException a_e) {}
                }
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + i1 + i2 + i3 + i4 + i5 + i6 + i7 + (b ? 1 : 0) +
            Float.floatToIntBits(f1);
    }

    public static void vMeth() {

        int i8=4;

        vMeth1(-2.922F);
        i8 = (int)Test.instanceCount;
        vMeth_check_sum += i8;
    }

    public static int iMeth() {

        int i=-212, i9=57, i10=16691, i11=-148;
        double d=-126.57698;
        short s=13889;
        byte by=17;
        float f2=2.1022F, f3=-48.615F;
        boolean b1=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -5407119955139080614L);

        Test.iArrFld[(i >>> 1) % N] = (int)(((i + i) + (d * s)) + (i += (int)(Test.instanceCount - i)));
        vMeth();
        i += (int)Test.dFld;
        if (b1) {
            Test.instanceCount = i;
            i9 = 1;
            do {
                by += (byte)i;
                f2 = 1;
                while (++f2 < 9) {
                    b1 = b1;
                    i += (int)(((f2 * i) + Test.instanceCount) - i);
                    i += (int)f2;
                    for (i10 = i9; i10 < 1; i10++) {
                        i11 = i11;
                        i11 = i;
                        f3 = Test.instanceCount;
                    }
                }
            } while (++i9 < 181);
        } else {
            lArr[(-9 >>> 1) % N] = Test.instanceCount;
        }
        long meth_res = i + Double.doubleToLongBits(d) + s + i9 + by + Float.floatToIntBits(f2) + (b1 ? 1 : 0) + i10 +
            i11 + Float.floatToIntBits(f3) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i12=16, i13=-6, i14=6, i15=-191, i16=38982, i17=-7, i18=-47116;
        float f4=2.651F;
        double d1=10.80080;

        fFld -= iMeth();
        Test.instanceCount -= -4;
        for (i12 = 1; 374 > i12; ++i12) {
            Test.instanceCount += 5146647115548177683L;
            if (false) {
                sFld = (short)i12;
                for (i14 = i12; i14 < 68; i14++) {
                    i15 -= -2;
                    i15 += -63;
                    i15 -= (int)Test.dFld;
                    Test.lArrFld[i12 - 1] = i15;
                    f4 = 1;
                    while (++f4 < 1) {
                        Test.iArrFld[i14 + 1] >>= i13;
                        i13 += (-3 + (f4 * f4));
                        i13 += (int)(((f4 * i15) + i13) - i13);
                        Test.instanceCount = i12;
                    }
                    sFld += (short)(i14 * i14);
                }
            }
            i15 /= (int)(i15 | 1);
            for (i16 = 2; i16 < 68; i16++) {
                for (d1 = 2; d1 > i12; d1 -= 2) {
                    Test.iArrFld[i16] >>>= i16;
                    Test.iArrFld[(int)(d1 + 1)] = (int)111.812F;
                    i15 = (int)Test.instanceCount;
                    Test.instanceCount *= Test.instanceCount;
                    Test.lArrFld = Test.lArrFld;
                    Test.instanceCount >>= i17;
                    i13 += (int)(((d1 * i15) + i13) - i12);
                    if (Test.bFld) continue;
                    Test.instanceCount += -3;
                }
                i17 *= 2;
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
