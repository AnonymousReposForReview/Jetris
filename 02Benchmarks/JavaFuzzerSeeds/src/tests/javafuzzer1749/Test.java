package tests.javafuzzer1749;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 03:00:21 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=4L;
    public int iFld=-16480;
    public static boolean bFld=true;
    public double dFld=0.95071;
    public int iFld1=-50622;
    public static float fFld=-1.588F;
    public int iArrFld[]=new int[N];
    public double dArrFld[]=new double[N];

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f1) {

        int i4=-11, i5=-6, i6=19, i7=7, iArr[]=new int[N];
        double d=15.32393, d1=74.57084;

        FuzzerUtils.init(iArr, 184);

        i4 = 1;
        while (++i4 < 160) {
            for (i5 = 1; i5 < 10; ++i5) {
                i6 |= i4;
                iArr[i5 + 1] += i4;
                f1 += (((i5 * i5) + i6) - i5);
                switch (((i5 >>> 1) % 1) + 33) {
                case 33:
                    switch (((i4 >>> 1) % 5) + 3) {
                    case 3:
                        Test.instanceCount *= i5;
                        if (Test.bFld) break;
                        break;
                    case 4:
                        i6 -= i4;
                        for (d = 1; d < 2; d++) {
                            d1 = i7;
                            i6 -= i6;
                            Test.bFld = true;
                            if (Test.bFld) break;
                        }
                        break;
                    case 5:
                        i7 = i6;
                        break;
                    case 6:
                        i7 += (int)Test.instanceCount;
                    case 7:
                        Test.instanceCount += (i5 * i5);
                        break;
                    default:
                        f1 += i5;
                    }
                    break;
                }
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f1) + i4 + i5 + i6 + Double.doubleToLongBits(d) + i7 +
            Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr);
    }

    public void vMeth(long l1, int i3, float f) {

        byte by=121;
        int i8=-27401, i9=5, i10=125, i11=10, i12=14;
        double d2=63.59901;
        short s1=-28142;

        iFld = (int)(by * Test.instanceCount);
        vMeth1(98.178F);
        i3 <<= iFld;
        for (i8 = 345; i8 > 12; --i8) {
            for (d2 = 1; d2 < 5; ++d2) {
                for (i11 = 1; i11 < 2; i11++) {
                    iFld -= -41288;
                    iArrFld[i8] = (int)Test.instanceCount;
                    dFld = i9;
                    s1 = (short)i3;
                    try {
                        i9 = (iFld1 / iFld);
                        iArrFld[(int)(d2 + 1)] = (202 % i3);
                        iArrFld[i8 + 1] = (i9 % i12);
                    } catch (ArithmeticException a_e) {}
                    l1 -= Test.instanceCount;
                    i10 *= (int)Test.instanceCount;
                    Test.instanceCount -= by;
                    i10 <<= i10;
                }
            }
        }
        vMeth_check_sum += l1 + i3 + Float.floatToIntBits(f) + by + i8 + i9 + Double.doubleToLongBits(d2) + i10 + i11 +
            i12 + s1;
    }

    public int iMeth(int i2, short s, long l) {

        int i13=34201, i14=13, i15=10;

        iArrFld[(i2 >>> 1) % N] = (int)(Test.instanceCount + i2);
        i2 = iFld;
        i2 *= (int)(l--);
        vMeth(-8L, i2, Test.fFld);
        iFld1 -= iFld1;
        i13 = 1;
        do {
            Test.fFld = -21612;
            for (i14 = 6; i14 > 1; i14 -= 3) {
                switch (((i13 % 2) * 5) + 102) {
                case 111:
                    l += iFld1;
                    switch ((i13 % 3) + 99) {
                    case 99:
                        iFld /= -11;
                        Test.fFld = (float)dFld;
                        iFld += (i14 ^ i2);
                        break;
                    case 100:
                        i2 += (i14 * i14);
                        break;
                    case 101:
                        Test.instanceCount >>>= i13;
                        break;
                    }
                    break;
                case 105:
                    i2 += (((i14 * i13) + iFld) - iFld);
                }
            }
        } while (++i13 < 276);
        long meth_res = i2 + s + l + i13 + i14 + i15;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-40229, i1=4, i16=17820, i17=-186;
        short s2=24613;
        long l2=2225974829145068468L, lArr[]=new long[N];

        FuzzerUtils.init(lArr, 7665544018574962657L);

        i = 1;
        do {
            i1 = 1;
            do {
                if (Test.bFld) {
                    iFld = ((iFld--) - iMeth(iFld1, s2, 2L));
                    for (l2 = i; l2 < 1; l2++) {
                        if (Test.bFld) {
                            if (Test.bFld) {
                                Test.fFld = iFld;
                                dArrFld[(int)(l2 + 1)] += iFld1;
                                iFld1 *= 12;
                                iFld1 >>= i;
                            }
                            s2 = (short)iFld1;
                        } else if (false) {
                            iFld1 -= iFld1;
                            Test.fFld = 254;
                            if (Test.bFld) {
                                i16 <<= i1;
                                switch ((int)((l2 % 2) + 51)) {
                                case 51:
                                    iFld = s2;
                                    break;
                                case 52:
                                    i16 += (int)(l2 | i16);
                                    iFld -= i16;
                                    Test.fFld += l2;
                                }
                                iFld = iFld;
                            } else if (Test.bFld) {
                                i16 = i;
                                iArrFld[i1 + 1] = (int)-657202563L;
                                Test.instanceCount >>= i;
                            }
                            Test.instanceCount += (115 + (l2 * l2));
                        } else if (false) {
                            lArr[i] -= (long)Test.fFld;
                            Test.instanceCount -= i16;
                            iFld1 += (int)(((l2 * Test.instanceCount) + i17) - l2);
                        } else {
                            i17 >>= iFld1;
                        }
                    }
                } else if (Test.bFld) {
                    if (Test.bFld) break;
                } else {
                    i17 = i1;
                }
            } while (++i1 < 183);
        } while (++i < 137);


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
