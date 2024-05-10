package tests.javafuzzer3081;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 01:32:47 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-6142L;
    public static double dFld=-1.25480;
    public static short sArrFld[][]=new short[N][N];
    public static double dArrFld[]=new double[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)-4666);
        FuzzerUtils.init(Test.dArrFld, 0.13925);
        FuzzerUtils.init(Test.iArrFld, -245);
    }

    public static long iMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static int iMeth() {

        int i2=38137, i3=-170, i4=78, i5=-33376, iArr[]=new int[N];
        float f=37.718F, f1=-118.170F;
        long l=-619034883L;
        boolean b=false;

        FuzzerUtils.init(iArr, 2);

        i2 = (i2++);
        for (f = 7; f < 161; f++) {
            i2 -= (((i3++) - i3) + ((--i2) - (++i2)));
            i3 += (int)(f * f);
            i4 = 1;
            do {
                for (l = 1; 1 > l; ++l) {
                    iArr[(int)(l + 1)] >>= -38110;
                    switch ((int)((f % 1) + 33)) {
                    case 33:
                        i5 += (int)(((i3 - -153) * (i5 - l)) - (Long.reverseBytes(l) / ((-66L + (Test.instanceCount -
                            i4)) | 1)));
                        i2 *= i5;
                        Test.instanceCount = ((Test.instanceCount + i3) - Math.max(i5, 141 - (i5 * i4)));
                        if (b | ((--i5) != Test.instanceCount)) break;
                        break;
                    default:
                        Test.instanceCount *= (long)(f1--);
                        i3 <<= (i3++);
                        i2 -= (int)(f1++);
                    }
                }
            } while (++i4 < 10);
        }
        long meth_res = i2 + Float.floatToIntBits(f) + i3 + i4 + l + i5 + (b ? 1 : 0) + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i7=8, i8=6, i9=-69, i11=-3, i12=8, i13=9, i14=-252, iArr1[]=new int[N];
        short s1=5894;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr1, -222);
        FuzzerUtils.init(lArr, 3762764898L);

        i7 = (int)(((i7 + i7) + Test.dFld) - Test.dArrFld[(i7 >>> 1) % N]);
        iMeth();
        try {
            for (i8 = 11; i8 < 232; ++i8) {
                i9 += (23433 + (i8 * i8));
                i7 = 2975;
            }
            Test.dFld = -13;
            for (i11 = 3; i11 < 201; ++i11) {
                for (i13 = i11; i13 < 8; i13++) {
                    if (i8 != 0) {
                        vMeth_check_sum += i7 + i8 + i9 + i11 + i12 + i13 + i14 + s1 + FuzzerUtils.checkSum(iArr1) +
                            FuzzerUtils.checkSum(lArr);
                        return;
                    }
                    Test.instanceCount *= i12;
                }
                i9 += (((i11 * i9) + i12) - Test.instanceCount);
                i7 += (i11 ^ s1);
                lArr = lArr;
            }
        }
        catch (NegativeArraySizeException exc2) {
            Test.instanceCount *= Test.instanceCount;
        }
        catch (NullPointerException exc3) {
            Test.dFld *= Test.instanceCount;
        }
        vMeth_check_sum += i7 + i8 + i9 + i11 + i12 + i13 + i14 + s1 + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(lArr);
    }

    public static double dMeth(short s, int i6) {


        Test.sArrFld[(i6 >>> 1) % N][(i6 >>> 1) % N] = (short)45516;
        vMeth();
        long meth_res = s + i6;
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-5, i1=-13, i15=0, i16=-164;
        float f2=0.980F;

        for (i = 2; i < 258; i++) {
            i1 -= iMeth();
            dMeth((short)(-10737), i);
            i1 <<= -30151;
            for (i15 = 2; i15 < 98; ++i15) {
                short s2=-29849;
                s2 -= (short)f2;
                Test.iArrFld[i - 1] ^= i16;
                try {
                    i1 = (i / i16);
                    Test.iArrFld[i15] = (1488185532 / Test.iArrFld[i15]);
                    i16 = (1078173161 % i);
                } catch (ArithmeticException a_e) {}
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
//DEBUG  iMeth ->  iMeth mainTest vMeth dMeth
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  vMeth ->  vMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
