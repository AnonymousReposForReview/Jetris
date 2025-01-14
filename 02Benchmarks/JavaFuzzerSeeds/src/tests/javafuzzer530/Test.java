package tests.javafuzzer530;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 05:18:00 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=5L;
    public static byte byFld=-91;
    public static double dFld=22.47926;
    public float fFld=1.256F;
    public static volatile short sFld=6652;
    public static boolean bFld=false;
    public static int iFld=5061;
    public static int iArrFld[][]=new int[N][N];
    public int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -210);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(double d) {

        float f=114.973F;
        int i3=4, i4=-9, i5=11, i6=118, i7=-3123, i8=-53769, i9=24798, i10=-108, i11=-3, iArr[]=new int[N];
        long l1=8492433628190794363L;

        FuzzerUtils.init(iArr, 3);

        f = i3;
        Test.instanceCount *= i3;
        for (i4 = 3; i4 < 294; ++i4) {
            iArr[i4 - 1] += i3;
            i5 = i5;
            i5 = i5;
        }
        for (l1 = 4; l1 < 313; ++l1) {
            for (i7 = (int)(l1); i7 < 5; ++i7) {
                for (i9 = i7; i9 < 1; ++i9) {
                    i3 >>= (int)l1;
                    i10 = 20796;
                    i11 = (int)Test.instanceCount;
                }
                i3 >>= Test.byFld;
                if (i6 != 0) {
                    vMeth2_check_sum += Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i3 + i4 + i5 + l1 + i6 +
                        i7 + i8 + i9 + i10 + i11 + FuzzerUtils.checkSum(iArr);
                    return;
                }
                i8 = (int)Test.instanceCount;
            }
        }
        vMeth2_check_sum += Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i3 + i4 + i5 + l1 + i6 + i7 + i8 +
            i9 + i10 + i11 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(int i2) {

        int i12=158, i13=-27;
        float f1=0.509F, f2=0.454F;
        short s=-12532;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 127.85245);

        vMeth2(Test.dFld);
        dArr[(i2 >>> 1) % N] -= Test.dFld;
        switch (((i2 >>> 1) % 1) + 126) {
        case 126:
            i12 = 1;
            do {
                i2 >>>= -73;
                for (f1 = 1; f1 < 12; f1++) {
                    Test.instanceCount = 7310;
                    f2 += (((f1 * i12) + Test.instanceCount) - i2);
                    i2 >>= -89;
                    i2 += (int)(f1 - i2);
                }
                i2 *= (int)-3721305122L;
                i13 &= i13;
                i13 = -4287;
                i2 += -7;
                i13 += (i12 | s);
            } while (++i12 < 133);
            break;
        default:
            i2 += i12;
        }
        vMeth1_check_sum += i2 + i12 + Float.floatToIntBits(f1) + i13 + Float.floatToIntBits(f2) + s +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void vMeth(int i1, long l) {

        int i14=-21, i15=-2, i16=14, i17=-13, iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, -2);

        vMeth1(i1);
        try {
            i1 *= (int)Test.instanceCount;
            fFld += Test.sFld;
            for (i14 = 8; 164 > i14; i14++) {
                i1 *= i14;
                for (i16 = 1; i16 < 10; ++i16) {
                    i15 = i15;
                    Test.instanceCount += i15;
                    Test.iArrFld[i16][i14 + 1] >>= i15;
                    fFld = -27941;
                }
                Test.instanceCount ^= 4L;
                Test.dFld /= ((long)(Test.dFld) | 1);
                Test.instanceCount = i17;
                i15 = (int)Test.dFld;
            }
        }
        catch (UserDefinedExceptionTest exc1) {
            Test.dFld -= Test.instanceCount;
        }
        finally {
            l = Test.instanceCount;
        }
        vMeth_check_sum += i1 + l + i14 + i15 + i16 + i17 + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=9210, i20=-13, i21=171, i22=54055, i23=-11, i24=-6;
        double d1=-90.55093;

        i = 1;
        do {
            vMeth(i, Test.instanceCount);
            Test.dFld -= Test.byFld;
            if (Test.bFld) continue;
            if (Test.bFld) continue;
            i20 = 1;
            while (++i20 < 101) {
                byte by=-27;
                i21 &= (int)Test.instanceCount;
                i21 += (((i20 * Test.iFld) + Test.instanceCount) - i);
                switch ((i20 % 10) + 69) {
                case 69:
                    Test.iFld = (int)Test.dFld;
                    i21 += i;
                    d1 = 1;
                    do {
                        Test.instanceCount = i21;
                        Test.iFld -= i21;
                    } while (--d1 > 0);
                case 70:
                case 71:
                    for (i22 = 1; 1 > i22; i22++) {
                        Test.iFld += (int)(-5231635441560576553L + (i22 * i22));
                        Test.instanceCount = 8L;
                        switch ((((i22 >>> 1) % 2) * 5) + 108) {
                        case 112:
                            i23 += (int)(2.225F + (i22 * i22));
                            i21 = 169;
                            break;
                        case 117:
                            i24 += (((i22 * i22) + i22) - fFld);
                            break;
                        default:
                            Test.dFld = Test.instanceCount;
                            Test.instanceCount *= 10310;
                            try {
                                i21 = (241 / Test.iFld);
                                i24 = (-4696 % i23);
                                i21 = (-55732 % i22);
                            } catch (ArithmeticException a_e) {}
                        }
                        Test.instanceCount += (long)fFld;
                        fFld *= Test.instanceCount;
                        switch ((i % 10) + 7) {
                        case 7:
                            Test.instanceCount <<= -29268;
                            if (Test.bFld) continue;
                            break;
                        case 8:
                            i21 += (i22 * i20);
                        case 9:
                            i21 >>= i22;
                        case 10:
                            iArrFld1 = Test.iArrFld[i20];
                        case 11:
                            Test.instanceCount += 1;
                            break;
                        case 12:
                            i23 += i22;
                        case 13:
                            Test.bFld = Test.bFld;
                            break;
                        case 14:
                        case 15:
                            Test.instanceCount = Test.instanceCount;
                            break;
                        case 16:
                            iArrFld1[i22 + 1] = i;
                            break;
                        }
                    }
                    break;
                case 72:
                    Test.sFld = (short)i;
                    break;
                case 73:
                    i23 -= i24;
                    break;
                case 74:
                    Test.instanceCount += (((i20 * i23) + i24) - Test.instanceCount);
                    break;
                case 75:
                    Test.instanceCount += (i20 | Test.byFld);
                    break;
                case 76:
                    by += (byte)(i20 ^ i20);
                    break;
                case 77:
                    Test.instanceCount += i24;
                    break;
                case 78:
                    i24 += i24;
                    break;
                default:
                    if (false) break;
                }
            }
        } while (++i < 248);


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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
