package tests.javafuzzer491;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 04:40:56 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-14L;
    public static long lFld=3563475048L;
    public static boolean bFld=false;
    public static short sFld=-9693;
    public static int iFld=-10;
    public float fFld=-5.935F;
    public static int iArrFld[]=new int[N];
    public float fArrFld[]=new float[N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 66);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i2) {

        int i3=-252, i4=222, i5=-31748, i6=157, i7=51080, i8=-7831, i9=7;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 1.113010);

        if (Test.bFld) {
            for (i3 = 5; 168 > i3; i3++) {
                i4 >>= -2;
                for (i5 = i3; i5 < 10; i5++) {
                    i4 += i5;
                    try {
                        i6 = (i4 % 73);
                        i6 = (i5 % 27444);
                        Test.iArrFld[i5 - 1] = (1202907715 % i3);
                    } catch (ArithmeticException a_e) {}
                    i7 = 1;
                    do {
                        short s=16252;
                        i4 = s;
                    } while (++i7 < 1);
                    i6 >>= 50221;
                }
                for (i8 = i3; i8 < 10; i8++) {
                    i2 = i8;
                }
                i9 = (int)Test.instanceCount;
                i4 += (-3523 + (i3 * i3));
                i6 = (int)Test.lFld;
                if (true) continue;
            }
        } else {
            dArr[(i6 >>> 1) % N] += i2;
        }
        vMeth2_check_sum += i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void vMeth1(float f1) {

        byte by=91;
        int i10=4, i11=-178, i12=54388, i13=5, i14=-52216;

        vMeth2(-185);
        by -= (byte)f1;
        i10 ^= (int)Test.instanceCount;
        i11 = 1;
        while (++i11 < 241) {
            i12 = 1;
            do {
                for (i13 = 1; i13 < 1; ++i13) {
                    switch ((((i14 >>> 1) % 2) * 5) + 96) {
                    case 100:
                        i10 = (int)-12L;
                        i10 += (i13 * i13);
                        break;
                    case 105:
                        Test.iArrFld[i12 + 1] = i12;
                        if (true) break;
                        i10 = Test.sFld;
                        break;
                    default:
                        try {
                            i14 = (-80 / Test.iArrFld[i13 - 1]);
                            i14 = (-17894 / i11);
                            i14 = (i13 / 104);
                        } catch (ArithmeticException a_e) {}
                    }
                    i14 -= (int)f1;
                }
                i10 -= (int)f1;
            } while (++i12 < 7);
        }
        vMeth1_check_sum += Float.floatToIntBits(f1) + by + i10 + i11 + i12 + i13 + i14;
    }

    public void vMeth() {

        float f=1.762F;

        f = (++Test.lFld);
        vMeth1(f);
        Test.iFld += Test.iFld;
        Test.instanceCount = Test.iFld;
        Test.iArrFld[(-9 >>> 1) % N] -= -13753;
        Test.iArrFld = FuzzerUtils.int1array(N, (int)96);
        f -= 8L;
        Test.bFld = Test.bFld;
        Test.iArrFld[(Test.iFld >>> 1) % N] >>= Test.iFld;
        fArrFld[(Test.iFld >>> 1) % N] = Test.instanceCount;
        Test.iFld = (int)f;
        vMeth_check_sum += Float.floatToIntBits(f);
    }

    public void mainTest(String[] strArr1) {

        int i=-15211, i1=-21216, i15=1, i16=43628, i17=-68;
        double d=0.63483;

        for (i = 7; i < 179; i++) {
            if (Test.lFld < ((++Test.lFld) + (d++))) continue;
            vMeth();
            i15 = 1;
            while (++i15 < 146) {
                for (i16 = 1; i16 < 1; ++i16) {
                    i1 += (((i16 * fFld) + i17) - i17);
                    i1 -= Test.sFld;
                    fFld += (((i16 * Test.instanceCount) + i17) - fFld);
                    Test.iFld += (i16 - i1);
                    Test.instanceCount -= i17;
                    switch (((i15 % 2) * 5) + 82) {
                    case 83:
                        Test.iFld += (int)(-4L + (i16 * i16));
                        d *= 92.44596;
                        Test.lFld <<= 22646;
                        i1 = Test.iFld;
                        break;
                    case 86:
                        Test.iFld *= i17;
                    }
                    fFld = i;
                    Test.iArrFld[i - 1] += (int)d;
                    switch ((i15 % 10) + 17) {
                    case 17:
                        i17 <<= (int)Test.lFld;
                        fFld -= Test.instanceCount;
                        break;
                    case 18:
                        fFld *= i16;
                        Test.iFld += (int)d;
                        i1 -= (int)Test.instanceCount;
                        break;
                    case 19:
                        lArrFld[(Test.iFld >>> 1) % N] += i17;
                        Test.iFld += i16;
                        Test.instanceCount -= i17;
                        Test.iFld <<= (int)Test.instanceCount;
                    case 20:
                        Test.iFld += (int)fFld;
                        fFld = fFld;
                    case 21:
                        Test.lFld += i16;
                        break;
                    case 22:
                        i1 += (((i16 * i15) + i17) - fFld);
                        break;
                    case 23:
                        Test.iArrFld[i15 + 1] = i15;
                        break;
                    case 24:
                        fFld += Test.instanceCount;
                    case 25:
                    case 26:
                        fFld *= -10;
                    }
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
