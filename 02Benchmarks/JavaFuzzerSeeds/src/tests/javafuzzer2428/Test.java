package tests.javafuzzer2428;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 14:23:29 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=60070L;
    public static volatile double dFld=0.25373;
    public static volatile int iFld=-16012;
    public static boolean bFld=false;
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 0.645F);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l1, short s1) {

        double dArr[][]=new double[N][N];

        FuzzerUtils.init(dArr, -33.56570);

        dArr[(-240 >>> 1) % N][(Test.iFld >>> 1) % N] = Test.iFld;
        Test.iFld = (int)Test.dFld;
        Test.iFld = Test.iFld;
        vMeth1_check_sum += l1 + s1 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth(float f2) {

        long l=3753102030L;
        int i2=11, i3=0, i4=-29, i5=13, i6=-6, iArr[]=new int[N];
        short s=21168;
        boolean b=false;

        FuzzerUtils.init(iArr, -251);

        Test.fArrFld = (Test.fArrFld = (Test.fArrFld = (Test.fArrFld = FuzzerUtils.float1array(N, (float)92.858F))));
        switch ((((--iArr[(Test.iFld >>> 1) % N]) >>> 1) % 2) + 105) {
        case 105:
            for (l = 355; l > 6; l -= 2) {
                Test.instanceCount += (-Test.iFld);
                f2 -= (iArr[(int)(l)]++);
                Test.iFld = (Test.iFld - (i2 + s));
                if (b) {
                    vMeth1(Test.instanceCount, s);
                }
                for (i3 = 1; i3 < 9; ++i3) {
                    iArr[(int)(l - 1)] += (int)Test.instanceCount;
                    for (i5 = 1; i5 < 2; ++i5) {
                        if (Test.iFld != 0) {
                            vMeth_check_sum += Float.floatToIntBits(f2) + l + i2 + s + (b ? 1 : 0) + i3 + i4 + i5 + i6
                                + FuzzerUtils.checkSum(iArr);
                            return;
                        }
                        Test.instanceCount = (long)f2;
                        s += (short)i4;
                        Test.instanceCount += (((i5 * f2) + i6) - Test.instanceCount);
                    }
                }
            }
            break;
        case 106:
            i6 -= i2;
            break;
        }
        vMeth_check_sum += Float.floatToIntBits(f2) + l + i2 + s + (b ? 1 : 0) + i3 + i4 + i5 + i6 +
            FuzzerUtils.checkSum(iArr);
    }

    public static long lMeth(float f1) {

        int i7=-9381, i8=-39208, i9=0, i10=-1, i11=8, i12=-1, i13=-50139, iArr1[]=new int[N];
        boolean b1=false;
        float fArr[][]=new float[N][N];

        FuzzerUtils.init(iArr1, -2540);
        FuzzerUtils.init(fArr, 1.50F);

        vMeth(f1);
        f1 *= Test.iFld;
        i7 = 1;
        while (++i7 < 126) {
            Test.iFld -= (int)Test.instanceCount;
            for (i8 = 1; i8 < 12; i8++) {
                Test.instanceCount = Test.instanceCount;
            }
            i10 = 1;
            do {
                iArr1[i10 + 1] |= i11;
                f1 += i11;
                for (i12 = i10; i12 < 1; i12++) {
                    if (b1) continue;
                    fArr = fArr;
                    Test.instanceCount -= Test.instanceCount;
                    f1 += (i12 * i12);
                    if (b1) break;
                }
            } while (++i10 < 12);
        }
        long meth_res = Float.floatToIntBits(f1) + i7 + i8 + i9 + i10 + i11 + i12 + i13 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=13888, i1=220, i14=-90, i15=-2, i16=14, i17=-1, i18=-32, i19=3, i20=51490, i21=-12, i22=11181, i23=29328,
            i24=1, iArr2[]=new int[N];
        byte by=-19;
        float f=0.998F;
        double d=-5.109010;
        long l2=8178362691057806534L;

        FuzzerUtils.init(iArr2, 50804);

        if (Test.bFld) {
            i *= (int)(Test.dFld += (-(by + f)));
            i /= (int)(((long)(Test.fArrFld[(40714 >>> 1) % N]--)) | 1);
        } else if (false) {
            for (d = 14; d < 235; d++) {
                Test.instanceCount += (long)(((d * f) + i1) - f);
                Test.instanceCount -= lMeth(f);
                for (i14 = 4; i14 < 114; i14++) {
                    i15 -= (int)Test.instanceCount;
                    iArr2[(int)(d)] >>= i;
                }
                if (Test.bFld) {
                    Test.iFld &= Test.iFld;
                } else {
                    i15 >>= i1;
                    by = (byte)f;
                    for (i16 = 7; 114 > i16; i16++) {
                        iArr2[(int)(d)] >>= i;
                        for (i18 = i16; i18 < 2; ++i18) {
                            f += (float)1.72721;
                            Test.iFld += (((i18 * i18) + i14) - Test.instanceCount);
                            Test.dFld += i14;
                        }
                    }
                }
                i1 -= i17;
                try {
                    i = (33198 / i20);
                    iArr2[(int)(d - 1)] = (1408488157 / i16);
                    i1 = (iArr2[(int)(d - 1)] / i19);
                } catch (ArithmeticException a_e) {}
            }
            i15 -= (int)f;
        } else if (Test.bFld) {
            for (i21 = 6; i21 < 191; ++i21) {
                iArr2[i21] = (int)l2;
                i += (i21 * i21);
                iArr2[i21 + 1] -= (int)Test.instanceCount;
                try {
                    iArr2[i21 + 1] = (i22 / i22);
                    i1 = (i / 34682);
                    i17 = (i15 / -1175638198);
                } catch (ArithmeticException a_e) {}
                for (i23 = 2; i23 < 136; i23++) {
                    f += i22;
                    Test.dFld -= i14;
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}