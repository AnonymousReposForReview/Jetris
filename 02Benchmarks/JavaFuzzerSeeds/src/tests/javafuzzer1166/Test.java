package tests.javafuzzer1166;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 15:56:45 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-12L;
    public static short sFld=27473;
    public int iArrFld[][]=new int[N][N];
    public static int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld1, -4653);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        boolean b=false;

        b = b;
        vMeth_check_sum += (b ? 1 : 0);
    }

    public static int iMeth1(int i7) {

        short s=6940;
        float fArr1[]=new float[N];

        FuzzerUtils.init(fArr1, -2.622F);

        vMeth();
        i7 += s;
        fArr1[(i7 >>> 1) % N] -= Test.instanceCount;
        long meth_res = i7 + s + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i2, float f, int i3) {

        double d=118.36036, d1=-2.73242;
        int i4=43, i6=-164, i8=-178;
        byte by=-41;
        short s1=-24723, sArr[]=new short[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -120.679F);
        FuzzerUtils.init(sArr, (short)-5834);

        for (d = 1; d < 259; ++d) {
            i6 = 1;
            do {
                fArr = (fArr = (fArr = (fArr = fArr)));
                i4 <<= iMeth1(i3);
                i2 += i6;
                for (d1 = 1; d1 < 1; d1++) {
                    i8 -= i3;
                    by += (byte)i2;
                    switch ((int)(((d % 1) * 5) + 101)) {
                    case 103:
                        i3 /= (int)(i4 | 1);
                        Test.iArrFld1 = FuzzerUtils.int1array(N, (int)14);
                        break;
                    default:
                        sArr[(int)(d + 1)] <<= (short)-9;
                        i3 *= i4;
                        Test.instanceCount = s1;
                    }
                    i3 = 42557;
                }
            } while (++i6 < 6);
        }
        long meth_res = i2 + Float.floatToIntBits(f) + i3 + Double.doubleToLongBits(d) + i4 + i6 +
            Double.doubleToLongBits(d1) + i8 + by + s1 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(sArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=208, i1=-48311, i9=1, i10=-34, i11=-10, i12=12, i13=1651, i14=-53, i15=-20414;
        float f1=-1.422F, f2=53.154F;
        byte by1=-107;

        for (i = 23; i < 397; i++) {
            iArrFld[i] = FuzzerUtils.int1array(N, (int)134);
            i1 >>= (int)Test.instanceCount;
            iArrFld[i][i + 1] <<= (i + Math.abs((int)(i1 &= (int)Test.instanceCount)));
            Test.instanceCount += i;
            i1 += (int)Test.instanceCount;
        }
        i1 += (((5 + (14 + i1)) - iMeth(i1, f1, i)) - Test.sFld);
        f2 = 1;
        do {
            for (i9 = 97; i9 > 6; i9 -= 3) {
                i10 *= i;
                Test.instanceCount *= i9;
                for (i11 = 1; i11 < 4; i11++) {
                    try {
                        Test.iArrFld1[(int)(f2 - 1)] = (i12 % 240);
                        iArrFld[(int)(f2)][i9 + 1] = (i10 / -92761800);
                        i10 = (i / -187);
                    } catch (ArithmeticException a_e) {}
                    i1 = -2;
                    i1 += i9;
                }
                Test.instanceCount = by1;
                Test.instanceCount += i9;
                Test.iArrFld1[i9 - 1] = i10;
            }
            i13 = 1;
            while (++i13 < 97) {
                i1 >>= i12;
                i1 -= Test.sFld;
                for (i14 = i13; i14 < 1; ++i14) {
                    f1 *= i10;
                    i15 ^= i14;
                    i1 = -148;
                    i10 ^= i1;
                    Test.iArrFld1[i13 + 1] -= (int)-27.17763;
                    iArrFld[i14 + 1][i14 + 1] += (int)-52.379F;
                    i10 = 32936;
                    i12 += (i14 + Test.instanceCount);
                }
            }
        } while (++f2 < 259);



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
