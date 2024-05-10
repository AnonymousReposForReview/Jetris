package tests.javafuzzer501;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 04:41:44 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-58201L;
    public static float fFld=-1.541F;
    public static int iFld=-12;
    public static boolean bFld=false;
    public static boolean bArrFld[][]=new boolean[N][N];

    static {
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(long l1) {

        double d1=1.130926;
        long l2=4667424076090196053L, lArr[]=new long[N];
        int i9=-51304, i10=-54686, i11=-75, i12=-15673, iArr2[]=new int[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr2, 10);
        FuzzerUtils.init(lArr, -1801L);
        FuzzerUtils.init(fArr, -62.992F);

        Test.iFld -= Test.iFld;
        iArr2[(-62756 >>> 1) % N] -= (int)d1;
        d1 = Test.iFld;
        lArr[(Test.iFld >>> 1) % N] = l1;
        Test.iFld += (int)Test.fFld;
        Test.iFld -= (int)-8.77982;
        for (l2 = 18; l2 < 290; ++l2) {
            iArr2[(int)(l2 - 1)] -= i9;
            i10 = 1;
            do {
                fArr[(int)(l2 + 1)] = Test.fFld;
                Test.iFld = -38677;
                Test.fFld += l2;
                for (i11 = 1; i11 < 1; ++i11) {
                    i9 += i11;
                    try {
                        i9 = (i9 % 63);
                        Test.iFld = (49893 / i12);
                        i9 = (i12 / -48601);
                    } catch (ArithmeticException a_e) {}
                }
            } while (++i10 < 6);
        }
        long meth_res = l1 + Double.doubleToLongBits(d1) + l2 + i9 + i10 + i11 + i12 + FuzzerUtils.checkSum(iArr2) +
            FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1(double d) {

        int i5=12, i6=12012, i7=213, i8=42119, i13=8;
        byte by1=75;
        short s=-19795;

        for (i5 = 12; i5 < 359; ++i5) {
            switch (((i5 % 1) * 5) + 83) {
            case 87:
            }
            for (i7 = 1; i7 < 5; ++i7) {
                by1 += (byte)(((i7 * i8) + Test.instanceCount) - by1);
                Test.instanceCount -= by1;
                d = ((-d) * lMeth(Test.instanceCount));
                i8 *= (int)1.26F;
            }
            s = (short)i6;
            Test.iFld -= i8;
            Test.instanceCount -= Test.iFld;
            i13 = 1;
            do {
                Test.instanceCount &= Test.instanceCount;
                Test.fFld = 1;
                Test.iFld = 43943;
                i6 += i13;
            } while (++i13 < 5);
        }
        vMeth1_check_sum += Double.doubleToLongBits(d) + i5 + i6 + i7 + i8 + by1 + s + i13;
    }

    public static void vMeth(long l, int i4) {

        double d2=-1.18806;
        int i14=-6, i15=23, iArr1[]=new int[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr1, 14);
        FuzzerUtils.init(lArr1, -2524214491094433663L);

        iArr1 = iArr1;
        vMeth1(d2);
        Test.iFld += (int)d2;
        Test.instanceCount *= l;
        switch (((i4 >>> 1) % 8) + 58) {
        case 58:
            for (i14 = 3; i14 < 267; ++i14) {
                boolean b=true;
                Test.fFld = i4;
                Test.iFld >>>= (int)l;
                iArr1[i14 + 1] -= (int)5.63676;
                iArr1[i14 + 1] <<= (int)l;
                Test.iFld *= (int)Test.fFld;
                Test.iFld += i14;
                if (b) {
                    Test.fFld -= Test.instanceCount;
                    i4 *= i4;
                } else {
                    i15 += (i14 * i14);
                }
            }
        case 59:
            iArr1[(2 >>> 1) % N] *= (int)-3835421158L;
            break;
        case 60:
            d2 = i4;
            break;
        case 61:
            lArr1 = lArr1;
            break;
        case 62:
            iArr1[(i14 >>> 1) % N] -= i4;
            break;
        case 63:
            Test.bFld = Test.bFld;
            break;
        case 64:
            Test.iFld = 5;
            break;
        case 65:
            i4 = Test.iFld;
            break;
        }
        vMeth_check_sum += l + i4 + Double.doubleToLongBits(d2) + i14 + i15 + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(lArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=-144, i1=59974, i2=18932, i3=227, i16=32237, i17=-27104, i18=-7, i19=-56083, i20=21560, iArr[][]=new
            int[N][N];
        byte by=-125;
        double d3=52.65653, d4=-1.84764;
        long lArr2[]=new long[N];

        FuzzerUtils.init(iArr, 15181);
        FuzzerUtils.init(lArr2, 73L);

        for (i = 16; i < 353; ++i) {
            if (Test.bFld) {
                i1 = (iArr[(i >>> 1) % N][i - 1]++);
                i1 += (i - i1);
                for (i2 = 75; i2 > 4; --i2) {
                    by += (byte)(i2 + Test.fFld);
                    vMeth(Test.instanceCount, i1);
                }
            } else if (Test.bFld) {
                i1 <<= by;
                i3 >>= 13;
                Test.iFld = i3;
                Test.bArrFld[i][i + 1] = Test.bFld;
            }
            i3 &= i2;
            i3 += i;
            i1 = (int)Test.instanceCount;
            for (i16 = 75; i16 > 4; --i16) {
                Test.iFld += i16;
                i3 = i16;
                for (i18 = 1; i18 < 2; ++i18) {
                    Test.instanceCount -= i3;
                    try {
                        i17 = (i19 / -60);
                        i17 = (25142 % i19);
                        i1 = (i19 / iArr[i18 + 1][i18]);
                    } catch (ArithmeticException a_e) {}
                    i19 *= i19;
                    lArr2[i18] += i19;
                    i19 = (int)-2.82973;
                }
                Test.fFld += (i16 * i16);
                Test.fFld += i17;
                for (d3 = 1; d3 < 2; ++d3) {
                    if (Test.bFld) continue;
                    by >>= (byte)34400L;
                    Test.bFld = Test.bFld;
                    d4 = i1;
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
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
