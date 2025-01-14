package tests.javafuzzer2558;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 16:33:51 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=129L;
    public int iFld=64;
    public static byte byFld=-108;
    public static volatile float fFld=2.866F;
    public double dFld=36.110996;
    public static int iArrFld[]=new int[N];
    public double dArrFld[][]=new double[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, -18);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;

    public static long lMeth1(long l, long l1) {

        float f=1.184F;
        int i10=0, i11=51051, i12=-59, i13=-14, i14=120;
        boolean b1=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 76L);

        f *= f;
        i10 <<= (int)2040546032L;
        for (i11 = 395; 18 < i11; --i11) {
            Test.instanceCount = Test.instanceCount;
            if (b1) break;
            lArr[i11] *= (long)f;
            if (true) {
                Test.iArrFld[i11 - 1] -= i11;
            } else {
                Test.iArrFld[i11] ^= (int)l1;
            }
            Test.iArrFld = Test.iArrFld;
            for (i13 = i11; i13 < 4; i13++) {
                l1 = i12;
                i12 = (int)114L;
                Test.iArrFld = Test.iArrFld;
                i14 = i13;
            }
        }
        long meth_res = l + l1 + Float.floatToIntBits(f) + i10 + i11 + i12 + (b1 ? 1 : 0) + i13 + i14 +
            FuzzerUtils.checkSum(lArr);
        lMeth1_check_sum += meth_res;
        return (long)meth_res;
    }

    public static long lMeth() {

        int i6=-25, i7=-5, i8=145, i9=-6, i15=38726, i16=-11, i17=-47537, i18=32920;
        boolean b=true;
        short s=-184, sArr[]=new short[N];
        float f1=-1.947F;

        FuzzerUtils.init(sArr, (short)-23257);

        for (i6 = 3; i6 < 149; i6++) {
            b = b;
            for (i8 = i6; i8 < 11; ++i8) {
                Test.iArrFld[i8 + 1] ^= (int)(Math.max(6, Test.iArrFld[i8]) + (Test.iArrFld[i6] &=
                    (int)lMeth1(Test.instanceCount, Test.instanceCount)));
                Test.iArrFld[i6 + 1] += i7;
                s += (short)(i8 * i9);
                i7 += (i8 | (long)f1);
                for (i15 = 1; 1 > i15; ++i15) {
                    i7 = i16;
                    i16 <<= Test.byFld;
                    s ^= (short)i7;
                }
                sArr[i8] = (short)Test.instanceCount;
            }
            for (i17 = 1; 11 > i17; i17++) {
                f1 += ((long)i17 | (long)f1);
                if (b) break;
            }
        }
        long meth_res = i6 + i7 + (b ? 1 : 0) + i8 + i9 + s + Float.floatToIntBits(f1) + i15 + i16 + i17 + i18 +
            FuzzerUtils.checkSum(sArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i2, int i3, int i4) {

        int i5=-3, i19=-2180;
        double d=-2.57089;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 2.520F);

        i5 = 1;
        while (++i5 < 292) {
            Test.instanceCount = (long)d;
            i3 -= (int)(fArr[i5] * (lMeth() * Test.instanceCount));
            d += 81;
            i2 += (i5 * i3);
            i3 += (((i5 * i2) + Test.fFld) - i5);
            i3 >>>= (int)Test.instanceCount;
            i19 = 1;
            do {
                Test.instanceCount -= i19;
                Test.iArrFld[i19] = i4;
                Test.fFld += 11940;
                i2 += i19;
                i4 &= (int)Test.instanceCount;
                Test.iArrFld = Test.iArrFld;
                Test.fFld *= i5;
            } while (++i19 < 6);
        }
        vMeth_check_sum += i2 + i3 + i4 + i5 + Double.doubleToLongBits(d) + i19 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i=-42507, i1=-134, i20=-45338, i21=7, i22=-39, i23=-1, i24=-75, i25=-125, i26=-155, i27=32748, i28=-6,
            i29=-10;
        boolean b2=true;
        short s1=16558;

        iFld *= (++Test.iArrFld[(iFld >>> 1) % N]);
        for (i = 9; i < 259; ++i) {
            vMeth(i, i1, iFld);
            iFld ^= (int)Test.instanceCount;
            i1 += i;
        }
        for (i20 = 359; 7 < i20; --i20) {
            i21 = (int)Test.instanceCount;
        }
        if (b2) {
            for (i22 = 12; i22 < 241; ++i22) {
                double d1=29.9695;
                i24 = 1;
                while ((i24 += 2) < 110) {
                    Test.iArrFld[i24 + 1] += (int)Test.fFld;
                    iFld = i;
                    iFld += (int)1.144F;
                }
                if (b2) {
                } else if (b2) {
                    i21 &= i21;
                } else {
                    Test.instanceCount += (((i22 * Test.fFld) + Test.byFld) - i20);
                    if (true) {
                        for (i25 = 3; i25 < 110; ++i25) {
                            dArrFld[i22 + 1][i25 + 1] *= i22;
                            if (b2) continue;
                            for (i27 = 1; 2 > i27; i27++) {
                                Test.iArrFld[i22 - 1] = i20;
                                i26 += (i27 * i27);
                                i21 += Test.byFld;
                                Test.iArrFld[i22 + 1] -= i28;
                                i23 = iFld;
                                i23 = s1;
                            }
                            i29 = 1;
                            while (++i29 < 2) {
                                Test.iArrFld[i25 - 1] = i28;
                                Test.instanceCount = 229;
                            }
                        }
                    } else if (b2) {
                    } else {
                        d1 -= i21;
                    }
                }
            }
        } else if (b2) {
            dFld = i26;
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  lMeth1 ->  lMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
