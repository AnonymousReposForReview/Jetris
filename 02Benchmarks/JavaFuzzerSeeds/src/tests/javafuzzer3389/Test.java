package tests.javafuzzer3389;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 07:13:19 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=192L;
    public static int iFld=-152;
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 125.609F);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i2) {

        long l=4L;
        int i3=-3, i4=-3, i5=3, i6=-219, i7=-12, iArr[]=new int[N];
        boolean b=false;
        byte by=-78;
        double d=-2.56531;

        FuzzerUtils.init(iArr, 9);

        for (l = 183; l > 3; l -= 3) {
            i2 += (int)(((l * i2) + i2) - i2);
            iArr[(int)(l)] /= (int)(i3 | 1);
            i3 = -118;
            for (i4 = 1; i4 < 26; ++i4) {
                i5 = 13;
                try {
                    i3 = (i3 % -13597);
                    i2 = (-910156555 % iArr[(int)(l)]);
                    i5 = (i4 % i4);
                } catch (ArithmeticException a_e) {}
            }
            for (i6 = 1; 26 > i6; ++i6) {
                if (b) continue;
                i2 = -52854;
                Test.instanceCount = by;
                i5 *= (int)l;
                Test.instanceCount -= (long)d;
                Test.instanceCount = i4;
                try {
                    i5 = (-9603 % iArr[i6]);
                    i2 = (1306707496 % i2);
                    i3 = (i6 / i7);
                } catch (ArithmeticException a_e) {}
            }
        }
        long meth_res = i2 + l + i3 + i4 + i5 + i6 + i7 + (b ? 1 : 0) + by + Double.doubleToLongBits(d) +
            FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i, int i1) {

        int i8=-10, i9=4019, i10=-212, i11=-1, i12=-24097, iArr1[][]=new int[N][N];
        double d1=-36.108062;
        short s=30024, sArr[][]=new short[N][N];

        FuzzerUtils.init(iArr1, -3);
        FuzzerUtils.init(sArr, (short)17152);

        i1 *= iMeth(i);
        i >>= i;
        i1 = (int)-13L;
        for (i8 = 327; i8 > 5; --i8) {
            Test.fArrFld[i8 + 1] = Test.instanceCount;
            i10 = 1;
            do {
                iArr1[i8][i10] -= 0;
                switch ((i8 % 3) + 92) {
                case 92:
                    d1 %= (Test.instanceCount | 1);
                    break;
                case 93:
                    for (i11 = 1; i11 < 1; ++i11) {
                        s ^= (short)i8;
                        Test.instanceCount = -63987;
                    }
                    i12 &= i11;
                    Test.instanceCount = 212L;
                    try {
                        i9 = (i9 % i10);
                        i1 = (i / -109);
                        iArr1[i10 - 1][i10] = (i9 % i12);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 94:
                    sArr[i8 - 1][i8 + 1] = (short)31;
                }
            } while (++i10 < 5);
        }
        vMeth_check_sum += i + i1 + i8 + i9 + i10 + Double.doubleToLongBits(d1) + i11 + i12 + s +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(sArr);
    }

    public static void vSmallMeth() {

        int i13=146;
        float f=0.457F;

        vMeth(i13, -11);
        f *= Test.instanceCount;
        vSmallMeth_check_sum += i13 + Float.floatToIntBits(f);
    }

    public void mainTest(String[] strArr1) {

        float f1=0.641F;

        for (int smallinvoc=0; smallinvoc<374; smallinvoc++) vSmallMeth();
        f1 -= Test.iFld;
        Test.iFld *= (int)f1;


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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  iMeth ->  iMeth vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}