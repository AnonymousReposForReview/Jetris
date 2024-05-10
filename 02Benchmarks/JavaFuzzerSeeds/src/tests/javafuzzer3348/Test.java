package tests.javafuzzer3348;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 06:31:20 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3734841167195348706L;
    public static float fFld=-91.666F;
    public static volatile long lFld=-2L;
    public static boolean bFld=true;
    public int iFld=-2;
    public int iFld1=28398;
    public double dFld=-1.6954;
    public static int iArrFld[]=new int[N];
    public float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -29549);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i2) {

        int i3=41706, i4=17, i5=5, i6=240, i7=26293, i8=0, iArr[]=new int[N];
        byte by=-39;
        short s1=11850;

        FuzzerUtils.init(iArr, -1);

        for (i3 = 5; i3 < 145; i3++) {
            for (i5 = 1; i5 < 11; i5 += 3) {
                if (i3 != 0) {
                }
            }
            i7 = 1;
            do {
                i8 = 1;
                do {
                    i2 ^= (int)-3887997873908525550L;
                    Test.fFld += (i8 * by);
                    iArr[i8 - 1] /= (int)44.506F;
                } while ((i8 -= 2) > 0);
                i6 = (int)Test.fFld;
                i2 = by;
                s1 *= (short)53;
                i4 = i5;
                i6 = i4;
                i4 <<= i7;
                Test.instanceCount = i7;
            } while (++i7 < 11);
        }
        long meth_res = i2 + i3 + i4 + i5 + i6 + i7 + i8 + by + s1 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1() {

        int i1=4, i9=-42515, i10=50384, i11=-2, i12=171, i13=-250, i14=-10, iArr1[][]=new int[N][N];
        boolean b=false;
        double d=-120.2267;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -4092606167L);
        FuzzerUtils.init(iArr1, -1);

        i1 = (iMeth(i1) * i1);
        for (i9 = 4; i9 < 339; ++i9) {
            lArr[i9 - 1] -= i10;
            i10 <<= (int)Test.instanceCount;
            lArr[i9 + 1] *= Test.instanceCount;
            for (i11 = 1; i11 < 5; i11++) {
                i1 = i11;
                Test.instanceCount += (i11 ^ i12);
                Test.instanceCount = i9;
            }
            switch ((i9 % 6) + 93) {
            case 93:
                if (b) continue;
                if (b) break;
                break;
            case 94:
                for (i13 = 1; i13 < 5; ++i13) {
                    i1 += i13;
                    Test.lFld += i13;
                }
                break;
            case 95:
                try {
                    i10 = (i10 % i12);
                    i14 = (-44279 % i10);
                    i14 = (i9 % iArr1[i9 - 1][i9 + 1]);
                } catch (ArithmeticException a_e) {}
                break;
            case 96:
                i1 *= -5692;
            case 97:
                lArr = lArr;
                break;
            case 98:
                Test.fFld -= 25523;
                break;
            default:
                i14 *= (int)d;
            }
        }
        vMeth1_check_sum += i1 + i9 + i10 + i11 + i12 + (b ? 1 : 0) + i13 + i14 + Double.doubleToLongBits(d) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i, short s, long l) {

        int i15=7180, i16=-10, i17=5, i18=190;
        byte by1=-74;
        long lArr1[][]=new long[N][N];
        double dArr[]=new double[N];

        FuzzerUtils.init(lArr1, 13L);
        FuzzerUtils.init(dArr, 2.74003);

        vMeth1();
        i15 = 1;
        while (++i15 < 315) {
            i16 = 1;
            do {
                Test.instanceCount >>= Test.instanceCount;
                if (Test.bFld) {
                    for (i17 = 1; i17 < 1; ++i17) {
                        double d1=-2.31456;
                        if (Test.bFld) continue;
                        i18 = (int)d1;
                        Test.fFld -= Test.instanceCount;
                        l *= -1611402887585914706L;
                        i += (int)l;
                        by1 /= (byte)(Test.instanceCount | 1);
                    }
                    i %= (int)(l | 1);
                    Test.fFld += i16;
                    lArr1[i16][i16 - 1] = i16;
                } else if (Test.bFld) {
                    dArr = dArr;
                } else if (Test.bFld) {
                    s += (short)(i16 * l);
                    vMeth_check_sum += i + s + l + i15 + i16 + i17 + i18 + by1 + FuzzerUtils.checkSum(lArr1) +
                        Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                    return;
                }
            } while (++i16 < 5);
        }
        vMeth_check_sum += i + s + l + i15 + i16 + i17 + i18 + by1 + FuzzerUtils.checkSum(lArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        short s2=-17284;
        int i19=-129, i20=-3, i21=2, i22=-9, i23=-56366, i24=-134, iArr2[]=new int[N];
        byte by2=46;
        long lArr2[]=new long[N];

        FuzzerUtils.init(lArr2, 163L);
        FuzzerUtils.init(iArr2, -3);

        vMeth(iFld, s2, Test.instanceCount);
        for (i19 = 7; i19 < 153; ++i19) {
            by2 = (byte)i20;
        }
        i21 = 1;
        do {
            for (i22 = 2; i22 < 89; ++i22) {
                Test.instanceCount = Test.instanceCount;
                i24 = 1;
                while (++i24 < 2) {
                    if (Test.bFld) {
                        Test.fFld -= iFld1;
                        iFld1 -= i19;
                        by2 += (byte)iFld;
                        lArr2[i21] = i22;
                    } else if (Test.bFld) {
                        i23 = iFld;
                        Test.instanceCount *= i20;
                    } else if (false) {
                        i20 >>>= by2;
                    } else {
                        Test.lFld <<= 36210;
                        iArr2[i21 + 1] >>= i21;
                        iFld -= iFld;
                    }
                    iFld1 -= s2;
                    iFld1 = iFld;
                    switch ((((i20 >>> 1) % 1) * 5) + 86) {
                    case 91:
                    default:
                        if (false) {
                            iFld += (i24 - iFld);
                            Test.iArrFld[i22] -= iFld1;
                        }
                        fArrFld[i22] = Test.fFld;
                        Test.bFld = Test.bFld;
                        Test.instanceCount *= Test.lFld;
                    }
                    Test.lFld = i23;
                    i23 = (int)dFld;
                    i20 += (-3 + (i24 * i24));
                }
            }
        } while (++i21 < 281);


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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}