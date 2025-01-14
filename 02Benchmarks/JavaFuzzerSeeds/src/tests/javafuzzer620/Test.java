package tests.javafuzzer620;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 06:41:04 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-11L;
    public float fFld=33.115F;
    public static volatile double dFld=-126.78162;
    public static int iArrFld[]=new int[N];
    public static boolean bArrFld[]=new boolean[N];
    public long lArrFld1[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -1);
        FuzzerUtils.init(Test.bArrFld, true);
    }

    public static long lMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long lMeth1_check_sum = 0;

    public static long lMeth1(int i13, long l) {

        float f1=-100.804F;
        int i14=-974, i15=54204, i16=-10, i17=5, i18=8, i19=37;
        short sArr[][]=new short[N][N];

        FuzzerUtils.init(sArr, (short)-30069);

        Test.instanceCount = 8;
        Test.iArrFld[(-4 >>> 1) % N] -= i13;
        Test.instanceCount &= i13;
        f1 -= 156;
        for (i14 = 9; i14 < 304; ++i14) {
            if (i14 != 0) {
            }
            i15 -= (int)-8035683610952734840L;
            for (i16 = 6; i16 > i14; --i16) {
                short s=15891;
                s = (short)i16;
                i13 = (int)f1;
                Test.instanceCount += (long)Test.dFld;
                i15 <<= i17;
                for (i18 = i14; 1 > i18; ++i18) {
                    sArr[i14 + 1][i18] >>= (short)i16;
                    Test.iArrFld = Test.iArrFld;
                }
            }
        }
        long meth_res = i13 + l + Float.floatToIntBits(f1) + i14 + i15 + i16 + i17 + i18 + i19 +
            FuzzerUtils.checkSum(sArr);
        lMeth1_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth1() {

        int i12=138, i20=46851, i21=3, i22=8933, i23=5, i24=-174;
        float f2=-7.207F, fArr[]=new float[N];
        boolean b=false;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 96.9419);
        FuzzerUtils.init(fArr, 49.171F);

        i12 = (int)Math.max((long)((i12 *= i12) * Double.longBitsToDouble(Test.instanceCount)), lMeth1(80,
            Test.instanceCount));
        i12 -= i12;
        for (i20 = 381; i20 > 13; i20 -= 3) {
            Test.dFld += Test.instanceCount;
            i12 = i20;
            dArr[i20] /= (i12 | 1);
            for (f2 = 1; f2 < 13; f2++) {
                for (i23 = 1; i23 < 2; i23++) {
                    Test.bArrFld[(int)(f2 + 1)] = b;
                    i12 += i23;
                    i21 += (i23 * i23);
                    fArr[(int)(f2)] *= i22;
                    Test.instanceCount += i12;
                }
                i21 = (int)Test.instanceCount;
                Test.iArrFld[(int)(f2 - 1)] += i24;
            }
        }
        long meth_res = i12 + i20 + i21 + Float.floatToIntBits(f2) + i22 + i23 + i24 + (b ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(int i10, int i11) {

        int i25=-144, i26=12;
        boolean b1=false;
        float f3=-1.364F;
        double d=-104.31440;
        short s1=-12811;

        iMeth1();
        Test.instanceCount += i11;
        for (i25 = 269; i25 > 9; --i25) {
            if (b1) continue;
            i26 <<= (int)Test.instanceCount;
        }
        Test.iArrFld[(i25 >>> 1) % N] *= 5239;
        Test.instanceCount = i25;
        i10 += (int)f3;
        d = 1;
        do {
            i11 = i11;
            i26 >>>= (int)Test.instanceCount;
        } while (++d < 354);
        Test.instanceCount += i26;
        if (b1) {
            Test.instanceCount += Test.instanceCount;
            s1 += (short)-13L;
        } else if (b1) {
            i10 += i10;
        }
        long meth_res = i10 + i11 + i25 + i26 + (b1 ? 1 : 0) + Float.floatToIntBits(f3) + Double.doubleToLongBits(d) +
            s1;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr3) {

        int i9=189, i27=-1, i28=-2603, i29=147, i30=-6, i31=7686, i32=-9, i33=3, i34=14, i35=-223, i36=-114;
        boolean b2=true;
        byte by=-21;
        short s2=7832;
        double dArr1[][]=new double[N][N];
        float fArr1[]=new float[N];

        FuzzerUtils.init(dArr1, 0.67908);
        FuzzerUtils.init(fArr1, 2.111F);

        i9 += (int)(((i9 - fFld) + i9) * (lMeth(i9, 217) + i9));
        try {
            for (i27 = 13; i27 < 299; ++i27) {
                i28 -= (int)Test.instanceCount;
                Test.iArrFld[i27 - 1] = -8;
                for (i29 = 4; i29 < 88; ++i29) {
                    fFld *= -51;
                    Test.iArrFld[i29] = (int)Test.instanceCount;
                    if (b2) continue;
                    for (i31 = 1; i31 < 2; ++i31) {
                        i32 = (int)Test.dFld;
                        i28 += (i31 * by);
                        i28 = i29;
                        dArr1[i29][i31 + 1] = i30;
                        i9 = i31;
                        Test.instanceCount += i31;
                        i28 += i31;
                        i9 <<= i28;
                    }
                }
                for (i33 = 2; i33 < 88; i33++) {
                    Test.instanceCount += (i33 + i33);
                    s2 += (short)i33;
                    i28 = -56705;
                    switch ((((i33 >>> 1) % 10) * 5) + 21) {
                    case 22:
                        i32 ^= i30;
                        fFld += -90.27F;
                        lArrFld1[i27] -= i27;
                    case 42:
                        for (i35 = i33; i35 < 2; i35++) {
                            Test.iArrFld[i33 + 1] = (int)-8L;
                            i28 += i35;
                        }
                        break;
                    case 52:
                        i34 += (int)Test.dFld;
                    case 62:
                        i36 = i30;
                    case 45:
                        Test.instanceCount += Test.instanceCount;
                        break;
                    case 34:
                        Test.instanceCount = -27053L;
                        break;
                    case 63:
                    case 55:
                        Test.iArrFld[i27] >>= i29;
                        break;
                    case 25:
                        Test.instanceCount += (i33 | i31);
                        break;
                    case 69:
                        fArr1[i27] += by;
                        break;
                    default:
                        by = (byte)fFld;
                    }
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException exc2) {
            Test.instanceCount *= (long)fFld;
        }
        catch (UserDefinedExceptionTest exc3) {
            by = (byte)i9;
        }


    }
    public static void main(String[] strArr2) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr2);
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 lMeth mainTest
//DEBUG  lMeth1 ->  lMeth1 iMeth1 lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
