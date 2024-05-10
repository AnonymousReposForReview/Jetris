package tests.javafuzzer1134;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 15:16:29 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=5L;
    public static volatile boolean bFld=true;
    public float fFld=2.449F;
    public static int iFld=-15415;
    public int iArrFld[]=new int[N];
    public static int iArrFld1[]=new int[N];
    public static long lArrFld[][]=new long[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld1, -14);
        FuzzerUtils.init(Test.lArrFld, -3592811866L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(int i4, int i5, int i6) {

        short s=-6512;
        double d1=-1.75681;
        float f=100.554F, f1=0.715F;
        int i8=11, i9=-10, i10=10;

        i4 = (int)Test.instanceCount;
        for (int i7 : Test.iArrFld1) {
            Test.iArrFld1[(i6 >>> 1) % N] = s;
            i6 = i6;
            d1 = i7;
            for (f = 1; f < 4; ++f) {
                for (i9 = 1; i9 < 2; ++i9) {
                    Test.bFld = Test.bFld;
                    i5 = i9;
                    Test.iArrFld1[(int)(f)] *= i6;
                    s = (short)f;
                    Test.iArrFld1[i9 + 1] += i10;
                    Test.instanceCount *= Test.instanceCount;
                    i8 += (i9 ^ i4);
                    f1 = i7;
                }
            }
        }
        long meth_res = i4 + i5 + i6 + s + Double.doubleToLongBits(d1) + Float.floatToIntBits(f) + i8 + i9 + i10 +
            Float.floatToIntBits(f1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth1() {

        int i3=56926, i11=-12, i12=-10, i14=43512, i15=-1, i16=6, i17=12, iArr[][]=new int[N][N];
        double d=2.62848;
        byte by=-74;
        short sArr1[]=new short[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(sArr1, (short)-11717);
        FuzzerUtils.init(iArr, -12);
        FuzzerUtils.init(lArr, 1L);

        sArr1[(i3 >>> 1) % N] = (short)(iArr[(i3 >>> 1) % N][(i3 >>> 1) % N] << (long)((d + i3) + (iArr[(i3 >>> 1) %
            N][(i3 >>> 1) % N]--)));
        i3 += (int)fMeth(i3, i3, -7);
        for (i11 = 13; i11 < 359; ++i11) {
            i3 &= i12;
            Test.instanceCount += (i11 * i3);
            i12 += (i11 - i3);
            for (i14 = 1; i14 < 5; i14++) {
                try {
                    i15 = (i14 / i12);
                    i12 = (-1197031512 % i14);
                    i3 = (-49430 % i3);
                } catch (ArithmeticException a_e) {}
                iArr[i11 + 1] = iArr[i14 - 1];
                i3 -= i14;
                for (i16 = 1; i16 < 2; ++i16) {
                    if (Test.bFld) continue;
                    lArr[i16] *= 21243;
                    by = (byte)i17;
                    if (i11 != 0) {
                        vMeth1_check_sum += i3 + Double.doubleToLongBits(d) + i11 + i12 + i14 + i15 + i16 + i17 + by +
                            FuzzerUtils.checkSum(sArr1) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
                        return;
                    }
                }
            }
        }
        vMeth1_check_sum += i3 + Double.doubleToLongBits(d) + i11 + i12 + i14 + i15 + i16 + i17 + by +
            FuzzerUtils.checkSum(sArr1) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public void vMeth() {

        int i=236, i1=207, i2=11569, i18=-82, i19=139;
        float fArr[]=new float[N];
        short sArr[]=new short[N];
        double dArr[][]=new double[N][N];

        FuzzerUtils.init(fArr, 2.228F);
        FuzzerUtils.init(sArr, (short)-21889);
        FuzzerUtils.init(dArr, 81.128507);

        for (i = 8; i < 159; ++i) {
            iArrFld[i - 1] -= (i1 /= (int)(((i1++) + iArrFld[i]) | 1));
            fArr = fArr;
            sArr[i + 1] >>= (short)(((i1 * Test.instanceCount) - (dArr[i + 1][i]++)) * ((i + Test.instanceCount) <<
                (i1++)));
            i2 = 1;
            while (++i2 < 10) {
                vMeth1();
                for (i18 = i2; i18 < 1; i18++) {
                    Test.iArrFld1[i2 + 1] = i1;
                    fFld *= i2;
                    Test.instanceCount += (i18 ^ Test.instanceCount);
                    Test.instanceCount = i;
                    i19 &= i18;
                    i1 += (int)(-11.505F + (i18 * i18));
                    if (Test.bFld) break;
                    i19 = i;
                }
            }
        }
        vMeth_check_sum += i + i1 + i2 + i18 + i19 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(sArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        float f2=0.428F;
        int i21=-124, i22=136, i23=-24, i24=8590, i25=-7;
        short s1=-30088, sArr2[]=new short[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(sArr2, (short)-27456);

        vMeth();
        for (int i20 : Test.iArrFld1) {
            for (f2 = 3; f2 < 63; f2++) {
                i21 -= i21;
                s1 = (short)-152;
                Test.lArrFld = Test.lArrFld;
                s1 += (short)(((f2 * i21) + fFld) - i21);
                i20 >>= (int)Test.instanceCount;
            }
        }
        if (Test.bFld) {
            for (i22 = 13; i22 < 231; ++i22) {
                if (Test.bFld) {
                    i21 += i22;
                    i23 += i22;
                    i24 = 1;
                    while (++i24 < 115) {
                        if (Test.bFld) {
                            switch (((i24 % 2) * 5) + 78) {
                            case 84:
                            case 83:
                                Test.instanceCount -= Test.iFld;
                                i25 = 1;
                                do {
                                    s1 *= (short)14;
                                    Test.instanceCount = s1;
                                    fFld += -244;
                                    Test.bFld = Test.bFld;
                                    Test.instanceCount += i25;
                                    i21 >>>= i21;
                                } while (++i25 < 1);
                                Test.iFld += (i24 + i23);
                                bArr = bArr;
                            default:
                                i21 -= i24;
                                i21 += (i24 * i24);
                            }
                        } else if (Test.bFld) {
                            fFld += i22;
                            if (Test.bFld) break;
                        } else {
                            sArr2[i22 - 1] = (short)149;
                        }
                    }
                } else if (Test.bFld) {
                    i23 += i22;
                } else if (Test.bFld) {
                    Test.iFld >>= i22;
                } else {
                    Test.iFld += (i22 - i21);
                }
            }
        } else if (Test.bFld) {
            i23 >>>= i23;
        } else {
            s1 *= (short)Test.instanceCount;
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  fMeth ->  fMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
