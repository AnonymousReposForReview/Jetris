package tests.javafuzzer36;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 21:26:30 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=2840919305L;
    public long lFld=-45117L;
    public static boolean bFld=false;
    public static float fFld=-2.993F;
    public static int iFld=-4;
    public static double dFld=20.54475;

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i8, int i9) {

        int i10=59983, i11=0, i12=-3, i13=196, iArr1[]=new int[N];
        double d=-99.69729;
        short s=30539;
        float f1=27.600F;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr1, 162);
        FuzzerUtils.init(lArr1, -3L);

        Test.bFld = Test.bFld;
        i8 *= i8;
        iArr1[(i9 >>> 1) % N] ^= i8;
        for (i10 = 273; 6 < i10; --i10) {
            switch (((i10 >>> 1) % 1) + 41) {
            case 41:
                Test.instanceCount ^= -2;
                for (i12 = 1; i12 < 6; ++i12) {
                    Test.instanceCount += i12;
                    Test.instanceCount >>>= -36311;
                    i9 += (int)87.117167;
                    d = 1;
                    while (++d < 2) {
                        i11 *= i10;
                        Test.instanceCount += (long)(d + i13);
                        lArr1[(int)(d - 1)] -= (long)d;
                        i9 += (int)d;
                    }
                }
                break;
            default:
                s += (short)f1;
            }
        }
        vMeth1_check_sum += i8 + i9 + i10 + i11 + i12 + i13 + Double.doubleToLongBits(d) + s + Float.floatToIntBits(f1)
            + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr1);
    }

    public static void vMeth(int i7, long l1, long l2) {

        int i14=-6, i15=-12, i16=-34219, i17=2;
        byte by=81, byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)50);

        vMeth1(i7, -125);
        i7 >>= (int)Test.instanceCount;
        i7 += -7;
        byArr[(i7 >>> 1) % N] -= (byte)-163;
        for (i14 = 8; i14 < 162; i14++) {
            by %= (byte)-48;
            i16 = 10;
            do {
                Test.fFld += l1;
                l1 = Test.iFld;
                if (Test.bFld) {
                    i17 = 1;
                    do {
                        i15 += (((i17 * i14) + i14) - i15);
                        i15 += i7;
                        i15 = (int)l1;
                        Test.iFld = i7;
                    } while (++i17 < 1);
                } else {
                    Test.fFld *= 2.665F;
                }
            } while (--i16 > 0);
        }
        vMeth_check_sum += i7 + l1 + l2 + i14 + i15 + by + i16 + i17 + FuzzerUtils.checkSum(byArr);
    }

    public static int iMeth(int i3, int i4) {

        int i5=17968, i6=-16144, i18=8, i19=2, i20=231, i21=-187;
        float f=28.822F;
        double d1=2.60388;

        i3 = 8;
        for (i5 = 5; i5 < 239; i5++) {
            i4 = (int)f;
            vMeth(Test.iFld, Test.instanceCount, Test.instanceCount);
            Test.instanceCount = (long)f;
            Test.instanceCount += i3;
            for (i18 = 1; i18 < 7; ++i18) {
                switch ((i5 % 5) + 5) {
                case 5:
                    for (d1 = 1; 2 > d1; d1++) {
                        Test.instanceCount -= -1;
                        if (Test.bFld) break;
                    }
                    i21 = 1;
                    while ((i21 += 3) < 2) {
                        i4 += (int)-179L;
                        i20 = (int)Test.instanceCount;
                        i4 = Test.iFld;
                    }
                case 6:
                    i4 += i19;
                    break;
                case 7:
                    f *= Test.instanceCount;
                    break;
                case 8:
                case 9:
                    i4 >>>= (int)Test.instanceCount;
                    break;
                default:
                    i4 = (int)Test.fFld;
                }
            }
        }
        long meth_res = i3 + i4 + i5 + i6 + Float.floatToIntBits(f) + i18 + i19 + Double.doubleToLongBits(d1) + i20 +
            i21;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-4261, i1=253, i2=154, i22=-8, i23=-6, i24=-62221, i25=-46528, iArr[]=new int[N];
        long l=33929L, lArr[]=new long[N];
        byte by1=-28;
        short s1=-3833;
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr, -50170);
        FuzzerUtils.init(lArr, -7L);
        FuzzerUtils.init(fArr, 2.421F);

        for (i = 8; i < 149; i++) {
            for (l = 178; l > i; --l) {
                switch (((((int)(lFld * i)) >>> 1) % 7) + 60) {
                case 60:
                    iArr = iArr;
                    lArr[i + 1] = (iMeth(Test.iFld, i) + -81L);
                    i22 = 1;
                    do {
                        by1 -= (byte)Test.fFld;
                        try {
                            i1 = (i % 1578676576);
                            i1 = (Test.iFld % iArr[i - 1]);
                            i2 = (i1 / -127);
                        } catch (ArithmeticException a_e) {}
                        i2 += (int)Test.instanceCount;
                        lFld = i1;
                        try {
                            iArr[i22] = (i22 % i22);
                            i1 = (120 / Test.iFld);
                            Test.iFld = (-40986 / iArr[i22 + 1]);
                        } catch (ArithmeticException a_e) {}
                        iArr[i22 - 1] = (int)lFld;
                        i1 += (((i22 * i22) + Test.iFld) - s1);
                    } while (++i22 < 1);
                    if (Test.bFld) break;
                    break;
                case 61:
                    i23 = 1;
                    do {
                        Test.bFld = Test.bFld;
                        i1 += (i23 ^ (long)Test.fFld);
                        lFld += (i23 ^ by1);
                        lArr = lArr;
                        i1 *= (int)-21.106F;
                        i1 |= i23;
                    } while (++i23 < 1);
                    Test.iFld += (int)l;
                    iArr[i - 1] += (int)Test.dFld;
                    break;
                case 62:
                    fArr[(int)(l + 1)] = i1;
                case 63:
                    for (i24 = 1; i24 < 1; i24++) {
                        Test.iFld -= (int)Test.fFld;
                    }
                    break;
                case 64:
                    iArr[i] *= (int)7853756039941996162L;
                    Test.dFld *= Test.dFld;
                case 65:
                    Test.iFld = i;
                    iArr[(int)(l)] >>= i25;
                    break;
                case 66:
                    i25 >>= i25;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
