package tests.javafuzzer1691;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 01:44:40 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=20605L;
    public static float fFld=-67.794F;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -67);
        FuzzerUtils.init(Test.lArrFld, -6497628037975661454L);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static int iMeth() {

        int i4=34;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -903L);

        Test.fFld = (lArr[(i4 >>> 1) % N] * i4);
        long meth_res = i4 + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i5) {

        int i6=0, i7=29662, i8=-42164, i9=78, i10=14, i11=-8;
        boolean b1=false;
        short s=15333;
        double d1=2.62439, dArr[]=new double[N];
        byte by=38;

        FuzzerUtils.init(dArr, 0.100470);

        for (i6 = 24; i6 < 398; ++i6) {
            Test.iArrFld[i6 - 1] = (int)-38673L;
            i5 *= (int)21.5270;
            for (i8 = 1; i8 < 5; i8++) {
                if (b1) continue;
                i9 = i9;
                for (i10 = 1; i10 < 2; ++i10) {
                    i9 += (int)(0.181F + (i10 * i10));
                    i5 >>= s;
                    switch (((148 >>> 1) % 9) + 74) {
                    case 74:
                        if (i5 != 0) {
                            vMeth1_check_sum += i5 + i6 + i7 + i8 + i9 + (b1 ? 1 : 0) + i10 + i11 + s +
                                Double.doubleToLongBits(d1) + by + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                            return;
                        }
                        s |= (short)Test.instanceCount;
                        d1 = i9;
                        break;
                    case 75:
                        dArr = dArr;
                        i11 = i9;
                        break;
                    case 76:
                        Test.iArrFld[i10 + 1] >>>= i5;
                        break;
                    case 77:
                        i9 <<= i11;
                        break;
                    case 78:
                        i9 <<= i11;
                    case 79:
                        i11 *= (int)Test.fFld;
                        break;
                    case 80:
                        by *= (byte)i6;
                        break;
                    case 81:
                        by = (byte)1.523F;
                        break;
                    case 82:
                        i5 <<= (int)-10L;
                    default:
                        i7 >>= i10;
                    }
                }
            }
        }
        vMeth1_check_sum += i5 + i6 + i7 + i8 + i9 + (b1 ? 1 : 0) + i10 + i11 + s + Double.doubleToLongBits(d1) + by +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static double dMeth(boolean b) {

        int i12=-5, i13=246, i14=-22, i15=47, i16=-188;
        byte by1=29;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 2.144F);

        vMeth1(-13);
        fArr[(i12 >>> 1) % N] -= 7;
        for (i13 = 1; i13 < 133; i13++) {
            i14 += i13;
        }
        Test.instanceCount *= i12;
        i15 <<= i14;
        by1 += (byte)Test.fFld;
        i14 |= i12;
        try {
            i14 = i15;
            i16 = 1;
            do {
                i15 = (int)Test.instanceCount;
                fArr[i16 - 1] += 49951;
                i14 = (int)Test.instanceCount;
                i12 = i16;
            } while (++i16 < 166);
        }
        catch (UserDefinedExceptionTest exc1) {
            Test.instanceCount += i16;
        }
        finally {
            Test.lArrFld[(i15 >>> 1) % N] = i13;
        }
        long meth_res = (b ? 1 : 0) + i12 + i13 + i14 + i15 + by1 + i16 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth(int i, int i1, double d) {

        int i2=-10, i3=242, i17=-145, i18=11, i19=65, i20=53333, i21=-57039;
        boolean b2=false;
        byte by2=71;
        short s1=28546;
        float fArr1[]=new float[N];

        FuzzerUtils.init(fArr1, 0.216F);

        for (i2 = 22; i2 < 372; i2++) {
            try {
                i1 = (-1463174013 / i);
                i1 = (i3 / -122);
                i3 = (48 / i3);
            } catch (ArithmeticException a_e) {}
            d = (Test.fFld - ((11 + (Test.fFld += -5)) - iMeth()));
            Test.instanceCount *= (i - i1);
            i3 += (--i);
            i3 += i2;
            i3 += (int)(((d * Test.instanceCount) + (i1 -= -95)) - ((-182 * (96 - dMeth(b2))) - Test.instanceCount));
            i3 = i2;
        }
        if (b2) {
            for (i17 = 5; 138 > i17; i17++) {
                for (i19 = 12; i19 > 1; i19 -= 3) {
                    i /= (int)(by2 | 1);
                    i21 = 1;
                    while (++i21 < 4) {
                        i3 += (i21 ^ i19);
                        i20 = i19;
                    }
                }
            }
        } else if (b2) {
            i20 *= i18;
        } else {
            i = s1;
        }
        vMeth_check_sum += i + i1 + Double.doubleToLongBits(d) + i2 + i3 + (b2 ? 1 : 0) + i17 + i18 + i19 + i20 + by2 +
            i21 + s1 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public void mainTest(String[] strArr1) {

        int i23=-1, i24=33853, i25=45529, i26=-5, i27=-48173, i28=-208, i29=85, i30=62415, i31=2, i32=38, i33=13,
            i34=-35658;
        double d2=67.6921;
        boolean b3=false;
        short s2=24179;
        byte by3=-34;

        vMeth(i23, i23, d2);
        i23 = (int)Test.instanceCount;
        i23 -= (int)Test.fFld;
        for (i24 = 10; i24 < 273; ++i24) {
            for (i26 = 2; i26 < 96; ++i26) {
                i23 = i24;
            }
            Test.iArrFld[i24] = i27;
            Test.instanceCount += Test.instanceCount;
            b3 = b3;
            s2 = (short)-58735;
            by3 += (byte)(((i24 * i24) + s2) - i27);
            i25 += (int)Test.instanceCount;
            d2 += -65162;
        }
        i27 += i24;
        for (i28 = 280; i28 > 4; --i28) {
            for (i30 = 3; 91 > i30; i30++) {
                s2 -= (short)d2;
            }
            Test.iArrFld[(i30 >>> 1) % N] += i28;
            by3 = (byte)i26;
            i23 -= (int)Test.instanceCount;
            i32 = 1;
            while (++i32 < 91) {
                b3 = b3;
                for (i33 = 1; i33 < 1; ++i33) {
                    i34 += i29;
                    i25 <<= 158;
                    Test.instanceCount = (long)Test.fFld;
                    Test.iArrFld[i32 - 1] *= (int)1.720F;
                    i29 = -52770;
                    i34 /= (int)((long)(d2) | 1);
                    Test.instanceCount += (((i33 * i32) + i33) - i23);
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
class UserDefinedExceptionTest extends RuntimeException {
    public int field;
}

//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  dMeth ->  dMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 dMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
