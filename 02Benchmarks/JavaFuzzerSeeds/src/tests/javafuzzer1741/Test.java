package tests.javafuzzer1741;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 02:44:51 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=8L;
    public byte byFld=-71;
    public static float fFld=-13.574F;
    public static volatile short sFld=14749;
    public static double dFld=-4.111517;
    public static boolean bFld=false;
    public static int iFld=1;
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.fArrFld, -1.213F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i10=22051, i11=16192, i12=38270, iArr[]=new int[N];
        long l1=-249L, lArr[]=new long[N];

        FuzzerUtils.init(iArr, -25484);
        FuzzerUtils.init(lArr, 2820563380L);

        Test.fFld /= (i10 | 1);
        l1 = 1;
        do {
            switch ((int)((l1 % 6) + 101)) {
            case 101:
                iArr[(int)(l1)] >>= (int)l1;
                i10 = 90;
                break;
            case 102:
                i10 += i10;
                i11 = 1;
                while (++i11 < 10) {
                    lArr[(int)(l1)] -= i10;
                    i10 = i11;
                    Test.instanceCount += i11;
                    switch ((int)(((l1 % 2) * 5) + 17)) {
                    case 24:
                        iArr[i11 + 1] = Test.sFld;
                    case 20:
                        i12 = 1;
                        while (++i12 < 1) {
                            Test.fFld *= -9;
                            Test.dFld += i10;
                        }
                        break;
                    }
                }
            case 103:
                i10 <<= i10;
                break;
            case 104:
                Test.sFld <<= (short)-2;
                break;
            case 105:
                i10 += i12;
                break;
            case 106:
                Test.instanceCount -= l1;
                break;
            default:
                if (true) continue;
            }
        } while (++l1 < 161);
        long meth_res = i10 + l1 + i11 + i12 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(float f, int i7) {

        int i8=6, i9=19, i14=2, i15=3;
        double d=-2.52321;

        for (i8 = 13; i8 < 396; ++i8) {
            Test.instanceCount = 11540;
        }
        Test.fFld += (iMeth() + Test.instanceCount);
        d = 1;
        while (++d < 364) {
            i9 += (int)d;
            Test.instanceCount >>>= Test.instanceCount;
            for (i14 = 1; i14 < 5; i14++) {
                f += (((i14 * Test.instanceCount) + i7) - i15);
                Test.instanceCount += i14;
                Test.fArrFld[(int)(d)] += -34315;
                i9 = i14;
                if (Test.bFld) break;
                i9 >>= i8;
            }
            Test.instanceCount = -14;
            i15 -= i14;
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + i7 + i8 + i9 + Double.doubleToLongBits(d) + i14 + i15;
    }

    public static void vMeth(long l, short s) {

        int i2=1, i3=-11, i4=58, i5=-23, i6=-1, i16=-39434;

        for (i2 = 6; i2 < 204; ++i2) {
            i4 = 1;
            while (++i4 < 8) {
                i3 -= (int)((-l) - i4);
                i3 = 26;
                for (i5 = i2; i5 < 1; i5++) {
                    Test.fFld = 128;
                }
                vMeth1(-27.235F, i5);
                i3 <<= i5;
                i16 = 1;
                do {
                    if (i3 != 0) {
                        vMeth_check_sum += l + s + i2 + i3 + i4 + i5 + i6 + i16;
                        return;
                    }
                    Test.fFld -= (float)Test.dFld;
                    i6 += (i16 * i3);
                    i3 += (i16 | i16);
                    i6 |= i6;
                    i6 = i6;
                } while (++i16 < 1);
            }
        }
        vMeth_check_sum += l + s + i2 + i3 + i4 + i5 + i6 + i16;
    }

    public void mainTest(String[] strArr1) {

        int i=11, i1=23, i17=22, i18=-83, i19=81, i20=-163, i21=-2, iArr1[]=new int[N];
        float f1=-82.348F;
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr1, 4);
        FuzzerUtils.init(dArr, -1.13228);

        for (i = 8; i < 258; ++i) {
            byFld += (byte)(142L + (i * i));
            byFld <<= (byte)((i1 + (i1--)) * i1);
            vMeth(Test.instanceCount, Test.sFld);
            for (i17 = 1; i17 < 101; ++i17) {
                i1 = 3;
                for (f1 = i; f1 < 2; f1++) {
                    switch (((i18 >>> 1) % 2) + 82) {
                    case 82:
                        i19 = i1;
                        i1 = i;
                        break;
                    case 83:
                        try {
                            i1 = (i / i1);
                            i19 = (i19 / i17);
                            i18 = (i1 / 10833);
                        } catch (ArithmeticException a_e) {}
                        i18 += (int)(((f1 * i18) + i) - i17);
                        i19 += (int)((long)f1 ^ (long)Test.fFld);
                        i18 <<= 68;
                        break;
                    }
                    Test.iFld = i17;
                    Test.fFld = i1;
                }
                iArr1 = iArr1;
                i19 -= (int)f1;
                Test.instanceCount -= i17;
                Test.fFld += i17;
            }
            if (false) continue;
        }
        if (false) {
            Test.instanceCount = 14;
        } else if (Test.bFld) {
            i19 = (int)Test.fFld;
            dArr[(i1 >>> 1) % N] += i;
            i1 = Test.iFld;
        } else if (Test.bFld) {
            for (i20 = 256; i20 > 7; i20--) {
                i1 >>= i18;
                byFld = (byte)-20126;
                iArr1[i20 + 1] -= -10436;
            }
        } else {
            Test.instanceCount -= (long)Test.fFld;
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
