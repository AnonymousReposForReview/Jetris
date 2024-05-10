package tests.javafuzzer934;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 11:50:07 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=204L;
    public static volatile float fFld=0.132F;
    public int iFld=12;
    public static int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 0);
        FuzzerUtils.init(Test.fArrFld, -73.745F);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f1, short s, long l) {

        int i4=-4, i5=64875, i6=213, i7=4, i8=2632, i9=-6, i10=-5, i11=20558, i12=13652;
        double d=27.33702, dArr[]=new double[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -8146419846179355098L);
        FuzzerUtils.init(dArr, -1.61016);

        switch (((i4 >>> 1) % 2) + 41) {
        case 41:
            for (i5 = 350; i5 > 11; i5 -= 3) {
                i6 <<= i4;
                l -= Test.instanceCount;
                f1 -= -223;
                lArr[i5 - 1] = i5;
                i4 = i5;
            }
            i6 = i5;
            for (i7 = 5; i7 < 152; i7++) {
                for (i9 = 1; i9 < 11; ++i9) {
                    i11 = 2;
                    do {
                        dArr = dArr;
                        i8 = (int)f1;
                        i12 <<= -36429;
                        d += i5;
                    } while (--i11 > 0);
                }
            }
        case 42:
            i10 *= (int)f1;
            break;
        default:
            Test.iArrFld[(i10 >>> 1) % N] <<= s;
        }
        vMeth1_check_sum += Float.floatToIntBits(f1) + s + l + i4 + i5 + i6 + i7 + i8 + i9 + i10 + i11 + i12 +
            Double.doubleToLongBits(d) + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth() {

        short s1=-23680;
        int i13=-1, i14=2, i15=10, i16=0;
        boolean b=true;

        vMeth1(Test.fFld, s1, Test.instanceCount);
        i13 = 1;
        do {
            i14 = i14;
            i15 = 1;
            do {
                i14 %= (int)(Test.instanceCount | 1);
                i16 -= (int)14L;
                if (i15 != 0) {
                    vMeth_check_sum += s1 + i13 + i14 + i15 + i16 + (b ? 1 : 0);
                    return;
                }
                if (b) continue;
                if (b) break;
                i16 |= i13;
                Test.instanceCount *= i15;
                Test.instanceCount >>= Test.instanceCount;
                Test.instanceCount >>>= Test.instanceCount;
                Test.fFld = Test.fFld;
            } while (++i15 < 7);
            i14 += i13;
        } while (++i13 < 217);
        vMeth_check_sum += s1 + i13 + i14 + i15 + i16 + (b ? 1 : 0);
    }

    public int iMeth() {

        int i17=-55, i18=-115, i19=-17916, i20=-191, i21=195, iArr[]=new int[N];
        byte by=6;

        FuzzerUtils.init(iArr, -11);

        vMeth();
        for (i17 = 4; i17 < 267; i17++) {
            i19 = 1;
            do {
                i18 = (int)Test.instanceCount;
                i18 += i18;
                by -= (byte)Test.instanceCount;
                i18 = 33412;
                iArr = iArr;
                i18 += (i19 * Test.instanceCount);
            } while (++i19 < 6);
            for (i20 = 1; i20 < 6; i20 += 2) {
                Test.instanceCount -= Test.instanceCount;
                i21 += (int)Test.fFld;
                Test.fArrFld[i20 - 1] += 64586;
            }
            i18 <<= i21;
            i18 += (i17 * i17);
        }
        long meth_res = i17 + i18 + i19 + by + i20 + i21 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i1=31162, i2=8, i3=217, i22=-17793, i23=32, i24=39, i25=-57074;
        float f=1.855F;
        short s2=9199;
        byte by1=113, byArr[]=new byte[N];
        double d1=108.66450;
        boolean b1=true;

        FuzzerUtils.init(byArr, (byte)-32);

        for (int i : Test.iArrFld) {
            for (i1 = 1; i1 < 63; ++i1) {
                Test.instanceCount -= (-(i++));
                for (f = i1; f < 2; f++) {
                    i2 = (int)-1.13852;
                    Test.instanceCount = i;
                }
                byArr[i1] <<= (byte)(iMeth() * i1);
                if (false) {
                    for (i22 = 1; i22 < 2; ++i22) {
                        i3 = (int)Test.fFld;
                        switch ((i1 % 9) + 36) {
                        case 36:
                            Test.instanceCount += i22;
                            break;
                        case 37:
                            s2 += (short)i22;
                            i23 += (((i22 * i23) + i24) - by1);
                            i2 -= i23;
                            i23 += by1;
                            break;
                        case 38:
                            try {
                                i2 = (i23 % -62644);
                                i23 = (Test.iArrFld[i22 + 1] / 114);
                                i25 = (i1 / -124);
                            } catch (ArithmeticException a_e) {}
                            byArr[i1 + 1] = (byte)i25;
                            break;
                        case 39:
                            i3 = i25;
                            break;
                        case 40:
                            Test.instanceCount >>= Test.instanceCount;
                            i2 = i24;
                            i23 += (i22 * i23);
                            d1 += i2;
                        case 41:
                            Test.instanceCount += (12 + (i22 * i22));
                            i25 += (24832 + (i22 * i22));
                            break;
                        case 42:
                            d1 += f;
                            if (false) {
                                Test.fFld = (float)d1;
                            } else if (b1) {
                                i23 -= iFld;
                            } else {
                                i *= (int)27.846F;
                            }
                            break;
                        case 43:
                            i24 = (int)Test.instanceCount;
                            break;
                        case 44:
                            Test.fFld += (i22 - i);
                            break;
                        }
                    }
                } else if (b1) {
                    d1 -= d1;
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
