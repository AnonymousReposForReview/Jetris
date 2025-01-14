package tests.javafuzzer161;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 23:12:02 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=121L;
    public static float fFld=-2.779F;
    public static float fFld1=51.42F;
    public short sFld=-5236;
    public static byte byFld=-106;
    public double dFld=2.11925;
    public int iFld=10;
    public volatile int iFld1=-25975;
    public int iArrFld[]=new int[N];
    public static short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)21521);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1() {

        int i5=-9, i6=-3, i7=4837, i8=0, i9=94, i10=-48, i11=4, iArr[]=new int[N];
        double d=-1.24901;

        FuzzerUtils.init(iArr, -202);

        Test.instanceCount >>= Test.instanceCount;
        for (i5 = 13; 218 > i5; i5 += 2) {
            try {
                i6 = (i6 % -58);
                i6 = (i5 % i5);
                i6 = (i5 / -56);
            } catch (ArithmeticException a_e) {}
            for (i7 = 1; i7 < 15; ++i7) {
                for (i9 = 1; i9 < 2; ++i9) {
                    i6 -= i10;
                    switch ((((i5 >>> 1) % 4) * 5) + 2) {
                    case 20:
                        i10 += (i9 ^ i7);
                        switch (((i9 % 6) * 5) + 92) {
                        case 110:
                            Test.instanceCount ^= i5;
                            i8 = (int)-8821736200750266360L;
                            i8 *= i9;
                        case 121:
                            i10 += (i9 + i11);
                            i6 += i5;
                            Test.instanceCount |= i7;
                            break;
                        case 105:
                            i11 = -49778;
                            break;
                        case 111:
                            i8 -= 194;
                            break;
                        case 101:
                            iArr[i9] = (int)Test.instanceCount;
                            break;
                        case 102:
                            i6 += i9;
                        default:
                            i8 = i9;
                        }
                        break;
                    case 21:
                        iArr = iArr;
                        break;
                    case 17:
                        d -= Test.fFld;
                        break;
                    case 22:
                    }
                }
            }
        }
        long meth_res = i5 + i6 + i7 + i8 + i9 + i10 + i11 + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth(int i4) {

        int i12=10, i13=-2, i14=0, i15=-202, i16=-8;
        float f=-116.21F;
        double d1=0.78144;

        Test.fFld1 = ((Test.fFld1 - (i4 - i4)) + ((Test.fFld += 10) - iMeth1()));
        for (i12 = 16; 392 > i12; ++i12) {
            i4 += (i12 * i12);
            i13 -= 2;
            for (f = i12; f < 4; f++) {
                for (i15 = 1; i15 < 1; ++i15) {
                    i13 *= (int)1.957F;
                    Test.instanceCount = Test.instanceCount;
                    try {
                        i14 = (i15 % i16);
                        iArrFld[(int)(f + 1)] = (i13 / 15696);
                        i4 = (i14 / i4);
                    } catch (ArithmeticException a_e) {}
                    sFld = (short)Test.instanceCount;
                    Test.sArrFld[i15 + 1] = (short)i12;
                    i4 = i12;
                    d1 *= i12;
                    i13 -= (int)Test.instanceCount;
                    iArrFld[i12 - 1] += Test.byFld;
                }
            }
        }
        long meth_res = i4 + i12 + i13 + Float.floatToIntBits(f) + i14 + i15 + i16 + Double.doubleToLongBits(d1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth(long l, int i1) {

        int i2=-242, i3=115, i17=-45982, i18=241, i19=-202, i20=97, i21=-152, i22=11786;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -3152659309L);

        for (i2 = 2; 320 > i2; i2++) {
            i1 = (int)(((Test.fFld * i1) * (-(0 * (i3 - i1)))) + (i1--));
            lArr[i2 - 1] -= (-(iMeth(i1) + i2));
        }
        iArrFld[(i1 >>> 1) % N] -= 8;
        for (i17 = 11; i17 < 293; ++i17) {
            for (i19 = i17; i19 < 6; ++i19) {
                iArrFld = iArrFld;
                dFld *= Test.instanceCount;
                for (i21 = 1; 1 < i21; i21 -= 3) {
                    i22 *= i18;
                    i1 += (i21 ^ iFld);
                }
            }
            i18 += (int)-2792929777L;
            i18 = i21;
            i22 += sFld;
            Test.fFld -= i21;
        }
        vMeth_check_sum += l + i1 + i2 + i3 + i17 + i18 + i19 + i20 + i21 + i22 + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i=1571, i23=81, i24=-26574, i25=-7, i26=0, i27=189, i28=-50;
        double d2=94.122871;
        boolean b1=true;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -1.731F);

        i = 1;
        while ((i += 2) < 235) {
            vMeth(Test.instanceCount, i);
            Test.instanceCount += i;
            if (b1) {
                iFld += (i + i);
                for (i23 = 214; i23 > 12; i23 -= 2) {
                    switch ((i23 % 2) + 98) {
                    case 98:
                        i24 += (i23 * i23);
                        break;
                    case 99:
                        iFld += (((i23 * i) + Test.instanceCount) - Test.fFld);
                        break;
                    default:
                        Test.instanceCount <<= 62;
                        i24 &= i;
                    }
                    i24 = iFld1;
                    switch (((iFld1 >>> 1) % 2) + 111) {
                    case 111:
                        for (i25 = 1; i25 < 3; ++i25) {
                            d2 = -80.661F;
                        }
                        break;
                    case 112:
                        d2 += iFld1;
                        break;
                    }
                    Test.instanceCount += i24;
                    for (i27 = i; i27 < 3; ++i27) {
                        boolean b=false;
                        i26 += i27;
                        iArrFld[i] += i25;
                        if (b) break;
                        i24 >>= i26;
                        iFld1 *= i28;
                    }
                    i28 <<= iFld;
                }
                iArrFld[i + 1] -= (int)Test.fFld1;
                Test.fFld1 += (((i * iFld) + Test.instanceCount) - i26);
            } else {
                i28 >>= iFld1;
                if (b1) break;
                Test.byFld += (byte)i26;
                fArr[i - 1] -= Test.instanceCount;
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
