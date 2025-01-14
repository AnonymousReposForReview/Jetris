package tests.javafuzzer1454;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 20:57:16 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=0L;
    public static volatile int iFld=22423;
    public static double dFld=-1.118078;
    public byte byFld=83;
    public static boolean bFld=true;
    public static volatile double dArrFld[]=new double[N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.dArrFld, -7.48723);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i2, double d) {

        float f1=0.689F, fArr[]=new float[N];
        long l1=3L;
        int i3=-18670, i4=121, i5=-41592, i6=-12120, i7=-4, i8=-2, iArr1[]=new int[N];
        boolean b=true;

        FuzzerUtils.init(iArr1, 6);
        FuzzerUtils.init(fArr, 73.630F);

        Test.instanceCount *= i2;
        f1 -= -17553;
        for (l1 = 353; l1 > 13; --l1) {
            i4 = 1;
            do {
                for (i5 = i4; i5 < 1; i5++) {
                    Test.instanceCount ^= i6;
                    try {
                        i3 = (iArr1[i5] / 92);
                        i3 = (iArr1[i4] / Test.iFld);
                        i3 = (i3 % i4);
                    } catch (ArithmeticException a_e) {}
                }
                for (i7 = 1; 1 > i7; i7++) {
                    iArr1[i7] -= (int)Test.instanceCount;
                    b = b;
                }
                fArr[(int)(l1 - 1)] -= i5;
                Test.iFld -= (int)Test.instanceCount;
                i6 *= i4;
                i2 = (int)l1;
                Test.iFld += (int)l1;
            } while (++i4 < 5);
        }
        vMeth1_check_sum += i2 + Double.doubleToLongBits(d) + Float.floatToIntBits(f1) + l1 + i3 + i4 + i5 + i6 + i7 +
            i8 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(long l) {

        long l2=-174L, lArr[]=new long[N];
        int i9=-107, i10=112, i11=123, i12=-3, i13=-36974, i14=0;
        double d1=2.71166;
        float f2=2.866F, fArr1[]=new float[N];
        boolean b1=false;

        FuzzerUtils.init(fArr1, 2.71F);
        FuzzerUtils.init(lArr, 54L);

        vMeth1(2, Test.dFld);
        for (l2 = 14; l2 < 375; ++l2) {
            for (d1 = 5; d1 > 1; d1 -= 3) {
                f2 = i10;
            }
            Test.dFld = Test.dFld;
            i9 = Test.iFld;
            for (i11 = 1; i11 < 5; i11++) {
                for (i13 = 1; 2 > i13; ++i13) {
                    if (b1) continue;
                    Test.instanceCount += (i13 | i11);
                    Test.instanceCount = Test.iFld;
                    f2 -= i9;
                    fArr1[i11] -= Test.instanceCount;
                    lArr = lArr;
                    i12 -= -7;
                }
            }
        }
        vMeth_check_sum += l + l2 + i9 + Double.doubleToLongBits(d1) + i10 + Float.floatToIntBits(f2) + i11 + i12 + i13
            + i14 + (b1 ? 1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth(int i, int i1) {


        vMeth(Test.instanceCount);
        long meth_res = i + i1;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f=-2.298F;
        int i15=60155, i16=-19, i17=63158, i18=0, i19=73, i20=34910, i21=-17, iArr[]=new int[N];
        short s=3582;

        FuzzerUtils.init(iArr, -19858);

        iArr[(-47438 >>> 1) % N] = Test.iFld;
        f += iMeth(244, 2);
        Test.dArrFld[(Test.iFld >>> 1) % N] += Test.iFld;
        if (false) {
            i15 = 1;
            while (++i15 < 262) {
                i16 = 1;
                do {
                    Test.instanceCount = Test.instanceCount;
                    i17 = 1;
                    while ((i17 -= 3) > 0) {
                        Test.iFld = (int)Test.instanceCount;
                        iArr = iArr;
                        s += (short)i17;
                        Test.instanceCount -= s;
                    }
                    Test.dArrFld[i16] -= Test.iFld;
                    Test.iFld *= (int)Test.instanceCount;
                    for (i18 = 1; i18 < 1; i18++) {
                        i20 += (i18 * i18);
                        Test.instanceCount >>= i16;
                        byFld += (byte)(i18 * i20);
                        Test.instanceCount += i19;
                        switch ((((i19 >>> 1) % 5) * 5) + 65) {
                        case 73:
                            switch (((i18 % 4) * 5) + 107) {
                            case 115:
                                i19 += i18;
                                break;
                            case 110:
                                byFld = (byte)s;
                                Test.bFld = Test.bFld;
                                break;
                            case 119:
                                Test.dFld += i17;
                                if (Test.bFld) break;
                                f += -83;
                                break;
                            case 118:
                                f *= i16;
                                break;
                            default:
                                iArr[i16] *= i18;
                                lArrFld[i15] *= i19;
                            }
                        case 85:
                            Test.instanceCount += (i18 * i18);
                        case 68:
                            Test.instanceCount -= Test.instanceCount;
                            break;
                        case 90:
                            i19 = (int)-141L;
                        case 87:
                            iArr[i18 - 1] -= i16;
                            break;
                        }
                    }
                } while (++i16 < 96);
            }
        } else if (Test.bFld) {
            i21 = i18;
        } else {
            Test.iFld += (int)f;
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
