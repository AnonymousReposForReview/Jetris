package tests.javafuzzer866;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 10:56:05 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-25046L;
    public static float fFld=1.713F;
    public static volatile int iFld=6;
    public static boolean bFld=false;
    public static double dFld=-1.68739;

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(short s) {

        int i2=56598, i3=10, i4=-21000, i5=-56359, iArr[]=new int[N];
        boolean b=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -6);
        FuzzerUtils.init(lArr, 47068L);

        for (int i1 : iArr) {
            i1 = i1;
            if (false) break;
            Test.fFld = i1;
            for (i2 = 1; i2 < 4; ++i2) {
                s += (short)i2;
                i3 += i2;
                lArr[i2 + 1] = i1;
                s += (short)(i2 * i2);
                i3 += (i2 * i2);
                b = b;
            }
            for (i4 = 1; i4 < 4; i4++) {
                Test.instanceCount = i5;
                Test.instanceCount -= Test.instanceCount;
                i5 <<= -2947;
            }
        }
        vMeth1_check_sum += s + i2 + i3 + (b ? 1 : 0) + i4 + i5 + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth() {

        short s1=-8401;
        int i6=38586, i7=13, i8=18448, i9=4, i10=5, iArr1[]=new int[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 17280L);
        FuzzerUtils.init(iArr1, 3);

        vMeth1(s1);
        Test.iFld += (int)Test.instanceCount;
        for (i6 = 19; i6 < 388; ++i6) {
            Test.instanceCount -= i6;
            for (i8 = 1; i8 < 5; ++i8) {
                Test.instanceCount >>= i8;
                i10 += (int)13.101991;
                if (Test.bFld) {
                    Test.iFld = 11;
                    i9 |= Test.iFld;
                    lArr1[i8] = Test.instanceCount;
                }
                iArr1[i8 - 1] = i7;
            }
            iArr1[i6] >>>= Test.iFld;
            if (Test.bFld) continue;
            if (i10 != 0) {
                vMeth_check_sum += s1 + i6 + i7 + i8 + i9 + i10 + FuzzerUtils.checkSum(lArr1) +
                    FuzzerUtils.checkSum(iArr1);
                return;
            }
        }
        vMeth_check_sum += s1 + i6 + i7 + i8 + i9 + i10 + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth(int i) {

        int i11=-13, i12=-5, i13=51907, i14=49, i15=-20173, i16=107, iArr2[]=new int[N];
        byte by=4;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 100.43059);
        FuzzerUtils.init(iArr2, -36536);

        vMeth();
        dArr[(i >>> 1) % N] -= Test.instanceCount;
        for (i11 = 11; i11 < 224; i11++) {
            for (i13 = 1; i13 < 8; ++i13) {
                i = by;
                for (i15 = 1; i15 < 2; ++i15) {
                    i += (i15 ^ Test.instanceCount);
                    i14 = i13;
                    Test.fFld += i15;
                    iArr2[i11 - 1] = 6341;
                }
                Test.dFld -= i14;
                iArr2[i11 + 1] = (int)Test.instanceCount;
                Test.fFld += (i13 * i13);
            }
            Test.iFld -= (int)-4709690361045744359L;
            Test.iFld += i11;
        }
        long meth_res = i + i11 + i12 + i13 + i14 + by + i15 + i16 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i17=42, i18=4, i19=-84, i20=2615, i21=5, iArr3[][]=new int[N][N];
        long lArr2[]=new long[N];

        FuzzerUtils.init(iArr3, -11073);
        FuzzerUtils.init(lArr2, -7522297418087710371L);

        iMeth(Test.iFld);
        for (i17 = 5; i17 < 251; ++i17) {
            i18 += (i17 + i17);
            Test.instanceCount += i17;
            Test.iFld += i17;
            if (Test.bFld) {
                i19 = 1;
                do {
                    for (i20 = i19; i20 < 1; i20 += 3) {
                        switch (((i19 % 7) * 5) + 34) {
                        case 39:
                            Test.instanceCount <<= Test.instanceCount;
                            Test.instanceCount = 2;
                            i18 += (i20 ^ i21);
                            iArr3[i20 - 1][i17 + 1] -= (int)9L;
                        case 43:
                            i18 <<= i21;
                            break;
                        case 67:
                            Test.fFld += (((i20 * i18) + Test.instanceCount) - i17);
                            try {
                                i21 = (14696 / i19);
                                i21 = (60 / i18);
                                i18 = (Test.iFld % -1506020554);
                            } catch (ArithmeticException a_e) {}
                            break;
                        case 60:
                            i18 += (int)(-74.822F + (i20 * i20));
                            break;
                        case 41:
                            if (Test.bFld) break;
                        case 47:
                            Test.instanceCount = Test.instanceCount;
                            Test.fFld *= i18;
                            lArr2[i20] = i18;
                            Test.instanceCount = i17;
                            break;
                        case 57:
                            i18 = i18;
                            Test.instanceCount -= -39;
                            iArr3[i19][i20 + 1] = i19;
                            break;
                        }
                        iArr3[i17 + 1][i17 - 1] = (int)Test.instanceCount;
                        switch (((i17 % 3) * 5) + 26) {
                        case 31:
                            i18 *= 18830;
                            try {
                                iArr3[i17 + 1][i19] = (i21 / -125);
                                i18 = (Test.iFld % i18);
                                i18 = (-38880 % i19);
                            } catch (ArithmeticException a_e) {}
                            break;
                        case 41:
                            i21 += i20;
                            break;
                        case 37:
                            i18 = i20;
                            break;
                        }
                    }
                } while (++i19 < 102);
            } else if (Test.bFld) {
                lArr2 = FuzzerUtils.long1array(N, (long)-37538L);
            } else if (Test.bFld) {
                i21 += (((i17 * i21) + Test.iFld) - Test.fFld);
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