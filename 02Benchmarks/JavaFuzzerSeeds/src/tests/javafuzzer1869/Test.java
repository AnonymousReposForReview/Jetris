package tests.javafuzzer1869;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 05:01:08 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3094273817143592711L;
    public static boolean bFld=false;
    public static double dFld=-30.112625;
    public float fFld=-2.197F;
    public static boolean bArrFld[]=new boolean[N];
    public static int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];
    public static volatile double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.bArrFld, false);
        FuzzerUtils.init(Test.iArrFld, 43753);
        FuzzerUtils.init(Test.fArrFld, 31.94F);
        FuzzerUtils.init(Test.dArrFld, -36.6649);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long byMeth_check_sum = 0;

    public static byte byMeth(boolean b) {

        int i6=27551, i7=-11, i8=-7, i9=115, i10=-159, i11=-119, i12=9436, i13=-12, i14=-52461;
        float f2=99.768F;
        long l1=-12L;

        if (Test.bFld) {
            i6 += (int)f2;
            Test.fArrFld[(i6 >>> 1) % N] = l1;
            Test.dArrFld[(38939 >>> 1) % N] -= i6;
        }
        i7 = 1;
        do {
            for (i8 = 1; i8 < 6; ++i8) {
                i10 = 2;
                while ((i10 -= 3) > 0) {
                    i6 -= (int)f2;
                }
            }
            for (i11 = 1; i11 < 6; i11++) {
                switch (((i10 >>> 1) % 4) + 104) {
                case 104:
                    i9 = -172;
                    for (i13 = 1; i13 < 2; i13++) {
                        f2 %= -14;
                        if (Test.bFld) continue;
                        i6 += (611 + (i13 * i13));
                    }
                case 105:
                    i6 += (i11 * i11);
                    break;
                case 106:
                    i12 = (int)f2;
                case 107:
                    i12 += (int)f2;
                    break;
                default:
                    Test.instanceCount = i12;
                }
            }
        } while (++i7 < 264);
        long meth_res = (b ? 1 : 0) + i6 + Float.floatToIntBits(f2) + l1 + i7 + i8 + i9 + i10 + i11 + i12 + i13 + i14;
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public static void vMeth(long l, int i1) {

        int i2=-42279, i3=-3, i4=-109, i5=46644;
        byte by=-66;
        float f1=-86.692F;
        double d=1.5655;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -88L);

        Test.bFld = Test.bArrFld[(i1 >>> 1) % N];
        i2 = 338;
        do {
            by = (byte)(Test.iArrFld[i2]++);
            i1 <<= (int)(l - ((l - Test.instanceCount) + (Test.iArrFld[i2]--)));
            if (Test.bFld = Test.bArrFld[i2 + 1]) continue;
            f1 = Test.instanceCount;
            switch ((i2 % 2) * 5) {
            case 10:
                for (i3 = 1; i3 < 5; i3++) {
                    i1 -= (int)(by % ((i1 = (int)(Test.instanceCount - i3)) | 1));
                    i5 = 2;
                    while (--i5 > 0) {
                        d = Integer.reverseBytes((int)(byMeth(false) + 1.770F));
                        d = i2;
                        Test.iArrFld[i5 + 1] >>= i4;
                        Test.iArrFld[i2 - 1] += (int)f1;
                        lArr[i5] *= i2;
                    }
                }
                break;
            case 4:
                i1 += (i2 ^ by);
                break;
            default:
                Test.iArrFld[i2] *= i2;
            }
        } while (--i2 > 0);
        vMeth_check_sum += l + i1 + i2 + by + Float.floatToIntBits(f1) + i3 + i4 + i5 + Double.doubleToLongBits(d) +
            FuzzerUtils.checkSum(lArr);
    }

    public static long lMeth(int i) {

        float f=0.111F;
        short s=-17794;
        int i15=42348, i16=6, i17=-56332;

        Test.instanceCount |= (long)(18304 - ((i - f) * (7234L + (2.130370 * (i - s)))));
        vMeth(Test.instanceCount, 47113);
        i15 = 1;
        while (++i15 < 317) {
            for (i16 = 1; i16 < 5; i16++) {
                Test.instanceCount *= i15;
                s += (short)Test.dFld;
            }
            i = i15;
            i17 += (int)f;
            s >>= (short)i;
            f = -1;
            Test.dArrFld = Test.dArrFld;
            Test.iArrFld = Test.iArrFld;
            Test.iArrFld[i15] *= (int)f;
        }
        i = (int)Test.instanceCount;
        Test.iArrFld[(i15 >>> 1) % N] += (int)Test.instanceCount;
        long meth_res = i + Float.floatToIntBits(f) + s + i15 + i16 + i17;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i18=-14, i19=250, i20=24921, i21=0, i22=-23853;
        float f3=0.915F;
        byte by1=25, by2=-32;
        short s1=9983;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -1037514769L);

        lMeth(i18);
        i18 = -48671;
        Test.iArrFld = Test.iArrFld;
        if (Test.bFld) {
            i18 = i18;
        } else {
            Test.instanceCount += i18;
            Test.iArrFld[(i18 >>> 1) % N] = (int)Test.instanceCount;
            f3 = 1;
            do {
                for (i19 = (int)(f3); i19 < 153; i19++) {
                    i18 += (-1 + (i19 * i19));
                    Test.dFld = i20;
                    i20 = (int)Test.instanceCount;
                    Test.iArrFld[(int)(f3 + 1)] >>>= i20;
                    i18 = i20;
                    i18 += i19;
                    for (i21 = 1; i21 < 1; i21++) {
                        fFld += (i21 + Test.instanceCount);
                        if (Test.bFld) {
                            Test.dFld -= by1;
                            lArr1[i21 - 1] = i22;
                            i20 += (i21 * i21);
                            s1 = (short)i22;
                        }
                        i22 += i21;
                        i20 >>= i19;
                        fFld *= Test.instanceCount;
                    }
                    i18 += (i19 | i22);
                    Test.instanceCount += i19;
                    by2 = (byte)i19;
                }
            } while (++f3 < 164);
        }
        Test.instanceCount -= i21;
        Test.instanceCount <<= Test.instanceCount;


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
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  byMeth ->  byMeth vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
