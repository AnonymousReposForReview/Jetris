package tests.javafuzzer79;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 22:02:02 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=688920849L;
    public static boolean bFld=false;
    public static float fFld=-49.246F;
    public static volatile int iArrFld[]=new int[N];
    public static volatile long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 27496);
        FuzzerUtils.init(Test.lArrFld, -4274103736L);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i8, int i9) {

        int i10=-254, i11=14, i12=-42203, i13=-39825, i14=60358, i15=0, i16=139;
        double d1=-2.94642, dArr[]=new double[N];
        long l1=14L;

        FuzzerUtils.init(dArr, 67.30246);

        for (i10 = 12; i10 < 327; ++i10) {
            Test.bFld = Test.bFld;
            for (i12 = i10; i12 < 5; ++i12) {
                i11 = i11;
            }
            d1 += i9;
            i8 = 203;
            i8 = i8;
            for (i14 = 1; i14 < 5; i14++) {
                for (l1 = 1; 2 > l1; l1++) {
                    Test.instanceCount = (long)Test.fFld;
                    i11 = i9;
                }
                i16 >>>= (int)l1;
                dArr[i10 + 1] -= 46;
                i15 += i16;
                Test.iArrFld[i14 - 1] += (int)Test.instanceCount;
            }
        }
        vMeth1_check_sum += i8 + i9 + i10 + i11 + i12 + i13 + Double.doubleToLongBits(d1) + i14 + i15 + l1 + i16 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static int iMeth() {

        int i4=5, i5=-247, i6=51397, i7=-47088, i17=-7510, i18=-151, i19=-37886, i20=-149;
        double d=41.7734, dArr1[]=new double[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(dArr1, -92.8621);
        FuzzerUtils.init(fArr, 2.600F);

        for (i4 = 8; i4 < 229; ++i4) {
            d = -1.422F;
            Test.instanceCount *= i5;
            for (i6 = 7; 1 < i6; i6 -= 2) {
                i5 += (-117 + (i6 * i6));
                vMeth1(-218, i7);
            }
            dArr1[i4 + 1] *= Test.instanceCount;
            fArr[i4] -= 23;
        }
        d += Test.instanceCount;
        for (i17 = 6; i17 < 251; ++i17) {
            i18 += (int)-55.23886;
            Test.bFld = Test.bFld;
            for (i19 = 1; i19 < 7; ++i19) {
                Test.instanceCount -= i18;
                Test.fFld += (8 + (i19 * i19));
            }
        }
        long meth_res = i4 + i5 + Double.doubleToLongBits(d) + i6 + i7 + i17 + i18 + i19 + i20 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(long l, int i2, int i3) {

        int i21=-80, i22=-37312, i23=131, i24=-6, i25=41446, i26=24722, i27=8;
        short s=4447;
        double d2=-1.123370;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -11L);

        i3 *= iMeth();
        for (i21 = 7; i21 < 260; i21++) {
            Test.instanceCount += (((i21 * i22) + i2) - i2);
            i2 += (i21 * i21);
            i2 = (int)-3417490868964311788L;
            i22 *= s;
        }
        for (i23 = 169; i23 > 7; --i23) {
            i25 = 1;
            while (++i25 < 10) {
                for (i26 = 1; 1 > i26; ++i26) {
                    if (Test.bFld) continue;
                    i3 += (int)d2;
                    i22 = i24;
                    lArr[i23 + 1] = i26;
                    i22 *= i22;
                    Test.bFld = Test.bFld;
                }
            }
        }
        vMeth_check_sum += l + i2 + i3 + i21 + i22 + s + i23 + i24 + i25 + i26 + i27 + Double.doubleToLongBits(d2) +
            FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        boolean b=true;
        int i=-243, i1=11, i28=12, i29=-1, i30=-224, i31=-13, i32=2095, i33=-59592, i34=14, i35=-29453, i36=232;
        float fArr1[]=new float[N];

        FuzzerUtils.init(fArr1, 31.244F);

        b = (b = (b = (Test.instanceCount == Test.instanceCount)));
        Test.instanceCount -= -12;
        if (b) {
            for (i = 7; i < 127; ++i) {
                vMeth(Test.instanceCount, i, i1);
                Test.iArrFld = Test.iArrFld;
                Test.iArrFld[(i >>> 1) % N] &= (int)Test.instanceCount;
                for (i28 = 209; 3 < i28; --i28) {
                    i30 = 1;
                    while ((i30 += 2) < 2) {
                        i29 += i1;
                        i29 += i30;
                        i1 -= i28;
                        i29 += (-104 + (i30 * i30));
                    }
                    i29 = i1;
                }
                switch (((i28 >>> 1) % 6) + 36) {
                case 36:
                case 37:
                    Test.fFld -= 36161;
                    Test.instanceCount <<= i;
                case 38:
                    for (i31 = 3; i31 < 209; ++i31) {
                        if (Test.bFld) {
                            for (i33 = i31; i33 < 2; i33++) {
                                Test.iArrFld[i] *= 158;
                                Test.iArrFld[i31 + 1] -= (int)Test.instanceCount;
                                Test.lArrFld[i] *= i32;
                                i34 = i28;
                                i29 ^= (int)Test.instanceCount;
                                Test.fFld = -14;
                            }
                            fArr1[i + 1] -= i33;
                            for (i35 = 1; 2 > i35; ++i35) {
                                Test.lArrFld[i31 - 1] *= i32;
                                i34 = (int)Test.instanceCount;
                            }
                        } else if (true) {
                            Test.fFld += i32;
                        } else if (false) {
                            Test.iArrFld[i31] >>>= i35;
                        }
                    }
                case 39:
                    i1 += (-216 + (i * i));
                    break;
                case 40:
                    i34 += (i ^ i30);
                    break;
                case 41:
                }
            }
        } else if (Test.bFld) {
            i29 = (int)Test.instanceCount;
        } else {
            Test.instanceCount = Test.instanceCount;
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
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
