package tests.javafuzzer668;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 07:32:39 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-7L;
    public static byte byFld=-68;
    public static float fFld=-34.327F;
    public static double dFld=0.64122;
    public static int iFld=-9;
    public static boolean bFld=true;
    public int iArrFld[]=new int[N];
    public static int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld1, -162);
    }

    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i11, long l2, int i12) {

        int i13=43900, i14=98, i15=-13, i16=-29458, i17=-1, i18=14, i19=-58237, i20=3549;
        short s=11600;
        float f=-125.49F;
        boolean b=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 22469L);

        for (i13 = 12; i13 < 289; ++i13) {
            i14 *= s;
        }
        i15 = 1;
        while (++i15 < 202) {
            s <<= (short)-12;
            i16 = 1;
            do {
                i14 *= (int)f;
                i11 = 48;
                lArr[i15 + 1] -= l2;
                Test.byFld -= (byte)l2;
                for (i17 = 1; i17 < 1; i17++) {
                    l2 = s;
                }
            } while (++i16 < 8);
            i14 = i15;
            for (i19 = 1; i19 < 8; ++i19) {
                i18 >>= i12;
                b = b;
            }
        }
        vMeth1_check_sum += i11 + l2 + i12 + i13 + i14 + s + i15 + i16 + Float.floatToIntBits(f) + i17 + i18 + i19 +
            i20 + (b ? 1 : 0) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(long l1, int i9, int i10) {

        long l3=1376423137413069159L;

        vMeth1(i10, l1, 8);
        Test.iArrFld1[(i10 >>> 1) % N] -= (int)l1;
        l3 = l1;
        Test.fFld *= Test.fFld;
        vMeth_check_sum += l1 + i9 + i10 + l3;
    }

    public static double dMeth() {

        int i1=22592, i2=-11, i3=10, i4=-210, i5=61, i6=27098, i7=-9178, i8=14;
        long l=9839L, lArr1[]=new long[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -54.70223);
        FuzzerUtils.init(lArr1, -3797403978L);

        i1 = 1;
        do {
            Test.iArrFld1[i1 + 1] += i1;
            i2 ^= (((i2 - i2) + (i2 + i2)) * (--i2));
            for (i3 = 8; i3 > 1; i3 -= 3) {
                i4 = (int)Math.abs(dArr[i3] = (Test.iArrFld1[i1 + 1]--));
            }
            i2 = (Test.iArrFld1[i1 - 1]++);
        } while (++i1 < 211);
        for (l = 289; l > 1; --l) {
            i6 = 1;
            while (++i6 < 6) {
                for (i7 = 1; i7 < 1; i7++) {
                    long l4=3664664641508914353L;
                    boolean b1=true;
                    vMeth(l4, -11, -5);
                    lArr1[i7 - 1] = (long)Test.fFld;
                    i8 = i1;
                    b1 = b1;
                    l4 -= i5;
                    i8 += (int)Test.fFld;
                }
            }
        }
        long meth_res = i1 + i2 + i3 + i4 + l + i5 + i6 + i7 + i8 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr))
            + FuzzerUtils.checkSum(lArr1);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f1=10.684F;
        int i21=6;

        for (int i : iArrFld) {
            i *= (int)(((--i) * dMeth()) - Test.instanceCount);
            switch (((i >>> 1) % 2) + 107) {
            case 107:
                Test.dFld -= Test.instanceCount;
                break;
            case 108:
                i = (int)Test.fFld;
                switch ((((i >>> 1) % 9) * 5) + 84) {
                case 104:
                    Test.instanceCount += i;
                    Test.instanceCount = i;
                    break;
                case 107:
                    iArrFld[(-10 >>> 1) % N] = i;
                    for (f1 = 2; 63 > f1; f1++) {
                        Test.fFld += (f1 * i21);
                        Test.iFld |= 6;
                        Test.iArrFld1[(int)(f1)] -= i21;
                        if (Test.bFld) {
                            i = (int)-3998L;
                            Test.instanceCount -= i21;
                            Test.instanceCount += (long)(f1 + Test.iFld);
                        } else {
                            i21 *= i21;
                            Test.instanceCount += (long)f1;
                            Test.fFld += (f1 - i21);
                            Test.fFld *= -73;
                        }
                        i21 = (int)Test.instanceCount;
                        iArrFld[(int)(f1)] = -36;
                        Test.iArrFld1 = Test.iArrFld1;
                        iArrFld[(int)(f1 - 1)] -= i;
                        Test.instanceCount = Test.iFld;
                    }
                    i21 %= (int)(i21 | 1);
                    break;
                case 92:
                    Test.dFld += Test.dFld;
                    if (Test.bFld) continue;
                    i21 = -1;
                case 101:
                    Test.byFld = (byte)-58;
                case 110:
                    i = Test.iFld;
                    break;
                case 108:
                case 120:
                    i21 += Test.byFld;
                    break;
                case 102:
                    i *= (int)3.725F;
                    break;
                case 105:
                    Test.instanceCount *= Test.instanceCount;
                    break;
                default:
                    Test.fFld -= Test.iFld;
                }
                break;
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
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  vMeth ->  vMeth dMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
