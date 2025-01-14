package tests.javafuzzer450;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 04:02:46 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=1911952989598478905L;
    public static int iFld=-49209;
    public static byte byFld=105;
    public static boolean bFld=false;
    public static int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 59120);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i7, int i8) {

        int i9=-157, i10=39, i11=237, i12=-249, iArr1[]=new int[N];
        boolean b=false;
        byte by=-89;
        double dArr[]=new double[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(dArr, -101.82404);
        FuzzerUtils.init(iArr1, 50);
        FuzzerUtils.init(lArr, 2843578787L);

        if (false) {
            i8 <<= 11;
            vMeth2_check_sum += i7 + i8 + i9 + i10 + (b ? 1 : 0) + i11 + i12 + by +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr1) +
                FuzzerUtils.checkSum(lArr);
            return;
        } else if (b) {
            for (double d : dArr) {
                Test.instanceCount = i8;
                iArr1[(16725 >>> 1) % N] = i7;
                for (i9 = 1; i9 < 4; i9++) {
                    lArr[(i8 >>> 1) % N] -= -9;
                    if (true) break;
                    i8 += (i9 * i9);
                }
                if (b) continue;
            }
            i7 -= (int)-93L;
            for (i11 = 18; i11 < 371; ++i11) {
                by += (byte)(i11 * i11);
            }
            Test.instanceCount = Test.instanceCount;
        } else {
            i8 <<= Test.iFld;
        }
        vMeth2_check_sum += i7 + i8 + i9 + i10 + (b ? 1 : 0) + i11 + i12 + by +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(long l1, int i6) {

        double d1=117.65848;
        int i13=24443, i14=7, i15=-20321;
        boolean bArr[][]=new boolean[N][N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(lArr1, 1374602436L);

        vMeth2(Test.iFld, i6);
        Test.iArrFld[(Test.iFld >>> 1) % N][(Test.iFld >>> 1) % N] = (int)d1;
        i13 = 1;
        do {
            bArr[i13][i13] = false;
            Test.iFld |= i6;
            Test.byFld += (byte)(i13 * Test.iFld);
            lArr1[i13 + 1] += Test.iFld;
            Test.instanceCount *= (long)d1;
            for (i14 = i13; 8 > i14; ++i14) {
                if (Test.bFld) {
                    l1 = Test.iFld;
                    i6 -= 4;
                    i6 += (int)Test.instanceCount;
                    i15 += i14;
                } else {
                    Test.iFld = i14;
                }
            }
        } while (++i13 < 203);
        vMeth1_check_sum += l1 + i6 + Double.doubleToLongBits(d1) + i13 + i14 + i15 + FuzzerUtils.checkSum(bArr) +
            FuzzerUtils.checkSum(lArr1);
    }

    public static void vMeth(int i4, int i5) {

        int i16=-63969, i17=-60806, i18=-131, i19=-49809, i20=39592, i21=-4;
        float f1=-116.585F;
        double d2=-31.28140;

        vMeth1(Test.instanceCount, i5);
        Test.iFld += Test.iFld;
        if (Test.bFld) {
            for (i16 = 4; i16 < 362; i16++) {
                i17 = i5;
                Test.iArrFld[i16][i16 - 1] = i16;
                Test.bFld = Test.bFld;
                for (i18 = 1; 5 > i18; i18++) {
                    f1 = f1;
                    d2 -= i19;
                    if (Test.bFld) continue;
                    Test.iFld = (int)Test.instanceCount;
                    for (i20 = 1; i20 < 2; i20++) {
                        Test.byFld *= (byte)i20;
                        Test.iFld = i4;
                    }
                }
            }
        } else {
            Test.bFld = Test.bFld;
        }
        vMeth_check_sum += i4 + i5 + i16 + i17 + i18 + i19 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d2) +
            i20 + i21;
    }

    public void mainTest(String[] strArr1) {

        long l=-2345757853L, l2=-7386L;
        int i1=-7368, i2=-65069, i3=107, i22=59767, iArr[]=new int[N];
        float f=2.873F;
        short s=11596;

        FuzzerUtils.init(iArr, -1464);

        for (int i : iArr) {
            for (l = 3; l < 63; l++) {
                Test.instanceCount *= (long)f;
                for (i2 = 1; 2 > i2; ++i2) {
                    vMeth(Test.iFld, i2);
                    Test.byFld |= (byte)i;
                    try {
                        i1 = (-6500 % Test.iArrFld[i2 - 1][i2]);
                        i3 = (106 % i);
                        i3 = (i % i);
                    } catch (ArithmeticException a_e) {}
                    f = f;
                    i3 <<= i3;
                    i1 = (int)f;
                    f += i2;
                    Test.instanceCount = l;
                    switch ((i2 % 2) + 79) {
                    case 79:
                        Test.instanceCount = -960618020L;
                        i3 |= -33418;
                        Test.byFld += (byte)i;
                        Test.byFld += (byte)(0.142F + (i2 * i2));
                        break;
                    case 80:
                        i1 += 44560;
                        Test.iFld ^= (int)3033880639L;
                        break;
                    }
                    l2 -= l;
                }
                i1 += (int)l;
                Test.instanceCount = Test.byFld;
                iArr[(int)(l)] -= i1;
                f = Test.iFld;
                l2 += s;
                i22 = 1;
                do {
                    Test.bFld = false;
                    Test.iArrFld[(int)(l + 1)][i22 + 1] <<= -27949;
                    i3 = Test.iFld;
                    i1 -= i3;
                } while (++i22 < 2);
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
