package tests.javafuzzer1672;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 01:18:21 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=1L;
    public volatile int iFld=-211;
    public static double dFld=-97.121158;
    public boolean bFld=true;
    public static float fFld=27.726F;
    public static int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 60859);
        FuzzerUtils.init(Test.dArrFld, 43.38343);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;

    public static int iMeth2(int i7, int i8) {

        int i9=-232, i10=-33753, i11=-10899, i12=23034;
        float f1=0.796F;
        boolean b=true;
        long lArr[]=new long[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(lArr, -54L);
        FuzzerUtils.init(byArr, (byte)126);

        lArr = lArr;
        for (double d1 : Test.dArrFld) {
            for (i9 = 1; i9 < 4; ++i9) {
                i8 *= (int)f1;
                byArr[i9] = (byte)i7;
                for (i11 = 1; i11 < 2; i11 += 2) {
                    i10 = i11;
                    Test.instanceCount %= 20096;
                    i10 *= i8;
                    if (b) break;
                    i10 = 7646;
                    i7 += (i11 - i8);
                }
                lArr[i9] = i7;
                i10 *= i7;
                i8 = -33308;
            }
        }
        long meth_res = i7 + i8 + i9 + i10 + Float.floatToIntBits(f1) + i11 + i12 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(byArr);
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth1(float f) {

        long l1=-3755333480L;
        int i5=-20789, i6=-11, i13=180, i14=-19137, i15=29615;

        for (l1 = 14; 356 > l1; ++l1) {
            Test.dFld -= ((i6 += Math.abs(iFld)) - l1);
            iFld <<= (iMeth2(i5, iFld) + iFld);
            Test.instanceCount += l1;
            i6 -= 0;
            i5 = (int)Test.instanceCount;
            if (false) {
                for (i13 = 5; i13 > 1; --i13) {
                    i6 += i15;
                }
                iFld += (int)(l1 * l1);
            } else if (bFld) {
                Test.iArrFld[(int)(l1)] = (int)f;
                iFld = 13;
                Test.dFld = -110.91417;
                iFld += (int)(l1 * l1);
            } else if (bFld) {
                bFld = bFld;
            }
        }
        long meth_res = Float.floatToIntBits(f) + l1 + i5 + i6 + i13 + i14 + i15;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth(long l, int i) {

        double d=56.11866;
        int i1=-11, i2=8055, i3=47624, i4=3;
        float fArr[][]=new float[N][N];
        long lArr1[][]=new long[N][N];

        FuzzerUtils.init(fArr, -97.928F);
        FuzzerUtils.init(lArr1, -8521L);

        i -= (int)fArr[(iFld >>> 1) % N][(iFld >>> 1) % N];
        d = 1;
        while (++d < 124) {
            for (i1 = 1; i1 < 13; ++i1) {
                i2 += (++i);
                for (i3 = 1; 2 > i3; i3++) {
                    Test.iArrFld[i1 + 1] *= Integer.reverseBytes(Test.iArrFld[i1 + 1]);
                    if (bFld) {
                        i4 = (Math.max(iMeth1(Test.fFld), i1) - i3);
                        lArr1[i3][i3 + 1] *= (long)98.8F;
                        i4 = (int)6L;
                        Test.iArrFld[i3 + 1] = i2;
                    } else {
                        l &= l;
                        Test.dFld += i4;
                        Test.instanceCount += l;
                        iFld = (int)25.699F;
                    }
                }
            }
        }
        long meth_res = l + i + Double.doubleToLongBits(d) + i1 + i2 + i3 + i4 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i16=-208, i17=9, i18=64, i19=-90, i20=2, i21=-57174, i22=-4, i23=16313;
        byte by=-1;

        iFld -= (-(iMeth(Test.instanceCount, iFld) + i16));
        i16 = (int)Test.instanceCount;
        i17 = 1;
        do {
            i18 += (i17 * Test.fFld);
            Test.instanceCount = Test.instanceCount;
            if (bFld) continue;
            Test.iArrFld[i17] = i17;
            for (i19 = 187; 1 < i19; i19 -= 3) {
                float f2=0.640F;
                by += (byte)f2;
                by -= (byte)-17414;
                i18 += i19;
                i16 -= (int)Test.instanceCount;
                bFld = bFld;
            }
            for (i21 = 187; i21 > 4; --i21) {
                i16 += (i21 * i21);
                i23 = 2;
                while (--i23 > 0) {
                    iFld ^= i22;
                    switch ((i17 % 2) + 44) {
                    case 44:
                        i16 += (i23 * i23);
                        Test.fFld -= -1.320F;
                    case 45:
                        Test.dFld += i17;
                        Test.iArrFld[i23 + 1] = (int)Test.fFld;
                        Test.fFld = Test.instanceCount;
                        break;
                    default:
                        Test.instanceCount += i23;
                        if (bFld) {
                            Test.instanceCount = 13;
                            iFld -= (int)Test.instanceCount;
                        } else if (bFld) {
                            bFld = bFld;
                            i20 += (int)Test.instanceCount;
                            i16 += (i23 + i20);
                        }
                    }
                }
            }
        } while (++i17 < 134);



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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  iMeth2 ->  iMeth2 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}